package com.squareup.cash.family.applets.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface FamilyAppletTileViewModel {

    public interface ActivityType {

        public final class DependentNames implements ActivityType {
            public final String names;

            public DependentNames(String str) {
                str.getClass();
                this.names = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DependentNames) && Intrinsics.areEqual(this.names, ((DependentNames) obj).names);
            }

            public final int hashCode() {
                return this.names.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentNames(names=", this.names, ")");
            }
        }

        public final class LastActive implements ActivityType {
            public final String date;

            public LastActive(String str) {
                str.getClass();
                this.date = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LastActive) && Intrinsics.areEqual(this.date, ((LastActive) obj).date);
            }

            public final int hashCode() {
                return this.date.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LastActive(date=", this.date, ")");
            }
        }

        public final class NoActivity implements ActivityType {
            public static final NoActivity INSTANCE = new NoActivity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoActivity);
            }

            public final int hashCode() {
                return 362198637;
            }

            public final String toString() {
                return "NoActivity";
            }
        }
    }

    public interface Installed extends FamilyAppletTileViewModel {
        List getAvatars();

        String getTitle();
    }

    public final class InstalledWithActivity implements Installed {
        public final ActivityType activityType;
        public final List avatars;
        public final String description;
        public final String title;

        public InstalledWithActivity(String str, List list, String str2, ActivityType activityType) {
            list.getClass();
            this.title = str;
            this.avatars = list;
            this.description = str2;
            this.activityType = activityType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstalledWithActivity)) {
                return false;
            }
            InstalledWithActivity installedWithActivity = (InstalledWithActivity) obj;
            return this.title.equals(installedWithActivity.title) && Intrinsics.areEqual(this.avatars, installedWithActivity.avatars) && Intrinsics.areEqual(this.description, installedWithActivity.description) && this.activityType.equals(installedWithActivity.activityType);
        }

        @Override // com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel.Installed
        public final List getAvatars() {
            return this.avatars;
        }

        @Override // com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel.Installed
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.avatars);
            String str = this.description;
            return this.activityType.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("InstalledWithActivity(title=", this.title, ", avatars=", ", description=", this.avatars);
            m.append(this.description);
            m.append(", activityType=");
            m.append(this.activityType);
            m.append(")");
            return m.toString();
        }
    }

    public final class InstalledWithoutActivity implements Installed {
        public final List avatars;
        public final String title;

        public InstalledWithoutActivity(String str, List list) {
            list.getClass();
            this.title = str;
            this.avatars = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstalledWithoutActivity)) {
                return false;
            }
            InstalledWithoutActivity installedWithoutActivity = (InstalledWithoutActivity) obj;
            return this.title.equals(installedWithoutActivity.title) && Intrinsics.areEqual(this.avatars, installedWithoutActivity.avatars);
        }

        @Override // com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel.Installed
        public final List getAvatars() {
            return this.avatars;
        }

        @Override // com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel.Installed
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.avatars.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("InstalledWithoutActivity(title=", this.title, ", avatars=", ")", this.avatars);
        }
    }

    public final class Loading implements FamilyAppletTileViewModel {
        public final String title;

        public Loading(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.title, ((Loading) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(title=", this.title, ")");
        }
    }

    public final class Uninstalled implements FamilyAppletTileViewModel {
        public final PromotedAppletTileViewModel.Loaded promotedModel;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, PromotedAppletTileViewModel.Loaded loaded) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
            this.promotedModel = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.title, uninstalled.title) && Intrinsics.areEqual(this.subtitle, uninstalled.subtitle) && Intrinsics.areEqual(this.promotedModel, uninstalled.promotedModel);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            PromotedAppletTileViewModel.Loaded loaded = this.promotedModel;
            return m + (loaded == null ? 0 : loaded.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", promotedModel=");
            m.append(this.promotedModel);
            m.append(")");
            return m.toString();
        }
    }
}
