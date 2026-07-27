package com.onesignal.inAppMessages.internal.preview;

import android.app.Activity;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.d;
import p5.e;
import r5.InterfaceC4966b;
import t4.f;
import t5.InterfaceC5081a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a implements com.onesignal.core.internal.startup.a, InterfaceC5081a {
    private final f _applicationService;
    private final N4.a _iamDisplayer;
    private final com.onesignal.notifications.internal.a _notificationActivityOpener;
    private final InterfaceC4966b _notificationDisplayer;
    private final t5.b _notificationLifeCycle;
    private final U4.a _state;
    private final G4.a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.preview.a$a, reason: collision with other inner class name */
    public static final class C0208a extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0208a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
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
            return a.this.canReceiveNotification(null, this);
        }
    }

    public a(N4.a _iamDisplayer, f _applicationService, InterfaceC4966b _notificationDisplayer, com.onesignal.notifications.internal.a _notificationActivityOpener, t5.b _notificationLifeCycle, U4.a _state, G4.a _time) {
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
    @Override // t5.InterfaceC5081a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC5133d interfaceC5133d) {
        C0208a c0208a;
        int i;
        String inAppPreviewPushUUID;
        a aVar;
        if (interfaceC5133d instanceof C0208a) {
            c0208a = (C0208a) interfaceC5133d;
            int i4 = c0208a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0208a.label = i4 - Integer.MIN_VALUE;
                Object obj = c0208a.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0208a.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    com.onesignal.notifications.internal.a aVar2 = this._notificationActivityOpener;
                    JSONArray put = new JSONArray().put(jSONObject);
                    h.d(put, "put(...)");
                    c0208a.L$0 = this;
                    c0208a.L$1 = inAppPreviewPushUUID;
                    c0208a.label = 1;
                    if (aVar2.openDestinationActivity(activity, put, c0208a) != enumC5179a) {
                        aVar = this;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c0208a.L$0;
                    com.bumptech.glide.f.r(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                    return Boolean.FALSE;
                }
                String str = (String) c0208a.L$1;
                a aVar3 = (a) c0208a.L$0;
                com.bumptech.glide.f.r(obj);
                inAppPreviewPushUUID = str;
                aVar = aVar3;
                aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                N4.a aVar4 = aVar._iamDisplayer;
                c0208a.L$0 = aVar;
                c0208a.L$1 = null;
                c0208a.label = 2;
                obj = aVar4.displayPreviewMessage(inAppPreviewPushUUID, c0208a);
            }
        }
        c0208a = new C0208a(interfaceC5133d);
        Object obj2 = c0208a.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0208a.label;
        if (i != 0) {
        }
        aVar._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
        N4.a aVar42 = aVar._iamDisplayer;
        c0208a.L$0 = aVar;
        c0208a.L$1 = null;
        c0208a.label = 2;
        obj2 = aVar42.displayPreviewMessage(inAppPreviewPushUUID, c0208a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r6.displayNotification(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // t5.InterfaceC5081a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        a aVar;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    String inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    if (this._applicationService.isInForeground()) {
                        this._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                        N4.a aVar2 = this._iamDisplayer;
                        bVar.L$0 = this;
                        bVar.label = 1;
                        obj = aVar2.displayPreviewMessage(inAppPreviewPushUUID, bVar);
                        if (obj != enumC5179a) {
                            aVar = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        d dVar = new d(jSONObject, this._time);
                        InterfaceC4966b interfaceC4966b = this._notificationDisplayer;
                        bVar.label = 2;
                    }
                    return enumC5179a;
                }
                if (i == 1) {
                    aVar = (a) bVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        aVar._state.setInAppMessageIdShowing(null);
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                return Boolean.FALSE;
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
        if (i != 0) {
        }
        return Boolean.FALSE;
    }
}
