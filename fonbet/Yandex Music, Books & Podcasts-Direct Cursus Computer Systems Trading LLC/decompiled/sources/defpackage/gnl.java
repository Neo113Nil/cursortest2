package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class gnl extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jnl m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnl(jnl jnlVar, Continuation continuation) {
        super(2, continuation);
        this.m = jnlVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                gnl gnlVar = new gnl(this.m, continuation);
                gnlVar.l = obj;
                return gnlVar;
            default:
                gnl gnlVar2 = new gnl(continuation, this.m);
                gnlVar2.l = obj;
                return gnlVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((gnl) create((knl) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((gnl) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                knl knlVar = (knl) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    dnl dnlVar = knlVar.a;
                    ajl ajlVar = knlVar.b;
                    this.l = null;
                    this.k = 1;
                    if (jnl.a(this.m, dnlVar, ajlVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                Object obj2 = this.l;
                Object obj3 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    jnl jnlVar = this.m;
                    if (booleanValue) {
                        this.l = null;
                        this.k = 1;
                        rpq rpqVar = jnlVar.b;
                        Object O = zsd.O(zsd.b0(zsd.Q(new eno(new fpq(rpqVar, (Continuation) null, 1)), new p6o(rpqVar.b.d, 23), rpqVar.c.c(), new a35(rpqVar, null, 8))), new gnl(jnlVar, (Continuation) null), this);
                        if (O != obj3) {
                            O = Unit.a;
                        }
                        if (O == obj3) {
                        }
                    } else {
                        Collection values = jnlVar.k.values();
                        values.getClass();
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            ((yfg) it.next()).cancel();
                        }
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnl(Continuation continuation, jnl jnlVar) {
        super(2, continuation);
        this.m = jnlVar;
    }
}
