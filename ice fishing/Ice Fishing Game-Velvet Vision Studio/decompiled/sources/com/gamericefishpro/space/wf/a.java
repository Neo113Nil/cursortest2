package com.gamericefishpro.space.wf;

import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.nf.d;
import com.gamericefishpro.space.vh.c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.vf.b {
    private final f _applicationService;
    private final d _dataController;
    private final com.gamericefishpro.space.ig.a _notificationSummaryManager;

    /* JADX INFO: renamed from: com.gamericefishpro.space.wf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0069a extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0069a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimit(0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimitStandard(0, this);
        }
    }

    public a(d _dataController, f _applicationService, com.gamericefishpro.space.ig.a _notificationSummaryManager) {
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationSummaryManager, "_notificationSummaryManager");
        this._dataController = _dataController;
        this._applicationService = _applicationService;
        this._notificationSummaryManager = _notificationSummaryManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f9 -> B:39:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fd -> B:41:0x00ff). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object clearOldestOverLimitStandard(int r13, com.gamericefishpro.space.th.a r14) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.wf.a.clearOldestOverLimitStandard(int, com.gamericefishpro.space.th.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (clearOldestOverLimitStandard(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r7.clearOldestOverLimitFallback(r6, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        return r1;
     */
    @Override // com.gamericefishpro.space.vf.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearOldestOverLimit(int i, com.gamericefishpro.space.th.a aVar) {
        C0069a c0069a;
        a aVar2;
        if (aVar instanceof C0069a) {
            c0069a = (C0069a) aVar;
            int i2 = c0069a.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0069a.label = i2 - Integer.MIN_VALUE;
            } else {
                c0069a = new C0069a(aVar);
            }
        } else {
            c0069a = new C0069a(aVar);
        }
        Object obj = c0069a.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = c0069a.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            try {
                c0069a.L$0 = this;
                c0069a.I$0 = i;
                c0069a.label = 1;
            } catch (Throwable unused) {
                aVar2 = this;
                d dVar = aVar2._dataController;
                int maxNumberOfNotifications = com.gamericefishpro.space.vf.a.INSTANCE.getMaxNumberOfNotifications();
                c0069a.L$0 = null;
                c0069a.label = 3;
            }
        } else if (i3 == 1 || i3 == 2) {
            i = c0069a.I$0;
            aVar2 = (a) c0069a.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (Throwable unused2) {
                d dVar2 = aVar2._dataController;
                int maxNumberOfNotifications2 = com.gamericefishpro.space.vf.a.INSTANCE.getMaxNumberOfNotifications();
                c0069a.L$0 = null;
                c0069a.label = 3;
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Unit.a;
    }
}
