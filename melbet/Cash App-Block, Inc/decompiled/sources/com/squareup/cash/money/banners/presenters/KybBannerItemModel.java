package com.squareup.cash.money.banners.presenters;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;

/* loaded from: classes6.dex */
public interface KybBannerItemModel {

    public final class Available implements KybBannerItemModel {
        public final UiCallbackModel callbackModel;

        public Available(UiCallbackModel uiCallbackModel) {
            this.callbackModel = uiCallbackModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Available) && this.callbackModel.equals(((Available) obj).callbackModel);
        }

        public final int hashCode() {
            return this.callbackModel.hashCode();
        }

        public final String toString() {
            return "Available(callbackModel=" + this.callbackModel + ")";
        }
    }

    public final class Unavailable implements KybBannerItemModel {
        public static final Unavailable INSTANCE = new Unavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public final int hashCode() {
            return 2093008340;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}
