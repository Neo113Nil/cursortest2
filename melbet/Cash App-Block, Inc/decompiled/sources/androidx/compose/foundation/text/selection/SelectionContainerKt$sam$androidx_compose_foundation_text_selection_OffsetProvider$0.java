package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 implements OffsetProvider, FunctionAdapter {
    public final /* synthetic */ Function0 function;

    public SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(Function0 function0) {
        this.function = function0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OffsetProvider) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo345provideF1C5BW0() {
        return ((Offset) this.function.invoke()).packedValue;
    }
}
