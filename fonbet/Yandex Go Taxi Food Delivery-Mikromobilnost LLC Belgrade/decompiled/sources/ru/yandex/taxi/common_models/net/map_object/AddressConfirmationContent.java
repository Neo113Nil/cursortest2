package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pn0;
import defpackage.tr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/AddressConfirmationContent;", "", "Companion", "Type", "ru/yandex/taxi/common_models/net/map_object/g", "tr0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressConfirmationContent {
    public static final tr0 Companion = new tr0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(5))};
    public final Type a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/AddressConfirmationContent$Type;", "", "Companion", "ru/yandex/taxi/common_models/net/map_object/h", "STARTING_ADDRESS", "UNKNOWN", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final h Companion;
        public static final Type STARTING_ADDRESS;
        public static final Type UNKNOWN;

        static {
            Type type = new Type("STARTING_ADDRESS", 0);
            STARTING_ADDRESS = type;
            Type type2 = new Type("UNKNOWN", 1);
            UNKNOWN = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new h();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(6));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AddressConfirmationContent(int i, Type type) {
        if ((i & 1) == 0) {
            this.a = Type.UNKNOWN;
        } else {
            this.a = type;
        }
    }

    public AddressConfirmationContent() {
        this(0);
    }

    public AddressConfirmationContent(int i) {
        this.a = Type.UNKNOWN;
    }
}
