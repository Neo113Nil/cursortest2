package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.controller.MiSnapController;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemConfirmed;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemSelected;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$HelpClicked;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneyChanged;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.PasscodeHelpResult;
import com.squareup.cash.blockers.viewmodels.GetFlowLoadingViewEvent$HandleError;
import com.squareup.cash.blockers.viewmodels.IneligibleMergeResult;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.ReadContactsPermissionResult$Negative;
import com.squareup.cash.blockers.viewmodels.SetNameEvent;
import com.squareup.cash.blockers.viewmodels.SetPinViewEvent;
import com.squareup.cash.blockers.viewmodels.SsnViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyAliasViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyHelpItem;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentViewEvent;
import com.squareup.cash.blockers.views.components.VerifyAliasView;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerQuickAmount;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewEvent;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewEvent;
import com.squareup.cash.borrow.viewmodels.SheetButtonAction;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewEvent;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureResult$Positive;
import com.squareup.cash.card.onboarding.DisclosureView;
import com.squareup.cash.card.onboarding.DisclosureViewEvent;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewEvent;
import com.squareup.cash.checks.CaptureCheckFaceViewEvent;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda21;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewEvent;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.ui.Timeline;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final /* synthetic */ class SsnViewKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = null;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                if (dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult) {
                    Object obj3 = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent).result;
                    if (obj3 instanceof HelpItem) {
                        function1.invoke(new SsnViewEvent.HelpItemClick((HelpItem) obj3));
                    }
                } else if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 1:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                dialogListenerEvent2.getClass();
                if ((dialogListenerEvent2.getScreen() instanceof BlockersScreens.Error) || (dialogListenerEvent2.getScreen() instanceof FailureMessageBlockerScreen)) {
                    function1.invoke(GetFlowLoadingViewEvent$HandleError.INSTANCE);
                }
                return Unit.INSTANCE;
            case 2:
                DialogListenerEvent dialogListenerEvent3 = (DialogListenerEvent) obj;
                dialogListenerEvent3.getClass();
                if (dialogListenerEvent3 instanceof DialogListenerEvent.OnDialogResult) {
                    DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent3;
                    Object obj4 = onDialogResult.result;
                    if (onDialogResult.screen instanceof BlockersScreens.PasscodeHelpScreen) {
                        obj4.getClass();
                        if (PasscodeViewKt$WhenMappings.$EnumSwitchMapping$0[((PasscodeHelpResult) obj4).ordinal()] != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        function1.invoke(PasscodeViewEvent.ForgotPasscode.INSTANCE);
                    } else if (obj4 instanceof HelpItem) {
                        function1.invoke(new PasscodeViewEvent.HelpClick((HelpItem) obj4));
                    }
                } else if (!(dialogListenerEvent3 instanceof DialogListenerEvent.OnDialogCanceled)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 3:
                DialogListenerEvent dialogListenerEvent4 = (DialogListenerEvent) obj;
                dialogListenerEvent4.getClass();
                if (dialogListenerEvent4 instanceof DialogListenerEvent.OnDialogResult) {
                    Object obj5 = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent4).result;
                    if (obj5 instanceof HelpItem) {
                        function1.invoke(new SetNameEvent.HelpItemClick((HelpItem) obj5));
                    }
                } else if (!(dialogListenerEvent4 instanceof DialogListenerEvent.OnDialogCanceled)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 4:
                DialogListenerEvent dialogListenerEvent5 = (DialogListenerEvent) obj;
                dialogListenerEvent5.getClass();
                if (dialogListenerEvent5 instanceof DialogListenerEvent.OnDialogResult) {
                    DialogListenerEvent.OnDialogResult onDialogResult2 = (DialogListenerEvent.OnDialogResult) dialogListenerEvent5;
                    if ((onDialogResult2.screen instanceof BlockersScreens.PasscodeHelpScreen) && onDialogResult2.result == PasscodeHelpResult.Forgot) {
                        function1.invoke(SetPinViewEvent.ForgotPasscodeHelpItemSelected.INSTANCE);
                    }
                } else if (!(dialogListenerEvent5 instanceof DialogListenerEvent.OnDialogCanceled)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 5:
                DialogListenerEvent dialogListenerEvent6 = (DialogListenerEvent) obj;
                dialogListenerEvent6.getClass();
                if (!(dialogListenerEvent6 instanceof DialogListenerEvent.OnDialogCanceled)) {
                    if (!(dialogListenerEvent6 instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Object obj6 = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent6).result;
                    if (obj6 instanceof HelpItem) {
                        function1.invoke(new VerifyInstrumentViewEvent.SelectHelpItem((HelpItem) obj6));
                    }
                }
                return Unit.INSTANCE;
            case 6:
                DialogListenerEvent dialogListenerEvent7 = (DialogListenerEvent) obj;
                int i2 = VerifyContactsView.$r8$clinit;
                dialogListenerEvent7.getClass();
                boolean z = dialogListenerEvent7 instanceof DialogListenerEvent.OnDialogResult;
                VerifyContactsViewEvent.AccessDenied accessDenied = VerifyContactsViewEvent.AccessDenied.INSTANCE;
                if (z) {
                    DialogListenerEvent.OnDialogResult onDialogResult3 = (DialogListenerEvent.OnDialogResult) dialogListenerEvent7;
                    Object obj7 = onDialogResult3.result;
                    if (obj7 instanceof HelpItem) {
                        function1.invoke(new VerifyContactsViewEvent.HelpItemClick((HelpItem) obj7));
                    }
                    if ((onDialogResult3.screen instanceof BlockersScreens.ReadContactsPermissionScreen) && Intrinsics.areEqual(obj7, ReadContactsPermissionResult$Negative.INSTANCE)) {
                        function1.invoke(accessDenied);
                    }
                } else {
                    if (!(dialogListenerEvent7 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent7).screen instanceof BlockersScreens.ReadContactsPermissionScreen) {
                        function1.invoke(accessDenied);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                DialogListenerEvent dialogListenerEvent8 = (DialogListenerEvent) obj;
                int i3 = VerifyAliasView.$r8$clinit;
                dialogListenerEvent8.getClass();
                if (dialogListenerEvent8 instanceof DialogListenerEvent.OnDialogCanceled) {
                    Screen screen = ((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent8).screen;
                    if (screen instanceof BlockersScreens.VerifyErrorScreen) {
                        function1.invoke(VerifyAliasViewEvent.DismissError.INSTANCE);
                    } else if (screen instanceof BlockersScreens.IneligibleMergeScreen) {
                        function1.invoke(VerifyAliasViewEvent.MergeBlockerCancelled.INSTANCE);
                    }
                } else if (dialogListenerEvent8 instanceof DialogListenerEvent.OnDialogResult) {
                    DialogListenerEvent.OnDialogResult onDialogResult4 = (DialogListenerEvent.OnDialogResult) dialogListenerEvent8;
                    Object obj8 = onDialogResult4.result;
                    Screen screen2 = onDialogResult4.screen;
                    if (screen2 instanceof BlockersScreens.VerifyHelpScreen) {
                        if (obj8 instanceof VerifyHelpItem) {
                            int ordinal = ((VerifyHelpItem) obj8).ordinal();
                            if (ordinal == 0 || ordinal == 1) {
                                function1.invoke(VerifyAliasViewEvent.EditAlias.INSTANCE);
                            } else if (ordinal == 2) {
                                function1.invoke(VerifyAliasViewEvent.RequestCall.INSTANCE);
                            } else {
                                if (ordinal != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                function1.invoke(VerifyAliasViewEvent.Skip.INSTANCE);
                            }
                        } else if (obj8 instanceof HelpItem) {
                            HelpItem helpItem = (HelpItem) obj8;
                            BlockerAction blockerAction = helpItem.blocker_action;
                            if (blockerAction != null) {
                                function1.invoke(new VerifyAliasViewEvent.BlockerActionClick(blockerAction));
                            } else {
                                function1.invoke(new VerifyAliasViewEvent.HelpItemSelected(helpItem));
                            }
                        }
                    } else if (screen2 instanceof BlockersScreens.SkipVerifyScreen) {
                        if (obj8 == AlertDialogResult.POSITIVE) {
                            function1.invoke(VerifyAliasViewEvent.ConfirmSkip.INSTANCE);
                        }
                    } else if (screen2 instanceof BlockersScreens.VerifyErrorScreen) {
                        function1.invoke(VerifyAliasViewEvent.ConfirmError.INSTANCE);
                    } else if (!(screen2 instanceof FailureMessageBlockerScreen) && (screen2 instanceof BlockersScreens.IneligibleMergeScreen)) {
                        obj8.getClass();
                        function1.invoke(new VerifyAliasViewEvent.MergeBlockerResult((IneligibleMergeResult) obj8));
                    }
                }
                return Unit.INSTANCE;
            case 8:
                AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
                amountPickerViewEvent.getClass();
                if (amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemSelected) {
                    AmountSelectorWidgetModel.Item item = ((AmountPickerViewEvent$Condensed$ItemSelected) amountPickerViewEvent).item;
                    if (!(item instanceof BorrowAmountPickerQuickAmount)) {
                        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                        return null;
                    }
                    obj2 = new BorrowAmountPickerViewEvent.SelectQuickAmount(((BorrowAmountPickerQuickAmount) item).index);
                } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemConfirmed) {
                    AmountSelectorWidgetModel.Item item2 = ((AmountPickerViewEvent$Condensed$ItemConfirmed) amountPickerViewEvent).item;
                    if (!(item2 instanceof BorrowAmountPickerQuickAmount)) {
                        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                        return null;
                    }
                    obj2 = new BorrowAmountPickerViewEvent.ConfirmQuickAmount(((BorrowAmountPickerQuickAmount) item2).index);
                } else if (!(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneyChanged)) {
                    if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneySubmitted) {
                        obj2 = new BorrowAmountPickerViewEvent.ConfirmCustomAmount(((AmountPickerViewEvent$Full$MoneySubmitted) amountPickerViewEvent).amount);
                    } else {
                        if (!(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$Close) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$SystemBack)) {
                            if ((amountPickerViewEvent instanceof AmountPickerViewEvent$Full$HelpClicked) || (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted)) {
                                Path$$ExternalSyntheticBUOutline0.m$1(amountPickerViewEvent, "Unsupported event: ");
                                return null;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        obj2 = BorrowAmountPickerViewEvent.Dismiss.INSTANCE;
                    }
                }
                if (obj2 != null) {
                    function1.invoke(obj2);
                }
                return Unit.INSTANCE;
            case 9:
                BorrowAmountPickerViewEvent borrowAmountPickerViewEvent = (BorrowAmountPickerViewEvent) obj;
                borrowAmountPickerViewEvent.getClass();
                function1.invoke(new FirstTimeBorrowViewEvent.AmountPickerEvent(borrowAmountPickerViewEvent));
                return Unit.INSTANCE;
            case 10:
                AlertDialogViewEvent alertDialogViewEvent = (AlertDialogViewEvent) obj;
                alertDialogViewEvent.getClass();
                function1.invoke(new FirstTimeBorrowViewEvent.AlertDialogEvent(alertDialogViewEvent));
                return Unit.INSTANCE;
            case 11:
                Timeline.Event event = (Timeline.Event) obj;
                event.getClass();
                String str = event.tap_action_url;
                str.getClass();
                function1.invoke(new BorrowHomeOverlayEvent.RepaymentSheetEvent.InitiateRepayment(new SheetButtonAction.ActionUrl(str)));
                return Unit.INSTANCE;
            case 12:
                Timeline.Event event2 = (Timeline.Event) obj;
                event2.getClass();
                String str2 = event2.tap_action_url;
                str2.getClass();
                function1.invoke(new BorrowHomeViewEvent.TapPaymentTimelineRow(str2));
                return Unit.INSTANCE;
            case 13:
                ((Boolean) obj).booleanValue();
                function1.invoke(BugReportingViewEvent.ToggleAllDiagnosticAttachments.INSTANCE);
                return Unit.INSTANCE;
            case 14:
                Context context = (Context) obj;
                context.getClass();
                AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = new AfterPayOrderHubMainHeaderView(context);
                afterPayOrderHubMainHeaderView.setBackgroundColor(ThemeHelpersKt.findThemeInfo(context).colorPalette.background);
                afterPayOrderHubMainHeaderView.setEventReceiver(new ShopHubResultsListKt$$ExternalSyntheticLambda21(4, function1));
                return afterPayOrderHubMainHeaderView;
            case 15:
                ScheduleCalendarDate scheduleCalendarDate = (ScheduleCalendarDate) obj;
                scheduleCalendarDate.getClass();
                function1.invoke(scheduleCalendarDate);
                return Unit.INSTANCE;
            case 16:
                ScheduleCalendarDate scheduleCalendarDate2 = (ScheduleCalendarDate) obj;
                scheduleCalendarDate2.getClass();
                function1.invoke(scheduleCalendarDate2);
                return Unit.INSTANCE;
            case 17:
                ((Boolean) obj).booleanValue();
                function1.invoke(CardStudioMoreSheetViewEvent.ToggleCashtag.INSTANCE);
                return Unit.INSTANCE;
            case 18:
                function1.invoke(new CardStudioViewEventV2.SetPatternDensity((CardStudioViewModelV2.PatternDensity) CardStudioViewModelV2.PatternDensity.$ENTRIES.get(((Integer) obj).intValue())));
                return Unit.INSTANCE;
            case 19:
                DialogListenerEvent dialogListenerEvent9 = (DialogListenerEvent) obj;
                int i4 = DisclosureView.$r8$clinit;
                dialogListenerEvent9.getClass();
                if (dialogListenerEvent9 instanceof DialogListenerEvent.OnDialogCanceled) {
                    function1.invoke(DisclosureViewEvent.OnCloseDialog.INSTANCE);
                } else {
                    if (!(dialogListenerEvent9 instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (Intrinsics.areEqual(((DialogListenerEvent.OnDialogResult) dialogListenerEvent9).result, ConfirmExitDisclosureResult$Positive.INSTANCE)) {
                        function1.invoke(DisclosureViewEvent.OnDialogPositive.INSTANCE);
                        function1.invoke(DisclosureViewEvent.Exit.INSTANCE);
                    } else {
                        function1.invoke(DisclosureViewEvent.OnDialogNegative.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            case 20:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new PaymentDeviceCustomizationViewEvent.TapProductDetailsPageLink(str3));
                return Unit.INSTANCE;
            case 21:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new PaymentDeviceCustomizationViewEvent.TapProductDetailsPageLink(str4));
                return Unit.INSTANCE;
            case 22:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new PaymentDeviceCustomizationViewEvent.TapProductDetailsPageLink(str5));
                return Unit.INSTANCE;
            case 23:
                DialogListenerEvent dialogListenerEvent10 = (DialogListenerEvent) obj;
                dialogListenerEvent10.getClass();
                if (dialogListenerEvent10.getScreen() instanceof FailureMessageScreen) {
                    function1.invoke(SpendingInsightDetailViewEvent.Exit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 24:
                function1.invoke(new CaptureCheckFaceViewEvent.MiSnapFeedback(((MiSnapController.FeedbackResult) obj).a));
                return Unit.INSTANCE;
            case 25:
                MiSnapController.ErrorResult errorResult = (MiSnapController.ErrorResult) obj;
                errorResult.getClass();
                function1.invoke(new CaptureCheckFaceViewEvent.MiSnapError(((MiSnapController.ErrorResult.DocumentAnalysis) errorResult).a));
                return Unit.INSTANCE;
            case 26:
                return function1.invoke(Unit.INSTANCE);
            case 27:
                Unit unit = Unit.INSTANCE;
                function1.invoke(unit);
                return unit;
            case 28:
                return function1.invoke(obj);
            default:
                function1.invoke(obj);
                return Unit.INSTANCE;
        }
    }
}
