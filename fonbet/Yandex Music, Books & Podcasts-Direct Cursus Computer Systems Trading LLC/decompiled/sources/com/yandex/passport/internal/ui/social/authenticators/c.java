package com.yandex.passport.internal.ui.social.authenticators;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.network.client.h;
import com.yandex.passport.internal.network.client.i;
import com.yandex.passport.internal.network.client.j;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.k1;
import com.yandex.passport.internal.report.pb;
import com.yandex.passport.internal.report.qb;
import com.yandex.passport.internal.report.rb;
import com.yandex.passport.internal.report.reporters.a1;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.wb;
import com.yandex.passport.internal.report.yb;
import com.yandex.passport.internal.ui.browser.SocialBrowserActivity;
import com.yandex.passport.internal.ui.social.mail.MailPasswordLoginActivity;
import com.yandex.passport.internal.ui.social.p;
import com.yandex.passport.internal.ui.social.q;
import com.yandex.passport.internal.ui.social.r;
import com.yandex.passport.internal.ui.social.t;
import com.yandex.passport.internal.ui.util.s;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.usecase.ui.l;
import com.yandex.passport.internal.util.k;
import com.yandex.passport.legacy.lx.g;
import defpackage.b6e;
import defpackage.ca8;
import defpackage.cq4;
import defpackage.dq7;
import defpackage.l1p;
import defpackage.mn7;
import defpackage.ot0;
import defpackage.u13;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends f {
    public String A;
    public final k s;
    public final com.yandex.passport.internal.usecase.authorize.f t;
    public final l u;
    public final com.yandex.passport.internal.usecase.authorize.c v;
    public final com.yandex.passport.internal.core.accounts.e w;
    public final com.yandex.passport.internal.account.d x;
    public final h y;
    public final x z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.passport.internal.ui.social.h hVar, k kVar, com.yandex.passport.internal.usecase.authorize.f fVar, l lVar, com.yandex.passport.internal.usecase.authorize.c cVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.account.d dVar, a1 a1Var, h hVar2, x xVar, com.yandex.passport.internal.properties.l lVar2, a0 a0Var, Bundle bundle, boolean z) {
        super(lVar2, a0Var, bundle, z, hVar, a1Var);
        kVar.getClass();
        fVar.getClass();
        lVar.getClass();
        cVar.getClass();
        eVar.getClass();
        dVar.getClass();
        hVar2.getClass();
        xVar.getClass();
        lVar2.getClass();
        a0Var.getClass();
        this.s = kVar;
        this.t = fVar;
        this.u = lVar;
        this.v = cVar;
        this.w = eVar;
        this.x = dVar;
        this.y = hVar2;
        this.z = xVar;
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void G() {
        com.yandex.passport.internal.ui.base.l lVar;
        com.yandex.passport.internal.ui.social.h hVar = (com.yandex.passport.internal.ui.social.h) this.n;
        this.o.v(this.l, this.m, hVar.a);
        if (hVar instanceof com.yandex.passport.internal.ui.social.c) {
            final int i = 0;
            lVar = new com.yandex.passport.internal.ui.base.l(new g(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.g
                public final Object b(Object obj) {
                    int i2 = i;
                    c cVar = this.b;
                    Context context = (Context) obj;
                    switch (i2) {
                        case 0:
                            cVar.A = com.yandex.passport.internal.util.b.b();
                            h hVar2 = cVar.y;
                            com.yandex.passport.internal.properties.l lVar2 = cVar.k;
                            j b = hVar2.b(com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a));
                            a0 a0Var = cVar.l;
                            context.getClass();
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            k kVar = cVar.s;
                            String str = cVar.A;
                            str.getClass();
                            kVar.getClass();
                            String a = k.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.n).b;
                            y1 y1Var = lVar2.e;
                            Locale locale = cVar.z.r;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            locale.getClass();
                            com.yandex.passport.common.common.a aVar = b.f;
                            a0Var.getClass();
                            y1Var.getClass();
                            com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(i.a[a0Var.d().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", dVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, dVar.a()).appendQueryParameter("provider", a0Var.d().a).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter(CommonUrlParts.LOCALE, locale.getCountry()).appendQueryParameter("theme", s.b(y1Var)).appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter("device_id", d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter("application", str2);
                            }
                            String builder = appendQueryParameter.toString();
                            builder.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(builder));
                        case 1:
                            j b3 = cVar.y.b(com.yandex.plus.core.network.api.utils.a.L(cVar.k.d.a));
                            a0 a0Var2 = cVar.l;
                            String str3 = a0Var2.d().a;
                            context.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(b3.b(str3, com.yandex.passport.common.browser.c.b(context), a0Var2.c, a0Var2.e)));
                        case 2:
                            int i3 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar3 = cVar.k;
                            com.yandex.passport.api.impl.b bVar = lVar3.d.a;
                            context.getClass();
                            y1 y1Var2 = lVar3.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var3 = com.yandex.passport.internal.ui.webview.webcases.a0.SOCIAL_AUTH;
                            a0 a0Var4 = cVar.l;
                            String str4 = ((com.yandex.passport.internal.ui.social.g) cVar.n).b;
                            a0Var4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", a0Var4);
                            bundle.putString("native-application", str4);
                            return com.yandex.passport.data.network.token.i.e(bVar, context, y1Var2, a0Var3, bundle);
                        case 3:
                            int i4 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar4 = cVar.k;
                            com.yandex.passport.api.impl.b bVar2 = lVar4.d.a;
                            context.getClass();
                            y1 y1Var3 = lVar4.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var5 = com.yandex.passport.internal.ui.webview.webcases.a0.MAIL_OAUTH;
                            a0 a0Var6 = cVar.l;
                            a0Var6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", a0Var6);
                            return com.yandex.passport.data.network.token.i.e(bVar2, context, y1Var3, a0Var5, bundle2);
                        case 4:
                            int i5 = MailPasswordLoginActivity.e;
                            context.getClass();
                            com.yandex.passport.internal.properties.l lVar5 = cVar.k;
                            String str5 = ((com.yandex.passport.internal.ui.social.e) cVar.n).b;
                            lVar5.getClass();
                            Intent intent = new Intent(context, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(lVar5.t());
                            intent.putExtra("suggested-login", str5);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.n).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.n).b;
                    }
                }
            }, 103);
        } else if (Intrinsics.d(hVar, com.yandex.passport.internal.ui.social.b.b)) {
            final int i2 = 1;
            lVar = new com.yandex.passport.internal.ui.base.l(new g(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.g
                public final Object b(Object obj) {
                    int i22 = i2;
                    c cVar = this.b;
                    Context context = (Context) obj;
                    switch (i22) {
                        case 0:
                            cVar.A = com.yandex.passport.internal.util.b.b();
                            h hVar2 = cVar.y;
                            com.yandex.passport.internal.properties.l lVar2 = cVar.k;
                            j b = hVar2.b(com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a));
                            a0 a0Var = cVar.l;
                            context.getClass();
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            k kVar = cVar.s;
                            String str = cVar.A;
                            str.getClass();
                            kVar.getClass();
                            String a = k.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.n).b;
                            y1 y1Var = lVar2.e;
                            Locale locale = cVar.z.r;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            locale.getClass();
                            com.yandex.passport.common.common.a aVar = b.f;
                            a0Var.getClass();
                            y1Var.getClass();
                            com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(i.a[a0Var.d().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", dVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, dVar.a()).appendQueryParameter("provider", a0Var.d().a).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter(CommonUrlParts.LOCALE, locale.getCountry()).appendQueryParameter("theme", s.b(y1Var)).appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter("device_id", d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter("application", str2);
                            }
                            String builder = appendQueryParameter.toString();
                            builder.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(builder));
                        case 1:
                            j b3 = cVar.y.b(com.yandex.plus.core.network.api.utils.a.L(cVar.k.d.a));
                            a0 a0Var2 = cVar.l;
                            String str3 = a0Var2.d().a;
                            context.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(b3.b(str3, com.yandex.passport.common.browser.c.b(context), a0Var2.c, a0Var2.e)));
                        case 2:
                            int i3 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar3 = cVar.k;
                            com.yandex.passport.api.impl.b bVar = lVar3.d.a;
                            context.getClass();
                            y1 y1Var2 = lVar3.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var3 = com.yandex.passport.internal.ui.webview.webcases.a0.SOCIAL_AUTH;
                            a0 a0Var4 = cVar.l;
                            String str4 = ((com.yandex.passport.internal.ui.social.g) cVar.n).b;
                            a0Var4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", a0Var4);
                            bundle.putString("native-application", str4);
                            return com.yandex.passport.data.network.token.i.e(bVar, context, y1Var2, a0Var3, bundle);
                        case 3:
                            int i4 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar4 = cVar.k;
                            com.yandex.passport.api.impl.b bVar2 = lVar4.d.a;
                            context.getClass();
                            y1 y1Var3 = lVar4.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var5 = com.yandex.passport.internal.ui.webview.webcases.a0.MAIL_OAUTH;
                            a0 a0Var6 = cVar.l;
                            a0Var6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", a0Var6);
                            return com.yandex.passport.data.network.token.i.e(bVar2, context, y1Var3, a0Var5, bundle2);
                        case 4:
                            int i5 = MailPasswordLoginActivity.e;
                            context.getClass();
                            com.yandex.passport.internal.properties.l lVar5 = cVar.k;
                            String str5 = ((com.yandex.passport.internal.ui.social.e) cVar.n).b;
                            lVar5.getClass();
                            Intent intent = new Intent(context, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(lVar5.t());
                            intent.putExtra("suggested-login", str5);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.n).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.n).b;
                    }
                }
            }, 102);
        } else if (hVar instanceof com.yandex.passport.internal.ui.social.g) {
            final int i3 = 2;
            lVar = new com.yandex.passport.internal.ui.base.l(new g(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.g
                public final Object b(Object obj) {
                    int i22 = i3;
                    c cVar = this.b;
                    Context context = (Context) obj;
                    switch (i22) {
                        case 0:
                            cVar.A = com.yandex.passport.internal.util.b.b();
                            h hVar2 = cVar.y;
                            com.yandex.passport.internal.properties.l lVar2 = cVar.k;
                            j b = hVar2.b(com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a));
                            a0 a0Var = cVar.l;
                            context.getClass();
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            k kVar = cVar.s;
                            String str = cVar.A;
                            str.getClass();
                            kVar.getClass();
                            String a = k.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.n).b;
                            y1 y1Var = lVar2.e;
                            Locale locale = cVar.z.r;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            locale.getClass();
                            com.yandex.passport.common.common.a aVar = b.f;
                            a0Var.getClass();
                            y1Var.getClass();
                            com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(i.a[a0Var.d().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", dVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, dVar.a()).appendQueryParameter("provider", a0Var.d().a).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter(CommonUrlParts.LOCALE, locale.getCountry()).appendQueryParameter("theme", s.b(y1Var)).appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter("device_id", d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter("application", str2);
                            }
                            String builder = appendQueryParameter.toString();
                            builder.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(builder));
                        case 1:
                            j b3 = cVar.y.b(com.yandex.plus.core.network.api.utils.a.L(cVar.k.d.a));
                            a0 a0Var2 = cVar.l;
                            String str3 = a0Var2.d().a;
                            context.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(b3.b(str3, com.yandex.passport.common.browser.c.b(context), a0Var2.c, a0Var2.e)));
                        case 2:
                            int i32 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar3 = cVar.k;
                            com.yandex.passport.api.impl.b bVar = lVar3.d.a;
                            context.getClass();
                            y1 y1Var2 = lVar3.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var3 = com.yandex.passport.internal.ui.webview.webcases.a0.SOCIAL_AUTH;
                            a0 a0Var4 = cVar.l;
                            String str4 = ((com.yandex.passport.internal.ui.social.g) cVar.n).b;
                            a0Var4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", a0Var4);
                            bundle.putString("native-application", str4);
                            return com.yandex.passport.data.network.token.i.e(bVar, context, y1Var2, a0Var3, bundle);
                        case 3:
                            int i4 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar4 = cVar.k;
                            com.yandex.passport.api.impl.b bVar2 = lVar4.d.a;
                            context.getClass();
                            y1 y1Var3 = lVar4.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var5 = com.yandex.passport.internal.ui.webview.webcases.a0.MAIL_OAUTH;
                            a0 a0Var6 = cVar.l;
                            a0Var6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", a0Var6);
                            return com.yandex.passport.data.network.token.i.e(bVar2, context, y1Var3, a0Var5, bundle2);
                        case 4:
                            int i5 = MailPasswordLoginActivity.e;
                            context.getClass();
                            com.yandex.passport.internal.properties.l lVar5 = cVar.k;
                            String str5 = ((com.yandex.passport.internal.ui.social.e) cVar.n).b;
                            lVar5.getClass();
                            Intent intent = new Intent(context, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(lVar5.t());
                            intent.putExtra("suggested-login", str5);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.n).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.n).b;
                    }
                }
            }, 101);
        } else if (Intrinsics.d(hVar, com.yandex.passport.internal.ui.social.b.c)) {
            final int i4 = 3;
            lVar = new com.yandex.passport.internal.ui.base.l(new g(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.g
                public final Object b(Object obj) {
                    int i22 = i4;
                    c cVar = this.b;
                    Context context = (Context) obj;
                    switch (i22) {
                        case 0:
                            cVar.A = com.yandex.passport.internal.util.b.b();
                            h hVar2 = cVar.y;
                            com.yandex.passport.internal.properties.l lVar2 = cVar.k;
                            j b = hVar2.b(com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a));
                            a0 a0Var = cVar.l;
                            context.getClass();
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            k kVar = cVar.s;
                            String str = cVar.A;
                            str.getClass();
                            kVar.getClass();
                            String a = k.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.n).b;
                            y1 y1Var = lVar2.e;
                            Locale locale = cVar.z.r;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            locale.getClass();
                            com.yandex.passport.common.common.a aVar = b.f;
                            a0Var.getClass();
                            y1Var.getClass();
                            com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(i.a[a0Var.d().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", dVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, dVar.a()).appendQueryParameter("provider", a0Var.d().a).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter(CommonUrlParts.LOCALE, locale.getCountry()).appendQueryParameter("theme", s.b(y1Var)).appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter("device_id", d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter("application", str2);
                            }
                            String builder = appendQueryParameter.toString();
                            builder.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(builder));
                        case 1:
                            j b3 = cVar.y.b(com.yandex.plus.core.network.api.utils.a.L(cVar.k.d.a));
                            a0 a0Var2 = cVar.l;
                            String str3 = a0Var2.d().a;
                            context.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(b3.b(str3, com.yandex.passport.common.browser.c.b(context), a0Var2.c, a0Var2.e)));
                        case 2:
                            int i32 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar3 = cVar.k;
                            com.yandex.passport.api.impl.b bVar = lVar3.d.a;
                            context.getClass();
                            y1 y1Var2 = lVar3.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var3 = com.yandex.passport.internal.ui.webview.webcases.a0.SOCIAL_AUTH;
                            a0 a0Var4 = cVar.l;
                            String str4 = ((com.yandex.passport.internal.ui.social.g) cVar.n).b;
                            a0Var4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", a0Var4);
                            bundle.putString("native-application", str4);
                            return com.yandex.passport.data.network.token.i.e(bVar, context, y1Var2, a0Var3, bundle);
                        case 3:
                            int i42 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar4 = cVar.k;
                            com.yandex.passport.api.impl.b bVar2 = lVar4.d.a;
                            context.getClass();
                            y1 y1Var3 = lVar4.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var5 = com.yandex.passport.internal.ui.webview.webcases.a0.MAIL_OAUTH;
                            a0 a0Var6 = cVar.l;
                            a0Var6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", a0Var6);
                            return com.yandex.passport.data.network.token.i.e(bVar2, context, y1Var3, a0Var5, bundle2);
                        case 4:
                            int i5 = MailPasswordLoginActivity.e;
                            context.getClass();
                            com.yandex.passport.internal.properties.l lVar5 = cVar.k;
                            String str5 = ((com.yandex.passport.internal.ui.social.e) cVar.n).b;
                            lVar5.getClass();
                            Intent intent = new Intent(context, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(lVar5.t());
                            intent.putExtra("suggested-login", str5);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.n).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.n).b;
                    }
                }
            }, 100);
        } else if (hVar instanceof com.yandex.passport.internal.ui.social.e) {
            final int i5 = 4;
            lVar = new com.yandex.passport.internal.ui.base.l(new g(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.g
                public final Object b(Object obj) {
                    int i22 = i5;
                    c cVar = this.b;
                    Context context = (Context) obj;
                    switch (i22) {
                        case 0:
                            cVar.A = com.yandex.passport.internal.util.b.b();
                            h hVar2 = cVar.y;
                            com.yandex.passport.internal.properties.l lVar2 = cVar.k;
                            j b = hVar2.b(com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a));
                            a0 a0Var = cVar.l;
                            context.getClass();
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            k kVar = cVar.s;
                            String str = cVar.A;
                            str.getClass();
                            kVar.getClass();
                            String a = k.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.n).b;
                            y1 y1Var = lVar2.e;
                            Locale locale = cVar.z.r;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            locale.getClass();
                            com.yandex.passport.common.common.a aVar = b.f;
                            a0Var.getClass();
                            y1Var.getClass();
                            com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(i.a[a0Var.d().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", dVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, dVar.a()).appendQueryParameter("provider", a0Var.d().a).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter(CommonUrlParts.LOCALE, locale.getCountry()).appendQueryParameter("theme", s.b(y1Var)).appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter("device_id", d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter("application", str2);
                            }
                            String builder = appendQueryParameter.toString();
                            builder.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(builder));
                        case 1:
                            j b3 = cVar.y.b(com.yandex.plus.core.network.api.utils.a.L(cVar.k.d.a));
                            a0 a0Var2 = cVar.l;
                            String str3 = a0Var2.d().a;
                            context.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(b3.b(str3, com.yandex.passport.common.browser.c.b(context), a0Var2.c, a0Var2.e)));
                        case 2:
                            int i32 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar3 = cVar.k;
                            com.yandex.passport.api.impl.b bVar = lVar3.d.a;
                            context.getClass();
                            y1 y1Var2 = lVar3.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var3 = com.yandex.passport.internal.ui.webview.webcases.a0.SOCIAL_AUTH;
                            a0 a0Var4 = cVar.l;
                            String str4 = ((com.yandex.passport.internal.ui.social.g) cVar.n).b;
                            a0Var4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", a0Var4);
                            bundle.putString("native-application", str4);
                            return com.yandex.passport.data.network.token.i.e(bVar, context, y1Var2, a0Var3, bundle);
                        case 3:
                            int i42 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar4 = cVar.k;
                            com.yandex.passport.api.impl.b bVar2 = lVar4.d.a;
                            context.getClass();
                            y1 y1Var3 = lVar4.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var5 = com.yandex.passport.internal.ui.webview.webcases.a0.MAIL_OAUTH;
                            a0 a0Var6 = cVar.l;
                            a0Var6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", a0Var6);
                            return com.yandex.passport.data.network.token.i.e(bVar2, context, y1Var3, a0Var5, bundle2);
                        case 4:
                            int i52 = MailPasswordLoginActivity.e;
                            context.getClass();
                            com.yandex.passport.internal.properties.l lVar5 = cVar.k;
                            String str5 = ((com.yandex.passport.internal.ui.social.e) cVar.n).b;
                            lVar5.getClass();
                            Intent intent = new Intent(context, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(lVar5.t());
                            intent.putExtra("suggested-login", str5);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.n).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.n).b;
                    }
                }
            }, 106);
        } else if (hVar instanceof com.yandex.passport.internal.ui.social.d) {
            final int i6 = 5;
            lVar = new com.yandex.passport.internal.ui.base.l(new g(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.g
                public final Object b(Object obj) {
                    int i22 = i6;
                    c cVar = this.b;
                    Context context = (Context) obj;
                    switch (i22) {
                        case 0:
                            cVar.A = com.yandex.passport.internal.util.b.b();
                            h hVar2 = cVar.y;
                            com.yandex.passport.internal.properties.l lVar2 = cVar.k;
                            j b = hVar2.b(com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a));
                            a0 a0Var = cVar.l;
                            context.getClass();
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            k kVar = cVar.s;
                            String str = cVar.A;
                            str.getClass();
                            kVar.getClass();
                            String a = k.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.n).b;
                            y1 y1Var = lVar2.e;
                            Locale locale = cVar.z.r;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            locale.getClass();
                            com.yandex.passport.common.common.a aVar = b.f;
                            a0Var.getClass();
                            y1Var.getClass();
                            com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(i.a[a0Var.d().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", dVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, dVar.a()).appendQueryParameter("provider", a0Var.d().a).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter(CommonUrlParts.LOCALE, locale.getCountry()).appendQueryParameter("theme", s.b(y1Var)).appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter("device_id", d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter("application", str2);
                            }
                            String builder = appendQueryParameter.toString();
                            builder.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(builder));
                        case 1:
                            j b3 = cVar.y.b(com.yandex.plus.core.network.api.utils.a.L(cVar.k.d.a));
                            a0 a0Var2 = cVar.l;
                            String str3 = a0Var2.d().a;
                            context.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(b3.b(str3, com.yandex.passport.common.browser.c.b(context), a0Var2.c, a0Var2.e)));
                        case 2:
                            int i32 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar3 = cVar.k;
                            com.yandex.passport.api.impl.b bVar = lVar3.d.a;
                            context.getClass();
                            y1 y1Var2 = lVar3.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var3 = com.yandex.passport.internal.ui.webview.webcases.a0.SOCIAL_AUTH;
                            a0 a0Var4 = cVar.l;
                            String str4 = ((com.yandex.passport.internal.ui.social.g) cVar.n).b;
                            a0Var4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", a0Var4);
                            bundle.putString("native-application", str4);
                            return com.yandex.passport.data.network.token.i.e(bVar, context, y1Var2, a0Var3, bundle);
                        case 3:
                            int i42 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar4 = cVar.k;
                            com.yandex.passport.api.impl.b bVar2 = lVar4.d.a;
                            context.getClass();
                            y1 y1Var3 = lVar4.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var5 = com.yandex.passport.internal.ui.webview.webcases.a0.MAIL_OAUTH;
                            a0 a0Var6 = cVar.l;
                            a0Var6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", a0Var6);
                            return com.yandex.passport.data.network.token.i.e(bVar2, context, y1Var3, a0Var5, bundle2);
                        case 4:
                            int i52 = MailPasswordLoginActivity.e;
                            context.getClass();
                            com.yandex.passport.internal.properties.l lVar5 = cVar.k;
                            String str5 = ((com.yandex.passport.internal.ui.social.e) cVar.n).b;
                            lVar5.getClass();
                            Intent intent = new Intent(context, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(lVar5.t());
                            intent.putExtra("suggested-login", str5);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.n).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.n).b;
                    }
                }
            }, 105);
        } else if (!(hVar instanceof com.yandex.passport.internal.ui.social.f)) {
            b6e.s();
            return;
        } else {
            final int i7 = 6;
            lVar = new com.yandex.passport.internal.ui.base.l(new g(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.g
                public final Object b(Object obj) {
                    int i22 = i7;
                    c cVar = this.b;
                    Context context = (Context) obj;
                    switch (i22) {
                        case 0:
                            cVar.A = com.yandex.passport.internal.util.b.b();
                            h hVar2 = cVar.y;
                            com.yandex.passport.internal.properties.l lVar2 = cVar.k;
                            j b = hVar2.b(com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a));
                            a0 a0Var = cVar.l;
                            context.getClass();
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            k kVar = cVar.s;
                            String str = cVar.A;
                            str.getClass();
                            kVar.getClass();
                            String a = k.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.n).b;
                            y1 y1Var = lVar2.e;
                            Locale locale = cVar.z.r;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            locale.getClass();
                            com.yandex.passport.common.common.a aVar = b.f;
                            a0Var.getClass();
                            y1Var.getClass();
                            com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(i.a[a0Var.d().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", dVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, dVar.a()).appendQueryParameter("provider", a0Var.d().a).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter(CommonUrlParts.LOCALE, locale.getCountry()).appendQueryParameter("theme", s.b(y1Var)).appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter("device_id", d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter("application", str2);
                            }
                            String builder = appendQueryParameter.toString();
                            builder.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(builder));
                        case 1:
                            j b3 = cVar.y.b(com.yandex.plus.core.network.api.utils.a.L(cVar.k.d.a));
                            a0 a0Var2 = cVar.l;
                            String str3 = a0Var2.d().a;
                            context.getClass();
                            return SocialBrowserActivity.a(context, Uri.parse(b3.b(str3, com.yandex.passport.common.browser.c.b(context), a0Var2.c, a0Var2.e)));
                        case 2:
                            int i32 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar3 = cVar.k;
                            com.yandex.passport.api.impl.b bVar = lVar3.d.a;
                            context.getClass();
                            y1 y1Var2 = lVar3.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var3 = com.yandex.passport.internal.ui.webview.webcases.a0.SOCIAL_AUTH;
                            a0 a0Var4 = cVar.l;
                            String str4 = ((com.yandex.passport.internal.ui.social.g) cVar.n).b;
                            a0Var4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", a0Var4);
                            bundle.putString("native-application", str4);
                            return com.yandex.passport.data.network.token.i.e(bVar, context, y1Var2, a0Var3, bundle);
                        case 3:
                            int i42 = WebViewActivity.h;
                            com.yandex.passport.internal.properties.l lVar4 = cVar.k;
                            com.yandex.passport.api.impl.b bVar2 = lVar4.d.a;
                            context.getClass();
                            y1 y1Var3 = lVar4.e;
                            com.yandex.passport.internal.ui.webview.webcases.a0 a0Var5 = com.yandex.passport.internal.ui.webview.webcases.a0.MAIL_OAUTH;
                            a0 a0Var6 = cVar.l;
                            a0Var6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", a0Var6);
                            return com.yandex.passport.data.network.token.i.e(bVar2, context, y1Var3, a0Var5, bundle2);
                        case 4:
                            int i52 = MailPasswordLoginActivity.e;
                            context.getClass();
                            com.yandex.passport.internal.properties.l lVar5 = cVar.k;
                            String str5 = ((com.yandex.passport.internal.ui.social.e) cVar.n).b;
                            lVar5.getClass();
                            Intent intent = new Intent(context, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(lVar5.t());
                            intent.putExtra("suggested-login", str5);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.n).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.n).b;
                    }
                }
            }, 104);
        }
        N(lVar);
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void H(Bundle bundle) {
        if (bundle != null) {
            this.A = bundle.getString("code-challenge");
        }
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void J(Bundle bundle) {
        bundle.getClass();
        bundle.putString("code-challenge", this.A);
    }

    public final void L() {
        a1 a1Var = this.o;
        a1Var.getClass();
        a0 a0Var = this.l;
        a0Var.getClass();
        a1Var.n(qb.d, new ff(a1.u(a0Var), 7, false), new ve(a1Var.c, 25));
        ((t) this.r.a.getValue()).getClass();
        q qVar = q.a;
        xdr xdrVar = this.q;
        xdrVar.getClass();
        xdrVar.m(null, qVar);
    }

    public final void M(Throwable th) {
        a1 a1Var = this.o;
        a1Var.getClass();
        a0 a0Var = this.l;
        a0Var.getClass();
        a1Var.n(rb.d, new ff(a1.u(a0Var), 7, false), new ff(th), new ve(a1Var.c, 25));
        ((t) this.r.a.getValue()).getClass();
        r rVar = new r(this.p.a(th));
        xdr xdrVar = this.q;
        xdrVar.getClass();
        xdrVar.m(null, rVar);
    }

    public final void N(com.yandex.passport.internal.ui.base.l lVar) {
        int i = lVar.b;
        a1 a1Var = this.o;
        a1Var.getClass();
        a0 a0Var = this.l;
        a0Var.getClass();
        a1Var.n(wb.d, new ff(a1.u(a0Var), 7, false), new ve(i, 19), new ve(a1Var.c, 25));
        ((t) this.r.a.getValue()).getClass();
        com.yandex.passport.internal.ui.social.s sVar = new com.yandex.passport.internal.ui.social.s(lVar);
        xdr xdrVar = this.q;
        xdrVar.getClass();
        xdrVar.m(null, sVar);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    public final void O(com.yandex.passport.internal.l lVar) {
        String str;
        lVar.getClass();
        a1 a1Var = this.o;
        a1Var.getClass();
        com.yandex.passport.common.core.f fVar = lVar.b;
        int i = lVar.e.h;
        if (i == 6) {
            str = (String) a1.d.get(lVar.k());
            if (str == null) {
                str = LegacyAccountType.STRING_SOCIAL;
            }
        } else if (i != 12) {
            str = LegacyAccountType.STRING_LOGIN;
        } else {
            str = (String) a1.e.get(lVar.k());
            if (str == null) {
                str = "mailish";
            }
        }
        a1Var.n(k1.d, new com.yandex.passport.internal.report.f(PListParser.TAG_FALSE, 10), new ff(str, 7, false), new com.yandex.passport.internal.report.c(String.valueOf(fVar.b), 3), new ve(a1Var.c, 25));
        String str2 = ((com.yandex.passport.internal.ui.social.h) this.n).a;
        a0 a0Var = this.l;
        a0Var.getClass();
        a1Var.n(yb.d, new ff(a1.u(a0Var), 7, false), new com.yandex.passport.internal.report.c(String.valueOf(fVar.b), 3), new com.yandex.passport.internal.report.f(20, this.m), new ve(str2, 5, false), new ve(a1Var.c, 25));
        ((t) this.r.a.getValue()).getClass();
        p pVar = new p(lVar);
        xdr xdrVar = this.q;
        xdrVar.getClass();
        xdrVar.m(null, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void a(int i, int i2, Intent intent) {
        a1 a1Var = this.o;
        a1Var.getClass();
        a0 a0Var = this.l;
        a0Var.getClass();
        int i3 = 2;
        a1Var.n(pb.d, new ff(a1.u(a0Var), 7, false), new ve(i, 19), new ve(i2, 21), new ve(a1Var.c, 25));
        switch (i) {
            case 100:
                if (i2 != -1) {
                    if (i2 != 0) {
                        return;
                    }
                    L();
                    return;
                }
                intent.getClass();
                int i4 = WebViewActivity.h;
                Parcelable parcelableExtra = intent.getParcelableExtra("webview-result");
                if (parcelableExtra == null) {
                    xq0.q("webview-result is missing");
                    return;
                }
                String queryParameter = Uri.parse(((com.yandex.passport.internal.entities.h) parcelableExtra).d).getQueryParameter("task_id");
                if (queryParameter == null) {
                    M(new RuntimeException("task_id not found"));
                    return;
                } else {
                    x97.y(ot0.F(this), null, null, new b(this, queryParameter, r4, i3), 3);
                    return;
                }
            case 101:
                if (i2 != -1 || intent == null) {
                    if (i2 == 0) {
                        L();
                        return;
                    }
                    return;
                } else {
                    int i5 = WebViewActivity.h;
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("webview-result");
                    if (parcelableExtra2 != null) {
                        x97.y(ot0.F(this), null, null, new com.yandex.passport.internal.ui.sloth.q(this, (com.yandex.passport.internal.entities.h) parcelableExtra2, (Continuation) null, 13), 3);
                        return;
                    } else {
                        xq0.q("webview-result is missing");
                        return;
                    }
                }
            case 102:
                if (i2 != -1 || intent == null) {
                    L();
                    return;
                }
                Uri data = intent.getData();
                data.getClass();
                String queryParameter2 = data.getQueryParameter("task_id");
                if (queryParameter2 == null) {
                    M(new RuntimeException("task_id not found"));
                    return;
                } else {
                    x97.y(ot0.F(this), null, null, new b(this, queryParameter2, r4, 0), 3);
                    return;
                }
            case 103:
                if (i2 != -1 || intent == null) {
                    L();
                    return;
                }
                Uri data2 = intent.getData();
                data2.getClass();
                String queryParameter3 = data2.getQueryParameter("yandex_authorization_code");
                if (this.A == null) {
                    M(new RuntimeException("Code challenge null"));
                    return;
                } else if (queryParameter3 == null) {
                    M(new RuntimeException("Code null"));
                    return;
                } else {
                    x97.y(ot0.F(this), null, null, new b(this, queryParameter3, r4, 1), 3);
                    return;
                }
            case 104:
                if (i2 != -1) {
                    if (i2 == 100) {
                        K();
                        return;
                    }
                    if ((intent != null ? intent.getSerializableExtra(Constants.KEY_EXCEPTION) : 0) == 0) {
                        L();
                        return;
                    }
                    Throwable th = (Throwable) intent.getSerializableExtra(Constants.KEY_EXCEPTION);
                    th.getClass();
                    M(th);
                    return;
                }
                if (intent == null) {
                    M(new RuntimeException("Intent data null"));
                    return;
                }
                String stringExtra = intent.getStringExtra("social-token");
                if (stringExtra == null) {
                    M(new RuntimeException("Social token null"));
                    return;
                }
                String stringExtra2 = intent.getStringExtra("application-id");
                stringExtra2.getClass();
                N(new com.yandex.passport.internal.ui.base.l(new u13(23, this, stringExtra, stringExtra2), 107));
                return;
            case 105:
                if (i2 != -1) {
                    if (i2 == 100) {
                        K();
                        return;
                    }
                    if ((intent != null ? intent.getSerializableExtra(Constants.KEY_EXCEPTION) : null) == null) {
                        L();
                        return;
                    }
                    Throwable th2 = (Throwable) intent.getSerializableExtra(Constants.KEY_EXCEPTION);
                    th2.getClass();
                    M(th2);
                    return;
                }
                if (intent == null) {
                    M(new RuntimeException("Intent data null"));
                    return;
                }
                String stringExtra3 = intent.getStringExtra("social-token");
                if (stringExtra3 == null) {
                    M(new RuntimeException("Social token null"));
                    return;
                }
                String stringExtra4 = intent.getStringExtra("application-id");
                stringExtra4.getClass();
                cq4 F = ot0.F(this);
                dq7 dq7Var = ca8.a;
                x97.y(F, mn7.d, null, new l1p(this, stringExtra3, stringExtra4, r4, 21), 2);
                return;
            case 106:
                if (i2 != -1) {
                    L();
                    return;
                }
                if (intent == null) {
                    M(new RuntimeException("Intent data null"));
                    return;
                }
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    M(new RuntimeException("No extras in bundle"));
                    return;
                }
                com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) com.appsflyer.internal.k.h(extras, com.yandex.passport.internal.util.p.class, "passport-uid");
                if (fVar != null) {
                    com.yandex.passport.internal.l e = this.w.a().e(fVar);
                    if (e != null) {
                        O(e);
                        return;
                    }
                    return;
                }
                throw new ParcelFormatException("Invalid parcelable " + com.yandex.passport.common.core.f.class.getSimpleName() + " in the bundle");
            case 107:
                if (i2 != -1) {
                    L();
                    return;
                }
                if (intent == null) {
                    M(new RuntimeException("Intent data null"));
                    return;
                }
                String stringExtra5 = intent.getStringExtra("master-token");
                if (stringExtra5 == null) {
                    xq0.q("master-token is missing");
                    return;
                }
                if (stringExtra5.length() <= 0 || stringExtra5.equals("-")) {
                    stringExtra5 = null;
                }
                com.yandex.passport.common.account.a aVar = new com.yandex.passport.common.account.a(stringExtra5);
                cq4 F2 = ot0.F(this);
                dq7 dq7Var2 = ca8.a;
                x97.y(F2, mn7.d, null, new com.yandex.passport.internal.storage.a(this, aVar, r4, 27), 2);
                return;
            default:
                return;
        }
    }
}
