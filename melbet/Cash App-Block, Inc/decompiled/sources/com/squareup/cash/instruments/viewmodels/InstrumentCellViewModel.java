package com.squareup.cash.instruments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentCellViewModel {
    public final String accessibilityLabel;
    public final Accessory accessory;
    public final boolean enabled;
    public final List icons;
    public final String prefix;
    public final String primaryLabel;
    public final String secondaryLabel;
    public final String suffixLabel;
    public final InstrumentLabel tertiaryLabel;

    public interface Accessory {

        public final class Button implements Accessory {
            public final String text;

            public Button(String str) {
                str.getClass();
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Button) && Intrinsics.areEqual(this.text, ((Button) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Button(text=", this.text, ")");
            }
        }

        public final class Expand implements Accessory {
            public static final Expand INSTANCE = new Expand();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Expand);
            }

            public final int hashCode() {
                return 1657869524;
            }

            public final String toString() {
                return "Expand";
            }
        }

        /* loaded from: classes7.dex */
        public final class Info implements Accessory {
            public static final Info INSTANCE = new Info();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Info);
            }

            public final int hashCode() {
                return 319152488;
            }

            public final String toString() {
                return "Info";
            }
        }

        public final class Push implements Accessory {
            public static final Push INSTANCE = new Push();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Push);
            }

            public final int hashCode() {
                return 319368148;
            }

            public final String toString() {
                return "Push";
            }
        }

        public final class Radio implements Accessory {
            public static final Radio INSTANCE = new Radio();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Radio);
            }

            public final int hashCode() {
                return 1311714945;
            }

            public final String toString() {
                return "Radio";
            }
        }
    }

    public final class InstrumentLabel {
        public final Color color;
        public final String text;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Color {
            public static final /* synthetic */ Color[] $VALUES;
            public static final Color DANGER;
            public static final Color DEFAULT;

            static {
                Color color = new Color("DEFAULT", 0);
                DEFAULT = color;
                Color color2 = new Color("DANGER", 1);
                DANGER = color2;
                $VALUES = new Color[]{color, color2};
            }

            public static Color valueOf(String str) {
                return (Color) Enum.valueOf(Color.class, str);
            }

            public static Color[] values() {
                return (Color[]) $VALUES.clone();
            }
        }

        public InstrumentLabel(String str, Color color) {
            str.getClass();
            color.getClass();
            this.text = str;
            this.color = color;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentLabel)) {
                return false;
            }
            InstrumentLabel instrumentLabel = (InstrumentLabel) obj;
            return Intrinsics.areEqual(this.text, instrumentLabel.text) && this.color == instrumentLabel.color;
        }

        public final int hashCode() {
            return this.color.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "InstrumentLabel(text=" + this.text + ", color=" + this.color + ")";
        }
    }

    public InstrumentCellViewModel(String str, String str2, boolean z, List list, Accessory accessory, InstrumentLabel instrumentLabel, String str3, String str4, String str5, int i) {
        instrumentLabel = (i & 32) != 0 ? null : instrumentLabel;
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        str5 = (i & 256) != 0 ? null : str5;
        str.getClass();
        list.getClass();
        this.primaryLabel = str;
        this.secondaryLabel = str2;
        this.enabled = z;
        this.icons = list;
        this.accessory = accessory;
        this.tertiaryLabel = instrumentLabel;
        this.prefix = str3;
        this.suffixLabel = str4;
        this.accessibilityLabel = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentCellViewModel)) {
            return false;
        }
        InstrumentCellViewModel instrumentCellViewModel = (InstrumentCellViewModel) obj;
        return Intrinsics.areEqual(this.primaryLabel, instrumentCellViewModel.primaryLabel) && Intrinsics.areEqual(this.secondaryLabel, instrumentCellViewModel.secondaryLabel) && this.enabled == instrumentCellViewModel.enabled && Intrinsics.areEqual(this.icons, instrumentCellViewModel.icons) && Intrinsics.areEqual(this.accessory, instrumentCellViewModel.accessory) && Intrinsics.areEqual(this.tertiaryLabel, instrumentCellViewModel.tertiaryLabel) && Intrinsics.areEqual(this.prefix, instrumentCellViewModel.prefix) && Intrinsics.areEqual(this.suffixLabel, instrumentCellViewModel.suffixLabel) && Intrinsics.areEqual(this.accessibilityLabel, instrumentCellViewModel.accessibilityLabel);
    }

    public final int hashCode() {
        int hashCode = this.primaryLabel.hashCode() * 31;
        String str = this.secondaryLabel;
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.enabled), 31, this.icons);
        Accessory accessory = this.accessory;
        int hashCode2 = (m + (accessory == null ? 0 : accessory.hashCode())) * 31;
        InstrumentLabel instrumentLabel = this.tertiaryLabel;
        int hashCode3 = (hashCode2 + (instrumentLabel == null ? 0 : instrumentLabel.hashCode())) * 31;
        String str2 = this.prefix;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suffixLabel;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accessibilityLabel;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentCellViewModel(primaryLabel=", this.primaryLabel, ", secondaryLabel=", this.secondaryLabel, ", enabled=");
        m.append(this.enabled);
        m.append(", icons=");
        m.append(this.icons);
        m.append(", accessory=");
        m.append(this.accessory);
        m.append(", tertiaryLabel=");
        m.append(this.tertiaryLabel);
        m.append(", prefix=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.prefix, ", suffixLabel=", this.suffixLabel, ", accessibilityLabel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.accessibilityLabel, ")");
    }
}
