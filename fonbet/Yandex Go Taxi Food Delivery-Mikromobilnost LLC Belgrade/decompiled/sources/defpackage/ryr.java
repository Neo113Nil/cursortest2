package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ryr implements dtn {
    public etn A;
    public ContentObserver B;
    public final Context a;
    public final pyr b;
    public final qyr c;
    public final Object w = new Object();
    public Handler x;
    public ThreadPoolExecutor y;
    public ThreadPoolExecutor z;

    public ryr(Context context, pyr pyrVar, qyr qyrVar) {
        d6z.v(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = pyrVar;
        this.c = qyrVar;
    }

    @Override // defpackage.dtn
    public final void a(etn etnVar) {
        synchronized (this.w) {
            this.A = etnVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.w) {
            try {
                this.A = null;
                ContentObserver contentObserver = this.B;
                if (contentObserver != null) {
                    qyr qyrVar = this.c;
                    Context context = this.a;
                    qyrVar.getClass();
                    context.getContentResolver().unregisterContentObserver(contentObserver);
                    this.B = null;
                }
                Handler handler = this.x;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.x = null;
                ThreadPoolExecutor threadPoolExecutor = this.z;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.y = null;
                this.z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.w) {
            try {
                if (this.A == null) {
                    return;
                }
                if (this.y == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ywd("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.z = threadPoolExecutor;
                    this.y = threadPoolExecutor;
                }
                this.y.execute(new ejp(9, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ozr d() {
        try {
            qyr qyrVar = this.c;
            Context context = this.a;
            pyr pyrVar = this.b;
            qyrVar.getClass();
            nzr b = ysa1.b(context, pyrVar);
            if (b.c() != 0) {
                throw new RuntimeException("fetchFonts failed (" + b.c() + Extension.C_BRAKE);
            }
            ozr[] a = b.a();
            if (a != null && a.length != 0) {
                return a[0];
            }
            kbs.g("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ny61.n("provider not found", e);
            return null;
        }
    }
}
