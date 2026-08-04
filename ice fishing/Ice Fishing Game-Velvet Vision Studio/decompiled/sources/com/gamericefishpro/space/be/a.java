package com.gamericefishpro.space.be;

import android.app.Activity;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.mf.d;
import com.gamericefishpro.space.mf.e;
import com.gamericefishpro.space.vh.c;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.jd.a, com.gamericefishpro.space.tf.a {
    private final f _applicationService;
    private final com.gamericefishpro.space.ud.a _iamDisplayer;
    private final com.gamericefishpro.space.ye.a _notificationActivityOpener;
    private final com.gamericefishpro.space.pf.b _notificationDisplayer;
    private final com.gamericefishpro.space.tf.b _notificationLifeCycle;
    private final com.gamericefishpro.space.ge.a _state;
    private final com.gamericefishpro.space.kd.a _time;

    /* JADX INFO: renamed from: com.gamericefishpro.space.be.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0004a extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0004a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends c {
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
            return a.this.canReceiveNotification(null, this);
        }
    }

    public a(com.gamericefishpro.space.ud.a _iamDisplayer, f _applicationService, com.gamericefishpro.space.pf.b _notificationDisplayer, com.gamericefishpro.space.ye.a _notificationActivityOpener, com.gamericefishpro.space.tf.b _notificationLifeCycle, com.gamericefishpro.space.ge.a _state, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_iamDisplayer, "_iamDisplayer");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationDisplayer, "_notificationDisplayer");
        Intrinsics.checkNotNullParameter(_notificationActivityOpener, "_notificationActivityOpener");
        Intrinsics.checkNotNullParameter(_notificationLifeCycle, "_notificationLifeCycle");
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._iamDisplayer = _iamDisplayer;
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._notificationActivityOpener = _notificationActivityOpener;
        this._notificationLifeCycle = _notificationLifeCycle;
        this._state = _state;
        this._time = _time;
    }

    private final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject customJSONObject = e.INSTANCE.getCustomJSONObject(jSONObject);
            if (customJSONObject.has(com.gamericefishpro.space.jf.a.PUSH_ADDITIONAL_DATA_KEY) && (jSONObjectOptJSONObject = customJSONObject.optJSONObject(com.gamericefishpro.space.jf.a.PUSH_ADDITIONAL_DATA_KEY)) != null && jSONObjectOptJSONObject.has("os_in_app_message_preview_id")) {
                return jSONObjectOptJSONObject.optString("os_in_app_message_preview_id");
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    @Override // com.gamericefishpro.space.jd.a
    public void bootstrap() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r10 == r1) goto L26;
     */
    @Override // com.gamericefishpro.space.tf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, com.gamericefishpro.space.th.a aVar) {
        C0004a c0004a;
        String strInAppPreviewPushUUID;
        a aVar2;
        if (aVar instanceof C0004a) {
            c0004a = (C0004a) aVar;
            int i = c0004a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0004a.label = i - Integer.MIN_VALUE;
            } else {
                c0004a = new C0004a(aVar);
            }
        } else {
            c0004a = new C0004a(aVar);
        }
        Object objDisplayPreviewMessage = c0004a.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0004a.label;
        if (i2 != 0) {
            if (i2 == 1) {
                String str = (String) c0004a.L$1;
                a aVar4 = (a) c0004a.L$0;
                com.gamericefishpro.space.wa.b.P(objDisplayPreviewMessage);
                strInAppPreviewPushUUID = str;
                aVar2 = aVar4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (a) c0004a.L$0;
                com.gamericefishpro.space.wa.b.P(objDisplayPreviewMessage);
            }
            if (!((Boolean) objDisplayPreviewMessage).booleanValue()) {
                aVar2._state.setInAppMessageIdShowing(null);
            }
            return Boolean.FALSE;
        }
        com.gamericefishpro.space.wa.b.P(objDisplayPreviewMessage);
        strInAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
        if (strInAppPreviewPushUUID == null) {
            return Boolean.TRUE;
        }
        com.gamericefishpro.space.ye.a aVar5 = this._notificationActivityOpener;
        JSONArray jSONArrayPut = new JSONArray().put(jSONObject);
        Intrinsics.checkNotNullExpressionValue(jSONArrayPut, "put(...)");
        c0004a.L$0 = this;
        c0004a.L$1 = strInAppPreviewPushUUID;
        c0004a.label = 1;
        if (aVar5.openDestinationActivity(activity, jSONArrayPut, c0004a) != aVar3) {
            aVar2 = this;
        }
        return aVar3;
        aVar2._state.setInAppMessageIdShowing(strInAppPreviewPushUUID);
        com.gamericefishpro.space.ud.a aVar6 = aVar2._iamDisplayer;
        c0004a.L$0 = aVar2;
        c0004a.L$1 = null;
        c0004a.label = 2;
        objDisplayPreviewMessage = aVar6.displayPreviewMessage(strInAppPreviewPushUUID, c0004a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r6.displayNotification(r7, r0) == r1) goto L31;
     */
    @Override // com.gamericefishpro.space.tf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        a aVar2;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object objDisplayPreviewMessage = bVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objDisplayPreviewMessage);
            String strInAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
            if (strInAppPreviewPushUUID == null) {
                return Boolean.TRUE;
            }
            if (this._applicationService.isInForeground()) {
                this._state.setInAppMessageIdShowing(strInAppPreviewPushUUID);
                com.gamericefishpro.space.ud.a aVar4 = this._iamDisplayer;
                bVar.L$0 = this;
                bVar.label = 1;
                objDisplayPreviewMessage = aVar4.displayPreviewMessage(strInAppPreviewPushUUID, bVar);
                if (objDisplayPreviewMessage != aVar3) {
                    aVar2 = this;
                    if (!((Boolean) objDisplayPreviewMessage).booleanValue()) {
                        aVar2._state.setInAppMessageIdShowing(null);
                    }
                }
            } else {
                d dVar = new d(jSONObject, this._time);
                com.gamericefishpro.space.pf.b bVar2 = this._notificationDisplayer;
                bVar.label = 2;
            }
            return aVar3;
        }
        if (i2 == 1) {
            aVar2 = (a) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(objDisplayPreviewMessage);
            if (!((Boolean) objDisplayPreviewMessage).booleanValue()) {
                aVar2._state.setInAppMessageIdShowing(null);
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objDisplayPreviewMessage);
        }
        return Boolean.FALSE;
    }
}
