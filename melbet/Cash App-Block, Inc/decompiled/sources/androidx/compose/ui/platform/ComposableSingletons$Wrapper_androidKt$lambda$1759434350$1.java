package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* renamed from: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda$-1759434350$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$Wrapper_androidKt$lambda$1759434350$1 extends Lambda implements Function2 {
    public static final ComposableSingletons$Wrapper_androidKt$lambda$1759434350$1 INSTANCE = new ComposableSingletons$Wrapper_androidKt$lambda$1759434350$1(2);

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
