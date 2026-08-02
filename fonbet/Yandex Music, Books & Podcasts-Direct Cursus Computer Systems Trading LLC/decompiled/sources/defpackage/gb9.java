package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class gb9 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ hb9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb9(hb9 hb9Var, int i) {
        super(0);
        this.r = i;
        this.s = hb9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(this.s.r == 0);
            case 1:
                return this.s.s;
            default:
                return Boolean.valueOf(this.s.r == 0);
        }
    }
}
