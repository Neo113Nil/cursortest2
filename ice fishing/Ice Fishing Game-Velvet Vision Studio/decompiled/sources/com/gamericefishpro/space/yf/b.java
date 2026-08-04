package com.gamericefishpro.space.yf;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.gamericefishpro.space.mf.e;
import com.gamericefishpro.space.r3.p;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.xf.a {
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.nf.d _dataController;
    private final com.gamericefishpro.space.tf.b _lifecycleService;
    private final com.gamericefishpro.space.ig.a _summaryManager;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.addChildNotifications(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.yf.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0076b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0076b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processIntent(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processToOpenIntent(null, null, null, this);
        }
    }

    public b(com.gamericefishpro.space.ig.a _summaryManager, com.gamericefishpro.space.nf.d _dataController, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.tf.b _lifecycleService) {
        Intrinsics.checkNotNullParameter(_summaryManager, "_summaryManager");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        this._summaryManager = _summaryManager;
        this._dataController = _dataController;
        this._configModelStore = _configModelStore;
        this._lifecycleService = _lifecycleService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object addChildNotifications(JSONArray jSONArray, String str, com.gamericefishpro.space.th.a aVar) {
        a aVar2;
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
        Object objListNotificationsForGroup = aVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = aVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
            com.gamericefishpro.space.nf.d dVar = this._dataController;
            aVar2.L$0 = jSONArray;
            aVar2.label = 1;
            objListNotificationsForGroup = dVar.listNotificationsForGroup(str, aVar2);
            if (objListNotificationsForGroup == aVar3) {
                return aVar3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONArray = (JSONArray) aVar2.L$0;
            com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
        }
        Iterator it = ((List) objListNotificationsForGroup).iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(((com.gamericefishpro.space.nf.c) it.next()).getFullData()));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, com.gamericefishpro.space.th.a aVar) {
        if (str != null) {
            Object objClearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, aVar);
            return objClearNotificationOnSummaryClick == com.gamericefishpro.space.uh.a.d ? objClearNotificationOnSummaryClick : Unit.a;
        }
        e eVar = e.INSTANCE;
        if (eVar.getGrouplessNotifsCount(context) < 1) {
            eVar.getNotificationManager(context).cancel(e.GROUPLESS_SUMMARY_ID);
        }
        return Unit.a;
    }

    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            Intrinsics.b(context);
            p pVar = new p(context);
            pVar.b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r8.markAsConsumed(r9, r3, r4, r5, r6) == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z, com.gamericefishpro.space.th.a aVar) {
        C0076b c0076b;
        b bVar;
        String str;
        if (aVar instanceof C0076b) {
            c0076b = (C0076b) aVar;
            int i = c0076b.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0076b.label = i - Integer.MIN_VALUE;
            } else {
                c0076b = new C0076b(aVar);
            }
        } else {
            c0076b = new C0076b(aVar);
        }
        C0076b c0076b2 = c0076b;
        Object obj = c0076b2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0076b2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                z = c0076b2.Z$0;
                String str2 = (String) c0076b2.L$2;
                intent = (Intent) c0076b2.L$1;
                bVar = (b) c0076b2.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                str = str2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        String stringExtra = intent.getStringExtra("summary");
        c0076b2.L$0 = this;
        c0076b2.L$1 = intent;
        c0076b2.L$2 = stringExtra;
        c0076b2.Z$0 = z;
        c0076b2.label = 1;
        if (clearStatusBarNotifications(context, stringExtra, c0076b2) != aVar2) {
            bVar = this;
            str = stringExtra;
        }
        return aVar2;
        boolean z2 = z;
        com.gamericefishpro.space.nf.d dVar = bVar._dataController;
        int intExtra = intent.getIntExtra("androidNotificationId", 0);
        boolean clearGroupOnSummaryClick = ((com.gamericefishpro.space.rc.a) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
        c0076b2.L$0 = null;
        c0076b2.L$1 = null;
        c0076b2.L$2 = null;
        c0076b2.label = 2;
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
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd A[PHI: r5 r8 r9 r12 r13
      0x00fd: PHI (r5v9 android.content.Intent) = (r5v7 android.content.Intent), (r5v7 android.content.Intent), (r5v11 android.content.Intent) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r8v7 android.content.Context) = (r8v6 android.content.Context), (r8v6 android.content.Context), (r8v9 android.content.Context) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r9v4 com.gamericefishpro.space.yf.b) = (r9v3 com.gamericefishpro.space.yf.b), (r9v3 com.gamericefishpro.space.yf.b), (r9v5 com.gamericefishpro.space.yf.b) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r12v6 boolean) = (r12v5 boolean), (r12v5 boolean), (r12v13 boolean) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r13v5 com.gamericefishpro.space.yf.a) = (r13v4 com.gamericefishpro.space.yf.a), (r13v4 com.gamericefishpro.space.yf.a), (r13v8 com.gamericefishpro.space.yf.a) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0164, code lost:
    
        if (r9._lifecycleService.notificationOpened((android.app.Activity) r8, r13, r0) == r1) goto L52;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00fd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x011c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0137, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processIntent(Context context, Intent intent, com.gamericefishpro.space.th.a aVar) {
        c cVar;
        String stringExtra;
        boolean booleanExtra;
        b bVar;
        com.gamericefishpro.space.yf.a aVar2;
        Object objProcessToOpenIntent;
        Intent intent2;
        com.gamericefishpro.space.yf.a aVar3;
        b bVar2;
        Context context2;
        boolean z;
        String str;
        String stringExtra2;
        Intent intent3;
        Context context3;
        b bVar3;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(aVar);
            }
        } else {
            cVar = new c(aVar);
        }
        Object obj = cVar.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            stringExtra = intent.getStringExtra("summary");
            booleanExtra = intent.getBooleanExtra("dismissed", false);
            if (booleanExtra) {
                bVar = this;
                aVar2 = null;
                cVar.L$0 = bVar;
                cVar.L$1 = context;
                cVar.L$2 = intent;
                cVar.L$3 = stringExtra;
                cVar.L$4 = aVar2;
                cVar.Z$0 = booleanExtra;
                cVar.label = 2;
                if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar4) {
                    com.gamericefishpro.space.yf.a aVar5 = aVar2;
                    intent2 = intent;
                    aVar3 = aVar5;
                    bVar2 = bVar;
                    context2 = context;
                    z = booleanExtra;
                    str = stringExtra;
                    if (str == null) {
                        com.gamericefishpro.space.od.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                            com.gamericefishpro.space.od.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                        }
                        if (!z) {
                            if (context2 instanceof Activity) {
                                Intrinsics.b(aVar3);
                                JSONArray dataArray = aVar3.getDataArray();
                                cVar.L$0 = null;
                                cVar.L$1 = null;
                                cVar.L$2 = null;
                                cVar.L$3 = null;
                                cVar.L$4 = null;
                                cVar.label = 4;
                            } else {
                                com.gamericefishpro.space.od.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                            }
                        }
                        return Unit.a;
                    }
                    com.gamericefishpro.space.od.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.gamericefishpro.space.od.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z) {
                        if (context2 instanceof Activity) {
                            com.gamericefishpro.space.od.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                        } else {
                            Intrinsics.b(aVar3);
                            JSONArray dataArray2 = aVar3.getDataArray();
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.L$3 = null;
                            cVar.L$4 = null;
                            cVar.label = 4;
                        }
                    }
                    return Unit.a;
                }
            } else {
                cVar.L$0 = this;
                cVar.L$1 = context;
                cVar.L$2 = intent;
                cVar.L$3 = stringExtra;
                cVar.Z$0 = booleanExtra;
                cVar.label = 1;
                objProcessToOpenIntent = processToOpenIntent(context, intent, stringExtra, cVar);
                if (objProcessToOpenIntent != aVar4) {
                    bVar = this;
                }
            }
            return aVar4;
        }
        if (i2 == 1) {
            boolean z2 = cVar.Z$0;
            String str2 = (String) cVar.L$3;
            Intent intent4 = (Intent) cVar.L$2;
            Context context4 = (Context) cVar.L$1;
            bVar = (b) cVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            booleanExtra = z2;
            context = context4;
            objProcessToOpenIntent = obj;
            stringExtra = str2;
            intent = intent4;
        } else {
            if (i2 == 2) {
                z = cVar.Z$0;
                aVar3 = (com.gamericefishpro.space.yf.a) cVar.L$4;
                str = (String) cVar.L$3;
                intent2 = (Intent) cVar.L$2;
                context2 = (Context) cVar.L$1;
                bVar2 = (b) cVar.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                if (str == null || (stringExtra2 = intent2.getStringExtra("grp")) == null) {
                    com.gamericefishpro.space.od.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.gamericefishpro.space.od.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z) {
                        if (context2 instanceof Activity) {
                            com.gamericefishpro.space.od.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                        } else {
                            Intrinsics.b(aVar3);
                            JSONArray dataArray3 = aVar3.getDataArray();
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.L$3 = null;
                            cVar.L$4 = null;
                            cVar.label = 4;
                        }
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.ig.a aVar6 = bVar2._summaryManager;
                cVar.L$0 = bVar2;
                cVar.L$1 = context2;
                cVar.L$2 = intent2;
                cVar.L$3 = aVar3;
                cVar.L$4 = null;
                cVar.Z$0 = z;
                cVar.label = 3;
                if (aVar6.updateSummaryNotificationAfterChildRemoved(stringExtra2, z, cVar) != aVar4) {
                    intent3 = intent2;
                    context3 = context2;
                    bVar3 = bVar2;
                    context2 = context3;
                    bVar2 = bVar3;
                    intent2 = intent3;
                    com.gamericefishpro.space.od.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.gamericefishpro.space.od.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z) {
                        if (context2 instanceof Activity) {
                            com.gamericefishpro.space.od.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                        } else {
                            Intrinsics.b(aVar3);
                            JSONArray dataArray4 = aVar3.getDataArray();
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.L$3 = null;
                            cVar.L$4 = null;
                            cVar.label = 4;
                        }
                    }
                    return Unit.a;
                }
                return aVar4;
            }
            if (i2 == 3) {
                z = cVar.Z$0;
                aVar3 = (com.gamericefishpro.space.yf.a) cVar.L$3;
                intent3 = (Intent) cVar.L$2;
                context3 = (Context) cVar.L$1;
                bVar3 = (b) cVar.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                context2 = context3;
                bVar2 = bVar3;
                intent2 = intent3;
                com.gamericefishpro.space.od.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                if (intent2.getExtras() != null) {
                    com.gamericefishpro.space.od.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                }
                if (!z) {
                    if (context2 instanceof Activity) {
                        com.gamericefishpro.space.od.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                    } else {
                        Intrinsics.b(aVar3);
                        JSONArray dataArray5 = aVar3.getDataArray();
                        cVar.L$0 = null;
                        cVar.L$1 = null;
                        cVar.L$2 = null;
                        cVar.L$3 = null;
                        cVar.L$4 = null;
                        cVar.label = 4;
                    }
                }
                return Unit.a;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Unit.a;
        aVar2 = (com.gamericefishpro.space.yf.a) objProcessToOpenIntent;
        if (aVar2 == null) {
            return Unit.a;
        }
        cVar.L$0 = bVar;
        cVar.L$1 = context;
        cVar.L$2 = intent;
        cVar.L$3 = stringExtra;
        cVar.L$4 = aVar2;
        cVar.Z$0 = booleanExtra;
        cVar.label = 2;
        if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar4) {
            com.gamericefishpro.space.yf.a aVar7 = aVar2;
            intent2 = intent;
            aVar3 = aVar7;
            bVar2 = bVar;
            context2 = context;
            z = booleanExtra;
            str = stringExtra;
            if (str == null) {
                com.gamericefishpro.space.od.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                if (intent2.getExtras() != null) {
                    com.gamericefishpro.space.od.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                }
                if (!z) {
                    if (context2 instanceof Activity) {
                        com.gamericefishpro.space.od.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                    } else {
                        Intrinsics.b(aVar3);
                        JSONArray dataArray6 = aVar3.getDataArray();
                        cVar.L$0 = null;
                        cVar.L$1 = null;
                        cVar.L$2 = null;
                        cVar.L$3 = null;
                        cVar.L$4 = null;
                        cVar.label = 4;
                    }
                }
                return Unit.a;
            }
            com.gamericefishpro.space.od.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
            if (intent2.getExtras() != null) {
                com.gamericefishpro.space.od.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
            }
            if (!z) {
                if (context2 instanceof Activity) {
                    com.gamericefishpro.space.od.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                } else {
                    Intrinsics.b(aVar3);
                    JSONArray dataArray7 = aVar3.getDataArray();
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.L$3 = null;
                    cVar.L$4 = null;
                    cVar.label = 4;
                }
            }
            return Unit.a;
        }
        return aVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (r1.addChildNotifications(r11, r12, r2) == r3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processToOpenIntent(Context context, Intent intent, String str, com.gamericefishpro.space.th.a aVar) {
        d dVar;
        b bVar;
        JSONObject jSONObject;
        JSONArray jSONArrayWrapInJsonArray;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        Object obj = dVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = dVar.label;
        if (i2 != 0) {
            if (i2 == 1) {
                jSONObject = (JSONObject) dVar.L$3;
                str = (String) dVar.L$2;
                intent = (Intent) dVar.L$1;
                bVar = (b) dVar.L$0;
                try {
                    com.gamericefishpro.space.wa.b.P(obj);
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    jSONArrayWrapInJsonArray = null;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONObject = (JSONObject) dVar.L$1;
                jSONArrayWrapInJsonArray = (JSONArray) dVar.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            Intrinsics.b(jSONArrayWrapInJsonArray);
            Intrinsics.b(jSONObject);
            return new com.gamericefishpro.space.yf.a(jSONArrayWrapInJsonArray, jSONObject);
        }
        com.gamericefishpro.space.wa.b.P(obj);
        try {
            JSONObject jSONObject2 = new JSONObject(intent.getStringExtra("onesignalData"));
            try {
                if (!(context instanceof Activity)) {
                    com.gamericefishpro.space.od.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context, null, 2, null);
                    bVar = this;
                    jSONObject = jSONObject2;
                    jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                    intent.putExtra("onesignalData", jSONObject.toString());
                    jSONArrayWrapInJsonArray = com.gamericefishpro.space.yb.e.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                    if (str != null) {
                        Intrinsics.b(jSONArrayWrapInJsonArray);
                        dVar.L$0 = jSONArrayWrapInJsonArray;
                        dVar.L$1 = jSONObject;
                        dVar.L$2 = null;
                        dVar.L$3 = null;
                        dVar.label = 2;
                    }
                    Intrinsics.b(jSONArrayWrapInJsonArray);
                    Intrinsics.b(jSONObject);
                    return new com.gamericefishpro.space.yf.a(jSONArrayWrapInJsonArray, jSONObject);
                }
                dVar.L$0 = this;
                dVar.L$1 = intent;
                dVar.L$2 = str;
                dVar.L$3 = jSONObject2;
                dVar.label = 1;
                Object objCanOpenNotification = this._lifecycleService.canOpenNotification((Activity) context, jSONObject2, dVar);
                if (objCanOpenNotification != aVar2) {
                    obj = objCanOpenNotification;
                    jSONObject = jSONObject2;
                    bVar = this;
                }
            } catch (JSONException e2) {
                e = e2;
                bVar = this;
                jSONObject = jSONObject2;
                e.printStackTrace();
                jSONArrayWrapInJsonArray = null;
            }
        } catch (JSONException e3) {
            e = e3;
            bVar = this;
            jSONObject = null;
        }
        return aVar2;
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
        intent.putExtra("onesignalData", jSONObject.toString());
        jSONArrayWrapInJsonArray = com.gamericefishpro.space.yb.e.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
        if (str != null) {
            Intrinsics.b(jSONArrayWrapInJsonArray);
            dVar.L$0 = jSONArrayWrapInJsonArray;
            dVar.L$1 = jSONObject;
            dVar.L$2 = null;
            dVar.L$3 = null;
            dVar.label = 2;
        }
        Intrinsics.b(jSONArrayWrapInJsonArray);
        Intrinsics.b(jSONObject);
        return new com.gamericefishpro.space.yf.a(jSONArrayWrapInJsonArray, jSONObject);
    }

    @Override // com.gamericefishpro.space.xf.a
    public Object processFromContext(Context context, Intent intent, com.gamericefishpro.space.th.a aVar) {
        if (!isOneSignalIntent(intent)) {
            return Unit.a;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object objProcessIntent = processIntent(context, intent, aVar);
        return objProcessIntent == com.gamericefishpro.space.uh.a.d ? objProcessIntent : Unit.a;
    }
}
