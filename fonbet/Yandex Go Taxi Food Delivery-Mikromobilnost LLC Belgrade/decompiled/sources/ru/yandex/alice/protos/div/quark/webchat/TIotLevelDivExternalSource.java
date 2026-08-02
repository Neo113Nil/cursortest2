package ru.yandex.alice.protos.div.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.qoi0;
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TIotLevelDivExternalSource;", "Lcom/squareup/wire/Message;", "", "endpointId", "", "instance", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;Lokio/ByteString;)V", "getEndpointId$annotations", "()V", "getEndpointId", "()Ljava/lang/String;", "getInstance$annotations", "getInstance", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TLevelCapability$EInstance;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TIotLevelDivExternalSource extends Message {
    public static final ProtoAdapter<TIotLevelDivExternalSource> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endpoint_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String endpointId;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TLevelCapability$EInstance#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TLevelCapability.EInstance instance;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TIotLevelDivExternalSource.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TIotLevelDivExternalSource>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.div.quark.webchat.TIotLevelDivExternalSource$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TIotLevelDivExternalSource decode(ProtoReader reader) {
                TLevelCapability.EInstance eInstance = TLevelCapability.EInstance.UnknownInstance;
                long beginMessage = reader.beginMessage();
                String str = "";
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TIotLevelDivExternalSource(str, eInstance, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            eInstance = TLevelCapability.EInstance.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TIotLevelDivExternalSource value) {
                if (!jl40.l(value.getEndpointId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEndpointId());
                }
                if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                    TLevelCapability.EInstance.ADAPTER.encodeWithTag(writer, 2, (int) value.getInstance());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TIotLevelDivExternalSource value) {
                int h = value.unknownFields().h();
                if (!jl40.l(value.getEndpointId(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEndpointId());
                }
                return value.getInstance() != TLevelCapability.EInstance.UnknownInstance ? TLevelCapability.EInstance.ADAPTER.encodedSizeWithTag(2, value.getInstance()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TIotLevelDivExternalSource redact(TIotLevelDivExternalSource value) {
                return TIotLevelDivExternalSource.copy$default(value, null, null, ByteString.c, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TIotLevelDivExternalSource value) {
                writer.writeBytes(value.unknownFields());
                if (value.getInstance() != TLevelCapability.EInstance.UnknownInstance) {
                    TLevelCapability.EInstance.ADAPTER.encodeWithTag(writer, 2, (int) value.getInstance());
                }
                if (jl40.l(value.getEndpointId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEndpointId());
            }
        };
    }

    public /* synthetic */ TIotLevelDivExternalSource(String str, TLevelCapability.EInstance eInstance, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TLevelCapability.EInstance.UnknownInstance : eInstance, (i & 4) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TIotLevelDivExternalSource copy$default(TIotLevelDivExternalSource tIotLevelDivExternalSource, String str, TLevelCapability.EInstance eInstance, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tIotLevelDivExternalSource.endpointId;
        }
        if ((i & 2) != 0) {
            eInstance = tIotLevelDivExternalSource.instance;
        }
        if ((i & 4) != 0) {
            byteString = tIotLevelDivExternalSource.unknownFields();
        }
        return tIotLevelDivExternalSource.copy(str, eInstance, byteString);
    }

    @ColumnNameOption("endpoint_id")
    public static /* synthetic */ void getEndpointId$annotations() {
    }

    @ColumnNameOption("instance")
    public static /* synthetic */ void getInstance$annotations() {
    }

    public final TIotLevelDivExternalSource copy(String endpointId, TLevelCapability.EInstance instance, ByteString unknownFields) {
        return new TIotLevelDivExternalSource(endpointId, instance, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TIotLevelDivExternalSource)) {
            return false;
        }
        TIotLevelDivExternalSource tIotLevelDivExternalSource = (TIotLevelDivExternalSource) other;
        return jl40.l(unknownFields(), tIotLevelDivExternalSource.unknownFields()) && jl40.l(this.endpointId, tIotLevelDivExternalSource.endpointId) && this.instance == tIotLevelDivExternalSource.instance;
    }

    public final String getEndpointId() {
        return this.endpointId;
    }

    public final TLevelCapability.EInstance getInstance() {
        return this.instance;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.instance.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.endpointId);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m531newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("endpointId=", Internal.sanitize(this.endpointId), arrayList);
        arrayList.add("instance=" + this.instance);
        return a.X(arrayList, Extension.FIX_SPACE, "TIotLevelDivExternalSource{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m531newBuilder();
    }

    public TIotLevelDivExternalSource() {
        this(null, null, null, 7, null);
    }

    public TIotLevelDivExternalSource(String str, TLevelCapability.EInstance eInstance, ByteString byteString) {
        super(ADAPTER, byteString);
        this.endpointId = str;
        this.instance = eInstance;
    }
}
