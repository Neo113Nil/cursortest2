package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rc0 extends wc0 {
    public final c01 a;
    public final List b;
    public final boolean c;

    public rc0(c01 c01Var, List list) {
        list.getClass();
        this.a = c01Var;
        this.b = list;
        this.c = list.isEmpty();
    }

    @Override // defpackage.wc0
    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc0)) {
            return false;
        }
        rc0 rc0Var = (rc0) obj;
        return this.a.equals(rc0Var.a) && Intrinsics.d(this.b, rc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistAndroidAutoPlayableItem(artist=" + this.a + ", tracks=" + this.b + ")";
    }
}
