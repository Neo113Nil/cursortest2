package com.squareup.cash.payments.views.personalization;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.core.content.ContextCompat$Api26Impl;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.payments.views.UtilKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final class PersonalizePaymentRecipientViewKt$PersonalizePaymentRecipient$1$1$1$10 implements Function3 {
    public final /* synthetic */ PersonalizePaymentRecipientViewModel.Loaded $model;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId = 0;

    public PersonalizePaymentRecipientViewKt$PersonalizePaymentRecipient$1$1$1$10(PersonalizePaymentRecipientViewModel.Loaded loaded, Function1 function1) {
        this.$model = loaded;
        this.$onEvent = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list;
        List list2;
        int i = this.$r8$classId;
        PersonalizePaymentRecipientViewModel.Loaded loaded = this.$model;
        Function1 function1 = this.$onEvent;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        switch (i) {
            case 0:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Number) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean z = loaded.showExpressivePaymentsUi;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (z && loaded.showReceiptButton) {
                        gapComposer.startReplaceGroup(593458071);
                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 0.5f);
                        boolean changed = gapComposer.changed(function1);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new QuickPayViewKt$QuickPay$1$1$1$2$2$1$1(4, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        AlphaKt.ReceiptButton(0, gapComposer, horizontalWeight, (Function0) rememberedValue);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(593610343);
                        gapComposer.end(false);
                    }
                    if (loaded.reactionsState.isReactionButtonVisible()) {
                        gapComposer.startReplaceGroup(593704087);
                        UtilKt.StatefulReactionButton(this.$onEvent, loaded.showExpressivePaymentsUi ? adaptiveStackScope.horizontalWeight(companion, 0.5f) : adaptiveStackScope.horizontalWeight(companion, 1.0f), loaded.reactionsState, loaded.showExpressivePaymentsUi, gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(594133127);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Number) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                boolean changed2 = gapComposer2.changed(function1);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(11, function1);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                boolean changed3 = gapComposer2.changed(function1);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new QuickPayViewKt$QuickPay$1$1$1$2$2$1$1(5, function1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Function0 function0 = (Function0) rememberedValue3;
                PersonalizedPaymentsReactionsState personalizedPaymentsReactionsState = loaded.reactionsState;
                PersonalizedPaymentsReactionsState.ShowingQuickReactions showingQuickReactions = personalizedPaymentsReactionsState instanceof PersonalizedPaymentsReactionsState.ShowingQuickReactions ? (PersonalizedPaymentsReactionsState.ShowingQuickReactions) personalizedPaymentsReactionsState : null;
                if (showingQuickReactions == null || (list2 = showingQuickReactions.quickReactions) == null) {
                    list = EmptyList.INSTANCE;
                } else {
                    List<String> list3 = list2;
                    list = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (String str : list3) {
                        if (str == null) {
                            str = "";
                        }
                        list.add(str);
                    }
                }
                ContextCompat$Api26Impl.MessageReactionBar(0, gapComposer2, null, list, function0, function12);
                break;
        }
        return Unit.INSTANCE;
    }

    public PersonalizePaymentRecipientViewKt$PersonalizePaymentRecipient$1$1$1$10(Function1 function1, PersonalizePaymentRecipientViewModel.Loaded loaded) {
        this.$onEvent = function1;
        this.$model = loaded;
    }
}
