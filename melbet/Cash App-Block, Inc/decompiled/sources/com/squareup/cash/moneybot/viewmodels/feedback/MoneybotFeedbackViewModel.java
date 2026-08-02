package com.squareup.cash.moneybot.viewmodels.feedback;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackOption;
import com.squareup.cash.moneybot.screens.ThumbDirection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotFeedbackViewModel {
    public final String comment;
    public final String commentPlaceholder;
    public final ThumbDirection direction;
    public final String disclaimerText;
    public final String dropdownLabel;
    public final String dropdownPlaceholder;
    public final List options;
    public final MoneybotFeedbackOption selectedOption;
    public final String submitButtonText;
    public final String title;

    public final class ReasonOption {
        public final String label;
        public final MoneybotFeedbackOption option;

        public ReasonOption(MoneybotFeedbackOption moneybotFeedbackOption, String str) {
            moneybotFeedbackOption.getClass();
            str.getClass();
            this.option = moneybotFeedbackOption;
            this.label = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReasonOption)) {
                return false;
            }
            ReasonOption reasonOption = (ReasonOption) obj;
            return Intrinsics.areEqual(this.option, reasonOption.option) && Intrinsics.areEqual(this.label, reasonOption.label);
        }

        public final int hashCode() {
            return this.label.hashCode() + (this.option.hashCode() * 31);
        }

        public final String toString() {
            return "ReasonOption(option=" + this.option + ", label=" + this.label + ")";
        }
    }

    public MoneybotFeedbackViewModel(ThumbDirection thumbDirection, String str, String str2, String str3, List list, MoneybotFeedbackOption moneybotFeedbackOption, String str4, String str5, String str6, String str7) {
        thumbDirection.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        re$$ExternalSyntheticOutline0.m1432m(str4, str5, str7);
        this.direction = thumbDirection;
        this.title = str;
        this.dropdownLabel = str2;
        this.dropdownPlaceholder = str3;
        this.options = list;
        this.selectedOption = moneybotFeedbackOption;
        this.comment = str4;
        this.commentPlaceholder = str5;
        this.disclaimerText = str6;
        this.submitButtonText = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotFeedbackViewModel)) {
            return false;
        }
        MoneybotFeedbackViewModel moneybotFeedbackViewModel = (MoneybotFeedbackViewModel) obj;
        return this.direction == moneybotFeedbackViewModel.direction && Intrinsics.areEqual(this.title, moneybotFeedbackViewModel.title) && Intrinsics.areEqual(this.dropdownLabel, moneybotFeedbackViewModel.dropdownLabel) && Intrinsics.areEqual(this.dropdownPlaceholder, moneybotFeedbackViewModel.dropdownPlaceholder) && Intrinsics.areEqual(this.options, moneybotFeedbackViewModel.options) && Intrinsics.areEqual(this.selectedOption, moneybotFeedbackViewModel.selectedOption) && Intrinsics.areEqual(this.comment, moneybotFeedbackViewModel.comment) && Intrinsics.areEqual(this.commentPlaceholder, moneybotFeedbackViewModel.commentPlaceholder) && this.disclaimerText.equals(moneybotFeedbackViewModel.disclaimerText) && Intrinsics.areEqual(this.submitButtonText, moneybotFeedbackViewModel.submitButtonText);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.direction.hashCode() * 31, 31, this.title), 31, this.dropdownLabel), 31, this.dropdownPlaceholder), 31, this.options);
        MoneybotFeedbackOption moneybotFeedbackOption = this.selectedOption;
        return this.submitButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (moneybotFeedbackOption == null ? 0 : moneybotFeedbackOption.hashCode())) * 31, 31, this.comment), 31, this.commentPlaceholder), 31, this.disclaimerText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneybotFeedbackViewModel(direction=");
        sb.append(this.direction);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", dropdownLabel=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.dropdownLabel, ", dropdownPlaceholder=", this.dropdownPlaceholder, ", options=");
        sb.append(this.options);
        sb.append(", selectedOption=");
        sb.append(this.selectedOption);
        sb.append(", comment=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.comment, ", commentPlaceholder=", this.commentPlaceholder, ", disclaimerText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.disclaimerText, ", submitButtonText=", this.submitButtonText, ")");
    }
}
