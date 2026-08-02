package androidx.paging;

import androidx.compose.material3.SliderState$drag$2;
import com.nimbusds.jose.JWECryptoParts;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SubscribedSharedFlow;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class MulticastedPagingData {
    public final JWECryptoParts accumulated;
    public final PagingData parent;

    public MulticastedPagingData(CoroutineScope coroutineScope, PagingData pagingData) {
        coroutineScope.getClass();
        pagingData.getClass();
        this.parent = pagingData;
        Flow flow = pagingData.flow;
        flow.getClass();
        coroutineScope.getClass();
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.header = new HuffmanTreeGroup(11);
        SharedFlowImpl MutableSharedFlow = FlowKt.MutableSharedFlow(1, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        jWECryptoParts.encryptedKey = MutableSharedFlow;
        Continuation continuation = null;
        jWECryptoParts.iv = new SubscribedSharedFlow(MutableSharedFlow, new SliderState$drag$2(jWECryptoParts, continuation, 7));
        StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope, null, CoroutineStart.LAZY, new PageFetcher$flow$1(flow, jWECryptoParts, continuation, 24), 1);
        launch$default.invokeOnCompletion(new CachedPageEventFlow$$ExternalSyntheticLambda0(jWECryptoParts, 0));
        jWECryptoParts.cipherText = launch$default;
        jWECryptoParts.authenticationTag = new SafeFlow(new PageFetcher$flow$1(jWECryptoParts, continuation, 23));
        this.accumulated = jWECryptoParts;
    }
}
