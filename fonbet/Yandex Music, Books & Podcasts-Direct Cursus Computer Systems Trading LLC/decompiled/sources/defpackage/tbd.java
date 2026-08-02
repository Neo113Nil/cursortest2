package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class tbd extends lbd {
    public static final tbd c = new tbd(5);
    public static final List d;

    static {
        mhb mhbVar = mhb.STRING;
        d = u75.h(new azc(mhbVar), new azc(mhbVar));
    }

    @Override // defpackage.oyc
    public final List b() {
        return d;
    }

    @Override // defpackage.obd
    public final Object k(List list) {
        String b0 = xp3.b0((String) ouj.i(list, 1));
        if (b0 != null) {
            return new lpt(b0);
        }
        ghh.J("getStoredUrlValue", list, "Unable to convert value to Url.", null);
        throw null;
    }
}
