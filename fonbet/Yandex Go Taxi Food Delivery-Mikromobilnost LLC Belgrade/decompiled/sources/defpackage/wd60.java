package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwd60;", "Ln96;", "Companion", "vd60", "ud60", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class wd60 extends n96 {
    public static final vd60 Companion = new vd60();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new j660(15))};
    public static final wd60 e = new wd60(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ wd60(int i, boolean z, List list) {
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

    public wd60(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public wd60() {
        this(0);
    }
}
