package androidx.compose.animation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class SharedTransitionScope$skipToLookaheadSize$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SharedTransitionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedTransitionScope$skipToLookaheadSize$1(SharedTransitionScope sharedTransitionScope, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = sharedTransitionScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SharedTransitionScope sharedTransitionScope = this.this$0;
        switch (i) {
        }
        return Boolean.valueOf(sharedTransitionScope.isTransitionActive());
    }
}
