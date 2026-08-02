package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class xg0 implements uod {
    public static boolean d = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public afu c;

    public xg0(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    @Override // defpackage.uod
    public final void a(xod xodVar) {
        synchronized (this.b) {
            if (!xodVar.s) {
                xodVar.s = true;
                xodVar.b();
            }
        }
    }

    @Override // defpackage.uod
    public final xod b() {
        yod fpdVar;
        xod xodVar;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    mi.w(androidComposeView);
                }
                if (i >= 29) {
                    fpdVar = new cpd();
                } else if (d) {
                    try {
                        fpdVar = new bpd(this.a, new pu3(), new ou3());
                    } catch (Throwable unused) {
                        d = false;
                        AndroidComposeView androidComposeView2 = this.a;
                        afu afuVar = this.c;
                        if (afuVar == null) {
                            afu afuVar2 = new afu(androidComposeView2.getContext());
                            androidComposeView2.addView(afuVar2, -1);
                            this.c = afuVar2;
                            afuVar = afuVar2;
                        }
                        fpdVar = new fpd(afuVar);
                    }
                } else {
                    AndroidComposeView androidComposeView3 = this.a;
                    afu afuVar3 = this.c;
                    if (afuVar3 == null) {
                        afu afuVar4 = new afu(androidComposeView3.getContext());
                        androidComposeView3.addView(afuVar4, -1);
                        this.c = afuVar4;
                        afuVar3 = afuVar4;
                    }
                    fpdVar = new fpd(afuVar3);
                }
                xodVar = new xod(fpdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return xodVar;
    }
}
