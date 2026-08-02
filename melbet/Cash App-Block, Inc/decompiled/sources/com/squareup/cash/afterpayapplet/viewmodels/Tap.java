package com.squareup.cash.afterpayapplet.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface Tap {

    public final class Dismiss implements Tap {
        public final List analyticsTapEventsSpec;

        public Dismiss(ArrayList arrayList) {
            this.analyticsTapEventsSpec = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dismiss) && Intrinsics.areEqual(this.analyticsTapEventsSpec, ((Dismiss) obj).analyticsTapEventsSpec);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.Tap
        public final List getAnalyticsTapEventsSpec() {
            return this.analyticsTapEventsSpec;
        }

        public final int hashCode() {
            List list = this.analyticsTapEventsSpec;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Dismiss(analyticsTapEventsSpec=", ")", this.analyticsTapEventsSpec);
        }
    }

    public final class Info implements Tap {
        public final List analyticsTapEventsSpec;
        public final InfoSheet info;

        public Info(InfoSheet infoSheet, ArrayList arrayList) {
            this.info = infoSheet;
            this.analyticsTapEventsSpec = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return this.info.equals(info.info) && Intrinsics.areEqual(this.analyticsTapEventsSpec, info.analyticsTapEventsSpec);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.Tap
        public final List getAnalyticsTapEventsSpec() {
            return this.analyticsTapEventsSpec;
        }

        public final int hashCode() {
            int hashCode = this.info.hashCode() * 31;
            List list = this.analyticsTapEventsSpec;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return "Info(info=" + this.info + ", analyticsTapEventsSpec=" + this.analyticsTapEventsSpec + ")";
        }
    }

    public final class ScrollTo implements Tap {
        public final List analyticsTapEventsSpec;
        public final String id;

        public ScrollTo(String str, ArrayList arrayList) {
            this.id = str;
            this.analyticsTapEventsSpec = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScrollTo)) {
                return false;
            }
            ScrollTo scrollTo = (ScrollTo) obj;
            return this.id.equals(scrollTo.id) && Intrinsics.areEqual(this.analyticsTapEventsSpec, scrollTo.analyticsTapEventsSpec);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.Tap
        public final List getAnalyticsTapEventsSpec() {
            return this.analyticsTapEventsSpec;
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            List list = this.analyticsTapEventsSpec;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ScrollTo(id=", this.id, ", analyticsTapEventsSpec=", ")", this.analyticsTapEventsSpec);
        }
    }

    List getAnalyticsTapEventsSpec();

    public final class Url implements Tap {
        public final String actionUrl;
        public final List analyticsTapEventsSpec;

        public Url(String str, List list) {
            str.getClass();
            this.actionUrl = str;
            this.analyticsTapEventsSpec = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return Intrinsics.areEqual(this.actionUrl, url.actionUrl) && Intrinsics.areEqual(this.analyticsTapEventsSpec, url.analyticsTapEventsSpec);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.Tap
        public final List getAnalyticsTapEventsSpec() {
            return this.analyticsTapEventsSpec;
        }

        public final int hashCode() {
            int hashCode = this.actionUrl.hashCode() * 31;
            List list = this.analyticsTapEventsSpec;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Url(actionUrl=", this.actionUrl, ", analyticsTapEventsSpec=", ")", this.analyticsTapEventsSpec);
        }

        public /* synthetic */ Url(String str) {
            this(str, null);
        }
    }
}
