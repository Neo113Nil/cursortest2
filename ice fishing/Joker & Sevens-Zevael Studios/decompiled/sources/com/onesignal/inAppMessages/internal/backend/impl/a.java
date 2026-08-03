package com.onesignal.inAppMessages.internal.backend.impl;

import ac.o;
import com.onesignal.common.h;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements j9.b {
    private final v8.c _deviceService;
    private final w8.c _httpClient;
    private final m9.a _hydrator;
    private int htmlNetworkRequestAttemptCount;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0023a extends hc.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C0023a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.attemptFetchWithRetries(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchInAppMessagesWithoutRywToken(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMData(null, null, null, this);
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
            return a.this.getIAMPreviewData(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public e(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMClick(null, null, null, null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends JSONObject {
        public g(String str, a aVar, String str2, String str3, String str4, boolean z10) {
            put("app_id", str);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z10) {
                put("first_click", true);
            }
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMImpression(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class i extends JSONObject {
        public i(String str, String str2, String str3, a aVar) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("first_impression", true);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class j extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMPageImpression(null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class k extends JSONObject {
        public k(String str, String str2, String str3, a aVar, String str4) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("page_id", str4);
        }
    }

    public a(w8.c cVar, v8.c cVar2, m9.a aVar) {
        pc.j.e(cVar, "_httpClient");
        pc.j.e(cVar2, "_deviceService");
        pc.j.e(aVar, "_hydrator");
        this._httpClient = cVar;
        this._deviceService = cVar2;
        this._hydrator = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0125, code lost:
    
        if (yc.a0.f(r14, r1) == r8) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0108 -> B:17:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0125 -> B:17:0x0128). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptFetchWithRetries(String str, i8.b bVar, oc.a aVar, fc.d dVar) {
        C0023a c0023a;
        a aVar2;
        int i10;
        oc.a aVar3;
        int i11;
        int i12;
        C0023a c0023a2;
        a aVar4;
        String str2;
        i8.b bVar2;
        a aVar5;
        String str3;
        i8.b bVar3;
        oc.a aVar6;
        int i13;
        w8.a aVar7;
        Object obj;
        if (dVar instanceof C0023a) {
            c0023a = (C0023a) dVar;
            int i14 = c0023a.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0023a.label = i14 - Integer.MIN_VALUE;
                aVar2 = this;
                Object obj2 = c0023a.result;
                i10 = c0023a.label;
                gc.a aVar8 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj2);
                    aVar3 = aVar;
                    i11 = 0;
                    i12 = 0;
                    c0023a2 = c0023a;
                    aVar4 = aVar2;
                    str2 = str;
                    bVar2 = bVar;
                    com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, bVar2.getRywToken(), i11 <= 0 ? new Integer(i11) : null, new Long(((Number) aVar3.invoke()).longValue()), 1, null);
                    w8.c cVar = aVar4._httpClient;
                    c0023a2.L$0 = aVar4;
                    c0023a2.L$1 = str2;
                    c0023a2.L$2 = bVar2;
                    c0023a2.L$3 = aVar3;
                    c0023a2.I$0 = i11;
                    c0023a2.I$1 = i12;
                    c0023a2.label = 1;
                    obj = cVar.get(str2, dVar2, c0023a2);
                    if (obj != aVar8) {
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj2);
                        return obj2;
                    }
                    i13 = c0023a.I$1;
                    i11 = c0023a.I$0;
                    aVar6 = (oc.a) c0023a.L$3;
                    bVar3 = (i8.b) c0023a.L$2;
                    str3 = (String) c0023a.L$1;
                    aVar5 = (a) c0023a.L$0;
                    v6.a.W(obj2);
                    oc.a aVar9 = aVar6;
                    c0023a2 = c0023a;
                    bVar2 = bVar3;
                    i12 = i13;
                    aVar3 = aVar9;
                    str2 = str3;
                    aVar4 = aVar5;
                    i11++;
                    if (i11 <= i12) {
                        c0023a2.L$0 = null;
                        c0023a2.L$1 = null;
                        c0023a2.L$2 = null;
                        c0023a2.L$3 = null;
                        c0023a2.label = 3;
                        Object fetchInAppMessagesWithoutRywToken = aVar4.fetchInAppMessagesWithoutRywToken(str2, aVar3, c0023a2);
                        return fetchInAppMessagesWithoutRywToken == aVar8 ? aVar8 : fetchInAppMessagesWithoutRywToken;
                    }
                    com.onesignal.core.internal.http.impl.d dVar22 = new com.onesignal.core.internal.http.impl.d(null, bVar2.getRywToken(), i11 <= 0 ? new Integer(i11) : null, new Long(((Number) aVar3.invoke()).longValue()), 1, null);
                    w8.c cVar2 = aVar4._httpClient;
                    c0023a2.L$0 = aVar4;
                    c0023a2.L$1 = str2;
                    c0023a2.L$2 = bVar2;
                    c0023a2.L$3 = aVar3;
                    c0023a2.I$0 = i11;
                    c0023a2.I$1 = i12;
                    c0023a2.label = 1;
                    obj = cVar2.get(str2, dVar22, c0023a2);
                    if (obj != aVar8) {
                        int i15 = i12;
                        bVar3 = bVar2;
                        c0023a = c0023a2;
                        aVar6 = aVar3;
                        i13 = i15;
                        aVar5 = aVar4;
                        str3 = str2;
                        obj2 = obj;
                        aVar7 = (w8.a) obj2;
                        if (aVar7.isSuccess()) {
                            String payload = aVar7.getPayload();
                            JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                            if (jSONObject != null) {
                                return aVar5.hydrateInAppMessages(jSONObject);
                            }
                            return null;
                        }
                        if (aVar7.getStatusCode() != 425 && aVar7.getStatusCode() != 429) {
                            aVar7.getStatusCode();
                            return null;
                        }
                        Integer retryLimit = aVar7.getRetryLimit();
                        if (retryLimit != null) {
                            i13 = retryLimit.intValue();
                        }
                        if (aVar7.getRetryAfterSeconds() != null) {
                            long intValue = r0.intValue() * 1000;
                            c0023a.L$0 = aVar5;
                            c0023a.L$1 = str3;
                            c0023a.L$2 = bVar3;
                            c0023a.L$3 = aVar6;
                            c0023a.I$0 = i11;
                            c0023a.I$1 = i13;
                            c0023a.label = 2;
                        }
                        oc.a aVar92 = aVar6;
                        c0023a2 = c0023a;
                        bVar2 = bVar3;
                        i12 = i13;
                        aVar3 = aVar92;
                        str2 = str3;
                        aVar4 = aVar5;
                        i11++;
                        if (i11 <= i12) {
                        }
                    }
                }
                i13 = c0023a.I$1;
                i11 = c0023a.I$0;
                aVar6 = (oc.a) c0023a.L$3;
                bVar3 = (i8.b) c0023a.L$2;
                str3 = (String) c0023a.L$1;
                aVar5 = (a) c0023a.L$0;
                v6.a.W(obj2);
                aVar7 = (w8.a) obj2;
                if (aVar7.isSuccess()) {
                }
            }
        }
        aVar2 = this;
        c0023a = aVar2.new C0023a(dVar);
        Object obj22 = c0023a.result;
        i10 = c0023a.label;
        gc.a aVar82 = gc.a.f2559g;
        if (i10 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInAppMessagesWithoutRywToken(String str, oc.a aVar, fc.d dVar) {
        b bVar;
        int i10;
        a aVar2;
        w8.a aVar3;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i10 = bVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    w8.c cVar = this._httpClient;
                    com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, null, null, (Long) aVar.invoke(), 7, null);
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = cVar.get(str, dVar2, bVar);
                    gc.a aVar4 = gc.a.f2559g;
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    aVar2 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (a) bVar.L$0;
                    v6.a.W(obj);
                }
                aVar3 = (w8.a) obj;
                if (aVar3.isSuccess()) {
                    String payload = aVar3.getPayload();
                    JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                    if (jSONObject != null) {
                        return aVar2.hydrateInAppMessages(jSONObject);
                    }
                }
                return null;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i10 = bVar.label;
        if (i10 != 0) {
        }
        aVar3 = (w8.a) obj2;
        if (aVar3.isSuccess()) {
        }
        return null;
    }

    private final String htmlPathForMessage(String str, String str2, String str3) {
        if (str2 == null) {
            com.onesignal.debug.internal.logging.b.error$default("Unable to find a variant for in-app message " + str, null, 2, null);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    private final List<com.onesignal.inAppMessages.internal.a> hydrateInAppMessages(JSONObject jSONObject) {
        if (!jSONObject.has("in_app_messages")) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("in_app_messages");
        m9.a aVar = this._hydrator;
        pc.j.d(jSONArray, "iamMessagesAsJSON");
        return aVar.hydrateIAMMessages(jSONArray);
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i10, String str2) {
        com.onesignal.debug.internal.logging.b.error$default("Encountered a " + i10 + " error while attempting in-app message " + str + " request: " + str2, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        com.onesignal.debug.internal.logging.b.debug$default("Successful post for in-app message " + str + " request: " + str2, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // j9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMData(String str, String str2, String str3, fc.d dVar) {
        c cVar;
        int i10;
        a aVar;
        w8.a aVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i11 = cVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.label = i11 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.result;
                i10 = cVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    String htmlPathForMessage = htmlPathForMessage(str2, str3, str);
                    if (htmlPathForMessage == null) {
                        return new j9.a(null, false);
                    }
                    w8.c cVar3 = this._httpClient;
                    cVar2.L$0 = this;
                    cVar2.label = 1;
                    obj = w8.b.get$default(cVar3, htmlPathForMessage, null, cVar2, 2, null);
                    gc.a aVar3 = gc.a.f2559g;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) cVar2.L$0;
                    v6.a.W(obj);
                }
                aVar2 = (w8.a) obj;
                if (!aVar2.isSuccess()) {
                    aVar.htmlNetworkRequestAttemptCount = 0;
                    String payload = aVar2.getPayload();
                    pc.j.b(payload);
                    return new j9.a(aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
                }
                aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar2.getStatusCode(), aVar2.getPayload());
                com.onesignal.common.h hVar = com.onesignal.common.h.INSTANCE;
                if (hVar.getResponseStatusType(aVar2.getStatusCode()) != h.a.RETRYABLE || aVar.htmlNetworkRequestAttemptCount >= hVar.getMaxNetworkRequestAttemptCount()) {
                    aVar.htmlNetworkRequestAttemptCount = 0;
                    return new j9.a(null, false);
                }
                aVar.htmlNetworkRequestAttemptCount++;
                return new j9.a(null, true);
            }
        }
        cVar = new c(dVar);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        i10 = cVar22.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) obj2;
        if (!aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // j9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMPreviewData(String str, String str2, fc.d dVar) {
        d dVar2;
        int i10;
        a aVar;
        w8.a aVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
                d dVar3 = dVar2;
                Object obj = dVar3.result;
                i10 = dVar3.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    w8.c cVar = this._httpClient;
                    dVar3.L$0 = this;
                    dVar3.label = 1;
                    obj = w8.b.get$default(cVar, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, dVar3, 2, null);
                    gc.a aVar3 = gc.a.f2559g;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) dVar3.L$0;
                    v6.a.W(obj);
                }
                aVar2 = (w8.a) obj;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar2.getStatusCode(), aVar2.getPayload());
                    return null;
                }
                String payload = aVar2.getPayload();
                pc.j.b(payload);
                return aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
            }
        }
        dVar2 = new d(dVar);
        d dVar32 = dVar2;
        Object obj2 = dVar32.result;
        i10 = dVar32.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // j9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(String str, String str2, i8.b bVar, oc.a aVar, fc.d dVar) {
        e eVar;
        int i10;
        a aVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.label = i11 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                i10 = eVar.label;
                gc.a aVar3 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    Long rywDelay = bVar.getRywDelay();
                    long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                    eVar.L$0 = this;
                    eVar.L$1 = str;
                    eVar.L$2 = str2;
                    eVar.L$3 = bVar;
                    eVar.L$4 = aVar;
                    eVar.label = 1;
                    if (a0.f(longValue, eVar) != aVar3) {
                        aVar2 = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return obj;
                }
                aVar = (oc.a) eVar.L$4;
                bVar = (i8.b) eVar.L$3;
                str2 = (String) eVar.L$2;
                str = (String) eVar.L$1;
                aVar2 = (a) eVar.L$0;
                v6.a.W(obj);
                eVar.L$0 = null;
                eVar.L$1 = null;
                eVar.L$2 = null;
                eVar.L$3 = null;
                eVar.L$4 = null;
                eVar.label = 2;
                Object attemptFetchWithRetries = aVar2.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", bVar, aVar, eVar);
                return attemptFetchWithRetries != aVar3 ? aVar3 : attemptFetchWithRetries;
            }
        }
        eVar = new e(dVar);
        Object obj2 = eVar.result;
        i10 = eVar.label;
        gc.a aVar32 = gc.a.f2559g;
        if (i10 != 0) {
        }
        eVar.L$0 = null;
        eVar.L$1 = null;
        eVar.L$2 = null;
        eVar.L$3 = null;
        eVar.L$4 = null;
        eVar.label = 2;
        Object attemptFetchWithRetries2 = aVar2.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", bVar, aVar, eVar);
        if (attemptFetchWithRetries2 != aVar32) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // j9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z10, fc.d dVar) {
        f fVar;
        int i10;
        a aVar;
        w8.a aVar2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i11 = fVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.label = i11 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.result;
                i10 = fVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    g gVar = new g(str, this, str2, str5, str3, z10);
                    w8.c cVar = this._httpClient;
                    String j3 = a4.d.j("in_app_messages/", str4, "/click");
                    fVar2.L$0 = this;
                    fVar2.label = 1;
                    obj = w8.b.post$default(cVar, j3, gVar, null, fVar2, 4, null);
                    gc.a aVar3 = gc.a.f2559g;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) fVar2.L$0;
                    v6.a.W(obj);
                }
                aVar2 = (w8.a) obj;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("engagement", aVar2.getStatusCode(), aVar2.getPayload());
                    throw new l8.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                pc.j.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("engagement", payload);
                return o.f277a;
            }
        }
        fVar = new f(dVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.result;
        i10 = fVar22.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // j9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMImpression(String str, String str2, String str3, String str4, fc.d dVar) {
        h hVar;
        int i10;
        a aVar;
        w8.a aVar2;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i11 = hVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.label = i11 - Integer.MIN_VALUE;
                h hVar2 = hVar;
                Object obj = hVar2.result;
                i10 = hVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    i iVar = new i(str, str2, str3, this);
                    w8.c cVar = this._httpClient;
                    String j3 = a4.d.j("in_app_messages/", str4, "/impression");
                    hVar2.L$0 = this;
                    hVar2.label = 1;
                    obj = w8.b.post$default(cVar, j3, iVar, null, hVar2, 4, null);
                    gc.a aVar3 = gc.a.f2559g;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) hVar2.L$0;
                    v6.a.W(obj);
                }
                aVar2 = (w8.a) obj;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("impression", aVar2.getStatusCode(), aVar2.getPayload());
                    throw new l8.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                pc.j.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("impression", payload);
                return o.f277a;
            }
        }
        hVar = new h(dVar);
        h hVar22 = hVar;
        Object obj2 = hVar22.result;
        i10 = hVar22.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // j9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, fc.d dVar) {
        j jVar;
        int i10;
        Object post$default;
        a aVar;
        w8.a aVar2;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i11 = jVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.label = i11 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.result;
                i10 = jVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    k kVar = new k(str, str2, str3, this, str5);
                    w8.c cVar = this._httpClient;
                    String j3 = a4.d.j("in_app_messages/", str4, "/pageImpression");
                    jVar2.L$0 = this;
                    jVar2.label = 1;
                    post$default = w8.b.post$default(cVar, j3, kVar, null, jVar2, 4, null);
                    gc.a aVar3 = gc.a.f2559g;
                    if (post$default == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar4 = (a) jVar2.L$0;
                    v6.a.W(obj);
                    aVar = aVar4;
                    post$default = obj;
                }
                aVar2 = (w8.a) post$default;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("page impression", aVar2.getStatusCode(), aVar2.getPayload());
                    throw new l8.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                pc.j.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("page impression", payload);
                return o.f277a;
            }
        }
        jVar = new j(dVar);
        j jVar22 = jVar;
        Object obj2 = jVar22.result;
        i10 = jVar22.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) post$default;
        if (aVar2.isSuccess()) {
        }
    }
}
