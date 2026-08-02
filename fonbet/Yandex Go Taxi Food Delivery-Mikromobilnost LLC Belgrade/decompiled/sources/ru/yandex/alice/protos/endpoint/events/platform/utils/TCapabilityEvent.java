package ru.yandex.alice.protos.endpoint.events.platform.utils;

import NAlice.NAliceApi.platform.utils.TSourceInfo;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.qoi0;
import defpackage.smw0;
import defpackage.unr0;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.alice.protos.endpoint.events.platform.utils.TCapabilityEvent;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'(B[\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016JZ\u0010&\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u001e\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lru/yandex/alice/protos/endpoint/events/platform/utils/TCapabilityEvent;", "Lcom/squareup/wire/Message;", "", "NQuark_Timestamp", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "Event", "Lcom/squareup/wire/AnyMessage;", "IsLocal", "", "NonRetryable", "EnvironmentStateMode", "Lru/yandex/alice/protos/endpoint/events/platform/utils/TCapabilityEvent$TEnvironmentStateMode;", "SourceInfo", "LNAlice/NAliceApi/platform/utils/TSourceInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/time/Instant;Lcom/squareup/wire/AnyMessage;ZZLru/yandex/alice/protos/endpoint/events/platform/utils/TCapabilityEvent$TEnvironmentStateMode;LNAlice/NAliceApi/platform/utils/TSourceInfo;Lokio/ByteString;)V", "getNQuark_Timestamp", "()Ljava/time/Instant;", "getEvent", "()Lcom/squareup/wire/AnyMessage;", "getIsLocal", "()Z", "getNonRetryable", "getEnvironmentStateMode", "()Lru/yandex/alice/protos/endpoint/events/platform/utils/TCapabilityEvent$TEnvironmentStateMode;", "getSourceInfo", "()LNAlice/NAliceApi/platform/utils/TSourceInfo;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TEnvironmentStateMode", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TCapabilityEvent extends Message {
    public static final ProtoAdapter<TCapabilityEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.events.platform.utils.TCapabilityEvent$TEnvironmentStateMode#ADAPTER", jsonName = "environment_state_mode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final TEnvironmentStateMode EnvironmentStateMode;

    @WireField(adapter = "com.squareup.wire.AnyMessage#ADAPTER", jsonName = DatabaseHelper.OttTrackingTable.COLUMN_EVENT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AnyMessage Event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is_local", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean IsLocal;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", declaredName = "Timestamp", jsonName = ClidProvider.TIMESTAMP, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Instant NQuark_Timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "non_retryable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean NonRetryable;

    @WireField(adapter = "NAlice.NAliceApi.platform.utils.TSourceInfo#ADAPTER", jsonName = "source_info", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final TSourceInfo SourceInfo;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TCapabilityEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TCapabilityEvent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.events.platform.utils.TCapabilityEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TCapabilityEvent decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                Instant instant = null;
                TCapabilityEvent.TEnvironmentStateMode tEnvironmentStateMode = null;
                TSourceInfo tSourceInfo = null;
                boolean z = false;
                boolean z2 = false;
                AnyMessage anyMessage = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TCapabilityEvent(instant, anyMessage, z, z2, tEnvironmentStateMode, tSourceInfo, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        instant = ProtoAdapter.INSTANT.decode(reader);
                    } else if (nextTag == 2) {
                        anyMessage = AnyMessage.ADAPTER.decode(reader);
                    } else if (nextTag == 3) {
                        z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (nextTag == 4) {
                        z2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (nextTag == 6) {
                        tEnvironmentStateMode = TCapabilityEvent.TEnvironmentStateMode.ADAPTER.decode(reader);
                    } else if (nextTag != 7) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tSourceInfo = TSourceInfo.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TCapabilityEvent value) {
                if (value.getNQuark_Timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getNQuark_Timestamp());
                }
                if (value.getEvent() != null) {
                    AnyMessage.ADAPTER.encodeWithTag(writer, 2, (int) value.getEvent());
                }
                if (value.getIsLocal()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIsLocal()));
                }
                if (value.getNonRetryable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getNonRetryable()));
                }
                if (value.getEnvironmentStateMode() != null) {
                    TCapabilityEvent.TEnvironmentStateMode.ADAPTER.encodeWithTag(writer, 6, (int) value.getEnvironmentStateMode());
                }
                if (value.getSourceInfo() != null) {
                    TSourceInfo.ADAPTER.encodeWithTag(writer, 7, (int) value.getSourceInfo());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TCapabilityEvent value) {
                int h = value.unknownFields().h();
                if (value.getNQuark_Timestamp() != null) {
                    h += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getNQuark_Timestamp());
                }
                if (value.getEvent() != null) {
                    h += AnyMessage.ADAPTER.encodedSizeWithTag(2, value.getEvent());
                }
                if (value.getIsLocal()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIsLocal()));
                }
                if (value.getNonRetryable()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getNonRetryable()));
                }
                if (value.getEnvironmentStateMode() != null) {
                    h += TCapabilityEvent.TEnvironmentStateMode.ADAPTER.encodedSizeWithTag(6, value.getEnvironmentStateMode());
                }
                return value.getSourceInfo() != null ? TSourceInfo.ADAPTER.encodedSizeWithTag(7, value.getSourceInfo()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TCapabilityEvent redact(TCapabilityEvent value) {
                Instant nQuark_Timestamp = value.getNQuark_Timestamp();
                Instant redact = nQuark_Timestamp != null ? ProtoAdapter.INSTANT.redact(nQuark_Timestamp) : null;
                AnyMessage event = value.getEvent();
                AnyMessage redact2 = event != null ? AnyMessage.ADAPTER.redact(event) : null;
                TCapabilityEvent.TEnvironmentStateMode environmentStateMode = value.getEnvironmentStateMode();
                TCapabilityEvent.TEnvironmentStateMode redact3 = environmentStateMode != null ? TCapabilityEvent.TEnvironmentStateMode.ADAPTER.redact(environmentStateMode) : null;
                TSourceInfo sourceInfo = value.getSourceInfo();
                return TCapabilityEvent.copy$default(value, redact, redact2, false, false, redact3, sourceInfo != null ? TSourceInfo.ADAPTER.redact(sourceInfo) : null, ByteString.c, 12, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TCapabilityEvent value) {
                writer.writeBytes(value.unknownFields());
                if (value.getSourceInfo() != null) {
                    TSourceInfo.ADAPTER.encodeWithTag(writer, 7, (int) value.getSourceInfo());
                }
                if (value.getEnvironmentStateMode() != null) {
                    TCapabilityEvent.TEnvironmentStateMode.ADAPTER.encodeWithTag(writer, 6, (int) value.getEnvironmentStateMode());
                }
                if (value.getNonRetryable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getNonRetryable()));
                }
                if (value.getIsLocal()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIsLocal()));
                }
                if (value.getEvent() != null) {
                    AnyMessage.ADAPTER.encodeWithTag(writer, 2, (int) value.getEvent());
                }
                if (value.getNQuark_Timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getNQuark_Timestamp());
                }
            }
        };
    }

    public /* synthetic */ TCapabilityEvent(Instant instant, AnyMessage anyMessage, boolean z, boolean z2, TEnvironmentStateMode tEnvironmentStateMode, TSourceInfo tSourceInfo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? null : anyMessage, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : tEnvironmentStateMode, (i & 32) != 0 ? null : tSourceInfo, (i & 64) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TCapabilityEvent copy$default(TCapabilityEvent tCapabilityEvent, Instant instant, AnyMessage anyMessage, boolean z, boolean z2, TEnvironmentStateMode tEnvironmentStateMode, TSourceInfo tSourceInfo, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = tCapabilityEvent.NQuark_Timestamp;
        }
        if ((i & 2) != 0) {
            anyMessage = tCapabilityEvent.Event;
        }
        if ((i & 4) != 0) {
            z = tCapabilityEvent.IsLocal;
        }
        if ((i & 8) != 0) {
            z2 = tCapabilityEvent.NonRetryable;
        }
        if ((i & 16) != 0) {
            tEnvironmentStateMode = tCapabilityEvent.EnvironmentStateMode;
        }
        if ((i & 32) != 0) {
            tSourceInfo = tCapabilityEvent.SourceInfo;
        }
        if ((i & 64) != 0) {
            byteString = tCapabilityEvent.unknownFields();
        }
        TSourceInfo tSourceInfo2 = tSourceInfo;
        ByteString byteString2 = byteString;
        TEnvironmentStateMode tEnvironmentStateMode2 = tEnvironmentStateMode;
        boolean z3 = z;
        return tCapabilityEvent.copy(instant, anyMessage, z3, z2, tEnvironmentStateMode2, tSourceInfo2, byteString2);
    }

    public final TCapabilityEvent copy(Instant NQuark_Timestamp, AnyMessage Event, boolean IsLocal, boolean NonRetryable, TEnvironmentStateMode EnvironmentStateMode, TSourceInfo SourceInfo, ByteString unknownFields) {
        return new TCapabilityEvent(NQuark_Timestamp, Event, IsLocal, NonRetryable, EnvironmentStateMode, SourceInfo, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TCapabilityEvent)) {
            return false;
        }
        TCapabilityEvent tCapabilityEvent = (TCapabilityEvent) other;
        return jl40.l(unknownFields(), tCapabilityEvent.unknownFields()) && jl40.l(this.NQuark_Timestamp, tCapabilityEvent.NQuark_Timestamp) && jl40.l(this.Event, tCapabilityEvent.Event) && this.IsLocal == tCapabilityEvent.IsLocal && this.NonRetryable == tCapabilityEvent.NonRetryable && jl40.l(this.EnvironmentStateMode, tCapabilityEvent.EnvironmentStateMode) && jl40.l(this.SourceInfo, tCapabilityEvent.SourceInfo);
    }

    public final TEnvironmentStateMode getEnvironmentStateMode() {
        return this.EnvironmentStateMode;
    }

    public final AnyMessage getEvent() {
        return this.Event;
    }

    public final boolean getIsLocal() {
        return this.IsLocal;
    }

    public final Instant getNQuark_Timestamp() {
        return this.NQuark_Timestamp;
    }

    public final boolean getNonRetryable() {
        return this.NonRetryable;
    }

    public final TSourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Instant instant = this.NQuark_Timestamp;
        int hashCode2 = (hashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        AnyMessage anyMessage = this.Event;
        int e = unr0.e(unr0.e((hashCode2 + (anyMessage != null ? anyMessage.hashCode() : 0)) * 37, 37, this.IsLocal), 37, this.NonRetryable);
        TEnvironmentStateMode tEnvironmentStateMode = this.EnvironmentStateMode;
        int hashCode3 = (e + (tEnvironmentStateMode != null ? tEnvironmentStateMode.hashCode() : 0)) * 37;
        TSourceInfo tSourceInfo = this.SourceInfo;
        int hashCode4 = hashCode3 + (tSourceInfo != null ? tSourceInfo.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m688newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.NQuark_Timestamp;
        if (instant != null) {
            arrayList.add("NQuark_Timestamp=" + instant);
        }
        AnyMessage anyMessage = this.Event;
        if (anyMessage != null) {
            arrayList.add("Event=" + anyMessage);
        }
        smw0.y("IsLocal=", arrayList, this.IsLocal);
        smw0.y("NonRetryable=", arrayList, this.NonRetryable);
        TEnvironmentStateMode tEnvironmentStateMode = this.EnvironmentStateMode;
        if (tEnvironmentStateMode != null) {
            arrayList.add("EnvironmentStateMode=" + tEnvironmentStateMode);
        }
        TSourceInfo tSourceInfo = this.SourceInfo;
        if (tSourceInfo != null) {
            arrayList.add("SourceInfo=" + tSourceInfo);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TCapabilityEvent{", "}", null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lru/yandex/alice/protos/endpoint/events/platform/utils/TCapabilityEvent$TEnvironmentStateMode;", "Lcom/squareup/wire/Message;", "", "IncludeLocalEndpoint", "", "IncludeEmbeddedEndpoints", "IncludeRemoteEndpoints", "IncludeRemoteCapabilities", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZZZLokio/ByteString;)V", "getIncludeLocalEndpoint", "()Z", "getIncludeEmbeddedEndpoints", "getIncludeRemoteEndpoints", "getIncludeRemoteCapabilities", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TEnvironmentStateMode extends Message {
        public static final ProtoAdapter<TEnvironmentStateMode> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "include_embedded_endpoints", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final boolean IncludeEmbeddedEndpoints;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "include_local_endpoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final boolean IncludeLocalEndpoint;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "include_remote_capabilities", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final boolean IncludeRemoteCapabilities;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "include_remote_endpoints", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final boolean IncludeRemoteEndpoints;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TEnvironmentStateMode.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TEnvironmentStateMode>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.events.platform.utils.TCapabilityEvent$TEnvironmentStateMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TCapabilityEvent.TEnvironmentStateMode decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TCapabilityEvent.TEnvironmentStateMode(z, z2, z3, z4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag == 2) {
                            z2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag == 3) {
                            z3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            z4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TCapabilityEvent.TEnvironmentStateMode value) {
                    if (value.getIncludeLocalEndpoint()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIncludeLocalEndpoint()));
                    }
                    if (value.getIncludeEmbeddedEndpoints()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIncludeEmbeddedEndpoints()));
                    }
                    if (value.getIncludeRemoteEndpoints()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIncludeRemoteEndpoints()));
                    }
                    if (value.getIncludeRemoteCapabilities()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIncludeRemoteCapabilities()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TCapabilityEvent.TEnvironmentStateMode value) {
                    int h = value.unknownFields().h();
                    if (value.getIncludeLocalEndpoint()) {
                        h += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIncludeLocalEndpoint()));
                    }
                    if (value.getIncludeEmbeddedEndpoints()) {
                        h += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIncludeEmbeddedEndpoints()));
                    }
                    if (value.getIncludeRemoteEndpoints()) {
                        h += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIncludeRemoteEndpoints()));
                    }
                    return value.getIncludeRemoteCapabilities() ? ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIncludeRemoteCapabilities())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TCapabilityEvent.TEnvironmentStateMode redact(TCapabilityEvent.TEnvironmentStateMode value) {
                    return TCapabilityEvent.TEnvironmentStateMode.copy$default(value, false, false, false, false, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TCapabilityEvent.TEnvironmentStateMode value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getIncludeRemoteCapabilities()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIncludeRemoteCapabilities()));
                    }
                    if (value.getIncludeRemoteEndpoints()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIncludeRemoteEndpoints()));
                    }
                    if (value.getIncludeEmbeddedEndpoints()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIncludeEmbeddedEndpoints()));
                    }
                    if (value.getIncludeLocalEndpoint()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIncludeLocalEndpoint()));
                    }
                }
            };
        }

        public /* synthetic */ TEnvironmentStateMode(boolean z, boolean z2, boolean z3, boolean z4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TEnvironmentStateMode copy$default(TEnvironmentStateMode tEnvironmentStateMode, boolean z, boolean z2, boolean z3, boolean z4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tEnvironmentStateMode.IncludeLocalEndpoint;
            }
            if ((i & 2) != 0) {
                z2 = tEnvironmentStateMode.IncludeEmbeddedEndpoints;
            }
            if ((i & 4) != 0) {
                z3 = tEnvironmentStateMode.IncludeRemoteEndpoints;
            }
            if ((i & 8) != 0) {
                z4 = tEnvironmentStateMode.IncludeRemoteCapabilities;
            }
            if ((i & 16) != 0) {
                byteString = tEnvironmentStateMode.unknownFields();
            }
            ByteString byteString2 = byteString;
            boolean z5 = z3;
            return tEnvironmentStateMode.copy(z, z2, z5, z4, byteString2);
        }

        public final TEnvironmentStateMode copy(boolean IncludeLocalEndpoint, boolean IncludeEmbeddedEndpoints, boolean IncludeRemoteEndpoints, boolean IncludeRemoteCapabilities, ByteString unknownFields) {
            return new TEnvironmentStateMode(IncludeLocalEndpoint, IncludeEmbeddedEndpoints, IncludeRemoteEndpoints, IncludeRemoteCapabilities, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TEnvironmentStateMode)) {
                return false;
            }
            TEnvironmentStateMode tEnvironmentStateMode = (TEnvironmentStateMode) other;
            return jl40.l(unknownFields(), tEnvironmentStateMode.unknownFields()) && this.IncludeLocalEndpoint == tEnvironmentStateMode.IncludeLocalEndpoint && this.IncludeEmbeddedEndpoints == tEnvironmentStateMode.IncludeEmbeddedEndpoints && this.IncludeRemoteEndpoints == tEnvironmentStateMode.IncludeRemoteEndpoints && this.IncludeRemoteCapabilities == tEnvironmentStateMode.IncludeRemoteCapabilities;
        }

        public final boolean getIncludeEmbeddedEndpoints() {
            return this.IncludeEmbeddedEndpoints;
        }

        public final boolean getIncludeLocalEndpoint() {
            return this.IncludeLocalEndpoint;
        }

        public final boolean getIncludeRemoteCapabilities() {
            return this.IncludeRemoteCapabilities;
        }

        public final boolean getIncludeRemoteEndpoints() {
            return this.IncludeRemoteEndpoints;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Boolean.hashCode(this.IncludeRemoteCapabilities) + unr0.e(unr0.e(unr0.e(unknownFields().hashCode() * 37, 37, this.IncludeLocalEndpoint), 37, this.IncludeEmbeddedEndpoints), 37, this.IncludeRemoteEndpoints);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m689newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            smw0.y("IncludeLocalEndpoint=", arrayList, this.IncludeLocalEndpoint);
            smw0.y("IncludeEmbeddedEndpoints=", arrayList, this.IncludeEmbeddedEndpoints);
            smw0.y("IncludeRemoteEndpoints=", arrayList, this.IncludeRemoteEndpoints);
            smw0.y("IncludeRemoteCapabilities=", arrayList, this.IncludeRemoteCapabilities);
            return a.X(arrayList, Extension.FIX_SPACE, "TEnvironmentStateMode{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m689newBuilder();
        }

        public TEnvironmentStateMode() {
            this(false, false, false, false, null, 31, null);
        }

        public TEnvironmentStateMode(boolean z, boolean z2, boolean z3, boolean z4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.IncludeLocalEndpoint = z;
            this.IncludeEmbeddedEndpoints = z2;
            this.IncludeRemoteEndpoints = z3;
            this.IncludeRemoteCapabilities = z4;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m688newBuilder();
    }

    public TCapabilityEvent() {
        this(null, null, false, false, null, null, null, HProv.PP_VERSION_TIMESTAMP, null);
    }

    public TCapabilityEvent(Instant instant, AnyMessage anyMessage, boolean z, boolean z2, TEnvironmentStateMode tEnvironmentStateMode, TSourceInfo tSourceInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.NQuark_Timestamp = instant;
        this.Event = anyMessage;
        this.IsLocal = z;
        this.NonRetryable = z2;
        this.EnvironmentStateMode = tEnvironmentStateMode;
        this.SourceInfo = tSourceInfo;
    }
}
