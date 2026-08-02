package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ysq {
    public final uif a;
    public final wdc b;

    /* JADX WARN: Multi-variable type inference failed */
    public ysq(wdc wdcVar, Function1 function1) {
        this.a = (uif) function1;
        this.b = wdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysq)) {
            return false;
        }
        ysq ysqVar = (ysq) obj;
        return this.a.equals(ysqVar.a) && this.b.equals(ysqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
