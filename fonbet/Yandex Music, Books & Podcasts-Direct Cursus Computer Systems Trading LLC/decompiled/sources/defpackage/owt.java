package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class owt extends v5g {
    public final Object a;
    public final int b;
    public final ofc c;

    public owt(Object obj, int i, ofc ofcVar) {
        obj.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = obj;
        this.b = i;
        this.c = ofcVar;
    }

    @Override // defpackage.v5g
    public final v5g L(String str, Function1 function1) {
        Object obj = this.a;
        return ((Boolean) function1.invoke(obj)).booleanValue() ? this : new q4c(obj, str, this.c, this.b);
    }

    @Override // defpackage.v5g
    public final Object w() {
        return this.a;
    }
}
