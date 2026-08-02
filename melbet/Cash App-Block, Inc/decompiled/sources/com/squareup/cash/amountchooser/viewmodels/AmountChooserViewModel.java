package com.squareup.cash.amountchooser.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AmountChooserViewModel {

    /* loaded from: classes7.dex */
    public final class Loading extends AmountChooserViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1270674641;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes7.dex */
    public final class Content extends AmountChooserViewModel {
        public final List amountSelectorOptions;
        public final AmountChooserConfigButtonModel configButton;
        public final CurrencyCode currencyCode;
        public final AmountChooserActionButtonModel primaryButton;
        public final String rawAmount;
        public final AmountChooserActionButtonModel secondaryButton;
        public final boolean shouldExpand;
        public final Versioned shouldShakeAmount;
        public final String subtitle;
        public final String title;

        public final class AmountChooserConfigButtonModel {
            public final String label;

            public AmountChooserConfigButtonModel(String str) {
                this.label = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AmountChooserConfigButtonModel) && this.label.equals(((AmountChooserConfigButtonModel) obj).label);
            }

            public final int hashCode() {
                return this.label.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmountChooserConfigButtonModel(label=", this.label, ")");
            }
        }

        public Content(String str, String str2, String str3, List list, AmountChooserConfigButtonModel amountChooserConfigButtonModel, AmountChooserActionButtonModel amountChooserActionButtonModel, AmountChooserActionButtonModel amountChooserActionButtonModel2, CurrencyCode currencyCode, boolean z, Versioned versioned) {
            str.getClass();
            str3.getClass();
            list.getClass();
            currencyCode.getClass();
            versioned.getClass();
            this.title = str;
            this.subtitle = str2;
            this.rawAmount = str3;
            this.amountSelectorOptions = list;
            this.configButton = amountChooserConfigButtonModel;
            this.primaryButton = amountChooserActionButtonModel;
            this.secondaryButton = amountChooserActionButtonModel2;
            this.currencyCode = currencyCode;
            this.shouldExpand = z;
            this.shouldShakeAmount = versioned;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((AmountSelectorOption) obj).isSelected()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.subtitle, content.subtitle) && Intrinsics.areEqual(this.rawAmount, content.rawAmount) && Intrinsics.areEqual(this.amountSelectorOptions, content.amountSelectorOptions) && Intrinsics.areEqual(this.configButton, content.configButton) && Intrinsics.areEqual(this.primaryButton, content.primaryButton) && Intrinsics.areEqual(this.secondaryButton, content.secondaryButton) && this.currencyCode == content.currencyCode && this.shouldExpand == content.shouldExpand && Intrinsics.areEqual(this.shouldShakeAmount, content.shouldShakeAmount);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.rawAmount), 31, this.amountSelectorOptions);
            AmountChooserConfigButtonModel amountChooserConfigButtonModel = this.configButton;
            int hashCode2 = (m + (amountChooserConfigButtonModel == null ? 0 : amountChooserConfigButtonModel.label.hashCode())) * 31;
            AmountChooserActionButtonModel amountChooserActionButtonModel = this.primaryButton;
            int hashCode3 = (hashCode2 + (amountChooserActionButtonModel == null ? 0 : amountChooserActionButtonModel.hashCode())) * 31;
            AmountChooserActionButtonModel amountChooserActionButtonModel2 = this.secondaryButton;
            return this.shouldShakeAmount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.currencyCode.hashCode() + ((hashCode3 + (amountChooserActionButtonModel2 != null ? amountChooserActionButtonModel2.hashCode() : 0)) * 31)) * 31, 31, this.shouldExpand);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", subtitle=", this.subtitle, ", rawAmount=");
            NavAction$$ExternalSyntheticOutline0.m(this.rawAmount, ", amountSelectorOptions=", ", configButton=", m, this.amountSelectorOptions);
            m.append(this.configButton);
            m.append(", primaryButton=");
            m.append(this.primaryButton);
            m.append(", secondaryButton=");
            m.append(this.secondaryButton);
            m.append(", currencyCode=");
            m.append(this.currencyCode);
            m.append(", shouldExpand=");
            m.append(this.shouldExpand);
            m.append(", shouldShakeAmount=");
            m.append(this.shouldShakeAmount);
            m.append(")");
            return m.toString();
        }

        public final class AmountChooserActionButtonModel {
            public final boolean isDestructive;
            public final boolean isEnabled;
            public final String text;

            public AmountChooserActionButtonModel(String str, boolean z, boolean z2) {
                str.getClass();
                this.text = str;
                this.isEnabled = z;
                this.isDestructive = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AmountChooserActionButtonModel)) {
                    return false;
                }
                AmountChooserActionButtonModel amountChooserActionButtonModel = (AmountChooserActionButtonModel) obj;
                return Intrinsics.areEqual(this.text, amountChooserActionButtonModel.text) && this.isEnabled == amountChooserActionButtonModel.isEnabled && this.isDestructive == amountChooserActionButtonModel.isDestructive;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isDestructive) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.isEnabled);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("AmountChooserActionButtonModel(text=", this.text, ", isEnabled=", ", isDestructive=", this.isEnabled), this.isDestructive, ")");
            }

            public /* synthetic */ AmountChooserActionButtonModel(String str, int i) {
                this(str, true, false);
            }
        }
    }
}
