package yads;

import defpackage.q8a1;
import defpackage.qd81;

/* loaded from: classes7.dex */
public final class ek extends Exception {
    public final int b;
    public final boolean c;
    public final qd81 d;

    public ek(int i, qd81 qd81Var, boolean z) {
        super(q8a1.c(i, "AudioTrack write failed: "));
        this.c = z;
        this.b = i;
        this.d = qd81Var;
    }
}
