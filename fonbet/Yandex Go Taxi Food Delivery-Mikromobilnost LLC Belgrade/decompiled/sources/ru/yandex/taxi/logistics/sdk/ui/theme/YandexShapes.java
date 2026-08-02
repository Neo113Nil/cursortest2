package ru.yandex.taxi.logistics.sdk.ui.theme;

import defpackage.b64;
import defpackage.byk0;
import defpackage.cyk0;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.w511;
import kotlin.Metadata;

/* loaded from: classes5.dex */
public final class YandexShapes {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/theme/YandexShapes$Corner;", "", "TOP", "BOTTOM", "sdk-ui-theme"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Corner {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Corner[] $VALUES;
        public static final Corner BOTTOM;
        public static final Corner TOP;

        static {
            Corner corner = new Corner("TOP", 0);
            TOP = corner;
            Corner corner2 = new Corner("BOTTOM", 1);
            BOTTOM = corner2;
            Corner[] cornerArr = {corner, corner2};
            $VALUES = cornerArr;
            $ENTRIES = kotlin.enums.a.a(cornerArr);
        }

        public static Corner valueOf(String str) {
            return (Corner) Enum.valueOf(Corner.class, str);
        }

        public static Corner[] values() {
            return (Corner[]) $VALUES.clone();
        }
    }

    public YandexShapes(int i, int i2, int i3) {
        i = (i3 & 4) != 0 ? 16 : i;
        i2 = (i3 & 8) != 0 ? 24 : i2;
        this.a = 10;
        this.b = 13;
        this.c = i;
        this.d = i2;
    }

    public static byk0 c(int i, Corner corner) {
        int i2 = corner == null ? -1 : a.a[corner.ordinal()];
        if (i2 == -1) {
            return cyk0.c(i);
        }
        if (i2 == 1) {
            float f = i;
            return cyk0.e(f, f, 0.0f, 0.0f, 12);
        }
        if (i2 == 2) {
            float f2 = i;
            return cyk0.e(0.0f, 0.0f, f2, f2, 3);
        }
        w511.b();
        return null;
    }

    public final byk0 a() {
        return cyk0.c(this.d);
    }

    public final byk0 b() {
        return cyk0.c(this.c);
    }

    public final byk0 d() {
        return cyk0.c(this.b);
    }

    public final byk0 e() {
        return cyk0.c(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YandexShapes)) {
            return false;
        }
        YandexShapes yandexShapes = (YandexShapes) obj;
        return this.a == yandexShapes.a && this.b == yandexShapes.b && this.c == yandexShapes.c && this.d == yandexShapes.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "YandexShapes(tinyRadius=", ", smallRadius=", ", mediumRadius=");
        s.append(this.c);
        s.append(", largeRadius=");
        s.append(this.d);
        return s.toString();
    }

    public YandexShapes() {
        this(0, 0, 15);
    }
}
