package defpackage;

/* loaded from: classes4.dex */
public final class v7u {
    public final y1u a;
    public final String b;

    public v7u(y1u y1uVar, String str) {
        this.a = y1uVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7u)) {
            return false;
        }
        v7u v7uVar = (v7u) obj;
        return this.a.equals(v7uVar.a) && this.b.equals(v7uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoClipRadioSequenceItem(item=" + this.a + ", type=" + this.b + ")";
    }
}
