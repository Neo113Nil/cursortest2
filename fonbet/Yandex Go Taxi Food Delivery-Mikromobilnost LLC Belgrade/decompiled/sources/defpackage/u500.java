package defpackage;

import android.net.Uri;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import java.util.HashMap;
import kotlin.Pair;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.b;

/* loaded from: classes10.dex */
public final class u500 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final hb0 d;
    public final h3y e;
    public final rx2 f;
    public final t61 g;
    public final jc4 h;
    public final jc4 i;
    public final zf j;
    public final t61 k;
    public final cug l;
    public final zf m;

    public u500(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, hb0 hb0Var, h3y h3yVar4, rx2 rx2Var, t61 t61Var, jc4 jc4Var, jc4 jc4Var2, zf zfVar, t61 t61Var2, cug cugVar, zf zfVar2) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = hb0Var;
        this.e = h3yVar4;
        this.f = rx2Var;
        this.g = t61Var;
        this.h = jc4Var;
        this.i = jc4Var2;
        this.j = zfVar;
        this.k = t61Var2;
        this.l = cugVar;
        this.m = zfVar2;
    }

    public final void a(tis0 tis0Var) {
        MainMenuProcessor$MenuEntry M = tis0Var.M();
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry = MainMenuProcessor$MenuEntry.ENTER_PHONE;
        h3y h3yVar = this.c;
        if (M == mainMenuProcessor$MenuEntry) {
            t61 t61Var = this.g;
            t61Var.getClass();
            t61Var.a.a("SettingsDidSelectAuthentication", new HashMap(), 1, new HashMap());
            ((g350) h3yVar.get()).d(null);
            return;
        }
        if (tis0Var.Q() && !((g) this.b.get()).g()) {
            ((g350) h3yVar.get()).d(new mqu(28, this, tis0Var));
            return;
        }
        switch (t500.a[tis0Var.M().ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                break;
            case 2:
                jc4 jc4Var = this.i;
                jc4Var.getClass();
                jc4Var.a.a("SettingsDidSelectProfile", new HashMap(), 1, new HashMap());
                break;
            case 3:
                jc4 jc4Var2 = this.h;
                jc4Var2.getClass();
                jc4Var2.a.a("SettingsDidSelectEmail", new HashMap(), 1, new HashMap());
                break;
            case 7:
                cug cugVar = this.l;
                cugVar.getClass();
                cugVar.a.a("SettingsDidSelectPayment", new HashMap(), 1, new HashMap());
                break;
            case 8:
                rx2 rx2Var = this.f;
                rx2Var.getClass();
                rx2Var.a.a("SettingsDidSelectFavorites", new HashMap(), 1, new HashMap());
                break;
            case 11:
                zf zfVar = this.m;
                zfVar.getClass();
                zfVar.a.a("SettingsDidSelectSettings", new HashMap(), 1, new HashMap());
                break;
            case 12:
                t61 t61Var2 = this.k;
                t61Var2.getClass();
                t61Var2.a.a("SettingsDidSelectInfo", new HashMap(), 1, new HashMap());
                break;
            case 13:
                zf zfVar2 = this.j;
                zfVar2.getClass();
                zfVar2.a.a("SettingsDidSelectHelp", new HashMap(), 1, new HashMap());
                break;
            default:
                w511.b();
                return;
        }
        ((g350) h3yVar.get()).b(tis0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean b(MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry, Object obj) {
        switch (t500.a[mainMenuProcessor$MenuEntry.ordinal()]) {
            case 1:
                d(MainMenuProcessor$MenuEntry.ENTER_PHONE, null);
                return true;
            case 2:
                if (!(obj instanceof aff0)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for PROFILE", 6);
                    return false;
                }
                aff0 aff0Var = (aff0) obj;
                d(MainMenuProcessor$MenuEntry.PROFILE, new aff0(aff0Var.a(), aff0Var.b()));
                return true;
            case 3:
                d(MainMenuProcessor$MenuEntry.MAIL, null);
                return true;
            case 4:
                if (!(obj instanceof tmr0)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for CREATE_SHARED_PAYMENT_GROUP", 6);
                    return false;
                }
                d(MainMenuProcessor$MenuEntry.CREATE_SHARED_PAYMENT_GROUP, new umr0((tmr0) obj, SharedPaymentsOpenReason.MENU, null));
                return true;
            case 5:
                xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for SHARED_PAYMENT_GROUP", 6);
                return false;
            case 6:
                xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for SHARED_PAYMENT_EXISTS_DIALOG", 6);
                return false;
            case 7:
                if (obj instanceof rm10) {
                    d(MainMenuProcessor$MenuEntry.PAYMENT, obj);
                    return true;
                }
                xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for PAYMENT", 6);
                return false;
            case 8:
                if (!(obj instanceof mip)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for MY_ADDRESSES", 6);
                    return false;
                }
                d(MainMenuProcessor$MenuEntry.MY_ADDRESSES, (mip) obj);
                return true;
            case 9:
                if (obj instanceof Uri) {
                    d(MainMenuProcessor$MenuEntry.PROMOCODE, (Uri) obj);
                } else {
                    d(MainMenuProcessor$MenuEntry.PROMOCODE, null);
                }
                return true;
            case 10:
                if (!(obj instanceof w770)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for REFERRAL", 6);
                    return false;
                }
                c(MainMenuProcessor$MenuEntry.REFERRAL, new kni0(null));
                return true;
            case 11:
                d(MainMenuProcessor$MenuEntry.SETTINGS, null);
                return true;
            case 12:
                d(MainMenuProcessor$MenuEntry.INFO, null);
                return true;
            case 13:
            case 14:
                xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for SUPPORT", 6);
                return false;
            case 15:
                if (!(obj instanceof qxx0)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for PLUS_HOME", 6);
                    return false;
                }
                d(MainMenuProcessor$MenuEntry.PLUS_HOME, (qxx0) obj);
                return true;
            case 16:
                if (!(obj instanceof String)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for PLUS_BURNS", 6);
                    return false;
                }
                d(MainMenuProcessor$MenuEntry.PLUS_BURNS, (String) obj);
                return true;
            case 17:
                if (!(obj instanceof itl0)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for SAFETY_CENTER", 6);
                    return false;
                }
                c(MainMenuProcessor$MenuEntry.SAFETY_CENTER, (itl0) obj);
                return true;
            case 18:
                if (!(obj instanceof String)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for WEB_VIEW_ACTIVITY", 6);
                    return false;
                }
                String b = ((g) this.b.get()).b();
                UiWebViewConfig.Companion.getClass();
                d(MainMenuProcessor$MenuEntry.WEB_VIEW_ACTIVITY, b.a((String) obj, null, b, true, false));
                return true;
            case 19:
                xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for CHARITY", 6);
                return false;
            case 20:
                if (!(obj instanceof MultiTransportChooseStationCardAnalytics$OpenReasonV2)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for MAAS", 6);
                    return false;
                }
                c(MainMenuProcessor$MenuEntry.MAAS, (MultiTransportChooseStationCardAnalytics$OpenReasonV2) obj);
                return true;
            case 21:
                if (!(obj instanceof String)) {
                    xby.t(jst.e, "MainMenuInteractor", null, "Can't get payload for FAMILY_GROUP", 6);
                    return false;
                }
                d(MainMenuProcessor$MenuEntry.FAMILY_GROUP, (String) obj);
                return true;
            case 22:
                c(MainMenuProcessor$MenuEntry.BUG_REPORT, null);
                return true;
            case 23:
                d(MainMenuProcessor$MenuEntry.CURRENT_ADDRESS, null);
                return true;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return true;
            default:
                w511.b();
                return false;
        }
    }

    public final void c(MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry, Object obj) {
        ((g350) this.c.get()).b(new tis0(mainMenuProcessor$MenuEntry, obj, mainMenuProcessor$MenuEntry.getIsNeedAuthorization(), 15));
    }

    public final void d(MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry, Object obj) {
        a(new tis0(mainMenuProcessor$MenuEntry, obj, mainMenuProcessor$MenuEntry.getIsNeedAuthorization(), 15));
    }

    public final void e(snr0 snr0Var, SharedAccountScreen sharedAccountScreen) {
        d(MainMenuProcessor$MenuEntry.SHARED_PAYMENT_GROUP, new nmr0(snr0Var.getId(), snr0Var.g().b(), snr0Var.h(), sharedAccountScreen));
    }

    public final void f(boolean z, boolean z2, String str, siw0 siw0Var) {
        UiWebViewConfig a = ((gn10) this.e.get()).a(str, z);
        if (a == null) {
            d(MainMenuProcessor$MenuEntry.SUPPORT_MAIL, null);
        } else if (z2) {
            d(MainMenuProcessor$MenuEntry.WEB_VIEW_ACTIVITY, a);
        } else {
            d(MainMenuProcessor$MenuEntry.SUPPORT, new Pair(a, siw0Var));
        }
    }
}
