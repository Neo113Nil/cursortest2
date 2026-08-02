package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class rva {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rva);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_arrow_mid_up_24) + (Integer.hashCode(R.drawable.ic_close_small_24) * 31);
    }

    public final String toString() {
        return dfi.f("DynamicOverlayIcons(closeIconRes=", R.drawable.ic_close_small_24, R.drawable.ic_arrow_mid_up_24, ", arrowUp=", ")");
    }
}
