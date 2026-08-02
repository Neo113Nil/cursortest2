package com.squareup.cash.banking.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BetterOverdraftViewModel {

    public final class Loaded implements BetterOverdraftViewModel {
        public final OverdraftHeaderViewModel headerViewModel;
        public final OverdraftLimitsInfo limitsInfo;
        public final String payButtonText;
        public final String subtitle;
        public final String title;
        public final String toggleButtonText;
        public final TurnOffConfirmationSheet turnOffConfirmationSheet;
        public final OverdraftUsageViewModel usageViewModel;

        public final class OverdraftHeaderViewModel {
            public final String linkText;
            public final String title;

            public OverdraftHeaderViewModel(String str, String str2) {
                str.getClass();
                this.title = str;
                this.linkText = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OverdraftHeaderViewModel)) {
                    return false;
                }
                OverdraftHeaderViewModel overdraftHeaderViewModel = (OverdraftHeaderViewModel) obj;
                return Intrinsics.areEqual(this.title, overdraftHeaderViewModel.title) && Intrinsics.areEqual(this.linkText, overdraftHeaderViewModel.linkText);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.linkText;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("OverdraftHeaderViewModel(title=", this.title, ", linkText=", this.linkText, ")");
            }
        }

        public final class OverdraftLimitsInfo {
            public final String body;
            public final List items;
            public final String title;

            public final class OverdraftLimitsInfoItem {
                public final Icon icon;
                public final String text;

                public OverdraftLimitsInfoItem(Icon icon, String str) {
                    str.getClass();
                    this.text = str;
                    this.icon = icon;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OverdraftLimitsInfoItem)) {
                        return false;
                    }
                    OverdraftLimitsInfoItem overdraftLimitsInfoItem = (OverdraftLimitsInfoItem) obj;
                    return Intrinsics.areEqual(this.text, overdraftLimitsInfoItem.text) && this.icon.equals(overdraftLimitsInfoItem.icon);
                }

                public final int hashCode() {
                    return this.icon.hashCode() + (this.text.hashCode() * 31);
                }

                public final String toString() {
                    return "OverdraftLimitsInfoItem(text=" + this.text + ", icon=" + this.icon + ")";
                }
            }

            public OverdraftLimitsInfo(String str, String str2, List list) {
                Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
                this.title = str;
                this.body = str2;
                this.items = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OverdraftLimitsInfo)) {
                    return false;
                }
                OverdraftLimitsInfo overdraftLimitsInfo = (OverdraftLimitsInfo) obj;
                return Intrinsics.areEqual(this.title, overdraftLimitsInfo.title) && Intrinsics.areEqual(this.body, overdraftLimitsInfo.body) && Intrinsics.areEqual(this.items, overdraftLimitsInfo.items);
            }

            public final int hashCode() {
                return this.items.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OverdraftLimitsInfo(title=", this.title, ", body=", this.body, ", items="), this.items, ")");
            }
        }

        public final class OverdraftUsageViewModel {
            public final String remainingAmount;
            public final String subtitle;
            public final float usedPercent;

            public OverdraftUsageViewModel(float f, String str, String str2) {
                str.getClass();
                str2.getClass();
                this.usedPercent = f;
                this.remainingAmount = str;
                this.subtitle = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OverdraftUsageViewModel)) {
                    return false;
                }
                OverdraftUsageViewModel overdraftUsageViewModel = (OverdraftUsageViewModel) obj;
                return Float.compare(this.usedPercent, overdraftUsageViewModel.usedPercent) == 0 && Intrinsics.areEqual(this.remainingAmount, overdraftUsageViewModel.remainingAmount) && Intrinsics.areEqual(this.subtitle, overdraftUsageViewModel.subtitle);
            }

            public final int hashCode() {
                return this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Float.hashCode(this.usedPercent) * 31, 31, this.remainingAmount);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OverdraftUsageViewModel(usedPercent=");
                sb.append(this.usedPercent);
                sb.append(", remainingAmount=");
                sb.append(this.remainingAmount);
                sb.append(", subtitle=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ")");
            }
        }

        public final class TurnOffConfirmationSheet {
            public final String body;
            public final String buttonText;
            public final String title;

            public TurnOffConfirmationSheet(String str, String str2, String str3) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.title = str;
                this.body = str2;
                this.buttonText = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TurnOffConfirmationSheet)) {
                    return false;
                }
                TurnOffConfirmationSheet turnOffConfirmationSheet = (TurnOffConfirmationSheet) obj;
                return Intrinsics.areEqual(this.title, turnOffConfirmationSheet.title) && Intrinsics.areEqual(this.body, turnOffConfirmationSheet.body) && Intrinsics.areEqual(this.buttonText, turnOffConfirmationSheet.buttonText);
            }

            public final int hashCode() {
                return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TurnOffConfirmationSheet(title=", this.title, ", body=", this.body, ", buttonText="), this.buttonText, ")");
            }
        }

        public Loaded(String str, String str2, OverdraftHeaderViewModel overdraftHeaderViewModel, OverdraftUsageViewModel overdraftUsageViewModel, OverdraftLimitsInfo overdraftLimitsInfo, String str3, String str4, TurnOffConfirmationSheet turnOffConfirmationSheet) {
            str.getClass();
            this.title = str;
            this.subtitle = str2;
            this.headerViewModel = overdraftHeaderViewModel;
            this.usageViewModel = overdraftUsageViewModel;
            this.limitsInfo = overdraftLimitsInfo;
            this.payButtonText = str3;
            this.toggleButtonText = str4;
            this.turnOffConfirmationSheet = turnOffConfirmationSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && this.headerViewModel.equals(loaded.headerViewModel) && this.usageViewModel.equals(loaded.usageViewModel) && this.limitsInfo.equals(loaded.limitsInfo) && Intrinsics.areEqual(this.payButtonText, loaded.payButtonText) && Intrinsics.areEqual(this.toggleButtonText, loaded.toggleButtonText) && Intrinsics.areEqual(this.turnOffConfirmationSheet, loaded.turnOffConfirmationSheet);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int hashCode2 = (this.limitsInfo.hashCode() + ((this.usageViewModel.hashCode() + ((this.headerViewModel.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
            String str2 = this.payButtonText;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.toggleButtonText;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TurnOffConfirmationSheet turnOffConfirmationSheet = this.turnOffConfirmationSheet;
            return hashCode4 + (turnOffConfirmationSheet != null ? turnOffConfirmationSheet.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", subtitle=", this.subtitle, ", headerViewModel=");
            m.append(this.headerViewModel);
            m.append(", usageViewModel=");
            m.append(this.usageViewModel);
            m.append(", limitsInfo=");
            m.append(this.limitsInfo);
            m.append(", payButtonText=");
            m.append(this.payButtonText);
            m.append(", toggleButtonText=");
            m.append(this.toggleButtonText);
            m.append(", turnOffConfirmationSheet=");
            m.append(this.turnOffConfirmationSheet);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements BetterOverdraftViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 243040346;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
