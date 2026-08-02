package defpackage;

/* loaded from: classes4.dex */
public final class c4h implements e4h {
    public final v3h a;
    public final boolean b;

    public c4h(v3h v3hVar, boolean z) {
        this.a = v3hVar;
        this.b = z;
    }

    @Override // defpackage.e4h
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4h)) {
            return false;
        }
        c4h c4hVar = (c4h) obj;
        return this.a.equals(c4hVar.a) && this.b == c4hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Static(staticLyricsUiData=" + this.a + ", isFullScreen=" + this.b + ")";
    }
}
