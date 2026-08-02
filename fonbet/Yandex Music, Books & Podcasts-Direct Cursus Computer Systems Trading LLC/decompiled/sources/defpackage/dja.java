package defpackage;

/* loaded from: classes3.dex */
public final class dja {
    public final yia a;
    public final zgs b;

    public dja(yia yiaVar, zgs zgsVar) {
        this.a = yiaVar;
        this.b = zgsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dja)) {
            return false;
        }
        dja djaVar = (dja) obj;
        return this.a == djaVar.a && this.b.equals(djaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadedSectionsBlockUiData(type=" + this.a + ", uiData=" + this.b + ")";
    }
}
