package com.onesignal.notifications.internal.open.impl;

import D.N;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bumptech.glide.f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.e;
import q5.C4931c;
import q7.v;
import v5.InterfaceC5128a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class b implements InterfaceC5128a {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final q5.d _dataController;
    private final t5.b _lifecycleService;
    private final A5.a _summaryManager;

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
            return b.this.addChildNotifications(null, null, this);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.open.impl.b$b, reason: collision with other inner class name */
    public static final class C0234b extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0234b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    public static final class c extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processIntent(null, null, this);
        }
    }

    public static final class d extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processToOpenIntent(null, null, null, this);
        }
    }

    public b(A5.a _summaryManager, q5.d _dataController, com.onesignal.core.internal.config.c _configModelStore, t5.b _lifecycleService) {
        h.e(_summaryManager, "_summaryManager");
        h.e(_dataController, "_dataController");
        h.e(_configModelStore, "_configModelStore");
        h.e(_lifecycleService, "_lifecycleService");
        this._summaryManager = _summaryManager;
        this._dataController = _dataController;
        this._configModelStore = _configModelStore;
        this._lifecycleService = _lifecycleService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[LOOP:0: B:11:0x0049->B:13:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addChildNotifications(JSONArray jSONArray, String str, InterfaceC5133d interfaceC5133d) {
        a aVar;
        int i;
        Iterator it;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.label;
                if (i != 0) {
                    f.r(obj);
                    q5.d dVar = this._dataController;
                    aVar.L$0 = jSONArray;
                    aVar.label = 1;
                    obj = dVar.listNotificationsForGroup(str, aVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray = (JSONArray) aVar.L$0;
                    f.r(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(((C4931c) it.next()).getFullData()));
                }
                return v.f40183a;
            }
        }
        aVar = new a(interfaceC5133d);
        Object obj2 = aVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.label;
        if (i != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return v.f40183a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, InterfaceC5133d interfaceC5133d) {
        v vVar = v.f40183a;
        if (str != null) {
            Object clearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, interfaceC5133d);
            return clearNotificationOnSummaryClick == EnumC5179a.f41704n ? clearNotificationOnSummaryClick : vVar;
        }
        e eVar = e.INSTANCE;
        if (eVar.getGrouplessNotifsCount(context) < 1) {
            eVar.getNotificationManager(context).cancel(e.GROUPLESS_SUMMARY_ID);
        }
        return vVar;
    }

    @SuppressLint({"MissingPermission"})
    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            h.b(context);
            N n9 = new N(context);
            n9.f516b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r8.markAsConsumed(r9, r3, r4, r5, r6) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z8, InterfaceC5133d interfaceC5133d) {
        C0234b c0234b;
        int i;
        b bVar;
        String str;
        if (interfaceC5133d instanceof C0234b) {
            c0234b = (C0234b) interfaceC5133d;
            int i4 = c0234b.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0234b.label = i4 - Integer.MIN_VALUE;
                C0234b c0234b2 = c0234b;
                Object obj = c0234b2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0234b2.label;
                if (i != 0) {
                    f.r(obj);
                    String stringExtra = intent.getStringExtra("summary");
                    c0234b2.L$0 = this;
                    c0234b2.L$1 = intent;
                    c0234b2.L$2 = stringExtra;
                    c0234b2.Z$0 = z8;
                    c0234b2.label = 1;
                    if (clearStatusBarNotifications(context, stringExtra, c0234b2) != enumC5179a) {
                        bVar = this;
                        str = stringExtra;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                    return v.f40183a;
                }
                z8 = c0234b2.Z$0;
                String str2 = (String) c0234b2.L$2;
                intent = (Intent) c0234b2.L$1;
                bVar = (b) c0234b2.L$0;
                f.r(obj);
                str = str2;
                boolean z9 = z8;
                q5.d dVar = bVar._dataController;
                int intExtra = intent.getIntExtra("androidNotificationId", 0);
                boolean clearGroupOnSummaryClick = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
                c0234b2.L$0 = null;
                c0234b2.L$1 = null;
                c0234b2.L$2 = null;
                c0234b2.label = 2;
            }
        }
        c0234b = new C0234b(interfaceC5133d);
        C0234b c0234b22 = c0234b;
        Object obj2 = c0234b22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0234b22.label;
        if (i != 0) {
        }
        boolean z92 = z8;
        q5.d dVar2 = bVar._dataController;
        int intExtra2 = intent.getIntExtra("androidNotificationId", 0);
        boolean clearGroupOnSummaryClick2 = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
        c0234b22.L$0 = null;
        c0234b22.L$1 = null;
        c0234b22.L$2 = null;
        c0234b22.label = 2;
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
    public final Object processIntent(Context context, Intent intent, InterfaceC5133d interfaceC5133d) {
        c cVar;
        EnumC5179a enumC5179a;
        int i;
        String stringExtra;
        boolean booleanExtra;
        b bVar;
        com.onesignal.notifications.internal.open.impl.a aVar;
        Object processToOpenIntent;
        Intent intent2;
        com.onesignal.notifications.internal.open.impl.a aVar2;
        b bVar2;
        Context context2;
        boolean z8;
        String str;
        String stringExtra2;
        A5.a aVar3;
        Intent intent3;
        Context context3;
        b bVar3;
        if (interfaceC5133d instanceof c) {
            cVar = (c) interfaceC5133d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                enumC5179a = EnumC5179a.f41704n;
                i = cVar.label;
                v vVar = v.f40183a;
                if (i != 0) {
                    f.r(obj);
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
                        if (processToOpenIntent != enumC5179a) {
                            bVar = this;
                        }
                        return enumC5179a;
                    }
                    bVar = this;
                    aVar = null;
                    cVar.L$0 = bVar;
                    cVar.L$1 = context;
                    cVar.L$2 = intent;
                    cVar.L$3 = stringExtra;
                    cVar.L$4 = aVar;
                    cVar.Z$0 = booleanExtra;
                    cVar.label = 2;
                    if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != enumC5179a) {
                        com.onesignal.notifications.internal.open.impl.a aVar4 = aVar;
                        intent2 = intent;
                        aVar2 = aVar4;
                        bVar2 = bVar;
                        context2 = context;
                        z8 = booleanExtra;
                        str = stringExtra;
                        if (str == null) {
                            aVar3 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar2;
                            cVar.L$4 = null;
                            cVar.Z$0 = z8;
                            cVar.label = 3;
                            if (aVar3.updateSummaryNotificationAfterChildRemoved(stringExtra2, z8, cVar) != enumC5179a) {
                            }
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z8) {
                        }
                        return vVar;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i == 2) {
                        z8 = cVar.Z$0;
                        aVar2 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$4;
                        str = (String) cVar.L$3;
                        intent2 = (Intent) cVar.L$2;
                        context2 = (Context) cVar.L$1;
                        bVar2 = (b) cVar.L$0;
                        f.r(obj);
                        if (str == null && (stringExtra2 = intent2.getStringExtra("grp")) != null) {
                            aVar3 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar2;
                            cVar.L$4 = null;
                            cVar.Z$0 = z8;
                            cVar.label = 3;
                            if (aVar3.updateSummaryNotificationAfterChildRemoved(stringExtra2, z8, cVar) != enumC5179a) {
                                intent3 = intent2;
                                context3 = context2;
                                bVar3 = bVar2;
                                context2 = context3;
                                bVar2 = bVar3;
                                intent2 = intent3;
                            }
                            return enumC5179a;
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z8) {
                        }
                        return vVar;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.r(obj);
                        return vVar;
                    }
                    z8 = cVar.Z$0;
                    aVar2 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$3;
                    intent3 = (Intent) cVar.L$2;
                    context3 = (Context) cVar.L$1;
                    bVar3 = (b) cVar.L$0;
                    f.r(obj);
                    context2 = context3;
                    bVar2 = bVar3;
                    intent2 = intent3;
                    com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z8) {
                        if (context2 instanceof Activity) {
                            h.b(aVar2);
                            JSONArray dataArray = aVar2.getDataArray();
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.L$3 = null;
                            cVar.L$4 = null;
                            cVar.label = 4;
                            if (bVar2._lifecycleService.notificationOpened((Activity) context2, dataArray, cVar) == enumC5179a) {
                                return enumC5179a;
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                        }
                    }
                    return vVar;
                }
                boolean z9 = cVar.Z$0;
                String str2 = (String) cVar.L$3;
                Intent intent4 = (Intent) cVar.L$2;
                Context context4 = (Context) cVar.L$1;
                bVar = (b) cVar.L$0;
                f.r(obj);
                booleanExtra = z9;
                context = context4;
                processToOpenIntent = obj;
                stringExtra = str2;
                intent = intent4;
                aVar = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
                if (aVar == null) {
                    return vVar;
                }
                cVar.L$0 = bVar;
                cVar.L$1 = context;
                cVar.L$2 = intent;
                cVar.L$3 = stringExtra;
                cVar.L$4 = aVar;
                cVar.Z$0 = booleanExtra;
                cVar.label = 2;
                if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != enumC5179a) {
                }
                return enumC5179a;
            }
        }
        cVar = new c(interfaceC5133d);
        Object obj2 = cVar.result;
        enumC5179a = EnumC5179a.f41704n;
        i = cVar.label;
        v vVar2 = v.f40183a;
        if (i != 0) {
        }
        aVar = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
        if (aVar == null) {
        }
        cVar.L$0 = bVar;
        cVar.L$1 = context;
        cVar.L$2 = intent;
        cVar.L$3 = stringExtra;
        cVar.L$4 = aVar;
        cVar.Z$0 = booleanExtra;
        cVar.label = 2;
        if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != enumC5179a) {
        }
        return enumC5179a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r1.addChildNotifications(r11, r12, r2) == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processToOpenIntent(Context context, Intent intent, String str, InterfaceC5133d interfaceC5133d) {
        d dVar;
        Object obj;
        int i;
        b bVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        if (interfaceC5133d instanceof d) {
            dVar = (d) interfaceC5133d;
            int i4 = dVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.label = i4 - Integer.MIN_VALUE;
                obj = dVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = dVar.label;
                if (i != 0) {
                    f.r(obj);
                    try {
                        jSONObject2 = new JSONObject(intent.getStringExtra("onesignalData"));
                    } catch (JSONException e6) {
                        e = e6;
                        bVar = this;
                        jSONObject = null;
                    }
                    try {
                    } catch (JSONException e9) {
                        e = e9;
                        bVar = this;
                        jSONObject = jSONObject2;
                        e.printStackTrace();
                        jSONArray = null;
                        if (str != null) {
                        }
                        h.b(jSONArray);
                        h.b(jSONObject);
                        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                    }
                    if (context instanceof Activity) {
                        dVar.L$0 = this;
                        dVar.L$1 = intent;
                        dVar.L$2 = str;
                        dVar.L$3 = jSONObject2;
                        dVar.label = 1;
                        Object canOpenNotification = this._lifecycleService.canOpenNotification((Activity) context, jSONObject2, dVar);
                        if (canOpenNotification != enumC5179a) {
                            obj = canOpenNotification;
                            jSONObject = jSONObject2;
                            bVar = this;
                        }
                        return enumC5179a;
                    }
                    com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context, null, 2, null);
                    bVar = this;
                    jSONObject = jSONObject2;
                    jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                    intent.putExtra("onesignalData", jSONObject.toString());
                    jSONArray = com.onesignal.common.f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                    if (str != null) {
                        h.b(jSONArray);
                        dVar.L$0 = jSONArray;
                        dVar.L$1 = jSONObject;
                        dVar.L$2 = null;
                        dVar.L$3 = null;
                        dVar.label = 2;
                    }
                    h.b(jSONArray);
                    h.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONObject = (JSONObject) dVar.L$1;
                    jSONArray = (JSONArray) dVar.L$0;
                    f.r(obj);
                    h.b(jSONArray);
                    h.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                jSONObject = (JSONObject) dVar.L$3;
                str = (String) dVar.L$2;
                intent = (Intent) dVar.L$1;
                bVar = (b) dVar.L$0;
                try {
                    f.r(obj);
                } catch (JSONException e10) {
                    e = e10;
                    e.printStackTrace();
                    jSONArray = null;
                    if (str != null) {
                    }
                    h.b(jSONArray);
                    h.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                intent.putExtra("onesignalData", jSONObject.toString());
                jSONArray = com.onesignal.common.f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                if (str != null) {
                }
                h.b(jSONArray);
                h.b(jSONObject);
                return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
            }
        }
        dVar = new d(interfaceC5133d);
        obj = dVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = dVar.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
        intent.putExtra("onesignalData", jSONObject.toString());
        jSONArray = com.onesignal.common.f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
        if (str != null) {
        }
        h.b(jSONArray);
        h.b(jSONObject);
        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
    }

    @Override // v5.InterfaceC5128a
    public Object processFromContext(Context context, Intent intent, InterfaceC5133d interfaceC5133d) {
        boolean isOneSignalIntent = isOneSignalIntent(intent);
        v vVar = v.f40183a;
        if (!isOneSignalIntent) {
            return vVar;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object processIntent = processIntent(context, intent, interfaceC5133d);
        return processIntent == EnumC5179a.f41704n ? processIntent : vVar;
    }
}
