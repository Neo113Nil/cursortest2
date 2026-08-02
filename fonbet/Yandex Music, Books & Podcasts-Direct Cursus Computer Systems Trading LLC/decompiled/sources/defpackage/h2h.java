package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h2h extends aur implements ryc {
    public /* synthetic */ mqs j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public final /* synthetic */ yk3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2h(yk3 yk3Var, Continuation continuation) {
        super(4, continuation);
        this.m = yk3Var;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        h2h h2hVar = new h2h(this.m, (Continuation) obj4);
        h2hVar.j = (mqs) obj;
        h2hVar.k = booleanValue;
        h2hVar.l = booleanValue2;
        return h2hVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (((r6 != null ? r6.b : null) instanceof defpackage.e2h) != false) goto L18;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        mqs mqsVar;
        xdr xdrVar = (xdr) this.m.e;
        mqs mqsVar2 = this.j;
        boolean z2 = this.k;
        boolean z3 = this.l;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        if (z2 && z3) {
            String str = mqsVar2.a;
            o3h o3hVar = (o3h) xdrVar.getValue();
            if (Intrinsics.d(str, (o3hVar == null || (mqsVar = o3hVar.a) == null) ? null : mqsVar.a)) {
                o3h o3hVar2 = (o3h) xdrVar.getValue();
            }
            z = true;
            return new Pair(mqsVar2, Boolean.valueOf(z));
        }
        z = false;
        return new Pair(mqsVar2, Boolean.valueOf(z));
    }
}
