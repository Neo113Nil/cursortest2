package app.cash.zipline.loader;

import app.cash.zipline.EventListener;
import app.cash.zipline.Zipline;
import app.cash.zipline.loader.internal.fetcher.LoadedManifest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ZiplineLoader$loadFromManifest$1 extends ContinuationImpl {
    public long J$0;
    public String L$0;
    public EventListener L$1;
    public LoadedManifest L$2;
    public Function2 L$4;
    public Zipline L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ZiplineLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$loadFromManifest$1(ZiplineLoader ziplineLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ziplineLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.loadFromManifest$zipline_loader_release(null, null, null, null, 0L, null, this);
    }
}
