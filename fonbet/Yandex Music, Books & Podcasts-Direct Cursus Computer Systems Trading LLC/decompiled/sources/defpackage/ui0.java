package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ui0 extends uif implements Function1 {
    public final /* synthetic */ long r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui0(long j, Function0 function0, boolean z) {
        super(1);
        this.r = j;
        this.s = function0;
        this.t = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        np3 np3Var = (np3) obj;
        return np3Var.b(new ti0(this.s, this.t, qld.w(np3Var, Float.intBitsToFloat((int) (np3Var.a.e() >> 32)) / 2.0f), new d43(this.r, 5)));
    }
}
