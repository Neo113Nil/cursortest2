package com.squareup.cash.blockers.actions.viewevents;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class BlockerActionConfirmSheetViewEvent {

    public final class ConfirmClicked extends BlockerActionConfirmSheetViewEvent {
        public static final ConfirmClicked INSTANCE = new ConfirmClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmClicked);
        }

        public final int hashCode() {
            return 529716019;
        }

        public final String toString() {
            return "ConfirmClicked";
        }
    }

    public final class Dismiss extends BlockerActionConfirmSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1385306654;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class GoBackClicked extends BlockerActionConfirmSheetViewEvent {
        public static final GoBackClicked INSTANCE = new GoBackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBackClicked);
        }

        public final int hashCode() {
            return 1392477132;
        }

        public final String toString() {
            return "GoBackClicked";
        }
    }

    public final class InteractionEvent extends BlockerActionConfirmSheetViewEvent {
        public static final InteractionEvent INSTANCE = new InteractionEvent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InteractionEvent);
        }

        public final int hashCode() {
            return 556502676;
        }

        public final String toString() {
            return "InteractionEvent";
        }
    }

    public final class SuccessAnimationComplete extends BlockerActionConfirmSheetViewEvent {
        public static final SuccessAnimationComplete INSTANCE = new SuccessAnimationComplete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuccessAnimationComplete);
        }

        public final int hashCode() {
            return 1423492614;
        }

        public final String toString() {
            return "SuccessAnimationComplete";
        }
    }

    /* loaded from: classes5.dex */
    public final class UrlClicked extends BlockerActionConfirmSheetViewEvent {
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
