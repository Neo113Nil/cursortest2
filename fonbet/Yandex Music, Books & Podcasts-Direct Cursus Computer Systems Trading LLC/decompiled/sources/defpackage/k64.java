package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k64 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ m64 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k64(m64 m64Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = m64Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new k64(this.k, continuation, 0);
            case 1:
                return new k64(this.k, continuation, 1);
            case 2:
                return new k64(this.k, continuation, 2);
            case 3:
                return new k64(this.k, continuation, 3);
            case 4:
                return new k64(this.k, continuation, 4);
            default:
                return new k64(this.k, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((k64) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        m64 m64Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                xun xunVar = m64Var.e;
                xunVar.getClass();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                xun xunVar2 = m64Var.e;
                if (xunVar2 != null) {
                    y1g.B("Must be called from the main thread.");
                    if (xunVar2.y()) {
                        xun.z(new z0x(xunVar2, 3));
                    } else {
                        xun.t();
                    }
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                xun xunVar3 = m64Var.e;
                if (xunVar3 != null) {
                    y1g.B("Must be called from the main thread.");
                    if (xunVar3.y()) {
                        xun.z(new z0x(xunVar3, 5));
                    } else {
                        xun.t();
                    }
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                xun xunVar4 = m64Var.e;
                if (xunVar4 != null) {
                    y1g.B("Must be called from the main thread.");
                    if (xunVar4.y()) {
                        xun.z(new z0x(xunVar4, 4));
                    } else {
                        xun.t();
                    }
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                m64Var.b.b();
                break;
            default:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                xun xunVar5 = m64Var.e;
                if (xunVar5 != null) {
                    double d = m64Var.i;
                    y1g.B("Must be called from the main thread.");
                    if (xunVar5.y()) {
                        xun.z(new t2x(xunVar5, d));
                    } else {
                        xun.t();
                    }
                }
                break;
        }
        return Unit.a;
    }
}
