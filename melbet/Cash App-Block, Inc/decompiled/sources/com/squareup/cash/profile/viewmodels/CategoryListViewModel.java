package com.squareup.cash.profile.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface CategoryListViewModel {

    public final class Loaded implements CategoryListViewModel {
        public final Category category;
        public final boolean isLoading;
        public final NotificationPageHeaderViewModel pageHeader;
        public final boolean showPermissionsDialog;
        public final String titleBarText;

        public Loaded(Category category, boolean z, boolean z2, String str, NotificationPageHeaderViewModel notificationPageHeaderViewModel) {
            notificationPageHeaderViewModel.getClass();
            this.category = category;
            this.isLoading = z;
            this.showPermissionsDialog = z2;
            this.titleBarText = str;
            this.pageHeader = notificationPageHeaderViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.category.equals(loaded.category) && this.isLoading == loaded.isLoading && this.showPermissionsDialog == loaded.showPermissionsDialog && Intrinsics.areEqual(this.titleBarText, loaded.titleBarText) && Intrinsics.areEqual(this.pageHeader, loaded.pageHeader);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.category.hashCode() * 31, 31, this.isLoading), 31, this.showPermissionsDialog);
            String str = this.titleBarText;
            return this.pageHeader.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(category=");
            sb.append(this.category);
            sb.append(", isLoading=");
            sb.append(this.isLoading);
            sb.append(", showPermissionsDialog=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.showPermissionsDialog, ", titleBarText=", this.titleBarText, ", pageHeader=");
            sb.append(this.pageHeader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class Loading implements CategoryListViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1080026606;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
