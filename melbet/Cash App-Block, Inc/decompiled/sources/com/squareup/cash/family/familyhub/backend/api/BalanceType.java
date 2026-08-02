package com.squareup.cash.family.familyhub.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface BalanceType {

    public final class GeneralSavings implements BalanceType {
        public static final GeneralSavings INSTANCE = new GeneralSavings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GeneralSavings);
        }

        public final int hashCode() {
            return -816939348;
        }

        public final String toString() {
            return "GeneralSavings";
        }
    }

    public final class Goal implements BalanceType {
        public final String goalToken;

        public Goal(String str) {
            str.getClass();
            this.goalToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Goal) && Intrinsics.areEqual(this.goalToken, ((Goal) obj).goalToken);
        }

        public final int hashCode() {
            return this.goalToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Goal(goalToken=", this.goalToken, ")");
        }
    }

    public final class Savings implements BalanceType {
        public static final Savings INSTANCE = new Savings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Savings);
        }

        public final int hashCode() {
            return 1903544606;
        }

        public final String toString() {
            return "Savings";
        }
    }
}
