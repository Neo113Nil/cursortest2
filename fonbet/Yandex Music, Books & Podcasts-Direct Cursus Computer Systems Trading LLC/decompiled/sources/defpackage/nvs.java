package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nvs implements ovs {
    public final cvl a;
    public final List b;

    public nvs(cvl cvlVar, List list) {
        cvlVar.getClass();
        list.getClass();
        this.a = cvlVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvs)) {
            return false;
        }
        nvs nvsVar = (nvs) obj;
        return Intrinsics.d(this.a, nvsVar.a) && Intrinsics.d(this.b, nvsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Playlist(playlist=" + this.a + ", tracks=" + this.b + ")";
    }
}
