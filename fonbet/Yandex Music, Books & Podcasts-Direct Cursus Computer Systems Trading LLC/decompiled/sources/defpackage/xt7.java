package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class xt7 extends aur implements Function2 {
    public oqi j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ au7 n;
    public final /* synthetic */ au7 o;
    public final /* synthetic */ boolean p;
    public xvu q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt7(au7 au7Var, Continuation continuation, au7 au7Var2, boolean z) {
        super(2, continuation);
        this.n = au7Var;
        this.o = au7Var2;
        this.p = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new xt7(this.n, continuation, this.o, this.p);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xt7) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0109 A[Catch: all -> 0x011f, TryCatch #3 {all -> 0x011f, blocks: (B:11:0x0105, B:13:0x0109, B:14:0x013b, B:19:0x0122, B:21:0x0126, B:22:0x0142, B:23:0x0147), top: B:10:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0122 A[Catch: all -> 0x011f, TryCatch #3 {all -> 0x011f, blocks: (B:11:0x0105, B:13:0x0109, B:14:0x013b, B:19:0x0122, B:21:0x0126, B:22:0x0142, B:23:0x0147), top: B:10:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:34:0x0036, B:36:0x00dd, B:38:0x00e8), top: B:33:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v25, types: [oqi] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v37, types: [oqi] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v19, types: [oqi] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r6v7, types: [oqi] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qqi qqiVar;
        int i;
        ?? r3;
        xvu f;
        Object a;
        int i2;
        ?? r6;
        Boolean bool;
        boolean booleanValue;
        qqi qqiVar2;
        xvu xvuVar;
        qqi qqiVar3;
        au7 au7Var = this.o;
        xdr xdrVar = (xdr) au7Var.o;
        nm6 nm6Var = nm6.a;
        int i3 = this.m;
        int i4 = 0;
        try {
            if (i3 == 0) {
                qgg.h0(obj);
                qqi qqiVar4 = (qqi) this.n.m;
                this.j = qqiVar4;
                this.k = 0;
                this.m = 1;
                if (qqiVar4.a(this) != nm6Var) {
                    qqiVar = qqiVar4;
                    i = 0;
                }
                return nm6Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xvuVar = this.q;
                    r3 = this.j;
                    try {
                        qgg.h0(obj);
                        qqiVar3 = r3;
                        qqiVar2 = qqiVar3;
                        f = xvuVar;
                    } catch (Throwable th) {
                        th = th;
                        r3.b(null);
                        throw th;
                    }
                    try {
                        if (f instanceof bwu) {
                            au7.g(au7Var, ((bwu) f).a.a, ((bwu) f).b, false, null, null, null, 124);
                        } else {
                            if (!(f instanceof fwu)) {
                                throw new x7j();
                            }
                            au7.g(au7Var, ((fwu) f).a.a, ((fwu) f).b, false, null, null, null, 124);
                        }
                        bool = Boolean.TRUE;
                        qqiVar = qqiVar2;
                        qqiVar.b(null);
                        return bool;
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = qqiVar2;
                        r3.b(null);
                        throw th;
                    }
                }
                int i5 = this.r;
                int i6 = this.l;
                int i7 = this.k;
                xvu xvuVar2 = this.q;
                r6 = this.j;
                try {
                    qgg.h0(obj);
                    i4 = i6;
                    f = xvuVar2;
                    i2 = i5;
                    i = i7;
                    a = obj;
                    r6 = r6;
                    booleanValue = ((Boolean) a).booleanValue();
                    xdrVar.l(f);
                    if (booleanValue) {
                        qqiVar2 = r6;
                        if (f instanceof bwu) {
                        }
                        bool = Boolean.TRUE;
                        qqiVar = qqiVar2;
                        qqiVar.b(null);
                        return bool;
                    }
                    jac jacVar = (jac) au7Var.b;
                    this.j = r6;
                    this.q = f;
                    this.k = i;
                    this.l = i4;
                    this.r = i2;
                    this.m = 3;
                    if (jacVar.c(this) != nm6Var) {
                        xvuVar = f;
                        qqiVar3 = r6;
                        qqiVar2 = qqiVar3;
                        f = xvuVar;
                        if (f instanceof bwu) {
                        }
                        bool = Boolean.TRUE;
                        qqiVar = qqiVar2;
                        qqiVar.b(null);
                        return bool;
                    }
                    return nm6Var;
                } catch (Throwable th3) {
                    th = th3;
                    r3 = r6;
                    r3.b(null);
                    throw th;
                }
            }
            int i8 = this.k;
            ?? r4 = this.j;
            qgg.h0(obj);
            i = i8;
            qqiVar = r4;
            Object value = xdrVar.getValue();
            xvu xvuVar3 = value instanceof xvu ? (xvu) value : null;
            if (xvuVar3 == null) {
                bool = Boolean.FALSE;
                qqiVar.b(null);
                return bool;
            }
            boolean z = xvuVar3 instanceof bwu;
            a3l a3lVar = a3l.a;
            boolean z2 = this.p;
            if (z) {
                f = au7Var.e(bow.B(((bwu) xvuVar3).a.a, z2), ((bwu) xvuVar3).a.b, ((bwu) xvuVar3).b, a3lVar, null);
            } else {
                if (!(xvuVar3 instanceof fwu)) {
                    throw new x7j();
                }
                f = au7Var.f(bow.B(((fwu) xvuVar3).a.a, z2), ((fwu) xvuVar3).a.b, ((fwu) xvuVar3).b, false, a3lVar);
            }
            v5j v5jVar = v5j.d;
            this.j = qqiVar;
            this.q = f;
            this.k = i;
            this.l = 0;
            this.r = 0;
            this.m = 2;
            a = au7.a(au7Var, xvuVar3, f, v5jVar, this);
            if (a != nm6Var) {
                i2 = 0;
                r6 = qqiVar;
                booleanValue = ((Boolean) a).booleanValue();
                xdrVar.l(f);
                if (booleanValue) {
                }
            }
            return nm6Var;
        } catch (Throwable th4) {
            th = th4;
            r3 = qqiVar;
            r3.b(null);
            throw th;
        }
    }
}
