package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class acs extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ bcs s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ acs(bcs bcsVar, int i) {
        super(0);
        this.r = i;
        this.s = bcsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return Float.valueOf(this.s.b());
            default:
                return this.s;
        }
    }
}
