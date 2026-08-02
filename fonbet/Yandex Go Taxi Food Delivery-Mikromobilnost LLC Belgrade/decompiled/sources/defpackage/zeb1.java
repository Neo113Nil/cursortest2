package defpackage;

import android.text.Spanned;

/* loaded from: classes11.dex */
public abstract class zeb1 {
    public static au2 a;

    public static final au2 a() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Car", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.k(20.83f, 9.71f);
        uq90Var.i(0.43f, 1.29f);
        uq90Var.m(0.74f, 2.17f, 0.74f, 4.46f);
        uq90Var.o(22.0f);
        uq90Var.g(-4.0f);
        uq90Var.i(-1.0f, -2.0f);
        uq90Var.f(7.0f);
        uq90Var.i(-1.0f, 2.0f);
        uq90Var.f(2.0f);
        uq90Var.p(-6.64f);
        uq90Var.b(14.0f, 14.0f, false, true, 0.78f, -4.62f);
        uq90Var.b(73.0f, 73.0f, false, true, 1.56f, -4.42f);
        uq90Var.b(3.2f, 3.2f, false, true, 2.18f, -1.71f);
        uq90Var.l(9.23f, 4.01f, 12.0f, 4.0f);
        uq90Var.m(2.78f, 0.03f, 5.48f, 0.66f);
        uq90Var.b(3.2f, 3.2f, false, true, 2.17f, 1.71f);
        uq90Var.e(0.17f, 0.34f, 0.68f, 1.85f, 1.18f, 3.34f);
        uq90Var.j(12.0f, 6.0f);
        uq90Var.b(24.0f, 24.0f, false, false, -5.0f, 0.56f);
        uq90Var.b(1.2f, 1.2f, false, false, -0.87f, 0.67f);
        uq90Var.i(-0.05f, 0.14f);
        uq90Var.i(-0.75f, 2.14f);
        uq90Var.l(8.64f, 8.92f, 12.0f, 9.0f);
        uq90Var.m(3.36f, -0.08f, 6.65f, 0.5f);
        uq90Var.i(-0.34f, -0.96f);
        uq90Var.e(-0.33f, -0.96f, -0.45f, -1.29f, -0.45f, -1.34f);
        uq90Var.b(1.2f, 1.2f, false, false, -0.81f, -0.64f);
        uq90Var.a(24.0f, 24.0f, false, false, 12.0f, 6.0f);
        uq90Var.k(3.73f, 7.45f);
        uq90Var.a(2.0f, 2.0f, false, true, 17.0f, 13.0f);
        uq90Var.g(2.0f);
        uq90Var.b(6.0f, 6.0f, false, true, 0.35f, 2.0f);
        uq90Var.f(15.0f);
        uq90Var.b(2.0f, 2.0f, false, true, 0.73f, -1.55f);
        uq90Var.k(-7.32f, 0.14f);
        uq90Var.a(2.0f, 2.0f, false, false, 7.0f, 13.0f);
        uq90Var.f(5.0f);
        uq90Var.b(6.0f, 6.0f, false, false, -0.34f, 2.0f);
        uq90Var.f(9.0f);
        uq90Var.b(2.0f, 2.0f, false, false, -0.59f, -1.41f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final boolean b(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final tig0 c(wls wlsVar, tls tlsVar) {
        cp1 cp1Var = new cp1(wlsVar, 4);
        ym11.e(1, tlsVar);
        return new tig0(cp1Var, tlsVar);
    }
}
