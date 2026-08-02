package com.squareup.cash.sharesheet;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ShareTargetsManager$ShareResult {

    public final class Failure extends ShareTargetsManager$ShareResult {
        public final String failureMessage;
        public final String title;

        public Failure(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.failureMessage = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.title, failure.title) && Intrinsics.areEqual(this.failureMessage, failure.failureMessage);
        }

        @Override // com.squareup.cash.sharesheet.ShareTargetsManager$ShareResult
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.failureMessage.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Failure(title=", this.title, ", failureMessage=", this.failureMessage, ")");
        }
    }

    public final class Loading extends ShareTargetsManager$ShareResult {
        public final String title;

        public Loading(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.title, ((Loading) obj).title);
        }

        @Override // com.squareup.cash.sharesheet.ShareTargetsManager$ShareResult
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(title=", this.title, ")");
        }
    }

    public final class Success extends ShareTargetsManager$ShareResult {
        public final String successMessage;
        public final String title;

        public Success(String str, String str2) {
            str.getClass();
            this.title = str;
            this.successMessage = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.title, success.title) && Intrinsics.areEqual(this.successMessage, success.successMessage);
        }

        @Override // com.squareup.cash.sharesheet.ShareTargetsManager$ShareResult
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.successMessage;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Success(title=", this.title, ", successMessage=", this.successMessage, ")");
        }
    }

    public abstract String getTitle();
}
