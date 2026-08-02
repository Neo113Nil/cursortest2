package ru.yandex.taxi.web.deeplink;

import defpackage.ab60;
import defpackage.ene;
import defpackage.evu0;
import defpackage.fn21;
import defpackage.fne;
import defpackage.gne;
import defpackage.io60;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ny61;
import defpackage.pne;
import defpackage.r941;
import defpackage.u5o;
import defpackage.ua41;
import defpackage.w511;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes6.dex */
public final class a {
    public final ru.yandex.taxi.am.token.a a;
    public final o b;
    public final ru.yandex.taxi.superapp.f c;
    public final fn21 d;

    public a(ru.yandex.taxi.am.token.a aVar, o oVar, ru.yandex.taxi.superapp.f fVar, fn21 fn21Var) {
        this.a = aVar;
        this.b = oVar;
        this.c = fVar;
        this.d = fn21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl, CoreWebViewConfig.a aVar, WebViewFromDeeplinkExperiment.a aVar2) {
        WebViewAuthHeaderInteractor$addAuth$1 webViewAuthHeaderInteractor$addAuth$1;
        Object obj;
        int i;
        WebViewFromDeeplinkExperiment.AuthVariant authVariant;
        Object d;
        String str;
        Object b;
        String str2;
        WebViewFromDeeplinkExperiment.a aVar3;
        CoreWebViewConfig.a aVar4;
        boolean booleanValue;
        if (continuationImpl instanceof WebViewAuthHeaderInteractor$addAuth$1) {
            webViewAuthHeaderInteractor$addAuth$1 = (WebViewAuthHeaderInteractor$addAuth$1) continuationImpl;
            int i2 = webViewAuthHeaderInteractor$addAuth$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewAuthHeaderInteractor$addAuth$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webViewAuthHeaderInteractor$addAuth$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewAuthHeaderInteractor$addAuth$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    aVar2.getClass();
                    c cVar = WebViewFromDeeplinkExperiment.AuthVariant.Companion;
                    String str3 = aVar2.d;
                    cVar.getClass();
                    WebViewFromDeeplinkExperiment.AuthVariant authVariant2 = WebViewFromDeeplinkExperiment.AuthVariant.PASSPORT_WITH_HEADER;
                    if (jl40.l(str3, authVariant2.getAuthVariantName())) {
                        authVariant = authVariant2;
                    } else {
                        authVariant = WebViewFromDeeplinkExperiment.AuthVariant.HEADER;
                        if (!jl40.l(str3, authVariant.getAuthVariantName())) {
                            authVariant = WebViewFromDeeplinkExperiment.AuthVariant.PASSPORT;
                            if (!jl40.l(str3, authVariant.getAuthVariantName())) {
                                authVariant = WebViewFromDeeplinkExperiment.AuthVariant.NONE;
                                jl40.l(str3, authVariant.getAuthVariantName());
                            }
                        }
                    }
                    if (authVariant == WebViewFromDeeplinkExperiment.AuthVariant.HEADER || authVariant == authVariant2) {
                        webViewAuthHeaderInteractor$addAuth$1.L$0 = aVar2;
                        webViewAuthHeaderInteractor$addAuth$1.L$1 = aVar;
                        webViewAuthHeaderInteractor$addAuth$1.L$2 = authVariant;
                        webViewAuthHeaderInteractor$addAuth$1.label = 1;
                        d = this.a.d(false, webViewAuthHeaderInteractor$addAuth$1);
                    }
                    str = aVar2.b;
                    if (authVariant != WebViewFromDeeplinkExperiment.AuthVariant.PASSPORT_WITH_HEADER || authVariant == WebViewFromDeeplinkExperiment.AuthVariant.PASSPORT) {
                        webViewAuthHeaderInteractor$addAuth$1.L$0 = aVar2;
                        webViewAuthHeaderInteractor$addAuth$1.L$1 = aVar;
                        webViewAuthHeaderInteractor$addAuth$1.L$2 = null;
                        webViewAuthHeaderInteractor$addAuth$1.L$3 = str;
                        webViewAuthHeaderInteractor$addAuth$1.label = 2;
                        b = b(str, webViewAuthHeaderInteractor$addAuth$1);
                        if (b != obj) {
                            CoreWebViewConfig.a aVar5 = aVar;
                            str2 = str;
                            obj2 = b;
                            aVar3 = aVar2;
                            aVar4 = aVar5;
                            booleanValue = ((Boolean) obj2).booleanValue();
                            if (!booleanValue) {
                            }
                        }
                        return obj;
                    }
                    aVar.b = str;
                    if (aVar2.c) {
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = (CoreWebViewConfig.a) webViewAuthHeaderInteractor$addAuth$1.L$1;
                        aVar2 = (WebViewFromDeeplinkExperiment.a) webViewAuthHeaderInteractor$addAuth$1.L$0;
                        kotlin.b.b(obj2);
                        str = (String) obj2;
                        aVar.b = str;
                        if (aVar2.c) {
                            String Hg = ((ru.yandex.taxi.startup.launch.h) this.d).Hg();
                            if (Hg == null) {
                                Hg = "";
                            }
                            aVar.b("X-YaTaxi-UserId", Hg);
                        }
                        return zy11.a;
                    }
                    str2 = (String) webViewAuthHeaderInteractor$addAuth$1.L$3;
                    aVar4 = (CoreWebViewConfig.a) webViewAuthHeaderInteractor$addAuth$1.L$1;
                    aVar3 = (WebViewFromDeeplinkExperiment.a) webViewAuthHeaderInteractor$addAuth$1.L$0;
                    kotlin.b.b(obj2);
                    booleanValue = ((Boolean) obj2).booleanValue();
                    if (!booleanValue) {
                        str = str2;
                        aVar = aVar4;
                        aVar2 = aVar3;
                        aVar.b = str;
                        if (aVar2.c) {
                        }
                        return zy11.a;
                    }
                    webViewAuthHeaderInteractor$addAuth$1.L$0 = aVar3;
                    webViewAuthHeaderInteractor$addAuth$1.L$1 = aVar4;
                    webViewAuthHeaderInteractor$addAuth$1.L$2 = null;
                    webViewAuthHeaderInteractor$addAuth$1.L$3 = null;
                    webViewAuthHeaderInteractor$addAuth$1.Z$0 = booleanValue;
                    webViewAuthHeaderInteractor$addAuth$1.label = 3;
                    obj2 = c(str2, webViewAuthHeaderInteractor$addAuth$1);
                    if (obj2 != obj) {
                        aVar = aVar4;
                        aVar2 = aVar3;
                        str = (String) obj2;
                        aVar.b = str;
                        if (aVar2.c) {
                        }
                        return zy11.a;
                    }
                    return obj;
                }
                WebViewFromDeeplinkExperiment.AuthVariant authVariant3 = (WebViewFromDeeplinkExperiment.AuthVariant) webViewAuthHeaderInteractor$addAuth$1.L$2;
                CoreWebViewConfig.a aVar6 = (CoreWebViewConfig.a) webViewAuthHeaderInteractor$addAuth$1.L$1;
                WebViewFromDeeplinkExperiment.a aVar7 = (WebViewFromDeeplinkExperiment.a) webViewAuthHeaderInteractor$addAuth$1.L$0;
                kotlin.b.b(obj2);
                d = ((Result) obj2).getValue();
                authVariant = authVariant3;
                aVar = aVar6;
                aVar2 = aVar7;
                if (!(d instanceof Result.Failure)) {
                    String str4 = (String) d;
                    if (!evu0.J(str4)) {
                        aVar.b("Authorization", "Bearer ".concat(str4));
                    }
                }
                str = aVar2.b;
                if (authVariant != WebViewFromDeeplinkExperiment.AuthVariant.PASSPORT_WITH_HEADER) {
                }
                webViewAuthHeaderInteractor$addAuth$1.L$0 = aVar2;
                webViewAuthHeaderInteractor$addAuth$1.L$1 = aVar;
                webViewAuthHeaderInteractor$addAuth$1.L$2 = null;
                webViewAuthHeaderInteractor$addAuth$1.L$3 = str;
                webViewAuthHeaderInteractor$addAuth$1.label = 2;
                b = b(str, webViewAuthHeaderInteractor$addAuth$1);
                if (b != obj) {
                }
                return obj;
            }
        }
        webViewAuthHeaderInteractor$addAuth$1 = new WebViewAuthHeaderInteractor$addAuth$1(this, continuationImpl);
        Object obj22 = webViewAuthHeaderInteractor$addAuth$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewAuthHeaderInteractor$addAuth$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        str = aVar2.b;
        if (authVariant != WebViewFromDeeplinkExperiment.AuthVariant.PASSPORT_WITH_HEADER) {
        }
        webViewAuthHeaderInteractor$addAuth$1.L$0 = aVar2;
        webViewAuthHeaderInteractor$addAuth$1.L$1 = aVar;
        webViewAuthHeaderInteractor$addAuth$1.L$2 = null;
        webViewAuthHeaderInteractor$addAuth$1.L$3 = str;
        webViewAuthHeaderInteractor$addAuth$1.label = 2;
        b = b(str, webViewAuthHeaderInteractor$addAuth$1);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        WebViewAuthHeaderInteractor$injectAuthorizationCookie$1 webViewAuthHeaderInteractor$injectAuthorizationCookie$1;
        int i;
        gne gneVar;
        if (continuationImpl instanceof WebViewAuthHeaderInteractor$injectAuthorizationCookie$1) {
            webViewAuthHeaderInteractor$injectAuthorizationCookie$1 = (WebViewAuthHeaderInteractor$injectAuthorizationCookie$1) continuationImpl;
            int i2 = webViewAuthHeaderInteractor$injectAuthorizationCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewAuthHeaderInteractor$injectAuthorizationCookie$1.label = i2 - Integer.MIN_VALUE;
                WebViewAuthHeaderInteractor$injectAuthorizationCookie$1 webViewAuthHeaderInteractor$injectAuthorizationCookie$12 = webViewAuthHeaderInteractor$injectAuthorizationCookie$1;
                Object obj = webViewAuthHeaderInteractor$injectAuthorizationCookie$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewAuthHeaderInteractor$injectAuthorizationCookie$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r941 r941Var = new r941(this);
                    webViewAuthHeaderInteractor$injectAuthorizationCookie$12.L$0 = null;
                    webViewAuthHeaderInteractor$injectAuthorizationCookie$12.label = 1;
                    obj = this.c.b(str, true, false, r941Var, webViewAuthHeaderInteractor$injectAuthorizationCookie$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                gneVar = (gne) obj;
                if (gneVar instanceof ene) {
                    xby.l(jst.e, "WebViewAuthHeaderInteractor:AUTH:COOKIES", null, null, "Cookie inject failed with the reason " + ((ene) gneVar).a, 6);
                }
                return Boolean.valueOf(gneVar instanceof fne);
            }
        }
        webViewAuthHeaderInteractor$injectAuthorizationCookie$1 = new WebViewAuthHeaderInteractor$injectAuthorizationCookie$1(this, continuationImpl);
        WebViewAuthHeaderInteractor$injectAuthorizationCookie$1 webViewAuthHeaderInteractor$injectAuthorizationCookie$122 = webViewAuthHeaderInteractor$injectAuthorizationCookie$1;
        Object obj2 = webViewAuthHeaderInteractor$injectAuthorizationCookie$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewAuthHeaderInteractor$injectAuthorizationCookie$122.label;
        if (i != 0) {
        }
        gneVar = (gne) obj2;
        if (gneVar instanceof ene) {
        }
        return Boolean.valueOf(gneVar instanceof fne);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        WebViewAuthHeaderInteractor$wrapToAuthorizationUrl$1 webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1;
        int i;
        ua41 ua41Var;
        if (continuationImpl instanceof WebViewAuthHeaderInteractor$wrapToAuthorizationUrl$1) {
            webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1 = (WebViewAuthHeaderInteractor$wrapToAuthorizationUrl$1) continuationImpl;
            int i2 = webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AuthType authType = AuthType.COOKIES;
                    webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1.L$0 = str;
                    webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1.label = 1;
                    obj = this.b.b(str, authType, webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                ua41Var = (ua41) obj;
                if (!jl40.l(ua41Var, ab60.a) || (ua41Var instanceof u5o)) {
                    xby.l(jst.e, "WebViewAuthHeaderInteractor:AUTH:COOKIES", null, null, "Wrap to auth url failed with state " + ua41Var, 6);
                    ny61.r("Account not authorized");
                    return null;
                }
                if (ua41Var instanceof pne) {
                    return ((pne) ua41Var).a;
                }
                if (ua41Var instanceof io60) {
                    return str;
                }
                w511.b();
                return null;
            }
        }
        webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1 = new WebViewAuthHeaderInteractor$wrapToAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewAuthHeaderInteractor$wrapToAuthorizationUrl$1.label;
        if (i != 0) {
        }
        ua41Var = (ua41) obj2;
        if (jl40.l(ua41Var, ab60.a)) {
        }
        xby.l(jst.e, "WebViewAuthHeaderInteractor:AUTH:COOKIES", null, null, "Wrap to auth url failed with state " + ua41Var, 6);
        ny61.r("Account not authorized");
        return null;
    }
}
