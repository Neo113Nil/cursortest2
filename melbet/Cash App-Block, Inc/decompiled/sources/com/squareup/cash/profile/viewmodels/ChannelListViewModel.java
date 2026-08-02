package com.squareup.cash.profile.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ChannelListViewModel {

    public final class Loaded implements ChannelListViewModel {
        public final Category category;
        public final boolean isLoading;
        public final boolean showPermissionsDialog;
        public final List sponsoredFamilyMembers;

        public Loaded(Category category, boolean z, boolean z2, ArrayList arrayList) {
            this.category = category;
            this.isLoading = z;
            this.showPermissionsDialog = z2;
            this.sponsoredFamilyMembers = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.category.equals(loaded.category) && this.isLoading == loaded.isLoading && this.showPermissionsDialog == loaded.showPermissionsDialog && Intrinsics.areEqual(this.sponsoredFamilyMembers, loaded.sponsoredFamilyMembers);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.category.hashCode() * 31, 31, this.isLoading), 31, this.showPermissionsDialog);
            List list = this.sponsoredFamilyMembers;
            return m + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return "Loaded(category=" + this.category + ", isLoading=" + this.isLoading + ", showPermissionsDialog=" + this.showPermissionsDialog + ", sponsoredFamilyMembers=" + this.sponsoredFamilyMembers + ")";
        }
    }

    public final class Loading implements ChannelListViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1664265945;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
