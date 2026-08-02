package com.squareup.cash.featureflags;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public interface FeatureFlagManager {

    public final class CurrentlySelectedOption {
        public final String label;
        public final String value;

        public CurrentlySelectedOption(String str, String str2) {
            this.label = str;
            this.value = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurrentlySelectedOption)) {
                return false;
            }
            CurrentlySelectedOption currentlySelectedOption = (CurrentlySelectedOption) obj;
            return this.label.equals(currentlySelectedOption.label) && this.value.equals(currentlySelectedOption.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("CurrentlySelectedOption(label=", this.label, ", value=", this.value, ")");
        }
    }
}
