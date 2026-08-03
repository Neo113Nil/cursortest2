package com.onesignal.core.internal.http.impl;

import ac.o;
import android.net.TrafficStats;
import bc.m;
import com.onesignal.common.g;
import fc.i;
import hc.j;
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
import org.json.JSONObject;
import pc.f;
import pc.s;
import xc.h;
import yc.a0;
import yc.i0;
import yc.l1;
import yc.r1;
import yc.v1;
import yc.y;
import yc.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements w8.c {
    public static final C0017a Companion = new C0017a(null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final com.onesignal.core.internal.http.impl.c _connectionFactory;
    private final v8.d _installIdService;
    private final c9.b _prefs;
    private final e9.a _time;
    private long delayNewRequestsUntil;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.http.impl.a$a, reason: collision with other inner class name */
    public static final class C0017a {
        public /* synthetic */ C0017a(f fVar) {
            this();
        }

        private C0017a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequest(null, null, null, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends j implements oc.e {
        final /* synthetic */ com.onesignal.core.internal.http.impl.d $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, JSONObject jSONObject, int i10, com.onesignal.core.internal.http.impl.d dVar, fc.d dVar2) {
            super(2, dVar2);
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i10;
            this.$headers = dVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return a.this.new c(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                return obj;
            }
            v6.a.W(obj);
            a aVar = a.this;
            String str = this.$url;
            String str2 = this.$method;
            JSONObject jSONObject = this.$jsonBody;
            int i11 = this.$timeout;
            com.onesignal.core.internal.http.impl.d dVar = this.$headers;
            this.label = 1;
            Object makeRequestIODispatcher = aVar.makeRequestIODispatcher(str, str2, jSONObject, i11, dVar, this);
            gc.a aVar2 = gc.a.f2559g;
            return makeRequestIODispatcher == aVar2 ? aVar2 : makeRequestIODispatcher;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((c) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequestIODispatcher(null, null, null, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends j implements oc.e {
        final /* synthetic */ com.onesignal.core.internal.http.impl.d $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ s $retVal;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i10, JSONObject jSONObject, String str2, com.onesignal.core.internal.http.impl.d dVar, s sVar, fc.d dVar2) {
            super(2, dVar2);
            this.$url = str;
            this.$timeout = i10;
            this.$jsonBody = jSONObject;
            this.$method = str2;
            this.$headers = dVar;
            this.$retVal = sVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return a.this.new e(this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x0414 A[Catch: all -> 0x0430, TryCatch #0 {all -> 0x0430, blocks: (B:104:0x0410, B:106:0x0414, B:109:0x0419, B:110:0x0443, B:114:0x0432), top: B:103:0x0410 }] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0454  */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int i10;
            HttpURLConnection httpURLConnection;
            HttpURLConnection newHttpURLConnection;
            Object id2;
            String str;
            int i11;
            HttpURLConnection httpURLConnection2;
            int i12;
            int i13;
            String headerField;
            String str2;
            int i14 = this.label;
            if (i14 == 0) {
                v6.a.W(obj);
                TrafficStats.setThreadStatsTag(a.THREAD_ID);
                try {
                    newHttpURLConnection = a.this._connectionFactory.newHttpURLConnection(this.$url);
                    try {
                        newHttpURLConnection.setUseCaches(false);
                        newHttpURLConnection.setConnectTimeout(this.$timeout);
                        newHttpURLConnection.setReadTimeout(this.$timeout);
                        newHttpURLConnection.setRequestProperty("SDK-Version", "onesignal/android/050135");
                        if (com.onesignal.common.j.getSdkType() != null && com.onesignal.common.j.getSdkVersion() != null) {
                            newHttpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + com.onesignal.common.j.getSdkType() + '/' + com.onesignal.common.j.getSdkVersion());
                        }
                        newHttpURLConnection.setRequestProperty("Accept", a.OS_ACCEPT_HEADER);
                        String pushSubscriptionId = ((com.onesignal.core.internal.config.a) a.this._configModelStore.getModel()).getPushSubscriptionId();
                        if (pushSubscriptionId != null && pushSubscriptionId.length() > 0) {
                            newHttpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                        }
                        v8.d dVar = a.this._installIdService;
                        this.L$0 = newHttpURLConnection;
                        this.L$1 = newHttpURLConnection;
                        this.L$2 = "OneSignal-Install-Id";
                        this.I$0 = -1;
                        this.label = 1;
                        id2 = dVar.getId(this);
                        gc.a aVar = gc.a.f2559g;
                        if (id2 == aVar) {
                            return aVar;
                        }
                        str = "OneSignal-Install-Id";
                        i11 = -1;
                        httpURLConnection2 = newHttpURLConnection;
                    } catch (Throwable th2) {
                        th = th2;
                        i10 = -1;
                        httpURLConnection = newHttpURLConnection;
                        if (!(th instanceof ConnectException)) {
                            com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                            this.$retVal.f5683g = new w8.a(i10, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                            }
                            return o.f277a;
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f5683g = new w8.a(i10, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return o.f277a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i10 = -1;
                    httpURLConnection = null;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.I$0;
                str = (String) this.L$2;
                newHttpURLConnection = (HttpURLConnection) this.L$1;
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) this.L$0;
                try {
                    v6.a.W(obj);
                    httpURLConnection2 = httpURLConnection3;
                    id2 = obj;
                } catch (Throwable th4) {
                    th = th4;
                    i10 = i11;
                    httpURLConnection = httpURLConnection3;
                    try {
                        if (!(th instanceof ConnectException)) {
                        }
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        this.$retVal.f5683g = new w8.a(i10, null, th, null, null, 24, null);
                        if (httpURLConnection != null) {
                        }
                        return o.f277a;
                    } catch (Throwable th5) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th5;
                    }
                }
            }
            try {
                newHttpURLConnection.setRequestProperty(str, ((UUID) id2).toString());
                if (this.$jsonBody != null) {
                    httpURLConnection2.setDoInput(true);
                }
                if (this.$method != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                    httpURLConnection2.setRequestMethod(this.$method);
                    httpURLConnection2.setDoOutput(true);
                }
                a aVar2 = a.this;
                String requestMethod = httpURLConnection2.getRequestMethod();
                URL url = httpURLConnection2.getURL();
                pc.j.d(url, "con.url");
                JSONObject jSONObject = this.$jsonBody;
                Map<String, List<String>> requestProperties = httpURLConnection2.getRequestProperties();
                pc.j.d(requestProperties, "con.requestProperties");
                aVar2.logHTTPSent(requestMethod, url, jSONObject, requestProperties);
                JSONObject jSONObject2 = this.$jsonBody;
                if (jSONObject2 != null) {
                    String unescapedEUIDString = g.INSTANCE.toUnescapedEUIDString(jSONObject2);
                    Charset forName = Charset.forName("UTF-8");
                    pc.j.d(forName, "forName(charsetName)");
                    byte[] bytes = unescapedEUIDString.getBytes(forName);
                    pc.j.d(bytes, "this as java.lang.String).getBytes(charset)");
                    httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                    httpURLConnection2.getOutputStream().write(bytes);
                }
                com.onesignal.core.internal.http.impl.d dVar2 = this.$headers;
                if ((dVar2 != null ? dVar2.getCacheKey() : null) != null) {
                    String string$default = c9.a.getString$default(a.this._prefs, "OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
                    if (string$default != null) {
                        httpURLConnection2.setRequestProperty("If-None-Match", string$default);
                        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
                    }
                }
                com.onesignal.core.internal.http.impl.d dVar3 = this.$headers;
                if ((dVar3 != null ? dVar3.getRywToken() : null) != null) {
                    httpURLConnection2.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
                }
                com.onesignal.core.internal.http.impl.d dVar4 = this.$headers;
                if ((dVar4 != null ? dVar4.getRetryCount() : null) != null) {
                    httpURLConnection2.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
                }
                com.onesignal.core.internal.http.impl.d dVar5 = this.$headers;
                if ((dVar5 != null ? dVar5.getSessionDuration() : null) != null) {
                    httpURLConnection2.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
                }
                int responseCode = httpURLConnection2.getResponseCode();
                try {
                    Integer retryAfterFromResponse = a.this.retryAfterFromResponse(httpURLConnection2);
                    Integer retryLimitFromResponse = a.this.retryLimitFromResponse(httpURLConnection2);
                    long currentTimeMillis = a.this._time.getCurrentTimeMillis() + ((retryAfterFromResponse != null ? retryAfterFromResponse.intValue() : 0) * 1000);
                    if (currentTimeMillis > a.this.delayNewRequestsUntil) {
                        a.this.delayNewRequestsUntil = currentTimeMillis;
                    }
                    String str3 = "GET";
                    if (responseCode != 304) {
                        try {
                            switch (responseCode) {
                                case 200:
                                case 201:
                                case 202:
                                    Scanner scanner = new Scanner(httpURLConnection2.getInputStream(), "UTF-8");
                                    String next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                                    scanner.close();
                                    StringBuilder sb = new StringBuilder("HttpClient: Got Response = ");
                                    String str4 = this.$method;
                                    if (str4 == null) {
                                        str4 = "GET";
                                    }
                                    sb.append(str4);
                                    sb.append(' ');
                                    sb.append(httpURLConnection2.getURL());
                                    sb.append(" - STATUS: ");
                                    sb.append(responseCode);
                                    sb.append(" - Body: ");
                                    sb.append(next);
                                    com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                                    com.onesignal.core.internal.http.impl.d dVar6 = this.$headers;
                                    if ((dVar6 != null ? dVar6.getCacheKey() : null) != null && (headerField = httpURLConnection2.getHeaderField("etag")) != null) {
                                        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                        a.this._prefs.saveString("OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), headerField);
                                        a.this._prefs.saveString("OneSignal", "PREFS_OS_HTTP_CACHE_PREFIX_" + this.$headers.getCacheKey(), next);
                                    }
                                    i13 = responseCode;
                                    this.$retVal.f5683g = new w8.a(i13, next, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder("HttpClient: Got Response = ");
                                    String str5 = this.$method;
                                    if (str5 != null) {
                                        str3 = str5;
                                    }
                                    sb2.append(str3);
                                    sb2.append(' ');
                                    sb2.append(httpURLConnection2.getURL());
                                    sb2.append(" - FAILED STATUS: ");
                                    sb2.append(responseCode);
                                    com.onesignal.debug.internal.logging.b.debug$default(sb2.toString(), null, 2, null);
                                    InputStream errorStream = httpURLConnection2.getErrorStream();
                                    if (errorStream == null) {
                                        errorStream = httpURLConnection2.getInputStream();
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
                                    i13 = responseCode;
                                    this.$retVal.f5683g = new w8.a(i13, str2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                                    break;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            i11 = i13;
                            th = th;
                            i10 = i11;
                            httpURLConnection = httpURLConnection2;
                            if (!(th instanceof ConnectException)) {
                            }
                            com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                            this.$retVal.f5683g = new w8.a(i10, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                            }
                            return o.f277a;
                        }
                    } else {
                        c9.b bVar = a.this._prefs;
                        StringBuilder sb3 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                        com.onesignal.core.internal.http.impl.d dVar7 = this.$headers;
                        sb3.append(dVar7 != null ? dVar7.getCacheKey() : null);
                        String string$default2 = c9.a.getString$default(bVar, "OneSignal", sb3.toString(), null, 4, null);
                        StringBuilder sb4 = new StringBuilder("HttpClient: Got Response = ");
                        String str6 = this.$method;
                        sb4.append(str6 == null ? "GET" : str6);
                        sb4.append(' ');
                        sb4.append(httpURLConnection2.getURL());
                        sb4.append(" - Using Cached response due to 304: ");
                        sb4.append(string$default2);
                        com.onesignal.debug.internal.logging.b.debug$default(sb4.toString(), null, 2, null);
                        i12 = responseCode;
                        try {
                            this.$retVal.f5683g = new w8.a(i12, string$default2, null, retryAfterFromResponse, retryLimitFromResponse, 4, null);
                        } catch (Throwable th7) {
                            th = th7;
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            i10 = i12;
                            if (!(th instanceof ConnectException) && !(th instanceof UnknownHostException)) {
                                com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                                this.$retVal.f5683g = new w8.a(i10, null, th, null, null, 24, null);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return o.f277a;
                            }
                            com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                            this.$retVal.f5683g = new w8.a(i10, null, th, null, null, 24, null);
                            if (httpURLConnection != null) {
                            }
                            return o.f277a;
                        }
                    }
                    httpURLConnection2.disconnect();
                } catch (Throwable th8) {
                    th = th8;
                    i12 = responseCode;
                }
            } catch (Throwable th9) {
                th = th9;
            }
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((e) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    public a(com.onesignal.core.internal.http.impl.c cVar, c9.b bVar, com.onesignal.core.internal.config.b bVar2, e9.a aVar, v8.d dVar) {
        pc.j.e(cVar, "_connectionFactory");
        pc.j.e(bVar, "_prefs");
        pc.j.e(bVar2, "_configModelStore");
        pc.j.e(aVar, "_time");
        pc.j.e(dVar, "_installIdService");
        this._connectionFactory = cVar;
        this._prefs = bVar;
        this._configModelStore = bVar2;
        this._time = aVar;
        this._installIdService = dVar;
    }

    private final int getThreadTimeout(int i10) {
        return i10 + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String str, URL url, JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        String W = m.W(map.entrySet(), null, null, null, null, 63);
        if (str == null) {
            str = "GET";
        }
        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Request Sent = " + str + ' ' + url + " - Body: " + (jSONObject != null ? g.INSTANCE.toUnescapedEUIDString(jSONObject) : null) + " - Headers: " + W, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i10, com.onesignal.core.internal.http.impl.d dVar, fc.d dVar2) {
        b bVar;
        int i11;
        gc.a aVar;
        JSONObject jSONObject2;
        int i12;
        com.onesignal.core.internal.http.impl.d dVar3;
        String str3;
        a aVar2;
        String str4;
        a aVar3;
        v1 v1Var;
        String str5;
        String str6 = str2;
        try {
            try {
                if (dVar2 instanceof b) {
                    bVar = (b) dVar2;
                    int i13 = bVar.label;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        bVar.label = i13 - Integer.MIN_VALUE;
                        Object obj = bVar.result;
                        i11 = bVar.label;
                        aVar = gc.a.f2559g;
                        if (i11 != 0) {
                            v6.a.W(obj);
                            if (str6 != null) {
                                Boolean consentRequired = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getConsentRequired();
                                Boolean bool = Boolean.TRUE;
                                if (pc.j.a(consentRequired, bool) && !pc.j.a(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getConsentGiven(), bool)) {
                                    com.onesignal.debug.internal.logging.b.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                                    return new w8.a(0, null, null, null, null, 24, null);
                                }
                            }
                            long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                            if (currentTimeMillis > 0) {
                                bVar.L$0 = this;
                                bVar.L$1 = str;
                                bVar.L$2 = str6;
                                jSONObject2 = jSONObject;
                                bVar.L$3 = jSONObject2;
                                dVar3 = dVar;
                                bVar.L$4 = dVar3;
                                i12 = i10;
                                bVar.I$0 = i12;
                                bVar.label = 1;
                                if (a0.f(currentTimeMillis, bVar) != aVar) {
                                    str4 = str;
                                    aVar3 = this;
                                }
                            }
                            jSONObject2 = jSONObject;
                            i12 = i10;
                            dVar3 = dVar;
                            str3 = str;
                            aVar2 = this;
                            String str7 = str6;
                            JSONObject jSONObject3 = jSONObject2;
                            com.onesignal.core.internal.http.impl.d dVar4 = dVar3;
                            long threadTimeout = aVar2.getThreadTimeout(i12);
                            c cVar = aVar2.new c(str3, str7, jSONObject3, i12, dVar4, null);
                            bVar.L$0 = str3;
                            bVar.L$1 = null;
                            bVar.L$2 = null;
                            bVar.L$3 = null;
                            bVar.L$4 = null;
                            bVar.label = 2;
                            Object B = a0.B(threadTimeout, cVar, bVar);
                            return B == aVar ? aVar : B;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str5 = (String) bVar.L$0;
                            try {
                                v6.a.W(obj);
                                return obj;
                            } catch (v1 e10) {
                                v1Var = e10;
                                com.onesignal.debug.internal.logging.b.error("HttpClient: Request timed out: " + str5, v1Var);
                                return new w8.a(0, null, v1Var, null, null, 24, null);
                            }
                        }
                        int i14 = bVar.I$0;
                        com.onesignal.core.internal.http.impl.d dVar5 = (com.onesignal.core.internal.http.impl.d) bVar.L$4;
                        JSONObject jSONObject4 = (JSONObject) bVar.L$3;
                        String str8 = (String) bVar.L$2;
                        str4 = (String) bVar.L$1;
                        aVar3 = (a) bVar.L$0;
                        v6.a.W(obj);
                        i12 = i14;
                        jSONObject2 = jSONObject4;
                        dVar3 = dVar5;
                        str6 = str8;
                        str3 = str4;
                        aVar2 = aVar3;
                        String str72 = str6;
                        JSONObject jSONObject32 = jSONObject2;
                        com.onesignal.core.internal.http.impl.d dVar42 = dVar3;
                        long threadTimeout2 = aVar2.getThreadTimeout(i12);
                        c cVar2 = aVar2.new c(str3, str72, jSONObject32, i12, dVar42, null);
                        bVar.L$0 = str3;
                        bVar.L$1 = null;
                        bVar.L$2 = null;
                        bVar.L$3 = null;
                        bVar.L$4 = null;
                        bVar.label = 2;
                        Object B2 = a0.B(threadTimeout2, cVar2, bVar);
                        if (B2 == aVar) {
                        }
                    }
                }
                long threadTimeout22 = aVar2.getThreadTimeout(i12);
                c cVar22 = aVar2.new c(str3, str72, jSONObject32, i12, dVar42, null);
                bVar.L$0 = str3;
                bVar.L$1 = null;
                bVar.L$2 = null;
                bVar.L$3 = null;
                bVar.L$4 = null;
                bVar.label = 2;
                Object B22 = a0.B(threadTimeout22, cVar22, bVar);
                if (B22 == aVar) {
                }
            } catch (v1 e11) {
                v1Var = e11;
                str5 = str3;
                com.onesignal.debug.internal.logging.b.error("HttpClient: Request timed out: " + str5, v1Var);
                return new w8.a(0, null, v1Var, null, null, 24, null);
            }
            if (i11 != 0) {
            }
            str3 = str4;
            aVar2 = aVar3;
            String str722 = str6;
            JSONObject jSONObject322 = jSONObject2;
            com.onesignal.core.internal.http.impl.d dVar422 = dVar3;
        } catch (Throwable th) {
            return new w8.a(0, null, th, null, null, 24, null);
        }
        bVar = new b(dVar2);
        Object obj2 = bVar.result;
        i11 = bVar.label;
        aVar = gc.a.f2559g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i10, com.onesignal.core.internal.http.impl.d dVar, fc.d dVar2) {
        d dVar3;
        int i11;
        s sVar;
        if (dVar2 instanceof d) {
            dVar3 = (d) dVar2;
            int i12 = dVar3.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar3.label = i12 - Integer.MIN_VALUE;
                Object obj = dVar3.result;
                i11 = dVar3.label;
                if (i11 != 0) {
                    v6.a.W(obj);
                    s sVar2 = new s();
                    i iVar = i0.f8861c;
                    e eVar = new e(str, i10, jSONObject, str2, dVar, sVar2, null);
                    int i13 = 2 & 1;
                    i iVar2 = fc.j.f2348g;
                    if (i13 != 0) {
                        iVar = iVar2;
                    }
                    z zVar = (2 & 2) != 0 ? z.f8921g : z.f8924j;
                    i h10 = a0.h(iVar2, iVar, true);
                    fd.e eVar2 = i0.f8859a;
                    if (h10 != eVar2 && h10.v(fc.e.f2347g) == null) {
                        h10 = h10.d(eVar2);
                    }
                    yc.a l1Var = zVar == z.f8922h ? new l1(h10, eVar) : new r1(h10, true);
                    l1Var.f0(zVar, l1Var, eVar);
                    dVar3.L$0 = sVar2;
                    dVar3.label = 1;
                    Object j3 = l1Var.j(dVar3);
                    gc.a aVar = gc.a.f2559g;
                    if (j3 == aVar) {
                        return aVar;
                    }
                    sVar = sVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) dVar3.L$0;
                    v6.a.W(obj);
                }
                Object obj2 = sVar.f5683g;
                pc.j.b(obj2);
                return obj2;
            }
        }
        dVar3 = new d(dVar2);
        Object obj3 = dVar3.result;
        i11 = dVar3.label;
        if (i11 != 0) {
        }
        Object obj22 = sVar.f5683g;
        pc.j.b(obj22);
        return obj22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Response Retry-After: ".concat(headerField), null, 2, null);
            Integer A = h.A(headerField);
            return Integer.valueOf(A != null ? A.intValue() : ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        if (httpURLConnection.getResponseCode() == 429) {
            return Integer.valueOf(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
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
        return h.A(headerField);
    }

    @Override // w8.c
    public Object delete(String str, com.onesignal.core.internal.http.impl.d dVar, fc.d dVar2) {
        return makeRequest(str, "DELETE", null, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, dVar2);
    }

    @Override // w8.c
    public Object get(String str, com.onesignal.core.internal.http.impl.d dVar, fc.d dVar2) {
        return makeRequest(str, null, null, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpGetTimeout(), dVar, dVar2);
    }

    @Override // w8.c
    public Object patch(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.d dVar, fc.d dVar2) {
        return makeRequest(str, "PATCH", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, dVar2);
    }

    @Override // w8.c
    public Object post(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.d dVar, fc.d dVar2) {
        return makeRequest(str, "POST", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, dVar2);
    }

    @Override // w8.c
    public Object put(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.d dVar, fc.d dVar2) {
        return makeRequest(str, "PUT", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, dVar2);
    }
}
