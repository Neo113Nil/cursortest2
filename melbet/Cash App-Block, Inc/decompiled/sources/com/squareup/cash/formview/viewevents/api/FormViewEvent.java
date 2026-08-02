package com.squareup.cash.formview.viewevents.api;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface FormViewEvent {

    public abstract class BlockerActionViewEvent implements FormViewEvent {

        public final class ActionDialogAccepted extends BlockerActionViewEvent {
            public final BlockerAction action;

            public ActionDialogAccepted(BlockerAction blockerAction) {
                blockerAction.getClass();
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionDialogAccepted) && Intrinsics.areEqual(this.action, ((ActionDialogAccepted) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("ActionDialogAccepted(action=", this.action, ")");
            }
        }

        public final class CellDefaultClicked extends BlockerActionViewEvent {
            public final BlockerAction action;

            public CellDefaultClicked(BlockerAction blockerAction) {
                blockerAction.getClass();
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CellDefaultClicked) && Intrinsics.areEqual(this.action, ((CellDefaultClicked) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("CellDefaultClicked(action=", this.action, ")");
            }
        }

        public final class ConfirmationDialogAccepted extends BlockerActionViewEvent {
            public final BlockerAction action;

            public ConfirmationDialogAccepted(BlockerAction blockerAction) {
                blockerAction.getClass();
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConfirmationDialogAccepted) && Intrinsics.areEqual(this.action, ((ConfirmationDialogAccepted) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("ConfirmationDialogAccepted(action=", this.action, ")");
            }
        }

        public final class FileDownloadFailureAcknowledged extends BlockerActionViewEvent {
            public final BlockerAction action;

            public FileDownloadFailureAcknowledged(BlockerAction blockerAction) {
                blockerAction.getClass();
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FileDownloadFailureAcknowledged) && Intrinsics.areEqual(this.action, ((FileDownloadFailureAcknowledged) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("FileDownloadFailureAcknowledged(action=", this.action, ")");
            }
        }

        public final class FormButtonClicked extends BlockerActionViewEvent {
            public final BlockerAction action;

            public FormButtonClicked(BlockerAction blockerAction) {
                blockerAction.getClass();
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FormButtonClicked) && Intrinsics.areEqual(this.action, ((FormButtonClicked) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("FormButtonClicked(action=", this.action, ")");
            }
        }

        public final class FormDetailRowClicked extends BlockerActionViewEvent {
            public final BlockerAction action;

            public FormDetailRowClicked(BlockerAction blockerAction) {
                blockerAction.getClass();
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FormDetailRowClicked) && Intrinsics.areEqual(this.action, ((FormDetailRowClicked) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("FormDetailRowClicked(action=", this.action, ")");
            }
        }

        public final class FormMenuActionSheetItemSelected extends BlockerActionViewEvent {
            public final BlockerAction action;

            public FormMenuActionSheetItemSelected(BlockerAction blockerAction) {
                blockerAction.getClass();
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FormMenuActionSheetItemSelected) && Intrinsics.areEqual(this.action, ((FormMenuActionSheetItemSelected) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("FormMenuActionSheetItemSelected(action=", this.action, ")");
            }
        }

        public final class PaymentPlanScheduleInfoClicked extends BlockerActionViewEvent {
            public final BlockerAction action;

            public PaymentPlanScheduleInfoClicked(BlockerAction blockerAction) {
                blockerAction.getClass();
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentPlanScheduleInfoClicked) && Intrinsics.areEqual(this.action, ((PaymentPlanScheduleInfoClicked) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("PaymentPlanScheduleInfoClicked(action=", this.action, ")");
            }
        }

        public final class SectionHeaderClicked extends BlockerActionViewEvent {
            public final BlockerAction action;

            public SectionHeaderClicked(BlockerAction blockerAction) {
                blockerAction.getClass();
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SectionHeaderClicked) && Intrinsics.areEqual(this.action, ((SectionHeaderClicked) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("SectionHeaderClicked(action=", this.action, ")");
            }
        }

        public final class SelectableRowClicked extends BlockerActionViewEvent {
            public final BlockerAction action;

            public SelectableRowClicked(BlockerAction blockerAction) {
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectableRowClicked) && this.action.equals(((SelectableRowClicked) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("SelectableRowClicked(action=", this.action, ")");
            }
        }

        public final class TimelineCardListClicked extends BlockerActionViewEvent {
            public final BlockerAction action;

            public TimelineCardListClicked(BlockerAction blockerAction) {
                this.action = blockerAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TimelineCardListClicked) && this.action.equals(((TimelineCardListClicked) obj).action);
            }

            @Override // com.squareup.cash.formview.viewevents.api.FormViewEvent.BlockerActionViewEvent
            public final BlockerAction getAction() {
                return this.action;
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m("TimelineCardListClicked(action=", this.action, ")");
            }
        }

        public abstract BlockerAction getAction();
    }

    public final class Close implements FormViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -2140227254;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Dismiss implements FormViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1336082780;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public interface ElementEvent extends FormViewEvent {

        public final class StartInput implements ElementEvent {
            public final String id;

            public StartInput(String str) {
                str.getClass();
                this.id = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartInput) && Intrinsics.areEqual(this.id, ((StartInput) obj).id);
            }

            public final int hashCode() {
                return this.id.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StartInput(id=", this.id, ")");
            }
        }
    }

    public final class EndFlow implements FormViewEvent {
        public static final EndFlow INSTANCE = new EndFlow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndFlow);
        }

        public final int hashCode() {
            return -1943246981;
        }

        public final String toString() {
            return "EndFlow";
        }
    }

    public final class FormUrlClicked implements FormViewEvent {
        public final String url;

        public FormUrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormUrlClicked) && Intrinsics.areEqual(this.url, ((FormUrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FormUrlClicked(url=", this.url, ")");
        }
    }

    /* loaded from: classes7.dex */
    public final class GoBack implements FormViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1806606115;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class HelpActionSelected implements FormViewEvent {
        public static final HelpActionSelected INSTANCE = new HelpActionSelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpActionSelected);
        }

        public final int hashCode() {
            return -1762251136;
        }

        public final String toString() {
            return "HelpActionSelected";
        }
    }

    public final class PrimaryActionSelected implements FormViewEvent {
        public static final PrimaryActionSelected INSTANCE = new PrimaryActionSelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryActionSelected);
        }

        public final int hashCode() {
            return 1418159333;
        }

        public final String toString() {
            return "PrimaryActionSelected";
        }
    }

    public final class Retreat implements FormViewEvent {
        public static final Retreat INSTANCE = new Retreat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retreat);
        }

        public final int hashCode() {
            return 762783897;
        }

        public final String toString() {
            return "Retreat";
        }
    }

    public final class SecondaryActionSelected implements FormViewEvent {
        public static final SecondaryActionSelected INSTANCE = new SecondaryActionSelected();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryActionSelected);
        }

        public final int hashCode() {
            return 1694125143;
        }

        public final String toString() {
            return "SecondaryActionSelected";
        }
    }

    public final class SubmitTextInputKeyPressed implements FormViewEvent {
        public final String submitActionId;

        public SubmitTextInputKeyPressed(String str) {
            str.getClass();
            this.submitActionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitTextInputKeyPressed) && Intrinsics.areEqual(this.submitActionId, ((SubmitTextInputKeyPressed) obj).submitActionId);
        }

        public final int hashCode() {
            return this.submitActionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmitTextInputKeyPressed(submitActionId=", this.submitActionId, ")");
        }
    }

    public abstract class UpdateResultEvent implements ElementEvent {

        public final class AddressChange extends UpdateResultEvent {
            public final SubmitFormRequest.ElementResult.AddressResult addressResult;
            public final String id;

            public AddressChange(String str, SubmitFormRequest.ElementResult.AddressResult addressResult) {
                str.getClass();
                this.id = str;
                this.addressResult = addressResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddressChange)) {
                    return false;
                }
                AddressChange addressChange = (AddressChange) obj;
                return Intrinsics.areEqual(this.id, addressChange.id) && this.addressResult.equals(addressChange.addressResult);
            }

            public final int hashCode() {
                return this.addressResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "AddressChange(id=" + this.id + ", addressResult=" + this.addressResult + ")";
            }
        }

        public final class CashtagChanged extends UpdateResultEvent {
            public final SubmitFormRequest.ElementResult.CashtagResult cashtagResult;
            public final String id;

            public CashtagChanged(String str, SubmitFormRequest.ElementResult.CashtagResult cashtagResult) {
                str.getClass();
                this.id = str;
                this.cashtagResult = cashtagResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CashtagChanged)) {
                    return false;
                }
                CashtagChanged cashtagChanged = (CashtagChanged) obj;
                return Intrinsics.areEqual(this.id, cashtagChanged.id) && this.cashtagResult.equals(cashtagChanged.cashtagResult);
            }

            public final int hashCode() {
                return this.cashtagResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "CashtagChanged(id=" + this.id + ", cashtagResult=" + this.cashtagResult + ")";
            }
        }

        public final class CellDefaultChecked extends UpdateResultEvent {
            public final boolean checked;
            public final String id;
            public final String selectionGroupId;

            public CellDefaultChecked(String str, boolean z, String str2) {
                this.id = str;
                this.checked = z;
                this.selectionGroupId = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CellDefaultChecked)) {
                    return false;
                }
                CellDefaultChecked cellDefaultChecked = (CellDefaultChecked) obj;
                return this.id.equals(cellDefaultChecked.id) && this.checked == cellDefaultChecked.checked && Intrinsics.areEqual(this.selectionGroupId, cellDefaultChecked.selectionGroupId);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.checked);
                String str = this.selectionGroupId;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("CellDefaultChecked(id=", this.id, ", checked=", ", selectionGroupId=", this.checked), this.selectionGroupId, ")");
            }
        }

        public final class CheckBoxChecked extends UpdateResultEvent {
            public final SubmitFormRequest.ElementResult.CheckBoxResult checkBoxResult;
            public final String id;

            public CheckBoxChecked(String str, SubmitFormRequest.ElementResult.CheckBoxResult checkBoxResult) {
                str.getClass();
                this.id = str;
                this.checkBoxResult = checkBoxResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CheckBoxChecked)) {
                    return false;
                }
                CheckBoxChecked checkBoxChecked = (CheckBoxChecked) obj;
                return Intrinsics.areEqual(this.id, checkBoxChecked.id) && this.checkBoxResult.equals(checkBoxChecked.checkBoxResult);
            }

            public final int hashCode() {
                return this.checkBoxResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "CheckBoxChecked(id=" + this.id + ", checkBoxResult=" + this.checkBoxResult + ")";
            }
        }

        public final class ConfirmableOptionClick extends UpdateResultEvent {
            public final String id;
            public final SubmitFormRequest.ElementResult.OptionPickerResult optionPickerResult;

            public ConfirmableOptionClick(String str, SubmitFormRequest.ElementResult.OptionPickerResult optionPickerResult) {
                str.getClass();
                this.id = str;
                this.optionPickerResult = optionPickerResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfirmableOptionClick)) {
                    return false;
                }
                ConfirmableOptionClick confirmableOptionClick = (ConfirmableOptionClick) obj;
                return Intrinsics.areEqual(this.id, confirmableOptionClick.id) && this.optionPickerResult.equals(confirmableOptionClick.optionPickerResult);
            }

            public final int hashCode() {
                return this.optionPickerResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "ConfirmableOptionClick(id=" + this.id + ", optionPickerResult=" + this.optionPickerResult + ")";
            }
        }

        public final class DateInputChanged extends UpdateResultEvent {
            public final SubmitFormRequest.ElementResult.DateInputResult dateInputResult;
            public final String id;

            public DateInputChanged(String str, SubmitFormRequest.ElementResult.DateInputResult dateInputResult) {
                str.getClass();
                dateInputResult.getClass();
                this.id = str;
                this.dateInputResult = dateInputResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DateInputChanged)) {
                    return false;
                }
                DateInputChanged dateInputChanged = (DateInputChanged) obj;
                return Intrinsics.areEqual(this.id, dateInputChanged.id) && Intrinsics.areEqual(this.dateInputResult, dateInputChanged.dateInputResult);
            }

            public final int hashCode() {
                return this.dateInputResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "DateInputChanged(id=" + this.id + ", dateInputResult=" + this.dateInputResult + ")";
            }
        }

        public final class EmojiPickChanged extends UpdateResultEvent {
            public final SubmitFormRequest.ElementResult.EmojiPickerResult emojiPickerResult;
            public final String id;

            public EmojiPickChanged(String str, SubmitFormRequest.ElementResult.EmojiPickerResult emojiPickerResult) {
                str.getClass();
                this.id = str;
                this.emojiPickerResult = emojiPickerResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EmojiPickChanged)) {
                    return false;
                }
                EmojiPickChanged emojiPickChanged = (EmojiPickChanged) obj;
                return Intrinsics.areEqual(this.id, emojiPickChanged.id) && this.emojiPickerResult.equals(emojiPickChanged.emojiPickerResult);
            }

            public final int hashCode() {
                return this.emojiPickerResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "EmojiPickChanged(id=" + this.id + ", emojiPickerResult=" + this.emojiPickerResult + ")";
            }
        }

        public final class InputChanged extends UpdateResultEvent {
            public final String id;
            public final SubmitFormRequest.ElementResult.TextInputResult textInputResult;

            public InputChanged(String str, SubmitFormRequest.ElementResult.TextInputResult textInputResult) {
                str.getClass();
                this.id = str;
                this.textInputResult = textInputResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InputChanged)) {
                    return false;
                }
                InputChanged inputChanged = (InputChanged) obj;
                return Intrinsics.areEqual(this.id, inputChanged.id) && this.textInputResult.equals(inputChanged.textInputResult);
            }

            public final int hashCode() {
                return this.textInputResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "InputChanged(id=" + this.id + ", textInputResult=" + this.textInputResult + ")";
            }
        }

        public final class MerchantTransactionOptionClick extends UpdateResultEvent {
            public final String id;
            public final SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult merchantTransactionResult;

            public MerchantTransactionOptionClick(String str, SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult merchantTransactionOptionPickerResult) {
                str.getClass();
                this.id = str;
                this.merchantTransactionResult = merchantTransactionOptionPickerResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MerchantTransactionOptionClick)) {
                    return false;
                }
                MerchantTransactionOptionClick merchantTransactionOptionClick = (MerchantTransactionOptionClick) obj;
                return Intrinsics.areEqual(this.id, merchantTransactionOptionClick.id) && this.merchantTransactionResult.equals(merchantTransactionOptionClick.merchantTransactionResult);
            }

            public final int hashCode() {
                return this.merchantTransactionResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "MerchantTransactionOptionClick(id=" + this.id + ", merchantTransactionResult=" + this.merchantTransactionResult + ")";
            }
        }

        public final class MoneyInputChanged extends UpdateResultEvent {
            public final String id;
            public final SubmitFormRequest.ElementResult.MoneyInputResult moneyInputResult;

            public MoneyInputChanged(String str, SubmitFormRequest.ElementResult.MoneyInputResult moneyInputResult) {
                str.getClass();
                this.id = str;
                this.moneyInputResult = moneyInputResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MoneyInputChanged)) {
                    return false;
                }
                MoneyInputChanged moneyInputChanged = (MoneyInputChanged) obj;
                return Intrinsics.areEqual(this.id, moneyInputChanged.id) && this.moneyInputResult.equals(moneyInputChanged.moneyInputResult);
            }

            public final int hashCode() {
                return this.moneyInputResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "MoneyInputChanged(id=" + this.id + ", moneyInputResult=" + this.moneyInputResult + ")";
            }
        }

        public final class OptionClick extends UpdateResultEvent {
            public final String id;
            public final SubmitFormRequest.ElementResult.OptionPickerResult optionPickerResult;

            public OptionClick(String str, SubmitFormRequest.ElementResult.OptionPickerResult optionPickerResult) {
                str.getClass();
                this.id = str;
                this.optionPickerResult = optionPickerResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OptionClick)) {
                    return false;
                }
                OptionClick optionClick = (OptionClick) obj;
                return Intrinsics.areEqual(this.id, optionClick.id) && this.optionPickerResult.equals(optionClick.optionPickerResult);
            }

            public final int hashCode() {
                return this.optionPickerResult.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "OptionClick(id=" + this.id + ", optionPickerResult=" + this.optionPickerResult + ")";
            }
        }

        public final class UnselectableOptionClick extends UpdateResultEvent {
            public final String id;
            public final FormBlocker.Element.OptionPickerElement.Option.Unselectable unselectable;

            public UnselectableOptionClick(String str, FormBlocker.Element.OptionPickerElement.Option.Unselectable unselectable) {
                str.getClass();
                this.id = str;
                this.unselectable = unselectable;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnselectableOptionClick)) {
                    return false;
                }
                UnselectableOptionClick unselectableOptionClick = (UnselectableOptionClick) obj;
                return Intrinsics.areEqual(this.id, unselectableOptionClick.id) && this.unselectable.equals(unselectableOptionClick.unselectable);
            }

            public final int hashCode() {
                return this.unselectable.hashCode() + (this.id.hashCode() * 31);
            }

            public final String toString() {
                return "UnselectableOptionClick(id=" + this.id + ", unselectable=" + this.unselectable + ")";
            }
        }
    }
}
