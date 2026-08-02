package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f$0;

    public /* synthetic */ LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda0(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i) {
        this.$r8$classId = i;
        this.f$0 = lazyLayoutSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.f$0;
        switch (i) {
            case 0:
                LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutSemanticsModifierNode.itemProviderLambda.invoke();
                int itemCount = lazyLayoutItemProvider.getItemCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= itemCount) {
                        i2 = -1;
                    } else if (!lazyLayoutItemProvider.getKey(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                LazyLayoutItemProvider lazyLayoutItemProvider2 = (LazyLayoutItemProvider) lazyLayoutSemanticsModifierNode.itemProviderLambda.invoke();
                if (intValue < 0 || intValue >= lazyLayoutItemProvider2.getItemCount()) {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    m2m.append(lazyLayoutItemProvider2.getItemCount());
                    m2m.append(')');
                    InlineClassHelperKt.throwIllegalArgumentException(m2m.toString());
                }
                JobKt.launch$default(lazyLayoutSemanticsModifierNode.getCoroutineScope(), null, null, new RingtoneView$playRingtone$1(lazyLayoutSemanticsModifierNode, intValue, (Continuation) null, 3), 3);
                return Boolean.TRUE;
        }
    }
}
