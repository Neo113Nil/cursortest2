package com.onesignal.core.internal.http.impl;

import B7.h;
import D.x;
import I7.l;
import I7.p;
import Q7.q;
import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import S7.Y;
import S7.h0;
import S7.s0;
import android.net.TrafficStats;
import android.os.Build;
import com.anythink.basead.ui.BaseATView;
import com.onesignal.common.f;
import com.onesignal.common.i;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import kotlin.jvm.internal.r;
import org.json.JSONObject;
import u7.v;
import v7.AbstractC5119j;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a implements E4.c {
    public static final C0191a Companion = new C0191a(null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final com.onesignal.core.internal.http.impl.d _connectionFactory;
    private final C4.d _installIdService;
    private final J4.b _prefs;
    private final K4.a _time;
    private long delayNewRequestsUntil;

    /* renamed from: com.onesignal.core.internal.http.impl.a$a, reason: collision with other inner class name */
    public static final class C0191a {
        public /* synthetic */ C0191a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0191a() {
        }
    }

    public static final class b extends B7.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequest(null, null, null, 0, null, this);
        }
    }

    public static final class c extends h implements p {
        final /* synthetic */ com.onesignal.core.internal.http.impl.e $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, JSONObject jSONObject, int i, com.onesignal.core.internal.http.impl.e eVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i;
            this.$headers = eVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return a.this.new c(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((c) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
                return obj;
            }
            Q3.b.s(obj);
            a aVar2 = a.this;
            String str = this.$url;
            String str2 = this.$method;
            JSONObject jSONObject = this.$jsonBody;
            int i4 = this.$timeout;
            com.onesignal.core.internal.http.impl.e eVar = this.$headers;
            this.label = 1;
            Object makeRequestIODispatcher = aVar2.makeRequestIODispatcher(str, str2, jSONObject, i4, eVar, this);
            return makeRequestIODispatcher == aVar ? aVar : makeRequestIODispatcher;
        }
    }

    public static final class d extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequestIODispatcher(null, null, null, 0, null, this);
        }
    }

    public static final class e extends h implements l {
        final /* synthetic */ com.onesignal.core.internal.http.impl.e $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ r $retVal;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i, JSONObject jSONObject, String str2, com.onesignal.core.internal.http.impl.e eVar, r rVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$url = str;
            this.$timeout = i;
            this.$jsonBody = jSONObject;
            this.$method = str2;
            this.$headers = eVar;
            this.$retVal = rVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return a.this.new e(this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, interfaceC5240d);
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x0435 A[Catch: all -> 0x0451, TryCatch #0 {all -> 0x0451, blocks: (B:108:0x0431, B:110:0x0435, B:113:0x043a, B:114:0x0464, B:118:0x0453), top: B:107:0x0431 }] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0476  */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int i;
            HttpURLConnection httpURLConnection;
            HttpURLConnection newHttpURLConnection;
            Object id;
            String str;
            HttpURLConnection httpURLConnection2;
            int i4;
            Throwable th2;
            int i6;
            int i9;
            String headerField;
            String str2;
            A7.a aVar = A7.a.f215n;
            int i10 = this.label;
            if (i10 == 0) {
                Q3.b.s(obj);
                if (Build.VERSION.SDK_INT >= 26) {
                    TrafficStats.setThreadStatsTag(10000);
                }
                try {
                    newHttpURLConnection = a.this._connectionFactory.newHttpURLConnection(this.$url);
                } catch (Throwable th3) {
                    th = th3;
                    i = -1;
                    httpURLConnection = null;
                    if (!(th instanceof ConnectException)) {
                    }
                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    this.$retVal.f38644n = new E4.a(i, null, th, null, null, 24, null);
                    if (httpURLConnection != null) {
                    }
                    return v.f41073a;
                }
                try {
                    newHttpURLConnection.setUseCaches(false);
                    newHttpURLConnection.setConnectTimeout(this.$timeout);
                    newHttpURLConnection.setReadTimeout(this.$timeout);
                    newHttpURLConnection.setRequestProperty(com.onesignal.core.internal.http.impl.b.HTTP_SDK_VERSION_HEADER_KEY, com.onesignal.core.internal.http.impl.b.getHTTP_SDK_VERSION_HEADER_VALUE());
                    if (i.getSdkType() != null && i.getSdkVersion() != null) {
                        newHttpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + i.getSdkType() + '/' + i.getSdkVersion());
                    }
                    newHttpURLConnection.setRequestProperty("Accept", a.OS_ACCEPT_HEADER);
                    String pushSubscriptionId = ((com.onesignal.core.internal.config.b) a.this._configModelStore.getModel()).getPushSubscriptionId();
                    if (pushSubscriptionId != null && pushSubscriptionId.length() > 0) {
                        newHttpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                    }
                    C4.d dVar = a.this._installIdService;
                    this.L$0 = newHttpURLConnection;
                    this.L$1 = newHttpURLConnection;
                    this.L$2 = "OneSignal-Install-Id";
                    this.I$0 = -1;
                    this.label = 1;
                    id = dVar.getId(this);
                    if (id == aVar) {
                        return aVar;
                    }
                    str = "OneSignal-Install-Id";
                    httpURLConnection2 = newHttpURLConnection;
                } catch (Throwable th4) {
                    th = th4;
                    i = -1;
                    httpURLConnection = newHttpURLConnection;
                    if (!(th instanceof ConnectException)) {
                    }
                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    this.$retVal.f38644n = new E4.a(i, null, th, null, null, 24, null);
                    if (httpURLConnection != null) {
                    }
                    return v.f41073a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = this.I$0;
                str = (String) this.L$2;
                httpURLConnection2 = (HttpURLConnection) this.L$1;
                newHttpURLConnection = (HttpURLConnection) this.L$0;
                try {
                    Q3.b.s(obj);
                    id = obj;
                } catch (Throwable th5) {
                    th2 = th5;
                    th = th2;
                    i = i4;
                    httpURLConnection = newHttpURLConnection;
                    try {
                        if (!(th instanceof ConnectException) && !(th instanceof UnknownHostException)) {
                            com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                            this.$retVal.f38644n = new E4.a(i, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return v.f41073a;
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f38644n = new E4.a(i, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return v.f41073a;
                    } catch (Throwable th6) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th6;
                    }
                }
            }
            httpURLConnection2.setRequestProperty(str, ((UUID) id).toString());
            if (this.$jsonBody != null) {
                newHttpURLConnection.setDoInput(true);
            }
            if (this.$method != null) {
                newHttpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                newHttpURLConnection.setRequestMethod(this.$method);
                newHttpURLConnection.setDoOutput(true);
            }
            com.onesignal.core.internal.http.impl.e eVar = this.$headers;
            if ((eVar != null ? eVar.getCacheKey() : null) != null) {
                String string$default = J4.a.getString$default(a.this._prefs, com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
                if (string$default != null) {
                    newHttpURLConnection.setRequestProperty("If-None-Match", string$default);
                    com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
                }
            }
            com.onesignal.core.internal.http.impl.e eVar2 = this.$headers;
            if ((eVar2 != null ? eVar2.getRywToken() : null) != null) {
                newHttpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
            }
            com.onesignal.core.internal.http.impl.e eVar3 = this.$headers;
            if ((eVar3 != null ? eVar3.getRetryCount() : null) != null) {
                newHttpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
            }
            com.onesignal.core.internal.http.impl.e eVar4 = this.$headers;
            if ((eVar4 != null ? eVar4.getSessionDuration() : null) != null) {
                newHttpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
            }
            com.onesignal.core.internal.http.impl.e eVar5 = this.$headers;
            if ((eVar5 != null ? eVar5.getJwt() : null) != null) {
                newHttpURLConnection.setRequestProperty("Authorization", "Bearer " + this.$headers.getJwt());
            }
            a aVar2 = a.this;
            String requestMethod = newHttpURLConnection.getRequestMethod();
            URL url = newHttpURLConnection.getURL();
            kotlin.jvm.internal.h.d(url, "getURL(...)");
            JSONObject jSONObject = this.$jsonBody;
            Map<String, List<String>> requestProperties = newHttpURLConnection.getRequestProperties();
            kotlin.jvm.internal.h.d(requestProperties, "getRequestProperties(...)");
            aVar2.logHTTPSent(requestMethod, url, jSONObject, requestProperties);
            JSONObject jSONObject2 = this.$jsonBody;
            if (jSONObject2 != null) {
                String unescapedEUIDString = f.INSTANCE.toUnescapedEUIDString(jSONObject2);
                Charset forName = Charset.forName("UTF-8");
                kotlin.jvm.internal.h.d(forName, "forName(...)");
                byte[] bytes = unescapedEUIDString.getBytes(forName);
                kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
                newHttpURLConnection.setFixedLengthStreamingMode(bytes.length);
                newHttpURLConnection.getOutputStream().write(bytes);
            }
            int responseCode = newHttpURLConnection.getResponseCode();
            try {
                Integer retryAfterFromResponse = a.this.retryAfterFromResponse(newHttpURLConnection);
                Integer retryLimitFromResponse = a.this.retryLimitFromResponse(newHttpURLConnection);
                long currentTimeMillis = a.this._time.getCurrentTimeMillis() + ((retryAfterFromResponse != null ? retryAfterFromResponse.intValue() : 0) * 1000);
                if (currentTimeMillis > a.this.delayNewRequestsUntil) {
                    a.this.delayNewRequestsUntil = currentTimeMillis;
                }
                String str3 = "GET";
                if (responseCode != 304) {
                    try {
                        switch (responseCode) {
                            case 200:
                            case BaseATView.a.f10590z /* 201 */:
                            case 202:
                                Scanner scanner = new Scanner(newHttpURLConnection.getInputStream(), "UTF-8");
                                String next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                                scanner.close();
                                StringBuilder sb = new StringBuilder("HttpClient: Got Response = ");
                                String str4 = this.$method;
                                if (str4 == null) {
                                    str4 = "GET";
                                }
                                sb.append(str4);
                                sb.append(' ');
                                sb.append(newHttpURLConnection.getURL());
                                sb.append(" - STATUS: ");
                                sb.append(responseCode);
                                sb.append(" - Body: ");
                                sb.append(next);
                                com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                                com.onesignal.core.internal.http.impl.e eVar6 = this.$headers;
                                if ((eVar6 != null ? eVar6.getCacheKey() : null) != null && (headerField = newHttpURLConnection.getHeaderField("etag")) != null) {
                                    com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                    a.this._prefs.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), headerField);
                                    a.this._prefs.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_HTTP_CACHE_PREFIX_" + this.$headers.getCacheKey(), next);
                                }
                                i9 = responseCode;
                                this.$retVal.f38644n = new E4.a(i9, next, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                                break;
                            default:
                                StringBuilder sb2 = new StringBuilder("HttpClient: Got Response = ");
                                String str5 = this.$method;
                                if (str5 != null) {
                                    str3 = str5;
                                }
                                sb2.append(str3);
                                sb2.append(' ');
                                sb2.append(newHttpURLConnection.getURL());
                                sb2.append(" - FAILED STATUS: ");
                                sb2.append(responseCode);
                                com.onesignal.debug.internal.logging.b.debug$default(sb2.toString(), null, 2, null);
                                InputStream errorStream = newHttpURLConnection.getErrorStream();
                                if (errorStream == null) {
                                    errorStream = newHttpURLConnection.getInputStream();
                                }
                                if (errorStream != null) {
                                    Scanner scanner2 = new Scanner(errorStream, "UTF-8");
                                    String next2 = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                                    scanner2.close();
                                    com.onesignal.debug.internal.logging.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next2, null, 2, null);
                                    str2 = next2;
                                } else {
                                    com.onesignal.debug.internal.logging.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                                    str2 = null;
                                }
                                i9 = responseCode;
                                this.$retVal.f38644n = new E4.a(i9, str2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                                break;
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        i4 = i9;
                        th = th2;
                        i = i4;
                        httpURLConnection = newHttpURLConnection;
                        if (!(th instanceof ConnectException)) {
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f38644n = new E4.a(i, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return v.f41073a;
                    }
                } else {
                    J4.b bVar = a.this._prefs;
                    StringBuilder sb3 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                    com.onesignal.core.internal.http.impl.e eVar7 = this.$headers;
                    sb3.append(eVar7 != null ? eVar7.getCacheKey() : null);
                    String string$default2 = J4.a.getString$default(bVar, com.onesignal.common.threading.b.BASE_THREAD_NAME, sb3.toString(), null, 4, null);
                    StringBuilder sb4 = new StringBuilder("HttpClient: Got Response = ");
                    String str6 = this.$method;
                    sb4.append(str6 == null ? "GET" : str6);
                    sb4.append(' ');
                    sb4.append(newHttpURLConnection.getURL());
                    sb4.append(" - Using Cached response due to 304: ");
                    sb4.append(string$default2);
                    com.onesignal.debug.internal.logging.b.debug$default(sb4.toString(), null, 2, null);
                    i6 = responseCode;
                    try {
                        this.$retVal.f38644n = new E4.a(i6, string$default2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                    } catch (Throwable th8) {
                        th = th8;
                        th = th;
                        httpURLConnection = newHttpURLConnection;
                        i = i6;
                        if (!(th instanceof ConnectException)) {
                            com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                            this.$retVal.f38644n = new E4.a(i, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                            }
                            return v.f41073a;
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f38644n = new E4.a(i, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return v.f41073a;
                    }
                }
                newHttpURLConnection.disconnect();
            } catch (Throwable th9) {
                th = th9;
                i6 = responseCode;
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((e) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public a(com.onesignal.core.internal.http.impl.d _connectionFactory, J4.b _prefs, com.onesignal.core.internal.config.c _configModelStore, K4.a _time, C4.d _installIdService) {
        kotlin.jvm.internal.h.e(_connectionFactory, "_connectionFactory");
        kotlin.jvm.internal.h.e(_prefs, "_prefs");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_time, "_time");
        kotlin.jvm.internal.h.e(_installIdService, "_installIdService");
        this._connectionFactory = _connectionFactory;
        this._prefs = _prefs;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._installIdService = _installIdService;
    }

    private final int getThreadTimeout(int i) {
        return i + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String str, URL url, JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        String C8 = AbstractC5119j.C(map.entrySet(), null, null, null, null, 63);
        if (str == null) {
            str = "GET";
        }
        String unescapedEUIDString = jSONObject != null ? f.INSTANCE.toUnescapedEUIDString(jSONObject) : null;
        StringBuilder sb = new StringBuilder("HttpClient: Request Sent = ");
        sb.append(str);
        sb.append(' ');
        sb.append(url);
        sb.append(" - Body: ");
        com.onesignal.debug.internal.logging.b.debug$default(x.p(sb, unescapedEUIDString, " - Headers: ", C8), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i, com.onesignal.core.internal.http.impl.e eVar, InterfaceC5240d interfaceC5240d) {
        b bVar;
        A7.a aVar;
        int i4;
        JSONObject jSONObject2;
        int i6;
        com.onesignal.core.internal.http.impl.e eVar2;
        String str3;
        a aVar2;
        String str4;
        a aVar3;
        s0 s0Var;
        String str5;
        String str6 = str2;
        try {
            try {
                if (interfaceC5240d instanceof b) {
                    bVar = (b) interfaceC5240d;
                    int i9 = bVar.label;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        bVar.label = i9 - Integer.MIN_VALUE;
                        Object obj = bVar.result;
                        aVar = A7.a.f215n;
                        i4 = bVar.label;
                        if (i4 != 0) {
                            Q3.b.s(obj);
                            if (str6 != null) {
                                Boolean consentRequired = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getConsentRequired();
                                Boolean bool = Boolean.TRUE;
                                if (kotlin.jvm.internal.h.a(consentRequired, bool) && !kotlin.jvm.internal.h.a(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getConsentGiven(), bool)) {
                                    com.onesignal.debug.internal.logging.b.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                                    return new E4.a(0, null, null, null, null, 24, null);
                                }
                            }
                            long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                            if (currentTimeMillis > 0) {
                                bVar.L$0 = this;
                                bVar.L$1 = str;
                                bVar.L$2 = str6;
                                jSONObject2 = jSONObject;
                                bVar.L$3 = jSONObject2;
                                eVar2 = eVar;
                                bVar.L$4 = eVar2;
                                i6 = i;
                                bVar.I$0 = i6;
                                bVar.label = 1;
                                if (AbstractC0410y.f(currentTimeMillis, bVar) != aVar) {
                                    str4 = str;
                                    aVar3 = this;
                                }
                            }
                            jSONObject2 = jSONObject;
                            i6 = i;
                            eVar2 = eVar;
                            str3 = str;
                            aVar2 = this;
                            String str7 = str6;
                            JSONObject jSONObject3 = jSONObject2;
                            com.onesignal.core.internal.http.impl.e eVar3 = eVar2;
                            long threadTimeout = aVar2.getThreadTimeout(i6);
                            c cVar = aVar2.new c(str3, str7, jSONObject3, i6, eVar3, null);
                            bVar.L$0 = str3;
                            bVar.L$1 = null;
                            bVar.L$2 = null;
                            bVar.L$3 = null;
                            bVar.L$4 = null;
                            bVar.label = 2;
                            Object z6 = AbstractC0410y.z(threadTimeout, cVar, bVar);
                            return z6 == aVar ? aVar : z6;
                        }
                        if (i4 != 1) {
                            if (i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str5 = (String) bVar.L$0;
                            try {
                                Q3.b.s(obj);
                                return obj;
                            } catch (s0 e9) {
                                s0Var = e9;
                                com.onesignal.debug.internal.logging.b.info("HttpClient: Request timed out: " + str5, s0Var);
                                return new E4.a(0, null, s0Var, null, null, 24, null);
                            }
                        }
                        int i10 = bVar.I$0;
                        com.onesignal.core.internal.http.impl.e eVar4 = (com.onesignal.core.internal.http.impl.e) bVar.L$4;
                        JSONObject jSONObject4 = (JSONObject) bVar.L$3;
                        String str8 = (String) bVar.L$2;
                        str4 = (String) bVar.L$1;
                        aVar3 = (a) bVar.L$0;
                        Q3.b.s(obj);
                        i6 = i10;
                        jSONObject2 = jSONObject4;
                        eVar2 = eVar4;
                        str6 = str8;
                        str3 = str4;
                        aVar2 = aVar3;
                        String str72 = str6;
                        JSONObject jSONObject32 = jSONObject2;
                        com.onesignal.core.internal.http.impl.e eVar32 = eVar2;
                        long threadTimeout2 = aVar2.getThreadTimeout(i6);
                        c cVar2 = aVar2.new c(str3, str72, jSONObject32, i6, eVar32, null);
                        bVar.L$0 = str3;
                        bVar.L$1 = null;
                        bVar.L$2 = null;
                        bVar.L$3 = null;
                        bVar.L$4 = null;
                        bVar.label = 2;
                        Object z62 = AbstractC0410y.z(threadTimeout2, cVar2, bVar);
                        if (z62 == aVar) {
                        }
                    }
                }
                long threadTimeout22 = aVar2.getThreadTimeout(i6);
                c cVar22 = aVar2.new c(str3, str72, jSONObject32, i6, eVar32, null);
                bVar.L$0 = str3;
                bVar.L$1 = null;
                bVar.L$2 = null;
                bVar.L$3 = null;
                bVar.L$4 = null;
                bVar.label = 2;
                Object z622 = AbstractC0410y.z(threadTimeout22, cVar22, bVar);
                if (z622 == aVar) {
                }
            } catch (s0 e10) {
                s0Var = e10;
                str5 = str3;
                com.onesignal.debug.internal.logging.b.info("HttpClient: Request timed out: " + str5, s0Var);
                return new E4.a(0, null, s0Var, null, null, 24, null);
            }
            if (i4 != 0) {
            }
            str3 = str4;
            aVar2 = aVar3;
            String str722 = str6;
            JSONObject jSONObject322 = jSONObject2;
            com.onesignal.core.internal.http.impl.e eVar322 = eVar2;
        } catch (Throwable th) {
            return new E4.a(0, null, th, null, null, 24, null);
        }
        bVar = new b(interfaceC5240d);
        Object obj2 = bVar.result;
        aVar = A7.a.f215n;
        i4 = bVar.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i, com.onesignal.core.internal.http.impl.e eVar, InterfaceC5240d interfaceC5240d) {
        d dVar;
        int i4;
        r rVar;
        if (interfaceC5240d instanceof d) {
            dVar = (d) interfaceC5240d;
            int i6 = dVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.label = i6 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                A7.a aVar = A7.a.f215n;
                i4 = dVar.label;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    r rVar2 = new r();
                    Y launchOnIO = com.onesignal.common.threading.c.launchOnIO(new e(str, i, jSONObject, str2, eVar, rVar2, null));
                    dVar.L$0 = rVar2;
                    dVar.label = 1;
                    if (((h0) launchOnIO).I(dVar) == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (r) dVar.L$0;
                    Q3.b.s(obj);
                }
                Object obj2 = rVar.f38644n;
                kotlin.jvm.internal.h.b(obj2);
                return obj2;
            }
        }
        dVar = new d(interfaceC5240d);
        Object obj3 = dVar.result;
        A7.a aVar2 = A7.a.f215n;
        i4 = dVar.label;
        if (i4 != 0) {
        }
        Object obj22 = rVar.f38644n;
        kotlin.jvm.internal.h.b(obj22);
        return obj22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Response Retry-After: ".concat(headerField), null, 2, null);
            Integer i02 = q.i0(headerField);
            return Integer.valueOf(i02 != null ? i02.intValue() : ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        if (httpURLConnection.getResponseCode() == 429) {
            return Integer.valueOf(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryLimitFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("OneSignal-Retry-Limit");
        if (headerField == null) {
            return null;
        }
        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Response OneSignal-Retry-Limit: ".concat(headerField), null, 2, null);
        return q.i0(headerField);
    }

    @Override // E4.c
    public Object delete(String str, com.onesignal.core.internal.http.impl.e eVar, InterfaceC5240d interfaceC5240d) {
        return makeRequest(str, "DELETE", null, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, interfaceC5240d);
    }

    @Override // E4.c
    public Object get(String str, com.onesignal.core.internal.http.impl.e eVar, InterfaceC5240d interfaceC5240d) {
        return makeRequest(str, null, null, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpGetTimeout(), eVar, interfaceC5240d);
    }

    @Override // E4.c
    public Object patch(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.e eVar, InterfaceC5240d interfaceC5240d) {
        return makeRequest(str, "PATCH", jSONObject, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, interfaceC5240d);
    }

    @Override // E4.c
    public Object post(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.e eVar, InterfaceC5240d interfaceC5240d) {
        return makeRequest(str, "POST", jSONObject, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, interfaceC5240d);
    }

    @Override // E4.c
    public Object put(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.e eVar, InterfaceC5240d interfaceC5240d) {
        return makeRequest(str, "PUT", jSONObject, ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getHttpTimeout(), eVar, interfaceC5240d);
    }
}
