package app.cash.zipline.loader.internal.fetcher;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.zipline.EventListener;
import app.cash.zipline.loader.ZiplineCache;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FsCachingFetcher$fetch$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $applicationName;
    public final /* synthetic */ Object $baseUrl;
    public final /* synthetic */ Object $eventListener;
    public final /* synthetic */ Object $id;
    public final /* synthetic */ long $nowEpochMs;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $sha256;
    public final /* synthetic */ Object $url;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FsCachingFetcher$fetch$2(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Quat quat, MutableState mutableState4, Quat quat2, MutableState mutableState5, long j, MutableState mutableState6, Continuation continuation) {
        super(2, continuation);
        this.L$0 = mutableState;
        this.this$0 = mutableState2;
        this.$applicationName = mutableState3;
        this.$url = quat;
        this.$id = mutableState4;
        this.$baseUrl = quat2;
        this.$sha256 = mutableState5;
        this.$nowEpochMs = j;
        this.$eventListener = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$eventListener;
        Object obj3 = this.$sha256;
        Object obj4 = this.$baseUrl;
        Object obj5 = this.$id;
        Object obj6 = this.$url;
        Object obj7 = this.$applicationName;
        Object obj8 = this.this$0;
        switch (i) {
            case 0:
                return new FsCachingFetcher$fetch$2((FsCachingFetcher) obj8, (String) obj7, (ByteString) obj3, this.$nowEpochMs, (EventListener) obj2, (String) obj6, (String) obj5, (String) obj4, continuation);
            default:
                return new FsCachingFetcher$fetch$2((MutableState) this.L$0, (MutableState) obj8, (MutableState) obj7, (Quat) obj6, (MutableState) obj5, (Quat) obj4, (MutableState) obj3, this.$nowEpochMs, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FsCachingFetcher$fetch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        Object orPut$zipline_loader_release;
        int i = this.$r8$classId;
        Object obj2 = this.$sha256;
        Object obj3 = this.$baseUrl;
        Object obj4 = this.$id;
        Object obj5 = this.this$0;
        Object obj6 = this.$eventListener;
        Object obj7 = this.$url;
        Object obj8 = this.$applicationName;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ref$BooleanRef = new Ref$BooleanRef();
                    FsCachingFetcher fsCachingFetcher = (FsCachingFetcher) obj5;
                    ZiplineCache ziplineCache = fsCachingFetcher.cache;
                    String str = (String) obj8;
                    ByteString byteString = (ByteString) obj2;
                    long j = this.$nowEpochMs;
                    FsCachingFetcher$fetch$2$result$1 fsCachingFetcher$fetch$2$result$1 = new FsCachingFetcher$fetch$2$result$1(ref$BooleanRef, fsCachingFetcher, str, (EventListener) obj6, (String) obj4, byteString, j, (String) obj3, (String) obj7, null);
                    this.L$0 = ref$BooleanRef;
                    this.label = 1;
                    orPut$zipline_loader_release = ziplineCache.getOrPut$zipline_loader_release(str, byteString, j, fsCachingFetcher$fetch$2$result$1, this);
                    if (orPut$zipline_loader_release == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ref$BooleanRef = ref$BooleanRef2;
                    orPut$zipline_loader_release = obj;
                }
                ByteString byteString2 = (ByteString) orPut$zipline_loader_release;
                if (ref$BooleanRef.element) {
                    return byteString2;
                }
                byteString2.getSize$okio();
                ((EventListener) obj6).getClass();
                ((String) obj8).getClass();
                ((String) obj7).getClass();
                return byteString2;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(10, (MutableState) this.L$0)), 10);
                    Hero3DCardViewKt$InteractiveCard$9$1$3 hero3DCardViewKt$InteractiveCard$9$1$3 = new Hero3DCardViewKt$InteractiveCard$9$1$3((MutableState) obj5, (MutableState) obj8, (Quat) obj7, (MutableState) obj4, (Quat) obj3, (MutableState) obj2, this.$nowEpochMs, (MutableState) obj6, null, 0);
                    this.label = 1;
                    if (FlowKt.collectLatest(heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1, hero3DCardViewKt$InteractiveCard$9$1$3, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FsCachingFetcher$fetch$2(FsCachingFetcher fsCachingFetcher, String str, ByteString byteString, long j, EventListener eventListener, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fsCachingFetcher;
        this.$applicationName = str;
        this.$sha256 = byteString;
        this.$nowEpochMs = j;
        this.$eventListener = eventListener;
        this.$url = str2;
        this.$id = str3;
        this.$baseUrl = str4;
    }
}
