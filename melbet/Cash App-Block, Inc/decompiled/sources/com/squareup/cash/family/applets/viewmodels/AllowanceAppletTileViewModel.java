package com.squareup.cash.family.applets.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface AllowanceAppletTileViewModel {

    public final class Failure implements AllowanceAppletTileViewModel {
        public final String title;

        public Failure(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.title, ((Failure) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(title=", this.title, ")");
        }
    }

    public final class Installed implements AllowanceAppletTileViewModel {
        public final Allowance allowance;
        public final String title;

        public Installed(String str, Allowance allowance) {
            str.getClass();
            this.title = str;
            this.allowance = allowance;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return Intrinsics.areEqual(this.title, installed.title) && this.allowance.equals(installed.allowance);
        }

        public final int hashCode() {
            return this.allowance.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "Installed(title=" + this.title + ", allowance=" + this.allowance + ")";
        }
    }

    public final class Loading implements AllowanceAppletTileViewModel {
        public final String contentDescription;
        public final String title;

        public Loading(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.contentDescription = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return Intrinsics.areEqual(this.title, loading.title) && Intrinsics.areEqual(this.contentDescription, loading.contentDescription);
        }

        public final int hashCode() {
            return this.contentDescription.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Loading(title=", this.title, ", contentDescription=", this.contentDescription, ")");
        }
    }

    public final class Uninstalled implements AllowanceAppletTileViewModel {
        public final String initializationUrl;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
            this.initializationUrl = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.title, uninstalled.title) && Intrinsics.areEqual(this.subtitle, uninstalled.subtitle) && Intrinsics.areEqual(this.initializationUrl, uninstalled.initializationUrl);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            String str = this.initializationUrl;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", initializationUrl="), this.initializationUrl, ")");
        }
    }
}
