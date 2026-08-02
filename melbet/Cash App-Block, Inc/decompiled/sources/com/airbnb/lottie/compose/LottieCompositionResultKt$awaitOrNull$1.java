package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieCompositionResultKt", f = "LottieCompositionResult.kt", l = {85}, m = "awaitOrNull")
/* loaded from: classes3.dex */
public final class LottieCompositionResultKt$awaitOrNull$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public LottieCompositionResultKt$awaitOrNull$1(Continuation<? super LottieCompositionResultKt$awaitOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LottieCompositionResultKt.awaitOrNull(null, this);
    }
}
