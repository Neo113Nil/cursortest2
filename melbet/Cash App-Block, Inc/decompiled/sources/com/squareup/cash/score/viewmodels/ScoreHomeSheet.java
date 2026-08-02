package com.squareup.cash.score.viewmodels;

import com.squareup.lending.CashCreditScoreHomeData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScoreHomeSheet {

    public final class RecommendationSheet implements ScoreHomeSheet {
        public final CashCreditScoreHomeData.RecommendationOverlayData data;

        public RecommendationSheet(CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData) {
            recommendationOverlayData.getClass();
            this.data = recommendationOverlayData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecommendationSheet) && Intrinsics.areEqual(this.data, ((RecommendationSheet) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "RecommendationSheet(data=" + this.data + ")";
        }
    }

    public final class ScoreSummarySheet implements ScoreHomeSheet {
        public final CashCreditScoreHomeData.ScoreSummaryOverlayData data;

        public ScoreSummarySheet(CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData) {
            scoreSummaryOverlayData.getClass();
            this.data = scoreSummaryOverlayData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScoreSummarySheet) && Intrinsics.areEqual(this.data, ((ScoreSummarySheet) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "ScoreSummarySheet(data=" + this.data + ")";
        }
    }
}
