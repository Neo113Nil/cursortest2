package com.squareup.cash.score.applets.viewmodels;

import com.squareup.lending.CashCreditScoreEntryPointData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ScoreAppletTileViewEvent$Action {
    public final CashCreditScoreEntryPointData.Action proto;

    public ScoreAppletTileViewEvent$Action(CashCreditScoreEntryPointData.Action action) {
        action.getClass();
        this.proto = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScoreAppletTileViewEvent$Action) && Intrinsics.areEqual(this.proto, ((ScoreAppletTileViewEvent$Action) obj).proto);
    }

    public final int hashCode() {
        return this.proto.hashCode();
    }

    public final String toString() {
        return "Action(proto=" + this.proto + ")";
    }
}
