package ru.yandex.taxi.communications.api.dto;

import defpackage.fn11;
import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.k801;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/api/dto/TypedContentWidget;", "", "Companion", "Type", "ru/yandex/taxi/communications/api/dto/y0", "fn11", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypedContentWidget {
    public static final fn11 Companion = new fn11();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(29)), null};
    public final String a;
    public final String b;
    public final Type c;
    public final FormattedText d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/api/dto/TypedContentWidget$Type;", "", "Companion", "ru/yandex/taxi/communications/api/dto/z0", "SMALL", "LARGE", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final z0 Companion;
        public static final Type LARGE;
        public static final Type SMALL;

        static {
            Type type = new Type("SMALL", 0);
            SMALL = type;
            Type type2 = new Type("LARGE", 1);
            LARGE = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new z0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gn11(0));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TypedContentWidget(int i, String str, String str2, Type type, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = Type.SMALL;
        } else {
            this.c = type;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
    }

    public TypedContentWidget() {
        this(null, null, 15);
    }

    public TypedContentWidget(String str, String str2, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        Type type = Type.SMALL;
        FormattedText formattedText = FormattedText.c;
        this.a = str;
        this.b = str2;
        this.c = type;
        this.d = formattedText;
    }
}
