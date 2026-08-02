package com.squareup.cash.deposits.physical.viewmodels.map;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PaperMoneyDepositMapEvent {

    public final class BackClick extends PaperMoneyDepositMapEvent {
        public static final BackClick INSTANCE = new BackClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClick);
        }

        public final int hashCode() {
            return 395339322;
        }

        public final String toString() {
            return "BackClick";
        }
    }

    public final class ExitClick extends PaperMoneyDepositMapEvent {
        public static final ExitClick INSTANCE = new ExitClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitClick);
        }

        public final int hashCode() {
            return 1985592419;
        }

        public final String toString() {
            return "ExitClick";
        }
    }

    public final class HelpClick extends PaperMoneyDepositMapEvent {
        public static final HelpClick INSTANCE = new HelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpClick);
        }

        public final int hashCode() {
            return 357565472;
        }

        public final String toString() {
            return "HelpClick";
        }
    }

    public final class SearchClick extends PaperMoneyDepositMapEvent {
        public static final SearchClick INSTANCE = new SearchClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchClick);
        }

        public final int hashCode() {
            return 1810195417;
        }

        public final String toString() {
            return "SearchClick";
        }
    }

    public final class ShowBarcodeClick extends PaperMoneyDepositMapEvent {
        public static final ShowBarcodeClick INSTANCE = new ShowBarcodeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowBarcodeClick);
        }

        public final int hashCode() {
            return -565299956;
        }

        public final String toString() {
            return "ShowBarcodeClick";
        }
    }

    public final class UpdateFilters extends PaperMoneyDepositMapEvent {
        public final List filters;

        public UpdateFilters(List list) {
            list.getClass();
            this.filters = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateFilters) && Intrinsics.areEqual(this.filters, ((UpdateFilters) obj).filters);
        }

        public final int hashCode() {
            return this.filters.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("UpdateFilters(filters=", ")", this.filters);
        }
    }

    public final class ViewFilters extends PaperMoneyDepositMapEvent {
        public static final ViewFilters INSTANCE = new ViewFilters();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewFilters);
        }

        public final int hashCode() {
            return 1511413935;
        }

        public final String toString() {
            return "ViewFilters";
        }
    }
}
