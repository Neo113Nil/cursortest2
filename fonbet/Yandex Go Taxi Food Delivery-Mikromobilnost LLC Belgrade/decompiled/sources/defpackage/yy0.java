package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yy0 implements kz0 {
    public final zzs a;

    public yy0(zzs zzsVar) {
        this.a = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yy0) && jl40.l(this.a, ((yy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraFinished(focusedGeoPoint=" + this.a + Extension.C_BRAKE;
    }
}
