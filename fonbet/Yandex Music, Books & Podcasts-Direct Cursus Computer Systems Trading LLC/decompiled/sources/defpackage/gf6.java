package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gf6 extends h7o implements Function2 {
    public final /* synthetic */ int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Function1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf6(Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.n = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                gf6 gf6Var = new gf6(this.n, continuation, 0);
                gf6Var.m = obj;
                return gf6Var;
            default:
                gf6 gf6Var2 = new gf6(this.n, continuation, 1);
                gf6Var2.m = obj;
                return gf6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hur hurVar = (hur) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((gf6) create(hurVar, continuation)).invokeSuspend(Unit.a);
            default:
                ((gf6) create(hurVar, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0031 -> B:7:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.k
            kotlin.jvm.functions.Function1 r1 = r9.n
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L44;
                default: goto Lb;
            }
        Lb:
            nm6 r0 = defpackage.nm6.a
            int r5 = r9.l
            if (r5 == 0) goto L1f
            if (r5 != r3) goto L1b
            java.lang.Object r2 = r9.m
            hur r2 = (defpackage.hur) r2
            defpackage.qgg.h0(r10)
            goto L35
        L1b:
            defpackage.xq0.q(r2)
            goto L34
        L1f:
            defpackage.qgg.h0(r10)
            java.lang.Object r10 = r9.m
            hur r10 = (defpackage.hur) r10
            r2 = r10
        L27:
            gfm r10 = defpackage.gfm.a
            r9.m = r2
            r9.l = r3
            java.lang.Object r10 = r2.a(r10, r9)
            if (r10 != r0) goto L35
            r4 = r0
        L34:
            return r4
        L35:
            ffm r10 = (defpackage.ffm) r10
            boolean r10 = defpackage.hdg.b0(r10)
            r10 = r10 ^ r3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r1.invoke(r10)
            goto L27
        L44:
            nm6 r0 = defpackage.nm6.a
            int r5 = r9.l
            r6 = 2
            if (r5 == 0) goto L5f
            if (r5 == r3) goto L57
            if (r5 != r6) goto L53
            defpackage.qgg.h0(r10)
            goto L91
        L53:
            defpackage.xq0.q(r2)
            goto L9a
        L57:
            java.lang.Object r2 = r9.m
            hur r2 = (defpackage.hur) r2
            defpackage.qgg.h0(r10)
            goto L72
        L5f:
            defpackage.qgg.h0(r10)
            java.lang.Object r10 = r9.m
            r2 = r10
            hur r2 = (defpackage.hur) r2
            r9.m = r2
            r9.l = r3
            java.lang.Object r10 = defpackage.bkp.W(r2, r9)
            if (r10 != r0) goto L72
            goto L8f
        L72:
            lfm r10 = (defpackage.lfm) r10
            r10.a()
            long r7 = r10.c
            enj r10 = new enj
            r10.<init>(r7)
            r1.invoke(r10)
            r9.m = r4
            r9.l = r6
            kr3 r10 = defpackage.g6s.a
            gfm r10 = defpackage.gfm.b
            java.lang.Object r10 = defpackage.g6s.i(r2, r10, r9)
            if (r10 != r0) goto L91
        L8f:
            r4 = r0
            goto L9a
        L91:
            lfm r10 = (defpackage.lfm) r10
            if (r10 == 0) goto L98
            r10.a()
        L98:
            kotlin.Unit r4 = kotlin.Unit.a
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
