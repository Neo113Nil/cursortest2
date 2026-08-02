package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v9e {
    public final String a;
    public final jfb0 b;
    public final Uri c;

    public v9e(String str, jfb0 jfb0Var, Uri uri) {
        this.a = str;
        this.b = jfb0Var;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9e)) {
            return false;
        }
        v9e v9eVar = (v9e) obj;
        return this.a.equals(v9eVar.a) && jl40.l(this.b, v9eVar.b) && jl40.l(this.c, v9eVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "ContactEntry(displayName=" + this.a + ", phone=" + this.b + ", avatarUri=" + this.c + Extension.C_BRAKE;
    }
}
