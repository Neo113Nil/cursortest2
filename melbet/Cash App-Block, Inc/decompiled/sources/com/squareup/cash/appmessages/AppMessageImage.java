package com.squareup.cash.appmessages;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AppMessageImage {

    public abstract class Animated extends AppMessageImage {

        public final class Fill extends Animated {
            public final AppMessageImage$Animated$Asset$Url image;

            public Fill(AppMessageImage$Animated$Asset$Url appMessageImage$Animated$Asset$Url) {
                this.image = appMessageImage$Animated$Asset$Url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fill) && this.image.equals(((Fill) obj).image);
            }

            @Override // com.squareup.cash.appmessages.AppMessageImage.Animated
            public final AppMessageImage$Animated$Asset$Url getImage() {
                return this.image;
            }

            public final int hashCode() {
                return this.image.asset.hashCode();
            }

            public final String toString() {
                return "Fill(image=" + this.image + ")";
            }
        }

        public final class Fixed extends Animated {
            public final int height;
            public final AppMessageImage$Animated$Asset$Url image;
            public final int width;

            public Fixed(AppMessageImage$Animated$Asset$Url appMessageImage$Animated$Asset$Url, int i, int i2) {
                this.image = appMessageImage$Animated$Asset$Url;
                this.width = i;
                this.height = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fixed)) {
                    return false;
                }
                Fixed fixed = (Fixed) obj;
                return this.image.equals(fixed.image) && this.width == fixed.width && this.height == fixed.height;
            }

            @Override // com.squareup.cash.appmessages.AppMessageImage.Animated
            public final AppMessageImage$Animated$Asset$Url getImage() {
                return this.image;
            }

            public final int hashCode() {
                return Integer.hashCode(this.height) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, this.image.asset.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Fixed(image=");
                sb.append(this.image);
                sb.append(", width=");
                sb.append(this.width);
                sb.append(", height=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, ")", sb);
            }
        }

        public final class Inset extends Animated {
            public final AppMessageImage$Animated$Asset$Url image;

            public Inset(AppMessageImage$Animated$Asset$Url appMessageImage$Animated$Asset$Url) {
                this.image = appMessageImage$Animated$Asset$Url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Inset) && this.image.equals(((Inset) obj).image);
            }

            @Override // com.squareup.cash.appmessages.AppMessageImage.Animated
            public final AppMessageImage$Animated$Asset$Url getImage() {
                return this.image;
            }

            public final int hashCode() {
                return this.image.asset.hashCode();
            }

            public final String toString() {
                return "Inset(image=" + this.image + ")";
            }
        }

        public abstract AppMessageImage$Animated$Asset$Url getImage();
    }

    public abstract class Static extends AppMessageImage {

        public final class Fill extends Static {
            public final Image image;
            public final boolean round;

            public Fill(Image image, boolean z) {
                image.getClass();
                this.image = image;
                this.round = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fill)) {
                    return false;
                }
                Fill fill = (Fill) obj;
                return Intrinsics.areEqual(this.image, fill.image) && this.round == fill.round;
            }

            @Override // com.squareup.cash.appmessages.AppMessageImage.Static
            public final Image getImage() {
                return this.image;
            }

            @Override // com.squareup.cash.appmessages.AppMessageImage.Static
            public final boolean getRound() {
                return this.round;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.round) + (this.image.hashCode() * 31);
            }

            public final String toString() {
                return "Fill(image=" + this.image + ", round=" + this.round + ")";
            }
        }

        public final class Fixed extends Static {
            public final int height;
            public final Image image;
            public final boolean round;
            public final int width;

            public Fixed(Image image, boolean z, int i, int i2) {
                image.getClass();
                this.image = image;
                this.round = z;
                this.width = i;
                this.height = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fixed)) {
                    return false;
                }
                Fixed fixed = (Fixed) obj;
                return Intrinsics.areEqual(this.image, fixed.image) && this.round == fixed.round && this.width == fixed.width && this.height == fixed.height;
            }

            @Override // com.squareup.cash.appmessages.AppMessageImage.Static
            public final Image getImage() {
                return this.image;
            }

            @Override // com.squareup.cash.appmessages.AppMessageImage.Static
            public final boolean getRound() {
                return this.round;
            }

            public final int hashCode() {
                return Integer.hashCode(this.height) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.round), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Fixed(image=");
                sb.append(this.image);
                sb.append(", round=");
                sb.append(this.round);
                sb.append(", width=");
                return Recorder$$ExternalSyntheticOutline1.m(this.width, this.height, ", height=", ")", sb);
            }
        }

        public final class Inset extends Static {
            public final Image image;
            public final boolean round;

            public Inset(Image image, boolean z) {
                image.getClass();
                this.image = image;
                this.round = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Inset)) {
                    return false;
                }
                Inset inset = (Inset) obj;
                return Intrinsics.areEqual(this.image, inset.image) && this.round == inset.round;
            }

            @Override // com.squareup.cash.appmessages.AppMessageImage.Static
            public final Image getImage() {
                return this.image;
            }

            @Override // com.squareup.cash.appmessages.AppMessageImage.Static
            public final boolean getRound() {
                return this.round;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.round) + (this.image.hashCode() * 31);
            }

            public final String toString() {
                return "Inset(image=" + this.image + ", round=" + this.round + ")";
            }
        }

        public abstract Image getImage();

        public abstract boolean getRound();
    }
}
