package androidx.compose.foundation.text;

import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class CoreTextFieldKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionManager f$0;

    public /* synthetic */ CoreTextFieldKt$$ExternalSyntheticLambda8(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.$r8$classId = i;
        this.f$0 = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Rect rect;
        LegacyTextFieldState legacyTextFieldState;
        LayoutCoordinates layoutCoordinates;
        char c;
        long j;
        float f;
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LayoutCoordinates layoutCoordinates5;
        int i = this.$r8$classId;
        TextFieldSelectionManager textFieldSelectionManager = this.f$0;
        switch (i) {
            case 0:
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(textFieldSelectionManager, 8);
            case 1:
                textFieldSelectionManager.showSelectionToolbar$foundation();
                return Unit.INSTANCE;
            default:
                LayoutCoordinates layoutCoordinates6 = (LayoutCoordinates) obj;
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                if (legacyTextFieldState2 != null) {
                    if (legacyTextFieldState2.isLayoutResultStale) {
                        legacyTextFieldState2 = null;
                    }
                    if (legacyTextFieldState2 != null) {
                        OffsetMapping offsetMapping = textFieldSelectionManager.offsetMapping;
                        long j2 = textFieldSelectionManager.getValue$foundation().selection;
                        int i2 = TextRange.$r8$clinit;
                        int originalToTransformed = offsetMapping.originalToTransformed((int) (j2 >> 32));
                        int originalToTransformed2 = textFieldSelectionManager.offsetMapping.originalToTransformed((int) (textFieldSelectionManager.getValue$foundation().selection & BodyPartID.bodyIdMax));
                        LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.state;
                        long j3 = 0;
                        long mo841localToRootMKHz9U = (legacyTextFieldState3 == null || (layoutCoordinates5 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? 0L : layoutCoordinates5.mo841localToRootMKHz9U(textFieldSelectionManager.m458getHandlePositiontuRUvjQ$foundation(true));
                        LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.state;
                        if (legacyTextFieldState4 != null && (layoutCoordinates4 = legacyTextFieldState4.getLayoutCoordinates()) != null) {
                            j3 = layoutCoordinates4.mo841localToRootMKHz9U(textFieldSelectionManager.m458getHandlePositiontuRUvjQ$foundation(false));
                        }
                        LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.state;
                        float f2 = RecyclerView.DECELERATION_RATE;
                        if (legacyTextFieldState5 == null || (layoutCoordinates3 = legacyTextFieldState5.getLayoutCoordinates()) == null) {
                            c = ' ';
                            j = j3;
                            f = 0.0f;
                        } else {
                            c = ' ';
                            j = j3;
                            f = Float.intBitsToFloat((int) (layoutCoordinates3.mo841localToRootMKHz9U((Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(legacyTextFieldState2.getLayoutResult() != null ? r15.value.getCursorRect(originalToTransformed).top : 0.0f) & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax));
                        }
                        LegacyTextFieldState legacyTextFieldState6 = textFieldSelectionManager.state;
                        if (legacyTextFieldState6 != null && (layoutCoordinates2 = legacyTextFieldState6.getLayoutCoordinates()) != null) {
                            f2 = Float.intBitsToFloat((int) (layoutCoordinates2.mo841localToRootMKHz9U((Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << c) | (Float.floatToRawIntBits(legacyTextFieldState2.getLayoutResult() != null ? r6.value.getCursorRect(originalToTransformed2).top : 0.0f) & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax));
                        }
                        int i3 = (int) (mo841localToRootMKHz9U >> c);
                        int i4 = (int) (j >> c);
                        rect = new Rect(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (legacyTextFieldState2.textDelegate.density.getDensity() * 25.0f) + Math.max(Float.intBitsToFloat((int) (mo841localToRootMKHz9U & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))));
                        legacyTextFieldState = textFieldSelectionManager.state;
                        if (legacyTextFieldState != null || (layoutCoordinates = legacyTextFieldState.getLayoutCoordinates()) == null) {
                            return null;
                        }
                        return TextContextMenuModifierKt.translateRootToDestination(rect, layoutCoordinates, layoutCoordinates6);
                    }
                }
                rect = Rect.Zero;
                legacyTextFieldState = textFieldSelectionManager.state;
                if (legacyTextFieldState != null) {
                }
                return null;
        }
    }
}
