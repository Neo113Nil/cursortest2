package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class yad extends lbd {
    public static final yad c = new yad(1);
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
        return new c85(bow.v((String) ouj.i(list, 2)));
    }

    @Override // defpackage.obd
    public final boolean l() {
        return e;
    }
}
