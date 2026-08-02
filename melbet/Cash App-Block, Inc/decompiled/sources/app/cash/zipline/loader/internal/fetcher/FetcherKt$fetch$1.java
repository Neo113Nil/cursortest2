package app.cash.zipline.loader.internal.fetcher;

import app.cash.zipline.EventListener;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Semaphore;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FetcherKt$fetch$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public long J$0;
    public List L$0;
    public Iterator L$10;
    public String L$2;
    public EventListener L$3;
    public String L$4;
    public ByteString L$5;
    public String L$6;
    public String L$7;
    public Semaphore L$8;
    public Exception L$9;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FetcherKt.fetch(null, null, null, null, null, null, 0L, null, null, this);
    }
}
