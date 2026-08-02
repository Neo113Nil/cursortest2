package androidx.compose.ui.platform;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LazyWindowInfo implements WindowInfo {
    public ParcelableSnapshotMutableState _containerSize;
    public final ParcelableSnapshotMutableState isWindowFocused$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public Function0 onInitializeContainerSize;

    /* renamed from: getContainerDpSize-MYxV2XQ, reason: not valid java name */
    public final long m938getContainerDpSizeMYxV2XQ() {
        DerivedSize derivedSize;
        if (this._containerSize == null) {
            Function0 function0 = this.onInitializeContainerSize;
            if (function0 == null || (derivedSize = (DerivedSize) function0.invoke()) == null) {
                derivedSize = DerivedSize.Zero;
            }
            this._containerSize = Updater.mutableStateOf$default(derivedSize);
            this.onInitializeContainerSize = null;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this._containerSize;
        parcelableSnapshotMutableState.getClass();
        return ((DerivedSize) parcelableSnapshotMutableState.getValue()).m926getDpSizeMYxV2XQ();
    }

    /* renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public final long m939getContainerSizeYbymL2g() {
        DerivedSize derivedSize;
        if (this._containerSize == null) {
            Function0 function0 = this.onInitializeContainerSize;
            if (function0 == null || (derivedSize = (DerivedSize) function0.invoke()) == null) {
                derivedSize = DerivedSize.Zero;
            }
            this._containerSize = Updater.mutableStateOf$default(derivedSize);
            this.onInitializeContainerSize = null;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this._containerSize;
        parcelableSnapshotMutableState.getClass();
        return ((DerivedSize) parcelableSnapshotMutableState.getValue()).m927getPxSizeYbymL2g();
    }

    public final boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }
}
