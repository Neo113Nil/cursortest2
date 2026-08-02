package com.squareup.cash.shopping.autofill.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewEvent;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.InputDropdownScope;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewEvent;
import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class EditAutofillViewKt$$ExternalSyntheticLambda10 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InputViewModel.InputDropdownViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EditAutofillViewKt$$ExternalSyntheticLambda10(InputViewModel.InputDropdownViewModel inputDropdownViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = inputDropdownViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda25, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda25, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final Function1 function1 = this.f$1;
        final InputViewModel.InputDropdownViewModel inputDropdownViewModel = this.f$0;
        ?? r6 = 0;
        ?? r7 = 1;
        switch (i) {
            case 0:
                InputDropdownScope inputDropdownScope = (InputDropdownScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                inputDropdownScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(inputDropdownScope) ? 4 : 2;
                }
                int i2 = intValue;
                ?? r11 = (GapComposer) composer;
                if (r11.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    for (final String str : inputDropdownViewModel.choices) {
                        boolean changed = r11.changed(function1) | r11.changedInstance(inputDropdownViewModel) | r11.changed(str);
                        ?? rememberedValue = r11.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            final ?? r62 = r6 == true ? 1 : 0;
                            rememberedValue = new Function0() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i3 = r62;
                                    String str2 = str;
                                    InputViewModel.InputDropdownViewModel inputDropdownViewModel2 = inputDropdownViewModel;
                                    Function1 function12 = function1;
                                    switch (i3) {
                                        case 0:
                                            function12.invoke(new EditAutofillViewEvent.InputDropdownSelection(inputDropdownViewModel2.f1202type, str2));
                                            break;
                                        default:
                                            function12.invoke(new ArcadeAutofillSettingsDetailViewEvent.InputDropdownSelection(inputDropdownViewModel2.f1202type, str2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r11.updateRememberedValue(rememberedValue);
                        }
                        InputChipKt.InputDropdownItem(inputDropdownScope, (Function0) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-1958892620, new SheetKt$$ExternalSyntheticLambda8(str, 26), r11), r11, (i2 & 14) | 3072);
                    }
                } else {
                    r11.skipToGroupEnd();
                }
                break;
            default:
                InputDropdownScope inputDropdownScope2 = (InputDropdownScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                inputDropdownScope2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(inputDropdownScope2) ? 4 : 2;
                }
                int i3 = intValue2;
                ?? r12 = (GapComposer) composer2;
                if (r12.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    for (final String str2 : inputDropdownViewModel.choices) {
                        boolean changed2 = r12.changed(function1) | r12.changedInstance(inputDropdownViewModel) | r12.changed(str2);
                        Function0 rememberedValue2 = r12.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            final ?? r72 = r7 == true ? 1 : 0;
                            rememberedValue2 = new Function0() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i32 = r72;
                                    String str22 = str2;
                                    InputViewModel.InputDropdownViewModel inputDropdownViewModel2 = inputDropdownViewModel;
                                    Function1 function12 = function1;
                                    switch (i32) {
                                        case 0:
                                            function12.invoke(new EditAutofillViewEvent.InputDropdownSelection(inputDropdownViewModel2.f1202type, str22));
                                            break;
                                        default:
                                            function12.invoke(new ArcadeAutofillSettingsDetailViewEvent.InputDropdownSelection(inputDropdownViewModel2.f1202type, str22));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r12.updateRememberedValue(rememberedValue2);
                        }
                        InputChipKt.InputDropdownItem(inputDropdownScope2, rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(-772925555, new SheetKt$$ExternalSyntheticLambda8(str2, 23), r12), r12, (i3 & 14) | 3072);
                    }
                } else {
                    r12.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
