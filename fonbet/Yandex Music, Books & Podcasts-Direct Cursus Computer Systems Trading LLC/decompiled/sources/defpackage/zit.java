package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.y;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.CardPlaybackScope;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes6.dex */
public final class zit {
    public final Context a;
    public final PlaybackScope b;
    public final y c;

    public zit(Context context, CardPlaybackScope cardPlaybackScope, y yVar) {
        context.getClass();
        yVar.getClass();
        this.a = context;
        this.b = cardPlaybackScope;
        this.c = yVar;
    }

    public final void a(yit yitVar) {
        yitVar.getClass();
        boolean z = yitVar instanceof o20;
        PlaybackScope playbackScope = this.b;
        Context context = this.a;
        if (z) {
            int i = AlbumScreenActivity.v0;
            context.startActivity(leu.T(context, ((o20) yitVar).a, playbackScope));
            return;
        }
        Intent intent = null;
        if (yitVar instanceof hm1) {
            int i2 = ArtistScreenActivity.w0;
            context.startActivity(l48.p(context, ((hm1) yitVar).a, playbackScope, null, 24));
            return;
        }
        if (yitVar instanceof s3m) {
            int i3 = PlaylistScreenActivity.B0;
            context.startActivity(dxl.h(context, ((s3m) yitVar).a, playbackScope));
            return;
        }
        if (yitVar instanceof a2g) {
            int i4 = PlaylistScreenActivity.B0;
            context.startActivity(dxl.h(context, ((a2g) yitVar).a, playbackScope));
            return;
        }
        if (yitVar instanceof umk) {
            int i5 = PlaylistScreenActivity.B0;
            context.startActivity(dxl.h(context, ((umk) yitVar).a, playbackScope));
            return;
        }
        if (yitVar instanceof te4) {
            int i6 = AlbumScreenActivity.v0;
            context.startActivity(leu.T(context, ((te4) yitVar).a, playbackScope));
            return;
        }
        if (yitVar instanceof r1g) {
            context.startActivity(quj.V(context, ((r1g) yitVar).a, playbackScope));
            return;
        }
        if (yitVar instanceof fej) {
            int i7 = AlbumScreenActivity.v0;
            context.startActivity(leu.T(context, ((fej) yitVar).a, playbackScope));
            return;
        }
        if (!(yitVar instanceof e6i)) {
            if (yitVar instanceof llu) {
                return;
            }
            b6e.s();
            return;
        }
        ypt a = fqt.a(((e6i) yitVar).c, true, false);
        if (a != null) {
            if (playbackScope != null) {
                int i8 = UrlActivity.C;
                intent = zfm.a(context, a, playbackScope, null, true);
            }
            context.startActivity(intent);
        }
    }

    public final void b(yit yitVar) {
        lwg lwgVar;
        yitVar.getClass();
        if (yitVar instanceof o20) {
            o20 o20Var = (o20) yitVar;
            lwgVar = g0g.D(o20Var.a, o20Var.b, o20Var.c);
        } else if (yitVar instanceof fej) {
            fej fejVar = (fej) yitVar;
            lwgVar = g0g.D(fejVar.a, fejVar.b, false);
        } else if (yitVar instanceof hm1) {
            hm1 hm1Var = (hm1) yitVar;
            lwgVar = g0g.F(hm1Var.a, hm1Var.b);
        } else if (yitVar instanceof te4) {
            te4 te4Var = (te4) yitVar;
            lwgVar = g0g.D(te4Var.a, null, te4Var.d);
        } else if (yitVar instanceof r1g) {
            r1g r1gVar = (r1g) yitVar;
            lwgVar = g0g.D(r1gVar.a, null, r1gVar.c);
        } else if (yitVar instanceof a2g) {
            a2g a2gVar = (a2g) yitVar;
            lwgVar = g0g.H(a2gVar.a, a2gVar.c);
        } else if (yitVar instanceof umk) {
            umk umkVar = (umk) yitVar;
            lwgVar = g0g.H(umkVar.a, umkVar.f);
        } else if (yitVar instanceof s3m) {
            s3m s3mVar = (s3m) yitVar;
            lwgVar = g0g.H(s3mVar.a, s3mVar.b);
        } else {
            if (!(yitVar instanceof e6i) && !(yitVar instanceof llu)) {
                b6e.s();
                return;
            }
            lwgVar = null;
        }
        if (lwgVar == null) {
            return;
        }
        szf.R(this.c, new qvg(lwgVar), this.b);
    }
}
