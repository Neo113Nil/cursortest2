package com.squareup.cash.amountslider.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AmountSelectorWidgetModel {
    public final List items;

    public abstract class Item {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Icon {
            public static final /* synthetic */ Icon[] $VALUES;
            public static final Icon PENDING;

            static {
                Icon icon = new Icon("PENDING", 0);
                PENDING = icon;
                $VALUES = new Icon[]{icon};
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public String getAccessibilityHint() {
            return null;
        }

        public String getAccessibilityLabel() {
            return null;
        }

        public Icon getIcon() {
            return null;
        }

        public abstract String getLabel();

        public boolean isEnabled() {
            return true;
        }

        public boolean isSelected() {
            return false;
        }
    }

    public AmountSelectorWidgetModel(List list) {
        list.getClass();
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmountSelectorWidgetModel) && Intrinsics.areEqual(this.items, ((AmountSelectorWidgetModel) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("AmountSelectorWidgetModel(items=", ")", this.items);
    }
}
