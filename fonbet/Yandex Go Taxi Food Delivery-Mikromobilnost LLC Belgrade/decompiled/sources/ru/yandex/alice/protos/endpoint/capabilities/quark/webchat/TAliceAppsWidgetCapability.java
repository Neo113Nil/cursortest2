package ru.yandex.alice.protos.endpoint.capabilities.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
import com.adjust.sdk.Constants;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.qv10;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.DirectiveTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;
import ru.yandex.alice.protos.extensions.quark.webchat.SpeechKitNameOption;
import ru.yandex.common.clid.ClidProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"#$B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TParameters", "TState", "TAliceAppsWidgetSetDataDirective", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@CapabilityTypeOption(TCapability.ECapabilityType.AliceAppsWidgetCapabilityType)
/* loaded from: classes4.dex */
public final class TAliceAppsWidgetCapability extends Message {
    public static final ProtoAdapter<TAliceAppsWidgetCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TAliceAppsWidgetCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TAliceAppsWidgetCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TAliceAppsWidgetCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TAliceAppsWidgetCapability.TParameters tParameters = null;
                TAliceAppsWidgetCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TAliceAppsWidgetCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TAliceAppsWidgetCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TAliceAppsWidgetCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TAliceAppsWidgetCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TAliceAppsWidgetCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TAliceAppsWidgetCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TAliceAppsWidgetCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TAliceAppsWidgetCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TAliceAppsWidgetCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TAliceAppsWidgetCapability redact(TAliceAppsWidgetCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TAliceAppsWidgetCapability.TParameters parameters = value.getParameters();
                TAliceAppsWidgetCapability.TParameters redact2 = parameters != null ? TAliceAppsWidgetCapability.TParameters.ADAPTER.redact(parameters) : null;
                TAliceAppsWidgetCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TAliceAppsWidgetCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TAliceAppsWidgetCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TAliceAppsWidgetCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TAliceAppsWidgetCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TAliceAppsWidgetCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TAliceAppsWidgetCapability copy$default(TAliceAppsWidgetCapability tAliceAppsWidgetCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tAliceAppsWidgetCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tAliceAppsWidgetCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tAliceAppsWidgetCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tAliceAppsWidgetCapability.unknownFields();
        }
        return tAliceAppsWidgetCapability.copy(tMeta, tParameters, tState, byteString);
    }

    @ColumnNameOption(Constants.REFERRER_API_META)
    public static /* synthetic */ void getMeta$annotations() {
    }

    @ColumnNameOption("parameters")
    public static /* synthetic */ void getParameters$annotations() {
    }

    @ColumnNameOption(ClidProvider.STATE)
    public static /* synthetic */ void getState$annotations() {
    }

