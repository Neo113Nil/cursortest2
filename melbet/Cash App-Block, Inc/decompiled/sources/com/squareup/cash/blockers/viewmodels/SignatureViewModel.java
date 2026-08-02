package com.squareup.cash.blockers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class SignatureViewModel {

    public final class Content extends SignatureViewModel {
        public final String backLabel;
        public final String nextLabel;
        public final String title;

        public Content(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.backLabel = str2;
            this.nextLabel = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.backLabel, content.backLabel) && Intrinsics.areEqual(this.nextLabel, content.nextLabel);
        }

        public final int hashCode() {
            return this.nextLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.backLabel);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", backLabel=", this.backLabel, ", nextLabel="), this.nextLabel, ")");
        }
    }

    public final class Submitting extends SignatureViewModel {
        public static final Submitting INSTANCE = new Submitting();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submitting);
        }

        public final int hashCode() {
            return -1565490036;
        }

        public final String toString() {
            return "Submitting";
        }
    }
}
