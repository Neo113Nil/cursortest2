package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqf5;", "", "Companion", "pf5", "of5", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class qf5 {
    public static final pf5 Companion = new pf5();
    public static final qf5 d = new qf5(0);
    public final int a;
    public final float b;
    public final long c;

    public /* synthetic */ qf5(int i, int i2, float f, long j) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = 0.0f;
        } else {
            this.b = f;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
    }

    public qf5(int i) {
        this.a = 0;
        this.b = 0.0f;
        this.c = 0L;
    }

    public qf5() {
        this(0);
    }
}
