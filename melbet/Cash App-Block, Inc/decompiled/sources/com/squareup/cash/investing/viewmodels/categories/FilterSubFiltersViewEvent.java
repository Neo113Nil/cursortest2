package com.squareup.cash.investing.viewmodels.categories;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FilterSubFiltersViewEvent {

    public final class OptionClick extends FilterSubFiltersViewEvent {
        public final String subFilterOptionToken;
        public final String subFilterToken;

        public OptionClick(String str, String str2) {
            str.getClass();
            this.subFilterToken = str;
            this.subFilterOptionToken = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptionClick)) {
                return false;
            }
            OptionClick optionClick = (OptionClick) obj;
            return Intrinsics.areEqual(this.subFilterToken, optionClick.subFilterToken) && Intrinsics.areEqual(this.subFilterOptionToken, optionClick.subFilterOptionToken);
        }

        public final int hashCode() {
            int hashCode = this.subFilterToken.hashCode() * 31;
            String str = this.subFilterOptionToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("OptionClick(subFilterToken=", this.subFilterToken, ", subFilterOptionToken=", this.subFilterOptionToken, ")");
        }
    }

    public final class ResetClick extends FilterSubFiltersViewEvent {
        public static final ResetClick INSTANCE = new ResetClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetClick);
        }

        public final int hashCode() {
            return -1246133;
        }

        public final String toString() {
            return "ResetClick";
        }
    }

    public final class SubmitClick extends FilterSubFiltersViewEvent {
        public static final SubmitClick INSTANCE = new SubmitClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitClick);
        }

        public final int hashCode() {
            return 1227158462;
        }

        public final String toString() {
            return "SubmitClick";
        }
    }
}
