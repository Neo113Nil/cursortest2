package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.filepicker.FilePickerResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class FilesetUploadViewEvent {

    public final class AttachFileClick extends FilesetUploadViewEvent {
        public static final AttachFileClick INSTANCE = new AttachFileClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AttachFileClick);
        }

        public final int hashCode() {
            return 731746019;
        }

        public final String toString() {
            return "AttachFileClick";
        }
    }

    /* loaded from: classes7.dex */
    public final class CancelUpload extends FilesetUploadViewEvent {
        public static final CancelUpload INSTANCE = new CancelUpload();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelUpload);
        }

        public final int hashCode() {
            return -290046881;
        }

        public final String toString() {
            return "CancelUpload";
        }
    }

    public final class GoBack extends FilesetUploadViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 696773683;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class PrimaryButtonClick extends FilesetUploadViewEvent {
        public static final PrimaryButtonClick INSTANCE = new PrimaryButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonClick);
        }

        public final int hashCode() {
            return 831411800;
        }

        public final String toString() {
            return "PrimaryButtonClick";
        }
    }

    public final class RemoveFile extends FilesetUploadViewEvent {
        public final String id;

        public RemoveFile(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveFile) && Intrinsics.areEqual(this.id, ((RemoveFile) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemoveFile(id=", this.id, ")");
        }
    }

    /* loaded from: classes7.dex */
    public final class RetryUpload extends FilesetUploadViewEvent {
        public static final RetryUpload INSTANCE = new RetryUpload();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryUpload);
        }

        public final int hashCode() {
            return -462082299;
        }

        public final String toString() {
            return "RetryUpload";
        }
    }

    public final class SecondaryButtonClick extends FilesetUploadViewEvent {
        public static final SecondaryButtonClick INSTANCE = new SecondaryButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryButtonClick);
        }

        public final int hashCode() {
            return -728582490;
        }

        public final String toString() {
            return "SecondaryButtonClick";
        }
    }

    /* loaded from: classes7.dex */
    public final class SystemFileSelected extends FilesetUploadViewEvent {
        public final FilePickerResult result;

        public SystemFileSelected(FilePickerResult filePickerResult) {
            filePickerResult.getClass();
            this.result = filePickerResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SystemFileSelected) && Intrinsics.areEqual(this.result, ((SystemFileSelected) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "SystemFileSelected(result=" + this.result + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class UploadingOptionSelected extends FilesetUploadViewEvent {
        public final FilesetUploadOptionsSheetResult selectedOption;

        public UploadingOptionSelected(FilesetUploadOptionsSheetResult filesetUploadOptionsSheetResult) {
            this.selectedOption = filesetUploadOptionsSheetResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadingOptionSelected) && this.selectedOption == ((UploadingOptionSelected) obj).selectedOption;
        }

        public final int hashCode() {
            return this.selectedOption.hashCode();
        }

        public final String toString() {
            return "UploadingOptionSelected(selectedOption=" + this.selectedOption + ")";
        }
    }
}
