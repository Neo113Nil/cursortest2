package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class SelectionLayoutBuilder {
    public final LayoutCoordinates containerCoordinates;
    public final long currentPosition;
    public int currentSlot;
    public int endSlot;
    public final ArrayList infoList;
    public final boolean isStartHandle;
    public final long previousHandlePosition;
    public final Selection previousSelection;
    public final SemanticsSortKt$special$$inlined$thenBy$1 selectableIdOrderingComparator;
    public final MutableLongIntMap selectableIdToInfoListIndex;
    public int startSlot;

    public SelectionLayoutBuilder(long j, long j2, LayoutCoordinates layoutCoordinates, boolean z, Selection selection, SemanticsSortKt$special$$inlined$thenBy$1 semanticsSortKt$special$$inlined$thenBy$1) {
        this.currentPosition = j;
        this.previousHandlePosition = j2;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = semanticsSortKt$special$$inlined$thenBy$1;
        int i = LongIntMapKt.$r8$clinit;
        this.selectableIdToInfoListIndex = new MutableLongIntMap(6);
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }

    public final int updateSlot(int i, Direction direction, Direction direction2) {
        if (i == -1) {
            int ordinal = SimpleLayoutKt.resolve2dDirection(direction, direction2).ordinal();
            if (ordinal == 0) {
                return this.currentSlot - 1;
            }
            if (ordinal == 1) {
                return this.currentSlot;
            }
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
        }
        return i;
    }
}
