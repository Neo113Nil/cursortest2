package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class b6g extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ long u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6g(int i, int i2, long j, yci yciVar, List list) {
        super(2);
        this.r = i2;
        this.s = list;
        this.t = yciVar;
        this.u = j;
        this.v = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                c6g.a(rvf.R(this.v | 1), this.u, (hq5) obj, this.t, this.s);
                break;
            default:
                ((Number) obj2).intValue();
                dgg.a(rvf.R(this.v | 1), this.u, (hq5) obj, this.t, this.s);
                break;
        }
        return Unit.a;
    }
}
