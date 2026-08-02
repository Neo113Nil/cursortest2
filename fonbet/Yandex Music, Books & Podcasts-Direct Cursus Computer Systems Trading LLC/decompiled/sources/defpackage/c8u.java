package defpackage;

/* loaded from: classes6.dex */
public final class c8u implements dmv {
    public final x1u a;

    public c8u(x1u x1uVar) {
        this.a = x1uVar;
    }

    @Override // defpackage.dmv
    public final co6 a() {
        return this.a.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8u) && this.a.equals(((c8u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoClipRestoredData(videoClip=" + this.a + ")";
    }
}
