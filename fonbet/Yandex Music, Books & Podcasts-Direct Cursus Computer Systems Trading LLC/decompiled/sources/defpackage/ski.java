package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ski implements vki {
    public final String a;

    public ski(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ski) && Intrinsics.d(this.a, ((ski) obj).a);
    }

    @Override // defpackage.vki
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Other(date=", this.a, ")");
    }
}
