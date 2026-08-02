package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class jtr extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ktr s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jtr(ktr ktrVar, int i) {
        super(0);
        this.r = i;
        this.s = ktrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                ktr ktrVar = this.s;
                ktrVar.a.h(ktrVar.d);
                break;
            default:
                ktr ktrVar2 = this.s;
                ktrVar2.a.z(ktrVar2.d);
                break;
        }
        return Unit.a;
    }
}
