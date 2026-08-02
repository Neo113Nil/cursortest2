package ru.yandex.alice.protos.api.alicekit.directives.platform.utils;

import NAlice.NAliceApi.platform.utils.TSourceInfo;
import NYT.platform.utils.ColumnNameOption;
import NYT.platform.utils.DefaultFieldFlagsOption;
import NYT.platform.utils.EWrapperFieldFlag;
import NYT.platform.utils.FlagsOption;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.smw0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 V2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002VWBå\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\b\u0010O\u001a\u00020\u0002H\u0017J\u0013\u0010P\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0096\u0002J\b\u0010S\u001a\u00020\u0014H\u0016J\b\u0010T\u001a\u00020\u0004H\u0016Jä\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\fR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\"\u001a\u0004\b*\u0010+R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u001c\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\"\u001a\u0004\b2\u0010+R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u001c\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\"\u001a\u0004\b6\u0010+R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\"\u001a\u0004\b8\u00109R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\"\u001a\u0004\b;\u0010$R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\"\u001a\u0004\b=\u0010>R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010\"\u001a\u0004\b@\u0010$R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010\"\u001a\u0004\bB\u0010CR\u001c\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010\"\u001a\u0004\bE\u0010+R\u001c\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010\"\u001a\u0004\bG\u0010HR(\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010\"\u001a\u0004\bJ\u0010KR\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010\"\u001a\u0004\bM\u0010N¨\u0006X"}, d2 = {"Lru/yandex/alice/protos/api/alicekit/directives/platform/utils/TDirective;", "Lcom/squareup/wire/Message;", "", "Type", "", PlusAcquisitionSmartOffer.Texts.NAME, "AnalyticsType", "IgnoreAnswer", "", "Payload", "", "PayloadRaw", "Lokio/ByteString;", "MultiroomSessionId", "RoomDeviceIds", "", "IsLedSilent", "EndpointId", "IsParallel", "TimeBeforeDropMs", "", "PersId", "OnFinish", "Lru/yandex/alice/protos/api/alicekit/directives/platform/utils/TDirective$TOnFinishEvent;", "Id", "SourceInfo", "LNAlice/NAliceApi/platform/utils/TSourceInfo;", "AttachToMultiroom", "DirectiveType", "Lru/yandex/alice/protos/endpoint/platform/utils/TCapability$EDirectiveType;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Lokio/ByteString;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;ZILjava/lang/String;Lru/yandex/alice/protos/api/alicekit/directives/platform/utils/TDirective$TOnFinishEvent;Ljava/lang/String;LNAlice/NAliceApi/platform/utils/TSourceInfo;ZLru/yandex/alice/protos/endpoint/platform/utils/TCapability$EDirectiveType;Lokio/ByteString;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getName$annotations", "getName", "getAnalyticsType$annotations", "getAnalyticsType", "getIgnoreAnswer$annotations", "getIgnoreAnswer", "()Z", "getPayloadRaw$annotations", "getPayloadRaw", "()Lokio/ByteString;", "getMultiroomSessionId$annotations", "getMultiroomSessionId", "getIsLedSilent$annotations", "getIsLedSilent", "getEndpointId$annotations", "getEndpointId", "getIsParallel$annotations", "getIsParallel", "getTimeBeforeDropMs$annotations", "getTimeBeforeDropMs", "()I", "getPersId$annotations", "getPersId", "getOnFinish$annotations", "getOnFinish", "()Lru/yandex/alice/protos/api/alicekit/directives/platform/utils/TDirective$TOnFinishEvent;", "getId$annotations", "getId", "getSourceInfo$annotations", "getSourceInfo", "()LNAlice/NAliceApi/platform/utils/TSourceInfo;", "getAttachToMultiroom$annotations", "getAttachToMultiroom", "getDirectiveType$annotations", "getDirectiveType", "()Lru/yandex/alice/protos/endpoint/platform/utils/TCapability$EDirectiveType;", "getPayload$annotations", "getPayload", "()Ljava/util/Map;", "getRoomDeviceIds$annotations", "getRoomDeviceIds", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "TOnFinishEvent", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TDirective extends Message {
    public static final ProtoAdapter<TDirective> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sub_name", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String AnalyticsType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "attach_to_multiroom", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 18)
    private final boolean AttachToMultiroom;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.platform.utils.TCapability$EDirectiveType#ADAPTER", jsonName = "directive_type", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 20)
    private final TCapability.EDirectiveType DirectiveType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING_VALUE", jsonName = "endpoint_id", schemaIndex = 9, tag = 9)
    private final String EndpointId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "id", schemaIndex = 14, tag = 16)
    private final String Id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "ignore_answer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean IgnoreAnswer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is_led_silent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 8)
    private final boolean IsLedSilent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is_parallel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final boolean IsParallel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "multiroom_session_id", oneofName = "OptionalMultiroomSessionId", schemaIndex = 6, tag = 6)
    private final String MultiroomSessionId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "name", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String Name;

    @WireField(adapter = "ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective$TOnFinishEvent#ADAPTER", jsonName = "on_finish_event", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final TOnFinishEvent OnFinish;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", jsonName = "payload", oneofName = "PayloadType", schemaIndex = 4, tag = 5)
    private final Map<String, ?> Payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "payload_raw", oneofName = "PayloadType", schemaIndex = 5, tag = 15)
    private final ByteString PayloadRaw;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pers_id", oneofName = "OptionalPersId", schemaIndex = 12, tag = 13)
    private final String PersId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "room_device_ids", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 7)
    private final List<String> RoomDeviceIds;

    @WireField(adapter = "NAlice.NAliceApi.platform.utils.TSourceInfo#ADAPTER", jsonName = "source_info", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final TSourceInfo SourceInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "time_before_drop_ms", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final int TimeBeforeDropMs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "type", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String Type;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TDirective.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TDirective decode(ProtoReader reader) {
                String str;
                String str2;
                String str3;
                ArrayList arrayList = new ArrayList();
                TCapability.EDirectiveType eDirectiveType = TCapability.EDirectiveType.UnknownDirectiveType;
                long beginMessage = reader.beginMessage();
                String str4 = "";
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                int i = 0;
                boolean z4 = false;
                Map<String, ?> map = null;
                ByteString byteString = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                TDirective.TOnFinishEvent tOnFinishEvent = null;
                String str8 = null;
                TSourceInfo tSourceInfo = null;
                String str9 = str4;
                String str10 = str9;
                while (true) {
                    TCapability.EDirectiveType eDirectiveType2 = eDirectiveType;
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TDirective(str9, str10, str4, z, map, byteString, str5, arrayList, z2, str6, z3, i, str7, tOnFinishEvent, str8, tSourceInfo, z4, eDirectiveType2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 2:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 3:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 4:
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 5:
                            map = ProtoAdapter.STRUCT_MAP.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 6:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 7:
                            str = str9;
                            str2 = str10;
                            str3 = str4;
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                            eDirectiveType = eDirectiveType2;
                            str9 = str;
                            str10 = str2;
                            str4 = str3;
                            break;
                        case 8:
                            z2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 9:
                            str6 = ProtoAdapter.STRING_VALUE.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 10:
                        case 19:
                        default:
                            reader.readUnknownField(nextTag);
                            str = str9;
                            str2 = str10;
                            str3 = str4;
                            eDirectiveType = eDirectiveType2;
                            str9 = str;
                            str10 = str2;
                            str4 = str3;
                            break;
                        case 11:
                            z3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 12:
                            i = ProtoAdapter.UINT32.decode(reader).intValue();
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 13:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 14:
                            tOnFinishEvent = TDirective.TOnFinishEvent.ADAPTER.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 15:
                            byteString = ProtoAdapter.BYTES.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 16:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 17:
                            tSourceInfo = TSourceInfo.ADAPTER.decode(reader);
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 18:
                            z4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            eDirectiveType = eDirectiveType2;
                            break;
                        case 20:
                            try {
                                eDirectiveType = TCapability.EDirectiveType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                str = str9;
                                str2 = str10;
                                str3 = str4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TDirective value) {
                if (!jl40.l(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (!jl40.l(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (!jl40.l(value.getAnalyticsType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAnalyticsType());
                }
                if (value.getIgnoreAnswer()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIgnoreAnswer()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getRoomDeviceIds());
                if (value.getIsLedSilent()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIsLedSilent()));
                }
                if (value.getEndpointId() != null) {
                    ProtoAdapter.STRING_VALUE.encodeWithTag(writer, 9, (int) value.getEndpointId());
                }
                if (value.getIsParallel()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getIsParallel()));
                }
                if (value.getTimeBeforeDropMs() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 12, (int) Integer.valueOf(value.getTimeBeforeDropMs()));
                }
                if (value.getOnFinish() != null) {
                    TDirective.TOnFinishEvent.ADAPTER.encodeWithTag(writer, 14, (int) value.getOnFinish());
                }
                protoAdapter.encodeWithTag(writer, 16, (int) value.getId());
                if (value.getSourceInfo() != null) {
                    TSourceInfo.ADAPTER.encodeWithTag(writer, 17, (int) value.getSourceInfo());
                }
                if (value.getAttachToMultiroom()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getAttachToMultiroom()));
                }
                if (value.getDirectiveType() != TCapability.EDirectiveType.UnknownDirectiveType) {
                    TCapability.EDirectiveType.ADAPTER.encodeWithTag(writer, 20, (int) value.getDirectiveType());
                }
                ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value.getPayload());
                ProtoAdapter.BYTES.encodeWithTag(writer, 15, (int) value.getPayloadRaw());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getMultiroomSessionId());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getPersId());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TDirective value) {
                int h = value.unknownFields().h();
                if (!jl40.l(value.getType(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getType());
                }
                if (!jl40.l(value.getName(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (!jl40.l(value.getAnalyticsType(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAnalyticsType());
                }
                if (value.getIgnoreAnswer()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIgnoreAnswer()));
                }
                int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(15, value.getPayloadRaw()) + ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, value.getPayload()) + h;
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter.asRepeated().encodedSizeWithTag(7, value.getRoomDeviceIds()) + protoAdapter.encodedSizeWithTag(6, value.getMultiroomSessionId()) + encodedSizeWithTag;
                if (value.getIsLedSilent()) {
                    encodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIsLedSilent()));
                }
                if (value.getEndpointId() != null) {
                    encodedSizeWithTag2 += ProtoAdapter.STRING_VALUE.encodedSizeWithTag(9, value.getEndpointId());
                }
                if (value.getIsParallel()) {
                    encodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(11, Boolean.valueOf(value.getIsParallel()));
                }
                if (value.getTimeBeforeDropMs() != 0) {
                    encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(12, Integer.valueOf(value.getTimeBeforeDropMs()));
                }
                int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(13, value.getPersId()) + encodedSizeWithTag2;
                if (value.getOnFinish() != null) {
                    encodedSizeWithTag3 += TDirective.TOnFinishEvent.ADAPTER.encodedSizeWithTag(14, value.getOnFinish());
                }
                int encodedSizeWithTag4 = protoAdapter.encodedSizeWithTag(16, value.getId()) + encodedSizeWithTag3;
                if (value.getSourceInfo() != null) {
                    encodedSizeWithTag4 += TSourceInfo.ADAPTER.encodedSizeWithTag(17, value.getSourceInfo());
                }
                if (value.getAttachToMultiroom()) {
                    encodedSizeWithTag4 += ProtoAdapter.BOOL.encodedSizeWithTag(18, Boolean.valueOf(value.getAttachToMultiroom()));
                }
                return value.getDirectiveType() != TCapability.EDirectiveType.UnknownDirectiveType ? TCapability.EDirectiveType.ADAPTER.encodedSizeWithTag(20, value.getDirectiveType()) + encodedSizeWithTag4 : encodedSizeWithTag4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TDirective redact(TDirective value) {
                TDirective copy;
                Map<String, ?> payload = value.getPayload();
                Map<String, ?> redact = payload != null ? ProtoAdapter.STRUCT_MAP.redact(payload) : null;
                String endpointId = value.getEndpointId();
                String redact2 = endpointId != null ? ProtoAdapter.STRING_VALUE.redact(endpointId) : null;
                TDirective.TOnFinishEvent onFinish = value.getOnFinish();
                TDirective.TOnFinishEvent redact3 = onFinish != null ? TDirective.TOnFinishEvent.ADAPTER.redact(onFinish) : null;
                TSourceInfo sourceInfo = value.getSourceInfo();
                copy = value.copy((r37 & 1) != 0 ? value.Type : null, (r37 & 2) != 0 ? value.Name : null, (r37 & 4) != 0 ? value.AnalyticsType : null, (r37 & 8) != 0 ? value.IgnoreAnswer : false, (r37 & 16) != 0 ? value.Payload : redact, (r37 & 32) != 0 ? value.PayloadRaw : null, (r37 & 64) != 0 ? value.MultiroomSessionId : null, (r37 & 128) != 0 ? value.RoomDeviceIds : null, (r37 & 256) != 0 ? value.IsLedSilent : false, (r37 & 512) != 0 ? value.EndpointId : redact2, (r37 & 1024) != 0 ? value.IsParallel : false, (r37 & 2048) != 0 ? value.TimeBeforeDropMs : 0, (r37 & 4096) != 0 ? value.PersId : null, (r37 & 8192) != 0 ? value.OnFinish : redact3, (r37 & 16384) != 0 ? value.Id : null, (r37 & 32768) != 0 ? value.SourceInfo : sourceInfo != null ? TSourceInfo.ADAPTER.redact(sourceInfo) : null, (r37 & 65536) != 0 ? value.AttachToMultiroom : false, (r37 & 131072) != 0 ? value.DirectiveType : null, (r37 & 262144) != 0 ? value.unknownFields() : ByteString.c);
                return copy;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TDirective value) {
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 13, (int) value.getPersId());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getMultiroomSessionId());
                ProtoAdapter.BYTES.encodeWithTag(writer, 15, (int) value.getPayloadRaw());
                ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value.getPayload());
                if (value.getDirectiveType() != TCapability.EDirectiveType.UnknownDirectiveType) {
                    TCapability.EDirectiveType.ADAPTER.encodeWithTag(writer, 20, (int) value.getDirectiveType());
                }
                if (value.getAttachToMultiroom()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getAttachToMultiroom()));
                }
                if (value.getSourceInfo() != null) {
                    TSourceInfo.ADAPTER.encodeWithTag(writer, 17, (int) value.getSourceInfo());
                }
                protoAdapter.encodeWithTag(writer, 16, (int) value.getId());
                if (value.getOnFinish() != null) {
                    TDirective.TOnFinishEvent.ADAPTER.encodeWithTag(writer, 14, (int) value.getOnFinish());
                }
                if (value.getTimeBeforeDropMs() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 12, (int) Integer.valueOf(value.getTimeBeforeDropMs()));
                }
                if (value.getIsParallel()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getIsParallel()));
                }
                if (value.getEndpointId() != null) {
                    ProtoAdapter.STRING_VALUE.encodeWithTag(writer, 9, (int) value.getEndpointId());
                }
                if (value.getIsLedSilent()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIsLedSilent()));
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getRoomDeviceIds());
                if (value.getIgnoreAnswer()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIgnoreAnswer()));
                }
                if (!jl40.l(value.getAnalyticsType(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAnalyticsType());
                }
                if (!jl40.l(value.getName(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (jl40.l(value.getType(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getType());
            }
        };
    }

    public /* synthetic */ TDirective(String str, String str2, String str3, boolean z, Map map, ByteString byteString, String str4, List list, boolean z2, String str5, boolean z3, int i, String str6, TOnFinishEvent tOnFinishEvent, String str7, TSourceInfo tSourceInfo, boolean z4, TCapability.EDirectiveType eDirectiveType, ByteString byteString2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : map, (i2 & 32) != 0 ? null : byteString, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? EmptyList.a : list, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? false : z3, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) != 0 ? null : str6, (i2 & 8192) != 0 ? null : tOnFinishEvent, (i2 & 16384) != 0 ? null : str7, (i2 & 32768) != 0 ? null : tSourceInfo, (i2 & 65536) != 0 ? false : z4, (i2 & 131072) != 0 ? TCapability.EDirectiveType.UnknownDirectiveType : eDirectiveType, (i2 & 262144) != 0 ? ByteString.c : byteString2);
    }

    @ColumnNameOption("sub_name")
    public static /* synthetic */ void getAnalyticsType$annotations() {
    }

    @ColumnNameOption("attach_to_multiroom")
    public static /* synthetic */ void getAttachToMultiroom$annotations() {
    }

    @ColumnNameOption("directive_type")
    public static /* synthetic */ void getDirectiveType$annotations() {
    }

    @ColumnNameOption("endpoint_id")
    public static /* synthetic */ void getEndpointId$annotations() {
    }

    @ColumnNameOption("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @ColumnNameOption("ignore_answer")
    public static /* synthetic */ void getIgnoreAnswer$annotations() {
    }

    @ColumnNameOption("is_led_silent")
    public static /* synthetic */ void getIsLedSilent$annotations() {
    }

    @ColumnNameOption("is_parallel")
    public static /* synthetic */ void getIsParallel$annotations() {
    }

    @ColumnNameOption("multiroom_session_id")
    public static /* synthetic */ void getMultiroomSessionId$annotations() {
    }

    @ColumnNameOption("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @ColumnNameOption("on_finish_event")
    public static /* synthetic */ void getOnFinish$annotations() {
    }

    @FlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_PROTOBUF})
    @ColumnNameOption("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @FlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_PROTOBUF})
    @ColumnNameOption("payload_raw")
    public static /* synthetic */ void getPayloadRaw$annotations() {
    }

    @ColumnNameOption("pers_id")
    public static /* synthetic */ void getPersId$annotations() {
    }

    @ColumnNameOption("room_device_ids")
    public static /* synthetic */ void getRoomDeviceIds$annotations() {
    }

    @ColumnNameOption("source_info")
    public static /* synthetic */ void getSourceInfo$annotations() {
    }

    @ColumnNameOption("time_before_drop_ms")
    public static /* synthetic */ void getTimeBeforeDropMs$annotations() {
    }

    @ColumnNameOption("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public final TDirective copy(String Type, String Name, String AnalyticsType, boolean IgnoreAnswer, Map<String, ?> Payload, ByteString PayloadRaw, String MultiroomSessionId, List<String> RoomDeviceIds, boolean IsLedSilent, String EndpointId, boolean IsParallel, int TimeBeforeDropMs, String PersId, TOnFinishEvent OnFinish, String Id, TSourceInfo SourceInfo, boolean AttachToMultiroom, TCapability.EDirectiveType DirectiveType, ByteString unknownFields) {
        return new TDirective(Type, Name, AnalyticsType, IgnoreAnswer, Payload, PayloadRaw, MultiroomSessionId, RoomDeviceIds, IsLedSilent, EndpointId, IsParallel, TimeBeforeDropMs, PersId, OnFinish, Id, SourceInfo, AttachToMultiroom, DirectiveType, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TDirective)) {
            return false;
        }
        TDirective tDirective = (TDirective) other;
        return jl40.l(unknownFields(), tDirective.unknownFields()) && jl40.l(this.Type, tDirective.Type) && jl40.l(this.Name, tDirective.Name) && jl40.l(this.AnalyticsType, tDirective.AnalyticsType) && this.IgnoreAnswer == tDirective.IgnoreAnswer && jl40.l(this.Payload, tDirective.Payload) && jl40.l(this.PayloadRaw, tDirective.PayloadRaw) && jl40.l(this.MultiroomSessionId, tDirective.MultiroomSessionId) && jl40.l(this.RoomDeviceIds, tDirective.RoomDeviceIds) && this.IsLedSilent == tDirective.IsLedSilent && jl40.l(this.EndpointId, tDirective.EndpointId) && this.IsParallel == tDirective.IsParallel && this.TimeBeforeDropMs == tDirective.TimeBeforeDropMs && jl40.l(this.PersId, tDirective.PersId) && jl40.l(this.OnFinish, tDirective.OnFinish) && jl40.l(this.Id, tDirective.Id) && jl40.l(this.SourceInfo, tDirective.SourceInfo) && this.AttachToMultiroom == tDirective.AttachToMultiroom && this.DirectiveType == tDirective.DirectiveType;
    }

    public final String getAnalyticsType() {
        return this.AnalyticsType;
    }

    public final boolean getAttachToMultiroom() {
        return this.AttachToMultiroom;
    }

    public final TCapability.EDirectiveType getDirectiveType() {
        return this.DirectiveType;
    }

    public final String getEndpointId() {
        return this.EndpointId;
    }

    public final String getId() {
        return this.Id;
    }

    public final boolean getIgnoreAnswer() {
        return this.IgnoreAnswer;
    }

    public final boolean getIsLedSilent() {
        return this.IsLedSilent;
    }

    public final boolean getIsParallel() {
        return this.IsParallel;
    }

    public final String getMultiroomSessionId() {
        return this.MultiroomSessionId;
    }

    public final String getName() {
        return this.Name;
    }

    public final TOnFinishEvent getOnFinish() {
        return this.OnFinish;
    }

    public final Map<String, ?> getPayload() {
        return this.Payload;
    }

    public final ByteString getPayloadRaw() {
        return this.PayloadRaw;
    }

    public final String getPersId() {
        return this.PersId;
    }

    public final List<String> getRoomDeviceIds() {
        return this.RoomDeviceIds;
    }

    public final TSourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    public final int getTimeBeforeDropMs() {
        return this.TimeBeforeDropMs;
    }

    public final String getType() {
        return this.Type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int e = unr0.e(unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.Type), 37, this.Name), 37, this.AnalyticsType), 37, this.IgnoreAnswer);
        Map<String, ?> map = this.Payload;
        int hashCode = (e + (map != null ? map.hashCode() : 0)) * 37;
        ByteString byteString = this.PayloadRaw;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.MultiroomSessionId;
        int e2 = unr0.e(unr0.c((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.RoomDeviceIds), 37, this.IsLedSilent);
        String str2 = this.EndpointId;
        int b = oyr.b(this.TimeBeforeDropMs, unr0.e((e2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.IsParallel), 37);
        String str3 = this.PersId;
        int hashCode3 = (b + (str3 != null ? str3.hashCode() : 0)) * 37;
        TOnFinishEvent tOnFinishEvent = this.OnFinish;
        int hashCode4 = (hashCode3 + (tOnFinishEvent != null ? tOnFinishEvent.hashCode() : 0)) * 37;
        String str4 = this.Id;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        TSourceInfo tSourceInfo = this.SourceInfo;
        int hashCode6 = this.DirectiveType.hashCode() + unr0.e((hashCode5 + (tSourceInfo != null ? tSourceInfo.hashCode() : 0)) * 37, 37, this.AttachToMultiroom);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m508newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("Type=", Internal.sanitize(this.Type), arrayList);
        unr0.B("Name=", Internal.sanitize(this.Name), arrayList);
        unr0.B("AnalyticsType=", Internal.sanitize(this.AnalyticsType), arrayList);
        smw0.y("IgnoreAnswer=", arrayList, this.IgnoreAnswer);
        Map<String, ?> map = this.Payload;
        if (map != null) {
            arrayList.add("Payload=" + map);
        }
        ByteString byteString = this.PayloadRaw;
        if (byteString != null) {
            arrayList.add("PayloadRaw=" + byteString);
        }
        String str = this.MultiroomSessionId;
        if (str != null) {
            unr0.B("MultiroomSessionId=", Internal.sanitize(str), arrayList);
        }
        if (!this.RoomDeviceIds.isEmpty()) {
            unr0.B("RoomDeviceIds=", Internal.sanitize(this.RoomDeviceIds), arrayList);
        }
        smw0.y("IsLedSilent=", arrayList, this.IsLedSilent);
        String str2 = this.EndpointId;
        if (str2 != null) {
            arrayList.add("EndpointId=".concat(str2));
        }
        smw0.y("IsParallel=", arrayList, this.IsParallel);
        arrayList.add("TimeBeforeDropMs=" + this.TimeBeforeDropMs);
        String str3 = this.PersId;
        if (str3 != null) {
            unr0.B("PersId=", Internal.sanitize(str3), arrayList);
        }
        TOnFinishEvent tOnFinishEvent = this.OnFinish;
        if (tOnFinishEvent != null) {
            arrayList.add("OnFinish=" + tOnFinishEvent);
        }
        String str4 = this.Id;
        if (str4 != null) {
            unr0.B("Id=", Internal.sanitize(str4), arrayList);
        }
        TSourceInfo tSourceInfo = this.SourceInfo;
        if (tSourceInfo != null) {
            arrayList.add("SourceInfo=" + tSourceInfo);
        }
        smw0.y("AttachToMultiroom=", arrayList, this.AttachToMultiroom);
        arrayList.add("DirectiveType=" + this.DirectiveType);
        return a.X(arrayList, Extension.FIX_SPACE, "TDirective{", "}", null, 56);
    }

    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J&\u0010\u0016\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/api/alicekit/directives/platform/utils/TDirective$TOnFinishEvent;", "Lcom/squareup/wire/Message;", "", "TypedCallbackRequest", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Lokio/ByteString;)V", "getTypedCallbackRequest$annotations", "()V", "getTypedCallbackRequest", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TOnFinishEvent extends Message {
        public static final ProtoAdapter<TOnFinishEvent> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", jsonName = "typed_callback_request", oneofName = "Event", schemaIndex = 0, tag = 1)
        private final Map<String, ?> TypedCallbackRequest;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TOnFinishEvent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TOnFinishEvent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective$TOnFinishEvent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDirective.TOnFinishEvent decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    Map<String, ?> map = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDirective.TOnFinishEvent(map, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            map = ProtoAdapter.STRUCT_MAP.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDirective.TOnFinishEvent value) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getTypedCallbackRequest());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDirective.TOnFinishEvent value) {
                    return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1, value.getTypedCallbackRequest()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDirective.TOnFinishEvent redact(TDirective.TOnFinishEvent value) {
                    Map<String, ?> typedCallbackRequest = value.getTypedCallbackRequest();
                    return value.copy(typedCallbackRequest != null ? ProtoAdapter.STRUCT_MAP.redact(typedCallbackRequest) : null, ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDirective.TOnFinishEvent value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getTypedCallbackRequest());
                }
            };
        }

        public TOnFinishEvent(Map<String, ?> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.TypedCallbackRequest = (Map) Internal.immutableCopyOfStruct("TypedCallbackRequest", map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TOnFinishEvent copy$default(TOnFinishEvent tOnFinishEvent, Map map, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                map = tOnFinishEvent.TypedCallbackRequest;
            }
            if ((i & 2) != 0) {
                byteString = tOnFinishEvent.unknownFields();
            }
            return tOnFinishEvent.copy(map, byteString);
        }

        @FlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_PROTOBUF})
        @ColumnNameOption("typed_callback_request")
        public static /* synthetic */ void getTypedCallbackRequest$annotations() {
        }

        public final TOnFinishEvent copy(Map<String, ?> TypedCallbackRequest, ByteString unknownFields) {
            return new TOnFinishEvent(TypedCallbackRequest, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TOnFinishEvent)) {
                return false;
            }
            TOnFinishEvent tOnFinishEvent = (TOnFinishEvent) other;
            return jl40.l(unknownFields(), tOnFinishEvent.unknownFields()) && jl40.l(this.TypedCallbackRequest, tOnFinishEvent.TypedCallbackRequest);
        }

        public final Map<String, ?> getTypedCallbackRequest() {
            return this.TypedCallbackRequest;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Map<String, ?> map = this.TypedCallbackRequest;
            int hashCode2 = hashCode + (map != null ? map.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m509newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Map<String, ?> map = this.TypedCallbackRequest;
            if (map != null) {
                arrayList.add("TypedCallbackRequest=" + map);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TOnFinishEvent{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m509newBuilder();
        }

        public /* synthetic */ TOnFinishEvent(Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TOnFinishEvent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m508newBuilder();
    }

    public TDirective() {
        this(null, null, null, false, null, null, null, null, false, null, false, 0, null, null, null, null, false, null, null, 524287, null);
    }

    public TDirective(String str, String str2, String str3, boolean z, Map<String, ?> map, ByteString byteString, String str4, List<String> list, boolean z2, String str5, boolean z3, int i, String str6, TOnFinishEvent tOnFinishEvent, String str7, TSourceInfo tSourceInfo, boolean z4, TCapability.EDirectiveType eDirectiveType, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.Type = str;
        this.Name = str2;
        this.AnalyticsType = str3;
        this.IgnoreAnswer = z;
        this.PayloadRaw = byteString;
        this.MultiroomSessionId = str4;
        this.IsLedSilent = z2;
        this.EndpointId = str5;
        this.IsParallel = z3;
        this.TimeBeforeDropMs = i;
        this.PersId = str6;
        this.OnFinish = tOnFinishEvent;
        this.Id = str7;
        this.SourceInfo = tSourceInfo;
        this.AttachToMultiroom = z4;
        this.DirectiveType = eDirectiveType;
        this.Payload = (Map) Internal.immutableCopyOfStruct("Payload", map);
        this.RoomDeviceIds = Internal.immutableCopyOf("RoomDeviceIds", list);
        if (Internal.countNonNull(map, byteString) <= 1) {
            return;
        }
        ny61.g("At most one of Payload, PayloadRaw may be non-null");
        throw null;
    }
}
