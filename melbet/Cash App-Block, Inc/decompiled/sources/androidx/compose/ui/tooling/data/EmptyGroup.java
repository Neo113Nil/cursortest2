package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class EmptyGroup extends Group {
    public static final EmptyGroup INSTANCE;

    static {
        IntRect intRect = SlotTreeKt.emptyBox;
        EmptyList emptyList = EmptyList.INSTANCE;
        INSTANCE = new EmptyGroup(null, null, null, null, intRect, emptyList, emptyList);
    }
}
