package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;

/* loaded from: classes3.dex */
public interface TextFieldColors {
    MutableState backgroundColor(GapComposer gapComposer);

    MutableState cursorColor(boolean z, Composer composer);

    State indicatorColor(boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Composer composer, int i);

    MutableState labelColor(boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, GapComposer gapComposer);

    MutableState leadingIconColor(boolean z, boolean z2, GapComposer gapComposer);

    /* renamed from: leadingIconColor */
    default State mo491leadingIconColor(boolean z, boolean z2, GapComposer gapComposer) {
        gapComposer.startReplaceGroup(-1036335134);
        MutableState leadingIconColor = leadingIconColor(z, z2, gapComposer);
        gapComposer.end(false);
        return leadingIconColor;
    }

    MutableState placeholderColor(boolean z, GapComposer gapComposer);

    MutableState textColor(boolean z, Composer composer);

    MutableState trailingIconColor(boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, GapComposer gapComposer);
}
