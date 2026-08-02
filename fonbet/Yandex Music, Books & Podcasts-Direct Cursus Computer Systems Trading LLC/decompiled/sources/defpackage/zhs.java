package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes6.dex */
public final /* synthetic */ class zhs extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zhs(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mqs mqsVar;
        mwk b;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                ((bis) this.receiver).a();
                break;
            case 1:
                ((sai) this.receiver).a();
                break;
            case 2:
                ((nrs) this.receiver).d();
                break;
            case 3:
                ((nrs) this.receiver).d();
                break;
            case 4:
                ((x8f) this.receiver).dismissAllowingStateLoss();
                break;
            case 5:
                ((c6h) this.receiver).w();
                break;
            case 6:
                ((c6h) this.receiver).w();
                break;
            case 7:
                ((c6h) this.receiver).p();
                break;
            case 8:
                ((c6h) this.receiver).j();
                break;
            case 9:
                ((c6h) this.receiver).l();
                break;
            case 10:
                ((c6h) this.receiver).q();
                break;
            case 11:
                ((c6h) this.receiver).e();
                break;
            case 12:
                break;
            case 13:
                ((j1t) this.receiver).g();
                break;
            case 14:
                ((sai) this.receiver).a();
                break;
            case 15:
                g5t g5tVar = (g5t) this.receiver;
                y supportFragmentManager = g5tVar.requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar = new a(supportFragmentManager);
                aVar.m(g5tVar);
                aVar.k(true, true);
                break;
            case 16:
                h5t h5tVar = (h5t) this.receiver;
                e6t e6tVar = h5tVar.a;
                kxi kxiVar = e6tVar.m;
                ybb ybbVar = e6tVar.w;
                if (ybbVar != null) {
                    String t = weo.t();
                    b5t G = e6tVar.G();
                    a6l a = kxiVar.a(t);
                    t4t t4tVar = e6tVar.k;
                    w5l w5lVar = new w5l(t4tVar.e, new jab(qkb.Button, 1, 3, 0), new thj(t4t.c(t4tVar.c), t4tVar.b, 1, 1, ""), null);
                    hcr hcrVar = hcr.a;
                    e eVar = G.c;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (!((a4q) ((byb) qdcVar.C(I)).c(ern.a(a4q.class))).h()) {
                        d6l x = p6g.x((e6l) G.a.d.getValue());
                        n7q n7qVar = x != null ? x.a : null;
                        if (n7qVar == null || (b = n7qVar.b()) == null || (mqsVar = b.a()) == null || !b5t.d(n7qVar, ybbVar) || z4c.b.getValue() != null) {
                            mqsVar = null;
                        }
                        if (!(ybbVar instanceof l20)) {
                            Continuation continuation2 = null;
                            if (!(ybbVar instanceof fm1)) {
                                if (!(ybbVar instanceof o3m)) {
                                    if (!(ybbVar instanceof u1t)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        mqs mqsVar2 = ((u1t) ybbVar).b.a;
                                        ru.yandex.music.common.media.context.a aVar2 = PlaybackScope.a;
                                        aVar2.getClass();
                                        G.e(aVar2.i(), new mui(mqsVar2, null, i2), mqsVar2, a);
                                    }
                                } else {
                                    o3m o3mVar = (o3m) ybbVar;
                                    G.e(d.t().f(o3mVar.b), new w90(G, o3mVar, continuation2, 17), mqsVar, a);
                                }
                            } else {
                                fm1 fm1Var = (fm1) ybbVar;
                                G.e(d.c().e(fm1Var.b), new w90(G, fm1Var, continuation2, 16), mqsVar, a);
                            }
                        } else {
                            l20 l20Var = (l20) ybbVar;
                            G.e(d.a().c(l20Var.b), new w90(G, l20Var, null, 15), null, a);
                        }
                        e6tVar.a(new c6t(e6tVar, t, i2));
                    } else if (!(ybbVar instanceof l20)) {
                        if (!(ybbVar instanceof fm1)) {
                            if (!(ybbVar instanceof o3m)) {
                                if (!(ybbVar instanceof u1t)) {
                                    b6e.s();
                                    break;
                                } else {
                                    mqs mqsVar3 = ((u1t) ybbVar).b.a;
                                    g0l.o(G.d, hcrVar, t75.c(mqsVar3), kxiVar, w5lVar, "mobile-trailer-track-default", new m3q(new cd5(t75.c(mqsVar3.a)), ryt.a), 1472);
                                }
                            } else {
                                g0l.m(G.d, ((o3m) ybbVar).b.d().d(), new jcr((mqs) CollectionsKt.Q(ybbVar.b())), kxiVar, w5lVar, "mobile-trailer-playlist-default", null, null, null, null, 1760);
                            }
                        } else {
                            g0l.h(G.d, ((fm1) ybbVar).b.a, new jcr((mqs) CollectionsKt.Q(ybbVar.b())), kxiVar, w5lVar, "mobile-trailer-artist-default", null, null, null, null, 1760);
                        }
                    } else {
                        g0l.g(G.d, ((l20) ybbVar).b.a, hcrVar, kxiVar, w5lVar, "mobile-trailer-album-default", null, null, null, null, null, 1760);
                    }
                }
                h5tVar.c.invoke();
                break;
            case 17:
                h5t h5tVar2 = (h5t) this.receiver;
                tao taoVar = h5tVar2.b;
                Context context = (Context) taoVar.a;
                e6t e6tVar2 = h5tVar2.a;
                Object value = e6tVar2.v.a.getValue();
                a6t a6tVar = value instanceof a6t ? (a6t) value : null;
                if (a6tVar != null) {
                    e6tVar2.a(new r3s(8, h5tVar2));
                    ybb ybbVar2 = a6tVar.c;
                    if (!(ybbVar2 instanceof l20)) {
                        if (!(ybbVar2 instanceof fm1)) {
                            if (!(ybbVar2 instanceof o3m)) {
                                if (!(ybbVar2 instanceof u1t)) {
                                    b6e.s();
                                    break;
                                }
                            } else {
                                eul eulVar = ((o3m) ybbVar2).b;
                                int i4 = PlaylistScreenActivity.B0;
                                context.startActivity(dxl.h(context, eulVar, null));
                            }
                        } else {
                            u51 u51Var = ((fm1) ybbVar2).b;
                            int i5 = ArtistScreenActivity.w0;
                            context.startActivity(l48.p(context, u51Var, null, null, 24));
                        }
                    } else {
                        lt ltVar = ((l20) ybbVar2).b;
                        int i6 = AlbumScreenActivity.v0;
                        Intent T = leu.T(context, ltVar, null);
                        gj gjVar = (gj) taoVar.e;
                        if (gjVar != null) {
                            T.putExtra("deeplink_target_data", new m6s(gjVar, false));
                        }
                        context.startActivity(T);
                    }
                }
                break;
            case 18:
                e6t e6tVar3 = ((h5t) this.receiver).a;
                ybb ybbVar3 = e6tVar3.w;
                kxi kxiVar2 = e6tVar3.m;
                if (ybbVar3 != null) {
                    String t2 = weo.t();
                    b5t G2 = e6tVar3.G();
                    t4t t4tVar2 = e6tVar3.k;
                    cvo cvoVar = t4tVar2.e;
                    jab jabVar = new jab(qkb.Header, 1, 1, 0);
                    pkb c = t4t.c(t4tVar2.c);
                    String a2 = t4tVar2.a();
                    a2.getClass();
                    if (G2.g(ybbVar3, new w5l(cvoVar, jabVar, new thj(c, a2, 1, 1, ""), null), kxiVar2.a(t2), kxiVar2)) {
                        e6tVar3.a(new c6t(e6tVar3, t2, i3));
                    }
                }
                break;
            case 19:
                h5t h5tVar3 = (h5t) this.receiver;
                Object value2 = h5tVar3.a.v.a.getValue();
                a6t a6tVar2 = value2 instanceof a6t ? (a6t) value2 : null;
                if (a6tVar2 != null) {
                    ybb ybbVar4 = a6tVar2.c;
                    if (ybbVar4 instanceof o3m) {
                        tao taoVar2 = h5tVar3.b;
                        eul eulVar2 = ((o3m) ybbVar4).b;
                        mvp mvpVar = (mvp) ((jyr) taoVar2.d).getValue();
                        pu0 t3 = pd.t(new qzm[0]);
                        y yVar = (y) taoVar2.b;
                        Context context2 = (Context) taoVar2.a;
                        fnb fnbVar = ((kxi) taoVar2.c).a;
                        mvpVar.getClass();
                        yVar.getClass();
                        fnbVar.getClass();
                        String str = eulVar2.e;
                        String str2 = eulVar2.b;
                        if (str2.length() > 0 && !c.v(str2, "FAKE_ID_", false) && str != null) {
                            String str3 = eulVar2.f;
                            String str4 = eulVar2.a;
                            gxp gxpVar = new gxp(str3, str4, str4, eulVar2.b, false, false, str);
                            co6 b2 = op7.b(eulVar2);
                            String str5 = eulVar2.c;
                            String string = context2.getString(R.string.share_playlist_preview_subtitle);
                            string.getClass();
                            zwp zwpVar = new zwp(gxpVar, b2, str5, string);
                            sai saiVar = new sai(false);
                            cvo cvoVar2 = cvo.i;
                            e3s.X(o6m.b(wjb.ShareScreen, null, 6), yVar, "SHARE_BOTTOM_SHEET", saiVar, null, new wn5(new ntb(t3, mvpVar, zwpVar, saiVar, context2, yVar, fnbVar, 4), 1326092232, true), 48);
                        }
                    }
                }
                break;
            case 20:
                Context context3 = ((njt) this.receiver).c.a;
                context3.getClass();
                ((np2) context3).getOnBackPressedDispatcher().d();
                break;
            case 21:
                jkt jktVar = ((njt) this.receiver).d;
                xdr xdrVar = jktVar.g;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                x97.y(jktVar.a, null, null, new hkt(jktVar, continuation, i), 3);
                break;
            case 22:
                x2u x2uVar = (x2u) this.receiver;
                bjt bjtVar = x2uVar.d;
                x1u x1uVar = x2uVar.b;
                x1uVar.getClass();
                ((dda) bjtVar.d).invoke();
                m mVar = (m) bjtVar.b;
                fnb fnbVar2 = ((kxi) bjtVar.c).a;
                fnbVar2.getClass();
                new tao((mvp) ((jyr) mVar.j).getValue(), jf0.C(pd.t(new qzm[0]), (ru0) mVar.f), (y) mVar.e, (Context) mVar.d, fnbVar2, 0).r(x1uVar);
                break;
            case 23:
                x2u x2uVar2 = (x2u) this.receiver;
                bjt bjtVar2 = x2uVar2.d;
                x1u x1uVar2 = x2uVar2.b;
                x1uVar2.getClass();
                m mVar2 = (m) bjtVar2.b;
                ((Function0) mVar2.c).invoke();
                kt6 kt6Var = (kt6) ((jyr) mVar2.i).getValue();
                y yVar2 = (y) mVar2.e;
                pu0 C = jf0.C(pd.t(new qzm[0]), (ru0) mVar2.f);
                kt6Var.getClass();
                yVar2.getClass();
                cvo cvoVar3 = cvo.i;
                e3s.X(o6m.b(wjb.DescriptionScreen, new avo(pkb.Video, x1uVar2.a), 2), yVar2, "VIDEO_CLIP_DIALOG_TAG", new sai(true), null, new wn5(new aqp(10, C, kt6Var, x1uVar2), -1276880312, true), 48);
                break;
            case 24:
                ((y8u) this.receiver).l();
                break;
            case 25:
                ((y8u) this.receiver).m();
                break;
            case 26:
                ((y8u) this.receiver).i();
                break;
            case 27:
                ((y8u) this.receiver).s();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((y8u) this.receiver).u();
                break;
            default:
                ((y8u) this.receiver).k();
                break;
        }
        return Unit.a;
    }
}
