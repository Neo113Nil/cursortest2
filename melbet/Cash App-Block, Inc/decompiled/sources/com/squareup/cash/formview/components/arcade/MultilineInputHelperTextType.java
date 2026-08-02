package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface MultilineInputHelperTextType {

    public final class MaxCharCount implements MultilineInputHelperTextType {
        public final int currentCharCount;
        public final int maxCharCount;

        public MaxCharCount(int i, int i2) {
            this.currentCharCount = i;
            this.maxCharCount = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaxCharCount)) {
                return false;
            }
            MaxCharCount maxCharCount = (MaxCharCount) obj;
            return this.currentCharCount == maxCharCount.currentCharCount && this.maxCharCount == maxCharCount.maxCharCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.maxCharCount) + (Integer.hashCode(this.currentCharCount) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.currentCharCount, this.maxCharCount, "MaxCharCount(currentCharCount=", ", maxCharCount=", ")");
        }
    }

    public final class Nothing implements MultilineInputHelperTextType {
        public static final Nothing INSTANCE = new Nothing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Nothing);
        }

        public final int hashCode() {
            return 545750762;
        }

        public final String toString() {
            return "Nothing";
        }
    }

    public final class RequiredCharCount implements MultilineInputHelperTextType {
        public final int requiredCharCount;

        public RequiredCharCount(int i) {
            this.requiredCharCount = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequiredCharCount) && this.requiredCharCount == ((RequiredCharCount) obj).requiredCharCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.requiredCharCount);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.requiredCharCount, "RequiredCharCount(requiredCharCount=", ")");
        }
    }
}
