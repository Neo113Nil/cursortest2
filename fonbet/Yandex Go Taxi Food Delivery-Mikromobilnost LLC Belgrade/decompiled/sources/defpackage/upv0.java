package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lupv0;", "Ln96;", "Companion", "tpv0", "spv0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class upv0 extends n96 {
    public static final tpv0 Companion = new tpv0();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(20))};
    public final boolean b;
    public final Map c;

    static {
        new upv0(0);
    }

    public /* synthetic */ upv0(Map map, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public upv0() {
        this(0);
    }

    public upv0(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
    }
}
