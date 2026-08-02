package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class yq implements fr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public yq(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq)) {
            return false;
        }
        yq yqVar = (yq) obj;
        return this.a.equals(yqVar.a) && this.b.equals(yqVar.b) && this.c.equals(yqVar.c) && this.d.equals(yqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("ShowFavoritesNotificationAction(imageUrl=", this.a, ", title=", this.b, ", buttonText="), this.c, ", actionDeeplink=", this.d, Extension.C_BRAKE);
    }
}
