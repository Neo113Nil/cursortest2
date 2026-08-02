package app.cash.zipline.loader.internal.fetcher;

import app.cash.zipline.EventListener;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FsCachingFetcher$fetch$2$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $applicationName;
    public final /* synthetic */ String $baseUrl;
    public final /* synthetic */ Ref$BooleanRef $downloadCalled;
    public final /* synthetic */ EventListener $eventListener;
    public final /* synthetic */ String $id;
    public final /* synthetic */ long $nowEpochMs;
    public final /* synthetic */ ByteString $sha256;
    public final /* synthetic */ String $url;
    public int label;
    public final /* synthetic */ FsCachingFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FsCachingFetcher$fetch$2$result$1(Ref$BooleanRef ref$BooleanRef, FsCachingFetcher fsCachingFetcher, String str, EventListener eventListener, String str2, ByteString byteString, long j, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.$downloadCalled = ref$BooleanRef;
        this.this$0 = fsCachingFetcher;
        this.$applicationName = str;
        this.$eventListener = eventListener;
        this.$id = str2;
        this.$sha256 = byteString;
        this.$nowEpochMs = j;
        this.$baseUrl = str3;
        this.$url = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FsCachingFetcher$fetch$2$result$1(this.$downloadCalled, this.this$0, this.$applicationName, this.$eventListener, this.$id, this.$sha256, this.$nowEpochMs, this.$baseUrl, this.$url, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((FsCachingFetcher$fetch$2$result$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        this.$downloadCalled.element = true;
        Fetcher fetcher = this.this$0.delegate;
        this.label = 1;
        Object fetch = fetcher.fetch(this.$applicationName, this.$eventListener, this.$id, this.$sha256, this.$nowEpochMs, this.$baseUrl, this.$url, this);
        return fetch == coroutineSingletons ? coroutineSingletons : fetch;
    }
}
