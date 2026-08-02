package com.squareup.cash.instruments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InstrumentIcon {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class IconShape {
        public static final /* synthetic */ IconShape[] $VALUES;
        public static final IconShape CARD;
        public static final IconShape CIRCLE;

        static {
            IconShape iconShape = new IconShape("CIRCLE", 0);
            CIRCLE = iconShape;
            IconShape iconShape2 = new IconShape("CARD", 1);
            CARD = iconShape2;
            $VALUES = new IconShape[]{iconShape, iconShape2};
        }

        public static IconShape valueOf(String str) {
            return (IconShape) Enum.valueOf(IconShape.class, str);
        }

        public static IconShape[] values() {
            return (IconShape[]) $VALUES.clone();
        }
    }

    public final class LocalIcon implements InstrumentIcon {
        public final IconBackground background;
        public final Icons badge;
        public final IconTint color;
        public final Icons icon;
        public final IconShape shape;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class IconBackground {
            public static final /* synthetic */ IconBackground[] $VALUES;
            public static final IconBackground BITCOIN;
            public static final IconBackground BRAND;
            public static final IconBackground NONE;
            public static final IconBackground SUBTLE;

            static {
                IconBackground iconBackground = new IconBackground("BRAND", 0);
                BRAND = iconBackground;
                IconBackground iconBackground2 = new IconBackground("BITCOIN", 1);
                BITCOIN = iconBackground2;
                IconBackground iconBackground3 = new IconBackground("SUBTLE", 2);
                SUBTLE = iconBackground3;
                IconBackground iconBackground4 = new IconBackground("NONE", 3);
                NONE = iconBackground4;
                $VALUES = new IconBackground[]{iconBackground, iconBackground2, iconBackground3, iconBackground4};
            }

            public static IconBackground valueOf(String str) {
                return (IconBackground) Enum.valueOf(IconBackground.class, str);
            }

            public static IconBackground[] values() {
                return (IconBackground[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class IconTint {
            public static final /* synthetic */ IconTint[] $VALUES;
            public static final IconTint INVERSE;
            public static final IconTint STANDARD;
            public static final IconTint SUBTLE;

            static {
                IconTint iconTint = new IconTint("SUBTLE", 0);
                SUBTLE = iconTint;
                IconTint iconTint2 = new IconTint("INVERSE", 1);
                INVERSE = iconTint2;
                IconTint iconTint3 = new IconTint("STANDARD", 2);
                STANDARD = iconTint3;
                $VALUES = new IconTint[]{iconTint, iconTint2, iconTint3};
            }

            public static IconTint valueOf(String str) {
                return (IconTint) Enum.valueOf(IconTint.class, str);
            }

            public static IconTint[] values() {
                return (IconTint[]) $VALUES.clone();
            }
        }

        public LocalIcon(Icons icons, IconTint iconTint, IconBackground iconBackground, Icons icons2, IconShape iconShape, int i) {
            iconTint = (i & 2) != 0 ? null : iconTint;
            iconBackground = (i & 4) != 0 ? null : iconBackground;
            icons2 = (i & 8) != 0 ? null : icons2;
            iconShape = (i & 16) != 0 ? IconShape.CIRCLE : iconShape;
            icons.getClass();
            iconShape.getClass();
            this.icon = icons;
            this.color = iconTint;
            this.background = iconBackground;
            this.badge = icons2;
            this.shape = iconShape;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalIcon)) {
                return false;
            }
            LocalIcon localIcon = (LocalIcon) obj;
            return this.icon == localIcon.icon && this.color == localIcon.color && this.background == localIcon.background && this.badge == localIcon.badge && this.shape == localIcon.shape;
        }

        @Override // com.squareup.cash.instruments.viewmodels.InstrumentIcon
        public final Icons getBadge() {
            return this.badge;
        }

        @Override // com.squareup.cash.instruments.viewmodels.InstrumentIcon
        public final IconShape getShape() {
            return this.shape;
        }

        public final int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            IconTint iconTint = this.color;
            int hashCode2 = (hashCode + (iconTint == null ? 0 : iconTint.hashCode())) * 31;
            IconBackground iconBackground = this.background;
            int hashCode3 = (hashCode2 + (iconBackground == null ? 0 : iconBackground.hashCode())) * 31;
            Icons icons = this.badge;
            return this.shape.hashCode() + ((hashCode3 + (icons != null ? icons.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "LocalIcon(icon=" + this.icon + ", color=" + this.color + ", background=" + this.background + ", badge=" + this.badge + ", shape=" + this.shape + ")";
        }
    }

    public final class Savings implements InstrumentIcon {
        public final String iconId;
        public final Float progress;
        public final IconShape shape = IconShape.CIRCLE;

        public Savings(Float f, String str) {
            this.iconId = str;
            this.progress = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Savings)) {
                return false;
            }
            Savings savings = (Savings) obj;
            return this.iconId.equals(savings.iconId) && Intrinsics.areEqual((Object) this.progress, (Object) savings.progress);
        }

        @Override // com.squareup.cash.instruments.viewmodels.InstrumentIcon
        public final Icons getBadge() {
            return null;
        }

        @Override // com.squareup.cash.instruments.viewmodels.InstrumentIcon
        public final IconShape getShape() {
            return this.shape;
        }

        public final int hashCode() {
            int hashCode = this.iconId.hashCode() * 31;
            Float f = this.progress;
            return (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        }

        public final String toString() {
            return "Savings(iconId=" + this.iconId + ", progress=" + this.progress + ", badge=null)";
        }
    }

    Icons getBadge();

    IconShape getShape();

    public final class LocalBrand implements InstrumentIcon {
        public final Icons badge;
        public final int darkResId;
        public final int lightResId;
        public final IconShape shape;

        public LocalBrand(int i, int i2, Icons icons, IconShape iconShape) {
            iconShape.getClass();
            this.lightResId = i;
            this.darkResId = i2;
            this.badge = icons;
            this.shape = iconShape;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalBrand)) {
                return false;
            }
            LocalBrand localBrand = (LocalBrand) obj;
            return this.lightResId == localBrand.lightResId && this.darkResId == localBrand.darkResId && this.badge == localBrand.badge && this.shape == localBrand.shape;
        }

        @Override // com.squareup.cash.instruments.viewmodels.InstrumentIcon
        public final Icons getBadge() {
            return this.badge;
        }

        @Override // com.squareup.cash.instruments.viewmodels.InstrumentIcon
        public final IconShape getShape() {
            return this.shape;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.darkResId, Integer.hashCode(this.lightResId) * 31, 31);
            Icons icons = this.badge;
            return this.shape.hashCode() + ((m + (icons == null ? 0 : icons.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.lightResId, this.darkResId, "LocalBrand(lightResId=", ", darkResId=", ", badge=");
            m107m.append(this.badge);
            m107m.append(", shape=");
            m107m.append(this.shape);
            m107m.append(")");
            return m107m.toString();
        }

        public /* synthetic */ LocalBrand(int i, int i2, Icons icons, IconShape iconShape, int i3) {
            this(i, i2, (i3 & 4) != 0 ? null : icons, (i3 & 8) != 0 ? IconShape.CIRCLE : iconShape);
        }
    }

    public final class RemoteIcon implements InstrumentIcon {
        public final Icons badge;
        public final String iconUrl;
        public final IconShape shape;

        public RemoteIcon(String str, Icons icons, IconShape iconShape) {
            str.getClass();
            iconShape.getClass();
            this.iconUrl = str;
            this.badge = icons;
            this.shape = iconShape;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteIcon)) {
                return false;
            }
            RemoteIcon remoteIcon = (RemoteIcon) obj;
            return Intrinsics.areEqual(this.iconUrl, remoteIcon.iconUrl) && this.badge == remoteIcon.badge && this.shape == remoteIcon.shape;
        }

        @Override // com.squareup.cash.instruments.viewmodels.InstrumentIcon
        public final Icons getBadge() {
            return this.badge;
        }

        @Override // com.squareup.cash.instruments.viewmodels.InstrumentIcon
        public final IconShape getShape() {
            return this.shape;
        }

        public final int hashCode() {
            int hashCode = this.iconUrl.hashCode() * 31;
            Icons icons = this.badge;
            return this.shape.hashCode() + ((hashCode + (icons == null ? 0 : icons.hashCode())) * 31);
        }

        public final String toString() {
            return "RemoteIcon(iconUrl=" + this.iconUrl + ", badge=" + this.badge + ", shape=" + this.shape + ")";
        }

        public /* synthetic */ RemoteIcon(String str, IconShape iconShape, int i) {
            this(str, (Icons) null, (i & 4) != 0 ? IconShape.CIRCLE : iconShape);
        }
    }
}
