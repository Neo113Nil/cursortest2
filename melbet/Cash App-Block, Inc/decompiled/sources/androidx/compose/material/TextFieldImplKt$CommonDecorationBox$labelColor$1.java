package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final class TextFieldImplKt$CommonDecorationBox$labelColor$1 implements Function3 {
    public final /* synthetic */ TextFieldColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSourceImpl $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, int i) {
        this.$r8$classId = i;
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = mutableInteractionSourceImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.$interactionSource;
        boolean z = this.$isError;
        boolean z2 = this.$enabled;
        TextFieldColors textFieldColors = this.$colors;
        switch (i) {
            case 0:
                InputPhase inputPhase = (InputPhase) obj;
                ((Number) obj3).intValue();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(1423138213);
                if (inputPhase == InputPhase.UnfocusedEmpty) {
                    z = false;
                }
                return Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, ((Color) textFieldColors.labelColor(z2, z, mutableInteractionSourceImpl, gapComposer).getValue()).value);
            default:
                com.stripe.android.uicore.elements.compat.InputPhase inputPhase2 = (com.stripe.android.uicore.elements.compat.InputPhase) obj;
                ((Number) obj3).intValue();
                inputPhase2.getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                gapComposer2.startReplaceGroup(1194596618);
                if (inputPhase2 == com.stripe.android.uicore.elements.compat.InputPhase.UnfocusedEmpty) {
                    z = false;
                }
                return Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, ((Color) textFieldColors.labelColor(z2, z, mutableInteractionSourceImpl, gapComposer2).getValue()).value);
        }
    }
}
