package com.squareup.cash.investing.viewmodels.activity;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingActivityHistoryViewModel {

    public final class Content implements InvestingActivityHistoryViewModel {
        public final UiCallbackModel activityModel;
        public final String title;

        public Content(UiCallbackModel uiCallbackModel, String str) {
            str.getClass();
            this.title = str;
            this.activityModel = uiCallbackModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && this.activityModel.equals(content.activityModel);
        }

        public final int hashCode() {
            return this.activityModel.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "Content(title=" + this.title + ", activityModel=" + this.activityModel + ")";
        }
    }

    public final class Loading implements InvestingActivityHistoryViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2133430855;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
