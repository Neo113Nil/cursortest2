package d8;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class g extends Service {

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f1772g;

    /* renamed from: h, reason: collision with root package name */
    public f0 f1773h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1774i;

    /* renamed from: j, reason: collision with root package name */
    public int f1775j;

    /* renamed from: k, reason: collision with root package name */
    public int f1776k;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new u6.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1772g = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f1774i = new Object();
        this.f1776k = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            e0.b(intent);
        }
        synchronized (this.f1774i) {
            try {
                int i10 = this.f1776k - 1;
                this.f1776k = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f1775j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f1773h == null) {
                this.f1773h = new f0(new f8.c(8, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1773h;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f1772g.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f1774i) {
            this.f1775j = i11;
            this.f1776k++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) s.c().f1815j).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        g7.h hVar = new g7.h();
        this.f1772g.execute(new b6.a(this, intent2, hVar, 2));
        g7.o oVar = hVar.f2537a;
        if (oVar.h()) {
            a(intent);
            return 2;
        }
        oVar.a(new a4.e(0), new c6.j(3, this, intent));
        return 3;
    }
}
