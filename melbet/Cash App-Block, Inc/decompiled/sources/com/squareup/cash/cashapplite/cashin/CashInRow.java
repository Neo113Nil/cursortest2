package com.squareup.cash.cashapplite.cashin;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CashInRow {
    public final CashInRowAction action;
    public final String subtitle;
    public final String title;

    public CashInRow(String str, String str2, CashInRowAction cashInRowAction) {
        this.title = str;
        this.subtitle = str2;
        this.action = cashInRowAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashInRow)) {
            return false;
        }
        CashInRow cashInRow = (CashInRow) obj;
        return this.title.equals(cashInRow.title) && this.subtitle.equals(cashInRow.subtitle) && this.action == cashInRow.action;
    }

    public final int hashCode() {
        return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashInRow(title=", this.title, ", subtitle=", this.subtitle, ", action=");
        m.append(this.action);
        m.append(")");
        return m.toString();
    }
}
