package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class thn implements vhn {
    public final Collection a;

    public thn(Collection collection) {
        collection.getClass();
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thn) && Intrinsics.d(this.a, ((thn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Exclude(values=" + this.a + ")";
    }
}
