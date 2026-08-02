package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes5.dex */
public final class ehs extends k0 implements c0 {
    public final s0 a;

    public ehs(s0 s0Var) {
        if ((s0Var instanceof a1) || (s0Var instanceof h0)) {
            this.a = s0Var;
        } else {
            xq0.x("unknown object passed to Time");
            throw null;
        }
    }

    public static ehs t(d0 d0Var) {
        if (d0Var == null || (d0Var instanceof ehs)) {
            return (ehs) d0Var;
        }
        if (d0Var instanceof a1) {
            return new ehs((a1) d0Var);
        }
        if (d0Var instanceof h0) {
            return new ehs((h0) d0Var);
        }
        xq0.x("unknown object in factory: ".concat(d0Var.getClass().getName()));
        return null;
    }

    @Override // defpackage.d0
    public final s0 n() {
        return this.a;
    }

    public final String toString() {
        String sb;
        s0 s0Var = this.a;
        if (!(s0Var instanceof a1)) {
            return ((h0) s0Var).F();
        }
        String B = fxf.B(((a1) s0Var).a);
        if (B.indexOf(45) >= 0 || B.indexOf(43) >= 0) {
            int indexOf = B.indexOf(45);
            if (indexOf < 0) {
                indexOf = B.indexOf(43);
            }
            if (indexOf == B.length() - 3) {
                B = B.concat("00");
            }
            if (indexOf == 10) {
                StringBuilder sb2 = new StringBuilder();
                eta.k(0, 10, B, "00GMT", sb2);
                eta.k(10, 13, B, StringUtils.PROCESS_POSTFIX_DELIMITER, sb2);
                sb2.append(B.substring(13, 15));
                sb = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                eta.k(0, 12, B, "GMT", sb3);
                eta.k(12, 15, B, StringUtils.PROCESS_POSTFIX_DELIMITER, sb3);
                sb3.append(B.substring(15, 17));
                sb = sb3.toString();
            }
        } else {
            sb = B.length() == 11 ? B.substring(0, 10).concat("00GMT+00:00") : B.substring(0, 12).concat("GMT+00:00");
        }
        return sb.charAt(0) < '5' ? "20".concat(sb) : "19".concat(sb);
    }
}
