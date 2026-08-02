package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class jkc extends aur implements Function2 {
    public qln j;
    public rjc k;
    public long l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ pjc p;
    public final /* synthetic */ long q;
    public final /* synthetic */ rjc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkc(pjc pjcVar, long j, rjc rjcVar, Continuation continuation) {
        super(2, continuation);
        this.p = pjcVar;
        this.q = j;
        this.r = rjcVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        jkc jkcVar = new jkc(this.p, this.q, this.r, continuation);
        jkcVar.o = obj;
        return jkcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jkc) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.o
            mm6 r0 = (defpackage.mm6) r0
            nm6 r1 = defpackage.nm6.a
            int r2 = r11.n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L21
            if (r2 != r3) goto L1a
            int r0 = r11.m
            long r5 = r11.l
            rjc r2 = r11.k
            qln r7 = r11.j
            defpackage.qgg.h0(r12)
            goto L7f
        L1a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.xq0.q(r12)
            r12 = 0
            return r12
        L21:
            defpackage.qgg.h0(r12)
            pjc r12 = r11.p
            r2 = 0
            pjc r6 = defpackage.zsd.C(r12, r2)
            boolean r12 = r6 instanceof defpackage.sc4
            if (r12 == 0) goto L33
            r12 = r6
            sc4 r12 = (defpackage.sc4) r12
            goto L34
        L33:
            r12 = r4
        L34:
            if (r12 != 0) goto L41
            vc4 r5 = new vc4
            r9 = 0
            r10 = 14
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = r5
        L41:
            qln r12 = r12.i(r0)
            long r5 = r11.q
            rjc r0 = r11.r
            r7 = r2
            r2 = r0
            r0 = r7
            r7 = r12
        L4d:
            acp r12 = new acp
            kotlin.coroutines.CoroutineContext r8 = r11.getContext()
            r12.<init>(r8)
            x3n r8 = r7.i()
            akc r9 = new akc
            r10 = 1
            r9.<init>(r2, r4, r10)
            r12.g(r8, r9)
            ikc r8 = new ikc
            r9 = 0
            r8.<init>(r3, r9, r4)
            defpackage.rzf.K(r12, r5, r8)
            r11.o = r4
            r11.j = r7
            r11.k = r2
            r11.l = r5
            r11.m = r0
            r11.n = r3
            java.lang.Object r12 = r12.d(r11)
            if (r12 != r1) goto L7f
            return r1
        L7f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L4d
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
