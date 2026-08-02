package defpackage;

import androidx.compose.foundation.text.selection.Direction;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class tkq0 {
    public final long a;
    public final long b;
    public final rzx c;
    public final boolean d;
    public final ckq0 e;
    public final pzo f;
    public final ey40 g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    public tkq0(long j, long j2, rzx rzxVar, boolean z, ckq0 ckq0Var, pzo pzoVar) {
        this.a = j;
        this.b = j2;
        this.c = rzxVar;
        this.d = z;
        this.e = ckq0Var;
        this.f = pzoVar;
        int i = wlz.a;
        this.g = new ey40((Object) null);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, Direction direction, Direction direction2) {
        if (i == -1) {
            int i2 = skq0.a[z8b1.e(direction, direction2).ordinal()];
            if (i2 == 1) {
                return this.k - 1;
            }
            if (i2 == 2) {
                return this.k;
            }
            if (i2 != 3) {
                w511.b();
                return 0;
            }
        }
        return i;
    }
}
