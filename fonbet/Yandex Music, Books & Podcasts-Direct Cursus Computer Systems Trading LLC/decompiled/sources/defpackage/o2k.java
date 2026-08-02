package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o2k implements itf {
    public final Function1 a;
    public final ryc b;

    public o2k(Function1 function1, ryc rycVar) {
        this.a = function1;
        this.b = rycVar;
    }

    @Override // defpackage.itf
    public final Function1 getKey() {
        return this.a;
    }
}
