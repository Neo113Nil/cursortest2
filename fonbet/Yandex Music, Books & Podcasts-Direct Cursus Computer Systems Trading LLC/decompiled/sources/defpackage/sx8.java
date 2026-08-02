package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class sx8 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ ux8 k;
    public final /* synthetic */ gc8 l;
    public final /* synthetic */ xzb m;
    public final /* synthetic */ View n;
    public final /* synthetic */ dp8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx8(Continuation continuation, ux8 ux8Var, gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var, int i) {
        super(2, continuation);
        this.j = i;
        this.k = ux8Var;
        this.l = gc8Var;
        this.m = xzbVar;
        this.n = view;
        this.o = dp8Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new sx8(continuation, this.k, this.l, this.m, this.n, this.o, 0);
            default:
                return new sx8(continuation, this.k, this.l, this.m, this.n, this.o, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((sx8) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        dp8 dp8Var = this.o;
        View view = this.n;
        xzb xzbVar = this.m;
        gc8 gc8Var = this.l;
        ux8 ux8Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ux8Var.b(gc8Var, xzbVar, view, dp8Var);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ux8Var.e(gc8Var, xzbVar, view, dp8Var);
                break;
        }
        return Unit.a;
    }
}
