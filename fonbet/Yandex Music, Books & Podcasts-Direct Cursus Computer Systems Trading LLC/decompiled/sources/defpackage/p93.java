package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class p93 implements q93 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p93);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.non_music_screen_content_list_tab) + (Integer.hashCode(R.string.non_music_screen_about_book_tab) * 31);
    }

    public final String toString() {
        return dfi.f("TabsBlock(leftTabStringId=", R.string.non_music_screen_about_book_tab, R.string.non_music_screen_content_list_tab, ", rightTabTitleId=", ")");
    }
}
