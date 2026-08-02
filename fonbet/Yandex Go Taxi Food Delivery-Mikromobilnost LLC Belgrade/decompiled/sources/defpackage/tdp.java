package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Ltdp;", "Lvn11;", "Lc6z;", "Companion", "a", "c", "b", "qdp", "pdp", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class tdp implements vn11, c6z {
    public static final qdp Companion = new qdp();
    public static final i3y[] l = {null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(20))};
    public static final tdp m = new tdp(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;
    public final int h;
    public final a i;
    public final b j;
    public final Map k;

    public /* synthetic */ tdp(int i, boolean z, boolean z2, boolean z3, boolean z4, String str, int i2, int i3, a aVar, b bVar, Map map) {
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
            this.e = false;
        } else {
            this.e = z4;
        }
        if ((i & 16) == 0) {
            this.f = "⭐";
        } else {
            this.f = str;
        }
        if ((i & 32) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        if ((i & 64) == 0) {
            this.h = 0;
        } else {
            this.h = i3;
        }
        if ((i & 128) == 0) {
            this.i = new a(0);
        } else {
            this.i = aVar;
        }
        if ((i & 256) == 0) {
            this.j = new b(0);
        } else {
            this.j = bVar;
        }
        if ((i & 512) == 0) {
            this.k = kotlin.collections.b.f();
        } else {
            this.k = map;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.k;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltdp$c;", "", "Companion", "xdp", "wdp", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final xdp Companion = new xdp();
        public static final c d = new c(0);
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ c(int i, String str, String str2, String str3) {
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
        }

        public c(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public c() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltdp$b;", "", "Companion", "udp", "vdp", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final vdp Companion = new vdp();
        public final String a;
        public final String b;
        public final String c;
        public final c d;

        public b(int i, String str, String str2, String str3, c cVar) {
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
            if ((i & 8) != 0) {
                this.d = cVar;
            } else {
                c.Companion.getClass();
                this.d = c.d;
            }
        }

        public b() {
            this(0);
        }

        public b(int i) {
            c.Companion.getClass();
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = c.d;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltdp$a;", "", "Companion", "rdp", "sdp", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final sdp Companion = new sdp();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final c e;

        public a(int i, String str, String str2, String str3, String str4, c cVar) {
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
            if ((i & 16) != 0) {
                this.e = cVar;
            } else {
                c.Companion.getClass();
                this.e = c.d;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            c.Companion.getClass();
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = c.d;
        }
    }

    public tdp() {
        this(0);
    }

    public tdp(int i) {
        a aVar = new a(0);
        b bVar = new b(0);
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = "⭐";
        this.g = 0;
        this.h = 0;
        this.i = aVar;
        this.j = bVar;
        this.k = f;
    }
}
