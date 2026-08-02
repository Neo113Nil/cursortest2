package com.squareup.cash.shopping.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ShopHubResultsListItem {

    public final class EmptyResult extends ShopHubResultsListItem {
        public final String message;
        public final String title;

        public EmptyResult(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.message = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyResult)) {
                return false;
            }
            EmptyResult emptyResult = (EmptyResult) obj;
            return Intrinsics.areEqual(this.title, emptyResult.title) && Intrinsics.areEqual(this.message, emptyResult.message);
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("EmptyResult(title=", this.title, ", message=", this.message, ")");
        }
    }

    public final class ProgressIndicator extends ShopHubResultsListItem {
        public static final ProgressIndicator INSTANCE = new ProgressIndicator();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProgressIndicator);
        }

        public final int hashCode() {
            return 1593307239;
        }

        public final String toString() {
            return "ProgressIndicator";
        }
    }

    public final class Results extends ShopHubResultsListItem {
        public final List results;

        public Results(List list) {
            list.getClass();
            this.results = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Results) && Intrinsics.areEqual(this.results, ((Results) obj).results);
        }

        public final int hashCode() {
            return this.results.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Results(results=", ")", this.results);
        }
    }
}
