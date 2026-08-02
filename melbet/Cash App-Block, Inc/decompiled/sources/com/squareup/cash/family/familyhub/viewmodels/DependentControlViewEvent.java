package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.cash.family.familyhub.backend.api.ControlType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DependentControlViewEvent {

    public final class CustomLimitSetupEnded implements DependentControlViewEvent {
        public final ControlType controlType;

        public CustomLimitSetupEnded(ControlType controlType) {
            controlType.getClass();
            this.controlType = controlType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomLimitSetupEnded) && this.controlType == ((CustomLimitSetupEnded) obj).controlType;
        }

        public final int hashCode() {
            return this.controlType.hashCode();
        }

        public final String toString() {
            return "CustomLimitSetupEnded(controlType=" + this.controlType + ")";
        }
    }

    public final class FooterLinkClicked implements DependentControlViewEvent {
        public final String url;

        public FooterLinkClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterLinkClicked) && Intrinsics.areEqual(this.url, ((FooterLinkClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FooterLinkClicked(url=", this.url, ")");
        }
    }

    public final class TapBack implements DependentControlViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return 1682610857;
        }

        public final String toString() {
            return "TapBack";
        }
    }
}
