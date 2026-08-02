package com.squareup.cash.offers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface OffersCollectionListingViewModel {

    public final class Error implements OffersCollectionListingViewModel {
        public final String title;

        public Error(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.title, ((Error) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode() * 31;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(title=", this.title, ", message=null)");
        }
    }

    public final class Loaded implements OffersCollectionListingViewModel {
        public final String browseFlowToken;
        public final List items;

        public Loaded(String str, ListBuilder listBuilder) {
            str.getClass();
            listBuilder.getClass();
            this.browseFlowToken = str;
            this.items = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.browseFlowToken, loaded.browseFlowToken) && Intrinsics.areEqual(this.items, loaded.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.browseFlowToken.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Loaded(browseFlowToken=", this.browseFlowToken, ", items=", ")", this.items);
        }
    }

    public final class Loading implements OffersCollectionListingViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1917630915;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
