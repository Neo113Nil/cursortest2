package app.cash.zipline.loader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ZiplineCache$getOrPut$1 extends ContinuationImpl {
    public long J$0;
    public String L$0;
    public ByteString L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ZiplineCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineCache$getOrPut$1(ZiplineCache ziplineCache, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ziplineCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getOrPut$zipline_loader_release(null, null, 0L, null, this);
    }
}
