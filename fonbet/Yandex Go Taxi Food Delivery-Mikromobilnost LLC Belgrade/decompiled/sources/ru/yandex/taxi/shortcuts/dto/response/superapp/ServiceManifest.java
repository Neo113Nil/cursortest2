package ru.yandex.taxi.shortcuts.dto.response.superapp;

import defpackage.dwq0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.owq0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/shortcuts/dto/response/superapp/ServiceManifest;", "", "Companion", "Type", "ru/yandex/taxi/shortcuts/dto/response/superapp/a", "owq0", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ServiceManifest {
    public static final owq0 Companion = new owq0();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(2)), null};
    public final Type a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/shortcuts/dto/response/superapp/ServiceManifest$Type;", "", "Companion", "ru/yandex/taxi/shortcuts/dto/response/superapp/b", "UNKNOWN", "EATSKIT", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Type EATSKIT;
        public static final Type UNKNOWN;

        static {
            Type type = new Type("UNKNOWN", 0);
            UNKNOWN = type;
            Type type2 = new Type("EATSKIT", 1);
            EATSKIT = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(3));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ServiceManifest(int i, Type type, String str) {
        this.a = (i & 1) == 0 ? Type.UNKNOWN : type;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public ServiceManifest() {
        this.a = Type.UNKNOWN;
        this.b = "";
    }
}
