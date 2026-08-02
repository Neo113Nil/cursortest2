package com.squareup.cash.borrow.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BorrowLimitHubViewModel {
    public final List sections;
    public final String title;

    public final class CtaBullet {
        public final Accessory accessory;
        public final String actionUrl;
        public final String body;
        public final Icon icon;
        public final String title;

        public interface Accessory {

            public final class Label implements Accessory {
                public final String text;

                public Label(String str) {
                    str.getClass();
                    this.text = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Label) && Intrinsics.areEqual(this.text, ((Label) obj).text);
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

                public LabeledPush(String str) {
                    str.getClass();
                    this.text = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof LabeledPush) && Intrinsics.areEqual(this.text, ((LabeledPush) obj).text);
                }

                public final int hashCode() {
                    return this.text.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LabeledPush(text=", this.text, ")");
                }
            }

            public final class Push implements Accessory {
                public static final Push INSTANCE = new Push();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Push);
                }

                public final int hashCode() {
                    return 517097283;
                }

                public final String toString() {
                    return "Push";
                }
            }
        }

        public CtaBullet(Icon icon, String str, String str2, Accessory accessory, String str3) {
            str.getClass();
            this.icon = icon;
            this.title = str;
            this.body = str2;
            this.accessory = accessory;
            this.actionUrl = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CtaBullet)) {
                return false;
            }
            CtaBullet ctaBullet = (CtaBullet) obj;
            return Intrinsics.areEqual(this.icon, ctaBullet.icon) && Intrinsics.areEqual(this.title, ctaBullet.title) && Intrinsics.areEqual(this.body, ctaBullet.body) && Intrinsics.areEqual(this.accessory, ctaBullet.accessory) && Intrinsics.areEqual(this.actionUrl, ctaBullet.actionUrl);
        }

        public final int hashCode() {
            Icon icon = this.icon;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((icon == null ? 0 : icon.hashCode()) * 31, 31, this.title);
            String str = this.body;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            Accessory accessory = this.accessory;
            int hashCode2 = (hashCode + (accessory == null ? 0 : accessory.hashCode())) * 31;
            String str2 = this.actionUrl;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CtaBullet(icon=");
            sb.append(this.icon);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", body=");
            sb.append(this.body);
            sb.append(", accessory=");
            sb.append(this.accessory);
            sb.append(", actionUrl=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.actionUrl, ")");
        }
    }

    public final class InfoBullet {
        public final Icon icon;
        public final String text;

        public InfoBullet(Icon icon, String str) {
            icon.getClass();
            str.getClass();
            this.icon = icon;
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoBullet)) {
                return false;
            }
            InfoBullet infoBullet = (InfoBullet) obj;
            return Intrinsics.areEqual(this.icon, infoBullet.icon) && Intrinsics.areEqual(this.text, infoBullet.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.icon.hashCode() * 31);
        }

        public final String toString() {
            return "InfoBullet(icon=" + this.icon + ", text=" + this.text + ")";
        }
    }

    public final class ProgressBarSegment {
        public final Color color;
        public final float percent;

        public ProgressBarSegment(float f, Color color) {
            color.getClass();
            this.color = color;
            this.percent = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressBarSegment)) {
                return false;
            }
            ProgressBarSegment progressBarSegment = (ProgressBarSegment) obj;
            return Intrinsics.areEqual(this.color, progressBarSegment.color) && Float.compare(this.percent, progressBarSegment.percent) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.percent) + (this.color.hashCode() * 31);
        }

        public final String toString() {
            return "ProgressBarSegment(color=" + this.color + ", percent=" + this.percent + ")";
        }
    }

    public interface Section {

        public final class DisclaimerSection implements Section {
            public final String markdownText;

            public DisclaimerSection(String str) {
                str.getClass();
                this.markdownText = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisclaimerSection) && Intrinsics.areEqual(this.markdownText, ((DisclaimerSection) obj).markdownText);
            }

            public final int hashCode() {
                return this.markdownText.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclaimerSection(markdownText=", this.markdownText, ")");
            }
        }

        public final class IncreaseLimitActionsSection implements Section {
            public final ArrayList ctaBullets;
            public final String subtitle;
            public final String title;

            public IncreaseLimitActionsSection(String str, String str2, ArrayList arrayList) {
                str.getClass();
                this.title = str;
                this.subtitle = str2;
                this.ctaBullets = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IncreaseLimitActionsSection)) {
                    return false;
                }
                IncreaseLimitActionsSection increaseLimitActionsSection = (IncreaseLimitActionsSection) obj;
                return Intrinsics.areEqual(this.title, increaseLimitActionsSection.title) && Intrinsics.areEqual(this.subtitle, increaseLimitActionsSection.subtitle) && this.ctaBullets.equals(increaseLimitActionsSection.ctaBullets);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                return this.ctaBullets.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IncreaseLimitActionsSection(title=", this.title, ", subtitle=", this.subtitle, ", ctaBullets="), this.ctaBullets);
            }
        }

        public final class LimitInfoBulletsSection implements Section {
            public final ArrayList infoBullets;
            public final String subtitle;
            public final String title;

            public LimitInfoBulletsSection(String str, String str2, ArrayList arrayList) {
                str.getClass();
                this.title = str;
                this.subtitle = str2;
                this.infoBullets = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LimitInfoBulletsSection)) {
                    return false;
                }
                LimitInfoBulletsSection limitInfoBulletsSection = (LimitInfoBulletsSection) obj;
                return Intrinsics.areEqual(this.title, limitInfoBulletsSection.title) && Intrinsics.areEqual(this.subtitle, limitInfoBulletsSection.subtitle) && this.infoBullets.equals(limitInfoBulletsSection.infoBullets);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                return this.infoBullets.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LimitInfoBulletsSection(title=", this.title, ", subtitle=", this.subtitle, ", infoBullets="), this.infoBullets);
            }
        }

        public final class ProgressBarSectionModel implements Section {
            public final TextStack leadingTextStack;
            public final List segments;
            public final TextStack trailingTextStack;

            public ProgressBarSectionModel(TextStack textStack, TextStack textStack2, List list) {
                list.getClass();
                this.leadingTextStack = textStack;
                this.trailingTextStack = textStack2;
                this.segments = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ProgressBarSectionModel)) {
                    return false;
                }
                ProgressBarSectionModel progressBarSectionModel = (ProgressBarSectionModel) obj;
                return Intrinsics.areEqual(this.leadingTextStack, progressBarSectionModel.leadingTextStack) && Intrinsics.areEqual(this.trailingTextStack, progressBarSectionModel.trailingTextStack) && Intrinsics.areEqual(this.segments, progressBarSectionModel.segments);
            }

            public final int hashCode() {
                TextStack textStack = this.leadingTextStack;
                int hashCode = (textStack == null ? 0 : textStack.hashCode()) * 31;
                TextStack textStack2 = this.trailingTextStack;
                return this.segments.hashCode() + ((hashCode + (textStack2 != null ? textStack2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ProgressBarSectionModel(leadingTextStack=");
                sb.append(this.leadingTextStack);
                sb.append(", trailingTextStack=");
                sb.append(this.trailingTextStack);
                sb.append(", segments=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.segments, ")");
            }
        }
    }

    public final class TextStack {
        public final Color labelColor;
        public final String labelText;
        public final Color valueColor;
        public final String valueText;

        public TextStack(String str, String str2, Color color, Color color2) {
            this.labelText = str;
            this.valueText = str2;
            this.labelColor = color;
            this.valueColor = color2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextStack)) {
                return false;
            }
            TextStack textStack = (TextStack) obj;
            return this.labelText.equals(textStack.labelText) && this.valueText.equals(textStack.valueText) && Intrinsics.areEqual(this.labelColor, textStack.labelColor) && Intrinsics.areEqual(this.valueColor, textStack.valueColor);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.labelText.hashCode() * 31, 31, this.valueText);
            Color color = this.labelColor;
            int hashCode = (m + (color == null ? 0 : color.hashCode())) * 31;
            Color color2 = this.valueColor;
            return hashCode + (color2 != null ? color2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextStack(labelText=", this.labelText, ", valueText=", this.valueText, ", labelColor=");
            m.append(this.labelColor);
            m.append(", valueColor=");
            m.append(this.valueColor);
            m.append(")");
            return m.toString();
        }
    }

    public BorrowLimitHubViewModel(String str, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.sections = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowLimitHubViewModel)) {
            return false;
        }
        BorrowLimitHubViewModel borrowLimitHubViewModel = (BorrowLimitHubViewModel) obj;
        return Intrinsics.areEqual(this.title, borrowLimitHubViewModel.title) && Intrinsics.areEqual(this.sections, borrowLimitHubViewModel.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("BorrowLimitHubViewModel(title=", this.title, ", sections=", ")", this.sections);
    }
}
