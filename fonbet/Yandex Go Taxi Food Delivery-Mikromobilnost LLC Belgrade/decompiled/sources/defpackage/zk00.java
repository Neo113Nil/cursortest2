package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzk00;", "Lw96;", "Companion", "yk00", "xk00", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class zk00 extends w96 {
    public static final yk00 Companion = new yk00();
    public static final i3y[] e;
    public static final zk00 f;
    public final boolean b;
    public final List c;
    public final Map d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, a.b(lazyThreadSafetyMode, new t5z(15)), a.b(lazyThreadSafetyMode, new t5z(16))};
        f = new zk00(0);
    }

    public /* synthetic */ zk00(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? EmptyList.a : list;
        if ((i & 4) == 0) {
            this.d = b.f();
        } else {
            this.d = map;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public zk00() {
        this(0);
    }

    public zk00(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = EmptyList.a;
        this.d = f2;
    }
}
