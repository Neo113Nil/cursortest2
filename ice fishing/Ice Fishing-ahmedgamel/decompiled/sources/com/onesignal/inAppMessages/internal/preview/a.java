package com.onesignal.inAppMessages.internal.preview;

import B7.c;
import android.app.Activity;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.d;
import t5.e;
import v5.InterfaceC5106b;
import x4.f;
import x5.InterfaceC5193a;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a implements com.onesignal.core.internal.startup.a, InterfaceC5193a {
    private final f _applicationService;
    private final R4.a _iamDisplayer;
    private final com.onesignal.notifications.internal.a _notificationActivityOpener;
    private final InterfaceC5106b _notificationDisplayer;
    private final x5.b _notificationLifeCycle;
    private final Y4.a _state;
    private final K4.a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.preview.a$a, reason: collision with other inner class name */
    public static final class C0209a extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0209a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    public static final class b extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public a(R4.a _iamDisplayer, f _applicationService, InterfaceC5106b _notificationDisplayer, com.onesignal.notifications.internal.a _notificationActivityOpener, x5.b _notificationLifeCycle, Y4.a _state, K4.a _time) {
        h.e(_iamDisplayer, "_iamDisplayer");
        h.e(_applicationService, "_applicationService");
        h.e(_notificationDisplayer, "_notificationDisplayer");
        h.e(_notificationActivityOpener, "_notificationActivityOpener");
        h.e(_notificationLifeCycle, "_notificationLifeCycle");
        h.e(_state, "_state");
        h.e(_time, "_time");
        this._iamDisplayer = _iamDisplayer;
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._notificationActivityOpener = _notificationActivityOpener;
        this._notificationLifeCycle = _notificationLifeCycle;
        this._state = _state;
        this._time = _time;
    }

    private final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            JSONObject customJSONObject = e.INSTANCE.getCustomJSONObject(jSONObject);
            if (customJSONObject.has("a") && (optJSONObject = customJSONObject.optJSONObject("a")) != null && optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    @Override // com.onesignal.core.internal.startup.a
    public void bootstrap() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // x5.InterfaceC5193a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC5240d interfaceC5240d) {
        C0209a c0209a;
        int i;
        String inAppPreviewPushUUID;
        a aVar;
        if (interfaceC5240d instanceof C0209a) {
            c0209a = (C0209a) interfaceC5240d;
            int i4 = c0209a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0209a.label = i4 - Integer.MIN_VALUE;
                Object obj = c0209a.result;
                A7.a aVar2 = A7.a.f215n;
                i = c0209a.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    com.onesignal.notifications.internal.a aVar3 = this._notificationActivityOpener;
                    JSONArray put = new JSONArray().put(jSONObject);
                    h.d(put, "put(...)");
                    c0209a.L$0 = this;
                    c0209a.L$1 = inAppPreviewPushUUID;
                    c0209a.label = 1;
                    if (aVar3.openDestinationActivity(activity, put, c0209a) != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c0209a.L$0;
                    Q3.b.s(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                    return Boolean.FALSE;
                }
                String str = (String) c0209a.L$1;
                a aVar4 = (a) c0209a.L$0;
                Q3.b.s(obj);
                inAppPreviewPushUUID = str;
                aVar = aVar4;
                aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                R4.a aVar5 = aVar._iamDisplayer;
                c0209a.L$0 = aVar;
                c0209a.L$1 = null;
                c0209a.label = 2;
                obj = aVar5.displayPreviewMessage(inAppPreviewPushUUID, c0209a);
            }
        }
        c0209a = new C0209a(interfaceC5240d);
        Object obj2 = c0209a.result;
        A7.a aVar22 = A7.a.f215n;
        i = c0209a.label;
        if (i != 0) {
        }
        aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
        R4.a aVar52 = aVar._iamDisplayer;
        c0209a.L$0 = aVar;
        c0209a.L$1 = null;
        c0209a.label = 2;
        obj2 = aVar52.displayPreviewMessage(inAppPreviewPushUUID, c0209a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r6.displayNotification(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // x5.InterfaceC5193a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, InterfaceC5240d interfaceC5240d) {
        b bVar;
        int i;
        a aVar;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                A7.a aVar2 = A7.a.f215n;
                i = bVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    String inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    if (this._applicationService.isInForeground()) {
                        this._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                        R4.a aVar3 = this._iamDisplayer;
                        bVar.L$0 = this;
                        bVar.label = 1;
                        obj = aVar3.displayPreviewMessage(inAppPreviewPushUUID, bVar);
                        if (obj != aVar2) {
                            aVar = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        d dVar = new d(jSONObject, this._time);
                        InterfaceC5106b interfaceC5106b = this._notificationDisplayer;
                        bVar.label = 2;
                    }
                    return aVar2;
                }
                if (i == 1) {
                    aVar = (a) bVar.L$0;
                    Q3.b.s(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                return Boolean.FALSE;
            }
        }
        bVar = new b(interfaceC5240d);
        Object obj2 = bVar.result;
        A7.a aVar22 = A7.a.f215n;
        i = bVar.label;
        if (i != 0) {
        }
        return Boolean.FALSE;
    }
}
