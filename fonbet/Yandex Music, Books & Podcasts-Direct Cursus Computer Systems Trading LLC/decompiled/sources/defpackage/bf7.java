package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.pulse.metrics.o;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.cards.CardsActivity;
import ru.yandex.music.catalog.artist.ArtistItemsActivity;
import ru.yandex.music.catalog.artist.concerts.ArtistConcertsActivity;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.catalog.universalentity.UniversalEntityActivity;
import ru.yandex.music.chart.catalog.ChartActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.concert.ConcertActivity;
import ru.yandex.music.concert.catalog.ConcertCatalogActivity;
import ru.yandex.music.debug.config.DebugConfigActivity;
import ru.yandex.music.history.MusicHistoryScreenActivity;
import ru.yandex.music.landing.autoplaylists.gag.AutoPlaylistGagActivity;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.metatag.album.MetaTagAlbumsActivity;
import ru.yandex.music.metatag.artist.MetaTagArtistsActivity;
import ru.yandex.music.metatag.playlist.MetaTagPlaylistsActivity;
import ru.yandex.music.mixes.MixesScreenActivity;
import ru.yandex.music.novelties.podcasts.PodcastsActivity;
import ru.yandex.music.payment.deeplinkpaymentscreen.DeeplinkPaymentScreenActivity;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.music.paywalloptions.PaywallOptionsActivity;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;
import ru.yandex.music.support.NonInteractiveFeedbackActivity;
import ru.yandex.music.url.schemes.playVibe.EmptyScreenInDeeplinkActivity;
import ru.yandex.music.url.ui.StubActivity;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;
import ru.yandex.music.webview.WebViewScreenActivity;

/* loaded from: classes6.dex */
public final class bf7 implements tft {
    public static final bf7 b = new bf7(0);
    public final /* synthetic */ int a;

