package com.onesignal.core.internal.backend.impl;

import E7.l;
import com.google.android.gms.internal.ads.CL;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C4860a;
import q7.v;
import u4.C5112a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class c implements u4.c {
    private final A4.c _http;

    public static final class a extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.fetchParams(null, null, this);
        }
    }

    public static final class b extends i implements l {
        final /* synthetic */ r $influenceParams;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, c cVar) {
            super(1);
            this.$influenceParams = rVar;
            this.this$0 = cVar;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f40183a;
        }

        public final void invoke(JSONObject it) {
            h.e(it, "it");
            this.$influenceParams.f38861n = this.this$0.processOutcomeJson(it);
        }
    }

    /* renamed from: com.onesignal.core.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0182c extends i implements l {
        final /* synthetic */ r $fcmParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0182c(r rVar) {
            super(1);
            this.$fcmParams = rVar;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f40183a;
        }

        public final void invoke(JSONObject it) {
            h.e(it, "it");
            r rVar = this.$fcmParams;
            String safeString = com.onesignal.common.e.safeString(it, "api_key");
            rVar.f38861n = new C5112a(com.onesignal.common.e.safeString(it, "project_id"), com.onesignal.common.e.safeString(it, "app_id"), safeString);
        }
    }

    public static final class d extends i implements l {
        final /* synthetic */ r $remoteLoggingParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r rVar) {
            super(1);
            this.$remoteLoggingParams = rVar;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f40183a;
        }

        public final void invoke(JSONObject it) {
            h.e(it, "it");
            I4.c fromString = I4.c.Companion.fromString(com.onesignal.common.e.safeString(it, "log_level"));
            this.$remoteLoggingParams.f38861n = new u4.h(fromString, false, 2, null);
        }
    }

    public static final class e extends i implements l {
        final /* synthetic */ r $isDirectEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(1);
            this.$isDirectEnabled = rVar;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f40183a;
        }

        public final void invoke(JSONObject it) {
            h.e(it, "it");
            this.$isDirectEnabled.f38861n = com.onesignal.common.e.safeBool(it, "enabled");
        }
    }

    public static final class f extends i implements l {
        final /* synthetic */ r $iamLimit;
        final /* synthetic */ r $indirectIAMAttributionWindow;
        final /* synthetic */ r $indirectNotificationAttributionWindow;
        final /* synthetic */ r $isIndirectEnabled;
        final /* synthetic */ r $notificationLimit;

        public static final class a extends i implements l {
            final /* synthetic */ r $indirectNotificationAttributionWindow;
            final /* synthetic */ r $notificationLimit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r rVar, r rVar2) {
                super(1);
                this.$indirectNotificationAttributionWindow = rVar;
                this.$notificationLimit = rVar2;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return v.f40183a;
            }

            public final void invoke(JSONObject it) {
                h.e(it, "it");
                this.$indirectNotificationAttributionWindow.f38861n = com.onesignal.common.e.safeInt(it, "minutes_since_displayed");
                this.$notificationLimit.f38861n = com.onesignal.common.e.safeInt(it, "limit");
            }
        }

        public static final class b extends i implements l {
            final /* synthetic */ r $iamLimit;
            final /* synthetic */ r $indirectIAMAttributionWindow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r rVar, r rVar2) {
                super(1);
                this.$indirectIAMAttributionWindow = rVar;
                this.$iamLimit = rVar2;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return v.f40183a;
            }

            public final void invoke(JSONObject it) {
                h.e(it, "it");
                this.$indirectIAMAttributionWindow.f38861n = com.onesignal.common.e.safeInt(it, "minutes_since_displayed");
                this.$iamLimit.f38861n = com.onesignal.common.e.safeInt(it, "limit");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar, r rVar2, r rVar3, r rVar4, r rVar5) {
            super(1);
            this.$isIndirectEnabled = rVar;
            this.$indirectNotificationAttributionWindow = rVar2;
            this.$notificationLimit = rVar3;
            this.$indirectIAMAttributionWindow = rVar4;
            this.$iamLimit = rVar5;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f40183a;
        }

        public final void invoke(JSONObject indirectJSON) {
            h.e(indirectJSON, "indirectJSON");
            this.$isIndirectEnabled.f38861n = com.onesignal.common.e.safeBool(indirectJSON, "enabled");
            com.onesignal.common.e.expandJSONObject(indirectJSON, "notification_attribution", new a(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            com.onesignal.common.e.expandJSONObject(indirectJSON, "in_app_message_attribution", new b(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }
    }

    public static final class g extends i implements l {
        final /* synthetic */ r $isUnattributedEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar) {
            super(1);
            this.$isUnattributedEnabled = rVar;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f40183a;
        }

        public final void invoke(JSONObject it) {
            h.e(it, "it");
            this.$isUnattributedEnabled.f38861n = com.onesignal.common.e.safeBool(it, "enabled");
        }
    }

    public c(A4.c _http) {
        h.e(_http, "_http");
        this._http = _http;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u4.d processOutcomeJson(JSONObject jSONObject) {
        r rVar = new r();
        r rVar2 = new r();
        r rVar3 = new r();
        r rVar4 = new r();
        r rVar5 = new r();
        r rVar6 = new r();
        r rVar7 = new r();
        com.onesignal.common.e.expandJSONObject(jSONObject, H5.e.DIRECT_TAG, new e(rVar5));
        com.onesignal.common.e.expandJSONObject(jSONObject, "indirect", new f(rVar6, rVar, rVar2, rVar3, rVar4));
        com.onesignal.common.e.expandJSONObject(jSONObject, "unattributed", new g(rVar7));
        return new u4.d((Integer) rVar.f38861n, (Integer) rVar2.f38861n, (Integer) rVar3.f38861n, (Integer) rVar4.f38861n, (Boolean) rVar5.f38861n, (Boolean) rVar6.f38861n, (Boolean) rVar7.f38861n);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // u4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchParams(String str, String str2, InterfaceC5133d interfaceC5133d) {
        a aVar;
        int i;
        c cVar;
        A4.a aVar2;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
                    StringBuilder sb = new StringBuilder("apps/");
                    sb.append(str);
                    sb.append("/android_params.js");
                    String sb2 = sb.toString();
                    if (str2 != null && !com.onesignal.common.d.INSTANCE.isLocalId(str2)) {
                        sb2 = CL.k(sb2, "?player_id=", str2);
                    }
                    A4.c cVar2 = this._http;
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e("CACHE_KEY_REMOTE_PARAMS", null, null, null, null, 30, null);
                    aVar.L$0 = this;
                    aVar.label = 1;
                    obj = cVar2.get(sb2, eVar, aVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    cVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (c) aVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                aVar2 = (A4.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C4860a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                try {
                    JSONObject jSONObject = new JSONObject(payload == null ? "" : payload);
                    r rVar = new r();
                    com.onesignal.common.e.expandJSONObject(jSONObject, "outcomes", new b(rVar, cVar));
                    r rVar2 = new r();
                    com.onesignal.common.e.expandJSONObject(jSONObject, "fcm", new C0182c(rVar2));
                    r rVar3 = new r();
                    com.onesignal.common.e.expandJSONObject(jSONObject, "logging_config", new d(rVar3));
                    String safeString = com.onesignal.common.e.safeString(jSONObject, "android_sender_id");
                    Boolean safeBool = com.onesignal.common.e.safeBool(jSONObject, "enterp");
                    Boolean safeBool2 = com.onesignal.common.e.safeBool(jSONObject, "jwt_required");
                    JSONArray optJSONArray = jSONObject.optJSONArray("chnl_lst");
                    Boolean safeBool3 = com.onesignal.common.e.safeBool(jSONObject, "fba");
                    Boolean safeBool4 = com.onesignal.common.e.safeBool(jSONObject, "restore_ttl_filter");
                    Boolean safeBool5 = com.onesignal.common.e.safeBool(jSONObject, "clear_group_on_summary_click");
                    Boolean safeBool6 = com.onesignal.common.e.safeBool(jSONObject, "receive_receipts_enable");
                    Boolean safeBool7 = com.onesignal.common.e.safeBool(jSONObject, "disable_gms_missing_prompt");
                    Boolean safeBool8 = com.onesignal.common.e.safeBool(jSONObject, "unsubscribe_on_notifications_disabled");
                    Boolean safeBool9 = com.onesignal.common.e.safeBool(jSONObject, "location_shared");
                    Boolean safeBool10 = com.onesignal.common.e.safeBool(jSONObject, "requires_user_privacy_consent");
                    Long safeLong = com.onesignal.common.e.safeLong(jSONObject, "oprepo_execution_interval");
                    u4.d dVar = (u4.d) rVar.f38861n;
                    u4.d dVar2 = dVar == null ? new u4.d(null, null, null, null, null, null, null, com.anythink.expressad.video.module.a.a.f21886R, null) : dVar;
                    C5112a c5112a = (C5112a) rVar2.f38861n;
                    C5112a c5112a2 = c5112a == null ? new C5112a(null, null, null, 7, null) : c5112a;
                    u4.h hVar = (u4.h) rVar3.f38861n;
                    if (hVar == null) {
                        hVar = new u4.h(null, false, 3, null);
                    }
                    return new u4.e(safeString, safeBool, safeBool2, optJSONArray, safeBool3, safeBool4, safeBool5, safeBool6, safeBool7, safeBool8, safeBool9, safeBool10, safeLong, dVar2, c5112a2, hVar);
                } catch (JSONException e6) {
                    com.onesignal.debug.internal.logging.b.warn("ParamsBackendService.fetchParams: malformed (non-JSON) response payload, will retry. status=" + aVar2.getStatusCode(), e6);
                    throw new C4860a(aVar2.getStatusCode(), payload, aVar2.getRetryAfterSeconds());
                }
            }
        }
        aVar = new a(interfaceC5133d);
        Object obj2 = aVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.label;
        if (i != 0) {
        }
        aVar2 = (A4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
