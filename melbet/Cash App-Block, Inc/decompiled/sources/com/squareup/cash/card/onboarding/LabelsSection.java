package com.squareup.cash.card.onboarding;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LabelsSection implements ProductDetailsPageSection {
    public final List labels;

    public final class Label {
        public final String text;
        public final LabelTreatment treatment;

        public Label(String str, LabelTreatment labelTreatment) {
            this.text = str;
            this.treatment = labelTreatment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Label)) {
                return false;
            }
            Label label = (Label) obj;
            return this.text.equals(label.text) && Intrinsics.areEqual(this.treatment, label.treatment);
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            LabelTreatment labelTreatment = this.treatment;
            return hashCode + (labelTreatment == null ? 0 : labelTreatment.hashCode());
        }

        public final String toString() {
            return "Label(text=" + this.text + ", treatment=" + this.treatment + ")";
        }
    }

    public final class LabelTreatment {
        public final Color backgroundColor;
        public final Color borderColor;
        public final Color textColor;

        public LabelTreatment(Color color, Color color2, Color color3) {
            this.backgroundColor = color;
            this.textColor = color2;
            this.borderColor = color3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LabelTreatment)) {
                return false;
            }
            LabelTreatment labelTreatment = (LabelTreatment) obj;
            return Intrinsics.areEqual(this.backgroundColor, labelTreatment.backgroundColor) && Intrinsics.areEqual(this.textColor, labelTreatment.textColor) && Intrinsics.areEqual(this.borderColor, labelTreatment.borderColor);
        }

        public final int hashCode() {
            Color color = this.backgroundColor;
            int hashCode = (color == null ? 0 : color.hashCode()) * 31;
            Color color2 = this.textColor;
            int hashCode2 = (hashCode + (color2 == null ? 0 : color2.hashCode())) * 31;
            Color color3 = this.borderColor;
            return hashCode2 + (color3 != null ? color3.hashCode() : 0);
        }

        public final String toString() {
            return "LabelTreatment(backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ", borderColor=" + this.borderColor + ")";
        }
    }

    public LabelsSection(List list) {
        list.getClass();
        this.labels = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LabelsSection) && Intrinsics.areEqual(this.labels, ((LabelsSection) obj).labels);
    }

    public final int hashCode() {
        return this.labels.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("LabelsSection(labels=", ")", this.labels);
    }
}
