package ru.yandex.taxi.plus.api.dto.state.plaque;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.ef20;
import defpackage.g320;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.plus.api.dto.Action;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetDto;", "", "Companion", "Type", "f", "d", "b", "a", "e", "c", "ru/yandex/taxi/plus/api/dto/state/plaque/i", "ef20", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MicroWidgetDto {
    public static final ef20 Companion = new ef20();
    public static final i3y[] l;
    public final String a;
    public final DisplayWidgetRules b;
    public final Type c;
    public final Action d;
    public final List e;
    public final f f;
    public final d g;
    public final b h;
    public final a i;
    public final e j;
    public final c k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetDto$Type;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/v", BaseDatabaseHelper.TYPE_TEXT, "SPACER", "BUTTON", "ICON", "SWITCH", "BALANCE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Type BALANCE;
        public static final Type BUTTON;
        public static final v Companion;
        public static final Type ICON;
        public static final Type SPACER;
        public static final Type SWITCH;
        public static final Type TEXT;

        static {
            Type type = new Type(BaseDatabaseHelper.TYPE_TEXT, 0);
            TEXT = type;
            Type type2 = new Type("SPACER", 1);
            SPACER = type2;
            Type type3 = new Type("BUTTON", 2);
            BUTTON = type3;
            Type type4 = new Type("ICON", 3);
            ICON = type4;
            Type type5 = new Type("SWITCH", 4);
            SWITCH = type5;
            Type type6 = new Type("BALANCE", 5);
            BALANCE = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new v();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g320(19));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new g320(16)), null, kotlin.a.b(lazyThreadSafetyMode, new g320(17)), null, null, null, null, null, null};
    }

    public MicroWidgetDto(int i, String str, DisplayWidgetRules displayWidgetRules, Type type, Action action, List list, f fVar, d dVar, b bVar, a aVar, e eVar, c cVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new DisplayWidgetRules(0);
        } else {
            this.b = displayWidgetRules;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = type;
        }
        if ((i & 8) == 0) {
            Action.Companion.getClass();
            this.d = Action.m;
        } else {
            this.d = action;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = fVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = dVar;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = aVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = eVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroWidgetDto)) {
            return false;
        }
        MicroWidgetDto microWidgetDto = (MicroWidgetDto) obj;
        return jl40.l(this.a, microWidgetDto.a) && jl40.l(this.b, microWidgetDto.b) && this.c == microWidgetDto.c && jl40.l(this.d, microWidgetDto.d) && jl40.l(this.e, microWidgetDto.e) && jl40.l(this.f, microWidgetDto.f) && jl40.l(this.g, microWidgetDto.g) && jl40.l(this.h, microWidgetDto.h) && jl40.l(this.i, microWidgetDto.i) && jl40.l(this.j, microWidgetDto.j) && jl40.l(this.k, microWidgetDto.k);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Type type = this.c;
        int c2 = unr0.c((this.d.hashCode() + ((hashCode + (type == null ? 0 : type.hashCode())) * 31)) * 31, 31, this.e);
        f fVar = this.f;
        int hashCode2 = (c2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        d dVar = this.g;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.a.hashCode())) * 31;
        b bVar = this.h;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.i;
        int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.j;
        int hashCode6 = (hashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.k;
        return hashCode6 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "MicroWidgetDto(widgetId=" + this.a + ", displayRules=" + this.b + ", type=" + this.c + ", action=" + this.d + ", templates=" + this.e + ", textDto=" + this.f + ", iconDto=" + this.g + ", buttonDto=" + this.h + ", balanceDto=" + this.i + ", switchDto=" + this.j + ", contentDescriptionDto=" + this.k + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetDto$b;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/l", "ru/yandex/taxi/plus/api/dto/state/plaque/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final m Companion = new m();
        public final FormattedText a;

        public /* synthetic */ b(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = FormattedText.c;
            } else {
                this.a = formattedText;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jl40.l(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return ly3.p("ButtonMicroWidgetDto(text=", Extension.C_BRAKE, this.a);
        }

        public b() {
            this.a = FormattedText.c;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetDto$d;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/p", "ru/yandex/taxi/plus/api/dto/state/plaque/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class d {
        public static final q Companion = new q();
        public final String a;

        public /* synthetic */ d(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jl40.l(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("IconMicroWidgetDto(imageUrl=", this.a, Extension.C_BRAKE);
        }

        public d() {
            this.a = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetDto$e;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/r", "ru/yandex/taxi/plus/api/dto/state/plaque/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class e {
        public static final s Companion = new s();
        public final FormattedText a;

        public /* synthetic */ e(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = FormattedText.c;
            } else {
                this.a = formattedText;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jl40.l(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return ly3.p("SwitchMicroWidgetDto(text=", Extension.C_BRAKE, this.a);
        }

        public e() {
            this.a = FormattedText.c;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetDto$f;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/t", "ru/yandex/taxi/plus/api/dto/state/plaque/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class f {
        public static final u Companion = new u();
        public final FormattedText a;

        public /* synthetic */ f(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = FormattedText.c;
            } else {
                this.a = formattedText;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jl40.l(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return ly3.p("TextMicroWidgetDto(text=", Extension.C_BRAKE, this.a);
        }

        public f() {
            this.a = FormattedText.c;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetDto$a;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/j", "ru/yandex/taxi/plus/api/dto/state/plaque/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final k Companion = new k();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;

        public /* synthetic */ a(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText3;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.a.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
        }

        public final String toString() {
            return tse0.m(defpackage.n.r("BalanceMicroWidgetDto(balance=", this.a, ", title=", this.b, ", subtitle="), this.c, Extension.C_BRAKE);
        }

        public a() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = formattedText;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetDto$c;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/n", "ru/yandex/taxi/plus/api/dto/state/plaque/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final o Companion = new o();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g320(18))};
        public final Boolean a;
        public final String b;
        public final String c;
        public final List d;

        public /* synthetic */ c(int i, Boolean bool, String str, String str2, List list) {
            this.a = (i & 1) == 0 ? null : bool;
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
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            return this.d.hashCode() + unr0.b(unr0.b((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentDescriptionDto(accessibilityEnabled=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", actionText=");
            return tse0.j(this.c, ", templates=", Extension.C_BRAKE, sb, this.d);
        }

        public c() {
            this.a = null;
            this.b = "";
            this.c = "";
            this.d = EmptyList.a;
        }
    }

    public MicroWidgetDto() {
        DisplayWidgetRules displayWidgetRules = new DisplayWidgetRules(0);
        Action.Companion.getClass();
        Action action = Action.m;
        this.a = "";
        this.b = displayWidgetRules;
        this.c = null;
        this.d = action;
        this.e = EmptyList.a;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }
}
