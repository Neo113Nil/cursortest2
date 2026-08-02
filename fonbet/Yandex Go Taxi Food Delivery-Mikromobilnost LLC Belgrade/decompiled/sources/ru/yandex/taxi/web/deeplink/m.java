package ru.yandex.taxi.web.deeplink;

import android.net.Uri;
import com.yandex.go.modals.progress.api.CircularProgressRouter$Payload;
import defpackage.ag41;
import defpackage.cu41;
import defpackage.dpb;
import defpackage.ec31;
import defpackage.ff41;
import defpackage.gf41;
import defpackage.gq41;
import defpackage.gtq0;
import defpackage.h55;
import defpackage.i3y;
import defpackage.kq41;
import defpackage.lq41;
import defpackage.m950;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o9p;
import defpackage.pzt0;
import defpackage.qq31;
import defpackage.scg;
import defpackage.sjh;
import defpackage.sls;
import defpackage.svb;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvb;
import defpackage.uyj;
import defpackage.wp01;
import defpackage.xf41;
import defpackage.yvf0;
import defpackage.zy11;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes6.dex */
public final class m extends h55 {
    public final tse D;
    public final gf41 E;
    public final ru.yandex.taxi.am.token.a F;
    public final b G;
    public final gq41 H;
    public final yvf0 I;
    public final i J;
    public final o9p K;
    public final i3y L;
    public pzt0 M;

