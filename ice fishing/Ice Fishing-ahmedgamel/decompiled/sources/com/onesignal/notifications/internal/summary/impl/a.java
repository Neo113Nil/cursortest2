package com.onesignal.notifications.internal.summary.impl;

import android.app.NotificationManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import t5.e;
import u5.AbstractC5081b;
import u5.C5082c;
import u7.v;
import v5.InterfaceC5117c;
import v7.AbstractC5129j;
import x4.f;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class a implements E5.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final u5.d _dataController;
    private final D5.b _notificationRestoreProcessor;
    private final InterfaceC5117c _summaryNotificationDisplayer;
    private final K4.a _time;

    /* renamed from: com.onesignal.notifications.internal.summary.impl.a$a, reason: collision with other inner class name */
    public static final class C0241a extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0241a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    public static final class b extends B7.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    public static final class c extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.restoreSummary(null, this);
        }
    }

    public static final class d extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public a(f _applicationService, u5.d _dataController, InterfaceC5117c _summaryNotificationDisplayer, com.onesignal.core.internal.config.c _configModelStore, D5.b _notificationRestoreProcessor, K4.a _time) {
        h.e(_applicationService, "_applicationService");
        h.e(_dataController, "_dataController");
        h.e(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        h.e(_configModelStore, "_configModelStore");
        h.e(_notificationRestoreProcessor, "_notificationRestoreProcessor");
        h.e(_time, "_time");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._configModelStore = _configModelStore;
        this._notificationRestoreProcessor = _notificationRestoreProcessor;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:(1:(1:(1:(3:15|16|17)(2:20|21))(2:22|23))(2:24|25))(4:26|27|(3:29|(2:31|(0)(1:25))(1:(2:35|(0)(1:23))(1:37))|33)|17))(1:39))(3:43|(1:45)|33)|40|(4:42|27|(0)|17)|33))|49|6|7|8|(0)(0)|40|(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        if (r13.updateSummaryNotification(r15, r6) == r0) goto L49;
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
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z3, InterfaceC5267d interfaceC5267d) {
        b bVar;
        A7.a aVar;
        int i;
        a aVar2;
        List list;
        Object androidIdForGroup;
        String str2;
        int i6;
        Integer num;
        if (interfaceC5267d instanceof b) {
            bVar = (b) interfaceC5267d;
            int i9 = bVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.label = i9 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                aVar = A7.a.f58n;
                i = bVar2.label;
                v vVar = v.f41353a;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    u5.d dVar = this._dataController;
                    bVar2.L$0 = this;
                    bVar2.L$1 = str;
                    bVar2.Z$0 = z3;
                    bVar2.label = 1;
                    obj = dVar.listNotificationsForGroup(str, bVar2);
                    if (obj != aVar) {
                        aVar2 = this;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            com.bumptech.glide.d.k(obj);
                            return vVar;
                        }
                        if (i == 4) {
                            com.bumptech.glide.d.k(obj);
                            return vVar;
                        }
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.d.k(obj);
                        return vVar;
                    }
                    i6 = bVar2.I$0;
                    z3 = bVar2.Z$0;
                    list = (List) bVar2.L$2;
                    str2 = (String) bVar2.L$1;
                    aVar2 = (a) bVar2.L$0;
                    com.bumptech.glide.d.k(obj);
                    num = (Integer) obj;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (i6 == 0) {
                            e.INSTANCE.getNotificationManager(aVar2._applicationService.getAppContext()).cancel(intValue);
                            u5.d dVar2 = aVar2._dataController;
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 3;
                            if (AbstractC5081b.markAsConsumed$default(dVar2, intValue, z3, null, false, bVar2, 12, null) != aVar) {
                                return vVar;
                            }
                        } else if (i6 == 1) {
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 4;
                            if (aVar2.restoreSummary(str2, bVar2) != aVar) {
                                return vVar;
                            }
                        } else {
                            C5082c c5082c = (C5082c) AbstractC5129j.A(list);
                            t5.d dVar3 = new t5.d(new JSONObject(c5082c.getFullData()), aVar2._time);
                            dVar3.setRestoring(true);
                            dVar3.setShownTimeStamp(new Long(c5082c.getCreatedAt()));
                            InterfaceC5117c interfaceC5117c = aVar2._summaryNotificationDisplayer;
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 5;
                        }
                        return aVar;
                    }
                    return vVar;
                }
                z3 = bVar2.Z$0;
                str = (String) bVar2.L$1;
                a aVar3 = (a) bVar2.L$0;
                com.bumptech.glide.d.k(obj);
                aVar2 = aVar3;
                list = (List) obj;
                int size = list.size();
                u5.d dVar4 = aVar2._dataController;
                bVar2.L$0 = aVar2;
                bVar2.L$1 = str;
                bVar2.L$2 = list;
                bVar2.Z$0 = z3;
                bVar2.I$0 = size;
                bVar2.label = 2;
                androidIdForGroup = dVar4.getAndroidIdForGroup(str, true, bVar2);
                if (androidIdForGroup != aVar) {
                    str2 = str;
                    i6 = size;
                    obj = androidIdForGroup;
                    num = (Integer) obj;
                    if (num != null) {
                    }
                    return vVar;
                }
                return aVar;
            }
        }
        bVar = new b(interfaceC5267d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        aVar = A7.a.f58n;
        i = bVar22.label;
        v vVar2 = v.f41353a;
        if (i != 0) {
        }
        list = (List) obj2;
        int size2 = list.size();
        u5.d dVar42 = aVar2._dataController;
        bVar22.L$0 = aVar2;
        bVar22.L$1 = str;
        bVar22.L$2 = list;
        bVar22.Z$0 = z3;
        bVar22.I$0 = size2;
        bVar22.label = 2;
        androidIdForGroup = dVar42.getAndroidIdForGroup(str, true, bVar22);
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
    public final Object restoreSummary(String str, InterfaceC5267d interfaceC5267d) {
        c cVar;
        int i;
        a aVar;
        a aVar2;
        Iterator it;
        if (interfaceC5267d instanceof c) {
            cVar = (c) interfaceC5267d;
            int i6 = cVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.label = i6 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                A7.a aVar3 = A7.a.f58n;
                i = cVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    u5.d dVar = this._dataController;
                    cVar.L$0 = this;
                    cVar.label = 1;
                    obj = dVar.listNotificationsForGroup(str, cVar);
                    if (obj != aVar3) {
                        aVar = this;
                    }
                    return aVar3;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) cVar.L$1;
                    aVar2 = (a) cVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    c cVar2 = cVar;
                    while (it.hasNext()) {
                        C5082c c5082c = (C5082c) it.next();
                        D5.b bVar = aVar2._notificationRestoreProcessor;
                        cVar2.L$0 = aVar2;
                        cVar2.L$1 = it;
                        cVar2.label = 2;
                        if (D5.a.processNotification$default(bVar, c5082c, 0, cVar2, 2, null) == aVar3) {
                            return aVar3;
                        }
                    }
                    return v.f41353a;
                }
                aVar = (a) cVar.L$0;
                com.bumptech.glide.d.k(obj);
                aVar2 = aVar;
                it = ((List) obj).iterator();
                c cVar22 = cVar;
                while (it.hasNext()) {
                }
                return v.f41353a;
            }
        }
        cVar = new c(interfaceC5267d);
        Object obj2 = cVar.result;
        A7.a aVar32 = A7.a.f58n;
        i = cVar.label;
        if (i != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        c cVar222 = cVar;
        while (it.hasNext()) {
        }
        return v.f41353a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // E5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, InterfaceC5267d interfaceC5267d) {
        C0241a c0241a;
        int i;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        a aVar;
        Integer num;
        NotificationManager notificationManager2;
        Integer num2;
        if (interfaceC5267d instanceof C0241a) {
            c0241a = (C0241a) interfaceC5267d;
            int i6 = c0241a.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0241a.label = i6 - Integer.MIN_VALUE;
                Object obj = c0241a.result;
                A7.a aVar2 = A7.a.f58n;
                i = c0241a.label;
                v vVar = v.f41353a;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
                    u5.d dVar = this._dataController;
                    c0241a.L$0 = this;
                    c0241a.L$1 = str;
                    c0241a.L$2 = notificationManager;
                    c0241a.label = 1;
                    androidIdForGroup = dVar.getAndroidIdForGroup(str, false, c0241a);
                    if (androidIdForGroup != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.d.k(obj);
                        return vVar;
                    }
                    notificationManager2 = (NotificationManager) c0241a.L$0;
                    com.bumptech.glide.d.k(obj);
                    Integer num3 = (Integer) obj;
                    notificationManager = notificationManager2;
                    num2 = num3;
                    if (num2 != null) {
                        notificationManager.cancel(num2.intValue());
                    }
                    return vVar;
                }
                NotificationManager notificationManager3 = (NotificationManager) c0241a.L$2;
                String str2 = (String) c0241a.L$1;
                aVar = (a) c0241a.L$0;
                com.bumptech.glide.d.k(obj);
                notificationManager = notificationManager3;
                str = str2;
                androidIdForGroup = obj;
                num = (Integer) androidIdForGroup;
                if (num != null) {
                    if (!((com.onesignal.core.internal.config.b) aVar._configModelStore.getModel()).getClearGroupOnSummaryClick()) {
                        u5.d dVar2 = aVar._dataController;
                        int intValue = num.intValue();
                        c0241a.L$0 = null;
                        c0241a.L$1 = null;
                        c0241a.L$2 = null;
                        c0241a.label = 3;
                        if (dVar2.markAsDismissed(intValue, c0241a) == aVar2) {
                        }
                    } else if (h.a(str, e.GROUPLESS_SUMMARY_KEY)) {
                        num2 = new Integer(e.GROUPLESS_SUMMARY_ID);
                        if (num2 != null) {
                        }
                    } else {
                        u5.d dVar3 = aVar._dataController;
                        c0241a.L$0 = notificationManager;
                        c0241a.L$1 = null;
                        c0241a.L$2 = null;
                        c0241a.label = 2;
                        Object androidIdForGroup2 = dVar3.getAndroidIdForGroup(str, true, c0241a);
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
                return vVar;
            }
        }
        c0241a = new C0241a(interfaceC5267d);
        Object obj2 = c0241a.result;
        A7.a aVar22 = A7.a.f58n;
        i = c0241a.label;
        v vVar2 = v.f41353a;
        if (i != 0) {
        }
        num = (Integer) androidIdForGroup;
        if (num != null) {
        }
        return vVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // E5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i, InterfaceC5267d interfaceC5267d) {
        d dVar;
        int i6;
        a aVar;
        String str;
        if (interfaceC5267d instanceof d) {
            dVar = (d) interfaceC5267d;
            int i9 = dVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.label = i9 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                A7.a aVar2 = A7.a.f58n;
                i6 = dVar.label;
                v vVar = v.f41353a;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    u5.d dVar2 = this._dataController;
                    dVar.L$0 = this;
                    dVar.label = 1;
                    obj = dVar2.getGroupId(i, dVar);
                    if (obj != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                    return vVar;
                }
                aVar = (a) dVar.L$0;
                com.bumptech.glide.d.k(obj);
                str = (String) obj;
                if (str != null) {
                    dVar.L$0 = null;
                    dVar.label = 2;
                    if (aVar.internalUpdateSummaryNotificationAfterChildRemoved(str, true, dVar) == aVar2) {
                        return aVar2;
                    }
                }
                return vVar;
            }
        }
        dVar = new d(interfaceC5267d);
        Object obj2 = dVar.result;
        A7.a aVar22 = A7.a.f58n;
        i6 = dVar.label;
        v vVar2 = v.f41353a;
        if (i6 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return vVar2;
    }

    @Override // E5.a
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z3, InterfaceC5267d interfaceC5267d) {
        Object internalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z3, interfaceC5267d);
        return internalUpdateSummaryNotificationAfterChildRemoved == A7.a.f58n ? internalUpdateSummaryNotificationAfterChildRemoved : v.f41353a;
    }
}
