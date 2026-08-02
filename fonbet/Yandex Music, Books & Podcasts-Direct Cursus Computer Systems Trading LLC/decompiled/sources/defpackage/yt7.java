package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class yt7 extends aur implements Function2 {
    public oqi j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ au7 n;
    public final /* synthetic */ au7 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ gxj q;
    public final /* synthetic */ List r;
    public fwu s;
    public int t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt7(au7 au7Var, Continuation continuation, au7 au7Var2, boolean z, gxj gxjVar, List list) {
        super(2, continuation);
        this.n = au7Var;
        this.o = au7Var2;
        this.p = z;
        this.q = gxjVar;
        this.r = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new yt7(this.n, continuation, this.o, this.p, this.q, this.r);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yt7) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v6, types: [oqi] */
    /* JADX WARN: Type inference failed for: r4v11, types: [oqi] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r7v5, types: [oqi] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qqi qqiVar;
        int i;
        ?? r2;
        Object obj2;
        int i2;
        fwu f;
        Object a;
        int i3;
        ?? r7;
        int i4;
        Object c;
        qqi qqiVar2;
        au7 au7Var = this.o;
        xdr xdrVar = (xdr) au7Var.o;
        nm6 nm6Var = nm6.a;
        int i5 = this.m;
        int i6 = 0;
        try {
            if (i5 == 0) {
                qgg.h0(obj);
                qqi qqiVar3 = (qqi) this.n.m;
                this.j = qqiVar3;
                this.k = 0;
                this.m = 1;
                if (qqiVar3.a(this) != nm6Var) {
                    qqiVar = qqiVar3;
                    i = 0;
                }
                return nm6Var;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r2 = this.j;
                    try {
                        qgg.h0(obj);
                        c = obj;
                        qqiVar2 = r2;
                        obj2 = c;
                        qqiVar = qqiVar2;
                        qqiVar.b(null);
                        return obj2;
                    } catch (Throwable th) {
                        th = th;
                        r2.b(null);
                        throw th;
                    }
                }
                int i7 = this.u;
                int i8 = this.t;
                int i9 = this.l;
                i4 = this.k;
                f = this.s;
                r7 = this.j;
                try {
                    qgg.h0(obj);
                    i6 = i9;
                    i3 = i8;
                    i2 = i7;
                    a = obj;
                    boolean booleanValue = ((Boolean) a).booleanValue();
                    xdrVar.l(f);
                    this.j = r7;
                    this.s = null;
                    this.k = i4;
                    this.l = i6;
                    this.t = i3;
                    this.u = i2;
                    this.m = 3;
                    c = au7.c(au7Var, booleanValue, f, i2, this);
                    if (c != nm6Var) {
                        qqiVar2 = r7;
                        obj2 = c;
                        qqiVar = qqiVar2;
                        qqiVar.b(null);
                        return obj2;
                    }
                    return nm6Var;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = r7;
                    r2.b(null);
                    throw th;
                }
            }
            int i10 = this.k;
            ?? r4 = this.j;
            qgg.h0(obj);
            i = i10;
            qqiVar = r4;
            Object value = xdrVar.getValue();
            fwu fwuVar = value instanceof fwu ? (fwu) value : null;
            obj2 = pvu.a;
            if (fwuVar != null) {
                tyu tyuVar = fwuVar.a;
                eu7 M = ksw.M(tyuVar.a, this.p, this.q, this.r, false, 8);
                gyn gynVar = tyuVar.b;
                e5q e5qVar = fwuVar.b;
                a3l a3lVar = a3l.a;
                fwu f2 = au7Var.f(M, gynVar, e5qVar, false, a3lVar);
                tyu tyuVar2 = f2.a;
                gxj gxjVar = this.q;
                int b = gxjVar != null ? tyuVar2.a.a.b(gxjVar.a) : M.c();
                eu7 a2 = tyuVar2.a(b);
                if (a2 != null) {
                    i2 = b;
                    f = au7Var.f(a2, tyuVar2.b, f2.b, false, a3lVar);
                    v5j v5jVar = v5j.d;
                    this.j = qqiVar;
                    this.s = f;
                    this.k = i;
                    this.l = 0;
                    this.t = 0;
                    this.u = i2;
                    this.m = 2;
                    a = au7.a(au7Var, fwuVar, f, v5jVar, this);
                    if (a != nm6Var) {
                        i3 = 0;
                        r7 = qqiVar;
                        i4 = i;
                        boolean booleanValue2 = ((Boolean) a).booleanValue();
                        xdrVar.l(f);
                        this.j = r7;
                        this.s = null;
                        this.k = i4;
                        this.l = i6;
                        this.t = i3;
                        this.u = i2;
                        this.m = 3;
                        c = au7.c(au7Var, booleanValue2, f, i2, this);
                        if (c != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
            }
            qqiVar.b(null);
            return obj2;
        } catch (Throwable th3) {
            th = th3;
            r2 = qqiVar;
            r2.b(null);
            throw th;
        }
    }
}
