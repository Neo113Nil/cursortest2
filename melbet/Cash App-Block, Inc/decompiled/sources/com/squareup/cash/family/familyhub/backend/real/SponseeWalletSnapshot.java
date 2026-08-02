package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.protos.cash.postcard.CashAppCard;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SponseeWalletSnapshot {
    public final CashAppCard card;
    public final boolean isCardActivated;
    public final boolean isCardLockedBySponsor;
    public final List sponseeTags;

    public SponseeWalletSnapshot(CashAppCard cashAppCard, boolean z, boolean z2, List list) {
        list.getClass();
        this.card = cashAppCard;
        this.isCardLockedBySponsor = z;
        this.isCardActivated = z2;
        this.sponseeTags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static SponseeWalletSnapshot copy$default(SponseeWalletSnapshot sponseeWalletSnapshot, boolean z, ArrayList arrayList, int i) {
        CashAppCard cashAppCard = sponseeWalletSnapshot.card;
        if ((i & 2) != 0) {
            z = sponseeWalletSnapshot.isCardLockedBySponsor;
        }
        boolean z2 = sponseeWalletSnapshot.isCardActivated;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = sponseeWalletSnapshot.sponseeTags;
        }
        sponseeWalletSnapshot.getClass();
        arrayList2.getClass();
        return new SponseeWalletSnapshot(cashAppCard, z, z2, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponseeWalletSnapshot)) {
            return false;
        }
        SponseeWalletSnapshot sponseeWalletSnapshot = (SponseeWalletSnapshot) obj;
        return Intrinsics.areEqual(this.card, sponseeWalletSnapshot.card) && this.isCardLockedBySponsor == sponseeWalletSnapshot.isCardLockedBySponsor && this.isCardActivated == sponseeWalletSnapshot.isCardActivated && Intrinsics.areEqual(this.sponseeTags, sponseeWalletSnapshot.sponseeTags);
    }

    public final int hashCode() {
        CashAppCard cashAppCard = this.card;
        return this.sponseeTags.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((cashAppCard == null ? 0 : cashAppCard.hashCode()) * 31, 31, this.isCardLockedBySponsor), 31, this.isCardActivated);
    }

    public final String toString() {
        return "SponseeWalletSnapshot(card=" + this.card + ", isCardLockedBySponsor=" + this.isCardLockedBySponsor + ", isCardActivated=" + this.isCardActivated + ", sponseeTags=" + this.sponseeTags + ")";
    }
}
