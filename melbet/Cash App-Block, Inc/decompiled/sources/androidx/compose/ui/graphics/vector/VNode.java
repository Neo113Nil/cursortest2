package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import curtains.WindowsKt$onNextDraw$1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class VNode {
    public Function1 invalidateListener;

    public abstract void draw(DrawScope drawScope);

    public Function1 getInvalidateListener$ui() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        Function1 invalidateListener$ui = getInvalidateListener$ui();
        if (invalidateListener$ui != null) {
            invalidateListener$ui.invoke(this);
        }
    }

    public void setInvalidateListener$ui(WindowsKt$onNextDraw$1 windowsKt$onNextDraw$1) {
        this.invalidateListener = windowsKt$onNextDraw$1;
    }
}
