package com.squareup.cash.checks;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class VerifyCheckDepositViewModel {
    public final CheckFaceCellViewModel checkBackCellViewModel;
    public final CheckFaceCellViewModel checkFrontCellViewModel;
    public final boolean continueEnabled;
    public final String description;
    public final String fraudWarning;
    public final boolean isSubmitting;
    public final String submitButtonLabel;
    public final String title;

    public final class CheckFaceCellViewModel {
        public final String buttonLabel;
        public final String label;
        public final CaptureState state;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class CaptureState {
            public static final /* synthetic */ CaptureState[] $VALUES;
            public static final CaptureState CAPTURED;
            public static final CaptureState NOT_CAPTURED;

            static {
                CaptureState captureState = new CaptureState("NOT_CAPTURED", 0);
                NOT_CAPTURED = captureState;
                CaptureState captureState2 = new CaptureState("CAPTURED", 1);
                CAPTURED = captureState2;
                $VALUES = new CaptureState[]{captureState, captureState2};
            }

            public static CaptureState valueOf(String str) {
                return (CaptureState) Enum.valueOf(CaptureState.class, str);
            }

            public static CaptureState[] values() {
                return (CaptureState[]) $VALUES.clone();
            }
        }

        public CheckFaceCellViewModel(String str, String str2, CaptureState captureState) {
            str.getClass();
            str2.getClass();
            captureState.getClass();
            this.label = str;
            this.buttonLabel = str2;
            this.state = captureState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckFaceCellViewModel)) {
                return false;
            }
            CheckFaceCellViewModel checkFaceCellViewModel = (CheckFaceCellViewModel) obj;
            return Intrinsics.areEqual(this.label, checkFaceCellViewModel.label) && Intrinsics.areEqual(this.buttonLabel, checkFaceCellViewModel.buttonLabel) && this.state == checkFaceCellViewModel.state;
        }

        public final int hashCode() {
            return this.state.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.buttonLabel);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CheckFaceCellViewModel(label=", this.label, ", buttonLabel=", this.buttonLabel, ", state=");
            m.append(this.state);
            m.append(")");
            return m.toString();
        }
    }

    public VerifyCheckDepositViewModel(String str, String str2, String str3, CheckFaceCellViewModel checkFaceCellViewModel, CheckFaceCellViewModel checkFaceCellViewModel2, boolean z, boolean z2, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
        this.title = str;
        this.description = str2;
        this.submitButtonLabel = str3;
        this.checkFrontCellViewModel = checkFaceCellViewModel;
        this.checkBackCellViewModel = checkFaceCellViewModel2;
        this.continueEnabled = z;
        this.isSubmitting = z2;
        this.fraudWarning = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyCheckDepositViewModel)) {
            return false;
        }
        VerifyCheckDepositViewModel verifyCheckDepositViewModel = (VerifyCheckDepositViewModel) obj;
        return Intrinsics.areEqual(this.title, verifyCheckDepositViewModel.title) && Intrinsics.areEqual(this.description, verifyCheckDepositViewModel.description) && this.submitButtonLabel.equals(verifyCheckDepositViewModel.submitButtonLabel) && this.checkFrontCellViewModel.equals(verifyCheckDepositViewModel.checkFrontCellViewModel) && this.checkBackCellViewModel.equals(verifyCheckDepositViewModel.checkBackCellViewModel) && this.continueEnabled == verifyCheckDepositViewModel.continueEnabled && this.isSubmitting == verifyCheckDepositViewModel.isSubmitting && Intrinsics.areEqual(this.fraudWarning, verifyCheckDepositViewModel.fraudWarning);
    }

    public final int hashCode() {
        return this.fraudWarning.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.checkBackCellViewModel.hashCode() + ((this.checkFrontCellViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.submitButtonLabel)) * 31)) * 31, 31, this.continueEnabled), 31, this.isSubmitting);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VerifyCheckDepositViewModel(title=", this.title, ", description=", this.description, ", submitButtonLabel=");
        m.append(this.submitButtonLabel);
        m.append(", checkFrontCellViewModel=");
        m.append(this.checkFrontCellViewModel);
        m.append(", checkBackCellViewModel=");
        m.append(this.checkBackCellViewModel);
        m.append(", continueEnabled=");
        m.append(this.continueEnabled);
        m.append(", isSubmitting=");
        m.append(this.isSubmitting);
        m.append(", fraudWarning=");
        m.append(this.fraudWarning);
        m.append(")");
        return m.toString();
    }
}
