package com.squareup.cash.cashcommercebrowser.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class UpdateCustomerPreferencesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateCustomerPreferencesRequest> CREATOR;
    public final CommerceBrowserAutofillPreferences autofill_preferences;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateCustomerPreferencesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cashcommercebrowser.api.v1.UpdateCustomerPreferencesRequest$Companion$ADAPTER$1
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
                        return new UpdateCustomerPreferencesRequest((CommerceBrowserAutofillPreferences) obj, (RequestContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(CommerceBrowserAutofillPreferences.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateCustomerPreferencesRequest updateCustomerPreferencesRequest = (UpdateCustomerPreferencesRequest) obj;
                reverseProtoWriter.getClass();
                updateCustomerPreferencesRequest.getClass();
                reverseProtoWriter.writeBytes(updateCustomerPreferencesRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateCustomerPreferencesRequest.request_context);
                CommerceBrowserAutofillPreferences.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateCustomerPreferencesRequest.autofill_preferences);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateCustomerPreferencesRequest updateCustomerPreferencesRequest = (UpdateCustomerPreferencesRequest) obj;
                updateCustomerPreferencesRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, updateCustomerPreferencesRequest.request_context) + CommerceBrowserAutofillPreferences.ADAPTER.encodedSizeWithTag(1, updateCustomerPreferencesRequest.autofill_preferences) + updateCustomerPreferencesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateCustomerPreferencesRequest updateCustomerPreferencesRequest = (UpdateCustomerPreferencesRequest) obj;
                updateCustomerPreferencesRequest.getClass();
                CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences = updateCustomerPreferencesRequest.autofill_preferences;
                CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences2 = commerceBrowserAutofillPreferences != null ? (CommerceBrowserAutofillPreferences) CommerceBrowserAutofillPreferences.ADAPTER.redact(commerceBrowserAutofillPreferences) : null;
                RequestContext requestContext = updateCustomerPreferencesRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new UpdateCustomerPreferencesRequest(commerceBrowserAutofillPreferences2, requestContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateCustomerPreferencesRequest updateCustomerPreferencesRequest = (UpdateCustomerPreferencesRequest) obj;
                updateCustomerPreferencesRequest.getClass();
                CommerceBrowserAutofillPreferences.ADAPTER.encodeWithTag(protoWriter, 1, updateCustomerPreferencesRequest.autofill_preferences);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, updateCustomerPreferencesRequest.request_context);
                protoWriter.writeBytes(updateCustomerPreferencesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCustomerPreferencesRequest(CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.autofill_preferences = commerceBrowserAutofillPreferences;
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateCustomerPreferencesRequest)) {
            return false;
        }
        UpdateCustomerPreferencesRequest updateCustomerPreferencesRequest = (UpdateCustomerPreferencesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateCustomerPreferencesRequest.unknownFields()) && Intrinsics.areEqual(this.autofill_preferences, updateCustomerPreferencesRequest.autofill_preferences) && Intrinsics.areEqual(this.request_context, updateCustomerPreferencesRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences = this.autofill_preferences;
        int hashCode2 = (hashCode + (commerceBrowserAutofillPreferences != null ? commerceBrowserAutofillPreferences.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(7);
        builder.customer_token = this.autofill_preferences;
        builder.sponsorship_tier = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences = this.autofill_preferences;
        if (commerceBrowserAutofillPreferences != null) {
            arrayList.add("autofill_preferences=" + commerceBrowserAutofillPreferences);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateCustomerPreferencesRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ UpdateCustomerPreferencesRequest(CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences) {
        this(commerceBrowserAutofillPreferences, null, ByteString.EMPTY);
    }
}
