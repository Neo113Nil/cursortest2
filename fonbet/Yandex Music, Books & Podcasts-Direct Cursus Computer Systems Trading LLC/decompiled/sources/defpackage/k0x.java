package defpackage;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class k0x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8s b;

    public /* synthetic */ k0x(int i, i8s i8sVar) {
        this.a = i;
        this.b = i8sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    break;
                }
                break;
            default:
                m4x.d.b("get checkbox consent timed out", new Object[0]);
                this.b.d(Boolean.FALSE);
                break;
        }
    }
}
