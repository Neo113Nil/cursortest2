package ru.yandex.taxi.logistics.sdk.dashboard.model.widget;

import defpackage.jl40;
import defpackage.k4o;
import defpackage.s151;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class SpacerModel extends s151 {
    public final Size a;
    public final boolean b;
    public final Object c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/model/widget/SpacerModel$Size;", "", "S", "M", "L", "XL", "base"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size L;
        public static final Size M;
        public static final Size S;
        public static final Size XL;

        static {
            Size size = new Size("S", 0);
            S = size;
            Size size2 = new Size("M", 1);
            M = size2;
            Size size3 = new Size("L", 2);
            L = size3;
            Size size4 = new Size("XL", 3);
            XL = size4;
            Size[] sizeArr = {size, size2, size3, size4};
            $VALUES = sizeArr;
            $ENTRIES = a.a(sizeArr);
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public SpacerModel(Size size, boolean z, Object obj, String str, int i) {
        size = (i & 1) != 0 ? Size.L : size;
        z = (i & 2) != 0 ? false : z;
        obj = (i & 4) != 0 ? null : obj;
        str = (i & 8) != 0 ? null : str;
        this.a = size;
        this.b = z;
        this.c = obj;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacerModel)) {
            return false;
        }
        SpacerModel spacerModel = (SpacerModel) obj;
        return this.a == spacerModel.a && this.b == spacerModel.b && jl40.l(this.c, spacerModel.c) && jl40.l(this.d, spacerModel.d);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        int hashCode = (e + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SpacerModel(size=" + this.a + ", showWhenSectionCollapsed=" + this.b + ", meta=" + this.c + ", metricaLabel=" + this.d + Extension.C_BRAKE;
    }

    public SpacerModel() {
        this(null, false, null, null, 15);
    }
}
