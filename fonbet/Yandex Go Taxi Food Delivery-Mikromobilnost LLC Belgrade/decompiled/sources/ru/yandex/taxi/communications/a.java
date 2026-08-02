package ru.yandex.taxi.communications;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import defpackage.a60;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.iux0;
import defpackage.kq41;
import defpackage.ltc;
import defpackage.m4b1;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wg21;
import defpackage.y50;
import kotlin.Result;
import ru.yandex.taxi.banners.BannerType;

/* loaded from: classes9.dex */
public final class a {
    public final y50 a;
    public final ltc b;
    public final tse c;
    public final oep0 d;
    public final h3y e;
    public final wg21 f;

    public a(y50 y50Var, ltc ltcVar, tse tseVar, oep0 oep0Var, h3y h3yVar, wg21 wg21Var) {
        this.a = y50Var;
        this.b = ltcVar;
        this.c = tseVar;
        this.d = oep0Var;
        this.e = h3yVar;
        this.f = wg21Var;
    }

    public final boolean a(String str, BannerType bannerType, sls slsVar) {
        Object failure;
        a aVar;
        String str2;
        BannerType bannerType2;
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Uri uri = (Uri) failure;
        if (uri == null || slsVar == null) {
            aVar = this;
            str2 = str;
            bannerType2 = bannerType;
        } else {
            if ("addcreditcard".equalsIgnoreCase(uri.getAuthority())) {
                tje.N(this.c, null, null, new BannerDeeplinkRouterImpl$launchAddCreditCard$1(this, bannerType, slsVar, str, null), 3);
                return true;
            }
            aVar = this;
            str2 = str;
            bannerType2 = bannerType;
            if ("open_url_for_identifier".equalsIgnoreCase(uri.getAuthority())) {
                i3y i3yVar = aVar.f.b;
                ((ru.yandex.taxi.web.deeplink.m) i3yVar.getValue()).i();
                ((pep0) aVar.d).f((ru.yandex.taxi.web.deeplink.m) i3yVar.getValue(), new kq41(uri, slsVar), hxx.a);
                return true;
            }
        }
        ltc ltcVar = aVar.b;
        try {
            ((a60) aVar.a).c(str2, m4b1.c(bannerType2));
            return false;
        } catch (ActivityNotFoundException e) {
            ((iux0) ltcVar).b(str2, e);
            return false;
        } catch (SecurityException e2) {
            ((iux0) ltcVar).b(str2, e2);
            return false;
        }
    }
}
