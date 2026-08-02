package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lu851;", "Ln96;", "Lc6z;", "Companion", "a", "v851", "r851", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class u851 extends n96 implements c6z {
    public static final v851 Companion = new v851();
    public static final i3y[] e;
    public static final u851 f;
    public final boolean b;
    public final Map c;
    public final Map d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new q251(5)), kotlin.a.b(lazyThreadSafetyMode, new q251(6))};
        f = new u851(0);
    }

    public /* synthetic */ u851(int i, boolean z, Map map, Map map2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = b.f();
        } else {
            this.d = map2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return getB() && !this.c.isEmpty();
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.d;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lu851$a;", "", "Companion", "s851", "t851", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class a {
        public static final t851 Companion = new t851();
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public a() {
            this.a = "";
            this.b = "";
        }
    }

    public u851() {
        this(0);
    }

    public u851(int i) {
        Map f2 = b.f();
        Map f3 = b.f();
        this.b = false;
        this.c = f2;
        this.d = f3;
    }
}
