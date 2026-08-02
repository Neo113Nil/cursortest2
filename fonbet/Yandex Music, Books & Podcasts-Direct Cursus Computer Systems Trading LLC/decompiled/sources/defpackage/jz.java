package defpackage;

import java.util.List;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final class jz extends n7w {
    public final List i;
    public final Album$AlbumType j;
    public final fvo k;

    public jz(List list, Album$AlbumType album$AlbumType) {
        list.getClass();
        this.i = list;
        this.j = album$AlbumType;
        this.k = new fvo(wjb.ArtistScreen, new jab(qkb.Header, 1, 1, 0));
    }

    @Override // defpackage.n7w
    public final fvo M() {
        return this.k;
    }
}
