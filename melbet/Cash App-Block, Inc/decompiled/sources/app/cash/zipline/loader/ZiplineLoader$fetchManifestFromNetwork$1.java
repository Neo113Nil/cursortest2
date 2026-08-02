package app.cash.zipline.loader;

import app.cash.zipline.EventListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Semaphore;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ZiplineLoader$fetchManifestFromNetwork$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public EventListener L$1;
    public String L$2;
    public Semaphore L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ZiplineLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$fetchManifestFromNetwork$1(ZiplineLoader ziplineLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ziplineLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchManifestFromNetwork(null, null, null, this);
    }
}
