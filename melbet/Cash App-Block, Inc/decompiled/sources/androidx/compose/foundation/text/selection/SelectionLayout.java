package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongObjectMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface SelectionLayout {
    MutableLongObjectMap createSubSelections(Selection selection);

    void forEachMiddleInfo(Function1 function1);

    CrossStatus getCrossStatus();

    SelectableInfo getCurrentInfo();

    SelectableInfo getEndInfo();

    int getEndSlot();

    SelectableInfo getFirstInfo();

    Selection getPreviousSelection();

    int getSize();

    SelectableInfo getStartInfo();

    int getStartSlot();

    boolean isStartHandle();

    boolean shouldRecomputeSelection(SelectionLayout selectionLayout);
}
