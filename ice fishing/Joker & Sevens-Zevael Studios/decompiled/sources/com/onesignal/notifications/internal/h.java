package com.onesignal.notifications.internal;

import ac.o;
import ca.n;
import hc.j;
import pc.k;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements n, ua.a, q8.e {
    private final q8.f _applicationService;
    private final oa.d _notificationDataController;
    private final ra.b _notificationLifecycleService;
    private final ua.b _notificationPermissionController;
    private final xa.c _notificationRestoreWorkManager;
    private final ya.a _summaryManager;
    private boolean permission;
    private final com.onesignal.common.events.b permissionChangedNotifier;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements oc.c {
        int label;

        public a(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return h.this.new a(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                oa.d dVar = h.this._notificationDataController;
                this.label = 1;
                Object deleteExpiredNotifications = dVar.deleteExpiredNotifications(this);
                gc.a aVar = gc.a.f2559g;
                if (deleteExpiredNotifications == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements oc.c {
        int label;

        public b(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return h.this.new b(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((b) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                oa.d dVar = h.this._notificationDataController;
                this.label = 1;
                Object markAsDismissedForOutstanding = dVar.markAsDismissedForOutstanding(this);
                gc.a aVar = gc.a.f2559g;
                if (markAsDismissedForOutstanding == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends j implements oc.c {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, fc.d dVar) {
            super(1, dVar);
            this.$group = str;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return h.this.new c(this.$group, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((c) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                oa.d dVar = h.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                Object markAsDismissedForGroup = dVar.markAsDismissedForGroup(str, this);
                gc.a aVar = gc.a.f2559g;
                if (markAsDismissedForGroup == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends j implements oc.c {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, fc.d dVar) {
            super(1, dVar);
            this.$id = i10;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return h.this.new d(this.$id, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((d) create(dVar)).invokeSuspend(o.f277a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r5.updatePossibleDependentSummaryOnDismiss(r0, r4) == r3) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            if (r5 == r3) goto L17;
         */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            gc.a aVar = gc.a.f2559g;
            if (i10 == 0) {
                v6.a.W(obj);
                oa.d dVar = h.this._notificationDataController;
                int i11 = this.$id;
                this.label = 1;
                obj = dVar.markAsDismissed(i11, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return o.f277a;
                }
                v6.a.W(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ya.a aVar2 = h.this._summaryManager;
                int i12 = this.$id;
                this.label = 2;
            }
            return o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends j implements oc.e {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, fc.d dVar) {
            super(2, dVar);
            this.$fallbackToSettings = z10;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return h.this.new e(this.$fallbackToSettings, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                return obj;
            }
            v6.a.W(obj);
            ua.b bVar = h.this._notificationPermissionController;
            boolean z10 = this.$fallbackToSettings;
            this.label = 1;
            Object prompt = bVar.prompt(z10, this);
            gc.a aVar = gc.a.f2559g;
            return prompt == aVar ? aVar : prompt;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((e) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends k implements oc.c {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10) {
            super(1);
            this.$isEnabled = z10;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ca.o) obj);
            return o.f277a;
        }

        public final void invoke(ca.o oVar) {
            pc.j.e(oVar, "it");
            oVar.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public h(q8.f fVar, ua.b bVar, xa.c cVar, ra.b bVar2, oa.d dVar, ya.a aVar) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(bVar, "_notificationPermissionController");
        pc.j.e(cVar, "_notificationRestoreWorkManager");
        pc.j.e(bVar2, "_notificationLifecycleService");
        pc.j.e(dVar, "_notificationDataController");
        pc.j.e(aVar, "_summaryManager");
        this._applicationService = fVar;
        this._notificationPermissionController = bVar;
        this._notificationRestoreWorkManager = cVar;
        this._notificationLifecycleService = bVar2;
        this._notificationDataController = dVar;
        this._summaryManager = aVar;
        this.permission = na.e.areNotificationsEnabled$default(na.e.INSTANCE, fVar.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new com.onesignal.common.events.b();
        fVar.addApplicationLifecycleHandler(this);
        bVar.subscribe(this);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(null), 1, null);
    }

    private final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(na.e.areNotificationsEnabled$default(na.e.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z10) {
        boolean mo31getPermission = mo31getPermission();
        setPermission(z10);
        if (mo31getPermission != z10) {
            this.permissionChangedNotifier.fireOnMain(new f(z10));
        }
    }

    @Override // ca.n
    /* renamed from: addClickListener */
    public void mo26addClickListener(ca.h hVar) {
        pc.j.e(hVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addClickListener(handler: " + hVar + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(hVar);
    }

    @Override // ca.n
    /* renamed from: addForegroundLifecycleListener */
    public void mo27addForegroundLifecycleListener(ca.j jVar) {
        pc.j.e(jVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + jVar + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(jVar);
    }

    @Override // ca.n
    /* renamed from: addPermissionObserver */
    public void mo28addPermissionObserver(ca.o oVar) {
        pc.j.e(oVar, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addPermissionObserver(observer: " + oVar + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(oVar);
    }

    @Override // ca.n
    /* renamed from: clearAllNotifications */
    public void mo29clearAllNotifications() {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // ca.n
    /* renamed from: getCanRequestPermission */
    public boolean mo30getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // ca.n
    /* renamed from: getPermission */
    public boolean mo31getPermission() {
        return this.permission;
    }

    @Override // q8.e
    public void onFocus(boolean z10) {
        refreshNotificationState();
    }

    @Override // ua.a
    public void onNotificationPermissionChanged(boolean z10) {
        setPermissionStatusAndFire(z10);
    }

    @Override // ca.n
    /* renamed from: removeClickListener */
    public void mo32removeClickListener(ca.h hVar) {
        pc.j.e(hVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeClickListener(listener: " + hVar + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(hVar);
    }

    @Override // ca.n
    /* renamed from: removeForegroundLifecycleListener */
    public void mo33removeForegroundLifecycleListener(ca.j jVar) {
        pc.j.e(jVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + jVar + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(jVar);
    }

    @Override // ca.n
    /* renamed from: removeGroupedNotifications */
    public void mo34removeGroupedNotifications(String str) {
        pc.j.e(str, "group");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeGroupedNotifications(group: " + str + ')', null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new c(str, null), 1, null);
    }

    @Override // ca.n
    /* renamed from: removeNotification */
    public void mo35removeNotification(int i10) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeNotification(id: " + i10 + ')', null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new d(i10, null), 1, null);
    }

    @Override // ca.n
    /* renamed from: removePermissionObserver */
    public void mo36removePermissionObserver(ca.o oVar) {
        pc.j.e(oVar, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removePermissionObserver(observer: " + oVar + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(oVar);
    }

    @Override // ca.n
    public Object requestPermission(boolean z10, fc.d dVar) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        fd.e eVar = i0.f8859a;
        return a0.A(dd.o.f1880a, new e(z10, null), dVar);
    }

    public void setPermission(boolean z10) {
        this.permission = z10;
    }

    @Override // q8.e
    public void onUnfocused() {
    }
}
