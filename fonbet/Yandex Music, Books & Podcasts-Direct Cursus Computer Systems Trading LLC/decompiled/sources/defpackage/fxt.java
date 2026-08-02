package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class fxt extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gxt s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fxt(gxt gxtVar, int i) {
        super(0);
        this.r = i;
        this.s = gxtVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                kxt kxtVar = this.s;
                kxtVar.e(kxtVar);
                break;
            default:
                kxt kxtVar2 = this.s;
                kxtVar2.e(kxtVar2);
                break;
        }
        return Unit.a;
    }
}
