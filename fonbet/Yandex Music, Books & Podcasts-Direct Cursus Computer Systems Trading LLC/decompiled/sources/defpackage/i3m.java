package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i3m extends k3m {
    public final String a;

    public i3m(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.k3m
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3m) && Intrinsics.d(this.a, ((i3m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Loading(screenTitle=", this.a, ")");
    }
}
