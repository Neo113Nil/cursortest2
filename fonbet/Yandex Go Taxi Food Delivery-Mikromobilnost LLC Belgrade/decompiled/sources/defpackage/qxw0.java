package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqxw0;", "Lbds0;", "Companion", "pxw0", "oxw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class qxw0 extends bds0 {
    public static final pxw0 Companion = new pxw0();
    public static final i3y[] e;
    public final boolean a;
    public final Map b;
    public final String c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, a.b(lazyThreadSafetyMode, new xlw0(9)), null, a.b(lazyThreadSafetyMode, new xlw0(10))};
    }

    public /* synthetic */ qxw0(int i, String str, List list, Map map, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        this.b = (i & 2) == 0 ? b.f() : map;
        this.c = (i & 4) == 0 ? "" : str;
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.bds0
    /* renamed from: a */
    public final Boolean getA() {
        return Boolean.valueOf(this.a);
    }

    public qxw0() {
        Map f = b.f();
        this.a = false;
        this.b = f;
        this.c = "";
        this.d = EmptyList.a;
    }
}
