package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.view.WindowCompat$Api35Impl;
import com.squareup.cardcustomizations.signature.PatternStateListener;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewV2Kt$$ExternalSyntheticLambda27 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda27(SnapshotStateList snapshotStateList, SnapshotStateList snapshotStateList2, CardStudioViewModelV2.Content content, boolean z, Function1 function1, MutableState mutableState) {
        this.f$1 = snapshotStateList;
        this.f$2 = snapshotStateList2;
        this.f$5 = content;
        this.f$0 = z;
        this.f$4 = function1;
        this.f$3 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$5;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        Function1 function1 = this.f$4;
        Object obj4 = this.f$1;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                PatternStateListener patternStateListener = (PatternStateListener) obj4;
                SignatureState signatureState = (SignatureState) obj3;
                PatternStampState patternStampState = (PatternStampState) obj2;
                CardStudioViewModelV2.Content content = (CardStudioViewModelV2.Content) obj;
                if (z) {
                    final int intValue = ((Number) patternStateListener.onPatternCommitted(signatureState, patternStampState).second).intValue();
                    final CardStudioViewModelV2.PatternDensity patternDensity = content.patternDensity;
                    function1.invoke(new CardStudioViewEventV2(patternDensity, intValue) { // from class: com.squareup.cash.card.onboarding.CardStudioViewEventV2$ModeTransition$Exit$Pattern
                        public final CardStudioViewModelV2.PatternDensity density;
                        public final int uniqueStamps;

                        {
                            patternDensity.getClass();
                            this.density = patternDensity;
                            this.uniqueStamps = intValue;
                        }

                        public final boolean equals(Object obj5) {
                            if (this == obj5) {
                                return true;
                            }
                            if (!(obj5 instanceof CardStudioViewEventV2$ModeTransition$Exit$Pattern)) {
                                return false;
                            }
                            CardStudioViewEventV2$ModeTransition$Exit$Pattern cardStudioViewEventV2$ModeTransition$Exit$Pattern = (CardStudioViewEventV2$ModeTransition$Exit$Pattern) obj5;
                            return this.density == cardStudioViewEventV2$ModeTransition$Exit$Pattern.density && this.uniqueStamps == cardStudioViewEventV2$ModeTransition$Exit$Pattern.uniqueStamps;
                        }

                        public final int hashCode() {
                            return Integer.hashCode(this.uniqueStamps) + (this.density.hashCode() * 31);
                        }

                        public final String toString() {
                            return "Pattern(density=" + this.density + ", uniqueStamps=" + this.uniqueStamps + ")";
                        }
                    });
                } else {
                    function1.invoke(CardStudioViewEventV2$ModeTransition$Exit$Draw.INSTANCE);
                }
                break;
            case 1:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj3;
                CardStudioViewModelV2.Content content2 = (CardStudioViewModelV2.Content) obj;
                MutableState mutableState = (MutableState) obj2;
                if (((SnapshotStateList) obj4).isEmpty() && snapshotStateList.isEmpty() && !((Boolean) mutableState.getValue()).booleanValue() && content2.isShowingCashtag == z) {
                    function1.invoke(CardStudioViewEventV2.Exit.INSTANCE);
                } else {
                    function1.invoke(CardStudioViewEventV2.ShowExitDialog.INSTANCE);
                }
                break;
            default:
                RealHapticVibrator realHapticVibrator = (RealHapticVibrator) obj4;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj3;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj2;
                MutableState mutableState2 = (MutableState) obj;
                if (!StringsKt.isBlank(((TextFieldValue) mutableState2.getValue()).annotatedString.text) || z) {
                    realHapticVibrator.getClass();
                    realHapticVibrator.vibrator.vibrate(WindowCompat$Api35Impl.access$InputStandard$lambda$1());
                    function1.invoke(((TextFieldValue) mutableState2.getValue()).annotatedString.text);
                    focusOwnerImpl.clearFocus(false);
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.hide();
                    }
                    mutableState2.setValue(new TextFieldValue("", 0L, 6));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda27(boolean z, PatternStateListener patternStateListener, SignatureState signatureState, PatternStampState patternStampState, Function1 function1, CardStudioViewModelV2.Content content) {
        this.f$0 = z;
        this.f$1 = patternStateListener;
        this.f$2 = signatureState;
        this.f$3 = patternStampState;
        this.f$4 = function1;
        this.f$5 = content;
    }

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda27(boolean z, RealHapticVibrator realHapticVibrator, Function1 function1, FocusOwnerImpl focusOwnerImpl, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, MutableState mutableState) {
        this.f$0 = z;
        this.f$1 = realHapticVibrator;
        this.f$4 = function1;
        this.f$2 = focusOwnerImpl;
        this.f$3 = delegatingSoftwareKeyboardController;
        this.f$5 = mutableState;
    }
}
