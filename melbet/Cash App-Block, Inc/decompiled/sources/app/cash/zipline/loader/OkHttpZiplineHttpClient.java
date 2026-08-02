package app.cash.zipline.loader;

import app.cash.zipline.CallResult;
import app.cash.zipline.loader.internal.fetcher.HttpFetcher$fetchByteString$1;
import coil3.RealImageLoader$execute$2;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes3.dex */
public final class OkHttpZiplineHttpClient extends ZiplineHttpClient {
    public final OkHttpClient okHttpClient;

    public OkHttpZiplineHttpClient(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.okHttpClient = okHttpClient;
    }

    @Override // app.cash.zipline.loader.ZiplineHttpClient
    public final Object download(String str, List list, HttpFetcher$fetchByteString$1 httpFetcher$fetchByteString$1) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(httpFetcher$fetchByteString$1));
        cancellableContinuationImpl.initCancellability();
        Request.Builder builder = new Request.Builder();
        builder.url(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            builder.addHeader((String) pair.first, (String) pair.second);
        }
        Request request = new Request(builder);
        OkHttpClient okHttpClient = this.okHttpClient;
        okHttpClient.getClass();
        RealCall realCall = new RealCall(okHttpClient, request, false);
        cancellableContinuationImpl.invokeOnCancellation(new OkHttpZiplineHttpClient$download$2$1(realCall, 0));
        realCall.enqueue(new CallResult(cancellableContinuationImpl, str));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    @Override // app.cash.zipline.loader.ZiplineHttpClient
    public final Object openDevelopmentServerWebSocket(String str, List list, FastCodeUpdatesKt$withDevelopmentServerPush$1 fastCodeUpdatesKt$withDevelopmentServerPush$1) {
        Request.Builder builder = new Request.Builder();
        builder.url(str);
        return FlowKt.callbackFlow(new RealImageLoader$execute$2(this, new Request(builder), (Continuation) null, 21));
    }
}
