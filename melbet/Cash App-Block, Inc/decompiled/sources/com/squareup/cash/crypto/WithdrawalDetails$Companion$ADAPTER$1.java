package com.squareup.cash.crypto;

import androidx.room.TransactorKt;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class WithdrawalDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        BackPressHandlerKt backPressHandlerKt = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WithdrawalDetails(backPressHandlerKt, (CryptoAmount) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                backPressHandlerKt = new WithdrawalDetails$WithdrawalType$WithdrawalDestination((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 2) {
                backPressHandlerKt = new WithdrawalDetails$WithdrawalType$DisplayId((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(CryptoAmount.ADAPTER, protoReader, obj);
            } else if (nextTag == 4) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                backPressHandlerKt = new WithdrawalDetails$WithdrawalType$SendBitcoinToken((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WithdrawalDetails withdrawalDetails = (WithdrawalDetails) obj;
        reverseProtoWriter.getClass();
        withdrawalDetails.getClass();
        reverseProtoWriter.writeBytes(withdrawalDetails.unknownFields());
        BackPressHandlerKt backPressHandlerKt = withdrawalDetails.withdrawalType;
        if (backPressHandlerKt instanceof WithdrawalDetails$WithdrawalType$WithdrawalDestination) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, ((WithdrawalDetails$WithdrawalType$WithdrawalDestination) backPressHandlerKt).value);
        } else if (backPressHandlerKt instanceof WithdrawalDetails$WithdrawalType$DisplayId) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((WithdrawalDetails$WithdrawalType$DisplayId) backPressHandlerKt).value);
        } else if (backPressHandlerKt instanceof WithdrawalDetails$WithdrawalType$SendBitcoinToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, ((WithdrawalDetails$WithdrawalType$SendBitcoinToken) backPressHandlerKt).value);
        } else if (backPressHandlerKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, withdrawalDetails.customer_token);
        CryptoAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 3, withdrawalDetails.customer_supplied_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        WithdrawalDetails withdrawalDetails = (WithdrawalDetails) obj;
        withdrawalDetails.getClass();
        int size$okio = withdrawalDetails.unknownFields().getSize$okio();
        BackPressHandlerKt backPressHandlerKt = withdrawalDetails.withdrawalType;
        if (backPressHandlerKt instanceof WithdrawalDetails$WithdrawalType$WithdrawalDestination) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, ((WithdrawalDetails$WithdrawalType$WithdrawalDestination) backPressHandlerKt).value);
        } else if (backPressHandlerKt instanceof WithdrawalDetails$WithdrawalType$DisplayId) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, ((WithdrawalDetails$WithdrawalType$DisplayId) backPressHandlerKt).value);
        } else {
            if (!(backPressHandlerKt instanceof WithdrawalDetails$WithdrawalType$SendBitcoinToken)) {
                if (backPressHandlerKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(4, withdrawalDetails.customer_token) + CryptoAmount.ADAPTER.encodedSizeWithTag(3, withdrawalDetails.customer_supplied_amount) + size$okio;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(5, ((WithdrawalDetails$WithdrawalType$SendBitcoinToken) backPressHandlerKt).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, withdrawalDetails.customer_token) + CryptoAmount.ADAPTER.encodedSizeWithTag(3, withdrawalDetails.customer_supplied_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WithdrawalDetails withdrawalDetails = (WithdrawalDetails) obj;
        withdrawalDetails.getClass();
        CryptoAmount cryptoAmount = withdrawalDetails.customer_supplied_amount;
        CryptoAmount cryptoAmount2 = cryptoAmount != null ? (CryptoAmount) CryptoAmount.ADAPTER.redact(cryptoAmount) : null;
        ByteString byteString = ByteString.EMPTY;
        BackPressHandlerKt backPressHandlerKt = withdrawalDetails.withdrawalType;
        String str = withdrawalDetails.customer_token;
        byteString.getClass();
        return new WithdrawalDetails(backPressHandlerKt, cryptoAmount2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WithdrawalDetails withdrawalDetails = (WithdrawalDetails) obj;
        withdrawalDetails.getClass();
        CryptoAmount.ADAPTER.encodeWithTag(protoWriter, 3, withdrawalDetails.customer_supplied_amount);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, withdrawalDetails.customer_token);
        BackPressHandlerKt backPressHandlerKt = withdrawalDetails.withdrawalType;
        if (backPressHandlerKt instanceof WithdrawalDetails$WithdrawalType$WithdrawalDestination) {
            protoAdapter.encodeWithTag(protoWriter, 1, ((WithdrawalDetails$WithdrawalType$WithdrawalDestination) backPressHandlerKt).value);
        } else if (backPressHandlerKt instanceof WithdrawalDetails$WithdrawalType$DisplayId) {
            protoAdapter.encodeWithTag(protoWriter, 2, ((WithdrawalDetails$WithdrawalType$DisplayId) backPressHandlerKt).value);
        } else if (backPressHandlerKt instanceof WithdrawalDetails$WithdrawalType$SendBitcoinToken) {
            protoAdapter.encodeWithTag(protoWriter, 5, ((WithdrawalDetails$WithdrawalType$SendBitcoinToken) backPressHandlerKt).value);
        } else if (backPressHandlerKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(withdrawalDetails.unknownFields());
    }
}
