package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class bbd extends lbd {
    public static final bbd c = new bbd(3);
    public static final List d;
    public static final boolean e;

    static {
        mhb mhbVar = mhb.STRING;
        d = u75.h(new azc(mhbVar), new azc(mhbVar), new azc(mhb.NUMBER));
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
