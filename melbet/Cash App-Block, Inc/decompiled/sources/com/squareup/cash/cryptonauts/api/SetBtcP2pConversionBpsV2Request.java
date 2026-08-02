package com.squareup.cash.cryptonauts.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cats.Cats;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SetBtcP2pConversionBpsV2Request extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetBtcP2pConversionBpsV2Request> CREATOR;
    public final Long p2p_btc_conversion_bps;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetBtcP2pConversionBpsV2Request.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Request$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetBtcP2pConversionBpsV2Request((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.INT64.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetBtcP2pConversionBpsV2Request setBtcP2pConversionBpsV2Request = (SetBtcP2pConversionBpsV2Request) obj;
                reverseProtoWriter.getClass();
                setBtcP2pConversionBpsV2Request.getClass();
                reverseProtoWriter.writeBytes(setBtcP2pConversionBpsV2Request.unknownFields());
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, setBtcP2pConversionBpsV2Request.p2p_btc_conversion_bps);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetBtcP2pConversionBpsV2Request setBtcP2pConversionBpsV2Request = (SetBtcP2pConversionBpsV2Request) obj;
                setBtcP2pConversionBpsV2Request.getClass();
                return ProtoAdapter.INT64.encodedSizeWithTag(1, setBtcP2pConversionBpsV2Request.p2p_btc_conversion_bps) + setBtcP2pConversionBpsV2Request.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetBtcP2pConversionBpsV2Request setBtcP2pConversionBpsV2Request = (SetBtcP2pConversionBpsV2Request) obj;
                setBtcP2pConversionBpsV2Request.getClass();
                ByteString byteString = ByteString.EMPTY;
                Long l = setBtcP2pConversionBpsV2Request.p2p_btc_conversion_bps;
                byteString.getClass();
                return new SetBtcP2pConversionBpsV2Request(l, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetBtcP2pConversionBpsV2Request setBtcP2pConversionBpsV2Request = (SetBtcP2pConversionBpsV2Request) obj;
                setBtcP2pConversionBpsV2Request.getClass();
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, setBtcP2pConversionBpsV2Request.p2p_btc_conversion_bps);
                protoWriter.writeBytes(setBtcP2pConversionBpsV2Request.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetBtcP2pConversionBpsV2Request(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.p2p_btc_conversion_bps = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetBtcP2pConversionBpsV2Request)) {
            return false;
        }
        SetBtcP2pConversionBpsV2Request setBtcP2pConversionBpsV2Request = (SetBtcP2pConversionBpsV2Request) obj;
        return Intrinsics.areEqual(unknownFields(), setBtcP2pConversionBpsV2Request.unknownFields()) && Intrinsics.areEqual(this.p2p_btc_conversion_bps, setBtcP2pConversionBpsV2Request.p2p_btc_conversion_bps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.p2p_btc_conversion_bps;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(1);
        builder.cat_count = this.p2p_btc_conversion_bps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.p2p_btc_conversion_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("p2p_btc_conversion_bps=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetBtcP2pConversionBpsV2Request{", "}", 0, null, null, 56);
    }
}
