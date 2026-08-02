package com.squareup.cash.investing.viewmodels.holdings;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingEtfHoldingDetailsViewEvent {

    public final class TapBack implements InvestingEtfHoldingDetailsViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return -83529514;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapHolding implements InvestingEtfHoldingDetailsViewEvent {
        public final String token;

        public TapHolding(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapHolding) && Intrinsics.areEqual(this.token, ((TapHolding) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapHolding(token=", this.token, ")");
        }
    }

    public final class ToggleInvestmentType implements InvestingEtfHoldingDetailsViewEvent {

        /* renamed from: type, reason: collision with root package name */
        public final InvestmentType f1164type;

        public ToggleInvestmentType(InvestmentType investmentType) {
            investmentType.getClass();
            this.f1164type = investmentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleInvestmentType) && this.f1164type == ((ToggleInvestmentType) obj).f1164type;
        }

        public final int hashCode() {
            return this.f1164type.hashCode();
        }

        public final String toString() {
            return "ToggleInvestmentType(type=" + this.f1164type + ")";
        }
    }
}
