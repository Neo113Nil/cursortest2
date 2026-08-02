package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.text.c;
import ru.yandex.music.catalog.universalentity.UniversalEntityActivity;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.landing.skeleton.SkeletonScreenActivity;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.mixes.TagActivity;
import ru.yandex.music.novelties.podcasts.catalog.PodcastsCatalogActivity;
import ru.yandex.music.payment.pay.PromoCodeWebViewActivity;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;
import ru.yandex.music.profile.ProfileActivity;
import ru.yandex.music.search.SearchActivity;
import ru.yandex.music.settings.SettingsActivity;
import ru.yandex.music.slides.SlidesScreenActivity;
import ru.yandex.music.url.ui.StubActivity;
import ru.yandex.music.videoclip.VideoClipActivity;
import ru.yandex.music.webview.WebViewScreenActivity;
import ru.yandex.music.wizard3.WizardActivity;
import ru.yandex.music.yandexplus.home.PlusHomeActivity;

/* loaded from: classes6.dex */
public final class zem implements tft {
    public final /* synthetic */ int a;

    public /* synthetic */ zem(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04ec, code lost:
    
        if (r3.equals("genre") == false) goto L225;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.tft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent p(Context context, Intent intent, kqt kqtVar) {
        int i = this.a;
        rpt rptVar = rpt.NOT_FOUND;
        msp mspVar = null;
        Intent intent2 = null;
        mspVar = null;
        mspVar = null;
        mspVar = null;
        mspVar = null;
        mspVar = null;
        mspVar = null;
        mspVar = null;
        mspVar = null;
        mspVar = null;
        switch (i) {
            case 0:
                kqtVar.getClass();
                int i2 = kqtVar.c;
                ypt yptVar = kqtVar.a;
                if ((i2 == 1 ? kqtVar : null) == null) {
                    Intent t = w1g.t(context, intent, kqtVar);
                    if (t != null) {
                        return t;
                    }
                    Intent z = StubActivity.z(context, rptVar);
                    z.getClass();
                    return z;
                }
                bfm bfmVar = (bfm) yptVar;
                String Q = bfmVar.Q("tab");
                String Q2 = bfmVar.Q("block");
                jyr jyrVar = o5j.e;
                if (!tyf.v()) {
                    jyr jyrVar2 = t5j.e;
                    if (!wyf.M()) {
                        if (Q != null) {
                            lhs lhsVar = MainScreenActivity.Q0;
                            return imp.T(context, cxb.K(new Pair("landing.focus.on.tab.id", Q), new Pair("landing.focus.on.block.id", Q2)), 4);
                        }
                        lhs lhsVar2 = MainScreenActivity.Q0;
                        return imp.T(context, null, 6);
                    }
                }
                jyr jyrVar3 = PodcastsCatalogActivity.Y;
                return neg.v(context, fbj.c, Q, Q2);
            case 1:
                kqtVar.getClass();
                if (kqtVar.c == 1) {
                    int i3 = ProfileActivity.w0;
                    Intent addFlags = new Intent(context, (Class<?>) ProfileActivity.class).addFlags(603979776);
                    addFlags.getClass();
                    return addFlags;
                }
                Intent t2 = w1g.t(context, intent, kqtVar);
                if (t2 != null) {
                    return t2;
                }
                Intent z2 = StubActivity.z(context, rptVar);
                z2.getClass();
                return z2;
            case 2:
                kqtVar.getClass();
                if (kqtVar.c != 1) {
                    Intent t3 = w1g.t(context, intent, kqtVar);
                    if (t3 != null) {
                        return t3;
                    }
                    Intent z3 = StubActivity.z(context, rptVar);
                    z3.getClass();
                    return z3;
                }
                owm owmVar = (owm) kqtVar.b;
                boolean z4 = owmVar.a;
                String str = owmVar.b;
                if (z4) {
                    int i4 = PromoCodeWebViewActivity.w;
                    return hdg.a0(context, null, str);
                }
                int i5 = TariffPaywallActivity.z;
                lik likVar = new lik(vik.e, null, null);
                Intent intent3 = new Intent(context, (Class<?>) TariffPaywallActivity.class);
                intent3.putExtra("navigation_source_info", likVar);
                intent3.putExtra("promo_code", str);
                return intent3;
            case 3:
                kqtVar.getClass();
                Intent t4 = w1g.t(context, intent, kqtVar);
                if (t4 != null) {
                    return t4;
                }
                int i6 = SkeletonScreenActivity.Z;
                xfn xfnVar = (xfn) kqtVar.a;
                String a = xfnVar.a(1);
                String str2 = "genres";
                if (a == null || !c.v(a, "genres", false)) {
                    String a2 = xfnVar.a(3);
                    if (a2 != null) {
                        switch (a2.hashCode()) {
                            case -1655966961:
                                if (a2.equals("activity")) {
                                    str2 = "activities";
                                    break;
                                }
                                break;
                            case 3357431:
                                if (a2.equals("mood")) {
                                    str2 = "moods";
                                    break;
                                }
                                break;
                            case 96722057:
                                if (a2.equals("epoch")) {
                                    str2 = "epochs";
                                    break;
                                }
                                break;
                            case 98240899:
                                break;
                        }
                    }
                    str2 = xfnVar.a(2);
                }
                return itk.l(context, f1d.g("music_", str2), 28, null, null);
            case 4:
                Object obj = kqtVar.b;
                ypt yptVar2 = kqtVar.a;
                StationId stationId = (StationId) obj;
                int i7 = kqtVar.c;
                if (i7 != 1 || stationId == null) {
                    Intent t5 = w1g.t(context, intent, kqtVar);
                    return t5 != null ? t5 : i7 == 5 ? StubActivity.z(context, rpt.NO_STATION) : StubActivity.z(context, rptVar);
                }
                xpt a3 = xpt.a(yptVar2);
                dyd dydVar = new dyd(a3);
                if (stationId.i()) {
                    return gut.Z(context, stationId.n());
                }
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("key.intent.action.executed", dydVar.c);
                dydVar.d(bundle2, a3);
                bundle.putBundle("urlplay.intent.action", bundle2);
                boolean parseBoolean = Boolean.parseBoolean(((ihn) yptVar2).Q("openPlayer"));
                jyr jyrVar4 = c2e.e;
                if (kg5.B()) {
                    Bundle K = cxb.K(new Pair("wave.landing.queue.type", new onf(stationId.h(), bundle, parseBoolean)));
                    rf3 rf3Var = rf3.m;
                    lhs lhsVar3 = MainScreenActivity.Q0;
                    return imp.J(context, rf3Var, K, null, 8);
                }
                Bundle K2 = cxb.K(new Pair("landing.type.queue", new fi7(stationId.h(), bundle, parseBoolean)));
                rf3 rf3Var2 = rf3.h;
                lhs lhsVar4 = MainScreenActivity.Q0;
                return imp.J(context, rf3Var2, K2, null, 8);
            case 5:
                kqtVar.getClass();
                int i8 = kqtVar.c;
                ypt yptVar3 = kqtVar.a;
                if (i8 != 1) {
                    Intent t6 = w1g.t(context, intent, kqtVar);
                    if (t6 != null) {
                        return t6;
                    }
                    Intent z5 = StubActivity.z(context, rptVar);
                    z5.getClass();
                    return z5;
                }
                b8p b8pVar = (b8p) yptVar3;
                String Q3 = b8pVar.Q("text");
                String Q4 = b8pVar.Q("auto_recognition");
                if (Q3 != null && Q3.length() > 0) {
                    int i9 = SearchActivity.Z;
                    Intent intent4 = new Intent(context, (Class<?>) SearchActivity.class);
                    intent4.putExtra("extra.initial.query", Q3);
                    return intent4;
                }
                if (Q4 == null || !Boolean.parseBoolean(Q4)) {
                    int i10 = SearchActivity.Z;
                    Intent intent5 = new Intent(context, (Class<?>) SearchActivity.class);
                    intent5.putExtra("extra.navigationRoot", true);
                    return intent5;
                }
                int i11 = SearchActivity.Z;
                Intent intent6 = new Intent(context, (Class<?>) SearchActivity.class);
                intent6.putExtra("extra.autoRecognition", true);
                return intent6;
            case 6:
                kqtVar.getClass();
                if (kqtVar.c != 1) {
                    Intent z6 = StubActivity.z(context, rptVar);
                    z6.getClass();
                    return z6;
                }
                if (kqtVar.b != null) {
                    l1j.f();
                    return null;
                }
                Intent intent7 = new Intent("android.intent.action.SEND");
                intent7.setType("text/text");
                intent7.addFlags(1);
                throw null;
            case 7:
                kqtVar.getClass();
                ypt yptVar4 = kqtVar.a;
                gtp b = ((itp) yptVar4).b();
                int i12 = b == null ? -1 : etp.a[b.ordinal()];
                if (i12 != -1) {
                    if (i12 == 1) {
                        int i13 = CollectionMainActivity.v0;
                        return men.B(context, v35.l);
                    }
                    b6e.s();
                    return null;
                }
                cpp cppVar = SettingsActivity.v0;
                String Q5 = ((itp) yptVar4).Q("option");
                if (Q5 != null) {
                    switch (Q5.hashCode()) {
                        case -1822942593:
                            if (Q5.equals("offline_mode")) {
                                mspVar = lsp.c;
                                break;
                            }
                            break;
                        case -827184445:
                            if (Q5.equals("kids_tab")) {
                                mspVar = lsp.g;
                                break;
                            }
                            break;
                        case -457892896:
                            if (Q5.equals("video_covers")) {
                                mspVar = lsp.e;
                                break;
                            }
                            break;
                        case 25285235:
                            if (Q5.equals("playlist_add_tracks")) {
                                mspVar = lsp.i;
                                break;
                            }
                            break;
                        case 110327241:
                            if (Q5.equals("theme")) {
                                mspVar = ksp.e;
                                break;
                            }
                            break;
                        case 505979418:
                            if (Q5.equals("notify_whats_new")) {
                                mspVar = lsp.j;
                                break;
                            }
                            break;
                        case 1397903036:
                            if (Q5.equals("crossfade")) {
                                mspVar = lsp.d;
                                break;
                            }
                            break;
                        case 1477536138:
                            if (Q5.equals("kids_filter")) {
                                mspVar = lsp.h;
                                break;
                            }
                            break;
                    }
                }
                cppVar.getClass();
                return cpp.a(context, mspVar);
            case 8:
                kqtVar.getClass();
                ypt yptVar5 = kqtVar.a;
                String a4 = ((vnq) yptVar5).a(1);
                if (a4 == null) {
                    lhs lhsVar5 = MainScreenActivity.Q0;
                    return imp.J(context, rf3.h, null, null, 12);
                }
                String Q6 = ((vnq) yptVar5).Q("block");
                jyr jyrVar5 = c2e.e;
                if (kg5.B()) {
                    lhs lhsVar6 = MainScreenActivity.Q0;
                    return imp.J(context, rf3.h, cxb.K(new Pair("landing.skeleton.focus.on.tab.id", a4), new Pair("landing.skeleton.focus.on.block.id", Q6)), null, 8);
                }
                lhs lhsVar7 = MainScreenActivity.Q0;
                return imp.J(context, rf3.h, cxb.K(new Pair("landing.focus.on.tab.id", a4), new Pair("landing.focus.on.block.id", Q6)), null, 8);
            case 9:
                kqtVar.getClass();
                int i14 = kqtVar.c;
                ypt yptVar6 = kqtVar.a;
                if ((i14 == 1 ? kqtVar : null) != null) {
                    wqq wqqVar = (wqq) yptVar6;
                    String a5 = wqqVar.a(1);
                    if (a5 != null) {
                        String Q7 = wqqVar.Q("tab");
                        String Q8 = wqqVar.Q("block");
                        int i15 = SkeletonScreenActivity.Z;
                        intent2 = itk.l(context, a5, 16, Q7, Q8);
                    }
                    if (intent2 != null) {
                        return intent2;
                    }
                }
                Intent t7 = w1g.t(context, intent, kqtVar);
                if (t7 != null) {
                    return t7;
                }
                Intent z7 = StubActivity.z(context, rptVar);
                z7.getClass();
                return z7;
            case 10:
                kqtVar.getClass();
                if (kqtVar.c != 1) {
                    Intent z8 = StubActivity.z(context, rptVar);
                    z8.getClass();
                    return z8;
                }
                int i16 = SlidesScreenActivity.y;
                Object obj2 = kqtVar.b;
                obj2.getClass();
                Intent putExtra = new Intent(context, (Class<?>) SlidesScreenActivity.class).putExtra("extra.slides_params", (zvq) obj2);
                putExtra.getClass();
                return putExtra;
            case 11:
                kqtVar.getClass();
                if (kqtVar.c != 1) {
                    Intent t8 = w1g.t(context, intent, kqtVar);
                    if (t8 != null) {
                        return t8;
                    }
                    Intent z9 = StubActivity.z(context, rptVar);
                    z9.getClass();
                    return z9;
                }
                String Q9 = ((c4s) kqtVar.a).Q("sort");
                int i17 = TagActivity.Y;
                Object obj3 = kqtVar.b;
                if (obj3 == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                pvl pvlVar = (pvl) obj3;
                Intent putExtra2 = new Intent(context, (Class<?>) TagActivity.class).putParcelableArrayListExtra("extra.playlists", new ArrayList<>(pvlVar.b)).putExtra("extra.tag", pvlVar.a).putExtra("extra.sort", Q9);
                putExtra2.getClass();
                return putExtra2;
            case 12:
                kqtVar.getClass();
                if (kqtVar.c == 1) {
                    int i18 = TariffPaywallActivity.z;
                    return dml.b(context, new lik(vik.e, null, null));
                }
                Intent t9 = w1g.t(context, intent, kqtVar);
                if (t9 != null) {
                    return t9;
                }
                Intent z10 = StubActivity.z(context, rptVar);
                z10.getClass();
                return z10;
            case 13:
                kqtVar.getClass();
                int i19 = kqtVar.c;
                int i20 = i19 == 0 ? -1 : dkt.a[ouj.D(i19)];
                if (i20 == 1) {
                    int i21 = UniversalEntityActivity.Y;
                    vjt vjtVar = (vjt) kqtVar.b;
                    gjt gjtVar = vjtVar.a;
                    ujt ujtVar = vjtVar.b;
                    gjtVar.getClass();
                    ujtVar.getClass();
                    Intent putExtra3 = new Intent(context, (Class<?>) UniversalEntityActivity.class).putExtra("extra.entityContentType", gjtVar).putExtra("extra.entityUrlType", (Parcelable) ujtVar);
                    putExtra3.getClass();
                    return putExtra3;
                }
                if (i20 == 2) {
                    Intent y = StubActivity.y(context, intent, fmr.a);
                    y.getClass();
                    return y;
                }
                ssg.a(6, null, "Failed to create intent for universal screen with url=" + ((gkt) kqtVar.a).m() + " from deeplink", null);
                Intent z11 = StubActivity.z(context, rptVar);
                z11.getClass();
                return z11;
            case 14:
                kqtVar.getClass();
                List list = (List) kqtVar.b;
                kqt kqtVar2 = kqtVar.c == 1 ? kqtVar : null;
                if (kqtVar2 != null) {
                    int ordinal = ((h74) ((g64) l18.b.b(hag.I(g64.class), true).getValue()).h.getValue()).ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        kqtVar2 = null;
                    } else if (ordinal != 2 && ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                    if (kqtVar2 != null) {
                        list.getClass();
                        Activity G = sj2.G(context);
                        if (G == null || !G.isTaskRoot()) {
                            jyr jyrVar6 = VideoClipActivity.y;
                            return l3l.e(context, list, 4);
                        }
                        lhs lhsVar8 = MainScreenActivity.Q0;
                        Intent putExtra4 = imp.J(context, null, null, null, 14).setAction("action.startVideoPlayback").putExtra("extra.video.clips", (Parcelable[]) list.toArray(new x1u[0]));
                        putExtra4.getClass();
                        return putExtra4;
                    }
                }
                Intent t10 = w1g.t(context, intent, kqtVar);
                if (t10 != null) {
                    return t10;
                }
                Intent z12 = StubActivity.z(context, rptVar);
                z12.getClass();
                return z12;
            case 15:
                kqtVar.getClass();
                if (kqtVar.c == 1) {
                    int i22 = WebViewScreenActivity.A;
                    odv odvVar = (odv) kqtVar.b;
                    return euk.G(context, odvVar.a, odvVar.b, new xfv(119));
                }
                Intent t11 = w1g.t(context, intent, kqtVar);
                if (t11 != null) {
                    return t11;
                }
                Intent z13 = StubActivity.z(context, rptVar);
                z13.getClass();
                return z13;
            case 16:
                kqtVar.getClass();
                if (kqtVar.c == 1) {
                    int i23 = WizardActivity.v;
                    Intent intent8 = new Intent(context, (Class<?>) WizardActivity.class);
                    intent8.putExtra("show_onboarding", false);
                    return intent8;
                }
                Intent t12 = w1g.t(context, intent, kqtVar);
                if (t12 != null) {
                    return t12;
                }
                Intent z14 = StubActivity.z(context, rptVar);
                z14.getClass();
                return z14;
            default:
                kqtVar.getClass();
                int i24 = PlusHomeActivity.v;
                String str3 = ((ibw) kqtVar.a).g;
                str3.getClass();
                Intent intent9 = new Intent(context, (Class<?>) PlusHomeActivity.class);
                intent9.putExtra("deeplink", str3);
                if (mi.m(context) <= 1) {
                    lhs lhsVar9 = MainScreenActivity.Q0;
                    intent9 = imp.J(context, null, null, new z6h(intent9), 6);
                }
                Intent t13 = w1g.t(context, intent9, kqtVar);
                return t13 == null ? intent9 : t13;
        }
    }
}
