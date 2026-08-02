package coil3.intercept;

import coil3.EventListener;
import coil3.intercept.EngineInterceptor;
import coil3.request.ImageRequest;
import coil3.request.Options;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class EngineInterceptorKt$transform$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public EngineInterceptor.ExecuteResult L$0;
    public ImageRequest L$1;
    public Options L$2;
    public EventListener L$3;
    public List L$4;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return EngineInterceptorKt.transform(null, null, null, null, this);
    }
}
