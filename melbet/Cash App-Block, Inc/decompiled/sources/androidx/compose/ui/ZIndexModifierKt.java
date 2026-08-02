package androidx.compose.ui;

import androidx.compose.ui.BiasAbsoluteAlignment;

/* loaded from: classes3.dex */
public abstract class ZIndexModifierKt {
    public static final BiasAbsoluteAlignment TopLeft = new BiasAbsoluteAlignment(-1.0f);
    public static final BiasAbsoluteAlignment TopRight = new BiasAbsoluteAlignment(1.0f);
    public static final BiasAbsoluteAlignment.Horizontal Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);
    public static final BiasAbsoluteAlignment.Horizontal Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    public static final Modifier zIndex(Modifier modifier, float f) {
        return modifier.then(new ZIndexElement(f));
    }
}
