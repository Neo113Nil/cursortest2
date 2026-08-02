package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqyb;", "Ln96;", "Companion", "pyb", "oyb", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class qyb extends n96 {
    public static final pyb Companion = new pyb();
    public static final qyb d = new qyb(0);
    public final boolean b;
    public final boolean c;

    public /* synthetic */ qyb(int i, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public qyb(int i) {
        this.b = false;
        this.c = false;
    }

    public qyb() {
        this(0);
    }
}
