package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class io7 implements rmh {
    public final String a;
    public final Map b;

    public io7() {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.a = "";
        this.b = e5bVar;
    }

    @Override // defpackage.rmh
    public final byte[] a(l6e l6eVar, String str, byte[] bArr, UUID uuid) {
        l6eVar.getClass();
        bArr.getClass();
        uuid.getClass();
        String str2 = str.length() == 0 ? this.a : null;
        if (str2 != null) {
            str = str2;
        }
        UUID uuid2 = un3.e;
        LinkedHashMap g = uah.g(new Pair(HttpMessage.CONTENT_TYPE_HEADER, uuid.equals(uuid2) ? "text/xml" : uuid.equals(un3.c) ? "application/json" : "application/octet-stream"));
        Map map = this.b;
        g.putAll(map);
        if (Intrinsics.d(uuid2, uuid)) {
            g.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        return ((roj) l6eVar).a(str, uah.i(g, map), bArr);
    }

    @Override // defpackage.rmh
    public final void b(String str) {
        str.getClass();
    }

    @Override // defpackage.rmh
    public final byte[] c(l6e l6eVar, String str, byte[] bArr, UUID uuid) {
        l6eVar.getClass();
        bArr.getClass();
        uuid.getClass();
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return ((roj) l6eVar).a(str + "&signedRequest=" + dvt.r(bArr), e5bVar, new byte[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io7)) {
            return false;
        }
        io7 io7Var = (io7) obj;
        return this.a.equals(io7Var.a) && this.b.equals(io7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + k5r.e(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultMediaDrmCallbackDelegate(defaultLicenseUrl=");
        sb.append(this.a);
        sb.append(", forceDefaultLicenseUrl=false, keyRequestProperties=");
        return k5r.p(sb, this.b, ')');
    }
}
