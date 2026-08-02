package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls1g0;", "Lw96;", "Companion", "r1g0", "q1g0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s1g0 extends w96 {
    public static final r1g0 Companion = new r1g0();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(23))};
    public static final s1g0 e = new s1g0(0);
    public final boolean b;
    public final Map c;

    public /* synthetic */ s1g0(Map map, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public s1g0() {
        this(0);
    }

    public s1g0(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
    }
}
