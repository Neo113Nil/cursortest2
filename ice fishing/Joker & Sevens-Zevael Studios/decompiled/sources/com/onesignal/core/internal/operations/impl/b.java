package com.onesignal.core.internal.operations.impl;

import ac.o;
import bc.n;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import pc.s;
import yc.a0;
import yc.l;
import yc.m;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements z8.f, d9.b {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final mb.a _newRecordState;
    private final com.onesignal.core.internal.operations.impl.a _operationModelStore;
    private final e9.a _time;
    private y coroutineScope;
    private int enqueueIntoBucket;
    private final Map<String, z8.d> executorsMap;
    private final l initialized;
    private boolean paused;
    private final List<C0018b> queue;
    private final com.onesignal.common.threading.d retryWaiter;
    private final com.onesignal.common.threading.d waiter;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.j implements oc.e {
        int label;

        public c(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new c(dVar);
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
            com.onesignal.common.threading.d dVar = b.this.retryWaiter;
            this.label = 1;
            Object waitForWake = dVar.waitForWake(this);
            gc.a aVar = gc.a.f2559g;
            return waitForWake == aVar ? aVar : waitForWake;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((c) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.delayForPostCreate(0L, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.j implements oc.c {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ z8.g $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(z8.g gVar, boolean z10, fc.d dVar) {
            super(1, dVar);
            this.$operation = gVar;
            this.$flush = z10;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return b.this.new e(this.$operation, this.$flush, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((e) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            b bVar = b.this;
            b.internalEnqueue$default(bVar, new C0018b(this.$operation, null, bVar.enqueueIntoBucket, 0, 10, null), this.$flush, true, null, 8, null);
            return o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.executeOperations$com_onesignal_core(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public g(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processQueueForever(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.j implements oc.e {
        int label;

        public h(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new h(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                b.this.loadSavedOperations$com_onesignal_core();
                b bVar = b.this;
                this.label = 1;
                Object processQueueForever = bVar.processQueueForever(this);
                gc.a aVar = gc.a.f2559g;
                if (processQueueForever == aVar) {
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

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((h) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class i extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public i(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.waitForNewOperationAndExecutionInterval(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class j extends hc.j implements oc.e {
        final /* synthetic */ s $wakeMessage;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(s sVar, b bVar, fc.d dVar) {
            super(2, dVar);
            this.$wakeMessage = sVar;
            this.this$0 = bVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new j(this.$wakeMessage, this.this$0, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            s sVar;
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                sVar = this.$wakeMessage;
                com.onesignal.common.threading.d dVar = this.this$0.waiter;
                this.L$0 = sVar;
                this.label = 1;
                obj = dVar.waitForWake(this);
                gc.a aVar = gc.a.f2559g;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) this.L$0;
                v6.a.W(obj);
            }
            sVar.f5683g = obj;
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((j) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    public b(List<? extends z8.d> list, com.onesignal.core.internal.operations.impl.a aVar, com.onesignal.core.internal.config.b bVar, e9.a aVar2, mb.a aVar3) {
        pc.j.e(list, "executors");
        pc.j.e(aVar, "_operationModelStore");
        pc.j.e(bVar, "_configModelStore");
        pc.j.e(aVar2, "_time");
        pc.j.e(aVar3, "_newRecordState");
        this._operationModelStore = aVar;
        this._configModelStore = bVar;
        this._time = aVar2;
        this._newRecordState = aVar3;
        this.queue = new ArrayList();
        this.waiter = new com.onesignal.common.threading.d();
        this.retryWaiter = new com.onesignal.common.threading.d();
        this.coroutineScope = a0.a(a0.r("OpRepo"));
        m mVar = new m(true);
        mVar.P(null);
        this.initialized = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (z8.d dVar : list) {
            Iterator<String> it = dVar.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), dVar);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final int getExecuteBucket() {
        int i10 = this.enqueueIntoBucket;
        if (i10 == 0) {
            return 0;
        }
        return i10 - 1;
    }

    private final List<C0018b> getGroupableOperations(C0018b c0018b) {
        ArrayList M = n.M(c0018b);
        if (c0018b.getOperation().getGroupComparisonType() != z8.c.NONE) {
            String createComparisonKey = c0018b.getOperation().getGroupComparisonType() == z8.c.CREATE ? c0018b.getOperation().getCreateComparisonKey() : c0018b.getOperation().getModifyComparisonKey();
            for (C0018b c0018b2 : bc.m.e0(this.queue)) {
                String createComparisonKey2 = c0018b.getOperation().getGroupComparisonType() == z8.c.CREATE ? c0018b2.getOperation().getCreateComparisonKey() : c0018b2.getOperation().getModifyComparisonKey();
                if (pc.j.a(createComparisonKey2, "") && pc.j.a(createComparisonKey, "")) {
                    throw new Exception("Both comparison keys can not be blank!");
                }
                if (this._newRecordState.canAccess(c0018b2.getOperation().getApplyToRecordId()) && pc.j.a(createComparisonKey2, createComparisonKey)) {
                    this.queue.remove(c0018b2);
                    M.add(c0018b2);
                }
            }
        }
        return M;
    }

    private final void internalEnqueue(C0018b c0018b, boolean z10, boolean z11, Integer num) {
        synchronized (this.queue) {
            try {
                List<C0018b> list = this.queue;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (pc.j.a(((C0018b) it.next()).getOperation().getId(), c0018b.getOperation().getId())) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - operation.id: " + c0018b.getOperation().getId() + " already exists in the queue.", null, 2, null);
                            return;
                        }
                    }
                }
                if (num != null) {
                    this.queue.add(num.intValue(), c0018b);
                } else {
                    this.queue.add(c0018b);
                }
                if (z11) {
                    com.onesignal.common.modeling.b.add$default(this._operationModelStore, c0018b.getOperation(), null, 2, null);
                }
                this.waiter.wake(new a(z10, 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void internalEnqueue$default(b bVar, C0018b c0018b, boolean z10, boolean z11, Integer num, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        bVar.internalEnqueue(c0018b, z10, z11, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r1.executeOperations$com_onesignal_core(r11, r0) == r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (yc.a0.f(r7, r0) == r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        if (r1.waitForNewOperationAndExecutionInterval(r0) == r6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b0 -> B:14:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bb -> B:13:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processQueueForever(fc.d dVar) {
        g gVar;
        int i10;
        b bVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i11 = gVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.label = i11 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                i10 = gVar.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    gVar.L$0 = this;
                    gVar.label = 1;
                    if (waitForNewOperationAndExecutionInterval(gVar) != aVar) {
                        bVar = this;
                    }
                    return aVar;
                }
                if (i10 == 1) {
                    bVar = (b) gVar.L$0;
                    v6.a.W(obj);
                } else if (i10 == 2) {
                    bVar = (b) gVar.L$0;
                    v6.a.W(obj);
                    long opRepoPostWakeDelay = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getOpRepoPostWakeDelay();
                    gVar.L$0 = bVar;
                    gVar.label = 3;
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) gVar.L$0;
                        v6.a.W(obj);
                        bVar.enqueueIntoBucket++;
                        if (!bVar.paused) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo is paused", null, 2, null);
                            return o.f277a;
                        }
                        List<C0018b> nextOps$com_onesignal_core = bVar.getNextOps$com_onesignal_core(bVar.getExecuteBucket());
                        com.onesignal.debug.internal.logging.b.debug$default("processQueueForever:ops:\n" + nextOps$com_onesignal_core, null, 2, null);
                        if (nextOps$com_onesignal_core != null) {
                            gVar.L$0 = bVar;
                            gVar.label = 2;
                        } else {
                            gVar.L$0 = bVar;
                            gVar.label = 4;
                        }
                        return aVar;
                    }
                    bVar = (b) gVar.L$0;
                    v6.a.W(obj);
                    if (!bVar.paused) {
                    }
                }
                bVar.enqueueIntoBucket++;
                if (!bVar.paused) {
                }
            }
        }
        gVar = new g(dVar);
        Object obj2 = gVar.result;
        i10 = gVar.label;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        bVar.enqueueIntoBucket++;
        if (!bVar.paused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (r11 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009a -> B:11:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForNewOperationAndExecutionInterval(fc.d dVar) {
        i iVar;
        int i10;
        s sVar;
        b bVar;
        s sVar2;
        long opRepoExecutionInterval;
        s sVar3;
        b bVar2;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i11 = iVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.label = i11 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                i10 = iVar.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    sVar = new s();
                    com.onesignal.common.threading.d dVar2 = this.waiter;
                    iVar.L$0 = this;
                    iVar.L$1 = sVar;
                    iVar.L$2 = sVar;
                    iVar.label = 1;
                    obj = dVar2.waitForWake(iVar);
                    if (obj != aVar) {
                        bVar = this;
                        sVar2 = sVar;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar3 = (s) iVar.L$1;
                    bVar2 = (b) iVar.L$0;
                    v6.a.W(obj);
                    if (obj != null) {
                        opRepoExecutionInterval = ((com.onesignal.core.internal.config.a) bVar2._configModelStore.getModel()).getOpRepoExecutionInterval();
                        if (!((a) sVar3.f5683g).getForce()) {
                            j jVar = new j(sVar3, bVar2, null);
                            iVar.L$0 = bVar2;
                            iVar.L$1 = sVar3;
                            iVar.L$2 = null;
                            iVar.label = 2;
                            obj = a0.C(opRepoExecutionInterval, jVar, iVar);
                        }
                    }
                    return o.f277a;
                }
                sVar = (s) iVar.L$2;
                sVar2 = (s) iVar.L$1;
                bVar = (b) iVar.L$0;
                v6.a.W(obj);
                sVar.f5683g = obj;
                opRepoExecutionInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) sVar2.f5683g).getPreviousWaitedTime();
                sVar3 = sVar2;
                bVar2 = bVar;
                if (!((a) sVar3.f5683g).getForce()) {
                }
                return o.f277a;
            }
        }
        iVar = new i(dVar);
        Object obj2 = iVar.result;
        i10 = iVar.label;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        sVar.f5683g = obj2;
        opRepoExecutionInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) sVar2.f5683g).getPreviousWaitedTime();
        sVar3 = sVar2;
        bVar2 = bVar;
        if (!((a) sVar3.f5683g).getForce()) {
        }
        return o.f277a;
    }

    @Override // z8.f
    public Object awaitInitialized(fc.d dVar) {
        Object d02 = ((m) this.initialized).d0(dVar);
        return d02 == gc.a.f2559g ? d02 : o.f277a;
    }

    @Override // z8.f
    public <T extends z8.g> boolean containsInstanceOf(vc.b bVar) {
        boolean z10;
        pc.j.e(bVar, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY);
        synchronized (this.queue) {
            try {
                List<C0018b> list = this.queue;
                z10 = false;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((pc.e) bVar).d(((C0018b) it.next()).getOperation())) {
                            z10 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final Object delayBeforeNextExecution(int i10, Integer num, fc.d dVar) {
        com.onesignal.debug.internal.logging.b.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long max = Math.max(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getOpRepoDefaultFailRetryBackoff() * i10, (num != null ? num.intValue() : 0L) * 1000);
        o oVar = o.f277a;
        if (max < 1) {
            return oVar;
        }
        com.onesignal.debug.internal.logging.b.error$default("Operations being delay for: " + max + " ms", null, 2, null);
        Object C = a0.C(max, new c(null), dVar);
        return C == gc.a.f2559g ? C : oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayForPostCreate(long j3, fc.d dVar) {
        d dVar2;
        int i10;
        b bVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                gc.a aVar = gc.a.f2559g;
                i10 = dVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    dVar2.L$0 = this;
                    dVar2.J$0 = j3;
                    dVar2.label = 1;
                    if (a0.f(j3, dVar2) == aVar) {
                        return aVar;
                    }
                    bVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = dVar2.J$0;
                    bVar = (b) dVar2.L$0;
                    v6.a.W(obj);
                }
                synchronized (bVar.queue) {
                    if (!bVar.queue.isEmpty()) {
                        bVar.waiter.wake(new a(false, j3));
                    }
                }
                return o.f277a;
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.result;
        gc.a aVar2 = gc.a.f2559g;
        i10 = dVar2.label;
        if (i10 != 0) {
        }
        synchronized (bVar.queue) {
        }
    }

    @Override // z8.f
    public void enqueue(z8.g gVar, boolean z10) {
        pc.j.e(gVar, "operation");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "OperationRepo.enqueue(operation: " + gVar + ", flush: " + z10 + ')');
        String uuid = UUID.randomUUID().toString();
        pc.j.d(uuid, "randomUUID().toString()");
        gVar.setId(uuid);
        com.onesignal.common.threading.a.INSTANCE.execute(new e(gVar, z10, null));
    }

    @Override // z8.f
    public Object enqueueAndWait(z8.g gVar, boolean z10, fc.d dVar) {
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "OperationRepo.enqueueAndWait(operation: " + gVar + ", force: " + z10 + ')');
        String uuid = UUID.randomUUID().toString();
        pc.j.d(uuid, "randomUUID().toString()");
        gVar.setId(uuid);
        com.onesignal.common.threading.d dVar2 = new com.onesignal.common.threading.d();
        internalEnqueue$default(this, new C0018b(gVar, dVar2, this.enqueueIntoBucket, 0, 8, null), z10, true, null, 8, null);
        return dVar2.waitForWake(dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0361, code lost:
    
        if (r7.delayForPostCreate(r10, r3) == r4) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019d A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:51:0x006f, B:52:0x00cf, B:54:0x00ef, B:55:0x00f3, B:57:0x00f9, B:59:0x010b, B:60:0x010d, B:67:0x012e, B:68:0x012f, B:69:0x013d, B:71:0x0143, B:75:0x014f, B:76:0x0150, B:77:0x0151, B:78:0x015e, B:80:0x02cd, B:82:0x02d3, B:83:0x02d5, B:90:0x0327, B:94:0x0329, B:95:0x032a, B:96:0x032b, B:99:0x0164, B:100:0x017c, B:107:0x0199, B:111:0x019b, B:112:0x019c, B:113:0x019d, B:114:0x01b3, B:126:0x01e4, B:131:0x01e7, B:132:0x01e8, B:133:0x01e9, B:135:0x01fc, B:136:0x0201, B:137:0x0203, B:155:0x0240, B:160:0x0243, B:161:0x0244, B:162:0x0245, B:163:0x025d, B:165:0x0263, B:167:0x0277, B:168:0x027b, B:170:0x0281, B:173:0x028d, B:178:0x0293, B:179:0x0297, B:181:0x029d, B:183:0x02b1, B:184:0x02b5, B:186:0x02bb, B:189:0x02c7, B:139:0x0204, B:140:0x020d, B:142:0x0213, B:145:0x0220, B:150:0x0226, B:151:0x022e, B:153:0x0234, B:85:0x02d6, B:86:0x02e2, B:88:0x02e8, B:102:0x017d, B:103:0x0185, B:105:0x018b, B:116:0x01b4, B:117:0x01bd, B:119:0x01c3, B:121:0x01d7, B:123:0x01de, B:62:0x010e, B:63:0x0114, B:65:0x011a), top: B:50:0x006f, inners: #3, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e9 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:51:0x006f, B:52:0x00cf, B:54:0x00ef, B:55:0x00f3, B:57:0x00f9, B:59:0x010b, B:60:0x010d, B:67:0x012e, B:68:0x012f, B:69:0x013d, B:71:0x0143, B:75:0x014f, B:76:0x0150, B:77:0x0151, B:78:0x015e, B:80:0x02cd, B:82:0x02d3, B:83:0x02d5, B:90:0x0327, B:94:0x0329, B:95:0x032a, B:96:0x032b, B:99:0x0164, B:100:0x017c, B:107:0x0199, B:111:0x019b, B:112:0x019c, B:113:0x019d, B:114:0x01b3, B:126:0x01e4, B:131:0x01e7, B:132:0x01e8, B:133:0x01e9, B:135:0x01fc, B:136:0x0201, B:137:0x0203, B:155:0x0240, B:160:0x0243, B:161:0x0244, B:162:0x0245, B:163:0x025d, B:165:0x0263, B:167:0x0277, B:168:0x027b, B:170:0x0281, B:173:0x028d, B:178:0x0293, B:179:0x0297, B:181:0x029d, B:183:0x02b1, B:184:0x02b5, B:186:0x02bb, B:189:0x02c7, B:139:0x0204, B:140:0x020d, B:142:0x0213, B:145:0x0220, B:150:0x0226, B:151:0x022e, B:153:0x0234, B:85:0x02d6, B:86:0x02e2, B:88:0x02e8, B:102:0x017d, B:103:0x0185, B:105:0x018b, B:116:0x01b4, B:117:0x01bd, B:119:0x01c3, B:121:0x01d7, B:123:0x01de, B:62:0x010e, B:63:0x0114, B:65:0x011a), top: B:50:0x006f, inners: #3, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0245 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:51:0x006f, B:52:0x00cf, B:54:0x00ef, B:55:0x00f3, B:57:0x00f9, B:59:0x010b, B:60:0x010d, B:67:0x012e, B:68:0x012f, B:69:0x013d, B:71:0x0143, B:75:0x014f, B:76:0x0150, B:77:0x0151, B:78:0x015e, B:80:0x02cd, B:82:0x02d3, B:83:0x02d5, B:90:0x0327, B:94:0x0329, B:95:0x032a, B:96:0x032b, B:99:0x0164, B:100:0x017c, B:107:0x0199, B:111:0x019b, B:112:0x019c, B:113:0x019d, B:114:0x01b3, B:126:0x01e4, B:131:0x01e7, B:132:0x01e8, B:133:0x01e9, B:135:0x01fc, B:136:0x0201, B:137:0x0203, B:155:0x0240, B:160:0x0243, B:161:0x0244, B:162:0x0245, B:163:0x025d, B:165:0x0263, B:167:0x0277, B:168:0x027b, B:170:0x0281, B:173:0x028d, B:178:0x0293, B:179:0x0297, B:181:0x029d, B:183:0x02b1, B:184:0x02b5, B:186:0x02bb, B:189:0x02c7, B:139:0x0204, B:140:0x020d, B:142:0x0213, B:145:0x0220, B:150:0x0226, B:151:0x022e, B:153:0x0234, B:85:0x02d6, B:86:0x02e2, B:88:0x02e8, B:102:0x017d, B:103:0x0185, B:105:0x018b, B:116:0x01b4, B:117:0x01bd, B:119:0x01c3, B:121:0x01d7, B:123:0x01de, B:62:0x010e, B:63:0x0114, B:65:0x011a), top: B:50:0x006f, inners: #3, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0293 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:51:0x006f, B:52:0x00cf, B:54:0x00ef, B:55:0x00f3, B:57:0x00f9, B:59:0x010b, B:60:0x010d, B:67:0x012e, B:68:0x012f, B:69:0x013d, B:71:0x0143, B:75:0x014f, B:76:0x0150, B:77:0x0151, B:78:0x015e, B:80:0x02cd, B:82:0x02d3, B:83:0x02d5, B:90:0x0327, B:94:0x0329, B:95:0x032a, B:96:0x032b, B:99:0x0164, B:100:0x017c, B:107:0x0199, B:111:0x019b, B:112:0x019c, B:113:0x019d, B:114:0x01b3, B:126:0x01e4, B:131:0x01e7, B:132:0x01e8, B:133:0x01e9, B:135:0x01fc, B:136:0x0201, B:137:0x0203, B:155:0x0240, B:160:0x0243, B:161:0x0244, B:162:0x0245, B:163:0x025d, B:165:0x0263, B:167:0x0277, B:168:0x027b, B:170:0x0281, B:173:0x028d, B:178:0x0293, B:179:0x0297, B:181:0x029d, B:183:0x02b1, B:184:0x02b5, B:186:0x02bb, B:189:0x02c7, B:139:0x0204, B:140:0x020d, B:142:0x0213, B:145:0x0220, B:150:0x0226, B:151:0x022e, B:153:0x0234, B:85:0x02d6, B:86:0x02e2, B:88:0x02e8, B:102:0x017d, B:103:0x0185, B:105:0x018b, B:116:0x01b4, B:117:0x01bd, B:119:0x01c3, B:121:0x01d7, B:123:0x01de, B:62:0x010e, B:63:0x0114, B:65:0x011a), top: B:50:0x006f, inners: #3, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03a0 A[LOOP:0: B:21:0x039a->B:23:0x03a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0349 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #6 {all -> 0x005a, blocks: (B:40:0x0055, B:41:0x0343, B:43:0x0349), top: B:39:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:51:0x006f, B:52:0x00cf, B:54:0x00ef, B:55:0x00f3, B:57:0x00f9, B:59:0x010b, B:60:0x010d, B:67:0x012e, B:68:0x012f, B:69:0x013d, B:71:0x0143, B:75:0x014f, B:76:0x0150, B:77:0x0151, B:78:0x015e, B:80:0x02cd, B:82:0x02d3, B:83:0x02d5, B:90:0x0327, B:94:0x0329, B:95:0x032a, B:96:0x032b, B:99:0x0164, B:100:0x017c, B:107:0x0199, B:111:0x019b, B:112:0x019c, B:113:0x019d, B:114:0x01b3, B:126:0x01e4, B:131:0x01e7, B:132:0x01e8, B:133:0x01e9, B:135:0x01fc, B:136:0x0201, B:137:0x0203, B:155:0x0240, B:160:0x0243, B:161:0x0244, B:162:0x0245, B:163:0x025d, B:165:0x0263, B:167:0x0277, B:168:0x027b, B:170:0x0281, B:173:0x028d, B:178:0x0293, B:179:0x0297, B:181:0x029d, B:183:0x02b1, B:184:0x02b5, B:186:0x02bb, B:189:0x02c7, B:139:0x0204, B:140:0x020d, B:142:0x0213, B:145:0x0220, B:150:0x0226, B:151:0x022e, B:153:0x0234, B:85:0x02d6, B:86:0x02e2, B:88:0x02e8, B:102:0x017d, B:103:0x0185, B:105:0x018b, B:116:0x01b4, B:117:0x01bd, B:119:0x01c3, B:121:0x01d7, B:123:0x01de, B:62:0x010e, B:63:0x0114, B:65:0x011a), top: B:50:0x006f, inners: #3, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:51:0x006f, B:52:0x00cf, B:54:0x00ef, B:55:0x00f3, B:57:0x00f9, B:59:0x010b, B:60:0x010d, B:67:0x012e, B:68:0x012f, B:69:0x013d, B:71:0x0143, B:75:0x014f, B:76:0x0150, B:77:0x0151, B:78:0x015e, B:80:0x02cd, B:82:0x02d3, B:83:0x02d5, B:90:0x0327, B:94:0x0329, B:95:0x032a, B:96:0x032b, B:99:0x0164, B:100:0x017c, B:107:0x0199, B:111:0x019b, B:112:0x019c, B:113:0x019d, B:114:0x01b3, B:126:0x01e4, B:131:0x01e7, B:132:0x01e8, B:133:0x01e9, B:135:0x01fc, B:136:0x0201, B:137:0x0203, B:155:0x0240, B:160:0x0243, B:161:0x0244, B:162:0x0245, B:163:0x025d, B:165:0x0263, B:167:0x0277, B:168:0x027b, B:170:0x0281, B:173:0x028d, B:178:0x0293, B:179:0x0297, B:181:0x029d, B:183:0x02b1, B:184:0x02b5, B:186:0x02bb, B:189:0x02c7, B:139:0x0204, B:140:0x020d, B:142:0x0213, B:145:0x0220, B:150:0x0226, B:151:0x022e, B:153:0x0234, B:85:0x02d6, B:86:0x02e2, B:88:0x02e8, B:102:0x017d, B:103:0x0185, B:105:0x018b, B:116:0x01b4, B:117:0x01bd, B:119:0x01c3, B:121:0x01d7, B:123:0x01de, B:62:0x010e, B:63:0x0114, B:65:0x011a), top: B:50:0x006f, inners: #3, #4, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:51:0x006f, B:52:0x00cf, B:54:0x00ef, B:55:0x00f3, B:57:0x00f9, B:59:0x010b, B:60:0x010d, B:67:0x012e, B:68:0x012f, B:69:0x013d, B:71:0x0143, B:75:0x014f, B:76:0x0150, B:77:0x0151, B:78:0x015e, B:80:0x02cd, B:82:0x02d3, B:83:0x02d5, B:90:0x0327, B:94:0x0329, B:95:0x032a, B:96:0x032b, B:99:0x0164, B:100:0x017c, B:107:0x0199, B:111:0x019b, B:112:0x019c, B:113:0x019d, B:114:0x01b3, B:126:0x01e4, B:131:0x01e7, B:132:0x01e8, B:133:0x01e9, B:135:0x01fc, B:136:0x0201, B:137:0x0203, B:155:0x0240, B:160:0x0243, B:161:0x0244, B:162:0x0245, B:163:0x025d, B:165:0x0263, B:167:0x0277, B:168:0x027b, B:170:0x0281, B:173:0x028d, B:178:0x0293, B:179:0x0297, B:181:0x029d, B:183:0x02b1, B:184:0x02b5, B:186:0x02bb, B:189:0x02c7, B:139:0x0204, B:140:0x020d, B:142:0x0213, B:145:0x0220, B:150:0x0226, B:151:0x022e, B:153:0x0234, B:85:0x02d6, B:86:0x02e2, B:88:0x02e8, B:102:0x017d, B:103:0x0185, B:105:0x018b, B:116:0x01b4, B:117:0x01bd, B:119:0x01c3, B:121:0x01d7, B:123:0x01de, B:62:0x010e, B:63:0x0114, B:65:0x011a), top: B:50:0x006f, inners: #3, #4, #5, #7, #8 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeOperations$com_onesignal_core(List<C0018b> list, fc.d dVar) {
        f fVar;
        int i10;
        ?? r10;
        b bVar;
        C0018b c0018b;
        b bVar2;
        List<C0018b> list2;
        Collection collection;
        z8.a aVar;
        int i11;
        Integer retryAfterSeconds;
        z8.a aVar2;
        List<C0018b> list3;
        b bVar3;
        List<C0018b> list4;
        Iterator it;
        Iterator it2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i12 = fVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.label = i12 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                gc.a aVar3 = gc.a.f2559g;
                i10 = fVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    try {
                        c0018b = (C0018b) bc.m.T(list);
                        Map<String, z8.d> map = this.executorsMap;
                        r10 = c0018b.getOperation().getName();
                        z8.d dVar2 = map.get(r10);
                        try {
                            if (dVar2 == null) {
                                throw new Exception("Could not find executor for operation " + c0018b.getOperation().getName());
                            }
                            ArrayList arrayList = new ArrayList(bc.o.O(list));
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(((C0018b) it3.next()).getOperation());
                            }
                            fVar.L$0 = this;
                            List<C0018b> list5 = list;
                            fVar.L$1 = list5;
                            fVar.L$2 = c0018b;
                            fVar.L$3 = arrayList;
                            fVar.label = 1;
                            obj = dVar2.execute(arrayList, fVar);
                            if (obj != aVar3) {
                                bVar2 = this;
                                collection = arrayList;
                                list2 = list5;
                            }
                            return aVar3;
                        } catch (Throwable th) {
                            th = th;
                            bVar = this;
                            list4 = r10;
                            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Error attempting to execute operation: " + list4, th);
                            it = list4.iterator();
                            while (it.hasNext()) {
                            }
                            it2 = list4.iterator();
                            while (it2.hasNext()) {
                            }
                            return o.f277a;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = list;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            List<C0018b> list6 = (List) fVar.L$1;
                            bVar = (b) fVar.L$0;
                            try {
                                v6.a.W(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                list4 = list6;
                                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Error attempting to execute operation: " + list4, th);
                                it = list4.iterator();
                                while (it.hasNext()) {
                                }
                                it2 = list4.iterator();
                                while (it2.hasNext()) {
                                }
                                return o.f277a;
                            }
                            return o.f277a;
                        }
                        aVar2 = (z8.a) fVar.L$2;
                        list3 = (List) fVar.L$1;
                        bVar3 = (b) fVar.L$0;
                        try {
                            v6.a.W(obj);
                            if (aVar2.getIdTranslations() != null) {
                                long opRepoPostCreateDelay = ((com.onesignal.core.internal.config.a) bVar3._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                fVar.L$0 = bVar3;
                                fVar.L$1 = list3;
                                fVar.L$2 = null;
                                fVar.label = 3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            list4 = list3;
                            bVar = bVar3;
                            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Error attempting to execute operation: " + list4, th);
                            it = list4.iterator();
                            while (it.hasNext()) {
                            }
                            it2 = list4.iterator();
                            while (it2.hasNext()) {
                            }
                            return o.f277a;
                        }
                        return o.f277a;
                    }
                    Collection collection2 = (List) fVar.L$3;
                    c0018b = (C0018b) fVar.L$2;
                    list2 = (List) fVar.L$1;
                    bVar2 = (b) fVar.L$0;
                    try {
                        v6.a.W(obj);
                        collection = collection2;
                        list2 = list2;
                    } catch (Throwable th5) {
                        th = th5;
                        bVar = bVar2;
                        list4 = list2;
                        com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Error attempting to execute operation: " + list4, th);
                        it = list4.iterator();
                        while (it.hasNext()) {
                            com.onesignal.common.modeling.b.remove$default(bVar._operationModelStore, ((C0018b) it.next()).getOperation().getId(), null, 2, null);
                        }
                        it2 = list4.iterator();
                        while (it2.hasNext()) {
                            com.onesignal.common.threading.d waiter = ((C0018b) it2.next()).getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.FALSE);
                            }
                        }
                        return o.f277a;
                    }
                }
                aVar = (z8.a) obj;
                com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + aVar.getResult(), null, 2, null);
                if (aVar.getIdTranslations() != null) {
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        ((C0018b) it4.next()).getOperation().translateIds(aVar.getIdTranslations());
                    }
                    synchronized (bVar2.queue) {
                        Iterator it5 = bVar2.queue.iterator();
                        while (it5.hasNext()) {
                            ((C0018b) it5.next()).getOperation().translateIds(aVar.getIdTranslations());
                        }
                    }
                    Iterator it6 = aVar.getIdTranslations().values().iterator();
                    while (it6.hasNext()) {
                        bVar2._newRecordState.add((String) it6.next());
                    }
                }
                switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[aVar.getResult().ordinal()]) {
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        Iterator it7 = list2.iterator();
                        while (it7.hasNext()) {
                            com.onesignal.common.modeling.b.remove$default(bVar2._operationModelStore, ((C0018b) it7.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            com.onesignal.common.threading.d waiter2 = ((C0018b) it8.next()).getWaiter();
                            if (waiter2 != null) {
                                waiter2.wake(Boolean.TRUE);
                            }
                        }
                        i11 = 0;
                        if (aVar.getOperations() != null) {
                            synchronized (bVar2.queue) {
                                for (z8.g gVar : bc.m.b0(aVar.getOperations())) {
                                    String uuid = UUID.randomUUID().toString();
                                    pc.j.d(uuid, "randomUUID().toString()");
                                    gVar.setId(uuid);
                                    C0018b c0018b2 = new C0018b(gVar, null, 0, 0, 10, null);
                                    bVar2.queue.add(0, c0018b2);
                                    com.onesignal.common.modeling.b.add$default(bVar2._operationModelStore, 0, c0018b2.getOperation(), null, 4, null);
                                }
                            }
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        fVar.L$0 = bVar2;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i11, retryAfterSeconds, fVar) != aVar3) {
                            aVar2 = aVar;
                            list3 = list2;
                            bVar3 = bVar2;
                            if (aVar2.getIdTranslations() != null) {
                            }
                            return o.f277a;
                        }
                        return aVar3;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                    case 3:
                    case 4:
                        com.onesignal.debug.internal.logging.b.error$default("Operation execution failed without retry: " + collection, null, 2, null);
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            com.onesignal.common.modeling.b.remove$default(bVar2._operationModelStore, ((C0018b) it9.next()).getOperation().getId(), null, 2, null);
                        }
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            com.onesignal.common.threading.d waiter3 = ((C0018b) it10.next()).getWaiter();
                            if (waiter3 != null) {
                                waiter3.wake(Boolean.FALSE);
                            }
                        }
                        i11 = 0;
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        fVar.L$0 = bVar2;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i11, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                    case 5:
                        com.onesignal.common.modeling.b.remove$default(bVar2._operationModelStore, c0018b.getOperation().getId(), null, 2, null);
                        com.onesignal.common.threading.d waiter4 = c0018b.getWaiter();
                        if (waiter4 != null) {
                            waiter4.wake(Boolean.TRUE);
                        }
                        synchronized (bVar2.queue) {
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (!pc.j.a((C0018b) obj2, c0018b)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                Iterator it11 = bc.m.b0(arrayList2).iterator();
                                while (it11.hasNext()) {
                                    bVar2.queue.add(0, (C0018b) it11.next());
                                }
                            } finally {
                            }
                        }
                        i11 = 0;
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        fVar.L$0 = bVar2;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i11, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                    case 6:
                        com.onesignal.debug.internal.logging.b.error$default("Operation execution failed, retrying: " + collection, null, 2, null);
                        synchronized (bVar2.queue) {
                            try {
                                i11 = 0;
                                for (C0018b c0018b3 : bc.m.b0(list2)) {
                                    c0018b3.setRetries(c0018b3.getRetries() + 1);
                                    if (c0018b3.getRetries() > i11) {
                                        i11 = c0018b3.getRetries();
                                    }
                                    bVar2.queue.add(0, c0018b3);
                                }
                            } finally {
                            }
                        }
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        fVar.L$0 = bVar2;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i11, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                    case 7:
                        com.onesignal.debug.internal.logging.b.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + collection, null, 2, null);
                        bVar2.paused = true;
                        synchronized (bVar2.queue) {
                            Iterator it12 = bc.m.b0(list2).iterator();
                            while (it12.hasNext()) {
                                bVar2.queue.add(0, (C0018b) it12.next());
                            }
                        }
                        i11 = 0;
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        fVar.L$0 = bVar2;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i11, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                    default:
                        i11 = 0;
                        if (aVar.getOperations() != null) {
                        }
                        retryAfterSeconds = aVar.getRetryAfterSeconds();
                        fVar.L$0 = bVar2;
                        fVar.L$1 = list2;
                        fVar.L$2 = aVar;
                        fVar.L$3 = null;
                        fVar.label = 2;
                        if (bVar2.delayBeforeNextExecution(i11, retryAfterSeconds, fVar) != aVar3) {
                        }
                        return aVar3;
                }
            }
        }
        fVar = new f(dVar);
        Object obj3 = fVar.result;
        gc.a aVar32 = gc.a.f2559g;
        i10 = fVar.label;
        if (i10 != 0) {
        }
        aVar = (z8.a) obj3;
        com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: execute response = " + aVar.getResult(), null, 2, null);
        if (aVar.getIdTranslations() != null) {
        }
        switch (com.onesignal.core.internal.operations.impl.c.$EnumSwitchMapping$0[aVar.getResult().ordinal()]) {
        }
    }

    @Override // z8.f
    public void forceExecuteOperations() {
        int i10 = 2;
        pc.f fVar = null;
        long j3 = 0;
        this.retryWaiter.wake(new a(true, j3, i10, fVar));
        this.waiter.wake(new a(false, j3, i10, fVar));
    }

    public final List<C0018b> getNextOps$com_onesignal_core(int i10) {
        List<C0018b> list;
        Object obj;
        synchronized (this.queue) {
            try {
                Iterator<T> it = this.queue.iterator();
                while (true) {
                    list = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C0018b c0018b = (C0018b) obj;
                    if (c0018b.getOperation().getCanStartExecute() && this._newRecordState.canAccess(c0018b.getOperation().getApplyToRecordId()) && c0018b.getBucket() <= i10) {
                        break;
                    }
                }
                C0018b c0018b2 = (C0018b) obj;
                if (c0018b2 != null) {
                    this.queue.remove(c0018b2);
                    list = getGroupableOperations(c0018b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final List<C0018b> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = bc.m.b0(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new C0018b((z8.g) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        ((m) this.initialized).S(o.f277a);
    }

    @Override // d9.b
    public void start() {
        this.paused = false;
        a0.q(this.coroutineScope, null, new h(null), 3);
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        private final boolean force;
        private final long previousWaitedTime;

        public a(boolean z10, long j3) {
            this.force = z10;
            this.previousWaitedTime = j3;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public /* synthetic */ a(boolean z10, long j3, int i10, pc.f fVar) {
            this(z10, (i10 & 2) != 0 ? 0L : j3);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.operations.impl.b$b, reason: collision with other inner class name */
    public static final class C0018b {
        private final int bucket;
        private final z8.g operation;
        private int retries;
        private final com.onesignal.common.threading.d waiter;

        public C0018b(z8.g gVar, com.onesignal.common.threading.d dVar, int i10, int i11) {
            pc.j.e(gVar, "operation");
            this.operation = gVar;
            this.waiter = dVar;
            this.bucket = i10;
            this.retries = i11;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final z8.g getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final com.onesignal.common.threading.d getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i10) {
            this.retries = i10;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ C0018b(z8.g gVar, com.onesignal.common.threading.d dVar, int i10, int i11, int i12, pc.f fVar) {
            this(gVar, (i12 & 2) != 0 ? null : dVar, i10, (i12 & 8) != 0 ? 0 : i11);
        }
    }
}
