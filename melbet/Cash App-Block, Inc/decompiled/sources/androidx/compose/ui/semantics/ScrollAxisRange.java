package androidx.compose.ui.semantics;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ScrollAxisRange {
    public final Function0 maxValue;
    public final Function0 value;

    public ScrollAxisRange(Function0 function0, Function0 function02) {
        this.value = function0;
        this.maxValue = function02;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.value.invoke()).floatValue() + ", maxValue=" + ((Number) this.maxValue.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
