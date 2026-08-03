package com.onesignal.notifications.internal.restoration.impl;

import ac.o;
import android.service.notification.StatusBarNotification;
import hc.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import na.e;
import oa.d;
import org.json.JSONObject;
import pc.j;
import q8.f;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements xa.b {
    public static final C0060a Companion = new C0060a(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final f _applicationService;
    private final ga.a _badgeCountUpdater;
    private final d _dataController;
    private final qa.b _workManager;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.restoration.impl.a$a, reason: collision with other inner class name */
    public static final class C0060a {
        public /* synthetic */ C0060a(pc.f fVar) {
            this();
        }

        private C0060a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.process(this);
        }
    }

    public a(f fVar, qa.b bVar, d dVar, ga.a aVar) {
        j.e(fVar, "_applicationService");
        j.e(bVar, "_workManager");
        j.e(dVar, "_dataController");
        j.e(aVar, "_badgeCountUpdater");
        this._applicationService = fVar;
        this._workManager = bVar;
        this._dataController = dVar;
        this._badgeCountUpdater = aVar;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(8:11|12|13|(3:16|(2:18|19)(1:21)|14)|22|23|24|25)(2:27|28))(2:29|30))(3:32|33|(2:35|19)(1:36))|31|13|(1:14)|22|23|24|25))|39|6|7|(0)(0)|31|13|(1:14)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Error restoring notification records! ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:14:0x0067, B:16:0x006d, B:23:0x0082, B:30:0x0040, B:31:0x005f, B:33:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // xa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object process(fc.d dVar) {
        b bVar;
        int i10;
        a aVar;
        a aVar2;
        Iterator it;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i10 = bVar.label;
                gc.a aVar3 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.debug.internal.logging.b.info$default("Restoring notifications", null, 2, null);
                    List<Integer> visibleNotifications = getVisibleNotifications();
                    d dVar2 = this._dataController;
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = dVar2.listNotificationsForOutstanding(visibleNotifications, bVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) bVar.L$1;
                        aVar2 = (a) bVar.L$0;
                        v6.a.W(obj);
                        while (it.hasNext()) {
                            oa.c cVar = (oa.c) it.next();
                            bVar.L$0 = aVar2;
                            bVar.L$1 = it;
                            bVar.label = 2;
                            if (aVar2.processNotification(cVar, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS, bVar) == aVar3) {
                                return aVar3;
                            }
                        }
                        aVar2._badgeCountUpdater.update();
                        return o.f277a;
                    }
                    aVar = (a) bVar.L$0;
                    v6.a.W(obj);
                }
                aVar2 = aVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                aVar2._badgeCountUpdater.update();
                return o.f277a;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i10 = bVar.label;
        gc.a aVar32 = gc.a.f2559g;
        if (i10 != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        aVar2._badgeCountUpdater.update();
        return o.f277a;
    }

    @Override // xa.b
    public Object processNotification(oa.c cVar, int i10, fc.d dVar) {
        Object f10;
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), cVar.getId(), cVar.getAndroidId(), new JSONObject(cVar.getFullData()), cVar.getCreatedAt(), true, false);
        return (i10 <= 0 || (f10 = a0.f((long) i10, dVar)) != gc.a.f2559g) ? o.f277a : f10;
    }
}
