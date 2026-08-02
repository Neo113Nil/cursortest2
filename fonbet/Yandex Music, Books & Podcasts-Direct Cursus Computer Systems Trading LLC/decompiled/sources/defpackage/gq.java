package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class gq extends aur implements Function2 {
    public wqn j;
    public wqn k;
    public long l;
    public long m;
    public int n;
    public final /* synthetic */ ayg o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ poi q;
    public final /* synthetic */ Function1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(ayg aygVar, boolean z, poi poiVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.o = aygVar;
        this.p = z;
        this.q = poiVar;
        this.r = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new gq(this.o, this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0079 -> B:5:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            nm6 r1 = defpackage.nm6.a
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L22
            if (r2 != r3) goto L1b
            long r4 = r0.m
            long r6 = r0.l
            wqn r2 = r0.k
            wqn r8 = r0.j
            defpackage.qgg.h0(r19)
            r14 = r2
            r12 = r6
            r10 = r8
        L19:
            r15 = r4
            goto L57
        L1b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.xq0.q(r1)
            r1 = 0
            return r1
        L22:
            defpackage.qgg.h0(r19)
            ayg r2 = r0.o
            if (r2 != 0) goto L2c
            kotlin.Unit r1 = kotlin.Unit.a
            return r1
        L2c:
            boolean r4 = r0.p
            if (r4 != 0) goto L33
            kotlin.Unit r1 = kotlin.Unit.a
            return r1
        L33:
            float r2 = r2.b()
            double r4 = (double) r2
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 * r6
            long r4 = (long) r4
            r6 = 1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L46
            r4 = r6
        L46:
            wqn r2 = new wqn
            r2.<init>()
            wqn r6 = new wqn
            r6.<init>()
            r7 = 33333333(0x1fca055, double:1.64688547E-316)
            r10 = r2
            r12 = r4
            r14 = r6
            r15 = r7
        L57:
            fq r9 = new fq
            poi r11 = r0.q
            kotlin.jvm.functions.Function1 r2 = r0.r
            r17 = r2
            r9.<init>()
            r4 = r15
            r0.j = r10
            r0.k = r14
            r0.l = r12
            r0.m = r4
            r0.n = r3
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            qdi r2 = defpackage.bzf.D(r2)
            java.lang.Object r2 = r2.P(r9, r0)
            if (r2 != r1) goto L19
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
