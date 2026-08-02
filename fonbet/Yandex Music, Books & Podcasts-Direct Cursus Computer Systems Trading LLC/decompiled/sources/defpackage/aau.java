package defpackage;

/* loaded from: classes4.dex */
public final class aau {
    public final x1u a;
    public final z9u b;

    public aau(x1u x1uVar, z9u z9uVar) {
        this.a = x1uVar;
        this.b = z9uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aau)) {
            return false;
        }
        aau aauVar = (aau) obj;
        return this.a.equals(aauVar.a) && this.b.equals(aauVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoClipUiItem(videoClip=" + this.a + ", uiData=" + this.b + ")";
    }
}
