package app.cash.local.presenters.internal;

import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.order.RowIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComputedRow {
    public final LocalMoney amount;
    public final String identifier;

    public ComputedRow(LocalMoney localMoney, String str) {
        str.getClass();
        this.identifier = str;
        this.amount = localMoney;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComputedRow)) {
            return false;
        }
        ComputedRow computedRow = (ComputedRow) obj;
        return Intrinsics.areEqual(this.identifier, computedRow.identifier) && this.amount.equals(computedRow.amount);
    }

    public final int hashCode() {
        return this.amount.hashCode() + (this.identifier.hashCode() * 31);
    }

    public final String toString() {
        return "ComputedRow(identifier=" + RowIdentifier.m1286toStringimpl(this.identifier) + ", amount=" + this.amount + ")";
    }
}
