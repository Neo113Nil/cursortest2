package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class vrv {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vrv);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.actions_menu_unlike) + (Integer.hashCode(R.string.actions_menu_like) * 31);
    }

    public final String toString() {
        return dfi.f("WizardAccessibilityStringResources(likeActionRes=", R.string.actions_menu_like, R.string.actions_menu_unlike, ", unlikeActionRes=", ")");
    }
}
