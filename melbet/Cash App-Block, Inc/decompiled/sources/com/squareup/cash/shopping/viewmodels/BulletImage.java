package com.squareup.cash.shopping.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface BulletImage {

    public final class LocalImage implements BulletImage {
        public final Icon icon;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Icon {
            public static final /* synthetic */ Icon[] $VALUES;
            public static final Icon CASH_LOGO_SQUARE;
            public static final Icon SECURE_SHIELD;
            public static final Icon SHOPPING_TAG;

            static {
                Icon icon = new Icon("CASH_LOGO_SQUARE", 0);
                CASH_LOGO_SQUARE = icon;
                Icon icon2 = new Icon("SHOPPING_TAG", 1);
                SHOPPING_TAG = icon2;
                Icon icon3 = new Icon("SECURE_SHIELD", 2);
                SECURE_SHIELD = icon3;
                $VALUES = new Icon[]{icon, icon2, icon3};
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public LocalImage(Icon icon) {
            this.icon = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalImage) && this.icon == ((LocalImage) obj).icon;
        }

        public final int hashCode() {
            return this.icon.hashCode();
        }

        public final String toString() {
            return "LocalImage(icon=" + this.icon + ")";
        }
    }

    public final class RemoteImage implements BulletImage {
        public final Image image;

        public RemoteImage(Image image) {
            image.getClass();
            this.image = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteImage) && Intrinsics.areEqual(this.image, ((RemoteImage) obj).image);
        }

        public final int hashCode() {
            return this.image.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "RemoteImage(image=", ")");
        }
    }
}
