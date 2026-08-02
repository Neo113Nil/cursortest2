package com.squareup.cash.moneta.plasma;

import androidx.room.TransactorKt;
import com.squareup.cash.moneta.plasma.LinkBankAccountPlaidThenRedirectFlowParameters;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class LinkBankAccountPlaidThenRedirectFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkBankAccountPlaidThenRedirectFlowParameters((LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkBankAccountPlaidThenRedirectFlowParameters linkBankAccountPlaidThenRedirectFlowParameters = (LinkBankAccountPlaidThenRedirectFlowParameters) obj;
        reverseProtoWriter.getClass();
        linkBankAccountPlaidThenRedirectFlowParameters.getClass();
        reverseProtoWriter.writeBytes(linkBankAccountPlaidThenRedirectFlowParameters.unknownFields());
        LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, linkBankAccountPlaidThenRedirectFlowParameters.bitcoin_buy_client_route_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkBankAccountPlaidThenRedirectFlowParameters linkBankAccountPlaidThenRedirectFlowParameters = (LinkBankAccountPlaidThenRedirectFlowParameters) obj;
        linkBankAccountPlaidThenRedirectFlowParameters.getClass();
        return LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext.ADAPTER.encodedSizeWithTag(1, linkBankAccountPlaidThenRedirectFlowParameters.bitcoin_buy_client_route_context) + linkBankAccountPlaidThenRedirectFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkBankAccountPlaidThenRedirectFlowParameters linkBankAccountPlaidThenRedirectFlowParameters = (LinkBankAccountPlaidThenRedirectFlowParameters) obj;
        linkBankAccountPlaidThenRedirectFlowParameters.getClass();
        LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext = linkBankAccountPlaidThenRedirectFlowParameters.bitcoin_buy_client_route_context;
        LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext2 = bitcoinBuyClientRouteContext != null ? (LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext) LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext.ADAPTER.redact(bitcoinBuyClientRouteContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LinkBankAccountPlaidThenRedirectFlowParameters(bitcoinBuyClientRouteContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkBankAccountPlaidThenRedirectFlowParameters linkBankAccountPlaidThenRedirectFlowParameters = (LinkBankAccountPlaidThenRedirectFlowParameters) obj;
        linkBankAccountPlaidThenRedirectFlowParameters.getClass();
        LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext.ADAPTER.encodeWithTag(protoWriter, 1, linkBankAccountPlaidThenRedirectFlowParameters.bitcoin_buy_client_route_context);
        protoWriter.writeBytes(linkBankAccountPlaidThenRedirectFlowParameters.unknownFields());
    }
}
