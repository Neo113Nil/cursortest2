package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedLink;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BenefitsHub$BenefitsBreakdown$LearnMore$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.BenefitsBreakdown.LearnMore((TintedLink) obj, (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TintedLink.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore learnMore = (BenefitsHub.BenefitsBreakdown.LearnMore) obj;
        reverseProtoWriter.getClass();
        learnMore.getClass();
        reverseProtoWriter.writeBytes(learnMore.unknownFields());
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.ADAPTER.encodeWithTag(reverseProtoWriter, 2, learnMore.benefits_explanation_screen);
        TintedLink.ADAPTER.encodeWithTag(reverseProtoWriter, 1, learnMore.link);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore learnMore = (BenefitsHub.BenefitsBreakdown.LearnMore) obj;
        learnMore.getClass();
        return BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.ADAPTER.encodedSizeWithTag(2, learnMore.benefits_explanation_screen) + TintedLink.ADAPTER.encodedSizeWithTag(1, learnMore.link) + learnMore.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore learnMore = (BenefitsHub.BenefitsBreakdown.LearnMore) obj;
        learnMore.getClass();
        TintedLink tintedLink = learnMore.link;
        TintedLink tintedLink2 = tintedLink != null ? (TintedLink) TintedLink.ADAPTER.redact(tintedLink) : null;
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen benefitsExplanationScreen = learnMore.benefits_explanation_screen;
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen benefitsExplanationScreen2 = benefitsExplanationScreen != null ? (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen) BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.ADAPTER.redact(benefitsExplanationScreen) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BenefitsHub.BenefitsBreakdown.LearnMore(tintedLink2, benefitsExplanationScreen2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore learnMore = (BenefitsHub.BenefitsBreakdown.LearnMore) obj;
        learnMore.getClass();
        TintedLink.ADAPTER.encodeWithTag(protoWriter, 1, learnMore.link);
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.ADAPTER.encodeWithTag(protoWriter, 2, learnMore.benefits_explanation_screen);
        protoWriter.writeBytes(learnMore.unknownFields());
    }
}
