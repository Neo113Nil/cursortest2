package com.squareup.cash.earnings.applets.viewmodels;

import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarnerAppletTileModel {

    public final class Hidden implements EarnerAppletTileModel {
        public static final Hidden INSTANCE = new Hidden();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public final int hashCode() {
            return -546075821;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    public final class Installed implements EarnerAppletTileModel {
        public final String clientRoute;
        public final StackedAvatarViewModel streamAvatars;
        public final String subtitle;
        public final String title;

        public Installed(String str, String str2, String str3, StackedAvatarViewModel stackedAvatarViewModel) {
            this.title = str;
            this.subtitle = str2;
            this.clientRoute = str3;
            this.streamAvatars = stackedAvatarViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return Intrinsics.areEqual(this.title, installed.title) && Intrinsics.areEqual(this.subtitle, installed.subtitle) && Intrinsics.areEqual(this.clientRoute, installed.clientRoute) && Intrinsics.areEqual(this.streamAvatars, installed.streamAvatars);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.clientRoute;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            StackedAvatarViewModel stackedAvatarViewModel = this.streamAvatars;
            return hashCode3 + (stackedAvatarViewModel != null ? stackedAvatarViewModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Installed(title=", this.title, ", subtitle=", this.subtitle, ", clientRoute=");
            m.append(this.clientRoute);
            m.append(", streamAvatars=");
            m.append(this.streamAvatars);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements EarnerAppletTileModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -324425549;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Uninstalled implements EarnerAppletTileModel {
        public final String clientRoute;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, String str3) {
            this.title = str;
            this.subtitle = str2;
            this.clientRoute = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.title, uninstalled.title) && Intrinsics.areEqual(this.subtitle, uninstalled.subtitle) && Intrinsics.areEqual(this.clientRoute, uninstalled.clientRoute);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.clientRoute;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", clientRoute="), this.clientRoute, ")");
        }
    }
}
