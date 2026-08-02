package com.squareup.cash.payments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.versioned.Versioned;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface NearbyPayRequestViewModel {

    public final class NotReady implements NearbyPayRequestViewModel {
        public final String buttonLabel;
        public final String disclaimer;
        public final boolean isBluetoothOff;
        public final boolean isError;
        public final String title;

        public NotReady(int i, String str, String str2, String str3, boolean z) {
            str3 = (i & 4) != 0 ? null : str3;
            z = (i & 8) != 0 ? false : z;
            boolean z2 = (i & 16) == 0;
            str.getClass();
            this.title = str;
            this.buttonLabel = str2;
            this.disclaimer = str3;
            this.isBluetoothOff = z;
            this.isError = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotReady)) {
                return false;
            }
            NotReady notReady = (NotReady) obj;
            return Intrinsics.areEqual(this.title, notReady.title) && Intrinsics.areEqual(this.buttonLabel, notReady.buttonLabel) && Intrinsics.areEqual(this.disclaimer, notReady.disclaimer) && this.isBluetoothOff == notReady.isBluetoothOff && this.isError == notReady.isError;
        }

        @Override // com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.buttonLabel;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.disclaimer;
            return Boolean.hashCode(this.isError) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isBluetoothOff);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotReady(title=", this.title, ", buttonLabel=", this.buttonLabel, ", disclaimer=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.disclaimer, ", isBluetoothOff=", this.isBluetoothOff, ", isError=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isError, ")");
        }
    }

    public final class Ready implements NearbyPayRequestViewModel {
        public final List avatars;
        public final int confirmedPaymentCount;
        public final NearbyAvatarInfo currentUserAvatar;
        public final boolean isLoading;
        public final String paidStatusLabel;
        public final List payers;
        public final NearbyPayRequestTab selectedTab;
        public final boolean showHelpLink;
        public final boolean showViewAllPayers;
        public final String title;
        public final Versioned vibrate;

        public Ready(String str, NearbyPayRequestTab nearbyPayRequestTab, List list, NearbyAvatarInfo nearbyAvatarInfo, List list2, String str2, boolean z, boolean z2, int i, Versioned versioned, int i2) {
            list = (i2 & 4) != 0 ? EmptyList.INSTANCE : list;
            nearbyAvatarInfo = (i2 & 8) != 0 ? null : nearbyAvatarInfo;
            boolean z3 = (i2 & 16) == 0;
            list2 = (i2 & 32) != 0 ? EmptyList.INSTANCE : list2;
            str2 = (i2 & 64) != 0 ? null : str2;
            z = (i2 & 128) != 0 ? false : z;
            z2 = (i2 & 512) != 0 ? false : z2;
            i = (i2 & 1024) != 0 ? 0 : i;
            versioned = (i2 & 2048) != 0 ? null : versioned;
            str.getClass();
            nearbyPayRequestTab.getClass();
            list.getClass();
            list2.getClass();
            this.title = str;
            this.selectedTab = nearbyPayRequestTab;
            this.avatars = list;
            this.currentUserAvatar = nearbyAvatarInfo;
            this.isLoading = z3;
            this.payers = list2;
            this.paidStatusLabel = str2;
            this.showViewAllPayers = z;
            this.showHelpLink = z2;
            this.confirmedPaymentCount = i;
            this.vibrate = versioned;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.title, ready.title) && this.selectedTab == ready.selectedTab && this.avatars.equals(ready.avatars) && Intrinsics.areEqual(this.currentUserAvatar, ready.currentUserAvatar) && this.isLoading == ready.isLoading && this.payers.equals(ready.payers) && Intrinsics.areEqual(this.paidStatusLabel, ready.paidStatusLabel) && this.showViewAllPayers == ready.showViewAllPayers && this.showHelpLink == ready.showHelpLink && this.confirmedPaymentCount == ready.confirmedPaymentCount && Intrinsics.areEqual(this.vibrate, ready.vibrate);
        }

        @Override // com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((this.selectedTab.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.avatars);
            NearbyAvatarInfo nearbyAvatarInfo = this.currentUserAvatar;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (nearbyAvatarInfo == null ? 0 : nearbyAvatarInfo.hashCode())) * 31, 31, this.isLoading), 31, this.payers);
            String str = this.paidStatusLabel;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.confirmedPaymentCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showViewAllPayers), 31, false), 31, this.showHelpLink), 31);
            Versioned versioned = this.vibrate;
            return m3 + (versioned != null ? versioned.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(title=");
            sb.append(this.title);
            sb.append(", selectedTab=");
            sb.append(this.selectedTab);
            sb.append(", avatars=");
            sb.append(this.avatars);
            sb.append(", currentUserAvatar=");
            sb.append(this.currentUserAvatar);
            sb.append(", isLoading=");
            sb.append(this.isLoading);
            sb.append(", payers=");
            sb.append(this.payers);
            sb.append(", paidStatusLabel=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.paidStatusLabel, ", showViewAllPayers=", this.showViewAllPayers, ", showViewAllPeople=false, showHelpLink=");
            sb.append(this.showHelpLink);
            sb.append(", confirmedPaymentCount=");
            sb.append(this.confirmedPaymentCount);
            sb.append(", vibrate=");
            sb.append(this.vibrate);
            sb.append(")");
            return sb.toString();
        }
    }

    String getTitle();
}
