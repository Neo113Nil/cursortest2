package app.cash.zipline.loader;

import app.cash.zipline.loader.ZiplineLoader;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ZiplineLoader$ModuleJob$run$1 extends ContinuationImpl {
    public ByteString L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ZiplineLoader.ModuleJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$ModuleJob$run$1(ZiplineLoader.ModuleJob moduleJob, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = moduleJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.run(this);
    }
}
