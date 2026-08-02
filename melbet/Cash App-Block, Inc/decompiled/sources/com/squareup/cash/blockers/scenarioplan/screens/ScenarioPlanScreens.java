package com.squareup.cash.blockers.scenarioplan.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlans;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.screens.AccentedScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface ScenarioPlanScreens extends Screen {

    /* loaded from: classes4.dex */
    public final class ScenarioPlanErrorScreen implements ScenarioPlanScreens, AccentedScreen {
        public static final Parcelable.Creator<ScenarioPlanErrorScreen> CREATOR = new MoveBitcoinScreen.Creator(23);
        public final ColorModel accentColor;
        public final ErrorMessaging errorMessage;

        public ScenarioPlanErrorScreen(ErrorMessaging errorMessaging, ColorModel colorModel) {
            errorMessaging.getClass();
            this.errorMessage = errorMessaging;
            this.accentColor = colorModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScenarioPlanErrorScreen)) {
                return false;
            }
            ScenarioPlanErrorScreen scenarioPlanErrorScreen = (ScenarioPlanErrorScreen) obj;
            return Intrinsics.areEqual(this.errorMessage, scenarioPlanErrorScreen.errorMessage) && Intrinsics.areEqual(this.accentColor, scenarioPlanErrorScreen.accentColor);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        public final int hashCode() {
            int hashCode = this.errorMessage.hashCode() * 31;
            ColorModel colorModel = this.accentColor;
            return hashCode + (colorModel == null ? 0 : colorModel.hashCode());
        }

        public final String toString() {
            return "ScenarioPlanErrorScreen(errorMessage=" + this.errorMessage + ", accentColor=" + this.accentColor + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.errorMessage, i);
            parcel.writeParcelable(this.accentColor, i);
        }
    }

    /* loaded from: classes4.dex */
    public final class ScenarioPlanLoadingScreen implements ScenarioPlanScreens, AccentedScreen {
        public static final Parcelable.Creator<ScenarioPlanLoadingScreen> CREATOR = new MoveBitcoinScreen.Creator(24);
        public final ColorModel accentColor;
        public final Screen exitScreen;
        public final ScenarioPlanInput input;
        public final ScenarioPlans plan;

        public ScenarioPlanLoadingScreen(ScenarioPlans scenarioPlans, ScenarioPlanInput scenarioPlanInput, Screen screen, ColorModel colorModel) {
            scenarioPlans.getClass();
            screen.getClass();
            this.plan = scenarioPlans;
            this.input = scenarioPlanInput;
            this.exitScreen = screen;
            this.accentColor = colorModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScenarioPlanLoadingScreen)) {
                return false;
            }
            ScenarioPlanLoadingScreen scenarioPlanLoadingScreen = (ScenarioPlanLoadingScreen) obj;
            return this.plan == scenarioPlanLoadingScreen.plan && Intrinsics.areEqual(this.input, scenarioPlanLoadingScreen.input) && Intrinsics.areEqual(this.exitScreen, scenarioPlanLoadingScreen.exitScreen) && Intrinsics.areEqual(this.accentColor, scenarioPlanLoadingScreen.accentColor);
        }

        @Override // com.squareup.cash.screens.AccentedScreen
        public final ColorModel getAccentColor() {
            return this.accentColor;
        }

        public final int hashCode() {
            int hashCode = this.plan.hashCode() * 31;
            ScenarioPlanInput scenarioPlanInput = this.input;
            int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, (hashCode + (scenarioPlanInput == null ? 0 : scenarioPlanInput.hashCode())) * 31, 31);
            ColorModel colorModel = this.accentColor;
            return m + (colorModel != null ? colorModel.hashCode() : 0);
        }

        public final String toString() {
            return "ScenarioPlanLoadingScreen(plan=" + this.plan + ", input=" + this.input + ", exitScreen=" + this.exitScreen + ", accentColor=" + this.accentColor + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.plan, i);
            parcel.writeParcelable(this.input, i);
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeParcelable(this.accentColor, i);
        }
    }
}
