package ru.yandex.taxi.panorama;

import defpackage.c6z;
import defpackage.d8y0;
import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.vn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/panorama/d;", "Lvn11;", "Lc6z;", "Companion", "b", "a", "c", "d", "d8y0", "ru/yandex/taxi/panorama/a", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d implements vn11, c6z {
    public static final d8y0 Companion = new d8y0();
    public static final i3y[] o;
    public static final d p;
    public final boolean b;
    public final Map c;
    public final String d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final double i;
    public final String j;
    public final b k;
    public final a l;
    public final C0109d m;
    public final c n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new gjx0(11)), null, kotlin.a.b(lazyThreadSafetyMode, new gjx0(12)), kotlin.a.b(lazyThreadSafetyMode, new gjx0(13)), null, null, null, null, null, null, null, null};
        p = new d(0);
    }

    public /* synthetic */ d(int i, boolean z, Map map, String str, List list, List list2, String str2, String str3, double d, String str4, b bVar, a aVar, C0109d c0109d, c cVar) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        int i2 = i & 8;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.e = emptyList;
        } else {
            this.e = list;
        }
        if ((i & 16) == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str2;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str3;
        }
        if ((i & 128) == 0) {
            this.i = 1.0d;
        } else {
            this.i = d;
        }
        if ((i & 256) == 0) {
            this.j = "";
        } else {
            this.j = str4;
        }
        if ((i & 512) == 0) {
            this.k = new b(0);
        } else {
            this.k = bVar;
        }
        if ((i & 1024) == 0) {
            this.l = new a(0);
        } else {
            this.l = aVar;
        }
        this.m = (i & 2048) == 0 ? new C0109d(0) : c0109d;
        this.n = (i & 4096) == 0 ? new c(0) : cVar;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/panorama/d$a;", "", "Companion", "ru/yandex/taxi/panorama/b", "ru/yandex/taxi/panorama/c", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final ru.yandex.taxi.panorama.c Companion = new ru.yandex.taxi.panorama.c();
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

        public a(int i) {
            this.a = "";
            this.b = "";
        }

        public a() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/panorama/d$b;", "", "Companion", "ru/yandex/taxi/panorama/e", "ru/yandex/taxi/panorama/f", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final f Companion = new f();
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

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/panorama/d$c;", "", "Companion", "ru/yandex/taxi/panorama/g", "ru/yandex/taxi/panorama/h", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final h Companion = new h();
        public static final i3y[] e;
        public final List a;
        public final List b;
        public final List c;
        public final String d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new gjx0(14)), kotlin.a.b(lazyThreadSafetyMode, new gjx0(15)), kotlin.a.b(lazyThreadSafetyMode, new gjx0(16)), null};
        }

        public /* synthetic */ c(int i, String str, List list, List list2, List list3) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
            if ((i & 4) == 0) {
                this.c = emptyList;
            } else {
                this.c = list3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str;
            }
        }

        public c(int i) {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
            this.c = emptyList;
            this.d = "";
        }

        public c() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/panorama/d$d;", "", "Companion", "ru/yandex/taxi/panorama/i", "ru/yandex/taxi/panorama/j", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.panorama.d$d, reason: collision with other inner class name */
    public static final class C0109d {
        public static final j Companion = new j();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final int f;
        public final boolean g;

        public /* synthetic */ C0109d(int i, String str, String str2, String str3, String str4, String str5, int i2, boolean z) {
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
                this.f = 0;
            } else {
                this.f = i2;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z;
            }
        }

        public C0109d(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = 0;
            this.g = false;
        }

        public C0109d() {
            this(0);
        }
    }

    public d() {
        this(0);
    }

    public d(int i) {
        Map f = kotlin.collections.b.f();
        b bVar = new b(0);
        a aVar = new a(0);
        C0109d c0109d = new C0109d(0);
        c cVar = new c(0);
        this.b = false;
        this.c = f;
        this.d = "";
        EmptyList emptyList = EmptyList.a;
        this.e = emptyList;
        this.f = emptyList;
        this.g = "";
        this.h = "";
        this.i = 1.0d;
        this.j = "";
        this.k = bVar;
        this.l = aVar;
        this.m = c0109d;
        this.n = cVar;
    }
}
