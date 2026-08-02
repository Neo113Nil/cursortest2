package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bos {
    public final mns a;

    public bos(mns mnsVar) {
        this.a = mnsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bos) && Intrinsics.d(this.a, ((bos) obj).a);
    }

    public final int hashCode() {
        mns mnsVar = this.a;
        if (mnsVar == null) {
            return 0;
        }
        return mnsVar.a.hashCode();
    }

    public final String toString() {
        return "Value(token=" + this.a + ")";
    }
}
