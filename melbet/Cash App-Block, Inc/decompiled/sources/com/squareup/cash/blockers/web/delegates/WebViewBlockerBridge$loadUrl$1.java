package com.squareup.cash.blockers.web.delegates;

import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.common.web.UriScheme;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.webview.android.AndroidCookieManager;
import com.squareup.protos.franklin.api.WebviewBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class WebViewBlockerBridge$loadUrl$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ List $cookies;
    public final /* synthetic */ Uri $httpsUri;
    public final /* synthetic */ String $url;
    public int label;
    public final /* synthetic */ WebViewBlockerBridge this$0;

    /* renamed from: com.squareup.cash.blockers.web.delegates.WebViewBlockerBridge$loadUrl$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ List $cookies;
        public final /* synthetic */ String $url;
        public int label;
        public final /* synthetic */ WebViewBlockerBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebViewBlockerBridge webViewBlockerBridge, String str, List list, Continuation continuation) {
            super(2, continuation);
            this.this$0 = webViewBlockerBridge;
            this.$url = str;
            this.$cookies = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$url, this.$cookies, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0167 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            AnonymousClass1 anonymousClass1 = this;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = anonymousClass1.label;
            Throwable th = null;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                WebViewBlockerCookieManager webViewBlockerCookieManager = anonymousClass1.this$0.webBlockerCookieManager;
                anonymousClass1.label = 1;
                RealWebViewBlockerCookieManager realWebViewBlockerCookieManager = (RealWebViewBlockerCookieManager) webViewBlockerCookieManager;
                AndroidClock androidClock = realWebViewBlockerCookieManager.clock;
                ConcurrentHashMap concurrentHashMap = realWebViewBlockerCookieManager.cookieExpiryTimes;
                if (!concurrentHashMap.isEmpty()) {
                    if (!concurrentHashMap.isEmpty()) {
                        Iterator it = concurrentHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            if (DimensionKt.nowSeconds(androidClock).compareTo((Instant) ((Map.Entry) it.next()).getValue()) >= 0) {
                            }
                        }
                    }
                    int i2 = 0;
                    for (Object obj2 : anonymousClass1.$cookies) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            Throwable th2 = th;
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw th2;
                        }
                        WebviewBlocker.CookieField cookieField = (WebviewBlocker.CookieField) obj2;
                        Instant nowSeconds = DimensionKt.nowSeconds(androidClock);
                        Long l = cookieField.expires;
                        concurrentHashMap.put(new Integer(i2), nowSeconds.plusSeconds(l != null ? l.longValue() : 0L).minusSeconds(60L));
                        AndroidCookieManager androidCookieManager = realWebViewBlockerCookieManager.cookieManager;
                        String str2 = cookieField.domain;
                        if (str2 != null) {
                            Uri.Builder builder = new Uri.Builder();
                            UriScheme[] uriSchemeArr = UriScheme.$VALUES;
                            str = builder.scheme("https").authority(str2).build().toString();
                            str.getClass();
                        } else {
                            str = anonymousClass1.$url;
                        }
                        DateTimeFormatter withZone = DateTimeFormatter.RFC_1123_DATE_TIME.withZone(ZoneId.of("GMT"));
                        String str3 = cookieField.name;
                        String str4 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        Long l2 = cookieField.expires;
                        String m = l2 != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Expires=", withZone.format(Instant.ofEpochSecond(l2.longValue())), ";") : "";
                        Long l3 = cookieField.max_age;
                        Throwable th3 = th;
                        AndroidClock androidClock2 = androidClock;
                        String m2 = l3 != null ? Boxes$$ExternalSyntheticOutline1.m(l3.longValue(), "Max-Age=", ";") : "";
                        String str5 = cookieField.domain;
                        if (str5 == null) {
                            str5 = "";
                        }
                        Boolean bool = cookieField.secure;
                        Boolean bool2 = Boolean.TRUE;
                        String str6 = Intrinsics.areEqual(bool, bool2) ? " Secure;" : "";
                        RealWebViewBlockerCookieManager realWebViewBlockerCookieManager2 = realWebViewBlockerCookieManager;
                        String str7 = Intrinsics.areEqual(cookieField.http_only, bool2) ? " HttpOnly;" : "";
                        String str8 = cookieField.path;
                        if (str8 == null) {
                            str8 = "";
                        }
                        String str9 = cookieField.value;
                        if (str9 != null) {
                            str4 = str9;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append("=");
                        sb.append(str4);
                        sb.append("; ");
                        sb.append(m);
                        Boxes$$ExternalSyntheticOutline1.m(sb, " ", m2, " ", str6);
                        Boxes$$ExternalSyntheticOutline1.m(sb, " ", str7, " domain=", str5);
                        androidCookieManager.setCookie(str, Recorder$$ExternalSyntheticOutline2.m(sb, "; path = ", str8, ";"));
                        anonymousClass1 = this;
                        realWebViewBlockerCookieManager = realWebViewBlockerCookieManager2;
                        i2 = i3;
                        th = th3;
                        androidClock = androidClock2;
                    }
                    if (Unit.INSTANCE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                concurrentHashMap.clear();
                int i22 = 0;
                while (r6.hasNext()) {
                }
                if (Unit.INSTANCE == coroutineSingletons) {
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewBlockerBridge$loadUrl$1(WebViewBlockerBridge webViewBlockerBridge, Uri uri, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webViewBlockerBridge;
        this.$httpsUri = uri;
        this.$url = str;
        this.$cookies = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewBlockerBridge$loadUrl$1(this.this$0, this.$httpsUri, this.$url, this.$cookies, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewBlockerBridge$loadUrl$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        WebViewBlockerBridge webViewBlockerBridge = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(webViewBlockerBridge, this.$url, this.$cookies, null);
            this.label = 1;
            if (JobKt.withContext(defaultIoScheduler, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        webViewBlockerBridge.webView.loadUrl(this.$httpsUri.toString());
        return Unit.INSTANCE;
    }
}
