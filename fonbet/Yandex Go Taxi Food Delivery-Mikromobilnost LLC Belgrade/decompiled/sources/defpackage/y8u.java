package defpackage;

import java.nio.charset.Charset;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class y8u {
    public static final ByteString d = cvw.u(":");
    public static final ByteString e = cvw.u(":status");
    public static final ByteString f = cvw.u(":method");
    public static final ByteString g = cvw.u(":path");
    public static final ByteString h = cvw.u(":scheme");
    public static final ByteString i = cvw.u(":authority");
    public final ByteString a;
    public final ByteString b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y8u(String str, String str2) {
        this(r0, r4);
        Charset charset = uza.a;
        ByteString byteString = new ByteString(str.getBytes(charset));
        byteString.b = str;
        ByteString byteString2 = new ByteString(str2.getBytes(charset));
        byteString2.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8u)) {
            return false;
        }
        y8u y8uVar = (y8u) obj;
        return jl40.l(this.a, y8uVar.a) && jl40.l(this.b, y8uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.w() + Extension.COLON_SPACE + this.b.w();
    }

    public y8u(ByteString byteString, ByteString byteString2) {
        this.a = byteString;
        this.b = byteString2;
        this.c = byteString2.h() + byteString.h() + 32;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y8u(String str, ByteString byteString) {
        this(byteString, r0);
        ByteString byteString2 = new ByteString(str.getBytes(uza.a));
        byteString2.b = str;
    }
}
