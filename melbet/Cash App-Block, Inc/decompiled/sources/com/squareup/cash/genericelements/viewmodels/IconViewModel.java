package com.squareup.cash.genericelements.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class IconViewModel extends GenericBaseViewModel {

    public final class ImageViewModel extends IconViewModel {
        public final Alignment alignment;
        public final Color color;
        public final String contentDescription;
        public final Image image;
        public final Size size;

        /* loaded from: classes9.dex */
        public enum Size {
            SMALL(40),
            MEDIUM(56),
            LARGE(64),
            STATIC(0);

            public final int value;

            Size(int i) {
                this.value = i;
            }
        }

        public ImageViewModel(Image image, Size size, Color color, String str, Alignment alignment) {
            image.getClass();
            this.image = image;
            this.size = size;
            this.color = color;
            this.contentDescription = str;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageViewModel)) {
                return false;
            }
            ImageViewModel imageViewModel = (ImageViewModel) obj;
            return Intrinsics.areEqual(this.image, imageViewModel.image) && this.size == imageViewModel.size && Intrinsics.areEqual(this.color, imageViewModel.color) && Intrinsics.areEqual(this.contentDescription, imageViewModel.contentDescription) && this.alignment == imageViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            int hashCode = (this.size.hashCode() + (this.image.hashCode() * 31)) * 31;
            Color color = this.color;
            int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
            String str = this.contentDescription;
            return this.alignment.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ImageViewModel(image=" + this.image + ", size=" + this.size + ", color=" + this.color + ", contentDescription=" + this.contentDescription + ", alignment=" + this.alignment + ")";
        }
    }

    public final class ProgressMeterViewModel extends IconViewModel {
        public final Alignment alignment;
        public final Color color;
        public final Image image;
        public final float progress;
        public final Size size;

        /* loaded from: classes7.dex */
        public enum Size {
            SMALL(40),
            MEDIUM(56),
            LARGE(64);

            public final int value;

            Size(int i) {
                this.value = i;
            }
        }

        public ProgressMeterViewModel(Image image, Color color, float f, Size size, Alignment alignment) {
            image.getClass();
            color.getClass();
            this.image = image;
            this.color = color;
            this.progress = f;
            this.size = size;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressMeterViewModel)) {
                return false;
            }
            ProgressMeterViewModel progressMeterViewModel = (ProgressMeterViewModel) obj;
            return Intrinsics.areEqual(this.image, progressMeterViewModel.image) && Intrinsics.areEqual(this.color, progressMeterViewModel.color) && Float.compare(this.progress, progressMeterViewModel.progress) == 0 && this.size == progressMeterViewModel.size && this.alignment == progressMeterViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            return this.alignment.hashCode() + ((this.size.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, SVG$Unit$EnumUnboxingLocalUtility.m(this.color, this.image.hashCode() * 31, 31), 31)) * 31);
        }

        public final String toString() {
            return "ProgressMeterViewModel(image=" + this.image + ", color=" + this.color + ", progress=" + this.progress + ", size=" + this.size + ", alignment=" + this.alignment + ")";
        }
    }
}
