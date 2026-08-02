package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\b\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lylw;", "Lxn11;", "Lc6z;", "Companion", "a", "b", "c", "d", "f", "e", "vlw", "ulw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ylw implements xn11, c6z {
    public static final vlw Companion = new vlw();
    public static final i3y[] e;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new i2v(17)), kotlin.a.b(lazyThreadSafetyMode, new i2v(18))};
    }

    public /* synthetic */ ylw(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lylw$b;", "", "Companion", "zlw", "amw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final amw Companion = new amw();
        public final c a;

        public /* synthetic */ b(int i, c cVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = cVar;
            }
        }

        public b(int i) {
            this.a = null;
        }

        public b() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lylw$d;", "", "Companion", "dmw", "emw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final emw Companion = new emw();
        public final String a;

        public /* synthetic */ d(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public d() {
            this.a = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lylw$e;", "", "Companion", "fmw", "gmw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class e {
        public static final gmw Companion = new gmw();
        public final String a;
        public final String b;

        public /* synthetic */ e(int i, String str, String str2) {
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

        public e(int i) {
            this.a = "";
            this.b = "";
        }

        public e() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lylw$a;", "", "Companion", "wlw", "xlw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final xlw Companion = new xlw();
        public final String a;
        public final b b;

        public /* synthetic */ a(int i, String str, b bVar) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new b(0);
            } else {
                this.b = bVar;
            }
        }

        public a() {
            b bVar = new b(0);
            this.a = "";
            this.b = bVar;
        }
    }

    public ylw() {
        this(0);
    }

    public ylw(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lylw$c;", "", "Companion", "bmw", "cmw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final cmw Companion = new cmw();
        public final d a;
        public final f b;
        public final e c;

        public /* synthetic */ c(int i, d dVar, f fVar, e eVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = dVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = fVar;
            }
            if ((i & 4) == 0) {
                this.c = new e(0);
            } else {
                this.c = eVar;
            }
        }

        public c() {
            e eVar = new e(0);
            this.a = null;
            this.b = null;
            this.c = eVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lylw$f;", "", "Companion", "hmw", "imw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class f {
        public static final imw Companion = new imw();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ f(int i, String str, String str2, String str3, String str4) {
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
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            jl40.l(this.d, "glued");
        }

        public f() {
            this.a = "";
            this.b = "";
            this.c = null;
            this.d = null;
            jl40.l(null, "glued");
        }
    }
}
