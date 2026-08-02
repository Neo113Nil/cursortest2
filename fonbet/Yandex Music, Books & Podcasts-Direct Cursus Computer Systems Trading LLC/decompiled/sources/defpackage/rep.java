package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rep {
    public final long a;
    public final long b;
    public final wof c;
    public final boolean d;
    public final ydp e;
    public final eh f;
    public final woi g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    public rep(long j, long j2, wof wofVar, boolean z, ydp ydpVar, eh ehVar) {
        this.a = j;
        this.b = j2;
        this.c = wofVar;
        this.d = z;
        this.e = ydpVar;
        this.f = ehVar;
        int i = vug.a;
        this.g = new woi(6);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, j48 j48Var, j48 j48Var2) {
        if (i == -1) {
            int ordinal = ldg.F(j48Var, j48Var2).ordinal();
            if (ordinal == 0) {
                return this.k - 1;
            }
            if (ordinal == 1) {
                return this.k;
            }
            if (ordinal != 2) {
                b6e.s();
                return 0;
            }
        }
        return i;
    }
}
