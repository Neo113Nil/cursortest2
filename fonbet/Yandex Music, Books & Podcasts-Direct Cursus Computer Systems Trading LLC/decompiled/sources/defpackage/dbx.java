package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes.dex */
public class dbx {
    public static final bbx d;
    public final abx a;
    public final Character b;
    public volatile dbx c;

    static {
        new cbx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new cbx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new dbx("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new dbx("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new bbx(new abx("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public dbx(abx abxVar, Character ch) {
        this.a = abxVar;
        if (ch != null) {
            byte[] bArr = abxVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                xq0.x(hdg.n0("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        gdg.R(0, i, bArr.length);
        while (i2 < i) {
            abx abxVar = this.a;
            b(sb, bArr, i2, Math.min(abxVar.f, i - i2));
            i2 += abxVar.f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        gdg.R(i, i + i2, bArr.length);
        abx abxVar = this.a;
        int i3 = abxVar.f;
        int i4 = abxVar.d;
        if (i2 > i3) {
            e7o.e();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(abxVar.b[((int) (j >>> ((i7 - i4) - i5))) & abxVar.c]);
            i5 += i4;
        }
        if (this.b != null) {
            while (i5 < abxVar.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final String c(int i, byte[] bArr) {
        gdg.R(0, i, bArr.length);
        abx abxVar = this.a;
        int i2 = abxVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(abxVar.e * ixf.N(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            xq0.w(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dbx) {
            dbx dbxVar = (dbx) obj;
            if (this.a.equals(dbxVar.a) && Objects.equals(this.b, dbxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Objects.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        abx abxVar = this.a;
        sb.append(abxVar);
        if (8 % abxVar.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public dbx(String str, String str2) {
        this(new abx(str, str2.toCharArray()), (Character) '=');
    }
}
