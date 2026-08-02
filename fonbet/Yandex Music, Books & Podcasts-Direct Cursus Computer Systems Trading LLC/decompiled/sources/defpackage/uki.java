package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uki implements vki {
    public final String a;

    public uki(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uki) && Intrinsics.d(this.a, ((uki) obj).a);
    }

    @Override // defpackage.vki
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Yesterday(date=", this.a, ")");
    }
}
