package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class lwa {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lwa);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.close_content_description) + (Integer.hashCode(R.string.dynamic_overlay_learn_more) * 31);
    }

    public final String toString() {
        return dfi.f("DynamicOverlayStrings(learnMoreText=", R.string.dynamic_overlay_learn_more, R.string.close_content_description, ", closeButtonDescription=", ")");
    }
}
