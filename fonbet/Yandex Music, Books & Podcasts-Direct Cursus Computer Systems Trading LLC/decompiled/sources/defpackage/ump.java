package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class ump {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final qlp d;

    static {
        int i = dvt.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public ump(int i, Bundle bundle, long j, qlp qlpVar) {
        vq1.v(qlpVar == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (qlpVar == null && i < 0) {
            qlpVar = new qlp(i);
        }
        this.d = qlpVar;
    }

    public static ump a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        qlp a = bundle3 != null ? qlp.a(bundle3) : i != 0 ? new qlp(i) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new ump(i, bundle2, j, a);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        qlp qlpVar = this.d;
        if (qlpVar != null) {
            bundle.putBundle(h, qlpVar.b());
        }
        return bundle;
    }

    public ump(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public ump(int i) {
        this(i, Bundle.EMPTY);
    }
}
