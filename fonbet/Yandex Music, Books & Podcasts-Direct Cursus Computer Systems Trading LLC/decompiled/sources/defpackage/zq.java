package defpackage;

import android.content.Context;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes5.dex */
public final class zq extends fqm {
    private static final long serialVersionUID = 8183017413482772548L;
    public final oq a;

    public zq(oq oqVar) {
        this.a = oqVar;
    }

    @Override // defpackage.fqm
    public final CharSequence a(Context context, int i) {
        int D = ouj.D(i);
        if (D != 0) {
            oq oqVar = this.a;
            if (D != 1) {
                if (D != 2 && D != 3) {
                    xq0.x("Illegal type ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "GENRE_OVERVIEW_PROMOTION" : "MORE_OF_ARTIST" : "DEFAULT" : "HISTORY"));
                    return null;
                }
                Album$AlbumType d = oqVar.d();
                Album$AlbumType album$AlbumType = Album$AlbumType.SINGLE;
                String str = oqVar.i;
                if (d != album$AlbumType) {
                    return str;
                }
                StringBuilder k = dfi.k(str);
                k.append(context.getString(R.string.dot_divider));
                k.append(context.getString(R.string.album_type_single));
                return k.toString();
            }
            oqVar.getClass();
            if (!u2x.J(oqVar)) {
                return oqVar.i;
            }
        }
        return null;
    }

    @Override // defpackage.fqm
    public final co6 b() {
        return this.a.D;
    }

    @Override // defpackage.fqm
    public final jzb c() {
        return this.a.i();
    }

    @Override // defpackage.fqm
    public final CharSequence d() {
        return etn.w(this.a);
    }

    @Override // defpackage.fqm
    public final CharSequence e() {
        return this.a.b;
    }

    @Override // defpackage.fqm
    public final int f() {
        oq oqVar = this.a;
        oqVar.getClass();
        return u2x.I(oqVar) ? 3 : 2;
    }
}
