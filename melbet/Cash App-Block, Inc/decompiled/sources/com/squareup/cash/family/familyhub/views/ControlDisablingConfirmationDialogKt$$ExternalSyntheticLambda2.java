package com.squareup.cash.family.familyhub.views;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationViewModel;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ControlDisablingConfirmationViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda2(ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = controlDisablingConfirmationViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object[] objArr = 0;
        int i2 = 2;
        final ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel = this.f$0;
        Function1 function1 = this.f$1;
        char c = 1;
        char c2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                String str = controlDisablingConfirmationViewModel.title;
                String str2 = controlDisablingConfirmationViewModel.message;
                if (str2 == null) {
                    str2 = "";
                }
                ModalKt.Modal((Modifier) null, str, str2, Expect_jvmKt.rememberComposableLambda(-29863129, new ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda2(c == true ? 1 : 0, controlDisablingConfirmationViewModel, function1), composer), Expect_jvmKt.rememberComposableLambda(1797635910, new ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda2(i2, controlDisablingConfirmationViewModel, function1), composer), (Function3) null, composer, 27648, 33);
                break;
            case 1:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer2;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(29, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    final char c3 = c2 == true ? 1 : 0;
                    modalButtonScope.PrimaryModalButtonDestructive(((intValue << 12) & 57344) | 3072, 6, gapComposer, Expect_jvmKt.rememberComposableLambda(-783143018, new Function3() { // from class: com.squareup.cash.family.familyhub.views.ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            long j;
                            int i3 = c3;
                            ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel2 = controlDisablingConfirmationViewModel;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer3;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        String str3 = controlDisablingConfirmationViewModel2.cancelButtonText;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        String str4 = str3;
                                        TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                        } else {
                                            gapComposer2.startReplaceGroup(-1762997739);
                                            gapComposer2.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer4;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str5 = controlDisablingConfirmationViewModel2.confirmButtonText;
                                        TextStyle textStyle2 = Strings.getTypography(gapComposer3).labelMedium;
                                        Color color = new Color(Strings.getColors(gapComposer3).component.button.destructive.standard.text.f156default);
                                        if (controlDisablingConfirmationViewModel2.showDarkConfirm) {
                                            color = null;
                                        }
                                        if (color == null) {
                                            gapComposer3.startReplaceGroup(-981151107);
                                            j = Strings.getColors(gapComposer3).component.button.standard.text.f165default;
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-981157555);
                                            gapComposer3.end(false);
                                            j = color.value;
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), null, (Function0) rememberedValue, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer3;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new EarningsHomeKt$$ExternalSyntheticLambda7(28, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    modalButtonScope2.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(-543829591, new Function3() { // from class: com.squareup.cash.family.familyhub.views.ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            long j;
                            int i3 = objArr2;
                            ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel2 = controlDisablingConfirmationViewModel;
                            switch (i3) {
                                case 0:
                                    Composer composer32 = (Composer) obj5;
                                    int intValue22 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer22 = (GapComposer) composer32;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                        String str3 = controlDisablingConfirmationViewModel2.cancelButtonText;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        String str4 = str3;
                                        TextStyle textStyle = ((Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                        Colors colors = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                                        } else {
                                            gapComposer22.startReplaceGroup(-1762997739);
                                            gapComposer22.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer22, (Modifier) null, textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer4;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str5 = controlDisablingConfirmationViewModel2.confirmButtonText;
                                        TextStyle textStyle2 = Strings.getTypography(gapComposer3).labelMedium;
                                        Color color = new Color(Strings.getColors(gapComposer3).component.button.destructive.standard.text.f156default);
                                        if (controlDisablingConfirmationViewModel2.showDarkConfirm) {
                                            color = null;
                                        }
                                        if (color == null) {
                                            gapComposer3.startReplaceGroup(-981151107);
                                            j = Strings.getColors(gapComposer3).component.button.standard.text.f165default;
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-981157555);
                                            gapComposer3.end(false);
                                            j = color.value;
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda2(int i, ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = controlDisablingConfirmationViewModel;
    }
}
