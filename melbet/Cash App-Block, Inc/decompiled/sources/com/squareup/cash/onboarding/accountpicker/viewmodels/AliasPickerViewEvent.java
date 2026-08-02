package com.squareup.cash.onboarding.accountpicker.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AliasPickerViewEvent {

    public final class AliasSelected extends AliasPickerViewEvent {
        public final String aliasId;

        public AliasSelected(String str) {
            str.getClass();
            this.aliasId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AliasSelected) && Intrinsics.areEqual(this.aliasId, ((AliasSelected) obj).aliasId);
        }

        public final int hashCode() {
            return this.aliasId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AliasSelected(aliasId=", this.aliasId, ")");
        }
    }

    public final class GoBack extends AliasPickerViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 212206491;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class VerifyAnotherWay extends AliasPickerViewEvent {
        public static final VerifyAnotherWay INSTANCE = new VerifyAnotherWay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VerifyAnotherWay);
        }

        public final int hashCode() {
            return -30133007;
        }

        public final String toString() {
            return "VerifyAnotherWay";
        }
    }
}
