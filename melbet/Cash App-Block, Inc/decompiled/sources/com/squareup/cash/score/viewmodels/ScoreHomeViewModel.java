package com.squareup.cash.score.viewmodels;

import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.lending.CashCreditScoreHomeData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScoreHomeViewModel {

    public final class Loaded implements ScoreHomeViewModel {
        public final StyledCardViewModel cardModel;
        public final CashCreditScoreHomeData data;
        public final ProfileAvatarViewModel profileAvatarModel;
        public final ScoreHomeSheet sheet;

        public Loaded(CashCreditScoreHomeData cashCreditScoreHomeData, ProfileAvatarViewModel profileAvatarViewModel, StyledCardViewModel styledCardViewModel, ScoreHomeSheet scoreHomeSheet) {
            this.data = cashCreditScoreHomeData;
            this.profileAvatarModel = profileAvatarViewModel;
            this.cardModel = styledCardViewModel;
            this.sheet = scoreHomeSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.data.equals(loaded.data) && this.profileAvatarModel.equals(loaded.profileAvatarModel) && Intrinsics.areEqual(this.cardModel, loaded.cardModel) && Intrinsics.areEqual(this.sheet, loaded.sheet);
        }

        public final int hashCode() {
            int hashCode = (this.profileAvatarModel.hashCode() + (this.data.hashCode() * 31)) * 31;
            StyledCardViewModel styledCardViewModel = this.cardModel;
            int hashCode2 = (hashCode + (styledCardViewModel == null ? 0 : styledCardViewModel.hashCode())) * 31;
            ScoreHomeSheet scoreHomeSheet = this.sheet;
            return hashCode2 + (scoreHomeSheet != null ? scoreHomeSheet.hashCode() : 0);
        }

        public final String toString() {
            return "Loaded(data=" + this.data + ", profileAvatarModel=" + this.profileAvatarModel + ", cardModel=" + this.cardModel + ", sheet=" + this.sheet + ")";
        }
    }

    public final class Loading implements ScoreHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -2032957902;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
