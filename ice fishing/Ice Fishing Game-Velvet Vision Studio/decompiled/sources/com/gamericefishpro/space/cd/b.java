package com.gamericefishpro.space.cd;

import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.y;
import com.gamericefishpro.space.pi.m;
import com.gamericefishpro.space.pi.n;
import com.gamericefishpro.space.pi.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.bd.f, com.gamericefishpro.space.jd.b {
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.gh.a _newRecordState;
    private final com.gamericefishpro.space.cd.a _operationModelStore;
    private final com.gamericefishpro.space.kd.a _time;
    private x coroutineScope;
    private int enqueueIntoBucket;
    private final Map<String, com.gamericefishpro.space.bd.d> executorsMap;
    private final m initialized;
    private boolean paused;
    private final List<C0005b> queue;
    private final com.gamericefishpro.space.ic.d retryWaiter;
    private final com.gamericefishpro.space.ic.d waiter;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.i implements Function2 {
        int label;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new c(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
                return obj;
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.ic.d dVar = b.this.retryWaiter;
            this.label = 1;
            Object objWaitForWake = dVar.waitForWake(this);
            return objWaitForWake == aVar ? aVar : objWaitForWake;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.delayForPostCreate(0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ com.gamericefishpro.space.bd.g $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.gamericefishpro.space.bd.g gVar, boolean z, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$operation = gVar;
            this.$flush = z;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return b.this.new e(this.$operation, this.$flush, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((e) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            b bVar = b.this;
            b.internalEnqueue$default(bVar, new C0005b(this.$operation, null, bVar.enqueueIntoBucket, 0, 10, null), this.$flush, true, null, 8, null);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public f(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.executeOperations$com_onesignal_core(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public g(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processQueueForever(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.vh.i implements Function2 {
        int label;

        public h(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new h(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((h) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
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
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class i extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public i(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.waitForNewOperationAndExecutionInterval(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class j extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ a0 $wakeMessage;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a0 a0Var, b bVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$wakeMessage = a0Var;
            this.this$0 = bVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new j(this.$wakeMessage, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((j) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            a0 a0Var;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                a0 a0Var2 = this.$wakeMessage;
                com.gamericefishpro.space.ic.d dVar = this.this$0.waiter;
                this.L$0 = a0Var2;
                this.label = 1;
                Object objWaitForWake = dVar.waitForWake(this);
                if (objWaitForWake == aVar) {
                    return aVar;
                }
                a0Var = a0Var2;
                obj = objWaitForWake;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0Var = (a0) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            a0Var.d = obj;
            return Unit.a;
        }
    }

    public b(List<? extends com.gamericefishpro.space.bd.d> executors, com.gamericefishpro.space.cd.a _operationModelStore, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.kd.a _time, com.gamericefishpro.space.gh.a _newRecordState) {
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(_operationModelStore, "_operationModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        this._operationModelStore = _operationModelStore;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._newRecordState = _newRecordState;
        this.queue = new ArrayList();
        this.waiter = new com.gamericefishpro.space.ic.d();
        this.retryWaiter = new com.gamericefishpro.space.ic.d();
        this.coroutineScope = com.gamericefishpro.space.pi.a0.b(com.gamericefishpro.space.pi.a0.v("OpRepo"));
        this.initialized = com.gamericefishpro.space.pi.a0.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.gamericefishpro.space.bd.d dVar : executors) {
            Iterator<String> it = dVar.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), dVar);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final int getExecuteBucket() {
        int i2 = this.enqueueIntoBucket;
        if (i2 == 0) {
            return 0;
        }
        return i2 - 1;
    }

    private final List<C0005b> getGroupableOperations(C0005b c0005b) throws Exception {
        ArrayList arrayListG = com.gamericefishpro.space.ph.x.g(c0005b);
        if (c0005b.getOperation().getGroupComparisonType() != com.gamericefishpro.space.bd.c.NONE) {
            String createComparisonKey = c0005b.getOperation().getGroupComparisonType() == com.gamericefishpro.space.bd.c.CREATE ? c0005b.getOperation().getCreateComparisonKey() : c0005b.getOperation().getModifyComparisonKey();
            for (C0005b c0005b2 : CollectionsKt.L(this.queue)) {
                String createComparisonKey2 = c0005b.getOperation().getGroupComparisonType() == com.gamericefishpro.space.bd.c.CREATE ? c0005b2.getOperation().getCreateComparisonKey() : c0005b2.getOperation().getModifyComparisonKey();
                if (Intrinsics.a(createComparisonKey2, "") && Intrinsics.a(createComparisonKey, "")) {
                    throw new Exception("Both comparison keys can not be blank!");
                }
                if (this._newRecordState.canAccess(c0005b2.getOperation().getApplyToRecordId()) && Intrinsics.a(createComparisonKey2, createComparisonKey)) {
                    this.queue.remove(c0005b2);
                    arrayListG.add(c0005b2);
                }
            }
        }
        return arrayListG;
    }

    private final void internalEnqueue(C0005b c0005b, boolean z, boolean z2, Integer num) {
        synchronized (this.queue) {
            try {
                List<C0005b> list = this.queue;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.a(((C0005b) it.next()).getOperation().getId(), c0005b.getOperation().getId())) {
                            com.gamericefishpro.space.od.b.debug$default("OperationRepo: internalEnqueue - operation.id: " + c0005b.getOperation().getId() + " already exists in the queue.", null, 2, null);
                            return;
                        }
                    }
                }
                if (num != null) {
                    this.queue.add(num.intValue(), c0005b);
                    Unit unit = Unit.a;
                } else {
                    this.queue.add(c0005b);
                }
                if (z2) {
                    com.gamericefishpro.space.fc.b.add$default(this._operationModelStore, c0005b.getOperation(), null, 2, null);
                }
                this.waiter.wake(new a(z, 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void internalEnqueue$default(b bVar, C0005b c0005b, boolean z, boolean z2, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        bVar.internalEnqueue(c0005b, z, z2, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[PHI: r2
      0x0069: PHI (r2v4 com.gamericefishpro.space.cd.b) = 
      (r2v2 com.gamericefishpro.space.cd.b)
      (r2v3 com.gamericefishpro.space.cd.b)
      (r2v5 com.gamericefishpro.space.cd.b)
      (r2v11 com.gamericefishpro.space.cd.b)
     binds: [B:24:0x0064, B:35:0x00b0, B:40:0x00be, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c A[PHI: r2
      0x009c: PHI (r2v3 com.gamericefishpro.space.cd.b) = (r2v4 com.gamericefishpro.space.cd.b), (r2v9 com.gamericefishpro.space.cd.b) binds: [B:32:0x0099, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b0 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bb -> B:40:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object processQueueForever(com.gamericefishpro.space.th.a r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.gamericefishpro.space.cd.b.g
            if (r0 == 0) goto L13
            r0 = r11
            com.gamericefishpro.space.cd.b$g r0 = (com.gamericefishpro.space.cd.b.g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.gamericefishpro.space.cd.b$g r0 = new com.gamericefishpro.space.cd.b$g
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            com.gamericefishpro.space.uh.a r1 = com.gamericefishpro.space.uh.a.d
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L55
            if (r2 == r6) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r2 = r0.L$0
            com.gamericefishpro.space.cd.b r2 = (com.gamericefishpro.space.cd.b) r2
            com.gamericefishpro.space.wa.b.P(r11)
            goto Lbe
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3d:
            java.lang.Object r2 = r0.L$0
            com.gamericefishpro.space.cd.b r2 = (com.gamericefishpro.space.cd.b) r2
            com.gamericefishpro.space.wa.b.P(r11)
            goto L69
        L45:
            java.lang.Object r2 = r0.L$0
            com.gamericefishpro.space.cd.b r2 = (com.gamericefishpro.space.cd.b) r2
            com.gamericefishpro.space.wa.b.P(r11)
            goto L9c
        L4d:
            java.lang.Object r2 = r0.L$0
            com.gamericefishpro.space.cd.b r2 = (com.gamericefishpro.space.cd.b) r2
            com.gamericefishpro.space.wa.b.P(r11)
            goto L64
        L55:
            com.gamericefishpro.space.wa.b.P(r11)
            r0.L$0 = r10
            r0.label = r6
            java.lang.Object r11 = r10.waitForNewOperationAndExecutionInterval(r0)
            if (r11 != r1) goto L63
            goto Lbd
        L63:
            r2 = r10
        L64:
            int r11 = r2.enqueueIntoBucket
            int r11 = r11 + r6
            r2.enqueueIntoBucket = r11
        L69:
            boolean r11 = r2.paused
            r7 = 0
            if (r11 == 0) goto L76
            java.lang.String r11 = "OperationRepo is paused"
            com.gamericefishpro.space.od.b.debug$default(r11, r7, r5, r7)
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L76:
            int r11 = r2.getExecuteBucket()
            java.util.List r11 = r2.getNextOps$com_onesignal_core(r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "processQueueForever:ops:\n"
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.gamericefishpro.space.od.b.debug$default(r8, r7, r5, r7)
            if (r11 == 0) goto Lb3
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r11 = r2.executeOperations$com_onesignal_core(r11, r0)
            if (r11 != r1) goto L9c
            goto Lbd
        L9c:
            com.gamericefishpro.space.rc.b r11 = r2._configModelStore
            com.gamericefishpro.space.fc.i r11 = r11.getModel()
            com.gamericefishpro.space.rc.a r11 = (com.gamericefishpro.space.rc.a) r11
            long r7 = r11.getOpRepoPostWakeDelay()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r11 = com.gamericefishpro.space.pi.a0.i(r7, r0)
            if (r11 != r1) goto L69
            goto Lbd
        Lb3:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r2.waitForNewOperationAndExecutionInterval(r0)
            if (r11 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            int r11 = r2.enqueueIntoBucket
            int r11 = r11 + r6
            r2.enqueueIntoBucket = r11
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.cd.b.processQueueForever(com.gamericefishpro.space.th.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009a -> B:26:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForNewOperationAndExecutionInterval(com.gamericefishpro.space.th.a aVar) throws Throwable {
        i iVar;
        a0 a0Var;
        b bVar;
        a0 a0Var2;
        long opRepoExecutionInterval;
        a0 a0Var3;
        b bVar2;
        if (aVar instanceof i) {
            iVar = (i) aVar;
            int i2 = iVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.label = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(aVar);
            }
        } else {
            iVar = new i(aVar);
        }
        Object objWaitForWake = iVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = iVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(objWaitForWake);
            a0Var = new a0();
            com.gamericefishpro.space.ic.d dVar = this.waiter;
            iVar.L$0 = this;
            iVar.L$1 = a0Var;
            iVar.L$2 = a0Var;
            iVar.label = 1;
            objWaitForWake = dVar.waitForWake(iVar);
            if (objWaitForWake != aVar2) {
                bVar = this;
                a0Var2 = a0Var;
            }
            return aVar2;
        }
        if (i3 == 1) {
            a0Var = (a0) iVar.L$2;
            a0Var2 = (a0) iVar.L$1;
            bVar = (b) iVar.L$0;
            com.gamericefishpro.space.wa.b.P(objWaitForWake);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var3 = (a0) iVar.L$1;
            bVar2 = (b) iVar.L$0;
            com.gamericefishpro.space.wa.b.P(objWaitForWake);
        }
        if (objWaitForWake != null) {
            opRepoExecutionInterval = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoExecutionInterval();
            if (!((a) a0Var3.d).getForce()) {
                j jVar = new j(a0Var3, bVar2, null);
                iVar.L$0 = bVar2;
                iVar.L$1 = a0Var3;
                iVar.L$2 = null;
                iVar.label = 2;
                objWaitForWake = com.gamericefishpro.space.pi.a0.F(opRepoExecutionInterval, jVar, iVar);
            }
        }
        return Unit.a;
        a0Var.d = objWaitForWake;
        opRepoExecutionInterval = ((com.gamericefishpro.space.rc.a) bVar._configModelStore.getModel()).getOpRepoExecutionInterval() - ((a) a0Var2.d).getPreviousWaitedTime();
        a0Var3 = a0Var2;
        bVar2 = bVar;
        if (!((a) a0Var3.d).getForce()) {
            j jVar2 = new j(a0Var3, bVar2, null);
            iVar.L$0 = bVar2;
            iVar.L$1 = a0Var3;
            iVar.L$2 = null;
            iVar.label = 2;
            objWaitForWake = com.gamericefishpro.space.pi.a0.F(opRepoExecutionInterval, jVar2, iVar);
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.bd.f
    public Object awaitInitialized(com.gamericefishpro.space.th.a aVar) {
        Object objR = ((n) this.initialized).r(aVar);
        return objR == com.gamericefishpro.space.uh.a.d ? objR : Unit.a;
    }

    @Override // com.gamericefishpro.space.bd.f
    public <T extends com.gamericefishpro.space.bd.g> boolean containsInstanceOf(com.gamericefishpro.space.ki.b type) {
        boolean z;
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.queue) {
            try {
                List<C0005b> list = this.queue;
                z = false;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((com.gamericefishpro.space.ei.g) type).d(((C0005b) it.next()).getOperation())) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final Object delayBeforeNextExecution(int i2, Integer num, com.gamericefishpro.space.th.a aVar) throws Throwable {
        com.gamericefishpro.space.od.b.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long jMax = Math.max(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getOpRepoDefaultFailRetryBackoff() * ((long) i2), (num != null ? num.intValue() : 0L) * ((long) 1000));
        if (jMax < 1) {
            return Unit.a;
        }
        com.gamericefishpro.space.od.b.error$default("Operations being delay for: " + jMax + " ms", null, 2, null);
        Object objF = com.gamericefishpro.space.pi.a0.F(jMax, new c(null), aVar);
        return objF == com.gamericefishpro.space.uh.a.d ? objF : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object delayForPostCreate(long j2, com.gamericefishpro.space.th.a aVar) {
        d dVar;
        b bVar;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        Object obj = dVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = dVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            dVar.L$0 = this;
            dVar.J$0 = j2;
            dVar.label = 1;
            if (com.gamericefishpro.space.pi.a0.i(j2, dVar) == aVar2) {
                return aVar2;
            }
            bVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = dVar.J$0;
            bVar = (b) dVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        synchronized (bVar.queue) {
            if (!bVar.queue.isEmpty()) {
                bVar.waiter.wake(new a(false, j2));
            }
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.bd.f
    public void enqueue(com.gamericefishpro.space.bd.g operation, boolean z) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "OperationRepo.enqueue(operation: " + operation + ", flush: " + z + ')');
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        operation.setId(string);
        com.gamericefishpro.space.ic.a.INSTANCE.execute(new e(operation, z, null));
    }

    @Override // com.gamericefishpro.space.bd.f
    public Object enqueueAndWait(com.gamericefishpro.space.bd.g gVar, boolean z, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "OperationRepo.enqueueAndWait(operation: " + gVar + ", force: " + z + ')');
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        gVar.setId(string);
        com.gamericefishpro.space.ic.d dVar = new com.gamericefishpro.space.ic.d();
        internalEnqueue$default(this, new C0005b(gVar, dVar, this.enqueueIntoBucket, 0, 8, null), z, true, null, 8, null);
        return dVar.waitForWake(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0206 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0219 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0230 A[Catch: all -> 0x0242, TryCatch #1 {all -> 0x0242, blocks: (B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e), top: B:182:0x0221, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x023d A[Catch: all -> 0x0242, TryCatch #1 {all -> 0x0242, blocks: (B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e), top: B:182:0x0221, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0252 A[Catch: all -> 0x0242, LOOP:9: B:115:0x024c->B:117:0x0252, LOOP_END, TryCatch #1 {all -> 0x0242, blocks: (B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e), top: B:182:0x0221, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0265 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0283 A[Catch: all -> 0x0116, LOOP:10: B:124:0x027d->B:126:0x0283, LOOP_END, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02a1 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02b3 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02bd A[Catch: all -> 0x0116, LOOP:12: B:134:0x02b7->B:136:0x02bd, LOOP_END, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02db A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02f3 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0308 A[Catch: all -> 0x0348, LOOP:5: B:148:0x0302->B:150:0x0308, LOOP_END, TryCatch #4 {all -> 0x0348, blocks: (B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a), top: B:187:0x02f6, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0367  */
    /* JADX WARN: Code duplicated, block: B:164:0x036e A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #9 {all -> 0x003f, blocks: (B:14:0x003a, B:162:0x0368, B:164:0x036e), top: B:198:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:172:0x03c1 A[LOOP:0: B:170:0x03bb->B:172:0x03c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x03df  */
    /* JADX WARN: Code duplicated, block: B:182:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x02f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0104 A[Catch: all -> 0x0116, LOOP:2: B:47:0x00fe->B:49:0x0104, LOOP_END, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0128 A[Catch: all -> 0x013a, LOOP:3: B:55:0x0122->B:57:0x0128, LOOP_END, TryCatch #5 {all -> 0x013a, blocks: (B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c), top: B:189:0x011c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0153 A[Catch: all -> 0x0116, LOOP:4: B:63:0x014d->B:65:0x0153, LOOP_END, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0176  */
    /* JADX WARN: Code duplicated, block: B:71:0x0178 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019f A[Catch: all -> 0x01ab, LOOP:6: B:74:0x0199->B:76:0x019f, LOOP_END, TryCatch #6 {all -> 0x01ab, blocks: (B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:191:0x0191, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02ed, B:145:0x02f3, B:146:0x02f5, B:154:0x034c, B:156:0x034e, B:157:0x034f, B:158:0x0350, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x021e, B:104:0x0220, B:119:0x0260, B:121:0x0263, B:122:0x0264, B:123:0x0265, B:124:0x027d, B:126:0x0283, B:127:0x0297, B:128:0x029b, B:130:0x02a1, B:132:0x02ad, B:133:0x02b3, B:134:0x02b7, B:136:0x02bd, B:137:0x02d1, B:138:0x02d5, B:140:0x02db, B:142:0x02e7, B:105:0x0221, B:106:0x022a, B:108:0x0230, B:110:0x023d, B:114:0x0244, B:115:0x024c, B:117:0x0252, B:118:0x025e, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:147:0x02f6, B:148:0x0302, B:150:0x0308, B:153:0x034a, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:186:0x00da, inners: #1, #2, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9 A[Catch: all -> 0x01f6, TryCatch #2 {all -> 0x01f6, blocks: (B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff), top: B:184:0x01cb, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ef A[Catch: all -> 0x01f6, TryCatch #2 {all -> 0x01f6, blocks: (B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff), top: B:184:0x01cb, outer: #3 }] */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0387, code lost:
    
        if (r3.delayForPostCreate(r6, r4) == r5) goto L166;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0265, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0178, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x01b4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.gamericefishpro.space.cd.b] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeOperations$com_onesignal_core(List<C0005b> list, com.gamericefishpro.space.th.a aVar) {
        f fVar;
        Iterator it;
        Iterator it2;
        com.gamericefishpro.space.ic.d waiter;
        List<? extends com.gamericefishpro.space.bd.g> arrayList;
        C0005b c0005b;
        b bVar;
        com.gamericefishpro.space.bd.a aVar2;
        y yVar;
        Iterator it3;
        Iterator it4;
        com.gamericefishpro.space.ic.d waiter2;
        Iterator it5;
        Iterator it6;
        com.gamericefishpro.space.ic.d waiter3;
        com.gamericefishpro.space.ic.d waiter4;
        ArrayList arrayList2;
        Iterator it7;
        Iterator it8;
        int i2;
        Integer retryAfterSeconds;
        b bVar2;
        Iterator it9;
        Iterator it10;
        Iterator it11;
        List<C0005b> list2 = list;
        ?? r3 = "Could not find executor for operation ";
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i3 = fVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.label = i3 - Integer.MIN_VALUE;
            } else {
                fVar = new f(aVar);
            }
        } else {
            fVar = new f(aVar);
        }
        Object obj = fVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i4 = fVar.label;
        int i5 = 1;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    List<? extends com.gamericefishpro.space.bd.g> list3 = (List) fVar.L$3;
                    C0005b c0005b2 = (C0005b) fVar.L$2;
                    List<C0005b> list4 = (List) fVar.L$1;
                    bVar = (b) fVar.L$0;
                    try {
                        com.gamericefishpro.space.wa.b.P(obj);
                        arrayList = list3;
                        list2 = list4;
                        c0005b = c0005b2;
                        try {
                            aVar2 = (com.gamericefishpro.space.bd.a) obj;
                            com.gamericefishpro.space.od.b.debug$default("OperationRepo: execute response = " + aVar2.getResult(), null, 2, null);
                            if (aVar2.getIdTranslations() != null) {
                                it9 = list2.iterator();
                                while (it9.hasNext()) {
                                    ((C0005b) it9.next()).getOperation().translateIds(aVar2.getIdTranslations());
                                }
                                synchronized (bVar.queue) {
                                    try {
                                        it10 = bVar.queue.iterator();
                                        while (it10.hasNext()) {
                                            ((C0005b) it10.next()).getOperation().translateIds(aVar2.getIdTranslations());
                                        }
                                        Unit unit = Unit.a;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                it11 = aVar2.getIdTranslations().values().iterator();
                                while (it11.hasNext()) {
                                    bVar._newRecordState.add((String) it11.next());
                                }
                            }
                            yVar = new y();
                            switch (com.gamericefishpro.space.cd.c.$EnumSwitchMapping$0[aVar2.getResult().ordinal()]) {
                                case 1:
                                    it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        com.gamericefishpro.space.fc.b.remove$default(bVar._operationModelStore, ((C0005b) it3.next()).getOperation().getId(), null, 2, null);
                                    }
                                    it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        waiter2 = ((C0005b) it4.next()).getWaiter();
                                        if (waiter2 != null) {
                                            waiter2.wake(Boolean.TRUE);
                                        }
                                    }
                                    if (aVar2.getOperations() != null) {
                                        synchronized (bVar.queue) {
                                            try {
                                                for (com.gamericefishpro.space.bd.g gVar : CollectionsKt.G(aVar2.getOperations())) {
                                                    String string = UUID.randomUUID().toString();
                                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                                    gVar.setId(string);
                                                    C0005b c0005b3 = new C0005b(gVar, null, 0, 0, 10, null);
                                                    bVar.queue.add(0, c0005b3);
                                                    com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b3.getOperation(), null, 4, null);
                                                }
                                                Unit unit2 = Unit.a;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                    i2 = yVar.d;
                                    retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                    fVar.L$0 = bVar;
                                    fVar.L$1 = list2;
                                    fVar.L$2 = aVar2;
                                    fVar.L$3 = null;
                                    fVar.label = 2;
                                    if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                        bVar2 = bVar;
                                        r3 = bVar2;
                                        if (aVar2.getIdTranslations() != null) {
                                            long opRepoPostCreateDelay = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                            fVar.L$0 = bVar2;
                                            fVar.L$1 = list2;
                                            fVar.L$2 = null;
                                            fVar.label = 3;
                                        }
                                        break;
                                    }
                                    r3 = bVar2;
                                    return aVar3;
                                case 2:
                                case 3:
                                case 4:
                                    com.gamericefishpro.space.od.b.error$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                                    it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        com.gamericefishpro.space.fc.b.remove$default(bVar._operationModelStore, ((C0005b) it5.next()).getOperation().getId(), null, 2, null);
                                    }
                                    it6 = list2.iterator();
                                    while (it6.hasNext()) {
                                        waiter3 = ((C0005b) it6.next()).getWaiter();
                                        if (waiter3 != null) {
                                            waiter3.wake(Boolean.FALSE);
                                        }
                                    }
                                    if (aVar2.getOperations() != null) {
                                        synchronized (bVar.queue) {
                                            while (r6.hasNext()) {
                                                String string2 = UUID.randomUUID().toString();
                                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                                gVar.setId(string2);
                                                C0005b c0005b4 = new C0005b(gVar, null, 0, 0, 10, null);
                                                bVar.queue.add(0, c0005b4);
                                                com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b4.getOperation(), null, 4, null);
                                            }
                                            Unit unit3 = Unit.a;
                                        }
                                    }
                                    i2 = yVar.d;
                                    retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                    fVar.L$0 = bVar;
                                    fVar.L$1 = list2;
                                    fVar.L$2 = aVar2;
                                    fVar.L$3 = null;
                                    fVar.label = 2;
                                    if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                        bVar2 = bVar;
                                        r3 = bVar2;
                                        if (aVar2.getIdTranslations() != null) {
                                            long opRepoPostCreateDelay2 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                            fVar.L$0 = bVar2;
                                            fVar.L$1 = list2;
                                            fVar.L$2 = null;
                                            fVar.label = 3;
                                        }
                                        break;
                                    }
                                    r3 = bVar2;
                                    return aVar3;
                                case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                    com.gamericefishpro.space.fc.b.remove$default(bVar._operationModelStore, c0005b.getOperation().getId(), null, 2, null);
                                    waiter4 = c0005b.getWaiter();
                                    if (waiter4 != null) {
                                        waiter4.wake(Boolean.TRUE);
                                    }
                                    synchronized (bVar.queue) {
                                        try {
                                            arrayList2 = new ArrayList();
                                            for (Object obj2 : list2) {
                                                if (!Intrinsics.a((C0005b) obj2, c0005b)) {
                                                    arrayList2.add(obj2);
                                                }
                                            }
                                            it7 = CollectionsKt.G(arrayList2).iterator();
                                            while (it7.hasNext()) {
                                                bVar.queue.add(0, (C0005b) it7.next());
                                            }
                                            Unit unit4 = Unit.a;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    if (aVar2.getOperations() != null) {
                                        synchronized (bVar.queue) {
                                            while (r6.hasNext()) {
                                                String string3 = UUID.randomUUID().toString();
                                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                                gVar.setId(string3);
                                                C0005b c0005b5 = new C0005b(gVar, null, 0, 0, 10, null);
                                                bVar.queue.add(0, c0005b5);
                                                com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b5.getOperation(), null, 4, null);
                                            }
                                            Unit unit5 = Unit.a;
                                        }
                                    }
                                    i2 = yVar.d;
                                    retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                    fVar.L$0 = bVar;
                                    fVar.L$1 = list2;
                                    fVar.L$2 = aVar2;
                                    fVar.L$3 = null;
                                    fVar.label = 2;
                                    if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                        bVar2 = bVar;
                                        r3 = bVar2;
                                        if (aVar2.getIdTranslations() != null) {
                                            long opRepoPostCreateDelay3 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                            fVar.L$0 = bVar2;
                                            fVar.L$1 = list2;
                                            fVar.L$2 = null;
                                            fVar.label = 3;
                                        }
                                        break;
                                    }
                                    r3 = bVar2;
                                    return aVar3;
                                case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                    com.gamericefishpro.space.od.b.error$default("Operation execution failed, retrying: " + arrayList, null, 2, null);
                                    synchronized (bVar.queue) {
                                        try {
                                            for (C0005b c0005b6 : CollectionsKt.G(list2)) {
                                                c0005b6.setRetries(c0005b6.getRetries() + i5);
                                                if (c0005b6.getRetries() > yVar.d) {
                                                    yVar.d = c0005b6.getRetries();
                                                }
                                                bVar.queue.add(0, c0005b6);
                                                i5 = 1;
                                            }
                                            Unit unit6 = Unit.a;
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    if (aVar2.getOperations() != null) {
                                        synchronized (bVar.queue) {
                                            while (r6.hasNext()) {
                                                String string4 = UUID.randomUUID().toString();
                                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                                gVar.setId(string4);
                                                C0005b c0005b7 = new C0005b(gVar, null, 0, 0, 10, null);
                                                bVar.queue.add(0, c0005b7);
                                                com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b7.getOperation(), null, 4, null);
                                            }
                                            Unit unit7 = Unit.a;
                                        }
                                    }
                                    i2 = yVar.d;
                                    retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                    fVar.L$0 = bVar;
                                    fVar.L$1 = list2;
                                    fVar.L$2 = aVar2;
                                    fVar.L$3 = null;
                                    fVar.label = 2;
                                    if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                        bVar2 = bVar;
                                        r3 = bVar2;
                                        if (aVar2.getIdTranslations() != null) {
                                            long opRepoPostCreateDelay4 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                            fVar.L$0 = bVar2;
                                            fVar.L$1 = list2;
                                            fVar.L$2 = null;
                                            fVar.label = 3;
                                        }
                                        break;
                                    }
                                    r3 = bVar2;
                                    return aVar3;
                                case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                    com.gamericefishpro.space.od.b.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + arrayList, null, 2, null);
                                    bVar.paused = true;
                                    synchronized (bVar.queue) {
                                        try {
                                            it8 = CollectionsKt.G(list2).iterator();
                                            while (it8.hasNext()) {
                                                bVar.queue.add(0, (C0005b) it8.next());
                                            }
                                            Unit unit8 = Unit.a;
                                        } catch (Throwable th5) {
                                            throw th5;
                                        }
                                    }
                                    if (aVar2.getOperations() != null) {
                                        synchronized (bVar.queue) {
                                            while (r6.hasNext()) {
                                                String string5 = UUID.randomUUID().toString();
                                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                                gVar.setId(string5);
                                                C0005b c0005b8 = new C0005b(gVar, null, 0, 0, 10, null);
                                                bVar.queue.add(0, c0005b8);
                                                com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b8.getOperation(), null, 4, null);
                                            }
                                            Unit unit9 = Unit.a;
                                        }
                                    }
                                    i2 = yVar.d;
                                    retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                    fVar.L$0 = bVar;
                                    fVar.L$1 = list2;
                                    fVar.L$2 = aVar2;
                                    fVar.L$3 = null;
                                    fVar.label = 2;
                                    if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                        bVar2 = bVar;
                                        r3 = bVar2;
                                        if (aVar2.getIdTranslations() != null) {
                                            long opRepoPostCreateDelay5 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                            fVar.L$0 = bVar2;
                                            fVar.L$1 = list2;
                                            fVar.L$2 = null;
                                            fVar.label = 3;
                                        }
                                        break;
                                    }
                                    r3 = bVar2;
                                    return aVar3;
                                default:
                                    if (aVar2.getOperations() != null) {
                                        synchronized (bVar.queue) {
                                            while (r6.hasNext()) {
                                                String string6 = UUID.randomUUID().toString();
                                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                                gVar.setId(string6);
                                                C0005b c0005b9 = new C0005b(gVar, null, 0, 0, 10, null);
                                                bVar.queue.add(0, c0005b9);
                                                com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b9.getOperation(), null, 4, null);
                                            }
                                            Unit unit10 = Unit.a;
                                        }
                                    }
                                    i2 = yVar.d;
                                    retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                    fVar.L$0 = bVar;
                                    fVar.L$1 = list2;
                                    fVar.L$2 = aVar2;
                                    fVar.L$3 = null;
                                    fVar.label = 2;
                                    if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                        bVar2 = bVar;
                                        r3 = bVar2;
                                        if (aVar2.getIdTranslations() != null) {
                                            long opRepoPostCreateDelay6 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                            fVar.L$0 = bVar2;
                                            fVar.L$1 = list2;
                                            fVar.L$2 = null;
                                            fVar.label = 3;
                                        }
                                        break;
                                    }
                                    r3 = bVar2;
                                    return aVar3;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            r3 = bVar;
                            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Error attempting to execute operation: " + list2, th);
                            it = list2.iterator();
                            while (it.hasNext()) {
                                com.gamericefishpro.space.fc.b.remove$default(r3._operationModelStore, ((C0005b) it.next()).getOperation().getId(), null, 2, null);
                            }
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                waiter = ((C0005b) it2.next()).getWaiter();
                                if (waiter != null) {
                                    waiter.wake(Boolean.FALSE);
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        list2 = list4;
                        r3 = bVar;
                        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        it = list2.iterator();
                        while (it.hasNext()) {
                            com.gamericefishpro.space.fc.b.remove$default(r3._operationModelStore, ((C0005b) it.next()).getOperation().getId(), null, 2, null);
                        }
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            waiter = ((C0005b) it2.next()).getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.FALSE);
                            }
                        }
                        return Unit.a;
                    }
                } else if (i4 == 2) {
                    com.gamericefishpro.space.bd.a aVar4 = (com.gamericefishpro.space.bd.a) fVar.L$2;
                    List<C0005b> list5 = (List) fVar.L$1;
                    b bVar3 = (b) fVar.L$0;
                    try {
                        com.gamericefishpro.space.wa.b.P(obj);
                        aVar2 = aVar4;
                        list2 = list5;
                        bVar2 = bVar3;
                        r3 = bVar2;
                        if (aVar2.getIdTranslations() != null) {
                            long opRepoPostCreateDelay7 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                            fVar.L$0 = bVar2;
                            fVar.L$1 = list2;
                            fVar.L$2 = null;
                            fVar.label = 3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        list2 = list5;
                        r3 = bVar3;
                        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Error attempting to execute operation: " + list2, th);
                        it = list2.iterator();
                        while (it.hasNext()) {
                            com.gamericefishpro.space.fc.b.remove$default(r3._operationModelStore, ((C0005b) it.next()).getOperation().getId(), null, 2, null);
                        }
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            waiter = ((C0005b) it2.next()).getWaiter();
                            if (waiter != null) {
                                waiter.wake(Boolean.FALSE);
                            }
                        }
                    }
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) fVar.L$1;
                    b bVar4 = (b) fVar.L$0;
                    com.gamericefishpro.space.wa.b.P(obj);
                    r3 = bVar4;
                }
                r3 = bVar2;
            } else {
                com.gamericefishpro.space.wa.b.P(obj);
                try {
                    C0005b c0005b10 = (C0005b) CollectionsKt.w(list2);
                    com.gamericefishpro.space.bd.d dVar = this.executorsMap.get(c0005b10.getOperation().getName());
                    if (dVar == null) {
                        throw new Exception("Could not find executor for operation " + c0005b10.getOperation().getName());
                    }
                    arrayList = new ArrayList<>(com.gamericefishpro.space.ph.y.j(list2, 10));
                    Iterator it12 = list2.iterator();
                    while (it12.hasNext()) {
                        arrayList.add(((C0005b) it12.next()).getOperation());
                    }
                    fVar.L$0 = this;
                    fVar.L$1 = list2;
                    fVar.L$2 = c0005b10;
                    fVar.L$3 = arrayList;
                    fVar.label = 1;
                    Object objExecute = dVar.execute(arrayList, fVar);
                    if (objExecute != aVar3) {
                        c0005b = c0005b10;
                        obj = objExecute;
                        bVar = this;
                        aVar2 = (com.gamericefishpro.space.bd.a) obj;
                        com.gamericefishpro.space.od.b.debug$default("OperationRepo: execute response = " + aVar2.getResult(), null, 2, null);
                        if (aVar2.getIdTranslations() != null) {
                            it9 = list2.iterator();
                            while (it9.hasNext()) {
                                ((C0005b) it9.next()).getOperation().translateIds(aVar2.getIdTranslations());
                            }
                            synchronized (bVar.queue) {
                                it10 = bVar.queue.iterator();
                                while (it10.hasNext()) {
                                    ((C0005b) it10.next()).getOperation().translateIds(aVar2.getIdTranslations());
                                }
                                Unit unit11 = Unit.a;
                                it11 = aVar2.getIdTranslations().values().iterator();
                                while (it11.hasNext()) {
                                    bVar._newRecordState.add((String) it11.next());
                                }
                            }
                        }
                        yVar = new y();
                        switch (com.gamericefishpro.space.cd.c.$EnumSwitchMapping$0[aVar2.getResult().ordinal()]) {
                            case 1:
                                it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    com.gamericefishpro.space.fc.b.remove$default(bVar._operationModelStore, ((C0005b) it3.next()).getOperation().getId(), null, 2, null);
                                }
                                it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    waiter2 = ((C0005b) it4.next()).getWaiter();
                                    if (waiter2 != null) {
                                        waiter2.wake(Boolean.TRUE);
                                    }
                                }
                                if (aVar2.getOperations() != null) {
                                    synchronized (bVar.queue) {
                                        while (r6.hasNext()) {
                                            String string7 = UUID.randomUUID().toString();
                                            Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                            gVar.setId(string7);
                                            C0005b c0005b11 = new C0005b(gVar, null, 0, 0, 10, null);
                                            bVar.queue.add(0, c0005b11);
                                            com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b11.getOperation(), null, 4, null);
                                        }
                                        Unit unit12 = Unit.a;
                                    }
                                }
                                i2 = yVar.d;
                                retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                fVar.L$0 = bVar;
                                fVar.L$1 = list2;
                                fVar.L$2 = aVar2;
                                fVar.L$3 = null;
                                fVar.label = 2;
                                if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                    bVar2 = bVar;
                                    r3 = bVar2;
                                    if (aVar2.getIdTranslations() != null) {
                                        long opRepoPostCreateDelay8 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                        fVar.L$0 = bVar2;
                                        fVar.L$1 = list2;
                                        fVar.L$2 = null;
                                        fVar.label = 3;
                                    }
                                    r3 = bVar2;
                                }
                                break;
                            case 2:
                            case 3:
                            case 4:
                                com.gamericefishpro.space.od.b.error$default("Operation execution failed without retry: " + arrayList, null, 2, null);
                                it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    com.gamericefishpro.space.fc.b.remove$default(bVar._operationModelStore, ((C0005b) it5.next()).getOperation().getId(), null, 2, null);
                                }
                                it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    waiter3 = ((C0005b) it6.next()).getWaiter();
                                    if (waiter3 != null) {
                                        waiter3.wake(Boolean.FALSE);
                                    }
                                }
                                if (aVar2.getOperations() != null) {
                                    synchronized (bVar.queue) {
                                        while (r6.hasNext()) {
                                            String string8 = UUID.randomUUID().toString();
                                            Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
                                            gVar.setId(string8);
                                            C0005b c0005b12 = new C0005b(gVar, null, 0, 0, 10, null);
                                            bVar.queue.add(0, c0005b12);
                                            com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b12.getOperation(), null, 4, null);
                                        }
                                        Unit unit13 = Unit.a;
                                    }
                                }
                                i2 = yVar.d;
                                retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                fVar.L$0 = bVar;
                                fVar.L$1 = list2;
                                fVar.L$2 = aVar2;
                                fVar.L$3 = null;
                                fVar.label = 2;
                                if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                    bVar2 = bVar;
                                    r3 = bVar2;
                                    if (aVar2.getIdTranslations() != null) {
                                        long opRepoPostCreateDelay9 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                        fVar.L$0 = bVar2;
                                        fVar.L$1 = list2;
                                        fVar.L$2 = null;
                                        fVar.label = 3;
                                    }
                                    r3 = bVar2;
                                }
                                break;
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                com.gamericefishpro.space.fc.b.remove$default(bVar._operationModelStore, c0005b.getOperation().getId(), null, 2, null);
                                waiter4 = c0005b.getWaiter();
                                if (waiter4 != null) {
                                    waiter4.wake(Boolean.TRUE);
                                }
                                synchronized (bVar.queue) {
                                    arrayList2 = new ArrayList();
                                    while (r13.hasNext()) {
                                        if (!Intrinsics.a((C0005b) obj2, c0005b)) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    it7 = CollectionsKt.G(arrayList2).iterator();
                                    while (it7.hasNext()) {
                                        bVar.queue.add(0, (C0005b) it7.next());
                                    }
                                    Unit unit14 = Unit.a;
                                    if (aVar2.getOperations() != null) {
                                        synchronized (bVar.queue) {
                                            while (r6.hasNext()) {
                                                String string9 = UUID.randomUUID().toString();
                                                Intrinsics.checkNotNullExpressionValue(string9, "toString(...)");
                                                gVar.setId(string9);
                                                C0005b c0005b13 = new C0005b(gVar, null, 0, 0, 10, null);
                                                bVar.queue.add(0, c0005b13);
                                                com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b13.getOperation(), null, 4, null);
                                            }
                                            Unit unit15 = Unit.a;
                                        }
                                    }
                                    i2 = yVar.d;
                                    retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                    fVar.L$0 = bVar;
                                    fVar.L$1 = list2;
                                    fVar.L$2 = aVar2;
                                    fVar.L$3 = null;
                                    fVar.label = 2;
                                    if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                        bVar2 = bVar;
                                        r3 = bVar2;
                                        if (aVar2.getIdTranslations() != null) {
                                            long opRepoPostCreateDelay10 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                            fVar.L$0 = bVar2;
                                            fVar.L$1 = list2;
                                            fVar.L$2 = null;
                                            fVar.label = 3;
                                        }
                                        r3 = bVar2;
                                    }
                                    break;
                                }
                                break;
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                com.gamericefishpro.space.od.b.error$default("Operation execution failed, retrying: " + arrayList, null, 2, null);
                                synchronized (bVar.queue) {
                                    while (r6.hasNext()) {
                                        c0005b6.setRetries(c0005b6.getRetries() + i5);
                                        if (c0005b6.getRetries() > yVar.d) {
                                            yVar.d = c0005b6.getRetries();
                                        }
                                        bVar.queue.add(0, c0005b6);
                                        i5 = 1;
                                    }
                                    Unit unit16 = Unit.a;
                                    if (aVar2.getOperations() != null) {
                                        synchronized (bVar.queue) {
                                            while (r6.hasNext()) {
                                                String string10 = UUID.randomUUID().toString();
                                                Intrinsics.checkNotNullExpressionValue(string10, "toString(...)");
                                                gVar.setId(string10);
                                                C0005b c0005b14 = new C0005b(gVar, null, 0, 0, 10, null);
                                                bVar.queue.add(0, c0005b14);
                                                com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b14.getOperation(), null, 4, null);
                                            }
                                            Unit unit17 = Unit.a;
                                        }
                                    }
                                    i2 = yVar.d;
                                    retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                    fVar.L$0 = bVar;
                                    fVar.L$1 = list2;
                                    fVar.L$2 = aVar2;
                                    fVar.L$3 = null;
                                    fVar.label = 2;
                                    if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                        bVar2 = bVar;
                                        r3 = bVar2;
                                        if (aVar2.getIdTranslations() != null) {
                                            long opRepoPostCreateDelay11 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                            fVar.L$0 = bVar2;
                                            fVar.L$1 = list2;
                                            fVar.L$2 = null;
                                            fVar.label = 3;
                                        }
                                        r3 = bVar2;
                                    }
                                    break;
                                }
                                break;
                            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                com.gamericefishpro.space.od.b.error$default("Operation execution failed with eventual retry, pausing the operation repo: " + arrayList, null, 2, null);
                                bVar.paused = true;
                                synchronized (bVar.queue) {
                                    it8 = CollectionsKt.G(list2).iterator();
                                    while (it8.hasNext()) {
                                        bVar.queue.add(0, (C0005b) it8.next());
                                    }
                                    Unit unit18 = Unit.a;
                                    if (aVar2.getOperations() != null) {
                                        synchronized (bVar.queue) {
                                            while (r6.hasNext()) {
                                                String string11 = UUID.randomUUID().toString();
                                                Intrinsics.checkNotNullExpressionValue(string11, "toString(...)");
                                                gVar.setId(string11);
                                                C0005b c0005b15 = new C0005b(gVar, null, 0, 0, 10, null);
                                                bVar.queue.add(0, c0005b15);
                                                com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b15.getOperation(), null, 4, null);
                                            }
                                            Unit unit19 = Unit.a;
                                        }
                                    }
                                    i2 = yVar.d;
                                    retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                    fVar.L$0 = bVar;
                                    fVar.L$1 = list2;
                                    fVar.L$2 = aVar2;
                                    fVar.L$3 = null;
                                    fVar.label = 2;
                                    if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                        bVar2 = bVar;
                                        r3 = bVar2;
                                        if (aVar2.getIdTranslations() != null) {
                                            long opRepoPostCreateDelay12 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                            fVar.L$0 = bVar2;
                                            fVar.L$1 = list2;
                                            fVar.L$2 = null;
                                            fVar.label = 3;
                                        }
                                        r3 = bVar2;
                                    }
                                    break;
                                }
                                break;
                            default:
                                if (aVar2.getOperations() != null) {
                                    synchronized (bVar.queue) {
                                        while (r6.hasNext()) {
                                            String string12 = UUID.randomUUID().toString();
                                            Intrinsics.checkNotNullExpressionValue(string12, "toString(...)");
                                            gVar.setId(string12);
                                            C0005b c0005b16 = new C0005b(gVar, null, 0, 0, 10, null);
                                            bVar.queue.add(0, c0005b16);
                                            com.gamericefishpro.space.fc.b.add$default(bVar._operationModelStore, 0, c0005b16.getOperation(), null, 4, null);
                                        }
                                        Unit unit110 = Unit.a;
                                    }
                                }
                                i2 = yVar.d;
                                retryAfterSeconds = aVar2.getRetryAfterSeconds();
                                fVar.L$0 = bVar;
                                fVar.L$1 = list2;
                                fVar.L$2 = aVar2;
                                fVar.L$3 = null;
                                fVar.label = 2;
                                if (bVar.delayBeforeNextExecution(i2, retryAfterSeconds, fVar) != aVar3) {
                                    bVar2 = bVar;
                                    r3 = bVar2;
                                    if (aVar2.getIdTranslations() != null) {
                                        long opRepoPostCreateDelay13 = ((com.gamericefishpro.space.rc.a) bVar2._configModelStore.getModel()).getOpRepoPostCreateDelay();
                                        fVar.L$0 = bVar2;
                                        fVar.L$1 = list2;
                                        fVar.L$2 = null;
                                        fVar.label = 3;
                                    }
                                    r3 = bVar2;
                                }
                                break;
                        }
                    }
                    r3 = bVar2;
                    return aVar3;
                } catch (Throwable th9) {
                    th = th9;
                    r3 = this;
                    com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Error attempting to execute operation: " + list2, th);
                    it = list2.iterator();
                    while (it.hasNext()) {
                        com.gamericefishpro.space.fc.b.remove$default(r3._operationModelStore, ((C0005b) it.next()).getOperation().getId(), null, 2, null);
                    }
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        waiter = ((C0005b) it2.next()).getWaiter();
                        if (waiter != null) {
                            waiter.wake(Boolean.FALSE);
                        }
                    }
                }
            }
        } catch (Throwable th10) {
            th = th10;
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.bd.f
    public void forceExecuteOperations() {
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        long j2 = 0;
        this.retryWaiter.wake(new a(true, j2, i2, defaultConstructorMarker));
        this.waiter.wake(new a(false, j2, i2, defaultConstructorMarker));
    }

    public final List<C0005b> getNextOps$com_onesignal_core(int i2) {
        List<C0005b> groupableOperations;
        Object next;
        synchronized (this.queue) {
            try {
                Iterator<T> it = this.queue.iterator();
                while (true) {
                    groupableOperations = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    C0005b c0005b = (C0005b) next;
                    if (c0005b.getOperation().getCanStartExecute() && this._newRecordState.canAccess(c0005b.getOperation().getApplyToRecordId()) && c0005b.getBucket() <= i2) {
                        break;
                    }
                }
                C0005b c0005b2 = (C0005b) next;
                if (c0005b2 != null) {
                    this.queue.remove(c0005b2);
                    groupableOperations = getGroupableOperations(c0005b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return groupableOperations;
    }

    public final List<C0005b> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = CollectionsKt.G(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new C0005b((com.gamericefishpro.space.bd.g) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        ((n) this.initialized).W(Unit.a);
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this.paused = false;
        com.gamericefishpro.space.pi.a0.u(this.coroutineScope, null, new h(null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        private final boolean force;
        private final long previousWaitedTime;

        public a(boolean z, long j) {
            this.force = z;
            this.previousWaitedTime = j;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public /* synthetic */ a(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? 0L : j);
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.cd.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0005b {
        private final int bucket;
        private final com.gamericefishpro.space.bd.g operation;
        private int retries;
        private final com.gamericefishpro.space.ic.d waiter;

        public C0005b(com.gamericefishpro.space.bd.g operation, com.gamericefishpro.space.ic.d dVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
            this.waiter = dVar;
            this.bucket = i;
            this.retries = i2;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final com.gamericefishpro.space.bd.g getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final com.gamericefishpro.space.ic.d getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i) {
            this.retries = i;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ C0005b(com.gamericefishpro.space.bd.g gVar, com.gamericefishpro.space.ic.d dVar, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(gVar, (i3 & 2) != 0 ? null : dVar, i, (i3 & 8) != 0 ? 0 : i2);
        }
    }
}
