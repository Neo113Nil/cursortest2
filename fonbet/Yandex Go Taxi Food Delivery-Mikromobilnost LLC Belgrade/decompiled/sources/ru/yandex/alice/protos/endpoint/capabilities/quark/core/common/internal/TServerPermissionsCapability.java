package ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal;

import NYT.quark.core.common.internal.ColumnNameOption;
import NYT.quark.core.common.internal.DefaultFieldFlagsOption;
import NYT.quark.core.common.internal.EWrapperFieldFlag;
import com.adjust.sdk.Constants;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.smw0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability;
import ru.yandex.alice.protos.endpoint.quark.core.common.internal.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.quark.core.common.internal.DirectiveTypeOption;
import ru.yandex.alice.protos.endpoint.quark.core.common.internal.EventTypeOption;
import ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability;
import ru.yandex.alice.protos.extensions.quark.core.common.internal.SpeechKitNameOption;
import ru.yandex.common.clid.ClidProvider;

@CapabilityTypeOption(TCapability.ECapabilityType.ServerPermissionsCapabilityType)
@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\t!\"#$%&'()B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TParameters", "TState", "TGrantablePermission", "TVersatilePermission", "TPermission", "TRequestPermissionDirective", "TPermissionRequestSuccessEvent", "TPermissionRequestFailureEvent", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TServerPermissionsCapability extends Message {
    public static final ProtoAdapter<TServerPermissionsCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission;", "Lcom/squareup/wire/Message;", "", "grantType", "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission$EGrantType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission$EGrantType;Lokio/ByteString;)V", "getGrantType$annotations", "()V", "getGrantType", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission$EGrantType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EGrantType", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TVersatilePermission extends Message {
        public static final ProtoAdapter<TVersatilePermission> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TVersatilePermission$EGrantType#ADAPTER", jsonName = "grant_type", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final EGrantType grantType;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TVersatilePermission.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TVersatilePermission>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TVersatilePermission$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TVersatilePermission decode(ProtoReader reader) {
                    TServerPermissionsCapability.TVersatilePermission.EGrantType eGrantType = TServerPermissionsCapability.TVersatilePermission.EGrantType.UnknownGrantType;
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TServerPermissionsCapability.TVersatilePermission(eGrantType, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                eGrantType = TServerPermissionsCapability.TVersatilePermission.EGrantType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TServerPermissionsCapability.TVersatilePermission value) {
                    if (value.getGrantType() != TServerPermissionsCapability.TVersatilePermission.EGrantType.UnknownGrantType) {
                        TServerPermissionsCapability.TVersatilePermission.EGrantType.ADAPTER.encodeWithTag(writer, 1, (int) value.getGrantType());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TServerPermissionsCapability.TVersatilePermission value) {
                    int h = value.unknownFields().h();
                    return value.getGrantType() != TServerPermissionsCapability.TVersatilePermission.EGrantType.UnknownGrantType ? TServerPermissionsCapability.TVersatilePermission.EGrantType.ADAPTER.encodedSizeWithTag(1, value.getGrantType()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TVersatilePermission redact(TServerPermissionsCapability.TVersatilePermission value) {
                    return TServerPermissionsCapability.TVersatilePermission.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TServerPermissionsCapability.TVersatilePermission value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getGrantType() != TServerPermissionsCapability.TVersatilePermission.EGrantType.UnknownGrantType) {
                        TServerPermissionsCapability.TVersatilePermission.EGrantType.ADAPTER.encodeWithTag(writer, 1, (int) value.getGrantType());
                    }
                }
            };
        }

        public /* synthetic */ TVersatilePermission(EGrantType eGrantType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EGrantType.UnknownGrantType : eGrantType, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TVersatilePermission copy$default(TVersatilePermission tVersatilePermission, EGrantType eGrantType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                eGrantType = tVersatilePermission.grantType;
            }
            if ((i & 2) != 0) {
                byteString = tVersatilePermission.unknownFields();
            }
            return tVersatilePermission.copy(eGrantType, byteString);
        }

        @ColumnNameOption("grant_type")
        public static /* synthetic */ void getGrantType$annotations() {
        }

        public final TVersatilePermission copy(EGrantType grantType, ByteString unknownFields) {
            return new TVersatilePermission(grantType, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TVersatilePermission)) {
                return false;
            }
            TVersatilePermission tVersatilePermission = (TVersatilePermission) other;
            return jl40.l(unknownFields(), tVersatilePermission.unknownFields()) && this.grantType == tVersatilePermission.grantType;
        }

        public final EGrantType getGrantType() {
            return this.grantType;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.grantType.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m567newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("grantType=" + this.grantType);
            return a.X(arrayList, Extension.FIX_SPACE, "TVersatilePermission{", "}", null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission$EGrantType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UnknownGrantType", "Blocked", "WhenInApp", "Always", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class EGrantType implements WireEnum {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ EGrantType[] $VALUES;
            public static final ProtoAdapter<EGrantType> ADAPTER;
            public static final EGrantType Always;
            public static final EGrantType Blocked;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final EGrantType UnknownGrantType;
            public static final EGrantType WhenInApp;
            private final int value;

            private static final /* synthetic */ EGrantType[] $values() {
                return new EGrantType[]{UnknownGrantType, Blocked, WhenInApp, Always};
            }

            static {
                final EGrantType eGrantType = new EGrantType("UnknownGrantType", 0, 0);
                UnknownGrantType = eGrantType;
                Blocked = new EGrantType("Blocked", 1, 1);
                WhenInApp = new EGrantType("WhenInApp", 2, 2);
                Always = new EGrantType("Always", 3, 3);
                EGrantType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
                INSTANCE = new Companion(null);
                final g0c a = qoi0.a(EGrantType.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<EGrantType>(a, syntax, eGrantType) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TVersatilePermission$EGrantType$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public TServerPermissionsCapability.TVersatilePermission.EGrantType fromValue(int value) {
                        return TServerPermissionsCapability.TVersatilePermission.EGrantType.INSTANCE.fromValue(value);
                    }
                };
            }

            private EGrantType(String str, int i, int i2) {
                this.value = i2;
            }

            public static final EGrantType fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static EGrantType valueOf(String str) {
                return (EGrantType) Enum.valueOf(EGrantType.class, str);
            }

            public static EGrantType[] values() {
                return (EGrantType[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission$EGrantType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission$EGrantType;", "fromValue", "value", "", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final EGrantType fromValue(int value) {
                    if (value == 0) {
                        return EGrantType.UnknownGrantType;
                    }
                    if (value == 1) {
                        return EGrantType.Blocked;
                    }
                    if (value == 2) {
                        return EGrantType.WhenInApp;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return EGrantType.Always;
                }

                private Companion() {
                }
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m567newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TVersatilePermission() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TVersatilePermission(EGrantType eGrantType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.grantType = eGrantType;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TServerPermissionsCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TServerPermissionsCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TServerPermissionsCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TServerPermissionsCapability.TParameters tParameters = null;
                TServerPermissionsCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TServerPermissionsCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TServerPermissionsCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TServerPermissionsCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TServerPermissionsCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TServerPermissionsCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TServerPermissionsCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TServerPermissionsCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TServerPermissionsCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TServerPermissionsCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TServerPermissionsCapability redact(TServerPermissionsCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TServerPermissionsCapability.TParameters parameters = value.getParameters();
                TServerPermissionsCapability.TParameters redact2 = parameters != null ? TServerPermissionsCapability.TParameters.ADAPTER.redact(parameters) : null;
                TServerPermissionsCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TServerPermissionsCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TServerPermissionsCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TServerPermissionsCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TServerPermissionsCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TServerPermissionsCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TServerPermissionsCapability copy$default(TServerPermissionsCapability tServerPermissionsCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tServerPermissionsCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tServerPermissionsCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tServerPermissionsCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tServerPermissionsCapability.unknownFields();
        }
        return tServerPermissionsCapability.copy(tMeta, tParameters, tState, byteString);
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

    public final TServerPermissionsCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TServerPermissionsCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TServerPermissionsCapability)) {
            return false;
        }
        TServerPermissionsCapability tServerPermissionsCapability = (TServerPermissionsCapability) other;
        return jl40.l(unknownFields(), tServerPermissionsCapability.unknownFields()) && jl40.l(this.meta, tServerPermissionsCapability.meta) && jl40.l(this.parameters, tServerPermissionsCapability.parameters) && jl40.l(this.state, tServerPermissionsCapability.state);
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
    public /* synthetic */ Void m559newBuilder() {
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
        return a.X(arrayList, Extension.FIX_SPACE, "TServerPermissionsCapability{", "}", null, 56);
    }

    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;", "Lcom/squareup/wire/Message;", "", "granted", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLokio/ByteString;)V", "getGranted$annotations", "()V", "getGranted", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TGrantablePermission extends Message {
        public static final ProtoAdapter<TGrantablePermission> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final boolean granted;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TGrantablePermission.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TGrantablePermission>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TGrantablePermission$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TGrantablePermission decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    boolean z = false;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TServerPermissionsCapability.TGrantablePermission(z, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TServerPermissionsCapability.TGrantablePermission value) {
                    if (value.getGranted()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getGranted()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TServerPermissionsCapability.TGrantablePermission value) {
                    int h = value.unknownFields().h();
                    return value.getGranted() ? ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getGranted())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TGrantablePermission redact(TServerPermissionsCapability.TGrantablePermission value) {
                    return TServerPermissionsCapability.TGrantablePermission.copy$default(value, false, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TServerPermissionsCapability.TGrantablePermission value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getGranted()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getGranted()));
                    }
                }
            };
        }

        public /* synthetic */ TGrantablePermission(boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TGrantablePermission copy$default(TGrantablePermission tGrantablePermission, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tGrantablePermission.granted;
            }
            if ((i & 2) != 0) {
                byteString = tGrantablePermission.unknownFields();
            }
            return tGrantablePermission.copy(z, byteString);
        }

        @ColumnNameOption("granted")
        public static /* synthetic */ void getGranted$annotations() {
        }

        public final TGrantablePermission copy(boolean granted, ByteString unknownFields) {
            return new TGrantablePermission(granted, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TGrantablePermission)) {
                return false;
            }
            TGrantablePermission tGrantablePermission = (TGrantablePermission) other;
            return jl40.l(unknownFields(), tGrantablePermission.unknownFields()) && this.granted == tGrantablePermission.granted;
        }

        public final boolean getGranted() {
            return this.granted;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Boolean.hashCode(this.granted) + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m560newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            smw0.y("granted=", arrayList, this.granted);
            return a.X(arrayList, Extension.FIX_SPACE, "TGrantablePermission{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m560newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TGrantablePermission() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public TGrantablePermission(boolean z, ByteString byteString) {
            super(ADAPTER, byteString);
            this.granted = z;
        }
    }

    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TParameters decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TServerPermissionsCapability.TParameters(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TServerPermissionsCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TServerPermissionsCapability.TParameters value) {
                    return value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TParameters redact(TServerPermissionsCapability.TParameters value) {
                    return value.copy(ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TServerPermissionsCapability.TParameters value) {
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
        public /* synthetic */ Void m561newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TParameters{}";
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m561newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TParameters() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public TParameters(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010*\u001a\u00020\u0002H\u0017J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000202H\u0016J\u0088\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0019R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0019R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0014\u001a\u0004\b)\u0010\u0019¨\u00065"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;", "Lcom/squareup/wire/Message;", "", "allowAccessLocation", "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission;", "allowReadContacts", "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;", "allowCallPhone", "allowPostNotifications", "allowInternetConnectionInfo", "allowReadCalendar", "allowWriteCalendar", "allowScheduleExactAlarms", "allowAccessPreciseLocation", "allowAccessCamera", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;Lokio/ByteString;)V", "getAllowAccessLocation$annotations", "()V", "getAllowAccessLocation", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TVersatilePermission;", "getAllowReadContacts$annotations", "getAllowReadContacts", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TGrantablePermission;", "getAllowCallPhone$annotations", "getAllowCallPhone", "getAllowPostNotifications$annotations", "getAllowPostNotifications", "getAllowInternetConnectionInfo$annotations", "getAllowInternetConnectionInfo", "getAllowReadCalendar$annotations", "getAllowReadCalendar", "getAllowWriteCalendar$annotations", "getAllowWriteCalendar", "getAllowScheduleExactAlarms$annotations", "getAllowScheduleExactAlarms", "getAllowAccessPreciseLocation$annotations", "getAllowAccessPreciseLocation", "getAllowAccessCamera$annotations", "getAllowAccessCamera", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TPermission extends Message {
        public static final ProtoAdapter<TPermission> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TGrantablePermission#ADAPTER", jsonName = "allow_access_camera", oneofName = "Permission", schemaIndex = 9, tag = 11)
        private final TGrantablePermission allowAccessCamera;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TVersatilePermission#ADAPTER", jsonName = "allow_access_location", oneofName = "Permission", schemaIndex = 0, tag = 1)
        private final TVersatilePermission allowAccessLocation;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TVersatilePermission#ADAPTER", jsonName = "allow_access_precise_location", oneofName = "Permission", schemaIndex = 8, tag = 10)
        private final TVersatilePermission allowAccessPreciseLocation;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TGrantablePermission#ADAPTER", jsonName = "allow_call_phone", oneofName = "Permission", schemaIndex = 2, tag = 3)
        private final TGrantablePermission allowCallPhone;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TVersatilePermission#ADAPTER", jsonName = "allow_internet_connection_info", oneofName = "Permission", schemaIndex = 4, tag = 6)
        private final TVersatilePermission allowInternetConnectionInfo;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TGrantablePermission#ADAPTER", jsonName = "allow_post_notifications", oneofName = "Permission", schemaIndex = 3, tag = 5)
        private final TGrantablePermission allowPostNotifications;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TGrantablePermission#ADAPTER", jsonName = "allow_read_calendar", oneofName = "Permission", schemaIndex = 5, tag = 7)
        private final TGrantablePermission allowReadCalendar;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TGrantablePermission#ADAPTER", jsonName = "allow_read_contacts", oneofName = "Permission", schemaIndex = 1, tag = 2)
        private final TGrantablePermission allowReadContacts;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TGrantablePermission#ADAPTER", jsonName = "allow_schedule_exact_alarms", oneofName = "Permission", schemaIndex = 7, tag = 9)
        private final TGrantablePermission allowScheduleExactAlarms;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TGrantablePermission#ADAPTER", jsonName = "allow_write_calendar", oneofName = "Permission", schemaIndex = 6, tag = 8)
        private final TGrantablePermission allowWriteCalendar;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TPermission.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TPermission>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TPermission$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TPermission decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    TServerPermissionsCapability.TVersatilePermission tVersatilePermission = null;
                    TServerPermissionsCapability.TGrantablePermission tGrantablePermission = null;
                    TServerPermissionsCapability.TGrantablePermission tGrantablePermission2 = null;
                    TServerPermissionsCapability.TGrantablePermission tGrantablePermission3 = null;
                    TServerPermissionsCapability.TVersatilePermission tVersatilePermission2 = null;
                    TServerPermissionsCapability.TGrantablePermission tGrantablePermission4 = null;
                    TServerPermissionsCapability.TGrantablePermission tGrantablePermission5 = null;
                    TServerPermissionsCapability.TGrantablePermission tGrantablePermission6 = null;
                    TServerPermissionsCapability.TVersatilePermission tVersatilePermission3 = null;
                    TServerPermissionsCapability.TGrantablePermission tGrantablePermission7 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TServerPermissionsCapability.TPermission(tVersatilePermission, tGrantablePermission, tGrantablePermission2, tGrantablePermission3, tVersatilePermission2, tGrantablePermission4, tGrantablePermission5, tGrantablePermission6, tVersatilePermission3, tGrantablePermission7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                tVersatilePermission = TServerPermissionsCapability.TVersatilePermission.ADAPTER.decode(reader);
                                break;
                            case 2:
                                tGrantablePermission = TServerPermissionsCapability.TGrantablePermission.ADAPTER.decode(reader);
                                break;
                            case 3:
                                tGrantablePermission2 = TServerPermissionsCapability.TGrantablePermission.ADAPTER.decode(reader);
                                break;
                            case 4:
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                            case 5:
                                tGrantablePermission3 = TServerPermissionsCapability.TGrantablePermission.ADAPTER.decode(reader);
                                break;
                            case 6:
                                tVersatilePermission2 = TServerPermissionsCapability.TVersatilePermission.ADAPTER.decode(reader);
                                break;
                            case 7:
                                tGrantablePermission4 = TServerPermissionsCapability.TGrantablePermission.ADAPTER.decode(reader);
                                break;
                            case 8:
                                tGrantablePermission5 = TServerPermissionsCapability.TGrantablePermission.ADAPTER.decode(reader);
                                break;
                            case 9:
                                tGrantablePermission6 = TServerPermissionsCapability.TGrantablePermission.ADAPTER.decode(reader);
                                break;
                            case 10:
                                tVersatilePermission3 = TServerPermissionsCapability.TVersatilePermission.ADAPTER.decode(reader);
                                break;
                            case 11:
                                tGrantablePermission7 = TServerPermissionsCapability.TGrantablePermission.ADAPTER.decode(reader);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TServerPermissionsCapability.TPermission value) {
                    ProtoAdapter<TServerPermissionsCapability.TVersatilePermission> protoAdapter = TServerPermissionsCapability.TVersatilePermission.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getAllowAccessLocation());
                    ProtoAdapter<TServerPermissionsCapability.TGrantablePermission> protoAdapter2 = TServerPermissionsCapability.TGrantablePermission.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, (int) value.getAllowReadContacts());
                    protoAdapter2.encodeWithTag(writer, 3, (int) value.getAllowCallPhone());
                    protoAdapter2.encodeWithTag(writer, 5, (int) value.getAllowPostNotifications());
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getAllowInternetConnectionInfo());
                    protoAdapter2.encodeWithTag(writer, 7, (int) value.getAllowReadCalendar());
                    protoAdapter2.encodeWithTag(writer, 8, (int) value.getAllowWriteCalendar());
                    protoAdapter2.encodeWithTag(writer, 9, (int) value.getAllowScheduleExactAlarms());
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getAllowAccessPreciseLocation());
                    protoAdapter2.encodeWithTag(writer, 11, (int) value.getAllowAccessCamera());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TServerPermissionsCapability.TPermission value) {
                    int h = value.unknownFields().h();
                    ProtoAdapter<TServerPermissionsCapability.TVersatilePermission> protoAdapter = TServerPermissionsCapability.TVersatilePermission.ADAPTER;
                    int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, value.getAllowAccessLocation()) + h;
                    ProtoAdapter<TServerPermissionsCapability.TGrantablePermission> protoAdapter2 = TServerPermissionsCapability.TGrantablePermission.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(11, value.getAllowAccessCamera()) + protoAdapter.encodedSizeWithTag(10, value.getAllowAccessPreciseLocation()) + protoAdapter2.encodedSizeWithTag(9, value.getAllowScheduleExactAlarms()) + protoAdapter2.encodedSizeWithTag(8, value.getAllowWriteCalendar()) + protoAdapter2.encodedSizeWithTag(7, value.getAllowReadCalendar()) + protoAdapter.encodedSizeWithTag(6, value.getAllowInternetConnectionInfo()) + protoAdapter2.encodedSizeWithTag(5, value.getAllowPostNotifications()) + protoAdapter2.encodedSizeWithTag(3, value.getAllowCallPhone()) + protoAdapter2.encodedSizeWithTag(2, value.getAllowReadContacts()) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TPermission redact(TServerPermissionsCapability.TPermission value) {
                    TServerPermissionsCapability.TVersatilePermission allowAccessLocation = value.getAllowAccessLocation();
                    TServerPermissionsCapability.TVersatilePermission redact = allowAccessLocation != null ? TServerPermissionsCapability.TVersatilePermission.ADAPTER.redact(allowAccessLocation) : null;
                    TServerPermissionsCapability.TGrantablePermission allowReadContacts = value.getAllowReadContacts();
                    TServerPermissionsCapability.TGrantablePermission redact2 = allowReadContacts != null ? TServerPermissionsCapability.TGrantablePermission.ADAPTER.redact(allowReadContacts) : null;
                    TServerPermissionsCapability.TGrantablePermission allowCallPhone = value.getAllowCallPhone();
                    TServerPermissionsCapability.TGrantablePermission redact3 = allowCallPhone != null ? TServerPermissionsCapability.TGrantablePermission.ADAPTER.redact(allowCallPhone) : null;
                    TServerPermissionsCapability.TGrantablePermission allowPostNotifications = value.getAllowPostNotifications();
                    TServerPermissionsCapability.TGrantablePermission redact4 = allowPostNotifications != null ? TServerPermissionsCapability.TGrantablePermission.ADAPTER.redact(allowPostNotifications) : null;
                    TServerPermissionsCapability.TVersatilePermission allowInternetConnectionInfo = value.getAllowInternetConnectionInfo();
                    TServerPermissionsCapability.TVersatilePermission redact5 = allowInternetConnectionInfo != null ? TServerPermissionsCapability.TVersatilePermission.ADAPTER.redact(allowInternetConnectionInfo) : null;
                    TServerPermissionsCapability.TGrantablePermission allowReadCalendar = value.getAllowReadCalendar();
                    TServerPermissionsCapability.TGrantablePermission redact6 = allowReadCalendar != null ? TServerPermissionsCapability.TGrantablePermission.ADAPTER.redact(allowReadCalendar) : null;
                    TServerPermissionsCapability.TGrantablePermission allowWriteCalendar = value.getAllowWriteCalendar();
                    TServerPermissionsCapability.TGrantablePermission redact7 = allowWriteCalendar != null ? TServerPermissionsCapability.TGrantablePermission.ADAPTER.redact(allowWriteCalendar) : null;
                    TServerPermissionsCapability.TGrantablePermission allowScheduleExactAlarms = value.getAllowScheduleExactAlarms();
                    TServerPermissionsCapability.TGrantablePermission redact8 = allowScheduleExactAlarms != null ? TServerPermissionsCapability.TGrantablePermission.ADAPTER.redact(allowScheduleExactAlarms) : null;
                    TServerPermissionsCapability.TVersatilePermission allowAccessPreciseLocation = value.getAllowAccessPreciseLocation();
                    TServerPermissionsCapability.TVersatilePermission redact9 = allowAccessPreciseLocation != null ? TServerPermissionsCapability.TVersatilePermission.ADAPTER.redact(allowAccessPreciseLocation) : null;
                    TServerPermissionsCapability.TGrantablePermission allowAccessCamera = value.getAllowAccessCamera();
                    return value.copy(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, allowAccessCamera != null ? TServerPermissionsCapability.TGrantablePermission.ADAPTER.redact(allowAccessCamera) : null, ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TServerPermissionsCapability.TPermission value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<TServerPermissionsCapability.TGrantablePermission> protoAdapter = TServerPermissionsCapability.TGrantablePermission.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getAllowAccessCamera());
                    ProtoAdapter<TServerPermissionsCapability.TVersatilePermission> protoAdapter2 = TServerPermissionsCapability.TVersatilePermission.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 10, (int) value.getAllowAccessPreciseLocation());
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getAllowScheduleExactAlarms());
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getAllowWriteCalendar());
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getAllowReadCalendar());
                    protoAdapter2.encodeWithTag(writer, 6, (int) value.getAllowInternetConnectionInfo());
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getAllowPostNotifications());
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAllowCallPhone());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAllowReadContacts());
                    protoAdapter2.encodeWithTag(writer, 1, (int) value.getAllowAccessLocation());
                }
            };
        }

        public /* synthetic */ TPermission(TVersatilePermission tVersatilePermission, TGrantablePermission tGrantablePermission, TGrantablePermission tGrantablePermission2, TGrantablePermission tGrantablePermission3, TVersatilePermission tVersatilePermission2, TGrantablePermission tGrantablePermission4, TGrantablePermission tGrantablePermission5, TGrantablePermission tGrantablePermission6, TVersatilePermission tVersatilePermission3, TGrantablePermission tGrantablePermission7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tVersatilePermission, (i & 2) != 0 ? null : tGrantablePermission, (i & 4) != 0 ? null : tGrantablePermission2, (i & 8) != 0 ? null : tGrantablePermission3, (i & 16) != 0 ? null : tVersatilePermission2, (i & 32) != 0 ? null : tGrantablePermission4, (i & 64) != 0 ? null : tGrantablePermission5, (i & 128) != 0 ? null : tGrantablePermission6, (i & 256) != 0 ? null : tVersatilePermission3, (i & 512) != 0 ? null : tGrantablePermission7, (i & 1024) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TPermission copy$default(TPermission tPermission, TVersatilePermission tVersatilePermission, TGrantablePermission tGrantablePermission, TGrantablePermission tGrantablePermission2, TGrantablePermission tGrantablePermission3, TVersatilePermission tVersatilePermission2, TGrantablePermission tGrantablePermission4, TGrantablePermission tGrantablePermission5, TGrantablePermission tGrantablePermission6, TVersatilePermission tVersatilePermission3, TGrantablePermission tGrantablePermission7, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                tVersatilePermission = tPermission.allowAccessLocation;
            }
            if ((i & 2) != 0) {
                tGrantablePermission = tPermission.allowReadContacts;
            }
            if ((i & 4) != 0) {
                tGrantablePermission2 = tPermission.allowCallPhone;
            }
            if ((i & 8) != 0) {
                tGrantablePermission3 = tPermission.allowPostNotifications;
            }
            if ((i & 16) != 0) {
                tVersatilePermission2 = tPermission.allowInternetConnectionInfo;
            }
            if ((i & 32) != 0) {
                tGrantablePermission4 = tPermission.allowReadCalendar;
            }
            if ((i & 64) != 0) {
                tGrantablePermission5 = tPermission.allowWriteCalendar;
            }
            if ((i & 128) != 0) {
                tGrantablePermission6 = tPermission.allowScheduleExactAlarms;
            }
            if ((i & 256) != 0) {
                tVersatilePermission3 = tPermission.allowAccessPreciseLocation;
            }
            if ((i & 512) != 0) {
                tGrantablePermission7 = tPermission.allowAccessCamera;
            }
            if ((i & 1024) != 0) {
                byteString = tPermission.unknownFields();
            }
            TGrantablePermission tGrantablePermission8 = tGrantablePermission7;
            ByteString byteString2 = byteString;
            TGrantablePermission tGrantablePermission9 = tGrantablePermission6;
            TVersatilePermission tVersatilePermission4 = tVersatilePermission3;
            TGrantablePermission tGrantablePermission10 = tGrantablePermission4;
            TGrantablePermission tGrantablePermission11 = tGrantablePermission5;
            TVersatilePermission tVersatilePermission5 = tVersatilePermission2;
            TGrantablePermission tGrantablePermission12 = tGrantablePermission2;
            return tPermission.copy(tVersatilePermission, tGrantablePermission, tGrantablePermission12, tGrantablePermission3, tVersatilePermission5, tGrantablePermission10, tGrantablePermission11, tGrantablePermission9, tVersatilePermission4, tGrantablePermission8, byteString2);
        }

        @ColumnNameOption("allow_access_camera")
        public static /* synthetic */ void getAllowAccessCamera$annotations() {
        }

        @ColumnNameOption("allow_access_location")
        public static /* synthetic */ void getAllowAccessLocation$annotations() {
        }

        @ColumnNameOption("allow_access_precise_location")
        public static /* synthetic */ void getAllowAccessPreciseLocation$annotations() {
        }

        @ColumnNameOption("allow_call_phone")
        public static /* synthetic */ void getAllowCallPhone$annotations() {
        }

        @ColumnNameOption("allow_internet_connection_info")
        public static /* synthetic */ void getAllowInternetConnectionInfo$annotations() {
        }

        @ColumnNameOption("allow_post_notifications")
        public static /* synthetic */ void getAllowPostNotifications$annotations() {
        }

        @ColumnNameOption("allow_read_calendar")
        public static /* synthetic */ void getAllowReadCalendar$annotations() {
        }

        @ColumnNameOption("allow_read_contacts")
        public static /* synthetic */ void getAllowReadContacts$annotations() {
        }

        @ColumnNameOption("allow_schedule_exact_alarms")
        public static /* synthetic */ void getAllowScheduleExactAlarms$annotations() {
        }

        @ColumnNameOption("allow_write_calendar")
        public static /* synthetic */ void getAllowWriteCalendar$annotations() {
        }

        public final TPermission copy(TVersatilePermission allowAccessLocation, TGrantablePermission allowReadContacts, TGrantablePermission allowCallPhone, TGrantablePermission allowPostNotifications, TVersatilePermission allowInternetConnectionInfo, TGrantablePermission allowReadCalendar, TGrantablePermission allowWriteCalendar, TGrantablePermission allowScheduleExactAlarms, TVersatilePermission allowAccessPreciseLocation, TGrantablePermission allowAccessCamera, ByteString unknownFields) {
            return new TPermission(allowAccessLocation, allowReadContacts, allowCallPhone, allowPostNotifications, allowInternetConnectionInfo, allowReadCalendar, allowWriteCalendar, allowScheduleExactAlarms, allowAccessPreciseLocation, allowAccessCamera, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TPermission)) {
                return false;
            }
            TPermission tPermission = (TPermission) other;
            return jl40.l(unknownFields(), tPermission.unknownFields()) && jl40.l(this.allowAccessLocation, tPermission.allowAccessLocation) && jl40.l(this.allowReadContacts, tPermission.allowReadContacts) && jl40.l(this.allowCallPhone, tPermission.allowCallPhone) && jl40.l(this.allowPostNotifications, tPermission.allowPostNotifications) && jl40.l(this.allowInternetConnectionInfo, tPermission.allowInternetConnectionInfo) && jl40.l(this.allowReadCalendar, tPermission.allowReadCalendar) && jl40.l(this.allowWriteCalendar, tPermission.allowWriteCalendar) && jl40.l(this.allowScheduleExactAlarms, tPermission.allowScheduleExactAlarms) && jl40.l(this.allowAccessPreciseLocation, tPermission.allowAccessPreciseLocation) && jl40.l(this.allowAccessCamera, tPermission.allowAccessCamera);
        }

        public final TGrantablePermission getAllowAccessCamera() {
            return this.allowAccessCamera;
        }

        public final TVersatilePermission getAllowAccessLocation() {
            return this.allowAccessLocation;
        }

        public final TVersatilePermission getAllowAccessPreciseLocation() {
            return this.allowAccessPreciseLocation;
        }

        public final TGrantablePermission getAllowCallPhone() {
            return this.allowCallPhone;
        }

        public final TVersatilePermission getAllowInternetConnectionInfo() {
            return this.allowInternetConnectionInfo;
        }

        public final TGrantablePermission getAllowPostNotifications() {
            return this.allowPostNotifications;
        }

        public final TGrantablePermission getAllowReadCalendar() {
            return this.allowReadCalendar;
        }

        public final TGrantablePermission getAllowReadContacts() {
            return this.allowReadContacts;
        }

        public final TGrantablePermission getAllowScheduleExactAlarms() {
            return this.allowScheduleExactAlarms;
        }

        public final TGrantablePermission getAllowWriteCalendar() {
            return this.allowWriteCalendar;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TVersatilePermission tVersatilePermission = this.allowAccessLocation;
            int hashCode2 = (hashCode + (tVersatilePermission != null ? tVersatilePermission.hashCode() : 0)) * 37;
            TGrantablePermission tGrantablePermission = this.allowReadContacts;
            int hashCode3 = (hashCode2 + (tGrantablePermission != null ? tGrantablePermission.hashCode() : 0)) * 37;
            TGrantablePermission tGrantablePermission2 = this.allowCallPhone;
            int hashCode4 = (hashCode3 + (tGrantablePermission2 != null ? tGrantablePermission2.hashCode() : 0)) * 37;
            TGrantablePermission tGrantablePermission3 = this.allowPostNotifications;
            int hashCode5 = (hashCode4 + (tGrantablePermission3 != null ? tGrantablePermission3.hashCode() : 0)) * 37;
            TVersatilePermission tVersatilePermission2 = this.allowInternetConnectionInfo;
            int hashCode6 = (hashCode5 + (tVersatilePermission2 != null ? tVersatilePermission2.hashCode() : 0)) * 37;
            TGrantablePermission tGrantablePermission4 = this.allowReadCalendar;
            int hashCode7 = (hashCode6 + (tGrantablePermission4 != null ? tGrantablePermission4.hashCode() : 0)) * 37;
            TGrantablePermission tGrantablePermission5 = this.allowWriteCalendar;
            int hashCode8 = (hashCode7 + (tGrantablePermission5 != null ? tGrantablePermission5.hashCode() : 0)) * 37;
            TGrantablePermission tGrantablePermission6 = this.allowScheduleExactAlarms;
            int hashCode9 = (hashCode8 + (tGrantablePermission6 != null ? tGrantablePermission6.hashCode() : 0)) * 37;
            TVersatilePermission tVersatilePermission3 = this.allowAccessPreciseLocation;
            int hashCode10 = (hashCode9 + (tVersatilePermission3 != null ? tVersatilePermission3.hashCode() : 0)) * 37;
            TGrantablePermission tGrantablePermission7 = this.allowAccessCamera;
            int hashCode11 = hashCode10 + (tGrantablePermission7 != null ? tGrantablePermission7.hashCode() : 0);
            this.hashCode = hashCode11;
            return hashCode11;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m562newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            TVersatilePermission tVersatilePermission = this.allowAccessLocation;
            if (tVersatilePermission != null) {
                arrayList.add("allowAccessLocation=" + tVersatilePermission);
            }
            TGrantablePermission tGrantablePermission = this.allowReadContacts;
            if (tGrantablePermission != null) {
                arrayList.add("allowReadContacts=" + tGrantablePermission);
            }
            TGrantablePermission tGrantablePermission2 = this.allowCallPhone;
            if (tGrantablePermission2 != null) {
                arrayList.add("allowCallPhone=" + tGrantablePermission2);
            }
            TGrantablePermission tGrantablePermission3 = this.allowPostNotifications;
            if (tGrantablePermission3 != null) {
                arrayList.add("allowPostNotifications=" + tGrantablePermission3);
            }
            TVersatilePermission tVersatilePermission2 = this.allowInternetConnectionInfo;
            if (tVersatilePermission2 != null) {
                arrayList.add("allowInternetConnectionInfo=" + tVersatilePermission2);
            }
            TGrantablePermission tGrantablePermission4 = this.allowReadCalendar;
            if (tGrantablePermission4 != null) {
                arrayList.add("allowReadCalendar=" + tGrantablePermission4);
            }
            TGrantablePermission tGrantablePermission5 = this.allowWriteCalendar;
            if (tGrantablePermission5 != null) {
                arrayList.add("allowWriteCalendar=" + tGrantablePermission5);
            }
            TGrantablePermission tGrantablePermission6 = this.allowScheduleExactAlarms;
            if (tGrantablePermission6 != null) {
                arrayList.add("allowScheduleExactAlarms=" + tGrantablePermission6);
            }
            TVersatilePermission tVersatilePermission3 = this.allowAccessPreciseLocation;
            if (tVersatilePermission3 != null) {
                arrayList.add("allowAccessPreciseLocation=" + tVersatilePermission3);
            }
            TGrantablePermission tGrantablePermission7 = this.allowAccessCamera;
            if (tGrantablePermission7 != null) {
                arrayList.add("allowAccessCamera=" + tGrantablePermission7);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TPermission{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m562newBuilder();
        }

        public TPermission() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public TPermission(TVersatilePermission tVersatilePermission, TGrantablePermission tGrantablePermission, TGrantablePermission tGrantablePermission2, TGrantablePermission tGrantablePermission3, TVersatilePermission tVersatilePermission2, TGrantablePermission tGrantablePermission4, TGrantablePermission tGrantablePermission5, TGrantablePermission tGrantablePermission6, TVersatilePermission tVersatilePermission3, TGrantablePermission tGrantablePermission7, ByteString byteString) {
            super(ADAPTER, byteString);
            this.allowAccessLocation = tVersatilePermission;
            this.allowReadContacts = tGrantablePermission;
            this.allowCallPhone = tGrantablePermission2;
            this.allowPostNotifications = tGrantablePermission3;
            this.allowInternetConnectionInfo = tVersatilePermission2;
            this.allowReadCalendar = tGrantablePermission4;
            this.allowWriteCalendar = tGrantablePermission5;
            this.allowScheduleExactAlarms = tGrantablePermission6;
            this.allowAccessPreciseLocation = tVersatilePermission3;
            this.allowAccessCamera = tGrantablePermission7;
            if (Internal.countNonNull(tVersatilePermission, tGrantablePermission, tGrantablePermission2, tGrantablePermission3, tVersatilePermission2, tGrantablePermission4, tGrantablePermission5, tGrantablePermission6, tVersatilePermission3, tGrantablePermission7) <= 1) {
                return;
            }
            ny61.g("At most one of allowAccessLocation, allowReadContacts, allowCallPhone, allowPostNotifications, allowInternetConnectionInfo, allowReadCalendar, allowWriteCalendar, allowScheduleExactAlarms, allowAccessPreciseLocation, allowAccessCamera may be non-null");
            throw null;
        }
    }

    @EventTypeOption(TCapability.EEventType.PermissionRequestFailureEventType)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermissionRequestFailureEvent;", "Lcom/squareup/wire/Message;", "", "permission", "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;Lokio/ByteString;)V", "getPermission$annotations", "()V", "getPermission", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TPermissionRequestFailureEvent extends Message {
        public static final ProtoAdapter<TPermissionRequestFailureEvent> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TPermission#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final TPermission permission;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TPermissionRequestFailureEvent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TPermissionRequestFailureEvent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TPermissionRequestFailureEvent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TPermissionRequestFailureEvent decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    TServerPermissionsCapability.TPermission tPermission = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TServerPermissionsCapability.TPermissionRequestFailureEvent(tPermission, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            tPermission = TServerPermissionsCapability.TPermission.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TServerPermissionsCapability.TPermissionRequestFailureEvent value) {
                    if (value.getPermission() != null) {
                        TServerPermissionsCapability.TPermission.ADAPTER.encodeWithTag(writer, 1, (int) value.getPermission());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TServerPermissionsCapability.TPermissionRequestFailureEvent value) {
                    int h = value.unknownFields().h();
                    return value.getPermission() != null ? TServerPermissionsCapability.TPermission.ADAPTER.encodedSizeWithTag(1, value.getPermission()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TPermissionRequestFailureEvent redact(TServerPermissionsCapability.TPermissionRequestFailureEvent value) {
                    TServerPermissionsCapability.TPermission permission = value.getPermission();
                    return value.copy(permission != null ? TServerPermissionsCapability.TPermission.ADAPTER.redact(permission) : null, ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TServerPermissionsCapability.TPermissionRequestFailureEvent value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getPermission() != null) {
                        TServerPermissionsCapability.TPermission.ADAPTER.encodeWithTag(writer, 1, (int) value.getPermission());
                    }
                }
            };
        }

        public /* synthetic */ TPermissionRequestFailureEvent(TPermission tPermission, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tPermission, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TPermissionRequestFailureEvent copy$default(TPermissionRequestFailureEvent tPermissionRequestFailureEvent, TPermission tPermission, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                tPermission = tPermissionRequestFailureEvent.permission;
            }
            if ((i & 2) != 0) {
                byteString = tPermissionRequestFailureEvent.unknownFields();
            }
            return tPermissionRequestFailureEvent.copy(tPermission, byteString);
        }

        @ColumnNameOption("permission")
        public static /* synthetic */ void getPermission$annotations() {
        }

        public final TPermissionRequestFailureEvent copy(TPermission permission, ByteString unknownFields) {
            return new TPermissionRequestFailureEvent(permission, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TPermissionRequestFailureEvent)) {
                return false;
            }
            TPermissionRequestFailureEvent tPermissionRequestFailureEvent = (TPermissionRequestFailureEvent) other;
            return jl40.l(unknownFields(), tPermissionRequestFailureEvent.unknownFields()) && jl40.l(this.permission, tPermissionRequestFailureEvent.permission);
        }

        public final TPermission getPermission() {
            return this.permission;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TPermission tPermission = this.permission;
            int hashCode2 = hashCode + (tPermission != null ? tPermission.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m563newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            TPermission tPermission = this.permission;
            if (tPermission != null) {
                arrayList.add("permission=" + tPermission);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TPermissionRequestFailureEvent{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m563newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TPermissionRequestFailureEvent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TPermissionRequestFailureEvent(TPermission tPermission, ByteString byteString) {
            super(ADAPTER, byteString);
            this.permission = tPermission;
        }
    }

    @EventTypeOption(TCapability.EEventType.PermissionRequestSuccessEventType)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermissionRequestSuccessEvent;", "Lcom/squareup/wire/Message;", "", "permission", "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;Lokio/ByteString;)V", "getPermission$annotations", "()V", "getPermission", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TPermissionRequestSuccessEvent extends Message {
        public static final ProtoAdapter<TPermissionRequestSuccessEvent> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TPermission#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final TPermission permission;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TPermissionRequestSuccessEvent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TPermissionRequestSuccessEvent>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TPermissionRequestSuccessEvent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TPermissionRequestSuccessEvent decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    TServerPermissionsCapability.TPermission tPermission = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TServerPermissionsCapability.TPermissionRequestSuccessEvent(tPermission, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            tPermission = TServerPermissionsCapability.TPermission.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TServerPermissionsCapability.TPermissionRequestSuccessEvent value) {
                    if (value.getPermission() != null) {
                        TServerPermissionsCapability.TPermission.ADAPTER.encodeWithTag(writer, 1, (int) value.getPermission());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TServerPermissionsCapability.TPermissionRequestSuccessEvent value) {
                    int h = value.unknownFields().h();
                    return value.getPermission() != null ? TServerPermissionsCapability.TPermission.ADAPTER.encodedSizeWithTag(1, value.getPermission()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TPermissionRequestSuccessEvent redact(TServerPermissionsCapability.TPermissionRequestSuccessEvent value) {
                    TServerPermissionsCapability.TPermission permission = value.getPermission();
                    return value.copy(permission != null ? TServerPermissionsCapability.TPermission.ADAPTER.redact(permission) : null, ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TServerPermissionsCapability.TPermissionRequestSuccessEvent value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getPermission() != null) {
                        TServerPermissionsCapability.TPermission.ADAPTER.encodeWithTag(writer, 1, (int) value.getPermission());
                    }
                }
            };
        }

        public /* synthetic */ TPermissionRequestSuccessEvent(TPermission tPermission, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tPermission, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TPermissionRequestSuccessEvent copy$default(TPermissionRequestSuccessEvent tPermissionRequestSuccessEvent, TPermission tPermission, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                tPermission = tPermissionRequestSuccessEvent.permission;
            }
            if ((i & 2) != 0) {
                byteString = tPermissionRequestSuccessEvent.unknownFields();
            }
            return tPermissionRequestSuccessEvent.copy(tPermission, byteString);
        }

        @ColumnNameOption("permission")
        public static /* synthetic */ void getPermission$annotations() {
        }

        public final TPermissionRequestSuccessEvent copy(TPermission permission, ByteString unknownFields) {
            return new TPermissionRequestSuccessEvent(permission, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TPermissionRequestSuccessEvent)) {
                return false;
            }
            TPermissionRequestSuccessEvent tPermissionRequestSuccessEvent = (TPermissionRequestSuccessEvent) other;
            return jl40.l(unknownFields(), tPermissionRequestSuccessEvent.unknownFields()) && jl40.l(this.permission, tPermissionRequestSuccessEvent.permission);
        }

        public final TPermission getPermission() {
            return this.permission;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TPermission tPermission = this.permission;
            int hashCode2 = hashCode + (tPermission != null ? tPermission.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m564newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            TPermission tPermission = this.permission;
            if (tPermission != null) {
                arrayList.add("permission=" + tPermission);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TPermissionRequestSuccessEvent{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m564newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TPermissionRequestSuccessEvent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TPermissionRequestSuccessEvent(TPermission tPermission, ByteString byteString) {
            super(ADAPTER, byteString);
            this.permission = tPermission;
        }
    }

    @DirectiveTypeOption(TCapability.EDirectiveType.RequestPermissionDirectiveType)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TRequestPermissionDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "permission", "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;", "ignoreThrottle", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;ZLokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getPermission$annotations", "getPermission", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;", "getIgnoreThrottle$annotations", "getIgnoreThrottle", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SpeechKitNameOption("request_permission_directive")
    public static final class TRequestPermissionDirective extends Message {
        public static final ProtoAdapter<TRequestPermissionDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "ignore_throttle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final boolean ignoreThrottle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TPermission#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final TPermission permission;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TRequestPermissionDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TRequestPermissionDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TRequestPermissionDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TRequestPermissionDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    TServerPermissionsCapability.TPermission tPermission = null;
                    boolean z = false;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TServerPermissionsCapability.TRequestPermissionDirective(str, tPermission, z, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            tPermission = TServerPermissionsCapability.TPermission.ADAPTER.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TServerPermissionsCapability.TRequestPermissionDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (value.getPermission() != null) {
                        TServerPermissionsCapability.TPermission.ADAPTER.encodeWithTag(writer, 2, (int) value.getPermission());
                    }
                    if (value.getIgnoreThrottle()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIgnoreThrottle()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TServerPermissionsCapability.TRequestPermissionDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (value.getPermission() != null) {
                        h += TServerPermissionsCapability.TPermission.ADAPTER.encodedSizeWithTag(2, value.getPermission());
                    }
                    return value.getIgnoreThrottle() ? ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIgnoreThrottle())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TRequestPermissionDirective redact(TServerPermissionsCapability.TRequestPermissionDirective value) {
                    TServerPermissionsCapability.TPermission permission = value.getPermission();
                    return TServerPermissionsCapability.TRequestPermissionDirective.copy$default(value, null, permission != null ? TServerPermissionsCapability.TPermission.ADAPTER.redact(permission) : null, false, ByteString.c, 5, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TServerPermissionsCapability.TRequestPermissionDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getIgnoreThrottle()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIgnoreThrottle()));
                    }
                    if (value.getPermission() != null) {
                        TServerPermissionsCapability.TPermission.ADAPTER.encodeWithTag(writer, 2, (int) value.getPermission());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TRequestPermissionDirective(String str, TPermission tPermission, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : tPermission, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TRequestPermissionDirective copy$default(TRequestPermissionDirective tRequestPermissionDirective, String str, TPermission tPermission, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tRequestPermissionDirective.name;
            }
            if ((i & 2) != 0) {
                tPermission = tRequestPermissionDirective.permission;
            }
            if ((i & 4) != 0) {
                z = tRequestPermissionDirective.ignoreThrottle;
            }
            if ((i & 8) != 0) {
                byteString = tRequestPermissionDirective.unknownFields();
            }
            return tRequestPermissionDirective.copy(str, tPermission, z, byteString);
        }

        @ColumnNameOption("ignore_throttle")
        public static /* synthetic */ void getIgnoreThrottle$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("permission")
        public static /* synthetic */ void getPermission$annotations() {
        }

        public final TRequestPermissionDirective copy(String name, TPermission permission, boolean ignoreThrottle, ByteString unknownFields) {
            return new TRequestPermissionDirective(name, permission, ignoreThrottle, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TRequestPermissionDirective)) {
                return false;
            }
            TRequestPermissionDirective tRequestPermissionDirective = (TRequestPermissionDirective) other;
            return jl40.l(unknownFields(), tRequestPermissionDirective.unknownFields()) && jl40.l(this.name, tRequestPermissionDirective.name) && jl40.l(this.permission, tRequestPermissionDirective.permission) && this.ignoreThrottle == tRequestPermissionDirective.ignoreThrottle;
        }

        public final boolean getIgnoreThrottle() {
            return this.ignoreThrottle;
        }

        public final String getName() {
            return this.name;
        }

        public final TPermission getPermission() {
            return this.permission;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            TPermission tPermission = this.permission;
            int hashCode = Boolean.hashCode(this.ignoreThrottle) + ((b + (tPermission != null ? tPermission.hashCode() : 0)) * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m565newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            TPermission tPermission = this.permission;
            if (tPermission != null) {
                arrayList.add("permission=" + tPermission);
            }
            smw0.y("ignoreThrottle=", arrayList, this.ignoreThrottle);
            return a.X(arrayList, Extension.FIX_SPACE, "TRequestPermissionDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m565newBuilder();
        }

        public TRequestPermissionDirective() {
            this(null, null, false, null, 15, null);
        }

        public TRequestPermissionDirective(String str, TPermission tPermission, boolean z, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.permission = tPermission;
            this.ignoreThrottle = z;
        }
    }

    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TState;", "Lcom/squareup/wire/Message;", "", "permissions", "", "Lru/yandex/alice/protos/endpoint/capabilities/quark/core/common/internal/TServerPermissionsCapability$TPermission;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getPermissions$annotations", "()V", "getPermissions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TPermission#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<TPermission> permissions;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.core.common.internal.TServerPermissionsCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TState decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TServerPermissionsCapability.TState(arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            arrayList.add(TServerPermissionsCapability.TPermission.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TServerPermissionsCapability.TState value) {
                    TServerPermissionsCapability.TPermission.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getPermissions());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TServerPermissionsCapability.TState value) {
                    return TServerPermissionsCapability.TPermission.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getPermissions()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TServerPermissionsCapability.TState redact(TServerPermissionsCapability.TState value) {
                    return value.copy(Internal.m133redactElements(value.getPermissions(), TServerPermissionsCapability.TPermission.ADAPTER), ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TServerPermissionsCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                    TServerPermissionsCapability.TPermission.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getPermissions());
                }
            };
        }

        public /* synthetic */ TState(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TState copy$default(TState tState, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tState.permissions;
            }
            if ((i & 2) != 0) {
                byteString = tState.unknownFields();
            }
            return tState.copy(list, byteString);
        }

        @ColumnNameOption("permissions")
        public static /* synthetic */ void getPermissions$annotations() {
        }

        public final TState copy(List<TPermission> permissions, ByteString unknownFields) {
            return new TState(permissions, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TState)) {
                return false;
            }
            TState tState = (TState) other;
            return jl40.l(unknownFields(), tState.unknownFields()) && jl40.l(this.permissions, tState.permissions);
        }

        public final List<TPermission> getPermissions() {
            return this.permissions;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.permissions.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m566newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.permissions.isEmpty()) {
                smw0.x("permissions=", arrayList, this.permissions);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TState{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m566newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TState(List<TPermission> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.permissions = Internal.immutableCopyOf("permissions", list);
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m559newBuilder();
    }

    public TServerPermissionsCapability() {
        this(null, null, null, null, 15, null);
    }

    public TServerPermissionsCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
