package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class gvf extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvf(int i, int i2) {
        super(0);
        this.r = i;
        this.s = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new fvf(this.r, this.s);
    }
}
