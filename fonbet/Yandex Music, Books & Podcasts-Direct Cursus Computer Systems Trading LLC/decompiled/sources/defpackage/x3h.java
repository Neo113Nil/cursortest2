package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class x3h implements y3h {
    public final ArrayList a;
    public final String b;

    public x3h(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3h)) {
            return false;
        }
        x3h x3hVar = (x3h) obj;
        return this.a.equals(x3hVar.a) && this.b.equals(x3hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Sync(lyricsList=" + this.a + ", lyricsInfo=" + this.b + ")";
    }
}
