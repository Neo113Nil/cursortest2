package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lw5d0;", "Ln96;", "Companion", "v5d0", "u5d0", "topnotification"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class w5d0 extends n96 {
    public static final v5d0 Companion = new v5d0();
    public static final w5d0 d = new w5d0(0);
    public final boolean b;
    public final int c;

    public /* synthetic */ w5d0(int i, boolean z, int i2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public w5d0(int i) {
        this.b = false;
        this.c = 0;
    }

    public w5d0() {
        this(0);
    }
}
