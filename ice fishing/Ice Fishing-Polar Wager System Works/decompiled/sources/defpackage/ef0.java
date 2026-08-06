package defpackage;

/* loaded from: classes.dex */
public final class ef0 {
    public final java.util.Locale IHQe1A4L2xu;

    public ef0(java.util.Locale locale) {
        this.IHQe1A4L2xu = locale;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.ef0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu.toLanguageTag(), ((defpackage.ef0) obj).IHQe1A4L2xu.toLanguageTag());
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.toLanguageTag().hashCode();
    }

    public final java.lang.String toString() {
        return this.IHQe1A4L2xu.toLanguageTag();
    }
}
