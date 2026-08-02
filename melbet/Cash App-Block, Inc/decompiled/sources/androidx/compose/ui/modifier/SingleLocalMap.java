package androidx.compose.ui.modifier;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.core.os.BundleKt;
import coil3.Extras;

/* loaded from: classes3.dex */
public final class SingleLocalMap extends BundleKt {
    public final Extras.Key key;
    public final ParcelableSnapshotMutableState value$delegate = Updater.mutableStateOf$default(null);

    public SingleLocalMap(Extras.Key key) {
        this.key = key;
    }

    @Override // androidx.core.os.BundleKt
    public final boolean contains$ui(Extras.Key key) {
        return key == this.key;
    }

    @Override // androidx.core.os.BundleKt
    public final Object get$ui(Extras.Key key) {
        if (key != this.key) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        Object value = this.value$delegate.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
