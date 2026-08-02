package com.squareup.cash.score.viewmodels;

import com.squareup.lending.CashCreditScoreHomeData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScoreHomeViewEvent {

    public final class Action implements ScoreHomeViewEvent {
        public final CashCreditScoreHomeData.Action proto;
        public final Source source;

        public interface Source {

            public final class Callout implements Source {
                public final int index;
                public final CashCreditScoreHomeData.InfoSection.Callout proto;

                public Callout(int i, CashCreditScoreHomeData.InfoSection.Callout callout) {
                    callout.getClass();
                    this.index = i;
                    this.proto = callout;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Callout)) {
                        return false;
                    }
                    Callout callout = (Callout) obj;
                    return this.index == callout.index && Intrinsics.areEqual(this.proto, callout.proto);
                }

                public final int hashCode() {
                    return this.proto.hashCode() + (Integer.hashCode(this.index) * 31);
                }

                public final String toString() {
                    return "Callout(index=" + this.index + ", proto=" + this.proto + ")";
                }
            }

            public final class RecommendationOverlay implements Source {
                public final CashCreditScoreHomeData.RecommendationOverlayData proto;

                public RecommendationOverlay(CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData) {
                    recommendationOverlayData.getClass();
                    this.proto = recommendationOverlayData;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof RecommendationOverlay) && Intrinsics.areEqual(this.proto, ((RecommendationOverlay) obj).proto);
                }

                public final int hashCode() {
                    return this.proto.hashCode();
                }

                public final String toString() {
                    return "RecommendationOverlay(proto=" + this.proto + ")";
                }
            }
        }

        public Action(CashCreditScoreHomeData.Action action, Source source) {
            action.getClass();
            this.proto = action;
            this.source = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.areEqual(this.proto, action.proto) && Intrinsics.areEqual(this.source, action.source);
        }

        public final int hashCode() {
            int hashCode = this.proto.hashCode() * 31;
            Source source = this.source;
            return hashCode + (source == null ? 0 : source.hashCode());
        }

        public final String toString() {
            return "Action(proto=" + this.proto + ", source=" + this.source + ")";
        }
    }

    public final class CalloutVisible implements ScoreHomeViewEvent {
        public final int index;
        public final CashCreditScoreHomeData.InfoSection.Callout proto;

        public CalloutVisible(int i, CashCreditScoreHomeData.InfoSection.Callout callout) {
            callout.getClass();
            this.index = i;
            this.proto = callout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CalloutVisible)) {
                return false;
            }
            CalloutVisible calloutVisible = (CalloutVisible) obj;
            return this.index == calloutVisible.index && Intrinsics.areEqual(this.proto, calloutVisible.proto);
        }

        public final int hashCode() {
            return this.proto.hashCode() + (Integer.hashCode(this.index) * 31);
        }

        public final String toString() {
            return "CalloutVisible(index=" + this.index + ", proto=" + this.proto + ")";
        }
    }

    public final class DismissSheet implements ScoreHomeViewEvent {
        public static final DismissSheet INSTANCE = new DismissSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissSheet);
        }

        public final int hashCode() {
            return -1217155602;
        }

        public final String toString() {
            return "DismissSheet";
        }
    }

    public final class FaqSectionVisible implements ScoreHomeViewEvent {
        public static final FaqSectionVisible INSTANCE = new FaqSectionVisible();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FaqSectionVisible);
        }

        public final int hashCode() {
            return -1567363798;
        }

        public final String toString() {
            return "FaqSectionVisible";
        }
    }

    public final class GoBack implements ScoreHomeViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 283585960;
        }

        public final String toString() {
            return "GoBack";
        }
    }
}
