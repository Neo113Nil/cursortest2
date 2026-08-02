package com.squareup.cash.shopping.viewmodels;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ButtonModel {
    public final ActionType actionType;
    public final String actionUrl;
    public final Color backgroundColor;
    public final Image icon;
    public final Style style;
    public final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Style {
        public static final /* synthetic */ Style[] $VALUES;
        public static final Style OUTLINE;
        public static final Style PRIMARY;
        public static final Style SECONDARY;
        public static final Style TERTIARY;

        static {
            Style style = new Style("PRIMARY", 0);
            PRIMARY = style;
            Style style2 = new Style("SECONDARY", 1);
            SECONDARY = style2;
            Style style3 = new Style("TERTIARY", 2);
            TERTIARY = style3;
            Style style4 = new Style("OUTLINE", 3);
            OUTLINE = style4;
            $VALUES = new Style[]{style, style2, style3, style4};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public ButtonModel(String str, ActionType actionType, String str2, Image image, Color color, Style style) {
        this.actionUrl = str;
        this.actionType = actionType;
        this.text = str2;
        this.icon = image;
        this.backgroundColor = color;
        this.style = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonModel)) {
            return false;
        }
        ButtonModel buttonModel = (ButtonModel) obj;
        return Intrinsics.areEqual(this.actionUrl, buttonModel.actionUrl) && this.actionType == buttonModel.actionType && Intrinsics.areEqual(this.text, buttonModel.text) && Intrinsics.areEqual(this.icon, buttonModel.icon) && Intrinsics.areEqual(this.backgroundColor, buttonModel.backgroundColor) && this.style == buttonModel.style;
    }

    public final int hashCode() {
        String str = this.actionUrl;
        int hashCode = (this.actionType.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.icon;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Color color = this.backgroundColor;
        int hashCode4 = (hashCode3 + (color == null ? 0 : color.hashCode())) * 31;
        Style style = this.style;
        return hashCode4 + (style != null ? style.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonModel(actionUrl=" + this.actionUrl + ", actionType=" + this.actionType + ", text=" + this.text + ", icon=" + this.icon + ", backgroundColor=" + this.backgroundColor + ", style=" + this.style + ")";
    }

    public /* synthetic */ ButtonModel(String str) {
        this(null, ActionType.DISMISS, str, null, null, null);
    }
}
