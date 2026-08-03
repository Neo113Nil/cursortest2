package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import fc.i;
import hc.j;
import org.json.JSONObject;
import pc.o;
import yc.a0;
import yc.i0;
import yc.l1;
import yc.r1;
import yc.v1;
import yc.y;
import yc.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements qa.a {
    private final q8.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final oa.d _dataController;
    private final ra.b _lifecycleService;
    private final pa.b _notificationDisplayer;
    private final ya.a _notificationSummaryManager;
    private final e9.a _time;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.generation.impl.a$a, reason: collision with other inner class name */
    public static final class C0051a extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0051a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.markNotificationAsDismissed(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.postProcessNotification(null, false, false, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processCollapseKey(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processHandlerResponse(null, false, false, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public e(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends j implements oc.e {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
        final /* synthetic */ o $wantsToDisplay;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$f$a, reason: collision with other inner class name */
        public static final class C0052a extends j implements oc.e {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
            final /* synthetic */ o $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0052a(a aVar, com.onesignal.notifications.internal.f fVar, o oVar, com.onesignal.notifications.internal.c cVar, fc.d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$notificationReceivedEvent = fVar;
                this.$wantsToDisplay = oVar;
                this.$notification = cVar;
            }

            @Override // hc.a
            public final fc.d create(Object obj, fc.d dVar) {
                return new C0052a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, dVar);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                o oVar;
                int i10 = this.label;
                if (i10 == 0) {
                    v6.a.W(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.f5679g = false;
                    } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                        o oVar2 = this.$wantsToDisplay;
                        oVar2.f5679g = false;
                        com.onesignal.common.threading.d displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = oVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        gc.a aVar = gc.a.f2559g;
                        if (waitForWake == aVar) {
                            return aVar;
                        }
                        oVar = oVar2;
                        obj = waitForWake;
                    }
                    return ac.o.f277a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = (o) this.L$0;
                v6.a.W(obj);
                oVar.f5679g = ((Boolean) obj).booleanValue();
                return ac.o.f277a;
            }

            @Override // oc.e
            public final Object invoke(y yVar, fc.d dVar) {
                return ((C0052a) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.notifications.internal.f fVar, o oVar, com.onesignal.notifications.internal.c cVar, fc.d dVar) {
            super(2, dVar);
            this.$notificationReceivedEvent = fVar;
            this.$wantsToDisplay = oVar;
            this.$notification = cVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return a.this.new f(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                i iVar = i0.f8861c;
                C0052a c0052a = new C0052a(a.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null);
                int i11 = 2 & 1;
                i iVar2 = fc.j.f2348g;
                if (i11 != 0) {
                    iVar = iVar2;
                }
                z zVar = (2 & 2) != 0 ? z.f8921g : z.f8924j;
                i h10 = a0.h(iVar2, iVar, true);
                fd.e eVar = i0.f8859a;
                if (h10 != eVar && h10.v(fc.e.f2347g) == null) {
                    h10 = h10.d(eVar);
                }
                yc.a l1Var = zVar == z.f8922h ? new l1(h10, c0052a) : new r1(h10, true);
                l1Var.f0(zVar, l1Var, c0052a);
                this.label = 1;
                Object j3 = l1Var.j(this);
                gc.a aVar = gc.a.f2559g;
                if (j3 == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((f) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends j implements oc.e {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
        final /* synthetic */ o $wantsToDisplay;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$g$a, reason: collision with other inner class name */
        public static final class C0053a extends j implements oc.e {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
            final /* synthetic */ o $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0053a(a aVar, com.onesignal.notifications.internal.g gVar, o oVar, com.onesignal.notifications.internal.c cVar, fc.d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$notificationWillDisplayEvent = gVar;
                this.$wantsToDisplay = oVar;
                this.$notification = cVar;
            }

            @Override // hc.a
            public final fc.d create(Object obj, fc.d dVar) {
                return new C0053a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, dVar);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                o oVar;
                int i10 = this.label;
                if (i10 == 0) {
                    v6.a.W(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.f5679g = false;
                    } else if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        o oVar2 = this.$wantsToDisplay;
                        oVar2.f5679g = false;
                        com.onesignal.common.threading.d displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = oVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        gc.a aVar = gc.a.f2559g;
                        if (waitForWake == aVar) {
                            return aVar;
                        }
                        oVar = oVar2;
                        obj = waitForWake;
                    }
                    return ac.o.f277a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = (o) this.L$0;
                v6.a.W(obj);
                oVar.f5679g = ((Boolean) obj).booleanValue();
                return ac.o.f277a;
            }

            @Override // oc.e
            public final Object invoke(y yVar, fc.d dVar) {
                return ((C0053a) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.notifications.internal.g gVar, o oVar, com.onesignal.notifications.internal.c cVar, fc.d dVar) {
            super(2, dVar);
            this.$notificationWillDisplayEvent = gVar;
            this.$wantsToDisplay = oVar;
            this.$notification = cVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return a.this.new g(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                i iVar = i0.f8861c;
                C0053a c0053a = new C0053a(a.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null);
                int i11 = 2 & 1;
                i iVar2 = fc.j.f2348g;
                if (i11 != 0) {
                    iVar = iVar2;
                }
                z zVar = (2 & 2) != 0 ? z.f8921g : z.f8924j;
                i h10 = a0.h(iVar2, iVar, true);
                fd.e eVar = i0.f8859a;
                if (h10 != eVar && h10.v(fc.e.f2347g) == null) {
                    h10 = h10.d(eVar);
                }
                yc.a l1Var = zVar == z.f8922h ? new l1(h10, c0053a) : new r1(h10, true);
                l1Var.f0(zVar, l1Var, c0053a);
                this.label = 1;
                Object j3 = l1Var.j(this);
                gc.a aVar = gc.a.f2559g;
                if (j3 == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((g) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.c {
        int label;
        /* synthetic */ Object result;

        public h(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.saveNotification(null, false, this);
        }
    }

    public a(q8.f fVar, pa.b bVar, com.onesignal.core.internal.config.b bVar2, oa.d dVar, ya.a aVar, ra.b bVar3, e9.a aVar2) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(bVar, "_notificationDisplayer");
        pc.j.e(bVar2, "_configModelStore");
        pc.j.e(dVar, "_dataController");
        pc.j.e(aVar, "_notificationSummaryManager");
        pc.j.e(bVar3, "_lifecycleService");
        pc.j.e(aVar2, "_time");
        this._applicationService = fVar;
        this._notificationDisplayer = bVar;
        this._configModelStore = bVar2;
        this._dataController = dVar;
        this._notificationSummaryManager = aVar;
        this._lifecycleService = bVar3;
        this._time = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(com.onesignal.notifications.internal.c cVar, fc.d dVar) {
        return this._dataController.doesNotificationExist(cVar.getNotificationId(), dVar);
    }

    private final boolean isNotificationWithinTTL(com.onesignal.notifications.internal.c cVar) {
        if (((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
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
    public final Object markNotificationAsDismissed(na.d dVar, fc.d dVar2) {
        C0051a c0051a;
        Object obj;
        int i10;
        a aVar;
        if (dVar2 instanceof C0051a) {
            c0051a = (C0051a) dVar2;
            int i11 = c0051a.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0051a.label = i11 - Integer.MIN_VALUE;
                obj = c0051a.result;
                i10 = c0051a.label;
                ac.o oVar = ac.o.f277a;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (!dVar.isNotificationToDisplay()) {
                        return oVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("Marking restored or disabled notifications as dismissed: " + dVar, null, 2, null);
                    oa.d dVar3 = this._dataController;
                    int androidId = dVar.getAndroidId();
                    c0051a.L$0 = this;
                    c0051a.L$1 = dVar;
                    c0051a.label = 1;
                    obj = dVar3.markAsDismissed(androidId, c0051a);
                    if (obj != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                dVar = (na.d) c0051a.L$1;
                aVar = (a) c0051a.L$0;
                v6.a.W(obj);
                if (((Boolean) obj).booleanValue()) {
                    ya.a aVar3 = aVar._notificationSummaryManager;
                    int androidId2 = dVar.getAndroidId();
                    c0051a.L$0 = null;
                    c0051a.L$1 = null;
                    c0051a.label = 2;
                    if (aVar3.updatePossibleDependentSummaryOnDismiss(androidId2, c0051a) == aVar2) {
                        return aVar2;
                    }
                }
                return oVar;
            }
        }
        c0051a = new C0051a(dVar2);
        obj = c0051a.result;
        i10 = c0051a.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return oVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postProcessNotification(na.d dVar, boolean z10, boolean z11, fc.d dVar2) {
        b bVar;
        int i10;
        a aVar;
        if (dVar2 instanceof b) {
            bVar = (b) dVar2;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i10 = bVar.label;
                ac.o oVar = ac.o.f277a;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    bVar.L$0 = this;
                    bVar.L$1 = dVar;
                    bVar.Z$0 = z11;
                    bVar.label = 1;
                    if (saveNotification(dVar, z10, bVar) != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        v6.a.W(obj);
                        return oVar;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                z11 = bVar.Z$0;
                dVar = (na.d) bVar.L$1;
                aVar = (a) bVar.L$0;
                v6.a.W(obj);
                if (z11) {
                    bVar.L$0 = null;
                    bVar.L$1 = null;
                    bVar.label = 2;
                    if (aVar.markNotificationAsDismissed(dVar, bVar) != aVar2) {
                        return oVar;
                    }
                } else {
                    ra.b bVar2 = aVar._lifecycleService;
                    bVar.L$0 = null;
                    bVar.L$1 = null;
                    bVar.label = 3;
                    if (bVar2.notificationReceived(dVar, bVar) != aVar2) {
                        return oVar;
                    }
                }
                return aVar2;
            }
        }
        bVar = new b(dVar2);
        Object obj2 = bVar.result;
        i10 = bVar.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
        if (z11) {
        }
        return aVar22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processCollapseKey(na.d dVar, fc.d dVar2) {
        c cVar;
        int i10;
        Integer num;
        if (dVar2 instanceof c) {
            cVar = (c) dVar2;
            int i11 = cVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.label = i11 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                i10 = cVar.label;
                ac.o oVar = ac.o.f277a;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (dVar.isRestoring()) {
                        return oVar;
                    }
                    if (dVar.getJsonPayload().has("collapse_key") && !"do_not_collapse".equals(dVar.getJsonPayload().optString("collapse_key"))) {
                        String optString = dVar.getJsonPayload().optString("collapse_key");
                        oa.d dVar3 = this._dataController;
                        pc.j.d(optString, "collapseId");
                        cVar.L$0 = dVar;
                        cVar.label = 1;
                        obj = dVar3.getAndroidIdFromCollapseKey(optString, cVar);
                        gc.a aVar = gc.a.f2559g;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return oVar;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (na.d) cVar.L$0;
                v6.a.W(obj);
                num = (Integer) obj;
                if (num != null) {
                    dVar.getNotification().setAndroidNotificationId(num.intValue());
                }
                return oVar;
            }
        }
        cVar = new c(dVar2);
        Object obj2 = cVar.result;
        i10 = cVar.label;
        ac.o oVar2 = ac.o.f277a;
        if (i10 != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
        return oVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processHandlerResponse(na.d dVar, boolean z10, boolean z11, fc.d dVar2) {
        d dVar3;
        int i10;
        a aVar;
        if (dVar2 instanceof d) {
            dVar3 = (d) dVar2;
            int i11 = dVar3.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar3.label = i11 - Integer.MIN_VALUE;
                Object obj = dVar3.result;
                i10 = dVar3.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    gc.a aVar2 = gc.a.f2559g;
                    if (z10) {
                        boolean isStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getNotification().getBody());
                        boolean isNotificationWithinTTL = isNotificationWithinTTL(dVar.getNotification());
                        if (isStringNotEmpty && isNotificationWithinTTL) {
                            dVar3.L$0 = this;
                            dVar3.L$1 = dVar;
                            dVar3.label = 1;
                            if (processCollapseKey(dVar, dVar3) != aVar2) {
                                aVar = this;
                            }
                            return aVar2;
                        }
                    }
                    if (z11) {
                        dVar3.label = 2;
                        if (markNotificationAsDismissed(dVar, dVar3) != aVar2) {
                            return null;
                        }
                    } else {
                        dVar.setNotificationToDisplay(false);
                        dVar3.label = 3;
                        if (postProcessNotification(dVar, true, false, dVar3) != aVar2) {
                            return null;
                        }
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return null;
                }
                dVar = (na.d) dVar3.L$1;
                aVar = (a) dVar3.L$0;
                v6.a.W(obj);
                if (aVar.shouldDisplayNotification(dVar)) {
                    return Boolean.FALSE;
                }
                dVar.setNotificationToDisplay(true);
                return Boolean.TRUE;
            }
        }
        dVar3 = new d(dVar2);
        Object obj2 = dVar3.result;
        i10 = dVar3.label;
        if (i10 != 0) {
        }
        if (aVar.shouldDisplayNotification(dVar)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(10:16|17|(1:33)(1:21)|22|(1:24)(1:32)|25|(1:27)|28|29|(1:31))|11|12))|36|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveNotification(na.d dVar, boolean z10, fc.d dVar2) {
        h hVar;
        int i10;
        if (dVar2 instanceof h) {
            hVar = (h) dVar2;
            int i11 = hVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.label = i11 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                i10 = hVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("Saving Notification job: " + dVar, null, 2, null);
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                    String optString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                    long optLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + jsonPayload.optInt("google.ttl", 259200);
                    oa.d dVar3 = this._dataController;
                    String optString2 = customJSONObject.optString("i");
                    pc.j.d(optString2, "customJSON.optString(\"i\")");
                    String safeString = com.onesignal.common.f.safeString(jsonPayload, "grp");
                    boolean isNotificationToDisplay = dVar.isNotificationToDisplay();
                    int androidId = dVar.getAndroidId();
                    String valueOf = dVar.getTitle() != null ? String.valueOf(dVar.getTitle()) : null;
                    String valueOf2 = dVar.getBody() != null ? String.valueOf(dVar.getBody()) : null;
                    String jSONObject = jsonPayload.toString();
                    pc.j.d(jSONObject, "jsonPayload.toString()");
                    hVar.label = 1;
                    Object createNotification = dVar3.createNotification(optString2, safeString, optString, isNotificationToDisplay, z10, androidId, valueOf, valueOf2, optLong, jSONObject, hVar);
                    gc.a aVar = gc.a.f2559g;
                    if (createNotification == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            }
        }
        hVar = new h(dVar2);
        Object obj2 = hVar.result;
        i10 = hVar.label;
        if (i10 != 0) {
        }
        return ac.o.f277a;
    }

    private final boolean shouldDisplayNotification(na.d dVar) {
        return dVar.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(na.d dVar) {
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

    public final JSONObject getCustomJSONObject(JSONObject jSONObject) {
        pc.j.e(jSONObject, "jsonObject");
        return new JSONObject(jSONObject.optString(na.c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0344, code lost:
    
        if (r6.postProcessNotification(r15, false, r10, r3) == r13) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02e8, code lost:
    
        if (r9 == r13) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0241  */
    @Override // qa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i10, JSONObject jSONObject, boolean z10, long j3, fc.d dVar) {
        e eVar;
        int i11;
        int i12;
        boolean z11;
        Object obj;
        ac.o oVar;
        long j6;
        a aVar;
        Context context2;
        boolean z12;
        Object isDuplicateNotification;
        JSONObject jSONObject2;
        boolean z13;
        com.onesignal.notifications.internal.c cVar;
        a aVar2;
        na.d dVar2;
        o oVar2;
        com.onesignal.notifications.internal.c cVar2;
        o oVar3;
        a aVar3;
        na.d dVar3;
        boolean z14;
        int i13;
        f fVar;
        com.onesignal.notifications.internal.c cVar3;
        na.d dVar4;
        o oVar4;
        int i14;
        o oVar5;
        a aVar4;
        Object processHandlerResponse;
        na.d dVar5;
        com.onesignal.notifications.internal.c cVar4;
        o oVar6;
        Boolean bool;
        boolean booleanValue;
        boolean z15;
        boolean z16;
        int i15;
        boolean z17;
        boolean z18;
        a aVar5;
        na.d dVar6;
        g gVar;
        a aVar6;
        int i16;
        int i17;
        int i18;
        int i19;
        na.d dVar7;
        Object processHandlerResponse2;
        int i20;
        int i21;
        Object obj2;
        a aVar7;
        JSONObject jSONObject3 = jSONObject;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i22 = eVar.label;
            if ((i22 & Integer.MIN_VALUE) != 0) {
                eVar.label = i22 - Integer.MIN_VALUE;
                Object obj3 = eVar.result;
                i11 = eVar.label;
                ac.o oVar7 = ac.o.f277a;
                gc.a aVar8 = gc.a.f2559g;
                switch (i11) {
                    case 0:
                        v6.a.W(obj3);
                        ra.b bVar = this._lifecycleService;
                        eVar.L$0 = this;
                        eVar.L$1 = context;
                        eVar.L$2 = jSONObject3;
                        i12 = i10;
                        eVar.I$0 = i12;
                        z11 = z10;
                        eVar.Z$0 = z11;
                        eVar.J$0 = j3;
                        eVar.label = 1;
                        Object canReceiveNotification = bVar.canReceiveNotification(jSONObject3, eVar);
                        if (canReceiveNotification != aVar8) {
                            obj = canReceiveNotification;
                            oVar = oVar7;
                            j6 = j3;
                            aVar = this;
                            context2 = context;
                            if (((Boolean) obj).booleanValue()) {
                                com.onesignal.notifications.internal.c cVar5 = new com.onesignal.notifications.internal.c(null, jSONObject3, i12, aVar._time);
                                if (z11) {
                                    z12 = z11;
                                    aVar2 = aVar;
                                    dVar2 = new na.d(cVar5, jSONObject3);
                                    dVar2.setShownTimeStamp(new Long(j6));
                                    dVar2.setRestoring(z12);
                                    oVar2 = new o();
                                    oVar2.f5679g = true;
                                    com.onesignal.debug.internal.logging.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                                    cVar3 = cVar5;
                                    fVar = aVar2.new f(new com.onesignal.notifications.internal.f(context2, cVar5), oVar2, cVar3, null);
                                    aVar3 = aVar2;
                                    oVar3 = oVar2;
                                    cVar2 = cVar3;
                                    eVar.L$0 = aVar3;
                                    eVar.L$1 = cVar2;
                                    eVar.L$2 = dVar2;
                                    eVar.L$3 = oVar3;
                                    eVar.Z$0 = z12;
                                    eVar.I$0 = 0;
                                    eVar.label = 3;
                                    if (a0.B(30000L, fVar, eVar) != aVar8) {
                                    }
                                } else {
                                    eVar.L$0 = aVar;
                                    eVar.L$1 = context2;
                                    eVar.L$2 = jSONObject3;
                                    eVar.L$3 = cVar5;
                                    eVar.Z$0 = z11;
                                    eVar.J$0 = j6;
                                    eVar.label = 2;
                                    isDuplicateNotification = aVar.isDuplicateNotification(cVar5, eVar);
                                    if (isDuplicateNotification != aVar8) {
                                        jSONObject2 = jSONObject3;
                                        z13 = z11;
                                        cVar = cVar5;
                                        if (!((Boolean) isDuplicateNotification).booleanValue()) {
                                            z12 = z13;
                                            jSONObject3 = jSONObject2;
                                            cVar5 = cVar;
                                            aVar2 = aVar;
                                            dVar2 = new na.d(cVar5, jSONObject3);
                                            dVar2.setShownTimeStamp(new Long(j6));
                                            dVar2.setRestoring(z12);
                                            oVar2 = new o();
                                            oVar2.f5679g = true;
                                            com.onesignal.debug.internal.logging.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                                            try {
                                                cVar3 = cVar5;
                                                try {
                                                    fVar = aVar2.new f(new com.onesignal.notifications.internal.f(context2, cVar5), oVar2, cVar3, null);
                                                    aVar3 = aVar2;
                                                    oVar3 = oVar2;
                                                    cVar2 = cVar3;
                                                    try {
                                                        eVar.L$0 = aVar3;
                                                        eVar.L$1 = cVar2;
                                                        eVar.L$2 = dVar2;
                                                        eVar.L$3 = oVar3;
                                                        eVar.Z$0 = z12;
                                                        eVar.I$0 = 0;
                                                        eVar.label = 3;
                                                    } catch (v1 e10) {
                                                        e = e10;
                                                        dVar3 = dVar2;
                                                        z14 = z12;
                                                        i13 = 0;
                                                        com.onesignal.debug.internal.logging.b.error("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + oVar3.f5679g + '.', e);
                                                        i14 = i13;
                                                        z12 = z14;
                                                        oVar5 = oVar3;
                                                        dVar4 = dVar3;
                                                        aVar4 = aVar3;
                                                        boolean z19 = oVar5.f5679g;
                                                        eVar.L$0 = aVar4;
                                                        eVar.L$1 = cVar2;
                                                        eVar.L$2 = dVar4;
                                                        eVar.L$3 = oVar5;
                                                        eVar.Z$0 = z12;
                                                        eVar.I$0 = i14;
                                                        eVar.label = 4;
                                                        processHandlerResponse = aVar4.processHandlerResponse(dVar4, z19, z12, eVar);
                                                        if (processHandlerResponse != aVar8) {
                                                        }
                                                        return aVar8;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        dVar3 = dVar2;
                                                        z14 = z12;
                                                        i13 = 0;
                                                        com.onesignal.debug.internal.logging.b.error("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                                        i14 = i13;
                                                        z12 = z14;
                                                        oVar5 = oVar3;
                                                        dVar4 = dVar3;
                                                        aVar4 = aVar3;
                                                        boolean z192 = oVar5.f5679g;
                                                        eVar.L$0 = aVar4;
                                                        eVar.L$1 = cVar2;
                                                        eVar.L$2 = dVar4;
                                                        eVar.L$3 = oVar5;
                                                        eVar.Z$0 = z12;
                                                        eVar.I$0 = i14;
                                                        eVar.label = 4;
                                                        processHandlerResponse = aVar4.processHandlerResponse(dVar4, z192, z12, eVar);
                                                        if (processHandlerResponse != aVar8) {
                                                        }
                                                        return aVar8;
                                                    }
                                                } catch (v1 e11) {
                                                    e = e11;
                                                    aVar3 = aVar2;
                                                    oVar3 = oVar2;
                                                    cVar2 = cVar3;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    aVar3 = aVar2;
                                                    oVar3 = oVar2;
                                                    cVar2 = cVar3;
                                                }
                                            } catch (v1 e12) {
                                                e = e12;
                                                cVar2 = cVar5;
                                                oVar3 = oVar2;
                                                aVar3 = aVar2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cVar2 = cVar5;
                                                oVar3 = oVar2;
                                                aVar3 = aVar2;
                                            }
                                            if (a0.B(30000L, fVar, eVar) != aVar8) {
                                                dVar4 = dVar2;
                                                oVar4 = oVar3;
                                                i14 = 0;
                                                oVar5 = oVar4;
                                                aVar4 = aVar3;
                                                boolean z1922 = oVar5.f5679g;
                                                eVar.L$0 = aVar4;
                                                eVar.L$1 = cVar2;
                                                eVar.L$2 = dVar4;
                                                eVar.L$3 = oVar5;
                                                eVar.Z$0 = z12;
                                                eVar.I$0 = i14;
                                                eVar.label = 4;
                                                processHandlerResponse = aVar4.processHandlerResponse(dVar4, z1922, z12, eVar);
                                                if (processHandlerResponse != aVar8) {
                                                    dVar5 = dVar4;
                                                    cVar4 = cVar2;
                                                    oVar6 = oVar5;
                                                    int i23 = i14;
                                                    bool = (Boolean) processHandlerResponse;
                                                    if (bool != null) {
                                                        booleanValue = bool.booleanValue();
                                                        if (!booleanValue) {
                                                            z15 = true;
                                                            z16 = z12;
                                                            i21 = i23;
                                                            if (!dVar5.isRestoring()) {
                                                            }
                                                            if (z16) {
                                                            }
                                                        } else if (aVar4.shouldFireForegroundHandlers(dVar5)) {
                                                            com.onesignal.debug.internal.logging.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                                            z15 = true;
                                                            oVar6.f5679g = true;
                                                            try {
                                                                a aVar9 = aVar4;
                                                                o oVar8 = oVar6;
                                                                try {
                                                                    gVar = aVar9.new g(new com.onesignal.notifications.internal.g(dVar5.getNotification()), oVar8, cVar4, null);
                                                                    eVar.L$0 = aVar4;
                                                                    eVar.L$1 = dVar5;
                                                                    eVar.L$2 = oVar6;
                                                                    eVar.L$3 = null;
                                                                    eVar.Z$0 = z12;
                                                                    eVar.I$0 = i23;
                                                                    eVar.label = 5;
                                                                } catch (v1 e13) {
                                                                    e = e13;
                                                                    aVar4 = aVar9;
                                                                    oVar6 = oVar8;
                                                                    a aVar10 = aVar4;
                                                                    z18 = z12;
                                                                    aVar5 = aVar10;
                                                                    dVar6 = dVar5;
                                                                    i19 = i23;
                                                                    com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + oVar6.f5679g + '.', e);
                                                                    i17 = i19;
                                                                    i18 = i17;
                                                                    z17 = z18;
                                                                    aVar4 = aVar5;
                                                                    dVar7 = dVar6;
                                                                    boolean z20 = oVar6.f5679g;
                                                                    eVar.L$0 = aVar4;
                                                                    eVar.L$1 = dVar7;
                                                                    eVar.L$2 = null;
                                                                    eVar.L$3 = null;
                                                                    eVar.Z$0 = z17;
                                                                    eVar.I$0 = i18;
                                                                    eVar.label = 6;
                                                                    processHandlerResponse2 = aVar4.processHandlerResponse(dVar7, z20, z17, eVar);
                                                                    break;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    aVar4 = aVar9;
                                                                    oVar6 = oVar8;
                                                                    a aVar11 = aVar4;
                                                                    z18 = z12;
                                                                    aVar5 = aVar11;
                                                                    dVar6 = dVar5;
                                                                    i16 = i23;
                                                                    com.onesignal.debug.internal.logging.b.error("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                                                                    i17 = i16;
                                                                    i18 = i17;
                                                                    z17 = z18;
                                                                    aVar4 = aVar5;
                                                                    dVar7 = dVar6;
                                                                    boolean z202 = oVar6.f5679g;
                                                                    eVar.L$0 = aVar4;
                                                                    eVar.L$1 = dVar7;
                                                                    eVar.L$2 = null;
                                                                    eVar.L$3 = null;
                                                                    eVar.Z$0 = z17;
                                                                    eVar.I$0 = i18;
                                                                    eVar.label = 6;
                                                                    processHandlerResponse2 = aVar4.processHandlerResponse(dVar7, z202, z17, eVar);
                                                                }
                                                            } catch (v1 e14) {
                                                                e = e14;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                            }
                                                            if (a0.B(30000L, gVar, eVar) != aVar8) {
                                                                aVar6 = aVar4;
                                                                dVar6 = dVar5;
                                                                z18 = z12;
                                                                i20 = i23;
                                                                boolean z21 = z18;
                                                                aVar4 = aVar6;
                                                                i18 = i20;
                                                                z17 = z21;
                                                                dVar7 = dVar6;
                                                                boolean z2022 = oVar6.f5679g;
                                                                eVar.L$0 = aVar4;
                                                                eVar.L$1 = dVar7;
                                                                eVar.L$2 = null;
                                                                eVar.L$3 = null;
                                                                eVar.Z$0 = z17;
                                                                eVar.I$0 = i18;
                                                                eVar.label = 6;
                                                                processHandlerResponse2 = aVar4.processHandlerResponse(dVar7, z2022, z17, eVar);
                                                            }
                                                        } else {
                                                            z15 = true;
                                                            boolean z22 = z12;
                                                            i15 = i23;
                                                            z17 = z22;
                                                            if (booleanValue) {
                                                                z16 = z17;
                                                                i21 = i15;
                                                                if (!dVar5.isRestoring()) {
                                                                }
                                                                if (z16) {
                                                                }
                                                            } else {
                                                                pa.b bVar2 = aVar4._notificationDisplayer;
                                                                eVar.L$0 = aVar4;
                                                                eVar.L$1 = dVar5;
                                                                eVar.L$2 = null;
                                                                eVar.L$3 = null;
                                                                eVar.Z$0 = z17;
                                                                eVar.label = 7;
                                                                Object displayNotification = bVar2.displayNotification(dVar5, eVar);
                                                                if (displayNotification != aVar8) {
                                                                    boolean z23 = z17;
                                                                    obj2 = displayNotification;
                                                                    z16 = z23;
                                                                    aVar7 = aVar4;
                                                                    aVar4 = aVar7;
                                                                    i21 = ((Boolean) obj2).booleanValue();
                                                                    if (!dVar5.isRestoring()) {
                                                                        boolean z24 = i21 != 0 ? z15 : false;
                                                                        eVar.L$0 = null;
                                                                        eVar.L$1 = null;
                                                                        eVar.L$2 = null;
                                                                        eVar.L$3 = null;
                                                                        eVar.Z$0 = z16;
                                                                        eVar.label = 8;
                                                                        break;
                                                                    }
                                                                    if (z16) {
                                                                        eVar.L$0 = null;
                                                                        eVar.L$1 = null;
                                                                        eVar.L$2 = null;
                                                                        eVar.L$3 = null;
                                                                        eVar.label = 9;
                                                                        if (a0.f(100L, eVar) == aVar8) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return oVar;
                        }
                        return aVar8;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        long j10 = eVar.J$0;
                        boolean z25 = eVar.Z$0;
                        int i24 = eVar.I$0;
                        JSONObject jSONObject4 = (JSONObject) eVar.L$2;
                        context2 = (Context) eVar.L$1;
                        aVar = (a) eVar.L$0;
                        v6.a.W(obj3);
                        z11 = z25;
                        jSONObject3 = jSONObject4;
                        obj = obj3;
                        oVar = oVar7;
                        j6 = j10;
                        i12 = i24;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return oVar;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        long j11 = eVar.J$0;
                        z13 = eVar.Z$0;
                        cVar = (com.onesignal.notifications.internal.c) eVar.L$3;
                        jSONObject2 = (JSONObject) eVar.L$2;
                        context2 = (Context) eVar.L$1;
                        aVar = (a) eVar.L$0;
                        v6.a.W(obj3);
                        isDuplicateNotification = obj3;
                        oVar = oVar7;
                        j6 = j11;
                        if (!((Boolean) isDuplicateNotification).booleanValue()) {
                        }
                        return oVar;
                    case 3:
                        int i25 = eVar.I$0;
                        z12 = eVar.Z$0;
                        oVar4 = (o) eVar.L$3;
                        dVar4 = (na.d) eVar.L$2;
                        cVar2 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        aVar3 = (a) eVar.L$0;
                        try {
                            v6.a.W(obj3);
                            i14 = i25;
                            oVar = oVar7;
                            oVar5 = oVar4;
                        } catch (v1 e15) {
                            e = e15;
                            dVar3 = dVar4;
                            oVar = oVar7;
                            oVar3 = oVar4;
                            z14 = z12;
                            i13 = i25;
                            com.onesignal.debug.internal.logging.b.error("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + oVar3.f5679g + '.', e);
                            i14 = i13;
                            z12 = z14;
                            oVar5 = oVar3;
                            dVar4 = dVar3;
                            aVar4 = aVar3;
                            boolean z19222 = oVar5.f5679g;
                            eVar.L$0 = aVar4;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar4;
                            eVar.L$3 = oVar5;
                            eVar.Z$0 = z12;
                            eVar.I$0 = i14;
                            eVar.label = 4;
                            processHandlerResponse = aVar4.processHandlerResponse(dVar4, z19222, z12, eVar);
                            if (processHandlerResponse != aVar8) {
                            }
                            return aVar8;
                        } catch (Throwable th6) {
                            th = th6;
                            dVar3 = dVar4;
                            oVar = oVar7;
                            oVar3 = oVar4;
                            z14 = z12;
                            i13 = i25;
                            com.onesignal.debug.internal.logging.b.error("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                            i14 = i13;
                            z12 = z14;
                            oVar5 = oVar3;
                            dVar4 = dVar3;
                            aVar4 = aVar3;
                            boolean z192222 = oVar5.f5679g;
                            eVar.L$0 = aVar4;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar4;
                            eVar.L$3 = oVar5;
                            eVar.Z$0 = z12;
                            eVar.I$0 = i14;
                            eVar.label = 4;
                            processHandlerResponse = aVar4.processHandlerResponse(dVar4, z192222, z12, eVar);
                            if (processHandlerResponse != aVar8) {
                            }
                            return aVar8;
                        }
                        aVar4 = aVar3;
                        boolean z1922222 = oVar5.f5679g;
                        eVar.L$0 = aVar4;
                        eVar.L$1 = cVar2;
                        eVar.L$2 = dVar4;
                        eVar.L$3 = oVar5;
                        eVar.Z$0 = z12;
                        eVar.I$0 = i14;
                        eVar.label = 4;
                        processHandlerResponse = aVar4.processHandlerResponse(dVar4, z1922222, z12, eVar);
                        if (processHandlerResponse != aVar8) {
                        }
                        return aVar8;
                    case 4:
                        i14 = eVar.I$0;
                        boolean z26 = eVar.Z$0;
                        oVar6 = (o) eVar.L$3;
                        dVar5 = (na.d) eVar.L$2;
                        com.onesignal.notifications.internal.c cVar6 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        aVar4 = (a) eVar.L$0;
                        v6.a.W(obj3);
                        processHandlerResponse = obj3;
                        cVar4 = cVar6;
                        oVar = oVar7;
                        z12 = z26;
                        int i232 = i14;
                        bool = (Boolean) processHandlerResponse;
                        if (bool != null) {
                        }
                        return oVar;
                    case 5:
                        int i26 = eVar.I$0;
                        z18 = eVar.Z$0;
                        o oVar9 = (o) eVar.L$2;
                        dVar6 = (na.d) eVar.L$1;
                        a aVar12 = (a) eVar.L$0;
                        try {
                            v6.a.W(obj3);
                            oVar = oVar7;
                            aVar6 = aVar12;
                            oVar6 = oVar9;
                            z15 = true;
                            i20 = i26;
                            boolean z212 = z18;
                            aVar4 = aVar6;
                            i18 = i20;
                            z17 = z212;
                        } catch (v1 e16) {
                            e = e16;
                            oVar = oVar7;
                            aVar5 = aVar12;
                            oVar6 = oVar9;
                            z15 = true;
                            i19 = i26;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + oVar6.f5679g + '.', e);
                            i17 = i19;
                            i18 = i17;
                            z17 = z18;
                            aVar4 = aVar5;
                            dVar7 = dVar6;
                            boolean z20222 = oVar6.f5679g;
                            eVar.L$0 = aVar4;
                            eVar.L$1 = dVar7;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z17;
                            eVar.I$0 = i18;
                            eVar.label = 6;
                            processHandlerResponse2 = aVar4.processHandlerResponse(dVar7, z20222, z17, eVar);
                            break;
                        } catch (Throwable th7) {
                            th = th7;
                            oVar = oVar7;
                            aVar5 = aVar12;
                            oVar6 = oVar9;
                            z15 = true;
                            i16 = i26;
                            com.onesignal.debug.internal.logging.b.error("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                            i17 = i16;
                            i18 = i17;
                            z17 = z18;
                            aVar4 = aVar5;
                            dVar7 = dVar6;
                            boolean z202222 = oVar6.f5679g;
                            eVar.L$0 = aVar4;
                            eVar.L$1 = dVar7;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z17;
                            eVar.I$0 = i18;
                            eVar.label = 6;
                            processHandlerResponse2 = aVar4.processHandlerResponse(dVar7, z202222, z17, eVar);
                        }
                        dVar7 = dVar6;
                        boolean z2022222 = oVar6.f5679g;
                        eVar.L$0 = aVar4;
                        eVar.L$1 = dVar7;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.Z$0 = z17;
                        eVar.I$0 = i18;
                        eVar.label = 6;
                        processHandlerResponse2 = aVar4.processHandlerResponse(dVar7, z2022222, z17, eVar);
                    case 6:
                        i18 = eVar.I$0;
                        z17 = eVar.Z$0;
                        dVar7 = (na.d) eVar.L$1;
                        aVar4 = (a) eVar.L$0;
                        v6.a.W(obj3);
                        processHandlerResponse2 = obj3;
                        z15 = true;
                        oVar = oVar7;
                        Boolean bool2 = (Boolean) processHandlerResponse2;
                        if (bool2 != null) {
                            dVar5 = dVar7;
                            i15 = i18;
                            booleanValue = bool2.booleanValue();
                            if (booleanValue) {
                            }
                        }
                        return oVar;
                    case 7:
                        z16 = eVar.Z$0;
                        na.d dVar8 = (na.d) eVar.L$1;
                        aVar7 = (a) eVar.L$0;
                        v6.a.W(obj3);
                        dVar5 = dVar8;
                        z15 = true;
                        obj2 = obj3;
                        oVar = oVar7;
                        aVar4 = aVar7;
                        i21 = ((Boolean) obj2).booleanValue();
                        if (!dVar5.isRestoring()) {
                        }
                        if (z16) {
                        }
                        return oVar;
                    case 8:
                        z16 = eVar.Z$0;
                        v6.a.W(obj3);
                        oVar = oVar7;
                        if (z16) {
                        }
                        return oVar;
                    case 9:
                        v6.a.W(obj3);
                        return oVar7;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new e(dVar);
        Object obj32 = eVar.result;
        i11 = eVar.label;
        ac.o oVar72 = ac.o.f277a;
        gc.a aVar82 = gc.a.f2559g;
        switch (i11) {
        }
    }
}
