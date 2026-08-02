package com.squareup.cash.borrow.viewmodels;

import com.squareup.protos.lending.LoanRepaymentSelectionData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface SheetButtonAction {

    public final class ActionUrl implements SheetButtonAction {
        public final String url;

        public ActionUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionUrl) && Intrinsics.areEqual(this.url, ((ActionUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionUrl(url=", this.url, ")");
        }
    }

    public final class RepaymentSelection implements SheetButtonAction {
        public final LoanRepaymentSelectionData data;

        public RepaymentSelection(LoanRepaymentSelectionData loanRepaymentSelectionData) {
            loanRepaymentSelectionData.getClass();
            this.data = loanRepaymentSelectionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RepaymentSelection) && Intrinsics.areEqual(this.data, ((RepaymentSelection) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "RepaymentSelection(data=" + this.data + ")";
        }
    }
}
