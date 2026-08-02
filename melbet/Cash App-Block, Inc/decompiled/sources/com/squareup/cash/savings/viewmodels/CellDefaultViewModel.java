package com.squareup.cash.savings.viewmodels;

import app.cash.arcade.values.ButtonProminence;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CellDefaultViewModel {
    public final Accessory accessory;
    public final SavingsScreenViewEvent action;
    public final String body;
    public final Icon icon;
    public final String label;

    public interface Accessory {

        public final class CompactButton implements Accessory {
            public final ButtonProminence.Id prominence;
            public final String text;

            public CompactButton(String str, ButtonProminence.Id id) {
                id.getClass();
                this.text = str;
                this.prominence = id;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CompactButton)) {
                    return false;
                }
                CompactButton compactButton = (CompactButton) obj;
                return this.text.equals(compactButton.text) && Intrinsics.areEqual(this.prominence, compactButton.prominence);
            }

            public final int hashCode() {
                return Integer.hashCode(this.prominence.id) + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return "CompactButton(text=" + this.text + ", prominence=" + this.prominence + ")";
            }
        }

        public final class Label implements Accessory {
            public final String text;

            public Label(String str) {
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Label) && this.text.equals(((Label) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Label(text=", this.text, ")");
            }
        }

        public final class LabeledPush implements Accessory {
            public final String text;
            public final ColorModel textColor;

            public LabeledPush(String str, ColorModel.Accented accented) {
                this.text = str;
                this.textColor = accented;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LabeledPush)) {
                    return false;
                }
                LabeledPush labeledPush = (LabeledPush) obj;
                return this.text.equals(labeledPush.text) && Intrinsics.areEqual(this.textColor, labeledPush.textColor);
            }

            public final int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                ColorModel colorModel = this.textColor;
                return hashCode + (colorModel == null ? 0 : colorModel.hashCode());
            }

            public final String toString() {
                return "LabeledPush(text=" + this.text + ", textColor=" + this.textColor + ")";
            }
        }

        public final class Push implements Accessory {
            public static final Push INSTANCE = new Push();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Push);
            }

            public final int hashCode() {
                return 1721453447;
            }

            public final String toString() {
                return "Push";
            }
        }
    }

    public interface Icon {

        public final class DefaultIcon implements Icon {
            public final com.squareup.protos.cash.ui.Icon icon;

            public DefaultIcon(com.squareup.protos.cash.ui.Icon icon) {
                icon.getClass();
                this.icon = icon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DefaultIcon) && Intrinsics.areEqual(this.icon, ((DefaultIcon) obj).icon);
            }

            @Override // com.squareup.cash.savings.viewmodels.CellDefaultViewModel.Icon
            public final com.squareup.protos.cash.ui.Icon getIcon() {
                return this.icon;
            }

            public final int hashCode() {
                return this.icon.hashCode();
            }

            public final String toString() {
                return "DefaultIcon(icon=" + this.icon + ")";
            }
        }

        public final class TintedIcon implements Icon {
            public final ColorModel.Accented backgroundTint;
            public final com.squareup.protos.cash.ui.Icon icon;
            public final ColorModel tint;

            public TintedIcon(com.squareup.protos.cash.ui.Icon icon, ColorModel.Accented accented, ColorModel.Accented accented2) {
                this.icon = icon;
                this.backgroundTint = accented;
                this.tint = accented2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TintedIcon)) {
                    return false;
                }
                TintedIcon tintedIcon = (TintedIcon) obj;
                return this.icon.equals(tintedIcon.icon) && this.backgroundTint.equals(tintedIcon.backgroundTint) && Intrinsics.areEqual(this.tint, tintedIcon.tint);
            }

            @Override // com.squareup.cash.savings.viewmodels.CellDefaultViewModel.Icon
            public final com.squareup.protos.cash.ui.Icon getIcon() {
                return this.icon;
            }

            public final int hashCode() {
                int m = SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundTint.color, this.icon.hashCode() * 31, 31);
                ColorModel colorModel = this.tint;
                return m + (colorModel == null ? 0 : colorModel.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TintedIcon(icon=");
                sb.append(this.icon);
                sb.append(", backgroundTint=");
                sb.append(this.backgroundTint);
                sb.append(", tint=");
                return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.tint, ")");
            }
        }

        com.squareup.protos.cash.ui.Icon getIcon();
    }

    public CellDefaultViewModel(String str, String str2, Icon icon, Accessory accessory, SavingsScreenViewEvent.Clicked clicked) {
        this.label = str;
        this.body = str2;
        this.icon = icon;
        this.accessory = accessory;
        this.action = clicked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellDefaultViewModel)) {
            return false;
        }
        CellDefaultViewModel cellDefaultViewModel = (CellDefaultViewModel) obj;
        return this.label.equals(cellDefaultViewModel.label) && Intrinsics.areEqual(this.body, cellDefaultViewModel.body) && Intrinsics.areEqual(this.icon, cellDefaultViewModel.icon) && Intrinsics.areEqual(this.accessory, cellDefaultViewModel.accessory) && Intrinsics.areEqual(this.action, cellDefaultViewModel.action);
    }

    public final int hashCode() {
        int hashCode = this.label.hashCode() * 31;
        String str = this.body;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        Accessory accessory = this.accessory;
        int hashCode4 = (hashCode3 + (accessory == null ? 0 : accessory.hashCode())) * 31;
        SavingsScreenViewEvent savingsScreenViewEvent = this.action;
        return hashCode4 + (savingsScreenViewEvent != null ? savingsScreenViewEvent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CellDefaultViewModel(label=", this.label, ", body=", this.body, ", icon=");
        m.append(this.icon);
        m.append(", accessory=");
        m.append(this.accessory);
        m.append(", action=");
        m.append(this.action);
        m.append(")");
        return m.toString();
    }
}
