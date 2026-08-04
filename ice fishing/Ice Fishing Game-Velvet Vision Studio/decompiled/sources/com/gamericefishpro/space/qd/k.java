package com.gamericefishpro.space.qd;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.gamericefishpro.space.ei.e0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x0;
import com.gamericefishpro.space.t0.y0;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.gamericefishpro.space.pd.j, com.gamericefishpro.space.jd.b, com.gamericefishpro.space.jh.a, com.gamericefishpro.space.fc.g, com.gamericefishpro.space.xd.a, com.gamericefishpro.space.he.b, com.gamericefishpro.space.rg.a, com.gamericefishpro.space.lc.e {
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.rd.b _backend;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.cc.c _consistencyManager;
    private final com.gamericefishpro.space.ud.a _displayer;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.mg.a _influenceManager;
    private final com.gamericefishpro.space.zc.a _languageContext;
    private final com.gamericefishpro.space.xd.b _lifecycle;
    private final com.gamericefishpro.space.og.b _outcomeEventsController;
    private final com.gamericefishpro.space.zd.a _prefs;
    private final com.gamericefishpro.space.ee.a _repository;
    private final com.gamericefishpro.space.rg.b _sessionService;
    private final com.gamericefishpro.space.ge.a _state;
    private final com.gamericefishpro.space.jh.b _subscriptionManager;
    private final com.gamericefishpro.space.kd.a _time;
    private final com.gamericefishpro.space.he.a _triggerController;
    private final com.gamericefishpro.space.he.d _triggerModelStore;
    private final com.gamericefishpro.space.tg.a _userManager;
    private final Set<String> clickedClickIds;
    private final Set<String> dismissedMessages;
    private final Set<String> earlySessionTriggers;
    private final com.gamericefishpro.space.xi.a fetchIAMMutex;
    private boolean hasCompletedFirstFetch;
    private final j identityModelChangeHandler;
    private final Set<String> impressionedMessages;
    private Long lastTimeFetchedIAMs;
    private final com.gamericefishpro.space.dc.b lifecycleCallback;
    private final com.gamericefishpro.space.dc.b messageClickCallback;
    private final List<com.gamericefishpro.space.qd.a> messageDisplayQueue;
    private final com.gamericefishpro.space.xi.a messageDisplayQueueMutex;
    private List<com.gamericefishpro.space.qd.a> messages;
    private final List<com.gamericefishpro.space.qd.a> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.attemptToShowInAppMessage(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a0 extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $inAppMessage;
        final /* synthetic */ List<com.gamericefishpro.space.de.b> $prompts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a0(com.gamericefishpro.space.qd.a aVar, List<? extends com.gamericefishpro.space.de.b> list, com.gamericefishpro.space.th.a aVar2) {
            super(1, aVar2);
            this.$inAppMessage = aVar;
            this.$prompts = list;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return k.this.new a0(this.$inAppMessage, this.$prompts, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((a0) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                k kVar = k.this;
                com.gamericefishpro.space.qd.a aVar2 = this.$inAppMessage;
                List<com.gamericefishpro.space.de.b> list = this.$prompts;
                this.label = 1;
                if (kVar.showMultiplePrompts(aVar2, list, this) == aVar) {
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
    public static final class b extends com.gamericefishpro.space.vh.c {
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
            return k.this.evaluateInAppMessages(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b0 extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b0(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.showMultiplePrompts(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fetchMessages(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c0 extends com.gamericefishpro.space.vh.i implements Function1 {
        Object L$0;
        int label;

        public c0(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return k.this.new c0(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((c0) create(aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0060 A[LOOP:0: B:18:0x005a->B:20:0x0060, LOOP_END] */
        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            List list;
            Iterator it;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.ee.a aVar2 = k.this._repository;
                this.label = 1;
                if (aVar2.cleanCachedInAppMessages(this) != aVar) {
                }
                return aVar;
            }
            if (i == 1) {
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            list.addAll((Collection) obj);
            it = k.this.redisplayedInAppMessages.iterator();
            while (it.hasNext()) {
                ((com.gamericefishpro.space.qd.a) it.next()).setDisplayedInSession(false);
            }
            return Unit.a;
            List list2 = k.this.redisplayedInAppMessages;
            com.gamericefishpro.space.ee.a aVar3 = k.this._repository;
            this.L$0 = list2;
            this.label = 2;
            Object objListInAppMessages = aVar3.listInAppMessages(this);
            if (objListInAppMessages != aVar) {
                list = list2;
                obj = objListInAppMessages;
                list.addAll((Collection) obj);
                it = k.this.redisplayedInAppMessages.iterator();
                while (it.hasNext()) {
                    ((com.gamericefishpro.space.qd.a) it.next()).setDisplayedInSession(false);
                }
                return Unit.a;
            }
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.ei.l implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(k.this._time.getCurrentTimeMillis() - k.this._sessionService.getStartTime());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.i implements Function1 {
        int label;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return k.this.new e(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((e) create(aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0055  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r1.fetchMessages(r7, r6) == r0) goto L22;
         */
        @Override // com.gamericefishpro.space.vh.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.zb.b bVar;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                String onesignalId = k.this._userManager.getOnesignalId();
                com.gamericefishpro.space.cc.c cVar = k.this._consistencyManager;
                com.gamericefishpro.space.zb.a aVar2 = new com.gamericefishpro.space.zb.a(onesignalId);
                this.label = 1;
                obj = cVar.getRywDataFromAwaitableCondition(aVar2, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i == 1) {
                com.gamericefishpro.space.wa.b.P(obj);
            } else if (i == 2) {
                com.gamericefishpro.space.wa.b.P(obj);
                bVar = (com.gamericefishpro.space.zb.b) obj;
                if (bVar != null) {
                    k kVar = k.this;
                    this.label = 3;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
            this.label = 2;
            obj = ((com.gamericefishpro.space.pi.n) ((com.gamericefishpro.space.pi.m) obj)).r(this);
            if (obj != aVar) {
                bVar = (com.gamericefishpro.space.zb.b) obj;
                if (bVar != null) {
                    k kVar2 = k.this;
                    this.label = 3;
                }
                return Unit.a;
            }
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireOutcomesForClick(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ com.gamericefishpro.space.qd.b $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.gamericefishpro.space.qd.b bVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$result = bVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            g gVar = new g(this.$result, aVar);
            gVar.L$0 = obj;
            return gVar;
        }

        public final Object invoke(com.gamericefishpro.space.pd.c cVar, com.gamericefishpro.space.th.a aVar) {
            return ((g) create(cVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            throw y0.e(this.L$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((com.gamericefishpro.space.pd.c) null, (com.gamericefishpro.space.th.a) obj2);
            }
            throw new ClassCastException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public h(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForClick(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class i extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public i(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForPageChange(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class j implements com.gamericefishpro.space.fc.g {

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.vh.i implements Function1 {
            final /* synthetic */ String $newOneSignalId;
            int label;
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, String str, com.gamericefishpro.space.th.a aVar) {
                super(1, aVar);
                this.this$0 = kVar;
                this.$newOneSignalId = str;
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
                return new a(this.this$0, this.$newOneSignalId, aVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(com.gamericefishpro.space.th.a aVar) {
                return ((a) create(aVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x004d  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
            
                if (r1.fetchMessages(r7, r6) == r0) goto L22;
             */
            @Override // com.gamericefishpro.space.vh.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                com.gamericefishpro.space.zb.b bVar;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.label;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.cc.c cVar = this.this$0._consistencyManager;
                    com.gamericefishpro.space.zb.a aVar2 = new com.gamericefishpro.space.zb.a(this.$newOneSignalId);
                    this.label = 1;
                    obj = cVar.getRywDataFromAwaitableCondition(aVar2, this);
                    if (obj != aVar) {
                    }
                    return aVar;
                }
                if (i == 1) {
                    com.gamericefishpro.space.wa.b.P(obj);
                } else if (i == 2) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    bVar = (com.gamericefishpro.space.zb.b) obj;
                    if (bVar != null) {
                        k kVar = this.this$0;
                        this.label = 3;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
                this.label = 2;
                obj = ((com.gamericefishpro.space.pi.n) ((com.gamericefishpro.space.pi.m) obj)).r(this);
                if (obj != aVar) {
                    bVar = (com.gamericefishpro.space.zb.b) obj;
                    if (bVar != null) {
                        k kVar2 = this.this$0;
                        this.label = 3;
                    }
                    return Unit.a;
                }
                return aVar;
            }
        }

        public j() {
        }

        @Override // com.gamericefishpro.space.fc.g
        public void onModelReplaced(com.gamericefishpro.space.bh.a model, String tag) {
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(tag, "tag");
        }

        @Override // com.gamericefishpro.space.fc.g
        public void onModelUpdated(com.gamericefishpro.space.fc.j args, String tag) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(tag, "tag");
            if (Intrinsics.a(args.getProperty(), "onesignal_id")) {
                Object oldValue = args.getOldValue();
                Intrinsics.c(oldValue, "null cannot be cast to non-null type kotlin.String");
                Object newValue = args.getNewValue();
                Intrinsics.c(newValue, "null cannot be cast to non-null type kotlin.String");
                String str = (String) newValue;
                com.gamericefishpro.space.yb.c cVar = com.gamericefishpro.space.yb.c.INSTANCE;
                if (!cVar.isLocalId((String) oldValue) || cVar.isLocalId(str)) {
                    return;
                }
                com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new a(k.this, str, null), 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.qd.k$k, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0042k extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0042k(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.messageWasDismissed(null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class l extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.gamericefishpro.space.qd.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.pd.g) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.pd.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            new com.gamericefishpro.space.qd.e(this.$message);
            it.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class m extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.c $action;
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.gamericefishpro.space.qd.c cVar, com.gamericefishpro.space.qd.a aVar, k kVar, com.gamericefishpro.space.th.a aVar2) {
            super(1, aVar2);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new m(this.$action, this.$message, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((m) create(aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        
            if (r8.fireOutcomesForClick(r1, r3, r7) == r0) goto L25;
         */
        @Override // com.gamericefishpro.space.vh.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            k kVar;
            com.gamericefishpro.space.qd.a aVar;
            com.gamericefishpro.space.qd.c cVar;
            com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar2 = this.this$0;
                com.gamericefishpro.space.qd.a aVar3 = this.$message;
                com.gamericefishpro.space.qd.c cVar2 = this.$action;
                this.label = 1;
                if (kVar2.firePublicClickHandler(aVar3, cVar2, this) != aVar2) {
                }
                return aVar2;
            }
            if (i == 1) {
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i == 2) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    this.this$0.fireClickAction(this.$action);
                    kVar = this.this$0;
                    aVar = this.$message;
                    cVar = this.$action;
                    this.label = 3;
                    if (kVar.fireRESTCallForClick(aVar, cVar, this) != aVar2) {
                        this.this$0.fireTagCallForClick(this.$action);
                        k kVar3 = this.this$0;
                        String messageId = this.$message.getMessageId();
                        List<com.gamericefishpro.space.qd.f> outcomes = this.$action.getOutcomes();
                        this.label = 4;
                    }
                    return aVar2;
                }
                if (i == 3) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    this.this$0.fireTagCallForClick(this.$action);
                    k kVar4 = this.this$0;
                    String messageId2 = this.$message.getMessageId();
                    List<com.gamericefishpro.space.qd.f> outcomes2 = this.$action.getOutcomes();
                    this.label = 4;
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
            }
            return Unit.a;
            k kVar5 = this.this$0;
            com.gamericefishpro.space.qd.a aVar4 = this.$message;
            List<com.gamericefishpro.space.de.b> prompts = this.$action.getPrompts();
            this.label = 2;
            if (kVar5.beginProcessingPrompts(aVar4, prompts, this) != aVar2) {
                this.this$0.fireClickAction(this.$action);
                kVar = this.this$0;
                aVar = this.$message;
                cVar = this.$action;
                this.label = 3;
                if (kVar.fireRESTCallForClick(aVar, cVar, this) != aVar2) {
                    this.this$0.fireTagCallForClick(this.$action);
                    k kVar6 = this.this$0;
                    String messageId3 = this.$message.getMessageId();
                    List<com.gamericefishpro.space.qd.f> outcomes3 = this.$action.getOutcomes();
                    this.label = 4;
                }
            }
            return aVar2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class n extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.c $action;
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.gamericefishpro.space.qd.c cVar, com.gamericefishpro.space.qd.a aVar, k kVar, com.gamericefishpro.space.th.a aVar2) {
            super(1, aVar2);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new n(this.$action, this.$message, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((n) create(aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r6.beginProcessingPrompts(r1, r3, r5) == r0) goto L15;
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
                this.this$0.fireClickAction(this.$action);
                this.this$0.logInAppMessagePreviewActions(this.$action);
                return Unit.a;
            }
            com.gamericefishpro.space.wa.b.P(obj);
            this.$action.setFirstClick(this.$message.takeActionAsUnique());
            k kVar = this.this$0;
            com.gamericefishpro.space.qd.a aVar2 = this.$message;
            com.gamericefishpro.space.qd.c cVar = this.$action;
            this.label = 1;
            if (kVar.firePublicClickHandler(aVar2, cVar, this) != aVar) {
            }
            return aVar;
            k kVar2 = this.this$0;
            com.gamericefishpro.space.qd.a aVar3 = this.$message;
            List<com.gamericefishpro.space.de.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class o extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;
        final /* synthetic */ com.gamericefishpro.space.qd.g $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.qd.g gVar, com.gamericefishpro.space.th.a aVar2) {
            super(1, aVar2);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return k.this.new o(this.$message, this.$page, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((o) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                k kVar = k.this;
                com.gamericefishpro.space.qd.a aVar2 = this.$message;
                com.gamericefishpro.space.qd.g gVar = this.$page;
                this.label = 1;
                if (kVar.fireRESTCallForPageChange(aVar2, gVar, this) == aVar) {
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
    public static final class p extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.th.a aVar2) {
            super(1, aVar2);
            this.$message = aVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return k.this.new p(this.$message, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((p) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                k kVar = k.this;
                com.gamericefishpro.space.qd.a aVar2 = this.$message;
                this.label = 1;
                if (k.messageWasDismissed$default(kVar, aVar2, false, this, 2, null) == aVar) {
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
    public static final class q extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(com.gamericefishpro.space.qd.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.pd.g) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.pd.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            new com.gamericefishpro.space.qd.e(this.$message);
            it.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class r extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;
        final /* synthetic */ String $variantId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.th.a aVar2) {
            super(1, aVar2);
            this.$variantId = str;
            this.$message = aVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return k.this.new r(this.$variantId, this.$message, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((r) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            try {
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.rd.b bVar = k.this._backend;
                    String appId = ((com.gamericefishpro.space.rc.a) k.this._configModelStore.getModel()).getAppId();
                    String id = k.this._subscriptionManager.getSubscriptions().getPush().getId();
                    String str = this.$variantId;
                    String messageId = this.$message.getMessageId();
                    this.label = 1;
                    rVar = this;
                    try {
                        if (bVar.sendIAMImpression(appId, id, str, messageId, rVar) == aVar) {
                            return aVar;
                        }
                    } catch (com.gamericefishpro.space.ec.a unused) {
                        k.this.impressionedMessages.remove(rVar.$message.getMessageId());
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    rVar = this;
                }
                k.this._prefs.setImpressionesMessagesId(k.this.impressionedMessages);
            } catch (com.gamericefishpro.space.ec.a unused2) {
                rVar = this;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class s extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(com.gamericefishpro.space.qd.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.pd.g) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.pd.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            new com.gamericefishpro.space.qd.e(this.$message);
            it.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class t extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(com.gamericefishpro.space.qd.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.pd.g) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.pd.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            new com.gamericefishpro.space.qd.e(this.$message);
            it.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class u extends com.gamericefishpro.space.vh.i implements Function1 {
        int label;

        public u(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return k.this.new u(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((u) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
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
    public static final class v extends com.gamericefishpro.space.vh.i implements Function1 {
        int label;

        public v(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return k.this.new v(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((v) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
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
    public static final class w extends com.gamericefishpro.space.vh.i implements Function2 {
        int label;

        public w(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return k.this.new w(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.gamericefishpro.space.pi.x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((w) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            k.this._displayer.dismissCurrentInAppMessage();
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class x extends com.gamericefishpro.space.vh.i implements Function1 {
        int label;

        public x(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return k.this.new x(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((x) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
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
    public static final class y extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public y(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.persistInAppMessage(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class z extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public z(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.queueMessageForDisplay(null, this);
        }
    }

    public k(com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.rg.b _sessionService, com.gamericefishpro.space.mg.a _influenceManager, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.tg.a _userManager, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.jh.b _subscriptionManager, com.gamericefishpro.space.og.b _outcomeEventsController, com.gamericefishpro.space.ge.a _state, com.gamericefishpro.space.zd.a _prefs, com.gamericefishpro.space.ee.a _repository, com.gamericefishpro.space.rd.b _backend, com.gamericefishpro.space.he.a _triggerController, com.gamericefishpro.space.he.d _triggerModelStore, com.gamericefishpro.space.ud.a _displayer, com.gamericefishpro.space.xd.b _lifecycle, com.gamericefishpro.space.zc.a _languageContext, com.gamericefishpro.space.kd.a _time, com.gamericefishpro.space.cc.c _consistencyManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_userManager, "_userManager");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_outcomeEventsController, "_outcomeEventsController");
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_repository, "_repository");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_triggerController, "_triggerController");
        Intrinsics.checkNotNullParameter(_triggerModelStore, "_triggerModelStore");
        Intrinsics.checkNotNullParameter(_displayer, "_displayer");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._influenceManager = _influenceManager;
        this._configModelStore = _configModelStore;
        this._userManager = _userManager;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._outcomeEventsController = _outcomeEventsController;
        this._state = _state;
        this._prefs = _prefs;
        this._repository = _repository;
        this._backend = _backend;
        this._triggerController = _triggerController;
        this._triggerModelStore = _triggerModelStore;
        this._displayer = _displayer;
        this._lifecycle = _lifecycle;
        this._languageContext = _languageContext;
        this._time = _time;
        this._consistencyManager = _consistencyManager;
        this.lifecycleCallback = new com.gamericefishpro.space.dc.b();
        this.messageClickCallback = new com.gamericefishpro.space.dc.b();
        this.messages = new ArrayList();
        this.dismissedMessages = new LinkedHashSet();
        this.impressionedMessages = new LinkedHashSet();
        this.viewedPageIds = new LinkedHashSet();
        this.clickedClickIds = new LinkedHashSet();
        this.messageDisplayQueue = new ArrayList();
        this.messageDisplayQueueMutex = new com.gamericefishpro.space.xi.c();
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = new com.gamericefishpro.space.xi.c();
        Set<String> setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet, "synchronizedSet(...)");
        this.earlySessionTriggers = setSynchronizedSet;
        this.identityModelChangeHandler = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:45:0x00fd, B:38:0x00c5, B:40:0x00cd, B:41:0x00d3, B:43:0x00db, B:44:0x00e1), top: B:70:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0136, code lost:
    
        if (r3.queueMessageForDisplay((com.gamericefishpro.space.qd.a) r14, r1) == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0165, code lost:
    
        if (r3.messageWasDismissed((com.gamericefishpro.space.qd.a) r14, true, r1) == r2) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToShowInAppMessage(com.gamericefishpro.space.th.a aVar) {
        a aVar2;
        k kVar;
        com.gamericefishpro.space.ei.a0 a0Var;
        com.gamericefishpro.space.xi.a aVar3;
        Object obj;
        Object objDisplayMessage;
        com.gamericefishpro.space.ei.a0 a0Var2;
        Boolean bool;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i2 = aVar2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i2 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(aVar);
            }
        } else {
            aVar2 = new a(aVar);
        }
        Object objWaitUntilSystemConditionsAvailable = aVar2.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i3 = aVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(objWaitUntilSystemConditionsAvailable);
            com.gamericefishpro.space.lc.f fVar = this._applicationService;
            aVar2.L$0 = this;
            aVar2.label = 1;
            objWaitUntilSystemConditionsAvailable = fVar.waitUntilSystemConditionsAvailable(aVar2);
            if (objWaitUntilSystemConditionsAvailable != aVar4) {
                kVar = this;
            }
            return aVar4;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        com.gamericefishpro.space.wa.b.P(objWaitUntilSystemConditionsAvailable);
                        return Unit.a;
                    }
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(objWaitUntilSystemConditionsAvailable);
                    return Unit.a;
                }
                a0Var2 = (com.gamericefishpro.space.ei.a0) aVar2.L$1;
                kVar = (k) aVar2.L$0;
                com.gamericefishpro.space.wa.b.P(objWaitUntilSystemConditionsAvailable);
                bool = (Boolean) objWaitUntilSystemConditionsAvailable;
                if (bool != null) {
                    if (bool.equals(Boolean.FALSE)) {
                        kVar._state.setInAppMessageIdShowing(null);
                        e0.a(kVar.messages).remove(a0Var2.d);
                        Object obj2 = a0Var2.d;
                        Intrinsics.b(obj2);
                        aVar2.L$0 = null;
                        aVar2.L$1 = null;
                        aVar2.label = 5;
                    }
                    return Unit.a;
                }
                kVar._state.setInAppMessageIdShowing(null);
                Object obj3 = a0Var2.d;
                Intrinsics.b(obj3);
                aVar2.L$0 = null;
                aVar2.L$1 = null;
                aVar2.label = 4;
                return aVar4;
            }
            com.gamericefishpro.space.xi.a aVar5 = (com.gamericefishpro.space.xi.a) aVar2.L$2;
            com.gamericefishpro.space.ei.a0 a0Var3 = (com.gamericefishpro.space.ei.a0) aVar2.L$1;
            k kVar2 = (k) aVar2.L$0;
            com.gamericefishpro.space.wa.b.P(objWaitUntilSystemConditionsAvailable);
            a0Var = a0Var3;
            aVar3 = aVar5;
            kVar = kVar2;
            try {
                com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + kVar.messageDisplayQueue, null, 2, null);
                if (kVar.getPaused()) {
                    com.gamericefishpro.space.od.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
                } else if (kVar.messageDisplayQueue.isEmpty()) {
                    com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
                } else if (kVar._state.getInAppMessageIdShowing() != null) {
                    com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
                } else {
                    com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                    com.gamericefishpro.space.qd.a aVarRemove = kVar.messageDisplayQueue.remove(0);
                    a0Var.d = aVarRemove;
                    com.gamericefishpro.space.ge.a aVar6 = kVar._state;
                    Intrinsics.b(aVarRemove);
                    aVar6.setInAppMessageIdShowing(aVarRemove.getMessageId());
                }
                Unit unit = Unit.a;
                aVar3.b(null);
                obj = a0Var.d;
                if (obj != null) {
                    aVar2.L$0 = kVar;
                    aVar2.L$1 = a0Var;
                    aVar2.L$2 = null;
                    aVar2.label = 3;
                    objDisplayMessage = kVar._displayer.displayMessage((com.gamericefishpro.space.qd.a) obj, aVar2);
                    if (objDisplayMessage != aVar4) {
                        a0Var2 = a0Var;
                        objWaitUntilSystemConditionsAvailable = objDisplayMessage;
                        bool = (Boolean) objWaitUntilSystemConditionsAvailable;
                        if (bool != null) {
                            kVar._state.setInAppMessageIdShowing(null);
                            Object obj4 = a0Var2.d;
                            Intrinsics.b(obj4);
                            aVar2.L$0 = null;
                            aVar2.L$1 = null;
                            aVar2.label = 4;
                        } else if (bool.equals(Boolean.FALSE)) {
                            kVar._state.setInAppMessageIdShowing(null);
                            e0.a(kVar.messages).remove(a0Var2.d);
                            Object obj5 = a0Var2.d;
                            Intrinsics.b(obj5);
                            aVar2.L$0 = null;
                            aVar2.L$1 = null;
                            aVar2.label = 5;
                        }
                    }
                    return aVar4;
                }
                return Unit.a;
            } catch (Throwable th) {
                aVar3.b(null);
                throw th;
            }
        }
        kVar = (k) aVar2.L$0;
        com.gamericefishpro.space.wa.b.P(objWaitUntilSystemConditionsAvailable);
        if (!((Boolean) objWaitUntilSystemConditionsAvailable).booleanValue()) {
            com.gamericefishpro.space.od.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
            return Unit.a;
        }
        a0Var = new com.gamericefishpro.space.ei.a0();
        aVar3 = kVar.messageDisplayQueueMutex;
        aVar2.L$0 = kVar;
        aVar2.L$1 = a0Var;
        aVar2.L$2 = aVar3;
        aVar2.label = 2;
        if (aVar3.c(aVar2) != aVar4) {
            com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + kVar.messageDisplayQueue, null, 2, null);
            if (kVar.getPaused()) {
                com.gamericefishpro.space.od.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
            } else if (kVar.messageDisplayQueue.isEmpty()) {
                com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
            } else if (kVar._state.getInAppMessageIdShowing() != null) {
                com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
            } else {
                com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                com.gamericefishpro.space.qd.a aVarRemove2 = kVar.messageDisplayQueue.remove(0);
                a0Var.d = aVarRemove2;
                com.gamericefishpro.space.ge.a aVar7 = kVar._state;
                Intrinsics.b(aVarRemove2);
                aVar7.setInAppMessageIdShowing(aVarRemove2.getMessageId());
            }
            Unit unit2 = Unit.a;
            aVar3.b(null);
            obj = a0Var.d;
            if (obj != null) {
                aVar2.L$0 = kVar;
                aVar2.L$1 = a0Var;
                aVar2.L$2 = null;
                aVar2.label = 3;
                objDisplayMessage = kVar._displayer.displayMessage((com.gamericefishpro.space.qd.a) obj, aVar2);
                if (objDisplayMessage != aVar4) {
                    a0Var2 = a0Var;
                    objWaitUntilSystemConditionsAvailable = objDisplayMessage;
                    bool = (Boolean) objWaitUntilSystemConditionsAvailable;
                    if (bool != null) {
                        kVar._state.setInAppMessageIdShowing(null);
                        Object obj6 = a0Var2.d;
                        Intrinsics.b(obj6);
                        aVar2.L$0 = null;
                        aVar2.L$1 = null;
                        aVar2.label = 4;
                    } else if (bool.equals(Boolean.FALSE)) {
                        kVar._state.setInAppMessageIdShowing(null);
                        e0.a(kVar.messages).remove(a0Var2.d);
                        Object obj7 = a0Var2.d;
                        Intrinsics.b(obj7);
                        aVar2.L$0 = null;
                        aVar2.L$1 = null;
                        aVar2.label = 5;
                    }
                }
            }
            return Unit.a;
        }
        return aVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(com.gamericefishpro.space.qd.a aVar, List<? extends com.gamericefishpro.space.de.b> list, com.gamericefishpro.space.th.a aVar2) {
        if (list.isEmpty()) {
            return Unit.a;
        }
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + aVar, null, 2, null);
        this._displayer.dismissCurrentInAppMessage();
        Object objShowMultiplePrompts = showMultiplePrompts(aVar, list, aVar2);
        return objShowMultiplePrompts == com.gamericefishpro.space.uh.a.d ? objShowMultiplePrompts : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object evaluateInAppMessages(com.gamericefishpro.space.th.a aVar) {
        b bVar;
        k kVar;
        Iterator it;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object obj = bVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = bVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
            ArrayList arrayList = new ArrayList();
            synchronized (this.messages) {
                try {
                    for (com.gamericefishpro.space.qd.a aVar3 : this.messages) {
                        if (this._triggerController.evaluateMessageTriggers(aVar3)) {
                            setDataForRedisplay(aVar3);
                            if (!this.dismissedMessages.contains(aVar3.getMessageId()) && !aVar3.isFinished()) {
                                arrayList.add(aVar3);
                            }
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            kVar = this;
            it = arrayList.iterator();
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) bVar.L$1;
            kVar = (k) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        while (it.hasNext()) {
            com.gamericefishpro.space.qd.a aVar4 = (com.gamericefishpro.space.qd.a) it.next();
            bVar.L$0 = kVar;
            bVar.L$1 = it;
            bVar.label = 1;
            if (kVar.queueMessageForDisplay(aVar4, bVar) == aVar2) {
                return aVar2;
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138 A[Catch: all -> 0x018b, TryCatch #1 {all -> 0x018b, blocks: (B:60:0x012e, B:62:0x0138, B:63:0x014f, B:65:0x0155, B:68:0x016f, B:71:0x018d, B:72:0x0192), top: B:88:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0155 A[Catch: all -> 0x018b, TryCatch #1 {all -> 0x018b, blocks: (B:60:0x012e, B:62:0x0138, B:63:0x014f, B:65:0x0155, B:68:0x016f, B:71:0x018d, B:72:0x0192), top: B:88:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019f, code lost:
    
        if (r4.evaluateInAppMessages(r9) == r3) goto L76;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0138, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(com.gamericefishpro.space.zb.b bVar, com.gamericefishpro.space.th.a aVar) {
        c cVar;
        com.gamericefishpro.space.xi.a aVar2;
        String str;
        String str2;
        com.gamericefishpro.space.zb.b bVar2;
        k kVar;
        k kVar2;
        List<com.gamericefishpro.space.qd.a> list;
        boolean zContains;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(aVar);
            }
        } else {
            cVar = new c(aVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = cVar2.label;
        try {
            if (i3 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                if (!this._applicationService.isInForeground()) {
                    return Unit.a;
                }
                String appId = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId();
                String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                if (id.length() == 0 || com.gamericefishpro.space.yb.c.INSTANCE.isLocalId(id) || appId.length() == 0) {
                    return Unit.a;
                }
                aVar2 = this.fetchIAMMutex;
                cVar2.L$0 = this;
                cVar2.L$1 = bVar;
                cVar2.L$2 = appId;
                cVar2.L$3 = id;
                cVar2.L$4 = aVar2;
                cVar2.label = 1;
                if (aVar2.c(cVar2) != aVar3) {
                    str = id;
                    str2 = appId;
                    bVar2 = bVar;
                    kVar = this;
                }
                return aVar3;
            }
            if (i3 == 1) {
                aVar2 = (com.gamericefishpro.space.xi.a) cVar2.L$4;
                String str3 = (String) cVar2.L$3;
                String str4 = (String) cVar2.L$2;
                bVar2 = (com.gamericefishpro.space.zb.b) cVar2.L$1;
                k kVar3 = (k) cVar2.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                str = str3;
                str2 = str4;
                kVar = kVar3;
            } else if (i3 == 2) {
                kVar2 = (k) cVar2.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                list = (List) obj;
                if (list != null) {
                    return Unit.a;
                }
                if (!(list instanceof com.gamericefishpro.space.fi.a) && !(list instanceof com.gamericefishpro.space.fi.c)) {
                    e0.e(list, "kotlin.collections.MutableList");
                    throw null;
                }
                kVar2.messages = list;
                synchronized (kVar2.earlySessionTriggers) {
                    try {
                        if (!kVar2.earlySessionTriggers.isEmpty()) {
                            com.gamericefishpro.space.od.b.verbose$default("InAppMessagesManager: Processing triggers added early on cold start: " + kVar2.earlySessionTriggers, null, 2, null);
                            for (com.gamericefishpro.space.qd.a aVar4 : kVar2.messages) {
                                zContains = kVar2.redisplayedInAppMessages.contains(aVar4);
                                boolean zIsTriggerOnMessage = kVar2._triggerController.isTriggerOnMessage(aVar4, kVar2.earlySessionTriggers);
                                if (!zContains && zIsTriggerOnMessage) {
                                    com.gamericefishpro.space.od.b.verbose$default("InAppMessagesManager: Setting isTriggerChanged=true for message " + aVar4.getMessageId(), null, 2, null);
                                    aVar4.setTriggerChanged(true);
                                }
                            }
                            kVar2.earlySessionTriggers.clear();
                        }
                        kVar2.hasCompletedFirstFetch = true;
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                cVar2.L$0 = null;
                cVar2.label = 3;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
            long currentTimeMillis = kVar._time.getCurrentTimeMillis();
            Long l2 = kVar.lastTimeFetchedIAMs;
            if (l2 != null && currentTimeMillis - l2.longValue() < ((com.gamericefishpro.space.rc.a) kVar._configModelStore.getModel()).getFetchIAMMinInterval()) {
                Unit unit2 = Unit.a;
                aVar2.b(null);
                return unit2;
            }
            kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis);
            Unit unit3 = Unit.a;
            aVar2.b(null);
            d dVar = kVar.new d();
            com.gamericefishpro.space.rd.b bVar3 = kVar._backend;
            cVar2.L$0 = kVar;
            cVar2.L$1 = null;
            cVar2.L$2 = null;
            cVar2.L$3 = null;
            cVar2.L$4 = null;
            cVar2.label = 2;
            Object objListInAppMessages = bVar3.listInAppMessages(str2, str, bVar2, dVar, cVar2);
            if (objListInAppMessages != aVar3) {
                kVar2 = kVar;
                obj = objListInAppMessages;
                list = (List) obj;
                if (list != null) {
                    return Unit.a;
                }
                if (!(list instanceof com.gamericefishpro.space.fi.a)) {
                }
                kVar2.messages = list;
                synchronized (kVar2.earlySessionTriggers) {
                    if (!kVar2.earlySessionTriggers.isEmpty()) {
                        com.gamericefishpro.space.od.b.verbose$default("InAppMessagesManager: Processing triggers added early on cold start: " + kVar2.earlySessionTriggers, null, 2, null);
                        while (r0.hasNext()) {
                            zContains = kVar2.redisplayedInAppMessages.contains(aVar4);
                            boolean zIsTriggerOnMessage2 = kVar2._triggerController.isTriggerOnMessage(aVar4, kVar2.earlySessionTriggers);
                            if (!zContains) {
                            }
                        }
                        kVar2.earlySessionTriggers.clear();
                    }
                    kVar2.hasCompletedFirstFetch = true;
                    Unit unit4 = Unit.a;
                    cVar2.L$0 = null;
                    cVar2.label = 3;
                }
            }
            return aVar3;
        } catch (Throwable th2) {
            aVar2.b(null);
            throw th2;
        }
    }

    private final void fetchMessagesWhenConditionIsMet() {
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new e(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(com.gamericefishpro.space.qd.c cVar) {
        if (cVar.getUrl() == null || cVar.getUrl().length() <= 0) {
            return;
        }
        if (cVar.getUrlTarget() == com.gamericefishpro.space.pd.k.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), cVar.getUrl());
        } else if (cVar.getUrlTarget() == com.gamericefishpro.space.pd.k.IN_APP_WEBVIEW) {
            com.gamericefishpro.space.td.b.INSTANCE.open$com_onesignal_inAppMessages(cVar.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fireOutcomesForClick(String str, List<com.gamericefishpro.space.qd.f> list, com.gamericefishpro.space.th.a aVar) {
        f fVar;
        Iterator<com.gamericefishpro.space.qd.f> it;
        k kVar;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(aVar);
            }
        } else {
            fVar = new f(aVar);
        }
        Object obj = fVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = fVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            this._influenceManager.onDirectInfluenceFromIAM(str);
            it = list.iterator();
            kVar = this;
        } else {
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) fVar.L$1;
            kVar = (k) fVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        while (it.hasNext()) {
            com.gamericefishpro.space.qd.f next = it.next();
            String name = next.getName();
            if (next.isUnique()) {
                com.gamericefishpro.space.og.b bVar = kVar._outcomeEventsController;
                fVar.L$0 = kVar;
                fVar.L$1 = it;
                fVar.label = 1;
                if (bVar.sendUniqueOutcomeEvent(name, fVar) == aVar2) {
                    return aVar2;
                }
            } else if (next.getWeight() > 0.0f) {
                com.gamericefishpro.space.og.b bVar2 = kVar._outcomeEventsController;
                float weight = next.getWeight();
                fVar.L$0 = kVar;
                fVar.L$1 = it;
                fVar.label = 2;
                if (bVar2.sendOutcomeEventWithValue(name, weight, fVar) == aVar2) {
                    return aVar2;
                }
            } else {
                com.gamericefishpro.space.og.b bVar3 = kVar._outcomeEventsController;
                fVar.L$0 = kVar;
                fVar.L$1 = it;
                fVar.label = 3;
                if (bVar3.sendOutcomeEvent(name, fVar) == aVar2) {
                    return aVar2;
                }
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.qd.c cVar, com.gamericefishpro.space.th.a aVar2) {
        if (!this.messageClickCallback.getHasSubscribers()) {
            return Unit.a;
        }
        this._influenceManager.onDirectInfluenceFromIAM(aVar.getMessageId());
        Object objSuspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new g(new com.gamericefishpro.space.qd.b(aVar, cVar), null), aVar2);
        return objSuspendingFireOnMain == com.gamericefishpro.space.uh.a.d ? objSuspendingFireOnMain : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fireRESTCallForClick(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.qd.c cVar, com.gamericefishpro.space.th.a aVar2) {
        h hVar;
        String clickId;
        k kVar;
        com.gamericefishpro.space.qd.a aVar3;
        String str;
        if (aVar2 instanceof h) {
            hVar = (h) aVar2;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(aVar2);
            }
        } else {
            hVar = new h(aVar2);
        }
        h hVar2 = hVar;
        Object obj = hVar2.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i3 = hVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            String strVariantIdForMessage = com.gamericefishpro.space.td.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
            if (strVariantIdForMessage == null) {
                return Unit.a;
            }
            clickId = cVar.getClickId();
            if (!(aVar.getRedisplayStats().isRedisplayEnabled() && clickId != null && aVar.isClickAvailable(clickId)) && CollectionsKt.t(this.clickedClickIds, clickId)) {
                return Unit.a;
            }
            if (clickId != null) {
                this.clickedClickIds.add(clickId);
                aVar.addClickId(clickId);
            }
            try {
                com.gamericefishpro.space.rd.b bVar = this._backend;
                String appId = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId();
                String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                String messageId = aVar.getMessageId();
                boolean zIsFirstClick = cVar.isFirstClick();
                hVar2.L$0 = this;
                hVar2.L$1 = aVar;
                hVar2.L$2 = clickId;
                hVar2.label = 1;
                if (bVar.sendIAMClick(appId, id, strVariantIdForMessage, messageId, clickId, zIsFirstClick, hVar2) == aVar4) {
                    return aVar4;
                }
                kVar = this;
            } catch (com.gamericefishpro.space.ec.a unused) {
                kVar = this;
                aVar3 = aVar;
                str = clickId;
                e0.a(kVar.clickedClickIds).remove(str);
                if (str != null) {
                    aVar3.removeClickId(str);
                }
                return Unit.a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) hVar2.L$2;
            aVar3 = (com.gamericefishpro.space.qd.a) hVar2.L$1;
            kVar = (k) hVar2.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                clickId = str;
                aVar = aVar3;
            } catch (com.gamericefishpro.space.ec.a unused2) {
                e0.a(kVar.clickedClickIds).remove(str);
                if (str != null) {
                    aVar3.removeClickId(str);
                }
            }
        }
        try {
            kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
        } catch (com.gamericefishpro.space.ec.a unused3) {
            aVar3 = aVar;
            str = clickId;
            e0.a(kVar.clickedClickIds).remove(str);
            if (str != null) {
                aVar3.removeClickId(str);
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fireRESTCallForPageChange(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.qd.g gVar, com.gamericefishpro.space.th.a aVar2) {
        i iVar;
        String str;
        k kVar;
        if (aVar2 instanceof i) {
            iVar = (i) aVar2;
            int i2 = iVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.label = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(aVar2);
            }
        } else {
            iVar = new i(aVar2);
        }
        i iVar2 = iVar;
        Object obj = iVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = iVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            String strVariantIdForMessage = com.gamericefishpro.space.td.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
            if (strVariantIdForMessage == null) {
                return Unit.a;
            }
            String pageId = gVar.getPageId();
            String str2 = aVar.getMessageId() + pageId;
            if (this.viewedPageIds.contains(str2)) {
                com.gamericefishpro.space.od.b.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                return Unit.a;
            }
            this.viewedPageIds.add(str2);
            try {
                com.gamericefishpro.space.rd.b bVar = this._backend;
                String appId = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId();
                String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                String messageId = aVar.getMessageId();
                iVar2.L$0 = this;
                iVar2.L$1 = str2;
                iVar2.label = 1;
                if (bVar.sendIAMPageImpression(appId, id, strVariantIdForMessage, messageId, pageId, iVar2) == aVar3) {
                    return aVar3;
                }
                str = str2;
                kVar = this;
            } catch (com.gamericefishpro.space.ec.a unused) {
                str = str2;
                kVar = this;
                kVar.viewedPageIds.remove(str);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) iVar2.L$1;
            kVar = (k) iVar2.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (com.gamericefishpro.space.ec.a unused2) {
                kVar.viewedPageIds.remove(str);
            }
        }
        kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(com.gamericefishpro.space.qd.c cVar) {
        if (cVar.getTags() != null) {
            com.gamericefishpro.space.qd.i tags = cVar.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                com.gamericefishpro.space.yb.e eVar = com.gamericefishpro.space.yb.e.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                Intrinsics.b(tagsToAdd);
                this._userManager.addTags(eVar.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                com.gamericefishpro.space.yb.e eVar2 = com.gamericefishpro.space.yb.e.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                Intrinsics.b(tagsToRemove);
                this._userManager.removeTags(eVar2.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(com.gamericefishpro.space.qd.a aVar) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(aVar)) {
            return !aVar.isDisplayedInSession();
        }
        return aVar.isTriggerChanged() || (!aVar.isDisplayedInSession() && aVar.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(com.gamericefishpro.space.qd.c cVar) {
        if (cVar.getTags() != null) {
            com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + cVar.getTags(), null, 2, null);
        }
        if (cVar.getOutcomes().size() > 0) {
            com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + cVar.getOutcomes(), null, 2, null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection, boolean z2) {
        synchronized (this.messages) {
            try {
                for (com.gamericefishpro.space.qd.a aVar : this.messages) {
                    boolean zContains = this.redisplayedInAppMessages.contains(aVar);
                    boolean zIsTriggerOnMessage = this._triggerController.isTriggerOnMessage(aVar, collection);
                    boolean zMessageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(aVar);
                    if (!aVar.isTriggerChanged() && zContains && (zIsTriggerOnMessage || (z2 && zMessageHasOnlyDynamicTriggers))) {
                        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + aVar, null, 2, null);
                        aVar.setTriggerChanged(true);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (persistInAppMessage(r10, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (r11.attemptToShowInAppMessage(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (r11.evaluateInAppMessages(r0) == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object messageWasDismissed(com.gamericefishpro.space.qd.a aVar, boolean z2, com.gamericefishpro.space.th.a aVar2) {
        C0042k c0042k;
        k kVar;
        if (aVar2 instanceof C0042k) {
            c0042k = (C0042k) aVar2;
            int i2 = c0042k.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0042k.label = i2 - Integer.MIN_VALUE;
            } else {
                c0042k = new C0042k(aVar2);
            }
        } else {
            c0042k = new C0042k(aVar2);
        }
        Object obj = c0042k.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = c0042k.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            if (aVar.isPreview()) {
                kVar = this;
                kVar._influenceManager.onInAppMessageDismissed();
                if (kVar._state.getCurrentPrompt() != null) {
                    com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
                    return Unit.a;
                }
                if (kVar.lifecycleCallback.getHasSubscribers()) {
                    kVar.lifecycleCallback.fireOnMain(new l(aVar));
                }
                kVar._state.setInAppMessageIdShowing(null);
                if (kVar.messageDisplayQueue.isEmpty()) {
                    com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages", null, 2, null);
                    c0042k.L$0 = null;
                    c0042k.L$1 = null;
                    c0042k.label = 3;
                } else {
                    com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
                    c0042k.L$0 = null;
                    c0042k.L$1 = null;
                    c0042k.label = 2;
                }
            } else {
                this.dismissedMessages.add(aVar.getMessageId());
                if (!z2) {
                    this._prefs.setDismissedMessagesId(this.dismissedMessages);
                    this._state.setLastTimeInAppDismissed(new Long(this._time.getCurrentTimeMillis()));
                    c0042k.L$0 = this;
                    c0042k.L$1 = aVar;
                    c0042k.label = 1;
                }
                kVar = this;
            }
            return aVar3;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                com.gamericefishpro.space.wa.b.P(obj);
                return Unit.a;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return Unit.a;
        }
        aVar = (com.gamericefishpro.space.qd.a) c0042k.L$1;
        kVar = (k) c0042k.L$0;
        com.gamericefishpro.space.wa.b.P(obj);
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
        kVar._influenceManager.onInAppMessageDismissed();
        if (kVar._state.getCurrentPrompt() != null) {
            com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
            return Unit.a;
        }
        if (kVar.lifecycleCallback.getHasSubscribers()) {
            kVar.lifecycleCallback.fireOnMain(new l(aVar));
        }
        kVar._state.setInAppMessageIdShowing(null);
        if (kVar.messageDisplayQueue.isEmpty()) {
            com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
            c0042k.L$0 = null;
            c0042k.L$1 = null;
            c0042k.label = 2;
        } else {
            com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages", null, 2, null);
            c0042k.L$0 = null;
            c0042k.L$1 = null;
            c0042k.label = 3;
        }
        return aVar3;
    }

    public static /* synthetic */ Object messageWasDismissed$default(k kVar, com.gamericefishpro.space.qd.a aVar, boolean z2, com.gamericefishpro.space.th.a aVar2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return kVar.messageWasDismissed(aVar, z2, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object persistInAppMessage(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.th.a aVar2) {
        y yVar;
        k kVar;
        if (aVar2 instanceof y) {
            yVar = (y) aVar2;
            int i2 = yVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.label = i2 - Integer.MIN_VALUE;
            } else {
                yVar = new y(aVar2);
            }
        } else {
            yVar = new y(aVar2);
        }
        Object obj = yVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = yVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            aVar.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / ((long) 1000));
            aVar.getRedisplayStats().incrementDisplayQuantity();
            aVar.setTriggerChanged(false);
            aVar.setDisplayedInSession(true);
            com.gamericefishpro.space.ee.a aVar4 = this._repository;
            yVar.L$0 = this;
            yVar.L$1 = aVar;
            yVar.label = 1;
            if (aVar4.saveInAppMessage(aVar, yVar) == aVar3) {
                return aVar3;
            }
            kVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (com.gamericefishpro.space.qd.a) yVar.L$1;
            kVar = (k) yVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
        int iIndexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
        if (iIndexOf != -1) {
            kVar.redisplayedInAppMessages.set(iIndexOf, aVar);
        } else {
            kVar.redisplayedInAppMessages.add(aVar);
        }
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r4.attemptToShowInAppMessage(r1) == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queueMessageForDisplay(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.th.a aVar2) {
        z zVar;
        com.gamericefishpro.space.xi.a aVar3;
        k kVar;
        if (aVar2 instanceof z) {
            zVar = (z) aVar2;
            int i2 = zVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.label = i2 - Integer.MIN_VALUE;
            } else {
                zVar = new z(aVar2);
            }
        } else {
            zVar = new z(aVar2);
        }
        Object obj = zVar.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i3 = zVar.label;
        try {
            if (i3 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                aVar3 = this.messageDisplayQueueMutex;
                zVar.L$0 = this;
                zVar.L$1 = aVar;
                zVar.L$2 = aVar3;
                zVar.label = 1;
                if (aVar3.c(zVar) != aVar4) {
                    kVar = this;
                }
                return aVar4;
            }
            if (i3 == 1) {
                com.gamericefishpro.space.xi.a aVar5 = (com.gamericefishpro.space.xi.a) zVar.L$2;
                com.gamericefishpro.space.qd.a aVar6 = (com.gamericefishpro.space.qd.a) zVar.L$1;
                kVar = (k) zVar.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                aVar3 = aVar5;
                aVar = aVar6;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
            if (!kVar.messageDisplayQueue.contains(aVar) && !Intrinsics.a(kVar._state.getInAppMessageIdShowing(), aVar.getMessageId())) {
                kVar.messageDisplayQueue.add(aVar);
                com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
            }
            Unit unit = Unit.a;
            aVar3.b(null);
            zVar.L$0 = null;
            zVar.L$1 = null;
            zVar.L$2 = null;
            zVar.label = 2;
        } catch (Throwable th) {
            aVar3.b(null);
            throw th;
        }
    }

    private final void setDataForRedisplay(com.gamericefishpro.space.qd.a aVar) {
        boolean zContains = this.dismissedMessages.contains(aVar.getMessageId());
        int iIndexOf = this.redisplayedInAppMessages.indexOf(aVar);
        if (!zContains || iIndexOf == -1) {
            return;
        }
        com.gamericefishpro.space.qd.a aVar2 = this.redisplayedInAppMessages.get(iIndexOf);
        aVar.getRedisplayStats().setDisplayStats(aVar2.getRedisplayStats());
        aVar.setDisplayedInSession(aVar2.isDisplayedInSession());
        boolean zHasMessageTriggerChanged = hasMessageTriggerChanged(aVar);
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.setDataForRedisplay: " + aVar + " triggerHasChanged: " + zHasMessageTriggerChanged, null, 2, null);
        if (zHasMessageTriggerChanged && aVar.getRedisplayStats().isDelayTimeSatisfied() && aVar.getRedisplayStats().shouldDisplayAgain()) {
            com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.setDataForRedisplay message available for redisplay: " + aVar.getMessageId(), null, 2, null);
            this.dismissedMessages.remove(aVar.getMessageId());
            this.impressionedMessages.remove(aVar.getMessageId());
            this.viewedPageIds.clear();
            this._prefs.setViewPageImpressionedIds(this.viewedPageIds);
            aVar.clearClickIds();
        }
    }

    private final void showAlertDialogMessage(final com.gamericefishpro.space.qd.a aVar, final List<? extends com.gamericefishpro.space.de.b> list) {
        String string = this._applicationService.getAppContext().getString(com.gamericefishpro.space.pd.l.location_permission_missing_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this._applicationService.getAppContext().getString(com.gamericefishpro.space.pd.l.location_permission_missing_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.gamericefishpro.space.qd.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                k.showAlertDialogMessage$lambda$11(this.d, aVar, list, dialogInterface, i2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialogMessage$lambda$11(k this$0, com.gamericefishpro.space.qd.a inAppMessage, List prompts, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(inAppMessage, "$inAppMessage");
        Intrinsics.checkNotNullParameter(prompts, "$prompts");
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, this$0.new a0(inAppMessage, prompts, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:17:0x0062->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b6 -> B:25:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object showMultiplePrompts(com.gamericefishpro.space.qd.a r20, java.util.List<? extends com.gamericefishpro.space.de.b> r21, com.gamericefishpro.space.th.a r22) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.qd.k.showMultiplePrompts(com.gamericefishpro.space.qd.a, java.util.List, com.gamericefishpro.space.th.a):java.lang.Object");
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: addClickListener */
    public void mo16addClickListener(com.gamericefishpro.space.pd.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.addClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.subscribe(listener);
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: addLifecycleListener */
    public void mo17addLifecycleListener(com.gamericefishpro.space.pd.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.subscribe(listener);
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: addTrigger */
    public void mo18addTrigger(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.addTrigger(key: " + key + ", value: " + value + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            try {
                if (!this.hasCompletedFirstFetch) {
                    com.gamericefishpro.space.od.b.verbose$default("InAppMessagesManager: Tracking trigger added early on cold start: " + key, null, 2, null);
                    this.earlySessionTriggers.add(key);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.gamericefishpro.space.he.c cVar = (com.gamericefishpro.space.he.c) this._triggerModelStore.get(key);
        if (cVar != null) {
            cVar.setValue(value);
            return;
        }
        com.gamericefishpro.space.he.c cVar2 = new com.gamericefishpro.space.he.c();
        cVar2.setId(key);
        cVar2.setKey(key);
        cVar2.setValue(value);
        com.gamericefishpro.space.fc.b.add$default(this._triggerModelStore, cVar2, null, 2, null);
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: addTriggers */
    public void mo19addTriggers(Map<String, String> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.addTriggers(triggers: " + triggers + ')', null, 2, null);
        for (Map.Entry<String, String> entry : triggers.entrySet()) {
            mo18addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: clearTriggers */
    public void mo20clearTriggers() {
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        synchronized (this.earlySessionTriggers) {
            try {
                if (!this.hasCompletedFirstFetch) {
                    this.earlySessionTriggers.clear();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.gamericefishpro.space.fc.b.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // com.gamericefishpro.space.pd.j
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // com.gamericefishpro.space.xd.a
    public void onMessageActionOccurredOnMessage(com.gamericefishpro.space.qd.a message, com.gamericefishpro.space.qd.c action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new m(action, message, this, null), 1, null);
    }

    @Override // com.gamericefishpro.space.xd.a
    public void onMessageActionOccurredOnPreview(com.gamericefishpro.space.qd.a message, com.gamericefishpro.space.qd.c action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new n(action, message, this, null), 1, null);
    }

    @Override // com.gamericefishpro.space.xd.a
    public void onMessagePageChanged(com.gamericefishpro.space.qd.a message, com.gamericefishpro.space.qd.g page) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(page, "page");
        if (message.isPreview()) {
            return;
        }
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new o(message, page, null), 1, null);
    }

    @Override // com.gamericefishpro.space.xd.a
    public void onMessageWasDismissed(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new p(message, null), 1, null);
    }

    @Override // com.gamericefishpro.space.xd.a
    public void onMessageWasDisplayed(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new q(message));
        } else {
            com.gamericefishpro.space.od.b.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (message.isPreview() || this.impressionedMessages.contains(message.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(message.getMessageId());
        String strVariantIdForMessage = com.gamericefishpro.space.td.a.INSTANCE.variantIdForMessage(message, this._languageContext);
        if (strVariantIdForMessage == null) {
            return;
        }
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new r(strVariantIdForMessage, message, null), 1, null);
    }

    @Override // com.gamericefishpro.space.xd.a
    public void onMessageWillDismiss(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new s(message));
        } else {
            com.gamericefishpro.space.od.b.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.gamericefishpro.space.xd.a
    public void onMessageWillDisplay(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new t(message));
        } else {
            com.gamericefishpro.space.od.b.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.gamericefishpro.space.fc.g
    public void onModelUpdated(com.gamericefishpro.space.fc.j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "appId")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionStarted() {
        Iterator<com.gamericefishpro.space.qd.a> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // com.gamericefishpro.space.jh.a
    public void onSubscriptionAdded(com.gamericefishpro.space.mh.e subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // com.gamericefishpro.space.jh.a
    public void onSubscriptionChanged(com.gamericefishpro.space.mh.e subscription, com.gamericefishpro.space.fc.j args) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(args, "args");
        if ((subscription instanceof com.gamericefishpro.space.mh.b) && Intrinsics.a(args.getPath(), "id")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // com.gamericefishpro.space.jh.a
    public void onSubscriptionRemoved(com.gamericefishpro.space.mh.e subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // com.gamericefishpro.space.he.b
    public void onTriggerChanged(String newTriggerKey) {
        Intrinsics.checkNotNullParameter(newTriggerKey, "newTriggerKey");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + newTriggerKey + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(com.gamericefishpro.space.ph.w.c(newTriggerKey), true);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new u(null), 1, null);
    }

    @Override // com.gamericefishpro.space.he.b
    public void onTriggerCompleted(String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: " + triggerId, null, 2, null);
        new HashSet().add(triggerId);
    }

    @Override // com.gamericefishpro.space.he.b
    public void onTriggerConditionChanged(String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(com.gamericefishpro.space.ph.w.c(triggerId), false);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new v(null), 1, null);
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: removeClickListener */
    public void mo21removeClickListener(com.gamericefishpro.space.pd.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(listener);
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: removeLifecycleListener */
    public void mo22removeLifecycleListener(com.gamericefishpro.space.pd.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(listener);
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: removeTrigger */
    public void mo23removeTrigger(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.removeTrigger(key: " + key + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            try {
                if (!this.hasCompletedFirstFetch) {
                    this.earlySessionTriggers.remove(key);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.gamericefishpro.space.fc.b.remove$default(this._triggerModelStore, key, null, 2, null);
    }

    @Override // com.gamericefishpro.space.pd.j
    /* JADX INFO: renamed from: removeTriggers */
    public void mo24removeTriggers(Collection<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.removeTriggers(keys: " + keys + ')', null, 2, null);
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            mo23removeTrigger((String) it.next());
        }
    }

    @Override // com.gamericefishpro.space.pd.j
    public void setPaused(boolean z2) {
        com.gamericefishpro.space.od.b.debug$default("InAppMessagesManager.setPaused(value: " + z2 + ')', null, 2, null);
        this._state.setPaused(z2);
        if (z2 && this._state.getInAppMessageIdShowing() != null) {
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.pi.a0.u(x0.d, com.gamericefishpro.space.ui.m.a, new w(null), 2);
        }
        if (z2) {
            return;
        }
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new x(null), 1, null);
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        Set<String> dismissedMessagesId = this._prefs.getDismissedMessagesId();
        if (dismissedMessagesId != null) {
            this.dismissedMessages.addAll(dismissedMessagesId);
        }
        Long lastTimeInAppDismissed = this._prefs.getLastTimeInAppDismissed();
        if (lastTimeInAppDismissed != null) {
            this._state.setLastTimeInAppDismissed(lastTimeInAppDismissed);
        }
        this._subscriptionManager.subscribe(this);
        this._configModelStore.subscribe((com.gamericefishpro.space.fc.g) this);
        this._lifecycle.subscribe(this);
        this._triggerController.subscribe(this);
        this._sessionService.subscribe(this);
        this._applicationService.addApplicationLifecycleHandler(this);
        this._identityModelStore.subscribe((com.gamericefishpro.space.fc.g) this.identityModelChangeHandler);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new c0(null), 1, null);
    }

    @Override // com.gamericefishpro.space.fc.g
    public void onModelReplaced(com.gamericefishpro.space.rc.a model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        fetchMessagesWhenConditionIsMet();
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionActive() {
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onUnfocused() {
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onFocus(boolean z2) {
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionEnded(long j2) {
    }
}
