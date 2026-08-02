package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class s5n implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uft b;

    public /* synthetic */ s5n(uft uftVar, int i) {
        this.a = i;
        this.b = uftVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yci u;
        int i;
        String n;
        int i2;
        String n2;
        int i3 = this.a;
        int i4 = R.string.quality_settings_low_description;
        uft uftVar = this.b;
        switch (i3) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    u = d.u(vci.a, b2c.l, (r2 & 2) == 0);
                    xcs.b(w1g.K(uftVar, oq5Var), u, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    yci q = a.q(vci.a, 0.0f, 4, 0.0f, 0.0f, 13);
                    int ordinal = uftVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            n = vz1.n(oq5Var2, -2067862245, R.string.quality_settings_high_description, oq5Var2, false);
                        } else if (ordinal == 2) {
                            i = -2067859718;
                        } else {
                            if (ordinal != 3) {
                                throw vz1.i(oq5Var2, -2067865739, false);
                            }
                            n = vz1.n(oq5Var2, -2067857189, R.string.quality_settings_auto_description, oq5Var2, false);
                        }
                        xcs.b(n, q, ((dq0) oq5Var2.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, nu0.i(), oq5Var2, 48, 48, 63480);
                    } else {
                        i = -2067864929;
                        i4 = R.string.quality_settings_lossless_description;
                    }
                    n = vz1.n(oq5Var2, i, i4, oq5Var2, false);
                    xcs.b(n, q, ((dq0) oq5Var2.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, nu0.i(), oq5Var2, 48, 48, 63480);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    y1g.p(w1g.K(uftVar, oq5Var3), oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            default:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    yci q2 = a.q(vci.a, 0.0f, 4, 0.0f, 0.0f, 13);
                    int ordinal2 = uftVar.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            n2 = vz1.n(oq5Var4, -1304464525, R.string.quality_settings_high_description, oq5Var4, false);
                        } else if (ordinal2 == 2) {
                            i2 = -1304461774;
                        } else {
                            if (ordinal2 != 3) {
                                throw vz1.i(oq5Var4, -1304468997, false);
                            }
                            n2 = vz1.n(oq5Var4, -1304459021, R.string.quality_settings_auto_description, oq5Var4, false);
                        }
                        xcs.b(n2, q2, ((dq0) oq5Var4.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, nu0.i(), oq5Var4, 48, 48, 63480);
                    } else {
                        i2 = -1304468208;
                        i4 = R.string.quality_settings_list_element_description_without_subscription;
                    }
                    n2 = vz1.n(oq5Var4, i2, i4, oq5Var4, false);
                    xcs.b(n2, q2, ((dq0) oq5Var4.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, nu0.i(), oq5Var4, 48, 48, 63480);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
        }
    }
}
