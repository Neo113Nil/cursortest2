package com.squareup.cash.family.requestsponsorship.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SelectSponsorViewModel {

    public final class SelectSponsor implements SelectSponsorViewModel {
        public final String addContactCardInlineText;
        public final String addContactsCardContactButtonTitle;
        public final String hint;
        public final boolean isNoResultsCardShown;
        public final boolean isShowingDialog;
        public final List sections;
        public final String sendInviteButtonLabel;
        public final boolean showSendInviteButton;
        public final String title;

        public SelectSponsor(String str, String str2, List list, String str3, String str4, boolean z, boolean z2, boolean z3, String str5) {
            list.getClass();
            this.title = str;
            this.hint = str2;
            this.sections = list;
            this.addContactCardInlineText = str3;
            this.addContactsCardContactButtonTitle = str4;
            this.isNoResultsCardShown = z;
            this.isShowingDialog = z2;
            this.showSendInviteButton = z3;
            this.sendInviteButtonLabel = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectSponsor)) {
                return false;
            }
            SelectSponsor selectSponsor = (SelectSponsor) obj;
            return this.title.equals(selectSponsor.title) && this.hint.equals(selectSponsor.hint) && Intrinsics.areEqual(this.sections, selectSponsor.sections) && Intrinsics.areEqual(this.addContactCardInlineText, selectSponsor.addContactCardInlineText) && Intrinsics.areEqual(this.addContactsCardContactButtonTitle, selectSponsor.addContactsCardContactButtonTitle) && this.isNoResultsCardShown == selectSponsor.isNoResultsCardShown && this.isShowingDialog == selectSponsor.isShowingDialog && this.showSendInviteButton == selectSponsor.showSendInviteButton && this.sendInviteButtonLabel.equals(selectSponsor.sendInviteButtonLabel);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.hint), 31, this.sections);
            String str = this.addContactCardInlineText;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.addContactsCardContactButtonTitle;
            return this.sendInviteButtonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isNoResultsCardShown), 31, this.isShowingDialog), 31, this.showSendInviteButton);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectSponsor(title=", this.title, ", hint=", this.hint, ", sections=");
            Recorder$$ExternalSyntheticOutline2.m(", addContactCardInlineText=", this.addContactCardInlineText, ", addContactsCardContactButtonTitle=", m, this.sections);
            NavAction$$ExternalSyntheticOutline0.m(m, this.addContactsCardContactButtonTitle, ", isNoResultsCardShown=", this.isNoResultsCardShown, ", isShowingDialog=");
            re$$ExternalSyntheticOutline0.m(m, this.isShowingDialog, ", showSendInviteButton=", this.showSendInviteButton, ", sendInviteButtonLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.sendInviteButtonLabel, ")");
        }
    }

    public final class Submitting implements SelectSponsorViewModel {
        public static final Submitting INSTANCE = new Submitting();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submitting);
        }

        public final int hashCode() {
            return 248809726;
        }

        public final String toString() {
            return "Submitting";
        }
    }
}
