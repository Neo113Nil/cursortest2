package com.squareup.cash.family.applets.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;

/* loaded from: classes6.dex */
public interface DependentActivityAppletTileViewModel {

    public final class Installed implements DependentActivityAppletTileViewModel {
        public final UiCallbackModel activityModel;

        public Installed(UiCallbackModel uiCallbackModel) {
            this.activityModel = uiCallbackModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Installed) && this.activityModel.equals(((Installed) obj).activityModel);
        }

        @Override // com.squareup.cash.family.applets.viewmodels.DependentActivityAppletTileViewModel
        public final UiCallbackModel getActivityModel() {
            return this.activityModel;
        }

        public final int hashCode() {
            return this.activityModel.hashCode();
        }

        public final String toString() {
            return "Installed(activityModel=" + this.activityModel + ")";
        }
    }

    public final class Loading implements DependentActivityAppletTileViewModel {
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

        @Override // com.squareup.cash.family.applets.viewmodels.DependentActivityAppletTileViewModel
        public final UiCallbackModel getActivityModel() {
            return this.activityModel;
        }

        public final int hashCode() {
            return this.activityModel.hashCode();
        }

        public final String toString() {
            return "Loading(activityModel=" + this.activityModel + ")";
        }
    }

    public final class NoActivity implements DependentActivityAppletTileViewModel {
        public static final NoActivity INSTANCE = new NoActivity();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoActivity);
        }

        @Override // com.squareup.cash.family.applets.viewmodels.DependentActivityAppletTileViewModel
        public final /* bridge */ /* synthetic */ UiCallbackModel getActivityModel() {
            return null;
        }

        public final int hashCode() {
            return -994511010;
        }

        public final String toString() {
            return "NoActivity";
        }
    }

    UiCallbackModel getActivityModel();
}
