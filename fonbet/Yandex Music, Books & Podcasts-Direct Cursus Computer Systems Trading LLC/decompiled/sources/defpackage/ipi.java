package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ipi extends h7o implements Function2 {
    public g5d k;
    public jpi l;
    public long[] m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ jpi q;
    public final /* synthetic */ g5d r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipi(jpi jpiVar, g5d g5dVar, Continuation continuation) {
        super(2, continuation);
        this.q = jpiVar;
        this.r = g5dVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ipi ipiVar = new ipi(this.q, this.r, continuation);
        ipiVar.p = obj;
        return ipiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ipi) create((ygp) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ygp ygpVar;
        jpi jpiVar;
        long[] jArr;
        int i;
        g5d g5dVar;
        nm6 nm6Var = nm6.a;
        int i2 = this.o;
        if (i2 == 0) {
            qgg.h0(obj);
            ygpVar = (ygp) this.p;
            jpiVar = this.q;
            hpi hpiVar = jpiVar.b;
            jArr = hpiVar.c;
            i = hpiVar.e;
            g5dVar = this.r;
        } else {
            if (i2 != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.n;
            jArr = this.m;
            jpiVar = this.l;
            g5dVar = this.k;
            ygpVar = (ygp) this.p;
            qgg.h0(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        g5dVar.b = i;
        Object obj2 = jpiVar.b.b[i];
        this.p = ygpVar;
        this.k = g5dVar;
        this.l = jpiVar;
        this.m = jArr;
        this.n = i3;
        this.o = 1;
        ygpVar.a(obj2, this);
        return nm6Var;
    }
}
