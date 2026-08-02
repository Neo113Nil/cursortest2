package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.scheduling.persistence.b;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class td21 implements Runnable {
    public final /* synthetic */ wd21 a;
    public final /* synthetic */ v111 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable w;

    public /* synthetic */ td21(wd21 wd21Var, v111 v111Var, int i, Runnable runnable) {
        this.a = wd21Var;
        this.b = v111Var;
        this.c = i;
        this.w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v111 v111Var = this.b;
        int i = this.c;
        Runnable runnable = this.w;
        wd21 wd21Var = this.a;
        w0x0 w0x0Var = wd21Var.f;
        try {
            try {
                ugo ugoVar = wd21Var.c;
                Objects.requireNonNull(ugoVar);
                ((b) w0x0Var).n(new el11(5, ugoVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) wd21Var.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((b) w0x0Var).n(new xm7(wd21Var, v111Var, i, 4));
                } else {
                    wd21Var.a(v111Var, i);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                wd21Var.d.o(v111Var, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
