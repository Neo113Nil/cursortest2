package defpackage;

import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final class i1g implements df5 {
    public final int a;
    public final String b;
    public final int c;

    public i1g(sui suiVar, Album$AlbumType album$AlbumType) {
        int i;
        if (u2x.L(album$AlbumType)) {
            i = R.string.menu_element_dislike_podcast;
        } else {
            i = u2x.z(m20.NonMusic, album$AlbumType.a) ? R.string.my_shelf_menu_unlike : R.string.dialog_action_neutral_state;
        }
        this.a = i;
        this.b = "dialog_action_remove_like";
        this.c = R.string.accessibility_uncheck_action;
    }

    @Override // defpackage.df5, defpackage.cf5
    public final long b(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(435082290);
        long j = ((dq0) oq5Var.j(eq0.a)).a.g;
        oq5Var.p(false);
        return j;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_like_active_24;
    }

    @Override // defpackage.cf5
    public final Integer d() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.cf5
    public final String e() {
        return this.b;
    }

    @Override // defpackage.cf5
    public final int getText() {
        return this.a;
    }
}
