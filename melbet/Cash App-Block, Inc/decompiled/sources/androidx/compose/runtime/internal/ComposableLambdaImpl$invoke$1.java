package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class ComposableLambdaImpl$invoke$1 extends AdaptedFunctionReference implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        ((ComposableLambdaImpl) this.receiver).invoke((Composer) obj, intValue);
        return Unit.INSTANCE;
    }
}
