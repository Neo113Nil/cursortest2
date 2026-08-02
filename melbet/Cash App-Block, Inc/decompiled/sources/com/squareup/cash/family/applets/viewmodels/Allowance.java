package com.squareup.cash.family.applets.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface Allowance {

    public final class Current implements Allowance {
        public final String formattedAmount;
        public final String scheduledDescription;
        public final String url;

        public Current(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.formattedAmount = str;
            this.scheduledDescription = str2;
            this.url = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Current)) {
                return false;
            }
            Current current = (Current) obj;
            return Intrinsics.areEqual(this.formattedAmount, current.formattedAmount) && Intrinsics.areEqual(this.scheduledDescription, current.scheduledDescription) && Intrinsics.areEqual(this.url, current.url);
        }

        @Override // com.squareup.cash.family.applets.viewmodels.Allowance
        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.formattedAmount.hashCode() * 31, 31, this.scheduledDescription);
            String str = this.url;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Current(formattedAmount=", this.formattedAmount, ", scheduledDescription=", this.scheduledDescription, ", url="), this.url, ")");
        }
    }

    public final class None implements Allowance {
        public final String title;
        public final String url;

        public None(String str, String str2) {
            str.getClass();
            this.title = str;
            this.url = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof None)) {
                return false;
            }
            None none = (None) obj;
            return Intrinsics.areEqual(this.title, none.title) && Intrinsics.areEqual(this.url, none.url);
        }

        @Override // com.squareup.cash.family.applets.viewmodels.Allowance
        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.url;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("None(title=", this.title, ", url=", this.url, ")");
        }
    }

    String getUrl();
}
