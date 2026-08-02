package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltos0;", "Lxn11;", "Companion", "sos0", "ros0", "combo"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class tos0 implements xn11 {
    public static final sos0 Companion = new sos0();
    public static final i3y[] e;
    public static final tos0 f;
    public final boolean b;
    public final List c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, a.b(lazyThreadSafetyMode, new s7s0(7)), a.b(lazyThreadSafetyMode, new s7s0(8))};
        f = new tos0(0);
    }

    public /* synthetic */ tos0(int i, List list, List list2, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
    }

    public tos0(int i) {
        this.b = false;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
    }

    public tos0() {
        this(0);
    }
}
