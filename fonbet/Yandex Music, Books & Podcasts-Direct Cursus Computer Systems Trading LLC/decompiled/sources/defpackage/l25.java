package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l25 implements m25 {
    public final boolean a;
    public final List b;

    public l25(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l25)) {
            return false;
        }
        l25 l25Var = (l25) obj;
        return this.a == l25Var.a && Intrinsics.d(this.b, l25Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Show(showCreatePlaylistButton=" + this.a + ", playlistList=" + this.b + ")";
    }
}
