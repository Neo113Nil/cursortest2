package ru.yandex.taxi.masstransit.model;

import defpackage.b64;
import defpackage.gs21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.u231;
import defpackage.unr0;
import defpackage.vfc;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/masstransit/model/VariantStyle;", "", "Companion", "a", "VariantType", "b", "t231", "u231", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class VariantStyle {
    public static final u231 Companion = new u231();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(10))};
    public final String a;
    public final List b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/masstransit/model/VariantStyle$VariantType;", "", "Companion", "ru/yandex/taxi/masstransit/model/d", "VEHICLE", "MARK", "DOT", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class VariantType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ VariantType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final VariantType DOT;
        public static final VariantType MARK;
        public static final VariantType UNKNOWN;
        public static final VariantType VEHICLE;

        static {
            VariantType variantType = new VariantType("VEHICLE", 0);
            VEHICLE = variantType;
            VariantType variantType2 = new VariantType("MARK", 1);
            MARK = variantType2;
            VariantType variantType3 = new VariantType("DOT", 2);
            DOT = variantType3;
            VariantType variantType4 = new VariantType("UNKNOWN", 3);
            UNKNOWN = variantType4;
            VariantType[] variantTypeArr = {variantType, variantType2, variantType3, variantType4};
            $VALUES = variantTypeArr;
            $ENTRIES = kotlin.enums.a.a(variantTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(12));
        }

        public static VariantType valueOf(String str) {
            return (VariantType) Enum.valueOf(VariantType.class, str);
        }

        public static VariantType[] values() {
            return (VariantType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ VariantStyle(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
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
        if (!(obj instanceof VariantStyle)) {
            return false;
        }
        VariantStyle variantStyle = (VariantStyle) obj;
        return jl40.l(this.a, variantStyle.a) && jl40.l(this.b, variantStyle.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("VariantStyle(color=", this.a, ", variants=", Extension.C_BRAKE, this.b);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/model/VariantStyle$b;", "", "Companion", "ru/yandex/taxi/masstransit/model/e", "ru/yandex/taxi/masstransit/model/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final f Companion = new f();
        public final float a;
        public final float b;

        public /* synthetic */ b(int i, float f, float f2) {
            if ((i & 1) == 0) {
                this.a = 0.0f;
            } else {
                this.a = f;
            }
            if ((i & 2) == 0) {
                this.b = 0.0f;
            } else {
                this.b = f2;
            }
        }

        public final float a() {
            float f = this.b;
            if (f == 0.0f) {
                return Float.MAX_VALUE;
            }
            return f;
        }

        public final float b() {
            float f = this.a;
            if (f == 0.0f) {
                return Float.MIN_VALUE;
            }
            return f;
        }

        public b(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public b() {
            this(3);
        }

        public /* synthetic */ b(int i) {
            this((i & 1) != 0 ? 0.0f : 12.9f, (i & 2) != 0 ? 0.0f : 12.9f);
        }
    }

    public VariantStyle(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public VariantStyle() {
        this("", EmptyList.a);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/model/VariantStyle$a;", "", "Companion", "ru/yandex/taxi/masstransit/model/b", "ru/yandex/taxi/masstransit/model/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final c Companion = new c();
        public static final i3y[] i = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(11)), null, null, null, null, null, null};
        public final b a;
        public final VariantType b;
        public final String c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final boolean h;

        public /* synthetic */ a(int i2, b bVar, VariantType variantType, String str, int i3, int i4, int i5, int i6, boolean z) {
            this.a = (i2 & 1) == 0 ? new b(3) : bVar;
            if ((i2 & 2) == 0) {
                this.b = VariantType.UNKNOWN;
            } else {
                this.b = variantType;
            }
            if ((i2 & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
            if ((i2 & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i3;
            }
            if ((i2 & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i4;
            }
            if ((i2 & 32) == 0) {
                this.f = 0;
            } else {
                this.f = i5;
            }
            if ((i2 & 64) == 0) {
                this.g = 0;
            } else {
                this.g = i6;
            }
            if ((i2 & 128) == 0) {
                this.h = false;
            } else {
                this.h = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b && jl40.l(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + oyr.b(this.g, oyr.b(this.f, oyr.b(this.e, oyr.b(this.d, unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Variant(zoomRange=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", imageTag=");
            b64.A(this.d, this.c, ", imageWidth=", ", imageHeight=", sb);
            vfc.u(this.e, this.f, ", pointerSize=", ", frameOffset=", sb);
            sb.append(this.g);
            sb.append(", showLabel=");
            sb.append(this.h);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        public a() {
            this(null, null, 255);
        }

        public a(b bVar, VariantType variantType, int i2) {
            bVar = (i2 & 1) != 0 ? new b(3) : bVar;
            variantType = (i2 & 2) != 0 ? VariantType.UNKNOWN : variantType;
            int i3 = (i2 & 8) != 0 ? 0 : 8;
            int i4 = (i2 & 16) != 0 ? 0 : 8;
            int i5 = (i2 & 32) != 0 ? 0 : 21;
            boolean z = (i2 & 128) == 0;
            this.a = bVar;
            this.b = variantType;
            this.c = "";
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = 0;
            this.h = z;
        }
    }
}
