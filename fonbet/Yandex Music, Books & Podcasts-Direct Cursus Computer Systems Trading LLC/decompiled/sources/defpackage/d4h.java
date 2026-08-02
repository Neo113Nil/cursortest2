package defpackage;

/* loaded from: classes4.dex */
public final class d4h implements e4h {
    public final x3h a;
    public final z2h b;
    public final boolean c;

    public d4h(x3h x3hVar, z2h z2hVar, boolean z) {
        z2hVar.getClass();
        this.a = x3hVar;
        this.b = z2hVar;
        this.c = z;
    }

    @Override // defpackage.e4h
    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4h)) {
            return false;
        }
        d4h d4hVar = (d4h) obj;
        return this.a.equals(d4hVar.a) && this.b == d4hVar.b && this.c == d4hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sync(syncLyricsUiData=");
        sb.append(this.a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", isFullScreen=");
        return ouj.r(sb, this.c, ")");
    }
}
