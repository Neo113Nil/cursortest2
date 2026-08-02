package com.fidesmo.sec.core.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/fidesmo/sec/core/models/FidesmoPayExtraInfo;", "", "bank", "Lcom/fidesmo/sec/core/models/FidesmoPayBank;", "token", "Lcom/fidesmo/sec/core/models/FidesmoPayToken;", "card", "Lcom/fidesmo/sec/core/models/FidesmoPayCard;", "(Lcom/fidesmo/sec/core/models/FidesmoPayBank;Lcom/fidesmo/sec/core/models/FidesmoPayToken;Lcom/fidesmo/sec/core/models/FidesmoPayCard;)V", "getBank", "()Lcom/fidesmo/sec/core/models/FidesmoPayBank;", "getCard", "()Lcom/fidesmo/sec/core/models/FidesmoPayCard;", "getToken", "()Lcom/fidesmo/sec/core/models/FidesmoPayToken;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FidesmoPayExtraInfo {
    private final FidesmoPayBank bank;
    private final FidesmoPayCard card;
    private final FidesmoPayToken token;

    public /* synthetic */ FidesmoPayExtraInfo(FidesmoPayBank fidesmoPayBank, FidesmoPayToken fidesmoPayToken, FidesmoPayCard fidesmoPayCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fidesmoPayBank, (i & 2) != 0 ? null : fidesmoPayToken, (i & 4) != 0 ? null : fidesmoPayCard);
    }

    public static /* synthetic */ FidesmoPayExtraInfo copy$default(FidesmoPayExtraInfo fidesmoPayExtraInfo, FidesmoPayBank fidesmoPayBank, FidesmoPayToken fidesmoPayToken, FidesmoPayCard fidesmoPayCard, int i, Object obj) {
        if ((i & 1) != 0) {
            fidesmoPayBank = fidesmoPayExtraInfo.bank;
        }
        if ((i & 2) != 0) {
            fidesmoPayToken = fidesmoPayExtraInfo.token;
        }
        if ((i & 4) != 0) {
            fidesmoPayCard = fidesmoPayExtraInfo.card;
        }
        return fidesmoPayExtraInfo.copy(fidesmoPayBank, fidesmoPayToken, fidesmoPayCard);
    }

    /* renamed from: component1, reason: from getter */
    public final FidesmoPayBank getBank() {
        return this.bank;
    }

    /* renamed from: component2, reason: from getter */
    public final FidesmoPayToken getToken() {
        return this.token;
    }

    /* renamed from: component3, reason: from getter */
    public final FidesmoPayCard getCard() {
        return this.card;
    }

    public final FidesmoPayExtraInfo copy(FidesmoPayBank bank, FidesmoPayToken token, FidesmoPayCard card) {
        return new FidesmoPayExtraInfo(bank, token, card);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FidesmoPayExtraInfo)) {
            return false;
        }
        FidesmoPayExtraInfo fidesmoPayExtraInfo = (FidesmoPayExtraInfo) other;
        return Intrinsics.areEqual(this.bank, fidesmoPayExtraInfo.bank) && Intrinsics.areEqual(this.token, fidesmoPayExtraInfo.token) && Intrinsics.areEqual(this.card, fidesmoPayExtraInfo.card);
    }

    public final FidesmoPayBank getBank() {
        return this.bank;
    }

    public final FidesmoPayCard getCard() {
        return this.card;
    }

    public final FidesmoPayToken getToken() {
        return this.token;
    }

    public int hashCode() {
        FidesmoPayBank fidesmoPayBank = this.bank;
        int hashCode = (fidesmoPayBank == null ? 0 : fidesmoPayBank.hashCode()) * 31;
        FidesmoPayToken fidesmoPayToken = this.token;
        int hashCode2 = (hashCode + (fidesmoPayToken == null ? 0 : fidesmoPayToken.hashCode())) * 31;
        FidesmoPayCard fidesmoPayCard = this.card;
        return hashCode2 + (fidesmoPayCard != null ? fidesmoPayCard.hashCode() : 0);
    }

    public String toString() {
        return "FidesmoPayExtraInfo(bank=" + this.bank + ", token=" + this.token + ", card=" + this.card + ')';
    }

    public FidesmoPayExtraInfo(FidesmoPayBank fidesmoPayBank, FidesmoPayToken fidesmoPayToken, FidesmoPayCard fidesmoPayCard) {
        this.bank = fidesmoPayBank;
        this.token = fidesmoPayToken;
        this.card = fidesmoPayCard;
    }

    public FidesmoPayExtraInfo() {
        this(null, null, null, 7, null);
    }
}
