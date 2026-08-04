package com.gamericefishpro.space.oc;

import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.nc.b {
    private final com.gamericefishpro.space.xc.c _http;

    /* JADX INFO: renamed from: com.gamericefishpro.space.oc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0036a extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0036a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchParams(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function1 {
        final /* synthetic */ a0 $influenceParams;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, a aVar) {
            super(1);
            this.$influenceParams = a0Var;
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.a;
        }

        public final void invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$influenceParams.d = this.this$0.processOutcomeJson(it);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends l implements Function1 {
        final /* synthetic */ a0 $fcmParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var) {
            super(1);
            this.$fcmParams = a0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.a;
        }

        public final void invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            a0 a0Var = this.$fcmParams;
            String strSafeString = com.gamericefishpro.space.yb.d.safeString(it, "api_key");
            a0Var.d = new com.gamericefishpro.space.nc.a(com.gamericefishpro.space.yb.d.safeString(it, "project_id"), com.gamericefishpro.space.yb.d.safeString(it, "app_id"), strSafeString);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends l implements Function1 {
        final /* synthetic */ a0 $isDirectEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a0 a0Var) {
            super(1);
            this.$isDirectEnabled = a0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.a;
        }

        public final void invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$isDirectEnabled.d = com.gamericefishpro.space.yb.d.safeBool(it, "enabled");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends l implements Function1 {
        final /* synthetic */ a0 $iamLimit;
        final /* synthetic */ a0 $indirectIAMAttributionWindow;
        final /* synthetic */ a0 $indirectNotificationAttributionWindow;
        final /* synthetic */ a0 $isIndirectEnabled;
        final /* synthetic */ a0 $notificationLimit;

        /* JADX INFO: renamed from: com.gamericefishpro.space.oc.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0037a extends l implements Function1 {
            final /* synthetic */ a0 $indirectNotificationAttributionWindow;
            final /* synthetic */ a0 $notificationLimit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0037a(a0 a0Var, a0 a0Var2) {
                super(1);
                this.$indirectNotificationAttributionWindow = a0Var;
                this.$notificationLimit = a0Var2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return Unit.a;
            }

            public final void invoke(JSONObject it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$indirectNotificationAttributionWindow.d = com.gamericefishpro.space.yb.d.safeInt(it, "minutes_since_displayed");
                this.$notificationLimit.d = com.gamericefishpro.space.yb.d.safeInt(it, "limit");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class b extends l implements Function1 {
            final /* synthetic */ a0 $iamLimit;
            final /* synthetic */ a0 $indirectIAMAttributionWindow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a0 a0Var, a0 a0Var2) {
                super(1);
                this.$indirectIAMAttributionWindow = a0Var;
                this.$iamLimit = a0Var2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return Unit.a;
            }

            public final void invoke(JSONObject it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$indirectIAMAttributionWindow.d = com.gamericefishpro.space.yb.d.safeInt(it, "minutes_since_displayed");
                this.$iamLimit.d = com.gamericefishpro.space.yb.d.safeInt(it, "limit");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5) {
            super(1);
            this.$isIndirectEnabled = a0Var;
            this.$indirectNotificationAttributionWindow = a0Var2;
            this.$notificationLimit = a0Var3;
            this.$indirectIAMAttributionWindow = a0Var4;
            this.$iamLimit = a0Var5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((JSONObject) obj);
            return Unit.a;
        }

        public final void invoke(JSONObject indirectJSON) throws JSONException {
            Intrinsics.checkNotNullParameter(indirectJSON, "indirectJSON");
            this.$isIndirectEnabled.d = com.gamericefishpro.space.yb.d.safeBool(indirectJSON, "enabled");
            com.gamericefishpro.space.yb.d.expandJSONObject(indirectJSON, "notification_attribution", new C0037a(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            com.gamericefishpro.space.yb.d.expandJSONObject(indirectJSON, "in_app_message_attribution", new b(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends l implements Function1 {
        final /* synthetic */ a0 $isUnattributedEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a0 a0Var) {
            super(1);
            this.$isUnattributedEnabled = a0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.a;
        }

        public final void invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$isUnattributedEnabled.d = com.gamericefishpro.space.yb.d.safeBool(it, "enabled");
        }
    }

    public a(com.gamericefishpro.space.xc.c _http) {
        Intrinsics.checkNotNullParameter(_http, "_http");
        this._http = _http;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.gamericefishpro.space.nc.c processOutcomeJson(JSONObject jSONObject) throws JSONException {
        a0 a0Var = new a0();
        a0 a0Var2 = new a0();
        a0 a0Var3 = new a0();
        a0 a0Var4 = new a0();
        a0 a0Var5 = new a0();
        a0 a0Var6 = new a0();
        a0 a0Var7 = new a0();
        com.gamericefishpro.space.yb.d.expandJSONObject(jSONObject, com.gamericefishpro.space.ng.e.DIRECT_TAG, new d(a0Var5));
        com.gamericefishpro.space.yb.d.expandJSONObject(jSONObject, "indirect", new e(a0Var6, a0Var, a0Var2, a0Var3, a0Var4));
        com.gamericefishpro.space.yb.d.expandJSONObject(jSONObject, "unattributed", new f(a0Var7));
        return new com.gamericefishpro.space.nc.c((Integer) a0Var.d, (Integer) a0Var2.d, (Integer) a0Var3.d, (Integer) a0Var4.d, (Boolean) a0Var5.d, (Boolean) a0Var6.d, (Boolean) a0Var7.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // com.gamericefishpro.space.nc.b
    public Object fetchParams(String str, String str2, com.gamericefishpro.space.th.a aVar) throws JSONException, com.gamericefishpro.space.ec.a {
        C0036a c0036a;
        a aVar2;
        if (aVar instanceof C0036a) {
            c0036a = (C0036a) aVar;
            int i = c0036a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0036a.label = i - Integer.MIN_VALUE;
            } else {
                c0036a = new C0036a(aVar);
            }
        } else {
            c0036a = new C0036a(aVar);
        }
        Object obj = c0036a.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0036a.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
            StringBuilder sb = new StringBuilder("apps/");
            sb.append(str);
            sb.append("/android_params.js");
            String string = sb.toString();
            if (str2 != null && !com.gamericefishpro.space.yb.c.INSTANCE.isLocalId(str2)) {
                string = string + "?player_id=" + str2;
            }
            com.gamericefishpro.space.xc.c cVar = this._http;
            com.gamericefishpro.space.yc.d dVar = new com.gamericefishpro.space.yc.d("CACHE_KEY_REMOTE_PARAMS", null, null, null, 14, null);
            c0036a.L$0 = this;
            c0036a.label = 1;
            obj = cVar.get(string, dVar, c0036a);
            if (obj == aVar3) {
                return aVar3;
            }
            aVar2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) c0036a.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        com.gamericefishpro.space.xc.a aVar4 = (com.gamericefishpro.space.xc.a) obj;
        if (!aVar4.isSuccess()) {
            throw new com.gamericefishpro.space.ec.a(aVar4.getStatusCode(), aVar4.getPayload(), aVar4.getRetryAfterSeconds());
        }
        String payload = aVar4.getPayload();
        Intrinsics.b(payload);
        JSONObject jSONObject = new JSONObject(payload);
        a0 a0Var = new a0();
        com.gamericefishpro.space.yb.d.expandJSONObject(jSONObject, "outcomes", new b(a0Var, aVar2));
        a0 a0Var2 = new a0();
        com.gamericefishpro.space.yb.d.expandJSONObject(jSONObject, "fcm", new c(a0Var2));
        String strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject, "android_sender_id");
        Boolean boolSafeBool = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "enterp");
        Boolean boolSafeBool2 = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "require_ident_auth");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("chnl_lst");
        Boolean boolSafeBool3 = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "fba");
        Boolean boolSafeBool4 = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "restore_ttl_filter");
        Boolean boolSafeBool5 = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "clear_group_on_summary_click");
        Boolean boolSafeBool6 = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "receive_receipts_enable");
        Boolean boolSafeBool7 = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "disable_gms_missing_prompt");
        Boolean boolSafeBool8 = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "unsubscribe_on_notifications_disabled");
        Boolean boolSafeBool9 = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "location_shared");
        Boolean boolSafeBool10 = com.gamericefishpro.space.yb.d.safeBool(jSONObject, "requires_user_privacy_consent");
        Long lSafeLong = com.gamericefishpro.space.yb.d.safeLong(jSONObject, "oprepo_execution_interval");
        com.gamericefishpro.space.nc.c cVar2 = (com.gamericefishpro.space.nc.c) a0Var.d;
        com.gamericefishpro.space.nc.c cVar3 = cVar2 == null ? new com.gamericefishpro.space.nc.c(null, null, null, null, null, null, null, 127, null) : cVar2;
        com.gamericefishpro.space.nc.a aVar5 = (com.gamericefishpro.space.nc.a) a0Var2.d;
        return new com.gamericefishpro.space.nc.d(strSafeString, boolSafeBool, boolSafeBool2, jSONArrayOptJSONArray, boolSafeBool3, boolSafeBool4, boolSafeBool5, boolSafeBool6, boolSafeBool7, boolSafeBool8, boolSafeBool9, boolSafeBool10, lSafeLong, cVar3, aVar5 == null ? new com.gamericefishpro.space.nc.a(null, null, null, 7, null) : aVar5);
    }
}
