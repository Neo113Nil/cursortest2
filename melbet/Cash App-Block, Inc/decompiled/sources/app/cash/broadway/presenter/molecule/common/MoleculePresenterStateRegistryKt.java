package app.cash.broadway.presenter.molecule.common;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.io.Serializable;
import kotlin.Function;

/* loaded from: classes3.dex */
public abstract class MoleculePresenterStateRegistryKt {
    public static final Class[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == NeverEqualPolicy.INSTANCE || snapshotMutableState.getPolicy() == NeverEqualPolicy.INSTANCE$3 || snapshotMutableState.getPolicy() == NeverEqualPolicy.INSTANCE$1) {
                Object value = snapshotMutableState.getValue();
                if (value == null) {
                    return true;
                }
                return canBeSavedToBundle(value);
            }
        } else if (!(obj instanceof Function) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (AcceptableClasses[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
