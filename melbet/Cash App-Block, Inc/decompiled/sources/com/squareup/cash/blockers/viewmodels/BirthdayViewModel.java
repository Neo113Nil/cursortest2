package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BirthdayViewModel {
    public final SimpleDateFormat dateFormatIn;
    public final String description;
    public final String hint;
    public final boolean lastSubmissionWasInvalid;
    public final String prefill;
    public final boolean replaceInput;
    public final String title;

    public BirthdayViewModel(boolean z, SimpleDateFormat simpleDateFormat, String str, String str2, String str3, String str4, boolean z2) {
        re$$ExternalSyntheticOutline0.m1432m(str2, str3, str4);
        this.lastSubmissionWasInvalid = z;
        this.dateFormatIn = simpleDateFormat;
        this.prefill = str;
        this.title = str2;
        this.description = str3;
        this.hint = str4;
        this.replaceInput = z2;
    }

    public static BirthdayViewModel copy$default(BirthdayViewModel birthdayViewModel, boolean z) {
        birthdayViewModel.getClass();
        birthdayViewModel.getClass();
        SimpleDateFormat simpleDateFormat = birthdayViewModel.dateFormatIn;
        String str = birthdayViewModel.prefill;
        String str2 = birthdayViewModel.title;
        String str3 = birthdayViewModel.description;
        String str4 = birthdayViewModel.hint;
        birthdayViewModel.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new BirthdayViewModel(z, simpleDateFormat, str, str2, str3, str4, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BirthdayViewModel)) {
            return false;
        }
        BirthdayViewModel birthdayViewModel = (BirthdayViewModel) obj;
        return this.lastSubmissionWasInvalid == birthdayViewModel.lastSubmissionWasInvalid && this.dateFormatIn.equals(birthdayViewModel.dateFormatIn) && Intrinsics.areEqual(this.prefill, birthdayViewModel.prefill) && Intrinsics.areEqual(this.title, birthdayViewModel.title) && Intrinsics.areEqual(this.description, birthdayViewModel.description) && Intrinsics.areEqual(this.hint, birthdayViewModel.hint) && this.replaceInput == birthdayViewModel.replaceInput;
    }

    public final int hashCode() {
        int hashCode = (this.dateFormatIn.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(10) * 31, 31, this.lastSubmissionWasInvalid), 31, false)) * 31;
        String str = this.prefill;
        return Boolean.hashCode(this.replaceInput) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.title), 31, this.description), 31, this.hint);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdayViewModel(expectedInputLength=10, lastSubmissionWasInvalid=");
        sb.append(this.lastSubmissionWasInvalid);
        sb.append(", submissionEnabled=false, dateFormatIn=");
        sb.append(this.dateFormatIn);
        sb.append(", prefill=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.prefill, ", title=", this.title, ", description=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.description, ", hint=", this.hint, ", replaceInput=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.replaceInput, ")");
    }
}
