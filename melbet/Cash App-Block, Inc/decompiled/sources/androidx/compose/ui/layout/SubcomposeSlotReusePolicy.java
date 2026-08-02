package androidx.compose.ui.layout;

import androidx.collection.Values;

/* loaded from: classes3.dex */
public interface SubcomposeSlotReusePolicy {
    boolean areCompatible(Object obj, Object obj2);

    void getSlotsToRetain(Values values);
}
