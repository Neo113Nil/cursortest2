package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class a22 extends aur implements pyc {
    public int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ int l;
    public final /* synthetic */ b22 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a22(b22 b22Var, Continuation continuation) {
        super(3, continuation);
        this.m = b22Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        a22 a22Var = new a22(this.m, (Continuation) obj3);
        a22Var.k = booleanValue;
        a22Var.l = intValue;
        return a22Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2 = this.k;
        int i = this.l;
        nm6 nm6Var = nm6.a;
        int i2 = this.j;
        b22 b22Var = this.m;
        if (i2 == 0) {
            qgg.h0(obj);
            if (i > 0) {
                c22 c22Var = b22Var.f;
                this.k = z2;
                this.l = i;
                this.j = 1;
                obj = ((f22) c22Var).a(this);
                if (obj == nm6Var) {
                    return nm6Var;
                }
            }
            z = false;
            v3w.n(z || !z2, b22Var.i, null);
            if (z && !b22Var.k) {
                b22Var.k = true;
                rmb.h(b22Var.g, 1, 2);
            }
            return new d73(b22Var.d);
        }
        if (i2 != 1) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        if (((Boolean) obj).booleanValue()) {
            z = true;
            v3w.n(z || !z2, b22Var.i, null);
            if (z) {
                b22Var.k = true;
                rmb.h(b22Var.g, 1, 2);
            }
            return new d73(b22Var.d);
        }
        z = false;
        v3w.n(z || !z2, b22Var.i, null);
        if (z) {
        }
        return new d73(b22Var.d);
    }
}
