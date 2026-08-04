package com.gamericefishpro.space.hg;

import android.service.notification.StatusBarNotification;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.mf.e;
import com.gamericefishpro.space.nf.d;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.vh.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.gg.b {
    public static final C0019a Companion = new C0019a(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final f _applicationService;
    private final com.gamericefishpro.space.df.a _badgeCountUpdater;
    private final d _dataController;
    private final com.gamericefishpro.space.rf.b _workManager;

    /* JADX INFO: renamed from: com.gamericefishpro.space.hg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0019a {
        public /* synthetic */ C0019a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0019a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.process(this);
        }
    }

    public a(f _applicationService, com.gamericefishpro.space.rf.b _workManager, d _dataController, com.gamericefishpro.space.df.a _badgeCountUpdater) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_workManager, "_workManager");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._workManager = _workManager;
        this._dataController = _dataController;
        this._badgeCountUpdater = _badgeCountUpdater;
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

    /* JADX WARN: Code duplicated, block: B:30:0x006d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:28:0x0067, B:30:0x006d, B:33:0x0082, B:20:0x0040, B:27:0x005f, B:23:0x004d), top: B:38:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:28:0x0067->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.gg.b
    public Object process(com.gamericefishpro.space.th.a aVar) {
        b bVar;
        a aVar2;
        a aVar3;
        Iterator it;
        com.gamericefishpro.space.nf.c cVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object objListNotificationsForOutstanding = bVar.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar.label;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(objListNotificationsForOutstanding);
                com.gamericefishpro.space.od.b.info$default("Restoring notifications", null, 2, null);
                List<Integer> visibleNotifications = getVisibleNotifications();
                d dVar = this._dataController;
                bVar.L$0 = this;
                bVar.label = 1;
                objListNotificationsForOutstanding = dVar.listNotificationsForOutstanding(visibleNotifications, bVar);
                if (objListNotificationsForOutstanding != aVar4) {
                    aVar2 = this;
                }
                return aVar4;
            }
            if (i2 == 1) {
                aVar2 = (a) bVar.L$0;
                com.gamericefishpro.space.wa.b.P(objListNotificationsForOutstanding);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.L$1;
                aVar3 = (a) bVar.L$0;
                com.gamericefishpro.space.wa.b.P(objListNotificationsForOutstanding);
            }
            while (it.hasNext()) {
                cVar = (com.gamericefishpro.space.nf.c) it.next();
                bVar.L$0 = aVar3;
                bVar.L$1 = it;
                bVar.label = 2;
                if (aVar3.processNotification(cVar, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS, bVar) == aVar4) {
                    return aVar4;
                }
            }
            aVar3._badgeCountUpdater.update();
            return Unit.a;
            aVar3 = aVar2;
            it = ((List) objListNotificationsForOutstanding).iterator();
            while (it.hasNext()) {
                cVar = (com.gamericefishpro.space.nf.c) it.next();
                bVar.L$0 = aVar3;
                bVar.L$1 = it;
                bVar.label = 2;
                if (aVar3.processNotification(cVar, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS, bVar) == aVar4) {
                    return aVar4;
                }
            }
            aVar3._badgeCountUpdater.update();
        } catch (Throwable th) {
            com.gamericefishpro.space.od.b.error("Error restoring notification records! ", th);
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.gg.b
    public Object processNotification(com.gamericefishpro.space.nf.c cVar, int i, com.gamericefishpro.space.th.a aVar) {
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), cVar.getId(), cVar.getAndroidId(), new JSONObject(cVar.getFullData()), cVar.getCreatedAt(), true, false);
        if (i <= 0) {
            return Unit.a;
        }
        Object objI = a0.i(i, aVar);
        return objI == com.gamericefishpro.space.uh.a.d ? objI : Unit.a;
    }
}
