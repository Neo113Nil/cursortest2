package j4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.fragment.app.C0461d;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ExecutorC4742a;

/* loaded from: classes2.dex */
public abstract class h extends Service {

    /* renamed from: n, reason: collision with root package name */
    public final ExecutorService f38407n;

    /* renamed from: u, reason: collision with root package name */
    public z f38408u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f38409v;

    /* renamed from: w, reason: collision with root package name */
    public int f38410w;

    /* renamed from: x, reason: collision with root package name */
    public int f38411x;

    public h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new U2.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f38407n = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f38409v = new Object();
        this.f38411x = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            y.b(intent);
        }
        synchronized (this.f38409v) {
            try {
                int i = this.f38411x - 1;
                this.f38411x = i;
                if (i == 0) {
                    stopSelfResult(this.f38410w);
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
            if (this.f38408u == null) {
                this.f38408u = new z(new I0.j(29, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38408u;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f38407n.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i6) {
        synchronized (this.f38409v) {
            this.f38410w = i6;
            this.f38411x++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) q.b().f38436w).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        j3.h hVar = new j3.h();
        this.f38407n.execute(new androidx.emoji2.text.k(8, this, intent2, hVar));
        j3.m mVar = hVar.f38358a;
        if (mVar.h()) {
            a(intent);
            return 2;
        }
        mVar.a(new ExecutorC4742a(1), new C0461d(4, this, intent));
        return 3;
    }
}
