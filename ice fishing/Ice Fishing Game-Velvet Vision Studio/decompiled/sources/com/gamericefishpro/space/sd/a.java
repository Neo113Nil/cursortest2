package com.gamericefishpro.space.sd;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.t0.y0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.rd.b {
    private final com.gamericefishpro.space.vc.c _deviceService;
    private final com.gamericefishpro.space.xc.c _httpClient;
    private final com.gamericefishpro.space.wd.a _hydrator;
    private int htmlNetworkRequestAttemptCount;

    /* JADX INFO: renamed from: com.gamericefishpro.space.sd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0052a extends com.gamericefishpro.space.vh.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C0052a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.attemptFetchWithRetries(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchInAppMessagesWithoutRywToken(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMData(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMPreviewData(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMClick(null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends JSONObject {
        public g(String str, a aVar, String str2, String str3, String str4, boolean z) throws JSONException {
            put("app_id", str);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z) {
                put("first_click", true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMImpression(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class i extends JSONObject {
        public i(String str, String str2, String str3, a aVar) throws JSONException {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("first_impression", true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class j extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMPageImpression(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class k extends JSONObject {
        public k(String str, String str2, String str3, a aVar, String str4) throws JSONException {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("page_id", str4);
        }
    }

    public a(com.gamericefishpro.space.xc.c _httpClient, com.gamericefishpro.space.vc.c _deviceService, com.gamericefishpro.space.wd.a _hydrator) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_hydrator, "_hydrator");
        this._httpClient = _httpClient;
        this._deviceService = _deviceService;
        this._hydrator = _hydrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128 A[PHI: r1 r4 r9 r10 r11 r12 r13
      0x0128: PHI (r1v10 com.gamericefishpro.space.sd.a$a) = 
      (r1v4 com.gamericefishpro.space.sd.a$a)
      (r1v4 com.gamericefishpro.space.sd.a$a)
      (r1v2 com.gamericefishpro.space.sd.a$a)
     binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r4v7 int) = (r4v3 int), (r4v3 int), (r4v10 int) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v6 int) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r10v4 kotlin.jvm.functions.Function0<java.lang.Long>) = 
      (r10v1 kotlin.jvm.functions.Function0<java.lang.Long>)
      (r10v1 kotlin.jvm.functions.Function0<java.lang.Long>)
      (r10v9 kotlin.jvm.functions.Function0<java.lang.Long>)
     binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r11v4 com.gamericefishpro.space.zb.b) = (r11v1 com.gamericefishpro.space.zb.b), (r11v1 com.gamericefishpro.space.zb.b), (r11v9 com.gamericefishpro.space.zb.b) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r12v4 java.lang.String) = (r12v1 java.lang.String), (r12v1 java.lang.String), (r12v9 java.lang.String) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r13v7 com.gamericefishpro.space.sd.a) = (r13v0 com.gamericefishpro.space.sd.a), (r13v0 com.gamericefishpro.space.sd.a), (r13v11 com.gamericefishpro.space.sd.a) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0108 -> B:52:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0125 -> B:52:0x0128). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object attemptFetchWithRetries(java.lang.String r22, com.gamericefishpro.space.zb.b r23, kotlin.jvm.functions.Function0<java.lang.Long> r24, com.gamericefishpro.space.th.a r25) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.sd.a.attemptFetchWithRetries(java.lang.String, com.gamericefishpro.space.zb.b, kotlin.jvm.functions.Function0, com.gamericefishpro.space.th.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchInAppMessagesWithoutRywToken(String str, Function0<Long> function0, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        a aVar2;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object obj = bVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = bVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.xc.c cVar = this._httpClient;
            com.gamericefishpro.space.yc.d dVar = new com.gamericefishpro.space.yc.d(null, null, null, (Long) function0.invoke(), 7, null);
            bVar.L$0 = this;
            bVar.label = 1;
            obj = cVar.get(str, dVar, bVar);
            if (obj == aVar3) {
                return aVar3;
            }
            aVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        com.gamericefishpro.space.xc.a aVar4 = (com.gamericefishpro.space.xc.a) obj;
        if (aVar4.isSuccess()) {
            String payload = aVar4.getPayload();
            JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
            if (jSONObject != null) {
                return aVar2.hydrateInAppMessages(jSONObject);
            }
        }
        return null;
    }

    private final String htmlPathForMessage(String str, String str2, String str3) {
        if (str2 == null) {
            com.gamericefishpro.space.od.b.error$default("Unable to find a variant for in-app message " + str, null, 2, null);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    private final List<com.gamericefishpro.space.qd.a> hydrateInAppMessages(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("in_app_messages")) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("in_app_messages");
        com.gamericefishpro.space.wd.a aVar = this._hydrator;
        Intrinsics.b(jSONArray);
        return aVar.hydrateIAMMessages(jSONArray);
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i2, String str2) {
        com.gamericefishpro.space.od.b.error$default("Encountered a " + i2 + " error while attempting in-app message " + str + " request: " + str2, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        com.gamericefishpro.space.od.b.debug$default("Successful post for in-app message " + str + " request: " + str2, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.rd.b
    public Object getIAMData(String str, String str2, String str3, com.gamericefishpro.space.th.a aVar) {
        c cVar;
        a aVar2;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(aVar);
            }
        } else {
            cVar = new c(aVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = cVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            String strHtmlPathForMessage = htmlPathForMessage(str2, str3, str);
            if (strHtmlPathForMessage == null) {
                return new com.gamericefishpro.space.rd.a(null, false);
            }
            com.gamericefishpro.space.xc.c cVar3 = this._httpClient;
            cVar2.L$0 = this;
            cVar2.label = 1;
            obj = com.gamericefishpro.space.xc.b.get$default(cVar3, strHtmlPathForMessage, null, cVar2, 2, null);
            if (obj == aVar3) {
                return aVar3;
            }
            aVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) cVar2.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        com.gamericefishpro.space.xc.a aVar4 = (com.gamericefishpro.space.xc.a) obj;
        if (aVar4.isSuccess()) {
            aVar2.htmlNetworkRequestAttemptCount = 0;
            String payload = aVar4.getPayload();
            Intrinsics.b(payload);
            return new com.gamericefishpro.space.rd.a(aVar2._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
        }
        aVar2.printHttpErrorForInAppMessageRequest(com.gamericefishpro.space.qd.d.HTML, aVar4.getStatusCode(), aVar4.getPayload());
        com.gamericefishpro.space.yb.f fVar = com.gamericefishpro.space.yb.f.INSTANCE;
        if (fVar.getResponseStatusType(aVar4.getStatusCode()) != com.gamericefishpro.space.yb.f.a.RETRYABLE || aVar2.htmlNetworkRequestAttemptCount >= fVar.getMaxNetworkRequestAttemptCount()) {
            aVar2.htmlNetworkRequestAttemptCount = 0;
            return new com.gamericefishpro.space.rd.a(null, false);
        }
        aVar2.htmlNetworkRequestAttemptCount++;
        return new com.gamericefishpro.space.rd.a(null, true);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.rd.b
    public Object getIAMPreviewData(String str, String str2, com.gamericefishpro.space.th.a aVar) {
        d dVar;
        a aVar2;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        d dVar2 = dVar;
        Object obj = dVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = dVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.xc.c cVar = this._httpClient;
            dVar2.L$0 = this;
            dVar2.label = 1;
            obj = com.gamericefishpro.space.xc.b.get$default(cVar, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, dVar2, 2, null);
            if (obj == aVar3) {
                return aVar3;
            }
            aVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) dVar2.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        com.gamericefishpro.space.xc.a aVar4 = (com.gamericefishpro.space.xc.a) obj;
        if (!aVar4.isSuccess()) {
            aVar2.printHttpErrorForInAppMessageRequest(com.gamericefishpro.space.qd.d.HTML, aVar4.getStatusCode(), aVar4.getPayload());
            return null;
        }
        String payload = aVar4.getPayload();
        Intrinsics.b(payload);
        return aVar2._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.rd.b
    public Object listInAppMessages(String str, String str2, com.gamericefishpro.space.zb.b bVar, Function0<Long> function0, com.gamericefishpro.space.th.a aVar) {
        e eVar;
        a aVar2;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i2 = eVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.label = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(aVar);
            }
        } else {
            eVar = new e(aVar);
        }
        Object obj = eVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = eVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            Long rywDelay = bVar.getRywDelay();
            long jLongValue = rywDelay != null ? rywDelay.longValue() : 500L;
            eVar.L$0 = this;
            eVar.L$1 = str;
            eVar.L$2 = str2;
            eVar.L$3 = bVar;
            eVar.L$4 = function0;
            eVar.label = 1;
            if (a0.i(jLongValue, eVar) != aVar3) {
                aVar2 = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return obj;
        }
        function0 = (Function0) eVar.L$4;
        bVar = (com.gamericefishpro.space.zb.b) eVar.L$3;
        str2 = (String) eVar.L$2;
        str = (String) eVar.L$1;
        aVar2 = (a) eVar.L$0;
        com.gamericefishpro.space.wa.b.P(obj);
        eVar.L$0 = null;
        eVar.L$1 = null;
        eVar.L$2 = null;
        eVar.L$3 = null;
        eVar.L$4 = null;
        eVar.label = 2;
        Object objAttemptFetchWithRetries = aVar2.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", bVar, function0, eVar);
        return objAttemptFetchWithRetries == aVar3 ? aVar3 : objAttemptFetchWithRetries;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // com.gamericefishpro.space.rd.b
    public Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z, com.gamericefishpro.space.th.a aVar) throws com.gamericefishpro.space.ec.a {
        f fVar;
        a aVar2;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(aVar);
            }
        } else {
            fVar = new f(aVar);
        }
        f fVar2 = fVar;
        Object objPost$default = fVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = fVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(objPost$default);
            g gVar = new g(str, this, str2, str5, str3, z);
            com.gamericefishpro.space.xc.c cVar = this._httpClient;
            String strG = y0.g("in_app_messages/", str4, "/click");
            fVar2.L$0 = this;
            fVar2.label = 1;
            objPost$default = com.gamericefishpro.space.xc.b.post$default(cVar, strG, gVar, null, fVar2, 4, null);
            if (objPost$default == aVar3) {
                return aVar3;
            }
            aVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) fVar2.L$0;
            com.gamericefishpro.space.wa.b.P(objPost$default);
        }
        com.gamericefishpro.space.xc.a aVar4 = (com.gamericefishpro.space.xc.a) objPost$default;
        if (!aVar4.isSuccess()) {
            aVar2.printHttpErrorForInAppMessageRequest("engagement", aVar4.getStatusCode(), aVar4.getPayload());
            throw new com.gamericefishpro.space.ec.a(aVar4.getStatusCode(), aVar4.getPayload(), aVar4.getRetryAfterSeconds());
        }
        String payload = aVar4.getPayload();
        Intrinsics.b(payload);
        aVar2.printHttpSuccessForInAppMessageRequest("engagement", payload);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.rd.b
    public Object sendIAMImpression(String str, String str2, String str3, String str4, com.gamericefishpro.space.th.a aVar) throws com.gamericefishpro.space.ec.a {
        h hVar;
        a aVar2;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(aVar);
            }
        } else {
            hVar = new h(aVar);
        }
        h hVar2 = hVar;
        Object objPost$default = hVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = hVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(objPost$default);
            i iVar = new i(str, str2, str3, this);
            com.gamericefishpro.space.xc.c cVar = this._httpClient;
            String strG = y0.g("in_app_messages/", str4, "/impression");
            hVar2.L$0 = this;
            hVar2.label = 1;
            objPost$default = com.gamericefishpro.space.xc.b.post$default(cVar, strG, iVar, null, hVar2, 4, null);
            if (objPost$default == aVar3) {
                return aVar3;
            }
            aVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) hVar2.L$0;
            com.gamericefishpro.space.wa.b.P(objPost$default);
        }
        com.gamericefishpro.space.xc.a aVar4 = (com.gamericefishpro.space.xc.a) objPost$default;
        if (!aVar4.isSuccess()) {
            aVar2.printHttpErrorForInAppMessageRequest("impression", aVar4.getStatusCode(), aVar4.getPayload());
            throw new com.gamericefishpro.space.ec.a(aVar4.getStatusCode(), aVar4.getPayload(), aVar4.getRetryAfterSeconds());
        }
        String payload = aVar4.getPayload();
        Intrinsics.b(payload);
        aVar2.printHttpSuccessForInAppMessageRequest("impression", payload);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // com.gamericefishpro.space.rd.b
    public Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, com.gamericefishpro.space.th.a aVar) throws com.gamericefishpro.space.ec.a {
        j jVar;
        Object objPost$default;
        a aVar2;
        if (aVar instanceof j) {
            jVar = (j) aVar;
            int i2 = jVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.label = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(aVar);
            }
        } else {
            jVar = new j(aVar);
        }
        j jVar2 = jVar;
        Object obj = jVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = jVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            k kVar = new k(str, str2, str3, this, str5);
            com.gamericefishpro.space.xc.c cVar = this._httpClient;
            String strG = y0.g("in_app_messages/", str4, "/pageImpression");
            jVar2.L$0 = this;
            jVar2.label = 1;
            objPost$default = com.gamericefishpro.space.xc.b.post$default(cVar, strG, kVar, null, jVar2, 4, null);
            if (objPost$default == aVar3) {
                return aVar3;
            }
            aVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar4 = (a) jVar2.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            aVar2 = aVar4;
            objPost$default = obj;
        }
        com.gamericefishpro.space.xc.a aVar5 = (com.gamericefishpro.space.xc.a) objPost$default;
        if (!aVar5.isSuccess()) {
            aVar2.printHttpErrorForInAppMessageRequest("page impression", aVar5.getStatusCode(), aVar5.getPayload());
            throw new com.gamericefishpro.space.ec.a(aVar5.getStatusCode(), aVar5.getPayload(), aVar5.getRetryAfterSeconds());
        }
        String payload = aVar5.getPayload();
        Intrinsics.b(payload);
        aVar2.printHttpSuccessForInAppMessageRequest("page impression", payload);
        return Unit.a;
    }
}
