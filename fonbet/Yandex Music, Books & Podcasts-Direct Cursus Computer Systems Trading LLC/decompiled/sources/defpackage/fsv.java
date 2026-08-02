package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class fsv {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fsv);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.wizard_one_to_one_hint_text) + f1d.a(R.string.explicit_element_content_description, f1d.a(R.string.accessibility_check_action, f1d.a(R.string.accessibility_uncheck_action, Integer.hashCode(R.string.menu_element_like) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("WizardArtistBlockStringResources(likeButtonDescriptionRes=", R.string.menu_element_like, R.string.accessibility_uncheck_action, ", markedAsRes=", ", notMarkedAsRes=");
        hrg.w(R.string.accessibility_check_action, R.string.explicit_element_content_description, ", explicitDescriptionRes=", ", oneToOneHint=", l);
        return f1d.i(l, R.string.wizard_one_to_one_hint_text, ")");
    }
}
