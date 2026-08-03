package com.onesignal.inAppMessages.internal.preview;

import android.app.Activity;
import fc.d;
import hc.c;
import na.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.j;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements d9.a, ra.a {
    private final f _applicationService;
    private final l9.a _iamDisplayer;
    private final com.onesignal.notifications.internal.a _notificationActivityOpener;
    private final pa.b _notificationDisplayer;
    private final ra.b _notificationLifeCycle;
    private final s9.a _state;
    private final e9.a _time;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.preview.a$a, reason: collision with other inner class name */
    public static final class C0031a extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0031a(d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public a(l9.a aVar, f fVar, pa.b bVar, com.onesignal.notifications.internal.a aVar2, ra.b bVar2, s9.a aVar3, e9.a aVar4) {
        j.e(aVar, "_iamDisplayer");
        j.e(fVar, "_applicationService");
        j.e(bVar, "_notificationDisplayer");
        j.e(aVar2, "_notificationActivityOpener");
        j.e(bVar2, "_notificationLifeCycle");
        j.e(aVar3, "_state");
        j.e(aVar4, "_time");
        this._iamDisplayer = aVar;
        this._applicationService = fVar;
        this._notificationDisplayer = bVar;
        this._notificationActivityOpener = aVar2;
        this._notificationLifeCycle = bVar2;
        this._state = aVar3;
        this._time = aVar4;
    }

    private final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            JSONObject customJSONObject = e.INSTANCE.getCustomJSONObject(jSONObject);
            if (customJSONObject.has(ka.a.PUSH_ADDITIONAL_DATA_KEY) && (optJSONObject = customJSONObject.optJSONObject(ka.a.PUSH_ADDITIONAL_DATA_KEY)) != null && optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    @Override // d9.a
    public void bootstrap() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r10 != r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ra.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, d dVar) {
        C0031a c0031a;
        int i10;
        String inAppPreviewPushUUID;
        a aVar;
        if (dVar instanceof C0031a) {
            c0031a = (C0031a) dVar;
            int i11 = c0031a.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0031a.label = i11 - Integer.MIN_VALUE;
                Object obj = c0031a.result;
                i10 = c0031a.label;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    com.onesignal.notifications.internal.a aVar3 = this._notificationActivityOpener;
                    JSONArray put = new JSONArray().put(jSONObject);
                    j.d(put, "JSONArray().put(jsonData)");
                    c0031a.L$0 = this;
                    c0031a.L$1 = inAppPreviewPushUUID;
                    c0031a.label = 1;
                    if (aVar3.openDestinationActivity(activity, put, c0031a) != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c0031a.L$0;
                    v6.a.W(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                    return Boolean.FALSE;
                }
                String str = (String) c0031a.L$1;
                a aVar4 = (a) c0031a.L$0;
                v6.a.W(obj);
                inAppPreviewPushUUID = str;
                aVar = aVar4;
                aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                l9.a aVar5 = aVar._iamDisplayer;
                c0031a.L$0 = aVar;
                c0031a.L$1 = null;
                c0031a.label = 2;
                obj = aVar5.displayPreviewMessage(inAppPreviewPushUUID, c0031a);
            }
        }
        c0031a = new C0031a(dVar);
        Object obj2 = c0031a.result;
        i10 = c0031a.label;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
        aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
        l9.a aVar52 = aVar._iamDisplayer;
        c0031a.L$0 = aVar;
        c0031a.L$1 = null;
        c0031a.label = 2;
        obj2 = aVar52.displayPreviewMessage(inAppPreviewPushUUID, c0031a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r6.displayNotification(r7, r0) == r4) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // ra.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, d dVar) {
        b bVar;
        int i10;
        a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i10 = bVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    String inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    boolean isInForeground = this._applicationService.isInForeground();
                    gc.a aVar2 = gc.a.f2559g;
                    if (isInForeground) {
                        this._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                        l9.a aVar3 = this._iamDisplayer;
                        bVar.L$0 = this;
                        bVar.label = 1;
                        obj = aVar3.displayPreviewMessage(inAppPreviewPushUUID, bVar);
                        if (obj != aVar2) {
                            aVar = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        na.d dVar2 = new na.d(jSONObject, this._time);
                        pa.b bVar2 = this._notificationDisplayer;
                        bVar.label = 2;
                    }
                    return aVar2;
                }
                if (i10 == 1) {
                    aVar = (a) bVar.L$0;
                    v6.a.W(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return Boolean.FALSE;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i10 = bVar.label;
        if (i10 != 0) {
        }
        return Boolean.FALSE;
    }
}
