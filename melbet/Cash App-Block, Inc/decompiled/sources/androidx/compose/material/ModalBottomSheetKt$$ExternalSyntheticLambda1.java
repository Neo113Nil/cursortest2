package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.CardNuxAnimationsKt;
import com.squareup.cash.wallet.views.CardRegistry;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class ModalBottomSheetKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;

    public /* synthetic */ ModalBottomSheetKt$$ExternalSyntheticLambda1(ModalBottomSheetValue modalBottomSheetValue, Density density, Function1 function1, AnimationSpec animationSpec, boolean z) {
        this.f$0 = modalBottomSheetValue;
        this.f$1 = density;
        this.f$2 = function1;
        this.f$3 = animationSpec;
        this.f$4 = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        float f2;
        float f3;
        float f4;
        int i = this.$r8$classId;
        boolean z = this.f$4;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                return new ModalBottomSheetState((ModalBottomSheetValue) obj4, (Density) obj3, (Function1) obj2, (AnimationSpec) obj, this.f$4);
            case 1:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj3;
                Function0 function0 = (Function0) obj2;
                Function0 function02 = (Function0) obj;
                ((FocusOwnerImpl) obj4).clearFocus(false);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                if (function0 != null) {
                    function0.invoke();
                }
                if (z) {
                    function02.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                TextFieldState textFieldState = (TextFieldState) obj3;
                Shaker shaker = (Shaker) obj2;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj;
                ((Function0) obj4).invoke();
                if (z && StringsKt.isBlank(textFieldState.getValue$foundation().text)) {
                    shaker.shake();
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                    TextFieldStateKt.clearText(textFieldState);
                }
                return Unit.INSTANCE;
            default:
                Animatable animatable = (Animatable) obj4;
                Function0 function03 = (Function0) obj3;
                MutableState mutableState = (MutableState) obj2;
                MutableFloatState mutableFloatState = (MutableFloatState) obj;
                float f5 = RecyclerView.DECELERATION_RATE;
                float floatValue = z ? (!((Boolean) mutableState.getValue()).booleanValue() || ((Number) animatable.getValue()).floatValue() <= RecyclerView.DECELERATION_RATE) ? ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue() : ((Number) animatable.getValue()).floatValue() : 0.0f;
                if (floatValue <= RecyclerView.DECELERATION_RATE) {
                    CardRegistry.SharedCardTransitionState sharedCardTransitionState = (CardRegistry.SharedCardTransitionState) function03.invoke();
                    return new Pair(sharedCardTransitionState.rotation.getValue(), new Vector4(RecyclerView.DECELERATION_RATE, ((Number) sharedCardTransitionState.zTranslation.getValue()).floatValue()));
                }
                Quat quat = CardNuxAnimationsKt.NUX_CARD_ROTATION;
                if (floatValue <= 0.45875f) {
                    float f6 = floatValue / 0.45875f;
                    f = (-9.0f) * f6;
                    f2 = 0.0f;
                    f3 = f6 * (-0.3f);
                    f4 = 0.0f;
                } else {
                    float f7 = (floatValue - 0.45875f) / 0.54125f;
                    f = (-9.0f) + (16.0f * f7);
                    f5 = (-21.0f) * f7;
                    f2 = 68.0f * f7;
                    f3 = (5.3f * f7) - 0.3f;
                    f4 = f7 * 1.5f;
                }
                return new Pair(CardNuxAnimationsKt.computeCardRotation(CardNuxAnimationsKt.NUX_CARD_ROTATION, f, f5, f2), new Vector4(f3, f4));
        }
    }

    public /* synthetic */ ModalBottomSheetKt$$ExternalSyntheticLambda1(FocusOwnerImpl focusOwnerImpl, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function0 function0, boolean z, Function0 function02) {
        this.f$0 = focusOwnerImpl;
        this.f$1 = delegatingSoftwareKeyboardController;
        this.f$2 = function0;
        this.f$4 = z;
        this.f$3 = function02;
    }

    public /* synthetic */ ModalBottomSheetKt$$ExternalSyntheticLambda1(Function0 function0, boolean z, TextFieldState textFieldState, Shaker shaker, RealCashVibrator realCashVibrator) {
        this.f$0 = function0;
        this.f$4 = z;
        this.f$1 = textFieldState;
        this.f$2 = shaker;
        this.f$3 = realCashVibrator;
    }

    public /* synthetic */ ModalBottomSheetKt$$ExternalSyntheticLambda1(boolean z, Animatable animatable, Function0 function0, MutableState mutableState, MutableFloatState mutableFloatState) {
        this.f$4 = z;
        this.f$0 = animatable;
        this.f$1 = function0;
        this.f$2 = mutableState;
        this.f$3 = mutableFloatState;
    }
}
