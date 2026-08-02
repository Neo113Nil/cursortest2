package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class aic {
    public final String a;

    public /* synthetic */ aic(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aic) {
            return Intrinsics.d(this.a, ((aic) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Id(rawValue=", this.a, ")");
    }
}
