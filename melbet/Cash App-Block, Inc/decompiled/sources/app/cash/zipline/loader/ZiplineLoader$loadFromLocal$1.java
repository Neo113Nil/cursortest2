package app.cash.zipline.loader;

import app.cash.zipline.EventListener;
import app.cash.zipline.loader.internal.fetcher.LoadedManifest;
import coil3.RealImageLoader$execute$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.serialization.modules.SerializersModule;
import okhttp3.internal.connection.RealConnectionPool;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ZiplineLoader$loadFromLocal$1 extends ContinuationImpl {
    public long J$0;
    public ProducerScope L$0;
    public String L$1;
    public RealConnectionPool L$2;
    public SerializersModule L$3;
    public RealImageLoader$execute$2 L$4;
    public EventListener L$5;
    public LoadedManifest L$6;
    public Object L$7;
    public Exception L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ZiplineLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$loadFromLocal$1(ZiplineLoader ziplineLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ziplineLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ZiplineLoader.access$loadFromLocal(this.this$0, null, 0L, null, null, null, null, this);
    }
}
