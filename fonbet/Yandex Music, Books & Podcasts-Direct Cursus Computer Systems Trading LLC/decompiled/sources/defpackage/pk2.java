package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class pk2 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ List t;
    public final /* synthetic */ yci u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk2(int i, int i2, long j, yci yciVar, List list) {
        super(2);
        this.r = i2;
        this.s = j;
        this.t = list;
        this.u = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                jf0.f(rvf.R(1), this.s, (hq5) obj, this.u, this.t);
                break;
            default:
                ((Number) obj2).intValue();
                ywf.b(rvf.R(1), this.s, (hq5) obj, this.u, this.t);
                break;
        }
        return Unit.a;
    }
}
