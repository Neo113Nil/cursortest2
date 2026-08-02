package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.fgn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oqn;
import defpackage.oyr;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/ElementLevelDto;", "", "Companion", "Type", "ru/yandex/taxi/plus/api/dto/state/plaque/g", "oqn", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ElementLevelDto {
    public static final oqn Companion = new oqn();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(13)), null, null};
    public final Type a;
    public final String b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque/ElementLevelDto$Type;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque/h", "WIDGET", "WIDGET_GROUP", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final h Companion;
        public static final Type NONE;
        public static final Type WIDGET;
        public static final Type WIDGET_GROUP;

        static {
            Type type = new Type("WIDGET", 0);
            WIDGET = type;
            Type type2 = new Type("WIDGET_GROUP", 1);
            WIDGET_GROUP = type2;
            Type type3 = new Type(JCP.RAW_PREFIX, 2);
            NONE = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new h();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(14));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ElementLevelDto(int i, Type type, String str, String str2) {
        this.a = (i & 1) == 0 ? Type.NONE : type;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElementLevelDto)) {
            return false;
        }
        ElementLevelDto elementLevelDto = (ElementLevelDto) obj;
        return this.a == elementLevelDto.a && jl40.l(this.b, elementLevelDto.b) && jl40.l(this.c, elementLevelDto.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ElementLevelDto(type=");
        sb.append(this.a);
        sb.append(", widgetId=");
        sb.append(this.b);
        sb.append(", widgetGroupId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public ElementLevelDto() {
        this.a = Type.NONE;
        this.b = null;
        this.c = null;
    }
}
