package defpackage;

/* loaded from: classes.dex */
public final class ggg extends qpc {
    public final sld f;

    public ggg(sld sldVar) {
        this.f = sldVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ggg) {
            return this.f.equals(((ggg) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f + ')';
    }
}
