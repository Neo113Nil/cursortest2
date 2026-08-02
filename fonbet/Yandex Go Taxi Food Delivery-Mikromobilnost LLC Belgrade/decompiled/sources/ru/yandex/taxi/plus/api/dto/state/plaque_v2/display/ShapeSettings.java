package ru.yandex.taxi.plus.api.dto.state.plaque_v2.display;

import defpackage.fir0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iwq0;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque_v2/display/ShapeSettings;", "", "Companion", "CornerSettings", "ru/yandex/taxi/plus/api/dto/state/plaque_v2/display/a", "fir0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ShapeSettings {
    public static final fir0 Companion = new fir0();
    public final CornerSettings a;
    public final CornerSettings b;
    public final CornerSettings c;
    public final CornerSettings d;

    public /* synthetic */ ShapeSettings(int i, CornerSettings cornerSettings, CornerSettings cornerSettings2, CornerSettings cornerSettings3, CornerSettings cornerSettings4) {
        this.a = (i & 1) == 0 ? new CornerSettings(0) : cornerSettings;
        if ((i & 2) == 0) {
            this.b = new CornerSettings(0);
        } else {
            this.b = cornerSettings2;
        }
        if ((i & 4) == 0) {
            this.c = new CornerSettings(0);
        } else {
            this.c = cornerSettings3;
        }
        if ((i & 8) == 0) {
            this.d = new CornerSettings(0);
        } else {
            this.d = cornerSettings4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShapeSettings)) {
            return false;
        }
        ShapeSettings shapeSettings = (ShapeSettings) obj;
        return jl40.l(this.a, shapeSettings.a) && jl40.l(this.b, shapeSettings.b) && jl40.l(this.c, shapeSettings.c) && jl40.l(this.d, shapeSettings.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ShapeSettings(leftTopCorner=" + this.a + ", rightTopCorner=" + this.b + ", leftBottomCorner=" + this.c + ", rightBottomCorner=" + this.d + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque_v2/display/ShapeSettings$CornerSettings;", "", "Companion", "Type", "ru/yandex/taxi/plus/api/dto/state/plaque_v2/display/b", "ru/yandex/taxi/plus/api/dto/state/plaque_v2/display/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CornerSettings {
        public static final c Companion = new c();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(23)), null};
        public final Type a;
        public final int b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/plaque_v2/display/ShapeSettings$CornerSettings$Type;", "", "Companion", "ru/yandex/taxi/plus/api/dto/state/plaque_v2/display/d", "FIX", "HALF_HEIGHT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final d Companion;
            public static final Type FIX;
            public static final Type HALF_HEIGHT;

            static {
                Type type = new Type("FIX", 0);
                FIX = type;
                Type type2 = new Type("HALF_HEIGHT", 1);
                HALF_HEIGHT = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new d();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(24));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ CornerSettings(int i, Type type, int i2) {
            this.a = (i & 1) == 0 ? Type.HALF_HEIGHT : type;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CornerSettings)) {
                return false;
            }
            CornerSettings cornerSettings = (CornerSettings) obj;
            return this.a == cornerSettings.a && this.b == cornerSettings.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CornerSettings(type=" + this.a + ", heightFix=" + this.b + Extension.C_BRAKE;
        }

        public CornerSettings() {
            this(0);
        }

        public CornerSettings(int i) {
            this.a = Type.HALF_HEIGHT;
            this.b = 0;
        }
    }

    public ShapeSettings() {
        this(0);
    }

    public ShapeSettings(int i) {
        CornerSettings cornerSettings = new CornerSettings(0);
        CornerSettings cornerSettings2 = new CornerSettings(0);
        CornerSettings cornerSettings3 = new CornerSettings(0);
        CornerSettings cornerSettings4 = new CornerSettings(0);
        this.a = cornerSettings;
        this.b = cornerSettings2;
        this.c = cornerSettings3;
        this.d = cornerSettings4;
    }
}
