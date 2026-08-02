package com.yandex.passport.internal.usecase.ui;

import android.net.Uri;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.wis;
import defpackage.z7o;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class w0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.common.ui.lang.b b;
    public final com.yandex.passport.internal.network.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.network.d dVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        bVar.getClass();
        dVar.getClass();
        this.b = bVar;
        this.c = dVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        Object t7oVar;
        u0 u0Var = (u0) obj;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = new com.yandex.passport.common.url.b(u(u0Var));
        } catch (wis e) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th);
        }
        return new z7o(t7oVar);
    }

    public final String u(u0 u0Var) {
        String str;
        com.yandex.passport.common.core.f fVar = u0Var.a;
        String str2 = u0Var.b;
        com.yandex.passport.common.core.b bVar = fVar.a;
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri.Builder scheme = new Uri.Builder().scheme("https");
        int[] iArr = v0.a;
        Uri.Builder appendQueryParameter = scheme.authority(iArr[bVar.ordinal()] == 1 ? "oauth.yandex.ru" : "oauth-test.yandex.ru").appendPath("authorize").appendQueryParameter("client_id", str2).appendQueryParameter("response_type", u0Var.c).appendQueryParameter("force_confirm", String.valueOf(u0Var.d)).appendQueryParameter("origin", "yandex_auth_sdk_android");
        Locale b = ((com.yandex.passport.internal.ui.lang.a) this.b).b();
        int i = com.yandex.passport.common.ui.lang.a.a;
        String language = b.getLanguage();
        language.getClass();
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("language", language);
        com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) this.c;
        String uri = Uri.parse(hVar.b(bVar, str2)).buildUpon().appendPath("auth").appendPath("finish").appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM).build().toString();
        uri.getClass();
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("redirect_uri", uri);
        if (iArr[bVar.ordinal()] == 1) {
            str = hVar.m(bVar, null) + "/finish?status=cancel&error=access_denied";
        } else {
            str = hVar.m(bVar, null) + "/finish?status=cancel&error=access_denied";
        }
        Uri build = appendQueryParameter3.appendQueryParameter("backpath", str).appendQueryParameter(CommonUrlParts.APP_ID, u0Var.e).appendQueryParameter("fingerprint", u0Var.f).appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM).appendQueryParameter("state", u0Var.g).build();
        build.getClass();
        aVar.getClass();
        String uri2 = build.toString();
        uri2.getClass();
        return uri2;
    }
}
