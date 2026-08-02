package com.onesignal.notifications.internal.generation.impl;

import I7.l;
import I7.p;
import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import S7.Y;
import S7.h0;
import S7.s0;
import android.content.Context;
import com.onesignal.common.AndroidUtils;
import org.json.JSONObject;
import u7.v;
import v5.InterfaceC5106b;
import w5.InterfaceC5151a;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a implements InterfaceC5151a {
    private final x4.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final u5.d _dataController;
    private final x5.b _lifecycleService;
    private final InterfaceC5106b _notificationDisplayer;
    private final E5.a _notificationSummaryManager;
    private final K4.a _time;

    /* renamed from: com.onesignal.notifications.internal.generation.impl.a$a, reason: collision with other inner class name */
    public static final class C0230a extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0230a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.markNotificationAsDismissed(null, this);
        }
    }

    public static final class b extends B7.c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.postProcessNotification(null, false, false, this);
        }
    }

    public static final class c extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processCollapseKey(null, this);
        }
    }

    public static final class d extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processHandlerResponse(null, false, false, this);
        }
    }

    public static final class e extends B7.c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    public static final class f extends B7.h implements p {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
        final /* synthetic */ kotlin.jvm.internal.p $wantsToDisplay;
        int label;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$f$a, reason: collision with other inner class name */
        public static final class C0231a extends B7.h implements l {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
            final /* synthetic */ kotlin.jvm.internal.p $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0231a(a aVar, com.onesignal.notifications.internal.f fVar, kotlin.jvm.internal.p pVar, com.onesignal.notifications.internal.c cVar, InterfaceC5240d interfaceC5240d) {
                super(1, interfaceC5240d);
                this.this$0 = aVar;
                this.$notificationReceivedEvent = fVar;
                this.$wantsToDisplay = pVar;
                this.$notification = cVar;
            }

            @Override // B7.a
            public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
                return new C0231a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, interfaceC5240d);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.p pVar;
                A7.a aVar = A7.a.f215n;
                int i = this.label;
                if (i == 0) {
                    Q3.b.s(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.f38642n = false;
                    } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                        kotlin.jvm.internal.p pVar2 = this.$wantsToDisplay;
                        pVar2.f38642n = false;
                        com.onesignal.common.threading.f displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = pVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == aVar) {
                            return aVar;
                        }
                        pVar = pVar2;
                        obj = waitForWake;
                    }
                    return v.f41073a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (kotlin.jvm.internal.p) this.L$0;
                Q3.b.s(obj);
                pVar.f38642n = ((Boolean) obj).booleanValue();
                return v.f41073a;
            }

            @Override // I7.l
            public final Object invoke(InterfaceC5240d interfaceC5240d) {
                return ((C0231a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.notifications.internal.f fVar, kotlin.jvm.internal.p pVar, com.onesignal.notifications.internal.c cVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$notificationReceivedEvent = fVar;
            this.$wantsToDisplay = pVar;
            this.$notification = cVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return a.this.new f(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((f) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                Y launchOnIO = com.onesignal.common.threading.c.launchOnIO(new C0231a(a.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null));
                this.label = 1;
                if (((h0) launchOnIO).I(this) == aVar) {
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
    }

    public static final class g extends B7.h implements p {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
        final /* synthetic */ kotlin.jvm.internal.p $wantsToDisplay;
        int label;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$g$a, reason: collision with other inner class name */
        public static final class C0232a extends B7.h implements l {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
            final /* synthetic */ kotlin.jvm.internal.p $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0232a(a aVar, com.onesignal.notifications.internal.g gVar, kotlin.jvm.internal.p pVar, com.onesignal.notifications.internal.c cVar, InterfaceC5240d interfaceC5240d) {
                super(1, interfaceC5240d);
                this.this$0 = aVar;
                this.$notificationWillDisplayEvent = gVar;
                this.$wantsToDisplay = pVar;
                this.$notification = cVar;
            }

            @Override // B7.a
            public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
                return new C0232a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, interfaceC5240d);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.p pVar;
                A7.a aVar = A7.a.f215n;
                int i = this.label;
                if (i == 0) {
                    Q3.b.s(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.f38642n = false;
                    } else if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        kotlin.jvm.internal.p pVar2 = this.$wantsToDisplay;
                        pVar2.f38642n = false;
                        com.onesignal.common.threading.f displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = pVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == aVar) {
                            return aVar;
                        }
                        pVar = pVar2;
                        obj = waitForWake;
                    }
                    return v.f41073a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (kotlin.jvm.internal.p) this.L$0;
                Q3.b.s(obj);
                pVar.f38642n = ((Boolean) obj).booleanValue();
                return v.f41073a;
            }

            @Override // I7.l
            public final Object invoke(InterfaceC5240d interfaceC5240d) {
                return ((C0232a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.notifications.internal.g gVar, kotlin.jvm.internal.p pVar, com.onesignal.notifications.internal.c cVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$notificationWillDisplayEvent = gVar;
            this.$wantsToDisplay = pVar;
            this.$notification = cVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return a.this.new g(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((g) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                Y launchOnIO = com.onesignal.common.threading.c.launchOnIO(new C0232a(a.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null));
                this.label = 1;
                if (((h0) launchOnIO).I(this) == aVar) {
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
    }

    public static final class h extends B7.c {
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.saveNotification(null, false, this);
        }
    }

    public a(x4.f _applicationService, InterfaceC5106b _notificationDisplayer, com.onesignal.core.internal.config.c _configModelStore, u5.d _dataController, E5.a _notificationSummaryManager, x5.b _lifecycleService, K4.a _time) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_notificationDisplayer, "_notificationDisplayer");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_dataController, "_dataController");
        kotlin.jvm.internal.h.e(_notificationSummaryManager, "_notificationSummaryManager");
        kotlin.jvm.internal.h.e(_lifecycleService, "_lifecycleService");
        kotlin.jvm.internal.h.e(_time, "_time");
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._configModelStore = _configModelStore;
        this._dataController = _dataController;
        this._notificationSummaryManager = _notificationSummaryManager;
        this._lifecycleService = _lifecycleService;
        this._time = _time;
    }

    private final long getEXTERNAL_CALLBACKS_TIMEOUT() {
        return 30000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(com.onesignal.notifications.internal.c cVar, InterfaceC5240d interfaceC5240d) {
        return this._dataController.doesNotificationExist(cVar.getNotificationId(), interfaceC5240d);
    }

    private final boolean isNotificationWithinTTL(com.onesignal.notifications.internal.c cVar) {
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            return cVar.getSentTime() + ((long) cVar.getTtl()) > this._time.getCurrentTimeMillis() / ((long) 1000);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationAsDismissed(t5.d dVar, InterfaceC5240d interfaceC5240d) {
        C0230a c0230a;
        Object obj;
        int i;
        a aVar;
        if (interfaceC5240d instanceof C0230a) {
            c0230a = (C0230a) interfaceC5240d;
            int i4 = c0230a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0230a.label = i4 - Integer.MIN_VALUE;
                obj = c0230a.result;
                A7.a aVar2 = A7.a.f215n;
                i = c0230a.label;
                v vVar = v.f41073a;
                if (i != 0) {
                    Q3.b.s(obj);
                    if (!dVar.isNotificationToDisplay()) {
                        return vVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("Marking restored or disabled notifications as dismissed: " + dVar, null, 2, null);
                    u5.d dVar2 = this._dataController;
                    int androidId = dVar.getAndroidId();
                    c0230a.L$0 = this;
                    c0230a.L$1 = dVar;
                    c0230a.label = 1;
                    obj = dVar2.markAsDismissed(androidId, c0230a);
                    if (obj != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return vVar;
                }
                dVar = (t5.d) c0230a.L$1;
                aVar = (a) c0230a.L$0;
                Q3.b.s(obj);
                if (((Boolean) obj).booleanValue()) {
                    E5.a aVar3 = aVar._notificationSummaryManager;
                    int androidId2 = dVar.getAndroidId();
                    c0230a.L$0 = null;
                    c0230a.L$1 = null;
                    c0230a.label = 2;
                    if (aVar3.updatePossibleDependentSummaryOnDismiss(androidId2, c0230a) == aVar2) {
                        return aVar2;
                    }
                }
                return vVar;
            }
        }
        c0230a = new C0230a(interfaceC5240d);
        obj = c0230a.result;
        A7.a aVar22 = A7.a.f215n;
        i = c0230a.label;
        v vVar2 = v.f41073a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r8.notificationReceived(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r8.markNotificationAsDismissed(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postProcessNotification(t5.d dVar, boolean z6, boolean z9, InterfaceC5240d interfaceC5240d) {
        b bVar;
        int i;
        a aVar;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                A7.a aVar2 = A7.a.f215n;
                i = bVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    bVar.L$0 = this;
                    bVar.L$1 = dVar;
                    bVar.Z$0 = z9;
                    bVar.label = 1;
                    if (saveNotification(dVar, z6, bVar) != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i == 1) {
                    z9 = bVar.Z$0;
                    dVar = (t5.d) bVar.L$1;
                    aVar = (a) bVar.L$0;
                    Q3.b.s(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Q3.b.s(obj);
                        return v.f41073a;
                    }
                    dVar = (t5.d) bVar.L$1;
                    aVar = (a) bVar.L$0;
                    Q3.b.s(obj);
                    x5.b bVar2 = aVar._lifecycleService;
                    bVar.L$0 = null;
                    bVar.L$1 = null;
                    bVar.label = 3;
                }
                if (!z9) {
                    bVar.L$0 = aVar;
                    bVar.L$1 = dVar;
                    bVar.label = 2;
                }
                x5.b bVar22 = aVar._lifecycleService;
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 3;
            }
        }
        bVar = new b(interfaceC5240d);
        Object obj2 = bVar.result;
        A7.a aVar22 = A7.a.f215n;
        i = bVar.label;
        if (i != 0) {
        }
        if (!z9) {
        }
        x5.b bVar222 = aVar._lifecycleService;
        bVar.L$0 = null;
        bVar.L$1 = null;
        bVar.label = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processCollapseKey(t5.d dVar, InterfaceC5240d interfaceC5240d) {
        c cVar;
        int i;
        Integer num;
        if (interfaceC5240d instanceof c) {
            cVar = (c) interfaceC5240d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                A7.a aVar = A7.a.f215n;
                i = cVar.label;
                v vVar = v.f41073a;
                if (i != 0) {
                    Q3.b.s(obj);
                    if (dVar.isRestoring()) {
                        return vVar;
                    }
                    if (dVar.getJsonPayload().has("collapse_key") && !"do_not_collapse".equals(dVar.getJsonPayload().optString("collapse_key"))) {
                        String optString = dVar.getJsonPayload().optString("collapse_key");
                        u5.d dVar2 = this._dataController;
                        kotlin.jvm.internal.h.b(optString);
                        cVar.L$0 = dVar;
                        cVar.label = 1;
                        obj = dVar2.getAndroidIdFromCollapseKey(optString, cVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return vVar;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (t5.d) cVar.L$0;
                Q3.b.s(obj);
                num = (Integer) obj;
                if (num != null) {
                    dVar.getNotification().setAndroidNotificationId(num.intValue());
                }
                return vVar;
            }
        }
        cVar = new c(interfaceC5240d);
        Object obj2 = cVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = cVar.label;
        v vVar2 = v.f41073a;
        if (i != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processHandlerResponse(t5.d dVar, boolean z6, boolean z9, InterfaceC5240d interfaceC5240d) {
        d dVar2;
        int i;
        a aVar;
        if (interfaceC5240d instanceof d) {
            dVar2 = (d) interfaceC5240d;
            int i4 = dVar2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i4 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                A7.a aVar2 = A7.a.f215n;
                i = dVar2.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    if (z6) {
                        boolean isStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getNotification().getBody());
                        boolean isNotificationWithinTTL = isNotificationWithinTTL(dVar.getNotification());
                        if (isStringNotEmpty && isNotificationWithinTTL) {
                            dVar2.L$0 = this;
                            dVar2.L$1 = dVar;
                            dVar2.label = 1;
                            if (processCollapseKey(dVar, dVar2) != aVar2) {
                                aVar = this;
                            }
                            return aVar2;
                        }
                    }
                    if (z9) {
                        dVar2.label = 2;
                        if (markNotificationAsDismissed(dVar, dVar2) != aVar2) {
                            return null;
                        }
                    } else {
                        dVar.setNotificationToDisplay(false);
                        dVar2.label = 3;
                        if (postProcessNotification(dVar, true, false, dVar2) != aVar2) {
                            return null;
                        }
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return null;
                }
                dVar = (t5.d) dVar2.L$1;
                aVar = (a) dVar2.L$0;
                Q3.b.s(obj);
                if (aVar.shouldDisplayNotification(dVar)) {
                    return Boolean.FALSE;
                }
                dVar.setNotificationToDisplay(true);
                return Boolean.TRUE;
            }
        }
        dVar2 = new d(interfaceC5240d);
        Object obj2 = dVar2.result;
        A7.a aVar22 = A7.a.f215n;
        i = dVar2.label;
        if (i != 0) {
        }
        if (aVar.shouldDisplayNotification(dVar)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(9:16|17|(1:33)(1:21)|22|(1:24)(1:32)|25|(1:27)(1:31)|28|(1:30))|11|12))|36|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveNotification(t5.d dVar, boolean z6, InterfaceC5240d interfaceC5240d) {
        h hVar;
        int i;
        if (interfaceC5240d instanceof h) {
            hVar = (h) interfaceC5240d;
            int i4 = hVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.label = i4 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                A7.a aVar = A7.a.f215n;
                i = hVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("Saving Notification job: " + dVar, null, 2, null);
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                    String optString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                    long optLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + jsonPayload.optInt("google.ttl", 259200);
                    u5.d dVar2 = this._dataController;
                    String optString2 = customJSONObject.optString("i");
                    kotlin.jvm.internal.h.d(optString2, "optString(...)");
                    String safeString = com.onesignal.common.e.safeString(jsonPayload, "grp");
                    boolean isNotificationToDisplay = dVar.isNotificationToDisplay();
                    int androidId = dVar.getAndroidId();
                    String valueOf = dVar.getTitle() != null ? String.valueOf(dVar.getTitle()) : null;
                    String valueOf2 = dVar.getBody() != null ? String.valueOf(dVar.getBody()) : null;
                    String jSONObject = jsonPayload.toString();
                    kotlin.jvm.internal.h.d(jSONObject, "toString(...)");
                    hVar.label = 1;
                    if (dVar2.createNotification(optString2, safeString, optString, isNotificationToDisplay, z6, androidId, valueOf, valueOf2, optLong, jSONObject, hVar) == aVar) {
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
        }
        hVar = new h(interfaceC5240d);
        Object obj2 = hVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = hVar.label;
        if (i != 0) {
        }
        return v.f41073a;
    }

    private final boolean shouldDisplayNotification(t5.d dVar) {
        return dVar.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(t5.d dVar) {
        if (!this._applicationService.isInForeground()) {
            com.onesignal.debug.internal.logging.b.info$default("App is in background, show notification", null, 2, null);
            return false;
        }
        if (!dVar.isRestoring()) {
            return true;
        }
        com.onesignal.debug.internal.logging.b.info$default("Not firing notificationWillShowInForegroundHandler for restored notifications", null, 2, null);
        return false;
    }

    public final JSONObject getCustomJSONObject(JSONObject jsonObject) {
        kotlin.jvm.internal.h.e(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString("custom"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0319, code lost:
    
        if (r13.postProcessNotification(r7, false, r10, r3) == r4) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02bb, code lost:
    
        if (r10 == r4) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // w5.InterfaceC5151a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i, JSONObject jSONObject, boolean z6, long j6, InterfaceC5240d interfaceC5240d) {
        e eVar;
        int i4;
        boolean z9;
        a aVar;
        long j9;
        Context context2;
        int i6;
        com.onesignal.notifications.internal.c cVar;
        JSONObject jSONObject2;
        boolean z10;
        long j10;
        Context context3;
        a aVar2;
        com.onesignal.notifications.internal.c cVar2;
        kotlin.jvm.internal.p pVar;
        a aVar3;
        t5.d dVar;
        int i9;
        com.onesignal.notifications.internal.f fVar;
        long external_callbacks_timeout;
        com.onesignal.notifications.internal.c cVar3;
        f fVar2;
        int i10;
        kotlin.jvm.internal.p pVar2;
        Object processHandlerResponse;
        boolean z11;
        a aVar4;
        t5.d dVar2;
        com.onesignal.notifications.internal.c cVar4;
        int i11;
        Boolean bool;
        boolean booleanValue;
        int i12;
        t5.d dVar3;
        a aVar5;
        kotlin.jvm.internal.p pVar3;
        t5.d dVar4;
        long external_callbacks_timeout2;
        g gVar;
        int i13;
        int i14;
        boolean z12;
        t5.d dVar5;
        a aVar6;
        Object processHandlerResponse2;
        boolean z13;
        Object obj;
        int i15;
        Object obj2;
        JSONObject jSONObject3 = jSONObject;
        if (interfaceC5240d instanceof e) {
            eVar = (e) interfaceC5240d;
            int i16 = eVar.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                eVar.label = i16 - Integer.MIN_VALUE;
                Object obj3 = eVar.result;
                A7.a aVar7 = A7.a.f215n;
                i4 = eVar.label;
                v vVar = v.f41073a;
                switch (i4) {
                    case 0:
                        Q3.b.s(obj3);
                        x5.b bVar = this._lifecycleService;
                        eVar.L$0 = this;
                        eVar.L$1 = context;
                        eVar.L$2 = jSONObject3;
                        eVar.I$0 = i;
                        z9 = z6;
                        eVar.Z$0 = z9;
                        eVar.J$0 = j6;
                        eVar.label = 1;
                        obj3 = bVar.canReceiveNotification(jSONObject3, eVar);
                        if (obj3 != aVar7) {
                            aVar = this;
                            j9 = j6;
                            context2 = context;
                            i6 = i;
                            if (((Boolean) obj3).booleanValue()) {
                                com.onesignal.notifications.internal.c cVar5 = new com.onesignal.notifications.internal.c(null, jSONObject3, i6, aVar._time);
                                if (!z9) {
                                    eVar.L$0 = aVar;
                                    eVar.L$1 = context2;
                                    eVar.L$2 = jSONObject3;
                                    eVar.L$3 = cVar5;
                                    eVar.Z$0 = z9;
                                    eVar.J$0 = j9;
                                    eVar.label = 2;
                                    obj3 = aVar.isDuplicateNotification(cVar5, eVar);
                                    if (obj3 != aVar7) {
                                        cVar = cVar5;
                                        Context context4 = context2;
                                        jSONObject2 = jSONObject3;
                                        z10 = z9;
                                        j10 = j9;
                                        context3 = context4;
                                        if (!((Boolean) obj3).booleanValue()) {
                                            long j11 = j10;
                                            z9 = z10;
                                            jSONObject3 = jSONObject2;
                                            context2 = context3;
                                            j9 = j11;
                                            cVar5 = cVar;
                                        }
                                    }
                                }
                                t5.d dVar6 = new t5.d(cVar5, jSONObject3);
                                dVar6.setShownTimeStamp(new Long(j9));
                                dVar6.setRestoring(z9);
                                kotlin.jvm.internal.p pVar4 = new kotlin.jvm.internal.p();
                                pVar4.f38642n = true;
                                com.onesignal.debug.internal.logging.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                                a aVar8 = aVar;
                                try {
                                    fVar = new com.onesignal.notifications.internal.f(context2, cVar5);
                                    aVar2 = aVar8;
                                    try {
                                        external_callbacks_timeout = aVar2.getEXTERNAL_CALLBACKS_TIMEOUT();
                                        cVar3 = cVar5;
                                        try {
                                        } catch (s0 e9) {
                                            e = e9;
                                            pVar = pVar4;
                                        } catch (Throwable th) {
                                            th = th;
                                            pVar = pVar4;
                                        }
                                    } catch (s0 e10) {
                                        e = e10;
                                        cVar2 = cVar5;
                                        pVar = pVar4;
                                        aVar3 = aVar2;
                                        dVar = dVar6;
                                        i9 = 0;
                                        com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + pVar.f38642n + '.', e);
                                        i10 = i9;
                                        boolean z14 = z9;
                                        pVar2 = pVar;
                                        a aVar9 = aVar3;
                                        boolean z15 = pVar2.f38642n;
                                        eVar.L$0 = aVar9;
                                        eVar.L$1 = cVar2;
                                        eVar.L$2 = dVar;
                                        eVar.L$3 = pVar2;
                                        eVar.Z$0 = z14;
                                        eVar.I$0 = i10 == true ? 1 : 0;
                                        eVar.label = 4;
                                        processHandlerResponse = aVar9.processHandlerResponse(dVar, z15, z14, eVar);
                                        if (processHandlerResponse != aVar7) {
                                        }
                                        return aVar7;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cVar2 = cVar5;
                                        pVar = pVar4;
                                        aVar3 = aVar2;
                                        dVar = dVar6;
                                        i9 = 0;
                                        com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                        i10 = i9;
                                        boolean z142 = z9;
                                        pVar2 = pVar;
                                        a aVar92 = aVar3;
                                        boolean z152 = pVar2.f38642n;
                                        eVar.L$0 = aVar92;
                                        eVar.L$1 = cVar2;
                                        eVar.L$2 = dVar;
                                        eVar.L$3 = pVar2;
                                        eVar.Z$0 = z142;
                                        eVar.I$0 = i10 == true ? 1 : 0;
                                        eVar.label = 4;
                                        processHandlerResponse = aVar92.processHandlerResponse(dVar, z152, z142, eVar);
                                        if (processHandlerResponse != aVar7) {
                                        }
                                        return aVar7;
                                    }
                                } catch (s0 e11) {
                                    e = e11;
                                    aVar2 = aVar8;
                                } catch (Throwable th3) {
                                    th = th3;
                                    aVar2 = aVar8;
                                }
                                try {
                                    fVar2 = aVar2.new f(fVar, pVar4, cVar3, null);
                                    pVar = pVar4;
                                    cVar2 = cVar3;
                                    try {
                                        eVar.L$0 = aVar2;
                                        eVar.L$1 = cVar2;
                                        eVar.L$2 = dVar6;
                                        eVar.L$3 = pVar;
                                        eVar.Z$0 = z9;
                                        eVar.I$0 = 0;
                                        eVar.label = 3;
                                    } catch (s0 e12) {
                                        e = e12;
                                        aVar3 = aVar2;
                                        dVar = dVar6;
                                        i9 = 0;
                                        com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + pVar.f38642n + '.', e);
                                        i10 = i9;
                                        boolean z1422 = z9;
                                        pVar2 = pVar;
                                        a aVar922 = aVar3;
                                        boolean z1522 = pVar2.f38642n;
                                        eVar.L$0 = aVar922;
                                        eVar.L$1 = cVar2;
                                        eVar.L$2 = dVar;
                                        eVar.L$3 = pVar2;
                                        eVar.Z$0 = z1422;
                                        eVar.I$0 = i10 == true ? 1 : 0;
                                        eVar.label = 4;
                                        processHandlerResponse = aVar922.processHandlerResponse(dVar, z1522, z1422, eVar);
                                        if (processHandlerResponse != aVar7) {
                                        }
                                        return aVar7;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        aVar3 = aVar2;
                                        dVar = dVar6;
                                        i9 = 0;
                                        com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                        i10 = i9;
                                        boolean z14222 = z9;
                                        pVar2 = pVar;
                                        a aVar9222 = aVar3;
                                        boolean z15222 = pVar2.f38642n;
                                        eVar.L$0 = aVar9222;
                                        eVar.L$1 = cVar2;
                                        eVar.L$2 = dVar;
                                        eVar.L$3 = pVar2;
                                        eVar.Z$0 = z14222;
                                        eVar.I$0 = i10 == true ? 1 : 0;
                                        eVar.label = 4;
                                        processHandlerResponse = aVar9222.processHandlerResponse(dVar, z15222, z14222, eVar);
                                        if (processHandlerResponse != aVar7) {
                                        }
                                        return aVar7;
                                    }
                                } catch (s0 e13) {
                                    e = e13;
                                    pVar = pVar4;
                                    cVar2 = cVar3;
                                    aVar3 = aVar2;
                                    dVar = dVar6;
                                    i9 = 0;
                                    com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + pVar.f38642n + '.', e);
                                    i10 = i9;
                                    boolean z142222 = z9;
                                    pVar2 = pVar;
                                    a aVar92222 = aVar3;
                                    boolean z152222 = pVar2.f38642n;
                                    eVar.L$0 = aVar92222;
                                    eVar.L$1 = cVar2;
                                    eVar.L$2 = dVar;
                                    eVar.L$3 = pVar2;
                                    eVar.Z$0 = z142222;
                                    eVar.I$0 = i10 == true ? 1 : 0;
                                    eVar.label = 4;
                                    processHandlerResponse = aVar92222.processHandlerResponse(dVar, z152222, z142222, eVar);
                                    if (processHandlerResponse != aVar7) {
                                    }
                                    return aVar7;
                                } catch (Throwable th5) {
                                    th = th5;
                                    pVar = pVar4;
                                    cVar2 = cVar3;
                                    aVar3 = aVar2;
                                    dVar = dVar6;
                                    i9 = 0;
                                    com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                    i10 = i9;
                                    boolean z1422222 = z9;
                                    pVar2 = pVar;
                                    a aVar922222 = aVar3;
                                    boolean z1522222 = pVar2.f38642n;
                                    eVar.L$0 = aVar922222;
                                    eVar.L$1 = cVar2;
                                    eVar.L$2 = dVar;
                                    eVar.L$3 = pVar2;
                                    eVar.Z$0 = z1422222;
                                    eVar.I$0 = i10 == true ? 1 : 0;
                                    eVar.label = 4;
                                    processHandlerResponse = aVar922222.processHandlerResponse(dVar, z1522222, z1422222, eVar);
                                    if (processHandlerResponse != aVar7) {
                                    }
                                    return aVar7;
                                }
                                if (AbstractC0410y.z(external_callbacks_timeout, fVar2, eVar) != aVar7) {
                                    aVar3 = aVar2;
                                    dVar = dVar6;
                                    i10 = 0;
                                    boolean z14222222 = z9;
                                    pVar2 = pVar;
                                    a aVar9222222 = aVar3;
                                    boolean z15222222 = pVar2.f38642n;
                                    eVar.L$0 = aVar9222222;
                                    eVar.L$1 = cVar2;
                                    eVar.L$2 = dVar;
                                    eVar.L$3 = pVar2;
                                    eVar.Z$0 = z14222222;
                                    eVar.I$0 = i10 == true ? 1 : 0;
                                    eVar.label = 4;
                                    processHandlerResponse = aVar9222222.processHandlerResponse(dVar, z15222222, z14222222, eVar);
                                    if (processHandlerResponse != aVar7) {
                                        z11 = z14222222;
                                        aVar4 = aVar9222222;
                                        dVar2 = dVar;
                                        cVar4 = cVar2;
                                        i11 = i10;
                                        kotlin.jvm.internal.p pVar5 = pVar2;
                                        bool = (Boolean) processHandlerResponse;
                                        if (bool != null) {
                                            booleanValue = bool.booleanValue();
                                            int i17 = i11;
                                            if (booleanValue) {
                                                if (aVar4.shouldFireForegroundHandlers(dVar2)) {
                                                    com.onesignal.debug.internal.logging.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                                    pVar5.f38642n = true;
                                                    try {
                                                        com.onesignal.notifications.internal.g gVar2 = new com.onesignal.notifications.internal.g(dVar2.getNotification());
                                                        external_callbacks_timeout2 = aVar4.getEXTERNAL_CALLBACKS_TIMEOUT();
                                                        gVar = aVar4.new g(gVar2, pVar5, cVar4, null);
                                                        eVar.L$0 = aVar4;
                                                        eVar.L$1 = dVar2;
                                                        eVar.L$2 = pVar5;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z11;
                                                        eVar.I$0 = i11;
                                                        eVar.label = 5;
                                                    } catch (s0 e14) {
                                                        e = e14;
                                                        aVar5 = aVar4;
                                                        pVar3 = pVar5;
                                                        dVar4 = dVar2;
                                                        com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + pVar3.f38642n + '.', e);
                                                        i13 = i11;
                                                        i14 = i13;
                                                        z12 = z11;
                                                        dVar5 = dVar4;
                                                        aVar6 = aVar5;
                                                        boolean z16 = pVar3.f38642n;
                                                        eVar.L$0 = aVar6;
                                                        eVar.L$1 = dVar5;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z12;
                                                        eVar.I$0 = i14;
                                                        eVar.label = 6;
                                                        processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z16, z12, eVar);
                                                        break;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        aVar5 = aVar4;
                                                        pVar3 = pVar5;
                                                        dVar4 = dVar2;
                                                        com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                                                        i13 = i11;
                                                        i14 = i13;
                                                        z12 = z11;
                                                        dVar5 = dVar4;
                                                        aVar6 = aVar5;
                                                        boolean z162 = pVar3.f38642n;
                                                        eVar.L$0 = aVar6;
                                                        eVar.L$1 = dVar5;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z12;
                                                        eVar.I$0 = i14;
                                                        eVar.label = 6;
                                                        processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z162, z12, eVar);
                                                    }
                                                    if (AbstractC0410y.z(external_callbacks_timeout2, gVar, eVar) != aVar7) {
                                                        aVar5 = aVar4;
                                                        pVar3 = pVar5;
                                                        dVar4 = dVar2;
                                                        i13 = i11;
                                                        i14 = i13;
                                                        z12 = z11;
                                                        dVar5 = dVar4;
                                                        aVar6 = aVar5;
                                                        boolean z1622 = pVar3.f38642n;
                                                        eVar.L$0 = aVar6;
                                                        eVar.L$1 = dVar5;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z12;
                                                        eVar.I$0 = i14;
                                                        eVar.label = 6;
                                                        processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z1622, z12, eVar);
                                                    }
                                                } else {
                                                    t5.d dVar7 = dVar2;
                                                    i12 = i11;
                                                    dVar3 = dVar7;
                                                    if (booleanValue) {
                                                        int i18 = i12;
                                                        dVar2 = dVar3;
                                                        i17 = i18;
                                                    } else {
                                                        InterfaceC5106b interfaceC5106b = aVar4._notificationDisplayer;
                                                        eVar.L$0 = aVar4;
                                                        eVar.L$1 = dVar3;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z11;
                                                        eVar.label = 7;
                                                        Object displayNotification = interfaceC5106b.displayNotification(dVar3, eVar);
                                                        if (displayNotification != aVar7) {
                                                            dVar2 = dVar3;
                                                            obj = displayNotification;
                                                            z13 = z11;
                                                            i15 = ((Boolean) obj).booleanValue();
                                                            if (!dVar2.isRestoring()) {
                                                                boolean z17 = i15 != 0;
                                                                obj2 = null;
                                                                eVar.L$0 = null;
                                                                eVar.L$1 = null;
                                                                eVar.L$2 = null;
                                                                eVar.L$3 = null;
                                                                eVar.Z$0 = z13;
                                                                eVar.label = 8;
                                                                break;
                                                            } else {
                                                                obj2 = null;
                                                            }
                                                            if (z13) {
                                                                eVar.L$0 = obj2;
                                                                eVar.L$1 = obj2;
                                                                eVar.L$2 = obj2;
                                                                eVar.L$3 = obj2;
                                                                eVar.label = 9;
                                                                if (AbstractC0410y.f(100L, eVar) == aVar7) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z13 = z11;
                                            i15 = i17;
                                            if (!dVar2.isRestoring()) {
                                            }
                                            if (z13) {
                                            }
                                        }
                                    }
                                }
                            }
                            return vVar;
                        }
                        return aVar7;
                    case 1:
                        long j12 = eVar.J$0;
                        boolean z18 = eVar.Z$0;
                        i6 = eVar.I$0;
                        JSONObject jSONObject4 = (JSONObject) eVar.L$2;
                        context2 = (Context) eVar.L$1;
                        aVar = (a) eVar.L$0;
                        Q3.b.s(obj3);
                        j9 = j12;
                        z9 = z18;
                        jSONObject3 = jSONObject4;
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        return vVar;
                    case 2:
                        j10 = eVar.J$0;
                        z10 = eVar.Z$0;
                        cVar = (com.onesignal.notifications.internal.c) eVar.L$3;
                        jSONObject2 = (JSONObject) eVar.L$2;
                        Context context5 = (Context) eVar.L$1;
                        a aVar10 = (a) eVar.L$0;
                        Q3.b.s(obj3);
                        context3 = context5;
                        aVar = aVar10;
                        if (!((Boolean) obj3).booleanValue()) {
                        }
                        return vVar;
                    case 3:
                        i9 = eVar.I$0;
                        z9 = eVar.Z$0;
                        pVar = (kotlin.jvm.internal.p) eVar.L$3;
                        dVar = (t5.d) eVar.L$2;
                        cVar2 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        aVar3 = (a) eVar.L$0;
                        try {
                            Q3.b.s(obj3);
                            i10 = i9;
                        } catch (s0 e15) {
                            e = e15;
                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + pVar.f38642n + '.', e);
                            i10 = i9;
                            boolean z142222222 = z9;
                            pVar2 = pVar;
                            a aVar92222222 = aVar3;
                            boolean z152222222 = pVar2.f38642n;
                            eVar.L$0 = aVar92222222;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar;
                            eVar.L$3 = pVar2;
                            eVar.Z$0 = z142222222;
                            eVar.I$0 = i10 == true ? 1 : 0;
                            eVar.label = 4;
                            processHandlerResponse = aVar92222222.processHandlerResponse(dVar, z152222222, z142222222, eVar);
                            if (processHandlerResponse != aVar7) {
                            }
                            return aVar7;
                        } catch (Throwable th7) {
                            th = th7;
                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                            i10 = i9;
                            boolean z1422222222 = z9;
                            pVar2 = pVar;
                            a aVar922222222 = aVar3;
                            boolean z1522222222 = pVar2.f38642n;
                            eVar.L$0 = aVar922222222;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar;
                            eVar.L$3 = pVar2;
                            eVar.Z$0 = z1422222222;
                            eVar.I$0 = i10 == true ? 1 : 0;
                            eVar.label = 4;
                            processHandlerResponse = aVar922222222.processHandlerResponse(dVar, z1522222222, z1422222222, eVar);
                            if (processHandlerResponse != aVar7) {
                            }
                            return aVar7;
                        }
                        boolean z14222222222 = z9;
                        pVar2 = pVar;
                        a aVar9222222222 = aVar3;
                        boolean z15222222222 = pVar2.f38642n;
                        eVar.L$0 = aVar9222222222;
                        eVar.L$1 = cVar2;
                        eVar.L$2 = dVar;
                        eVar.L$3 = pVar2;
                        eVar.Z$0 = z14222222222;
                        eVar.I$0 = i10 == true ? 1 : 0;
                        eVar.label = 4;
                        processHandlerResponse = aVar9222222222.processHandlerResponse(dVar, z15222222222, z14222222222, eVar);
                        if (processHandlerResponse != aVar7) {
                        }
                        return aVar7;
                    case 4:
                        int i19 = eVar.I$0;
                        boolean z19 = eVar.Z$0;
                        pVar2 = (kotlin.jvm.internal.p) eVar.L$3;
                        t5.d dVar8 = (t5.d) eVar.L$2;
                        com.onesignal.notifications.internal.c cVar6 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        a aVar11 = (a) eVar.L$0;
                        Q3.b.s(obj3);
                        processHandlerResponse = obj3;
                        z11 = z19;
                        dVar2 = dVar8;
                        cVar4 = cVar6;
                        aVar4 = aVar11;
                        i11 = i19;
                        kotlin.jvm.internal.p pVar52 = pVar2;
                        bool = (Boolean) processHandlerResponse;
                        if (bool != null) {
                        }
                        return vVar;
                    case 5:
                        i11 = eVar.I$0;
                        z11 = eVar.Z$0;
                        pVar3 = (kotlin.jvm.internal.p) eVar.L$2;
                        dVar4 = (t5.d) eVar.L$1;
                        aVar5 = (a) eVar.L$0;
                        try {
                            Q3.b.s(obj3);
                            i13 = i11;
                        } catch (s0 e16) {
                            e = e16;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + pVar3.f38642n + '.', e);
                            i13 = i11;
                            i14 = i13;
                            z12 = z11;
                            dVar5 = dVar4;
                            aVar6 = aVar5;
                            boolean z16222 = pVar3.f38642n;
                            eVar.L$0 = aVar6;
                            eVar.L$1 = dVar5;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z12;
                            eVar.I$0 = i14;
                            eVar.label = 6;
                            processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z16222, z12, eVar);
                            break;
                        } catch (Throwable th8) {
                            th = th8;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                            i13 = i11;
                            i14 = i13;
                            z12 = z11;
                            dVar5 = dVar4;
                            aVar6 = aVar5;
                            boolean z162222 = pVar3.f38642n;
                            eVar.L$0 = aVar6;
                            eVar.L$1 = dVar5;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z12;
                            eVar.I$0 = i14;
                            eVar.label = 6;
                            processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z162222, z12, eVar);
                        }
                        i14 = i13;
                        z12 = z11;
                        dVar5 = dVar4;
                        aVar6 = aVar5;
                        boolean z1622222 = pVar3.f38642n;
                        eVar.L$0 = aVar6;
                        eVar.L$1 = dVar5;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.Z$0 = z12;
                        eVar.I$0 = i14;
                        eVar.label = 6;
                        processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z1622222, z12, eVar);
                    case 6:
                        i14 = eVar.I$0;
                        z12 = eVar.Z$0;
                        dVar5 = (t5.d) eVar.L$1;
                        aVar6 = (a) eVar.L$0;
                        Q3.b.s(obj3);
                        processHandlerResponse2 = obj3;
                        Boolean bool2 = (Boolean) processHandlerResponse2;
                        if (bool2 != null) {
                            aVar4 = aVar6;
                            z11 = z12;
                            dVar3 = dVar5;
                            i12 = i14;
                            booleanValue = bool2.booleanValue();
                            if (booleanValue) {
                            }
                        }
                        return vVar;
                    case 7:
                        z13 = eVar.Z$0;
                        t5.d dVar9 = (t5.d) eVar.L$1;
                        a aVar12 = (a) eVar.L$0;
                        Q3.b.s(obj3);
                        aVar4 = aVar12;
                        dVar2 = dVar9;
                        obj = obj3;
                        i15 = ((Boolean) obj).booleanValue();
                        if (!dVar2.isRestoring()) {
                        }
                        if (z13) {
                        }
                        return vVar;
                    case 8:
                        z13 = eVar.Z$0;
                        Q3.b.s(obj3);
                        obj2 = null;
                        if (z13) {
                        }
                        return vVar;
                    case 9:
                        Q3.b.s(obj3);
                        return vVar;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new e(interfaceC5240d);
        Object obj32 = eVar.result;
        A7.a aVar72 = A7.a.f215n;
        i4 = eVar.label;
        v vVar2 = v.f41073a;
        switch (i4) {
        }
    }
}
