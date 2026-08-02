package androidx.compose.ui.layout;

import androidx.collection.Values;

/* loaded from: classes3.dex */
public final class NoOpSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    public static final NoOpSubcomposeSlotReusePolicy INSTANCE = new NoOpSubcomposeSlotReusePolicy(0);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ NoOpSubcomposeSlotReusePolicy(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return false;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(Values values) {
        values.clear();
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 1:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
