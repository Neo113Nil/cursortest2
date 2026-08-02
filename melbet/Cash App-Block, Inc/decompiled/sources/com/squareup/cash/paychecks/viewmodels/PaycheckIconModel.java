package com.squareup.cash.paychecks.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaycheckIconModel {

    public final class Avatar implements PaycheckIconModel {
        public final Image image;

        public Avatar(Image image) {
            image.getClass();
            this.image = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Avatar) && Intrinsics.areEqual(this.image, ((Avatar) obj).image);
        }

        public final int hashCode() {
            return this.image.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "Avatar(image=", ")");
        }
    }

    public final class Overflow implements PaycheckIconModel {
        public final String text;

        public Overflow(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Overflow) && Intrinsics.areEqual(this.text, ((Overflow) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Overflow(text=", this.text, ")");
        }
    }

    public final class Unknown implements PaycheckIconModel {
        public static final Unknown INSTANCE = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return -809802278;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
