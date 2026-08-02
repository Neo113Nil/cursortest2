package com.onesignal.notifications.internal;

import I7.l;
import I7.p;
import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import i5.j;
import i5.n;
import i5.o;
import kotlin.jvm.internal.i;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class h implements n, A5.a, x4.e {
    private final x4.f _applicationService;
    private final u5.d _notificationDataController;
    private final x5.b _notificationLifecycleService;
    private final A5.b _notificationPermissionController;
    private final D5.c _notificationRestoreWorkManager;
    private final E5.a _summaryManager;
    private boolean permission;
    private final com.onesignal.common.events.b permissionChangedNotifier;

    public static final class a extends B7.h implements l {
        int label;

        public a(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return h.this.new a(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                u5.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.deleteExpiredNotifications(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class b extends B7.h implements l {
        int label;

        public b(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return h.this.new b(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                u5.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.markAsDismissedForOutstanding(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class c extends i implements I7.a {
        public c() {
            super(0);
        }

        @Override // I7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m40invoke();
            return v.f41073a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m40invoke() {
            h.this.refreshNotificationState();
        }
    }

    public static final class d extends B7.h implements l {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$group = str;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return h.this.new d(this.$group, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                u5.d dVar = h.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (dVar.markAsDismissedForGroup(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((d) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class e extends B7.h implements l {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$id = i;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return h.this.new e(this.$id, interfaceC5240d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r5.updatePossibleDependentSummaryOnDismiss(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                u5.d dVar = h.this._notificationDataController;
                int i4 = this.$id;
                this.label = 1;
                obj = dVar.markAsDismissed(i4, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return v.f41073a;
                }
                Q3.b.s(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                E5.a aVar2 = h.this._summaryManager;
                int i6 = this.$id;
                this.label = 2;
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((e) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class f extends B7.h implements p {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z6, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$fallbackToSettings = z6;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return h.this.new f(this.$fallbackToSettings, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((f) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
                return obj;
            }
            Q3.b.s(obj);
            A5.b bVar = h.this._notificationPermissionController;
            boolean z6 = this.$fallbackToSettings;
            this.label = 1;
            Object prompt = bVar.prompt(z6, this);
            return prompt == aVar ? aVar : prompt;
        }
    }

    public static final class g extends i implements l {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z6) {
            super(1);
            this.$isEnabled = z6;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((o) obj);
            return v.f41073a;
        }

        public final void invoke(o it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public h(x4.f _applicationService, A5.b _notificationPermissionController, D5.c _notificationRestoreWorkManager, x5.b _notificationLifecycleService, u5.d _notificationDataController, E5.a _summaryManager) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_notificationPermissionController, "_notificationPermissionController");
        kotlin.jvm.internal.h.e(_notificationRestoreWorkManager, "_notificationRestoreWorkManager");
        kotlin.jvm.internal.h.e(_notificationLifecycleService, "_notificationLifecycleService");
        kotlin.jvm.internal.h.e(_notificationDataController, "_notificationDataController");
        kotlin.jvm.internal.h.e(_summaryManager, "_summaryManager");
        this._applicationService = _applicationService;
        this._notificationPermissionController = _notificationPermissionController;
        this._notificationRestoreWorkManager = _notificationRestoreWorkManager;
        this._notificationLifecycleService = _notificationLifecycleService;
        this._notificationDataController = _notificationDataController;
        this._summaryManager = _summaryManager;
        this.permission = t5.e.areNotificationsEnabled$default(t5.e.INSTANCE, _applicationService.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new com.onesignal.common.events.b();
        _applicationService.addApplicationLifecycleHandler(this);
        _notificationPermissionController.subscribe(this);
        com.onesignal.common.threading.c.suspendifyOnIO(new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(t5.e.areNotificationsEnabled$default(t5.e.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z6) {
        boolean mo34getPermission = mo34getPermission();
        setPermission(z6);
        if (mo34getPermission != z6) {
            this.permissionChangedNotifier.fireOnMain(new g(z6));
        }
    }

    @Override // i5.n
    /* renamed from: addClickListener */
    public void mo29addClickListener(i5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addClickListener(handler: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(listener);
    }

    @Override // i5.n
    /* renamed from: addForegroundLifecycleListener */
    public void mo30addForegroundLifecycleListener(j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(listener);
    }

    @Override // i5.n
    /* renamed from: addPermissionObserver */
    public void mo31addPermissionObserver(o observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addPermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(observer);
    }

    @Override // i5.n
    /* renamed from: clearAllNotifications */
    public void mo32clearAllNotifications() {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new b(null));
    }

    @Override // i5.n
    /* renamed from: getCanRequestPermission */
    public boolean mo33getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // i5.n
    /* renamed from: getPermission */
    public boolean mo34getPermission() {
        return this.permission;
    }

    @Override // x4.e
    public void onFocus(boolean z6) {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new c());
    }

    @Override // A5.a
    public void onNotificationPermissionChanged(boolean z6) {
        setPermissionStatusAndFire(z6);
    }

    @Override // x4.e
    public void onUnfocused() {
    }

    @Override // i5.n
    /* renamed from: removeClickListener */
    public void mo35removeClickListener(i5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(listener);
    }

    @Override // i5.n
    /* renamed from: removeForegroundLifecycleListener */
    public void mo36removeForegroundLifecycleListener(j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(listener);
    }

    @Override // i5.n
    /* renamed from: removeGroupedNotifications */
    public void mo37removeGroupedNotifications(String group) {
        kotlin.jvm.internal.h.e(group, "group");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeGroupedNotifications(group: " + group + ')', null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new d(group, null));
    }

    @Override // i5.n
    /* renamed from: removeNotification */
    public void mo38removeNotification(int i) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeNotification(id: " + i + ')', null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new e(i, null));
    }

    @Override // i5.n
    /* renamed from: removePermissionObserver */
    public void mo39removePermissionObserver(o observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removePermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(observer);
    }

    @Override // i5.n
    public Object requestPermission(boolean z6, InterfaceC5240d interfaceC5240d) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        return AbstractC0410y.y(X7.o.f3811a, new f(z6, null), interfaceC5240d);
    }

    public void setPermission(boolean z6) {
        this.permission = z6;
    }
}
