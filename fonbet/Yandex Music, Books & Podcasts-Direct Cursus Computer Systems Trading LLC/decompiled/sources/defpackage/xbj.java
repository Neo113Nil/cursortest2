package defpackage;

import android.content.Intent;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes4.dex */
public final class xbj {
    public final /* synthetic */ l13 a;

    public xbj(l13 l13Var) {
        this.a = l13Var;
    }

    public static qbj a(t tVar, rbj rbjVar, kxi kxiVar) {
        tVar.getClass();
        AlbumScreenActivity albumScreenActivity = (AlbumScreenActivity) tVar;
        int i = AlbumScreenActivity.v0;
        Intent intent = albumScreenActivity.getIntent();
        intent.getClass();
        PlaybackScope b = d.b(rbjVar.b, rbjVar.c);
        int i2 = np2.u;
        PlaybackScope w = sj2.w(intent, b);
        y supportFragmentManager = albumScreenActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = PlaybackScope.a;
        aVar.getClass();
        return new qbj(albumScreenActivity, w, supportFragmentManager, new kkp(tVar, aVar, kxiVar), new t1f(tVar, aVar, kxiVar));
    }
}
