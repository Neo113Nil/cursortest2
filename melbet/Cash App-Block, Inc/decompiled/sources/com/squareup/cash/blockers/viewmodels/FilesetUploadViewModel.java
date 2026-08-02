package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.borrow.screens.BorrowHome;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class FilesetUploadViewModel {
    public final boolean attachButtonEnabled;
    public final String attachButtonText;
    public final List attachedFiles;
    public final String primaryButton;
    public final boolean primaryButtonEnabled;
    public final String secondaryButton;
    public final SubmittingState submittingState;
    public final String subtitle;
    public final String title;

    public final class FileViewModel implements Parcelable {
        public static final Parcelable.Creator<FileViewModel> CREATOR = new BorrowHome.Creator(12);
        public final String id;
        public final String name;
        public final String subtitle;
        public final String thumbnailUri;

        public FileViewModel(String str, String str2, String str3, String str4) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.id = str;
            this.name = str2;
            this.subtitle = str3;
            this.thumbnailUri = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileViewModel)) {
                return false;
            }
            FileViewModel fileViewModel = (FileViewModel) obj;
            return Intrinsics.areEqual(this.id, fileViewModel.id) && Intrinsics.areEqual(this.name, fileViewModel.name) && Intrinsics.areEqual(this.subtitle, fileViewModel.subtitle) && Intrinsics.areEqual(this.thumbnailUri, fileViewModel.thumbnailUri);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name), 31, this.subtitle);
            String str = this.thumbnailUri;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FileViewModel(id=", this.id, ", name=", this.name, ", subtitle="), this.subtitle, ", thumbnailUri=", this.thumbnailUri, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
            parcel.writeString(this.name);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.thumbnailUri);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class SubmittingState {
        public static final /* synthetic */ SubmittingState[] $VALUES;
        public static final SubmittingState BACKWARD;
        public static final SubmittingState FORWARD;
        public static final SubmittingState IDLE;

        static {
            SubmittingState submittingState = new SubmittingState("IDLE", 0);
            IDLE = submittingState;
            SubmittingState submittingState2 = new SubmittingState("FORWARD", 1);
            FORWARD = submittingState2;
            SubmittingState submittingState3 = new SubmittingState("BACKWARD", 2);
            BACKWARD = submittingState3;
            $VALUES = new SubmittingState[]{submittingState, submittingState2, submittingState3};
        }

        public static SubmittingState valueOf(String str) {
            return (SubmittingState) Enum.valueOf(SubmittingState.class, str);
        }

        public static SubmittingState[] values() {
            return (SubmittingState[]) $VALUES.clone();
        }
    }

    public FilesetUploadViewModel(String str, String str2, String str3, boolean z, SubmittingState submittingState, String str4, boolean z2, String str5, List list) {
        str.getClass();
        str3.getClass();
        submittingState.getClass();
        list.getClass();
        this.title = str;
        this.subtitle = str2;
        this.attachButtonText = str3;
        this.attachButtonEnabled = z;
        this.submittingState = submittingState;
        this.primaryButton = str4;
        this.primaryButtonEnabled = z2;
        this.secondaryButton = str5;
        this.attachedFiles = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilesetUploadViewModel)) {
            return false;
        }
        FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj;
        return Intrinsics.areEqual(this.title, filesetUploadViewModel.title) && Intrinsics.areEqual(this.subtitle, filesetUploadViewModel.subtitle) && Intrinsics.areEqual(this.attachButtonText, filesetUploadViewModel.attachButtonText) && this.attachButtonEnabled == filesetUploadViewModel.attachButtonEnabled && this.submittingState == filesetUploadViewModel.submittingState && Intrinsics.areEqual(this.primaryButton, filesetUploadViewModel.primaryButton) && this.primaryButtonEnabled == filesetUploadViewModel.primaryButtonEnabled && Intrinsics.areEqual(this.secondaryButton, filesetUploadViewModel.secondaryButton) && Intrinsics.areEqual(this.attachedFiles, filesetUploadViewModel.attachedFiles);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (this.submittingState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.attachButtonText), 31, this.attachButtonEnabled)) * 31;
        String str2 = this.primaryButton;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.primaryButtonEnabled);
        String str3 = this.secondaryButton;
        return this.attachedFiles.hashCode() + ((m + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FilesetUploadViewModel(title=", this.title, ", subtitle=", this.subtitle, ", attachButtonText=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.attachButtonText, ", attachButtonEnabled=", this.attachButtonEnabled, ", submittingState=");
        m.append(this.submittingState);
        m.append(", primaryButton=");
        m.append(this.primaryButton);
        m.append(", primaryButtonEnabled=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.primaryButtonEnabled, ", secondaryButton=", this.secondaryButton, ", attachedFiles=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.attachedFiles, ")");
    }
}
