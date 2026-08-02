package com.squareup.cash.paychecks.applets.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaychecksAppletTileModel {

    public final class Installed implements PaychecksAppletTileModel {
        public final boolean benefitsActive;
        public final String brief;
        public final String clientRoute;
        public final String emphasis;
        public final String title;

        public Installed(String str, String str2, String str3, String str4, boolean z) {
            str.getClass();
            str3.getClass();
            this.title = str;
            this.emphasis = str2;
            this.brief = str3;
            this.clientRoute = str4;
            this.benefitsActive = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return Intrinsics.areEqual(this.title, installed.title) && Intrinsics.areEqual(this.emphasis, installed.emphasis) && Intrinsics.areEqual(this.brief, installed.brief) && Intrinsics.areEqual(this.clientRoute, installed.clientRoute) && this.benefitsActive == installed.benefitsActive;
        }

        @Override // com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel
        public final String getClientRoute() {
            return this.clientRoute;
        }

        @Override // com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel
        public final boolean getShowAsServiceApplet() {
            return true;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.emphasis;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 961, this.brief);
            String str2 = this.clientRoute;
            return Boolean.hashCode(this.benefitsActive) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 != null ? str2.hashCode() : 0)) * 31, 31, true);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Installed(title=", this.title, ", emphasis=", this.emphasis, ", brief=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.brief, ", startIcon=null, clientRoute=", this.clientRoute, ", showAsServiceApplet=true, benefitsActive=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.benefitsActive, ")");
        }
    }

    public final class Loading implements PaychecksAppletTileModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        @Override // com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel
        public final /* bridge */ /* synthetic */ String getClientRoute() {
            return null;
        }

        @Override // com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel
        public final boolean getShowAsServiceApplet() {
            return false;
        }

        public final int hashCode() {
            return -18672967;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Uninstalled implements PaychecksAppletTileModel {
        public final String clientRoute;
        public final PromotedAppletTileViewModel.Loaded promotedModel;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, String str3, PromotedAppletTileViewModel.Loaded loaded) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
            this.clientRoute = str3;
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
            return Intrinsics.areEqual(this.title, uninstalled.title) && Intrinsics.areEqual(this.subtitle, uninstalled.subtitle) && Intrinsics.areEqual(this.clientRoute, uninstalled.clientRoute) && Intrinsics.areEqual(this.promotedModel, uninstalled.promotedModel);
        }

        @Override // com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel
        public final String getClientRoute() {
            return this.clientRoute;
        }

        @Override // com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel
        public final boolean getShowAsServiceApplet() {
            return true;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            String str = this.clientRoute;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, true);
            PromotedAppletTileViewModel.Loaded loaded = this.promotedModel;
            return m2 + (loaded != null ? loaded.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", clientRoute=");
            m.append(this.clientRoute);
            m.append(", showAsServiceApplet=true, promotedModel=");
            m.append(this.promotedModel);
            m.append(")");
            return m.toString();
        }
    }

    String getClientRoute();

    boolean getShowAsServiceApplet();
}