    public m(tse tseVar, gf41 gf41Var, ru.yandex.taxi.am.token.a aVar, b bVar, gq41 gq41Var, yvf0 yvf0Var, i iVar, o9p o9pVar) {
        super(null);
        this.D = tseVar;
        this.E = gf41Var;
        this.F = aVar;
        this.G = bVar;
        this.H = gq41Var;
        this.I = yvf0Var;
        this.J = iVar;
        this.K = o9pVar;
        this.L = kotlin.a.a(new ec31(18, this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(6:19|20|21|22|14|15))(4:32|33|34|35))(4:48|49|50|(1:53)(1:52))|36|37|(1:40)(4:39|22|14|15)))|59|6|7|(0)(0)|36|37|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        r4 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(m mVar, Uri uri, ContinuationImpl continuationImpl) {
        WebViewFromDeeplinkRouter$launchUnsafe$1 webViewFromDeeplinkRouter$launchUnsafe$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Uri uri2;
        IdNotFoundInExperimentException th;
        m950 m950Var;
        Object a;
        WebViewFromDeeplinkExperiment.a aVar;
        m950 m950Var2;
        Pair pair;
        mVar.getClass();
        try {
            if (continuationImpl instanceof WebViewFromDeeplinkRouter$launchUnsafe$1) {
                webViewFromDeeplinkRouter$launchUnsafe$1 = (WebViewFromDeeplinkRouter$launchUnsafe$1) continuationImpl;
                int i2 = webViewFromDeeplinkRouter$launchUnsafe$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    webViewFromDeeplinkRouter$launchUnsafe$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = webViewFromDeeplinkRouter$launchUnsafe$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = webViewFromDeeplinkRouter$launchUnsafe$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        m950 m950Var3 = (tvb) mVar.I.get();
                        mVar.D(m950Var3, new CircularProgressRouter$Payload(null, false, 7), new lq41(mVar, 0));
                        try {
                            i iVar = mVar.J;
                            webViewFromDeeplinkRouter$launchUnsafe$1.L$0 = uri;
                            webViewFromDeeplinkRouter$launchUnsafe$1.L$1 = m950Var3;
                            webViewFromDeeplinkRouter$launchUnsafe$1.label = 1;
                            iVar.a.getClass();
                            sjh sjhVar = uyj.a;
                            Object k0 = tje.k0(mdh.b, new WebViewFromDeeplinkInteractor$getUrlByDeeplink$2(uri, iVar, null), webViewFromDeeplinkRouter$launchUnsafe$1);
                            if (k0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            m950Var = m950Var3;
                            obj = k0;
                        } catch (Throwable th2) {
                            uri2 = uri;
                            th = th2;
                            m950Var = m950Var3;
                            if (th instanceof IdNotFoundInExperimentException) {
                                throw th;
                            }
                            String id = th.getId();
                            webViewFromDeeplinkRouter$launchUnsafe$1.L$0 = null;
                            webViewFromDeeplinkRouter$launchUnsafe$1.L$1 = m950Var;
                            webViewFromDeeplinkRouter$launchUnsafe$1.L$2 = null;
                            webViewFromDeeplinkRouter$launchUnsafe$1.L$3 = null;
                            webViewFromDeeplinkRouter$launchUnsafe$1.label = 3;
                            obj = mVar.T(uri2, id, webViewFromDeeplinkRouter$launchUnsafe$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            m950Var2 = m950Var;
                            pair = (Pair) obj;
                            m950Var = m950Var2;
                            svb svbVar = (svb) m950Var;
                            svbVar.T(new wp01(8, mVar, (WebViewFromDeeplinkExperiment.a) pair.getFirst(), (UiWebViewConfig) pair.getSecond()));
                            return zy11.a;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                aVar = (WebViewFromDeeplinkExperiment.a) webViewFromDeeplinkRouter$launchUnsafe$1.L$2;
                                m950Var = (tvb) webViewFromDeeplinkRouter$launchUnsafe$1.L$1;
                                uri2 = (Uri) webViewFromDeeplinkRouter$launchUnsafe$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    pair = new Pair(aVar, (UiWebViewConfig) obj);
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (th instanceof IdNotFoundInExperimentException) {
                                    }
                                }
                                svb svbVar2 = (svb) m950Var;
                                svbVar2.T(new wp01(8, mVar, (WebViewFromDeeplinkExperiment.a) pair.getFirst(), (UiWebViewConfig) pair.getSecond()));
                                return zy11.a;
                            }
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            m950Var2 = (tvb) webViewFromDeeplinkRouter$launchUnsafe$1.L$1;
                            kotlin.b.b(obj);
                            pair = (Pair) obj;
                            m950Var = m950Var2;
                            svb svbVar22 = (svb) m950Var;
                            svbVar22.T(new wp01(8, mVar, (WebViewFromDeeplinkExperiment.a) pair.getFirst(), (UiWebViewConfig) pair.getSecond()));
                            return zy11.a;
                        }
                        m950 m950Var4 = (tvb) webViewFromDeeplinkRouter$launchUnsafe$1.L$1;
                        Uri uri3 = (Uri) webViewFromDeeplinkRouter$launchUnsafe$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            m950Var = m950Var4;
                            uri = uri3;
                        } catch (Throwable th4) {
                            IdNotFoundInExperimentException th5 = th4;
                            uri2 = uri3;
                            m950Var = m950Var4;
                            th = th5;
                            if (th instanceof IdNotFoundInExperimentException) {
                            }
                        }
                    }
                    WebViewFromDeeplinkExperiment.a aVar2 = (WebViewFromDeeplinkExperiment.a) obj;
                    b bVar = mVar.G;
                    webViewFromDeeplinkRouter$launchUnsafe$1.L$0 = uri;
                    webViewFromDeeplinkRouter$launchUnsafe$1.L$1 = m950Var;
                    webViewFromDeeplinkRouter$launchUnsafe$1.L$2 = aVar2;
                    webViewFromDeeplinkRouter$launchUnsafe$1.label = 2;
                    a = bVar.a(aVar2, webViewFromDeeplinkRouter$launchUnsafe$1);
                    if (a != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    uri2 = uri;
                    aVar = aVar2;
                    obj = a;
                    pair = new Pair(aVar, (UiWebViewConfig) obj);
                    svb svbVar222 = (svb) m950Var;
                    svbVar222.T(new wp01(8, mVar, (WebViewFromDeeplinkExperiment.a) pair.getFirst(), (UiWebViewConfig) pair.getSecond()));
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            WebViewFromDeeplinkExperiment.a aVar22 = (WebViewFromDeeplinkExperiment.a) obj;
            b bVar2 = mVar.G;
            webViewFromDeeplinkRouter$launchUnsafe$1.L$0 = uri;
            webViewFromDeeplinkRouter$launchUnsafe$1.L$1 = m950Var;
            webViewFromDeeplinkRouter$launchUnsafe$1.L$2 = aVar22;
            webViewFromDeeplinkRouter$launchUnsafe$1.label = 2;
            a = bVar2.a(aVar22, webViewFromDeeplinkRouter$launchUnsafe$1);
            if (a != coroutineSingletons) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        webViewFromDeeplinkRouter$launchUnsafe$1 = new WebViewFromDeeplinkRouter$launchUnsafe$1(mVar, continuationImpl);
        Object obj2 = webViewFromDeeplinkRouter$launchUnsafe$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewFromDeeplinkRouter$launchUnsafe$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r7.U(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(m mVar, WebViewFromDeeplinkExperiment.a aVar, ContinuationImpl continuationImpl) {
        WebViewFromDeeplinkRouter$refreshToken$1 webViewFromDeeplinkRouter$refreshToken$1;
        int i;
        Object d;
        Object obj;
        mVar.getClass();
        if (continuationImpl instanceof WebViewFromDeeplinkRouter$refreshToken$1) {
            webViewFromDeeplinkRouter$refreshToken$1 = (WebViewFromDeeplinkRouter$refreshToken$1) continuationImpl;
            int i2 = webViewFromDeeplinkRouter$refreshToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewFromDeeplinkRouter$refreshToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webViewFromDeeplinkRouter$refreshToken$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewFromDeeplinkRouter$refreshToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((ag41) mVar.R()).c(cu41.b);
                    ru.yandex.taxi.am.token.a aVar2 = mVar.F;
                    webViewFromDeeplinkRouter$refreshToken$1.L$0 = aVar;
                    webViewFromDeeplinkRouter$refreshToken$1.label = 1;
                    d = aVar2.d(false, webViewFromDeeplinkRouter$refreshToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = webViewFromDeeplinkRouter$refreshToken$1.L$1;
                        kotlin.b.b(obj2);
                        if (Result.a(obj) != null) {
                            ((ag41) mVar.R()).c(cu41.d);
                        }
                        return zy11.a;
                    }
                    aVar = (WebViewFromDeeplinkExperiment.a) webViewFromDeeplinkRouter$refreshToken$1.L$0;
                    kotlin.b.b(obj2);
                    d = ((Result) obj2).getValue();
                }
                Object obj4 = d;
                WebViewFromDeeplinkExperiment.a aVar3 = aVar;
                obj = obj4;
                if (!(obj instanceof Result.Failure)) {
                    webViewFromDeeplinkRouter$refreshToken$1.L$0 = null;
                    webViewFromDeeplinkRouter$refreshToken$1.L$1 = obj;
                    webViewFromDeeplinkRouter$refreshToken$1.L$2 = null;
                    webViewFromDeeplinkRouter$refreshToken$1.label = 2;
                }
                if (Result.a(obj) != null) {
                }
                return zy11.a;
            }
        }
        webViewFromDeeplinkRouter$refreshToken$1 = new WebViewFromDeeplinkRouter$refreshToken$1(mVar, continuationImpl);
        Object obj22 = webViewFromDeeplinkRouter$refreshToken$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewFromDeeplinkRouter$refreshToken$1.label;
        if (i != 0) {
        }
        Object obj42 = d;
        WebViewFromDeeplinkExperiment.a aVar32 = aVar;
        obj = obj42;
        if (!(obj instanceof Result.Failure)) {
        }
        if (Result.a(obj) != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.H.a("OpenExternalWebViewUrl.Deeplink", kotlin.collections.b.f());
        Uri uri = ((kq41) obj).a;
        gtq0.t(this.D, new qq31(13, this));
        this.M = tje.N(o(), gq41.b, null, new WebViewFromDeeplinkRouter$onAttach$2(this, uri, null), 2);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = null;
        j(dpb.a);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        sls slsVar = ((kq41) obj).b;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public final xf41 R() {
        return ((scg) ((ff41) this.L.getValue())).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(String str, ContinuationImpl continuationImpl) {
        WebViewFromDeeplinkRouter$getFoundUrlWithId$1 webViewFromDeeplinkRouter$getFoundUrlWithId$1;
        int i;
        if (continuationImpl instanceof WebViewFromDeeplinkRouter$getFoundUrlWithId$1) {
            webViewFromDeeplinkRouter$getFoundUrlWithId$1 = (WebViewFromDeeplinkRouter$getFoundUrlWithId$1) continuationImpl;
            int i2 = webViewFromDeeplinkRouter$getFoundUrlWithId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewFromDeeplinkRouter$getFoundUrlWithId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewFromDeeplinkRouter$getFoundUrlWithId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewFromDeeplinkRouter$getFoundUrlWithId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    WebViewFromDeeplinkExperiment.Companion.getClass();
                    WebViewFromDeeplinkExperiment webViewFromDeeplinkExperiment = WebViewFromDeeplinkExperiment.d;
                    webViewFromDeeplinkRouter$getFoundUrlWithId$1.L$0 = str;
                    webViewFromDeeplinkRouter$getFoundUrlWithId$1.label = 1;
                    obj = ((com.yandex.go.fallback_experiment.a) this.K).a("open_url", webViewFromDeeplinkExperiment, webViewFromDeeplinkRouter$getFoundUrlWithId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) webViewFromDeeplinkRouter$getFoundUrlWithId$1.L$0;
                    kotlin.b.b(obj);
                }
                return ((WebViewFromDeeplinkExperiment) obj).a(str);
            }
        }
        webViewFromDeeplinkRouter$getFoundUrlWithId$1 = new WebViewFromDeeplinkRouter$getFoundUrlWithId$1(this, continuationImpl);
        Object obj2 = webViewFromDeeplinkRouter$getFoundUrlWithId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewFromDeeplinkRouter$getFoundUrlWithId$1.label;
        if (i != 0) {
        }
        return ((WebViewFromDeeplinkExperiment) obj2).a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable T(Uri uri, String str, ContinuationImpl continuationImpl) {
        WebViewFromDeeplinkRouter$launchFallbackExperiment$1 webViewFromDeeplinkRouter$launchFallbackExperiment$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        WebViewFromDeeplinkExperiment.a aVar;
        if (continuationImpl instanceof WebViewFromDeeplinkRouter$launchFallbackExperiment$1) {
            webViewFromDeeplinkRouter$launchFallbackExperiment$1 = (WebViewFromDeeplinkRouter$launchFallbackExperiment$1) continuationImpl;
            int i2 = webViewFromDeeplinkRouter$launchFallbackExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewFromDeeplinkRouter$launchFallbackExperiment$1.label = i2 - Integer.MIN_VALUE;
                obj = webViewFromDeeplinkRouter$launchFallbackExperiment$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewFromDeeplinkRouter$launchFallbackExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$0 = str;
                    webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$1 = uri;
                    webViewFromDeeplinkRouter$launchFallbackExperiment$1.label = 1;
                    obj = S(str, webViewFromDeeplinkRouter$launchFallbackExperiment$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = (WebViewFromDeeplinkExperiment.a) webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$3;
                        kotlin.b.b(obj);
                        return new Pair(aVar, (UiWebViewConfig) obj);
                    }
                    uri = (Uri) webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$1;
                    str = (String) webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$0;
                    kotlin.b.b(obj);
                }
                WebViewFromDeeplinkExperiment.a a = this.J.a((WebViewFromDeeplinkExperiment.a) obj, str, uri);
                webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$0 = null;
                webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$1 = null;
                webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$2 = null;
                webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$3 = a;
                webViewFromDeeplinkRouter$launchFallbackExperiment$1.label = 2;
                obj = this.G.a(a, webViewFromDeeplinkRouter$launchFallbackExperiment$1);
                if (obj != coroutineSingletons) {
                    aVar = a;
                    return new Pair(aVar, (UiWebViewConfig) obj);
                }
                return coroutineSingletons;
            }
        }
        webViewFromDeeplinkRouter$launchFallbackExperiment$1 = new WebViewFromDeeplinkRouter$launchFallbackExperiment$1(this, continuationImpl);
        obj = webViewFromDeeplinkRouter$launchFallbackExperiment$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewFromDeeplinkRouter$launchFallbackExperiment$1.label;
        if (i != 0) {
        }
        WebViewFromDeeplinkExperiment.a a2 = this.J.a((WebViewFromDeeplinkExperiment.a) obj, str, uri);
        webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$0 = null;
        webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$1 = null;
        webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$2 = null;
        webViewFromDeeplinkRouter$launchFallbackExperiment$1.L$3 = a2;
        webViewFromDeeplinkRouter$launchFallbackExperiment$1.label = 2;
        obj = this.G.a(a2, webViewFromDeeplinkRouter$launchFallbackExperiment$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(WebViewFromDeeplinkExperiment.a aVar, ContinuationImpl continuationImpl) {
        WebViewFromDeeplinkRouter$successRefreshToken$1 webViewFromDeeplinkRouter$successRefreshToken$1;
        int i;
        xf41 xf41Var;
        if (continuationImpl instanceof WebViewFromDeeplinkRouter$successRefreshToken$1) {
            webViewFromDeeplinkRouter$successRefreshToken$1 = (WebViewFromDeeplinkRouter$successRefreshToken$1) continuationImpl;
            int i2 = webViewFromDeeplinkRouter$successRefreshToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewFromDeeplinkRouter$successRefreshToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewFromDeeplinkRouter$successRefreshToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewFromDeeplinkRouter$successRefreshToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ag41 ag41Var = (ag41) R();
                    ag41Var.c(cu41.c);
                    webViewFromDeeplinkRouter$successRefreshToken$1.L$0 = null;
                    webViewFromDeeplinkRouter$successRefreshToken$1.L$1 = ag41Var;
                    webViewFromDeeplinkRouter$successRefreshToken$1.L$2 = null;
                    webViewFromDeeplinkRouter$successRefreshToken$1.L$3 = ag41Var;
                    webViewFromDeeplinkRouter$successRefreshToken$1.label = 1;
                    Object a = this.G.a(aVar, webViewFromDeeplinkRouter$successRefreshToken$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    xf41Var = ag41Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xf41Var = (xf41) webViewFromDeeplinkRouter$successRefreshToken$1.L$3;
                    kotlin.b.b(obj);
                }
                ((ag41) xf41Var).a((UiWebViewConfig) obj);
                return zy11.a;
            }
        }
        webViewFromDeeplinkRouter$successRefreshToken$1 = new WebViewFromDeeplinkRouter$successRefreshToken$1(this, continuationImpl);
        Object obj2 = webViewFromDeeplinkRouter$successRefreshToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewFromDeeplinkRouter$successRefreshToken$1.label;
        if (i != 0) {
        }
        ((ag41) xf41Var).a((UiWebViewConfig) obj2);
        return zy11.a;
    }
}
