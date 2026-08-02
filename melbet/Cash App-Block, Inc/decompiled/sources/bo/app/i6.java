package bo.app;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class i6 extends ContinuationImpl {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(o6 o6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = o6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return this.d.a(this);
    }
}
