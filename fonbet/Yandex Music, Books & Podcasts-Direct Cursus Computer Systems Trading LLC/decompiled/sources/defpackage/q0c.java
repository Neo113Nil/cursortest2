package defpackage;

/* loaded from: classes4.dex */
public final class q0c {
    public final p6k a;

    public q0c(p6k p6kVar) {
        this.a = p6kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0c) && this.a.equals(((q0c) obj).a);
    }

    public final int hashCode() {
        return -473109560;
    }

    public final String toString() {
        return "Extension(id=select_method_gallery_pressed_color_extension, params=" + this.a + ")";
    }
}
