package app.cash.zipline.loader;

import app.cash.zipline.EventListener;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.loader.internal.fetcher.LoadedManifest;
import coil3.RealImageLoader$execute$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.serialization.modules.SerializersModule;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ZiplineLoader$loadFromNetwork$1 extends ContinuationImpl {
    public long J$0;
    public ProducerScope L$0;
    public ZiplineManifest L$1;
    public String L$2;
    public String L$3;
    public SerializersModule L$4;
    public RealImageLoader$execute$2 L$5;
    public EventListener L$6;
    public Object L$7;
    public LoadedManifest L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ZiplineLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$loadFromNetwork$1(ZiplineLoader ziplineLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ziplineLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ZiplineLoader.access$loadFromNetwork(this.this$0, null, null, 0L, null, null, null, null, this);
    }
}
