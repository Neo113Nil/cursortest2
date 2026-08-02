package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tfp {
    public final mpf a;
    public final o5b b;
    public final upe c;
    public final gpi d = new gpi(2);

    public tfp(mpf mpfVar, o5b o5bVar, soi soiVar) {
        this.a = mpfVar;
        this.b = o5bVar;
        this.c = soiVar;
    }

    public final qfp a() {
        return new qfp(this.b, false, this.a, new jfp());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(mpf mpfVar, jfp jfpVar) {
        String str;
        boolean z;
        boolean z2;
        gpi gpiVar = this.d;
        Object[] objArr = gpiVar.a;
        int i = gpiVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            sd0 sd0Var = (sd0) ((kfp) objArr[i2]);
            AndroidComposeView androidComposeView = sd0Var.c;
            ke2 ke2Var = sd0Var.a;
            jfp w = mpfVar.w();
            int i3 = mpfVar.b;
            String str2 = null;
            if (jfpVar != null) {
                Object g = jfpVar.a.g(ufp.C);
                if (g == null) {
                    g = null;
                }
                mn0 mn0Var = (mn0) g;
                if (mn0Var != null) {
                    str = mn0Var.b;
                    if (w != null) {
                        Object g2 = w.a.g(ufp.C);
                        if (g2 == null) {
                            g2 = null;
                        }
                        mn0 mn0Var2 = (mn0) g2;
                        if (mn0Var2 != null) {
                            str2 = mn0Var2.b;
                        }
                    }
                    if (str != str2) {
                        if (str == null) {
                            ke2Var.j(androidComposeView, i3, true);
                        } else if (str2 == null) {
                            ke2Var.j(androidComposeView, i3, false);
                        } else if (Intrinsics.d((uf0) wdg.O(w, ufp.q), hs4.f)) {
                            ke2Var.g(androidComposeView, i3, ge2.a(str2.toString()));
                        }
                    }
                    z = jfpVar == null && jfpVar.a.b(ufp.p);
                    z2 = w == null && w.a.b(ufp.p);
                    if (z == z2) {
                        toi toiVar = sd0Var.h;
                        if (z2) {
                            toiVar.a(i3);
                        } else {
                            toiVar.e(i3);
                        }
                    }
                }
            }
            str = null;
            if (w != null) {
            }
            if (str != str2) {
            }
            if (jfpVar == null) {
            }
            if (w == null) {
            }
            if (z == z2) {
            }
        }
    }
}
