package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class svr extends uif implements Function0 {
    public final /* synthetic */ float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svr(float f) {
        super(0);
        this.r = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(this.r);
    }
}
