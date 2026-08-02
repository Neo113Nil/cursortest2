package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lxan;", "Lw96;", "Lc6z;", "Companion", "wan", "van", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class xan extends w96 implements c6z {
    public static final wan Companion = new wan();
    public static final i3y[] g = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(14)), null};
    public static final xan h = new xan(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Map e;
    public final cbn f;

    public /* synthetic */ xan(int i, boolean z, boolean z2, boolean z3, Map map, cbn cbnVar) {
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
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 8) == 0) {
            this.e = b.f();
        } else {
            this.e = map;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = cbnVar;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.e;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public xan() {
        this(0);
    }

    public xan(int i) {
        Map f = b.f();
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = f;
        this.f = null;
    }
}
