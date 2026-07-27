package com.onesignal.notifications.internal;

import E7.l;
import E7.p;
import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import e5.j;
import e5.n;
import e5.o;
import kotlin.jvm.internal.i;
import q7.v;
import v7.InterfaceC5133d;
import w5.InterfaceC5172a;
import w5.InterfaceC5173b;
import w7.EnumC5179a;
import z5.InterfaceC5281c;

/* loaded from: classes2.dex */
public final class h implements n, InterfaceC5172a, t4.e {
    private final t4.f _applicationService;
    private final q5.d _notificationDataController;
    private final t5.b _notificationLifecycleService;
    private final InterfaceC5173b _notificationPermissionController;
    private final InterfaceC5281c _notificationRestoreWorkManager;
    private final A5.a _summaryManager;
    private boolean permission;
    private final com.onesignal.common.events.b permissionChangedNotifier;

    public static final class a extends x7.h implements l {
        int label;

        public a(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return h.this.new a(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                q5.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.deleteExpiredNotifications(this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class b extends x7.h implements l {
        int label;

        public b(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return h.this.new b(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                q5.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.markAsDismissedForOutstanding(this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class c extends i implements E7.a {
        public c() {
            super(0);
        }

        @Override // E7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m36invoke();
            return v.f40183a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m36invoke() {
            h.this.refreshNotificationState();
        }
    }

    public static final class d extends x7.h implements l {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$group = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return h.this.new d(this.$group, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                q5.d dVar = h.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (dVar.markAsDismissedForGroup(str, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((d) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class e extends x7.h implements l {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$id = i;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return h.this.new e(this.$id, interfaceC5133d);
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
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                q5.d dVar = h.this._notificationDataController;
                int i4 = this.$id;
                this.label = 1;
                obj = dVar.markAsDismissed(i4, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return v.f40183a;
                }
                com.bumptech.glide.f.r(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                A5.a aVar = h.this._summaryManager;
                int i9 = this.$id;
                this.label = 2;
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((e) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class f extends x7.h implements p {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z8, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$fallbackToSettings = z8;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return h.this.new f(this.$fallbackToSettings, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((f) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return obj;
            }
            com.bumptech.glide.f.r(obj);
            InterfaceC5173b interfaceC5173b = h.this._notificationPermissionController;
            boolean z8 = this.$fallbackToSettings;
            this.label = 1;
            Object prompt = interfaceC5173b.prompt(z8, this);
            return prompt == enumC5179a ? enumC5179a : prompt;
        }
    }

    public static final class g extends i implements l {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z8) {
            super(1);
            this.$isEnabled = z8;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((o) obj);
            return v.f40183a;
        }

        public final void invoke(o it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public h(t4.f _applicationService, InterfaceC5173b _notificationPermissionController, InterfaceC5281c _notificationRestoreWorkManager, t5.b _notificationLifecycleService, q5.d _notificationDataController, A5.a _summaryManager) {
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
        this.permission = p5.e.areNotificationsEnabled$default(p5.e.INSTANCE, _applicationService.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new com.onesignal.common.events.b();
        _applicationService.addApplicationLifecycleHandler(this);
        _notificationPermissionController.subscribe(this);
        com.onesignal.common.threading.c.suspendifyOnIO(new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(p5.e.areNotificationsEnabled$default(p5.e.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z8) {
        boolean mo30getPermission = mo30getPermission();
        setPermission(z8);
        if (mo30getPermission != z8) {
            this.permissionChangedNotifier.fireOnMain(new g(z8));
        }
    }

    @Override // e5.n
    /* renamed from: addClickListener */
    public void mo25addClickListener(e5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addClickListener(handler: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(listener);
    }

    @Override // e5.n
    /* renamed from: addForegroundLifecycleListener */
    public void mo26addForegroundLifecycleListener(j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(listener);
    }

    @Override // e5.n
    /* renamed from: addPermissionObserver */
    public void mo27addPermissionObserver(o observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addPermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(observer);
    }

    @Override // e5.n
    /* renamed from: clearAllNotifications */
    public void mo28clearAllNotifications() {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new b(null));
    }

    @Override // e5.n
    /* renamed from: getCanRequestPermission */
    public boolean mo29getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // e5.n
    /* renamed from: getPermission */
    public boolean mo30getPermission() {
        return this.permission;
    }

    @Override // t4.e
    public void onFocus(boolean z8) {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new c());
    }

    @Override // w5.InterfaceC5172a
    public void onNotificationPermissionChanged(boolean z8) {
        setPermissionStatusAndFire(z8);
    }

    @Override // t4.e
    public void onUnfocused() {
    }

    @Override // e5.n
    /* renamed from: removeClickListener */
    public void mo31removeClickListener(e5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(listener);
    }

    @Override // e5.n
    /* renamed from: removeForegroundLifecycleListener */
    public void mo32removeForegroundLifecycleListener(j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(listener);
    }

    @Override // e5.n
    /* renamed from: removeGroupedNotifications */
    public void mo33removeGroupedNotifications(String group) {
        kotlin.jvm.internal.h.e(group, "group");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeGroupedNotifications(group: " + group + ')', null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new d(group, null));
    }

    @Override // e5.n
    /* renamed from: removeNotification */
    public void mo34removeNotification(int i) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeNotification(id: " + i + ')', null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new e(i, null));
    }

    @Override // e5.n
    /* renamed from: removePermissionObserver */
    public void mo35removePermissionObserver(o observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removePermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(observer);
    }

    @Override // e5.n
    public Object requestPermission(boolean z8, InterfaceC5133d interfaceC5133d) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        return AbstractC0399y.y(T7.o.f3162a, new f(z8, null), interfaceC5133d);
    }

    public void setPermission(boolean z8) {
        this.permission = z8;
    }
}
