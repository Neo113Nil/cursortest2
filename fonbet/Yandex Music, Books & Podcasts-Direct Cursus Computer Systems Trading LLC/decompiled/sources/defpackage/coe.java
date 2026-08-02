package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class coe extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ ksk t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ coe(int i, ksk kskVar, int i2, int i3) {
        super(1);
        this.r = i3;
        this.s = i;
        this.t = kskVar;
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((jsk) obj).d(this.t, this.s, this.u, 0.0f);
                break;
            case 1:
                ((jsk) obj).d(this.t, eeh.b((this.s - r0.a) / 2.0f), eeh.b((this.u - r0.b) / 2.0f), 0.0f);
                break;
            case 2:
                ((jsk) obj).d(this.t, eeh.b((this.s - r0.a) / 2.0f), eeh.b((this.u - r0.b) / 2.0f), 0.0f);
                break;
            case 3:
                ((jsk) obj).d(this.t, this.s, this.u, 0.0f);
                break;
            default:
                jsk.j((jsk) obj, this.t, this.s, this.u, null, 12);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ coe(ksk kskVar, int i, int i2, int i3) {
        super(1);
        this.r = i3;
        this.t = kskVar;
        this.s = i;
        this.u = i2;
    }
}
