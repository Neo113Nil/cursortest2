package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class tzc extends aur implements Function2 {
    public int j;
    public int k;
    public float l;
    public uqn m;
    public uzc n;
    public int o;
    public final /* synthetic */ long p;
    public final /* synthetic */ uzc q;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzc(long j, uzc uzcVar, float f, float f2, long j2, Continuation continuation) {
        super(2, continuation);
        this.p = j;
        this.q = uzcVar;
        this.r = f;
        this.s = f2;
        this.t = j2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new tzc(this.p, this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tzc) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0090, code lost:
    
        if (defpackage.y2x.o(r10, r13) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0092, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (defpackage.y2x.p(r13.t, r13) == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0090 -> B:6:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int d;
        float f;
        uqn uqnVar;
        uzc uzcVar;
        uqn uqnVar2;
        int i;
        float f2;
        int i2;
        nm6 nm6Var = nm6.a;
        int i3 = this.o;
        float f3 = this.r;
        uzc uzcVar2 = this.q;
        if (i3 == 0) {
            qgg.h0(obj);
            d = (int) nsa.d(this.p, uzcVar2.a);
            float f4 = this.s;
            f = (f3 - f4) / d;
            uqnVar = new uqn();
            uqnVar.a = f4 + f;
            this.m = uqnVar;
            this.j = d;
            this.l = f;
            this.o = 1;
        } else if (i3 == 1) {
            f = this.l;
            d = this.j;
            uqnVar = this.m;
            qgg.h0(obj);
        } else {
            if (i3 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.k;
            f2 = this.l;
            i = this.j;
            uzcVar = this.n;
            uqnVar2 = this.m;
            qgg.h0(obj);
            i2++;
            if (i2 < i) {
                xdr xdrVar = (xdr) uzcVar2.b;
                Float f5 = new Float(f3);
                xdrVar.getClass();
                xdrVar.m(null, f5);
                return Unit.a;
            }
            xdr xdrVar2 = (xdr) uzcVar.b;
            Float f6 = new Float(uqnVar2.a);
            xdrVar2.getClass();
            xdrVar2.m(null, f6);
            uqnVar2.a += f2;
            long f7 = nsa.f(uzcVar.a);
            this.m = uqnVar2;
            this.n = uzcVar;
            this.j = i;
            this.l = f2;
            this.k = i2;
            this.o = 2;
        }
        uzcVar = uzcVar2;
        uqnVar2 = uqnVar;
        i = d;
        f2 = f;
        i2 = 0;
        if (i2 < i) {
        }
    }
}
