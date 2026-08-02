package com.squareup.cash.family.familyhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AllowanceViewModel {

    public final class AllowanceDetail extends AllowanceViewModel {
        public final String amount;
        public final String editUrl;
        public final boolean isReadOnly;
        public final String subtitle;
        public final String title;
        public final String token;

        public AllowanceDetail(String str, String str2, String str3, String str4, String str5, boolean z) {
            re$$ExternalSyntheticOutline0.m1432m(str2, str3, str4);
            this.token = str;
            this.title = str2;
            this.subtitle = str3;
            this.amount = str4;
            this.isReadOnly = z;
            this.editUrl = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AllowanceDetail)) {
                return false;
            }
            AllowanceDetail allowanceDetail = (AllowanceDetail) obj;
            return this.token.equals(allowanceDetail.token) && Intrinsics.areEqual(this.title, allowanceDetail.title) && Intrinsics.areEqual(this.subtitle, allowanceDetail.subtitle) && Intrinsics.areEqual(this.amount, allowanceDetail.amount) && this.isReadOnly == allowanceDetail.isReadOnly && Intrinsics.areEqual(this.editUrl, allowanceDetail.editUrl);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.amount), 31, this.isReadOnly);
            String str = this.editUrl;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AllowanceDetail(token=", this.token, ", title=", this.title, ", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", amount=", this.amount, ", isReadOnly=");
            m.append(this.isReadOnly);
            m.append(", editUrl=");
            m.append(this.editUrl);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading extends AllowanceViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1776982812;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class NoAllowanceInDependentDetail extends AllowanceViewModel {
        public final String subtitle;
        public final String title;

        public NoAllowanceInDependentDetail(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoAllowanceInDependentDetail)) {
                return false;
            }
            NoAllowanceInDependentDetail noAllowanceInDependentDetail = (NoAllowanceInDependentDetail) obj;
            return Intrinsics.areEqual(this.title, noAllowanceInDependentDetail.title) && Intrinsics.areEqual(this.subtitle, noAllowanceInDependentDetail.subtitle);
        }

        public final int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("NoAllowanceInDependentDetail(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }
}
