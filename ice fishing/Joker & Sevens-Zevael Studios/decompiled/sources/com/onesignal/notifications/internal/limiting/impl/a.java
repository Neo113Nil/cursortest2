package com.onesignal.notifications.internal.limiting.impl;

import ac.o;
import android.service.notification.StatusBarNotification;
import hc.c;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import na.e;
import oa.d;
import pc.j;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements sa.b {
    private final f _applicationService;
    private final d _dataController;
    private final ya.a _notificationSummaryManager;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.limiting.impl.a$a, reason: collision with other inner class name */
    public static final class C0055a extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0055a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimit(0, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimitStandard(0, this);
        }
    }

    public a(d dVar, f fVar, ya.a aVar) {
        j.e(dVar, "_dataController");
        j.e(fVar, "_applicationService");
        j.e(aVar, "_notificationSummaryManager");
        this._dataController = dVar;
        this._applicationService = fVar;
        this._notificationSummaryManager = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0109, code lost:
    
        if (r3 <= 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0100 -> B:11:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0105 -> B:12:0x0107). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearOldestOverLimitStandard(int i10, fc.d dVar) {
        b bVar;
        int i11;
        int length;
        Iterator it;
        a aVar;
        a aVar2;
        Iterator it2;
        Integer num;
        Iterator it3;
        a aVar3;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i11 = bVar.label;
                o oVar = o.f277a;
                gc.a aVar4 = gc.a.f2559g;
                if (i11 != 0) {
                    v6.a.W(obj);
                    StatusBarNotification[] activeNotifications = e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
                    length = (activeNotifications.length - sa.a.INSTANCE.getMaxNumberOfNotifications()) + i10;
                    if (length < 1) {
                        return oVar;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (StatusBarNotification statusBarNotification : activeNotifications) {
                        if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                            treeMap.put(new Long(statusBarNotification.getNotification().when), new Integer(statusBarNotification.getId()));
                        }
                    }
                    it = treeMap.entrySet().iterator();
                    aVar = this;
                    if (it.hasNext()) {
                        Integer num2 = (Integer) ((Map.Entry) it.next()).getValue();
                        d dVar2 = aVar._dataController;
                        j.d(num2, "value");
                        int intValue = num2.intValue();
                        bVar.L$0 = aVar;
                        bVar.L$1 = it;
                        bVar.L$2 = num2;
                        bVar.I$0 = length;
                        bVar.label = 1;
                        Object markAsDismissed = dVar2.markAsDismissed(intValue, bVar);
                        if (markAsDismissed != aVar4) {
                            it2 = it;
                            obj = markAsDismissed;
                            aVar2 = aVar;
                            num = num2;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                        return aVar4;
                    }
                    return oVar;
                }
                if (i11 == 1) {
                    length = bVar.I$0;
                    num = (Integer) bVar.L$2;
                    it2 = (Iterator) bVar.L$1;
                    aVar2 = (a) bVar.L$0;
                    v6.a.W(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        ya.a aVar5 = aVar2._notificationSummaryManager;
                        j.d(num, "value");
                        int intValue2 = num.intValue();
                        bVar.L$0 = aVar2;
                        bVar.L$1 = it2;
                        bVar.L$2 = null;
                        bVar.I$0 = length;
                        bVar.label = 2;
                        if (aVar5.updatePossibleDependentSummaryOnDismiss(intValue2, bVar) != aVar4) {
                            it3 = it2;
                            aVar3 = aVar2;
                            it = it3;
                            aVar = aVar3;
                            length--;
                        }
                        return aVar4;
                    }
                    it = it2;
                    aVar = aVar2;
                    length--;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = bVar.I$0;
                    it3 = (Iterator) bVar.L$1;
                    aVar3 = (a) bVar.L$0;
                    v6.a.W(obj);
                    it = it3;
                    aVar = aVar3;
                    length--;
                }
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i11 = bVar.label;
        o oVar2 = o.f277a;
        gc.a aVar42 = gc.a.f2559g;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r7.clearOldestOverLimitFallback(r6, r1, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (clearOldestOverLimitStandard(r6, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // sa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearOldestOverLimit(int i10, fc.d dVar) {
        C0055a c0055a;
        int i11;
        a aVar;
        if (dVar instanceof C0055a) {
            c0055a = (C0055a) dVar;
            int i12 = c0055a.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0055a.label = i12 - Integer.MIN_VALUE;
                Object obj = c0055a.result;
                i11 = c0055a.label;
                gc.a aVar2 = gc.a.f2559g;
                if (i11 != 0) {
                    v6.a.W(obj);
                    try {
                        c0055a.L$0 = this;
                        c0055a.I$0 = i10;
                        c0055a.label = 1;
                    } catch (Throwable unused) {
                        aVar = this;
                        d dVar2 = aVar._dataController;
                        int maxNumberOfNotifications = sa.a.INSTANCE.getMaxNumberOfNotifications();
                        c0055a.L$0 = null;
                        c0055a.label = 3;
                    }
                } else if (i11 == 1 || i11 == 2) {
                    i10 = c0055a.I$0;
                    aVar = (a) c0055a.L$0;
                    try {
                        v6.a.W(obj);
                    } catch (Throwable unused2) {
                        d dVar22 = aVar._dataController;
                        int maxNumberOfNotifications2 = sa.a.INSTANCE.getMaxNumberOfNotifications();
                        c0055a.L$0 = null;
                        c0055a.label = 3;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return o.f277a;
            }
        }
        c0055a = new C0055a(dVar);
        Object obj2 = c0055a.result;
        i11 = c0055a.label;
        gc.a aVar22 = gc.a.f2559g;
        if (i11 != 0) {
        }
        return o.f277a;
    }
}
