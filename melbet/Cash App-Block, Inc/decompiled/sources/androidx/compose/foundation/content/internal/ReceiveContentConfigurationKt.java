package androidx.compose.foundation.content.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;

/* loaded from: classes.dex */
public abstract class ReceiveContentConfigurationKt {
    public static final Extras.Key ModifierLocalReceiveContent = new Extras.Key(new InvalidationTracker$$ExternalSyntheticLambda0(8));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void getReceiveContentConfiguration(ModifierLocalModifierNode modifierLocalModifierNode) {
        if (!((Modifier.Node) modifierLocalModifierNode).getNode().isAttached() || modifierLocalModifierNode.getCurrent(ModifierLocalReceiveContent) == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
    }
}
