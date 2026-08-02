package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.home.plaque.repository.api.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ux2 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public int m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux2(Object obj, int i, int i2, Continuation continuation, int i3) {
        super(2, continuation);
        this.j = i3;
        this.o = obj;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ux2((vx2) this.o, this.l, this.m, continuation, 0);
            case 1:
                return new ux2((e15) this.o, continuation, 1);
            case 2:
                ux2 ux2Var = new ux2((fvf) this.o, this.l, this.m, continuation, 2);
                ux2Var.n = obj;
                return ux2Var;
            default:
                return new ux2((p) this.o, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((ux2) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ux2) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ux2) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ux2) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        if (defpackage.y2x.p(r8, r14) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015f, code lost:
    
        if (r1 == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007e -> B:8:0x003c). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xdr xdrVar;
        Object b;
        float f;
        Integer num;
        Object b2;
        int i;
        String str;
        Object a;
        p pVar;
        int i2;
        Object obj2;
        int i3 = 0;
        switch (this.j) {
            case 0:
                int i4 = this.m;
                int i5 = this.l;
                l18 l18Var = l18.b;
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    vx2 vx2Var = (vx2) this.o;
                    xdrVar = vx2Var.c;
                    t5s t5sVar = vx2Var.a;
                    this.n = xdrVar;
                    this.k = 1;
                    b = t5sVar.b(this);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdr xdrVar2 = (xdr) this.n;
                    qgg.h0(obj);
                    xdrVar = xdrVar2;
                    b = obj;
                }
                if (((Boolean) b).booleanValue()) {
                    bdt I = hag.I(m4s.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    f = 0.0f;
                } else {
                    bdt I2 = hag.I(m4s.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    f = i5 / i4;
                }
                Float f2 = new Float(f);
                xdrVar.getClass();
                xdrVar.m(null, f2);
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i7 = this.m;
                if (i7 == 0) {
                    qgg.h0(obj);
                    e15 e15Var = (e15) this.o;
                    String str2 = ((frt) l18.b.c(hag.I(frt.class))).c().a;
                    str2.getClass();
                    num = new Integer(1);
                    i5h g = e15Var.g();
                    this.n = num;
                    this.k = 0;
                    this.l = 0;
                    this.m = 1;
                    b2 = g.b(str2, this);
                    if (b2 != nm6Var2) {
                        i = 0;
                    }
                    return nm6Var2;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                    return new Integer(((Number) a).intValue());
                }
                int i8 = this.l;
                int i9 = this.k;
                Integer num2 = (Integer) this.n;
                qgg.h0(obj);
                num = num2;
                i = i8;
                i3 = i9;
                b2 = obj;
                hjn P = ((MainDatabase) b2).P();
                if (num != null) {
                    str = "AND liked = " + num;
                } else {
                    str = "";
                }
                atn atnVar = new atn(hlr.d("\n                        SELECT COUNT(*) FROM artist_mview\n                        WHERE \n                            (available=1)\n                            " + str + "\n                    "), (Object[]) null);
                this.n = null;
                this.k = i3;
                this.l = i;
                this.m = 2;
                a = P.a(atnVar, this);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    rwo rwoVar = (rwo) this.n;
                    fvf fvfVar = (fvf) this.o;
                    dvf dvfVar = new dvf(rwoVar, fvfVar, i3);
                    int i11 = this.l;
                    int i12 = this.m;
                    jx7 jx7Var = ((bvf) fvfVar.e.getValue()).i;
                    this.k = 1;
                    if (kuf.b(dvfVar, i11, i12, 100, jx7Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var4 = nm6.a;
                int i13 = this.m;
                if (i13 == 0) {
                    qgg.h0(obj);
                    pVar = (p) this.o;
                    i2 = 0;
                } else if (i13 == 1) {
                    i3 = this.l;
                    i2 = this.k;
                    pVar = (p) this.n;
                    qgg.h0(obj);
                    obj2 = obj;
                    Boolean bool = (Boolean) obj2;
                    bool.getClass();
                    if (!bool.booleanValue() && i3 < 4) {
                        msa msaVar = nsa.b;
                        long q = nsa.q(yd5.M(2, ssa.SECONDS), Math.pow(3.0d, i3 - 1));
                        this.n = pVar;
                        this.k = i2;
                        this.l = i3;
                        this.m = 2;
                        break;
                    } else {
                        return bool;
                    }
                } else {
                    if (i13 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = this.l;
                    i2 = this.k;
                    pVar = (p) this.n;
                    qgg.h0(obj);
                }
                i3++;
                a aVar = (a) pVar.b;
                this.n = pVar;
                this.k = i2;
                this.l = i3;
                this.m = 1;
                obj2 = aVar.c(i3, 4, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
    }
}
