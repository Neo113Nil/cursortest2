package defpackage;

/* loaded from: classes4.dex */
public final class u5z0 extends n2 implements x1 {
    public final a3 a;

    public u5z0(a3 a3Var) {
        if ((a3Var instanceof u3) || (a3Var instanceof f2)) {
            this.a = a3Var;
        } else {
            ny61.g("unknown object passed to Time");
            throw null;
        }
    }

    public static u5z0 h(z1 z1Var) {
        if (z1Var == null || (z1Var instanceof u5z0)) {
            return (u5z0) z1Var;
        }
        if (z1Var instanceof u3) {
            return new u5z0((u3) z1Var);
        }
        if (z1Var instanceof f2) {
            return new u5z0((f2) z1Var);
        }
        ny61.g("unknown object in factory: ".concat(z1Var.getClass().getName()));
        return null;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        return this.a;
    }

    public final String toString() {
        String sb;
        a3 a3Var = this.a;
        if (!(a3Var instanceof u3)) {
            return ((f2) a3Var).t();
        }
        String a = ruu0.a(((u3) a3Var).a);
        if (a.indexOf(45) >= 0 || a.indexOf(43) >= 0) {
            int indexOf = a.indexOf(45);
            if (indexOf < 0) {
                indexOf = a.indexOf(43);
            }
            if (indexOf == a.length() - 3) {
                a = a.concat("00");
            }
            if (indexOf == 10) {
                StringBuilder sb2 = new StringBuilder();
                oyr.C(0, 10, a, "00GMT", sb2);
                oyr.C(10, 13, a, ":", sb2);
                sb2.append(a.substring(13, 15));
                sb = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                oyr.C(0, 12, a, "GMT", sb3);
                oyr.C(12, 15, a, ":", sb3);
                sb3.append(a.substring(15, 17));
                sb = sb3.toString();
            }
        } else {
            sb = a.length() == 11 ? a.substring(0, 10).concat("00GMT+00:00") : a.substring(0, 12).concat("GMT+00:00");
        }
        return sb.charAt(0) < '5' ? "20".concat(sb) : "19".concat(sb);
    }
}
