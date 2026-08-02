package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class dv6 extends aur implements pyc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kv6 m;
    public rjc n;
    public u2q o;
    public u2q p;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv6(Continuation continuation, kv6 kv6Var) {
        super(3, continuation);
        this.m = kv6Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dv6 dv6Var = new dv6((Continuation) obj3, this.m);
        dv6Var.k = (rjc) obj;
        dv6Var.l = obj2;
        return dv6Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        if (defpackage.zsd.e0(r6, r12, r11) != r0) goto L32;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rjc rjcVar;
        u2q u2qVar;
        boolean booleanValue;
        u2q u2qVar2;
        boolean z;
        pjc pjcVar;
        u2q u2qVar3;
        rjc rjcVar2;
        Long l;
        Long l2;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        kv6 kv6Var = this.m;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            rjcVar = this.k;
            vat vatVar = (vat) this.l;
            if (vatVar == null) {
                pjcVar = z4b.a;
                this.k = null;
                this.l = null;
                this.n = null;
                this.o = null;
                this.p = null;
                this.j = 2;
            } else {
                u2qVar = (u2q) vatVar.a;
                u2q u2qVar4 = (u2q) vatVar.b;
                booleanValue = ((Boolean) vatVar.c).booleanValue();
                if (booleanValue) {
                    xdr xdrVar = kv6Var.u;
                    fv6 fv6Var = new fv6(2, 0, null);
                    this.k = null;
                    this.l = null;
                    this.n = rjcVar;
                    this.o = u2qVar;
                    this.p = u2qVar4;
                    this.q = booleanValue;
                    this.j = 1;
                    if (zsd.h0(xdrVar, fv6Var, this) != nm6Var) {
                        u2qVar2 = u2qVar4;
                        z = booleanValue;
                    }
                    return nm6Var;
                }
                u2qVar3 = u2qVar;
                rjcVar2 = rjcVar;
                l = null;
                ExoPlayer k1 = kv6Var.k1();
                pjcVar = zsd.b0(new jv6(zsd.M0(zsd.I(new lco(k1, l, new kvm(), null, 23)), new gv6(continuation, k1, l, 0)), u2qVar3, booleanValue));
                rjcVar = rjcVar2;
                this.k = null;
                this.l = null;
                this.n = null;
                this.o = null;
                this.p = null;
                this.j = 2;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.q;
            u2qVar2 = this.p;
            u2qVar = this.o;
            rjcVar = this.n;
            qgg.h0(obj);
        }
        zwf i1 = kv6.i1(kv6Var, u2qVar2, u2qVar);
        if (i1 != null) {
            l2 = new Long(i1.L());
        } else {
            qvs b = u2qVar2.b();
            if (b != null) {
                l2 = new Long(b.c);
            } else {
                booleanValue = z;
                u2qVar3 = u2qVar;
                rjcVar2 = rjcVar;
                l = null;
                ExoPlayer k12 = kv6Var.k1();
                pjcVar = zsd.b0(new jv6(zsd.M0(zsd.I(new lco(k12, l, new kvm(), null, 23)), new gv6(continuation, k12, l, 0)), u2qVar3, booleanValue));
                rjcVar = rjcVar2;
                this.k = null;
                this.l = null;
                this.n = null;
                this.o = null;
                this.p = null;
                this.j = 2;
            }
        }
        l = l2;
        booleanValue = z;
        u2qVar3 = u2qVar;
        rjcVar2 = rjcVar;
        ExoPlayer k122 = kv6Var.k1();
        pjcVar = zsd.b0(new jv6(zsd.M0(zsd.I(new lco(k122, l, new kvm(), null, 23)), new gv6(continuation, k122, l, 0)), u2qVar3, booleanValue));
        rjcVar = rjcVar2;
        this.k = null;
        this.l = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.j = 2;
    }
}
