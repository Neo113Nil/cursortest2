package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.adjust.sdk.Constants;

/* loaded from: classes6.dex */
public abstract class u2b1 {
    public static au2 a;

    public static final au2 a() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("HumanSurgeIndicator", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(15.91f, 6.53f);
        e.e(0.0f, 1.4f, -1.13f, 3.2f, -2.53f, 3.2f);
        e.n(-2.54f, -1.8f, -2.54f, -3.2f);
        e.b(2.53f, 2.53f, false, true, 5.07f, 0.0f);
        e.k(-0.6f, 4.22f);
        e.i(-4.2f, -0.22f);
        e.b(3.0f, 3.0f, false, false, -0.9f, 0.08f);
        e.i(-0.55f, 0.14f);
        e.d(9.07f, 10.9f, 6.6f, 12.0f, 6.0f, 12.0f);
        e.i(-5.0f, 0.35f);
        e.p(1.07f);
        e.i(0.03f, 0.15f);
        e.e(0.07f, 0.43f, 0.15f, 0.93f, 1.13f, 0.93f);
        e.g(4.03f);
        e.h(9.0f, 14.0f);
        e.i(2.16f, 6.0f);
        e.g(6.38f);
        e.i(-1.28f, -4.98f);
        e.i(3.84f, 5.07f);
        e.i(0.64f, -0.38f);
        e.e(0.38f, -0.5f, 0.51f, -1.14f, 0.13f, -1.64f);
        e.i(-4.22f, -6.87f);
        e.e(-0.3f, -0.4f, -0.83f, -0.42f, -1.14f, -0.43f);
        e.m(-0.12f, 0.0f, -0.2f, -0.02f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static void b(View view, AutofillManager autofillManager, int i, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i, z);
    }

    public static final String c(wlo0 wlo0Var) {
        if (wlo0Var instanceof tlo0) {
            return Constants.DEEPLINK;
        }
        if (wlo0Var instanceof ulo0) {
            return ((ulo0) wlo0Var).b;
        }
        if (wlo0Var instanceof vlo0) {
            return "qr_superapp";
        }
        return null;
    }
}
