package com.squareup.cash.cashapplite.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;

/* loaded from: classes6.dex */
public interface ActivityAppletTileViewModel {

    public final class Installed implements ActivityAppletTileViewModel {
        public final UiCallbackModel activityModel;
        public final boolean showChevron;

        public Installed(UiCallbackModel uiCallbackModel, boolean z) {
            this.activityModel = uiCallbackModel;
            this.showChevron = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return this.activityModel.equals(installed.activityModel) && this.showChevron == installed.showChevron;
        }

        @Override // com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel
        public final UiCallbackModel getActivityModel() {
            return this.activityModel;
        }

        @Override // com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel
        public final boolean getShowChevron() {
            return this.showChevron;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showChevron) + (this.activityModel.hashCode() * 31);
        }

        public final String toString() {
            return "Installed(activityModel=" + this.activityModel + ", showChevron=" + this.showChevron + ")";
        }
    }

    public final class Loading implements ActivityAppletTileViewModel {
        public final UiCallbackModel activityModel;

        public Loading(UiCallbackModel uiCallbackModel) {
            this.activityModel = uiCallbackModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.activityModel.equals(((Loading) obj).activityModel);
        }

        @Override // com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel
        public final UiCallbackModel getActivityModel() {
            return this.activityModel;
        }

        @Override // com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel
        public final boolean getShowChevron() {
            return false;
        }

        public final int hashCode() {
            return this.activityModel.hashCode();
        }

        public final String toString() {
            return "Loading(activityModel=" + this.activityModel + ")";
        }
    }

    public final class NoActivity implements ActivityAppletTileViewModel {
        public static final NoActivity INSTANCE = new NoActivity();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoActivity);
        }

        @Override // com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel
        public final /* bridge */ /* synthetic */ UiCallbackModel getActivityModel() {
            return null;
        }

        @Override // com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel
        public final boolean getShowChevron() {
            return false;
        }

        public final int hashCode() {
            return 2143696044;
        }

        public final String toString() {
            return "NoActivity";
        }
    }

    UiCallbackModel getActivityModel();

    boolean getShowChevron();
}
