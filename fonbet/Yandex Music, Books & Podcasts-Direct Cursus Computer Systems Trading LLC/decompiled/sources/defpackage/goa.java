package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class goa extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public xqn k;
    public xqn l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ hoa o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goa(xqn xqnVar, hoa hoaVar, Continuation continuation) {
        super(2, continuation);
        this.l = xqnVar;
        this.o = hoaVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                goa goaVar = new goa(this.l, this.o, continuation);
                goaVar.n = obj;
                return goaVar;
            default:
                goa goaVar2 = new goa(this.o, continuation);
                goaVar2.n = obj;
                return goaVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((goa) create((Function1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((goa) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|(0)|25|26|27|(2:33|(2:35|(0)))(2:29|(1:31))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:27:0x00b0, B:29:0x00b6, B:33:0x00c8, B:35:0x00cc), top: B:26:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:27:0x00b0, B:29:0x00b6, B:33:0x00c8, B:35:0x00cc), top: B:26:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0087 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c3 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ca -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d7 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e5 -> B:9:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x013a -> B:60:0x013b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x013f -> B:61:0x0140). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object obj2;
        mm6 mm6Var;
        xqn xqnVar;
        xqn xqnVar2;
        xqn xqnVar3;
        mm6 mm6Var2;
        mm6 mm6Var3;
        Object obj3;
        goa goaVar;
        cna cnaVar;
        Object obj4;
        switch (this.j) {
            case 0:
                xqn xqnVar4 = this.l;
                nm6 nm6Var = nm6.a;
                int i = this.m;
                if (i == 0) {
                    qgg.h0(obj);
                    function1 = (Function1) this.n;
                    obj2 = xqnVar4.a;
                    if (obj2 instanceof ana) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    xqn xqnVar5 = this.k;
                    function1 = (Function1) this.n;
                    qgg.h0(obj);
                    cna cnaVar2 = (cna) obj;
                    xqnVar5.a = cnaVar2;
                    obj2 = xqnVar4.a;
                    if (!(obj2 instanceof ana) || (obj2 instanceof uma)) {
                        break;
                    } else {
                        cnaVar2 = null;
                        wma wmaVar = obj2 instanceof wma ? (wma) obj2 : null;
                        if (wmaVar != null) {
                            function1.invoke(wmaVar);
                        }
                        zi3 zi3Var = this.o.u;
                        if (zi3Var != null) {
                            this.n = function1;
                            this.k = xqnVar4;
                            this.m = 1;
                            obj = zi3Var.l(this);
                            if (obj != nm6Var) {
                                xqnVar5 = xqnVar4;
                                cna cnaVar22 = (cna) obj;
                                xqnVar5.a = cnaVar22;
                                obj2 = xqnVar4.a;
                                if (obj2 instanceof ana) {
                                }
                            }
                        } else {
                            xqnVar5 = xqnVar4;
                            xqnVar5.a = cnaVar22;
                            obj2 = xqnVar4.a;
                            if (obj2 instanceof ana) {
                            }
                        }
                    }
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.m;
                hoa hoaVar = this.o;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        mm6Var = (mm6) this.n;
                        if (!gld.T(mm6Var)) {
                            xqnVar = new xqn();
                            zi3 zi3Var2 = hoaVar.u;
                            if (zi3Var2 != null) {
                                this.n = mm6Var;
                                this.k = xqnVar;
                                this.l = xqnVar;
                                this.m = 1;
                                obj = zi3Var2.l(this);
                                if (obj != nm6Var2) {
                                    xqnVar2 = xqnVar;
                                    cnaVar = (cna) obj;
                                    xqnVar.a = cnaVar;
                                    obj4 = xqnVar2.a;
                                    if (obj4 instanceof yma) {
                                        this.n = mm6Var;
                                        this.k = xqnVar2;
                                        this.l = null;
                                        this.m = 2;
                                        if (hoa.W0(hoaVar, (yma) obj4, this) != nm6Var2) {
                                            xqnVar3 = xqnVar2;
                                            mm6Var2 = mm6Var;
                                            goaVar = new goa(xqnVar3, hoaVar, null);
                                            this.n = mm6Var2;
                                            this.k = xqnVar3;
                                            this.m = 3;
                                            if (hoaVar.Z0(goaVar, this) == nm6Var2) {
                                            }
                                            mm6Var = mm6Var2;
                                            obj3 = xqnVar3.a;
                                            if (obj3 instanceof ana) {
                                                this.n = mm6Var;
                                                this.k = null;
                                                this.m = 4;
                                                if (hoa.X0(hoaVar, (ana) obj3, this) == nm6Var2) {
                                                    break;
                                                }
                                            } else if (obj3 instanceof uma) {
                                                this.n = mm6Var;
                                                this.k = null;
                                                this.m = 5;
                                                if (hoa.V0(hoaVar, this) == nm6Var2) {
                                                }
                                            }
                                        }
                                    }
                                    if (!gld.T(mm6Var)) {
                                        break;
                                    }
                                }
                            } else {
                                xqnVar2 = xqnVar;
                                cnaVar = null;
                                xqnVar.a = cnaVar;
                                obj4 = xqnVar2.a;
                                if (obj4 instanceof yma) {
                                }
                                if (!gld.T(mm6Var)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        xqnVar = this.l;
                        xqnVar2 = this.k;
                        mm6Var = (mm6) this.n;
                        qgg.h0(obj);
                        cnaVar = (cna) obj;
                        xqnVar.a = cnaVar;
                        obj4 = xqnVar2.a;
                        if (obj4 instanceof yma) {
                        }
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    case 2:
                        xqnVar3 = this.k;
                        mm6Var2 = (mm6) this.n;
                        qgg.h0(obj);
                        goaVar = new goa(xqnVar3, hoaVar, null);
                        this.n = mm6Var2;
                        this.k = xqnVar3;
                        this.m = 3;
                        if (hoaVar.Z0(goaVar, this) == nm6Var2) {
                        }
                        mm6Var = mm6Var2;
                        obj3 = xqnVar3.a;
                        if (obj3 instanceof ana) {
                        }
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    case 3:
                        xqnVar3 = this.k;
                        mm6Var2 = (mm6) this.n;
                        try {
                            qgg.h0(obj);
                        } catch (CancellationException unused) {
                            mm6Var3 = mm6Var2;
                            this.n = mm6Var3;
                            this.k = null;
                            this.m = 6;
                            if (hoa.V0(hoaVar, this) == nm6Var2) {
                            }
                            mm6Var = mm6Var3;
                            if (!gld.T(mm6Var)) {
                            }
                        }
                        mm6Var = mm6Var2;
                        obj3 = xqnVar3.a;
                        if (obj3 instanceof ana) {
                        }
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    case 4:
                        mm6Var3 = (mm6) this.n;
                        try {
                            qgg.h0(obj);
                        } catch (CancellationException unused2) {
                            this.n = mm6Var3;
                            this.k = null;
                            this.m = 6;
                            if (hoa.V0(hoaVar, this) == nm6Var2) {
                                return nm6Var2;
                            }
                            mm6Var = mm6Var3;
                            if (!gld.T(mm6Var)) {
                            }
                        }
                        mm6Var = mm6Var3;
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    case 5:
                        mm6Var3 = (mm6) this.n;
                        qgg.h0(obj);
                        mm6Var = mm6Var3;
                        if (!gld.T(mm6Var)) {
                        }
                        break;
                    case 6:
                        mm6Var3 = (mm6) this.n;
                        qgg.h0(obj);
                        mm6Var = mm6Var3;
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
    public goa(hoa hoaVar, Continuation continuation) {
        super(2, continuation);
        this.o = hoaVar;
    }
}
