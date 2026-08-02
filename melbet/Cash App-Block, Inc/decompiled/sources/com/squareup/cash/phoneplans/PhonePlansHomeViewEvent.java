package com.squareup.cash.phoneplans;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface PhonePlansHomeViewEvent {

    public final class Close implements PhonePlansHomeViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1239438556;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class HeaderCtaClicked implements PhonePlansHomeViewEvent {
        public static final HeaderCtaClicked INSTANCE = new HeaderCtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HeaderCtaClicked);
        }

        public final int hashCode() {
            return 1290102200;
        }

        public final String toString() {
            return "HeaderCtaClicked";
        }
    }

    public final class InfoCardClicked implements PhonePlansHomeViewEvent {
        public final int index;

        public InfoCardClicked(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InfoCardClicked) && this.index == ((InfoCardClicked) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "InfoCardClicked(index=", ")");
        }
    }

    public final class LinkClicked implements PhonePlansHomeViewEvent {
        public final int index;

        public LinkClicked(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkClicked) && this.index == ((LinkClicked) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "LinkClicked(index=", ")");
        }
    }

    public final class RetryClicked implements PhonePlansHomeViewEvent {
        public static final RetryClicked INSTANCE = new RetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryClicked);
        }

        public final int hashCode() {
            return 1141998003;
        }

        public final String toString() {
            return "RetryClicked";
        }
    }
}
