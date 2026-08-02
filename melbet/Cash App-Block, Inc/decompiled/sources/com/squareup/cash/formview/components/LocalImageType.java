package com.squareup.cash.formview.components;

import android.widget.ImageView;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.formview.components.arcade.ArcadeLocalImageIcon;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LocalImageType {

    public final class ArcadeComposable implements LocalImageType {
        public final ComposableLambdaImpl composable;

        public ArcadeComposable(ComposableLambdaImpl composableLambdaImpl) {
            this.composable = composableLambdaImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArcadeComposable) && this.composable == ((ArcadeComposable) obj).composable;
        }

        public final int hashCode() {
            return this.composable.hashCode();
        }

        public final String toString() {
            return "ArcadeComposable(composable=" + this.composable + ")";
        }
    }

    public final class ArcadeIcon implements LocalImageType {
        public final ArcadeLocalImageIcon icon;

        public ArcadeIcon(ArcadeLocalImageIcon arcadeLocalImageIcon) {
            this.icon = arcadeLocalImageIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArcadeIcon) && this.icon == ((ArcadeIcon) obj).icon;
        }

        public final int hashCode() {
            return this.icon.hashCode();
        }

        public final String toString() {
            return "ArcadeIcon(icon=" + this.icon + ")";
        }
    }

    public final class MooncakeIcon implements LocalImageType {
        public final MooncakeLargeIcon.Icon icon;

        public MooncakeIcon(MooncakeLargeIcon.Icon icon) {
            this.icon = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MooncakeIcon) && this.icon == ((MooncakeIcon) obj).icon;
        }

        public final int hashCode() {
            return this.icon.hashCode();
        }

        public final String toString() {
            return "MooncakeIcon(icon=" + this.icon + ")";
        }
    }

    public final class HeroImage implements LocalImageType {
        public final int resourceId;
        public final ImageView.ScaleType scaleType;
        public final Integer tint;

        public HeroImage(int i, ImageView.ScaleType scaleType, Integer num) {
            scaleType.getClass();
            this.resourceId = i;
            this.scaleType = scaleType;
            this.tint = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroImage)) {
                return false;
            }
            HeroImage heroImage = (HeroImage) obj;
            return this.resourceId == heroImage.resourceId && this.scaleType == heroImage.scaleType && Intrinsics.areEqual(this.tint, heroImage.tint);
        }

        public final int hashCode() {
            int hashCode = (this.scaleType.hashCode() + (Integer.hashCode(this.resourceId) * 31)) * 31;
            Integer num = this.tint;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeroImage(resourceId=");
            sb.append(this.resourceId);
            sb.append(", scaleType=");
            sb.append(this.scaleType);
            sb.append(", tint=");
            return NavAction$$ExternalSyntheticOutline0.m(sb, this.tint, ")");
        }

        public /* synthetic */ HeroImage(int i, int i2) {
            this(i, (i2 & 2) != 0 ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_END, null);
        }
    }
}
