package defpackage;

import androidx.fragment.app.t;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.music.shared.playback.utils.api.commands.PrevCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes4.dex */
public final class s2v {
    public final d4v a;
    public final q1v b;
    public final exa c;
    public final kxi d;
    public final Function0 e;
    public final dxr f;
    public final boolean g;
    public final fkn h;
    public final by7 i;

    public s2v(d4v d4vVar, q1v q1vVar, exa exaVar, kxi kxiVar, itu ituVar, dxr dxrVar, boolean z) {
        ituVar.getClass();
        dxrVar.getClass();
        this.a = d4vVar;
        this.b = q1vVar;
        this.c = exaVar;
        this.d = kxiVar;
        this.e = ituVar;
        this.f = dxrVar;
        this.g = z;
        this.h = d4vVar.l;
        this.i = asq.K(d4vVar.n, new t0v(8));
    }

    public final void a(sjb sjbVar) {
        thj thjVar = (thj) this.e.invoke();
        thjVar.getClass();
        exa exaVar = this.c;
        cvo cvoVar = (cvo) exaVar.b.getValue();
        cvoVar.getClass();
        xmb xmbVar = exaVar.c;
        nab nabVar = exaVar.a;
        String str = (String) exaVar.e.get(thjVar.b);
        if (str == null) {
            str = "";
        }
        xmb.b(xmbVar, sjbVar, nabVar, null, cvoVar, 1, str, thjVar, 778);
    }

    public final void b(boolean z) {
        a(z ? sjb.Unlike : sjb.Like);
        xpl xplVar = this.a.k.b;
        x97.y(xplVar.a, null, null, new d7i(xplVar, null, 12), 3);
    }

    public final void c() {
        sjb sjbVar;
        boolean z = this.g;
        d4v d4vVar = this.a;
        if (z) {
            c4v c4vVar = (c4v) d4vVar.m.b.invoke();
            if (c4vVar instanceof z3v) {
                if (!((z3v) c4vVar).a) {
                    this.f.d(this.d, hld.z(this.c, (thj) this.e.invoke(), 1));
                    return;
                }
            } else if (!Intrinsics.d(c4vVar, a4v.a) && !(c4vVar instanceof b4v)) {
                b6e.s();
                return;
            }
        }
        boolean z2 = ((m2v) this.h.a.getValue()).d;
        if (z2) {
            sjbVar = sjb.Pause;
        } else {
            if (z2) {
                b6e.s();
                return;
            }
            sjbVar = sjb.Play;
        }
        a(sjbVar);
        xpl xplVar = d4vVar.k.b;
        xplVar.d = System.currentTimeMillis();
        xplVar.c.a(new ToggleCommand(false), new b3t("core_toggle"));
    }

    public final void d() {
        a(sjb.Backskip);
        this.a.k.a.a.a(PrevCommand.INSTANCE, new b3t("queue_prev"));
    }

    public final void e() {
        a(sjb.Skip);
        this.a.k.a.a.a(new SkipCommand(), new b3t("queue_skip"));
    }

    public final void f() {
        wjb wjbVar;
        q1v q1vVar = this.b;
        t tVar = q1vVar.a;
        Object invoke = this.a.m.b.invoke();
        b4v b4vVar = invoke instanceof b4v ? (b4v) invoke : null;
        if (b4vVar == null) {
            return;
        }
        x2v a = b4vVar.a.b.a.a.a();
        boolean z = a instanceof u2v;
        Function0 function0 = this.e;
        exa exaVar = this.c;
        if (z) {
            hld.D(exaVar, wjb.ArtistScreen, (thj) function0.invoke(), 1);
            List list = ((u2v) a).a;
            list.getClass();
            a aVar = PlaybackScope.a;
            aVar.getClass();
            new m(aVar, new wuu(25), tVar, q1vVar.b, null, 48).y(list, ao1.c);
            return;
        }
        if (!(a instanceof t2v)) {
            if ((a instanceof v2v) || (a instanceof w2v)) {
                return;
            }
            b6e.s();
            return;
        }
        oq oqVar = ((t2v) a).a;
        oqVar.getClass();
        uq uqVar = new uq(oqVar, null, null, null, 124);
        int ordinal = uqVar.c.ordinal();
        if (ordinal == 0) {
            wjbVar = wjb.AlbumScreen;
        } else if (ordinal == 1) {
            wjbVar = wjb.PodcastScreen;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            wjbVar = wjb.AudiobookScreen;
        }
        hld.D(exaVar, wjbVar, (thj) function0.invoke(), 1);
        tVar.startActivity(quj.U(tVar, uqVar, null));
    }

    public final void g() {
        n7q n7qVar;
        d6l x = p6g.x((e6l) this.a.k.c.a.c.getValue());
        mwk b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
        if (b != null) {
            hld.D(this.c, wjb.PlayerScreen, (thj) this.e.invoke(), 1);
            t tVar = this.b.a;
            if (!(b instanceof jzs) && !(b instanceof k4d) && !(b instanceof foc)) {
                if (b instanceof i5u) {
                    jyr jyrVar = VideoClipActivity.y;
                    tVar.startActivity(l3l.e(tVar, null, 6));
                    return;
                } else if (!(b instanceof m1q) && !(b instanceof faq)) {
                    kac.j(b, "Developer Error. Unexpected class for visit ");
                    return;
                }
            }
            ru.yandex.music.player.a aVar = tVar instanceof ru.yandex.music.player.a ? (ru.yandex.music.player.a) tVar : null;
            if (aVar != null) {
                aVar.z();
            }
        }
    }
}
