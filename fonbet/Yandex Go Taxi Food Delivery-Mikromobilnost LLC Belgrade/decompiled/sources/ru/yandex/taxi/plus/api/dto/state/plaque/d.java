package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.acj;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.mzj;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/d;", "", "Companion", "a", "ru/yandex/taxi/plus/api/dto/state/plaque/a", "mzj", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class d {
    public static final mzj Companion = new mzj();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new acj(10)), null};
    public final a a;
    public final List b;
    public final ShapeSettings c;

    public /* synthetic */ d(int i, a aVar, List list, ShapeSettings shapeSettings) {
        this.a = (i & 1) == 0 ? new a(0) : aVar;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = new ShapeSettings(0);
        } else {
            this.c = shapeSettings;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b) && jl40.l(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DisplayRules(indentRules=" + this.a + ", backgroundColorSettings=" + this.b + ", backgroundShapeSettings=" + this.c + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/d$a;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/b", "ru/yandex/taxi/plus/api/dto/state/plaque/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final c Companion = new c();
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public /* synthetic */ a(int i, int i2, int i3, int i4, int i5) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i4;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i5;
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
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return ly3.k(this.c, this.d, ", indentTop=", Extension.C_BRAKE, b64.s(this.a, this.b, "IndentRules(indentLeft=", ", indentRight=", ", indentBottom="));
        }

        public a(int i) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
        }

        public a() {
            this(0);
        }
    }

    public d() {
        this(0);
    }

    public d(int i) {
        a aVar = new a(0);
        ShapeSettings shapeSettings = new ShapeSettings(0);
        this.a = aVar;
        this.b = EmptyList.a;
        this.c = shapeSettings;
    }
}
