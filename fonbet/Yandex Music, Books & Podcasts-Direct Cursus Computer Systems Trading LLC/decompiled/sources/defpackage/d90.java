package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class d90 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ float k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d90(float f, ri2 ri2Var, Continuation continuation) {
        super(3, continuation);
        this.j = 2;
        this.k = f;
        this.m = ri2Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                float floatValue = ((Number) obj2).floatValue();
                d90 d90Var = new d90((ka0) this.m, (Continuation) obj3, 0);
                d90Var.l = (mm6) obj;
                d90Var.k = floatValue;
                return d90Var.invokeSuspend(Unit.a);
            case 1:
                float floatValue2 = ((Number) obj2).floatValue();
                d90 d90Var2 = new d90((fle) this.m, (Continuation) obj3, 1);
                d90Var2.l = (lke) obj;
                d90Var2.k = floatValue2;
                return d90Var2.invokeSuspend(Unit.a);
            case 2:
                d90 d90Var3 = new d90(this.k, (ri2) this.m, (Continuation) obj3);
                d90Var3.l = (ca0) obj;
                return d90Var3.invokeSuspend(Unit.a);
            default:
                float floatValue3 = ((Number) obj2).floatValue();
                d90 d90Var4 = new d90((nvr) this.m, (Continuation) obj3, 3);
                d90Var4.l = (mm6) obj;
                d90Var4.k = floatValue3;
                return d90Var4.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        boolean z = false;
        z = false;
        Continuation continuation = null;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                x97.y((mm6) this.l, null, null, new c90((ka0) obj2, this.k, continuation, z ? 1 : 0), 3);
                break;
            case 1:
                lke lkeVar = (lke) this.l;
                float f = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (lkeVar != null) {
                    fle fleVar = (fle) obj2;
                    if (f == -1.0f) {
                        Set set = fle.e;
                    } else if (fleVar.a.equals(vke.a)) {
                        z = lkeVar.d().containsAll(fle.e);
                    }
                    if (!z) {
                        break;
                    }
                }
                break;
            case 2:
                ca0 ca0Var = (ca0) this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ca0Var.a(this.k * ((ri2) obj2).c * 0.5f, 0.0f);
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                x97.y((mm6) this.l, null, null, new c90((nvr) obj2, this.k, continuation, 4), 3);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d90(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = obj;
    }
}
