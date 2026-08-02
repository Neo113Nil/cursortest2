package app.cash.local.viewmodels.sheet;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface EducationalSheetEvent {

    public final class ButtonTap implements EducationalSheetEvent {
        public final EducationalButtonAction action;
        public final int sheetIndex;

        public ButtonTap(int i, EducationalButtonAction educationalButtonAction) {
            educationalButtonAction.getClass();
            this.sheetIndex = i;
            this.action = educationalButtonAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonTap)) {
                return false;
            }
            ButtonTap buttonTap = (ButtonTap) obj;
            return this.sheetIndex == buttonTap.sheetIndex && Intrinsics.areEqual(this.action, buttonTap.action);
        }

        @Override // app.cash.local.viewmodels.sheet.EducationalSheetEvent
        public final int getSheetIndex() {
            return this.sheetIndex;
        }

        public final int hashCode() {
            return this.action.hashCode() + (Integer.hashCode(this.sheetIndex) * 31);
        }

        public final String toString() {
            return "ButtonTap(sheetIndex=" + this.sheetIndex + ", action=" + this.action + ")";
        }
    }

    public final class OnUrlClick implements EducationalSheetEvent {
        public final int sheetIndex;
        public final String url;

        public OnUrlClick(int i, String str) {
            str.getClass();
            this.sheetIndex = i;
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnUrlClick)) {
                return false;
            }
            OnUrlClick onUrlClick = (OnUrlClick) obj;
            return this.sheetIndex == onUrlClick.sheetIndex && Intrinsics.areEqual(this.url, onUrlClick.url);
        }

        @Override // app.cash.local.viewmodels.sheet.EducationalSheetEvent
        public final int getSheetIndex() {
            return this.sheetIndex;
        }

        public final int hashCode() {
            return this.url.hashCode() + (Integer.hashCode(this.sheetIndex) * 31);
        }

        public final String toString() {
            return "OnUrlClick(sheetIndex=" + this.sheetIndex + ", url=" + this.url + ")";
        }
    }

    public final class PageSeen implements EducationalSheetEvent {
        public final int sheetIndex;

        public PageSeen(int i) {
            this.sheetIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageSeen) && this.sheetIndex == ((PageSeen) obj).sheetIndex;
        }

        @Override // app.cash.local.viewmodels.sheet.EducationalSheetEvent
        public final int getSheetIndex() {
            return this.sheetIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.sheetIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sheetIndex, "PageSeen(sheetIndex=", ")");
        }
    }

    public final class SheetDismissed implements EducationalSheetEvent {
        public final int sheetIndex;

        public SheetDismissed(int i) {
            this.sheetIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SheetDismissed) && this.sheetIndex == ((SheetDismissed) obj).sheetIndex;
        }

        @Override // app.cash.local.viewmodels.sheet.EducationalSheetEvent
        public final int getSheetIndex() {
            return this.sheetIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.sheetIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sheetIndex, "SheetDismissed(sheetIndex=", ")");
        }
    }

    public final class SheetHasBeenExpanded implements EducationalSheetEvent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetHasBeenExpanded);
        }

        @Override // app.cash.local.viewmodels.sheet.EducationalSheetEvent
        public final int getSheetIndex() {
            return 0;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "SheetHasBeenExpanded(sheetIndex=0)";
        }
    }

    public final class SwipeToSeeMoreTap implements EducationalSheetEvent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwipeToSeeMoreTap);
        }

        @Override // app.cash.local.viewmodels.sheet.EducationalSheetEvent
        public final int getSheetIndex() {
            return 0;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "SwipeToSeeMoreTap(sheetIndex=0)";
        }
    }

    int getSheetIndex();
}