    public final TAliceAppsWidgetCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TAliceAppsWidgetCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TAliceAppsWidgetCapability)) {
            return false;
        }
        TAliceAppsWidgetCapability tAliceAppsWidgetCapability = (TAliceAppsWidgetCapability) other;
        return jl40.l(unknownFields(), tAliceAppsWidgetCapability.unknownFields()) && jl40.l(this.meta, tAliceAppsWidgetCapability.meta) && jl40.l(this.parameters, tAliceAppsWidgetCapability.parameters) && jl40.l(this.state, tAliceAppsWidgetCapability.state);
    }

    public final TCapability.TMeta getMeta() {
        return this.meta;
    }

    public final TParameters getParameters() {
        return this.parameters;
    }

    public final TState getState() {
        return this.state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TCapability.TMeta tMeta = this.meta;
        int hashCode2 = (hashCode + (tMeta != null ? tMeta.hashCode() : 0)) * 37;
        TParameters tParameters = this.parameters;
        int hashCode3 = (hashCode2 + (tParameters != null ? tParameters.hashCode() : 0)) * 37;
        TState tState = this.state;
        int hashCode4 = hashCode3 + (tState != null ? tState.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m576newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TCapability.TMeta tMeta = this.meta;
        if (tMeta != null) {
            arrayList.add("meta=" + tMeta);
        }
        TParameters tParameters = this.parameters;
        if (tParameters != null) {
            arrayList.add("parameters=" + tParameters);
        }
        TState tState = this.state;
        if (tState != null) {
            arrayList.add("state=" + tState);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TAliceAppsWidgetCapability{", "}", null, 56);
    }

    @SpeechKitNameOption("alice_apps_widget_set_data_directive")
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016JP\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "cardId", "widgetRequestId", "toolName", TarifficatorScenarioActivity.RESULT_KEY, "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TResult;", "error", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TError;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TResult;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TError;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getCardId$annotations", "getCardId", "getWidgetRequestId$annotations", "getWidgetRequestId", "getToolName$annotations", "getToolName", "getResult$annotations", "getResult", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TResult;", "getError$annotations", "getError", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TError;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TResult", "TError", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.AliceAppsWidgetSetDataDirectiveType)
    public static final class TAliceAppsWidgetSetDataDirective extends Message {
        public static final ProtoAdapter<TAliceAppsWidgetSetDataDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "card_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
        private final String cardId;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TError#ADAPTER", oneofName = "ToolResponse", schemaIndex = 5, tag = 5)
        private final TError error;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1000)
        private final String name;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TResult#ADAPTER", oneofName = "ToolResponse", schemaIndex = 4, tag = 4)
        private final TResult result;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tool_name", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
        private final String toolName;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "widget_request_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
        private final String widgetRequestId;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TAliceAppsWidgetSetDataDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TAliceAppsWidgetSetDataDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    String str3 = str2;
                    TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult tResult = null;
                    TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError tError = null;
                    String str4 = str3;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective(str, str4, str2, str3, tResult, tError, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str4 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            str3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            tResult = TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult.ADAPTER.decode(reader);
                        } else if (nextTag == 5) {
                            tError = TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError.ADAPTER.decode(reader);
                        } else if (nextTag != 1000) {
                            reader.readUnknownField(nextTag);
                        } else {
                            str = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                    }
                    if (!jl40.l(value.getCardId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardId());
                    }
                    if (!jl40.l(value.getWidgetRequestId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getWidgetRequestId());
                    }
                    if (!jl40.l(value.getToolName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getToolName());
                    }
                    TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult.ADAPTER.encodeWithTag(writer, 4, (int) value.getResult());
                    TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError.ADAPTER.encodeWithTag(writer, 5, (int) value.getError());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1000, value.getName());
                    }
                    if (!jl40.l(value.getCardId(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCardId());
                    }
                    if (!jl40.l(value.getWidgetRequestId(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getWidgetRequestId());
                    }
                    if (!jl40.l(value.getToolName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getToolName());
                    }
                    return TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError.ADAPTER.encodedSizeWithTag(5, value.getError()) + TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult.ADAPTER.encodedSizeWithTag(4, value.getResult()) + h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective redact(TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective value) {
                    TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult result = value.getResult();
                    TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult redact = result != null ? TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult.ADAPTER.redact(result) : null;
                    TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError error = value.getError();
                    return TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.copy$default(value, null, null, null, null, redact, error != null ? TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError.ADAPTER.redact(error) : null, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective value) {
                    writer.writeBytes(value.unknownFields());
                    TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError.ADAPTER.encodeWithTag(writer, 5, (int) value.getError());
                    TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult.ADAPTER.encodeWithTag(writer, 4, (int) value.getResult());
                    if (!jl40.l(value.getToolName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getToolName());
                    }
                    if (!jl40.l(value.getWidgetRequestId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getWidgetRequestId());
                    }
                    if (!jl40.l(value.getCardId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardId());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1000, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TAliceAppsWidgetSetDataDirective(String str, String str2, String str3, String str4, TResult tResult, TError tError, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : tResult, (i & 32) != 0 ? null : tError, (i & 64) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TAliceAppsWidgetSetDataDirective copy$default(TAliceAppsWidgetSetDataDirective tAliceAppsWidgetSetDataDirective, String str, String str2, String str3, String str4, TResult tResult, TError tError, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tAliceAppsWidgetSetDataDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tAliceAppsWidgetSetDataDirective.cardId;
            }
            if ((i & 4) != 0) {
                str3 = tAliceAppsWidgetSetDataDirective.widgetRequestId;
            }
            if ((i & 8) != 0) {
                str4 = tAliceAppsWidgetSetDataDirective.toolName;
            }
            if ((i & 16) != 0) {
                tResult = tAliceAppsWidgetSetDataDirective.result;
            }
            if ((i & 32) != 0) {
                tError = tAliceAppsWidgetSetDataDirective.error;
            }
            if ((i & 64) != 0) {
                byteString = tAliceAppsWidgetSetDataDirective.unknownFields();
            }
            TError tError2 = tError;
            ByteString byteString2 = byteString;
            TResult tResult2 = tResult;
            String str5 = str3;
            return tAliceAppsWidgetSetDataDirective.copy(str, str2, str5, str4, tResult2, tError2, byteString2);
        }

        @ColumnNameOption("card_id")
        public static /* synthetic */ void getCardId$annotations() {
        }

        @ColumnNameOption("error")
        public static /* synthetic */ void getError$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption(TarifficatorScenarioActivity.RESULT_KEY)
        public static /* synthetic */ void getResult$annotations() {
        }

        @ColumnNameOption("tool_name")
        public static /* synthetic */ void getToolName$annotations() {
        }

        @ColumnNameOption("widget_request_id")
        public static /* synthetic */ void getWidgetRequestId$annotations() {
        }

        public final TAliceAppsWidgetSetDataDirective copy(String name, String cardId, String widgetRequestId, String toolName, TResult result, TError error, ByteString unknownFields) {
            return new TAliceAppsWidgetSetDataDirective(name, cardId, widgetRequestId, toolName, result, error, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TAliceAppsWidgetSetDataDirective)) {
                return false;
            }
            TAliceAppsWidgetSetDataDirective tAliceAppsWidgetSetDataDirective = (TAliceAppsWidgetSetDataDirective) other;
            return jl40.l(unknownFields(), tAliceAppsWidgetSetDataDirective.unknownFields()) && jl40.l(this.name, tAliceAppsWidgetSetDataDirective.name) && jl40.l(this.cardId, tAliceAppsWidgetSetDataDirective.cardId) && jl40.l(this.widgetRequestId, tAliceAppsWidgetSetDataDirective.widgetRequestId) && jl40.l(this.toolName, tAliceAppsWidgetSetDataDirective.toolName) && jl40.l(this.result, tAliceAppsWidgetSetDataDirective.result) && jl40.l(this.error, tAliceAppsWidgetSetDataDirective.error);
        }

        public final String getCardId() {
            return this.cardId;
        }

        public final TError getError() {
            return this.error;
        }

        public final String getName() {
            return this.name;
        }

        public final TResult getResult() {
            return this.result;
        }

        public final String getToolName() {
            return this.toolName;
        }

        public final String getWidgetRequestId() {
            return this.widgetRequestId;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.cardId), 37, this.widgetRequestId), 37, this.toolName);
            TResult tResult = this.result;
            int hashCode = (b + (tResult != null ? tResult.hashCode() : 0)) * 37;
            TError tError = this.error;
            int hashCode2 = hashCode + (tError != null ? tError.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m577newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("cardId=", Internal.sanitize(this.cardId), arrayList);
            unr0.B("widgetRequestId=", Internal.sanitize(this.widgetRequestId), arrayList);
            unr0.B("toolName=", Internal.sanitize(this.toolName), arrayList);
            TResult tResult = this.result;
            if (tResult != null) {
                arrayList.add("result=" + tResult);
            }
            TError tError = this.error;
            if (tError != null) {
                arrayList.add("error=" + tError);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TAliceAppsWidgetSetDataDirective{", "}", null, 56);
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TError;", "Lcom/squareup/wire/Message;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, "", "data_", "", "unknownFields", "Lokio/ByteString;", "<init>", "(JLjava/lang/String;Ljava/util/Map;Lokio/ByteString;)V", "getCode$annotations", "()V", "getCode", "()J", "getMessage$annotations", "getMessage", "()Ljava/lang/String;", "getData_$annotations", "getData_", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TError extends Message {
            public static final ProtoAdapter<TError> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final long code;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", declaredName = io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final Map<String, ?> data_;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String message;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TError.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TError>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TError$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError decode(ProtoReader reader) {
                        long beginMessage = reader.beginMessage();
                        String str = "";
                        Map<String, ?> map = null;
                        long j = 0;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError(j, str, map, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                j = ProtoAdapter.INT64.decode(reader).longValue();
                            } else if (nextTag == 2) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                map = ProtoAdapter.STRUCT_MAP.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError value) {
                        if (value.getCode() != 0) {
                            ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getCode()));
                        }
                        if (!jl40.l(value.getMessage(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage());
                        }
                        if (value.getData_() != null) {
                            ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 3, (int) value.getData_());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError value) {
                        int h = value.unknownFields().h();
                        if (value.getCode() != 0) {
                            h += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getCode()));
                        }
                        if (!jl40.l(value.getMessage(), "")) {
                            h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMessage());
                        }
                        return value.getData_() != null ? ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(3, value.getData_()) + h : h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError redact(TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError value) {
                        Map<String, ?> data_ = value.getData_();
                        return TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError.copy$default(value, 0L, null, data_ != null ? ProtoAdapter.STRUCT_MAP.redact(data_) : null, ByteString.c, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TError value) {
                        writer.writeBytes(value.unknownFields());
                        if (value.getData_() != null) {
                            ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 3, (int) value.getData_());
                        }
                        if (!jl40.l(value.getMessage(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage());
                        }
                        if (value.getCode() != 0) {
                            ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getCode()));
                        }
                    }
                };
            }

            public /* synthetic */ TError(long j, String str, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : map, (i & 8) != 0 ? ByteString.c : byteString);
            }

            public static /* synthetic */ TError copy$default(TError tError, long j, String str, Map map, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = tError.code;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = tError.message;
                }
                String str2 = str;
                if ((i & 4) != 0) {
                    map = tError.data_;
                }
                Map map2 = map;
                if ((i & 8) != 0) {
                    byteString = tError.unknownFields();
                }
                return tError.copy(j2, str2, map2, byteString);
            }

            @ColumnNameOption(AuthSdkActivity.RESPONSE_TYPE_CODE)
            public static /* synthetic */ void getCode$annotations() {
            }

            @ColumnNameOption(io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA)
            public static /* synthetic */ void getData_$annotations() {
            }

            @ColumnNameOption(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE)
            public static /* synthetic */ void getMessage$annotations() {
            }

            public final TError copy(long code, String message, Map<String, ?> data_, ByteString unknownFields) {
                return new TError(code, message, data_, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TError)) {
                    return false;
                }
                TError tError = (TError) other;
                return jl40.l(unknownFields(), tError.unknownFields()) && this.code == tError.code && jl40.l(this.message, tError.message) && jl40.l(this.data_, tError.data_);
            }

            public final long getCode() {
                return this.code;
            }

            public final Map<String, ?> getData_() {
                return this.data_;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int b = unr0.b(qv10.c(unknownFields().hashCode() * 37, 37, this.code), 37, this.message);
                Map<String, ?> map = this.data_;
                int hashCode = b + (map != null ? map.hashCode() : 0);
                this.hashCode = hashCode;
                return hashCode;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m578newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("code=" + this.code);
                unr0.B("message=", Internal.sanitize(this.message), arrayList);
                Map<String, ?> map = this.data_;
                if (map != null) {
                    arrayList.add("data_=" + map);
                }
                return a.X(arrayList, Extension.FIX_SPACE, "TError{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m578newBuilder();
            }

            public TError() {
                this(0L, null, null, null, 15, null);
            }

            public TError(long j, String str, Map<String, ?> map, ByteString byteString) {
                super(ADAPTER, byteString);
                this.code = j;
                this.message = str;
                this.data_ = (Map) Internal.immutableCopyOfStruct("data_", map);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB=\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J<\u0010\u0019\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TResult;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "", "", "structuredContent", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Ljava/util/Map;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Ljava/util/Map;", "getStructuredContent$annotations", "getStructuredContent", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TResult extends Message {
            public static final ProtoAdapter<TResult> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final Map<String, ?> meta;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", jsonName = "structured_content", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final Map<String, ?> structuredContent;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TResult.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TResult>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TAliceAppsWidgetSetDataDirective$TResult$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult decode(ProtoReader reader) {
                        long beginMessage = reader.beginMessage();
                        Map<String, ?> map = null;
                        Map<String, ?> map2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult(map, map2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                map = ProtoAdapter.STRUCT_MAP.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                map2 = ProtoAdapter.STRUCT_MAP.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult value) {
                        if (value.getMeta() != null) {
                            ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getMeta());
                        }
                        if (value.getStructuredContent() != null) {
                            ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 2, (int) value.getStructuredContent());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult value) {
                        int h = value.unknownFields().h();
                        if (value.getMeta() != null) {
                            h += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1, value.getMeta());
                        }
                        return value.getStructuredContent() != null ? ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(2, value.getStructuredContent()) + h : h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult redact(TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult value) {
                        Map<String, ?> meta = value.getMeta();
                        Map<String, ?> redact = meta != null ? ProtoAdapter.STRUCT_MAP.redact(meta) : null;
                        Map<String, ?> structuredContent = value.getStructuredContent();
                        return value.copy(redact, structuredContent != null ? ProtoAdapter.STRUCT_MAP.redact(structuredContent) : null, ByteString.c);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceAppsWidgetCapability.TAliceAppsWidgetSetDataDirective.TResult value) {
                        writer.writeBytes(value.unknownFields());
                        if (value.getStructuredContent() != null) {
                            ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 2, (int) value.getStructuredContent());
                        }
                        if (value.getMeta() != null) {
                            ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getMeta());
                        }
                    }
                };
            }

            public TResult(Map<String, ?> map, Map<String, ?> map2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.meta = (Map) Internal.immutableCopyOfStruct(Constants.REFERRER_API_META, map);
                this.structuredContent = (Map) Internal.immutableCopyOfStruct("structuredContent", map2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TResult copy$default(TResult tResult, Map map, Map map2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = tResult.meta;
                }
                if ((i & 2) != 0) {
                    map2 = tResult.structuredContent;
                }
                if ((i & 4) != 0) {
                    byteString = tResult.unknownFields();
                }
                return tResult.copy(map, map2, byteString);
            }

            @ColumnNameOption(Constants.REFERRER_API_META)
            public static /* synthetic */ void getMeta$annotations() {
            }

            @ColumnNameOption("structured_content")
            public static /* synthetic */ void getStructuredContent$annotations() {
            }

            public final TResult copy(Map<String, ?> meta, Map<String, ?> structuredContent, ByteString unknownFields) {
                return new TResult(meta, structuredContent, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TResult)) {
                    return false;
                }
                TResult tResult = (TResult) other;
                return jl40.l(unknownFields(), tResult.unknownFields()) && jl40.l(this.meta, tResult.meta) && jl40.l(this.structuredContent, tResult.structuredContent);
            }

            public final Map<String, ?> getMeta() {
                return this.meta;
            }

            public final Map<String, ?> getStructuredContent() {
                return this.structuredContent;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Map<String, ?> map = this.meta;
                int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 37;
                Map<String, ?> map2 = this.structuredContent;
                int hashCode3 = hashCode2 + (map2 != null ? map2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m579newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                Map<String, ?> map = this.meta;
                if (map != null) {
                    arrayList.add("meta=" + map);
                }
                Map<String, ?> map2 = this.structuredContent;
                if (map2 != null) {
                    arrayList.add("structuredContent=" + map2);
                }
                return a.X(arrayList, Extension.FIX_SPACE, "TResult{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m579newBuilder();
            }

            public /* synthetic */ TResult(Map map, Map map2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? ByteString.c : byteString);
            }

            public TResult() {
                this(null, null, null, 7, null);
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m577newBuilder();
        }

        public TAliceAppsWidgetSetDataDirective() {
            this(null, null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP, null);
        }

        public TAliceAppsWidgetSetDataDirective(String str, String str2, String str3, String str4, TResult tResult, TError tError, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.cardId = str2;
            this.widgetRequestId = str3;
            this.toolName = str4;
            this.result = tResult;
            this.error = tError;
            if (Internal.countNonNull(tResult, tError) <= 1) {
                return;
            }
            ny61.g("At most one of result, error may be non-null");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J0\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001f"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TState;", "Lcom/squareup/wire/Message;", "", "widgetStates", "", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TState$TWidgetState;", "modelContextContents", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TState$TModelContextContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getWidgetStates$annotations", "()V", "getWidgetStates", "()Ljava/util/List;", "getModelContextContents$annotations", "getModelContextContents", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TWidgetState", "TModelContextContent", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TState$TModelContextContent#ADAPTER", jsonName = "model_context_contents", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        private final List<TModelContextContent> modelContextContents;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TState$TWidgetState#ADAPTER", jsonName = "widget_states", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<TWidgetState> widgetStates;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceAppsWidgetCapability.TState decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceAppsWidgetCapability.TState(arrayList, arrayList2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            arrayList.add(TAliceAppsWidgetCapability.TState.TWidgetState.ADAPTER.decode(reader));
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            arrayList2.add(TAliceAppsWidgetCapability.TState.TModelContextContent.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceAppsWidgetCapability.TState value) {
                    TAliceAppsWidgetCapability.TState.TWidgetState.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getWidgetStates());
                    TAliceAppsWidgetCapability.TState.TModelContextContent.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getModelContextContents());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceAppsWidgetCapability.TState value) {
                    return TAliceAppsWidgetCapability.TState.TModelContextContent.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getModelContextContents()) + TAliceAppsWidgetCapability.TState.TWidgetState.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getWidgetStates()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceAppsWidgetCapability.TState redact(TAliceAppsWidgetCapability.TState value) {
                    return value.copy(Internal.m133redactElements(value.getWidgetStates(), TAliceAppsWidgetCapability.TState.TWidgetState.ADAPTER), Internal.m133redactElements(value.getModelContextContents(), TAliceAppsWidgetCapability.TState.TModelContextContent.ADAPTER), ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceAppsWidgetCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                    TAliceAppsWidgetCapability.TState.TModelContextContent.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getModelContextContents());
                    TAliceAppsWidgetCapability.TState.TWidgetState.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getWidgetStates());
                }
            };
        }

        public TState(List<TWidgetState> list, List<TModelContextContent> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.widgetStates = Internal.immutableCopyOf("widgetStates", list);
            this.modelContextContents = Internal.immutableCopyOf("modelContextContents", list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TState copy$default(TState tState, List list, List list2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tState.widgetStates;
            }
            if ((i & 2) != 0) {
                list2 = tState.modelContextContents;
            }
            if ((i & 4) != 0) {
                byteString = tState.unknownFields();
            }
            return tState.copy(list, list2, byteString);
        }

        @ColumnNameOption("model_context_contents")
        public static /* synthetic */ void getModelContextContents$annotations() {
        }

        @ColumnNameOption("widget_states")
        public static /* synthetic */ void getWidgetStates$annotations() {
        }

        public final TState copy(List<TWidgetState> widgetStates, List<TModelContextContent> modelContextContents, ByteString unknownFields) {
            return new TState(widgetStates, modelContextContents, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TState)) {
                return false;
            }
            TState tState = (TState) other;
            return jl40.l(unknownFields(), tState.unknownFields()) && jl40.l(this.widgetStates, tState.widgetStates) && jl40.l(this.modelContextContents, tState.modelContextContents);
        }

        public final List<TModelContextContent> getModelContextContents() {
            return this.modelContextContents;
        }

        public final List<TWidgetState> getWidgetStates() {
            return this.widgetStates;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.modelContextContents.hashCode() + unr0.c(unknownFields().hashCode() * 37, 37, this.widgetStates);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m581newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.widgetStates.isEmpty()) {
                smw0.x("widgetStates=", arrayList, this.widgetStates);
            }
            if (!this.modelContextContents.isEmpty()) {
                smw0.x("modelContextContents=", arrayList, this.modelContextContents);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TState{", "}", null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TState$TModelContextContent;", "Lcom/squareup/wire/Message;", "", "cardId", "", "content", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCardId$annotations", "()V", "getCardId", "()Ljava/lang/String;", "getContent$annotations", "getContent", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TModelContextContent extends Message {
            public static final ProtoAdapter<TModelContextContent> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "card_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String cardId;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String content;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TModelContextContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TModelContextContent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TState$TModelContextContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceAppsWidgetCapability.TState.TModelContextContent decode(ProtoReader reader) {
                        long beginMessage = reader.beginMessage();
                        String str = "";
                        String str2 = "";
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceAppsWidgetCapability.TState.TModelContextContent(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, TAliceAppsWidgetCapability.TState.TModelContextContent value) {
                        if (!jl40.l(value.getCardId(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardId());
                        }
                        if (!jl40.l(value.getContent(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContent());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceAppsWidgetCapability.TState.TModelContextContent value) {
                        int h = value.unknownFields().h();
                        if (!jl40.l(value.getCardId(), "")) {
                            h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCardId());
                        }
                        return !jl40.l(value.getContent(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContent()) + h : h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceAppsWidgetCapability.TState.TModelContextContent redact(TAliceAppsWidgetCapability.TState.TModelContextContent value) {
                        return TAliceAppsWidgetCapability.TState.TModelContextContent.copy$default(value, null, null, ByteString.c, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceAppsWidgetCapability.TState.TModelContextContent value) {
                        writer.writeBytes(value.unknownFields());
                        if (!jl40.l(value.getContent(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContent());
                        }
                        if (jl40.l(value.getCardId(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardId());
                    }
                };
            }

            public /* synthetic */ TModelContextContent(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.c : byteString);
            }

            public static /* synthetic */ TModelContextContent copy$default(TModelContextContent tModelContextContent, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tModelContextContent.cardId;
                }
                if ((i & 2) != 0) {
                    str2 = tModelContextContent.content;
                }
                if ((i & 4) != 0) {
                    byteString = tModelContextContent.unknownFields();
                }
                return tModelContextContent.copy(str, str2, byteString);
            }

            @ColumnNameOption("card_id")
            public static /* synthetic */ void getCardId$annotations() {
            }

            @ColumnNameOption("content")
            public static /* synthetic */ void getContent$annotations() {
            }

            public final TModelContextContent copy(String cardId, String content, ByteString unknownFields) {
                return new TModelContextContent(cardId, content, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TModelContextContent)) {
                    return false;
                }
                TModelContextContent tModelContextContent = (TModelContextContent) other;
                return jl40.l(unknownFields(), tModelContextContent.unknownFields()) && jl40.l(this.cardId, tModelContextContent.cardId) && jl40.l(this.content, tModelContextContent.content);
            }

            public final String getCardId() {
                return this.cardId;
            }

            public final String getContent() {
                return this.content;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.content.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.cardId);
                this.hashCode = hashCode;
                return hashCode;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m582newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                unr0.B("cardId=", Internal.sanitize(this.cardId), arrayList);
                unr0.B("content=", Internal.sanitize(this.content), arrayList);
                return a.X(arrayList, Extension.FIX_SPACE, "TModelContextContent{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m582newBuilder();
            }

            public TModelContextContent() {
                this(null, null, null, 7, null);
            }

            public TModelContextContent(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.cardId = str;
                this.content = str2;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TState$TWidgetState;", "Lcom/squareup/wire/Message;", "", "cardId", "", "stateJson", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCardId$annotations", "()V", "getCardId", "()Ljava/lang/String;", "getStateJson$annotations", "getStateJson", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TWidgetState extends Message {
            public static final ProtoAdapter<TWidgetState> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "card_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String cardId;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "state_json", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String stateJson;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TWidgetState.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TWidgetState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TState$TWidgetState$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceAppsWidgetCapability.TState.TWidgetState decode(ProtoReader reader) {
                        long beginMessage = reader.beginMessage();
                        String str = "";
                        String str2 = "";
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceAppsWidgetCapability.TState.TWidgetState(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, TAliceAppsWidgetCapability.TState.TWidgetState value) {
                        if (!jl40.l(value.getCardId(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardId());
                        }
                        if (!jl40.l(value.getStateJson(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStateJson());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceAppsWidgetCapability.TState.TWidgetState value) {
                        int h = value.unknownFields().h();
                        if (!jl40.l(value.getCardId(), "")) {
                            h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCardId());
                        }
                        return !jl40.l(value.getStateJson(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getStateJson()) + h : h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceAppsWidgetCapability.TState.TWidgetState redact(TAliceAppsWidgetCapability.TState.TWidgetState value) {
                        return TAliceAppsWidgetCapability.TState.TWidgetState.copy$default(value, null, null, ByteString.c, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceAppsWidgetCapability.TState.TWidgetState value) {
                        writer.writeBytes(value.unknownFields());
                        if (!jl40.l(value.getStateJson(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStateJson());
                        }
                        if (jl40.l(value.getCardId(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardId());
                    }
                };
            }

            public /* synthetic */ TWidgetState(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.c : byteString);
            }

            public static /* synthetic */ TWidgetState copy$default(TWidgetState tWidgetState, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tWidgetState.cardId;
                }
                if ((i & 2) != 0) {
                    str2 = tWidgetState.stateJson;
                }
                if ((i & 4) != 0) {
                    byteString = tWidgetState.unknownFields();
                }
                return tWidgetState.copy(str, str2, byteString);
            }

            @ColumnNameOption("card_id")
            public static /* synthetic */ void getCardId$annotations() {
            }

            @ColumnNameOption("state_json")
            public static /* synthetic */ void getStateJson$annotations() {
            }

            public final TWidgetState copy(String cardId, String stateJson, ByteString unknownFields) {
                return new TWidgetState(cardId, stateJson, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TWidgetState)) {
                    return false;
                }
                TWidgetState tWidgetState = (TWidgetState) other;
                return jl40.l(unknownFields(), tWidgetState.unknownFields()) && jl40.l(this.cardId, tWidgetState.cardId) && jl40.l(this.stateJson, tWidgetState.stateJson);
            }

            public final String getCardId() {
                return this.cardId;
            }

            public final String getStateJson() {
                return this.stateJson;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.stateJson.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.cardId);
                this.hashCode = hashCode;
                return hashCode;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m583newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                unr0.B("cardId=", Internal.sanitize(this.cardId), arrayList);
                unr0.B("stateJson=", Internal.sanitize(this.stateJson), arrayList);
                return a.X(arrayList, Extension.FIX_SPACE, "TWidgetState{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m583newBuilder();
            }

            public TWidgetState() {
                this(null, null, null, 7, null);
            }

            public TWidgetState(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.cardId = str;
                this.stateJson = str2;
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m581newBuilder();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TState(List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r6 != 0 ? r0 : list, (i & 2) != 0 ? r0 : list2, (i & 4) != 0 ? ByteString.c : byteString);
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
        }

        public TState() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceAppsWidgetCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceAppsWidgetCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceAppsWidgetCapability.TParameters decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceAppsWidgetCapability.TParameters(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceAppsWidgetCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceAppsWidgetCapability.TParameters value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceAppsWidgetCapability.TParameters redact(TAliceAppsWidgetCapability.TParameters value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceAppsWidgetCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                }
            };
        }

        public /* synthetic */ TParameters(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TParameters copy$default(TParameters tParameters, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = tParameters.unknownFields();
            }
            return tParameters.copy(byteString);
        }

        public final TParameters copy(ByteString unknownFields) {
            return new TParameters(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TParameters) && jl40.l(unknownFields(), ((TParameters) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m580newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TParameters{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m580newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TParameters() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public TParameters(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m576newBuilder();
    }

    public TAliceAppsWidgetCapability() {
        this(null, null, null, null, 15, null);
    }

    public TAliceAppsWidgetCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
