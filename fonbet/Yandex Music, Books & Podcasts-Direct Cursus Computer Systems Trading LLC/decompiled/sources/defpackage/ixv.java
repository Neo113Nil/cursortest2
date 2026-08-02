package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class ixv {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ixv);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.go_back) + (Integer.hashCode(R.string.wizard_liked_artists_title) * 31);
    }

    public final String toString() {
        return dfi.f("WizardLikedArtistsScreenStringResources(titleRes=", R.string.wizard_liked_artists_title, R.string.go_back, ", backButtonDescriptionRes=", ")");
    }
}
