package defpackage;

import com.connectsdk.discovery.DiscoveryProvider;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public class h0 extends s0 {
    public final byte[] a;

    public h0(byte[] bArr) {
        if (bArr.length < 4) {
            xq0.x("GeneralizedTime string too short");
            throw null;
        }
        this.a = bArr;
        if (L(0) && L(1) && L(2) && L(3)) {
            return;
        }
        xq0.x("illegal characters in GeneralizedTime string");
        throw null;
    }

    public static String D(int i) {
        return i < 10 ? k5r.i(i, CommonUrlParts.Values.FALSE_INTEGER) : Integer.toString(i);
    }

    public static String M(String str) {
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            return str.substring(0, 14).concat(substring.substring(0, 4).concat(substring.substring(i)));
        }
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder();
            eta.k(0, i, substring, "00", sb);
            sb.append(substring.substring(i));
            return str.substring(0, 14).concat(sb.toString());
        }
        if (i2 != 2) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        eta.k(0, i, substring, CommonUrlParts.Values.FALSE_INTEGER, sb2);
        sb2.append(substring.substring(i));
        return str.substring(0, 14).concat(sb2.toString());
    }

    public final SimpleDateFormat B() {
        SimpleDateFormat simpleDateFormat = G() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : K() ? new SimpleDateFormat("yyyyMMddHHmmssz") : H() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public final void E() {
        SimpleDateFormat B;
        String B2 = fxf.B(this.a);
        if (B2.endsWith("Z")) {
            B = G() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", fqg.a) : K() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", fqg.a) : H() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", fqg.a) : new SimpleDateFormat("yyyyMMddHH'Z'", fqg.a);
            B.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (B2.indexOf(45) > 0 || B2.indexOf(43) > 0) {
            B2 = F();
            B = B();
        } else {
            B = G() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : K() ? new SimpleDateFormat("yyyyMMddHHmmss") : H() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            B.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (G()) {
            B2 = M(B2);
        }
        B.parse(B2);
    }

    public final String F() {
        String str;
        String B = fxf.B(this.a);
        if (B.charAt(B.length() - 1) == 'Z') {
            return B.substring(0, B.length() - 1).concat("GMT+00:00");
        }
        int length = B.length();
        char charAt = B.charAt(length - 6);
        if ((charAt == '-' || charAt == '+') && B.indexOf("GMT") == length - 9) {
            return B;
        }
        int length2 = B.length();
        int i = length2 - 5;
        char charAt2 = B.charAt(i);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(B.substring(0, i));
            sb.append("GMT");
            int i2 = length2 - 2;
            eta.k(i, i2, B, StringUtils.PROCESS_POSTFIX_DELIMITER, sb);
            sb.append(B.substring(i2));
            return sb.toString();
        }
        int length3 = B.length() - 3;
        char charAt3 = B.charAt(length3);
        if (charAt3 == '-' || charAt3 == '+') {
            StringBuilder sb2 = new StringBuilder();
            eta.k(0, length3, B, "GMT", sb2);
            sb2.append(B.substring(length3));
            sb2.append(":00");
            return sb2.toString();
        }
        StringBuilder k = dfi.k(B);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i3 = rawOffset / 3600000;
        int i4 = (rawOffset - (3600000 * i3)) / DiscoveryProvider.TIMEOUT;
        try {
            if (timeZone.useDaylightTime()) {
                if (G()) {
                    B = M(B);
                }
                if (timeZone.inDaylightTime(B().parse(B + "GMT" + str + D(i3) + StringUtils.PROCESS_POSTFIX_DELIMITER + D(i4)))) {
                    i3 += str.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        k.append("GMT" + str + D(i3) + StringUtils.PROCESS_POSTFIX_DELIMITER + D(i4));
        return k.toString();
    }

    public final boolean G() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public final boolean H() {
        return L(10) && L(11);
    }

    public final boolean K() {
        return L(12) && L(13);
    }

    public final boolean L(int i) {
        byte b;
        byte[] bArr = this.a;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return j66.e0(this.a);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (!(s0Var instanceof h0)) {
            return false;
        }
        return Arrays.equals(this.a, ((h0) s0Var).a);
    }

    @Override // defpackage.s0
    public void u(qxp qxpVar, boolean z) {
        qxpVar.v(24, z, this.a);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public int w(boolean z) {
        return qxp.n(this.a.length, z);
    }

    @Override // defpackage.s0
    public s0 z() {
        return new vz6(this.a);
    }

    public h0(String str) {
        this.a = fxf.Z(str);
        try {
            E();
        } catch (ParseException e) {
            kac.l(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }
}
