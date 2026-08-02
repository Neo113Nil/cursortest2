package com.squareup.cash.account.settings.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface RatePlanButtonTreatment {

    /* loaded from: classes7.dex */
    public final class Downgrade implements RatePlanButtonTreatment {
        public final String downgradeText;

        public Downgrade(String str) {
            str.getClass();
            this.downgradeText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Downgrade) && Intrinsics.areEqual(this.downgradeText, ((Downgrade) obj).downgradeText);
        }

        public final int hashCode() {
            return this.downgradeText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Downgrade(downgradeText=", this.downgradeText, ")");
        }
    }

    public final class Omit implements RatePlanButtonTreatment {
        public static final Omit INSTANCE = new Omit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Omit);
        }

        public final int hashCode() {
            return -2034005855;
        }

        public final String toString() {
            return "Omit";
        }
    }

    /* loaded from: classes7.dex */
    public final class Upgrade implements RatePlanButtonTreatment {
        public final String upgradeText;

        public Upgrade(String str) {
            str.getClass();
            this.upgradeText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Upgrade) && Intrinsics.areEqual(this.upgradeText, ((Upgrade) obj).upgradeText);
        }

        public final int hashCode() {
            return this.upgradeText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Upgrade(upgradeText=", this.upgradeText, ")");
        }
    }
}
