package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gca implements hca {
    public final cvl a;
    public final Collection b;

    public gca(cvl cvlVar, Collection collection) {
        cvlVar.getClass();
        collection.getClass();
        this.a = cvlVar;
        this.b = collection;
    }

    @Override // defpackage.hca
    public final Collection a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gca)) {
            return false;
        }
        gca gcaVar = (gca) obj;
        return Intrinsics.d(this.a, gcaVar.a) && Intrinsics.d(this.b, gcaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Playlist(playlist=" + this.a + ", tracks=" + this.b + ")";
    }
}
