package androidx.compose.ui.modifier;

import androidx.core.os.BundleKt;
import coil3.Extras;

/* loaded from: classes.dex */
public final class EmptyMap extends BundleKt {
    public static final EmptyMap INSTANCE = new EmptyMap();

    @Override // androidx.core.os.BundleKt
    public final boolean contains$ui(Extras.Key key) {
        return false;
    }

    @Override // androidx.core.os.BundleKt
    public final Object get$ui(Extras.Key key) {
        throw new IllegalStateException("");
    }
}
