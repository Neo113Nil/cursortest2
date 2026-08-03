package com.onesignal.core.internal.backend.impl;

import ac.o;
import org.json.JSONArray;
import org.json.JSONObject;
import pc.j;
import pc.k;
import pc.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements r8.b {
    private final w8.c _http;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0008a extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0008a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchParams(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements oc.c {
        final /* synthetic */ s $influenceParams;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, a aVar) {
            super(1);
            this.$influenceParams = sVar;
            this.this$0 = aVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return o.f277a;
        }

        public final void invoke(JSONObject jSONObject) {
            j.e(jSONObject, "it");
            this.$influenceParams.f5683g = this.this$0.processOutcomeJson(jSONObject);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends k implements oc.c {
        final /* synthetic */ s $fcmParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar) {
            super(1);
            this.$fcmParams = sVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return o.f277a;
        }

        public final void invoke(JSONObject jSONObject) {
            j.e(jSONObject, "it");
            s sVar = this.$fcmParams;
            String safeString = com.onesignal.common.f.safeString(jSONObject, "api_key");
            sVar.f5683g = new r8.a(com.onesignal.common.f.safeString(jSONObject, "project_id"), com.onesignal.common.f.safeString(jSONObject, "app_id"), safeString);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends k implements oc.c {
        final /* synthetic */ s $isDirectEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s sVar) {
            super(1);
            this.$isDirectEnabled = sVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return o.f277a;
        }

        public final void invoke(JSONObject jSONObject) {
            j.e(jSONObject, "it");
            this.$isDirectEnabled.f5683g = com.onesignal.common.f.safeBool(jSONObject, "enabled");
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends k implements oc.c {
        final /* synthetic */ s $iamLimit;
        final /* synthetic */ s $indirectIAMAttributionWindow;
        final /* synthetic */ s $indirectNotificationAttributionWindow;
        final /* synthetic */ s $isIndirectEnabled;
        final /* synthetic */ s $notificationLimit;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.core.internal.backend.impl.a$e$a, reason: collision with other inner class name */
        public static final class C0009a extends k implements oc.c {
            final /* synthetic */ s $indirectNotificationAttributionWindow;
            final /* synthetic */ s $notificationLimit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0009a(s sVar, s sVar2) {
                super(1);
                this.$indirectNotificationAttributionWindow = sVar;
                this.$notificationLimit = sVar2;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return o.f277a;
            }

            public final void invoke(JSONObject jSONObject) {
                j.e(jSONObject, "it");
                this.$indirectNotificationAttributionWindow.f5683g = com.onesignal.common.f.safeInt(jSONObject, "minutes_since_displayed");
                this.$notificationLimit.f5683g = com.onesignal.common.f.safeInt(jSONObject, "limit");
            }
        }

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class b extends k implements oc.c {
            final /* synthetic */ s $iamLimit;
            final /* synthetic */ s $indirectIAMAttributionWindow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s sVar, s sVar2) {
                super(1);
                this.$indirectIAMAttributionWindow = sVar;
                this.$iamLimit = sVar2;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return o.f277a;
            }

            public final void invoke(JSONObject jSONObject) {
                j.e(jSONObject, "it");
                this.$indirectIAMAttributionWindow.f5683g = com.onesignal.common.f.safeInt(jSONObject, "minutes_since_displayed");
                this.$iamLimit.f5683g = com.onesignal.common.f.safeInt(jSONObject, "limit");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(s sVar, s sVar2, s sVar3, s sVar4, s sVar5) {
            super(1);
            this.$isIndirectEnabled = sVar;
            this.$indirectNotificationAttributionWindow = sVar2;
            this.$notificationLimit = sVar3;
            this.$indirectIAMAttributionWindow = sVar4;
            this.$iamLimit = sVar5;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return o.f277a;
        }

        public final void invoke(JSONObject jSONObject) {
            j.e(jSONObject, "indirectJSON");
            this.$isIndirectEnabled.f5683g = com.onesignal.common.f.safeBool(jSONObject, "enabled");
            com.onesignal.common.f.expandJSONObject(jSONObject, "notification_attribution", new C0009a(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            com.onesignal.common.f.expandJSONObject(jSONObject, "in_app_message_attribution", new b(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends k implements oc.c {
        final /* synthetic */ s $isUnattributedEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s sVar) {
            super(1);
            this.$isUnattributedEnabled = sVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return o.f277a;
        }

        public final void invoke(JSONObject jSONObject) {
            j.e(jSONObject, "it");
            this.$isUnattributedEnabled.f5683g = com.onesignal.common.f.safeBool(jSONObject, "enabled");
        }
    }

    public a(w8.c cVar) {
        j.e(cVar, "_http");
        this._http = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r8.c processOutcomeJson(JSONObject jSONObject) {
        s sVar = new s();
        s sVar2 = new s();
        s sVar3 = new s();
        s sVar4 = new s();
        s sVar5 = new s();
        s sVar6 = new s();
        s sVar7 = new s();
        com.onesignal.common.f.expandJSONObject(jSONObject, bb.e.DIRECT_TAG, new d(sVar5));
        com.onesignal.common.f.expandJSONObject(jSONObject, "indirect", new e(sVar6, sVar, sVar2, sVar3, sVar4));
        com.onesignal.common.f.expandJSONObject(jSONObject, "unattributed", new f(sVar7));
        return new r8.c((Integer) sVar.f5683g, (Integer) sVar2.f5683g, (Integer) sVar3.f5683g, (Integer) sVar4.f5683g, (Boolean) sVar5.f5683g, (Boolean) sVar6.f5683g, (Boolean) sVar7.f5683g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // r8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchParams(String str, String str2, fc.d dVar) {
        C0008a c0008a;
        int i10;
        a aVar;
        w8.a aVar2;
        if (dVar instanceof C0008a) {
            c0008a = (C0008a) dVar;
            int i11 = c0008a.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0008a.label = i11 - Integer.MIN_VALUE;
                Object obj = c0008a.result;
                i10 = c0008a.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
                    StringBuilder sb = new StringBuilder("apps/");
                    sb.append(str);
                    sb.append("/android_params.js");
                    String sb2 = sb.toString();
                    if (str2 != null && !com.onesignal.common.e.INSTANCE.isLocalId(str2)) {
                        sb2 = sb2 + "?player_id=" + str2;
                    }
                    w8.c cVar = this._http;
                    com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d("CACHE_KEY_REMOTE_PARAMS", null, null, null, 14, null);
                    c0008a.L$0 = this;
                    c0008a.label = 1;
                    obj = cVar.get(sb2, dVar2, c0008a);
                    gc.a aVar3 = gc.a.f2559g;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c0008a.L$0;
                    v6.a.W(obj);
                }
                aVar2 = (w8.a) obj;
                if (aVar2.isSuccess()) {
                    throw new l8.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                j.b(payload);
                JSONObject jSONObject = new JSONObject(payload);
                s sVar = new s();
                com.onesignal.common.f.expandJSONObject(jSONObject, "outcomes", new b(sVar, aVar));
                s sVar2 = new s();
                com.onesignal.common.f.expandJSONObject(jSONObject, "fcm", new c(sVar2));
                String safeString = com.onesignal.common.f.safeString(jSONObject, "android_sender_id");
                Boolean safeBool = com.onesignal.common.f.safeBool(jSONObject, "enterp");
                Boolean safeBool2 = com.onesignal.common.f.safeBool(jSONObject, "require_ident_auth");
                JSONArray optJSONArray = jSONObject.optJSONArray("chnl_lst");
                Boolean safeBool3 = com.onesignal.common.f.safeBool(jSONObject, "fba");
                Boolean safeBool4 = com.onesignal.common.f.safeBool(jSONObject, "restore_ttl_filter");
                Boolean safeBool5 = com.onesignal.common.f.safeBool(jSONObject, "clear_group_on_summary_click");
                Boolean safeBool6 = com.onesignal.common.f.safeBool(jSONObject, "receive_receipts_enable");
                Boolean safeBool7 = com.onesignal.common.f.safeBool(jSONObject, "disable_gms_missing_prompt");
                Boolean safeBool8 = com.onesignal.common.f.safeBool(jSONObject, "unsubscribe_on_notifications_disabled");
                Boolean safeBool9 = com.onesignal.common.f.safeBool(jSONObject, "location_shared");
                Boolean safeBool10 = com.onesignal.common.f.safeBool(jSONObject, "requires_user_privacy_consent");
                Long safeLong = com.onesignal.common.f.safeLong(jSONObject, "oprepo_execution_interval");
                r8.c cVar2 = (r8.c) sVar.f5683g;
                r8.c cVar3 = cVar2 == null ? new r8.c(null, null, null, null, null, null, null, 127, null) : cVar2;
                r8.a aVar4 = (r8.a) sVar2.f5683g;
                return new r8.d(safeString, safeBool, safeBool2, optJSONArray, safeBool3, safeBool4, safeBool5, safeBool6, safeBool7, safeBool8, safeBool9, safeBool10, safeLong, cVar3, aVar4 == null ? new r8.a(null, null, null, 7, null) : aVar4);
            }
        }
        c0008a = new C0008a(dVar);
        Object obj2 = c0008a.result;
        i10 = c0008a.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
