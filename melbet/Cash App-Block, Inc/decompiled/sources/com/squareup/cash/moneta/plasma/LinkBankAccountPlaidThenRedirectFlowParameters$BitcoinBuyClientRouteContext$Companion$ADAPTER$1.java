package com.squareup.cash.moneta.plasma;

import androidx.room.TransactorKt;
import com.squareup.cash.moneta.plasma.LinkBankAccountPlaidThenRedirectFlowParameters;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class LinkBankAccountPlaidThenRedirectFlowParameters$BitcoinBuyClientRouteContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext((Money) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext = (LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext) obj;
        reverseProtoWriter.getClass();
        bitcoinBuyClientRouteContext.getClass();
        reverseProtoWriter.writeBytes(bitcoinBuyClientRouteContext.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, bitcoinBuyClientRouteContext.previous_instrument_token);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bitcoinBuyClientRouteContext.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext = (LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext) obj;
        bitcoinBuyClientRouteContext.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, bitcoinBuyClientRouteContext.previous_instrument_token) + Money.ADAPTER.encodedSizeWithTag(1, bitcoinBuyClientRouteContext.amount) + bitcoinBuyClientRouteContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext = (LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext) obj;
        bitcoinBuyClientRouteContext.getClass();
        Money money = bitcoinBuyClientRouteContext.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = bitcoinBuyClientRouteContext.previous_instrument_token;
        byteString.getClass();
        return new LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext bitcoinBuyClientRouteContext = (LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext) obj;
        bitcoinBuyClientRouteContext.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, bitcoinBuyClientRouteContext.amount);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bitcoinBuyClientRouteContext.previous_instrument_token);
        protoWriter.writeBytes(bitcoinBuyClientRouteContext.unknownFields());
    }
}
