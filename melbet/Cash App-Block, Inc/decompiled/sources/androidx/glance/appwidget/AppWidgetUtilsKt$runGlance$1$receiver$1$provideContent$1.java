package androidx.glance.appwidget;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 extends ContinuationImpl {
    public Function2 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppWidgetUtilsKt$runGlance$1$receiver$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(AppWidgetUtilsKt$runGlance$1$receiver$1 appWidgetUtilsKt$runGlance$1$receiver$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = appWidgetUtilsKt$runGlance$1$receiver$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.provideContent(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
