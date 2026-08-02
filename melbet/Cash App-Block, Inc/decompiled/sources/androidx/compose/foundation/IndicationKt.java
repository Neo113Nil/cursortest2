package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class IndicationKt {
    public static final DynamicProvidableCompositionLocal LocalIndication = new DynamicProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(5));

    public static final Modifier indication(Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory) {
        return indicationNodeFactory == null ? modifier : modifier.then(new IndicationModifierElement(mutableInteractionSourceImpl, indicationNodeFactory));
    }
}
