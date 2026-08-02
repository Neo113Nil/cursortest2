package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class r28 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ dj2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r28(dj2 dj2Var, int i) {
        super(0);
        this.r = i;
        this.s = dj2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.b();
            case 1:
                return this.s.a();
            default:
                return this.s.b();
        }
    }
}
