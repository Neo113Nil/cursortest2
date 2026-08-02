package defpackage;

import ru.yandex.taxi.logistics.payment_method_selector.requirement.state.ToggleSource;

/* loaded from: classes5.dex */
public final class wti {
    public final ut90 a;
    public final k7x0 b;
    public final wt90 c;
    public final iii d;
    public final gde e;
    public final oep0 f;

    public wti(ut90 ut90Var, k7x0 k7x0Var, wt90 wt90Var, iii iiiVar, gde gdeVar, oep0 oep0Var) {
        this.a = ut90Var;
        this.b = k7x0Var;
        this.c = wt90Var;
        this.d = iiiVar;
        this.e = gdeVar;
        this.f = oep0Var;
    }

    public final uti a(boolean z, ToggleSource toggleSource, boolean z2, boolean z3, String str) {
        String str2;
        String str3;
        zjz0 e = this.a.e();
        String str4 = e.a;
        int[] iArr = vti.a;
        int i = iArr[toggleSource.ordinal()];
        String str5 = null;
        if (i == 1) {
            str2 = e.h;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str2 = e.g;
        }
        int i2 = iArr[toggleSource.ordinal()];
        if (i2 == 1) {
            str3 = e.b;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            str3 = null;
        }
        if (!z3) {
            str = z2 ? e.c : null;
        }
        if (str4.length() <= 0) {
            return null;
        }
        if (str != null) {
            str3 = str;
        }
        String str6 = e.f;
        k7x0 k7x0Var = this.b;
        String a = str6 != null ? ((m7x0) k7x0Var).a(str6) : null;
        if (!z2 && !z3 && str2 != null) {
            str5 = ((m7x0) k7x0Var).a(str2);
        }
        return new uti(str4, str3, a, str5, z, (z2 || z3) ? false : true, new xz3(this, z2, 6));
    }
}
