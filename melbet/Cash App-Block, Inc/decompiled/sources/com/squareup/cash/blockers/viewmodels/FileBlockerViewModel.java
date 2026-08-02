package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.FileBlocker;
import com.squareup.protos.franklin.api.FileCategory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class FileBlockerViewModel {
    public final FileCategory category;
    public final FileBlocker.FooterIcon footerIcon;
    public final String footerText;
    public final boolean hasCameraPermission;
    public final LoadingState loadingState;
    public final String previewTitle;
    public final boolean showHelpItem;
    public final boolean stopCameraPreview;
    public final String title;

    public final class LoadingState {
        public final boolean delayForSuccessAnimation;
        public final boolean isLoading;

        public LoadingState(boolean z, boolean z2) {
            this.isLoading = z;
            this.delayForSuccessAnimation = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingState)) {
                return false;
            }
            LoadingState loadingState = (LoadingState) obj;
            return this.isLoading == loadingState.isLoading && this.delayForSuccessAnimation == loadingState.delayForSuccessAnimation;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.delayForSuccessAnimation) + (Boolean.hashCode(this.isLoading) * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("LoadingState(isLoading=", ", delayForSuccessAnimation=", ")", this.isLoading, this.delayForSuccessAnimation);
        }
    }

    public FileBlockerViewModel(FileCategory fileCategory, String str, String str2, String str3, FileBlocker.FooterIcon footerIcon, boolean z, LoadingState loadingState, boolean z2, boolean z3) {
        fileCategory.getClass();
        str.getClass();
        this.category = fileCategory;
        this.title = str;
        this.previewTitle = str2;
        this.footerText = str3;
        this.footerIcon = footerIcon;
        this.showHelpItem = z;
        this.loadingState = loadingState;
        this.stopCameraPreview = z2;
        this.hasCameraPermission = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileBlockerViewModel)) {
            return false;
        }
        FileBlockerViewModel fileBlockerViewModel = (FileBlockerViewModel) obj;
        return this.category == fileBlockerViewModel.category && Intrinsics.areEqual(this.title, fileBlockerViewModel.title) && Intrinsics.areEqual(this.previewTitle, fileBlockerViewModel.previewTitle) && Intrinsics.areEqual(this.footerText, fileBlockerViewModel.footerText) && this.footerIcon == fileBlockerViewModel.footerIcon && this.showHelpItem == fileBlockerViewModel.showHelpItem && this.loadingState.equals(fileBlockerViewModel.loadingState) && this.stopCameraPreview == fileBlockerViewModel.stopCameraPreview && this.hasCameraPermission == fileBlockerViewModel.hasCameraPermission;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.category.hashCode() * 31, 31, this.title);
        String str = this.previewTitle;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.footerText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FileBlocker.FooterIcon footerIcon = this.footerIcon;
        return Boolean.hashCode(this.hasCameraPermission) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.loadingState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (footerIcon != null ? footerIcon.hashCode() : 0)) * 31, 31, this.showHelpItem)) * 31, 31, this.stopCameraPreview);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileBlockerViewModel(category=");
        sb.append(this.category);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", previewTitle=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.previewTitle, ", footerText=", this.footerText, ", footerIcon=");
        sb.append(this.footerIcon);
        sb.append(", showHelpItem=");
        sb.append(this.showHelpItem);
        sb.append(", loadingState=");
        sb.append(this.loadingState);
        sb.append(", stopCameraPreview=");
        sb.append(this.stopCameraPreview);
        sb.append(", hasCameraPermission=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasCameraPermission, ")");
    }
}
