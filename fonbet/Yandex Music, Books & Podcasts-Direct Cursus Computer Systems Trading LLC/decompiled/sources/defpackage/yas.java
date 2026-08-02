package defpackage;

import androidx.compose.foundation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class yas extends uif implements uyc {
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ String s;
    public final /* synthetic */ hs7 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ dup v;
    public final /* synthetic */ Function2 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ o0k y;
    public final /* synthetic */ wn5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yas(Function2 function2, String str, hs7 hs7Var, boolean z, uoi uoiVar, dup dupVar, Function2 function22, boolean z2, o0k o0kVar, boolean z3, wn5 wn5Var) {
        super(6);
        xbs xbsVar = xbs.a;
        this.r = function2;
        this.s = str;
        this.t = hs7Var;
        this.u = z;
        this.v = dupVar;
        this.w = function22;
        this.x = z2;
        this.y = o0kVar;
        this.z = wn5Var;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        wn5 wn5Var;
        float floatValue = ((Number) obj).floatValue();
        long j = ((d85) obj2).a;
        long j2 = ((d85) obj3).a;
        float floatValue2 = ((Number) obj4).floatValue();
        hq5 hq5Var = (hq5) obj5;
        int intValue = ((Number) obj6).intValue();
        if ((intValue & 6) == 0) {
            i = (((oq5) hq5Var).c(floatValue) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((oq5) hq5Var).e(j) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= ((oq5) hq5Var).e(j2) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= ((oq5) hq5Var).c(floatValue2) ? 2048 : 1024;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 9363) != 9362)) {
            oq5Var.Z(-1572254148);
            oq5Var.p(false);
            Function2 function2 = this.r;
            boolean z = this.u;
            hs7 hs7Var = this.t;
            if (function2 == null || this.s.length() != 0 || floatValue2 <= 0.0f) {
                oq5Var.Z(-1570844268);
                oq5Var.p(false);
                wn5Var = null;
            } else {
                oq5Var.Z(-1571270300);
                wn5Var = ild.C(-413527723, new xas(floatValue2, hs7Var, z, function2), oq5Var);
                oq5Var.p(false);
            }
            oq5Var.Z(-1519634405);
            aqi o0 = szf.o0(new d85(!z ? hs7Var.j : hs7Var.i), oq5Var);
            oq5Var.p(false);
            long j3 = ((d85) o0.getValue()).a;
            oq5Var.Z(-1570655509);
            oq5Var.p(false);
            oq5Var.Z(1383318157);
            aqi o02 = szf.o0(new d85(!z ? hs7Var.m : hs7Var.l), oq5Var);
            oq5Var.p(false);
            long j4 = ((d85) o02.getValue()).a;
            oq5Var.Z(-1570361846);
            oq5Var.p(false);
            oq5Var.Z(-1423938813);
            aqi o03 = szf.o0(new d85(hs7Var.o), oq5Var);
            oq5Var.p(false);
            yci b = a.b(vci.a, ((d85) o03.getValue()).a, this.v);
            xbs xbsVar = xbs.a;
            oq5Var.Z(-1569502122);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(new nmq(0L));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            wn5 C = ild.C(-1212965554, new lf0(10, aqiVar, this.y, this.z), oq5Var);
            boolean z2 = (i & 14) == 4;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new was(floatValue, aqiVar);
                oq5Var.k0(K2);
            }
            lyj.b(b, this.w, wn5Var, null, null, null, this.x, floatValue, (Function1) K2, C, this.y, oq5Var, ((i << 21) & 29360128) | 805306368);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
