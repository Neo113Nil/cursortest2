package androidx.compose.animation;

import defpackage.hqe;
import defpackage.wdc;
import defpackage.weo;
import defpackage.xp3;
import defpackage.yci;

/* loaded from: classes.dex */
public abstract class b {
    public static final long a;

    static {
        long j = Integer.MIN_VALUE;
        a = (j & 4294967295L) | (j << 32);
    }

    public static yci a(yci yciVar, wdc wdcVar, int i) {
        if ((i & 1) != 0) {
            long j = 1;
            wdcVar = weo.Q(0.0f, 400.0f, new hqe((j & 4294967295L) | (j << 32)), 1);
        }
        return xp3.v(yciVar).f(new SizeAnimationModifierElement(wdcVar));
    }
}
