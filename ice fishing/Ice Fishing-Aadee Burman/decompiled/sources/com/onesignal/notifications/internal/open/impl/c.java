package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bumptech.glide.d;
import com.onesignal.common.f;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.e;
import u7.v;
import z5.InterfaceC5263b;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class c implements InterfaceC5263b {
    private final x5.b _lifecycleService;

    public static final class a extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public c(x5.b _lifecycleService) {
        h.e(_lifecycleService, "_lifecycleService");
        this._lifecycleService = _lifecycleService;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!t5.c.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        h.b(intent);
        Bundle extras = intent.getExtras();
        f fVar = f.INSTANCE;
        h.b(extras);
        JSONObject bundleAsJSONObject = fVar.bundleAsJSONObject(extras);
        reformatButtonClickAction(bundleAsJSONObject);
        return bundleAsJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, InterfaceC5267d interfaceC5267d) {
        a aVar;
        Object obj;
        int i;
        c cVar;
        if (interfaceC5267d instanceof a) {
            aVar = (a) interfaceC5267d;
            int i6 = aVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.label = i6 - Integer.MIN_VALUE;
                obj = aVar.result;
                A7.a aVar2 = A7.a.f58n;
                i = aVar.label;
                v vVar = v.f41350a;
                if (i != 0) {
                    d.k(obj);
                    x5.b bVar = this._lifecycleService;
                    aVar.L$0 = this;
                    aVar.L$1 = activity;
                    aVar.L$2 = jSONObject;
                    aVar.label = 1;
                    obj = bVar.canOpenNotification(activity, jSONObject, aVar);
                    if (obj != aVar2) {
                        cVar = this;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        d.k(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONObject = (JSONObject) aVar.L$2;
                activity = (Activity) aVar.L$1;
                cVar = (c) aVar.L$0;
                d.k(obj);
                if (((Boolean) obj).booleanValue()) {
                    return vVar;
                }
                x5.b bVar2 = cVar._lifecycleService;
                JSONArray wrapInJsonArray = f.INSTANCE.wrapInJsonArray(jSONObject);
                aVar.L$0 = null;
                aVar.L$1 = null;
                aVar.L$2 = null;
                aVar.label = 2;
                return bVar2.notificationOpened(activity, wrapInJsonArray, aVar) == aVar2 ? aVar2 : vVar;
            }
        }
        aVar = new a(interfaceC5267d);
        obj = aVar.result;
        A7.a aVar22 = A7.a.f58n;
        i = aVar.label;
        v vVar2 = v.f41350a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    private final void reformatButtonClickAction(JSONObject jSONObject) {
        try {
            String str = (String) e.INSTANCE.getCustomJSONObject(jSONObject).remove("actionId");
            if (str == null) {
                return;
            }
            jSONObject.put("actionId", str);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    @Override // z5.InterfaceC5263b
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, InterfaceC5267d interfaceC5267d) {
        v vVar = v.f41350a;
        if (intent == null) {
            return vVar;
        }
        JSONObject covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (covertHMSOpenIntentToJson == null) {
            return vVar;
        }
        Object handleProcessJsonOpenData = handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson, interfaceC5267d);
        return handleProcessJsonOpenData == A7.a.f58n ? handleProcessJsonOpenData : vVar;
    }
}
