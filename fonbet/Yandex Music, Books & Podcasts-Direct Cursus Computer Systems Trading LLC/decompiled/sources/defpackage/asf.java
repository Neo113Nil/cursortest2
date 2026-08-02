package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class asf implements itf {
    public final Function1 a;
    public final Function2 b;
    public final uif c;
    public final wn5 d;

    /* JADX WARN: Multi-variable type inference failed */
    public asf(Function1 function1, Function2 function2, Function1 function12, wn5 wn5Var) {
        this.a = function1;
        this.b = function2;
        this.c = (uif) function12;
        this.d = wn5Var;
    }

    @Override // defpackage.itf
    public final Function1 getKey() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.itf
    public final Function1 getType() {
        return this.c;
    }
}
