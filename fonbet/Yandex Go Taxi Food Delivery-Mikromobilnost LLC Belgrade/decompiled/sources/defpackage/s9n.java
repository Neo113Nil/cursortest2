package defpackage;

import java.util.Locale;

/* loaded from: classes5.dex */
public final class s9n {
    public final l7x0 a;

    public /* synthetic */ s9n(l7x0 l7x0Var) {
        this.a = l7x0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public v4v a(dqb1 dqb1Var) {
        if (dqb1Var instanceof obz0) {
            return new lvi0(this.a.a(((obz0) dqb1Var).a), null, null, null, null, 62);
        }
        Integer num = null;
        if (!(dqb1Var instanceof nbz0)) {
            w511.b();
            return null;
        }
        String upperCase = ((nbz0) dqb1Var).a.toUpperCase(Locale.ROOT);
        switch (upperCase.hashCode()) {
            case -725171228:
                if (upperCase.equals("TELEPHONE")) {
                    num = Integer.valueOf(twh0.telephone);
                    break;
                }
                break;
            case 69137:
                if (upperCase.equals("EYE")) {
                    num = Integer.valueOf(twh0.eye);
                    break;
                }
                break;
            case 1668466930:
                if (upperCase.equals("COMPASS")) {
                    num = Integer.valueOf(twh0.compass);
                    break;
                }
                break;
            case 1675921933:
                if (upperCase.equals("COURIER")) {
                    num = Integer.valueOf(twh0.courier);
                    break;
                }
                break;
        }
        return new iuj0(14, num);
    }
}
