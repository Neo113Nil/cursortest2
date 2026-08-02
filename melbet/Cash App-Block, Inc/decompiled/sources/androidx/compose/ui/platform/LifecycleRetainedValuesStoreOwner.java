package androidx.compose.ui.platform;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.retain.ManagedRetainedValuesStore;
import androidx.lifecycle.ViewModel;
import coil3.Extras;

/* loaded from: classes.dex */
public final class LifecycleRetainedValuesStoreOwner extends ViewModel {
    public final MutableIntObjectMap scopes;

    public interface FrameEndScheduler {
    }

    public final class RetainedValuesStoreEntry {
        public final Extras.Key _retainedValuesStore;
        public CancellationHandle endRetainCancellationHandle;
        public boolean isInUse;
        public final Extras.Key retainedValuesStore;

        public RetainedValuesStoreEntry() {
            Extras.Key key = new Extras.Key(11);
            this._retainedValuesStore = key;
            this.retainedValuesStore = key;
        }
    }

    public LifecycleRetainedValuesStoreOwner() {
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
        this.scopes = new MutableIntObjectMap();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        MutableIntObjectMap mutableIntObjectMap = this.scopes;
        int[] iArr = mutableIntObjectMap.keys;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        MutableObjectList mutableObjectList = (MutableObjectList) objArr[i4];
                        Object[] objArr2 = mutableObjectList.content;
                        int i6 = mutableObjectList._size;
                        for (int i7 = 0; i7 < i6; i7++) {
                            RetainedValuesStoreEntry retainedValuesStoreEntry = (RetainedValuesStoreEntry) objArr2[i7];
                            CancellationHandle cancellationHandle = retainedValuesStoreEntry.endRetainCancellationHandle;
                            if (cancellationHandle != null) {
                                cancellationHandle.cancel();
                            }
                            retainedValuesStoreEntry.endRetainCancellationHandle = null;
                            ManagedRetainedValuesStore managedRetainedValuesStore = (ManagedRetainedValuesStore) retainedValuesStoreEntry._retainedValuesStore.f61default;
                            managedRetainedValuesStore.isDisposed = true;
                            managedRetainedValuesStore.isEnabled = false;
                            managedRetainedValuesStore.purgeUnusedExitedValues();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
