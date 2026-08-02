package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class nbd extends lbd {
    public static final nbd c = new nbd(1);
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
        return new c85(bow.v((String) ouj.i(list, 1)));
    }
}
