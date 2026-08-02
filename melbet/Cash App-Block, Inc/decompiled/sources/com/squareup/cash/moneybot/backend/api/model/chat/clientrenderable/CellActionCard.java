package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes6.dex */
public final class CellActionCard {
    public final TapBehavior.CardButtons cardButtons;
    public final CellDefault cell;
    public final String requestId;

    public CellActionCard(String str, CellDefault cellDefault, TapBehavior.CardButtons cardButtons) {
        cellDefault.getClass();
        this.requestId = str;
        this.cell = cellDefault;
        this.cardButtons = cardButtons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellActionCard)) {
            return false;
        }
        CellActionCard cellActionCard = (CellActionCard) obj;
        return Intrinsics.areEqual(this.requestId, cellActionCard.requestId) && Intrinsics.areEqual(this.cell, cellActionCard.cell) && Intrinsics.areEqual(this.cardButtons, cellActionCard.cardButtons);
    }

    public final int hashCode() {
        String str = this.requestId;
        int hashCode = (this.cell.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        TapBehavior.CardButtons cardButtons = this.cardButtons;
        return hashCode + (cardButtons != null ? cardButtons.hashCode() : 0);
    }

    public final String toString() {
        return "CellActionCard(requestId=" + this.requestId + ", version=0, cell=" + this.cell + ", cardButtons=" + this.cardButtons + ")";
    }
}
