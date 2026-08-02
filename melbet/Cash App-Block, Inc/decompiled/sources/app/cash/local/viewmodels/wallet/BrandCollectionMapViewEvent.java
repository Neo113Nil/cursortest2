package app.cash.local.viewmodels.wallet;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface BrandCollectionMapViewEvent {

    public final class BackClicked implements BrandCollectionMapViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -25783319;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class LocationSelectorClicked implements BrandCollectionMapViewEvent {
        public final String clientRoute;

        public LocationSelectorClicked(String str) {
            str.getClass();
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationSelectorClicked) && Intrinsics.areEqual(this.clientRoute, ((LocationSelectorClicked) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocationSelectorClicked(clientRoute=", this.clientRoute, ")");
        }
    }

    public final class SheetToggled implements BrandCollectionMapViewEvent {
        public static final SheetToggled INSTANCE = new SheetToggled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetToggled);
        }

        public final int hashCode() {
            return -883371096;
        }

        public final String toString() {
            return "SheetToggled";
        }
    }
}
