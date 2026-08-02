package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class hii implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ sdr c;
    public final /* synthetic */ sdr d;
    public final /* synthetic */ kii e;

    public /* synthetic */ hii(aqi aqiVar, sdr sdrVar, sdr sdrVar2, kii kiiVar, int i) {
        this.a = i;
        this.b = aqiVar;
        this.c = sdrVar;
        this.d = sdrVar2;
        this.e = kiiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yci a;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = kii.p;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(1 & intValue, (intValue & 3) != 2)) {
                    etn.m(new qzm[]{clg.d.o(0, oq5Var), dlg.d.o(0, oq5Var)}, ild.C(-61424508, new hii(this.b, this.c, this.d, this.e, 1), oq5Var), oq5Var, 56);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = kii.p;
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(1 & intValue2, (intValue2 & 3) != 2)) {
                    Boolean bool = (Boolean) this.b.getValue();
                    bool.getClass();
                    oq5Var2.W(1100600637, bool);
                    long j = d85.m;
                    boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
                    vci vciVar = vci.a;
                    if (booleanValue) {
                        oq5Var2.Z(-240961852);
                        a = xee.z(((dq0) oq5Var2.j(eq0.a)).c.a, vciVar, 30);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(-240834628);
                        a = a.a(vciVar, new f3r(((dq0) oq5Var2.j(eq0.a)).c.a));
                        oq5Var2.p(false);
                    }
                    q5g.k(d.d(a, 1.0f), null, j, 0L, null, 0.0f, ild.C(-1818153107, new m2g(12, this.d, this.e), oq5Var2), oq5Var2, 1573248, 58);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