    public /* synthetic */ bf7(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:314:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x082d  */
    @Override // defpackage.tft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent p(Context context, Intent intent, kqt kqtVar) {
        c30 c30Var;
        String a;
        e51 D;
        String str;
        Object obj;
        Intent B;
        Parcelable gxlVar;
        m94 m94Var;
        String a2;
        m94 m94Var2;
        String a3;
        gd5 gd5Var;
        int ordinal;
        Object obj2;
        Object obj3;
        char c;
        Intent putExtra;
        gaj gajVar;
        String a4;
        boolean parseBoolean;
        lxl jxlVar;
        switch (this.a) {
            case 0:
                kqtVar.getClass();
                Intent z = StubActivity.z(context, rpt.NOT_FOUND);
                z.getClass();
                return z;
            case 1:
                kqtVar.getClass();
                kqt kqtVar2 = kqtVar.c == 1 ? kqtVar : null;
                if (kqtVar2 != null && (c30Var = (c30) kqtVar2.a) != null && (a = c30Var.a(1)) != null) {
                    og4 og4Var = a.equals("albums") ? lg4.a : a.equals("podcasts") ? ng4.a : null;
                    if (og4Var != null) {
                        int i = ChartActivity.Y;
                        return weo.D(context, og4Var);
                    }
                }
                Intent t = w1g.t(context, intent, kqtVar);
                if (t != null) {
                    return t;
                }
                Intent z2 = StubActivity.z(context, rpt.NOT_FOUND);
                z2.getClass();
                return z2;
            case 2:
                kqtVar.getClass();
                Object obj4 = kqtVar.b;
                int i2 = kqtVar.c;
                u51 u51Var = (u51) obj4;
                ypt yptVar = kqtVar.a;
                im1 im1Var = (im1) yptVar;
                String a5 = im1Var.a(im1Var.b() + 1);
                if (Intrinsics.d(a5, "all")) {
                    ovn ovnVar = e51.b;
                    String a6 = im1Var.a(im1Var.b() + 2);
                    ovnVar.getClass();
                    D = ovn.D(a6);
                } else {
                    e51.b.getClass();
                    D = ovn.D(a5);
                }
                if (i2 != 1 || u51Var == null) {
                    Intent t2 = w1g.t(context, intent, kqtVar);
                    if (t2 != null) {
                        return t2;
                    }
                    Intent z3 = i2 == 5 ? StubActivity.z(context, rpt.NO_ARTIST) : StubActivity.z(context, rpt.NOT_FOUND);
                    z3.getClass();
                    return z3;
                }
                switch (D == null ? -1 : gm1.a[D.ordinal()]) {
                    case -1:
                        int i3 = ArtistScreenActivity.w0;
                        String Q = im1Var.Q("block");
                        if (Q != null) {
                            kh1.b.getClass();
                            Iterator it = kh1.d.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((kh1) obj).a.equals(Q)) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            kh1 kh1Var = (kh1) obj;
                            switch (kh1Var == null ? -1 : gm1.b[kh1Var.ordinal()]) {
                                case -1:
                                    str = Q;
                                    break;
                                case 0:
                                default:
                                    b6e.s();
                                    return null;
                                case 1:
                                    t11[] t11VarArr = t11.a;
                                    Q = "ARTIST_UPCOMING_RELEASE";
                                    str = Q;
                                    break;
                                case 2:
                                    t11[] t11VarArr2 = t11.a;
                                    Q = "ARTIST_POPULAR_TRACKS";
                                    str = Q;
                                    break;
                                case 3:
                                    t11[] t11VarArr3 = t11.a;
                                    Q = "FAMILIAR_YOU";
                                    str = Q;
                                    break;
                                case 4:
                                    t11[] t11VarArr4 = t11.a;
                                    Q = "ARTIST_CONCERTS";
                                    str = Q;
                                    break;
                                case 5:
                                    t11[] t11VarArr5 = t11.a;
                                    Q = "ABOUT_ARTIST";
                                    str = Q;
                                    break;
                                case 6:
                                    t11[] t11VarArr6 = t11.a;
                                    Q = "ARTIST_PICK";
                                    str = Q;
                                    break;
                            }
                        } else {
                            str = null;
                        }
                        Intent putExtra2 = l48.p(context, u51Var, null, str, 8).putExtra("need_permission", im1Var.f);
                        putExtra2.getClass();
                        new dyd(xpt.a(yptVar)).c(putExtra2);
                        return putExtra2;
                    case 0:
                    default:
                        b6e.s();
                        return null;
                    case 1:
                        int i4 = ArtistItemsActivity.Y;
                        return kg5.z(context, u51Var, zb1.a);
                    case 2:
                        int i5 = ArtistConcertsActivity.Y;
                        String str2 = u51Var.a;
                        str2.getClass();
                        Intent putExtra3 = new Intent(context, (Class<?>) ArtistConcertsActivity.class).putExtra("artistConcerts_artistId", str2);
                        putExtra3.getClass();
                        return putExtra3;
                    case 3:
                        int i6 = ArtistItemsActivity.Y;
                        return kg5.z(context, u51Var, zb1.c);
                    case 4:
                        int i7 = ArtistItemsActivity.Y;
                        return kg5.z(context, u51Var, zb1.e);
                    case 5:
                        int i8 = ArtistItemsActivity.Y;
                        return kg5.z(context, u51Var, zb1.d);
                    case 6:
                        int i9 = ArtistItemsActivity.Y;
                        return kg5.z(context, u51Var, zb1.f);
                }
            case 3:
                kqtVar.getClass();
                Intent t3 = w1g.t(context, intent, kqtVar);
                if (t3 != null) {
                    return t3;
                }
                int i10 = CardsActivity.v;
                Object obj5 = kqtVar.b;
                obj5.getClass();
                Intent putExtra4 = new Intent(context, (Class<?>) CardsActivity.class).putExtra("CardsActivity.promoId", (String) obj5);
                putExtra4.getClass();
                return putExtra4;
            case 4:
                Object obj6 = kqtVar.b;
                ypt yptVar2 = kqtVar.a;
                int i11 = kqtVar.c;
                if (((qe4) obj6) == null || i11 != 1) {
                    Intent t4 = w1g.t(context, intent, kqtVar);
                    return t4 != null ? t4 : (i11 == 5 || i11 == 6) ? StubActivity.z(context, rpt.NO_PLAYLIST) : StubActivity.z(context, rpt.NOT_FOUND);
                }
                a aVar = PlaybackScope.a;
                int i12 = PlaylistScreenActivity.B0;
                Intent j = dxl.j(context, fxl.a, cud.a, aVar, null, 112);
                new dyd(xpt.a(yptVar2)).c(j);
                return j.putExtra("need_permission", ((qg4) yptVar2).f);
            case 5:
                kqtVar.getClass();
                g25 g25Var = (g25) kqtVar.b;
                if (kqtVar.c != 1 || g25Var == null) {
                    Intent t5 = w1g.t(context, intent, kqtVar);
                    if (t5 != null) {
                        return t5;
                    }
                    Intent z4 = StubActivity.z(context, rpt.NOT_FOUND);
                    z4.getClass();
                    return z4;
                }
                if (g25Var.equals(e25.a)) {
                    lhs lhsVar = MainScreenActivity.Q0;
                    B = imp.J(context, rf3.l, null, null, 12);
                } else if (g25Var.equals(v15.a)) {
                    int i13 = CollectionMainActivity.v0;
                    B = men.B(context, v35.f);
                } else if (g25Var.equals(f25.a)) {
                    int i14 = CollectionMainActivity.v0;
                    B = men.B(context, v35.g);
                } else if (g25Var.equals(w15.a)) {
                    int i15 = CollectionMainActivity.v0;
                    B = men.B(context, v35.h);
                } else if (g25Var.equals(d25.a)) {
                    int i16 = CollectionMainActivity.v0;
                    B = men.B(context, v35.k);
                } else if (g25Var.equals(x15.a)) {
                    int i17 = CollectionMainActivity.v0;
                    B = men.B(context, v35.j);
                } else if (g25Var.equals(y15.a)) {
                    lhs lhsVar2 = MainScreenActivity.Q0;
                    B = imp.J(context, rf3.l, null, w6h.a, 4);
                } else if (g25Var instanceof z15) {
                    lhs lhsVar3 = MainScreenActivity.Q0;
                    x6h x6hVar = x6h.a;
                    cvl cvlVar = ((z15) g25Var).a;
                    String str3 = cvlVar.a;
                    long j2 = cvlVar.k;
                    str3.getClass();
                    if (str3.length() == 0 || c.v(str3, "FAKE_ID_", false)) {
                        if (j2 == -1) {
                            su4.s(2, null, "Can't open playlist " + cvlVar, null);
                        }
                        gxlVar = new gxl(j2);
                    } else {
                        gxlVar = new jxl(cvlVar.c.a, str3);
                    }
                    aud audVar = new aud(ouj.t(op7.c(cvlVar).a));
                    B = imp.J(context, rf3.l, null, x6hVar, 4);
                    B.putExtra("extra.playlist.header.id", gxlVar);
                    B.putExtra("extra.playlist.cover", audVar);
                } else if (g25Var.equals(a25.a)) {
                    int i18 = CollectionMainActivity.v0;
                    B = men.B(context, v35.a);
                } else if (g25Var.equals(b25.a)) {
                    int i19 = CollectionMainActivity.v0;
                    B = men.B(context, v35.d);
                } else {
                    if (!g25Var.equals(c25.a)) {
                        b6e.s();
                        return null;
                    }
                    int i20 = CollectionMainActivity.v0;
                    B = men.B(context, v35.e);
                }
                Intent intent2 = B;
                dyd.b(rf3.l, intent2);
                return intent2;
            case 6:
                kqtVar.getClass();
                if (kqtVar.c != 1) {
                    Intent t6 = w1g.t(context, intent, kqtVar);
                    if (t6 != null) {
                        return t6;
                    }
                    Intent z5 = StubActivity.z(context, rpt.NOT_FOUND);
                    z5.getClass();
                    return z5;
                }
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (!((iqu) ((byb) qdcVar.C(I)).b(iqu.class)).h()) {
                    bdt I2 = hag.I(byb.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    if (!((zqu) ((byb) qdcVar2.C(I2)).b(zqu.class)).h()) {
                        lhs lhsVar4 = MainScreenActivity.Q0;
                        return imp.J(context, null, null, null, 14);
                    }
                }
                lhs lhsVar5 = MainScreenActivity.Q0;
                a7h a7hVar = a7h.a;
                rf3 rf3Var = rf3.l;
                Intent J = imp.J(context, rf3Var, null, a7hVar, 4);
                dyd.b(rf3Var, J);
                return J;
            case 7:
                rpt rptVar = rpt.NOT_FOUND;
                kqtVar.getClass();
                if (kqtVar.c != 1) {
                    Intent t7 = w1g.t(context, intent, kqtVar);
                    if (t7 != null) {
                        return t7;
                    }
                    Intent z6 = StubActivity.z(context, rptVar);
                    z6.getClass();
                    return z6;
                }
                uc5 uc5Var = (uc5) kqtVar.a;
                String a7 = uc5Var.a(1);
                if (a7 != null) {
                    int hashCode = a7.hashCode();
                    if (hashCode != -839344347) {
                        if (hashCode == 3291757 && a7.equals("kids")) {
                            m94Var = m94.KIDS;
                        }
                    } else if (a7.equals("non-music")) {
                        m94Var = m94.NON_MUSIC;
                    }
                    a2 = uc5Var.a(2);
                    if (a2 != null) {
                        Intent z7 = StubActivity.z(context, rptVar);
                        z7.getClass();
                        return z7;
                    }
                    int ordinal2 = m94Var.ordinal();
                    if (ordinal2 == 0) {
                        int i21 = PodcastsActivity.Y;
                        return zdg.z(context, kem.a, lem.d, a2);
                    }
                    if (ordinal2 == 1) {
                        int i22 = PodcastsActivity.Y;
                        return zdg.z(context, kem.b, lem.d, a2);
                    }
                    b6e.s();
                    return null;
                }
                ssg.a(7, null, "Invalid url scheme for catalog category.", null);
                m94Var = m94.NON_MUSIC;
                a2 = uc5Var.a(2);
                if (a2 != null) {
                }
                break;
            case 8:
                rpt rptVar2 = rpt.NOT_FOUND;
                kqtVar.getClass();
                if (kqtVar.c != 1) {
                    Intent t8 = w1g.t(context, intent, kqtVar);
                    if (t8 != null) {
                        return t8;
                    }
                    Intent z8 = StubActivity.z(context, rptVar2);
                    z8.getClass();
                    return z8;
                }
                id5 id5Var = (id5) kqtVar.a;
                String a8 = id5Var.a(1);
                if (a8 != null) {
                    int hashCode2 = a8.hashCode();
                    if (hashCode2 != -839344347) {
                        if (hashCode2 == 3291757 && a8.equals("kids")) {
                            m94Var2 = m94.KIDS;
                        }
                    } else if (a8.equals("non-music")) {
                        m94Var2 = m94.NON_MUSIC;
                    }
                    a3 = id5Var.a(3);
                    if (a3 != null) {
                        Intent z9 = StubActivity.z(context, rptVar2);
                        z9.getClass();
                        return z9;
                    }
                    String a9 = id5Var.a(2);
                    if (a9 != null) {
                        int hashCode3 = a9.hashCode();
                        if (hashCode3 != 92896879) {
                            if (hashCode3 == 1879474642 && a9.equals("playlist")) {
                                gd5Var = gd5.b;
                            }
                        } else if (a9.equals("album")) {
                            gd5Var = gd5.a;
                        }
                        ordinal = gd5Var.ordinal();
                        if (ordinal != 0) {
                            int ordinal3 = m94Var2.ordinal();
                            if (ordinal3 == 0) {
                                int i23 = PodcastsActivity.Y;
                                return zdg.z(context, kem.a, lem.b, a3);
                            }
                            if (ordinal3 == 1) {
                                int i24 = PodcastsActivity.Y;
                                return zdg.z(context, kem.b, lem.b, a3);
                            }
                            b6e.s();
                        } else if (ordinal == 1) {
                            int ordinal4 = m94Var2.ordinal();
                            if (ordinal4 == 0) {
                                int i25 = PodcastsActivity.Y;
                                return zdg.z(context, kem.a, lem.c, a3);
                            }
                            if (ordinal4 == 1) {
                                int i26 = PodcastsActivity.Y;
                                return zdg.z(context, kem.b, lem.c, a3);
                            }
                            b6e.s();
                        } else {
                            b6e.s();
                        }
                        return null;
                    }
                    su4.s(2, null, "Invalid argument. Should not have been parsed.", null);
                    gd5Var = gd5.a;
                    ordinal = gd5Var.ordinal();
                    if (ordinal != 0) {
                    }
                    return null;
                }
                ssg.a(7, null, "Invalid url scheme for catalog category.", null);
                m94Var2 = m94.NON_MUSIC;
                a3 = id5Var.a(3);
                if (a3 != null) {
                }
                break;
            case 9:
                kqtVar.getClass();
                if (kqtVar.c == 1) {
                    lhs lhsVar6 = MainScreenActivity.Q0;
                    Object obj7 = kqtVar.b;
                    obj7.getClass();
                    Intent putExtra5 = imp.J(context, null, null, null, 14).setAction("action.showCommunication").putExtra("extra.communication.screen.id", (String) obj7);
                    putExtra5.getClass();
                    return putExtra5;
                }
                Intent t9 = w1g.t(context, intent, kqtVar);
                if (t9 != null) {
                    return t9;
                }
                Intent z10 = StubActivity.z(context, rpt.NOT_FOUND);
                z10.getClass();
                return z10;
            case 10:
                String str4 = (String) Preconditions.nonNull((String) kqtVar.b);
                int i27 = ConcertActivity.w0;
                return bkp.j0(context, str4, null);
            case 11:
                kqtVar.getClass();
                if (kqtVar.c != 1 || (obj2 = kqtVar.b) == null) {
                    Intent z11 = StubActivity.z(context, rpt.NOT_FOUND);
                    z11.getClass();
                    return z11;
                }
                du5 du5Var = (du5) obj2;
                String str5 = du5Var.a;
                String str6 = du5Var.b;
                int i28 = ConcertCatalogActivity.w0;
                str5.getClass();
                str6.getClass();
                Intent putExtra6 = new Intent(context, (Class<?>) ConcertCatalogActivity.class).putExtra("extra.type", str5).putExtra("extra.id", str6);
                putExtra6.getClass();
                return putExtra6;
            case 12:
                kqtVar.getClass();
                ypt yptVar3 = kqtVar.a;
                ((mv6) yptVar3).a(1);
                ((mv6) yptVar3).a(2);
                int i29 = DebugConfigActivity.a;
                Intent z12 = StubActivity.z(context, rpt.NOT_FOUND);
                z12.getClass();
                z12.addFlags(268435456);
                return z12;
            case 13:
                kqtVar.getClass();
                int i30 = kqtVar.c;
                ypt yptVar4 = kqtVar.a;
                if (i30 != 1) {
                    Intent z13 = StubActivity.z(context, rpt.NOT_FOUND);
                    z13.getClass();
                    Intent t10 = w1g.t(context, z13, kqtVar);
                    return t10 == null ? z13 : t10;
                }
                g2c g2cVar = (g2c) yptVar4;
                if (g2cVar.c) {
                    Intent intent3 = (Intent) new z0j(6).w().b;
                    intent3.setData(Uri.parse(g2cVar.a));
                    return intent3;
                }
                String uri = Uri.parse(g2cVar.a).toString();
                uri.getClass();
                int i31 = WebViewScreenActivity.A;
                return euk.G(context, uri, false, new xfv(119));
            case 14:
                if (kqtVar.c != 1) {
                    Intent t11 = w1g.t(context, intent, kqtVar);
                    return t11 != null ? t11 : StubActivity.z(context, rpt.NOT_FOUND);
                }
                rf3 rf3Var2 = rf3.h;
                lhs lhsVar7 = MainScreenActivity.Q0;
                return imp.J(context, rf3Var2, null, null, 12);
            case 15:
                kqtVar.getClass();
                lhs lhsVar8 = MainScreenActivity.Q0;
                Intent putExtra7 = imp.J(context, null, null, null, 14).putExtra("extra.fragment.on.current.activity", ((gw6) kqtVar.a).m().toString());
                putExtra7.getClass();
                return putExtra7;
            case 16:
                int i32 = kqtVar.c;
                ypt yptVar5 = kqtVar.a;
                if (i32 != 1 || (obj3 = kqtVar.b) == null) {
                    Intent t12 = w1g.t(context, intent, kqtVar);
                    return t12 != null ? t12 : StubActivity.z(context, rpt.NOT_FOUND);
                }
                String str7 = (String) obj3;
                if (str7.isEmpty()) {
                    rf3 rf3Var3 = rf3.h;
                    lhs lhsVar9 = MainScreenActivity.Q0;
                    return imp.J(context, rf3Var3, null, null, 12);
                }
                String a10 = ((a6d) yptVar5).a(2);
                if (a10 != null) {
                    switch (a10.hashCode()) {
                        case -1865828127:
                            if (a10.equals("playlists")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1415163932:
                            if (a10.equals("albums")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -732362228:
                            if (a10.equals("artists")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            int i33 = MetaTagPlaylistsActivity.Y;
                            putExtra = new Intent(context, (Class<?>) MetaTagPlaylistsActivity.class).putExtra("extra_id", str7);
                            putExtra.getClass();
                            break;
                        case 1:
                            int i34 = MetaTagAlbumsActivity.Y;
                            putExtra = new Intent(context, (Class<?>) MetaTagAlbumsActivity.class).putExtra("extra_id", str7);
                            putExtra.getClass();
                            break;
                        case 2:
                            int i35 = MetaTagArtistsActivity.Y;
                            putExtra = new Intent(context, (Class<?>) MetaTagArtistsActivity.class).putExtra("extra_id", str7);
                            putExtra.getClass();
                            break;
                        default:
                            putExtra = gut.Z(context, str7);
                            break;
                    }
                } else {
                    putExtra = gut.Z(context, str7);
                }
                new dyd(xpt.a(yptVar5)).c(putExtra);
                return putExtra;
            case 17:
                Intent intent4 = new Intent(context, (Class<?>) MainScreenActivity.class);
                intent4.addFlags(268435456);
                return intent4;
            case 18:
                kqtVar.getClass();
                if ((kqtVar.c == 1 ? kqtVar : null) != null) {
                    int i36 = MixesScreenActivity.Y;
                    return new Intent(context, (Class<?>) MixesScreenActivity.class);
                }
                Intent t13 = w1g.t(context, intent, kqtVar);
                if (t13 != null) {
                    return t13;
                }
                Intent z14 = StubActivity.z(context, rpt.NOT_FOUND);
                z14.getClass();
                return z14;
            case 19:
                kqtVar.getClass();
                if (kqtVar.c == 1) {
                    int i37 = MusicHistoryScreenActivity.Y;
                    return new Intent(context, (Class<?>) MusicHistoryScreenActivity.class);
                }
                Intent t14 = w1g.t(context, intent, kqtVar);
                if (t14 != null) {
                    return t14;
                }
                Intent z15 = StubActivity.z(context, rpt.NOT_FOUND);
                z15.getClass();
                return z15;
            case 20:
                if (kqtVar.c != 1) {
                    Intent t15 = w1g.t(context, intent, kqtVar);
                    return t15 != null ? t15 : StubActivity.z(context, rpt.NOT_FOUND);
                }
                int i38 = UniversalEntityActivity.Y;
                Intent putExtra8 = new Intent(context, (Class<?>) UniversalEntityActivity.class).putExtra("extra.entityContentType", new gjt("ALL_new_playlists", "new-playlists", new cjt(zpd.j, rht.b, 1))).putExtra("extra.entityUrlType", (Parcelable) ujt.a);
                putExtra8.getClass();
                return putExtra8;
            case 21:
                if (kqtVar.c != 1) {
                    Intent t16 = w1g.t(context, intent, kqtVar);
                    return t16 != null ? t16 : StubActivity.z(context, rpt.NOT_FOUND);
                }
                int i39 = UniversalEntityActivity.Y;
                Intent putExtra9 = new Intent(context, (Class<?>) UniversalEntityActivity.class).putExtra("extra.entityContentType", new gjt("NEWRELEASES", "new-releases", new cjt(zpd.f, rht.b, 1))).putExtra("extra.entityUrlType", (Parcelable) ujt.a);
                putExtra9.getClass();
                return putExtra9;
            case 22:
                kqtVar.getClass();
                int i40 = NonInteractiveFeedbackActivity.v;
                String Q2 = ((p8j) kqtVar.a).Q("email");
                Intent putExtra10 = new Intent(context, (Class<?>) NonInteractiveFeedbackActivity.class).putExtra("extra_email", (Q2 == null || Q2.length() == 0) ? null : Q2);
                putExtra10.getClass();
                Intent addFlags = putExtra10.addFlags(268435456);
                addFlags.getClass();
                return addFlags;
            case 23:
                kqtVar.getClass();
                kqt kqtVar3 = kqtVar.c == 1 ? kqtVar : null;
                if (kqtVar3 != null && (gajVar = (gaj) kqtVar3.a) != null && (a4 = gajVar.a(1)) != null) {
                    String str8 = !StringsKt.U(a4) ? a4 : null;
                    if (str8 != null) {
                        int i41 = ChartActivity.Y;
                        return weo.D(context, new mg4(str8));
                    }
                }
                Intent t17 = w1g.t(context, intent, kqtVar);
                if (t17 != null) {
                    return t17;
                }
                Intent z16 = StubActivity.z(context, rpt.NOT_FOUND);
                z16.getClass();
                return z16;
            case 24:
                rpt rptVar3 = rpt.NOT_FOUND;
                kqtVar.getClass();
                if (kqtVar.c != 1) {
                    Intent t18 = w1g.t(context, intent, kqtVar);
                    if (t18 != null) {
                        return t18;
                    }
                    Intent z17 = StubActivity.z(context, rptVar3);
                    z17.getClass();
                    return z17;
                }
                tvj tvjVar = (tvj) kqtVar.a;
                tvjVar.getClass();
                ad6 z18 = b2c.z(tvjVar.Q("type"));
                if (z18 == null) {
                    Intent z19 = StubActivity.z(context, rptVar3);
                    z19.getClass();
                    return z19;
                }
                int i42 = PaywallOptionsActivity.v;
                lik likVar = new lik(vik.e, null, null);
                l18 l18Var2 = l18.b;
                bdt I3 = hag.I(lwc.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                if (((lwc) qdcVar3.C(I3)).a()) {
                    int i43 = TariffPaywallActivity.z;
                    return dml.b(context, new lik(vik.f, null, null));
                }
                Intent putExtra11 = new Intent(context, (Class<?>) PaywallOptionsActivity.class).putExtra("optionsPaywallActivity:args.paywallOption", z18).putExtra("optionsPaywallActivity:args.navigationSourceInfo", likVar).putExtra("optionsPaywallActivity:args.campaignId", (String) null);
                putExtra11.getClass();
                return putExtra11;
            case 25:
                kqtVar.getClass();
                if (kqtVar.c == 1) {
                    int i44 = DeeplinkPaymentScreenActivity.v;
                    Intent putExtra12 = new Intent(context, (Class<?>) DeeplinkPaymentScreenActivity.class).putExtra("extra.campaign_id", ((hhk) kqtVar.a).Q("campaign_id"));
                    putExtra12.getClass();
                    return putExtra12;
                }
                Intent t19 = w1g.t(context, intent, kqtVar);
                if (t19 != null) {
                    return t19;
                }
                Intent z20 = StubActivity.z(context, rpt.NOT_FOUND);
                z20.getClass();
                return z20;
            case 26:
                rpt rptVar4 = rpt.NO_PLAYLIST;
                rpt rptVar5 = rpt.NOT_FOUND;
                int i45 = kqtVar.c;
                int i46 = kqtVar.c;
                ypt yptVar6 = kqtVar.a;
                if (i45 != 1) {
                    Intent t20 = w1g.t(context, intent, kqtVar);
                    return t20 != null ? t20 : (i46 == 5 || i46 == 6) ? StubActivity.z(context, rptVar4) : StubActivity.z(context, rptVar5);
                }
                smk smkVar = (smk) kqtVar.b;
                Assertions.assertNonNull(smkVar);
                if (smkVar == null) {
                    Intent t21 = w1g.t(context, intent, kqtVar);
                    return t21 != null ? t21 : (i46 == 5 || i46 == 6) ? StubActivity.z(context, rptVar4) : StubActivity.z(context, rptVar5);
                }
                if (!smkVar.c) {
                    int i47 = AutoPlaylistGagActivity.v;
                    Intent intent5 = new Intent(context, (Class<?>) AutoPlaylistGagActivity.class);
                    intent5.putExtra("extra_playlist", (Parcelable) smkVar);
                    return intent5;
                }
                cvl cvlVar2 = smkVar.b;
                nxl nxlVar = nxl.a;
                int i48 = PlaylistScreenActivity.B0;
                Intent putExtra13 = dxl.f(context, cvlVar2, false, null, nxlVar, null).putExtra("need_permission", ((xmk) yptVar6).f);
                yptVar6.getClass();
                boolean parseBoolean2 = Boolean.parseBoolean(yptVar6.Q("openTrailer"));
                if (!parseBoolean2) {
                    new dyd(xpt.a(yptVar6)).c(putExtra13);
                    return putExtra13;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("key.intent.action.executed", false);
                bundle.putBoolean("TrailerPlay.key.open", parseBoolean2);
                putExtra13.putExtra("trailer.intent.action", bundle);
                return putExtra13;
            case 27:
                kqtVar.getClass();
                if (kqtVar.c != 1) {
                    Intent t22 = w1g.t(context, intent, kqtVar);
                    if (t22 != null) {
                        return t22;
                    }
                    Intent z21 = StubActivity.z(context, rpt.NOT_FOUND);
                    z21.getClass();
                    return z21;
                }
                iwk iwkVar = (iwk) kqtVar.a;
                jyr jyrVar = c2e.e;
                if (!kg5.B()) {
                    iwkVar.getClass();
                    if (Intrinsics.d(iwkVar.a(1), "last")) {
                        lhs lhsVar10 = MainScreenActivity.Q0;
                        return imp.J(context, rf3.h, cxb.K(new Pair("landing.type.queue", gi7.a)), null, 8);
                    }
                    String Q3 = iwkVar.Q("openPlayer");
                    parseBoolean = Q3 != null ? Boolean.parseBoolean(Q3) : false;
                    List b2 = iwkVar.b();
                    if (!Intrinsics.d(iwkVar.Q("screen"), "landing")) {
                        int i49 = EmptyScreenInDeeplinkActivity.z;
                        return qwp.b0(context, b2, parseBoolean);
                    }
                    lhs lhsVar11 = MainScreenActivity.Q0;
                    rf3 rf3Var4 = rf3.h;
                    b2.getClass();
                    return imp.J(context, rf3Var4, cxb.K(new Pair("landing.type.queue", new hi7(b2, parseBoolean))), null, 8);
                }
                if (Intrinsics.d(iwkVar.a(1), "last")) {
                    lhs lhsVar12 = MainScreenActivity.Q0;
                    return imp.J(context, rf3.m, cxb.K(new Pair("wave.landing.queue.type", qnf.a)), null, 8);
                }
                String Q4 = iwkVar.Q("openPlayer");
                parseBoolean = Q4 != null ? Boolean.parseBoolean(Q4) : false;
                List b3 = iwkVar.b();
                String Q5 = iwkVar.Q("screen");
                if (Intrinsics.d(Q5, "landing")) {
                    lhs lhsVar13 = MainScreenActivity.Q0;
                    rf3 rf3Var5 = rf3.h;
                    b3.getClass();
                    return imp.J(context, rf3Var5, cxb.K(new Pair("landing.type.queue", new hi7(b3, parseBoolean))), null, 8);
                }
                if (Intrinsics.d(Q5, "wave")) {
                    lhs lhsVar14 = MainScreenActivity.Q0;
                    return imp.J(context, rf3.m, rvf.w(b3, parseBoolean), null, 8);
                }
                int i50 = EmptyScreenInDeeplinkActivity.z;
                return qwp.b0(context, b3, parseBoolean);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                kqtVar.getClass();
                int i51 = kqtVar.c;
                ypt yptVar7 = kqtVar.a;
                if (i51 != 1) {
                    Intent t23 = w1g.t(context, intent, kqtVar);
                    if (t23 != null) {
                        return t23;
                    }
                    if (i51 == 5 || i51 == 6) {
                        Intent z22 = StubActivity.z(context, rpt.NO_PLAYLIST);
                        z22.getClass();
                        return z22;
                    }
                    Intent z23 = StubActivity.z(context, rpt.NOT_FOUND);
                    z23.getClass();
                    return z23;
                }
                p3m p3mVar = (p3m) kqtVar.b;
                String str9 = p3mVar != null ? p3mVar.a : "";
                int i52 = PlaylistScreenActivity.B0;
                Intent j3 = dxl.j(context, new kxl(str9), cud.a, null, null, 112);
                j3.putExtra("need_permission", ((r3m) yptVar7).f);
                yptVar7.getClass();
                boolean parseBoolean3 = Boolean.parseBoolean(yptVar7.Q("openTrailer"));
                if (!parseBoolean3) {
                    new dyd(xpt.a(yptVar7)).c(j3);
                    return j3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("key.intent.action.executed", false);
                bundle2.putBoolean("TrailerPlay.key.open", parseBoolean3);
                j3.putExtra("trailer.intent.action", bundle2);
                return j3;
            default:
                kqtVar.getClass();
                int i53 = kqtVar.c;
                ypt yptVar8 = kqtVar.a;
                if (i53 != 1) {
                    Intent t24 = w1g.t(context, intent, kqtVar);
                    if (t24 != null) {
                        return t24;
                    }
                    if (i53 == 5 || i53 == 6) {
                        Intent z24 = StubActivity.z(context, rpt.NO_PLAYLIST);
                        z24.getClass();
                        return z24;
                    }
                    Intent z25 = StubActivity.z(context, rpt.NOT_FOUND);
                    z25.getClass();
                    return z25;
                }
                dul dulVar = (dul) kqtVar.b;
                if (dulVar instanceof ztl) {
                    ztl ztlVar = (ztl) dulVar;
                    jxlVar = new hxl(ztlVar.a, ztlVar.b);
                } else if (dulVar instanceof bul) {
                    bul bulVar = (bul) dulVar;
                    jxlVar = new ixl(bulVar.a, bulVar.b);
                } else {
                    if (!(dulVar instanceof cul)) {
                        b6e.s();
                        return null;
                    }
                    cul culVar = (cul) dulVar;
                    jxlVar = new jxl(culVar.a, culVar.b);
                }
                int i54 = PlaylistScreenActivity.B0;
                Intent j4 = dxl.j(context, jxlVar, cud.a, null, null, 112);
                yptVar8.getClass();
                boolean parseBoolean4 = Boolean.parseBoolean(yptVar8.Q("openTrailer"));
                if (!parseBoolean4) {
                    new dyd(xpt.a(yptVar8)).c(j4);
                    Intent putExtra14 = j4.putExtra("need_permission", ((d4m) yptVar8).f);
                    putExtra14.getClass();
                    return putExtra14;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("key.intent.action.executed", false);
                bundle3.putBoolean("TrailerPlay.key.open", parseBoolean4);
                j4.putExtra("trailer.intent.action", bundle3);
                return j4;
        }
    }
}
