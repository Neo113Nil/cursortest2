package defpackage;

import androidx.compose.foundation.lazy.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class s1p extends uif implements ryc {
    public final /* synthetic */ List r;
    public final /* synthetic */ n1p s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ mm6 u;
    public final /* synthetic */ fvf v;
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1p(List list, n1p n1pVar, Function1 function1, mm6 mm6Var, fvf fvfVar, int i, boolean z) {
        super(4);
        this.r = list;
        this.s = n1pVar;
        this.t = function1;
        this.u = mm6Var;
        this.v = fvfVar;
        this.w = i;
        this.x = z;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        kjn kjnVar;
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
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            n1p n1pVar = (n1p) this.r.get(intValue);
            oq5Var.Z(79020434);
            String str = n1pVar.a;
            n1p n1pVar2 = this.s;
            boolean equals = str.equals(n1pVar2 != null ? n1pVar2.a : null);
            int i2 = (i & 112) ^ 48;
            boolean f = oq5Var.f(this.t) | oq5Var.f(n1pVar) | oq5Var.h(this.u) | oq5Var.f(this.v) | ((i2 > 32 && oq5Var.d(intValue)) || (i & 48) == 32) | oq5Var.d(this.w);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (f || K == kjnVar2) {
                kjnVar = kjnVar2;
                uyl uylVar = new uyl(this.t, n1pVar, this.u, this.v, intValue, this.w, 2);
                oq5Var.k0(uylVar);
                K = uylVar;
            } else {
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) K;
            yci c = b.c(androidx.compose.ui.platform.a.a(vci.a, n1pVar.c.name()), "isSelected", Boolean.valueOf(equals));
            boolean g = ((i2 > 32 && oq5Var.d(intValue)) || (i & 48) == 32) | oq5Var.g(equals);
            Object K2 = oq5Var.K();
            if (g || K2 == kjnVar) {
                K2 = new q1p(intValue, equals);
                oq5Var.k0(K2);
            }
            dcc.a(function0, equals, this.x, nfp.b(c, false, (Function1) K2), false, 0L, ild.C(1371009010, new r1p(0, n1pVar), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 48);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
