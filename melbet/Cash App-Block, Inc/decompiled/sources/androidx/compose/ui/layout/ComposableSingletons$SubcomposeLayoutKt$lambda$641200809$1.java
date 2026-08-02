package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ComposableSingletons$SubcomposeLayoutKt$lambda$641200809$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$SubcomposeLayoutKt$lambda$641200809$1 INSTANCE = new ComposableSingletons$SubcomposeLayoutKt$lambda$641200809$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int intValue = ((Number) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
