package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class bbm implements cbm {
    public final String a;

    public bbm(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbm) && Intrinsics.d(this.a, ((bbm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(R.string.non_music_screen_about_podcast_tab) * 31);
    }

    public final String toString() {
        return "TabsBlock(leftTabStringId=" + R.string.non_music_screen_about_podcast_tab + ", rightTabTitle=" + this.a + ")";
    }
}
