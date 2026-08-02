package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e84 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ h84 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e84(h84 h84Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = h84Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new e84(this.k, continuation, 0);
            case 1:
                return new e84(this.k, continuation, 1);
            case 2:
                return new e84(this.k, continuation, 2);
            case 3:
                return new e84(this.k, continuation, 3);
            case 4:
                return new e84(this.k, continuation, 4);
            default:
                return new e84(this.k, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((e84) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        int i2 = 1;
        int i3 = 2;
        Continuation continuation = null;
        h84 h84Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return new Long(h84Var.A());
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return new h4q(h84Var.e.i);
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, null, "pause", null);
                m64 m64Var = h84Var.e;
                if (m64Var.e != null) {
                    x97.y(cmd.a, dm6.b(), null, new k64(m64Var, continuation, i2), 2);
                    h84Var.B(h84Var.f, false);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, null, "play", null);
                m64 m64Var2 = h84Var.e;
                if (m64Var2.e != null) {
                    x97.y(m64Var2.a, null, null, new k64(m64Var2, continuation, i3), 3);
                    h84Var.B(h84Var.f, true);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                m64 m64Var3 = h84Var.e;
                return new Long(m64Var3.e == null ? 0L : m64Var3.h);
            default:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, null, "stop", null);
                rar rarVar = h84Var.c;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                h84Var.g = h1b.e;
                return Unit.a;
        }
    }
}
