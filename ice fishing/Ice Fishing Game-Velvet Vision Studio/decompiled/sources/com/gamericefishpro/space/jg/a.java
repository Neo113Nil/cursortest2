package com.gamericefishpro.space.jg;

import android.app.NotificationManager;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.mf.e;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.ig.a {
    private final f _applicationService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.nf.d _dataController;
    private final com.gamericefishpro.space.gg.b _notificationRestoreProcessor;
    private final com.gamericefishpro.space.pf.c _summaryNotificationDisplayer;
    private final com.gamericefishpro.space.kd.a _time;

    /* JADX INFO: renamed from: com.gamericefishpro.space.jg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0029a extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0029a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.restoreSummary(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public a(f _applicationService, com.gamericefishpro.space.nf.d _dataController, com.gamericefishpro.space.pf.c _summaryNotificationDisplayer, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.gg.b _notificationRestoreProcessor, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_notificationRestoreProcessor, "_notificationRestoreProcessor");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._configModelStore = _configModelStore;
        this._notificationRestoreProcessor = _notificationRestoreProcessor;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[Catch: JSONException -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0036, blocks: (B:16:0x0031, B:49:0x00ef), top: B:58:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (com.gamericefishpro.space.nf.b.markAsConsumed$default(r1, r14, r13, null, false, r6, 12, null) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        if (r8.restoreSummary(r5, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        if (r12.updateSummaryNotification(r14, r6) == r0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        a aVar2;
        List list;
        String str2;
        int i;
        Integer num;
        int iIntValue;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        b bVar2 = bVar;
        Object objListNotificationsForGroup = bVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = bVar2.label;
        try {
            if (i3 == 0) {
                com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
                com.gamericefishpro.space.nf.d dVar = this._dataController;
                bVar2.L$0 = this;
                bVar2.L$1 = str;
                bVar2.Z$0 = z;
                bVar2.label = 1;
                objListNotificationsForGroup = dVar.listNotificationsForGroup(str, bVar2);
                if (objListNotificationsForGroup != aVar3) {
                    aVar2 = this;
                }
                return aVar3;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
                        return Unit.a;
                    }
                    if (i3 == 4) {
                        com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
                        return Unit.a;
                    }
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
                    return Unit.a;
                }
                i = bVar2.I$0;
                z = bVar2.Z$0;
                list = (List) bVar2.L$2;
                str2 = (String) bVar2.L$1;
                aVar2 = (a) bVar2.L$0;
                com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
                num = (Integer) objListNotificationsForGroup;
                if (num != null) {
                    return Unit.a;
                }
                iIntValue = num.intValue();
                if (i == 0) {
                    e.INSTANCE.getNotificationManager(aVar2._applicationService.getAppContext()).cancel(iIntValue);
                    com.gamericefishpro.space.nf.d dVar2 = aVar2._dataController;
                    bVar2.L$0 = null;
                    bVar2.L$1 = null;
                    bVar2.L$2 = null;
                    bVar2.label = 3;
                } else if (i == 1) {
                    bVar2.L$0 = null;
                    bVar2.L$1 = null;
                    bVar2.L$2 = null;
                    bVar2.label = 4;
                } else {
                    com.gamericefishpro.space.nf.c cVar = (com.gamericefishpro.space.nf.c) CollectionsKt.w(list);
                    com.gamericefishpro.space.mf.d dVar3 = new com.gamericefishpro.space.mf.d(new JSONObject(cVar.getFullData()), aVar2._time);
                    dVar3.setRestoring(true);
                    dVar3.setShownTimeStamp(new Long(cVar.getCreatedAt()));
                    com.gamericefishpro.space.pf.c cVar2 = aVar2._summaryNotificationDisplayer;
                    bVar2.L$0 = null;
                    bVar2.L$1 = null;
                    bVar2.L$2 = null;
                    bVar2.label = 5;
                }
                return aVar3;
            }
            z = bVar2.Z$0;
            str = (String) bVar2.L$1;
            a aVar4 = (a) bVar2.L$0;
            com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
            aVar2 = aVar4;
            list = (List) objListNotificationsForGroup;
            int size = list.size();
            com.gamericefishpro.space.nf.d dVar4 = aVar2._dataController;
            bVar2.L$0 = aVar2;
            bVar2.L$1 = str;
            bVar2.L$2 = list;
            bVar2.Z$0 = z;
            bVar2.I$0 = size;
            bVar2.label = 2;
            Object androidIdForGroup = dVar4.getAndroidIdForGroup(str, true, bVar2);
            if (androidIdForGroup != aVar3) {
                str2 = str;
                i = size;
                objListNotificationsForGroup = androidIdForGroup;
                num = (Integer) objListNotificationsForGroup;
                if (num != null) {
                    return Unit.a;
                }
                iIntValue = num.intValue();
                if (i == 0) {
                    e.INSTANCE.getNotificationManager(aVar2._applicationService.getAppContext()).cancel(iIntValue);
                    com.gamericefishpro.space.nf.d dVar5 = aVar2._dataController;
                    bVar2.L$0 = null;
                    bVar2.L$1 = null;
                    bVar2.L$2 = null;
                    bVar2.label = 3;
                } else if (i == 1) {
                    bVar2.L$0 = null;
                    bVar2.L$1 = null;
                    bVar2.L$2 = null;
                    bVar2.label = 4;
                } else {
                    com.gamericefishpro.space.nf.c cVar3 = (com.gamericefishpro.space.nf.c) CollectionsKt.w(list);
                    com.gamericefishpro.space.mf.d dVar6 = new com.gamericefishpro.space.mf.d(new JSONObject(cVar3.getFullData()), aVar2._time);
                    dVar6.setRestoring(true);
                    dVar6.setShownTimeStamp(new Long(cVar3.getCreatedAt()));
                    com.gamericefishpro.space.pf.c cVar4 = aVar2._summaryNotificationDisplayer;
                    bVar2.L$0 = null;
                    bVar2.L$1 = null;
                    bVar2.L$2 = null;
                    bVar2.label = 5;
                }
            }
            return aVar3;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:22:0x005c->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object restoreSummary(String str, com.gamericefishpro.space.th.a aVar) {
        c cVar;
        a aVar2;
        a aVar3;
        Iterator it;
        c cVar2;
        com.gamericefishpro.space.nf.c cVar3;
        com.gamericefishpro.space.gg.b bVar;
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
        Object objListNotificationsForGroup = cVar.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
            com.gamericefishpro.space.nf.d dVar = this._dataController;
            cVar.L$0 = this;
            cVar.label = 1;
            objListNotificationsForGroup = dVar.listNotificationsForGroup(str, cVar);
            if (objListNotificationsForGroup != aVar4) {
                aVar2 = this;
            }
            return aVar4;
        }
        if (i2 == 1) {
            aVar2 = (a) cVar.L$0;
            com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) cVar.L$1;
            aVar3 = (a) cVar.L$0;
            com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
        }
        cVar2 = cVar;
        while (it.hasNext()) {
            cVar3 = (com.gamericefishpro.space.nf.c) it.next();
            bVar = aVar3._notificationRestoreProcessor;
            cVar2.L$0 = aVar3;
            cVar2.L$1 = it;
            cVar2.label = 2;
            if (com.gamericefishpro.space.gg.a.processNotification$default(bVar, cVar3, 0, cVar2, 2, null) == aVar4) {
                return aVar4;
            }
        }
        return Unit.a;
        aVar3 = aVar2;
        it = ((List) objListNotificationsForGroup).iterator();
        cVar2 = cVar;
        while (it.hasNext()) {
            cVar3 = (com.gamericefishpro.space.nf.c) it.next();
            bVar = aVar3._notificationRestoreProcessor;
            cVar2.L$0 = aVar3;
            cVar2.L$1 = it;
            cVar2.label = 2;
            if (com.gamericefishpro.space.gg.a.processNotification$default(bVar, cVar3, 0, cVar2, 2, null) == aVar4) {
                return aVar4;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (r11.markAsDismissed(r12, r0) == r1) goto L38;
     */
    @Override // com.gamericefishpro.space.ig.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, com.gamericefishpro.space.th.a aVar) {
        C0029a c0029a;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        a aVar2;
        NotificationManager notificationManager2;
        Integer num;
        if (aVar instanceof C0029a) {
            c0029a = (C0029a) aVar;
            int i = c0029a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0029a.label = i - Integer.MIN_VALUE;
            } else {
                c0029a = new C0029a(aVar);
            }
        } else {
            c0029a = new C0029a(aVar);
        }
        Object obj = c0029a.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0029a.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
            com.gamericefishpro.space.nf.d dVar = this._dataController;
            c0029a.L$0 = this;
            c0029a.L$1 = str;
            c0029a.L$2 = notificationManager;
            c0029a.label = 1;
            androidIdForGroup = dVar.getAndroidIdForGroup(str, false, c0029a);
            if (androidIdForGroup != aVar3) {
                aVar2 = this;
            }
            return aVar3;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
                return Unit.a;
            }
            notificationManager2 = (NotificationManager) c0029a.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            Integer num2 = (Integer) obj;
            notificationManager = notificationManager2;
            num = num2;
            if (num != null) {
                notificationManager.cancel(num.intValue());
            }
            return Unit.a;
        }
        NotificationManager notificationManager3 = (NotificationManager) c0029a.L$2;
        String str2 = (String) c0029a.L$1;
        aVar2 = (a) c0029a.L$0;
        com.gamericefishpro.space.wa.b.P(obj);
        notificationManager = notificationManager3;
        str = str2;
        androidIdForGroup = obj;
        Integer num3 = (Integer) androidIdForGroup;
        if (num3 != null) {
            if (((com.gamericefishpro.space.rc.a) aVar2._configModelStore.getModel()).getClearGroupOnSummaryClick()) {
                if (Intrinsics.a(str, e.GROUPLESS_SUMMARY_KEY)) {
                    num = new Integer(e.GROUPLESS_SUMMARY_ID);
                } else {
                    com.gamericefishpro.space.nf.d dVar2 = aVar2._dataController;
                    c0029a.L$0 = notificationManager;
                    c0029a.L$1 = null;
                    c0029a.L$2 = null;
                    c0029a.label = 2;
                    Object androidIdForGroup2 = dVar2.getAndroidIdForGroup(str, true, c0029a);
                    if (androidIdForGroup2 != aVar3) {
                        NotificationManager notificationManager4 = notificationManager;
                        obj = androidIdForGroup2;
                        notificationManager2 = notificationManager4;
                        Integer num4 = (Integer) obj;
                        notificationManager = notificationManager2;
                        num = num4;
                    }
                }
                if (num != null) {
                    notificationManager.cancel(num.intValue());
                }
            } else {
                com.gamericefishpro.space.nf.d dVar3 = aVar2._dataController;
                int iIntValue = num3.intValue();
                c0029a.L$0 = null;
                c0029a.L$1 = null;
                c0029a.L$2 = null;
                c0029a.label = 3;
            }
            return aVar3;
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r6.internalUpdateSummaryNotificationAfterChildRemoved(r7, true, r0) == r1) goto L24;
     */
    @Override // com.gamericefishpro.space.ig.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i, com.gamericefishpro.space.th.a aVar) {
        d dVar;
        a aVar2;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        Object groupId = dVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = dVar.label;
        if (i3 != 0) {
            if (i3 == 1) {
                aVar2 = (a) dVar.L$0;
                com.gamericefishpro.space.wa.b.P(groupId);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(groupId);
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(groupId);
        com.gamericefishpro.space.nf.d dVar2 = this._dataController;
        dVar.L$0 = this;
        dVar.label = 1;
        groupId = dVar2.getGroupId(i, dVar);
        if (groupId != aVar3) {
            aVar2 = this;
        }
        return aVar3;
        String str = (String) groupId;
        if (str == null) {
            return Unit.a;
        }
        dVar.L$0 = null;
        dVar.label = 2;
    }

    @Override // com.gamericefishpro.space.ig.a
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z, com.gamericefishpro.space.th.a aVar) {
        Object objInternalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z, aVar);
        return objInternalUpdateSummaryNotificationAfterChildRemoved == com.gamericefishpro.space.uh.a.d ? objInternalUpdateSummaryNotificationAfterChildRemoved : Unit.a;
    }
}
