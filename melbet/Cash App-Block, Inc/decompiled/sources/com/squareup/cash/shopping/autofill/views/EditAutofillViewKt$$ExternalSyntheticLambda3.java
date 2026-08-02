package com.squareup.cash.shopping.autofill.views;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.autofill.viewmodels.DialogViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class EditAutofillViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DialogViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EditAutofillViewKt$$ExternalSyntheticLambda3(int i, DialogViewModel dialogViewModel, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = dialogViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        final Function1 function1 = this.f$1;
        final DialogViewModel dialogViewModel = this.f$0;
        Object[] objArr = 0;
        final int i2 = 2;
        final int i3 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    String str = dialogViewModel.title;
                    String str2 = dialogViewModel.body;
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(924520901, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i4 = objArr2;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            final DialogViewModel dialogViewModel2 = dialogViewModel;
                            Function1 function12 = function1;
                            final int i5 = 2;
                            char c = 1;
                            switch (i4) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        boolean changed = gapComposer2.changed(function12);
                                        Object rememberedValue = gapComposer2.rememberedValue();
                                        if (changed || rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(14, function12);
                                            gapComposer2.updateRememberedValue(rememberedValue);
                                        }
                                        final int i6 = r8 ? 1 : 0;
                                        modalButtonScope.PrimaryModalButtonDestructive((57344 & (intValue2 << 12)) | 3072, 6, gapComposer2, Expect_jvmKt.rememberComposableLambda(-1975460684, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i7 = i6;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i7) {
                                                    case 0:
                                                        Composer composer3 = (Composer) obj7;
                                                        int intValue3 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer3.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer4 = (Composer) obj7;
                                                        int intValue4 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer5 = (Composer) obj7;
                                                        int intValue5 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer2), null, (Function0) rememberedValue, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        intValue3 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                        boolean changed2 = gapComposer3.changed(function12);
                                        Object rememberedValue2 = gapComposer3.rememberedValue();
                                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                            rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(12, function12);
                                            gapComposer3.updateRememberedValue(rememberedValue2);
                                        }
                                        final char c2 = c == true ? 1 : 0;
                                        modalButtonScope2.PrimaryModalButtonDestructive((57344 & (intValue3 << 12)) | 3072, 6, gapComposer3, Expect_jvmKt.rememberComposableLambda(-300559267, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i7 = c2;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i7) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer4 = (Composer) obj7;
                                                        int intValue4 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer5 = (Composer) obj7;
                                                        int intValue5 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), null, (Function0) rememberedValue2, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj3;
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    modalButtonScope3.getClass();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((GapComposer) composer4).changed(modalButtonScope3) ? 4 : 2;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        boolean changed3 = gapComposer4.changed(function12) | gapComposer4.changedInstance(dialogViewModel2);
                                        Object rememberedValue3 = gapComposer4.rememberedValue();
                                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                            rememberedValue3 = new EditAutofillViewKt$$ExternalSyntheticLambda2(1, dialogViewModel2, function12);
                                            gapComposer4.updateRememberedValue(rememberedValue3);
                                        }
                                        modalButtonScope3.SecondaryModalButton((Function0) rememberedValue3, null, false, Expect_jvmKt.rememberComposableLambda(888769770, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i7 = i5;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i7) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer5 = (Composer) obj7;
                                                        int intValue5 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, (57344 & (intValue4 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj3;
                                    Composer composer5 = (Composer) obj4;
                                    int intValue5 = ((Integer) obj5).intValue();
                                    modalButtonScope4.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((GapComposer) composer5).changed(modalButtonScope4) ? 4 : 2;
                                    }
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        boolean changed4 = gapComposer5.changed(function12) | gapComposer5.changedInstance(dialogViewModel2);
                                        Object rememberedValue4 = gapComposer5.rememberedValue();
                                        final int i7 = 3;
                                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                                            rememberedValue4 = new EditAutofillViewKt$$ExternalSyntheticLambda2(3, dialogViewModel2, function12);
                                            gapComposer5.updateRememberedValue(rememberedValue4);
                                        }
                                        modalButtonScope4.SecondaryModalButton((Function0) rememberedValue4, null, false, Expect_jvmKt.rememberComposableLambda(-101661881, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i7;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer5), gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer);
                    final int i4 = 3;
                    ModalKt.Modal((Modifier) null, str, str2, rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(917140580, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i42 = i4;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            final DialogViewModel dialogViewModel2 = dialogViewModel;
                            Function1 function12 = function1;
                            final int i5 = 2;
                            char c = 1;
                            switch (i42) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        boolean changed = gapComposer2.changed(function12);
                                        Object rememberedValue = gapComposer2.rememberedValue();
                                        if (changed || rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(14, function12);
                                            gapComposer2.updateRememberedValue(rememberedValue);
                                        }
                                        final int i6 = r8 ? 1 : 0;
                                        modalButtonScope.PrimaryModalButtonDestructive((57344 & (intValue2 << 12)) | 3072, 6, gapComposer2, Expect_jvmKt.rememberComposableLambda(-1975460684, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i6;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer2), null, (Function0) rememberedValue, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        intValue3 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                        boolean changed2 = gapComposer3.changed(function12);
                                        Object rememberedValue2 = gapComposer3.rememberedValue();
                                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                            rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(12, function12);
                                            gapComposer3.updateRememberedValue(rememberedValue2);
                                        }
                                        final int c2 = c == true ? 1 : 0;
                                        modalButtonScope2.PrimaryModalButtonDestructive((57344 & (intValue3 << 12)) | 3072, 6, gapComposer3, Expect_jvmKt.rememberComposableLambda(-300559267, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = c2;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), null, (Function0) rememberedValue2, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj3;
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    modalButtonScope3.getClass();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((GapComposer) composer4).changed(modalButtonScope3) ? 4 : 2;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        boolean changed3 = gapComposer4.changed(function12) | gapComposer4.changedInstance(dialogViewModel2);
                                        Object rememberedValue3 = gapComposer4.rememberedValue();
                                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                            rememberedValue3 = new EditAutofillViewKt$$ExternalSyntheticLambda2(1, dialogViewModel2, function12);
                                            gapComposer4.updateRememberedValue(rememberedValue3);
                                        }
                                        modalButtonScope3.SecondaryModalButton((Function0) rememberedValue3, null, false, Expect_jvmKt.rememberComposableLambda(888769770, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i5;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, (57344 & (intValue4 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj3;
                                    Composer composer5 = (Composer) obj4;
                                    int intValue5 = ((Integer) obj5).intValue();
                                    modalButtonScope4.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((GapComposer) composer5).changed(modalButtonScope4) ? 4 : 2;
                                    }
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        boolean changed4 = gapComposer5.changed(function12) | gapComposer5.changedInstance(dialogViewModel2);
                                        Object rememberedValue4 = gapComposer5.rememberedValue();
                                        final int i7 = 3;
                                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                                            rememberedValue4 = new EditAutofillViewKt$$ExternalSyntheticLambda2(3, dialogViewModel2, function12);
                                            gapComposer5.updateRememberedValue(rememberedValue4);
                                        }
                                        modalButtonScope4.SecondaryModalButton((Function0) rememberedValue4, null, false, Expect_jvmKt.rememberComposableLambda(-101661881, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i7;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer5), gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), (Function3) null, gapComposer, 27648, 33);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, dialogViewModel.title, dialogViewModel.body, Expect_jvmKt.rememberComposableLambda(-1847968340, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i42 = i3;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            final DialogViewModel dialogViewModel2 = dialogViewModel;
                            Function1 function12 = function1;
                            final int i5 = 2;
                            char c = 1;
                            switch (i42) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj3;
                                    Composer composer22 = (Composer) obj4;
                                    int intValue22 = ((Integer) obj5).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue22 & 6) == 0) {
                                        intValue22 |= ((GapComposer) composer22).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer22 = (GapComposer) composer22;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                                        boolean changed = gapComposer22.changed(function12);
                                        Object rememberedValue = gapComposer22.rememberedValue();
                                        if (changed || rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(14, function12);
                                            gapComposer22.updateRememberedValue(rememberedValue);
                                        }
                                        final int i6 = r8 ? 1 : 0;
                                        modalButtonScope.PrimaryModalButtonDestructive((57344 & (intValue22 << 12)) | 3072, 6, gapComposer22, Expect_jvmKt.rememberComposableLambda(-1975460684, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i6;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer22), null, (Function0) rememberedValue, false);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        intValue3 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                        boolean changed2 = gapComposer3.changed(function12);
                                        Object rememberedValue2 = gapComposer3.rememberedValue();
                                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                            rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(12, function12);
                                            gapComposer3.updateRememberedValue(rememberedValue2);
                                        }
                                        final int c2 = c == true ? 1 : 0;
                                        modalButtonScope2.PrimaryModalButtonDestructive((57344 & (intValue3 << 12)) | 3072, 6, gapComposer3, Expect_jvmKt.rememberComposableLambda(-300559267, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = c2;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), null, (Function0) rememberedValue2, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj3;
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    modalButtonScope3.getClass();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((GapComposer) composer4).changed(modalButtonScope3) ? 4 : 2;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        boolean changed3 = gapComposer4.changed(function12) | gapComposer4.changedInstance(dialogViewModel2);
                                        Object rememberedValue3 = gapComposer4.rememberedValue();
                                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                            rememberedValue3 = new EditAutofillViewKt$$ExternalSyntheticLambda2(1, dialogViewModel2, function12);
                                            gapComposer4.updateRememberedValue(rememberedValue3);
                                        }
                                        modalButtonScope3.SecondaryModalButton((Function0) rememberedValue3, null, false, Expect_jvmKt.rememberComposableLambda(888769770, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i5;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, (57344 & (intValue4 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj3;
                                    Composer composer5 = (Composer) obj4;
                                    int intValue5 = ((Integer) obj5).intValue();
                                    modalButtonScope4.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((GapComposer) composer5).changed(modalButtonScope4) ? 4 : 2;
                                    }
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        boolean changed4 = gapComposer5.changed(function12) | gapComposer5.changedInstance(dialogViewModel2);
                                        Object rememberedValue4 = gapComposer5.rememberedValue();
                                        final int i7 = 3;
                                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                                            rememberedValue4 = new EditAutofillViewKt$$ExternalSyntheticLambda2(3, dialogViewModel2, function12);
                                            gapComposer5.updateRememberedValue(rememberedValue4);
                                        }
                                        modalButtonScope4.SecondaryModalButton((Function0) rememberedValue4, null, false, Expect_jvmKt.rememberComposableLambda(-101661881, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i7;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer5), gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), Expect_jvmKt.rememberComposableLambda(381918893, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i42 = i2;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            final DialogViewModel dialogViewModel2 = dialogViewModel;
                            Function1 function12 = function1;
                            final int i5 = 2;
                            char c = 1;
                            switch (i42) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj3;
                                    Composer composer22 = (Composer) obj4;
                                    int intValue22 = ((Integer) obj5).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue22 & 6) == 0) {
                                        intValue22 |= ((GapComposer) composer22).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer22 = (GapComposer) composer22;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                                        boolean changed = gapComposer22.changed(function12);
                                        Object rememberedValue = gapComposer22.rememberedValue();
                                        if (changed || rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(14, function12);
                                            gapComposer22.updateRememberedValue(rememberedValue);
                                        }
                                        final int i6 = r8 ? 1 : 0;
                                        modalButtonScope.PrimaryModalButtonDestructive((57344 & (intValue22 << 12)) | 3072, 6, gapComposer22, Expect_jvmKt.rememberComposableLambda(-1975460684, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i6;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer22), null, (Function0) rememberedValue, false);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        intValue3 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                        boolean changed2 = gapComposer3.changed(function12);
                                        Object rememberedValue2 = gapComposer3.rememberedValue();
                                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                            rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(12, function12);
                                            gapComposer3.updateRememberedValue(rememberedValue2);
                                        }
                                        final int c2 = c == true ? 1 : 0;
                                        modalButtonScope2.PrimaryModalButtonDestructive((57344 & (intValue3 << 12)) | 3072, 6, gapComposer3, Expect_jvmKt.rememberComposableLambda(-300559267, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = c2;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), null, (Function0) rememberedValue2, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj3;
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    modalButtonScope3.getClass();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((GapComposer) composer4).changed(modalButtonScope3) ? 4 : 2;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        boolean changed3 = gapComposer4.changed(function12) | gapComposer4.changedInstance(dialogViewModel2);
                                        Object rememberedValue3 = gapComposer4.rememberedValue();
                                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                            rememberedValue3 = new EditAutofillViewKt$$ExternalSyntheticLambda2(1, dialogViewModel2, function12);
                                            gapComposer4.updateRememberedValue(rememberedValue3);
                                        }
                                        modalButtonScope3.SecondaryModalButton((Function0) rememberedValue3, null, false, Expect_jvmKt.rememberComposableLambda(888769770, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i5;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, (57344 & (intValue4 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj3;
                                    Composer composer5 = (Composer) obj4;
                                    int intValue5 = ((Integer) obj5).intValue();
                                    modalButtonScope4.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((GapComposer) composer5).changed(modalButtonScope4) ? 4 : 2;
                                    }
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        boolean changed4 = gapComposer5.changed(function12) | gapComposer5.changedInstance(dialogViewModel2);
                                        Object rememberedValue4 = gapComposer5.rememberedValue();
                                        final int i7 = 3;
                                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                                            rememberedValue4 = new EditAutofillViewKt$$ExternalSyntheticLambda2(3, dialogViewModel2, function12);
                                            gapComposer5.updateRememberedValue(rememberedValue4);
                                        }
                                        modalButtonScope4.SecondaryModalButton((Function0) rememberedValue4, null, false, Expect_jvmKt.rememberComposableLambda(-101661881, new Function3() { // from class: com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i72 = i7;
                                                DialogViewModel dialogViewModel3 = dialogViewModel2;
                                                switch (i72) {
                                                    case 0:
                                                        Composer composer32 = (Composer) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer32.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 1:
                                                        Composer composer42 = (Composer) obj7;
                                                        int intValue42 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.primaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    case 2:
                                                        Composer composer52 = (Composer) obj7;
                                                        int intValue52 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer52 = (GapComposer) composer52;
                                                        if (gapComposer52.shouldExecute(intValue52 & 1, (intValue52 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer52.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer6 = (Composer) obj7;
                                                        int intValue6 = ((Integer) obj8).intValue();
                                                        ((RowScope) obj6).getClass();
                                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogViewModel3.secondaryActionText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer6.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer5), gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), (Function3) null, gapComposer2, 27648, 33);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
