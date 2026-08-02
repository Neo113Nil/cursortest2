package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class vr1 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr1(int i, Function0 function0) {
        super(0);
        this.r = i;
        this.s = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.invoke();
            case 1:
                this.s.invoke();
                return Boolean.TRUE;
            case 2:
                this.s.invoke();
                return Boolean.TRUE;
            case 3:
                this.s.invoke();
                return Boolean.TRUE;
            case 4:
                this.s.invoke();
                return Unit.a;
            default:
                return this.s.invoke();
        }
    }
}
