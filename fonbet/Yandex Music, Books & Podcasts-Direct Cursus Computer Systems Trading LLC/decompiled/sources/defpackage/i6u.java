package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class i6u extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ y8u k;
    public final /* synthetic */ m4u l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6u(y8u y8uVar, m4u m4uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = y8uVar;
        this.l = m4uVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new i6u(this.k, this.l, continuation, 0);
            default:
                return new i6u(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((i6u) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        m4u m4uVar = this.l;
        y8u y8uVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                y8uVar.n(m4uVar.a.b);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                y8uVar.n(m4uVar.a.b);
                break;
        }
        return Unit.a;
    }
}
