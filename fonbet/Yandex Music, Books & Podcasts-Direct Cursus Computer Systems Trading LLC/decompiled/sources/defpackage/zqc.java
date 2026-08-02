package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zqc extends h7o implements Function2 {
    public final /* synthetic */ int k;
    public int l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zqc(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.k = 0;
        this.n = coroutineContext;
        this.o = (h7o) function2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h7o, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                zqc zqcVar = new zqc((CoroutineContext) this.n, (Function2) this.o, continuation);
                zqcVar.m = obj;
                return zqcVar;
            case 1:
                zqc zqcVar2 = new zqc((mm6) this.n, (Function1) this.o, continuation, 1);
                zqcVar2.m = obj;
                return zqcVar2;
            case 2:
                zqc zqcVar3 = new zqc((has) this.o, continuation, 2);
                zqcVar3.m = obj;
                return zqcVar3;
            case 3:
                zqc zqcVar4 = new zqc((ypb) this.o, continuation, 3);
                zqcVar4.n = obj;
                return zqcVar4;
            case 4:
                zqc zqcVar5 = new zqc((qnm) this.o, continuation, 4);
                zqcVar5.m = obj;
                return zqcVar5;
            case 5:
                zqc zqcVar6 = new zqc((xep) this.n, (dep) this.o, continuation, 5);
                zqcVar6.m = obj;
                return zqcVar6;
            default:
                zqc zqcVar7 = new zqc((gfm) this.n, (xqn) this.o, continuation, 6);
                zqcVar7.m = obj;
                return zqcVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.k) {
        }
        return ((zqc) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0248, code lost:
    
        if (r7 != r0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x022d, code lost:
    
        if (r5 == r0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0339, code lost:
    
        if (r0 != r8) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x034c, code lost:
    
        if (r0 == r8) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        if (r7 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
    
        if (r2 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
    
        if (r4 == r0) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0321 A[Catch: CancellationException -> 0x0308, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0308, blocks: (B:193:0x0321, B:198:0x032f, B:206:0x0304, B:208:0x030f), top: B:184:0x02eb }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARN: Type inference failed for: r0v10, types: [h7o, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0248 -> B:103:0x024c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x02a9 -> B:124:0x02ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x0339 -> B:151:0x031b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x034c -> B:151:0x031b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a8 -> B:8:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01f0 -> B:89:0x01f1). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hur hurVar;
        hur hurVar2;
        hur hurVar3;
        Object c;
        hur hurVar4;
        lfm lfmVar;
        Object a;
        ygp ygpVar;
        Object invoke;
        ygp ygpVar2;
        Iterator it;
        hur hurVar5;
        Object d;
        Object a2;
        hur hurVar6;
        Object obj2;
        Object a3;
        int i = this.k;
        hur hurVar7 = "call to 'resume' before 'invoke' with coroutine";
        Object obj3 = this.o;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineContext coroutineContext = (CoroutineContext) this.n;
                nm6 nm6Var = nm6.a;
                int i2 = this.l;
                try {
                } catch (CancellationException e) {
                    if (!saf.X(coroutineContext)) {
                        throw e;
                    }
                    this.m = hurVar7;
                    this.l = 3;
                    Object u = xee.u(hurVar7, gfm.c, this);
                    hurVar7 = hurVar7;
                    break;
                }
                if (i2 == 0) {
                    qgg.h0(obj);
                    hurVar2 = (hur) this.m;
                } else if (i2 == 1) {
                    hur hurVar8 = (hur) this.m;
                    qgg.h0(obj);
                    hurVar = hurVar8;
                    this.m = hurVar;
                    this.l = 2;
                    Object u2 = xee.u(hurVar, gfm.c, this);
                    hurVar7 = hurVar;
                } else if (i2 == 2) {
                    hur hurVar9 = (hur) this.m;
                    qgg.h0(obj);
                    hurVar7 = hurVar9;
                    if (saf.X(coroutineContext)) {
                        return Unit.a;
                    }
                    this.m = hurVar7;
                    this.l = 1;
                    Object invoke2 = ((h7o) obj3).invoke(hurVar7, this);
                    hurVar = hurVar7;
                    if (invoke2 == nm6Var) {
                        return nm6Var;
                    }
                    this.m = hurVar;
                    this.l = 2;
                    Object u22 = xee.u(hurVar, gfm.c, this);
                    hurVar7 = hurVar;
                    break;
                } else {
                    if (i2 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hurVar2 = (hur) this.m;
                    qgg.h0(obj);
                }
                hurVar7 = hurVar2;
                if (saf.X(coroutineContext)) {
                }
            case 1:
                hur hurVar10 = (hur) this.m;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    if (saf.X(((mm6) this.n).getCoroutineContext())) {
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    Object a4 = obj;
                    Function1 function1 = (Function1) obj3;
                    for (lfm lfmVar2 : ((ffm) a4).a) {
                        boolean z = lfmVar2.d;
                        boolean z2 = lfmVar2.h;
                        if (z && !z2) {
                            function1.invoke(Boolean.FALSE);
                        } else if (!z && z2) {
                            function1.invoke(Boolean.TRUE);
                        }
                    }
                    if (saf.X(((mm6) this.n).getCoroutineContext())) {
                        gfm gfmVar = gfm.a;
                        this.m = hurVar10;
                        this.l = 1;
                        a4 = hurVar10.a(gfmVar, this);
                        if (a4 == nm6Var2) {
                            return nm6Var2;
                        }
                        Function1 function12 = (Function1) obj3;
                        while (r3.hasNext()) {
                        }
                        if (saf.X(((mm6) this.n).getCoroutineContext())) {
                            return Unit.a;
                        }
                    }
                }
                break;
            case 2:
                has hasVar = (has) obj3;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    hurVar3 = (hur) this.m;
                    this.m = hurVar3;
                    this.l = 1;
                    c = g6s.c(hurVar3, false, this, 2);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lfmVar = (lfm) this.n;
                        hurVar4 = (hur) this.m;
                        qgg.h0(obj);
                        a = obj;
                        List list = ((ffm) a).a;
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            lfm lfmVar3 = (lfm) list.get(i5);
                            if (ywf.u(lfmVar3.a, lfmVar.a) && lfmVar3.d) {
                                this.m = hurVar4;
                                this.n = lfmVar;
                                this.l = 2;
                                a = hurVar4.a(gfm.b, this);
                                break;
                            }
                        }
                        hasVar.c();
                        return Unit.a;
                    }
                    hurVar3 = (hur) this.m;
                    qgg.h0(obj);
                    c = obj;
                }
                lfm lfmVar4 = (lfm) c;
                long j = lfmVar4.c;
                hasVar.a();
                hurVar4 = hurVar3;
                lfmVar = lfmVar4;
                this.m = hurVar4;
                this.n = lfmVar;
                this.l = 2;
                a = hurVar4.a(gfm.b, this);
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.l;
                if (i6 == 0) {
                    qgg.h0(obj);
                    ygpVar = (ygp) this.n;
                    invoke = ((ypb) obj3).invoke();
                    if (invoke != null) {
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj4 = this.m;
                    ygpVar = (ygp) this.n;
                    qgg.h0(obj);
                    if (obj4 == null) {
                        return Unit.a;
                    }
                    invoke = ((ypb) obj3).invoke();
                    if (invoke != null) {
                        this.n = ygpVar;
                        this.m = invoke;
                        this.l = 1;
                        ygpVar.a(invoke, this);
                        nm6 nm6Var5 = nm6.a;
                        return nm6Var4;
                    }
                    obj4 = null;
                    if (obj4 == null) {
                    }
                    invoke = ((ypb) obj3).invoke();
                    if (invoke != null) {
                    }
                }
            case 4:
                nm6 nm6Var6 = nm6.a;
                int i7 = this.l;
                if (i7 == 0) {
                    qgg.h0(obj);
                    ygp ygpVar3 = (ygp) this.m;
                    qnm qnmVar = (qnm) obj3;
                    if (qnmVar instanceof or5) {
                        ygpVar2 = ygpVar3;
                        it = ((or5) qnmVar).a.iterator();
                        while (it.hasNext()) {
                        }
                        return Unit.a;
                    }
                    if ((qnmVar instanceof ipt) && ((ipt) qnmVar).a != null) {
                        this.l = 2;
                        ygpVar3.a(qnmVar, this);
                        return nm6Var6;
                    }
                    return Unit.a;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.n;
                ygpVar2 = (ygp) this.m;
                qgg.h0(obj);
                while (it.hasNext()) {
                    zqc zqcVar = new zqc((qnm) it.next(), continuation, 4);
                    this.m = ygpVar2;
                    this.n = it;
                    this.l = 1;
                    ygpVar2.getClass();
                    Object b = ygpVar2.b(dhp.a(zqcVar), this);
                    if (b != nm6.a) {
                        b = Unit.a;
                    }
                    if (b == nm6Var6) {
                        return nm6Var6;
                    }
                }
                return Unit.a;
            case 5:
                nm6 nm6Var7 = nm6.a;
                int i8 = this.l;
                if (i8 == 0) {
                    qgg.h0(obj);
                    hurVar5 = (hur) this.m;
                    this.m = hurVar5;
                    this.l = 1;
                    kr3 kr3Var = g6s.a;
                    d = g6s.d(hurVar5, gfm.b, this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        a2 = obj;
                        if (!((Boolean) a2).booleanValue() && ((xep) this.n).d() == null) {
                            ((dep) obj3).invoke();
                        }
                        return Unit.a;
                    }
                    hurVar5 = (hur) this.m;
                    qgg.h0(obj);
                    d = obj;
                }
                gfm gfmVar2 = gfm.a;
                this.m = null;
                this.l = 2;
                a2 = wna.a(hurVar5, (lfm) d, gfmVar2, this);
                break;
            default:
                xqn xqnVar = (xqn) obj3;
                nm6 nm6Var8 = nm6.a;
                int i9 = this.l;
                bvg bvgVar = bvg.a;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hurVar6 = (hur) this.m;
                        qgg.h0(obj);
                        obj2 = obj;
                        ffm ffmVar = (ffm) obj2;
                        List list2 = ffmVar.a;
                        int size2 = list2.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size2) {
                                xqnVar.a = new cvg((lfm) list2.get(0));
                            } else if (swf.A((lfm) list2.get(i10))) {
                                i10++;
                            } else if (ffmVar.a() != 2) {
                                int size3 = list2.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    lfm lfmVar5 = (lfm) list2.get(i11);
                                    if (lfmVar5.b() || swf.S(lfmVar5, hurVar6.f.y, hurVar6.b())) {
                                        xqnVar.a = bvgVar;
                                    }
                                }
                                gfm gfmVar3 = gfm.c;
                                this.m = hurVar6;
                                this.l = 2;
                                a3 = hurVar6.a(gfmVar3, this);
                                break;
                            } else {
                                xqnVar.a = dvg.a;
                            }
                        }
                        return Unit.a;
                    }
                    if (i9 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hurVar6 = (hur) this.m;
                    qgg.h0(obj);
                    a3 = obj;
                    List list3 = ((ffm) a3).a;
                    int size4 = list3.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        if (((lfm) list3.get(i12)).b()) {
                            xqnVar.a = bvgVar;
                            return Unit.a;
                        }
                    }
                    gfm gfmVar4 = (gfm) this.n;
                    this.m = hurVar6;
                    this.l = 1;
                    obj2 = hurVar6.a(gfmVar4, this);
                    break;
                } else {
                    qgg.h0(obj);
                    hurVar6 = (hur) this.m;
                    gfm gfmVar42 = (gfm) this.n;
                    this.m = hurVar6;
                    this.l = 1;
                    obj2 = hurVar6.a(gfmVar42, this);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqc(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqc(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.n = obj;
        this.o = obj2;
    }
}
