package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.g110;
import defpackage.g320;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.ug20;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.api.dto.Action;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/e0;", "", "Companion", "a", "ug20", "tg20", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class e0 {
    public static final ug20 Companion = new ug20();
    public static final i3y[] e;
    public static final e0 f;
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new g110(16)), kotlin.a.b(lazyThreadSafetyMode, new g110(17)), kotlin.a.b(lazyThreadSafetyMode, new g110(18)), kotlin.a.b(lazyThreadSafetyMode, new g110(19))};
        f = new e0(0);
    }

    public /* synthetic */ e0(int i, List list, List list2, List list3, List list4) {
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
            this.d = emptyList;
        } else {
            this.d = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return jl40.l(this.a, e0Var.a) && jl40.l(this.b, e0Var.b) && jl40.l(this.c, e0Var.c) && jl40.l(this.d, e0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return vfc.p(qv10.v("MicroWidgetsPlaqueDefinitionDto(widgets=", this.a, ", plaques=", this.b, ", widgetLevels="), this.c, ", widgetGroups=", this.d, Extension.C_BRAKE);
    }

    public e0(int i) {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = emptyList;
        this.d = emptyList;
    }

    public e0() {
        this(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/e0$a;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/c0", "ru/yandex/taxi/plus/api/dto/state/plaque/d0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class a {
        public static final d0 Companion = new d0();
        public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g320(25)), null, null};
        public final String a;
        public final List b;
        public final d c;
        public final Action d;

        public a(int i, String str, List list, d dVar, Action action) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = new d(0);
            } else {
                this.c = dVar;
            }
            if ((i & 8) != 0) {
                this.d = action;
            } else {
                Action.Companion.getClass();
                this.d = Action.m;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder r = xvz.r("WidgetLevelDto(id=", this.a, ", elements=", this.b, ", displayRules=");
            r.append(this.c);
            r.append(", action=");
            r.append(this.d);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public a() {
            d dVar = new d(0);
            Action.Companion.getClass();
            Action action = Action.m;
            this.a = "";
            this.b = EmptyList.a;
            this.c = dVar;
            this.d = action;
        }
    }
}
