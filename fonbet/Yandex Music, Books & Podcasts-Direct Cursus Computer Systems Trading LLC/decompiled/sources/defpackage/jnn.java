package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class jnn {
    public final v2f a;
    public final ezc b;
    public final Function1 c;

    /* JADX WARN: Multi-variable type inference failed */
    public jnn(v2f v2fVar, Function0 function0, Function1 function1) {
        this.a = v2fVar;
        this.b = (ezc) function0;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnn)) {
            return false;
        }
        jnn jnnVar = (jnn) obj;
        return this.a.equals(jnnVar.a) && this.b.equals(jnnVar.b) && this.c.equals(jnnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31);
    }

    public final String toString() {
        return "Record(id=" + this.a + ", factory=" + this.b + ", configurator=" + this.c + ")";
    }
}
