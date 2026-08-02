package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class gin {
    public static final String a;

    static {
        int i = dvt.a;
        a = Integer.toString(0, 36);
    }

    public static gin a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = uwd.d;
            vq1.v(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(uwd.d, false) ? new uwd(bundle.getBoolean(uwd.e, false)) : new uwd();
        }
        if (i == 1) {
            String str3 = gkk.c;
            vq1.v(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(gkk.c, -1.0f);
            return f == -1.0f ? new gkk() : new gkk(f);
        }
        if (i == 2) {
            String str4 = ibr.d;
            vq1.v(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(ibr.d, 5);
            float f2 = bundle.getFloat(ibr.e, -1.0f);
            return f2 == -1.0f ? new ibr(i2) : new ibr(i2, f2);
        }
        if (i != 3) {
            xq0.x(k5r.i(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = hgs.d;
        vq1.v(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(hgs.d, false) ? new hgs(bundle.getBoolean(hgs.e, false)) : new hgs();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
