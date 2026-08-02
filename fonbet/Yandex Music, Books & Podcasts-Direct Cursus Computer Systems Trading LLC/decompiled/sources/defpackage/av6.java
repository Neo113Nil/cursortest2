package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class av6 extends aur implements tyc {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av6(Object obj, Continuation continuation, int i) {
        super(5, continuation);
        this.j = i;
        this.o = obj;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.j;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                av6 av6Var = new av6((kv6) this.o, (Continuation) obj5, 0);
                av6Var.k = booleanValue;
                av6Var.m = (u2q) obj2;
                av6Var.n = (u2q) obj3;
                av6Var.l = booleanValue2;
                return av6Var.invokeSuspend(Unit.a);
            default:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                av6 av6Var2 = new av6((Context) this.o, (Continuation) obj5, 1);
                av6Var2.k = booleanValue;
                av6Var2.l = booleanValue3;
                av6Var2.m = (gfw) obj3;
                av6Var2.n = (dgd) obj4;
                return av6Var2.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (defpackage.px2.a().a((android.content.Context) r7.o) != false) goto L17;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        switch (this.j) {
            case 0:
                boolean z2 = this.k;
                u2q u2qVar = (u2q) this.m;
                u2q u2qVar2 = (u2q) this.n;
                boolean z3 = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                kv6 kv6Var = (kv6) this.o;
                kv6Var.z = u2qVar2;
                if (!kv6Var.f) {
                    qvs b = u2qVar2.b();
                    kv6Var.y = b != null ? new Long(b.a) : new Long(0L);
                }
                ((kv6) this.o).getClass();
                u2q u2qVar3 = u2qVar2 != null ? u2qVar2 : null;
                return new vat(u2qVar2, u2qVar, Boolean.valueOf(((u2qVar3 != null ? u2qVar3.c : null) == gy1.e ? new b2c() : new lu6(z3, ((kv6) this.o).m)).p(u2qVar, u2qVar2, z2).c));
            default:
                boolean z4 = this.k;
                boolean z5 = this.l;
                gfw gfwVar = (gfw) this.m;
                dgd dgdVar = (dgd) this.n;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (!z4 && !z5 && gfwVar != gfw.b && !dgdVar.a) {
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (((iew) ((byb) qdcVar.C(I)).b(iew.class)).h()) {
                        jyr jyrVar = px2.a;
                        break;
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
