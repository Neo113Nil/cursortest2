package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class h0v extends aur implements ryc {
    public /* synthetic */ boolean j;
    public /* synthetic */ c4v k;
    public final /* synthetic */ l0v l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0v(l0v l0vVar, Continuation continuation) {
        super(4, continuation);
        this.l = l0vVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Boolean) obj3).getClass();
        h0v h0vVar = new h0v(this.l, (Continuation) obj4);
        h0vVar.j = booleanValue;
        h0vVar.k = (c4v) obj2;
        return h0vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2 = this.j;
        c4v c4vVar = this.k;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        this.l.getClass();
        b4v b4vVar = c4vVar instanceof b4v ? (b4v) c4vVar : null;
        l2v l2vVar = b4vVar != null ? b4vVar.a.b : null;
        if (l2vVar == null) {
            return null;
        }
        k2v k2vVar = l2vVar.a;
        int ordinal = k2vVar.k.ordinal();
        boolean z3 = false;
        if (ordinal == 0) {
            z = true;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            z = false;
        }
        if (!z2) {
            return z ? new o3v(l0v.b(k2vVar)) : p3v.a;
        }
        n3v b = l0v.b(k2vVar);
        a3v a3vVar = k2vVar.a;
        if (a3vVar instanceof y2v) {
            z3 = true;
        } else if (!(a3vVar instanceof z2v)) {
            b6e.s();
            return null;
        }
        bzs bzsVar = k2vVar.h;
        if (bzsVar == null) {
            bzsVar = bzs.e;
        }
        return new q3v(b, bzsVar.d, z3);
    }
}
