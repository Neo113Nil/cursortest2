package com.onesignal.inAppMessages.internal.backend.impl;

import D.y;
import O7.AbstractC0399y;
import com.anythink.core.common.e.g;
import com.onesignal.common.g;
import java.util.List;
import m4.C4781b;
import org.json.JSONArray;
import org.json.JSONObject;
import p4.C4860a;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a implements L4.b {
    private final y4.c _deviceService;
    private final A4.c _httpClient;
    private final O4.a _hydrator;
    private int htmlNetworkRequestAttemptCount;

    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0200a extends AbstractC5219c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C0200a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.attemptFetchWithRetries(null, null, null, null, this);
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchInAppMessagesWithoutRywToken(null, null, null, this);
        }
    }

    public static final class c extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMData(null, null, null, this);
        }
    }

    public static final class d extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMPreviewData(null, null, this);
        }
    }

    public static final class e extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(null, null, null, null, this);
        }
    }

    public static final class f extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessagesIv(null, null, null, null, null, null, null, this);
        }
    }

    public static final class g extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMClick(null, null, null, null, null, false, this);
        }
    }

    public static final class h extends JSONObject {
        public h(String str, a aVar, String str2, String str3, String str4, boolean z8) {
            put("app_id", str);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("player_id", str2);
            put(g.a.f13120c, str3);
            put("variant_id", str4);
            if (z8) {
                put("first_click", true);
            }
        }
    }

    public static final class i extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMImpression(null, null, null, null, this);
        }
    }

    public static final class j extends JSONObject {
        public j(String str, String str2, String str3, a aVar) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("first_impression", true);
        }
    }

    public static final class k extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public k(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMPageImpression(null, null, null, null, null, this);
        }
    }

    public static final class l extends JSONObject {
        public l(String str, String str2, String str3, a aVar, String str4) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("page_id", str4);
        }
    }

    public a(A4.c _httpClient, y4.c _deviceService, O4.a _hydrator) {
        kotlin.jvm.internal.h.e(_httpClient, "_httpClient");
        kotlin.jvm.internal.h.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.h.e(_hydrator, "_hydrator");
        this._httpClient = _httpClient;
        this._deviceService = _deviceService;
        this._hydrator = _hydrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0168, code lost:
    
        if (O7.AbstractC0399y.f(r5, r1) == r3) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0168 -> B:17:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x017a -> B:17:0x016b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptFetchWithRetries(String str, C4781b c4781b, E7.a aVar, String str2, InterfaceC5133d interfaceC5133d) {
        C0200a c0200a;
        a aVar2;
        int i4;
        E7.a aVar3;
        String str3;
        int i9;
        int i10;
        C0200a c0200a2;
        a aVar4;
        String str4;
        C4781b c4781b2;
        JSONObject jSONObject;
        a aVar5;
        String str5;
        C4781b c4781b3;
        E7.a aVar6;
        String str6;
        int i11;
        int i12;
        A4.a aVar7;
        Object obj;
        if (interfaceC5133d instanceof C0200a) {
            c0200a = (C0200a) interfaceC5133d;
            int i13 = c0200a.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0200a.label = i13 - Integer.MIN_VALUE;
                aVar2 = this;
                Object obj2 = c0200a.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = c0200a.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj2);
                    aVar3 = aVar;
                    str3 = str2;
                    i9 = 0;
                    i10 = 0;
                    c0200a2 = c0200a;
                    aVar4 = aVar2;
                    str4 = str;
                    c4781b2 = c4781b;
                    int i14 = i10;
                    int i15 = i9;
                    jSONObject = null;
                    a aVar8 = aVar4;
                    C0200a c0200a3 = c0200a2;
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, c4781b2.getRywToken(), i9 <= 0 ? new Integer(i9) : null, new Long(((Number) aVar3.invoke()).longValue()), str3, 1, null);
                    A4.c cVar = aVar8._httpClient;
                    c0200a3.L$0 = aVar8;
                    c0200a3.L$1 = str4;
                    c0200a3.L$2 = c4781b2;
                    c0200a3.L$3 = aVar3;
                    c0200a3.L$4 = str3;
                    c0200a3.I$0 = i15;
                    c0200a3.I$1 = i14;
                    c0200a3.label = 1;
                    obj = cVar.get(str4, eVar, c0200a3);
                    if (obj != enumC5179a) {
                    }
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.f.r(obj2);
                        return obj2;
                    }
                    i12 = c0200a.I$1;
                    i11 = c0200a.I$0;
                    str6 = (String) c0200a.L$4;
                    aVar6 = (E7.a) c0200a.L$3;
                    c4781b3 = (C4781b) c0200a.L$2;
                    str5 = (String) c0200a.L$1;
                    aVar5 = (a) c0200a.L$0;
                    com.bumptech.glide.f.r(obj2);
                    char c4 = 2;
                    jSONObject = null;
                    String str7 = str6;
                    c0200a2 = c0200a;
                    c4781b2 = c4781b3;
                    aVar4 = aVar5;
                    str3 = str7;
                    E7.a aVar9 = aVar6;
                    i10 = i12;
                    aVar3 = aVar9;
                    i9 = i11 + 1;
                    if (i9 <= i10) {
                        JSONObject jSONObject2 = jSONObject;
                        c0200a2.L$0 = jSONObject2;
                        c0200a2.L$1 = jSONObject2;
                        c0200a2.L$2 = jSONObject2;
                        c0200a2.L$3 = jSONObject2;
                        c0200a2.L$4 = jSONObject2;
                        c0200a2.label = 3;
                        Object fetchInAppMessagesWithoutRywToken = aVar4.fetchInAppMessagesWithoutRywToken(str5, aVar3, str3, c0200a2);
                        return fetchInAppMessagesWithoutRywToken == enumC5179a ? enumC5179a : fetchInAppMessagesWithoutRywToken;
                    }
                    str4 = str5;
                    int i142 = i10;
                    int i152 = i9;
                    jSONObject = null;
                    a aVar82 = aVar4;
                    C0200a c0200a32 = c0200a2;
                    com.onesignal.core.internal.http.impl.e eVar2 = new com.onesignal.core.internal.http.impl.e(null, c4781b2.getRywToken(), i9 <= 0 ? new Integer(i9) : null, new Long(((Number) aVar3.invoke()).longValue()), str3, 1, null);
                    A4.c cVar2 = aVar82._httpClient;
                    c0200a32.L$0 = aVar82;
                    c0200a32.L$1 = str4;
                    c0200a32.L$2 = c4781b2;
                    c0200a32.L$3 = aVar3;
                    c0200a32.L$4 = str3;
                    c0200a32.I$0 = i152;
                    c0200a32.I$1 = i142;
                    c0200a32.label = 1;
                    obj = cVar2.get(str4, eVar2, c0200a32);
                    if (obj != enumC5179a) {
                        str5 = str4;
                        c4781b3 = c4781b2;
                        aVar6 = aVar3;
                        c0200a = c0200a32;
                        i12 = i142;
                        obj2 = obj;
                        str6 = str3;
                        aVar5 = aVar82;
                        i11 = i152;
                        aVar7 = (A4.a) obj2;
                        if (aVar7.isSuccess()) {
                            String payload = aVar7.getPayload();
                            JSONObject jSONObject3 = payload != null ? new JSONObject(payload) : jSONObject;
                            return jSONObject3 != null ? aVar5.hydrateInAppMessages(jSONObject3) : jSONObject;
                        }
                        if (aVar7.getStatusCode() != 425 && aVar7.getStatusCode() != 429) {
                            if (com.onesignal.common.g.INSTANCE.getResponseStatusType(aVar7.getStatusCode()) == g.a.UNAUTHORIZED) {
                                throw new C4860a(aVar7.getStatusCode(), aVar7.getPayload(), aVar7.getRetryAfterSeconds());
                            }
                            aVar7.getStatusCode();
                            return jSONObject;
                        }
                        Integer retryLimit = aVar7.getRetryLimit();
                        if (retryLimit != null) {
                            i12 = retryLimit.intValue();
                        }
                        if (aVar7.getRetryAfterSeconds() != null) {
                            long intValue = r0.intValue() * 1000;
                            c0200a.L$0 = aVar5;
                            c0200a.L$1 = str5;
                            c0200a.L$2 = c4781b3;
                            c0200a.L$3 = aVar6;
                            c0200a.L$4 = str6;
                            c0200a.I$0 = i11;
                            c0200a.I$1 = i12;
                            c4 = 2;
                            c0200a.label = 2;
                        } else {
                            c4 = 2;
                        }
                        String str72 = str6;
                        c0200a2 = c0200a;
                        c4781b2 = c4781b3;
                        aVar4 = aVar5;
                        str3 = str72;
                        E7.a aVar92 = aVar6;
                        i10 = i12;
                        aVar3 = aVar92;
                        i9 = i11 + 1;
                        if (i9 <= i10) {
                        }
                    }
                }
                i12 = c0200a.I$1;
                i11 = c0200a.I$0;
                str6 = (String) c0200a.L$4;
                aVar6 = (E7.a) c0200a.L$3;
                c4781b3 = (C4781b) c0200a.L$2;
                str5 = (String) c0200a.L$1;
                aVar5 = (a) c0200a.L$0;
                com.bumptech.glide.f.r(obj2);
                jSONObject = null;
                aVar7 = (A4.a) obj2;
                if (aVar7.isSuccess()) {
                }
            }
        }
        aVar2 = this;
        c0200a = aVar2.new C0200a(interfaceC5133d);
        Object obj22 = c0200a.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = c0200a.label;
        if (i4 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInAppMessagesWithoutRywToken(String str, E7.a aVar, String str2, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i4;
        a aVar2;
        A4.a aVar3;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i9 = bVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.label = i9 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = bVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    A4.c cVar = this._httpClient;
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, (Long) aVar.invoke(), str2, 7, null);
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = cVar.get(str, eVar, bVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    aVar2 = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (a) bVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                aVar3 = (A4.a) obj;
                if (aVar3.isSuccess()) {
                    if (com.onesignal.common.g.INSTANCE.getResponseStatusType(aVar3.getStatusCode()) != g.a.UNAUTHORIZED) {
                        return null;
                    }
                    throw new C4860a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
                }
                String payload = aVar3.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                if (jSONObject != null) {
                    return aVar2.hydrateInAppMessages(jSONObject);
                }
                return null;
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = bVar.label;
        if (i4 != 0) {
        }
        aVar3 = (A4.a) obj2;
        if (aVar3.isSuccess()) {
        }
    }

    public static /* synthetic */ Object fetchInAppMessagesWithoutRywToken$default(a aVar, String str, E7.a aVar2, String str2, InterfaceC5133d interfaceC5133d, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        return aVar.fetchInAppMessagesWithoutRywToken(str, aVar2, str2, interfaceC5133d);
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
        O4.a aVar = this._hydrator;
        kotlin.jvm.internal.h.b(jSONArray);
        return aVar.hydrateIAMMessages(jSONArray);
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i4, String str2) {
        com.onesignal.debug.internal.logging.b.info$default("Encountered a " + i4 + " error while attempting in-app message " + str + " request: " + str2, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        com.onesignal.debug.internal.logging.b.debug$default("Successful post for in-app message " + str + " request: " + str2, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // L4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMData(String str, String str2, String str3, InterfaceC5133d interfaceC5133d) {
        c cVar;
        int i4;
        a aVar;
        A4.a aVar2;
        if (interfaceC5133d instanceof c) {
            cVar = (c) interfaceC5133d;
            int i9 = cVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar.label = i9 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = cVar2.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    String htmlPathForMessage = htmlPathForMessage(str2, str3, str);
                    if (htmlPathForMessage == null) {
                        return new L4.a(null, false);
                    }
                    A4.c cVar3 = this._httpClient;
                    cVar2.L$0 = this;
                    cVar2.label = 1;
                    obj = A4.b.get$default(cVar3, htmlPathForMessage, null, cVar2, 2, null);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    aVar = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) cVar2.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                aVar2 = (A4.a) obj;
                if (!aVar2.isSuccess()) {
                    aVar.htmlNetworkRequestAttemptCount = 0;
                    String payload = aVar2.getPayload();
                    kotlin.jvm.internal.h.b(payload);
                    return new L4.a(aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
                }
                aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar2.getStatusCode(), aVar2.getPayload());
                com.onesignal.common.g gVar = com.onesignal.common.g.INSTANCE;
                if (gVar.getResponseStatusType(aVar2.getStatusCode()) != g.a.RETRYABLE || aVar.htmlNetworkRequestAttemptCount >= gVar.getMaxNetworkRequestAttemptCount()) {
                    aVar.htmlNetworkRequestAttemptCount = 0;
                    return new L4.a(null, false);
                }
                aVar.htmlNetworkRequestAttemptCount++;
                return new L4.a(null, true);
            }
        }
        cVar = new c(interfaceC5133d);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = cVar22.label;
        if (i4 != 0) {
        }
        aVar2 = (A4.a) obj2;
        if (!aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // L4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMPreviewData(String str, String str2, InterfaceC5133d interfaceC5133d) {
        d dVar;
        int i4;
        a aVar;
        A4.a aVar2;
        if (interfaceC5133d instanceof d) {
            dVar = (d) interfaceC5133d;
            int i9 = dVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.label = i9 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = dVar2.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    A4.c cVar = this._httpClient;
                    dVar2.L$0 = this;
                    dVar2.label = 1;
                    obj = A4.b.get$default(cVar, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, dVar2, 2, null);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    aVar = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) dVar2.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                aVar2 = (A4.a) obj;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar2.getStatusCode(), aVar2.getPayload());
                    return null;
                }
                String payload = aVar2.getPayload();
                kotlin.jvm.internal.h.b(payload);
                return aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
            }
        }
        dVar = new d(interfaceC5133d);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = dVar22.label;
        if (i4 != 0) {
        }
        aVar2 = (A4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // L4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(String str, String str2, C4781b c4781b, E7.a aVar, InterfaceC5133d interfaceC5133d) {
        e eVar;
        int i4;
        a aVar2;
        if (interfaceC5133d instanceof e) {
            eVar = (e) interfaceC5133d;
            int i9 = eVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                eVar.label = i9 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = eVar2.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    Long rywDelay = c4781b.getRywDelay();
                    long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                    eVar2.L$0 = this;
                    eVar2.L$1 = str;
                    eVar2.L$2 = str2;
                    eVar2.L$3 = c4781b;
                    eVar2.L$4 = aVar;
                    eVar2.label = 1;
                    if (AbstractC0399y.f(longValue, eVar2) != enumC5179a) {
                        aVar2 = this;
                    }
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return obj;
                }
                aVar = (E7.a) eVar2.L$4;
                c4781b = (C4781b) eVar2.L$3;
                str2 = (String) eVar2.L$2;
                str = (String) eVar2.L$1;
                aVar2 = (a) eVar2.L$0;
                com.bumptech.glide.f.r(obj);
                C4781b c4781b2 = c4781b;
                E7.a aVar3 = aVar;
                String l9 = y.l("apps/", str, "/subscriptions/", str2, "/iams");
                eVar2.L$0 = null;
                eVar2.L$1 = null;
                eVar2.L$2 = null;
                eVar2.L$3 = null;
                eVar2.L$4 = null;
                eVar2.label = 2;
                Object attemptFetchWithRetries = aVar2.attemptFetchWithRetries(l9, c4781b2, aVar3, null, eVar2);
                return attemptFetchWithRetries != enumC5179a ? enumC5179a : attemptFetchWithRetries;
            }
        }
        eVar = new e(interfaceC5133d);
        e eVar22 = eVar;
        Object obj2 = eVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = eVar22.label;
        if (i4 != 0) {
        }
        C4781b c4781b22 = c4781b;
        E7.a aVar32 = aVar;
        String l92 = y.l("apps/", str, "/subscriptions/", str2, "/iams");
        eVar22.L$0 = null;
        eVar22.L$1 = null;
        eVar22.L$2 = null;
        eVar22.L$3 = null;
        eVar22.L$4 = null;
        eVar22.label = 2;
        Object attemptFetchWithRetries2 = aVar2.attemptFetchWithRetries(l92, c4781b22, aVar32, null, eVar22);
        if (attemptFetchWithRetries2 != enumC5179a2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // L4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessagesIv(String str, String str2, String str3, String str4, C4781b c4781b, E7.a aVar, String str5, InterfaceC5133d interfaceC5133d) {
        f fVar;
        int i4;
        String str6;
        a aVar2;
        if (interfaceC5133d instanceof f) {
            fVar = (f) interfaceC5133d;
            int i9 = fVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                fVar.label = i9 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = fVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    String str7 = "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions/" + str4 + "/iams";
                    if (c4781b == null) {
                        fVar.label = 1;
                        Object fetchInAppMessagesWithoutRywToken = fetchInAppMessagesWithoutRywToken(str7, aVar, str5, fVar);
                        if (fetchInAppMessagesWithoutRywToken != enumC5179a) {
                            return fetchInAppMessagesWithoutRywToken;
                        }
                    } else {
                        Long rywDelay = c4781b.getRywDelay();
                        long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                        fVar.L$0 = this;
                        fVar.L$1 = c4781b;
                        fVar.L$2 = aVar;
                        fVar.L$3 = str5;
                        fVar.L$4 = str7;
                        fVar.label = 2;
                        if (AbstractC0399y.f(longValue, fVar) != enumC5179a) {
                            str6 = str7;
                            aVar2 = this;
                        }
                    }
                }
                if (i4 == 1) {
                    com.bumptech.glide.f.r(obj);
                    return obj;
                }
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return obj;
                }
                String str8 = (String) fVar.L$4;
                str5 = (String) fVar.L$3;
                aVar = (E7.a) fVar.L$2;
                c4781b = (C4781b) fVar.L$1;
                a aVar3 = (a) fVar.L$0;
                com.bumptech.glide.f.r(obj);
                str6 = str8;
                aVar2 = aVar3;
                C4781b c4781b2 = c4781b;
                E7.a aVar4 = aVar;
                String str9 = str5;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.L$4 = null;
                fVar.label = 3;
                Object attemptFetchWithRetries = aVar2.attemptFetchWithRetries(str6, c4781b2, aVar4, str9, fVar);
                return attemptFetchWithRetries != enumC5179a ? enumC5179a : attemptFetchWithRetries;
            }
        }
        fVar = new f(interfaceC5133d);
        Object obj2 = fVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = fVar.label;
        if (i4 != 0) {
        }
        C4781b c4781b22 = c4781b;
        E7.a aVar42 = aVar;
        String str92 = str5;
        fVar.L$0 = null;
        fVar.L$1 = null;
        fVar.L$2 = null;
        fVar.L$3 = null;
        fVar.L$4 = null;
        fVar.label = 3;
        Object attemptFetchWithRetries2 = aVar2.attemptFetchWithRetries(str6, c4781b22, aVar42, str92, fVar);
        if (attemptFetchWithRetries2 != enumC5179a2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // L4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z8, InterfaceC5133d interfaceC5133d) {
        g gVar;
        int i4;
        a aVar;
        A4.a aVar2;
        if (interfaceC5133d instanceof g) {
            gVar = (g) interfaceC5133d;
            int i9 = gVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.label = i9 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj = gVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = gVar2.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    h hVar = new h(str, this, str2, str5, str3, z8);
                    A4.c cVar = this._httpClient;
                    String k6 = y.k("in_app_messages/", str4, "/click");
                    gVar2.L$0 = this;
                    gVar2.label = 1;
                    obj = A4.b.post$default(cVar, k6, hVar, null, gVar2, 4, null);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    aVar = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) gVar2.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                aVar2 = (A4.a) obj;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("engagement", aVar2.getStatusCode(), aVar2.getPayload());
                    throw new C4860a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                kotlin.jvm.internal.h.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("engagement", payload);
                return v.f40183a;
            }
        }
        gVar = new g(interfaceC5133d);
        g gVar22 = gVar;
        Object obj2 = gVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = gVar22.label;
        if (i4 != 0) {
        }
        aVar2 = (A4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // L4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMImpression(String str, String str2, String str3, String str4, InterfaceC5133d interfaceC5133d) {
        i iVar;
        int i4;
        a aVar;
        A4.a aVar2;
        if (interfaceC5133d instanceof i) {
            iVar = (i) interfaceC5133d;
            int i9 = iVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                iVar.label = i9 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = iVar2.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    j jVar = new j(str, str2, str3, this);
                    A4.c cVar = this._httpClient;
                    String k6 = y.k("in_app_messages/", str4, "/impression");
                    iVar2.L$0 = this;
                    iVar2.label = 1;
                    obj = A4.b.post$default(cVar, k6, jVar, null, iVar2, 4, null);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    aVar = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) iVar2.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                aVar2 = (A4.a) obj;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("impression", aVar2.getStatusCode(), aVar2.getPayload());
                    throw new C4860a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                kotlin.jvm.internal.h.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("impression", payload);
                return v.f40183a;
            }
        }
        iVar = new i(interfaceC5133d);
        i iVar22 = iVar;
        Object obj2 = iVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = iVar22.label;
        if (i4 != 0) {
        }
        aVar2 = (A4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // L4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, InterfaceC5133d interfaceC5133d) {
        k kVar;
        int i4;
        Object post$default;
        a aVar;
        A4.a aVar2;
        if (interfaceC5133d instanceof k) {
            kVar = (k) interfaceC5133d;
            int i9 = kVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                kVar.label = i9 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                Object obj = kVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = kVar2.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    l lVar = new l(str, str2, str3, this, str5);
                    A4.c cVar = this._httpClient;
                    String k6 = y.k("in_app_messages/", str4, "/pageImpression");
                    kVar2.L$0 = this;
                    kVar2.label = 1;
                    post$default = A4.b.post$default(cVar, k6, lVar, null, kVar2, 4, null);
                    if (post$default == enumC5179a) {
                        return enumC5179a;
                    }
                    aVar = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar3 = (a) kVar2.L$0;
                    com.bumptech.glide.f.r(obj);
                    aVar = aVar3;
                    post$default = obj;
                }
                aVar2 = (A4.a) post$default;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("page impression", aVar2.getStatusCode(), aVar2.getPayload());
                    throw new C4860a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                kotlin.jvm.internal.h.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("page impression", payload);
                return v.f40183a;
            }
        }
        kVar = new k(interfaceC5133d);
        k kVar22 = kVar;
        Object obj2 = kVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = kVar22.label;
        if (i4 != 0) {
        }
        aVar2 = (A4.a) post$default;
        if (aVar2.isSuccess()) {
        }
    }
}
