package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.df20;
import defpackage.fg20;
import defpackage.g320;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.yqc0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.api.dto.Action;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetPlaqueDto;", "", "Companion", "IconInCornerDto", "ru/yandex/taxi/plus/api/dto/state/plaque/y", "fg20", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MicroWidgetPlaqueDto {
    public static final fg20 Companion = new fg20();
    public static final i3y[] l;
    public final String a;
    public final List b;
    public final df20 c;
    public final Integer d;
    public final yqc0 e;
    public final d f;
    public final List g;
    public final Action h;
    public final boolean i;
    public final kotlinx.serialization.json.c j;
    public final IconInCornerDto k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new g320(21)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new g320(22)), null, null, null, null};
    }

    public MicroWidgetPlaqueDto(int i, String str, List list, df20 df20Var, Integer num, yqc0 yqc0Var, d dVar, List list2, Action action, boolean z, kotlinx.serialization.json.c cVar, IconInCornerDto iconInCornerDto) {
        this.a = (i & 1) == 0 ? "" : str;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = df20Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = new yqc0(0);
        } else {
            this.e = yqc0Var;
        }
        if ((i & 32) == 0) {
            this.f = new d(0);
        } else {
            this.f = dVar;
        }
        if ((i & 64) == 0) {
            this.g = emptyList;
        } else {
            this.g = list2;
        }
        if ((i & 128) == 0) {
            Action.Companion.getClass();
            this.h = Action.m;
        } else {
            this.h = action;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = cVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = iconInCornerDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroWidgetPlaqueDto)) {
            return false;
        }
        MicroWidgetPlaqueDto microWidgetPlaqueDto = (MicroWidgetPlaqueDto) obj;
        return jl40.l(this.a, microWidgetPlaqueDto.a) && jl40.l(this.b, microWidgetPlaqueDto.b) && jl40.l(this.c, microWidgetPlaqueDto.c) && jl40.l(this.d, microWidgetPlaqueDto.d) && jl40.l(this.e, microWidgetPlaqueDto.e) && jl40.l(this.f, microWidgetPlaqueDto.f) && jl40.l(this.g, microWidgetPlaqueDto.g) && jl40.l(this.h, microWidgetPlaqueDto.h) && this.i == microWidgetPlaqueDto.i && jl40.l(this.j, microWidgetPlaqueDto.j) && jl40.l(this.k, microWidgetPlaqueDto.k);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        df20 df20Var = this.c;
        int hashCode = (c + (df20Var == null ? 0 : df20Var.hashCode())) * 31;
        Integer num = this.d;
        int e = unr0.e((this.h.hashCode() + unr0.c((this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31, this.g)) * 31, 31, this.i);
        kotlinx.serialization.json.c cVar = this.j;
        int hashCode2 = (e + (cVar == null ? 0 : cVar.a.hashCode())) * 31;
        IconInCornerDto iconInCornerDto = this.k;
        return hashCode2 + (iconInCornerDto != null ? iconInCornerDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("MicroWidgetPlaqueDto(plaqueId=", this.a, ", widgetLevelIds=", this.b, ", condition=");
        r.append(this.c);
        r.append(", priority=");
        r.append(this.d);
        r.append(", params=");
        r.append(this.e);
        r.append(", displayRules=");
        r.append(this.f);
        r.append(", metricContext=");
        r.append(this.g);
        r.append(", action=");
        r.append(this.h);
        r.append(", enabledMarkSeenPlaque=");
        r.append(this.i);
        r.append(", seenContext=");
        r.append(this.j);
        r.append(", iconInCorner=");
        r.append(this.k);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetPlaqueDto$IconInCornerDto;", "", "Companion", "Position", "ru/yandex/taxi/plus/api/dto/state/plaque/z", "ru/yandex/taxi/plus/api/dto/state/plaque/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class IconInCornerDto {
        public static final a0 Companion = new a0();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g320(23))};
        public final String a;
        public final Position b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/MicroWidgetPlaqueDto$IconInCornerDto$Position;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/b0", "LEFT_TOP", "RIGHT_TOP", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Position {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Position[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final b0 Companion;
            public static final Position LEFT_TOP;
            public static final Position RIGHT_TOP;

            static {
                Position position = new Position("LEFT_TOP", 0);
                LEFT_TOP = position;
                Position position2 = new Position("RIGHT_TOP", 1);
                RIGHT_TOP = position2;
                Position[] positionArr = {position, position2};
                $VALUES = positionArr;
                $ENTRIES = kotlin.enums.a.a(positionArr);
                Companion = new b0();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g320(24));
            }

            public static Position valueOf(String str) {
                return (Position) Enum.valueOf(Position.class, str);
            }

            public static Position[] values() {
                return (Position[]) $VALUES.clone();
            }
        }

        public /* synthetic */ IconInCornerDto(int i, String str, Position position) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = position;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconInCornerDto)) {
                return false;
            }
            IconInCornerDto iconInCornerDto = (IconInCornerDto) obj;
            return jl40.l(this.a, iconInCornerDto.a) && this.b == iconInCornerDto.b;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Position position = this.b;
            return hashCode + (position == null ? 0 : position.hashCode());
        }

        public final String toString() {
            return "IconInCornerDto(url=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
        }

        public IconInCornerDto() {
            this.a = "";
            this.b = null;
        }
    }

    public MicroWidgetPlaqueDto() {
        yqc0 yqc0Var = new yqc0(0);
        d dVar = new d(0);
        Action.Companion.getClass();
        Action action = Action.m;
        this.a = "";
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = null;
        this.d = null;
        this.e = yqc0Var;
        this.f = dVar;
        this.g = emptyList;
        this.h = action;
        this.i = false;
        this.j = null;
        this.k = null;
    }
}
