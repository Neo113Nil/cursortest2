package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class dbd extends lbd {
    public static final dbd c = new dbd(5);
    public static final List d;
    public static final boolean e;

    static {
        mhb mhbVar = mhb.STRING;
        d = u75.h(new azc(mhbVar), new azc(mhbVar), new azc(mhbVar));
        e = true;
    }

    @Override // defpackage.oyc
    public final List b() {
        return d;
    }

    @Override // defpackage.obd
    public final Object k(List list) {
        String b0 = xp3.b0((String) ouj.i(list, 2));
        if (b0 != null) {
            return new lpt(b0);
        }
        ghh.J("getStoredUrlValue", list, "Unable to convert value to Url.", null);
        throw null;
    }

    @Override // defpackage.obd
    public final boolean l() {
        return e;
    }
}
