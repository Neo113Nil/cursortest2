package ru.yandex.alice.protos.api.request_parts.platform.utils;

import NYT.platform.utils.ColumnNameOption;
import NYT.platform.utils.DefaultFieldFlagsOption;
import NYT.platform.utils.EWrapperFieldFlag;
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
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/api/request_parts/platform/utils/TOrigin;", "Lcom/squareup/wire/Message;", "", "DeviceId", "", "Uuid", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDeviceId$annotations", "()V", "getDeviceId", "()Ljava/lang/String;", "getUuid$annotations", "getUuid", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TOrigin extends Message {
    public static final ProtoAdapter<TOrigin> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MetaDataField.DEVICE_ID_FIELD, oneofName = "OptionalDeviceId", schemaIndex = 0, tag = 1)
    private final String DeviceId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uuid", oneofName = "OptionalUuid", schemaIndex = 1, tag = 2)
    private final String Uuid;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TOrigin.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TOrigin>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.request_parts.platform.utils.TOrigin$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TOrigin decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                String str = null;
                String str2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TOrigin(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        str2 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TOrigin value) {
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDeviceId());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getUuid());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TOrigin value) {
                int h = value.unknownFields().h();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return protoAdapter.encodedSizeWithTag(2, value.getUuid()) + protoAdapter.encodedSizeWithTag(1, value.getDeviceId()) + h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TOrigin redact(TOrigin value) {
                return TOrigin.copy$default(value, null, null, ByteString.c, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TOrigin value) {
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getUuid());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDeviceId());
            }
        };
    }

    public /* synthetic */ TOrigin(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TOrigin copy$default(TOrigin tOrigin, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tOrigin.DeviceId;
        }
        if ((i & 2) != 0) {
            str2 = tOrigin.Uuid;
        }
        if ((i & 4) != 0) {
            byteString = tOrigin.unknownFields();
        }
        return tOrigin.copy(str, str2, byteString);
    }

    @ColumnNameOption(MetaDataField.DEVICE_ID_FIELD)
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @ColumnNameOption("uuid")
    public static /* synthetic */ void getUuid$annotations() {
    }

    public final TOrigin copy(String DeviceId, String Uuid, ByteString unknownFields) {
        return new TOrigin(DeviceId, Uuid, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TOrigin)) {
            return false;
        }
        TOrigin tOrigin = (TOrigin) other;
        return jl40.l(unknownFields(), tOrigin.unknownFields()) && jl40.l(this.DeviceId, tOrigin.DeviceId) && jl40.l(this.Uuid, tOrigin.Uuid);
    }

    public final String getDeviceId() {
        return this.DeviceId;
    }

    public final String getUuid() {
        return this.Uuid;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.DeviceId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.Uuid;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m513newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.DeviceId;
        if (str != null) {
            unr0.B("DeviceId=", Internal.sanitize(str), arrayList);
        }
        String str2 = this.Uuid;
        if (str2 != null) {
            unr0.B("Uuid=", Internal.sanitize(str2), arrayList);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TOrigin{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m513newBuilder();
    }

    public TOrigin() {
        this(null, null, null, 7, null);
    }

    public TOrigin(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.DeviceId = str;
        this.Uuid = str2;
    }
}
