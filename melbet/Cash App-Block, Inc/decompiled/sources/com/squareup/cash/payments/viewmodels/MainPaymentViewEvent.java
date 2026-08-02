package com.squareup.cash.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.franklin.api.InstrumentSelection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class MainPaymentViewEvent {

    public final class ActionClicked extends MainPaymentViewEvent {
        public final List lastGesturesSignal;

        public ActionClicked(List list) {
            list.getClass();
            this.lastGesturesSignal = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionClicked) && Intrinsics.areEqual(this.lastGesturesSignal, ((ActionClicked) obj).lastGesturesSignal);
        }

        public final int hashCode() {
            return this.lastGesturesSignal.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ActionClicked(lastGesturesSignal=", ")", this.lastGesturesSignal);
        }
    }

    public final class AvatarClicked extends MainPaymentViewEvent {
        public final Recipient recipient;

        public AvatarClicked(Recipient recipient) {
            recipient.getClass();
            this.recipient = recipient;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvatarClicked) && Intrinsics.areEqual(this.recipient, ((AvatarClicked) obj).recipient);
        }

        public final int hashCode() {
            return this.recipient.hashCode();
        }

        public final String toString() {
            return "AvatarClicked(recipient=" + this.recipient + ")";
        }
    }

    public final class ClearClicked extends MainPaymentViewEvent {
        public static final ClearClicked INSTANCE = new ClearClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearClicked);
        }

        public final int hashCode() {
            return 1164417776;
        }

        public final String toString() {
            return "ClearClicked";
        }
    }

    public final class CloseClicked extends MainPaymentViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return -156857115;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class ContactSyncPermission extends MainPaymentViewEvent {
        public static final ContactSyncPermission INSTANCE = new ContactSyncPermission();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContactSyncPermission);
        }

        public final int hashCode() {
            return 783021556;
        }

        public final String toString() {
            return "ContactSyncPermission";
        }
    }

    public final class GrantContactsPermissionClicked extends MainPaymentViewEvent {
        public static final GrantContactsPermissionClicked INSTANCE = new GrantContactsPermissionClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GrantContactsPermissionClicked);
        }

        public final int hashCode() {
            return 1077670367;
        }

        public final String toString() {
            return "GrantContactsPermissionClicked";
        }
    }

    public final class HandleBack extends MainPaymentViewEvent {
        public static final HandleBack INSTANCE = new HandleBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HandleBack);
        }

        public final int hashCode() {
            return 1066629765;
        }

        public final String toString() {
            return "HandleBack";
        }
    }

    public final class ListRowClicked extends MainPaymentViewEvent {
        public final SelectedRecipient recipient;
        public final boolean shouldBypassConfirmationSelection;
        public final boolean shouldRemoveIfAlreadySelected;

        public ListRowClicked(SelectedRecipient selectedRecipient, int i) {
            boolean z = (i & 4) == 0;
            boolean z2 = (i & 8) != 0;
            this.recipient = selectedRecipient;
            this.shouldBypassConfirmationSelection = z;
            this.shouldRemoveIfAlreadySelected = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListRowClicked)) {
                return false;
            }
            ListRowClicked listRowClicked = (ListRowClicked) obj;
            return this.recipient.equals(listRowClicked.recipient) && this.shouldBypassConfirmationSelection == listRowClicked.shouldBypassConfirmationSelection && this.shouldRemoveIfAlreadySelected == listRowClicked.shouldRemoveIfAlreadySelected;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldRemoveIfAlreadySelected) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recipient.hashCode() * 31, 31, true), 31, this.shouldBypassConfirmationSelection);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ListRowClicked(recipient=");
            sb.append(this.recipient);
            sb.append(", clearQueryText=true, shouldBypassConfirmationSelection=");
            sb.append(this.shouldBypassConfirmationSelection);
            sb.append(", shouldRemoveIfAlreadySelected=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shouldRemoveIfAlreadySelected, ")");
        }
    }

    public final class NoteTextChanged extends MainPaymentViewEvent {
        public final String note;

        public NoteTextChanged(String str) {
            str.getClass();
            this.note = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoteTextChanged) && Intrinsics.areEqual(this.note, ((NoteTextChanged) obj).note);
        }

        public final int hashCode() {
            return this.note.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoteTextChanged(note=", this.note, ")");
        }
    }

    public final class OnDialogResult extends MainPaymentViewEvent {
        public final Object result;
        public final Screen screenArgs;

        public OnDialogResult(Screen screen, Object obj) {
            this.screenArgs = screen;
            this.result = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDialogResult)) {
                return false;
            }
            OnDialogResult onDialogResult = (OnDialogResult) obj;
            return Intrinsics.areEqual(this.screenArgs, onDialogResult.screenArgs) && Intrinsics.areEqual(this.result, onDialogResult.result);
        }

        public final int hashCode() {
            Screen screen = this.screenArgs;
            int hashCode = (screen == null ? 0 : screen.hashCode()) * 31;
            Object obj = this.result;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            return "OnDialogResult(screenArgs=" + this.screenArgs + ", result=" + this.result + ")";
        }
    }

    public final class PersonalizePaymentClick extends MainPaymentViewEvent {
        public static final PersonalizePaymentClick INSTANCE = new PersonalizePaymentClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PersonalizePaymentClick);
        }

        public final int hashCode() {
            return 1166625984;
        }

        public final String toString() {
            return "PersonalizePaymentClick";
        }
    }

    public final class RecipientViewed extends MainPaymentViewEvent {
        public final Recipient recipient;

        public RecipientViewed(Recipient recipient) {
            recipient.getClass();
            this.recipient = recipient;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecipientViewed) && Intrinsics.areEqual(this.recipient, ((RecipientViewed) obj).recipient);
        }

        public final int hashCode() {
            return this.recipient.hashCode();
        }

        public final String toString() {
            return "RecipientViewed(recipient=" + this.recipient + ")";
        }
    }

    public final class RestoreState extends MainPaymentViewEvent {
        public final InstrumentSelection instrumentSelected;
        public final String note;
        public final String query;
        public final Map selectedRecipients;

        public RestoreState(String str, String str2, InstrumentSelection instrumentSelection, Map map) {
            str.getClass();
            str2.getClass();
            map.getClass();
            this.query = str;
            this.note = str2;
            this.instrumentSelected = instrumentSelection;
            this.selectedRecipients = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RestoreState)) {
                return false;
            }
            RestoreState restoreState = (RestoreState) obj;
            return Intrinsics.areEqual(this.query, restoreState.query) && Intrinsics.areEqual(this.note, restoreState.note) && Intrinsics.areEqual(this.instrumentSelected, restoreState.instrumentSelected) && Intrinsics.areEqual(this.selectedRecipients, restoreState.selectedRecipients);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.query.hashCode() * 31, 31, this.note);
            InstrumentSelection instrumentSelection = this.instrumentSelected;
            return Boolean.hashCode(false) + CameraState$Type$EnumUnboxingLocalUtility.m((m + (instrumentSelection == null ? 0 : instrumentSelection.hashCode())) * 31, this.selectedRecipients, 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RestoreState(query=", this.query, ", note=", this.note, ", instrumentSelected=");
            m.append(this.instrumentSelected);
            m.append(", selectedRecipients=");
            m.append(this.selectedRecipients);
            m.append(", shouldClearQuery=false)");
            return m.toString();
        }
    }

    public final class SearchTextChanged extends MainPaymentViewEvent {
        public final String text;

        public SearchTextChanged(String str) {
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChanged) && this.text.equals(((SearchTextChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchTextChanged(text=", this.text, ")");
        }
    }

    public final class SelectInstrument extends MainPaymentViewEvent {
        public static final SelectInstrument INSTANCE = new SelectInstrument();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectInstrument);
        }

        public final int hashCode() {
            return 1235286233;
        }

        public final String toString() {
            return "SelectInstrument";
        }
    }
}
