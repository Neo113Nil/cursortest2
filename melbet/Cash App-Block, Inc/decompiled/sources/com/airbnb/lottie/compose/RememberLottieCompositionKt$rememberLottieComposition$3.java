package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {93, 95}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt$rememberLottieComposition$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    final /* synthetic */ String $imageAssetsFolder;
    final /* synthetic */ Function3 $onRetry;
    final /* synthetic */ MutableState $result$delegate;
    final /* synthetic */ LottieCompositionSpec $spec;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$rememberLottieComposition$3(Function3 function3, Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, MutableState mutableState, Continuation<? super RememberLottieCompositionKt$rememberLottieComposition$3> continuation) {
        super(2, continuation);
        this.$onRetry = function3;
        this.$context = context;
        this.$spec = lottieCompositionSpec;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RememberLottieCompositionKt$rememberLottieComposition$3(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RememberLottieCompositionKt$rememberLottieComposition$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:16)|22|23|24|25|26|27|(7:29|9|10|11|12|13|(0))|20) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (((java.lang.Boolean) r13).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        r11 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008d -> B:9:0x0090). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        RememberLottieCompositionKt$rememberLottieComposition$3 rememberLottieCompositionKt$rememberLottieComposition$3;
        LottieCompositionResultImpl rememberLottieComposition$lambda$1;
        LottieCompositionResultImpl rememberLottieComposition$lambda$12;
        int i2;
        RememberLottieCompositionKt$rememberLottieComposition$3 rememberLottieCompositionKt$rememberLottieComposition$32;
        String ensureTrailingSlash;
        String ensureTrailingSlash2;
        String ensureLeadingPeriod;
        LottieCompositionResultImpl rememberLottieComposition$lambda$13;
        LottieCompositionResultImpl rememberLottieComposition$lambda$14;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        Throwable th = null;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            i = 0;
            rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
            if (!rememberLottieComposition$lambda$13.isSuccess()) {
            }
            rememberLottieCompositionKt$rememberLottieComposition$3 = this;
            rememberLottieComposition$lambda$1 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
            if (!rememberLottieComposition$lambda$1.isComplete()) {
                rememberLottieComposition$lambda$12 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                rememberLottieComposition$lambda$12.completeExceptionally$lottie_compose_release(th);
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = this.I$0;
            Throwable th2 = (Throwable) this.L$0;
            try {
                SafeTrace.throwOnFailure(obj);
                rememberLottieCompositionKt$rememberLottieComposition$32 = this;
            } catch (Throwable th3) {
                th = th3;
                rememberLottieCompositionKt$rememberLottieComposition$32 = this;
                i = i4 + 1;
            }
            try {
            } catch (Throwable th4) {
                Throwable th5 = th4;
                i2 = i4;
                th = th5;
                i = i2 + 1;
                this = rememberLottieCompositionKt$rememberLottieComposition$32;
                rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
                if (!rememberLottieComposition$lambda$13.isSuccess()) {
                }
                rememberLottieCompositionKt$rememberLottieComposition$3 = this;
                rememberLottieComposition$lambda$1 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                if (!rememberLottieComposition$lambda$1.isComplete()) {
                }
                return Unit.INSTANCE;
            }
            rememberLottieComposition$lambda$14 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$32.$result$delegate);
            rememberLottieComposition$lambda$14.complete$lottie_compose_release((LottieComposition) obj);
            int i5 = i4;
            th = th2;
            i = i5;
            this = rememberLottieCompositionKt$rememberLottieComposition$32;
            rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
            if (!rememberLottieComposition$lambda$13.isSuccess()) {
                if (i != 0) {
                    Function3 function3 = this.$onRetry;
                    Integer num = new Integer(i);
                    th.getClass();
                    this.L$0 = th;
                    this.I$0 = i;
                    this.label = 1;
                    obj = function3.invoke(num, th, this);
                }
                i2 = i;
                Context context = this.$context;
                LottieCompositionSpec lottieCompositionSpec = this.$spec;
                ensureTrailingSlash = RememberLottieCompositionKt.ensureTrailingSlash(this.$imageAssetsFolder);
                ensureTrailingSlash2 = RememberLottieCompositionKt.ensureTrailingSlash(this.$fontAssetsFolder);
                ensureLeadingPeriod = RememberLottieCompositionKt.ensureLeadingPeriod(this.$fontFileExtension);
                String str = this.$cacheKey;
                this.L$0 = th;
                this.I$0 = i2;
                this.label = 2;
                rememberLottieCompositionKt$rememberLottieComposition$32 = this;
                Object lottieComposition = RememberLottieCompositionKt.lottieComposition(context, lottieCompositionSpec, ensureTrailingSlash, ensureTrailingSlash2, ensureLeadingPeriod, str, rememberLottieCompositionKt$rememberLottieComposition$32);
                if (lottieComposition != coroutineSingletons) {
                    th2 = th;
                    i4 = i2;
                    obj = lottieComposition;
                    rememberLottieComposition$lambda$14 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$32.$result$delegate);
                    rememberLottieComposition$lambda$14.complete$lottie_compose_release((LottieComposition) obj);
                    int i52 = i4;
                    th = th2;
                    i = i52;
                    this = rememberLottieCompositionKt$rememberLottieComposition$32;
                    rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
                    if (!rememberLottieComposition$lambda$13.isSuccess()) {
                    }
                }
                return coroutineSingletons;
            }
            rememberLottieCompositionKt$rememberLottieComposition$3 = this;
            rememberLottieComposition$lambda$1 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
            if (!rememberLottieComposition$lambda$1.isComplete() && th != null) {
                rememberLottieComposition$lambda$12 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                rememberLottieComposition$lambda$12.completeExceptionally$lottie_compose_release(th);
            }
            return Unit.INSTANCE;
        }
        i = this.I$0;
        th = (Throwable) this.L$0;
        SafeTrace.throwOnFailure(obj);
    }
}
