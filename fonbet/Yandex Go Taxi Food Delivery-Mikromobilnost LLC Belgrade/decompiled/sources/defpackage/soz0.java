package defpackage;

import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lsoz0;", "Ln96;", "Lc6z;", "Companion", "h", "a", "d", "k", "f", "g", "c", "e", CoreConstants.PushMessage.PROCESSING_MIN_TIME, CoreConstants.PushMessage.SERVICE_TYPE, "b", "poz0", "ooz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class soz0 extends n96 implements c6z {
    public static final poz0 Companion = new poz0();
    public static final i3y[] i = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(21)), null, null, null, null, null};
    public static final soz0 j = new soz0(0);
    public final boolean b;
    public final Map c;
    public final a d;
    public final k e;
    public final boolean f;
    public final boolean g;
    public final h h;

    public /* synthetic */ soz0(int i2, boolean z, Map map, a aVar, k kVar, boolean z2, boolean z3, h hVar) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = new a(0);
        } else {
            this.d = aVar;
        }
        if ((i2 & 8) == 0) {
            this.e = new k(0);
        } else {
            this.e = kVar;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i2 & 32) == 0) {
            this.g = false;
        } else {
            this.g = z3;
        }
        if ((i2 & 64) == 0) {
            this.h = new h(0);
        } else {
            this.h = hVar;
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

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$g;", "", "Companion", "dpz0", "epz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class g {
        public static final epz0 Companion = new epz0();
        public final boolean a;

        public /* synthetic */ g(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        public g() {
            this.a = false;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$a;", "", "Companion", "qoz0", "roz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final roz0 Companion = new roz0();
        public final d a;

        public /* synthetic */ a(int i, d dVar) {
            if ((i & 1) == 0) {
                this.a = new d(0);
            } else {
                this.a = dVar;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            this.a = new d(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$h;", "", "Companion", "fpz0", "gpz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class h {
        public static final gpz0 Companion = new gpz0();
        public final Integer a;
        public final Double b;

        public /* synthetic */ h(int i, Integer num, Double d) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = d;
            }
        }

        public h(int i) {
            this.a = null;
            this.b = null;
        }

        public h() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$d;", "", "Companion", "xoz0", "yoz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final yoz0 Companion = new yoz0();
        public final String a;
        public final String b;

        public /* synthetic */ d(int i, String str, String str2) {
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

        public d(int i) {
            this.a = "";
            this.b = "";
        }

        public d() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$f;", "", "Companion", "bpz0", "cpz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class f {
        public static final cpz0 Companion = new cpz0();
        public final i a;
        public final g b;

        public /* synthetic */ f(int i, i iVar, g gVar) {
            this.a = (i & 1) == 0 ? new i(0) : iVar;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = gVar;
            }
        }

        public f() {
            this(0);
        }

        public f(int i) {
            this.a = new i(0);
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$c;", "", "Companion", "voz0", "woz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final woz0 Companion = new woz0();
        public final i a;
        public final b b;

        public /* synthetic */ c(int i, i iVar, b bVar) {
            this.a = (i & 1) == 0 ? new i(0) : iVar;
            if ((i & 2) == 0) {
                this.b = new b(0);
            } else {
                this.b = bVar;
            }
        }

        public c() {
            this(0);
        }

        public c(int i) {
            i iVar = new i(0);
            b bVar = new b(0);
            this.a = iVar;
            this.b = bVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$e;", "", "Companion", "zoz0", "apz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class e {
        public static final apz0 Companion = new apz0();
        public final j a;
        public final String b;
        public final String c;

        public /* synthetic */ e(int i, j jVar, String str, String str2) {
            this.a = (i & 1) == 0 ? new j(0) : jVar;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        public e() {
            this(0);
        }

        public e(int i) {
            this.a = new j(0);
            this.b = "";
            this.c = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$k;", "", "Companion", "lpz0", "mpz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class k {
        public static final mpz0 Companion = new mpz0();
        public final f a;
        public final c b;
        public final e c;

        public /* synthetic */ k(int i, f fVar, c cVar, e eVar) {
            this.a = (i & 1) == 0 ? new f(0) : fVar;
            if ((i & 2) == 0) {
                this.b = new c(0);
            } else {
                this.b = cVar;
            }
            if ((i & 4) == 0) {
                this.c = new e(0);
            } else {
                this.c = eVar;
            }
        }

        public k() {
            this(0);
        }

        public k(int i) {
            f fVar = new f(0);
            c cVar = new c(0);
            e eVar = new e(0);
            this.a = fVar;
            this.b = cVar;
            this.c = eVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$j;", "", "Companion", "jpz0", "kpz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class j {
        public static final kpz0 Companion = new kpz0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public /* synthetic */ j(String str, String str2, String str3, String str4, int i, String str5) {
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
        }

        public j(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
        }

        public j() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$i;", "", "Companion", "hpz0", "ipz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class i {
        public static final ipz0 Companion = new ipz0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public /* synthetic */ i(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
        }

        public i(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
        }

        public i() {
            this(0);
        }
    }

    public soz0() {
        this(0);
    }

    public soz0(int i2) {
        Map f2 = kotlin.collections.b.f();
        a aVar = new a(0);
        k kVar = new k(0);
        h hVar = new h(0);
        this.b = false;
        this.c = f2;
        this.d = aVar;
        this.e = kVar;
        this.f = false;
        this.g = false;
        this.h = hVar;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsoz0$b;", "", "Companion", "toz0", "uoz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final uoz0 Companion = new uoz0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;

        public /* synthetic */ b(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
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
                this.i = "";
            } else {
                this.i = str9;
            }
            if ((i & 512) == 0) {
                this.j = "";
            } else {
                this.j = str10;
            }
        }

        public b(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
            this.h = "";
            this.i = "";
            this.j = "";
        }

        public b() {
            this(0);
        }
    }
}
