package com.squareup.cash.family.familyhub.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerLimit;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class DependentControlStatus {

    public final class Error extends DependentControlStatus {
        public final boolean initial;
        public final Loaded previousLoaded;

        public Error(Loaded loaded) {
            this.previousLoaded = loaded;
            this.initial = loaded == null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.previousLoaded, ((Error) obj).previousLoaded);
        }

        public final int hashCode() {
            Loaded loaded = this.previousLoaded;
            if (loaded == null) {
                return 0;
            }
            return loaded.hashCode();
        }

        public final String toString() {
            return "Error(previousLoaded=" + this.previousLoaded + ")";
        }
    }

    public final class InitialLoading extends DependentControlStatus {
        public static final InitialLoading INSTANCE = new InitialLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialLoading);
        }

        public final int hashCode() {
            return 1421615411;
        }

        public final String toString() {
            return "InitialLoading";
        }
    }

    public final class Updating extends DependentControlStatus {
        public final Loaded previousLoaded;

        public Updating(Loaded loaded) {
            this.previousLoaded = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Updating) && Intrinsics.areEqual(this.previousLoaded, ((Updating) obj).previousLoaded);
        }

        public final int hashCode() {
            Loaded loaded = this.previousLoaded;
            if (loaded == null) {
                return 0;
            }
            return loaded.hashCode();
        }

        public final String toString() {
            return "Updating(previousLoaded=" + this.previousLoaded + ")";
        }
    }

    public abstract class Loaded extends DependentControlStatus {

        public final class LoadedBitcoinControl extends Loaded {
            public final boolean controlEnabled;
            public final boolean isMonthlyFrequency;
            public final boolean isOnboarded;
            public final Money limitAmount;
            public final CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency limitFrequency;
            public final String onboardingUrl;

            public LoadedBitcoinControl(boolean z, Money money, CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency frequency, String str) {
                this.controlEnabled = z;
                this.limitAmount = money;
                this.limitFrequency = frequency;
                this.onboardingUrl = str;
                this.isOnboarded = str == null;
                this.isMonthlyFrequency = frequency == CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.MONTHLY;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadedBitcoinControl)) {
                    return false;
                }
                LoadedBitcoinControl loadedBitcoinControl = (LoadedBitcoinControl) obj;
                return this.controlEnabled == loadedBitcoinControl.controlEnabled && Intrinsics.areEqual(this.limitAmount, loadedBitcoinControl.limitAmount) && this.limitFrequency == loadedBitcoinControl.limitFrequency && Intrinsics.areEqual(this.onboardingUrl, loadedBitcoinControl.onboardingUrl);
            }

            @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatus.Loaded
            public final boolean getControlEnabled() {
                return this.controlEnabled;
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.controlEnabled) * 31;
                Money money = this.limitAmount;
                int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
                CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency frequency = this.limitFrequency;
                int hashCode3 = (hashCode2 + (frequency == null ? 0 : frequency.hashCode())) * 31;
                String str = this.onboardingUrl;
                return hashCode3 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                return "LoadedBitcoinControl(controlEnabled=" + this.controlEnabled + ", limitAmount=" + this.limitAmount + ", limitFrequency=" + this.limitFrequency + ", onboardingUrl=" + this.onboardingUrl + ")";
            }
        }

        public final class LoadedNonLimitControl extends Loaded {
            public final boolean controlEnabled;
            public final Boolean isActivated;

            public LoadedNonLimitControl(Boolean bool, boolean z) {
                this.controlEnabled = z;
                this.isActivated = bool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadedNonLimitControl)) {
                    return false;
                }
                LoadedNonLimitControl loadedNonLimitControl = (LoadedNonLimitControl) obj;
                return this.controlEnabled == loadedNonLimitControl.controlEnabled && Intrinsics.areEqual(this.isActivated, loadedNonLimitControl.isActivated);
            }

            @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatus.Loaded
            public final boolean getControlEnabled() {
                return this.controlEnabled;
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.controlEnabled) * 31;
                Boolean bool = this.isActivated;
                return hashCode + (bool == null ? 0 : bool.hashCode());
            }

            public final String toString() {
                return "LoadedNonLimitControl(controlEnabled=" + this.controlEnabled + ", isActivated=" + this.isActivated + ")";
            }
        }

        public final class LoadedP2PControl extends Loaded {
            public final boolean controlEnabled;
            public final Money currentLimit;
            public final List limitPresets;
            public final Money maxLimit;
            public final Money remainingUsage;

            public LoadedP2PControl(boolean z, List list, Money money, Money money2, Money money3) {
                list.getClass();
                this.controlEnabled = z;
                this.limitPresets = list;
                this.currentLimit = money;
                this.maxLimit = money2;
                this.remainingUsage = money3;
            }

            public static LoadedP2PControl copy$default(LoadedP2PControl loadedP2PControl, boolean z, Money money, int i) {
                if ((i & 1) != 0) {
                    z = loadedP2PControl.controlEnabled;
                }
                boolean z2 = z;
                List list = loadedP2PControl.limitPresets;
                if ((i & 4) != 0) {
                    money = loadedP2PControl.currentLimit;
                }
                Money money2 = loadedP2PControl.maxLimit;
                Money money3 = loadedP2PControl.remainingUsage;
                list.getClass();
                return new LoadedP2PControl(z2, list, money, money2, money3);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadedP2PControl)) {
                    return false;
                }
                LoadedP2PControl loadedP2PControl = (LoadedP2PControl) obj;
                return this.controlEnabled == loadedP2PControl.controlEnabled && Intrinsics.areEqual(this.limitPresets, loadedP2PControl.limitPresets) && Intrinsics.areEqual(this.currentLimit, loadedP2PControl.currentLimit) && this.maxLimit.equals(loadedP2PControl.maxLimit) && Intrinsics.areEqual(this.remainingUsage, loadedP2PControl.remainingUsage);
            }

            @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatus.Loaded
            public final boolean getControlEnabled() {
                return this.controlEnabled;
            }

            public final int hashCode() {
                int m = Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.controlEnabled) * 31, 31, this.limitPresets);
                Money money = this.currentLimit;
                int m2 = NavAction$$ExternalSyntheticOutline0.m(this.maxLimit, (m + (money == null ? 0 : money.hashCode())) * 31, 31);
                Money money2 = this.remainingUsage;
                return m2 + (money2 != null ? money2.hashCode() : 0);
            }

            public final String toString() {
                return "LoadedP2PControl(controlEnabled=" + this.controlEnabled + ", limitPresets=" + this.limitPresets + ", currentLimit=" + this.currentLimit + ", maxLimit=" + this.maxLimit + ", remainingUsage=" + this.remainingUsage + ")";
            }
        }

        public final class LoadedPromotionControl extends Loaded {
            public final boolean controlEnabled;
            public final boolean controlVisible;
            public final String onboardingUrl;

            public LoadedPromotionControl(String str, boolean z, boolean z2) {
                this.controlEnabled = z;
                this.controlVisible = z2;
                this.onboardingUrl = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadedPromotionControl)) {
                    return false;
                }
                LoadedPromotionControl loadedPromotionControl = (LoadedPromotionControl) obj;
                return this.controlEnabled == loadedPromotionControl.controlEnabled && this.controlVisible == loadedPromotionControl.controlVisible && Intrinsics.areEqual(this.onboardingUrl, loadedPromotionControl.onboardingUrl);
            }

            @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatus.Loaded
            public final boolean getControlEnabled() {
                return this.controlEnabled;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.controlEnabled) * 31, 31, this.controlVisible);
                String str = this.onboardingUrl;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("LoadedPromotionControl(controlEnabled=", ", controlVisible=", ", onboardingUrl=", this.controlEnabled, this.controlVisible), this.onboardingUrl, ")");
            }
        }

        public final class LoadedStockControl extends Loaded {
            public final boolean controlEnabled;
            public final boolean isMonthlyFrequency;
            public final boolean isOnboarded;
            public final Money limitAmount;
            public final CustomerLimit.Frequency limitFrequency;
            public final String onboardingUrl;

            public LoadedStockControl(boolean z, Money money, CustomerLimit.Frequency frequency, String str) {
                this.controlEnabled = z;
                this.limitAmount = money;
                this.limitFrequency = frequency;
                this.onboardingUrl = str;
                this.isOnboarded = str == null;
                this.isMonthlyFrequency = frequency == CustomerLimit.Frequency.FREQUENCY_MONTHLY;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadedStockControl)) {
                    return false;
                }
                LoadedStockControl loadedStockControl = (LoadedStockControl) obj;
                return this.controlEnabled == loadedStockControl.controlEnabled && Intrinsics.areEqual(this.limitAmount, loadedStockControl.limitAmount) && this.limitFrequency == loadedStockControl.limitFrequency && Intrinsics.areEqual(this.onboardingUrl, loadedStockControl.onboardingUrl);
            }

            @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatus.Loaded
            public final boolean getControlEnabled() {
                return this.controlEnabled;
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.controlEnabled) * 31;
                Money money = this.limitAmount;
                int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
                CustomerLimit.Frequency frequency = this.limitFrequency;
                int hashCode3 = (hashCode2 + (frequency == null ? 0 : frequency.hashCode())) * 31;
                String str = this.onboardingUrl;
                return hashCode3 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                return "LoadedStockControl(controlEnabled=" + this.controlEnabled + ", limitAmount=" + this.limitAmount + ", limitFrequency=" + this.limitFrequency + ", onboardingUrl=" + this.onboardingUrl + ")";
            }
        }

        public abstract boolean getControlEnabled();

        public final class LoadedCardControl extends Loaded {
            public final boolean controlEnabled;
            public final Money currentLimit;
            public final boolean isActivated;
            public final List limitPresets;
            public final Money maxLimit;
            public final Money remainingUsage;
            public final List sponseeTags;

            public LoadedCardControl(boolean z, List list, Money money, Money money2, Money money3, boolean z2, List list2) {
                list.getClass();
                list2.getClass();
                this.controlEnabled = z;
                this.limitPresets = list;
                this.currentLimit = money;
                this.maxLimit = money2;
                this.remainingUsage = money3;
                this.isActivated = z2;
                this.sponseeTags = list2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
            public static LoadedCardControl copy$default(LoadedCardControl loadedCardControl, boolean z, Money money, ArrayList arrayList, int i) {
                if ((i & 1) != 0) {
                    z = loadedCardControl.controlEnabled;
                }
                boolean z2 = z;
                List list = loadedCardControl.limitPresets;
                if ((i & 4) != 0) {
                    money = loadedCardControl.currentLimit;
                }
                Money money2 = money;
                Money money3 = loadedCardControl.maxLimit;
                Money money4 = loadedCardControl.remainingUsage;
                boolean z3 = loadedCardControl.isActivated;
                ArrayList arrayList2 = arrayList;
                if ((i & 64) != 0) {
                    arrayList2 = loadedCardControl.sponseeTags;
                }
                ArrayList arrayList3 = arrayList2;
                list.getClass();
                arrayList3.getClass();
                return new LoadedCardControl(z2, list, money2, money3, money4, z3, arrayList3);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadedCardControl)) {
                    return false;
                }
                LoadedCardControl loadedCardControl = (LoadedCardControl) obj;
                return this.controlEnabled == loadedCardControl.controlEnabled && Intrinsics.areEqual(this.limitPresets, loadedCardControl.limitPresets) && Intrinsics.areEqual(this.currentLimit, loadedCardControl.currentLimit) && Intrinsics.areEqual(this.maxLimit, loadedCardControl.maxLimit) && Intrinsics.areEqual(this.remainingUsage, loadedCardControl.remainingUsage) && this.isActivated == loadedCardControl.isActivated && Intrinsics.areEqual(this.sponseeTags, loadedCardControl.sponseeTags);
            }

            @Override // com.squareup.cash.family.familyhub.backend.api.DependentControlStatus.Loaded
            public final boolean getControlEnabled() {
                return this.controlEnabled;
            }

            public final int hashCode() {
                int m = Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.controlEnabled) * 31, 31, this.limitPresets);
                Money money = this.currentLimit;
                int hashCode = (m + (money == null ? 0 : money.hashCode())) * 31;
                Money money2 = this.maxLimit;
                int hashCode2 = (hashCode + (money2 == null ? 0 : money2.hashCode())) * 31;
                Money money3 = this.remainingUsage;
                return this.sponseeTags.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (money3 != null ? money3.hashCode() : 0)) * 31, 31, this.isActivated);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadedCardControl(controlEnabled=");
                sb.append(this.controlEnabled);
                sb.append(", limitPresets=");
                sb.append(this.limitPresets);
                sb.append(", currentLimit=");
                sb.append(this.currentLimit);
                sb.append(", maxLimit=");
                sb.append(this.maxLimit);
                sb.append(", remainingUsage=");
                sb.append(this.remainingUsage);
                sb.append(", isActivated=");
                sb.append(this.isActivated);
                sb.append(", sponseeTags=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.sponseeTags, ")");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public LoadedCardControl(int i, List list, boolean z, boolean z2) {
                this(z, r2, null, null, null, z2, (i & 64) != 0 ? r2 : list);
                EmptyList emptyList = EmptyList.INSTANCE;
            }
        }
    }
}
