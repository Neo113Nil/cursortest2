package androidx.compose.material3.internal;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 implements FunctionAdapter {
    public final /* synthetic */ LockFreeLinkedListNode$toString$1 function;

    public TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(LockFreeLinkedListNode$toString$1 lockFreeLinkedListNode$toString$1) {
        this.function = lockFreeLinkedListNode$toString$1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0) {
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

    public final float invoke() {
        return ((Number) this.function.get()).floatValue();
    }
}
