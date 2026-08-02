package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class bp9 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp9(Object obj, int i, int i2) {
        super(0);
        this.r = i2;
        this.t = obj;
        this.s = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                ((ep9) this.t).d(this.s);
                return Unit.a;
            default:
                cds cdsVar = ((idp) this.t).f;
                return Integer.valueOf(cdsVar.b.e(this.s));
        }
    }
}
