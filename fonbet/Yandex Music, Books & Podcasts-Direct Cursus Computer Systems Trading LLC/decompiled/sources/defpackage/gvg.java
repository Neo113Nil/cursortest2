package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class gvg extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ has s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvg(has hasVar, int i) {
        super(0);
        this.r = i;
        this.s = hasVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.s.onStop();
                break;
            default:
                this.s.onCancel();
                break;
        }
        return Unit.a;
    }
}
