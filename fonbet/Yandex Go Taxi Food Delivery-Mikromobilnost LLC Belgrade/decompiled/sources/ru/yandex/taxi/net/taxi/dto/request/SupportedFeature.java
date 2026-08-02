package ru.yandex.taxi.net.taxi.dto.request;

import defpackage.flw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.w5w0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/net/taxi/dto/request/SupportedFeature;", "", "Companion", "Type", "ru/yandex/taxi/net/taxi/dto/request/a", "flw0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SupportedFeature {
    public static final flw0 Companion = new flw0();
    public static final i3y[] c;
    public final Type a;
    public final List b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/net/taxi/dto/request/SupportedFeature$Type;", "", "Companion", "ru/yandex/taxi/net/taxi/dto/request/b", "UNKNOWN", "ORDER_BUTTON_ACTIONS", "SWAP_SUMMARY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Type ORDER_BUTTON_ACTIONS;
        public static final Type SWAP_SUMMARY;
        public static final Type UNKNOWN;

        static {
            Type type = new Type("UNKNOWN", 0);
            UNKNOWN = type;
            Type type2 = new Type("ORDER_BUTTON_ACTIONS", 1);
            ORDER_BUTTON_ACTIONS = type2;
            Type type3 = new Type("SWAP_SUMMARY", 2);
            SWAP_SUMMARY = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(24));
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
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new w5w0(22)), kotlin.a.b(lazyThreadSafetyMode, new w5w0(23))};
    }

    public /* synthetic */ SupportedFeature(int i, Type type, List list) {
        this.a = (i & 1) == 0 ? Type.UNKNOWN : type;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportedFeature)) {
            return false;
        }
        SupportedFeature supportedFeature = (SupportedFeature) obj;
        return this.a == supportedFeature.a && jl40.l(this.b, supportedFeature.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SupportedFeature(type=" + this.a + ", values=" + this.b + Extension.C_BRAKE;
    }

    public SupportedFeature(Type type, List list) {
        this.a = type;
        this.b = list;
    }

    public SupportedFeature() {
        this(Type.UNKNOWN, EmptyList.a);
    }
}
