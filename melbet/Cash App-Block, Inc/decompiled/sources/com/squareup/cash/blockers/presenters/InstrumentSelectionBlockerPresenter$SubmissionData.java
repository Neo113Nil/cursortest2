package com.squareup.cash.blockers.presenters;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes4.dex */
public final class InstrumentSelectionBlockerPresenter$SubmissionData {
    public final ByteString encodedSecondarySelectedOption;
    public final ByteString encodedSelectedOption;

    public InstrumentSelectionBlockerPresenter$SubmissionData(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        this.encodedSelectedOption = byteString;
        this.encodedSecondarySelectedOption = byteString2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionBlockerPresenter$SubmissionData)) {
            return false;
        }
        InstrumentSelectionBlockerPresenter$SubmissionData instrumentSelectionBlockerPresenter$SubmissionData = (InstrumentSelectionBlockerPresenter$SubmissionData) obj;
        return Intrinsics.areEqual(this.encodedSelectedOption, instrumentSelectionBlockerPresenter$SubmissionData.encodedSelectedOption) && Intrinsics.areEqual(this.encodedSecondarySelectedOption, instrumentSelectionBlockerPresenter$SubmissionData.encodedSecondarySelectedOption);
    }

    public final int hashCode() {
        int hashCode = this.encodedSelectedOption.hashCode() * 31;
        ByteString byteString = this.encodedSecondarySelectedOption;
        return (hashCode + (byteString == null ? 0 : byteString.hashCode())) * 31;
    }

    public final String toString() {
        return "SubmissionData(encodedSelectedOption=" + this.encodedSelectedOption + ", encodedSecondarySelectedOption=" + this.encodedSecondarySelectedOption + ", googlePayToken=null)";
    }
}
