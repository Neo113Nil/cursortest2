package com.squareup.cash.sharesheet;

import com.squareup.cash.sharesheet.ShareSheetViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ShareSheetViewEvent {

    public final class Dismiss implements ShareSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -1153580971;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class Share implements ShareSheetViewEvent {
        public final ShareSheetViewModel.SharingOption sharingOption;

        public Share(ShareSheetViewModel.SharingOption sharingOption) {
            sharingOption.getClass();
            this.sharingOption = sharingOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Share) && Intrinsics.areEqual(this.sharingOption, ((Share) obj).sharingOption);
        }

        public final int hashCode() {
            return this.sharingOption.hashCode();
        }

        public final String toString() {
            return "Share(sharingOption=" + this.sharingOption + ")";
        }
    }

    public final class ShareSuccess implements ShareSheetViewEvent {
        public static final ShareSuccess INSTANCE = new ShareSuccess();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareSuccess);
        }

        public final int hashCode() {
            return 1507170361;
        }

        public final String toString() {
            return "ShareSuccess";
        }
    }
}
