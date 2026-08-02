package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rwb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jub m;
    public final /* synthetic */ xqn n;
    public final /* synthetic */ fvf o;
    public final /* synthetic */ Function1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwb(jub jubVar, xqn xqnVar, fvf fvfVar, Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = jubVar;
        this.n = xqnVar;
        this.o = fvfVar;
        this.p = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                rwb rwbVar = new rwb(this.m, this.n, this.o, this.p, continuation, 0);
                rwbVar.l = obj;
                return rwbVar;
            default:
                rwb rwbVar2 = new rwb(this.m, this.n, this.o, this.p, continuation, 1);
                rwbVar2.l = obj;
                return rwbVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mtb mtbVar = (mtb) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((rwb) create(mtbVar, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (defpackage.zsd.g0(r13, r12) == r10) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (defpackage.cxb.C(r3, r12) == r10) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0113, code lost:
    
        if (defpackage.zsd.g0(r13, r12) == r10) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        if (defpackage.vwb.F(r3, r12) == r10) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Function1 function1 = this.p;
        final fvf fvfVar = this.o;
        jub jubVar = this.m;
        xqn xqnVar = this.n;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                mtb mtbVar = (mtb) this.l;
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    jubVar.i(false);
                    if (!Intrinsics.d(mtbVar.d, xqnVar.a)) {
                        this.l = mtbVar;
                        this.k = 1;
                        break;
                    }
                    if (mtbVar.b) {
                        h7a d0 = zsd.d0(zsd.b0(szf.s0(new ga2(fvfVar, 2))), 1);
                        final int intValue = ((Number) function1.invoke(mtbVar.c)).intValue();
                        tc4 u0 = zsd.u0(d0, new qk3(szf.s0(new Function0() { // from class: pwb
                            /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
                            
                                if (r3 > r2) goto L26;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
                            
                                if (r3 > r2) goto L14;
                             */
                            @Override // kotlin.jvm.functions.Function0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke() {
                                boolean z;
                                boolean z2;
                                switch (i3) {
                                    case 0:
                                        fvf fvfVar2 = fvfVar;
                                        cvf cvfVar = (cvf) CollectionsKt.Z(fvfVar2.j().k);
                                        int i5 = fvfVar2.j().n;
                                        long g = fvfVar2.j().g();
                                        int i6 = -fvfVar2.j().l;
                                        if (cvfVar != null && i5 > 0) {
                                            int i7 = (((int) (g & 4294967295L)) - i6) - cvfVar.p;
                                            z = true;
                                            if (i5 - 1 == cvfVar.a) {
                                                break;
                                            }
                                        }
                                        z = false;
                                        return Boolean.valueOf(z);
                                    default:
                                        fvf fvfVar3 = fvfVar;
                                        cvf cvfVar2 = (cvf) CollectionsKt.Z(fvfVar3.j().k);
                                        int i8 = fvfVar3.j().n;
                                        long g2 = fvfVar3.j().g();
                                        int i9 = -fvfVar3.j().l;
                                        if (cvfVar2 != null && i8 > 0) {
                                            int i10 = (((int) (g2 & 4294967295L)) - i9) - cvfVar2.p;
                                            z2 = true;
                                            if (i8 - 1 == cvfVar2.a) {
                                                break;
                                            }
                                        }
                                        z2 = false;
                                        return Boolean.valueOf(z2);
                                }
                            }
                        }), 2));
                        this.l = null;
                        this.k = 2;
                        break;
                    }
                } else if (i4 == 1) {
                    qgg.h0(obj);
                } else if (i4 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    jubVar.i(true);
                    break;
                }
                xqnVar.a = mtbVar.d;
                if (mtbVar.b) {
                }
            default:
                mtb mtbVar2 = (mtb) this.l;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    jubVar.i(false);
                    if (!Intrinsics.d(mtbVar2.d, xqnVar.a)) {
                        this.l = mtbVar2;
                        this.k = 1;
                        break;
                    }
                    if (mtbVar2.b) {
                        h7a d02 = zsd.d0(zsd.b0(szf.s0(new ga2(fvfVar, 4))), 1);
                        final int intValue2 = ((Number) function1.invoke(mtbVar2.c)).intValue();
                        tc4 u02 = zsd.u0(d02, new qk3(szf.s0(new Function0() { // from class: pwb
                            /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
                            
                                if (r3 > r2) goto L26;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
                            
                                if (r3 > r2) goto L14;
                             */
                            @Override // kotlin.jvm.functions.Function0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke() {
                                boolean z;
                                boolean z2;
                                switch (i2) {
                                    case 0:
                                        fvf fvfVar2 = fvfVar;
                                        cvf cvfVar = (cvf) CollectionsKt.Z(fvfVar2.j().k);
                                        int i52 = fvfVar2.j().n;
                                        long g = fvfVar2.j().g();
                                        int i6 = -fvfVar2.j().l;
                                        if (cvfVar != null && i52 > 0) {
                                            int i7 = (((int) (g & 4294967295L)) - i6) - cvfVar.p;
                                            z = true;
                                            if (i52 - 1 == cvfVar.a) {
                                                break;
                                            }
                                        }
                                        z = false;
                                        return Boolean.valueOf(z);
                                    default:
                                        fvf fvfVar3 = fvfVar;
                                        cvf cvfVar2 = (cvf) CollectionsKt.Z(fvfVar3.j().k);
                                        int i8 = fvfVar3.j().n;
                                        long g2 = fvfVar3.j().g();
                                        int i9 = -fvfVar3.j().l;
                                        if (cvfVar2 != null && i8 > 0) {
                                            int i10 = (((int) (g2 & 4294967295L)) - i9) - cvfVar2.p;
                                            z2 = true;
                                            if (i8 - 1 == cvfVar2.a) {
                                                break;
                                            }
                                        }
                                        z2 = false;
                                        return Boolean.valueOf(z2);
                                }
                            }
                        }), 3));
                        this.l = null;
                        this.k = 2;
                        break;
                    }
                } else if (i5 == 1) {
                    qgg.h0(obj);
                } else if (i5 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    jubVar.i(true);
                    break;
                }
                xqnVar.a = mtbVar2.d;
                if (mtbVar2.b) {
                }
        }
        return Unit.a;
    }
}
