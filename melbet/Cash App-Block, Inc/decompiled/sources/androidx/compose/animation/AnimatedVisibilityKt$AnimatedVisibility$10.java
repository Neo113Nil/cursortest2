package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.payments.viewmodels.ExpressivePaymentDetailsModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentToolbarViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$2$1$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$4$1;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.payments.views.personalization.PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* loaded from: classes3.dex */
public final class AnimatedVisibilityKt$AnimatedVisibility$10 extends Lambda implements Function2 {
    public final /* synthetic */ Function $content;
    public final /* synthetic */ Object $enter;
    public final /* synthetic */ Object $exit;
    public final /* synthetic */ Object $label;
    public final /* synthetic */ Object $modifier;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $visibleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$10(MutableTransitionState mutableTransitionState, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, String str, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.$visibleState = mutableTransitionState;
        this.$modifier = modifier;
        this.$enter = enterTransitionImpl;
        this.$exit = exitTransitionImpl;
        this.$label = str;
        this.$content = composableLambdaImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x040f  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ConstrainedLayoutReference constrainedLayoutReference;
        Color m;
        Color m2;
        NeverEqualPolicy neverEqualPolicy;
        PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.Personalization personalization;
        boolean z;
        NeverEqualPolicy neverEqualPolicy2;
        GapComposer gapComposer;
        PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Color m3;
        boolean z2;
        int i = this.$r8$classId;
        Object obj3 = this.$visibleState;
        Object obj4 = this.$exit;
        Object obj5 = this.$modifier;
        Object obj6 = this.$label;
        Function function = this.$content;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AnimatedContentKt.AnimatedVisibility((MutableTransitionState) obj3, (Modifier) obj5, (EnterTransitionImpl) this.$enter, (ExitTransitionImpl) obj4, (String) obj6, (ComposableLambdaImpl) function, (Composer) obj, Updater.updateChangedFlags(1600519));
                break;
            default:
                Composer composer = (Composer) obj;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj6;
                ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) obj5;
                Function1 function1 = (Function1) function;
                PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu2 = (PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer2 = (GapComposer) composer;
                    if (gapComposer2.getSkipping()) {
                        gapComposer2.skipToGroupEnd();
                        break;
                    }
                }
                ((MutableState) obj3).setValue(Unit.INSTANCE);
                constraintLayoutScope.getClass();
                constraintLayoutScope.reset();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(213666236);
                ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) constraintLayoutScope.createRefs().mClientFragmentManager;
                ConstrainedLayoutReference createRef = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef2 = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef3 = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef4 = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef5 = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef6 = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef7 = constraintLayoutScope2.createRef();
                ConstrainedLayoutReference createRef8 = constraintLayoutScope2.createRef();
                PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.Personalization personalization2 = loadedPersonalizePaymentMenu2.personalization;
                List list = personalization2.availableBackgrounds;
                ExpressivePaymentDetailsModel expressivePaymentDetailsModel = loadedPersonalizePaymentMenu2.detailsModel;
                boolean z3 = loadedPersonalizePaymentMenu2.showExpressivePaymentsUi;
                int i2 = personalization2.chosenBackgroundIndex;
                List list2 = personalization2.availableBackgrounds;
                Set set = loadedPersonalizePaymentMenu2.elementsBeingDragged;
                int i3 = personalization2.chosenBackgroundIndex;
                com.squareup.protos.cash.ui.Color color = ((Background) list.get(i3)).defaultTextFormat.text_color;
                Color color2 = null;
                if (color == null) {
                    gapComposer3.startReplaceGroup(1070615815);
                    gapComposer3.end(false);
                    constrainedLayoutReference = createRef5;
                    m = null;
                } else {
                    constrainedLayoutReference = createRef5;
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 34535994, color, gapComposer3, false);
                }
                long j = m != null ? m.value : Color.Black;
                com.squareup.protos.cash.ui.Color color3 = ((Background) list.get(i3)).defaultTextFormat.text_border_color;
                if (color3 == null) {
                    gapComposer3.startReplaceGroup(1070806279);
                    gapComposer3.end(false);
                    m2 = null;
                } else {
                    m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 34542138, color3, gapComposer3, false);
                }
                long j2 = m2 != null ? m2.value : Color.White;
                Object rememberedValue3 = gapComposer3.rememberedValue();
                NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
                if (rememberedValue3 == neverEqualPolicy3) {
                    rememberedValue3 = PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1.INSTANCE;
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier elevateToTop = UtilKt.elevateToTop(ConstraintLayoutScope.constrainAs(companion, createRef2, (Function1) rememberedValue3).then(z3 ? companion : SpacerKt.statusBarsPadding(companion)), set.isEmpty());
                boolean changed2 = gapComposer3.changed(delegatingSoftwareKeyboardController) | gapComposer3.changed(function1);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (changed2 || rememberedValue4 == neverEqualPolicy3) {
                    rememberedValue4 = new QuickPayViewKt$QuickPay$1$1$1$2$1$2$1$1(delegatingSoftwareKeyboardController, function1, 2);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                Function0 function0 = (Function0) rememberedValue4;
                boolean changed3 = gapComposer3.changed(delegatingSoftwareKeyboardController) | gapComposer3.changed(function1);
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (changed3 || rememberedValue5 == neverEqualPolicy3) {
                    rememberedValue5 = new OverridingUtil.AnonymousClass7(1, delegatingSoftwareKeyboardController, function1);
                    gapComposer3.updateRememberedValue(rememberedValue5);
                }
                Function1 function12 = (Function1) rememberedValue5;
                PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel = loadedPersonalizePaymentMenu2.toolbar;
                List list3 = personalizePaymentToolbarViewModel.recipients;
                PersonalizePaymentToolbarViewModel.SendButtonConfiguration sendButtonConfiguration = personalizePaymentToolbarViewModel.sendButtonConfiguration;
                if (sendButtonConfiguration != null) {
                    neverEqualPolicy = neverEqualPolicy3;
                    if (sendButtonConfiguration.isSendEnabled) {
                        personalization = personalization2;
                        z = true;
                        boolean z4 = loadedPersonalizePaymentMenu2.showExpressivePaymentsUi;
                        neverEqualPolicy2 = neverEqualPolicy;
                        String str = sendButtonConfiguration == null ? sendButtonConfiguration.sendButtonLabel : null;
                        PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.Personalization personalization3 = personalization;
                        ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReference;
                        AlphaKt.PersonalizedPaymentToolbar(elevateToTop, function0, function12, list3, z, false, false, z4, str, personalizePaymentToolbarViewModel.showRemoveButton, gapComposer3, 0, 96);
                        gapComposer = gapComposer3;
                        if (z3) {
                            gapComposer.startReplaceGroup(216353780);
                            boolean changed4 = gapComposer.changed(createRef2);
                            Object rememberedValue6 = gapComposer.rememberedValue();
                            if (changed4 || rememberedValue6 == neverEqualPolicy2) {
                                rememberedValue6 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef2, 12);
                                gapComposer.updateRememberedValue(rememberedValue6);
                            }
                            Modifier constrainAs = ConstraintLayoutScope.constrainAs(companion, createRef6, (Function1) rememberedValue6);
                            boolean changed5 = gapComposer.changed(function1);
                            Object rememberedValue7 = gapComposer.rememberedValue();
                            if (changed5 || rememberedValue7 == neverEqualPolicy2) {
                                rememberedValue7 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(16, function1);
                                gapComposer.updateRememberedValue(rememberedValue7);
                            }
                            AlphaKt.m3712AmountVieweaDK9VM(UtilKt.elevateToTop(ValueInsets.onGloballyPositioned(constrainAs, (Function1) rememberedValue7), set.isEmpty()), personalization3.amount, j, j2, gapComposer, 0);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(214701697);
                            boolean changed6 = gapComposer.changed(createRef2);
                            Object rememberedValue8 = gapComposer.rememberedValue();
                            if (changed6 || rememberedValue8 == neverEqualPolicy2) {
                                rememberedValue8 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef2, 10);
                                gapComposer.updateRememberedValue(rememberedValue8);
                            }
                            Modifier constrainAs2 = ConstraintLayoutScope.constrainAs(companion, createRef6, (Function1) rememberedValue8);
                            boolean changed7 = gapComposer.changed(function1);
                            Object rememberedValue9 = gapComposer.rememberedValue();
                            if (changed7 || rememberedValue9 == neverEqualPolicy2) {
                                rememberedValue9 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(15, function1);
                                gapComposer.updateRememberedValue(rememberedValue9);
                            }
                            Modifier elevateToTop2 = UtilKt.elevateToTop(ValueInsets.onGloballyPositioned(constrainAs2, (Function1) rememberedValue9), set.isEmpty());
                            String str2 = personalization3.amount;
                            com.squareup.protos.cash.ui.Color color4 = ((Background) list2.get(i2)).defaultTextFormat.text_color;
                            if (color4 == null) {
                                gapComposer.startReplaceGroup(215601130);
                                gapComposer.end(false);
                                m3 = null;
                            } else {
                                m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -131592457, color4, gapComposer, false);
                            }
                            long j3 = m3 != null ? m3.value : Color.White;
                            com.squareup.protos.cash.ui.Color color5 = ((Background) list2.get(i2)).defaultTextFormat.text_border_color;
                            if (color5 == null) {
                                gapComposer.startReplaceGroup(215862026);
                                gapComposer.end(false);
                            } else {
                                color2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -131584041, color5, gapComposer, false);
                            }
                            Color color6 = color2;
                            AlphaKt.m3713ExpressiveAmountVieweaDK9VM(elevateToTop2, str2, j3, color6 != null ? color6.value : Color.Transparent, gapComposer, 0);
                            if (expressivePaymentDetailsModel != null) {
                                gapComposer.startReplaceGroup(215972418);
                                boolean changed8 = gapComposer.changed(createRef6);
                                Object rememberedValue10 = gapComposer.rememberedValue();
                                if (changed8 || rememberedValue10 == neverEqualPolicy2) {
                                    rememberedValue10 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef6, 11);
                                    gapComposer.updateRememberedValue(rememberedValue10);
                                }
                                Modifier elevateToTop3 = UtilKt.elevateToTop(ConstraintLayoutScope.constrainAs(companion, createRef7, (Function1) rememberedValue10), set.isEmpty());
                                z2 = false;
                                AlphaKt.ExpressiveDetailsRow(expressivePaymentDetailsModel, elevateToTop3, gapComposer, 0);
                                gapComposer.end(false);
                            } else {
                                z2 = false;
                                gapComposer.startReplaceGroup(216310101);
                                gapComposer.end(false);
                            }
                            gapComposer.end(z2);
                        }
                        if (set.isEmpty()) {
                            gapComposer.startReplaceGroup(217280804);
                            Object rememberedValue11 = gapComposer.rememberedValue();
                            if (rememberedValue11 == neverEqualPolicy2) {
                                rememberedValue11 = PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1.INSTANCE$7;
                                gapComposer.updateRememberedValue(rememberedValue11);
                            }
                            AlphaKt.Alpha(ConstraintLayoutScope.constrainAs(companion, createRef, (Function1) rememberedValue11), gapComposer, 0);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(217604661);
                            gapComposer.end(false);
                        }
                        if (set.isEmpty()) {
                            loadedPersonalizePaymentMenu = loadedPersonalizePaymentMenu2;
                            gapComposer.startReplaceGroup(219557909);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(217715672);
                            boolean changed9 = gapComposer.changed(createRef4);
                            Object rememberedValue12 = gapComposer.rememberedValue();
                            if (changed9 || rememberedValue12 == neverEqualPolicy2) {
                                rememberedValue12 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef4, 8);
                                gapComposer.updateRememberedValue(rememberedValue12);
                            }
                            loadedPersonalizePaymentMenu = loadedPersonalizePaymentMenu2;
                            AlphaKt.ActionMenu(UtilKt.elevateToTop(ConstraintLayoutScope.constrainAs(companion, constrainedLayoutReference2, (Function1) rememberedValue12), set.isEmpty()), loadedPersonalizePaymentMenu.shouldDisableTextButton, loadedPersonalizePaymentMenu.shouldDisableStickerButton, loadedPersonalizePaymentMenu.showTextButton, loadedPersonalizePaymentMenu.showStickerButton, loadedPersonalizePaymentMenu.showMusicButton, (Function1) function, gapComposer, 0);
                            gapComposer = gapComposer;
                            SelectedTrack selectedTrack = loadedPersonalizePaymentMenu.selectedTrack;
                            if (selectedTrack == null) {
                                gapComposer.startReplaceGroup(218344785);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(218344786);
                                boolean changed10 = gapComposer.changed(createRef4);
                                Object rememberedValue13 = gapComposer.rememberedValue();
                                if (changed10 || rememberedValue13 == neverEqualPolicy2) {
                                    rememberedValue13 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef4, 9);
                                    gapComposer.updateRememberedValue(rememberedValue13);
                                }
                                QuickPayViewKt.SelectedTrackCard(selectedTrack, UtilKt.elevateToTop(ConstraintLayoutScope.constrainAs(companion, createRef8, (Function1) rememberedValue13), set.isEmpty()), gapComposer, 0);
                                gapComposer.end(false);
                            }
                            Object rememberedValue14 = gapComposer.rememberedValue();
                            if (rememberedValue14 == neverEqualPolicy2) {
                                rememberedValue14 = PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1.INSTANCE$5;
                                gapComposer.updateRememberedValue(rememberedValue14);
                            }
                            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(UtilKt.elevateToTop(SpacerKt.navigationBarsPadding(ConstraintLayoutScope.constrainAs(companion, createRef4, (Function1) rememberedValue14)), set.isEmpty()), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
                            List list4 = personalization3.availableBackgrounds;
                            int i4 = personalization3.chosenBackgroundIndex;
                            boolean changed11 = gapComposer.changed(function1);
                            Object rememberedValue15 = gapComposer.rememberedValue();
                            if (changed11 || rememberedValue15 == neverEqualPolicy2) {
                                rememberedValue15 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(13, function1);
                                gapComposer.updateRememberedValue(rememberedValue15);
                            }
                            AlphaKt.BackgroundCarousel(i4, 0, gapComposer, m302paddingqDBjuR0$default, list4, (Function1) rememberedValue15);
                            gapComposer.end(false);
                        }
                        rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy2) {
                            rememberedValue = PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1.INSTANCE$6;
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ConstraintLayoutScope.constrainAs(companion, createRef3, (Function1) rememberedValue));
                        changed = gapComposer.changed(function1);
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (!changed || rememberedValue2 == neverEqualPolicy2) {
                            rememberedValue2 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(14, function1);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        AlphaKt.CustomContent(ClipKt.clipToBounds(UtilKt.positioned(navigationBarsPadding, (Function1) rememberedValue2)), function1, loadedPersonalizePaymentMenu, gapComposer, 0);
                        gapComposer.end(false);
                    }
                } else {
                    neverEqualPolicy = neverEqualPolicy3;
                }
                personalization = personalization2;
                z = false;
                boolean z42 = loadedPersonalizePaymentMenu2.showExpressivePaymentsUi;
                neverEqualPolicy2 = neverEqualPolicy;
                String str3 = sendButtonConfiguration == null ? sendButtonConfiguration.sendButtonLabel : null;
                PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.Personalization personalization32 = personalization;
                ConstrainedLayoutReference constrainedLayoutReference22 = constrainedLayoutReference;
                AlphaKt.PersonalizedPaymentToolbar(elevateToTop, function0, function12, list3, z, false, false, z42, str3, personalizePaymentToolbarViewModel.showRemoveButton, gapComposer3, 0, 96);
                gapComposer = gapComposer3;
                if (z3) {
                }
                if (set.isEmpty()) {
                }
                if (set.isEmpty()) {
                }
                rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy2) {
                }
                Modifier navigationBarsPadding2 = SpacerKt.navigationBarsPadding(ConstraintLayoutScope.constrainAs(companion, createRef3, (Function1) rememberedValue));
                changed = gapComposer.changed(function1);
                rememberedValue2 = gapComposer.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(14, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
                AlphaKt.CustomContent(ClipKt.clipToBounds(UtilKt.positioned(navigationBarsPadding2, (Function1) rememberedValue2)), function1, loadedPersonalizePaymentMenu, gapComposer, 0);
                gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$10(MutableState mutableState, ConstraintLayoutScope constraintLayoutScope, Function0 function0, PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1) {
        super(2);
        this.$visibleState = mutableState;
        this.$modifier = constraintLayoutScope;
        this.$enter = function0;
        this.$exit = loadedPersonalizePaymentMenu;
        this.$label = delegatingSoftwareKeyboardController;
        this.$content = function1;
    }
}
