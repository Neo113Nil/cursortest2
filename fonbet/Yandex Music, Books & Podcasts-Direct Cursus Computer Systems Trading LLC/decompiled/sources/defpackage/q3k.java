package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class q3k extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3k(int i, float f, Function0 function0) {
        super(0);
        this.r = i;
        this.s = f;
        this.t = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new fp7(this.r, this.s, this.t);
    }
}
