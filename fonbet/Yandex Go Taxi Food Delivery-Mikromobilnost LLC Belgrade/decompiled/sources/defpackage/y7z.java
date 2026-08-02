package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ly7z;", "Ln96;", "Companion", "x7z", "w7z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class y7z extends n96 {
    public static final x7z Companion = new x7z();
    public static final y7z d = new y7z(2);
    public final boolean b;
    public final boolean c;

    public /* synthetic */ y7z(int i, boolean z, boolean z2) {
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

    public y7z(int i) {
        this.b = false;
        this.c = false;
    }

    public y7z() {
        this(3);
    }
}
