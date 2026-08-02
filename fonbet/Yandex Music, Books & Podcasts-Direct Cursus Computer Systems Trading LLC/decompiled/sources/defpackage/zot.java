package defpackage;

/* loaded from: classes.dex */
public final class zot {
    public static final zot c = new zot(false, false);
    public final boolean a;
    public final boolean b;

    public zot(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zot)) {
            return false;
        }
        zot zotVar = (zot) obj;
        return this.a == zotVar.a && this.b == zotVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomDecoderSettings(preferHardwareDecodersOnSamsungTablets=");
        sb.append(this.a);
        sb.append(", preferHardwareDecodersOnAnyModel=");
        return dfi.j(sb, this.b, ')');
    }
}
