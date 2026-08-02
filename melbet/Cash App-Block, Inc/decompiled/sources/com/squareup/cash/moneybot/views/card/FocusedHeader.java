package com.squareup.cash.moneybot.views.card;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FocusedHeader {
    public final Description description;
    public final String header;
    public final String largeValue;

    public FocusedHeader(String str, String str2, Description description) {
        str.getClass();
        this.header = str;
        this.largeValue = str2;
        this.description = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusedHeader)) {
            return false;
        }
        FocusedHeader focusedHeader = (FocusedHeader) obj;
        return Intrinsics.areEqual(this.header, focusedHeader.header) && Intrinsics.areEqual(this.largeValue, focusedHeader.largeValue) && Intrinsics.areEqual(this.description, focusedHeader.description);
    }

    public final int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        String str = this.largeValue;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Description description = this.description;
        return hashCode2 + (description != null ? description.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FocusedHeader(header=", this.header, ", largeValue=", this.largeValue, ", description=");
        m.append(this.description);
        m.append(")");
        return m.toString();
    }

    public final class Description {
        public final String description;
        public final Icon icon;
        public final Color iconTintColor;

        public Description(String str, Icon icon, Color color) {
            str.getClass();
            this.description = str;
            this.icon = icon;
            this.iconTintColor = color;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return Intrinsics.areEqual(this.description, description.description) && Intrinsics.areEqual(this.icon, description.icon) && Intrinsics.areEqual(this.iconTintColor, description.iconTintColor);
        }

        public final int hashCode() {
            int hashCode = this.description.hashCode() * 31;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            Color color = this.iconTintColor;
            return hashCode2 + (color != null ? color.hashCode() : 0);
        }

        public final String toString() {
            return "Description(description=" + this.description + ", icon=" + this.icon + ", iconTintColor=" + this.iconTintColor + ")";
        }

        public /* synthetic */ Description(String str, Icon icon, int i) {
            this(str, (i & 2) != 0 ? null : icon, (Color) null);
        }
    }
}
