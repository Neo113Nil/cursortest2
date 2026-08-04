package com.gamericefishpro.space.yf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.gamericefishpro.space.yb.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.xf.b {
    private final com.gamericefishpro.space.tf.b _lifecycleService;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public c(com.gamericefishpro.space.tf.b _lifecycleService) {
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        this._lifecycleService = _lifecycleService;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!com.gamericefishpro.space.mf.c.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        Intrinsics.b(intent);
        Bundle extras = intent.getExtras();
        e eVar = e.INSTANCE;
        Intrinsics.b(extras);
        JSONObject jSONObjectBundleAsJSONObject = eVar.bundleAsJSONObject(extras);
        reformatButtonClickAction(jSONObjectBundleAsJSONObject);
        return jSONObjectBundleAsJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r8.notificationOpened(r6, r7, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, com.gamericefishpro.space.th.a aVar) {
        a aVar2;
        c cVar;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i = aVar2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar2.label = i - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(aVar);
            }
        } else {
            aVar2 = new a(aVar);
        }
        Object objCanOpenNotification = aVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = aVar2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                jSONObject = (JSONObject) aVar2.L$2;
                activity = (Activity) aVar2.L$1;
                cVar = (c) aVar2.L$0;
                com.gamericefishpro.space.wa.b.P(objCanOpenNotification);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(objCanOpenNotification);
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(objCanOpenNotification);
        com.gamericefishpro.space.tf.b bVar = this._lifecycleService;
        aVar2.L$0 = this;
        aVar2.L$1 = activity;
        aVar2.L$2 = jSONObject;
        aVar2.label = 1;
        objCanOpenNotification = bVar.canOpenNotification(activity, jSONObject, aVar2);
        if (objCanOpenNotification != aVar3) {
            cVar = this;
        }
        return aVar3;
        if (!((Boolean) objCanOpenNotification).booleanValue()) {
            return Unit.a;
        }
        com.gamericefishpro.space.tf.b bVar2 = cVar._lifecycleService;
        JSONArray jSONArrayWrapInJsonArray = e.INSTANCE.wrapInJsonArray(jSONObject);
        aVar2.L$0 = null;
        aVar2.L$1 = null;
        aVar2.L$2 = null;
        aVar2.label = 2;
    }

    private final void reformatButtonClickAction(JSONObject jSONObject) {
        try {
            String str = (String) com.gamericefishpro.space.mf.e.INSTANCE.getCustomJSONObject(jSONObject).remove("actionId");
            if (str == null) {
                return;
            }
            jSONObject.put("actionId", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.gamericefishpro.space.xf.b
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, com.gamericefishpro.space.th.a aVar) {
        if (intent == null) {
            return Unit.a;
        }
        JSONObject jSONObjectCovertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (jSONObjectCovertHMSOpenIntentToJson == null) {
            return Unit.a;
        }
        Object objHandleProcessJsonOpenData = handleProcessJsonOpenData(activity, jSONObjectCovertHMSOpenIntentToJson, aVar);
        return objHandleProcessJsonOpenData == com.gamericefishpro.space.uh.a.d ? objHandleProcessJsonOpenData : Unit.a;
    }
}
