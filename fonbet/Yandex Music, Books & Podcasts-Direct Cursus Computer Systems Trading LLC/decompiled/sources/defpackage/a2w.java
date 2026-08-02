package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class a2w {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a2w);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.wizard_search_empty_result_description) + f1d.a(R.string.wizard_search_empty_result, f1d.a(R.string.clear_text_content_description, f1d.a(R.string.wizard_search_popular_artists, Integer.hashCode(R.string.wizard_search_text_placeholder) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("WizardSearchScreenStringResources(placeholderRes=", R.string.wizard_search_text_placeholder, R.string.wizard_search_popular_artists, ", popularArtistsRes=", ", clearButtonDescriptionRes=");
        hrg.w(R.string.clear_text_content_description, R.string.wizard_search_empty_result, ", emptyResultTextRes=", ", emptyResultDescriptionRes=", l);
        return f1d.i(l, R.string.wizard_search_empty_result_description, ")");
    }
}
