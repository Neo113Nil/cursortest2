package defpackage;

import android.content.Intent;
import androidx.fragment.app.y;
import java.util.List;
import kotlin.text.StringsKt;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes4.dex */
public final class cxl {
    public final PlaylistScreenActivity a;
    public final y b;
    public final PlaybackScope c;
    public final ayl d;
    public final boolean e;
    public final kxi f;
    public final jyr g;
    public final jyr h;
    public final jyr i;

    public cxl(PlaylistScreenActivity playlistScreenActivity, y yVar, PlaybackScope playbackScope, ayl aylVar, boolean z, kxi kxiVar) {
        playlistScreenActivity.getClass();
        yVar.getClass();
        playbackScope.getClass();
        this.a = playlistScreenActivity;
        this.b = yVar;
        this.c = playbackScope;
        this.d = aylVar;
        this.e = z;
        this.f = kxiVar;
        bdt I = hag.I(e.class);
        l18 l18Var = l18.b;
        this.g = l18Var.b(I, true);
        this.h = l18Var.b(hag.I(z5l.class), true);
        this.i = l18Var.b(hag.I(dy7.class), true);
    }

    public final void a(cvl cvlVar, List list) {
        cvlVar.getClass();
        PlaylistScreenActivity playlistScreenActivity = this.a;
        playlistScreenActivity.getClass();
        PlaybackScope playbackScope = this.c;
        playbackScope.getClass();
        y supportFragmentManager = playlistScreenActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        kxi kxiVar = this.f;
        vrl vrlVar = new vrl(cvlVar, playlistScreenActivity, supportFragmentManager, kxiVar, playbackScope, this.e);
        pkb pkbVar = pkb.Playlist;
        String e = cvlVar.e();
        cvo cvoVar = cvo.i;
        qe3 qe3Var = new qe3(kxiVar, o6m.b(wjb.BottomsheetScreen, new avo(pkbVar, e), 2));
        sai saiVar = new sai(false);
        dn9 dn9Var = new dn9(cvlVar, list, vrlVar, qe3Var, saiVar);
        y supportFragmentManager2 = playlistScreenActivity.getSupportFragmentManager();
        supportFragmentManager2.getClass();
        e3s.X(o6m.b(wjb.EntityActionsScreen, new avo(pkbVar, bfg.J(cvlVar).f), 2), supportFragmentManager2, null, saiVar, null, new wn5(new gab(23, dn9Var, pd.t(new qzm[0])), -1064599159, true), 52);
    }

    public final void b(cvl cvlVar, List list) {
        p0p p0pVar;
        cvlVar.getClass();
        list.getClass();
        PlaylistScreenActivity playlistScreenActivity = this.a;
        int i = SearchActivity.Z;
        c0p x = rvf.x(playlistScreenActivity.l().J());
        if (!ivf.I(cvlVar)) {
            l18 l18Var = l18.b;
            bdt I = hag.I(y8s.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            y8s y8sVar = (y8s) qdcVar.C(I);
            String f = cvlVar.f();
            f.getClass();
            y8sVar.e.put(f, list);
        }
        Intent intent = new Intent(playlistScreenActivity, (Class<?>) SearchActivity.class);
        int ordinal = ((cvlVar.d() && ivf.I(cvlVar)) ? lvl.a : cvlVar.B != 0 ? lvl.b : "414787002:1076".equals(cvlVar.e()) ? lvl.c : ivf.I(cvlVar) ? lvl.d : lvl.e).ordinal();
        if (ordinal == 0) {
            p0pVar = p0p.b;
        } else if (ordinal == 1) {
            p0pVar = p0p.c;
        } else if (ordinal == 2) {
            p0pVar = p0p.f;
        } else if (ordinal == 3) {
            p0pVar = p0p.d;
        } else {
            if (ordinal != 4) {
                b6e.s();
                return;
            }
            p0pVar = p0p.e;
        }
        intent.putExtra("extra.for.entity.search", new m5p(cvlVar, p0pVar, x));
        playlistScreenActivity.startActivity(intent);
    }

    public final void c(String str) {
        y supportFragmentManager = this.a.getSupportFragmentManager();
        supportFragmentManager.getClass();
        mvn.T(supportFragmentManager, l5t.d, str, true, this.f, null);
    }

    public final c d(cvl cvlVar, String str) {
        bd5 zc5Var = (str == null || StringsKt.U(str)) ? new zc5(cvlVar.c.a, cvlVar.a) : new ad5(cvlVar.c.a, cvlVar.a, str);
        e eVar = (e) this.g.getValue();
        p3q p3qVar = new p3q(zc5Var, o3q.b, new n3q(cvlVar.b));
        eVar.getClass();
        return e.g(this.c, p3qVar);
    }
}
