package com.squareup.cash.borrow.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BorrowHomeOverlayEvent {

    public interface BulletinInfoOverlayEvent extends BorrowHomeOverlayEvent {

        public final class Dismiss implements BulletinInfoOverlayEvent {
            public static final Dismiss INSTANCE = new Dismiss();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Dismiss);
            }

            public final int hashCode() {
                return 1009545523;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        public final class TapAction implements BulletinInfoOverlayEvent {
            public final SheetButtonAction action;
            public final String analyticsId;

            public TapAction(SheetButtonAction sheetButtonAction, String str) {
                sheetButtonAction.getClass();
                str.getClass();
                this.action = sheetButtonAction;
                this.analyticsId = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TapAction)) {
                    return false;
                }
                TapAction tapAction = (TapAction) obj;
                return Intrinsics.areEqual(this.action, tapAction.action) && Intrinsics.areEqual(this.analyticsId, tapAction.analyticsId);
            }

            public final int hashCode() {
                return this.analyticsId.hashCode() + (this.action.hashCode() * 31);
            }

            public final String toString() {
                return "TapAction(action=" + this.action + ", analyticsId=" + this.analyticsId + ")";
            }
        }

        public final class TapLink implements BulletinInfoOverlayEvent {
            public final String url;

            public TapLink(String str) {
                str.getClass();
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TapLink) && Intrinsics.areEqual(this.url, ((TapLink) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapLink(url=", this.url, ")");
            }
        }
    }

    public interface RepaymentSheetEvent extends BorrowHomeOverlayEvent {

        public final class Dismiss implements RepaymentSheetEvent {
            public static final Dismiss INSTANCE = new Dismiss();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Dismiss);
            }

            public final int hashCode() {
                return 265131218;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        public final class InitiateRepayment implements RepaymentSheetEvent {
            public final SheetButtonAction action;

            public InitiateRepayment(SheetButtonAction sheetButtonAction) {
                this.action = sheetButtonAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiateRepayment) && this.action.equals(((InitiateRepayment) obj).action);
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return "InitiateRepayment(action=" + this.action + ")";
            }
        }

        public final class TapAction implements RepaymentSheetEvent {
            public final String route;

            public TapAction(String str) {
                str.getClass();
                this.route = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TapAction) && Intrinsics.areEqual(this.route, ((TapAction) obj).route);
            }

            public final int hashCode() {
                return this.route.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapAction(route=", this.route, ")");
            }
        }
    }
}
