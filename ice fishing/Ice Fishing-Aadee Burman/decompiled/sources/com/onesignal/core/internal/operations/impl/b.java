package com.onesignal.core.internal.operations.impl;

import I7.p;
import S7.AbstractC0406y;
import S7.C0395m;
import S7.InterfaceC0394l;
import S7.InterfaceC0404w;
import S7.S;
import S7.r0;
import a.AbstractC0422a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import u7.InterfaceC5087e;
import u7.v;
import v7.AbstractC5129j;
import v7.AbstractC5130k;
import v7.AbstractC5131l;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b implements H4.f, com.onesignal.core.internal.startup.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final X5.a _newRecordState;
    private final com.onesignal.core.internal.operations.impl.a _operationModelStore;
    private final K4.a _time;
    private int enqueueIntoBucket;
    private final Map<String, H4.d> executorsMap;
    private final InterfaceC0394l initialized;
    private boolean paused;
    private final List<C0192b> queue;
    private final com.onesignal.common.threading.f retryWaiter;
    private final InterfaceC5087e scope$delegate;
    private final com.onesignal.common.threading.f waiter;

    public static final class c extends B7.h implements p {
        int label;

        public c(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new c(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((c) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return obj;
            }
            com.bumptech.glide.d.k(obj);
            com.onesignal.common.threading.f fVar = b.this.retryWaiter;
            this.label = 1;
            Object waitForWake = fVar.waitForWake(this);
            return waitForWake == aVar ? aVar : waitForWake;
        }
    }

    public static final class d extends B7.c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.delayForPostCreate(0L, this);
        }
    }

    public static final class e extends B7.h implements p {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ H4.g $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(H4.g gVar, boolean z3, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$operation = gVar;
            this.$flush = z3;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new e(this.$operation, this.$flush, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((e) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            b bVar = b.this;
            b.internalEnqueue$default(bVar, new C0192b(this.$operation, null, bVar.enqueueIntoBucket, 0, 10, null), this.$flush, true, null, 8, null);
            return v.f41350a;
        }
    }

    public static final class f extends B7.h implements p {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ H4.g $operation;
        final /* synthetic */ com.onesignal.common.threading.f $waiter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(H4.g gVar, com.onesignal.common.threading.f fVar, boolean z3, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$operation = gVar;
            this.$waiter = fVar;
            this.$flush = z3;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new f(this.$operation, this.$waiter, this.$flush, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((f) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            b bVar = b.this;
            b.internalEnqueue$default(bVar, new C0192b(this.$operation, this.$waiter, bVar.enqueueIntoBucket, 0, 8, null), this.$flush, true, null, 8, null);
            return v.f41350a;
        }
    }

    public static final class g extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.executeOperations$com_onesignal_core(null, this);
        }
    }

    public static final class h extends B7.h implements I7.l {
        final /* synthetic */ boolean $ivRequired;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z3, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$ivRequired = z3;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return b.this.new h(this.$ivRequired, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                b bVar = b.this;
                this.label = 1;
                if (bVar.awaitInitialized(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            if (this.$ivRequired) {
                b.this.removeOperationsWithoutExternalId$com_onesignal_core();
            }
            b.this.forceExecuteOperations();
            return v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((h) create(interfaceC5267d)).invokeSuspend(v.f41350a);
        }
    }

    public static final class i extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processQueueForever(this);
        }
    }

    public static final class j extends kotlin.jvm.internal.i implements I7.a {
        public static final j INSTANCE = new j();

        public j() {
            super(0);
        }

        @Override // I7.a
        public final InterfaceC0404w invoke() {
            new AtomicInteger();
            return AbstractC0406y.b(new S(Executors.newScheduledThreadPool(1, new r0())));
        }
    }

    public static final class k extends kotlin.jvm.internal.i implements I7.l {
        public k() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return v.f41350a;
        }

        public final void invoke(boolean z3) {
            b.this.onJwtConfigHydrated$com_onesignal_core(z3);
        }
    }

    public static final class l extends B7.h implements p {
        int label;

        public l(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new l(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((l) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                b.this.loadSavedOperations$com_onesignal_core();
                b bVar = b.this;
                this.label = 1;
                if (bVar.processQueueForever(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41350a;
        }
    }

    public static final class m extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public m(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.waitForNewOperationAndExecutionInterval(this);
        }
    }

    public static final class n extends B7.h implements p {
        final /* synthetic */ r $wakeMessage;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(r rVar, b bVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$wakeMessage = rVar;
            this.this$0 = bVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new n(this.$wakeMessage, this.this$0, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((n) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                r rVar2 = this.$wakeMessage;
                com.onesignal.common.threading.f fVar = this.this$0.waiter;
                this.L$0 = rVar2;
                this.label = 1;
                Object waitForWake = fVar.waitForWake(this);
                if (waitForWake == aVar) {
                    return aVar;
                }
                rVar = rVar2;
                obj = waitForWake;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) this.L$0;
                com.bumptech.glide.d.k(obj);
            }
            rVar.f38717n = obj;
            return v.f41350a;
        }
    }

    public b(List<? extends H4.d> executors, com.onesignal.core.internal.operations.impl.a _operationModelStore, com.onesignal.core.internal.config.c _configModelStore, K4.a _time, X5.a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.h.e(executors, "executors");
        kotlin.jvm.internal.h.e(_operationModelStore, "_operationModelStore");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_time, "_time");
        kotlin.jvm.internal.h.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.h.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
        this._operationModelStore = _operationModelStore;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this.scope$delegate = AbstractC0422a.q(j.INSTANCE);
        this.queue = new ArrayList();
        this.waiter = new com.onesignal.common.threading.f();
        this.retryWaiter = new com.onesignal.common.threading.f();
        this.initialized = AbstractC0406y.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (H4.d dVar : executors) {
            Iterator<String> it = dVar.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), dVar);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final void dropAndWake(List<C0192b> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.onesignal.common.modeling.b.remove$default(this._operationModelStore, ((C0192b) it.next()).getOperation().getId(), null, 2, null);
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            com.onesignal.common.threading.f waiter = ((C0192b) it2.next()).getWaiter();
            if (waiter != null) {
                waiter.wake(Boolean.FALSE);
            }
        }
    }

    private final int getExecuteBucket() {
        int i6 = this.enqueueIntoBucket;
        if (i6 == 0) {
            return 0;
        }
        return i6 - 1;
    }

    private final List<C0192b> getGroupableOperations(C0192b c0192b) {
        ArrayList w6 = AbstractC5130k.w(c0192b);
        if (c0192b.getOperation().getGroupComparisonType() != H4.c.NONE) {
            String createComparisonKey = c0192b.getOperation().getGroupComparisonType() == H4.c.CREATE ? c0192b.getOperation().getCreateComparisonKey() : c0192b.getOperation().getModifyComparisonKey();
            for (C0192b c0192b2 : AbstractC5129j.L(this.queue)) {
                String createComparisonKey2 = c0192b.getOperation().getGroupComparisonType() == H4.c.CREATE ? c0192b2.getOperation().getCreateComparisonKey() : c0192b2.getOperation().getModifyComparisonKey();
                if (kotlin.jvm.internal.h.a(createComparisonKey2, "") && kotlin.jvm.internal.h.a(createComparisonKey, "")) {
                    throw new Exception("Both comparison keys can not be blank!");
                }
                if (this._newRecordState.canAccess(c0192b2.getOperation().getApplyToRecordId()) && kotlin.jvm.internal.h.a(createComparisonKey2, createComparisonKey)) {
                    this.queue.remove(c0192b2);
                    w6.add(c0192b2);
                }
            }
        }
        return w6;
    }

    private final InterfaceC0404w getScope() {
        return (InterfaceC0404w) this.scope$delegate.getValue();
    }

    private final void internalEnqueue(C0192b c0192b, boolean z3, boolean z6, Integer num) {
        Object obj;
        synchronized (this.queue) {
            try {
                List<C0192b> list = this.queue;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.h.a(((C0192b) it.next()).getOperation().getId(), c0192b.getOperation().getId())) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - operation.id: " + c0192b.getOperation().getId() + " already exists in the queue.", null, 2, null);
                            return;
                        }
                    }
                }
                H4.g operation = c0192b.getOperation();
                if (operation instanceof V5.f) {
                    Iterator<T> it2 = this.queue.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        C0192b c0192b2 = (C0192b) obj;
                        if ((c0192b2.getOperation() instanceof V5.f) && kotlin.jvm.internal.h.a(((V5.f) c0192b2.getOperation()).getOnesignalId(), ((V5.f) operation).getOnesignalId())) {
                            break;
                        }
                    }
                    C0192b c0192b3 = (C0192b) obj;
                    if (c0192b3 != null) {
                        H4.g operation2 = c0192b3.getOperation();
                        kotlin.jvm.internal.h.c(operation2, "null cannot be cast to non-null type com.onesignal.user.internal.operations.LoginUserOperation");
                        V5.f fVar = (V5.f) operation2;
                        String existingOnesignalId = ((V5.f) operation).getExistingOnesignalId();
                        if (existingOnesignalId == null || com.onesignal.common.d.INSTANCE.isLocalId(existingOnesignalId) || fVar.getExistingOnesignalId() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - LoginUserOperation for onesignalId: " + ((V5.f) operation).getOnesignalId() + " already exists in the queue.", null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - merging existingOnesignalId=" + existingOnesignalId + " into queued LoginUserOperation for onesignalId: " + ((V5.f) operation).getOnesignalId() + '.', null, 2, null);
                            fVar.setExistingOnesignalId$com_onesignal_core(existingOnesignalId);
                        }
                        if (c0192b.getWaiter() == null || c0192b3.getWaiter() != null) {
                            com.onesignal.common.threading.f waiter = c0192b.getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.TRUE);
                            }
                        } else {
                            c0192b3.setWaiter(c0192b.getWaiter());
                        }
                        if (!z6) {
                            com.onesignal.common.modeling.b.remove$default(this._operationModelStore, c0192b.getOperation().getId(), null, 2, null);
                        }
                        return;
                    }
                }
                if (num != null) {
                    this.queue.add(num.intValue(), c0192b);
                } else {
                    this.queue.add(c0192b);
                }
                if (z6) {
                    com.onesignal.common.modeling.b.add$default(this._operationModelStore, c0192b.getOperation(), null, 2, null);
                }
                this.waiter.wake(new a(z3, 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void internalEnqueue$default(b bVar, C0192b c0192b, boolean z3, boolean z6, Integer num, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            num = null;
        }
        bVar.internalEnqueue(c0192b, z3, z6, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r2.executeOperations$com_onesignal_core(r12, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (S7.AbstractC0406y.f(r7, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        if (r2.waitForNewOperationAndExecutionInterval(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00dc -> B:14:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e7 -> B:13:0x00ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processQueueForever(InterfaceC5267d interfaceC5267d) {
        i iVar;
        int i6;
        b bVar;
        List L6;
        if (interfaceC5267d instanceof i) {
            iVar = (i) interfaceC5267d;
            int i9 = iVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                iVar.label = i9 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = iVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    iVar.L$0 = this;
                    iVar.label = 1;
                    if (waitForNewOperationAndExecutionInterval(iVar) != aVar) {
                        bVar = this;
                    }
                    return aVar;
                }
                if (i6 == 1) {
                    bVar = (b) iVar.L$0;
                    com.bumptech.glide.d.k(obj);
                } else if (i6 == 2) {
                    bVar = (b) iVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    long opRepoPostWakeDelay = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getOpRepoPostWakeDelay();
                    iVar.L$0 = bVar;
                    iVar.label = 3;
                } else {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) iVar.L$0;
                        com.bumptech.glide.d.k(obj);
                        bVar.enqueueIntoBucket++;
                        if (!bVar.paused) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo is paused", null, 2, null);
                            return v.f41350a;
                        }
                        List<C0192b> nextOps$com_onesignal_core = bVar.getNextOps$com_onesignal_core(bVar.getExecuteBucket());
                        if (com.onesignal.debug.internal.logging.b.atLogLevel(M4.c.DEBUG)) {
                            synchronized (bVar.queue) {
                                L6 = AbstractC5129j.L(bVar.queue);
                            }
                            com.onesignal.debug.internal.logging.b.debug$default("processQueueForever:ops:\n" + nextOps$com_onesignal_core + "\nqueue(" + L6.size() + "):\n" + L6, null, 2, null);
                        }
                        if (nextOps$com_onesignal_core != null) {
                            iVar.L$0 = bVar;
                            iVar.label = 2;
                        } else {
                            iVar.L$0 = bVar;
                            iVar.label = 4;
                        }
                        return aVar;
                    }
                    bVar = (b) iVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    if (!bVar.paused) {
                    }
                }
                bVar.enqueueIntoBucket++;
                if (!bVar.paused) {
                }
            }
        }
        iVar = new i(interfaceC5267d);
        Object obj2 = iVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = iVar.label;
        if (i6 != 0) {
        }
        bVar.enqueueIntoBucket++;
        if (!bVar.paused) {
        }
    }

    private final boolean shouldSuppressAnonymousOp(H4.g gVar) {
        boolean z3 = false;
        if (!this._identityVerificationService.getNewCodePathsRun() || (gVar instanceof V5.f)) {
            return false;
        }
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED && gVar.getExternalId() == null) {
            z3 = true;
        }
        if (z3) {
            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: suppressing anonymous op under IV-required: " + gVar, null, 2, null);
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009a -> B:11:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForNewOperationAndExecutionInterval(InterfaceC5267d interfaceC5267d) {
        m mVar;
        int i6;
        r rVar;
        b bVar;
        r rVar2;
        long opRepoExecutionInterval;
        r rVar3;
        b bVar2;
        if (interfaceC5267d instanceof m) {
            mVar = (m) interfaceC5267d;
            int i9 = mVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                mVar.label = i9 - Integer.MIN_VALUE;
                Object obj = mVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = mVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    rVar = new r();
                    com.onesignal.common.threading.f fVar = this.waiter;
                    mVar.L$0 = this;
                    mVar.L$1 = rVar;
                    mVar.L$2 = rVar;
                    mVar.label = 1;
                    obj = fVar.waitForWake(mVar);
                    if (obj != aVar) {
                        bVar = this;
                        rVar2 = rVar;
                    }
                    return aVar;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar3 = (r) mVar.L$1;
                    bVar2 = (b) mVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    if (obj != null) {
                        opRepoExecutionInterval = ((com.onesignal.core.internal.config.b) bVar2._configModelStore.getModel()).getOpRepoExecutionInterval();
                        if (!((a) rVar3.f38717n).getForce()) {
                            n nVar = new n(rVar3, bVar2, null);
                            mVar.L$0 = bVar2;
                            mVar.L$1 = rVar3;
                            mVar.L$2 = null;
                            mVar.label = 2;
                            obj = AbstractC0406y.A(opRepoExecutionInterval, nVar, mVar);
                        }
                    }
                    return v.f41350a;
                }
                rVar = (r) mVar.L$2;
                rVar2 = (r) mVar.L$1;
                bVar = (b) mVar.L$0;
                com.bumptech.glide.d.k(obj);
                rVar.f38717n = obj;
                opRepoExecutionInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) rVar2.f38717n).getPreviousWaitedTime();
                rVar3 = rVar2;
                bVar2 = bVar;
                if (!((a) rVar3.f38717n).getForce()) {
                }
                return v.f41350a;
            }
        }
        mVar = new m(interfaceC5267d);
        Object obj2 = mVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = mVar.label;
        if (i6 != 0) {
        }
        rVar.f38717n = obj2;
        opRepoExecutionInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) rVar2.f38717n).getPreviousWaitedTime();
        rVar3 = rVar2;
        bVar2 = bVar;
        if (!((a) rVar3.f38717n).getForce()) {
        }
        return v.f41350a;
    }

    @Override // H4.f
    public Object awaitInitialized(InterfaceC5267d interfaceC5267d) {
        Object U3 = ((C0395m) this.initialized).U(interfaceC5267d);
        return U3 == A7.a.f58n ? U3 : v.f41350a;
    }

    @Override // H4.f
    public <T extends H4.g> boolean containsInstanceOf(O7.c type) {
        boolean z3;
        boolean isInstance;
        kotlin.jvm.internal.h.e(type, "type");
        synchronized (this.queue) {
            try {
                List<C0192b> list = this.queue;
                z3 = false;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        H4.g operation = ((C0192b) it.next()).getOperation();
                        Class jClass = ((kotlin.jvm.internal.d) type).f38710n;
                        kotlin.jvm.internal.h.e(jClass, "jClass");
                        Map map = kotlin.jvm.internal.d.f38709u;
                        kotlin.jvm.internal.h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                        Integer num = (Integer) map.get(jClass);
                        if (num != null) {
                            isInstance = u.c(num.intValue(), operation);
                        } else {
                            if (jClass.isPrimitive()) {
                                jClass = S0.f.j(s.a(jClass));
                            }
                            isInstance = jClass.isInstance(operation);
                        }
                        if (isInstance) {
                            z3 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final Object delayBeforeNextExecution(int i6, Integer num, InterfaceC5267d interfaceC5267d) {
        com.onesignal.debug.internal.logging.b.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long max = Math.max(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getOpRepoDefaultFailRetryBackoff() * i6, (num != null ? num.intValue() : 0L) * 1000);
        v vVar = v.f41350a;
        if (max < 1) {
            return vVar;
        }
        com.onesignal.debug.internal.logging.b.debug$default("Operations being delay for: " + max + " ms", null, 2, null);
        Object A9 = AbstractC0406y.A(max, new c(null), interfaceC5267d);
        return A9 == A7.a.f58n ? A9 : vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayForPostCreate(long j6, InterfaceC5267d interfaceC5267d) {
        d dVar;
        int i6;
        b bVar;
        if (interfaceC5267d instanceof d) {
            dVar = (d) interfaceC5267d;
            int i9 = dVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.label = i9 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = dVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    dVar.L$0 = this;
                    dVar.J$0 = j6;
                    dVar.label = 1;
                    if (AbstractC0406y.f(j6, dVar) == aVar) {
                        return aVar;
                    }
                    bVar = this;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j6 = dVar.J$0;
                    bVar = (b) dVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                synchronized (bVar.queue) {
                    if (!bVar.queue.isEmpty()) {
                        bVar.waiter.wake(new a(false, j6));
                    }
                }
                return v.f41350a;
            }
        }
        dVar = new d(interfaceC5267d);
        Object obj2 = dVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = dVar.label;
        if (i6 != 0) {
        }
        synchronized (bVar.queue) {
        }
    }

    @Override // H4.f
    public void enqueue(H4.g operation, boolean z3) {
        kotlin.jvm.internal.h.e(operation, "operation");
        if (shouldSuppressAnonymousOp(operation)) {
            return;
        }
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "OperationRepo.enqueue(operation: " + operation + ", flush: " + z3 + ')');
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.h.d(uuid, "toString(...)");
        operation.setId(uuid);
        AbstractC0406y.o(getScope(), null, new e(operation, z3, null), 3);
    }

    @Override // H4.f
    public Object enqueueAndWait(H4.g gVar, boolean z3, InterfaceC5267d interfaceC5267d) {
        if (shouldSuppressAnonymousOp(gVar)) {
            return Boolean.FALSE;
        }
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "OperationRepo.enqueueAndWait(operation: " + gVar + ", force: " + z3 + ')');
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.h.d(uuid, "toString(...)");
        gVar.setId(uuid);
        com.onesignal.common.threading.f fVar = new com.onesignal.common.threading.f();
        AbstractC0406y.o(getScope(), null, new f(gVar, fVar, z3, null), 3);
        return fVar.waitForWake(interfaceC5267d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(9:21|22|23|24|25|(1:27)|14|15|16))(4:34|35|36|37))(4:190|191|192|(6:194|(2:197|195)|198|199|(1:201)|29)(2:202|203))|38|39|(8:41|(2:44|42)|45|46|11b|55|(2:58|56)|59)|64|65))|207|6|7|(0)(0)|38|39|(0)|64|65|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0116, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x003f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0396, code lost:
    
        if (r0 == r5) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d7 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0223 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027f A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0298 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c9 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x037d A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #9 {all -> 0x003f, blocks: (B:13:0x003a, B:25:0x0377, B:27:0x037d), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0309 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:39:0x00da, B:41:0x00fa, B:42:0x00fe, B:44:0x0104, B:46:0x0119, B:47:0x011b, B:54:0x013c, B:55:0x013d, B:56:0x0149, B:58:0x014f, B:62:0x015b, B:63:0x015c, B:64:0x015d, B:65:0x016a, B:67:0x0303, B:69:0x0309, B:70:0x030b, B:77:0x035d, B:81:0x035f, B:82:0x0360, B:83:0x0361, B:86:0x0170, B:87:0x018a, B:89:0x0190, B:92:0x019c, B:97:0x01a2, B:98:0x01a4, B:106:0x01d3, B:110:0x01d5, B:111:0x01d6, B:112:0x01d7, B:113:0x01ed, B:125:0x021e, B:130:0x0221, B:131:0x0222, B:132:0x0223, B:134:0x0236, B:135:0x023b, B:136:0x023d, B:154:0x027a, B:159:0x027d, B:160:0x027e, B:161:0x027f, B:162:0x0298, B:164:0x02a0, B:167:0x02b0, B:168:0x02c9, B:169:0x02cd, B:171:0x02d3, B:173:0x02e7, B:174:0x02eb, B:176:0x02f1, B:179:0x02fd, B:100:0x01a5, B:101:0x01ad, B:103:0x01b3, B:115:0x01ee, B:116:0x01f7, B:118:0x01fd, B:120:0x0211, B:122:0x0218, B:49:0x011c, B:50:0x0122, B:52:0x0128, B:72:0x030c, B:73:0x0318, B:75:0x031e, B:138:0x023e, B:139:0x0247, B:141:0x024d, B:144:0x025a, B:149:0x0260, B:150:0x0268, B:152:0x026e), top: B:38:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.onesignal.core.internal.operations.impl.b] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeOperations$com_onesignal_core(List<C0192b> list, InterfaceC5267d interfaceC5267d) {
        g gVar;
        int i6;
        ArrayList arrayList;
        C0192b c0192b;
        b bVar;
        H4.a aVar;
        int i9;
        Integer retryAfterSeconds;
        b bVar2;
        List<C0192b> list2 = list;
        ?? r32 = "Could not find executor for operation ";
        if (interfaceC5267d instanceof g) {
            gVar = (g) interfaceC5267d;
            int i10 = gVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.label = i10 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                A7.a aVar2 = A7.a.f58n;
                i6 = gVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    try {
                        C0192b c0192b2 = (C0192b) AbstractC5129j.A(list2);
                        H4.d dVar = this.executorsMap.get(c0192b2.getOperation().getName());
                        if (dVar == null) {
                            throw new Exception("Could not find executor for operation " + c0192b2.getOperation().getName());
                        }
                        arrayList = new ArrayList(AbstractC5131l.y(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C0192b) it.next()).getOperation());
                        }
                        gVar.L$0 = this;
                        gVar.L$1 = list2;
                        gVar.L$2 = c0192b2;
                        gVar.L$3 = arrayList;
                        gVar.label = 1;
                        Object execute = dVar.execute(arrayList, gVar);
                        if (execute != aVar2) {
                            c0192b = c0192b2;
                            obj = execute;
                            bVar = this;
                        }
                        return aVar2;
                    } catch (Throwable th) {
                        th = th;
                        r32 = this;
                        com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        r32.dropAndWake(list2);
                        return v.f41350a;
                    }
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) gVar.L$1;
                        b bVar3 = (b) gVar.L$0;
                        com.bumptech.glide.d.k(obj);
                        r32 = bVar3;
                        return v.f41350a;
                    }
                    H4.a aVar3 = (H4.a) gVar.L$2;
                    List<C0192b> list3 = (List) gVar.L$1;
                    b bVar4 = (b) gVar.L$0;
                    try {
                        com.bumptech.glide.d.k(obj);
                        aVar = aVar3;
                        list2 = list3;
                        bVar2 = bVar4;
                        r32 = bVar2;
                        if (aVar.getIdTranslations() != null) {
                            long opRepoPostCreateDelay = ((com.onesignal.core.internal.config.b) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                            gVar.L$0 = bVar2;
                            gVar.L$1 = list2;
                            gVar.L$2 = null;
                            gVar.label = 3;
                            Object delayForPostCreate = bVar2.delayForPostCreate(opRepoPostCreateDelay, gVar);
                            r32 = bVar2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        list2 = list3;
                        r32 = bVar4;
                        com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        r32.dropAndWake(list2);
                        return v.f41350a;
                    }
                    return v.f41350a;
                }
                ?? r22 = (List) gVar.L$3;
                C0192b c0192b3 = (C0192b) gVar.L$2;
                List<C0192b> list4 = (List) gVar.L$1;
                bVar = (b) gVar.L$0;
                try {
                    com.bumptech.glide.d.k(obj);
                    arrayList = r22;
                    list2 = list4;
                    c0192b = c0192b3;
                } catch (Throwable th3) {
                    th = th3;
                    list2 = list4;
                    r32 = bVar;
                    com.onesignal.debug.internal.logging.b.log(M4.c.ERROR, "Error attempting to execute operation: " + list2, th);
                    r32.dropAndWake(list2);
                    return v.f41350a;
                }
                aVar = (H4.a) obj;
                com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + aVar.getResult(), null, 2, null);
                if (aVar.getIdTranslations() != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C0192b) it2.next()).getOperation().translateIds(aVar.getIdTranslations());
                    }
                    synchronized (bVar.queue) {
                        Iterator it3 = bVar.queue.iterator();
                        while (it3.hasNext()) {
                            ((C0192b) it3.next()).getOperation().translateIds(aVar.getIdTranslations());
                        }
                    }
                    Iterator it4 = aVar.getIdTranslations().values().iterator();
                    while (it4.hasNext()) {
                        bVar._newRecordState.add((String) it4.next());
                    }
                }
                switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[aVar.getResult().ordinal()]) {
                    case 1:
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            com.onesignal.common.modeling.b.remove$default(bVar._operationModelStore, ((C0192b) it5.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            com.onesignal.common.threading.f waiter = ((C0192b) it6.next()).getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.TRUE);
                            }
                        }
                        i9 = 0;
                        if (aVar.getOperations() != null) {
                            synchronized (bVar.queue) {
                                for (H4.g gVar2 : AbstractC5129j.I(aVar.getOperations())) {
                                    String uuid = UUID.randomUUID().toString();
                                    kotlin.jvm.internal.h.d(uuid, "toString(...)");
                                    gVar2.setId(uuid);
                                    C0192b c0192b4 = new C0192b(gVar2, null, 0, 0, 10, null);
                                    bVar.queue.add(0, c0192b4);
                                    com.onesignal.common.modeling.b.add$default(bVar._operationModelStore, 0, c0192b4.getOperation(), null, 4, null);
                                }
                            }
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i9, retryAfterSeconds, gVar) != aVar2) {
                            bVar2 = bVar;
                            r32 = bVar2;
                            if (aVar.getIdTranslations() != null) {
                            }
                            return v.f41350a;
                        }
                        return aVar2;
                    case 2:
                        if (!bVar._identityVerificationService.getNewCodePathsRun() || !com.onesignal.core.internal.operations.impl.d.handleFailUnauthorized(bVar, c0192b, list2, bVar._jwtTokenStore, bVar._identityVerificationService.getIvBehaviorActive())) {
                            com.onesignal.debug.internal.logging.b.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                            bVar.dropAndWake(list2);
                        }
                        i9 = 0;
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i9, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    case 3:
                    case 4:
                        com.onesignal.debug.internal.logging.b.warn$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                        bVar.dropAndWake(list2);
                        i9 = 0;
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i9, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    case 5:
                        com.onesignal.common.modeling.b.remove$default(bVar._operationModelStore, c0192b.getOperation().getId(), null, 2, null);
                        com.onesignal.common.threading.f waiter2 = c0192b.getWaiter();
                        if (waiter2 != null) {
                            waiter2.wake(Boolean.TRUE);
                        }
                        synchronized (bVar.queue) {
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (!kotlin.jvm.internal.h.a((C0192b) obj2, c0192b)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                Iterator it7 = AbstractC5129j.I(arrayList2).iterator();
                                while (it7.hasNext()) {
                                    bVar.queue.add(0, (C0192b) it7.next());
                                }
                            } finally {
                            }
                        }
                        i9 = 0;
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i9, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    case 6:
                        com.onesignal.debug.internal.logging.b.info$default("Operation execution failed, retrying: " + arrayList, null, 2, null);
                        synchronized (bVar.queue) {
                            try {
                                i9 = 0;
                                for (C0192b c0192b5 : AbstractC5129j.I(list2)) {
                                    c0192b5.setRetries(c0192b5.getRetries() + 1);
                                    if (c0192b5.getRetries() > i9) {
                                        i9 = c0192b5.getRetries();
                                    }
                                    bVar.queue.add(0, c0192b5);
                                }
                            } finally {
                            }
                        }
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i9, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    case 7:
                        com.onesignal.debug.internal.logging.b.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + arrayList, null, 2, null);
                        bVar.paused = true;
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            com.onesignal.common.threading.f waiter3 = ((C0192b) it8.next()).getWaiter();
                            if (waiter3 != null) {
                                waiter3.wake(Boolean.FALSE);
                            }
                        }
                        synchronized (bVar.queue) {
                            for (C0192b c0192b6 : AbstractC5129j.I(list2)) {
                                bVar.queue.add(0, new C0192b(c0192b6.getOperation(), null, c0192b6.getBucket(), c0192b6.getRetries()));
                            }
                        }
                        i9 = 0;
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i9, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                    default:
                        i9 = 0;
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        gVar.L$0 = bVar;
                        gVar.L$1 = list2;
                        gVar.L$2 = aVar;
                        gVar.L$3 = null;
                        gVar.label = 2;
                        if (bVar.delayBeforeNextExecution(i9, retryAfterSeconds, gVar) != aVar2) {
                        }
                        return aVar2;
                }
            }
        }
        gVar = new g(interfaceC5267d);
        Object obj3 = gVar.result;
        A7.a aVar22 = A7.a.f58n;
        i6 = gVar.label;
        if (i6 != 0) {
        }
        aVar = (H4.a) obj3;
        com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + aVar.getResult(), null, 2, null);
        if (aVar.getIdTranslations() != null) {
        }
        switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[aVar.getResult().ordinal()]) {
        }
    }

    @Override // H4.f
    public void forceExecuteOperations() {
        int i6 = 2;
        kotlin.jvm.internal.e eVar = null;
        long j6 = 0;
        this.retryWaiter.wake(new a(true, j6, i6, eVar));
        this.waiter.wake(new a(false, j6, i6, eVar));
    }

    public final List<C0192b> getNextOps$com_onesignal_core(int i6) {
        Object obj;
        List<C0192b> list = null;
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.UNKNOWN) {
            return null;
        }
        boolean newCodePathsRun = this._identityVerificationService.getNewCodePathsRun();
        boolean ivBehaviorActive = this._identityVerificationService.getIvBehaviorActive();
        synchronized (this.queue) {
            try {
                Iterator<T> it = this.queue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C0192b c0192b = (C0192b) obj;
                    if (c0192b.getOperation().getCanStartExecute() && this._newRecordState.canAccess(c0192b.getOperation().getApplyToRecordId()) && c0192b.getBucket() <= i6 && (!newCodePathsRun || com.onesignal.core.internal.operations.impl.d.hasValidJwtIfRequired(this, this._jwtTokenStore, c0192b.getOperation(), ivBehaviorActive))) {
                        break;
                    }
                }
                C0192b c0192b2 = (C0192b) obj;
                if (c0192b2 != null) {
                    this.queue.remove(c0192b2);
                    list = getGroupableOperations(c0192b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final List<C0192b> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = AbstractC5129j.I(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new C0192b((H4.g) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        ((C0395m) this.initialized).J(v.f41350a);
    }

    public final void onJwtConfigHydrated$com_onesignal_core(boolean z3) {
        com.onesignal.common.threading.c.suspendifyOnIO(new h(z3, null));
    }

    public final void removeOperationsWithoutExternalId$com_onesignal_core() {
        ArrayList arrayList;
        synchronized (this.queue) {
            try {
                List<C0192b> list = this.queue;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((C0192b) obj).getOperation().getExternalId() == null) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.onesignal.common.threading.f waiter = ((C0192b) it.next()).getWaiter();
                    if (waiter != null) {
                        waiter.wake(Boolean.FALSE);
                    }
                }
                this.queue.removeAll(arrayList2);
                Iterator<T> it2 = this.queue.iterator();
                while (it2.hasNext()) {
                    H4.g operation = ((C0192b) it2.next()).getOperation();
                    if ((operation instanceof V5.f) && ((V5.f) operation).getExistingOnesignalId() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: cleared existingOnesignalId on LoginUserOperation (was " + ((V5.f) operation).getExistingOnesignalId() + ')', null, 2, null);
                        ((V5.f) operation).setExistingOnesignalId$com_onesignal_core(null);
                    }
                }
                com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: removeOperationsWithoutExternalId removed " + arrayList2.size() + " of " + (arrayList2.size() + this.queue.size()) + " operations", null, 2, null);
                arrayList = new ArrayList(AbstractC5131l.y(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((C0192b) it3.next()).getOperation().getId());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            com.onesignal.common.modeling.b.remove$default(this._operationModelStore, (String) it4.next(), null, 2, null);
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this.paused = false;
        this._identityVerificationService.setOnJwtConfigHydratedHandler(new k());
        AbstractC0406y.o(getScope(), null, new l(null), 3);
    }

    public static final class a {
        private final boolean force;
        private final long previousWaitedTime;

        public a(boolean z3, long j6) {
            this.force = z3;
            this.previousWaitedTime = j6;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public /* synthetic */ a(boolean z3, long j6, int i, kotlin.jvm.internal.e eVar) {
            this(z3, (i & 2) != 0 ? 0L : j6);
        }
    }

    /* renamed from: com.onesignal.core.internal.operations.impl.b$b, reason: collision with other inner class name */
    public static final class C0192b {
        private final int bucket;
        private final H4.g operation;
        private int retries;
        private com.onesignal.common.threading.f waiter;

        public C0192b(H4.g operation, com.onesignal.common.threading.f fVar, int i, int i6) {
            kotlin.jvm.internal.h.e(operation, "operation");
            this.operation = operation;
            this.waiter = fVar;
            this.bucket = i;
            this.retries = i6;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final H4.g getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final com.onesignal.common.threading.f getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i) {
            this.retries = i;
        }

        public final void setWaiter(com.onesignal.common.threading.f fVar) {
            this.waiter = fVar;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ C0192b(H4.g gVar, com.onesignal.common.threading.f fVar, int i, int i6, int i9, kotlin.jvm.internal.e eVar) {
            this(gVar, (i9 & 2) != 0 ? null : fVar, i, (i9 & 8) != 0 ? 0 : i6);
        }
    }
}
