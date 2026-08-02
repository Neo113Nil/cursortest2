package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class jcg extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ vdr s;
    public final /* synthetic */ vdr t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jcg(vdr vdrVar, vdr vdrVar2, int i) {
        super(2);
        this.r = i;
        this.s = vdrVar;
        this.t = vdrVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                j6e j6eVar = new j6e();
                Boolean bool = Boolean.FALSE;
                j6eVar.a = bool;
                j6eVar.b = bool;
                Boolean bool2 = (Boolean) j6eVar.a;
                boolean booleanValue = bool2 != null ? bool2.booleanValue() : true;
                Boolean bool3 = (Boolean) j6eVar.b;
                r8g.a(this.s, this.t, null, new xbl(booleanValue, bool3 != null ? bool3.booleanValue() : true), new iag(), hq5Var, 0);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                bfs.a(false, ild.s(hq5Var2, -1780682380, new jcg(this.s, this.t, 0)), hq5Var2, 48);
        }
        return Unit.a;
    }
}
