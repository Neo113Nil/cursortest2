package com.onesignal.notifications.internal.generation.impl;

import E7.l;
import E7.p;
import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import O7.Y;
import O7.h0;
import O7.s0;
import android.content.Context;
import com.onesignal.common.AndroidUtils;
import org.json.JSONObject;
import q7.v;
import r5.InterfaceC4966b;
import s5.InterfaceC4999a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a implements InterfaceC4999a {
    private final t4.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final q5.d _dataController;
    private final t5.b _lifecycleService;
    private final InterfaceC4966b _notificationDisplayer;
    private final A5.a _notificationSummaryManager;
    private final G4.a _time;

    /* renamed from: com.onesignal.notifications.internal.generation.impl.a$a, reason: collision with other inner class name */
    public static final class C0229a extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0229a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.markNotificationAsDismissed(null, this);
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.postProcessNotification(null, false, false, this);
        }
    }

    public static final class c extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processCollapseKey(null, this);
        }
    }

    public static final class d extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processHandlerResponse(null, false, false, this);
        }
    }

    public static final class e extends AbstractC5219c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    public static final class f extends x7.h implements p {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
        final /* synthetic */ kotlin.jvm.internal.p $wantsToDisplay;
        int label;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$f$a, reason: collision with other inner class name */
        public static final class C0230a extends x7.h implements l {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
            final /* synthetic */ kotlin.jvm.internal.p $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0230a(a aVar, com.onesignal.notifications.internal.f fVar, kotlin.jvm.internal.p pVar, com.onesignal.notifications.internal.c cVar, InterfaceC5133d interfaceC5133d) {
                super(1, interfaceC5133d);
                this.this$0 = aVar;
                this.$notificationReceivedEvent = fVar;
                this.$wantsToDisplay = pVar;
                this.$notification = cVar;
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
                return new C0230a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, interfaceC5133d);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.p pVar;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                int i = this.label;
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.f38859n = false;
                    } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                        kotlin.jvm.internal.p pVar2 = this.$wantsToDisplay;
                        pVar2.f38859n = false;
                        com.onesignal.common.threading.f displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = pVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == enumC5179a) {
                            return enumC5179a;
                        }
                        pVar = pVar2;
                        obj = waitForWake;
                    }
                    return v.f40183a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.f.r(obj);
                pVar.f38859n = ((Boolean) obj).booleanValue();
                return v.f40183a;
            }

            @Override // E7.l
            public final Object invoke(InterfaceC5133d interfaceC5133d) {
                return ((C0230a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.notifications.internal.f fVar, kotlin.jvm.internal.p pVar, com.onesignal.notifications.internal.c cVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$notificationReceivedEvent = fVar;
            this.$wantsToDisplay = pVar;
            this.$notification = cVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return a.this.new f(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((f) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                Y launchOnIO = com.onesignal.common.threading.c.launchOnIO(new C0230a(a.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null));
                this.label = 1;
                if (((h0) launchOnIO).I(this) == enumC5179a) {
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
    }

    public static final class g extends x7.h implements p {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
        final /* synthetic */ kotlin.jvm.internal.p $wantsToDisplay;
        int label;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$g$a, reason: collision with other inner class name */
        public static final class C0231a extends x7.h implements l {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
            final /* synthetic */ kotlin.jvm.internal.p $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0231a(a aVar, com.onesignal.notifications.internal.g gVar, kotlin.jvm.internal.p pVar, com.onesignal.notifications.internal.c cVar, InterfaceC5133d interfaceC5133d) {
                super(1, interfaceC5133d);
                this.this$0 = aVar;
                this.$notificationWillDisplayEvent = gVar;
                this.$wantsToDisplay = pVar;
                this.$notification = cVar;
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
                return new C0231a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, interfaceC5133d);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.p pVar;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                int i = this.label;
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.f38859n = false;
                    } else if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        kotlin.jvm.internal.p pVar2 = this.$wantsToDisplay;
                        pVar2.f38859n = false;
                        com.onesignal.common.threading.f displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = pVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == enumC5179a) {
                            return enumC5179a;
                        }
                        pVar = pVar2;
                        obj = waitForWake;
                    }
                    return v.f40183a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.f.r(obj);
                pVar.f38859n = ((Boolean) obj).booleanValue();
                return v.f40183a;
            }

            @Override // E7.l
            public final Object invoke(InterfaceC5133d interfaceC5133d) {
                return ((C0231a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.notifications.internal.g gVar, kotlin.jvm.internal.p pVar, com.onesignal.notifications.internal.c cVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$notificationWillDisplayEvent = gVar;
            this.$wantsToDisplay = pVar;
            this.$notification = cVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return a.this.new g(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((g) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                Y launchOnIO = com.onesignal.common.threading.c.launchOnIO(new C0231a(a.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null));
                this.label = 1;
                if (((h0) launchOnIO).I(this) == enumC5179a) {
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
    }

    public static final class h extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.saveNotification(null, false, this);
        }
    }

    public a(t4.f _applicationService, InterfaceC4966b _notificationDisplayer, com.onesignal.core.internal.config.c _configModelStore, q5.d _dataController, A5.a _notificationSummaryManager, t5.b _lifecycleService, G4.a _time) {
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
    public final Object isDuplicateNotification(com.onesignal.notifications.internal.c cVar, InterfaceC5133d interfaceC5133d) {
        return this._dataController.doesNotificationExist(cVar.getNotificationId(), interfaceC5133d);
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
    public final Object markNotificationAsDismissed(p5.d dVar, InterfaceC5133d interfaceC5133d) {
        C0229a c0229a;
        Object obj;
        int i;
        a aVar;
        if (interfaceC5133d instanceof C0229a) {
            c0229a = (C0229a) interfaceC5133d;
            int i4 = c0229a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0229a.label = i4 - Integer.MIN_VALUE;
                obj = c0229a.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0229a.label;
                v vVar = v.f40183a;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    if (!dVar.isNotificationToDisplay()) {
                        return vVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("Marking restored or disabled notifications as dismissed: " + dVar, null, 2, null);
                    q5.d dVar2 = this._dataController;
                    int androidId = dVar.getAndroidId();
                    c0229a.L$0 = this;
                    c0229a.L$1 = dVar;
                    c0229a.label = 1;
                    obj = dVar2.markAsDismissed(androidId, c0229a);
                    if (obj != enumC5179a) {
                        aVar = this;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return vVar;
                }
                dVar = (p5.d) c0229a.L$1;
                aVar = (a) c0229a.L$0;
                com.bumptech.glide.f.r(obj);
                if (((Boolean) obj).booleanValue()) {
                    A5.a aVar2 = aVar._notificationSummaryManager;
                    int androidId2 = dVar.getAndroidId();
                    c0229a.L$0 = null;
                    c0229a.L$1 = null;
                    c0229a.label = 2;
                    if (aVar2.updatePossibleDependentSummaryOnDismiss(androidId2, c0229a) == enumC5179a) {
                        return enumC5179a;
                    }
                }
                return vVar;
            }
        }
        c0229a = new C0229a(interfaceC5133d);
        obj = c0229a.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0229a.label;
        v vVar2 = v.f40183a;
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
    public final Object postProcessNotification(p5.d dVar, boolean z8, boolean z9, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        a aVar;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    bVar.L$0 = this;
                    bVar.L$1 = dVar;
                    bVar.Z$0 = z9;
                    bVar.label = 1;
                    if (saveNotification(dVar, z8, bVar) != enumC5179a) {
                        aVar = this;
                    }
                    return enumC5179a;
                }
                if (i == 1) {
                    z9 = bVar.Z$0;
                    dVar = (p5.d) bVar.L$1;
                    aVar = (a) bVar.L$0;
                    com.bumptech.glide.f.r(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.f.r(obj);
                        return v.f40183a;
                    }
                    dVar = (p5.d) bVar.L$1;
                    aVar = (a) bVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    t5.b bVar2 = aVar._lifecycleService;
                    bVar.L$0 = null;
                    bVar.L$1 = null;
                    bVar.label = 3;
                }
                if (!z9) {
                    bVar.L$0 = aVar;
                    bVar.L$1 = dVar;
                    bVar.label = 2;
                }
                t5.b bVar22 = aVar._lifecycleService;
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 3;
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
        if (i != 0) {
        }
        if (!z9) {
        }
        t5.b bVar222 = aVar._lifecycleService;
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
    public final Object processCollapseKey(p5.d dVar, InterfaceC5133d interfaceC5133d) {
        c cVar;
        int i;
        Integer num;
        if (interfaceC5133d instanceof c) {
            cVar = (c) interfaceC5133d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = cVar.label;
                v vVar = v.f40183a;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    if (dVar.isRestoring()) {
                        return vVar;
                    }
                    if (dVar.getJsonPayload().has("collapse_key") && !"do_not_collapse".equals(dVar.getJsonPayload().optString("collapse_key"))) {
                        String optString = dVar.getJsonPayload().optString("collapse_key");
                        q5.d dVar2 = this._dataController;
                        kotlin.jvm.internal.h.b(optString);
                        cVar.L$0 = dVar;
                        cVar.label = 1;
                        obj = dVar2.getAndroidIdFromCollapseKey(optString, cVar);
                        if (obj == enumC5179a) {
                            return enumC5179a;
                        }
                    }
                    return vVar;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (p5.d) cVar.L$0;
                com.bumptech.glide.f.r(obj);
                num = (Integer) obj;
                if (num != null) {
                    dVar.getNotification().setAndroidNotificationId(num.intValue());
                }
                return vVar;
            }
        }
        cVar = new c(interfaceC5133d);
        Object obj2 = cVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = cVar.label;
        v vVar2 = v.f40183a;
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
    public final Object processHandlerResponse(p5.d dVar, boolean z8, boolean z9, InterfaceC5133d interfaceC5133d) {
        d dVar2;
        int i;
        a aVar;
        if (interfaceC5133d instanceof d) {
            dVar2 = (d) interfaceC5133d;
            int i4 = dVar2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i4 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = dVar2.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    if (z8) {
                        boolean isStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getNotification().getBody());
                        boolean isNotificationWithinTTL = isNotificationWithinTTL(dVar.getNotification());
                        if (isStringNotEmpty && isNotificationWithinTTL) {
                            dVar2.L$0 = this;
                            dVar2.L$1 = dVar;
                            dVar2.label = 1;
                            if (processCollapseKey(dVar, dVar2) != enumC5179a) {
                                aVar = this;
                            }
                            return enumC5179a;
                        }
                    }
                    if (z9) {
                        dVar2.label = 2;
                        if (markNotificationAsDismissed(dVar, dVar2) != enumC5179a) {
                            return null;
                        }
                    } else {
                        dVar.setNotificationToDisplay(false);
                        dVar2.label = 3;
                        if (postProcessNotification(dVar, true, false, dVar2) != enumC5179a) {
                            return null;
                        }
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return null;
                }
                dVar = (p5.d) dVar2.L$1;
                aVar = (a) dVar2.L$0;
                com.bumptech.glide.f.r(obj);
                if (aVar.shouldDisplayNotification(dVar)) {
                    return Boolean.FALSE;
                }
                dVar.setNotificationToDisplay(true);
                return Boolean.TRUE;
            }
        }
        dVar2 = new d(interfaceC5133d);
        Object obj2 = dVar2.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
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
    public final Object saveNotification(p5.d dVar, boolean z8, InterfaceC5133d interfaceC5133d) {
        h hVar;
        int i;
        if (interfaceC5133d instanceof h) {
            hVar = (h) interfaceC5133d;
            int i4 = hVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.label = i4 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = hVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("Saving Notification job: " + dVar, null, 2, null);
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                    String optString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                    long optLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + jsonPayload.optInt("google.ttl", 259200);
                    q5.d dVar2 = this._dataController;
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
                    if (dVar2.createNotification(optString2, safeString, optString, isNotificationToDisplay, z8, androidId, valueOf, valueOf2, optLong, jSONObject, hVar) == enumC5179a) {
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
        }
        hVar = new h(interfaceC5133d);
        Object obj2 = hVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = hVar.label;
        if (i != 0) {
        }
        return v.f40183a;
    }

    private final boolean shouldDisplayNotification(p5.d dVar) {
        return dVar.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(p5.d dVar) {
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
    @Override // s5.InterfaceC4999a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i, JSONObject jSONObject, boolean z8, long j9, InterfaceC5133d interfaceC5133d) {
        e eVar;
        int i4;
        boolean z9;
        a aVar;
        long j10;
        Context context2;
        int i9;
        com.onesignal.notifications.internal.c cVar;
        JSONObject jSONObject2;
        boolean z10;
        long j11;
        Context context3;
        a aVar2;
        com.onesignal.notifications.internal.c cVar2;
        kotlin.jvm.internal.p pVar;
        a aVar3;
        p5.d dVar;
        int i10;
        long external_callbacks_timeout;
        f fVar;
        int i11;
        kotlin.jvm.internal.p pVar2;
        Object processHandlerResponse;
        boolean z11;
        a aVar4;
        p5.d dVar2;
        com.onesignal.notifications.internal.c cVar3;
        int i12;
        Boolean bool;
        boolean booleanValue;
        int i13;
        p5.d dVar3;
        a aVar5;
        kotlin.jvm.internal.p pVar3;
        p5.d dVar4;
        long external_callbacks_timeout2;
        g gVar;
        int i14;
        int i15;
        boolean z12;
        p5.d dVar5;
        a aVar6;
        Object processHandlerResponse2;
        boolean z13;
        Object obj;
        int i16;
        Object obj2;
        JSONObject jSONObject3 = jSONObject;
        if (interfaceC5133d instanceof e) {
            eVar = (e) interfaceC5133d;
            int i17 = eVar.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                eVar.label = i17 - Integer.MIN_VALUE;
                Object obj3 = eVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = eVar.label;
                v vVar = v.f40183a;
                switch (i4) {
                    case 0:
                        com.bumptech.glide.f.r(obj3);
                        t5.b bVar = this._lifecycleService;
                        eVar.L$0 = this;
                        eVar.L$1 = context;
                        eVar.L$2 = jSONObject3;
                        eVar.I$0 = i;
                        z9 = z8;
                        eVar.Z$0 = z9;
                        eVar.J$0 = j9;
                        eVar.label = 1;
                        obj3 = bVar.canReceiveNotification(jSONObject3, eVar);
                        if (obj3 != enumC5179a) {
                            aVar = this;
                            j10 = j9;
                            context2 = context;
                            i9 = i;
                            if (((Boolean) obj3).booleanValue()) {
                                com.onesignal.notifications.internal.c cVar4 = new com.onesignal.notifications.internal.c(null, jSONObject3, i9, aVar._time);
                                if (!z9) {
                                    eVar.L$0 = aVar;
                                    eVar.L$1 = context2;
                                    eVar.L$2 = jSONObject3;
                                    eVar.L$3 = cVar4;
                                    eVar.Z$0 = z9;
                                    eVar.J$0 = j10;
                                    eVar.label = 2;
                                    obj3 = aVar.isDuplicateNotification(cVar4, eVar);
                                    if (obj3 != enumC5179a) {
                                        cVar = cVar4;
                                        Context context4 = context2;
                                        jSONObject2 = jSONObject3;
                                        z10 = z9;
                                        j11 = j10;
                                        context3 = context4;
                                        if (!((Boolean) obj3).booleanValue()) {
                                            long j12 = j11;
                                            z9 = z10;
                                            jSONObject3 = jSONObject2;
                                            context2 = context3;
                                            j10 = j12;
                                            cVar4 = cVar;
                                        }
                                    }
                                }
                                p5.d dVar6 = new p5.d(cVar4, jSONObject3);
                                dVar6.setShownTimeStamp(new Long(j10));
                                dVar6.setRestoring(z9);
                                kotlin.jvm.internal.p pVar4 = new kotlin.jvm.internal.p();
                                pVar4.f38859n = true;
                                com.onesignal.debug.internal.logging.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                                a aVar7 = aVar;
                                try {
                                    com.onesignal.notifications.internal.f fVar2 = new com.onesignal.notifications.internal.f(context2, cVar4);
                                    aVar2 = aVar7;
                                    try {
                                        external_callbacks_timeout = aVar2.getEXTERNAL_CALLBACKS_TIMEOUT();
                                        com.onesignal.notifications.internal.c cVar5 = cVar4;
                                        try {
                                            try {
                                                fVar = aVar2.new f(fVar2, pVar4, cVar5, null);
                                                pVar = pVar4;
                                                cVar2 = cVar5;
                                                try {
                                                    eVar.L$0 = aVar2;
                                                    eVar.L$1 = cVar2;
                                                    eVar.L$2 = dVar6;
                                                    eVar.L$3 = pVar;
                                                    eVar.Z$0 = z9;
                                                    eVar.I$0 = 0;
                                                    eVar.label = 3;
                                                } catch (s0 e6) {
                                                    e = e6;
                                                    aVar3 = aVar2;
                                                    dVar = dVar6;
                                                    i10 = 0;
                                                    com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + pVar.f38859n + '.', e);
                                                    i11 = i10;
                                                    boolean z14 = z9;
                                                    pVar2 = pVar;
                                                    a aVar8 = aVar3;
                                                    boolean z15 = pVar2.f38859n;
                                                    eVar.L$0 = aVar8;
                                                    eVar.L$1 = cVar2;
                                                    eVar.L$2 = dVar;
                                                    eVar.L$3 = pVar2;
                                                    eVar.Z$0 = z14;
                                                    eVar.I$0 = i11 == true ? 1 : 0;
                                                    eVar.label = 4;
                                                    processHandlerResponse = aVar8.processHandlerResponse(dVar, z15, z14, eVar);
                                                    if (processHandlerResponse != enumC5179a) {
                                                    }
                                                    return enumC5179a;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    aVar3 = aVar2;
                                                    dVar = dVar6;
                                                    i10 = 0;
                                                    com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                                    i11 = i10;
                                                    boolean z142 = z9;
                                                    pVar2 = pVar;
                                                    a aVar82 = aVar3;
                                                    boolean z152 = pVar2.f38859n;
                                                    eVar.L$0 = aVar82;
                                                    eVar.L$1 = cVar2;
                                                    eVar.L$2 = dVar;
                                                    eVar.L$3 = pVar2;
                                                    eVar.Z$0 = z142;
                                                    eVar.I$0 = i11 == true ? 1 : 0;
                                                    eVar.label = 4;
                                                    processHandlerResponse = aVar82.processHandlerResponse(dVar, z152, z142, eVar);
                                                    if (processHandlerResponse != enumC5179a) {
                                                    }
                                                    return enumC5179a;
                                                }
                                            } catch (s0 e9) {
                                                e = e9;
                                                pVar = pVar4;
                                                cVar2 = cVar5;
                                                aVar3 = aVar2;
                                                dVar = dVar6;
                                                i10 = 0;
                                                com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + pVar.f38859n + '.', e);
                                                i11 = i10;
                                                boolean z1422 = z9;
                                                pVar2 = pVar;
                                                a aVar822 = aVar3;
                                                boolean z1522 = pVar2.f38859n;
                                                eVar.L$0 = aVar822;
                                                eVar.L$1 = cVar2;
                                                eVar.L$2 = dVar;
                                                eVar.L$3 = pVar2;
                                                eVar.Z$0 = z1422;
                                                eVar.I$0 = i11 == true ? 1 : 0;
                                                eVar.label = 4;
                                                processHandlerResponse = aVar822.processHandlerResponse(dVar, z1522, z1422, eVar);
                                                if (processHandlerResponse != enumC5179a) {
                                                }
                                                return enumC5179a;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                pVar = pVar4;
                                                cVar2 = cVar5;
                                                aVar3 = aVar2;
                                                dVar = dVar6;
                                                i10 = 0;
                                                com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                                i11 = i10;
                                                boolean z14222 = z9;
                                                pVar2 = pVar;
                                                a aVar8222 = aVar3;
                                                boolean z15222 = pVar2.f38859n;
                                                eVar.L$0 = aVar8222;
                                                eVar.L$1 = cVar2;
                                                eVar.L$2 = dVar;
                                                eVar.L$3 = pVar2;
                                                eVar.Z$0 = z14222;
                                                eVar.I$0 = i11 == true ? 1 : 0;
                                                eVar.label = 4;
                                                processHandlerResponse = aVar8222.processHandlerResponse(dVar, z15222, z14222, eVar);
                                                if (processHandlerResponse != enumC5179a) {
                                                }
                                                return enumC5179a;
                                            }
                                        } catch (s0 e10) {
                                            e = e10;
                                            pVar = pVar4;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            pVar = pVar4;
                                        }
                                    } catch (s0 e11) {
                                        e = e11;
                                        cVar2 = cVar4;
                                        pVar = pVar4;
                                        aVar3 = aVar2;
                                        dVar = dVar6;
                                        i10 = 0;
                                        com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + pVar.f38859n + '.', e);
                                        i11 = i10;
                                        boolean z142222 = z9;
                                        pVar2 = pVar;
                                        a aVar82222 = aVar3;
                                        boolean z152222 = pVar2.f38859n;
                                        eVar.L$0 = aVar82222;
                                        eVar.L$1 = cVar2;
                                        eVar.L$2 = dVar;
                                        eVar.L$3 = pVar2;
                                        eVar.Z$0 = z142222;
                                        eVar.I$0 = i11 == true ? 1 : 0;
                                        eVar.label = 4;
                                        processHandlerResponse = aVar82222.processHandlerResponse(dVar, z152222, z142222, eVar);
                                        if (processHandlerResponse != enumC5179a) {
                                        }
                                        return enumC5179a;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cVar2 = cVar4;
                                        pVar = pVar4;
                                        aVar3 = aVar2;
                                        dVar = dVar6;
                                        i10 = 0;
                                        com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                        i11 = i10;
                                        boolean z1422222 = z9;
                                        pVar2 = pVar;
                                        a aVar822222 = aVar3;
                                        boolean z1522222 = pVar2.f38859n;
                                        eVar.L$0 = aVar822222;
                                        eVar.L$1 = cVar2;
                                        eVar.L$2 = dVar;
                                        eVar.L$3 = pVar2;
                                        eVar.Z$0 = z1422222;
                                        eVar.I$0 = i11 == true ? 1 : 0;
                                        eVar.label = 4;
                                        processHandlerResponse = aVar822222.processHandlerResponse(dVar, z1522222, z1422222, eVar);
                                        if (processHandlerResponse != enumC5179a) {
                                        }
                                        return enumC5179a;
                                    }
                                } catch (s0 e12) {
                                    e = e12;
                                    aVar2 = aVar7;
                                } catch (Throwable th5) {
                                    th = th5;
                                    aVar2 = aVar7;
                                }
                                if (AbstractC0399y.z(external_callbacks_timeout, fVar, eVar) != enumC5179a) {
                                    aVar3 = aVar2;
                                    dVar = dVar6;
                                    i11 = 0;
                                    boolean z14222222 = z9;
                                    pVar2 = pVar;
                                    a aVar8222222 = aVar3;
                                    boolean z15222222 = pVar2.f38859n;
                                    eVar.L$0 = aVar8222222;
                                    eVar.L$1 = cVar2;
                                    eVar.L$2 = dVar;
                                    eVar.L$3 = pVar2;
                                    eVar.Z$0 = z14222222;
                                    eVar.I$0 = i11 == true ? 1 : 0;
                                    eVar.label = 4;
                                    processHandlerResponse = aVar8222222.processHandlerResponse(dVar, z15222222, z14222222, eVar);
                                    if (processHandlerResponse != enumC5179a) {
                                        z11 = z14222222;
                                        aVar4 = aVar8222222;
                                        dVar2 = dVar;
                                        cVar3 = cVar2;
                                        i12 = i11;
                                        kotlin.jvm.internal.p pVar5 = pVar2;
                                        bool = (Boolean) processHandlerResponse;
                                        if (bool != null) {
                                            booleanValue = bool.booleanValue();
                                            int i18 = i12;
                                            if (booleanValue) {
                                                if (aVar4.shouldFireForegroundHandlers(dVar2)) {
                                                    com.onesignal.debug.internal.logging.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                                    pVar5.f38859n = true;
                                                    try {
                                                        com.onesignal.notifications.internal.g gVar2 = new com.onesignal.notifications.internal.g(dVar2.getNotification());
                                                        external_callbacks_timeout2 = aVar4.getEXTERNAL_CALLBACKS_TIMEOUT();
                                                        gVar = aVar4.new g(gVar2, pVar5, cVar3, null);
                                                        eVar.L$0 = aVar4;
                                                        eVar.L$1 = dVar2;
                                                        eVar.L$2 = pVar5;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z11;
                                                        eVar.I$0 = i12;
                                                        eVar.label = 5;
                                                    } catch (s0 e13) {
                                                        e = e13;
                                                        aVar5 = aVar4;
                                                        pVar3 = pVar5;
                                                        dVar4 = dVar2;
                                                        com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + pVar3.f38859n + '.', e);
                                                        i14 = i12;
                                                        i15 = i14;
                                                        z12 = z11;
                                                        dVar5 = dVar4;
                                                        aVar6 = aVar5;
                                                        boolean z16 = pVar3.f38859n;
                                                        eVar.L$0 = aVar6;
                                                        eVar.L$1 = dVar5;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z12;
                                                        eVar.I$0 = i15;
                                                        eVar.label = 6;
                                                        processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z16, z12, eVar);
                                                        break;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        aVar5 = aVar4;
                                                        pVar3 = pVar5;
                                                        dVar4 = dVar2;
                                                        com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                                                        i14 = i12;
                                                        i15 = i14;
                                                        z12 = z11;
                                                        dVar5 = dVar4;
                                                        aVar6 = aVar5;
                                                        boolean z162 = pVar3.f38859n;
                                                        eVar.L$0 = aVar6;
                                                        eVar.L$1 = dVar5;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z12;
                                                        eVar.I$0 = i15;
                                                        eVar.label = 6;
                                                        processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z162, z12, eVar);
                                                    }
                                                    if (AbstractC0399y.z(external_callbacks_timeout2, gVar, eVar) != enumC5179a) {
                                                        aVar5 = aVar4;
                                                        pVar3 = pVar5;
                                                        dVar4 = dVar2;
                                                        i14 = i12;
                                                        i15 = i14;
                                                        z12 = z11;
                                                        dVar5 = dVar4;
                                                        aVar6 = aVar5;
                                                        boolean z1622 = pVar3.f38859n;
                                                        eVar.L$0 = aVar6;
                                                        eVar.L$1 = dVar5;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z12;
                                                        eVar.I$0 = i15;
                                                        eVar.label = 6;
                                                        processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z1622, z12, eVar);
                                                    }
                                                } else {
                                                    p5.d dVar7 = dVar2;
                                                    i13 = i12;
                                                    dVar3 = dVar7;
                                                    if (booleanValue) {
                                                        int i19 = i13;
                                                        dVar2 = dVar3;
                                                        i18 = i19;
                                                    } else {
                                                        InterfaceC4966b interfaceC4966b = aVar4._notificationDisplayer;
                                                        eVar.L$0 = aVar4;
                                                        eVar.L$1 = dVar3;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z11;
                                                        eVar.label = 7;
                                                        Object displayNotification = interfaceC4966b.displayNotification(dVar3, eVar);
                                                        if (displayNotification != enumC5179a) {
                                                            dVar2 = dVar3;
                                                            obj = displayNotification;
                                                            z13 = z11;
                                                            i16 = ((Boolean) obj).booleanValue();
                                                            if (!dVar2.isRestoring()) {
                                                                boolean z17 = i16 != 0;
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
                                                                if (AbstractC0399y.f(100L, eVar) == enumC5179a) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z13 = z11;
                                            i16 = i18;
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
                        return enumC5179a;
                    case 1:
                        long j13 = eVar.J$0;
                        boolean z18 = eVar.Z$0;
                        i9 = eVar.I$0;
                        JSONObject jSONObject4 = (JSONObject) eVar.L$2;
                        context2 = (Context) eVar.L$1;
                        aVar = (a) eVar.L$0;
                        com.bumptech.glide.f.r(obj3);
                        j10 = j13;
                        z9 = z18;
                        jSONObject3 = jSONObject4;
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        return vVar;
                    case 2:
                        j11 = eVar.J$0;
                        z10 = eVar.Z$0;
                        cVar = (com.onesignal.notifications.internal.c) eVar.L$3;
                        jSONObject2 = (JSONObject) eVar.L$2;
                        Context context5 = (Context) eVar.L$1;
                        a aVar9 = (a) eVar.L$0;
                        com.bumptech.glide.f.r(obj3);
                        context3 = context5;
                        aVar = aVar9;
                        if (!((Boolean) obj3).booleanValue()) {
                        }
                        return vVar;
                    case 3:
                        i10 = eVar.I$0;
                        z9 = eVar.Z$0;
                        pVar = (kotlin.jvm.internal.p) eVar.L$3;
                        dVar = (p5.d) eVar.L$2;
                        cVar2 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        aVar3 = (a) eVar.L$0;
                        try {
                            com.bumptech.glide.f.r(obj3);
                            i11 = i10;
                        } catch (s0 e14) {
                            e = e14;
                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + pVar.f38859n + '.', e);
                            i11 = i10;
                            boolean z142222222 = z9;
                            pVar2 = pVar;
                            a aVar82222222 = aVar3;
                            boolean z152222222 = pVar2.f38859n;
                            eVar.L$0 = aVar82222222;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar;
                            eVar.L$3 = pVar2;
                            eVar.Z$0 = z142222222;
                            eVar.I$0 = i11 == true ? 1 : 0;
                            eVar.label = 4;
                            processHandlerResponse = aVar82222222.processHandlerResponse(dVar, z152222222, z142222222, eVar);
                            if (processHandlerResponse != enumC5179a) {
                            }
                            return enumC5179a;
                        } catch (Throwable th7) {
                            th = th7;
                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                            i11 = i10;
                            boolean z1422222222 = z9;
                            pVar2 = pVar;
                            a aVar822222222 = aVar3;
                            boolean z1522222222 = pVar2.f38859n;
                            eVar.L$0 = aVar822222222;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar;
                            eVar.L$3 = pVar2;
                            eVar.Z$0 = z1422222222;
                            eVar.I$0 = i11 == true ? 1 : 0;
                            eVar.label = 4;
                            processHandlerResponse = aVar822222222.processHandlerResponse(dVar, z1522222222, z1422222222, eVar);
                            if (processHandlerResponse != enumC5179a) {
                            }
                            return enumC5179a;
                        }
                        boolean z14222222222 = z9;
                        pVar2 = pVar;
                        a aVar8222222222 = aVar3;
                        boolean z15222222222 = pVar2.f38859n;
                        eVar.L$0 = aVar8222222222;
                        eVar.L$1 = cVar2;
                        eVar.L$2 = dVar;
                        eVar.L$3 = pVar2;
                        eVar.Z$0 = z14222222222;
                        eVar.I$0 = i11 == true ? 1 : 0;
                        eVar.label = 4;
                        processHandlerResponse = aVar8222222222.processHandlerResponse(dVar, z15222222222, z14222222222, eVar);
                        if (processHandlerResponse != enumC5179a) {
                        }
                        return enumC5179a;
                    case 4:
                        int i20 = eVar.I$0;
                        boolean z19 = eVar.Z$0;
                        pVar2 = (kotlin.jvm.internal.p) eVar.L$3;
                        p5.d dVar8 = (p5.d) eVar.L$2;
                        com.onesignal.notifications.internal.c cVar6 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        a aVar10 = (a) eVar.L$0;
                        com.bumptech.glide.f.r(obj3);
                        processHandlerResponse = obj3;
                        z11 = z19;
                        dVar2 = dVar8;
                        cVar3 = cVar6;
                        aVar4 = aVar10;
                        i12 = i20;
                        kotlin.jvm.internal.p pVar52 = pVar2;
                        bool = (Boolean) processHandlerResponse;
                        if (bool != null) {
                        }
                        return vVar;
                    case 5:
                        i12 = eVar.I$0;
                        z11 = eVar.Z$0;
                        pVar3 = (kotlin.jvm.internal.p) eVar.L$2;
                        dVar4 = (p5.d) eVar.L$1;
                        aVar5 = (a) eVar.L$0;
                        try {
                            com.bumptech.glide.f.r(obj3);
                            i14 = i12;
                        } catch (s0 e15) {
                            e = e15;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + pVar3.f38859n + '.', e);
                            i14 = i12;
                            i15 = i14;
                            z12 = z11;
                            dVar5 = dVar4;
                            aVar6 = aVar5;
                            boolean z16222 = pVar3.f38859n;
                            eVar.L$0 = aVar6;
                            eVar.L$1 = dVar5;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z12;
                            eVar.I$0 = i15;
                            eVar.label = 6;
                            processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z16222, z12, eVar);
                            break;
                        } catch (Throwable th8) {
                            th = th8;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                            i14 = i12;
                            i15 = i14;
                            z12 = z11;
                            dVar5 = dVar4;
                            aVar6 = aVar5;
                            boolean z162222 = pVar3.f38859n;
                            eVar.L$0 = aVar6;
                            eVar.L$1 = dVar5;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z12;
                            eVar.I$0 = i15;
                            eVar.label = 6;
                            processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z162222, z12, eVar);
                        }
                        i15 = i14;
                        z12 = z11;
                        dVar5 = dVar4;
                        aVar6 = aVar5;
                        boolean z1622222 = pVar3.f38859n;
                        eVar.L$0 = aVar6;
                        eVar.L$1 = dVar5;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.Z$0 = z12;
                        eVar.I$0 = i15;
                        eVar.label = 6;
                        processHandlerResponse2 = aVar6.processHandlerResponse(dVar5, z1622222, z12, eVar);
                    case 6:
                        i15 = eVar.I$0;
                        z12 = eVar.Z$0;
                        dVar5 = (p5.d) eVar.L$1;
                        aVar6 = (a) eVar.L$0;
                        com.bumptech.glide.f.r(obj3);
                        processHandlerResponse2 = obj3;
                        Boolean bool2 = (Boolean) processHandlerResponse2;
                        if (bool2 != null) {
                            aVar4 = aVar6;
                            z11 = z12;
                            dVar3 = dVar5;
                            i13 = i15;
                            booleanValue = bool2.booleanValue();
                            if (booleanValue) {
                            }
                        }
                        return vVar;
                    case 7:
                        z13 = eVar.Z$0;
                        p5.d dVar9 = (p5.d) eVar.L$1;
                        a aVar11 = (a) eVar.L$0;
                        com.bumptech.glide.f.r(obj3);
                        aVar4 = aVar11;
                        dVar2 = dVar9;
                        obj = obj3;
                        i16 = ((Boolean) obj).booleanValue();
                        if (!dVar2.isRestoring()) {
                        }
                        if (z13) {
                        }
                        return vVar;
                    case 8:
                        z13 = eVar.Z$0;
                        com.bumptech.glide.f.r(obj3);
                        obj2 = null;
                        if (z13) {
                        }
                        return vVar;
                    case 9:
                        com.bumptech.glide.f.r(obj3);
                        return vVar;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new e(interfaceC5133d);
        Object obj32 = eVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = eVar.label;
        v vVar2 = v.f40183a;
        switch (i4) {
        }
    }
}
