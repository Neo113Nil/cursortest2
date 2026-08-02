package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class j8v extends aur implements xyc {
    public final /* synthetic */ m8v j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8v(m8v m8vVar, Continuation continuation) {
        super(9, continuation);
        this.j = m8vVar;
    }

    @Override // defpackage.xyc
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        ((Boolean) obj3).getClass();
        ((Boolean) obj4).getClass();
        ((Boolean) obj6).getClass();
        ((Boolean) obj7).getClass();
        ((Boolean) obj8).getClass();
        return new j8v(this.j, (Continuation) obj9).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return m8v.a(this.j);
    }
}
