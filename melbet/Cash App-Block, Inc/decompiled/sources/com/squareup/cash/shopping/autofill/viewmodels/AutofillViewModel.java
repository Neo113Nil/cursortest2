package com.squareup.cash.shopping.autofill.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.shopping.autofill.screens.AutofillData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class AutofillViewModel {

    public final class Error extends AutofillViewModel {
        public final String bodyText;
        public final String title;

        public Error(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.bodyText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.bodyText, error.bodyText);
        }

        public final int hashCode() {
            return this.bodyText.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Error(title=", this.title, ", bodyText=", this.bodyText, ")");
        }
    }

    public final class Loaded extends AutofillViewModel {
        public final AutofillData autofillData;
        public final String bodyText;
        public final String ctaText;
        public final boolean editable;
        public final String subtitle;
        public final String title;

        public Loaded(String str, String str2, String str3, String str4, AutofillData autofillData, boolean z) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.bodyText = str2;
            this.ctaText = str3;
            this.subtitle = str4;
            this.autofillData = autofillData;
            this.editable = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.bodyText, loaded.bodyText) && Intrinsics.areEqual(this.ctaText, loaded.ctaText) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && this.autofillData.equals(loaded.autofillData) && this.editable == loaded.editable;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.bodyText), 31, this.ctaText);
            String str = this.subtitle;
            return Boolean.hashCode(this.editable) + ((this.autofillData.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", bodyText=", this.bodyText, ", ctaText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.ctaText, ", subtitle=", this.subtitle, ", autofillData=");
            m.append(this.autofillData);
            m.append(", editable=");
            m.append(this.editable);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading extends AutofillViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 14678729;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes6.dex */
    public final class Success extends AutofillViewModel {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 2105825680;
        }

        public final String toString() {
            return "Success";
        }
    }
}
