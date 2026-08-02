package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kxt;
import defpackage.mvt;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/surge/models/dto/i;", "", "Companion", "d", "e", "sxt", "txt", "c", "a", "b", "ru/yandex/taxi/surge/models/dto/f", "kxt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class i {
    public static final kxt Companion = new kxt();
    public final d a;
    public final d b;
    public final c c;
    public final a d;
    public final b e;
    public final String f;

    public /* synthetic */ i(int i, d dVar, d dVar2, c cVar, a aVar, b bVar, String str) {
        this.a = (i & 1) == 0 ? new d(0) : dVar;
        if ((i & 2) == 0) {
            this.b = new d(0);
        } else {
            this.b = dVar2;
        }
        if ((i & 4) == 0) {
            this.c = new c(0);
        } else {
            this.c = cVar;
        }
        if ((i & 8) == 0) {
            this.d = new a(0);
        } else {
            this.d = aVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bVar;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/i$a;", "", "Companion", "ru/yandex/taxi/surge/models/dto/g", "ru/yandex/taxi/surge/models/dto/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final h Companion = new h();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public a(int i) {
            this.a = "";
        }

        public a() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/i$e;", "", "Companion", "ru/yandex/taxi/surge/models/dto/p", "ru/yandex/taxi/surge/models/dto/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class e {
        public static final q Companion = new q();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(3))};
        public final List a;

        public /* synthetic */ e(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public e(int i) {
            this.a = EmptyList.a;
        }

        public e() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/i$d;", "", "Companion", "ru/yandex/taxi/surge/models/dto/n", "ru/yandex/taxi/surge/models/dto/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final o Companion = new o();
        public final e a;
        public final e b;

        public /* synthetic */ d(int i, e eVar, e eVar2) {
            this.a = (i & 1) == 0 ? new e(0) : eVar;
            if ((i & 2) == 0) {
                this.b = new e(0);
            } else {
                this.b = eVar2;
            }
        }

        public d() {
            this(0);
        }

        public d(int i) {
            e eVar = new e(0);
            e eVar2 = new e(0);
            this.a = eVar;
            this.b = eVar2;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/i$b;", "", "Companion", "ru/yandex/taxi/surge/models/dto/j", "ru/yandex/taxi/surge/models/dto/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final k Companion = new k();
        public final Integer a;
        public final Integer b;
        public final Integer c;

        public /* synthetic */ b(int i, Integer num, Integer num2, Integer num3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num3;
            }
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/i$c;", "", "Companion", "ru/yandex/taxi/surge/models/dto/l", "ru/yandex/taxi/surge/models/dto/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final m Companion = new m();
        public final String a;
        public final String b;
        public final float c;
        public final float d;

        public /* synthetic */ c(int i, String str, String str2, float f, float f2) {
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
                this.c = 0.0f;
            } else {
                this.c = f;
            }
            if ((i & 8) == 0) {
                this.d = 0.0f;
            } else {
                this.d = f2;
            }
        }

        public c(int i) {
            this.a = "";
            this.b = "";
            this.c = 0.0f;
            this.d = 0.0f;
        }

        public c() {
            this(0);
        }
    }

    public i() {
        this(0);
    }

    public i(int i) {
        d dVar = new d(0);
        d dVar2 = new d(0);
        c cVar = new c(0);
        a aVar = new a(0);
        this.a = dVar;
        this.b = dVar2;
        this.c = cVar;
        this.d = aVar;
        this.e = null;
        this.f = "";
    }
}
