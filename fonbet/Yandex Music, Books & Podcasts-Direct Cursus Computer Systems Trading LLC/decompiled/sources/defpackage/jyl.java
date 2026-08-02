package defpackage;

import androidx.compose.foundation.lazy.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class jyl extends uif implements ryc {
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ u0s s;
    public final /* synthetic */ s3e t;
    public final /* synthetic */ Function0 u;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ ryc w;
    public final /* synthetic */ long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyl(ArrayList arrayList, u0s u0sVar, s3e s3eVar, Function0 function0, Function2 function2, ryc rycVar, long j) {
        super(4);
        this.r = arrayList;
        this.s = u0sVar;
        this.t = s3eVar;
        this.u = function0;
        this.v = function2;
        this.w = rycVar;
        this.x = j;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        oq5 oq5Var;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        if (oq5Var2.P(i & 1, (i & 147) != 146)) {
            int i2 = i & 126;
            ozl ozlVar = (ozl) this.r.get(intValue);
            oq5Var2.Z(-18655502);
            u0s u0sVar = this.s;
            ryc rycVar = this.w;
            Function2 function2 = this.v;
            Function0 function0 = this.u;
            s3e s3eVar = this.t;
            if (u0sVar != null) {
                oq5Var2.Z(-18654604);
                oq5Var = oq5Var2;
                tt0.g(this.s, null, weo.S(600, 0, null, 6), "tracksAnimatedCrossfade", ild.C(-1004578607, new iyl(this.s, s3eVar, function0, ozlVar, intValue, function2, rycVar, this.x), oq5Var2), oq5Var, 28032, 2);
                oq5Var.p(false);
            } else {
                oq5Var2.Z(-17799562);
                u1g.g(function0, ozlVar, intValue, null, function2, new rzl(s3eVar, 1), new rzl(s3eVar, 0), rycVar, this.x, oq5Var2, 3072 | ((i2 << 3) & 896));
                oq5Var = oq5Var2;
                oq5Var.p(false);
            }
            oq5Var.p(false);
        } else {
            oq5Var2.S();
        }
        return Unit.a;
    }
}
