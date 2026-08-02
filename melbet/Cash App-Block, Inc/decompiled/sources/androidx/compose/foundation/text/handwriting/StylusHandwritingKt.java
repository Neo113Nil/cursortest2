package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class StylusHandwritingKt {
    public static final DpTouchBoundsExpansion HandwritingBoundsExpansion = new DpTouchBoundsExpansion();

    public static final Modifier stylusHandwriting(Modifier modifier, boolean z, boolean z2, Function0 function0) {
        if (!z || !StylusHandwriting_androidKt.isStylusHandwritingSupported) {
            return modifier;
        }
        if (z2) {
            modifier = modifier.then(new StylusHoverIconModifierElement(HandwritingBoundsExpansion));
        }
        return modifier.then(new StylusHandwritingElement(function0));
    }
}
