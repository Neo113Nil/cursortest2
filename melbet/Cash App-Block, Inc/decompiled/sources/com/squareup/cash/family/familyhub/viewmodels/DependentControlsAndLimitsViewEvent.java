package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.cash.family.familyhub.backend.api.ControlType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class DependentControlsAndLimitsViewEvent {

    public final class ControlDetailNavigation extends DependentControlsAndLimitsViewEvent {
        public final ControlType controlType;

        public ControlDetailNavigation(ControlType controlType) {
            this.controlType = controlType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ControlDetailNavigation) && this.controlType == ((ControlDetailNavigation) obj).controlType;
        }

        public final int hashCode() {
            return this.controlType.hashCode();
        }

        public final String toString() {
            return "ControlDetailNavigation(controlType=" + this.controlType + ")";
        }
    }

    public final class LinkClicked extends DependentControlsAndLimitsViewEvent {
        public final String url;

        public LinkClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkClicked) && Intrinsics.areEqual(this.url, ((LinkClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LinkClicked(url=", this.url, ")");
        }
    }

    public final class TapBack extends DependentControlsAndLimitsViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return -1948468595;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapBlockedAccounts extends DependentControlsAndLimitsViewEvent {
        public static final TapBlockedAccounts INSTANCE = new TapBlockedAccounts();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBlockedAccounts);
        }

        public final int hashCode() {
            return -1299858292;
        }

        public final String toString() {
            return "TapBlockedAccounts";
        }
    }
}
