package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class xfd extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ zfd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfd(zfd zfdVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = zfdVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new xfd(this.k, continuation, 0);
            case 1:
                return new xfd(this.k, continuation, 1);
            case 2:
                return new xfd(this.k, continuation, 2);
            case 3:
                return new xfd(this.k, continuation, 3);
            default:
                return new xfd(this.k, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((xfd) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        zfd zfdVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return new Long(zfdVar.y());
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, "GlagolCastPlayer", "action: pause", null);
                x97.y(zfdVar.c, null, null, new yfd(zfdVar, null, 0), 3);
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, "GlagolCastPlayer", "action: play", null);
                x97.y(zfdVar.c, null, null, new yfd(zfdVar, null, 1), 3);
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return new Long(zfdVar.A());
            default:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, "GlagolCastPlayer", "action: stop", null);
                zfdVar.e = h1b.e;
                zfd.z(zfdVar, null, tnl.a, false, 1);
                return Unit.a;
        }
    }
}
