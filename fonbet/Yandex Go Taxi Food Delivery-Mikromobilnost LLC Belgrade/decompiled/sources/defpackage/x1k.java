package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lx1k;", "", "Companion", "w1k", "v1k", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class x1k {
    public static final w1k Companion = new w1k();
    public static final x1k c = new x1k(0);
    public final long a;
    public final long b;

    public /* synthetic */ x1k(int i, long j, long j2) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j2;
        }
    }

    public x1k(int i) {
        this.a = 0L;
        this.b = 0L;
    }

    public x1k() {
        this(0);
    }
}
