package com.squareup.cash.cashapppay.settings.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface UnlinkResultViewModel {

    public final class Failure implements UnlinkResultViewModel {
        public final String ctaText;
        public final String description;
        public final String title;

        public Failure(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.ctaText = str2;
            this.description = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.title, failure.title) && Intrinsics.areEqual(this.ctaText, failure.ctaText) && Intrinsics.areEqual(this.description, failure.description);
        }

        @Override // com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewModel
        public final String getCtaText() {
            return this.ctaText;
        }

        @Override // com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.description.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.ctaText);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(title=", this.title, ", ctaText=", this.ctaText, ", description="), this.description, ")");
        }
    }

    public final class Success implements UnlinkResultViewModel {
        public final String ctaText;
        public final String title;

        public Success(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.ctaText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.title, success.title) && Intrinsics.areEqual(this.ctaText, success.ctaText);
        }

        @Override // com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewModel
        public final String getCtaText() {
            return this.ctaText;
        }

        @Override // com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.ctaText.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Success(title=", this.title, ", ctaText=", this.ctaText, ")");
        }
    }

    String getCtaText();

    String getTitle();
}
