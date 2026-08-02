package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lyyb;", "Ln96;", "Companion", "xyb", "wyb", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class yyb extends n96 {
    public static final xyb Companion = new xyb();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new y99(16))};
    public static final yyb e = new yyb(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ yyb(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public yyb(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public yyb() {
        this(0);
    }
}
