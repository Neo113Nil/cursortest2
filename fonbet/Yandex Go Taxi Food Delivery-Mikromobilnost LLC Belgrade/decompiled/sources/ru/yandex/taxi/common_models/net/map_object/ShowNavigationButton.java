package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o7s0;
import defpackage.wyr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/ShowNavigationButton;", "", "Companion", "Type", "ru/yandex/taxi/common_models/net/map_object/l0", "o7s0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShowNavigationButton {
    public static final o7s0 Companion = new o7s0();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(8)), null};
    public final Type a;
    public final FormattedText b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/ShowNavigationButton$Type;", "", "Companion", "ru/yandex/taxi/common_models/net/map_object/m0", "REJECT", "CONFIRM", "UNKNOWN", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Type CONFIRM;
        public static final m0 Companion;
        public static final Type REJECT;
        public static final Type UNKNOWN;

        static {
            Type type = new Type("REJECT", 0);
            REJECT = type;
            Type type2 = new Type("CONFIRM", 1);
            CONFIRM = type2;
            Type type3 = new Type("UNKNOWN", 2);
            UNKNOWN = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new m0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(9));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ShowNavigationButton(int i, Type type, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? Type.UNKNOWN : type;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
    }

    public ShowNavigationButton() {
        Type type = Type.UNKNOWN;
        FormattedText formattedText = FormattedText.c;
        this.a = type;
        this.b = formattedText;
    }
}
