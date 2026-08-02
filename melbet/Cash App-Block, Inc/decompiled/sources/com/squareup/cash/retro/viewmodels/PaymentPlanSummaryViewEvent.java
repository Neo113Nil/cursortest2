package com.squareup.cash.retro.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PaymentPlanSummaryViewEvent {

    public final class Close implements PaymentPlanSummaryViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1747265675;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DismissBottomSheet implements PaymentPlanSummaryViewEvent {
        public static final DismissBottomSheet INSTANCE = new DismissBottomSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissBottomSheet);
        }

        public final int hashCode() {
            return -1540420265;
        }

        public final String toString() {
            return "DismissBottomSheet";
        }
    }

    public final class OpenUri implements PaymentPlanSummaryViewEvent {
        public final String uri;

        public OpenUri(String str) {
            str.getClass();
            this.uri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUri) && Intrinsics.areEqual(this.uri, ((OpenUri) obj).uri);
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUri(uri=", this.uri, ")");
        }
    }

    public final class Submit implements PaymentPlanSummaryViewEvent {
        public final String id;

        public Submit(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Submit) && Intrinsics.areEqual(this.id, ((Submit) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Submit(id=", this.id, ")");
        }
    }

    public final class ViewSourceInfo implements PaymentPlanSummaryViewEvent {
        public static final ViewSourceInfo INSTANCE = new ViewSourceInfo();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewSourceInfo);
        }

        public final int hashCode() {
            return -517246277;
        }

        public final String toString() {
            return "ViewSourceInfo";
        }
    }
}
