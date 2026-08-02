package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsNextCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes4.dex */
public final class rhq implements ag5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rhq(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        b6v B0;
        int i = this.a;
        mqsVar.getClass();
        switch (i) {
            case 0:
                mhq mhqVar = ((shq) this.b).a;
                qkl qklVar = (qkl) this.c;
                mhqVar.getClass();
                qkl a = mhqVar.a(qklVar, mqsVar);
                hjl hjlVar = mhqVar.b;
                wjb wjbVar = wjb.BottomsheetScreen;
                gjl gjlVar = a.a;
                hjl.b(hjlVar, wjbVar, gjlVar.a, a.b, gjlVar.b, 16);
                lhq lhqVar = mhqVar.a;
                int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else if (mqsVar.i() != null) {
                    }
                }
                zus zusVar = new zus(0);
                b6v b6vVar = new b6v(new m3q(new cd5(t75.c(mqsVar.a)), ryt.a));
                ve veVar = new ve(muo.BIG_PLAYER, zqt.d);
                qnq qnqVar = lhqVar.a;
                hn5 hn5Var = qnqVar.b;
                y yVar = qnqVar.a;
                kxi kxiVar = qnqVar.d;
                a aVar = PlaybackScope.a;
                aVar.getClass();
                rre.Z(mqsVar, zusVar, b6vVar, veVar, hn5Var, yVar, kxiVar, aVar, null, null, null, 1792);
                break;
            default:
                h5t h5tVar = (h5t) this.b;
                Object value = h5tVar.a.v.a.getValue();
                a6t a6tVar = value instanceof a6t ? (a6t) value : null;
                if (a6tVar != null) {
                    tao taoVar = h5tVar.b;
                    ybb ybbVar = a6tVar.c;
                    ybbVar.getClass();
                    if (!(ybbVar instanceof l20)) {
                        if (!(ybbVar instanceof fm1)) {
                            if (!(ybbVar instanceof o3m)) {
                                if (!(ybbVar instanceof u1t)) {
                                    b6e.s();
                                    break;
                                } else {
                                    B0 = y5g.B0(mqsVar, ryt.a);
                                }
                            } else {
                                B0 = new b6v(y5g.x0(((o3m) ybbVar).b, o3q.b));
                            }
                        } else {
                            B0 = y5g.t0(((fm1) ybbVar).b, k3q.a);
                        }
                    } else {
                        B0 = y5g.s0(((l20) ybbVar).b, i3q.a);
                    }
                    zus zusVar2 = zus.b;
                    ve veVar2 = new ve(muo.TRAILER, zqt.d);
                    Context context = (Context) taoVar.a;
                    y yVar2 = (y) taoVar.b;
                    kxi kxiVar2 = (kxi) taoVar.c;
                    a aVar2 = PlaybackScope.a;
                    aVar2.getClass();
                    rre.Z(mqsVar, zusVar2, B0, veVar2, context, yVar2, kxiVar2, aVar2, null, null, null, 1792);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        mqs mqsVar2;
        boolean z;
        kxi kxiVar;
        Pair pair;
        Pair pair2;
        int i = this.a;
        mqsVar.getClass();
        switch (i) {
            case 0:
                mhq mhqVar = ((shq) this.b).a;
                qkl qklVar = (qkl) this.c;
                mhqVar.getClass();
                String t = weo.t();
                qkl a = mhqVar.a(qklVar, mqsVar);
                hjl hjlVar = mhqVar.b;
                thj thjVar = a.b;
                gjl gjlVar = a.a;
                pkl pklVar = gjlVar.a;
                int i2 = gjlVar.b;
                hjlVar.getClass();
                t.getClass();
                pklVar.getClass();
                String str = (String) hjlVar.e.get(thjVar.b);
                if (str == null) {
                    str = "";
                }
                hjlVar.d.l(t, hjlVar.a, (u0s) hjlVar.f.getValue(), pklVar.d(), i2, str, pklVar.d, thjVar, null, "");
                lhq lhqVar = mhqVar.a;
                l18 l18Var = l18.b;
                bdt I = hag.I(e.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                a aVar = PlaybackScope.a;
                aVar.getClass();
                String a2 = aVar.h().a();
                qnq qnqVar = lhqVar.a;
                jzs jzsVar = new jzs(mqsVar, new v80(a2, new gxc(qnqVar.d.a.G(), t), qnqVar.d.b), null, null, null, null, new b6v(new m3q(new cd5(t75.c(mqsVar.a)), ryt.a)), false);
                bdt I2 = hag.I(k1l.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                ((k1l) qdcVar2.C(I2)).b(new eyk(u75.h(new AddPlayablesAsNextCommand(t75.c(jzsVar)), new SkipCommand(), new PlayCommand(false))), new b3t("core_play"));
                break;
            default:
                e6t e6tVar = ((h5t) this.b).a;
                mqs mqsVar3 = (mqs) this.c;
                kxi kxiVar2 = e6tVar.m;
                ybb ybbVar = e6tVar.w;
                if (ybbVar != null) {
                    String t2 = weo.t();
                    b5t G = e6tVar.G();
                    a6l a3 = kxiVar2.a(t2);
                    G.getClass();
                    z4c.b.l(null);
                    l18 l18Var2 = l18.b;
                    bdt I3 = hag.I(byb.class);
                    qdc qdcVar3 = l18Var2.a;
                    qdcVar3.getClass();
                    if (((a4q) ((byb) qdcVar3.C(I3)).c(ern.a(a4q.class))).h()) {
                        g0l g0lVar = G.d;
                        jcr jcrVar = new jcr(mqsVar3);
                        String str2 = mqsVar3.a;
                        ArrayList b = ybbVar.b();
                        Iterator it = ybbVar.a().iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                            } else if (!Intrinsics.d(((h0r) it.next()).a.a, str2)) {
                                i3++;
                            }
                        }
                        int i4 = i3 < 0 ? 0 : i3;
                        wjb wjbVar = wjb.TrailerScreen;
                        hlb hlbVar = hlb.Bottomsheet;
                        pkb pkbVar = pkb.Trailer;
                        if (ybbVar instanceof l20) {
                            kxiVar = kxiVar2;
                            pair2 = new Pair(pkb.Album, ((l20) ybbVar).b.a);
                        } else {
                            kxiVar = kxiVar2;
                            if (!(ybbVar instanceof fm1)) {
                                if (!(ybbVar instanceof o3m)) {
                                    if (!(ybbVar instanceof u1t)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        pair = new Pair(pkb.Track, ((u1t) ybbVar).b.a.a);
                                    }
                                } else {
                                    pair = new Pair(pkb.Playlist, ((o3m) ybbVar).b.d().d());
                                }
                            } else {
                                pair = new Pair(pkb.Artist, ((fm1) ybbVar).b.a);
                            }
                            pair2 = pair;
                        }
                        cvo cvoVar = new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, new avo(pkbVar, ouj.o(b5t.h(ybbVar), StringUtils.PROCESS_POSTFIX_DELIMITER, (String) pair2.b)), 44);
                        int size = ybbVar.a().size();
                        str2.getClass();
                        g0l.p(g0lVar, jcrVar, b, b5t.f(ybbVar), kxiVar, new u5l(cvoVar, new lab(1, 2, size, "SMART_PREVIEW", str2), new thj(pkb.SmartPreview, str2, 1, i4 + 1, ""), null), hrg.q("mobile-trailer-", b5t.h(ybbVar), "-default"), null, new u4t(G, 0), 448);
                        mqsVar2 = mqsVar3;
                        z = false;
                    } else {
                        c j = e.j(ybbVar);
                        boolean c = G.b.c(j, mqsVar3, true);
                        z5l z5lVar = G.b;
                        if (c) {
                            z = z5lVar.i(true);
                            mqsVar2 = mqsVar3;
                        } else {
                            mqsVar2 = mqsVar3;
                            z5l.g(z5lVar, j, a3, null, mqsVar3, 0, 2, hyn.f, null, null, new qs(ybbVar, null, 11), 19796).k(new v4t(G, 0));
                            z = true;
                        }
                    }
                    if (z) {
                        e6tVar.a(new zzq(10, e6tVar, mqsVar2, t2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.ag5
    public final void e(Context context, mqs mqsVar) {
        int i = this.a;
        context.getClass();
        mqsVar.getClass();
        switch (i) {
            case 0:
                break;
            default:
                ((ty7) l18.b.c(hag.I(ty7.class))).invoke(context, mqsVar);
                break;
        }
    }
}
