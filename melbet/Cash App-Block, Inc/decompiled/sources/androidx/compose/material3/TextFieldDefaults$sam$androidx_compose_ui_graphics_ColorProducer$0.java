package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 implements ColorProducer, FunctionAdapter {
    public final /* synthetic */ LockFreeLinkedListNode$toString$1 function;

    public TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(LockFreeLinkedListNode$toString$1 lockFreeLinkedListNode$toString$1) {
        this.function = lockFreeLinkedListNode$toString$1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ColorProducer) && (obj instanceof FunctionAdapter)) {
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

    @Override // androidx.compose.ui.graphics.ColorProducer
    /* renamed from: invoke-0d7_KjU */
    public final long mo501invoke0d7_KjU() {
        return ((Color) this.function.get()).value;
    }
}
