package com.squareup.cash.pools.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public interface PoolDetailsViewModel {

    public final class Loaded implements PoolDetailsViewModel {
        public final UiCallbackModel activityEmbeddedModel;
        public final ContributionAnimation animationContribution;
        public final String currentAmount;
        public final long currentAmountRaw;
        public final float currentProgress;
        public final boolean isActiveAccountInPool;
        public final boolean isRefreshing;
        public final ImmutableList participantsPreview;
        public final boolean showActivitySection;
        public final boolean showAddPeopleButton;
        public final boolean showClosePoolButton;
        public final boolean showClosedPoolDisabledButton;
        public final String showClosedPoolDisabledButtonSubText;
        public final String showClosedPoolDisabledButtonText;
        public final boolean showContributeButton;
        public final boolean showGoalMetAnimation;
        public final boolean showShareButton;
        public final String subtitle;
        public final String title;
        public final String totalAmount;

        public Loaded(String str, String str2, String str3, long j, String str4, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, ImmutableList immutableList, boolean z6, boolean z7, UiCallbackModel uiCallbackModel, ContributionAnimation contributionAnimation, boolean z8, boolean z9) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str3, str4, str5, str6);
            immutableList.getClass();
            this.title = str;
            this.subtitle = str2;
            this.currentAmount = str3;
            this.currentAmountRaw = j;
            this.totalAmount = str4;
            this.currentProgress = f;
            this.showShareButton = z;
            this.showAddPeopleButton = z2;
            this.showClosePoolButton = z3;
            this.showContributeButton = z4;
            this.showClosedPoolDisabledButton = z5;
            this.showClosedPoolDisabledButtonText = str5;
            this.showClosedPoolDisabledButtonSubText = str6;
            this.participantsPreview = immutableList;
            this.isActiveAccountInPool = z6;
            this.showActivitySection = z7;
            this.activityEmbeddedModel = uiCallbackModel;
            this.animationContribution = contributionAnimation;
            this.isRefreshing = z8;
            this.showGoalMetAnimation = z9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && this.subtitle.equals(loaded.subtitle) && Intrinsics.areEqual(this.currentAmount, loaded.currentAmount) && this.currentAmountRaw == loaded.currentAmountRaw && Intrinsics.areEqual(this.totalAmount, loaded.totalAmount) && Float.compare(this.currentProgress, loaded.currentProgress) == 0 && this.showShareButton == loaded.showShareButton && this.showAddPeopleButton == loaded.showAddPeopleButton && this.showClosePoolButton == loaded.showClosePoolButton && this.showContributeButton == loaded.showContributeButton && this.showClosedPoolDisabledButton == loaded.showClosedPoolDisabledButton && Intrinsics.areEqual(this.showClosedPoolDisabledButtonText, loaded.showClosedPoolDisabledButtonText) && Intrinsics.areEqual(this.showClosedPoolDisabledButtonSubText, loaded.showClosedPoolDisabledButtonSubText) && Intrinsics.areEqual(this.participantsPreview, loaded.participantsPreview) && this.isActiveAccountInPool == loaded.isActiveAccountInPool && this.showActivitySection == loaded.showActivitySection && this.activityEmbeddedModel.equals(loaded.activityEmbeddedModel) && Intrinsics.areEqual(this.animationContribution, loaded.animationContribution) && this.isRefreshing == loaded.isRefreshing && this.showGoalMetAnimation == loaded.showGoalMetAnimation;
        }

        public final int hashCode() {
            int hashCode = (this.activityEmbeddedModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(BalanceFeedKt$$ExternalSyntheticOutline0.m(this.participantsPreview, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.currentProgress, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.currentAmount), 31, this.currentAmountRaw), 31, this.totalAmount), 31), 31, this.showShareButton), 31, this.showAddPeopleButton), 31, this.showClosePoolButton), 31, this.showContributeButton), 31, this.showClosedPoolDisabledButton), 31, this.showClosedPoolDisabledButtonText), 31, this.showClosedPoolDisabledButtonSubText), 31), 31, this.isActiveAccountInPool), 31, this.showActivitySection)) * 31;
            ContributionAnimation contributionAnimation = this.animationContribution;
            return Boolean.hashCode(this.showGoalMetAnimation) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (contributionAnimation == null ? 0 : contributionAnimation.hashCode())) * 31, 31, this.isRefreshing);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", subtitle=", this.subtitle, ", currentAmount=");
            m.append(this.currentAmount);
            m.append(", currentAmountRaw=");
            m.append(this.currentAmountRaw);
            m.append(", totalAmount=");
            m.append(this.totalAmount);
            m.append(", currentProgress=");
            m.append(this.currentProgress);
            m.append(", showShareButton=");
            m.append(this.showShareButton);
            m.append(", showAddPeopleButton=");
            m.append(this.showAddPeopleButton);
            m.append(", showClosePoolButton=");
            m.append(this.showClosePoolButton);
            m.append(", showContributeButton=");
            m.append(this.showContributeButton);
            m.append(", showClosedPoolDisabledButton=");
            m.append(this.showClosedPoolDisabledButton);
            m.append(", showClosedPoolDisabledButtonText=");
            m.append(this.showClosedPoolDisabledButtonText);
            m.append(", showClosedPoolDisabledButtonSubText=");
            m.append(this.showClosedPoolDisabledButtonSubText);
            m.append(", participantsPreview=");
            m.append(this.participantsPreview);
            m.append(", isActiveAccountInPool=");
            m.append(this.isActiveAccountInPool);
            m.append(", showActivitySection=");
            m.append(this.showActivitySection);
            m.append(", activityEmbeddedModel=");
            m.append(this.activityEmbeddedModel);
            m.append(", animationContribution=");
            m.append(this.animationContribution);
            m.append(", isRefreshing=");
            m.append(this.isRefreshing);
            m.append(", showGoalMetAnimation=");
            m.append(this.showGoalMetAnimation);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements PoolDetailsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1396668702;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class LoadingError implements PoolDetailsViewModel {
        public final LoadingErrorType errorType;

        public LoadingError(LoadingErrorType loadingErrorType) {
            this.errorType = loadingErrorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingError) && this.errorType.equals(((LoadingError) obj).errorType);
        }

        public final int hashCode() {
            return this.errorType.hashCode();
        }

        public final String toString() {
            return "LoadingError(errorType=" + this.errorType + ")";
        }
    }

    public interface LoadingErrorType {

        public final class Forbidden implements LoadingErrorType {
            public static final Forbidden INSTANCE = new Forbidden();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Forbidden);
            }

            public final int hashCode() {
                return 784044043;
            }

            public final String toString() {
                return "Forbidden";
            }
        }

        public final class GenericLoadingError implements LoadingErrorType {
            public static final GenericLoadingError INSTANCE = new GenericLoadingError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GenericLoadingError);
            }

            public final int hashCode() {
                return -904773835;
            }

            public final String toString() {
                return "GenericLoadingError";
            }
        }
    }
}
