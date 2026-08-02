package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes4.dex */
public class v3 extends b3 {
    public static final p1 b = new p1(20, v3.class);
    public final byte[] a;

    public v3(byte[] bArr) {
        byte b2;
        byte b3;
        if (bArr.length < 2) {
            ny61.g("UTCTime string too short");
            throw null;
        }
        this.a = bArr;
        if (bArr.length <= 0 || (b2 = bArr[0]) < 48 || b2 > 57 || bArr.length <= 1 || (b3 = bArr[1]) < 48 || b3 > 57) {
            ny61.g("illegal characters in UTCTime string");
            throw null;
        }
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return rza1.e(this.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (!(b3Var instanceof v3)) {
            return false;
        }
        return Arrays.equals(this.a, ((v3) b3Var).a);
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.I(23, this.a, z);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(this.a.length, z);
    }

    public final String toString() {
        return quu0.a(this.a);
    }

    public final String u() {
        String a = quu0.a(this.a);
        if (a.indexOf(45) < 0 && a.indexOf(43) < 0) {
            return a.length() == 11 ? a.substring(0, 10).concat("00GMT+00:00") : a.substring(0, 12).concat("GMT+00:00");
        }
        int indexOf = a.indexOf(45);
        if (indexOf < 0) {
            indexOf = a.indexOf(43);
        }
        if (indexOf == a.length() - 3) {
            a = a.concat("00");
        }
        if (indexOf == 10) {
            StringBuilder sb = new StringBuilder();
            oyr.C(0, 10, a, "00GMT", sb);
            oyr.C(10, 13, a, ":", sb);
            sb.append(a.substring(13, 15));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        oyr.C(0, 12, a, "GMT", sb2);
        oyr.C(12, 15, a, ":", sb2);
        sb2.append(a.substring(15, 17));
        return sb2.toString();
    }

    public v3(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", s5z.a);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.a = quu0.b(simpleDateFormat.format(date));
    }

    public v3(String str) {
        this.a = quu0.b(str);
        try {
            new SimpleDateFormat("yyMMddHHmmssz", s5z.a).parse(u());
        } catch (ParseException e) {
            vg10.g(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }
}
