package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class eh6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eh6(float f, int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                zg6 zg6Var = (zg6) this.b;
                o3j o3jVar = (o3j) this.d;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                leu.v(zg6Var, o3jVar, this.c, null, hq5Var, 0, 8);
            case 1:
                zg6 zg6Var2 = (zg6) this.b;
                qh6 qh6Var = (qh6) this.d;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                leu.s(zg6Var2, qh6Var, this.c, null, hq5Var2, 0, 8);
            case 2:
                ukd ukdVar = (ukd) this.b;
                plv plvVar = (plv) this.d;
                ((Integer) obj2).getClass();
                ff7.j(this.c, rvf.R(1), (hq5) obj, ukdVar, plvVar);
                break;
            case 3:
                Function0 function0 = (Function0) this.b;
                yci yciVar = (yci) this.d;
                hq5 hq5Var3 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    long j = d85.m;
                    agr agrVar = eq0.a;
                    long j2 = ((dq0) oq5Var3.j(agrVar)).a.a;
                    long j3 = ((dq0) oq5Var3.j(agrVar)).c.c;
                    float f = 16;
                    yci a = a.a(d.m(androidx.compose.foundation.layout.a.p(yciVar, f, 8, f, this.c), 56), "music_recognition_button");
                    Object K = oq5Var3.K();
                    if (K == gq5.a) {
                        K = new p1i(28);
                        oq5Var3.k0(K);
                    }
                    a0g.d(function0, true, j, j2, j3, androidx.compose.ui.draw.a.b(a, (Function1) K), 0.0f, false, ox6.d, oq5Var3, 100663728, 192);
                } else {
                    oq5Var3.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                pvo.b((String) this.b, (d85) this.d, this.c, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ eh6(Object obj, Object obj2, float f, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = f;
    }
}
