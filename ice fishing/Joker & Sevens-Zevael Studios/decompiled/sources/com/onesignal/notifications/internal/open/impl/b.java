package com.onesignal.notifications.internal.open.impl;

import ac.o;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.common.g;
import java.util.Iterator;
import java.util.List;
import na.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.j;
import x2.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements ta.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final oa.d _dataController;
    private final ra.b _lifecycleService;
    private final ya.a _summaryManager;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.addChildNotifications(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.open.impl.b$b, reason: collision with other inner class name */
    public static final class C0056b extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0056b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processIntent(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processToOpenIntent(null, null, null, this);
        }
    }

    public b(ya.a aVar, oa.d dVar, com.onesignal.core.internal.config.b bVar, ra.b bVar2) {
        j.e(aVar, "_summaryManager");
        j.e(dVar, "_dataController");
        j.e(bVar, "_configModelStore");
        j.e(bVar2, "_lifecycleService");
        this._summaryManager = aVar;
        this._dataController = dVar;
        this._configModelStore = bVar;
        this._lifecycleService = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[LOOP:0: B:11:0x0049->B:13:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addChildNotifications(JSONArray jSONArray, String str, fc.d dVar) {
        a aVar;
        int i10;
        Iterator it;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.label = i11 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                i10 = aVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    oa.d dVar2 = this._dataController;
                    aVar.L$0 = jSONArray;
                    aVar.label = 1;
                    obj = dVar2.listNotificationsForGroup(str, aVar);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray = (JSONArray) aVar.L$0;
                    v6.a.W(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(((oa.c) it.next()).getFullData()));
                }
                return o.f277a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.result;
        i10 = aVar.label;
        if (i10 != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return o.f277a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, fc.d dVar) {
        o oVar = o.f277a;
        if (str != null) {
            Object clearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, dVar);
            return clearNotificationOnSummaryClick == gc.a.f2559g ? clearNotificationOnSummaryClick : oVar;
        }
        e eVar = e.INSTANCE;
        if (eVar.getGrouplessNotifsCount(context) < 1) {
            eVar.getNotificationManager(context).cancel(e.GROUPLESS_SUMMARY_ID);
        }
        return oVar;
    }

    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            j.b(context);
            q qVar = new q(context);
            qVar.f8283b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r1.markAsConsumed(r2, r3, r4, r5, r6) != r7) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z10, fc.d dVar) {
        C0056b c0056b;
        int i10;
        b bVar;
        String str;
        if (dVar instanceof C0056b) {
            c0056b = (C0056b) dVar;
            int i11 = c0056b.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0056b.label = i11 - Integer.MIN_VALUE;
                C0056b c0056b2 = c0056b;
                Object obj = c0056b2.result;
                i10 = c0056b2.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    String stringExtra = intent.getStringExtra("summary");
                    c0056b2.L$0 = this;
                    c0056b2.L$1 = intent;
                    c0056b2.L$2 = stringExtra;
                    c0056b2.Z$0 = z10;
                    c0056b2.label = 1;
                    if (clearStatusBarNotifications(context, stringExtra, c0056b2) != aVar) {
                        bVar = this;
                        str = stringExtra;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return o.f277a;
                }
                z10 = c0056b2.Z$0;
                String str2 = (String) c0056b2.L$2;
                intent = (Intent) c0056b2.L$1;
                bVar = (b) c0056b2.L$0;
                v6.a.W(obj);
                str = str2;
                boolean z11 = z10;
                oa.d dVar2 = bVar._dataController;
                int intExtra = intent.getIntExtra("androidNotificationId", 0);
                boolean clearGroupOnSummaryClick = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
                c0056b2.L$0 = null;
                c0056b2.L$1 = null;
                c0056b2.L$2 = null;
                c0056b2.label = 2;
            }
        }
        c0056b = new C0056b(dVar);
        C0056b c0056b22 = c0056b;
        Object obj2 = c0056b22.result;
        i10 = c0056b22.label;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        boolean z112 = z10;
        oa.d dVar22 = bVar._dataController;
        int intExtra2 = intent.getIntExtra("androidNotificationId", 0);
        boolean clearGroupOnSummaryClick2 = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
        c0056b22.L$0 = null;
        c0056b22.L$1 = null;
        c0056b22.L$2 = null;
        c0056b22.label = 2;
    }

    private final ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", (Integer) 1);
            return contentValues;
        }
        contentValues.put("opened", (Integer) 1);
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processIntent(Context context, Intent intent, fc.d dVar) {
        c cVar;
        int i10;
        gc.a aVar;
        String stringExtra;
        boolean booleanExtra;
        b bVar;
        com.onesignal.notifications.internal.open.impl.a aVar2;
        Object processToOpenIntent;
        Intent intent2;
        com.onesignal.notifications.internal.open.impl.a aVar3;
        b bVar2;
        Context context2;
        boolean z10;
        String str;
        String stringExtra2;
        ya.a aVar4;
        Intent intent3;
        Context context3;
        b bVar3;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i11 = cVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.label = i11 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                i10 = cVar.label;
                o oVar = o.f277a;
                aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    stringExtra = intent.getStringExtra("summary");
                    booleanExtra = intent.getBooleanExtra("dismissed", false);
                    if (!booleanExtra) {
                        cVar.L$0 = this;
                        cVar.L$1 = context;
                        cVar.L$2 = intent;
                        cVar.L$3 = stringExtra;
                        cVar.Z$0 = booleanExtra;
                        cVar.label = 1;
                        processToOpenIntent = processToOpenIntent(context, intent, stringExtra, cVar);
                        if (processToOpenIntent != aVar) {
                            bVar = this;
                        }
                        return aVar;
                    }
                    bVar = this;
                    aVar2 = null;
                    cVar.L$0 = bVar;
                    cVar.L$1 = context;
                    cVar.L$2 = intent;
                    cVar.L$3 = stringExtra;
                    cVar.L$4 = aVar2;
                    cVar.Z$0 = booleanExtra;
                    cVar.label = 2;
                    if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar) {
                        com.onesignal.notifications.internal.open.impl.a aVar5 = aVar2;
                        intent2 = intent;
                        aVar3 = aVar5;
                        bVar2 = bVar;
                        context2 = context;
                        z10 = booleanExtra;
                        str = stringExtra;
                        if (str == null) {
                            aVar4 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar3;
                            cVar.L$4 = null;
                            cVar.Z$0 = z10;
                            cVar.label = 3;
                            if (aVar4.updateSummaryNotificationAfterChildRemoved(stringExtra2, z10, cVar) != aVar) {
                            }
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z10) {
                        }
                        return oVar;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        z10 = cVar.Z$0;
                        aVar3 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$4;
                        str = (String) cVar.L$3;
                        intent2 = (Intent) cVar.L$2;
                        context2 = (Context) cVar.L$1;
                        bVar2 = (b) cVar.L$0;
                        v6.a.W(obj);
                        if (str == null && (stringExtra2 = intent2.getStringExtra("grp")) != null) {
                            aVar4 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar3;
                            cVar.L$4 = null;
                            cVar.Z$0 = z10;
                            cVar.label = 3;
                            if (aVar4.updateSummaryNotificationAfterChildRemoved(stringExtra2, z10, cVar) != aVar) {
                                intent3 = intent2;
                                context3 = context2;
                                bVar3 = bVar2;
                                context2 = context3;
                                bVar2 = bVar3;
                                intent2 = intent3;
                            }
                            return aVar;
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z10) {
                        }
                        return oVar;
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return oVar;
                    }
                    z10 = cVar.Z$0;
                    aVar3 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$3;
                    intent3 = (Intent) cVar.L$2;
                    context3 = (Context) cVar.L$1;
                    bVar3 = (b) cVar.L$0;
                    v6.a.W(obj);
                    context2 = context3;
                    bVar2 = bVar3;
                    intent2 = intent3;
                    com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z10) {
                        if (context2 instanceof Activity) {
                            j.b(aVar3);
                            JSONArray dataArray = aVar3.getDataArray();
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.L$3 = null;
                            cVar.L$4 = null;
                            cVar.label = 4;
                            if (bVar2._lifecycleService.notificationOpened((Activity) context2, dataArray, cVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                        }
                    }
                    return oVar;
                }
                boolean z11 = cVar.Z$0;
                String str2 = (String) cVar.L$3;
                Intent intent4 = (Intent) cVar.L$2;
                Context context4 = (Context) cVar.L$1;
                bVar = (b) cVar.L$0;
                v6.a.W(obj);
                booleanExtra = z11;
                context = context4;
                processToOpenIntent = obj;
                stringExtra = str2;
                intent = intent4;
                aVar2 = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
                if (aVar2 == null) {
                    return oVar;
                }
                cVar.L$0 = bVar;
                cVar.L$1 = context;
                cVar.L$2 = intent;
                cVar.L$3 = stringExtra;
                cVar.L$4 = aVar2;
                cVar.Z$0 = booleanExtra;
                cVar.label = 2;
                if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar) {
                }
                return aVar;
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.result;
        i10 = cVar.label;
        o oVar2 = o.f277a;
        aVar = gc.a.f2559g;
        if (i10 != 0) {
        }
        aVar2 = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
        if (aVar2 == null) {
        }
        cVar.L$0 = bVar;
        cVar.L$1 = context;
        cVar.L$2 = intent;
        cVar.L$3 = stringExtra;
        cVar.L$4 = aVar2;
        cVar.Z$0 = booleanExtra;
        cVar.label = 2;
        if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r1.addChildNotifications(r11, r12, r2) == r8) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processToOpenIntent(Context context, Intent intent, String str, fc.d dVar) {
        d dVar2;
        Object obj;
        int i10;
        b bVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
                obj = dVar2.result;
                i10 = dVar2.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    try {
                        jSONObject2 = new JSONObject(intent.getStringExtra("onesignalData"));
                    } catch (JSONException e10) {
                        e = e10;
                        bVar = this;
                        jSONObject = null;
                    }
                    try {
                    } catch (JSONException e11) {
                        e = e11;
                        bVar = this;
                        jSONObject = jSONObject2;
                        e.printStackTrace();
                        jSONArray = null;
                        if (str != null) {
                        }
                        j.b(jSONArray);
                        j.b(jSONObject);
                        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                    }
                    if (context instanceof Activity) {
                        dVar2.L$0 = this;
                        dVar2.L$1 = intent;
                        dVar2.L$2 = str;
                        dVar2.L$3 = jSONObject2;
                        dVar2.label = 1;
                        Object canOpenNotification = this._lifecycleService.canOpenNotification((Activity) context, jSONObject2, dVar2);
                        if (canOpenNotification != aVar) {
                            obj = canOpenNotification;
                            jSONObject = jSONObject2;
                            bVar = this;
                        }
                        return aVar;
                    }
                    com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context, null, 2, null);
                    bVar = this;
                    jSONObject = jSONObject2;
                    jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                    intent.putExtra("onesignalData", jSONObject.toString());
                    jSONArray = g.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                    if (str != null) {
                        j.b(jSONArray);
                        dVar2.L$0 = jSONArray;
                        dVar2.L$1 = jSONObject;
                        dVar2.L$2 = null;
                        dVar2.L$3 = null;
                        dVar2.label = 2;
                    }
                    j.b(jSONArray);
                    j.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONObject = (JSONObject) dVar2.L$1;
                    jSONArray = (JSONArray) dVar2.L$0;
                    v6.a.W(obj);
                    j.b(jSONArray);
                    j.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                jSONObject = (JSONObject) dVar2.L$3;
                str = (String) dVar2.L$2;
                intent = (Intent) dVar2.L$1;
                bVar = (b) dVar2.L$0;
                try {
                    v6.a.W(obj);
                } catch (JSONException e12) {
                    e = e12;
                    e.printStackTrace();
                    jSONArray = null;
                    if (str != null) {
                    }
                    j.b(jSONArray);
                    j.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                intent.putExtra("onesignalData", jSONObject.toString());
                jSONArray = g.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                if (str != null) {
                }
                j.b(jSONArray);
                j.b(jSONObject);
                return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
            }
        }
        dVar2 = new d(dVar);
        obj = dVar2.result;
        i10 = dVar2.label;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
        intent.putExtra("onesignalData", jSONObject.toString());
        jSONArray = g.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
        if (str != null) {
        }
        j.b(jSONArray);
        j.b(jSONObject);
        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
    }

    @Override // ta.a
    public Object processFromContext(Context context, Intent intent, fc.d dVar) {
        boolean isOneSignalIntent = isOneSignalIntent(intent);
        o oVar = o.f277a;
        if (!isOneSignalIntent) {
            return oVar;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object processIntent = processIntent(context, intent, dVar);
        return processIntent == gc.a.f2559g ? processIntent : oVar;
    }
}
