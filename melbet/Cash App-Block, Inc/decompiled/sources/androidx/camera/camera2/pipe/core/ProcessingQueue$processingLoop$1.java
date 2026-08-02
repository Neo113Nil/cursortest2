package androidx.camera.camera2.pipe.core;

import com.nimbusds.jose.JWECryptoParts;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ProcessingQueue$processingLoop$1 extends ContinuationImpl {
    public int I$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ JWECryptoParts this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessingQueue$processingLoop$1(JWECryptoParts jWECryptoParts, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jWECryptoParts;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        JWECryptoParts.access$processingLoop(this.this$0, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
