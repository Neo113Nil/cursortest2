package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ebd extends lbd {
    public static final ebd c = new ebd(5);
    public static final List d;
    public static final boolean e;

    static {
        mhb mhbVar = mhb.STRING;
        d = u75.h(new azc(mhbVar), new azc(mhbVar), new azc(mhb.URL));
        e = true;
    }

    @Override // defpackage.oyc
    public final List b() {
        return d;
    }

    @Override // defpackage.obd
    public final boolean l() {
        return e;
    }
}
