package com.squareup.cash.family.familyhub.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class DependentTeenQrCodeShareSheetPresenter$SharingState {

    public final class Failure extends DependentTeenQrCodeShareSheetPresenter$SharingState {
        public final String title;

        public Failure(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.title, ((Failure) obj).title);
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + 741139037;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(title=", this.title, ", message=Failed to share)");
        }
    }

    public final class Loading extends DependentTeenQrCodeShareSheetPresenter$SharingState {
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

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(title=", this.title, ")");
        }
    }

    public final class Success extends DependentTeenQrCodeShareSheetPresenter$SharingState {
        public final String message;
        public final String title;

        public Success(String str, String str2) {
            str.getClass();
            this.title = str;
            this.message = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.title, success.title) && Intrinsics.areEqual(this.message, success.message);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.message;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Success(title=", this.title, ", message=", this.message, ")");
        }
    }
}
