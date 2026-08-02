package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class t09 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ u09 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t09(u09 u09Var, int i) {
        super(0);
        this.r = i;
        this.s = u09Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return Integer.valueOf(this.s.o);
            case 1:
                return Integer.valueOf(this.s.p);
            default:
                return Float.valueOf(this.s.q);
        }
    }
}
