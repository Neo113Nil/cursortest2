package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s3i implements t3i {
    public final String a;

    public s3i(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3i) && Intrinsics.d(this.a, ((s3i) obj).a);
    }

    @Override // defpackage.t3i
    public final Object getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("String(value=", this.a, ")");
    }
}
