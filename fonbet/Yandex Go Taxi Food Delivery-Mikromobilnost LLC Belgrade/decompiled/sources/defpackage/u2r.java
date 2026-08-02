package defpackage;

import com.yandex.messaging.internal.view.attach.AttachInfo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class u2r {
    public final String a;
    public final AttachInfo b;

    public u2r(String str, AttachInfo attachInfo) {
        this.a = str;
        this.b = attachInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2r)) {
            return false;
        }
        u2r u2rVar = (u2r) obj;
        return jl40.l(this.a, u2rVar.a) && jl40.l(this.b, u2rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileUploaderResult(fileId=" + this.a + ", slowAttachInfo=" + this.b + Extension.C_BRAKE;
    }
}
