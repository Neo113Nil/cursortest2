package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LookaheadScopeKt$LookaheadScope$2$2 extends Lambda implements Function2 {
    public static final LookaheadScopeKt$LookaheadScope$2$2 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((LookaheadScopeImpl) obj2).getClass();
        return Unit.INSTANCE;
    }
}
