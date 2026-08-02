package app.cash.local.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealOrderBuilder$models$updateCart$1 extends ContinuationImpl {
    public RealOrderBuilder L$0;
    public MutableState L$1;
    public State L$4;
    public MutableState L$5;
    public MutableState L$6;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealOrderBuilder.access$models$updateCart(null, null, null, null, null, null, null, this);
    }
}
