package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class nbq implements df5 {
    public final zy a;

    public nbq(zy zyVar) {
        this.a = zyVar;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_info_24;
    }

    @Override // defpackage.cf5
    public final String e() {
        return "dialog_action_about_artist";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbq) && this.a.equals(((nbq) obj).a);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return R.string.artist_info_block_title;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SheetAboutArtistActionUiData(action=" + this.a + ")";
    }
}
