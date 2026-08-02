package com.squareup.cash.benefits.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BenefitsHubViewEvent {

    public final class ActionClicked implements BenefitsHubViewEvent {
        public final RowAction.ID id;

        public ActionClicked(RowAction.ID id) {
            id.getClass();
            this.id = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionClicked) && this.id == ((ActionClicked) obj).id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "ActionClicked(id=" + this.id + ")";
        }
    }

    public final class Close implements BenefitsHubViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -213083867;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ExplainBenefitsClicked implements BenefitsHubViewEvent {
        public static final ExplainBenefitsClicked INSTANCE = new ExplainBenefitsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExplainBenefitsClicked);
        }

        public final int hashCode() {
            return -988780473;
        }

        public final String toString() {
            return "ExplainBenefitsClicked";
        }
    }

    public final class InsightClicked implements BenefitsHubViewEvent {
        public final BenefitsHubViewModel.Loaded.Insight insight;

        public InsightClicked(BenefitsHubViewModel.Loaded.Insight insight) {
            insight.getClass();
            this.insight = insight;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InsightClicked) && Intrinsics.areEqual(this.insight, ((InsightClicked) obj).insight);
        }

        public final int hashCode() {
            return this.insight.hashCode();
        }

        public final String toString() {
            return "InsightClicked(insight=" + this.insight + ")";
        }
    }

    public final class Retry implements BenefitsHubViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return -199434795;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* loaded from: classes4.dex */
    public final class ScrolledThrough implements BenefitsHubViewEvent {
        public final int progress;

        public ScrolledThrough(int i) {
            this.progress = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrolledThrough) && this.progress == ((ScrolledThrough) obj).progress;
        }

        public final int hashCode() {
            return Integer.hashCode(this.progress);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.progress, "ScrolledThrough(progress=", ")");
        }
    }

    public final class UrlClicked implements BenefitsHubViewEvent {
        public final String url;

        public UrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClicked) && Intrinsics.areEqual(this.url, ((UrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClicked(url=", this.url, ")");
        }
    }
}
