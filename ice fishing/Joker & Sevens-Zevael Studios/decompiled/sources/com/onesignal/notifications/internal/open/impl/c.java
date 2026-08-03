package com.onesignal.notifications.internal.open.impl;

import ac.o;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.g;
import fc.d;
import na.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements ta.b {
    private final ra.b _lifecycleService;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public c(ra.b bVar) {
        j.e(bVar, "_lifecycleService");
        this._lifecycleService = bVar;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!na.c.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        j.b(intent);
        Bundle extras = intent.getExtras();
        g gVar = g.INSTANCE;
        j.b(extras);
        JSONObject bundleAsJSONObject = gVar.bundleAsJSONObject(extras);
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
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, d dVar) {
        a aVar;
        Object obj;
        int i10;
        c cVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.label = i11 - Integer.MIN_VALUE;
                obj = aVar.result;
                i10 = aVar.label;
                o oVar = o.f277a;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    ra.b bVar = this._lifecycleService;
                    aVar.L$0 = this;
                    aVar.L$1 = activity;
                    aVar.L$2 = jSONObject;
                    aVar.label = 1;
                    obj = bVar.canOpenNotification(activity, jSONObject, aVar);
                    if (obj != aVar2) {
                        cVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        v6.a.W(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONObject = (JSONObject) aVar.L$2;
                activity = (Activity) aVar.L$1;
                cVar = (c) aVar.L$0;
                v6.a.W(obj);
                if (((Boolean) obj).booleanValue()) {
                    return oVar;
                }
                ra.b bVar2 = cVar._lifecycleService;
                JSONArray wrapInJsonArray = g.INSTANCE.wrapInJsonArray(jSONObject);
                aVar.L$0 = null;
                aVar.L$1 = null;
                aVar.L$2 = null;
                aVar.label = 2;
                return bVar2.notificationOpened(activity, wrapInJsonArray, aVar) == aVar2 ? aVar2 : oVar;
            }
        }
        aVar = new a(dVar);
        obj = aVar.result;
        i10 = aVar.label;
        o oVar2 = o.f277a;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
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
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // ta.b
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, d dVar) {
        o oVar = o.f277a;
        if (intent == null) {
            return oVar;
        }
        JSONObject covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (covertHMSOpenIntentToJson == null) {
            return oVar;
        }
        Object handleProcessJsonOpenData = handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson, dVar);
        return handleProcessJsonOpenData == gc.a.f2559g ? handleProcessJsonOpenData : oVar;
    }
}
