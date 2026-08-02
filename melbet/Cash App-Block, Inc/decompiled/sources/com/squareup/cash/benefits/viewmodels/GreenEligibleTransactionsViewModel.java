package com.squareup.cash.benefits.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class GreenEligibleTransactionsViewModel {

    public final class Loaded extends GreenEligibleTransactionsViewModel {
        public final UiCallbackModel activityEmbeddedModel;
        public final String headerBody;
        public final String headerTitle;
        public final String learnMoreText;
        public final String month;
        public final String monthTotal;
        public final String noActivityText;

        public Loaded(String str, String str2, String str3, String str4, String str5, String str6, UiCallbackModel uiCallbackModel) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, str3, str4, str5, str6);
            this.headerTitle = str;
            this.headerBody = str2;
            this.learnMoreText = str3;
            this.month = str4;
            this.monthTotal = str5;
            this.noActivityText = str6;
            this.activityEmbeddedModel = uiCallbackModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.headerTitle.equals(loaded.headerTitle) && Intrinsics.areEqual(this.headerBody, loaded.headerBody) && Intrinsics.areEqual(this.learnMoreText, loaded.learnMoreText) && Intrinsics.areEqual(this.month, loaded.month) && Intrinsics.areEqual(this.monthTotal, loaded.monthTotal) && Intrinsics.areEqual(this.noActivityText, loaded.noActivityText) && this.activityEmbeddedModel.equals(loaded.activityEmbeddedModel);
        }

        public final int hashCode() {
            return this.activityEmbeddedModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.headerTitle.hashCode() * 31, 31, this.headerBody), 31, this.learnMoreText), 31, this.month), 31, this.monthTotal), 31, this.noActivityText);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(headerTitle=", this.headerTitle, ", headerBody=", this.headerBody, ", learnMoreText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.learnMoreText, ", month=", this.month, ", monthTotal=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.monthTotal, ", noActivityText=", this.noActivityText, ", activityEmbeddedModel=");
            m.append(this.activityEmbeddedModel);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading extends GreenEligibleTransactionsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1954072734;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
