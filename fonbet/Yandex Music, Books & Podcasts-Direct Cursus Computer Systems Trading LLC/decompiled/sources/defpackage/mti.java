package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mti implements oti {
    public final String a;

    public mti(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mti) && Intrinsics.d(this.a, ((mti) obj).a);
    }

    @Override // defpackage.oti
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
