package defpackage;

import java.util.Date;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class ng1 {
    public final mg1 a;

    public ng1(mg1 mg1Var) {
        this.a = mg1Var;
    }

    public final qtn a(lt ltVar, Date date, boolean z) {
        String str;
        date.getClass();
        u9b u9bVar = ltVar.e;
        if (u9bVar == null || (str = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) == null) {
            str = "";
        }
        String str2 = str;
        String a = mg1.a(date);
        if (a.length() == 0) {
            dfi.r(hrg.q("Release date is empty for the album: ", ltVar.c, ". This can be fixed"), "ArtistRecentReleaseUiConverter");
        }
        return new qtn(str2, ltVar.c, a, ltVar.b == Album$AlbumType.SINGLE ? (String) this.a.b.getValue() : null, ltVar.g, ltVar.d == WarningContent.EXPLICIT, z);
    }
}
