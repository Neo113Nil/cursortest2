package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lqd0;", "Ln96;", "Lc6z;", "Companion", "a", "b", "rd0", "nd0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class qd0 extends n96 implements c6z {
    public static final rd0 Companion = new rd0();
    public static final i3y[] e;
    public static final qd0 f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ar(16)), kotlin.a.b(lazyThreadSafetyMode, new ar(17))};
        f = new qd0(0);
    }

    public /* synthetic */ qd0(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? true : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final a c(String str) {
        Object obj;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((a) obj).getA(), str)) {
                break;
            }
        }
        return (a) obj;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqd0$b;", "", "Companion", "td0", "sd0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class b {
        public static final td0 Companion = new td0();
        public static final b c = new b(0);
        public final String a;
        public final String b;

        public /* synthetic */ b(int i, String str, String str2) {
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

        public b(int i) {
            this.a = "";
            this.b = "";
        }

        public b() {
            this(0);
        }
    }

    public qd0() {
        this(0);
    }

    public qd0(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = true;
        this.c = f2;
        this.d = EmptyList.a;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqd0$a;", "", "Companion", "pd0", "od0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static final pd0 Companion = new pd0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final boolean i;
        public final b j;

        static {
            new a(0);
        }

        public a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, b bVar) {
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
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str6;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str7;
            }
            if ((i & 128) == 0) {
                this.h = "";
            } else {
                this.h = str8;
            }
            if ((i & 256) == 0) {
                this.i = false;
            } else {
                this.i = z;
            }
            if ((i & 512) != 0) {
                this.j = bVar;
            } else {
                b.Companion.getClass();
                this.j = b.c;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.h;
        }

        /* renamed from: b, reason: from getter */
        public final String getG() {
            return this.g;
        }

        /* renamed from: c, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: d, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public a() {
            this(0);
        }

        public a(int i) {
            b.Companion.getClass();
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
            this.h = "";
            this.i = false;
            this.j = b.c;
        }
    }
}
