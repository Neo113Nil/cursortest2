package com.airbnb.lottie.compose;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt$loadImagesFromAssets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $imageAssetsFolder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadImagesFromAssets$2(LottieComposition lottieComposition, Context context, String str, Continuation<? super RememberLottieCompositionKt$loadImagesFromAssets$2> continuation) {
        super(2, continuation);
        this.$composition = lottieComposition;
        this.$context = context;
        this.$imageAssetsFolder = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RememberLottieCompositionKt$loadImagesFromAssets$2(this.$composition, this.$context, this.$imageAssetsFolder, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RememberLottieCompositionKt$loadImagesFromAssets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        for (LottieImageAsset lottieImageAsset : this.$composition.getImages().values()) {
            lottieImageAsset.getClass();
            RememberLottieCompositionKt.maybeDecodeBase64Image(lottieImageAsset);
            RememberLottieCompositionKt.maybeLoadImageFromAsset(this.$context, lottieImageAsset, this.$imageAssetsFolder);
        }
        return Unit.INSTANCE;
    }
}
