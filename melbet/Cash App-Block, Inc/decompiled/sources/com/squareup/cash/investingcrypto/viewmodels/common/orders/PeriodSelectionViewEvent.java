package com.squareup.cash.investingcrypto.viewmodels.common.orders;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PeriodSelectionViewEvent {

    public final class BackClick extends PeriodSelectionViewEvent {
        public static final BackClick INSTANCE = new BackClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClick);
        }

        public final int hashCode() {
            return -669411408;
        }

        public final String toString() {
            return "BackClick";
        }
    }

    public final class PeriodClick extends PeriodSelectionViewEvent {
        public final String token;

        public PeriodClick(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PeriodClick) && Intrinsics.areEqual(this.token, ((PeriodClick) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PeriodClick(token=", this.token, ")");
        }
    }

    public final class SubmitClick extends PeriodSelectionViewEvent {
        public static final SubmitClick INSTANCE = new SubmitClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitClick);
        }

        public final int hashCode() {
            return 1379744607;
        }

        public final String toString() {
            return "SubmitClick";
        }
    }
}
