package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lq3o;", "Ln96;", "Lc6z;", "Companion", "p3o", "o3o", "entrances"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class q3o extends n96 implements c6z {
    public static final p3o Companion = new p3o();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(1))};
    public static final q3o e = new q3o(0);
    public final boolean b;
    public final Map c;

    public /* synthetic */ q3o(Map map, boolean z, int i) {
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

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public q3o() {
        this(0);
    }

    public q3o(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
    }
}
