package com.squareup.cash.family.familyhub.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FamilyPendingRequestsSection {

    public final class MultiplePendingRequests extends FamilyPendingRequestsSection {
        public final FamilyMultiplePendingRequestsRowModel row;

        public MultiplePendingRequests(FamilyMultiplePendingRequestsRowModel familyMultiplePendingRequestsRowModel) {
            this.row = familyMultiplePendingRequestsRowModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiplePendingRequests) && this.row.equals(((MultiplePendingRequests) obj).row);
        }

        public final int hashCode() {
            return this.row.hashCode();
        }

        public final String toString() {
            return "MultiplePendingRequests(row=" + this.row + ")";
        }
    }

    public final class OnePendingActivity extends FamilyPendingRequestsSection {
        public final UiCallbackModel activityItemUiCallbackModel;
        public final String url;

        public OnePendingActivity(UiCallbackModel uiCallbackModel, String str) {
            this.activityItemUiCallbackModel = uiCallbackModel;
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnePendingActivity)) {
                return false;
            }
            OnePendingActivity onePendingActivity = (OnePendingActivity) obj;
            return this.activityItemUiCallbackModel.equals(onePendingActivity.activityItemUiCallbackModel) && Intrinsics.areEqual(this.url, onePendingActivity.url);
        }

        public final int hashCode() {
            int hashCode = this.activityItemUiCallbackModel.hashCode() * 31;
            String str = this.url;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "OnePendingActivity(activityItemUiCallbackModel=" + this.activityItemUiCallbackModel + ", url=" + this.url + ")";
        }
    }

    public final class OnePendingRequest extends FamilyPendingRequestsSection {
        public final FamilyPendingRequestRowModel row;

        public OnePendingRequest(FamilyPendingRequestRowModel familyPendingRequestRowModel) {
            this.row = familyPendingRequestRowModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnePendingRequest) && this.row.equals(((OnePendingRequest) obj).row);
        }

        public final int hashCode() {
            return this.row.hashCode();
        }

        public final String toString() {
            return "OnePendingRequest(row=" + this.row + ")";
        }
    }
}
