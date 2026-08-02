package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class tc0 extends wc0 {
    public final rrl a;
    public final boolean b;

    public tc0(rrl rrlVar) {
        this.a = rrlVar;
        List list = rrlVar.c;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        this.b = !z;
    }

    @Override // defpackage.wc0
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc0) && this.a.equals(((tc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlaylistAndroidAutoPlayableItem(playlist=" + this.a + ")";
    }
}
