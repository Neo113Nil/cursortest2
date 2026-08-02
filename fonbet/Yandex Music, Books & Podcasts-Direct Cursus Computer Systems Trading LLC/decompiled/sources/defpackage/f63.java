package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class f63 implements k63 {
    public final ArrayList a;

    public f63(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f63) && this.a.equals(((f63) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("LikedPlaylistsBlockLocalData(playlists=", ")", this.a);
    }
}
