package com.gamericefishpro.space.ye;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.ui.m;
import com.gamericefishpro.space.ve.j;
import com.gamericefishpro.space.ve.n;
import com.gamericefishpro.space.ve.o;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n, com.gamericefishpro.space.zf.a, com.gamericefishpro.space.lc.e {
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.nf.d _notificationDataController;
    private final com.gamericefishpro.space.tf.b _notificationLifecycleService;
    private final com.gamericefishpro.space.zf.b _notificationPermissionController;
    private final com.gamericefishpro.space.gg.c _notificationRestoreWorkManager;
    private final com.gamericefishpro.space.ig.a _summaryManager;
    private boolean permission;
    private final com.gamericefishpro.space.dc.b permissionChangedNotifier;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends i implements Function1 {
        int label;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return h.this.new a(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.nf.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.deleteExpiredNotifications(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function1 {
        int label;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return h.this.new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.nf.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.markAsDismissedForOutstanding(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends i implements Function1 {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$group = str;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return h.this.new c(this.$group, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((c) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.nf.d dVar = h.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (dVar.markAsDismissedForGroup(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends i implements Function1 {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$id = i;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return h.this.new d(this.$id, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((d) create(aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r5.updatePossibleDependentSummaryOnDismiss(r1, r4) == r0) goto L17;
         */
        @Override // com.gamericefishpro.space.vh.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    com.gamericefishpro.space.wa.b.P(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.nf.d dVar = h.this._notificationDataController;
            int i2 = this.$id;
            this.label = 1;
            obj = dVar.markAsDismissed(i2, this);
            if (obj != aVar) {
            }
            return aVar;
            if (((Boolean) obj).booleanValue()) {
                com.gamericefishpro.space.ig.a aVar2 = h.this._summaryManager;
                int i3 = this.$id;
                this.label = 2;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends i implements Function2 {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$fallbackToSettings = z;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return h.this.new e(this.$fallbackToSettings, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
                return obj;
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.zf.b bVar = h.this._notificationPermissionController;
            boolean z = this.$fallbackToSettings;
            this.label = 1;
            Object objPrompt = bVar.prompt(z, this);
            return objPrompt == aVar ? aVar : objPrompt;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends l implements Function1 {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(1);
            this.$isEnabled = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((o) obj);
            return Unit.a;
        }

        public final void invoke(o it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public h(com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.zf.b _notificationPermissionController, com.gamericefishpro.space.gg.c _notificationRestoreWorkManager, com.gamericefishpro.space.tf.b _notificationLifecycleService, com.gamericefishpro.space.nf.d _notificationDataController, com.gamericefishpro.space.ig.a _summaryManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationPermissionController, "_notificationPermissionController");
        Intrinsics.checkNotNullParameter(_notificationRestoreWorkManager, "_notificationRestoreWorkManager");
        Intrinsics.checkNotNullParameter(_notificationLifecycleService, "_notificationLifecycleService");
        Intrinsics.checkNotNullParameter(_notificationDataController, "_notificationDataController");
        Intrinsics.checkNotNullParameter(_summaryManager, "_summaryManager");
        this._applicationService = _applicationService;
        this._notificationPermissionController = _notificationPermissionController;
        this._notificationRestoreWorkManager = _notificationRestoreWorkManager;
        this._notificationLifecycleService = _notificationLifecycleService;
        this._notificationDataController = _notificationDataController;
        this._summaryManager = _summaryManager;
        this.permission = com.gamericefishpro.space.mf.e.areNotificationsEnabled$default(com.gamericefishpro.space.mf.e.INSTANCE, _applicationService.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new com.gamericefishpro.space.dc.b();
        _applicationService.addApplicationLifecycleHandler(this);
        _notificationPermissionController.subscribe(this);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new a(null), 1, null);
    }

    private final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(com.gamericefishpro.space.mf.e.areNotificationsEnabled$default(com.gamericefishpro.space.mf.e.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z) {
        boolean zMo31getPermission = mo31getPermission();
        setPermission(z);
        if (zMo31getPermission != z) {
            this.permissionChangedNotifier.fireOnMain(new f(z));
        }
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: addClickListener */
    public void mo26addClickListener(com.gamericefishpro.space.ve.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.addClickListener(handler: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(listener);
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: addForegroundLifecycleListener */
    public void mo27addForegroundLifecycleListener(j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(listener);
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: addPermissionObserver */
    public void mo28addPermissionObserver(o observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.addPermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(observer);
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: clearAllNotifications */
    public void mo29clearAllNotifications() {
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: getCanRequestPermission */
    public boolean mo30getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: getPermission */
    public boolean mo31getPermission() {
        return this.permission;
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onFocus(boolean z) {
        refreshNotificationState();
    }

    @Override // com.gamericefishpro.space.zf.a
    public void onNotificationPermissionChanged(boolean z) {
        setPermissionStatusAndFire(z);
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removeClickListener */
    public void mo32removeClickListener(com.gamericefishpro.space.ve.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(listener);
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removeForegroundLifecycleListener */
    public void mo33removeForegroundLifecycleListener(j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(listener);
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removeGroupedNotifications */
    public void mo34removeGroupedNotifications(String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.removeGroupedNotifications(group: " + group + ')', null, 2, null);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new c(group, null), 1, null);
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removeNotification */
    public void mo35removeNotification(int i) {
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.removeNotification(id: " + i + ')', null, 2, null);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new d(i, null), 1, null);
    }

    @Override // com.gamericefishpro.space.ve.n
    /* JADX INFO: renamed from: removePermissionObserver */
    public void mo36removePermissionObserver(o observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.removePermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(observer);
    }

    @Override // com.gamericefishpro.space.ve.n
    public Object requestPermission(boolean z, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.od.b.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        com.gamericefishpro.space.wi.e eVar = k0.a;
        return a0.D(m.a, new e(z, null), aVar);
    }

    public void setPermission(boolean z) {
        this.permission = z;
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onUnfocused() {
    }
}
