package com.squareup.cash.appmessages;

/* loaded from: classes5.dex */
public final class PromoterActivityMessages {
    public final CardAppMessageViewModel cardMessage;
    public final InlineAppMessageV2ViewModel inlineV2Message;

    public PromoterActivityMessages(CardAppMessageViewModel cardAppMessageViewModel, InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel) {
        this.cardMessage = cardAppMessageViewModel;
        this.inlineV2Message = inlineAppMessageV2ViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoterActivityMessages)) {
            return false;
        }
        PromoterActivityMessages promoterActivityMessages = (PromoterActivityMessages) obj;
        return this.cardMessage.equals(promoterActivityMessages.cardMessage) && this.inlineV2Message.equals(promoterActivityMessages.inlineV2Message);
    }

    public final int hashCode() {
        return this.inlineV2Message.hashCode() + (this.cardMessage.hashCode() * 31);
    }

    public final String toString() {
        return "PromoterActivityMessages(cardMessage=" + this.cardMessage + ", inlineV2Message=" + this.inlineV2Message + ")";
    }
}
