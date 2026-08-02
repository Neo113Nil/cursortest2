package app.cash.molecule;

import androidx.compose.runtime.AbstractApplier;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class UnitApplier extends AbstractApplier {
    public static final UnitApplier INSTANCE = new UnitApplier(Unit.INSTANCE);

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int i, Object obj) {
        ((Unit) obj).getClass();
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int i, Object obj) {
        ((Unit) obj).getClass();
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int i, int i2, int i3) {
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int i, int i2) {
    }
}
