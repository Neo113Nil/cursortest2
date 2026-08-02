package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tuf implements itf {
    public final Function1 a;
    public final Function1 b;
    public final wn5 c;

    public tuf(Function1 function1, Function1 function12, wn5 wn5Var) {
        this.a = function1;
        this.b = function12;
        this.c = wn5Var;
    }

    @Override // defpackage.itf
    public final Function1 getKey() {
        return this.a;
    }

    @Override // defpackage.itf
    public final Function1 getType() {
        return this.b;
    }
}
