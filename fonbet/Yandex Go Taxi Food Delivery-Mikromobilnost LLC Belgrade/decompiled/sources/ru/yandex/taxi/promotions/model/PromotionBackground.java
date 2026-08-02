package ru.yandex.taxi.promotions.model;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pmf0;
import defpackage.scc;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/promotions/model/PromotionBackground;", "", "Companion", "Type", "ru/yandex/taxi/promotions/model/d", "ru/yandex/taxi/promotions/model/c", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PromotionBackground {
    public static final d Companion = new d();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(5)), null, null, null, null};
    public static final List g = scc.g(Type.VIDEO, Type.ANIMATION, Type.IMAGE);
    public final Type a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/promotions/model/PromotionBackground$Type;", "", "Companion", "ru/yandex/taxi/promotions/model/e", "COLOR", "IMAGE", "VIDEO", "ANIMATION", "UNKNOWN", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Type ANIMATION;
        public static final Type COLOR;
        public static final e Companion;
        public static final Type IMAGE;
        public static final Type UNKNOWN;
        public static final Type VIDEO;

        static {
            Type type = new Type("COLOR", 0);
            COLOR = type;
            Type type2 = new Type("IMAGE", 1);
            IMAGE = type2;
            Type type3 = new Type("VIDEO", 2);
            VIDEO = type3;
            Type type4 = new Type("ANIMATION", 3);
            ANIMATION = type4;
            Type type5 = new Type("UNKNOWN", 4);
            UNKNOWN = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(6));
        }

        public static k4o b() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PromotionBackground(int i, Type type, String str, String str2, boolean z, String str3) {
        this.a = (i & 1) == 0 ? Type.UNKNOWN : type;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
    }

    public final String a() {
        String str = this.b;
        if (str.length() > 0) {
            return g8e.o("preview:", str);
        }
        return null;
    }

    public PromotionBackground(Type type, String str, String str2, boolean z, String str3) {
        this.a = type;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public PromotionBackground() {
        this(Type.UNKNOWN, "", null, false, "");
    }
}
