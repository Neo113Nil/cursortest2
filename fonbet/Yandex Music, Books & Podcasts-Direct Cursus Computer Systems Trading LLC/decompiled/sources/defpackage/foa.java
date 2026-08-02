package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class foa extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public xqn k;
    public xqn l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ p90 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foa(xqn xqnVar, p90 p90Var, Continuation continuation) {
        super(2, continuation);
        this.l = xqnVar;
        this.o = p90Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                foa foaVar = new foa(this.l, this.o, continuation);
                foaVar.n = obj;
                return foaVar;
            default:
                foa foaVar2 = new foa(this.o, continuation);
                foaVar2.n = obj;
                return foaVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((foa) create((Function1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((foa) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:10:0x0020, B:24:0x007e, B:32:0x00ad, B:34:0x00b3, B:38:0x00c3, B:40:0x00c7, B:43:0x00a8, B:44:0x00a3, B:52:0x0026), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:10:0x0020, B:24:0x007e, B:32:0x00ad, B:34:0x00b3, B:38:0x00c3, B:40:0x00c7, B:43:0x00a8, B:44:0x00a3, B:52:0x0026), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:10:0x0020, B:24:0x007e, B:32:0x00ad, B:34:0x00b3, B:38:0x00c3, B:40:0x00c7, B:43:0x00a8, B:44:0x00a3, B:52:0x0026), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:10:0x0020, B:24:0x007e, B:32:0x00ad, B:34:0x00b3, B:38:0x00c3, B:40:0x00c7, B:43:0x00a8, B:44:0x00a3, B:52:0x0026), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0068 -> B:11:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c0 -> B:11:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c5 -> B:11:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d2 -> B:11:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e2 -> B:11:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0132 -> B:56:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0137 -> B:57:0x0138). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        xqn xqnVar;
        Object obj3;
        Object b;
        nm6 nm6Var;
        bna bnaVar;
        xqn xqnVar2;
        xqn xqnVar3;
        Object obj4;
        switch (this.j) {
            case 0:
                xqn xqnVar4 = this.l;
                Function1 function1 = (Function1) this.n;
                nm6 nm6Var2 = nm6.a;
                int i = this.m;
                if (i == 0) {
                    qgg.h0(obj);
                    obj2 = xqnVar4.a;
                    if (obj2 instanceof zma) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    xqn xqnVar5 = this.k;
                    qgg.h0(obj);
                    bna bnaVar2 = (bna) obj;
                    xqnVar5.a = bnaVar2;
                    obj2 = xqnVar4.a;
                    if (!(obj2 instanceof zma) || (obj2 instanceof tma)) {
                        break;
                    } else {
                        bnaVar2 = null;
                        vma vmaVar = obj2 instanceof vma ? (vma) obj2 : null;
                        if (vmaVar != null) {
                            function1.invoke(vmaVar);
                        }
                        zi3 zi3Var = this.o.u;
                        if (zi3Var != null) {
                            this.n = function1;
                            this.k = xqnVar4;
                            this.m = 1;
                            obj = zi3Var.l(this);
                            if (obj != nm6Var2) {
                                xqnVar5 = xqnVar4;
                                bna bnaVar22 = (bna) obj;
                                xqnVar5.a = bnaVar22;
                                obj2 = xqnVar4.a;
                                if (obj2 instanceof zma) {
                                }
                            }
                        } else {
                            xqnVar5 = xqnVar4;
                            xqnVar5.a = bnaVar22;
                            obj2 = xqnVar4.a;
                            if (obj2 instanceof zma) {
                            }
                        }
                    }
                }
                break;
            default:
                mm6 mm6Var = (mm6) this.n;
                nm6 nm6Var3 = nm6.a;
                int i2 = this.m;
                p90 p90Var = this.o;
                try {
                } catch (CancellationException unused) {
                    this.n = mm6Var;
                    this.k = null;
                    this.l = null;
                    this.m = 6;
                    if (p90.W0(p90Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                }
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        if (!gld.T(mm6Var)) {
                            xqnVar3 = new xqn();
                            zi3 zi3Var2 = p90Var.u;
                            if (zi3Var2 != null) {
                                this.n = mm6Var;
                                this.k = xqnVar3;
                                this.l = xqnVar3;
                                this.m = 1;
                                obj = zi3Var2.l(this);
                                if (obj != nm6Var3) {
                                    xqnVar2 = xqnVar3;
                                    bnaVar = (bna) obj;
                                    xqnVar3.a = bnaVar;
                                    obj4 = xqnVar2.a;
                                    if (obj4 instanceof xma) {
                                        this.n = mm6Var;
                                        this.k = xqnVar2;
                                        this.l = null;
                                        this.m = 2;
                                        if (p90.X0(p90Var, (xma) obj4, this) != nm6Var3) {
                                            xqnVar = xqnVar2;
                                            foa foaVar = new foa(xqnVar, p90Var, null);
                                            this.n = mm6Var;
                                            this.k = xqnVar;
                                            this.m = 3;
                                            ja0 ja0Var = p90Var.H;
                                            b = ja0Var.f.b(hqi.a, new w90(ja0Var, new l1(foaVar, p90Var, (Continuation) null), (Continuation) null), this);
                                            nm6Var = nm6.a;
                                            if (b == nm6Var) {
                                                b = Unit.a;
                                            }
                                            if (b == nm6Var) {
                                                b = Unit.a;
                                            }
                                            if (b == nm6Var3) {
                                                break;
                                            }
                                            obj3 = xqnVar.a;
                                            if (obj3 instanceof zma) {
                                                this.n = mm6Var;
                                                this.k = null;
                                                this.m = 4;
                                                if (p90.Y0(p90Var, (zma) obj3, this) == nm6Var3) {
                                                    break;
                                                }
                                            } else if (obj3 instanceof tma) {
                                                this.n = mm6Var;
                                                this.k = null;
                                                this.m = 5;
                                                if (p90.W0(p90Var, this) == nm6Var3) {
                                                }
                                            }
                                        }
                                    }
                                    if (!gld.T(mm6Var)) {
                                        break;
                                    }
                                }
                            } else {
                                xqnVar2 = xqnVar3;
                                bnaVar = null;
                                xqnVar3.a = bnaVar;
                                obj4 = xqnVar2.a;
                                if (obj4 instanceof xma) {
                                }
                                if (!gld.T(mm6Var)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        xqnVar3 = this.l;
                        xqnVar2 = this.k;
                        qgg.h0(obj);
                        bnaVar = (bna) obj;
                        xqnVar3.a = bnaVar;
                        obj4 = xqnVar2.a;
                        if (obj4 instanceof xma) {
                        }
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    case 2:
                        xqnVar = this.k;
                        qgg.h0(obj);
                        foa foaVar2 = new foa(xqnVar, p90Var, null);
                        this.n = mm6Var;
                        this.k = xqnVar;
                        this.m = 3;
                        ja0 ja0Var2 = p90Var.H;
                        b = ja0Var2.f.b(hqi.a, new w90(ja0Var2, new l1(foaVar2, p90Var, (Continuation) null), (Continuation) null), this);
                        nm6Var = nm6.a;
                        if (b == nm6Var) {
                        }
                        if (b == nm6Var) {
                        }
                        if (b == nm6Var3) {
                        }
                        obj3 = xqnVar.a;
                        if (obj3 instanceof zma) {
                        }
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    case 3:
                        xqnVar = this.k;
                        qgg.h0(obj);
                        obj3 = xqnVar.a;
                        if (obj3 instanceof zma) {
                        }
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    case 4:
                    case 5:
                        qgg.h0(obj);
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    case 6:
                        qgg.h0(obj);
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foa(p90 p90Var, Continuation continuation) {
        super(2, continuation);
        this.o = p90Var;
    }
}
