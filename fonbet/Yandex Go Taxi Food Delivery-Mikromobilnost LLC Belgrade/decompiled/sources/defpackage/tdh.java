package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class tdh {
    public final int a;
    public int b;
    public final wz40 c;
    public boolean d;
    public int e;
    public float f;

    public tdh(int i) {
        this.a = 2;
        this.b = -1;
        this.c = new wz40(new b6y[16]);
        this.e = -1;
    }

    public static int a(i4y i4yVar, boolean z) {
        return z ? ((j4y) ((a4y) a.Z(i4yVar.m))).a + 1 : ((j4y) ((a4y) a.P(i4yVar.m))).a - 1;
    }

    public static int b(i4y i4yVar, boolean z) {
        if (z) {
            j4y j4yVar = (j4y) ((a4y) a.Z(i4yVar.m));
            return (i4yVar.q == Orientation.Vertical ? j4yVar.u : j4yVar.v) + 1;
        }
        j4y j4yVar2 = (j4y) ((a4y) a.P(i4yVar.m));
        return (i4yVar.q == Orientation.Vertical ? j4yVar2.u : j4yVar2.v) - 1;
    }

    public tdh() {
        this(0);
    }
}
