package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y5s extends h7o implements Function2 {
    public final /* synthetic */ int k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ lfm o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5s(lfm lfmVar, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.o = lfmVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                y5s y5sVar = new y5s(this.o, continuation, 0);
                y5sVar.n = obj;
                return y5sVar;
            default:
                y5s y5sVar2 = new y5s(this.o, continuation, 1);
                y5sVar2.n = obj;
                return y5sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hur hurVar = (hur) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
        }
        return ((y5s) create(hurVar, continuation)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:7:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0087 -> B:20:0x008a). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.k
            switch(r0) {
                case 0: goto L4a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.n
            hur r0 = (defpackage.hur) r0
            nm6 r1 = defpackage.nm6.a
            int r2 = r8.m
            r3 = 1
            if (r2 == 0) goto L1f
            if (r2 != r3) goto L18
            long r4 = r8.l
            defpackage.qgg.h0(r9)
            goto L40
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.xq0.q(r9)
            r1 = 0
            goto L49
        L1f:
            defpackage.qgg.h0(r9)
            lfm r9 = r8.o
            long r4 = r9.b
            aeu r9 = r0.c()
            r9.getClass()
            r6 = 40
            long r6 = r6 + r4
            r4 = r6
        L31:
            r8.n = r0
            r8.l = r4
            r8.m = r3
            r9 = 0
            r2 = 3
            java.lang.Object r9 = defpackage.g6s.c(r0, r9, r8, r2)
            if (r9 != r1) goto L40
            goto L49
        L40:
            lfm r9 = (defpackage.lfm) r9
            long r6 = r9.b
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 < 0) goto L31
            r1 = r9
        L49:
            return r1
        L4a:
            nm6 r0 = defpackage.nm6.a
            int r1 = r8.m
            r2 = 1
            if (r1 == 0) goto L64
            if (r1 != r2) goto L5d
            long r3 = r8.l
            java.lang.Object r1 = r8.n
            hur r1 = (defpackage.hur) r1
            defpackage.qgg.h0(r9)
            goto L8a
        L5d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.xq0.q(r9)
            r0 = 0
            goto L93
        L64:
            defpackage.qgg.h0(r9)
            java.lang.Object r9 = r8.n
            hur r9 = (defpackage.hur) r9
            lfm r1 = r8.o
            long r3 = r1.b
            aeu r1 = r9.c()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r9
            r3 = r5
        L7b:
            r8.n = r1
            r8.l = r3
            r8.m = r2
            r9 = 0
            r5 = 3
            java.lang.Object r9 = defpackage.g6s.c(r1, r9, r8, r5)
            if (r9 != r0) goto L8a
            goto L93
        L8a:
            lfm r9 = (defpackage.lfm) r9
            long r5 = r9.b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L7b
            r0 = r9
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
