package com.squareup.cash.sharesheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShareSheetViewModel {
    public final String failedToShareMessage;
    public final String headerText;
    public final List sharingOptions;
    public final boolean sharingSucceeded;
    public final String sharingSucceededMessage;

    public final class SharingOption {
        public final ShareIcon icon;
        public final boolean loading;
        public final Object target;
        public final String title;

        public SharingOption(String str, ShareIcon shareIcon, boolean z, Object obj) {
            str.getClass();
            this.title = str;
            this.icon = shareIcon;
            this.loading = z;
            this.target = obj;
        }

        public static SharingOption copy$default(SharingOption sharingOption, boolean z) {
            String str = sharingOption.title;
            ShareIcon shareIcon = sharingOption.icon;
            Object obj = sharingOption.target;
            str.getClass();
            return new SharingOption(str, shareIcon, z, obj);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SharingOption)) {
                return false;
            }
            SharingOption sharingOption = (SharingOption) obj;
            return Intrinsics.areEqual(this.title, sharingOption.title) && this.icon == sharingOption.icon && this.loading == sharingOption.loading && this.target.equals(sharingOption.target);
        }

        public final int hashCode() {
            return this.target.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.loading);
        }

        public final String toString() {
            return "SharingOption(title=" + this.title + ", icon=" + this.icon + ", loading=" + this.loading + ", target=" + this.target + ")";
        }
    }

    public ShareSheetViewModel(String str, String str2, String str3, List list, boolean z) {
        str.getClass();
        list.getClass();
        this.headerText = str;
        this.sharingOptions = list;
        this.failedToShareMessage = str2;
        this.sharingSucceededMessage = str3;
        this.sharingSucceeded = z;
    }

    public static ShareSheetViewModel copy$default(ShareSheetViewModel shareSheetViewModel, ArrayList arrayList, String str, int i) {
        String str2 = shareSheetViewModel.headerText;
        String str3 = (i & 4) != 0 ? shareSheetViewModel.failedToShareMessage : "Failed to share";
        if ((i & 8) != 0) {
            str = shareSheetViewModel.sharingSucceededMessage;
        }
        String str4 = str;
        boolean z = (i & 16) != 0 ? shareSheetViewModel.sharingSucceeded : true;
        str2.getClass();
        return new ShareSheetViewModel(str2, str3, str4, arrayList, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareSheetViewModel)) {
            return false;
        }
        ShareSheetViewModel shareSheetViewModel = (ShareSheetViewModel) obj;
        return Intrinsics.areEqual(this.headerText, shareSheetViewModel.headerText) && Intrinsics.areEqual(this.sharingOptions, shareSheetViewModel.sharingOptions) && Intrinsics.areEqual(this.failedToShareMessage, shareSheetViewModel.failedToShareMessage) && Intrinsics.areEqual(this.sharingSucceededMessage, shareSheetViewModel.sharingSucceededMessage) && this.sharingSucceeded == shareSheetViewModel.sharingSucceeded;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.headerText.hashCode() * 31, 31, this.sharingOptions);
        String str = this.failedToShareMessage;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sharingSucceededMessage;
        return Boolean.hashCode(this.sharingSucceeded) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ShareSheetViewModel(headerText=", this.headerText, ", sharingOptions=", ", failedToShareMessage=", this.sharingOptions);
        Boxes$$ExternalSyntheticOutline1.m(m, this.failedToShareMessage, ", sharingSucceededMessage=", this.sharingSucceededMessage, ", sharingSucceeded=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.sharingSucceeded, ")");
    }

    public /* synthetic */ ShareSheetViewModel(String str, List list) {
        this(str, null, null, list, false);
    }
}
