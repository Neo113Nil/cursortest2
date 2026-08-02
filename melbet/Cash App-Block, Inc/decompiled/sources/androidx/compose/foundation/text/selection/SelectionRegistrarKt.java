package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongObjectMap;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class SelectionRegistrarKt {
    public static final DynamicProvidableCompositionLocal LocalSelectionRegistrar = new DynamicProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(12));

    public static final boolean hasSelection(SelectionRegistrar selectionRegistrar, long j) {
        MutableLongObjectMap subselections;
        if (selectionRegistrar == null || (subselections = ((SelectionRegistrarImpl) selectionRegistrar).getSubselections()) == null) {
            return false;
        }
        return subselections.containsKey(j);
    }
}
