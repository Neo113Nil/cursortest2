package androidx.compose.ui.layout;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class WindowWindowInsetsAnimationValues {
    public final RectRulersImpl source;
    public final RectRulersImpl target;
    public final ParcelableSnapshotMutableState isVisible$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
    public final ParcelableSnapshotMutableState isAnimating$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final ParcelableSnapshotMutableFloatState fraction$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final ParcelableSnapshotMutableLongState durationMillis$delegate = new ParcelableSnapshotMutableLongState(0);
    public final ParcelableSnapshotMutableFloatState alpha$delegate = new ParcelableSnapshotMutableFloatState(1.0f);
    public long current = -1;
    public long maximum = -1;
    public long sourceValueInsets = -1;
    public long targetValueInsets = -1;

    public WindowWindowInsetsAnimationValues(String str) {
        this.source = new RectRulersImpl(str.concat(" source"));
        this.target = new RectRulersImpl(str.concat(" target"));
    }
}
