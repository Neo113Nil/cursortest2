package ru.yandex.alice.protos.api.alicekit.directives.quark.webchat;

import NAlice.NAliceApi.quark.webchat.TSourceInfo;
import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
import NYT.quark.webchat.FlagsOption;
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
import ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002TUBå\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\b\u0010M\u001a\u00020\u0002H\u0017J\u0013\u0010N\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010PH\u0096\u0002J\b\u0010Q\u001a\u00020\u0014H\u0016J\b\u0010R\u001a\u00020\u0004H\u0016Jä\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\fR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\"\u001a\u0004\b*\u0010+R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u001c\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\"\u001a\u0004\b\u0010\u0010+R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\"\u001a\u0004\b3\u0010$R\u001c\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\"\u001a\u0004\b\u0012\u0010+R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\"\u001a\u0004\b6\u00107R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\"\u001a\u0004\b9\u0010$R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\"\u001a\u0004\b;\u0010<R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010\"\u001a\u0004\b>\u0010$R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010\"\u001a\u0004\b@\u0010AR\u001c\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010\"\u001a\u0004\bC\u0010+R\u001c\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010\"\u001a\u0004\bE\u0010FR(\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010\"\u001a\u0004\bH\u0010IR\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010\"\u001a\u0004\bK\u0010L¨\u0006V"}, d2 = {"Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective;", "Lcom/squareup/wire/Message;", "", "type", "", "name", "analyticsType", "ignoreAnswer", "", "payload", "", "payloadRaw", "Lokio/ByteString;", "multiroomSessionId", "roomDeviceIds", "", "isLedSilent", "endpointId", "isParallel", "timeBeforeDropMs", "", "persId", "onFinish", "Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective$TOnFinishEvent;", "id", "sourceInfo", "LNAlice/NAliceApi/quark/webchat/TSourceInfo;", "attachToMultiroom", "directiveType", "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$EDirectiveType;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Lokio/ByteString;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;ZILjava/lang/String;Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective$TOnFinishEvent;Ljava/lang/String;LNAlice/NAliceApi/quark/webchat/TSourceInfo;ZLru/yandex/alice/protos/endpoint/quark/webchat/TCapability$EDirectiveType;Lokio/ByteString;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getName$annotations", "getName", "getAnalyticsType$annotations", "getAnalyticsType", "getIgnoreAnswer$annotations", "getIgnoreAnswer", "()Z", "getPayloadRaw$annotations", "getPayloadRaw", "()Lokio/ByteString;", "getMultiroomSessionId$annotations", "getMultiroomSessionId", "isLedSilent$annotations", "getEndpointId$annotations", "getEndpointId", "isParallel$annotations", "getTimeBeforeDropMs$annotations", "getTimeBeforeDropMs", "()I", "getPersId$annotations", "getPersId", "getOnFinish$annotations", "getOnFinish", "()Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective$TOnFinishEvent;", "getId$annotations", "getId", "getSourceInfo$annotations", "getSourceInfo", "()LNAlice/NAliceApi/quark/webchat/TSourceInfo;", "getAttachToMultiroom$annotations", "getAttachToMultiroom", "getDirectiveType$annotations", "getDirectiveType", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$EDirectiveType;", "getPayload$annotations", "getPayload", "()Ljava/util/Map;", "getRoomDeviceIds$annotations", "getRoomDeviceIds", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "TOnFinishEvent", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TDirective extends Message {
    public static final ProtoAdapter<TDirective> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sub_name", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String analyticsType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "attach_to_multiroom", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 18)
    private final boolean attachToMultiroom;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$EDirectiveType#ADAPTER", jsonName = "directive_type", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 20)
    private final TCapability.EDirectiveType directiveType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING_VALUE", jsonName = "endpoint_id", schemaIndex = 9, tag = 9)
    private final String endpointId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 16)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "ignore_answer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean ignoreAnswer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is_led_silent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 8)
    private final boolean isLedSilent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is_parallel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final boolean isParallel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "multiroom_session_id", oneofName = "OptionalMultiroomSessionId", schemaIndex = 6, tag = 6)
    private final String multiroomSessionId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective$TOnFinishEvent#ADAPTER", jsonName = "on_finish_event", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final TOnFinishEvent onFinish;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", oneofName = "PayloadType", schemaIndex = 4, tag = 5)
    private final Map<String, ?> payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "payload_raw", oneofName = "PayloadType", schemaIndex = 5, tag = 15)
    private final ByteString payloadRaw;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pers_id", oneofName = "OptionalPersId", schemaIndex = 12, tag = 13)
    private final String persId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "room_device_ids", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 7)
    private final List<String> roomDeviceIds;

    @WireField(adapter = "NAlice.NAliceApi.quark.webchat.TSourceInfo#ADAPTER", jsonName = "source_info", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final TSourceInfo sourceInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "time_before_drop_ms", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final int timeBeforeDropMs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String type;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TDirective.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective$Companion$ADAPTER$1
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
                Object obj = null;
                String str9 = str4;
                String str10 = str9;
                while (true) {
                    TCapability.EDirectiveType eDirectiveType2 = eDirectiveType;
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TDirective(str9, str10, str4, z, map, byteString, str5, arrayList, z2, str6, z3, i, str7, tOnFinishEvent, str8, (TSourceInfo) obj, z4, eDirectiveType2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj = TSourceInfo.a.decode(reader);
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
                    TSourceInfo.a.encodeWithTag(writer, 17, (int) value.getSourceInfo());
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
                    encodedSizeWithTag4 += TSourceInfo.a.encodedSizeWithTag(17, value.getSourceInfo());
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
                copy = value.copy((r37 & 1) != 0 ? value.type : null, (r37 & 2) != 0 ? value.name : null, (r37 & 4) != 0 ? value.analyticsType : null, (r37 & 8) != 0 ? value.ignoreAnswer : false, (r37 & 16) != 0 ? value.payload : redact, (r37 & 32) != 0 ? value.payloadRaw : null, (r37 & 64) != 0 ? value.multiroomSessionId : null, (r37 & 128) != 0 ? value.roomDeviceIds : null, (r37 & 256) != 0 ? value.isLedSilent : false, (r37 & 512) != 0 ? value.endpointId : redact2, (r37 & 1024) != 0 ? value.isParallel : false, (r37 & 2048) != 0 ? value.timeBeforeDropMs : 0, (r37 & 4096) != 0 ? value.persId : null, (r37 & 8192) != 0 ? value.onFinish : redact3, (r37 & 16384) != 0 ? value.id : null, (r37 & 32768) != 0 ? value.sourceInfo : sourceInfo != null ? (TSourceInfo) TSourceInfo.a.redact(sourceInfo) : null, (r37 & 65536) != 0 ? value.attachToMultiroom : false, (r37 & 131072) != 0 ? value.directiveType : null, (r37 & 262144) != 0 ? value.unknownFields() : ByteString.c);
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
                    TSourceInfo.a.encodeWithTag(writer, 17, (int) value.getSourceInfo());
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

    @ColumnNameOption("multiroom_session_id")
    public static /* synthetic */ void getMultiroomSessionId$annotations() {
    }

    @ColumnNameOption("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @ColumnNameOption("on_finish_event")
    public static /* synthetic */ void getOnFinish$annotations() {
    }

    @ColumnNameOption("payload")
    @FlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_PROTOBUF})
    public static /* synthetic */ void getPayload$annotations() {
    }

    @ColumnNameOption("payload_raw")
    @FlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_PROTOBUF})
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

    @ColumnNameOption("is_led_silent")
    public static /* synthetic */ void isLedSilent$annotations() {
    }

    @ColumnNameOption("is_parallel")
    public static /* synthetic */ void isParallel$annotations() {
    }

    public final TDirective copy(String type, String name, String analyticsType, boolean ignoreAnswer, Map<String, ?> payload, ByteString payloadRaw, String multiroomSessionId, List<String> roomDeviceIds, boolean isLedSilent, String endpointId, boolean isParallel, int timeBeforeDropMs, String persId, TOnFinishEvent onFinish, String id, TSourceInfo sourceInfo, boolean attachToMultiroom, TCapability.EDirectiveType directiveType, ByteString unknownFields) {
        return new TDirective(type, name, analyticsType, ignoreAnswer, payload, payloadRaw, multiroomSessionId, roomDeviceIds, isLedSilent, endpointId, isParallel, timeBeforeDropMs, persId, onFinish, id, sourceInfo, attachToMultiroom, directiveType, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TDirective)) {
            return false;
        }
        TDirective tDirective = (TDirective) other;
        return jl40.l(unknownFields(), tDirective.unknownFields()) && jl40.l(this.type, tDirective.type) && jl40.l(this.name, tDirective.name) && jl40.l(this.analyticsType, tDirective.analyticsType) && this.ignoreAnswer == tDirective.ignoreAnswer && jl40.l(this.payload, tDirective.payload) && jl40.l(this.payloadRaw, tDirective.payloadRaw) && jl40.l(this.multiroomSessionId, tDirective.multiroomSessionId) && jl40.l(this.roomDeviceIds, tDirective.roomDeviceIds) && this.isLedSilent == tDirective.isLedSilent && jl40.l(this.endpointId, tDirective.endpointId) && this.isParallel == tDirective.isParallel && this.timeBeforeDropMs == tDirective.timeBeforeDropMs && jl40.l(this.persId, tDirective.persId) && jl40.l(this.onFinish, tDirective.onFinish) && jl40.l(this.id, tDirective.id) && jl40.l(this.sourceInfo, tDirective.sourceInfo) && this.attachToMultiroom == tDirective.attachToMultiroom && this.directiveType == tDirective.directiveType;
    }

    public final String getAnalyticsType() {
        return this.analyticsType;
    }

    public final boolean getAttachToMultiroom() {
        return this.attachToMultiroom;
    }

    public final TCapability.EDirectiveType getDirectiveType() {
        return this.directiveType;
    }

    public final String getEndpointId() {
        return this.endpointId;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getIgnoreAnswer() {
        return this.ignoreAnswer;
    }

    public final String getMultiroomSessionId() {
        return this.multiroomSessionId;
    }

    public final String getName() {
        return this.name;
    }

    public final TOnFinishEvent getOnFinish() {
        return this.onFinish;
    }

    public final Map<String, ?> getPayload() {
        return this.payload;
    }

    public final ByteString getPayloadRaw() {
        return this.payloadRaw;
    }

    public final String getPersId() {
        return this.persId;
    }

    public final List<String> getRoomDeviceIds() {
        return this.roomDeviceIds;
    }

    public final TSourceInfo getSourceInfo() {
        return this.sourceInfo;
    }

    public final int getTimeBeforeDropMs() {
        return this.timeBeforeDropMs;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int e = unr0.e(unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.type), 37, this.name), 37, this.analyticsType), 37, this.ignoreAnswer);
        Map<String, ?> map = this.payload;
        int hashCode = (e + (map != null ? map.hashCode() : 0)) * 37;
        ByteString byteString = this.payloadRaw;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.multiroomSessionId;
        int e2 = unr0.e(unr0.c((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.roomDeviceIds), 37, this.isLedSilent);
        String str2 = this.endpointId;
        int b = oyr.b(this.timeBeforeDropMs, unr0.e((e2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.isParallel), 37);
        String str3 = this.persId;
        int hashCode3 = (b + (str3 != null ? str3.hashCode() : 0)) * 37;
        TOnFinishEvent tOnFinishEvent = this.onFinish;
        int hashCode4 = (hashCode3 + (tOnFinishEvent != null ? tOnFinishEvent.hashCode() : 0)) * 37;
        String str4 = this.id;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        TSourceInfo tSourceInfo = this.sourceInfo;
        int hashCode6 = this.directiveType.hashCode() + unr0.e((hashCode5 + (tSourceInfo != null ? tSourceInfo.hashCode() : 0)) * 37, 37, this.attachToMultiroom);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    /* renamed from: isLedSilent, reason: from getter */
    public final boolean getIsLedSilent() {
        return this.isLedSilent;
    }

    /* renamed from: isParallel, reason: from getter */
    public final boolean getIsParallel() {
        return this.isParallel;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m510newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("type=", Internal.sanitize(this.type), arrayList);
        unr0.B("name=", Internal.sanitize(this.name), arrayList);
        unr0.B("analyticsType=", Internal.sanitize(this.analyticsType), arrayList);
        smw0.y("ignoreAnswer=", arrayList, this.ignoreAnswer);
        Map<String, ?> map = this.payload;
        if (map != null) {
            arrayList.add("payload=" + map);
        }
        ByteString byteString = this.payloadRaw;
        if (byteString != null) {
            arrayList.add("payloadRaw=" + byteString);
        }
        String str = this.multiroomSessionId;
        if (str != null) {
            unr0.B("multiroomSessionId=", Internal.sanitize(str), arrayList);
        }
        if (!this.roomDeviceIds.isEmpty()) {
            unr0.B("roomDeviceIds=", Internal.sanitize(this.roomDeviceIds), arrayList);
        }
        smw0.y("isLedSilent=", arrayList, this.isLedSilent);
        String str2 = this.endpointId;
        if (str2 != null) {
            arrayList.add("endpointId=".concat(str2));
        }
        smw0.y("isParallel=", arrayList, this.isParallel);
        arrayList.add("timeBeforeDropMs=" + this.timeBeforeDropMs);
        String str3 = this.persId;
        if (str3 != null) {
            unr0.B("persId=", Internal.sanitize(str3), arrayList);
        }
        TOnFinishEvent tOnFinishEvent = this.onFinish;
        if (tOnFinishEvent != null) {
            arrayList.add("onFinish=" + tOnFinishEvent);
        }
        String str4 = this.id;
        if (str4 != null) {
            unr0.B("id=", Internal.sanitize(str4), arrayList);
        }
        TSourceInfo tSourceInfo = this.sourceInfo;
        if (tSourceInfo != null) {
            arrayList.add("sourceInfo=" + tSourceInfo);
        }
        smw0.y("attachToMultiroom=", arrayList, this.attachToMultiroom);
        arrayList.add("directiveType=" + this.directiveType);
        return a.X(arrayList, Extension.FIX_SPACE, "TDirective{", "}", null, 56);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J&\u0010\u0016\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective$TOnFinishEvent;", "Lcom/squareup/wire/Message;", "", "typedCallbackRequest", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Lokio/ByteString;)V", "getTypedCallbackRequest$annotations", "()V", "getTypedCallbackRequest", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TOnFinishEvent extends Message {
        public static final ProtoAdapter<TOnFinishEvent> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", jsonName = "typed_callback_request", oneofName = "Event", schemaIndex = 0, tag = 1)
        private final Map<String, ?> typedCallbackRequest;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TOnFinishEvent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TOnFinishEvent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective$TOnFinishEvent$Companion$ADAPTER$1
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
            this.typedCallbackRequest = (Map) Internal.immutableCopyOfStruct("typedCallbackRequest", map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TOnFinishEvent copy$default(TOnFinishEvent tOnFinishEvent, Map map, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                map = tOnFinishEvent.typedCallbackRequest;
            }
            if ((i & 2) != 0) {
                byteString = tOnFinishEvent.unknownFields();
            }
            return tOnFinishEvent.copy(map, byteString);
        }

        @ColumnNameOption("typed_callback_request")
        @FlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_PROTOBUF})
        public static /* synthetic */ void getTypedCallbackRequest$annotations() {
        }

        public final TOnFinishEvent copy(Map<String, ?> typedCallbackRequest, ByteString unknownFields) {
            return new TOnFinishEvent(typedCallbackRequest, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TOnFinishEvent)) {
                return false;
            }
            TOnFinishEvent tOnFinishEvent = (TOnFinishEvent) other;
            return jl40.l(unknownFields(), tOnFinishEvent.unknownFields()) && jl40.l(this.typedCallbackRequest, tOnFinishEvent.typedCallbackRequest);
        }

        public final Map<String, ?> getTypedCallbackRequest() {
            return this.typedCallbackRequest;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Map<String, ?> map = this.typedCallbackRequest;
            int hashCode2 = hashCode + (map != null ? map.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m511newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Map<String, ?> map = this.typedCallbackRequest;
            if (map != null) {
                arrayList.add("typedCallbackRequest=" + map);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TOnFinishEvent{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m511newBuilder();
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
        return (Message.Builder) m510newBuilder();
    }

    public TDirective() {
        this(null, null, null, false, null, null, null, null, false, null, false, 0, null, null, null, null, false, null, null, 524287, null);
    }

    public TDirective(String str, String str2, String str3, boolean z, Map<String, ?> map, ByteString byteString, String str4, List<String> list, boolean z2, String str5, boolean z3, int i, String str6, TOnFinishEvent tOnFinishEvent, String str7, TSourceInfo tSourceInfo, boolean z4, TCapability.EDirectiveType eDirectiveType, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.type = str;
        this.name = str2;
        this.analyticsType = str3;
        this.ignoreAnswer = z;
        this.payloadRaw = byteString;
        this.multiroomSessionId = str4;
        this.isLedSilent = z2;
        this.endpointId = str5;
        this.isParallel = z3;
        this.timeBeforeDropMs = i;
        this.persId = str6;
        this.onFinish = tOnFinishEvent;
        this.id = str7;
        this.sourceInfo = tSourceInfo;
        this.attachToMultiroom = z4;
        this.directiveType = eDirectiveType;
        this.payload = (Map) Internal.immutableCopyOfStruct("payload", map);
        this.roomDeviceIds = Internal.immutableCopyOf("roomDeviceIds", list);
        if (Internal.countNonNull(map, byteString) <= 1) {
            return;
        }
        ny61.g("At most one of payload, payloadRaw may be non-null");
        throw null;
    }
}
