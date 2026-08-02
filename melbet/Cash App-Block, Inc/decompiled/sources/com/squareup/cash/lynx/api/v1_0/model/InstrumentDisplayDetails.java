package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails$Builder;", "", "standard_display_name", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localizable_standard_display_name", "Lcom/squareup/protos/cash/localization/LocalizableString;", "enriched_compact_display_name", "localizable_enriched_compact_display_name", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InstrumentDisplayDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentDisplayDetails> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 2)
    public final String enriched_compact_display_name;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 3, tag = 4)
    public final LocalizableString localizable_enriched_compact_display_name;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 3)
    public final LocalizableString localizable_standard_display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String standard_display_name;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails;", "<init>", "()V", "standard_display_name", "", "localizable_standard_display_name", "Lcom/squareup/protos/cash/localization/LocalizableString;", "enriched_compact_display_name", "localizable_enriched_compact_display_name", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String enriched_compact_display_name;
        public LocalizableString localizable_enriched_compact_display_name;
        public LocalizableString localizable_standard_display_name;
        public String standard_display_name;

        @Override // com.squareup.wire.Message.Builder
        public InstrumentDisplayDetails build() {
            return new InstrumentDisplayDetails(this.standard_display_name, this.localizable_standard_display_name, this.enriched_compact_display_name, this.localizable_enriched_compact_display_name, buildUnknownFields());
        }

        public final Builder enriched_compact_display_name(String enriched_compact_display_name) {
            this.enriched_compact_display_name = enriched_compact_display_name;
            return this;
        }

        public final Builder localizable_enriched_compact_display_name(LocalizableString localizable_enriched_compact_display_name) {
            this.localizable_enriched_compact_display_name = localizable_enriched_compact_display_name;
            return this;
        }

        public final Builder localizable_standard_display_name(LocalizableString localizable_standard_display_name) {
            this.localizable_standard_display_name = localizable_standard_display_name;
            return this;
        }

        public final Builder standard_display_name(String standard_display_name) {
            this.standard_display_name = standard_display_name;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentDisplayDetails.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.lynx.api.v1_0.model.InstrumentDisplayDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentDisplayDetails decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InstrumentDisplayDetails((String) obj, (LocalizableString) obj2, (String) obj3, (LocalizableString) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentDisplayDetails value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.standard_display_name);
                ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 3, value.localizable_standard_display_name);
                protoAdapter2.encodeWithTag(writer, 2, value.enriched_compact_display_name);
                protoAdapter3.encodeWithTag(writer, 4, value.localizable_enriched_compact_display_name);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentDisplayDetails value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.standard_display_name) + size$okio;
                ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                return protoAdapter3.encodedSizeWithTag(4, value.localizable_enriched_compact_display_name) + protoAdapter2.encodedSizeWithTag(2, value.enriched_compact_display_name) + protoAdapter3.encodedSizeWithTag(3, value.localizable_standard_display_name) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentDisplayDetails redact(InstrumentDisplayDetails value) {
                value.getClass();
                LocalizableString localizableString = value.localizable_standard_display_name;
                LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                LocalizableString localizableString3 = value.localizable_enriched_compact_display_name;
                LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.standard_display_name;
                String str2 = value.enriched_compact_display_name;
                byteString.getClass();
                return new InstrumentDisplayDetails(str, localizableString2, str2, localizableString4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentDisplayDetails value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, value.localizable_enriched_compact_display_name);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 2, value.enriched_compact_display_name);
                protoAdapter2.encodeWithTag(writer, 3, value.localizable_standard_display_name);
                protoAdapter3.encodeWithTag(writer, 1, value.standard_display_name);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDisplayDetails(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.standard_display_name = str;
        this.localizable_standard_display_name = localizableString;
        this.enriched_compact_display_name = str2;
        this.localizable_enriched_compact_display_name = localizableString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentDisplayDetails)) {
            return false;
        }
        InstrumentDisplayDetails instrumentDisplayDetails = (InstrumentDisplayDetails) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentDisplayDetails.unknownFields()) && Intrinsics.areEqual(this.standard_display_name, instrumentDisplayDetails.standard_display_name) && Intrinsics.areEqual(this.localizable_standard_display_name, instrumentDisplayDetails.localizable_standard_display_name) && Intrinsics.areEqual(this.enriched_compact_display_name, instrumentDisplayDetails.enriched_compact_display_name) && Intrinsics.areEqual(this.localizable_enriched_compact_display_name, instrumentDisplayDetails.localizable_enriched_compact_display_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.standard_display_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_standard_display_name;
        int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str2 = this.enriched_compact_display_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_enriched_compact_display_name;
        int hashCode5 = hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.standard_display_name = this.standard_display_name;
        builder.localizable_standard_display_name = this.localizable_standard_display_name;
        builder.enriched_compact_display_name = this.enriched_compact_display_name;
        builder.localizable_enriched_compact_display_name = this.localizable_enriched_compact_display_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.standard_display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "standard_display_name=", arrayList);
        }
        LocalizableString localizableString = this.localizable_standard_display_name;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_standard_display_name=", localizableString, arrayList);
        }
        String str2 = this.enriched_compact_display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "enriched_compact_display_name=", arrayList);
        }
        LocalizableString localizableString2 = this.localizable_enriched_compact_display_name;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_enriched_compact_display_name=", localizableString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentDisplayDetails{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails$Builder;", "", "body", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentDisplayDetails;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InstrumentDisplayDetails build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
