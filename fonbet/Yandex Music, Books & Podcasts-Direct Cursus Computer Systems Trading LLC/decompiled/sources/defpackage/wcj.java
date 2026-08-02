package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.pulse.metrics.o;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class wcj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wcj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        yci yciVar;
        int i3 = 10;
        int i4 = 6;
        int i5 = 12;
        Continuation continuation = null;
        int i6 = 2;
        int i7 = 3;
        switch (this.a) {
            case 0:
                qcj qcjVar = (qcj) this.b;
                m9j m9jVar = (m9j) this.c;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                y7g.b(qcjVar, m9jVar, hq5Var, 0);
            case 1:
                ((Integer) obj2).getClass();
                y7g.b((qcj) this.b, (Function0) this.c, (hq5) obj, rvf.R(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ezf.d((fvf) this.b, (Function0) this.c, (hq5) obj, rvf.R(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                p6g.f((ewj) this.b, (rvj) this.c, (hq5) obj, rvf.R(1));
                break;
            case 4:
                qzj qzjVar = (qzj) this.b;
                wnd wndVar = (wnd) this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    mzj mzjVar = qzjVar.a;
                    String str = mzjVar.c;
                    String str2 = mzjVar.b;
                    boolean z = mzjVar.d;
                    int i8 = mzjVar.e;
                    boolean f = oq5Var2.f(qzjVar) | oq5Var2.f(wndVar);
                    Object K = oq5Var2.K();
                    if (f || K == gq5.a) {
                        K = new ozj(qzjVar, wndVar);
                        oq5Var2.k0(K);
                    }
                    neg.b(str, (ozj) K, null, str2, z, i8, oq5Var2, 0, 4);
                } else {
                    oq5Var2.S();
                }
                break;
            case 5:
                tck tckVar = (tck) this.b;
                q21 q21Var = (q21) this.c;
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean f2 = oq5Var3.f(tckVar) | oq5Var3.f(q21Var);
                    Object K2 = oq5Var3.K();
                    if (f2 || K2 == gq5.a) {
                        K2 = new kck(tckVar, q21Var);
                        oq5Var3.k0(K2);
                    }
                    y5g.g((kck) K2, null, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                y5g.g((kck) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 7:
                kck kckVar = (kck) this.b;
                pck pckVar = (pck) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                str3.getClass();
                kckVar.getClass();
                str3.getClass();
                tck tckVar2 = kckVar.a;
                tckVar2.e.h(new d70(tckVar2.g.a.a, c70.c, pckVar.a, 0, str3), booleanValue);
                break;
            case 8:
                qo6 qo6Var = (qo6) this.b;
                plv plvVar = (plv) this.c;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    switch (qo6Var.ordinal()) {
                        case 0:
                        case 9:
                            i2 = R.drawable.ic_track_24;
                            float f3 = 24;
                            p1g.v(i2, o5g.I(new yov(new n38(f3)), f3), plvVar, false, oq5Var4, 0, 8);
                            break;
                        case 1:
                            i = R.drawable.ic_album_24;
                            i2 = i;
                            float f32 = 24;
                            p1g.v(i2, o5g.I(new yov(new n38(f32)), f32), plvVar, false, oq5Var4, 0, 8);
                            break;
                        case 2:
                        case 5:
                        case 10:
                        case 12:
                        case 14:
                            i2 = 0;
                            float f322 = 24;
                            p1g.v(i2, o5g.I(new yov(new n38(f322)), f322), plvVar, false, oq5Var4, 0, 8);
                            break;
                        case 3:
                            i = R.drawable.ic_artist_24;
                            i2 = i;
                            float f3222 = 24;
                            p1g.v(i2, o5g.I(new yov(new n38(f3222)), f3222), plvVar, false, oq5Var4, 0, 8);
                            break;
                        case 4:
                            i = R.drawable.ic_playlist_24;
                            i2 = i;
                            float f32222 = 24;
                            p1g.v(i2, o5g.I(new yov(new n38(f32222)), f32222), plvVar, false, oq5Var4, 0, 8);
                            break;
                        case 6:
                            i = R.drawable.ic_ticket_24;
                            i2 = i;
                            float f322222 = 24;
                            p1g.v(i2, o5g.I(new yov(new n38(f322222)), f322222), plvVar, false, oq5Var4, 0, 8);
                            break;
                        case 7:
                            i = R.drawable.ic_podcast_and_book_24;
                            i2 = i;
                            float f3222222 = 24;
                            p1g.v(i2, o5g.I(new yov(new n38(f3222222)), f3222222), plvVar, false, oq5Var4, 0, 8);
                            break;
                        case 8:
                        case 13:
                            i2 = R.drawable.ic_radio_24;
                            float f32222222 = 24;
                            p1g.v(i2, o5g.I(new yov(new n38(f32222222)), f32222222), plvVar, false, oq5Var4, 0, 8);
                            break;
                        case 11:
                            i = R.drawable.ic_clip_24;
                            i2 = i;
                            float f322222222 = 24;
                            p1g.v(i2, o5g.I(new yov(new n38(f322222222)), f322222222), plvVar, false, oq5Var4, 0, 8);
                            break;
                        default:
                            b6e.s();
                            break;
                    }
                } else {
                    oq5Var4.S();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                y9l.d((a3v) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 10:
                ComposeView composeView = (ComposeView) this.b;
                jdl jdlVar = (jdl) this.c;
                hq5 hq5Var5 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                ddl ddlVar = jdl.G;
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    dzf viewLifecycleOwner = jdlVar.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
                    pd.b(new qzm[]{npg.d.o(0, oq5Var5)}, false, ild.C(2101904219, new ykf(21, jdlVar), oq5Var5), oq5Var5, 392, 2);
                } else {
                    oq5Var5.S();
                }
                break;
            case 11:
                evj evjVar = (evj) this.b;
                ce5 ce5Var = (ce5) this.c;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                ((gnq) obj2).getClass();
                pvfVar.a(new String[]{"LOCAL_PLAYER_WAVE_BUTTON"}, new zjl(ce5Var, 0));
                pvfVar.a(new String[]{"PLAYER_SIMILAR_TRACKS"}, new zjl(ce5Var, 4));
                pvfVar.a(new String[]{"LOCAL_PLAYER_MAIN_SETTINGS_BUTTONS"}, new zjl(ce5Var, 5));
                pvfVar.a(new String[]{"PLAYER_SETTINGS_BUTTONS_MUSIC"}, new zjl(ce5Var, i4));
                pvfVar.a(new String[]{"PLAYER_SETTINGS_BUTTONS_NON_MUSIC"}, new zjl(ce5Var, 7));
                pvfVar.a(new String[]{"PLAYER_ADD_TO_PLAYLIST"}, new zjl(ce5Var, 8));
                pvfVar.a(new String[]{"PLAYER_ARTISTS_INFO"}, new zjl(ce5Var, 9));
                pvfVar.a(new String[]{"PLAYER_ARTISTS_CONCERTS"}, new zjl(ce5Var, i3));
                pvfVar.a(new String[]{"PLAYER_ABOUT_PODCAST_EPISODE"}, new zjl(ce5Var, 11));
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (((wer) ((byb) qdcVar.C(I)).c(ern.a(wer.class))).h()) {
                    pvfVar.a(new String[]{"STATIC_DIV"}, new ufl(11));
                }
                pvfVar.a(new String[]{"PLAYER_ABOUT_PODCAST"}, new zjl(ce5Var, 1));
                pvfVar.a(new String[]{"PLAYER_ABOUT_BOOK"}, new zjl(ce5Var, i6));
                if (evjVar.a) {
                    pvfVar.a(new String[]{"TRACK_SIMILAR_ENTITIES"}, new zjl(ce5Var, i7));
                }
                break;
            case 12:
                lwl lwlVar = (lwl) this.b;
                e9g e9gVar = (e9g) this.c;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                String str4 = lwlVar.a;
                qo6 qo6Var2 = qo6.e;
                irf.y(str4, qo6Var2, d.m(vci.a, lsq.s(e9gVar)), false, false, null, null, lsq.r(e9gVar, qo6Var2, hq5Var6, 48), hq5Var6, 48, 120);
            case 13:
                lwl lwlVar2 = (lwl) this.b;
                ges gesVar = (ges) this.c;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var7;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                vci vciVar = vci.a;
                yci d = d.d(vciVar, 1.0f);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var7, 0);
                oq5 oq5Var8 = (oq5) hq5Var7;
                int i9 = oq5Var8.P;
                a l = oq5Var8.l();
                yci H = vnj.H(hq5Var7, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar);
                } else {
                    oq5Var8.n0();
                }
                g0g.U(hq5Var7, a, wp5.f);
                g0g.U(hq5Var7, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var8, i9, kb5Var);
                }
                g0g.U(hq5Var7, H, wp5.d);
                String str5 = lwlVar2.b;
                String str6 = lwlVar2.e;
                agr agrVar = eq0.a;
                oq5 oq5Var9 = (oq5) hq5Var7;
                xv7.j(str5, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "playlist_list_item_title"), ((dq0) oq5Var9.j(agrVar)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, gesVar, hq5Var7, 48, 3120, 55288);
                yme ymeVar = new yme(new psk(4, v7g.z(16), v7g.z(16)), ild.C(105395047, new tik(i6, lwlVar2), hq5Var7));
                w3g w3gVar = lwlVar2.d;
                StringBuilder sb = new StringBuilder();
                if (w3gVar != null) {
                    sb.append(w3gVar.b);
                    sb.append(", ");
                }
                sb.append(str6);
                String sb2 = sb.toString();
                u1g.l(hq5Var7, d.e(vciVar, mu0.a));
                kn0 kn0Var = new kn0();
                if (w3gVar != null) {
                    u2x.s(kn0Var, "like");
                    kn0Var.d(w3gVar.a);
                    kn0Var.d(" · ");
                }
                kn0Var.d(str6);
                mn0 h = kn0Var.h();
                Map b = tah.b(new Pair("like", ymeVar));
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ges i10 = nu0.i();
                long j = ((dq0) oq5Var9.j(agrVar)).b.b;
                yci a2 = androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "playlist_list_description");
                boolean f4 = oq5Var8.f(sb2);
                Object K3 = oq5Var8.K();
                if (f4 || K3 == gq5.a) {
                    K3 = new q1h(sb2, 13);
                    oq5Var8.k0(K3);
                }
                xv7.i(h, nfp.b(a2, false, (Function1) K3), j, 0L, 0L, 0, 0L, 2, false, 1, 0, b, null, i10, null, null, hq5Var7, 0, 3120, 874488);
                oq5Var8.p(true);
                break;
            case 14:
                ((Integer) obj2).getClass();
                g0g.f((cyl) this.b, (tmb) this.c, (hq5) obj, rvf.R(65));
                break;
            case 15:
                ((Integer) obj2).getClass();
                gut.c((lf5) this.b, (a3m) this.c, (hq5) obj, rvf.R(1));
                break;
            case 16:
                m4m m4mVar = (m4m) this.b;
                ime imeVar = (ime) this.c;
                hq5 hq5Var8 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var8;
                if (oq5Var10.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean f5 = oq5Var10.f(m4mVar) | oq5Var10.f(imeVar);
                    Object K4 = oq5Var10.K();
                    if (f5 || K4 == gq5.a) {
                        K4 = new n4m(m4mVar, imeVar);
                        oq5Var10.k0(K4);
                    }
                    s7g.f((n4m) K4, null, oq5Var10, 0);
                } else {
                    oq5Var10.S();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                s7g.f((n4m) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                o8g.d((qzc) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 19:
                rbm rbmVar = (rbm) this.b;
                Function0 function0 = (Function0) this.c;
                hq5 hq5Var9 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                kjn kjnVar = gq5.a;
                oq5 oq5Var11 = (oq5) hq5Var9;
                if (oq5Var11.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    laa laaVar = (laa) szf.Q((vdr) rbmVar.a.l, oq5Var11).getValue();
                    boolean h2 = oq5Var11.h(rbmVar);
                    Object K5 = oq5Var11.K();
                    if (h2 || K5 == kjnVar) {
                        ayl aylVar = new ayl(0, rbmVar, rbm.class, "onDownloadClick", "onDownloadClick()V", 0, 12);
                        oq5Var11.k0(aylVar);
                        K5 = aylVar;
                    }
                    etn.r(laaVar, (Function0) ((h9f) K5), function0, false, null, 0, oq5Var11, 0, 56);
                    ce5 ce5Var2 = rbmVar.a;
                    boolean booleanValue2 = ((Boolean) szf.Q((vdr) ce5Var2.j, oq5Var11).getValue()).booleanValue();
                    int intValue7 = ((Number) szf.Q((vdr) ce5Var2.k, oq5Var11).getValue()).intValue();
                    boolean h3 = oq5Var11.h(rbmVar);
                    Object K6 = oq5Var11.K();
                    if (h3 || K6 == kjnVar) {
                        ayl aylVar2 = new ayl(0, rbmVar, rbm.class, "onLikeClick", "onLikeClick()V", 0, 13);
                        oq5Var11.k0(aylVar2);
                        K6 = aylVar2;
                    }
                    cb0.a(booleanValue2, intValue7, function0, (Function0) ((h9f) K6), false, false, false, null, null, 0, oq5Var11, 0, 1008);
                    boolean booleanValue3 = ((Boolean) szf.Q((vdr) ce5Var2.i, oq5Var11).getValue()).booleanValue();
                    boolean h4 = oq5Var11.h(rbmVar);
                    Object K7 = oq5Var11.K();
                    if (h4 || K7 == kjnVar) {
                        ayl aylVar3 = new ayl(0, rbmVar, rbm.class, "onPlayClick", "onPlayClick()V", 0, 14);
                        oq5Var11.k0(aylVar3);
                        K7 = aylVar3;
                    }
                    y5g.h(booleanValue3, function0, (Function0) ((h9f) K7), false, false, oq5Var11, 0, 24);
                } else {
                    oq5Var11.S();
                }
                break;
            case 20:
                xbm xbmVar = (xbm) this.b;
                jbm jbmVar = (jbm) this.c;
                hq5 hq5Var10 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                kjn kjnVar2 = gq5.a;
                oq5 oq5Var12 = (oq5) hq5Var10;
                if (oq5Var12.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    vci vciVar2 = vci.a;
                    yci c = d.c(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var12), 7), 1.0f);
                    kfh d2 = ug3.d(b2c.b, false);
                    int i11 = oq5Var12.P;
                    a l2 = oq5Var12.l();
                    yci H2 = vnj.H(oq5Var12, c);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var12.d0();
                    if (oq5Var12.O) {
                        oq5Var12.k(grbVar2);
                    } else {
                        oq5Var12.n0();
                    }
                    g0g.U(oq5Var12, d2, wp5.f);
                    g0g.U(oq5Var12, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i11))) {
                        ouj.x(i11, oq5Var12, i11, kb5Var2);
                    }
                    g0g.U(oq5Var12, H2, wp5.d);
                    ivf.q(xbmVar.a, rvf.M(R.string.album_not_available, oq5Var12), R.drawable.ic_podcast_and_book_24, b.a.a(vciVar2, b2c.f), null, oq5Var12, 0, 16);
                    boolean h5 = oq5Var12.h(jbmVar);
                    Object K8 = oq5Var12.K();
                    if (h5 || K8 == kjnVar2) {
                        ayl aylVar4 = new ayl(0, jbmVar, jbm.class, "onBackClick", "onBackClick()V", 0, 29);
                        oq5Var12.k0(aylVar4);
                        K8 = aylVar4;
                    }
                    h9f h9fVar = (h9f) K8;
                    boolean h6 = oq5Var12.h(jbmVar);
                    Object K9 = oq5Var12.K();
                    if (h6 || K9 == kjnVar2) {
                        K9 = new ebm(0, jbmVar, jbm.class, "onSearchClick", "onSearchClick()V", 0, 0);
                        oq5Var12.k0(K9);
                    }
                    h9f h9fVar2 = (h9f) K9;
                    boolean h7 = oq5Var12.h(jbmVar);
                    Object K10 = oq5Var12.K();
                    if (h7 || K10 == kjnVar2) {
                        ebm ebmVar = new ebm(0, jbmVar, jbm.class, "onOverflowClick", "onOverflowClick()V", 0, 1);
                        oq5Var12.k0(ebmVar);
                        K10 = ebmVar;
                    }
                    t7g.h(gut.p1(vciVar2), (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K10), oq5Var12, 0, 0);
                    oq5Var12.p(true);
                } else {
                    oq5Var12.S();
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                a0g.l((ojm) this.b, (bci) this.c, (hq5) obj, rvf.R(65));
                break;
            case 22:
                ((Integer) obj2).getClass();
                g0g.h((rjm) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 23:
                kv4 kv4Var = (kv4) this.b;
                String str7 = (String) this.c;
                hq5 hq5Var11 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                kjn kjnVar3 = gq5.a;
                oq5 oq5Var13 = (oq5) hq5Var11;
                if (oq5Var13.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    yci yciVar2 = vci.a;
                    float f6 = 24;
                    yci m = d.m(yciVar2, f6);
                    kfh d3 = ug3.d(b2c.b, false);
                    int i12 = oq5Var13.P;
                    a l3 = oq5Var13.l();
                    yci H3 = vnj.H(oq5Var13, m);
                    xp5.T.getClass();
                    grb grbVar3 = wp5.b;
                    oq5Var13.d0();
                    if (oq5Var13.O) {
                        oq5Var13.k(grbVar3);
                    } else {
                        oq5Var13.n0();
                    }
                    g0g.U(oq5Var13, d3, wp5.f);
                    g0g.U(oq5Var13, l3, wp5.e);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i12))) {
                        ouj.x(i12, oq5Var13, i12, kb5Var3);
                    }
                    g0g.U(oq5Var13, H3, wp5.d);
                    boolean booleanValue4 = ((Boolean) kv4Var.invoke(oq5Var13, 0)).booleanValue();
                    w4k E = a0g.E(R.drawable.ic_profile_24, 0, oq5Var13);
                    String M = rvf.M(R.string.profile_title, oq5Var13);
                    long j2 = ((dq0) oq5Var13.j(eq0.a)).a.a;
                    oq5Var13.Z(-283715360);
                    boolean g = oq5Var13.g(booleanValue4) | oq5Var13.f(str7);
                    Object K11 = oq5Var13.K();
                    if (g || K11 == kjnVar3) {
                        K11 = new ag3(booleanValue4, str7, i7);
                        oq5Var13.k0(K11);
                    }
                    yci b2 = nfp.b(yciVar2, false, (Function1) K11);
                    if (booleanValue4) {
                        float f7 = 8;
                        Object K12 = oq5Var13.K();
                        if (K12 == kjnVar3) {
                            K12 = new gkm(i7);
                            oq5Var13.k0(K12);
                        }
                        yciVar2 = xee.w(yciVar2, f6, f7, false, gar.a, (Function1) K12);
                        yciVar = yciVar2;
                    } else {
                        yciVar = yciVar2;
                    }
                    yci f8 = b2.f(yciVar2);
                    oq5Var13.p(false);
                    gae.b(E, M, f8, j2, oq5Var13, 0, 0);
                    if (booleanValue4) {
                        oq5Var13.Z(-204843805);
                        float f9 = 12;
                        ug3.a(androidx.compose.foundation.a.b(androidx.compose.ui.platform.a.a(d.m(androidx.compose.foundation.layout.a.j(yciVar, f9, -4), f9), "badge"), kg5.r(R.color.avatar_alert_red, oq5Var13), ugo.a), oq5Var13, 0);
                    } else {
                        oq5Var13.Z(-207478247);
                    }
                    oq5Var13.p(false);
                    oq5Var13.p(true);
                } else {
                    oq5Var13.S();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                gdg.l((com.yandex.music.payment.screen.promocode.viewmodel.a) this.b, (yci) this.c, (hq5) obj, rvf.R(49));
                break;
            case 25:
                jxm jxmVar = (jxm) this.b;
                f4m f4mVar = (f4m) this.c;
                hq5 hq5Var12 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var12;
                if (oq5Var14.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean f10 = oq5Var14.f(jxmVar) | oq5Var14.f(f4mVar);
                    Object K13 = oq5Var14.K();
                    if (f10 || K13 == gq5.a) {
                        K13 = new ixm(jxmVar, f4mVar);
                        oq5Var14.k0(K13);
                    }
                    ldg.c((ixm) K13, null, 0, 0, oq5Var14, 0);
                } else {
                    oq5Var14.S();
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                x2n.a((m) this.b, (yci) this.c, (hq5) obj, rvf.R(49));
                break;
            case 27:
                ((Integer) obj2).getClass();
                y2n.d((ygk) this.b, (Function0) this.c, (hq5) obj, rvf.R(1));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Function1 function1 = (Function1) this.b;
                uft uftVar = (uft) this.c;
                hq5 hq5Var13 = (hq5) obj;
                int intValue11 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var13;
                if (oq5Var15.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    yci q = androidx.compose.foundation.layout.a.q(d.t(vci.a, 96, 0.0f, 2), 8, 0.0f, 0.0f, 0.0f, 14);
                    String M2 = rvf.M(R.string.quality_settings_list_subscribe_button, oq5Var15);
                    ges j3 = nu0.j();
                    float f11 = 13;
                    float f12 = 10;
                    q0k q0kVar = new q0k(f11, f12, f11, f12);
                    float f13 = 40;
                    boolean f14 = oq5Var15.f(function1) | oq5Var15.d(uftVar.ordinal());
                    Object K14 = oq5Var15.K();
                    if (f14 || K14 == gq5.a) {
                        K14 = new r5n(function1, uftVar, 2);
                        oq5Var15.k0(K14);
                    }
                    y7g.c(M2, (Function0) K14, q, j3, q0kVar, f13, oq5Var15, 221568, 0);
                } else {
                    oq5Var15.S();
                }
                break;
            default:
                g8n g8nVar = (g8n) this.b;
                sfm sfmVar = (sfm) this.c;
                hq5 hq5Var14 = (hq5) obj;
                int intValue12 = ((Integer) obj2).intValue();
                kjn kjnVar4 = gq5.a;
                oq5 oq5Var16 = (oq5) hq5Var14;
                if (oq5Var16.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Unit unit = Unit.a;
                    boolean f15 = oq5Var16.f(g8nVar) | oq5Var16.h(sfmVar);
                    Object K15 = oq5Var16.K();
                    if (f15 || K15 == kjnVar4) {
                        K15 = new c5l(sfmVar, g8nVar, continuation, 19);
                        oq5Var16.k0(K15);
                    }
                    gld.w(oq5Var16, unit, (Function2) K15);
                    ynn i13 = irv.i(oq5Var16);
                    vci vciVar3 = vci.a;
                    boolean f16 = oq5Var16.f(g8nVar);
                    Object K16 = oq5Var16.K();
                    if (f16 || K16 == kjnVar4) {
                        K16 = new ucm(i5, g8nVar);
                        oq5Var16.k0(K16);
                    }
                    yci b3 = com.yandex.music.core.ui.compose.a.b(vciVar3, i13, 0L, 0.0f, null, (Function2) K16, 14);
                    boolean h8 = oq5Var16.h(sfmVar);
                    Object K17 = oq5Var16.K();
                    if (h8 || K17 == kjnVar4) {
                        K17 = new mjm(i4, sfmVar);
                        oq5Var16.k0(K17);
                    }
                    androidx.compose.ui.viewinterop.a.a(0, 4, oq5Var16, b3, (Function1) K17, null);
                } else {
                    oq5Var16.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wcj(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
