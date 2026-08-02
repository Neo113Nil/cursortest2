package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class lm implements nm {
    public final String a;

    public lm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm) && Intrinsics.d(this.a, ((lm) obj).a);
    }

    @Override // defpackage.nm
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return hrg.q("Loading(title=", this.a, ")");
    }
}
