package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MultilineTextInputValidator$Result {

    public final class Failure implements MultilineTextInputValidator$Result {
        public final Reason reason;

        public interface Reason {

            public final class EmptyRequiredInput implements Reason {
                public final Integer maxCharCount;
                public final Integer minCharCount;

                public EmptyRequiredInput(Integer num, Integer num2) {
                    this.minCharCount = num;
                    this.maxCharCount = num2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof EmptyRequiredInput)) {
                        return false;
                    }
                    EmptyRequiredInput emptyRequiredInput = (EmptyRequiredInput) obj;
                    return Intrinsics.areEqual(this.minCharCount, emptyRequiredInput.minCharCount) && Intrinsics.areEqual(this.maxCharCount, emptyRequiredInput.maxCharCount);
                }

                public final int hashCode() {
                    Integer num = this.minCharCount;
                    int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                    Integer num2 = this.maxCharCount;
                    return hashCode + (num2 != null ? num2.hashCode() : 0);
                }

                public final String toString() {
                    return "EmptyRequiredInput(minCharCount=" + this.minCharCount + ", maxCharCount=" + this.maxCharCount + ")";
                }
            }

            public final class MaxCharCountExceeded implements Reason {
                public static final MaxCharCountExceeded INSTANCE = new MaxCharCountExceeded();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof MaxCharCountExceeded);
                }

                public final int hashCode() {
                    return -746087998;
                }

                public final String toString() {
                    return "MaxCharCountExceeded";
                }
            }

            public final class MinCharCountNotReached implements Reason {
                public final int currentCharCount;
                public final int minCharCount;

                public MinCharCountNotReached(int i, int i2) {
                    this.minCharCount = i;
                    this.currentCharCount = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof MinCharCountNotReached)) {
                        return false;
                    }
                    MinCharCountNotReached minCharCountNotReached = (MinCharCountNotReached) obj;
                    return this.minCharCount == minCharCountNotReached.minCharCount && this.currentCharCount == minCharCountNotReached.currentCharCount;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.currentCharCount) + (Integer.hashCode(this.minCharCount) * 31);
                }

                public final String toString() {
                    return Recorder$$ExternalSyntheticOutline2.m(this.minCharCount, this.currentCharCount, "MinCharCountNotReached(minCharCount=", ", currentCharCount=", ")");
                }
            }
        }

        public Failure(Reason reason) {
            this.reason = reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.reason.equals(((Failure) obj).reason);
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final String toString() {
            return "Failure(reason=" + this.reason + ")";
        }
    }

    public final class NotApplicable implements MultilineTextInputValidator$Result {
        public static final NotApplicable INSTANCE = new NotApplicable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotApplicable);
        }

        public final int hashCode() {
            return -1367024698;
        }

        public final String toString() {
            return "NotApplicable";
        }
    }

    public final class Success implements MultilineTextInputValidator$Result {
        public final int currentCharCount;
        public final boolean isRequired;
        public final Integer maxCharCount;

        public Success(int i, Integer num, boolean z) {
            this.isRequired = z;
            this.maxCharCount = num;
            this.currentCharCount = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.isRequired == success.isRequired && Intrinsics.areEqual(this.maxCharCount, success.maxCharCount) && this.currentCharCount == success.currentCharCount;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.isRequired) * 31;
            Integer num = this.maxCharCount;
            return Integer.hashCode(this.currentCharCount) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(isRequired=");
            sb.append(this.isRequired);
            sb.append(", maxCharCount=");
            sb.append(this.maxCharCount);
            sb.append(", currentCharCount=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentCharCount, ")", sb);
        }
    }
}
