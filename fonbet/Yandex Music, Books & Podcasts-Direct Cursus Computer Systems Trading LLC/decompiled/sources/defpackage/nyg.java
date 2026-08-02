package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nyg implements oyg {
    public final String a;

    public /* synthetic */ nyg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nyg) {
            return Intrinsics.d(this.a, ((nyg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Url(url=", this.a, ")");
    }
}
