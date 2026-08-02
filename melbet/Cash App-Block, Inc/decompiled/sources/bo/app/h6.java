package bo.app;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class h6 extends ContinuationImpl {
    public CoroutineScope a;
    public ReceiveChannel b;
    public Function1 c;
    public Ref$ObjectRef d;
    public Ref$ObjectRef e;
    public /* synthetic */ Object f;
    public final /* synthetic */ o6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(o6 o6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = o6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= PKIFailureInfo.systemUnavail;
        return this.g.a(null, null, null, this);
    }
}
