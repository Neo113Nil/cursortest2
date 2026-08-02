package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class gr4 extends uif implements Function0 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr4(hr4 hr4Var, c80 c80Var, g8l g8lVar, g8l g8lVar2, int i) {
        super(0);
        this.t = hr4Var;
        this.u = c80Var;
        this.v = g8lVar;
        this.w = g8lVar2;
        this.s = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        Object obj = this.w;
        Object obj2 = this.v;
        int i2 = this.s;
        Object obj3 = this.u;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                hr4 hr4Var = (hr4) obj4;
                c80 c80Var = (c80) obj3;
                g8l g8lVar = (g8l) obj2;
                g8l g8lVar2 = (g8l) obj;
                jyr jyrVar = hr4.e;
                StringBuilder sb = new StringBuilder("reason=");
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION");
                sb.append(", PositionInfo:old [mediaItem=");
                sb.append(g8lVar.b);
                sb.append(", period=");
                sb.append(g8lVar.e);
                sb.append(", pos=");
                sb.append(g8lVar.f);
                sb.append("], PositionInfo:new [mediaItem=");
                sb.append(g8lVar2.b);
                sb.append(", period=");
                sb.append(g8lVar2.e);
                sb.append(", pos=");
                return "positionDiscontinuity [" + hr4Var.h(c80Var) + ", " + hrg.m(g8lVar2.f, "]", sb) + "]";
            default:
                return ((zzb) obj2).h((String) obj, new m86(uah.e(new Pair(((pr8) obj4).b, (JSONObject) obj3), new Pair("index", Long.valueOf(i2)))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr4(pr8 pr8Var, JSONObject jSONObject, int i, zzb zzbVar, String str) {
        super(0);
        this.t = pr8Var;
        this.u = jSONObject;
        this.s = i;
        this.v = zzbVar;
        this.w = str;
    }
}
