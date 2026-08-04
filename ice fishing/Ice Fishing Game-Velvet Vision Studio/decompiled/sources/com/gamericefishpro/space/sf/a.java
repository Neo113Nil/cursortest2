package com.gamericefishpro.space.sf;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.s1;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.pi.x0;
import com.gamericefishpro.space.pi.y1;
import com.gamericefishpro.space.vh.i;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.rf.a {
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.nf.d _dataController;
    private final com.gamericefishpro.space.tf.b _lifecycleService;
    private final com.gamericefishpro.space.pf.b _notificationDisplayer;
    private final com.gamericefishpro.space.ig.a _notificationSummaryManager;
    private final com.gamericefishpro.space.kd.a _time;

    /* JADX INFO: renamed from: com.gamericefishpro.space.sf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0056a extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0056a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.markNotificationAsDismissed(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.postProcessNotification(null, false, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processCollapseKey(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processHandlerResponse(null, false, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends i implements Function2 {
        final /* synthetic */ com.gamericefishpro.space.ye.c $notification;
        final /* synthetic */ com.gamericefishpro.space.ye.f $notificationReceivedEvent;
        final /* synthetic */ w $wantsToDisplay;
        int label;

        /* JADX INFO: renamed from: com.gamericefishpro.space.sf.a$f$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0057a extends i implements Function2 {
            final /* synthetic */ com.gamericefishpro.space.ye.c $notification;
            final /* synthetic */ com.gamericefishpro.space.ye.f $notificationReceivedEvent;
            final /* synthetic */ w $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0057a(a aVar, com.gamericefishpro.space.ye.f fVar, w wVar, com.gamericefishpro.space.ye.c cVar, com.gamericefishpro.space.th.a aVar2) {
                super(2, aVar2);
                this.this$0 = aVar;
                this.$notificationReceivedEvent = fVar;
                this.$wantsToDisplay = wVar;
                this.$notification = cVar;
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
                return new C0057a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
                return ((C0057a) create(xVar, aVar)).invokeSuspend(Unit.a);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                w wVar;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.label;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.d = false;
                    } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                        w wVar2 = this.$wantsToDisplay;
                        wVar2.d = false;
                        com.gamericefishpro.space.ic.d displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = wVar2;
                        this.label = 1;
                        Object objWaitForWake = displayWaiter.waitForWake(this);
                        if (objWaitForWake == aVar) {
                            return aVar;
                        }
                        wVar = wVar2;
                        obj = objWaitForWake;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (w) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                wVar.d = ((Boolean) obj).booleanValue();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.gamericefishpro.space.ye.f fVar, w wVar, com.gamericefishpro.space.ye.c cVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$notificationReceivedEvent = fVar;
            this.$wantsToDisplay = wVar;
            this.$notification = cVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new f(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((f) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.wi.e eVar = k0.a;
                s1 s1VarU = a0.u(x0.d, com.gamericefishpro.space.wi.d.i, new C0057a(a.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null), 2);
                this.label = 1;
                if (s1VarU.y(this) == aVar) {
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
    public static final class g extends i implements Function2 {
        final /* synthetic */ com.gamericefishpro.space.ye.c $notification;
        final /* synthetic */ com.gamericefishpro.space.ye.g $notificationWillDisplayEvent;
        final /* synthetic */ w $wantsToDisplay;
        int label;

        /* JADX INFO: renamed from: com.gamericefishpro.space.sf.a$g$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0058a extends i implements Function2 {
            final /* synthetic */ com.gamericefishpro.space.ye.c $notification;
            final /* synthetic */ com.gamericefishpro.space.ye.g $notificationWillDisplayEvent;
            final /* synthetic */ w $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0058a(a aVar, com.gamericefishpro.space.ye.g gVar, w wVar, com.gamericefishpro.space.ye.c cVar, com.gamericefishpro.space.th.a aVar2) {
                super(2, aVar2);
                this.this$0 = aVar;
                this.$notificationWillDisplayEvent = gVar;
                this.$wantsToDisplay = wVar;
                this.$notification = cVar;
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
                return new C0058a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
                return ((C0058a) create(xVar, aVar)).invokeSuspend(Unit.a);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                w wVar;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.label;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.d = false;
                    } else if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        w wVar2 = this.$wantsToDisplay;
                        wVar2.d = false;
                        com.gamericefishpro.space.ic.d displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = wVar2;
                        this.label = 1;
                        Object objWaitForWake = displayWaiter.waitForWake(this);
                        if (objWaitForWake == aVar) {
                            return aVar;
                        }
                        wVar = wVar2;
                        obj = objWaitForWake;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (w) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                wVar.d = ((Boolean) obj).booleanValue();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.gamericefishpro.space.ye.g gVar, w wVar, com.gamericefishpro.space.ye.c cVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$notificationWillDisplayEvent = gVar;
            this.$wantsToDisplay = wVar;
            this.$notification = cVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new g(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((g) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.wi.e eVar = k0.a;
                s1 s1VarU = a0.u(x0.d, com.gamericefishpro.space.wi.d.i, new C0058a(a.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null), 2);
                this.label = 1;
                if (s1VarU.y(this) == aVar) {
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
    public static final class h extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public h(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.saveNotification(null, false, this);
        }
    }

    public a(com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.pf.b _notificationDisplayer, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.nf.d _dataController, com.gamericefishpro.space.ig.a _notificationSummaryManager, com.gamericefishpro.space.tf.b _lifecycleService, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationDisplayer, "_notificationDisplayer");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_notificationSummaryManager, "_notificationSummaryManager");
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._configModelStore = _configModelStore;
        this._dataController = _dataController;
        this._notificationSummaryManager = _notificationSummaryManager;
        this._lifecycleService = _lifecycleService;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(com.gamericefishpro.space.ye.c cVar, com.gamericefishpro.space.th.a aVar) {
        return this._dataController.doesNotificationExist(cVar.getNotificationId(), aVar);
    }

    private final boolean isNotificationWithinTTL(com.gamericefishpro.space.ye.c cVar) {
        if (((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            return cVar.getSentTime() + ((long) cVar.getTtl()) > this._time.getCurrentTimeMillis() / ((long) 1000);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r8.updatePossibleDependentSummaryOnDismiss(r7, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationAsDismissed(com.gamericefishpro.space.mf.d dVar, com.gamericefishpro.space.th.a aVar) {
        C0056a c0056a;
        a aVar2;
        if (aVar instanceof C0056a) {
            c0056a = (C0056a) aVar;
            int i = c0056a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0056a.label = i - Integer.MIN_VALUE;
            } else {
                c0056a = new C0056a(aVar);
            }
        } else {
            c0056a = new C0056a(aVar);
        }
        Object objMarkAsDismissed = c0056a.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0056a.label;
        if (i2 != 0) {
            if (i2 == 1) {
                dVar = (com.gamericefishpro.space.mf.d) c0056a.L$1;
                aVar2 = (a) c0056a.L$0;
                com.gamericefishpro.space.wa.b.P(objMarkAsDismissed);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(objMarkAsDismissed);
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(objMarkAsDismissed);
        if (!dVar.isNotificationToDisplay()) {
            return Unit.a;
        }
        com.gamericefishpro.space.od.b.debug$default("Marking restored or disabled notifications as dismissed: " + dVar, null, 2, null);
        com.gamericefishpro.space.nf.d dVar2 = this._dataController;
        int androidId = dVar.getAndroidId();
        c0056a.L$0 = this;
        c0056a.L$1 = dVar;
        c0056a.label = 1;
        objMarkAsDismissed = dVar2.markAsDismissed(androidId, c0056a);
        if (objMarkAsDismissed != aVar3) {
            aVar2 = this;
        }
        return aVar3;
        if (!((Boolean) objMarkAsDismissed).booleanValue()) {
            return Unit.a;
        }
        com.gamericefishpro.space.ig.a aVar4 = aVar2._notificationSummaryManager;
        int androidId2 = dVar.getAndroidId();
        c0056a.L$0 = null;
        c0056a.L$1 = null;
        c0056a.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[PHI: r7 r8
      0x0071: PHI (r7v2 com.gamericefishpro.space.mf.d) = (r7v1 com.gamericefishpro.space.mf.d), (r7v1 com.gamericefishpro.space.mf.d), (r7v8 com.gamericefishpro.space.mf.d) binds: [B:22:0x0062, B:24:0x006e, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r8v4 com.gamericefishpro.space.sf.a) = (r8v3 com.gamericefishpro.space.sf.a), (r8v3 com.gamericefishpro.space.sf.a), (r8v9 com.gamericefishpro.space.sf.a) binds: [B:22:0x0062, B:24:0x006e, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r8.notificationReceived(r7, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postProcessNotification(com.gamericefishpro.space.mf.d dVar, boolean z, boolean z2, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        a aVar2;
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
        Object obj = bVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            bVar.L$0 = this;
            bVar.L$1 = dVar;
            bVar.Z$0 = z2;
            bVar.label = 1;
            if (saveNotification(dVar, z, bVar) != aVar3) {
                aVar2 = this;
            }
            return aVar3;
        }
        if (i2 == 1) {
            z2 = bVar.Z$0;
            dVar = (com.gamericefishpro.space.mf.d) bVar.L$1;
            aVar2 = (a) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        } else if (i2 == 2) {
            dVar = (com.gamericefishpro.space.mf.d) bVar.L$1;
            aVar2 = (a) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.tf.b bVar2 = aVar2._lifecycleService;
            bVar.L$0 = null;
            bVar.L$1 = null;
            bVar.label = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Unit.a;
        if (z2) {
            com.gamericefishpro.space.tf.b bVar3 = aVar2._lifecycleService;
            bVar.L$0 = null;
            bVar.L$1 = null;
            bVar.label = 3;
        } else {
            bVar.L$0 = aVar2;
            bVar.L$1 = dVar;
            bVar.label = 2;
            if (aVar2.markNotificationAsDismissed(dVar, bVar) != aVar3) {
                com.gamericefishpro.space.tf.b bVar4 = aVar2._lifecycleService;
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 3;
            }
        }
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object processCollapseKey(com.gamericefishpro.space.mf.d dVar, com.gamericefishpro.space.th.a aVar) {
        c cVar;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(aVar);
            }
        } else {
            cVar = new c(aVar);
        }
        Object androidIdFromCollapseKey = cVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(androidIdFromCollapseKey);
            if (dVar.isRestoring()) {
                return Unit.a;
            }
            if (!dVar.getJsonPayload().has("collapse_key") || "do_not_collapse".equals(dVar.getJsonPayload().optString("collapse_key"))) {
                return Unit.a;
            }
            String strOptString = dVar.getJsonPayload().optString("collapse_key");
            com.gamericefishpro.space.nf.d dVar2 = this._dataController;
            Intrinsics.b(strOptString);
            cVar.L$0 = dVar;
            cVar.label = 1;
            androidIdFromCollapseKey = dVar2.getAndroidIdFromCollapseKey(strOptString, cVar);
            if (androidIdFromCollapseKey == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (com.gamericefishpro.space.mf.d) cVar.L$0;
            com.gamericefishpro.space.wa.b.P(androidIdFromCollapseKey);
        }
        Integer num = (Integer) androidIdFromCollapseKey;
        if (num != null) {
            dVar.getNotification().setAndroidNotificationId(num.intValue());
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object processHandlerResponse(com.gamericefishpro.space.mf.d dVar, boolean z, boolean z2, com.gamericefishpro.space.th.a aVar) {
        d dVar2;
        a aVar2;
        if (aVar instanceof d) {
            dVar2 = (d) aVar;
            int i = dVar2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar2.label = i - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(aVar);
            }
        } else {
            dVar2 = new d(aVar);
        }
        Object obj = dVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = dVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            if (z) {
                boolean zIsStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getNotification().getBody());
                boolean zIsNotificationWithinTTL = isNotificationWithinTTL(dVar.getNotification());
                if (zIsStringNotEmpty && zIsNotificationWithinTTL) {
                    dVar2.L$0 = this;
                    dVar2.L$1 = dVar;
                    dVar2.label = 1;
                    if (processCollapseKey(dVar, dVar2) != aVar3) {
                        aVar2 = this;
                    }
                } else if (z2) {
                    dVar2.label = 2;
                    if (markNotificationAsDismissed(dVar, dVar2) == aVar3) {
                        return null;
                    }
                } else {
                    dVar.setNotificationToDisplay(false);
                    dVar2.label = 3;
                    if (postProcessNotification(dVar, true, false, dVar2) == aVar3) {
                        return null;
                    }
                }
            } else if (z2) {
                dVar2.label = 2;
                if (markNotificationAsDismissed(dVar, dVar2) == aVar3) {
                    return null;
                }
            } else {
                dVar.setNotificationToDisplay(false);
                dVar2.label = 3;
                if (postProcessNotification(dVar, true, false, dVar2) == aVar3) {
                    return null;
                }
            }
            return aVar3;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return null;
        }
        dVar = (com.gamericefishpro.space.mf.d) dVar2.L$1;
        aVar2 = (a) dVar2.L$0;
        com.gamericefishpro.space.wa.b.P(obj);
        if (!aVar2.shouldDisplayNotification(dVar)) {
            return Boolean.FALSE;
        }
        dVar.setNotificationToDisplay(true);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object saveNotification(com.gamericefishpro.space.mf.d dVar, boolean z, com.gamericefishpro.space.th.a aVar) {
        h hVar;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i = hVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.label = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(aVar);
            }
        } else {
            hVar = new h(aVar);
        }
        Object obj = hVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = hVar.label;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.od.b.debug$default("Saving Notification job: " + dVar, null, 2, null);
                JSONObject jsonPayload = dVar.getJsonPayload();
                JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                String strOptString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                long jOptLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + ((long) jsonPayload.optInt("google.ttl", 259200));
                com.gamericefishpro.space.nf.d dVar2 = this._dataController;
                String strOptString2 = customJSONObject.optString("i");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                String strSafeString = com.gamericefishpro.space.yb.d.safeString(jsonPayload, "grp");
                boolean zIsNotificationToDisplay = dVar.isNotificationToDisplay();
                int androidId = dVar.getAndroidId();
                String strValueOf = dVar.getTitle() != null ? String.valueOf(dVar.getTitle()) : null;
                String strValueOf2 = dVar.getBody() != null ? String.valueOf(dVar.getBody()) : null;
                String string = jsonPayload.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                hVar.label = 1;
                if (dVar2.createNotification(strOptString2, strSafeString, strOptString, zIsNotificationToDisplay, z, androidId, strValueOf, strValueOf2, jOptLong, string, hVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return Unit.a;
    }

    private final boolean shouldDisplayNotification(com.gamericefishpro.space.mf.d dVar) {
        return dVar.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(com.gamericefishpro.space.mf.d dVar) {
        if (!this._applicationService.isInForeground()) {
            com.gamericefishpro.space.od.b.info$default("App is in background, show notification", null, 2, null);
            return false;
        }
        if (!dVar.isRestoring()) {
            return true;
        }
        com.gamericefishpro.space.od.b.info$default("Not firing notificationWillShowInForegroundHandler for restored notifications", null, 2, null);
        return false;
    }

    public final JSONObject getCustomJSONObject(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString(com.gamericefishpro.space.mf.c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:131:0x0307 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x030a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0321 A[DONT_INVERT, PHI: r0
      0x0321: PHI (r0v68 boolean) = (r0v64 boolean), (r0v64 boolean), (r0v72 boolean) binds: [B:130:0x0305, B:135:0x031e, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x0323  */
    /* JADX WARN: Code duplicated, block: B:143:0x033b  */
    /* JADX WARN: Code duplicated, block: B:145:0x033e  */
    /* JADX WARN: Code duplicated, block: B:40:0x012d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0130  */
    /* JADX WARN: Code duplicated, block: B:44:0x0139  */
    /* JADX WARN: Code duplicated, block: B:47:0x014f  */
    /* JADX WARN: Code duplicated, block: B:50:0x015f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0162  */
    /* JADX WARN: Code duplicated, block: B:53:0x0166 A[PHI: r0 r2 r7 r8 r13 r14
      0x0166: PHI (r0v5 boolean) = (r0v2 boolean), (r0v19 boolean) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r2v9 com.gamericefishpro.space.ye.c) = (r2v7 com.gamericefishpro.space.ye.c), (r2v14 com.gamericefishpro.space.ye.c) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r7v5 com.gamericefishpro.space.sf.a) = (r7v2 com.gamericefishpro.space.sf.a), (r7v10 com.gamericefishpro.space.sf.a) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r8v4 org.json.JSONObject) = (r8v1 org.json.JSONObject), (r8v6 org.json.JSONObject) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r13v6 android.content.Context) = (r13v2 android.content.Context), (r13v16 android.content.Context) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r14v6 long) = (r14v1 long), (r14v12 long) binds: [B:43:0x0137, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0216  */
    /* JADX WARN: Code duplicated, block: B:83:0x021d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0223  */
    /* JADX WARN: Code duplicated, block: B:87:0x0229  */
    /* JADX WARN: Code duplicated, block: B:95:0x026b  */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02bf, code lost:
    
        if (r8 == r4) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0335, code lost:
    
        if (com.gamericefishpro.space.pi.a0.i(100, r3) == r4) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // com.gamericefishpro.space.rf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i, JSONObject jSONObject, boolean z, long j, com.gamericefishpro.space.th.a aVar) {
        e eVar;
        int i2;
        JSONObject jSONObject2;
        boolean z2;
        long j2;
        a aVar2;
        Context context2;
        com.gamericefishpro.space.ye.c cVar;
        Object objIsDuplicateNotification;
        com.gamericefishpro.space.ye.c cVar2;
        long j3;
        Context context3;
        JSONObject jSONObject3;
        boolean z3;
        com.gamericefishpro.space.mf.d dVar;
        w wVar;
        com.gamericefishpro.space.ye.c cVar3;
        w wVar2;
        com.gamericefishpro.space.mf.d dVar2;
        int i3;
        int i4;
        f fVar;
        com.gamericefishpro.space.ye.c cVar4;
        a aVar3;
        int i5;
        boolean z4;
        a aVar4;
        Object objProcessHandlerResponse;
        boolean z5;
        int i6;
        com.gamericefishpro.space.mf.d dVar3;
        Boolean bool;
        boolean zBooleanValue;
        boolean z6;
        a aVar5;
        int i7;
        com.gamericefishpro.space.mf.d dVar4;
        w wVar3;
        a aVar6;
        boolean z7;
        g gVar;
        a aVar7;
        w wVar4;
        int i8;
        boolean z8;
        com.gamericefishpro.space.mf.d dVar5;
        a aVar8;
        Object objProcessHandlerResponse2;
        ?? BooleanValue;
        Object objDisplayNotification;
        com.gamericefishpro.space.mf.d dVar6;
        Object obj;
        int i9;
        ?? r5;
        boolean z9;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(aVar);
            }
        } else {
            eVar = new e(aVar);
        }
        Object objCanReceiveNotification = eVar.result;
        com.gamericefishpro.space.uh.a aVar9 = com.gamericefishpro.space.uh.a.d;
        switch (eVar.label) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                com.gamericefishpro.space.tf.b bVar = this._lifecycleService;
                eVar.L$0 = this;
                eVar.L$1 = context;
                eVar.L$2 = jSONObject;
                i2 = i;
                eVar.I$0 = i2;
                eVar.Z$0 = z;
                eVar.J$0 = j;
                eVar.label = 1;
                objCanReceiveNotification = bVar.canReceiveNotification(jSONObject, eVar);
                if (objCanReceiveNotification != aVar9) {
                    jSONObject2 = jSONObject;
                    z2 = z;
                    j2 = j;
                    aVar2 = this;
                    context2 = context;
                    if (!((Boolean) objCanReceiveNotification).booleanValue()) {
                        return Unit.a;
                    }
                    cVar = new com.gamericefishpro.space.ye.c(null, jSONObject2, i2, aVar2._time);
                    if (!z2) {
                        z3 = z2;
                        dVar = new com.gamericefishpro.space.mf.d(cVar, jSONObject2);
                        dVar.setShownTimeStamp(new Long(j2));
                        dVar.setRestoring(z3);
                        wVar = new w();
                        wVar.d = true;
                        com.gamericefishpro.space.od.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                        cVar4 = cVar;
                        aVar3 = aVar2;
                        fVar = aVar3.new f(new com.gamericefishpro.space.ye.f(context2, cVar), wVar, cVar4, null);
                        wVar2 = wVar;
                        cVar3 = cVar4;
                        eVar.L$0 = aVar2;
                        eVar.L$1 = cVar3;
                        eVar.L$2 = dVar;
                        eVar.L$3 = wVar2;
                        eVar.Z$0 = z3;
                        eVar.I$0 = 0;
                        eVar.label = 3;
                        if (a0.E(30000L, fVar, eVar) != aVar9) {
                            dVar2 = dVar;
                            i5 = 0;
                            z4 = z3;
                            aVar4 = aVar2;
                            boolean z10 = wVar2.d;
                            eVar.L$0 = aVar4;
                            eVar.L$1 = cVar3;
                            eVar.L$2 = dVar2;
                            eVar.L$3 = wVar2;
                            eVar.Z$0 = z4;
                            eVar.I$0 = i5 == true ? 1 : 0;
                            eVar.label = 4;
                            objProcessHandlerResponse = aVar4.processHandlerResponse(dVar2, z10, z4, eVar);
                            if (objProcessHandlerResponse != aVar9) {
                                z5 = z4;
                                i6 = i5;
                                dVar3 = dVar2;
                                bool = (Boolean) objProcessHandlerResponse;
                                if (bool == null) {
                                    return Unit.a;
                                }
                                zBooleanValue = bool.booleanValue();
                                if (zBooleanValue) {
                                    z6 = z5;
                                    r5 = i6;
                                    if (!dVar3.isRestoring()) {
                                        if (r5 != 0) {
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.Z$0 = z6;
                                        eVar.label = 8;
                                        if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                            if (!z6) {
                                                return Unit.a;
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.label = 9;
                                        }
                                    } else {
                                        if (!z6) {
                                            return Unit.a;
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.label = 9;
                                    }
                                } else if (aVar4.shouldFireForegroundHandlers(dVar3)) {
                                    com.gamericefishpro.space.od.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                    wVar2.d = true;
                                    aVar7 = aVar4;
                                    wVar4 = wVar2;
                                    gVar = aVar7.new g(new com.gamericefishpro.space.ye.g(dVar3.getNotification()), wVar4, cVar3, null);
                                    aVar6 = aVar7;
                                    wVar3 = wVar4;
                                    eVar.L$0 = aVar6;
                                    eVar.L$1 = dVar3;
                                    eVar.L$2 = wVar3;
                                    eVar.L$3 = null;
                                    eVar.Z$0 = z5;
                                    eVar.I$0 = i6;
                                    eVar.label = 5;
                                    if (a0.E(30000L, gVar, eVar) != aVar9) {
                                        z7 = z5;
                                        i8 = i6;
                                        int i11 = i8;
                                        z8 = z7;
                                        dVar5 = dVar3;
                                        aVar8 = aVar6;
                                        boolean z11 = wVar3.d;
                                        eVar.L$0 = aVar8;
                                        eVar.L$1 = dVar5;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.Z$0 = z8;
                                        eVar.I$0 = i11;
                                        eVar.label = 6;
                                        objProcessHandlerResponse2 = aVar8.processHandlerResponse(dVar5, z11, z8, eVar);
                                        i9 = i11;
                                    }
                                } else {
                                    aVar5 = aVar4;
                                    i7 = i6;
                                    dVar4 = dVar3;
                                    if (!zBooleanValue) {
                                        com.gamericefishpro.space.pf.b bVar2 = aVar5._notificationDisplayer;
                                        eVar.L$0 = aVar5;
                                        eVar.L$1 = dVar4;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.Z$0 = z5;
                                        eVar.label = 7;
                                        objDisplayNotification = bVar2.displayNotification(dVar4, eVar);
                                        if (objDisplayNotification != aVar9) {
                                            dVar6 = dVar4;
                                            obj = objDisplayNotification;
                                            z6 = z5;
                                            dVar3 = dVar6;
                                            BooleanValue = ((Boolean) obj).booleanValue();
                                            aVar4 = aVar5;
                                            r5 = BooleanValue;
                                            if (!dVar3.isRestoring()) {
                                                if (r5 != 0) {
                                                }
                                                eVar.L$0 = null;
                                                eVar.L$1 = null;
                                                eVar.L$2 = null;
                                                eVar.L$3 = null;
                                                eVar.Z$0 = z6;
                                                eVar.label = 8;
                                                if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                                    if (!z6) {
                                                        return Unit.a;
                                                    }
                                                    eVar.L$0 = null;
                                                    eVar.L$1 = null;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.label = 9;
                                                }
                                            } else {
                                                if (!z6) {
                                                    return Unit.a;
                                                }
                                                eVar.L$0 = null;
                                                eVar.L$1 = null;
                                                eVar.L$2 = null;
                                                eVar.L$3 = null;
                                                eVar.label = 9;
                                            }
                                        }
                                    } else {
                                        dVar3 = dVar4;
                                        BooleanValue = i7;
                                        z6 = z5;
                                        aVar4 = aVar5;
                                        r5 = BooleanValue;
                                        if (!dVar3.isRestoring()) {
                                            if (r5 != 0) {
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.Z$0 = z6;
                                            eVar.label = 8;
                                            if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                                if (!z6) {
                                                    return Unit.a;
                                                }
                                                eVar.L$0 = null;
                                                eVar.L$1 = null;
                                                eVar.L$2 = null;
                                                eVar.L$3 = null;
                                                eVar.label = 9;
                                            }
                                        } else {
                                            if (!z6) {
                                                return Unit.a;
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.label = 9;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        eVar.L$0 = aVar2;
                        eVar.L$1 = context2;
                        eVar.L$2 = jSONObject2;
                        eVar.L$3 = cVar;
                        eVar.Z$0 = z2;
                        eVar.J$0 = j2;
                        eVar.label = 2;
                        objIsDuplicateNotification = aVar2.isDuplicateNotification(cVar, eVar);
                        if (objIsDuplicateNotification != aVar9) {
                            Context context4 = context2;
                            cVar2 = cVar;
                            objCanReceiveNotification = objIsDuplicateNotification;
                            j3 = j2;
                            context3 = context4;
                            jSONObject3 = jSONObject2;
                            if (((Boolean) objCanReceiveNotification).booleanValue()) {
                                return Unit.a;
                            }
                            cVar = cVar2;
                            jSONObject2 = jSONObject3;
                            context2 = context3;
                            j2 = j3;
                            z3 = z2;
                            dVar = new com.gamericefishpro.space.mf.d(cVar, jSONObject2);
                            dVar.setShownTimeStamp(new Long(j2));
                            dVar.setRestoring(z3);
                            wVar = new w();
                            wVar.d = true;
                            com.gamericefishpro.space.od.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                            try {
                                cVar4 = cVar;
                                aVar3 = aVar2;
                                try {
                                    fVar = aVar3.new f(new com.gamericefishpro.space.ye.f(context2, cVar), wVar, cVar4, null);
                                    wVar2 = wVar;
                                    cVar3 = cVar4;
                                    try {
                                        eVar.L$0 = aVar2;
                                        eVar.L$1 = cVar3;
                                        eVar.L$2 = dVar;
                                        eVar.L$3 = wVar2;
                                        eVar.Z$0 = z3;
                                        eVar.I$0 = 0;
                                        eVar.label = 3;
                                        if (a0.E(30000L, fVar, eVar) != aVar9) {
                                            dVar2 = dVar;
                                            i5 = 0;
                                            z4 = z3;
                                            aVar4 = aVar2;
                                            boolean z12 = wVar2.d;
                                            eVar.L$0 = aVar4;
                                            eVar.L$1 = cVar3;
                                            eVar.L$2 = dVar2;
                                            eVar.L$3 = wVar2;
                                            eVar.Z$0 = z4;
                                            eVar.I$0 = i5 == true ? 1 : 0;
                                            eVar.label = 4;
                                            objProcessHandlerResponse = aVar4.processHandlerResponse(dVar2, z12, z4, eVar);
                                            if (objProcessHandlerResponse != aVar9) {
                                                z5 = z4;
                                                i6 = i5;
                                                dVar3 = dVar2;
                                                bool = (Boolean) objProcessHandlerResponse;
                                                if (bool == null) {
                                                    return Unit.a;
                                                }
                                                zBooleanValue = bool.booleanValue();
                                                if (zBooleanValue) {
                                                    z6 = z5;
                                                    r5 = i6;
                                                    if (!dVar3.isRestoring()) {
                                                        if (r5 != 0) {
                                                        }
                                                        eVar.L$0 = null;
                                                        eVar.L$1 = null;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z6;
                                                        eVar.label = 8;
                                                        if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                                            if (!z6) {
                                                                return Unit.a;
                                                            }
                                                            eVar.L$0 = null;
                                                            eVar.L$1 = null;
                                                            eVar.L$2 = null;
                                                            eVar.L$3 = null;
                                                            eVar.label = 9;
                                                        }
                                                    } else {
                                                        if (!z6) {
                                                            return Unit.a;
                                                        }
                                                        eVar.L$0 = null;
                                                        eVar.L$1 = null;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.label = 9;
                                                    }
                                                } else if (aVar4.shouldFireForegroundHandlers(dVar3)) {
                                                    com.gamericefishpro.space.od.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                                    wVar2.d = true;
                                                    try {
                                                        aVar7 = aVar4;
                                                        wVar4 = wVar2;
                                                        try {
                                                            gVar = aVar7.new g(new com.gamericefishpro.space.ye.g(dVar3.getNotification()), wVar4, cVar3, null);
                                                            aVar6 = aVar7;
                                                            wVar3 = wVar4;
                                                            try {
                                                                eVar.L$0 = aVar6;
                                                                eVar.L$1 = dVar3;
                                                                eVar.L$2 = wVar3;
                                                                eVar.L$3 = null;
                                                                eVar.Z$0 = z5;
                                                                eVar.I$0 = i6;
                                                                eVar.label = 5;
                                                                if (a0.E(30000L, gVar, eVar) != aVar9) {
                                                                    z7 = z5;
                                                                    i8 = i6;
                                                                    int i12 = i8;
                                                                    z8 = z7;
                                                                    dVar5 = dVar3;
                                                                    aVar8 = aVar6;
                                                                    boolean z13 = wVar3.d;
                                                                    eVar.L$0 = aVar8;
                                                                    eVar.L$1 = dVar5;
                                                                    eVar.L$2 = null;
                                                                    eVar.L$3 = null;
                                                                    eVar.Z$0 = z8;
                                                                    eVar.I$0 = i12;
                                                                    eVar.label = 6;
                                                                    objProcessHandlerResponse2 = aVar8.processHandlerResponse(dVar5, z13, z8, eVar);
                                                                    i9 = i12;
                                                                }
                                                            } catch (y1 e2) {
                                                                e = e2;
                                                                z7 = z5;
                                                                com.gamericefishpro.space.od.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + wVar3.d + '.', e);
                                                                i8 = i6;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                z7 = z5;
                                                                com.gamericefishpro.space.od.b.error("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                                                                i8 = i6;
                                                            }
                                                        } catch (y1 e3) {
                                                            e = e3;
                                                            aVar6 = aVar7;
                                                            wVar3 = wVar4;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            aVar6 = aVar7;
                                                            wVar3 = wVar4;
                                                        }
                                                    } catch (y1 e4) {
                                                        e = e4;
                                                        wVar3 = wVar2;
                                                        aVar6 = aVar4;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        wVar3 = wVar2;
                                                        aVar6 = aVar4;
                                                    }
                                                } else {
                                                    aVar5 = aVar4;
                                                    i7 = i6;
                                                    dVar4 = dVar3;
                                                    if (!zBooleanValue) {
                                                        com.gamericefishpro.space.pf.b bVar3 = aVar5._notificationDisplayer;
                                                        eVar.L$0 = aVar5;
                                                        eVar.L$1 = dVar4;
                                                        eVar.L$2 = null;
                                                        eVar.L$3 = null;
                                                        eVar.Z$0 = z5;
                                                        eVar.label = 7;
                                                        objDisplayNotification = bVar3.displayNotification(dVar4, eVar);
                                                        if (objDisplayNotification != aVar9) {
                                                            dVar6 = dVar4;
                                                            obj = objDisplayNotification;
                                                            z6 = z5;
                                                            dVar3 = dVar6;
                                                            BooleanValue = ((Boolean) obj).booleanValue();
                                                            aVar4 = aVar5;
                                                            r5 = BooleanValue;
                                                            if (!dVar3.isRestoring()) {
                                                                z9 = r5 != 0;
                                                                eVar.L$0 = null;
                                                                eVar.L$1 = null;
                                                                eVar.L$2 = null;
                                                                eVar.L$3 = null;
                                                                eVar.Z$0 = z6;
                                                                eVar.label = 8;
                                                                if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                                                    if (!z6) {
                                                                        return Unit.a;
                                                                    }
                                                                    eVar.L$0 = null;
                                                                    eVar.L$1 = null;
                                                                    eVar.L$2 = null;
                                                                    eVar.L$3 = null;
                                                                    eVar.label = 9;
                                                                }
                                                            } else {
                                                                if (!z6) {
                                                                    return Unit.a;
                                                                }
                                                                eVar.L$0 = null;
                                                                eVar.L$1 = null;
                                                                eVar.L$2 = null;
                                                                eVar.L$3 = null;
                                                                eVar.label = 9;
                                                            }
                                                        }
                                                    } else {
                                                        dVar3 = dVar4;
                                                        BooleanValue = i7;
                                                        z6 = z5;
                                                        aVar4 = aVar5;
                                                        r5 = BooleanValue;
                                                        if (!dVar3.isRestoring()) {
                                                            if (r5 != 0) {
                                                            }
                                                            eVar.L$0 = null;
                                                            eVar.L$1 = null;
                                                            eVar.L$2 = null;
                                                            eVar.L$3 = null;
                                                            eVar.Z$0 = z6;
                                                            eVar.label = 8;
                                                            if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                                                if (!z6) {
                                                                    return Unit.a;
                                                                }
                                                                eVar.L$0 = null;
                                                                eVar.L$1 = null;
                                                                eVar.L$2 = null;
                                                                eVar.L$3 = null;
                                                                eVar.label = 9;
                                                            }
                                                        } else {
                                                            if (!z6) {
                                                                return Unit.a;
                                                            }
                                                            eVar.L$0 = null;
                                                            eVar.L$1 = null;
                                                            eVar.L$2 = null;
                                                            eVar.L$3 = null;
                                                            eVar.label = 9;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (y1 e5) {
                                        e = e5;
                                        dVar2 = dVar;
                                        i4 = 0;
                                        com.gamericefishpro.space.od.b.error("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + wVar2.d + '.', e);
                                        i5 = i4;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        dVar2 = dVar;
                                        i3 = 0;
                                        com.gamericefishpro.space.od.b.error("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                        i5 = i3;
                                    }
                                } catch (y1 e6) {
                                    e = e6;
                                    aVar2 = aVar3;
                                    wVar2 = wVar;
                                    cVar3 = cVar4;
                                } catch (Throwable th5) {
                                    th = th5;
                                    aVar2 = aVar3;
                                    wVar2 = wVar;
                                    cVar3 = cVar4;
                                }
                            } catch (y1 e7) {
                                e = e7;
                                cVar3 = cVar;
                                wVar2 = wVar;
                            } catch (Throwable th6) {
                                th = th6;
                                cVar3 = cVar;
                                wVar2 = wVar;
                            }
                        }
                    }
                    break;
                }
                return aVar9;
            case 1:
                long j4 = eVar.J$0;
                z2 = eVar.Z$0;
                int i13 = eVar.I$0;
                jSONObject2 = (JSONObject) eVar.L$2;
                context2 = (Context) eVar.L$1;
                a aVar10 = (a) eVar.L$0;
                com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                i2 = i13;
                aVar2 = aVar10;
                j2 = j4;
                if (!((Boolean) objCanReceiveNotification).booleanValue()) {
                    return Unit.a;
                }
                cVar = new com.gamericefishpro.space.ye.c(null, jSONObject2, i2, aVar2._time);
                if (!z2) {
                    z3 = z2;
                    dVar = new com.gamericefishpro.space.mf.d(cVar, jSONObject2);
                    dVar.setShownTimeStamp(new Long(j2));
                    dVar.setRestoring(z3);
                    wVar = new w();
                    wVar.d = true;
                    com.gamericefishpro.space.od.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                    cVar4 = cVar;
                    aVar3 = aVar2;
                    fVar = aVar3.new f(new com.gamericefishpro.space.ye.f(context2, cVar), wVar, cVar4, null);
                    wVar2 = wVar;
                    cVar3 = cVar4;
                    eVar.L$0 = aVar2;
                    eVar.L$1 = cVar3;
                    eVar.L$2 = dVar;
                    eVar.L$3 = wVar2;
                    eVar.Z$0 = z3;
                    eVar.I$0 = 0;
                    eVar.label = 3;
                    if (a0.E(30000L, fVar, eVar) != aVar9) {
                        dVar2 = dVar;
                        i5 = 0;
                        z4 = z3;
                        aVar4 = aVar2;
                        boolean z14 = wVar2.d;
                        eVar.L$0 = aVar4;
                        eVar.L$1 = cVar3;
                        eVar.L$2 = dVar2;
                        eVar.L$3 = wVar2;
                        eVar.Z$0 = z4;
                        eVar.I$0 = i5 == true ? 1 : 0;
                        eVar.label = 4;
                        objProcessHandlerResponse = aVar4.processHandlerResponse(dVar2, z14, z4, eVar);
                        if (objProcessHandlerResponse != aVar9) {
                            z5 = z4;
                            i6 = i5;
                            dVar3 = dVar2;
                            bool = (Boolean) objProcessHandlerResponse;
                            if (bool == null) {
                                return Unit.a;
                            }
                            zBooleanValue = bool.booleanValue();
                            if (zBooleanValue) {
                                z6 = z5;
                                r5 = i6;
                                if (!dVar3.isRestoring()) {
                                    if (r5 != 0) {
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.Z$0 = z6;
                                    eVar.label = 8;
                                    if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                        if (!z6) {
                                            return Unit.a;
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.label = 9;
                                    }
                                } else {
                                    if (!z6) {
                                        return Unit.a;
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.label = 9;
                                }
                            } else if (aVar4.shouldFireForegroundHandlers(dVar3)) {
                                com.gamericefishpro.space.od.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                wVar2.d = true;
                                aVar7 = aVar4;
                                wVar4 = wVar2;
                                gVar = aVar7.new g(new com.gamericefishpro.space.ye.g(dVar3.getNotification()), wVar4, cVar3, null);
                                aVar6 = aVar7;
                                wVar3 = wVar4;
                                eVar.L$0 = aVar6;
                                eVar.L$1 = dVar3;
                                eVar.L$2 = wVar3;
                                eVar.L$3 = null;
                                eVar.Z$0 = z5;
                                eVar.I$0 = i6;
                                eVar.label = 5;
                                if (a0.E(30000L, gVar, eVar) != aVar9) {
                                    z7 = z5;
                                    i8 = i6;
                                    int i14 = i8;
                                    z8 = z7;
                                    dVar5 = dVar3;
                                    aVar8 = aVar6;
                                    boolean z15 = wVar3.d;
                                    eVar.L$0 = aVar8;
                                    eVar.L$1 = dVar5;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.Z$0 = z8;
                                    eVar.I$0 = i14;
                                    eVar.label = 6;
                                    objProcessHandlerResponse2 = aVar8.processHandlerResponse(dVar5, z15, z8, eVar);
                                    i9 = i14;
                                }
                            } else {
                                aVar5 = aVar4;
                                i7 = i6;
                                dVar4 = dVar3;
                                if (!zBooleanValue) {
                                    com.gamericefishpro.space.pf.b bVar4 = aVar5._notificationDisplayer;
                                    eVar.L$0 = aVar5;
                                    eVar.L$1 = dVar4;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.Z$0 = z5;
                                    eVar.label = 7;
                                    objDisplayNotification = bVar4.displayNotification(dVar4, eVar);
                                    if (objDisplayNotification != aVar9) {
                                        dVar6 = dVar4;
                                        obj = objDisplayNotification;
                                        z6 = z5;
                                        dVar3 = dVar6;
                                        BooleanValue = ((Boolean) obj).booleanValue();
                                        aVar4 = aVar5;
                                        r5 = BooleanValue;
                                        if (!dVar3.isRestoring()) {
                                            if (r5 != 0) {
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.Z$0 = z6;
                                            eVar.label = 8;
                                            if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                                if (!z6) {
                                                    return Unit.a;
                                                }
                                                eVar.L$0 = null;
                                                eVar.L$1 = null;
                                                eVar.L$2 = null;
                                                eVar.L$3 = null;
                                                eVar.label = 9;
                                            }
                                        } else {
                                            if (!z6) {
                                                return Unit.a;
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.label = 9;
                                        }
                                    }
                                } else {
                                    dVar3 = dVar4;
                                    BooleanValue = i7;
                                    z6 = z5;
                                    aVar4 = aVar5;
                                    r5 = BooleanValue;
                                    if (!dVar3.isRestoring()) {
                                        if (r5 != 0) {
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.Z$0 = z6;
                                        eVar.label = 8;
                                        if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                            if (!z6) {
                                                return Unit.a;
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.label = 9;
                                        }
                                    } else {
                                        if (!z6) {
                                            return Unit.a;
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.label = 9;
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    eVar.L$0 = aVar2;
                    eVar.L$1 = context2;
                    eVar.L$2 = jSONObject2;
                    eVar.L$3 = cVar;
                    eVar.Z$0 = z2;
                    eVar.J$0 = j2;
                    eVar.label = 2;
                    objIsDuplicateNotification = aVar2.isDuplicateNotification(cVar, eVar);
                    if (objIsDuplicateNotification != aVar9) {
                        Context context5 = context2;
                        cVar2 = cVar;
                        objCanReceiveNotification = objIsDuplicateNotification;
                        j3 = j2;
                        context3 = context5;
                        jSONObject3 = jSONObject2;
                        if (((Boolean) objCanReceiveNotification).booleanValue()) {
                            return Unit.a;
                        }
                        cVar = cVar2;
                        jSONObject2 = jSONObject3;
                        context2 = context3;
                        j2 = j3;
                        z3 = z2;
                        dVar = new com.gamericefishpro.space.mf.d(cVar, jSONObject2);
                        dVar.setShownTimeStamp(new Long(j2));
                        dVar.setRestoring(z3);
                        wVar = new w();
                        wVar.d = true;
                        com.gamericefishpro.space.od.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                        cVar4 = cVar;
                        aVar3 = aVar2;
                        fVar = aVar3.new f(new com.gamericefishpro.space.ye.f(context2, cVar), wVar, cVar4, null);
                        wVar2 = wVar;
                        cVar3 = cVar4;
                        eVar.L$0 = aVar2;
                        eVar.L$1 = cVar3;
                        eVar.L$2 = dVar;
                        eVar.L$3 = wVar2;
                        eVar.Z$0 = z3;
                        eVar.I$0 = 0;
                        eVar.label = 3;
                        if (a0.E(30000L, fVar, eVar) != aVar9) {
                            dVar2 = dVar;
                            i5 = 0;
                            z4 = z3;
                            aVar4 = aVar2;
                            boolean z16 = wVar2.d;
                            eVar.L$0 = aVar4;
                            eVar.L$1 = cVar3;
                            eVar.L$2 = dVar2;
                            eVar.L$3 = wVar2;
                            eVar.Z$0 = z4;
                            eVar.I$0 = i5 == true ? 1 : 0;
                            eVar.label = 4;
                            objProcessHandlerResponse = aVar4.processHandlerResponse(dVar2, z16, z4, eVar);
                            if (objProcessHandlerResponse != aVar9) {
                                z5 = z4;
                                i6 = i5;
                                dVar3 = dVar2;
                                bool = (Boolean) objProcessHandlerResponse;
                                if (bool == null) {
                                    return Unit.a;
                                }
                                zBooleanValue = bool.booleanValue();
                                if (zBooleanValue) {
                                    z6 = z5;
                                    r5 = i6;
                                    if (!dVar3.isRestoring()) {
                                        if (r5 != 0) {
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.Z$0 = z6;
                                        eVar.label = 8;
                                        if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                            if (!z6) {
                                                return Unit.a;
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.label = 9;
                                        }
                                    } else {
                                        if (!z6) {
                                            return Unit.a;
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.label = 9;
                                    }
                                } else if (aVar4.shouldFireForegroundHandlers(dVar3)) {
                                    com.gamericefishpro.space.od.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                    wVar2.d = true;
                                    aVar7 = aVar4;
                                    wVar4 = wVar2;
                                    gVar = aVar7.new g(new com.gamericefishpro.space.ye.g(dVar3.getNotification()), wVar4, cVar3, null);
                                    aVar6 = aVar7;
                                    wVar3 = wVar4;
                                    eVar.L$0 = aVar6;
                                    eVar.L$1 = dVar3;
                                    eVar.L$2 = wVar3;
                                    eVar.L$3 = null;
                                    eVar.Z$0 = z5;
                                    eVar.I$0 = i6;
                                    eVar.label = 5;
                                    if (a0.E(30000L, gVar, eVar) != aVar9) {
                                        z7 = z5;
                                        i8 = i6;
                                        int i15 = i8;
                                        z8 = z7;
                                        dVar5 = dVar3;
                                        aVar8 = aVar6;
                                        boolean z17 = wVar3.d;
                                        eVar.L$0 = aVar8;
                                        eVar.L$1 = dVar5;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.Z$0 = z8;
                                        eVar.I$0 = i15;
                                        eVar.label = 6;
                                        objProcessHandlerResponse2 = aVar8.processHandlerResponse(dVar5, z17, z8, eVar);
                                        i9 = i15;
                                    }
                                } else {
                                    aVar5 = aVar4;
                                    i7 = i6;
                                    dVar4 = dVar3;
                                    if (!zBooleanValue) {
                                        com.gamericefishpro.space.pf.b bVar5 = aVar5._notificationDisplayer;
                                        eVar.L$0 = aVar5;
                                        eVar.L$1 = dVar4;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.Z$0 = z5;
                                        eVar.label = 7;
                                        objDisplayNotification = bVar5.displayNotification(dVar4, eVar);
                                        if (objDisplayNotification != aVar9) {
                                            dVar6 = dVar4;
                                            obj = objDisplayNotification;
                                            z6 = z5;
                                            dVar3 = dVar6;
                                            BooleanValue = ((Boolean) obj).booleanValue();
                                            aVar4 = aVar5;
                                            r5 = BooleanValue;
                                            if (!dVar3.isRestoring()) {
                                                if (r5 != 0) {
                                                }
                                                eVar.L$0 = null;
                                                eVar.L$1 = null;
                                                eVar.L$2 = null;
                                                eVar.L$3 = null;
                                                eVar.Z$0 = z6;
                                                eVar.label = 8;
                                                if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                                    if (!z6) {
                                                        return Unit.a;
                                                    }
                                                    eVar.L$0 = null;
                                                    eVar.L$1 = null;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.label = 9;
                                                }
                                            } else {
                                                if (!z6) {
                                                    return Unit.a;
                                                }
                                                eVar.L$0 = null;
                                                eVar.L$1 = null;
                                                eVar.L$2 = null;
                                                eVar.L$3 = null;
                                                eVar.label = 9;
                                            }
                                        }
                                    } else {
                                        dVar3 = dVar4;
                                        BooleanValue = i7;
                                        z6 = z5;
                                        aVar4 = aVar5;
                                        r5 = BooleanValue;
                                        if (!dVar3.isRestoring()) {
                                            if (r5 != 0) {
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.Z$0 = z6;
                                            eVar.label = 8;
                                            if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                                if (!z6) {
                                                    return Unit.a;
                                                }
                                                eVar.L$0 = null;
                                                eVar.L$1 = null;
                                                eVar.L$2 = null;
                                                eVar.L$3 = null;
                                                eVar.label = 9;
                                            }
                                        } else {
                                            if (!z6) {
                                                return Unit.a;
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.label = 9;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar9;
            case 2:
                j3 = eVar.J$0;
                z2 = eVar.Z$0;
                cVar2 = (com.gamericefishpro.space.ye.c) eVar.L$3;
                jSONObject3 = (JSONObject) eVar.L$2;
                context3 = (Context) eVar.L$1;
                aVar2 = (a) eVar.L$0;
                com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                if (((Boolean) objCanReceiveNotification).booleanValue()) {
                    return Unit.a;
                }
                cVar = cVar2;
                jSONObject2 = jSONObject3;
                context2 = context3;
                j2 = j3;
                z3 = z2;
                dVar = new com.gamericefishpro.space.mf.d(cVar, jSONObject2);
                dVar.setShownTimeStamp(new Long(j2));
                dVar.setRestoring(z3);
                wVar = new w();
                wVar.d = true;
                com.gamericefishpro.space.od.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                cVar4 = cVar;
                aVar3 = aVar2;
                fVar = aVar3.new f(new com.gamericefishpro.space.ye.f(context2, cVar), wVar, cVar4, null);
                wVar2 = wVar;
                cVar3 = cVar4;
                eVar.L$0 = aVar2;
                eVar.L$1 = cVar3;
                eVar.L$2 = dVar;
                eVar.L$3 = wVar2;
                eVar.Z$0 = z3;
                eVar.I$0 = 0;
                eVar.label = 3;
                if (a0.E(30000L, fVar, eVar) != aVar9) {
                    dVar2 = dVar;
                    i5 = 0;
                    z4 = z3;
                    aVar4 = aVar2;
                    boolean z18 = wVar2.d;
                    eVar.L$0 = aVar4;
                    eVar.L$1 = cVar3;
                    eVar.L$2 = dVar2;
                    eVar.L$3 = wVar2;
                    eVar.Z$0 = z4;
                    eVar.I$0 = i5 == true ? 1 : 0;
                    eVar.label = 4;
                    objProcessHandlerResponse = aVar4.processHandlerResponse(dVar2, z18, z4, eVar);
                    if (objProcessHandlerResponse != aVar9) {
                        z5 = z4;
                        i6 = i5;
                        dVar3 = dVar2;
                        bool = (Boolean) objProcessHandlerResponse;
                        if (bool == null) {
                            return Unit.a;
                        }
                        zBooleanValue = bool.booleanValue();
                        if (zBooleanValue) {
                            z6 = z5;
                            r5 = i6;
                            if (!dVar3.isRestoring()) {
                                if (r5 != 0) {
                                }
                                eVar.L$0 = null;
                                eVar.L$1 = null;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.Z$0 = z6;
                                eVar.label = 8;
                                if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                    if (!z6) {
                                        return Unit.a;
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.label = 9;
                                }
                            } else {
                                if (!z6) {
                                    return Unit.a;
                                }
                                eVar.L$0 = null;
                                eVar.L$1 = null;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.label = 9;
                            }
                        } else if (aVar4.shouldFireForegroundHandlers(dVar3)) {
                            com.gamericefishpro.space.od.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                            wVar2.d = true;
                            aVar7 = aVar4;
                            wVar4 = wVar2;
                            gVar = aVar7.new g(new com.gamericefishpro.space.ye.g(dVar3.getNotification()), wVar4, cVar3, null);
                            aVar6 = aVar7;
                            wVar3 = wVar4;
                            eVar.L$0 = aVar6;
                            eVar.L$1 = dVar3;
                            eVar.L$2 = wVar3;
                            eVar.L$3 = null;
                            eVar.Z$0 = z5;
                            eVar.I$0 = i6;
                            eVar.label = 5;
                            if (a0.E(30000L, gVar, eVar) != aVar9) {
                                z7 = z5;
                                i8 = i6;
                                int i16 = i8;
                                z8 = z7;
                                dVar5 = dVar3;
                                aVar8 = aVar6;
                                boolean z19 = wVar3.d;
                                eVar.L$0 = aVar8;
                                eVar.L$1 = dVar5;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.Z$0 = z8;
                                eVar.I$0 = i16;
                                eVar.label = 6;
                                objProcessHandlerResponse2 = aVar8.processHandlerResponse(dVar5, z19, z8, eVar);
                                i9 = i16;
                            }
                        } else {
                            aVar5 = aVar4;
                            i7 = i6;
                            dVar4 = dVar3;
                            if (!zBooleanValue) {
                                com.gamericefishpro.space.pf.b bVar6 = aVar5._notificationDisplayer;
                                eVar.L$0 = aVar5;
                                eVar.L$1 = dVar4;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.Z$0 = z5;
                                eVar.label = 7;
                                objDisplayNotification = bVar6.displayNotification(dVar4, eVar);
                                if (objDisplayNotification != aVar9) {
                                    dVar6 = dVar4;
                                    obj = objDisplayNotification;
                                    z6 = z5;
                                    dVar3 = dVar6;
                                    BooleanValue = ((Boolean) obj).booleanValue();
                                    aVar4 = aVar5;
                                    r5 = BooleanValue;
                                    if (!dVar3.isRestoring()) {
                                        if (r5 != 0) {
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.Z$0 = z6;
                                        eVar.label = 8;
                                        if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                            if (!z6) {
                                                return Unit.a;
                                            }
                                            eVar.L$0 = null;
                                            eVar.L$1 = null;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.label = 9;
                                        }
                                    } else {
                                        if (!z6) {
                                            return Unit.a;
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.label = 9;
                                    }
                                }
                            } else {
                                dVar3 = dVar4;
                                BooleanValue = i7;
                                z6 = z5;
                                aVar4 = aVar5;
                                r5 = BooleanValue;
                                if (!dVar3.isRestoring()) {
                                    if (r5 != 0) {
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.Z$0 = z6;
                                    eVar.label = 8;
                                    if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                        if (!z6) {
                                            return Unit.a;
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.label = 9;
                                    }
                                } else {
                                    if (!z6) {
                                        return Unit.a;
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.label = 9;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar9;
            case 3:
                int i17 = eVar.I$0;
                z3 = eVar.Z$0;
                wVar2 = (w) eVar.L$3;
                dVar2 = (com.gamericefishpro.space.mf.d) eVar.L$2;
                cVar3 = (com.gamericefishpro.space.ye.c) eVar.L$1;
                a aVar11 = (a) eVar.L$0;
                try {
                    com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                    aVar2 = aVar11;
                    i5 = i17;
                } catch (y1 e8) {
                    e = e8;
                    aVar2 = aVar11;
                    i4 = i17;
                    com.gamericefishpro.space.od.b.error("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + wVar2.d + '.', e);
                    i5 = i4;
                } catch (Throwable th7) {
                    th = th7;
                    aVar2 = aVar11;
                    i3 = i17;
                    com.gamericefishpro.space.od.b.error("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                    i5 = i3;
                }
                z4 = z3;
                aVar4 = aVar2;
                boolean z110 = wVar2.d;
                eVar.L$0 = aVar4;
                eVar.L$1 = cVar3;
                eVar.L$2 = dVar2;
                eVar.L$3 = wVar2;
                eVar.Z$0 = z4;
                eVar.I$0 = i5 == true ? 1 : 0;
                eVar.label = 4;
                objProcessHandlerResponse = aVar4.processHandlerResponse(dVar2, z110, z4, eVar);
                if (objProcessHandlerResponse != aVar9) {
                    z5 = z4;
                    i6 = i5;
                    dVar3 = dVar2;
                    bool = (Boolean) objProcessHandlerResponse;
                    if (bool == null) {
                        return Unit.a;
                    }
                    zBooleanValue = bool.booleanValue();
                    if (zBooleanValue) {
                        z6 = z5;
                        r5 = i6;
                        if (!dVar3.isRestoring()) {
                            if (r5 != 0) {
                            }
                            eVar.L$0 = null;
                            eVar.L$1 = null;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z6;
                            eVar.label = 8;
                            if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                if (!z6) {
                                    return Unit.a;
                                }
                                eVar.L$0 = null;
                                eVar.L$1 = null;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.label = 9;
                            }
                        } else {
                            if (!z6) {
                                return Unit.a;
                            }
                            eVar.L$0 = null;
                            eVar.L$1 = null;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.label = 9;
                        }
                    } else if (aVar4.shouldFireForegroundHandlers(dVar3)) {
                        com.gamericefishpro.space.od.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                        wVar2.d = true;
                        aVar7 = aVar4;
                        wVar4 = wVar2;
                        gVar = aVar7.new g(new com.gamericefishpro.space.ye.g(dVar3.getNotification()), wVar4, cVar3, null);
                        aVar6 = aVar7;
                        wVar3 = wVar4;
                        eVar.L$0 = aVar6;
                        eVar.L$1 = dVar3;
                        eVar.L$2 = wVar3;
                        eVar.L$3 = null;
                        eVar.Z$0 = z5;
                        eVar.I$0 = i6;
                        eVar.label = 5;
                        if (a0.E(30000L, gVar, eVar) != aVar9) {
                            z7 = z5;
                            i8 = i6;
                            int i18 = i8;
                            z8 = z7;
                            dVar5 = dVar3;
                            aVar8 = aVar6;
                            boolean z111 = wVar3.d;
                            eVar.L$0 = aVar8;
                            eVar.L$1 = dVar5;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z8;
                            eVar.I$0 = i18;
                            eVar.label = 6;
                            objProcessHandlerResponse2 = aVar8.processHandlerResponse(dVar5, z111, z8, eVar);
                            i9 = i18;
                        }
                    } else {
                        aVar5 = aVar4;
                        i7 = i6;
                        dVar4 = dVar3;
                        if (!zBooleanValue) {
                            com.gamericefishpro.space.pf.b bVar7 = aVar5._notificationDisplayer;
                            eVar.L$0 = aVar5;
                            eVar.L$1 = dVar4;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z5;
                            eVar.label = 7;
                            objDisplayNotification = bVar7.displayNotification(dVar4, eVar);
                            if (objDisplayNotification != aVar9) {
                                dVar6 = dVar4;
                                obj = objDisplayNotification;
                                z6 = z5;
                                dVar3 = dVar6;
                                BooleanValue = ((Boolean) obj).booleanValue();
                                aVar4 = aVar5;
                                r5 = BooleanValue;
                                if (!dVar3.isRestoring()) {
                                    if (r5 != 0) {
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.Z$0 = z6;
                                    eVar.label = 8;
                                    if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                        if (!z6) {
                                            return Unit.a;
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.label = 9;
                                    }
                                } else {
                                    if (!z6) {
                                        return Unit.a;
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.label = 9;
                                }
                            }
                        } else {
                            dVar3 = dVar4;
                            BooleanValue = i7;
                            z6 = z5;
                            aVar4 = aVar5;
                            r5 = BooleanValue;
                            if (!dVar3.isRestoring()) {
                                if (r5 != 0) {
                                }
                                eVar.L$0 = null;
                                eVar.L$1 = null;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.Z$0 = z6;
                                eVar.label = 8;
                                if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                    if (!z6) {
                                        return Unit.a;
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.label = 9;
                                }
                            } else {
                                if (!z6) {
                                    return Unit.a;
                                }
                                eVar.L$0 = null;
                                eVar.L$1 = null;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.label = 9;
                            }
                        }
                    }
                    break;
                }
                return aVar9;
            case 4:
                int i19 = eVar.I$0;
                boolean z20 = eVar.Z$0;
                wVar2 = (w) eVar.L$3;
                dVar2 = (com.gamericefishpro.space.mf.d) eVar.L$2;
                cVar3 = (com.gamericefishpro.space.ye.c) eVar.L$1;
                aVar4 = (a) eVar.L$0;
                com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                objProcessHandlerResponse = objCanReceiveNotification;
                z5 = z20;
                i6 = i19;
                dVar3 = dVar2;
                bool = (Boolean) objProcessHandlerResponse;
                if (bool == null) {
                    return Unit.a;
                }
                zBooleanValue = bool.booleanValue();
                if (zBooleanValue) {
                    if (aVar4.shouldFireForegroundHandlers(dVar3)) {
                        com.gamericefishpro.space.od.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                        wVar2.d = true;
                        aVar7 = aVar4;
                        wVar4 = wVar2;
                        gVar = aVar7.new g(new com.gamericefishpro.space.ye.g(dVar3.getNotification()), wVar4, cVar3, null);
                        aVar6 = aVar7;
                        wVar3 = wVar4;
                        eVar.L$0 = aVar6;
                        eVar.L$1 = dVar3;
                        eVar.L$2 = wVar3;
                        eVar.L$3 = null;
                        eVar.Z$0 = z5;
                        eVar.I$0 = i6;
                        eVar.label = 5;
                        if (a0.E(30000L, gVar, eVar) != aVar9) {
                            z7 = z5;
                            i8 = i6;
                            int i110 = i8;
                            z8 = z7;
                            dVar5 = dVar3;
                            aVar8 = aVar6;
                            boolean z112 = wVar3.d;
                            eVar.L$0 = aVar8;
                            eVar.L$1 = dVar5;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z8;
                            eVar.I$0 = i110;
                            eVar.label = 6;
                            objProcessHandlerResponse2 = aVar8.processHandlerResponse(dVar5, z112, z8, eVar);
                            i9 = i110;
                        }
                    } else {
                        aVar5 = aVar4;
                        i7 = i6;
                        dVar4 = dVar3;
                        if (!zBooleanValue) {
                            com.gamericefishpro.space.pf.b bVar8 = aVar5._notificationDisplayer;
                            eVar.L$0 = aVar5;
                            eVar.L$1 = dVar4;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z5;
                            eVar.label = 7;
                            objDisplayNotification = bVar8.displayNotification(dVar4, eVar);
                            if (objDisplayNotification != aVar9) {
                                dVar6 = dVar4;
                                obj = objDisplayNotification;
                                z6 = z5;
                                dVar3 = dVar6;
                                BooleanValue = ((Boolean) obj).booleanValue();
                                aVar4 = aVar5;
                                r5 = BooleanValue;
                                if (!dVar3.isRestoring()) {
                                    if (r5 != 0) {
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.Z$0 = z6;
                                    eVar.label = 8;
                                    if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                        if (!z6) {
                                            return Unit.a;
                                        }
                                        eVar.L$0 = null;
                                        eVar.L$1 = null;
                                        eVar.L$2 = null;
                                        eVar.L$3 = null;
                                        eVar.label = 9;
                                    }
                                } else {
                                    if (!z6) {
                                        return Unit.a;
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.label = 9;
                                }
                            }
                        } else {
                            dVar3 = dVar4;
                            BooleanValue = i7;
                            z6 = z5;
                            aVar4 = aVar5;
                            r5 = BooleanValue;
                            if (!dVar3.isRestoring()) {
                                if (r5 != 0) {
                                }
                                eVar.L$0 = null;
                                eVar.L$1 = null;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.Z$0 = z6;
                                eVar.label = 8;
                                if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                    if (!z6) {
                                        return Unit.a;
                                    }
                                    eVar.L$0 = null;
                                    eVar.L$1 = null;
                                    eVar.L$2 = null;
                                    eVar.L$3 = null;
                                    eVar.label = 9;
                                }
                            } else {
                                if (!z6) {
                                    return Unit.a;
                                }
                                eVar.L$0 = null;
                                eVar.L$1 = null;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.label = 9;
                            }
                        }
                    }
                    break;
                } else {
                    z6 = z5;
                    r5 = i6;
                    if (!dVar3.isRestoring()) {
                        if (r5 != 0) {
                        }
                        eVar.L$0 = null;
                        eVar.L$1 = null;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.Z$0 = z6;
                        eVar.label = 8;
                        if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                            if (!z6) {
                                return Unit.a;
                            }
                            eVar.L$0 = null;
                            eVar.L$1 = null;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.label = 9;
                        }
                    } else {
                        if (!z6) {
                            return Unit.a;
                        }
                        eVar.L$0 = null;
                        eVar.L$1 = null;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.label = 9;
                    }
                    break;
                }
                return aVar9;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                i6 = eVar.I$0;
                z7 = eVar.Z$0;
                wVar3 = (w) eVar.L$2;
                dVar3 = (com.gamericefishpro.space.mf.d) eVar.L$1;
                aVar6 = (a) eVar.L$0;
                try {
                    com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                    i8 = i6;
                } catch (y1 e9) {
                    e = e9;
                    com.gamericefishpro.space.od.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + wVar3.d + '.', e);
                    i8 = i6;
                } catch (Throwable th8) {
                    th = th8;
                    com.gamericefishpro.space.od.b.error("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                    i8 = i6;
                }
                int i111 = i8;
                z8 = z7;
                dVar5 = dVar3;
                aVar8 = aVar6;
                boolean z113 = wVar3.d;
                eVar.L$0 = aVar8;
                eVar.L$1 = dVar5;
                eVar.L$2 = null;
                eVar.L$3 = null;
                eVar.Z$0 = z8;
                eVar.I$0 = i111;
                eVar.label = 6;
                objProcessHandlerResponse2 = aVar8.processHandlerResponse(dVar5, z113, z8, eVar);
                i9 = i111;
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                int i20 = eVar.I$0;
                z8 = eVar.Z$0;
                dVar5 = (com.gamericefishpro.space.mf.d) eVar.L$1;
                aVar8 = (a) eVar.L$0;
                com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                objProcessHandlerResponse2 = objCanReceiveNotification;
                i9 = i20;
                Boolean bool2 = (Boolean) objProcessHandlerResponse2;
                if (bool2 == null) {
                    return Unit.a;
                }
                z5 = z8;
                dVar4 = dVar5;
                aVar5 = aVar8;
                i7 = i9;
                zBooleanValue = bool2.booleanValue();
                if (!zBooleanValue) {
                    dVar3 = dVar4;
                    BooleanValue = i7;
                    z6 = z5;
                    aVar4 = aVar5;
                    r5 = BooleanValue;
                    if (!dVar3.isRestoring()) {
                        if (r5 != 0) {
                        }
                        eVar.L$0 = null;
                        eVar.L$1 = null;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.Z$0 = z6;
                        eVar.label = 8;
                        if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                            if (!z6) {
                                return Unit.a;
                            }
                            eVar.L$0 = null;
                            eVar.L$1 = null;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.label = 9;
                        }
                    } else {
                        if (!z6) {
                            return Unit.a;
                        }
                        eVar.L$0 = null;
                        eVar.L$1 = null;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.label = 9;
                    }
                    break;
                } else {
                    com.gamericefishpro.space.pf.b bVar9 = aVar5._notificationDisplayer;
                    eVar.L$0 = aVar5;
                    eVar.L$1 = dVar4;
                    eVar.L$2 = null;
                    eVar.L$3 = null;
                    eVar.Z$0 = z5;
                    eVar.label = 7;
                    objDisplayNotification = bVar9.displayNotification(dVar4, eVar);
                    if (objDisplayNotification != aVar9) {
                        dVar6 = dVar4;
                        obj = objDisplayNotification;
                        z6 = z5;
                        dVar3 = dVar6;
                        BooleanValue = ((Boolean) obj).booleanValue();
                        aVar4 = aVar5;
                        r5 = BooleanValue;
                        if (!dVar3.isRestoring()) {
                            if (r5 != 0) {
                            }
                            eVar.L$0 = null;
                            eVar.L$1 = null;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z6;
                            eVar.label = 8;
                            if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                                if (!z6) {
                                    return Unit.a;
                                }
                                eVar.L$0 = null;
                                eVar.L$1 = null;
                                eVar.L$2 = null;
                                eVar.L$3 = null;
                                eVar.label = 9;
                            }
                        } else {
                            if (!z6) {
                                return Unit.a;
                            }
                            eVar.L$0 = null;
                            eVar.L$1 = null;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.label = 9;
                        }
                    }
                    break;
                }
                return aVar9;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                z6 = eVar.Z$0;
                com.gamericefishpro.space.mf.d dVar7 = (com.gamericefishpro.space.mf.d) eVar.L$1;
                a aVar12 = (a) eVar.L$0;
                com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                aVar5 = aVar12;
                dVar6 = dVar7;
                obj = objCanReceiveNotification;
                dVar3 = dVar6;
                BooleanValue = ((Boolean) obj).booleanValue();
                aVar4 = aVar5;
                r5 = BooleanValue;
                if (!dVar3.isRestoring()) {
                    if (!z6) {
                        return Unit.a;
                    }
                    eVar.L$0 = null;
                    eVar.L$1 = null;
                    eVar.L$2 = null;
                    eVar.L$3 = null;
                    eVar.label = 9;
                    break;
                } else {
                    if (r5 != 0) {
                    }
                    eVar.L$0 = null;
                    eVar.L$1 = null;
                    eVar.L$2 = null;
                    eVar.L$3 = null;
                    eVar.Z$0 = z6;
                    eVar.label = 8;
                    if (aVar4.postProcessNotification(dVar3, false, z9, eVar) != aVar9) {
                        if (!z6) {
                            return Unit.a;
                        }
                        eVar.L$0 = null;
                        eVar.L$1 = null;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.label = 9;
                    }
                    break;
                }
                return aVar9;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                z6 = eVar.Z$0;
                com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                if (!z6) {
                    return Unit.a;
                }
                eVar.L$0 = null;
                eVar.L$1 = null;
                eVar.L$2 = null;
                eVar.L$3 = null;
                eVar.label = 9;
                break;
                break;
            case 9:
                com.gamericefishpro.space.wa.b.P(objCanReceiveNotification);
                return Unit.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
