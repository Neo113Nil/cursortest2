package com.squareup.cash.arcade.components.input;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.internal.InputColors;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class InputFieldKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ InputColors f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ MutableInteractionSourceImpl f$3;
    public final /* synthetic */ Function2 f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function2 f$6;
    public final /* synthetic */ String f$7;

    public /* synthetic */ InputFieldKt$$ExternalSyntheticLambda8(TextFieldValue textFieldValue, InputColors inputColors, long j, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function2 function2, Function2 function22, Function2 function23, String str) {
        this.f$0 = textFieldValue;
        this.f$1 = inputColors;
        this.f$2 = j;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$4 = function2;
        this.f$5 = function22;
        this.f$6 = function23;
        this.f$7 = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.f$5;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                TextFieldValue textFieldValue = (TextFieldValue) obj5;
                Function2 function2 = (Function2) obj4;
                Function2 function22 = (Function2) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                function22.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changedInstance(function22) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    String str = textFieldValue.annotatedString.text;
                    InputColors inputColors = this.f$1;
                    UtilsKt.m3396InputBoxVQfMllA(str, inputColors, this.f$2, inputColors.backgroundDefault, this.f$3, this.f$4, function2, this.f$6, this.f$7, true, function22, gapComposer, 805330944, intValue & 14, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                String str2 = (String) obj5;
                DropdownState dropdownState = (DropdownState) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.f$6;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    InputColors inputColors2 = this.f$1;
                    long j = inputColors2.backgroundDefault;
                    String str3 = this.f$7;
                    UtilsKt.m3396InputBoxVQfMllA(str3, inputColors2, this.f$2, j, this.f$3, this.f$4, null, InputChipKt.lambda$774852320, str2, false, Expect_jvmKt.rememberComposableLambda(572917552, new TransfersViewKt$$ExternalSyntheticLambda5(str3, 13), gapComposer2), gapComposer2, 14180352, 6, 512);
                    boolean booleanValue = ((Boolean) dropdownState.expanded$delegate.getValue()).booleanValue();
                    boolean changed = gapComposer2.changed(dropdownState);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InputDropdownKt$$ExternalSyntheticLambda6(dropdownState, 1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    AndroidMenu_androidKt.m516DropdownMenuIlH_yew(booleanValue, function0, SizeKt.m290width3ABfNKs(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM()), 0L, null, null, null, 0L, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(125522256, new BankingDialogKt$$ExternalSyntheticLambda2(3, composableLambdaImpl, dropdownState), gapComposer2), gapComposer2, 0, 2040);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InputFieldKt$$ExternalSyntheticLambda8(String str, InputColors inputColors, long j, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function2 function2, String str2, DropdownState dropdownState, ComposableLambdaImpl composableLambdaImpl) {
        this.f$7 = str;
        this.f$1 = inputColors;
        this.f$2 = j;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$4 = function2;
        this.f$0 = str2;
        this.f$5 = dropdownState;
        this.f$6 = composableLambdaImpl;
    }
}
