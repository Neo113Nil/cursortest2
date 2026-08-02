package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ygs implements ahs {
    public final String a;

    public ygs(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygs) && Intrinsics.d(this.a, ((ygs) obj).a);
    }

    @Override // defpackage.ahs
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Loading(title=", this.a, ")");
    }
}
