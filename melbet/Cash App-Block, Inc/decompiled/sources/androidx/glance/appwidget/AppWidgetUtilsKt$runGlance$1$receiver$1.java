package androidx.glance.appwidget;

import androidx.compose.animation.BoundsAnimation$animate$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AppWidgetUtilsKt$runGlance$1$receiver$1 implements ContentReceiver {
    public final /* synthetic */ ProducerScope $$this$channelFlow;
    public final /* synthetic */ AtomicReference $contentCoroutine;

    public AppWidgetUtilsKt$runGlance$1$receiver$1(AtomicReference atomicReference, ProducerScope producerScope) {
        this.$contentCoroutine = atomicReference;
        this.$$this$channelFlow = producerScope;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void provideContent(Function2 function2, ContinuationImpl continuationImpl) {
        AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1;
        int i;
        if (continuationImpl instanceof AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1) {
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = (AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1) continuationImpl;
            int i2 = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.L$0 = function2;
                    appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1));
                    cancellableContinuationImpl.initCancellability();
                    ProducerScope producerScope = this.$$this$channelFlow;
                    cancellableContinuationImpl.invokeOnCancellation(new BoundsAnimation$animate$1(producerScope, 21));
                    CancellableContinuation cancellableContinuation = (CancellableContinuation) this.$contentCoroutine.getAndSet(cancellableContinuationImpl);
                    if (cancellableContinuation != null) {
                        cancellableContinuation.cancel(null);
                    }
                    ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU(function2);
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(this, continuationImpl);
        Object obj2 = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }
}
