package com.squareup.cash.paychecks.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DestinationAllocationRowViewModel {
    public final AccessibilityContent accessibilityContent;
    public final Accessory accessory;
    public final DestinationAllocationRowViewEvent action;
    public final DestinationAllocationRowViewModel$Icon$Color icon;
    public final String title;
    public final DestinationAllocationRowViewModel$TitleBadge$Lock titleBadge;
    public final TextColor titleColor;

    public final class AccessibilityContent {
        public final String actionLabel;
        public final String label;

        public AccessibilityContent(String str, String str2) {
            str2.getClass();
            this.label = str;
            this.actionLabel = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccessibilityContent)) {
                return false;
            }
            AccessibilityContent accessibilityContent = (AccessibilityContent) obj;
            return this.label.equals(accessibilityContent.label) && Intrinsics.areEqual(this.actionLabel, accessibilityContent.actionLabel);
        }

        public final int hashCode() {
            return this.actionLabel.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("AccessibilityContent(label=", this.label, ", actionLabel=", this.actionLabel, ")");
        }
    }

    public final class Accessory {
        public final TextColor color;
        public final String text;

        public Accessory(String str, TextColor textColor) {
            str.getClass();
            this.text = str;
            this.color = textColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Accessory)) {
                return false;
            }
            Accessory accessory = (Accessory) obj;
            return Intrinsics.areEqual(this.text, accessory.text) && this.color == accessory.color;
        }

        public final int hashCode() {
            return this.color.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "Accessory(text=" + this.text + ", color=" + this.color + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TextColor {
        public static final /* synthetic */ TextColor[] $VALUES;
        public static final TextColor PROMINENT;
        public static final TextColor STANDARD;
        public static final TextColor SUBTLE;

        static {
            TextColor textColor = new TextColor("PROMINENT", 0);
            PROMINENT = textColor;
            TextColor textColor2 = new TextColor("STANDARD", 1);
            STANDARD = textColor2;
            TextColor textColor3 = new TextColor("SUBTLE", 2);
            SUBTLE = textColor3;
            $VALUES = new TextColor[]{textColor, textColor2, textColor3};
        }

        public static TextColor valueOf(String str) {
            return (TextColor) Enum.valueOf(TextColor.class, str);
        }

        public static TextColor[] values() {
            return (TextColor[]) $VALUES.clone();
        }
    }

    public DestinationAllocationRowViewModel(DestinationAllocationRowViewModel$Icon$Color destinationAllocationRowViewModel$Icon$Color, String str, TextColor textColor, DestinationAllocationRowViewModel$TitleBadge$Lock destinationAllocationRowViewModel$TitleBadge$Lock, Accessory accessory, DestinationAllocationRowViewEvent destinationAllocationRowViewEvent, AccessibilityContent accessibilityContent) {
        this.icon = destinationAllocationRowViewModel$Icon$Color;
        this.title = str;
        this.titleColor = textColor;
        this.titleBadge = destinationAllocationRowViewModel$TitleBadge$Lock;
        this.accessory = accessory;
        this.action = destinationAllocationRowViewEvent;
        this.accessibilityContent = accessibilityContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DestinationAllocationRowViewModel)) {
            return false;
        }
        DestinationAllocationRowViewModel destinationAllocationRowViewModel = (DestinationAllocationRowViewModel) obj;
        return Intrinsics.areEqual(this.icon, destinationAllocationRowViewModel.icon) && Intrinsics.areEqual(this.title, destinationAllocationRowViewModel.title) && this.titleColor == destinationAllocationRowViewModel.titleColor && Intrinsics.areEqual(this.titleBadge, destinationAllocationRowViewModel.titleBadge) && Intrinsics.areEqual(this.accessory, destinationAllocationRowViewModel.accessory) && Intrinsics.areEqual(this.action, destinationAllocationRowViewModel.action) && Intrinsics.areEqual(this.accessibilityContent, destinationAllocationRowViewModel.accessibilityContent);
    }

    public final int hashCode() {
        int i = 0;
        DestinationAllocationRowViewModel$Icon$Color destinationAllocationRowViewModel$Icon$Color = this.icon;
        int hashCode = (this.titleColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((destinationAllocationRowViewModel$Icon$Color == null ? 0 : destinationAllocationRowViewModel$Icon$Color.hashCode()) * 31, 31, this.title)) * 31;
        DestinationAllocationRowViewModel$TitleBadge$Lock destinationAllocationRowViewModel$TitleBadge$Lock = this.titleBadge;
        if (destinationAllocationRowViewModel$TitleBadge$Lock != null) {
            destinationAllocationRowViewModel$TitleBadge$Lock.getClass();
            i = -949337210;
        }
        return this.accessibilityContent.hashCode() + ((this.action.hashCode() + ((this.accessory.hashCode() + ((hashCode + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DestinationAllocationRowViewModel(icon=" + this.icon + ", title=" + this.title + ", titleColor=" + this.titleColor + ", titleBadge=" + this.titleBadge + ", accessory=" + this.accessory + ", action=" + this.action + ", accessibilityContent=" + this.accessibilityContent + ")";
    }
}
