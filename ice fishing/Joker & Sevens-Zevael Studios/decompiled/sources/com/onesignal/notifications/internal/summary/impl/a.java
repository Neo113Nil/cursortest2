package com.onesignal.notifications.internal.summary.impl;

import ac.o;
import android.app.NotificationManager;
import bc.m;
import java.util.Iterator;
import java.util.List;
import na.e;
import org.json.JSONObject;
import pc.j;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements ya.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final oa.d _dataController;
    private final xa.b _notificationRestoreProcessor;
    private final pa.c _summaryNotificationDisplayer;
    private final e9.a _time;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.summary.impl.a$a, reason: collision with other inner class name */
    public static final class C0061a extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0061a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.restoreSummary(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public a(f fVar, oa.d dVar, pa.c cVar, com.onesignal.core.internal.config.b bVar, xa.b bVar2, e9.a aVar) {
        j.e(fVar, "_applicationService");
        j.e(dVar, "_dataController");
        j.e(cVar, "_summaryNotificationDisplayer");
        j.e(bVar, "_configModelStore");
        j.e(bVar2, "_notificationRestoreProcessor");
        j.e(aVar, "_time");
        this._applicationService = fVar;
        this._dataController = dVar;
        this._summaryNotificationDisplayer = cVar;
        this._configModelStore = bVar;
        this._notificationRestoreProcessor = bVar2;
        this._time = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:(1:(1:(1:(3:15|16|17)(2:20|21))(2:22|23))(2:24|25))(4:26|27|(3:29|(2:31|(0)(1:25))(1:(2:35|(0)(1:23))(1:37))|33)|17))(1:39))(3:43|(1:45)|33)|40|(4:42|27|(0)|17)|33))|49|6|7|8|(0)(0)|40|(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        if (r13.updateSummaryNotification(r15, r6) == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z10, fc.d dVar) {
        b bVar;
        int i10;
        gc.a aVar;
        a aVar2;
        List list;
        Object androidIdForGroup;
        String str2;
        int i11;
        Integer num;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                i10 = bVar2.label;
                o oVar = o.f277a;
                aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    oa.d dVar2 = this._dataController;
                    bVar2.L$0 = this;
                    bVar2.L$1 = str;
                    bVar2.Z$0 = z10;
                    bVar2.label = 1;
                    obj = dVar2.listNotificationsForGroup(str, bVar2);
                    if (obj != aVar) {
                        aVar2 = this;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            v6.a.W(obj);
                            return oVar;
                        }
                        if (i10 == 4) {
                            v6.a.W(obj);
                            return oVar;
                        }
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return oVar;
                    }
                    i11 = bVar2.I$0;
                    z10 = bVar2.Z$0;
                    list = (List) bVar2.L$2;
                    str2 = (String) bVar2.L$1;
                    aVar2 = (a) bVar2.L$0;
                    v6.a.W(obj);
                    num = (Integer) obj;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (i11 == 0) {
                            e.INSTANCE.getNotificationManager(aVar2._applicationService.getAppContext()).cancel(intValue);
                            oa.d dVar3 = aVar2._dataController;
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 3;
                            if (oa.b.markAsConsumed$default(dVar3, intValue, z10, null, false, bVar2, 12, null) != aVar) {
                                return oVar;
                            }
                        } else if (i11 == 1) {
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 4;
                            if (aVar2.restoreSummary(str2, bVar2) != aVar) {
                                return oVar;
                            }
                        } else {
                            oa.c cVar = (oa.c) m.T(list);
                            na.d dVar4 = new na.d(new JSONObject(cVar.getFullData()), aVar2._time);
                            dVar4.setRestoring(true);
                            dVar4.setShownTimeStamp(new Long(cVar.getCreatedAt()));
                            pa.c cVar2 = aVar2._summaryNotificationDisplayer;
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 5;
                        }
                        return aVar;
                    }
                    return oVar;
                }
                z10 = bVar2.Z$0;
                str = (String) bVar2.L$1;
                a aVar3 = (a) bVar2.L$0;
                v6.a.W(obj);
                aVar2 = aVar3;
                list = (List) obj;
                int size = list.size();
                oa.d dVar5 = aVar2._dataController;
                bVar2.L$0 = aVar2;
                bVar2.L$1 = str;
                bVar2.L$2 = list;
                bVar2.Z$0 = z10;
                bVar2.I$0 = size;
                bVar2.label = 2;
                androidIdForGroup = dVar5.getAndroidIdForGroup(str, true, bVar2);
                if (androidIdForGroup != aVar) {
                    str2 = str;
                    i11 = size;
                    obj = androidIdForGroup;
                    num = (Integer) obj;
                    if (num != null) {
                    }
                    return oVar;
                }
                return aVar;
            }
        }
        bVar = new b(dVar);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        i10 = bVar22.label;
        o oVar2 = o.f277a;
        aVar = gc.a.f2559g;
        if (i10 != 0) {
        }
        list = (List) obj2;
        int size2 = list.size();
        oa.d dVar52 = aVar2._dataController;
        bVar22.L$0 = aVar2;
        bVar22.L$1 = str;
        bVar22.L$2 = list;
        bVar22.Z$0 = z10;
        bVar22.I$0 = size2;
        bVar22.label = 2;
        androidIdForGroup = dVar52.getAndroidIdForGroup(str, true, bVar22);
        if (androidIdForGroup != aVar) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restoreSummary(String str, fc.d dVar) {
        c cVar;
        int i10;
        a aVar;
        a aVar2;
        Iterator it;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i11 = cVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.label = i11 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                i10 = cVar.label;
                gc.a aVar3 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    oa.d dVar2 = this._dataController;
                    cVar.L$0 = this;
                    cVar.label = 1;
                    obj = dVar2.listNotificationsForGroup(str, cVar);
                    if (obj != aVar3) {
                        aVar = this;
                    }
                    return aVar3;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) cVar.L$1;
                    aVar2 = (a) cVar.L$0;
                    v6.a.W(obj);
                    c cVar2 = cVar;
                    while (it.hasNext()) {
                        oa.c cVar3 = (oa.c) it.next();
                        xa.b bVar = aVar2._notificationRestoreProcessor;
                        cVar2.L$0 = aVar2;
                        cVar2.L$1 = it;
                        cVar2.label = 2;
                        if (xa.a.processNotification$default(bVar, cVar3, 0, cVar2, 2, null) == aVar3) {
                            return aVar3;
                        }
                    }
                    return o.f277a;
                }
                aVar = (a) cVar.L$0;
                v6.a.W(obj);
                aVar2 = aVar;
                it = ((List) obj).iterator();
                c cVar22 = cVar;
                while (it.hasNext()) {
                }
                return o.f277a;
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.result;
        i10 = cVar.label;
        gc.a aVar32 = gc.a.f2559g;
        if (i10 != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        c cVar222 = cVar;
        while (it.hasNext()) {
        }
        return o.f277a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // ya.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, fc.d dVar) {
        C0061a c0061a;
        int i10;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        a aVar;
        Integer num;
        NotificationManager notificationManager2;
        Integer num2;
        if (dVar instanceof C0061a) {
            c0061a = (C0061a) dVar;
            int i11 = c0061a.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0061a.label = i11 - Integer.MIN_VALUE;
                Object obj = c0061a.result;
                i10 = c0061a.label;
                o oVar = o.f277a;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
                    oa.d dVar2 = this._dataController;
                    c0061a.L$0 = this;
                    c0061a.L$1 = str;
                    c0061a.L$2 = notificationManager;
                    c0061a.label = 1;
                    androidIdForGroup = dVar2.getAndroidIdForGroup(str, false, c0061a);
                    if (androidIdForGroup != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return oVar;
                    }
                    notificationManager2 = (NotificationManager) c0061a.L$0;
                    v6.a.W(obj);
                    Integer num3 = (Integer) obj;
                    notificationManager = notificationManager2;
                    num2 = num3;
                    if (num2 != null) {
                        notificationManager.cancel(num2.intValue());
                    }
                    return oVar;
                }
                NotificationManager notificationManager3 = (NotificationManager) c0061a.L$2;
                String str2 = (String) c0061a.L$1;
                aVar = (a) c0061a.L$0;
                v6.a.W(obj);
                notificationManager = notificationManager3;
                str = str2;
                androidIdForGroup = obj;
                num = (Integer) androidIdForGroup;
                if (num != null) {
                    if (!((com.onesignal.core.internal.config.a) aVar._configModelStore.getModel()).getClearGroupOnSummaryClick()) {
                        oa.d dVar3 = aVar._dataController;
                        int intValue = num.intValue();
                        c0061a.L$0 = null;
                        c0061a.L$1 = null;
                        c0061a.L$2 = null;
                        c0061a.label = 3;
                        if (dVar3.markAsDismissed(intValue, c0061a) == aVar2) {
                        }
                    } else if (j.a(str, e.GROUPLESS_SUMMARY_KEY)) {
                        num2 = new Integer(e.GROUPLESS_SUMMARY_ID);
                        if (num2 != null) {
                        }
                    } else {
                        oa.d dVar4 = aVar._dataController;
                        c0061a.L$0 = notificationManager;
                        c0061a.L$1 = null;
                        c0061a.L$2 = null;
                        c0061a.label = 2;
                        Object androidIdForGroup2 = dVar4.getAndroidIdForGroup(str, true, c0061a);
                        if (androidIdForGroup2 != aVar2) {
                            NotificationManager notificationManager4 = notificationManager;
                            obj = androidIdForGroup2;
                            notificationManager2 = notificationManager4;
                            Integer num32 = (Integer) obj;
                            notificationManager = notificationManager2;
                            num2 = num32;
                            if (num2 != null) {
                            }
                        }
                    }
                    return aVar2;
                }
                return oVar;
            }
        }
        c0061a = new C0061a(dVar);
        Object obj2 = c0061a.result;
        i10 = c0061a.label;
        o oVar2 = o.f277a;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
        num = (Integer) androidIdForGroup;
        if (num != null) {
        }
        return oVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ya.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i10, fc.d dVar) {
        d dVar2;
        int i11;
        a aVar;
        String str;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i12 = dVar2.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i12 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                i11 = dVar2.label;
                o oVar = o.f277a;
                gc.a aVar2 = gc.a.f2559g;
                if (i11 != 0) {
                    v6.a.W(obj);
                    oa.d dVar3 = this._dataController;
                    dVar2.L$0 = this;
                    dVar2.label = 1;
                    obj = dVar3.getGroupId(i10, dVar2);
                    if (obj != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                aVar = (a) dVar2.L$0;
                v6.a.W(obj);
                str = (String) obj;
                if (str != null) {
                    dVar2.L$0 = null;
                    dVar2.label = 2;
                    if (aVar.internalUpdateSummaryNotificationAfterChildRemoved(str, true, dVar2) == aVar2) {
                        return aVar2;
                    }
                }
                return oVar;
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.result;
        i11 = dVar2.label;
        o oVar2 = o.f277a;
        gc.a aVar22 = gc.a.f2559g;
        if (i11 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return oVar2;
    }

    @Override // ya.a
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z10, fc.d dVar) {
        Object internalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z10, dVar);
        return internalUpdateSummaryNotificationAfterChildRemoved == gc.a.f2559g ? internalUpdateSummaryNotificationAfterChildRemoved : o.f277a;
    }
}
