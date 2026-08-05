package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class NqvILgmY {
    public static final ThreadLocal jb9XjC4I = new ThreadLocal();
    public mcXgUFR8 Qr9iLBAD;
    public final mcXgUFR8 VgvYg0wo;
    public final p70 qoPGr6Ce = new p70(0);
    public final ArrayList NCTxEWno = new ArrayList();
    public final tg0 MdtA4re8 = new tg0(5, this);
    public final d3vfVszL wxUZMvaN = new d3vfVszL(1, this);
    public boolean P7K7Inc8 = false;
    public float b2ZJblxo = 1.0f;

    public NqvILgmY(mcXgUFR8 mcxgufr8) {
        this.VgvYg0wo = mcxgufr8;
    }

    public static NqvILgmY qoPGr6Ce() {
        ThreadLocal threadLocal = jb9XjC4I;
        if (threadLocal.get() == null) {
            threadLocal.set(new NqvILgmY(new mcXgUFR8(3)));
        }
        return (NqvILgmY) threadLocal.get();
    }
}
