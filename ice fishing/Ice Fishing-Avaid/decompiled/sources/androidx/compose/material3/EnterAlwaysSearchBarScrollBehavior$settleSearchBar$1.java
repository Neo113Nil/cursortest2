package androidx.compose.material3;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior", f = "SearchBar.kt", i = {0, 0, 1}, l = {1595, 1609}, m = "settleSearchBar-OhffZ5M", n = {"remainingVelocity", "scrollFraction", "remainingVelocity"}, s = {"L$0", "F$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EnterAlwaysSearchBarScrollBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, Continuation<? super EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1> continuation) {
        super(continuation);
        this.this$0 = enterAlwaysSearchBarScrollBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m3084settleSearchBarOhffZ5M;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m3084settleSearchBarOhffZ5M = this.this$0.m3084settleSearchBarOhffZ5M(0.0f, this);
        return m3084settleSearchBarOhffZ5M;
    }
}
