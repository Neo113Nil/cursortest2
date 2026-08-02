package l4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.fragment.app.C0465d;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ExecutorC4756a;

/* loaded from: classes2.dex */
public abstract class h extends Service {

    /* renamed from: n, reason: collision with root package name */
    public final ExecutorService f38919n;

    /* renamed from: u, reason: collision with root package name */
    public z f38920u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f38921v;

    /* renamed from: w, reason: collision with root package name */
    public int f38922w;

    /* renamed from: x, reason: collision with root package name */
    public int f38923x;

    public h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W2.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f38919n = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f38921v = new Object();
        this.f38923x = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            y.b(intent);
        }
        synchronized (this.f38921v) {
            try {
                int i = this.f38923x - 1;
                this.f38923x = i;
                if (i == 0) {
                    stopSelfResult(this.f38922w);
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
            if (this.f38920u == null) {
                this.f38920u = new z(new I0.j(28, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38920u;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f38919n.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i4) {
        synchronized (this.f38921v) {
            this.f38922w = i4;
            this.f38923x++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) q.g().f38948w).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        l3.h hVar = new l3.h();
        this.f38919n.execute(new androidx.emoji2.text.k(8, this, intent2, hVar));
        l3.m mVar = hVar.f38870a;
        if (mVar.h()) {
            a(intent);
            return 2;
        }
        mVar.a(new ExecutorC4756a(1), new C0465d(4, this, intent));
        return 3;
    }
}
