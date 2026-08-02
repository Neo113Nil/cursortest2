package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes4.dex */
public final class t5z0 extends o2 implements y1 {
    public final b3 a;

    public t5z0(b3 b3Var) {
        if ((b3Var instanceof v3) || (b3Var instanceof g2)) {
            this.a = b3Var;
        } else {
            ny61.g("unknown object passed to Time");
            throw null;
        }
    }

    public static t5z0 n(a2 a2Var) {
        if (a2Var == null || (a2Var instanceof t5z0)) {
            return (t5z0) a2Var;
        }
        if (a2Var instanceof v3) {
            return new t5z0((v3) a2Var);
        }
        if (a2Var instanceof g2) {
            return new t5z0((g2) a2Var);
        }
        ny61.g("unknown object in factory: ".concat(a2Var.getClass().getName()));
        return null;
    }

    public final Date m() {
        try {
            b3 b3Var = this.a;
            if (!(b3Var instanceof v3)) {
                return ((g2) b3Var).y();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", s5z.a);
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            String u = ((v3) b3Var).u();
            return simpleDateFormat.parse((u.charAt(0) < '5' ? "20" : "19").concat(u));
        } catch (ParseException e) {
            yci0.t(e.getMessage(), "invalid date string: ");
            return null;
        }
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a;
    }

    public final String toString() {
        b3 b3Var = this.a;
        if (!(b3Var instanceof v3)) {
            return ((g2) b3Var).A();
        }
        String u = ((v3) b3Var).u();
        return u.charAt(0) < '5' ? "20".concat(u) : "19".concat(u);
    }
}
