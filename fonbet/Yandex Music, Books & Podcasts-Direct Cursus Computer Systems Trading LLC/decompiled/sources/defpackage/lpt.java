package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lpt {
    public final String a;

    public /* synthetic */ lpt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lpt) {
            return Intrinsics.d(this.a, ((lpt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
