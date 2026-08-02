package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.shop.rendering.api.Button;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayAppletInfoSheetViewEvent {

    public final class ButtonTapped implements AfterpayAppletInfoSheetViewEvent {
        public final Button button;

        public ButtonTapped(Button button) {
            button.getClass();
            this.button = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonTapped) && Intrinsics.areEqual(this.button, ((ButtonTapped) obj).button);
        }

        public final int hashCode() {
            return this.button.hashCode();
        }

        public final String toString() {
            return "ButtonTapped(button=" + this.button + ")";
        }
    }

    public final class DismissSheet implements AfterpayAppletInfoSheetViewEvent, AfterpayAnalyticsAppletTappedEvent {
        public final List analyticsAppletTappedEvent;

        public DismissSheet(List list) {
            this.analyticsAppletTappedEvent = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DismissSheet) && Intrinsics.areEqual(this.analyticsAppletTappedEvent, ((DismissSheet) obj).analyticsAppletTappedEvent);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent
        public final List getAnalyticsAppletTappedEvent() {
            return this.analyticsAppletTappedEvent;
        }

        public final int hashCode() {
            List list = this.analyticsAppletTappedEvent;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("DismissSheet(analyticsAppletTappedEvent=", ")", this.analyticsAppletTappedEvent);
        }
    }

    public final class UrlTapped implements AfterpayAppletInfoSheetViewEvent {
        public final String actionUrl;

        public UrlTapped(String str) {
            str.getClass();
            this.actionUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlTapped) && Intrinsics.areEqual(this.actionUrl, ((UrlTapped) obj).actionUrl);
        }

        public final int hashCode() {
            return this.actionUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlTapped(actionUrl=", this.actionUrl, ")");
        }
    }
}
