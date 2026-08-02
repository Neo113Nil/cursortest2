package com.squareup.cash.cashsubscriptions.api.v1_0.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cashsubscriptions.common.v1_0.Subscription;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetSubscriptionsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSubscriptionsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Subscription.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSubscriptionsResponse getSubscriptionsResponse = (GetSubscriptionsResponse) obj;
        reverseProtoWriter.getClass();
        getSubscriptionsResponse.getClass();
        reverseProtoWriter.writeBytes(getSubscriptionsResponse.unknownFields());
        Subscription.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getSubscriptionsResponse.subscriptions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSubscriptionsResponse getSubscriptionsResponse = (GetSubscriptionsResponse) obj;
        getSubscriptionsResponse.getClass();
        return Subscription.ADAPTER.asRepeated().encodedSizeWithTag(1, getSubscriptionsResponse.subscriptions) + getSubscriptionsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSubscriptionsResponse getSubscriptionsResponse = (GetSubscriptionsResponse) obj;
        getSubscriptionsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getSubscriptionsResponse.subscriptions, Subscription.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetSubscriptionsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSubscriptionsResponse getSubscriptionsResponse = (GetSubscriptionsResponse) obj;
        getSubscriptionsResponse.getClass();
        Subscription.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getSubscriptionsResponse.subscriptions);
        protoWriter.writeBytes(getSubscriptionsResponse.unknownFields());
    }
}
