package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrhu;", "Ln96;", "Companion", "qhu", "phu", "nearestdrivers"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class rhu extends n96 {
    public static final qhu Companion = new qhu();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new gmt(24))};
    public static final rhu e = new rhu(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ rhu(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public rhu(int i) {
        this.b = false;
        this.c = null;
    }

    public rhu() {
        this(0);
    }
}
