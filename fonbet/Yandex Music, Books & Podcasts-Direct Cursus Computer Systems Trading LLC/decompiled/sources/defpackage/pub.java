package defpackage;

import androidx.compose.foundation.lazy.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class pub extends uif implements ryc {
    public final /* synthetic */ List r;
    public final /* synthetic */ ayn s;
    public final /* synthetic */ gdn t;
    public final /* synthetic */ aqi u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ sub w;
    public final /* synthetic */ u6k x;
    public final /* synthetic */ aqi y;
    public final /* synthetic */ aqi z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pub(List list, ayn aynVar, gdn gdnVar, aqi aqiVar, Function1 function1, sub subVar, u6k u6kVar, aqi aqiVar2, aqi aqiVar3) {
        super(4);
        this.r = list;
        this.s = aynVar;
        this.t = gdnVar;
        this.u = aqiVar;
        this.v = function1;
        this.w = subVar;
        this.x = u6kVar;
        this.y = aqiVar2;
        this.z = aqiVar3;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            s9n s9nVar = (s9n) this.r.get(intValue);
            oq5Var.Z(-1477023055);
            s7g.h(aVar, this.s, s9nVar.b, null, false, null, ild.C(740004725, new oub(s9nVar, this.t, this.u, this.v, this.w, this.x, this.y, this.z), oq5Var), oq5Var, (i & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
