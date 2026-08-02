package com.squareup.cash.investing.primitives;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InvestingState {

    public final class Content extends InvestingState {
        public final BrokerageAccountState brokerageAccountState;
        public final DividendState dividendState;
        public final boolean isDependent;
        public final PortfolioState portfolioState;

        public interface BrokerageAccountState {

            public final class Active implements BrokerageAccountState {
                public static final Active INSTANCE = new Active();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Active);
                }

                public final int hashCode() {
                    return -418759654;
                }

                public final String toString() {
                    return "Active";
                }
            }

            public final class Inactive implements BrokerageAccountState {
                public static final Inactive INSTANCE = new Inactive();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Inactive);
                }

                public final int hashCode() {
                    return -1315429249;
                }

                public final String toString() {
                    return "Inactive";
                }
            }

            public final class TransferInProgress implements BrokerageAccountState {
                public final Instant willCompleteAtUtc;

                public TransferInProgress(Instant instant) {
                    instant.getClass();
                    this.willCompleteAtUtc = instant;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof TransferInProgress) && Intrinsics.areEqual(this.willCompleteAtUtc, ((TransferInProgress) obj).willCompleteAtUtc);
                }

                public final int hashCode() {
                    return this.willCompleteAtUtc.hashCode();
                }

                public final String toString() {
                    return "TransferInProgress(willCompleteAtUtc=" + this.willCompleteAtUtc + ")";
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class DividendState {
            public static final /* synthetic */ DividendState[] $VALUES;
            public static final DividendState AUTO_REINVEST;
            public static final DividendState SAVE_BALANCE;

            static {
                DividendState dividendState = new DividendState("AUTO_REINVEST", 0);
                AUTO_REINVEST = dividendState;
                DividendState dividendState2 = new DividendState("SAVE_BALANCE", 1);
                SAVE_BALANCE = dividendState2;
                $VALUES = new DividendState[]{dividendState, dividendState2};
            }

            public static DividendState valueOf(String str) {
                return (DividendState) Enum.valueOf(DividendState.class, str);
            }

            public static DividendState[] values() {
                return (DividendState[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class PortfolioState {
            public static final /* synthetic */ PortfolioState[] $VALUES;
            public static final PortfolioState ABSENT;
            public static final PortfolioState EMPTY;
            public static final PortfolioState HAS_HOLDINGS;

            static {
                PortfolioState portfolioState = new PortfolioState("ABSENT", 0);
                ABSENT = portfolioState;
                PortfolioState portfolioState2 = new PortfolioState("EMPTY", 1);
                EMPTY = portfolioState2;
                PortfolioState portfolioState3 = new PortfolioState("HAS_HOLDINGS", 2);
                HAS_HOLDINGS = portfolioState3;
                $VALUES = new PortfolioState[]{portfolioState, portfolioState2, portfolioState3};
            }

            public static PortfolioState valueOf(String str) {
                return (PortfolioState) Enum.valueOf(PortfolioState.class, str);
            }

            public static PortfolioState[] values() {
                return (PortfolioState[]) $VALUES.clone();
            }
        }

        public Content(PortfolioState portfolioState, BrokerageAccountState brokerageAccountState, boolean z, DividendState dividendState) {
            this.portfolioState = portfolioState;
            this.brokerageAccountState = brokerageAccountState;
            this.isDependent = z;
            this.dividendState = dividendState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.portfolioState == content.portfolioState && this.brokerageAccountState.equals(content.brokerageAccountState) && this.isDependent == content.isDependent && this.dividendState == content.dividendState;
        }

        public final int hashCode() {
            return this.dividendState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.brokerageAccountState.hashCode() + (this.portfolioState.hashCode() * 31)) * 31, 31, this.isDependent);
        }

        public final String toString() {
            return "Content(portfolioState=" + this.portfolioState + ", brokerageAccountState=" + this.brokerageAccountState + ", isDependent=" + this.isDependent + ", dividendState=" + this.dividendState + ")";
        }
    }

    public final class Loading extends InvestingState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -835264959;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
