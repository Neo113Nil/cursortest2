package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class pwv {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pwv);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.go_back) + f1d.a(R.string.search, f1d.a(R.string.unmute_description, f1d.a(R.string.mute_description, Integer.hashCode(R.string.wizard_choose_favourite_artists) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("WizardHeaderStringResources(titleRes=", R.string.wizard_choose_favourite_artists, R.string.mute_description, ", muteDescriptionRes=", ", unmuteDescriptionRes=");
        hrg.w(R.string.unmute_description, R.string.search, ", searchButtonDescriptionRes=", ", backButtonDescriptionRes=", l);
        return f1d.i(l, R.string.go_back, ")");
    }
}
