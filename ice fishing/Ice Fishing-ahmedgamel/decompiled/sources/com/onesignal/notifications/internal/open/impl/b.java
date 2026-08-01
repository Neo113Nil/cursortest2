package com.onesignal.notifications.internal.open.impl;

import D.N;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.common.f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.e;
import u5.C5082c;
import u7.v;
import z5.InterfaceC5262a;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b implements InterfaceC5262a {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final u5.d _dataController;
    private final x5.b _lifecycleService;
    private final E5.a _summaryManager;

    public static final class a extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.addChildNotifications(null, null, this);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.open.impl.b$b, reason: collision with other inner class name */
    public static final class C0235b extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0235b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    public static final class c extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processIntent(null, null, this);
        }
    }

    public static final class d extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processToOpenIntent(null, null, null, this);
        }
    }

    public b(E5.a _summaryManager, u5.d _dataController, com.onesignal.core.internal.config.c _configModelStore, x5.b _lifecycleService) {
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
    public final Object addChildNotifications(JSONArray jSONArray, String str, InterfaceC5267d interfaceC5267d) {
        a aVar;
        int i;
        Iterator it;
        if (interfaceC5267d instanceof a) {
            aVar = (a) interfaceC5267d;
            int i6 = aVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.label = i6 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                A7.a aVar2 = A7.a.f58n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    u5.d dVar = this._dataController;
                    aVar.L$0 = jSONArray;
                    aVar.label = 1;
                    obj = dVar.listNotificationsForGroup(str, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray = (JSONArray) aVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(((C5082c) it.next()).getFullData()));
                }
                return v.f41353a;
            }
        }
        aVar = new a(interfaceC5267d);
        Object obj2 = aVar.result;
        A7.a aVar22 = A7.a.f58n;
        i = aVar.label;
        if (i != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return v.f41353a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, InterfaceC5267d interfaceC5267d) {
        v vVar = v.f41353a;
        if (str != null) {
            Object clearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, interfaceC5267d);
            return clearNotificationOnSummaryClick == A7.a.f58n ? clearNotificationOnSummaryClick : vVar;
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
            n9.f461b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
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
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z3, InterfaceC5267d interfaceC5267d) {
        C0235b c0235b;
        int i;
        b bVar;
        String str;
        if (interfaceC5267d instanceof C0235b) {
            c0235b = (C0235b) interfaceC5267d;
            int i6 = c0235b.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0235b.label = i6 - Integer.MIN_VALUE;
                C0235b c0235b2 = c0235b;
                Object obj = c0235b2.result;
                A7.a aVar = A7.a.f58n;
                i = c0235b2.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    String stringExtra = intent.getStringExtra("summary");
                    c0235b2.L$0 = this;
                    c0235b2.L$1 = intent;
                    c0235b2.L$2 = stringExtra;
                    c0235b2.Z$0 = z3;
                    c0235b2.label = 1;
                    if (clearStatusBarNotifications(context, stringExtra, c0235b2) != aVar) {
                        bVar = this;
                        str = stringExtra;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                    return v.f41353a;
                }
                z3 = c0235b2.Z$0;
                String str2 = (String) c0235b2.L$2;
                intent = (Intent) c0235b2.L$1;
                bVar = (b) c0235b2.L$0;
                com.bumptech.glide.d.k(obj);
                str = str2;
                boolean z6 = z3;
                u5.d dVar = bVar._dataController;
                int intExtra = intent.getIntExtra("androidNotificationId", 0);
                boolean clearGroupOnSummaryClick = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
                c0235b2.L$0 = null;
                c0235b2.L$1 = null;
                c0235b2.L$2 = null;
                c0235b2.label = 2;
            }
        }
        c0235b = new C0235b(interfaceC5267d);
        C0235b c0235b22 = c0235b;
        Object obj2 = c0235b22.result;
        A7.a aVar2 = A7.a.f58n;
        i = c0235b22.label;
        if (i != 0) {
        }
        boolean z62 = z3;
        u5.d dVar2 = bVar._dataController;
        int intExtra2 = intent.getIntExtra("androidNotificationId", 0);
        boolean clearGroupOnSummaryClick2 = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
        c0235b22.L$0 = null;
        c0235b22.L$1 = null;
        c0235b22.L$2 = null;
        c0235b22.label = 2;
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
    public final Object processIntent(Context context, Intent intent, InterfaceC5267d interfaceC5267d) {
        c cVar;
        A7.a aVar;
        int i;
        String stringExtra;
        boolean booleanExtra;
        b bVar;
        com.onesignal.notifications.internal.open.impl.a aVar2;
        Object processToOpenIntent;
        Intent intent2;
        com.onesignal.notifications.internal.open.impl.a aVar3;
        b bVar2;
        Context context2;
        boolean z3;
        String str;
        String stringExtra2;
        E5.a aVar4;
        Intent intent3;
        Context context3;
        b bVar3;
        if (interfaceC5267d instanceof c) {
            cVar = (c) interfaceC5267d;
            int i6 = cVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.label = i6 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                aVar = A7.a.f58n;
                i = cVar.label;
                v vVar = v.f41353a;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
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
                        z3 = booleanExtra;
                        str = stringExtra;
                        if (str == null) {
                            aVar4 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar3;
                            cVar.L$4 = null;
                            cVar.Z$0 = z3;
                            cVar.label = 3;
                            if (aVar4.updateSummaryNotificationAfterChildRemoved(stringExtra2, z3, cVar) != aVar) {
                            }
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z3) {
                        }
                        return vVar;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i == 2) {
                        z3 = cVar.Z$0;
                        aVar3 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$4;
                        str = (String) cVar.L$3;
                        intent2 = (Intent) cVar.L$2;
                        context2 = (Context) cVar.L$1;
                        bVar2 = (b) cVar.L$0;
                        com.bumptech.glide.d.k(obj);
                        if (str == null && (stringExtra2 = intent2.getStringExtra("grp")) != null) {
                            aVar4 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar3;
                            cVar.L$4 = null;
                            cVar.Z$0 = z3;
                            cVar.label = 3;
                            if (aVar4.updateSummaryNotificationAfterChildRemoved(stringExtra2, z3, cVar) != aVar) {
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
                        if (!z3) {
                        }
                        return vVar;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.d.k(obj);
                        return vVar;
                    }
                    z3 = cVar.Z$0;
                    aVar3 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$3;
                    intent3 = (Intent) cVar.L$2;
                    context3 = (Context) cVar.L$1;
                    bVar3 = (b) cVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    context2 = context3;
                    bVar2 = bVar3;
                    intent2 = intent3;
                    com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z3) {
                        if (context2 instanceof Activity) {
                            h.b(aVar3);
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
                    return vVar;
                }
                boolean z6 = cVar.Z$0;
                String str2 = (String) cVar.L$3;
                Intent intent4 = (Intent) cVar.L$2;
                Context context4 = (Context) cVar.L$1;
                bVar = (b) cVar.L$0;
                com.bumptech.glide.d.k(obj);
                booleanExtra = z6;
                context = context4;
                processToOpenIntent = obj;
                stringExtra = str2;
                intent = intent4;
                aVar2 = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
                if (aVar2 == null) {
                    return vVar;
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
        cVar = new c(interfaceC5267d);
        Object obj2 = cVar.result;
        aVar = A7.a.f58n;
        i = cVar.label;
        v vVar2 = v.f41353a;
        if (i != 0) {
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
    
        if (r1.addChildNotifications(r11, r12, r2) == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processToOpenIntent(Context context, Intent intent, String str, InterfaceC5267d interfaceC5267d) {
        d dVar;
        Object obj;
        int i;
        b bVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        if (interfaceC5267d instanceof d) {
            dVar = (d) interfaceC5267d;
            int i6 = dVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.label = i6 - Integer.MIN_VALUE;
                obj = dVar.result;
                A7.a aVar = A7.a.f58n;
                i = dVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    try {
                        jSONObject2 = new JSONObject(intent.getStringExtra("onesignalData"));
                    } catch (JSONException e9) {
                        e = e9;
                        bVar = this;
                        jSONObject = null;
                    }
                    try {
                    } catch (JSONException e10) {
                        e = e10;
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
                    jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
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
                    com.bumptech.glide.d.k(obj);
                    h.b(jSONArray);
                    h.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                jSONObject = (JSONObject) dVar.L$3;
                str = (String) dVar.L$2;
                intent = (Intent) dVar.L$1;
                bVar = (b) dVar.L$0;
                try {
                    com.bumptech.glide.d.k(obj);
                } catch (JSONException e11) {
                    e = e11;
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
                jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                if (str != null) {
                }
                h.b(jSONArray);
                h.b(jSONObject);
                return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
            }
        }
        dVar = new d(interfaceC5267d);
        obj = dVar.result;
        A7.a aVar2 = A7.a.f58n;
        i = dVar.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
        intent.putExtra("onesignalData", jSONObject.toString());
        jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
        if (str != null) {
        }
        h.b(jSONArray);
        h.b(jSONObject);
        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
    }

    @Override // z5.InterfaceC5262a
    public Object processFromContext(Context context, Intent intent, InterfaceC5267d interfaceC5267d) {
        boolean isOneSignalIntent = isOneSignalIntent(intent);
        v vVar = v.f41353a;
        if (!isOneSignalIntent) {
            return vVar;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object processIntent = processIntent(context, intent, interfaceC5267d);
        return processIntent == A7.a.f58n ? processIntent : vVar;
    }
}
