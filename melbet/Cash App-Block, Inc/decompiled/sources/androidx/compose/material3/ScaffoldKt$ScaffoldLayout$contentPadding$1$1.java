package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class ScaffoldKt$ScaffoldLayout$contentPadding$1$1 implements PaddingValues {
    public final ParcelableSnapshotMutableState paddingHolder$delegate = Updater.mutableStateOf$default(new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public final float mo264calculateBottomPaddingD9Ej5fM() {
        return ((PaddingValues) this.paddingHolder$delegate.getValue()).mo264calculateBottomPaddingD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo265calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return ((PaddingValues) this.paddingHolder$delegate.getValue()).mo265calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public final float mo266calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return ((PaddingValues) this.paddingHolder$delegate.getValue()).mo266calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public final float mo267calculateTopPaddingD9Ej5fM() {
        return ((PaddingValues) this.paddingHolder$delegate.getValue()).mo267calculateTopPaddingD9Ej5fM();
    }
}
