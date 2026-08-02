package androidx.compose.foundation.layout;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class AndroidWindowInsets implements WindowInsets {
    public final ParcelableSnapshotMutableState insets$delegate = Updater.mutableStateOf$default(Insets.NONE);
    public final ParcelableSnapshotMutableState isVisible$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
    public final String name;

    /* renamed from: type, reason: collision with root package name */
    public final int f849type;

    public AndroidWindowInsets(int i, String str) {
        this.f849type = i;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidWindowInsets) {
            return this.f849type == ((AndroidWindowInsets) obj).f849type;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density) {
        return getInsets$foundation_layout().bottom;
    }

    public final Insets getInsets$foundation_layout() {
        return (Insets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density, LayoutDirection layoutDirection) {
        return getInsets$foundation_layout().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density, LayoutDirection layoutDirection) {
        return getInsets$foundation_layout().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density) {
        return getInsets$foundation_layout().top;
    }

    public final int hashCode() {
        return this.f849type;
    }

    public final void setVisible(boolean z) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('(');
        sb.append(getInsets$foundation_layout().left);
        sb.append(", ");
        sb.append(getInsets$foundation_layout().top);
        sb.append(", ");
        sb.append(getInsets$foundation_layout().right);
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, getInsets$foundation_layout().bottom, ')');
    }

    public final void update$foundation_layout(WindowInsetsCompat windowInsetsCompat, int i) {
        int i2 = this.f849type;
        if (i == 0 || (i & i2) != 0) {
            this.insets$delegate.setValue(windowInsetsCompat.mImpl.getInsets(i2));
            setVisible(windowInsetsCompat.mImpl.isVisible(i2));
        }
    }
}
