package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ah7 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Map s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah7(Map map, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                q6k.d(this.s, hq5Var, rvf.R(1));
                break;
            default:
                q6k.d(this.s, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
