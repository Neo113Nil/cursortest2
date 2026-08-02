package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class SearchMusicResourcesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchMusicResourcesRequest> CREATOR;
    public final String cursor;
    public final String search_query;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SearchMusicResourcesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.mosaic.resources.api.v2.SearchMusicResourcesRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SearchMusicResourcesRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SearchMusicResourcesRequest searchMusicResourcesRequest = (SearchMusicResourcesRequest) obj;
                reverseProtoWriter.getClass();
                searchMusicResourcesRequest.getClass();
                reverseProtoWriter.writeBytes(searchMusicResourcesRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, searchMusicResourcesRequest.cursor);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, searchMusicResourcesRequest.search_query);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SearchMusicResourcesRequest searchMusicResourcesRequest = (SearchMusicResourcesRequest) obj;
                searchMusicResourcesRequest.getClass();
                int size$okio = searchMusicResourcesRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(2, searchMusicResourcesRequest.cursor) + protoAdapter2.encodedSizeWithTag(1, searchMusicResourcesRequest.search_query) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SearchMusicResourcesRequest searchMusicResourcesRequest = (SearchMusicResourcesRequest) obj;
                searchMusicResourcesRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = searchMusicResourcesRequest.search_query;
                String str2 = searchMusicResourcesRequest.cursor;
                byteString.getClass();
                return new SearchMusicResourcesRequest(str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SearchMusicResourcesRequest searchMusicResourcesRequest = (SearchMusicResourcesRequest) obj;
                searchMusicResourcesRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, searchMusicResourcesRequest.search_query);
                protoAdapter2.encodeWithTag(protoWriter, 2, searchMusicResourcesRequest.cursor);
                protoWriter.writeBytes(searchMusicResourcesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMusicResourcesRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.search_query = str;
        this.cursor = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchMusicResourcesRequest)) {
            return false;
        }
        SearchMusicResourcesRequest searchMusicResourcesRequest = (SearchMusicResourcesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), searchMusicResourcesRequest.unknownFields()) && Intrinsics.areEqual(this.search_query, searchMusicResourcesRequest.search_query) && Intrinsics.areEqual(this.cursor, searchMusicResourcesRequest.cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.search_query;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cursor;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(3);
        builder.prefix = this.search_query;
        builder.name = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.search_query;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "search_query=", arrayList);
        }
        String str2 = this.cursor;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cursor=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchMusicResourcesRequest{", "}", 0, null, null, 56);
    }
}
