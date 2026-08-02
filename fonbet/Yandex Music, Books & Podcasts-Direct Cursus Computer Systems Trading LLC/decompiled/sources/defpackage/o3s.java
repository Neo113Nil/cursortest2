package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o3s {
    public final v1g a;
    public final w3g b;
    public final cvl c;

    public o3s(v1g v1gVar, w3g w3gVar, cvl cvlVar) {
        cvlVar.getClass();
        this.a = v1gVar;
        this.b = w3gVar;
        this.c = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3s)) {
            return false;
        }
        o3s o3sVar = (o3s) obj;
        return this.a.equals(o3sVar.a) && this.b.equals(o3sVar.b) && Intrinsics.d(this.c, o3sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TagPlaylistListItem(uiData=" + this.a + ", likesUiData=" + this.b + ", playlist=" + this.c + ")";
    }
}
