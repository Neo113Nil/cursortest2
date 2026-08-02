package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class xi0 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi0(Object obj, long j, int i) {
        super(0);
        this.r = i;
        this.t = obj;
        this.s = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                break;
            case 1:
                vwg Z0 = ((zwg) this.t).f.a().Z0();
                Z0.getClass();
                Z0.M(this.s);
                break;
            default:
                mgs mgsVar = (mgs) this.t;
                mgsVar.b();
                mgsVar.d.invoke(Long.valueOf(this.s));
                mgsVar.k = 1;
                mgsVar.f();
                break;
        }
        return Unit.a;
    }
}
