package ru.yandex.taxi.logistics.sdk.dashboard.ui.state;

import defpackage.k4o;
import defpackage.n351;
import kotlin.Metadata;
import kotlin.enums.a;

/* loaded from: classes5.dex */
public final class SpacerState extends n351 {
    public final Size c;
    public final boolean d;
    public final Object e;
    public final boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/ui/state/SpacerState$Size;", "", "S", "M", "L", "XL", "base"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    public SpacerState(Size size, boolean z, Object obj, boolean z2) {
        super("spacer", false, 14);
        this.c = size;
        this.d = z;
        this.e = obj;
        this.f = z2;
    }

    public SpacerState() {
        this(Size.L, false, null, false);
    }
}
