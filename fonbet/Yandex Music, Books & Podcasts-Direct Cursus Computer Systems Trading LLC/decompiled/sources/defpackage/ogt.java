package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ogt implements bht {
    public final a5r a;

    public ogt(a5r a5rVar) {
        a5rVar.getClass();
        this.a = a5rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogt) && Intrinsics.d(this.a, ((ogt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(specialBlockUiData=" + this.a + ")";
    }
}
