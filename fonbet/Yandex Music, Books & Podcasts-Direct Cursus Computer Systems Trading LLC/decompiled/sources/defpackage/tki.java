package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tki implements vki {
    public final String a;

    public tki(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tki) && Intrinsics.d(this.a, ((tki) obj).a);
    }

    @Override // defpackage.vki
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Today(date=", this.a, ")");
    }
}
