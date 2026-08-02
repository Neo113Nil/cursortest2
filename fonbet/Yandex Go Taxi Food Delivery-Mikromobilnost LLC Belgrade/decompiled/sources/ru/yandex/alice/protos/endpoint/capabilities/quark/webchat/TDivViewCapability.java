package ru.yandex.alice.protos.endpoint.capabilities.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
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
import ru.yandex.alice.protos.div.quark.webchat.TDiv2Id;
import ru.yandex.alice.protos.div.quark.webchat.TDivExternalVariable;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.DirectiveTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;
import ru.yandex.alice.protos.extensions.quark.webchat.SpeechKitNameOption;
import ru.yandex.common.clid.ClidProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006!\"#$%&B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TParameters", "TState", "TStashViewDirective", "TUnstashViewDirective", "TSetDivVariablesDirective", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@CapabilityTypeOption(TCapability.ECapabilityType.DivViewCapabilityType)
/* loaded from: classes4.dex */
public final class TDivViewCapability extends Message {
    public static final ProtoAdapter<TDivViewCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()*BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016JN\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u001c¨\u0006+"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "supportsStringDiv2Card", "", "supportsCardStashing", "uIFamily", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EUIFamily;", "divKitFeatures", "", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EDivKitFeature;", "availableExternalSources", "Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable$ESourceType;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZLru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EUIFamily;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getSupportsStringDiv2Card$annotations", "()V", "getSupportsStringDiv2Card", "()Z", "getSupportsCardStashing$annotations", "getSupportsCardStashing", "getUIFamily$annotations", "getUIFamily", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EUIFamily;", "getDivKitFeatures$annotations", "getDivKitFeatures", "()Ljava/util/List;", "getAvailableExternalSources$annotations", "getAvailableExternalSources", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EUIFamily", "EDivKitFeature", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TDivExternalVariable$ESourceType#ADAPTER", jsonName = "available_external_sources", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
        private final List<TDivExternalVariable.ESourceType> availableExternalSources;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TParameters$EDivKitFeature#ADAPTER", jsonName = "div_kit_features", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        private final List<EDivKitFeature> divKitFeatures;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supports_card_stashing", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final boolean supportsCardStashing;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supports_string_div2_card", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final boolean supportsStringDiv2Card;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TParameters$EUIFamily#ADAPTER", jsonName = "ui_family", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final EUIFamily uIFamily;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TParameters decode(ProtoReader reader) {
                    TDivViewCapability.TParameters.EUIFamily eUIFamily = TDivViewCapability.TParameters.EUIFamily.Unknown;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    boolean z = false;
                    boolean z2 = false;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDivViewCapability.TParameters(z, z2, eUIFamily, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag == 2) {
                            z2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag == 3) {
                            try {
                                eUIFamily = TDivViewCapability.TParameters.EUIFamily.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 4) {
                            try {
                                TDivViewCapability.TParameters.EDivKitFeature.ADAPTER.tryDecode(reader, arrayList);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                TDivExternalVariable.ESourceType.ADAPTER.tryDecode(reader, arrayList2);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDivViewCapability.TParameters value) {
                    if (value.getSupportsStringDiv2Card()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getSupportsStringDiv2Card()));
                    }
                    if (value.getSupportsCardStashing()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getSupportsCardStashing()));
                    }
                    if (value.getUIFamily() != TDivViewCapability.TParameters.EUIFamily.Unknown) {
                        TDivViewCapability.TParameters.EUIFamily.ADAPTER.encodeWithTag(writer, 3, (int) value.getUIFamily());
                    }
                    TDivViewCapability.TParameters.EDivKitFeature.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getDivKitFeatures());
                    TDivExternalVariable.ESourceType.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getAvailableExternalSources());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDivViewCapability.TParameters value) {
                    int h = value.unknownFields().h();
                    if (value.getSupportsStringDiv2Card()) {
                        h += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getSupportsStringDiv2Card()));
                    }
                    if (value.getSupportsCardStashing()) {
                        h += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getSupportsCardStashing()));
                    }
                    if (value.getUIFamily() != TDivViewCapability.TParameters.EUIFamily.Unknown) {
                        h += TDivViewCapability.TParameters.EUIFamily.ADAPTER.encodedSizeWithTag(3, value.getUIFamily());
                    }
                    return TDivExternalVariable.ESourceType.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getAvailableExternalSources()) + TDivViewCapability.TParameters.EDivKitFeature.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getDivKitFeatures()) + h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TParameters redact(TDivViewCapability.TParameters value) {
                    return TDivViewCapability.TParameters.copy$default(value, false, false, null, null, null, ByteString.c, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDivViewCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                    TDivExternalVariable.ESourceType.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getAvailableExternalSources());
                    TDivViewCapability.TParameters.EDivKitFeature.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getDivKitFeatures());
                    if (value.getUIFamily() != TDivViewCapability.TParameters.EUIFamily.Unknown) {
                        TDivViewCapability.TParameters.EUIFamily.ADAPTER.encodeWithTag(writer, 3, (int) value.getUIFamily());
                    }
                    if (value.getSupportsCardStashing()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getSupportsCardStashing()));
                    }
                    if (value.getSupportsStringDiv2Card()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getSupportsStringDiv2Card()));
                    }
                }
            };
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TParameters(boolean z, boolean z2, EUIFamily eUIFamily, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, eUIFamily, r9 != 0 ? r0 : list, (i & 16) != 0 ? r0 : list2, (i & 32) != 0 ? ByteString.c : byteString);
            z = (i & 1) != 0 ? false : z;
            z2 = (i & 2) != 0 ? false : z2;
            eUIFamily = (i & 4) != 0 ? EUIFamily.Unknown : eUIFamily;
            int i2 = i & 8;
            EmptyList emptyList = EmptyList.a;
        }

        public static /* synthetic */ TParameters copy$default(TParameters tParameters, boolean z, boolean z2, EUIFamily eUIFamily, List list, List list2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tParameters.supportsStringDiv2Card;
            }
            if ((i & 2) != 0) {
                z2 = tParameters.supportsCardStashing;
            }
            if ((i & 4) != 0) {
                eUIFamily = tParameters.uIFamily;
            }
            if ((i & 8) != 0) {
                list = tParameters.divKitFeatures;
            }
            if ((i & 16) != 0) {
                list2 = tParameters.availableExternalSources;
            }
            if ((i & 32) != 0) {
                byteString = tParameters.unknownFields();
            }
            List list3 = list2;
            ByteString byteString2 = byteString;
            return tParameters.copy(z, z2, eUIFamily, list, list3, byteString2);
        }

        @ColumnNameOption("available_external_sources")
        public static /* synthetic */ void getAvailableExternalSources$annotations() {
        }

        @ColumnNameOption("div_kit_features")
        public static /* synthetic */ void getDivKitFeatures$annotations() {
        }

        @jxi
        @ColumnNameOption("supports_card_stashing")
        public static /* synthetic */ void getSupportsCardStashing$annotations() {
        }

        @ColumnNameOption("supports_string_div2_card")
        public static /* synthetic */ void getSupportsStringDiv2Card$annotations() {
        }

        @ColumnNameOption("ui_family")
        public static /* synthetic */ void getUIFamily$annotations() {
        }

        public final TParameters copy(boolean supportsStringDiv2Card, boolean supportsCardStashing, EUIFamily uIFamily, List<? extends EDivKitFeature> divKitFeatures, List<? extends TDivExternalVariable.ESourceType> availableExternalSources, ByteString unknownFields) {
            return new TParameters(supportsStringDiv2Card, supportsCardStashing, uIFamily, divKitFeatures, availableExternalSources, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TParameters)) {
                return false;
            }
            TParameters tParameters = (TParameters) other;
            return jl40.l(unknownFields(), tParameters.unknownFields()) && this.supportsStringDiv2Card == tParameters.supportsStringDiv2Card && this.supportsCardStashing == tParameters.supportsCardStashing && this.uIFamily == tParameters.uIFamily && jl40.l(this.divKitFeatures, tParameters.divKitFeatures) && jl40.l(this.availableExternalSources, tParameters.availableExternalSources);
        }

        public final List<TDivExternalVariable.ESourceType> getAvailableExternalSources() {
            return this.availableExternalSources;
        }

        public final List<EDivKitFeature> getDivKitFeatures() {
            return this.divKitFeatures;
        }

        public final boolean getSupportsCardStashing() {
            return this.supportsCardStashing;
        }

        public final boolean getSupportsStringDiv2Card() {
            return this.supportsStringDiv2Card;
        }

        public final EUIFamily getUIFamily() {
            return this.uIFamily;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.availableExternalSources.hashCode() + unr0.c((this.uIFamily.hashCode() + unr0.e(unr0.e(unknownFields().hashCode() * 37, 37, this.supportsStringDiv2Card), 37, this.supportsCardStashing)) * 37, 37, this.divKitFeatures);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m659newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            smw0.y("supportsStringDiv2Card=", arrayList, this.supportsStringDiv2Card);
            smw0.y("supportsCardStashing=", arrayList, this.supportsCardStashing);
            arrayList.add("uIFamily=" + this.uIFamily);
            if (!this.divKitFeatures.isEmpty()) {
                smw0.x("divKitFeatures=", arrayList, this.divKitFeatures);
            }
            if (!this.availableExternalSources.isEmpty()) {
                smw0.x("availableExternalSources=", arrayList, this.availableExternalSources);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TParameters{", "}", null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EDivKitFeature;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TextCenteringDivKit39Fix", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class EDivKitFeature implements WireEnum {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ EDivKitFeature[] $VALUES;
            public static final ProtoAdapter<EDivKitFeature> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final EDivKitFeature TextCenteringDivKit39Fix;
            private final int value;

            private static final /* synthetic */ EDivKitFeature[] $values() {
                return new EDivKitFeature[]{TextCenteringDivKit39Fix};
            }

            static {
                final EDivKitFeature eDivKitFeature = new EDivKitFeature("TextCenteringDivKit39Fix", 0, 0);
                TextCenteringDivKit39Fix = eDivKitFeature;
                EDivKitFeature[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
                INSTANCE = new Companion(null);
                final g0c a = qoi0.a(EDivKitFeature.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<EDivKitFeature>(a, syntax, eDivKitFeature) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TParameters$EDivKitFeature$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public TDivViewCapability.TParameters.EDivKitFeature fromValue(int value) {
                        return TDivViewCapability.TParameters.EDivKitFeature.INSTANCE.fromValue(value);
                    }
                };
            }

            private EDivKitFeature(String str, int i, int i2) {
                this.value = i2;
            }

            public static final EDivKitFeature fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static EDivKitFeature valueOf(String str) {
                return (EDivKitFeature) Enum.valueOf(EDivKitFeature.class, str);
            }

            public static EDivKitFeature[] values() {
                return (EDivKitFeature[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EDivKitFeature$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EDivKitFeature;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final EDivKitFeature fromValue(int value) {
                    if (value == 0) {
                        return EDivKitFeature.TextCenteringDivKit39Fix;
                    }
                    return null;
                }

                private Companion() {
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EUIFamily;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Unknown", "SmartScreen", "TV", "CloudUI", "SearchApp", "WebTouch", "WebDesktop", "YabroDesktop", "WebStandaloneDesktop", "WebStandaloneTouch", "AliceApp", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class EUIFamily implements WireEnum {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ EUIFamily[] $VALUES;
            public static final ProtoAdapter<EUIFamily> ADAPTER;
            public static final EUIFamily AliceApp;
            public static final EUIFamily CloudUI;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final EUIFamily SearchApp;
            public static final EUIFamily SmartScreen;
            public static final EUIFamily TV;
            public static final EUIFamily Unknown;
            public static final EUIFamily WebDesktop;
            public static final EUIFamily WebStandaloneDesktop;
            public static final EUIFamily WebStandaloneTouch;
            public static final EUIFamily WebTouch;
            public static final EUIFamily YabroDesktop;
            private final int value;

            private static final /* synthetic */ EUIFamily[] $values() {
                return new EUIFamily[]{Unknown, SmartScreen, TV, CloudUI, SearchApp, WebTouch, WebDesktop, YabroDesktop, WebStandaloneDesktop, WebStandaloneTouch, AliceApp};
            }

            static {
                final EUIFamily eUIFamily = new EUIFamily("Unknown", 0, 0);
                Unknown = eUIFamily;
                SmartScreen = new EUIFamily("SmartScreen", 1, 1);
                TV = new EUIFamily("TV", 2, 2);
                CloudUI = new EUIFamily("CloudUI", 3, 3);
                SearchApp = new EUIFamily("SearchApp", 4, 4);
                WebTouch = new EUIFamily("WebTouch", 5, 5);
                WebDesktop = new EUIFamily("WebDesktop", 6, 6);
                YabroDesktop = new EUIFamily("YabroDesktop", 7, 7);
                WebStandaloneDesktop = new EUIFamily("WebStandaloneDesktop", 8, 8);
                WebStandaloneTouch = new EUIFamily("WebStandaloneTouch", 9, 9);
                AliceApp = new EUIFamily("AliceApp", 10, 10);
                EUIFamily[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
                INSTANCE = new Companion(null);
                final g0c a = qoi0.a(EUIFamily.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<EUIFamily>(a, syntax, eUIFamily) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TParameters$EUIFamily$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public TDivViewCapability.TParameters.EUIFamily fromValue(int value) {
                        return TDivViewCapability.TParameters.EUIFamily.INSTANCE.fromValue(value);
                    }
                };
            }

            private EUIFamily(String str, int i, int i2) {
                this.value = i2;
            }

            public static final EUIFamily fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static EUIFamily valueOf(String str) {
                return (EUIFamily) Enum.valueOf(EUIFamily.class, str);
            }

            public static EUIFamily[] values() {
                return (EUIFamily[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EUIFamily$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TParameters$EUIFamily;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final EUIFamily fromValue(int value) {
                    switch (value) {
                        case 0:
                            return EUIFamily.Unknown;
                        case 1:
                            return EUIFamily.SmartScreen;
                        case 2:
                            return EUIFamily.TV;
                        case 3:
                            return EUIFamily.CloudUI;
                        case 4:
                            return EUIFamily.SearchApp;
                        case 5:
                            return EUIFamily.WebTouch;
                        case 6:
                            return EUIFamily.WebDesktop;
                        case 7:
                            return EUIFamily.YabroDesktop;
                        case 8:
                            return EUIFamily.WebStandaloneDesktop;
                        case 9:
                            return EUIFamily.WebStandaloneTouch;
                        case 10:
                            return EUIFamily.AliceApp;
                        default:
                            return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m659newBuilder();
        }

        public TParameters() {
            this(false, false, null, null, null, null, 63, null);
        }

        public TParameters(boolean z, boolean z2, EUIFamily eUIFamily, List<? extends EDivKitFeature> list, List<? extends TDivExternalVariable.ESourceType> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.supportsStringDiv2Card = z;
            this.supportsCardStashing = z2;
            this.uIFamily = eUIFamily;
            this.divKitFeatures = Internal.immutableCopyOf("divKitFeatures", list);
            this.availableExternalSources = Internal.immutableCopyOf("availableExternalSources", list2);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TDivViewCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TDivViewCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TDivViewCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TDivViewCapability.TParameters tParameters = null;
                TDivViewCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TDivViewCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TDivViewCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TDivViewCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TDivViewCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TDivViewCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TDivViewCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TDivViewCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TDivViewCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TDivViewCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TDivViewCapability redact(TDivViewCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TDivViewCapability.TParameters parameters = value.getParameters();
                TDivViewCapability.TParameters redact2 = parameters != null ? TDivViewCapability.TParameters.ADAPTER.redact(parameters) : null;
                TDivViewCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TDivViewCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TDivViewCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TDivViewCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TDivViewCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TDivViewCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TDivViewCapability copy$default(TDivViewCapability tDivViewCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tDivViewCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tDivViewCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tDivViewCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tDivViewCapability.unknownFields();
        }
        return tDivViewCapability.copy(tMeta, tParameters, tState, byteString);
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

    public final TDivViewCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TDivViewCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TDivViewCapability)) {
            return false;
        }
        TDivViewCapability tDivViewCapability = (TDivViewCapability) other;
        return jl40.l(unknownFields(), tDivViewCapability.unknownFields()) && jl40.l(this.meta, tDivViewCapability.meta) && jl40.l(this.parameters, tDivViewCapability.parameters) && jl40.l(this.state, tDivViewCapability.state);
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
    public /* synthetic */ Void m658newBuilder() {
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
        return a.X(arrayList, Extension.FIX_SPACE, "TDivViewCapability{", "}", null, 56);
    }

    @SpeechKitNameOption("set_div_variables")
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "setVariable", "", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getSetVariable$annotations", "getSetVariable", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TSetVariable", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.SetDivVariablesDirectiveType)
    public static final class TSetDivVariablesDirective extends Message {
        public static final ProtoAdapter<TSetDivVariablesDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TSetDivVariablesDirective$TSetVariable#ADAPTER", jsonName = "set_variable", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        private final List<TSetVariable> setVariable;

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016JM\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010)R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0014\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001b\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 ¨\u0006,"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable;", "Lcom/squareup/wire/Message;", "", "boolValue", "", "stringValue", "", "longValue", "", "variableName", "variableType", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable$EVariableType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable$EVariableType;Lokio/ByteString;)V", "getBoolValue$annotations", "()V", "getBoolValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStringValue$annotations", "getStringValue", "()Ljava/lang/String;", "getLongValue$annotations", "getLongValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVariableName$annotations", "getVariableName", "getVariableType$annotations", "getVariableType", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable$EVariableType;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable$EVariableType;Lokio/ByteString;)Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable;", "Companion", "EVariableType", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TSetVariable extends Message {
            public static final ProtoAdapter<TSetVariable> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "bool_value", oneofName = "SetVariable", schemaIndex = 0, tag = 1)
            private final Boolean boolValue;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "long_value", oneofName = "SetVariable", schemaIndex = 2, tag = 3)
            private final Long longValue;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "string_value", oneofName = "SetVariable", schemaIndex = 1, tag = 2)
            private final String stringValue;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "variable_name", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
            private final String variableName;

            @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TSetDivVariablesDirective$TSetVariable$EVariableType#ADAPTER", jsonName = "variable_type", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
            private final EVariableType variableType;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TSetVariable.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TSetVariable>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TSetDivVariablesDirective$TSetVariable$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TDivViewCapability.TSetDivVariablesDirective.TSetVariable decode(ProtoReader reader) {
                        TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType eVariableType = TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType.Global;
                        long beginMessage = reader.beginMessage();
                        String str = null;
                        Long l = null;
                        String str2 = "";
                        Boolean bool = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TDivViewCapability.TSetDivVariablesDirective.TSetVariable(bool, str, l, str2, eVariableType, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                bool = ProtoAdapter.BOOL.decode(reader);
                            } else if (nextTag == 2) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 3) {
                                l = ProtoAdapter.INT64.decode(reader);
                            } else if (nextTag == 4) {
                                str2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 5) {
                                reader.readUnknownField(nextTag);
                            } else {
                                try {
                                    eVariableType = TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, TDivViewCapability.TSetDivVariablesDirective.TSetVariable value) {
                        if (!jl40.l(value.getVariableName(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getVariableName());
                        }
                        if (value.getVariableType() != TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType.Global) {
                            TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType.ADAPTER.encodeWithTag(writer, 5, (int) value.getVariableType());
                        }
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) value.getBoolValue());
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStringValue());
                        ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) value.getLongValue());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TDivViewCapability.TSetDivVariablesDirective.TSetVariable value) {
                        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, value.getBoolValue()) + value.unknownFields().h();
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        int encodedSizeWithTag2 = ProtoAdapter.INT64.encodedSizeWithTag(3, value.getLongValue()) + protoAdapter.encodedSizeWithTag(2, value.getStringValue()) + encodedSizeWithTag;
                        if (!jl40.l(value.getVariableName(), "")) {
                            encodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(4, value.getVariableName());
                        }
                        return value.getVariableType() != TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType.Global ? TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType.ADAPTER.encodedSizeWithTag(5, value.getVariableType()) + encodedSizeWithTag2 : encodedSizeWithTag2;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TDivViewCapability.TSetDivVariablesDirective.TSetVariable redact(TDivViewCapability.TSetDivVariablesDirective.TSetVariable value) {
                        return TDivViewCapability.TSetDivVariablesDirective.TSetVariable.copy$default(value, null, null, null, null, null, ByteString.c, 31, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TDivViewCapability.TSetDivVariablesDirective.TSetVariable value) {
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) value.getLongValue());
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getStringValue());
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) value.getBoolValue());
                        if (value.getVariableType() != TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType.Global) {
                            TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType.ADAPTER.encodeWithTag(writer, 5, (int) value.getVariableType());
                        }
                        if (jl40.l(value.getVariableName(), "")) {
                            return;
                        }
                        protoAdapter.encodeWithTag(writer, 4, (int) value.getVariableName());
                    }
                };
            }

            public /* synthetic */ TSetVariable(Boolean bool, String str, Long l, String str2, EVariableType eVariableType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? EVariableType.Global : eVariableType, (i & 32) != 0 ? ByteString.c : byteString);
            }

            public static /* synthetic */ TSetVariable copy$default(TSetVariable tSetVariable, Boolean bool, String str, Long l, String str2, EVariableType eVariableType, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = tSetVariable.boolValue;
                }
                if ((i & 2) != 0) {
                    str = tSetVariable.stringValue;
                }
                if ((i & 4) != 0) {
                    l = tSetVariable.longValue;
                }
                if ((i & 8) != 0) {
                    str2 = tSetVariable.variableName;
                }
                if ((i & 16) != 0) {
                    eVariableType = tSetVariable.variableType;
                }
                if ((i & 32) != 0) {
                    byteString = tSetVariable.unknownFields();
                }
                EVariableType eVariableType2 = eVariableType;
                ByteString byteString2 = byteString;
                return tSetVariable.copy(bool, str, l, str2, eVariableType2, byteString2);
            }

            @ColumnNameOption("bool_value")
            public static /* synthetic */ void getBoolValue$annotations() {
            }

            @ColumnNameOption("long_value")
            public static /* synthetic */ void getLongValue$annotations() {
            }

            @ColumnNameOption("string_value")
            public static /* synthetic */ void getStringValue$annotations() {
            }

            @ColumnNameOption("variable_name")
            public static /* synthetic */ void getVariableName$annotations() {
            }

            @ColumnNameOption("variable_type")
            public static /* synthetic */ void getVariableType$annotations() {
            }

            public final TSetVariable copy(Boolean boolValue, String stringValue, Long longValue, String variableName, EVariableType variableType, ByteString unknownFields) {
                return new TSetVariable(boolValue, stringValue, longValue, variableName, variableType, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TSetVariable)) {
                    return false;
                }
                TSetVariable tSetVariable = (TSetVariable) other;
                return jl40.l(unknownFields(), tSetVariable.unknownFields()) && jl40.l(this.boolValue, tSetVariable.boolValue) && jl40.l(this.stringValue, tSetVariable.stringValue) && jl40.l(this.longValue, tSetVariable.longValue) && jl40.l(this.variableName, tSetVariable.variableName) && this.variableType == tSetVariable.variableType;
            }

            public final Boolean getBoolValue() {
                return this.boolValue;
            }

            public final Long getLongValue() {
                return this.longValue;
            }

            public final String getStringValue() {
                return this.stringValue;
            }

            public final String getVariableName() {
                return this.variableName;
            }

            public final EVariableType getVariableType() {
                return this.variableType;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.boolValue;
                int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 37;
                String str = this.stringValue;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                Long l = this.longValue;
                int hashCode4 = this.variableType.hashCode() + unr0.b((hashCode3 + (l != null ? l.hashCode() : 0)) * 37, 37, this.variableName);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m661newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.boolValue;
                if (bool != null) {
                    arrayList.add("boolValue=" + bool);
                }
                String str = this.stringValue;
                if (str != null) {
                    unr0.B("stringValue=", Internal.sanitize(str), arrayList);
                }
                Long l = this.longValue;
                if (l != null) {
                    arrayList.add("longValue=" + l);
                }
                unr0.B("variableName=", Internal.sanitize(this.variableName), arrayList);
                arrayList.add("variableType=" + this.variableType);
                return a.X(arrayList, Extension.FIX_SPACE, "TSetVariable{", "}", null, 56);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable$EVariableType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Global", "Local", "Mixed", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class EVariableType implements WireEnum {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ EVariableType[] $VALUES;
                public static final ProtoAdapter<EVariableType> ADAPTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final EVariableType Global;
                public static final EVariableType Local;
                public static final EVariableType Mixed;
                private final int value;

                private static final /* synthetic */ EVariableType[] $values() {
                    return new EVariableType[]{Global, Local, Mixed};
                }

                static {
                    final EVariableType eVariableType = new EVariableType("Global", 0, 0);
                    Global = eVariableType;
                    Local = new EVariableType("Local", 1, 1);
                    Mixed = new EVariableType("Mixed", 2, 2);
                    EVariableType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = kotlin.enums.a.a($values);
                    INSTANCE = new Companion(null);
                    final g0c a = qoi0.a(EVariableType.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new EnumAdapter<EVariableType>(a, syntax, eVariableType) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TSetDivVariablesDirective$TSetVariable$EVariableType$Companion$ADAPTER$1
                        @Override // com.squareup.wire.EnumAdapter
                        public TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType fromValue(int value) {
                            return TDivViewCapability.TSetDivVariablesDirective.TSetVariable.EVariableType.INSTANCE.fromValue(value);
                        }
                    };
                }

                private EVariableType(String str, int i, int i2) {
                    this.value = i2;
                }

                public static final EVariableType fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static k4o getEntries() {
                    return $ENTRIES;
                }

                public static EVariableType valueOf(String str) {
                    return (EVariableType) Enum.valueOf(EVariableType.class, str);
                }

                public static EVariableType[] values() {
                    return (EVariableType[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable$EVariableType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TSetDivVariablesDirective$TSetVariable$EVariableType;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final EVariableType fromValue(int value) {
                        if (value == 0) {
                            return EVariableType.Global;
                        }
                        if (value == 1) {
                            return EVariableType.Local;
                        }
                        if (value != 2) {
                            return null;
                        }
                        return EVariableType.Mixed;
                    }

                    private Companion() {
                    }
                }
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m661newBuilder();
            }

            public TSetVariable() {
                this(null, null, null, null, null, null, 63, null);
            }

            public TSetVariable(Boolean bool, String str, Long l, String str2, EVariableType eVariableType, ByteString byteString) {
                super(ADAPTER, byteString);
                this.boolValue = bool;
                this.stringValue = str;
                this.longValue = l;
                this.variableName = str2;
                this.variableType = eVariableType;
                if (Internal.countNonNull(bool, str, l) <= 1) {
                    return;
                }
                ny61.g("At most one of boolValue, stringValue, longValue may be non-null");
                throw null;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TSetDivVariablesDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TSetDivVariablesDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TSetDivVariablesDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TSetDivVariablesDirective decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDivViewCapability.TSetDivVariablesDirective(str, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            arrayList.add(TDivViewCapability.TSetDivVariablesDirective.TSetVariable.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDivViewCapability.TSetDivVariablesDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    TDivViewCapability.TSetDivVariablesDirective.TSetVariable.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSetVariable());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDivViewCapability.TSetDivVariablesDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return TDivViewCapability.TSetDivVariablesDirective.TSetVariable.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSetVariable()) + h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TSetDivVariablesDirective redact(TDivViewCapability.TSetDivVariablesDirective value) {
                    return TDivViewCapability.TSetDivVariablesDirective.copy$default(value, null, Internal.m133redactElements(value.getSetVariable(), TDivViewCapability.TSetDivVariablesDirective.TSetVariable.ADAPTER), ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDivViewCapability.TSetDivVariablesDirective value) {
                    writer.writeBytes(value.unknownFields());
                    TDivViewCapability.TSetDivVariablesDirective.TSetVariable.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSetVariable());
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TSetDivVariablesDirective(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EmptyList.a : list, (i & 4) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TSetDivVariablesDirective copy$default(TSetDivVariablesDirective tSetDivVariablesDirective, String str, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tSetDivVariablesDirective.name;
            }
            if ((i & 2) != 0) {
                list = tSetDivVariablesDirective.setVariable;
            }
            if ((i & 4) != 0) {
                byteString = tSetDivVariablesDirective.unknownFields();
            }
            return tSetDivVariablesDirective.copy(str, list, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("set_variable")
        public static /* synthetic */ void getSetVariable$annotations() {
        }

        public final TSetDivVariablesDirective copy(String name, List<TSetVariable> setVariable, ByteString unknownFields) {
            return new TSetDivVariablesDirective(name, setVariable, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TSetDivVariablesDirective)) {
                return false;
            }
            TSetDivVariablesDirective tSetDivVariablesDirective = (TSetDivVariablesDirective) other;
            return jl40.l(unknownFields(), tSetDivVariablesDirective.unknownFields()) && jl40.l(this.name, tSetDivVariablesDirective.name) && jl40.l(this.setVariable, tSetDivVariablesDirective.setVariable);
        }

        public final String getName() {
            return this.name;
        }

        public final List<TSetVariable> getSetVariable() {
            return this.setVariable;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.setVariable.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m660newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            if (!this.setVariable.isEmpty()) {
                smw0.x("setVariable=", arrayList, this.setVariable);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TSetDivVariablesDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m660newBuilder();
        }

        public TSetDivVariablesDirective() {
            this(null, null, null, 7, null);
        }

        public TSetDivVariablesDirective(String str, List<TSetVariable> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.setVariable = Internal.immutableCopyOf("setVariable", list);
        }
    }

    @SpeechKitNameOption("stash_view")
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TStashViewDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "cardSearchCriteria", "Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getCardSearchCriteria$annotations", "getCardSearchCriteria", "()Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.StashViewDirectiveType)
    public static final class TStashViewDirective extends Message {
        public static final ProtoAdapter<TStashViewDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TDiv2Id#ADAPTER", jsonName = "card_search_criteria", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final TDiv2Id cardSearchCriteria;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TStashViewDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TStashViewDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TStashViewDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TStashViewDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    TDiv2Id tDiv2Id = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDivViewCapability.TStashViewDirective(str, tDiv2Id, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            tDiv2Id = TDiv2Id.ADAPTER.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDivViewCapability.TStashViewDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (value.getCardSearchCriteria() != null) {
                        TDiv2Id.ADAPTER.encodeWithTag(writer, 2, (int) value.getCardSearchCriteria());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDivViewCapability.TStashViewDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return value.getCardSearchCriteria() != null ? TDiv2Id.ADAPTER.encodedSizeWithTag(2, value.getCardSearchCriteria()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TStashViewDirective redact(TDivViewCapability.TStashViewDirective value) {
                    TDiv2Id cardSearchCriteria = value.getCardSearchCriteria();
                    return TDivViewCapability.TStashViewDirective.copy$default(value, null, cardSearchCriteria != null ? TDiv2Id.ADAPTER.redact(cardSearchCriteria) : null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDivViewCapability.TStashViewDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getCardSearchCriteria() != null) {
                        TDiv2Id.ADAPTER.encodeWithTag(writer, 2, (int) value.getCardSearchCriteria());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TStashViewDirective(String str, TDiv2Id tDiv2Id, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : tDiv2Id, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TStashViewDirective copy$default(TStashViewDirective tStashViewDirective, String str, TDiv2Id tDiv2Id, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tStashViewDirective.name;
            }
            if ((i & 2) != 0) {
                tDiv2Id = tStashViewDirective.cardSearchCriteria;
            }
            if ((i & 4) != 0) {
                byteString = tStashViewDirective.unknownFields();
            }
            return tStashViewDirective.copy(str, tDiv2Id, byteString);
        }

        @ColumnNameOption("card_search_criteria")
        public static /* synthetic */ void getCardSearchCriteria$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TStashViewDirective copy(String name, TDiv2Id cardSearchCriteria, ByteString unknownFields) {
            return new TStashViewDirective(name, cardSearchCriteria, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TStashViewDirective)) {
                return false;
            }
            TStashViewDirective tStashViewDirective = (TStashViewDirective) other;
            return jl40.l(unknownFields(), tStashViewDirective.unknownFields()) && jl40.l(this.name, tStashViewDirective.name) && jl40.l(this.cardSearchCriteria, tStashViewDirective.cardSearchCriteria);
        }

        public final TDiv2Id getCardSearchCriteria() {
            return this.cardSearchCriteria;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            TDiv2Id tDiv2Id = this.cardSearchCriteria;
            int hashCode = b + (tDiv2Id != null ? tDiv2Id.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m662newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            TDiv2Id tDiv2Id = this.cardSearchCriteria;
            if (tDiv2Id != null) {
                arrayList.add("cardSearchCriteria=" + tDiv2Id);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TStashViewDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m662newBuilder();
        }

        public TStashViewDirective() {
            this(null, null, null, 7, null);
        }

        public TStashViewDirective(String str, TDiv2Id tDiv2Id, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.cardSearchCriteria = tDiv2Id;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J \u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TState;", "Lcom/squareup/wire/Message;", "", "globalTemplatesCache", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getGlobalTemplatesCache$annotations", "()V", "getGlobalTemplatesCache", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "global_templates_cache", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<String> globalTemplatesCache;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TState decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDivViewCapability.TState(arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDivViewCapability.TState value) {
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getGlobalTemplatesCache());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDivViewCapability.TState value) {
                    return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getGlobalTemplatesCache()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TState redact(TDivViewCapability.TState value) {
                    return TDivViewCapability.TState.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDivViewCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getGlobalTemplatesCache());
                }
            };
        }

        public /* synthetic */ TState(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TState copy$default(TState tState, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tState.globalTemplatesCache;
            }
            if ((i & 2) != 0) {
                byteString = tState.unknownFields();
            }
            return tState.copy(list, byteString);
        }

        @ColumnNameOption("global_templates_cache")
        public static /* synthetic */ void getGlobalTemplatesCache$annotations() {
        }

        public final TState copy(List<String> globalTemplatesCache, ByteString unknownFields) {
            return new TState(globalTemplatesCache, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TState)) {
                return false;
            }
            TState tState = (TState) other;
            return jl40.l(unknownFields(), tState.unknownFields()) && jl40.l(this.globalTemplatesCache, tState.globalTemplatesCache);
        }

        public final List<String> getGlobalTemplatesCache() {
            return this.globalTemplatesCache;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.globalTemplatesCache.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m663newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.globalTemplatesCache.isEmpty()) {
                unr0.B("globalTemplatesCache=", Internal.sanitize(this.globalTemplatesCache), arrayList);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TState{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m663newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TState(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.globalTemplatesCache = Internal.immutableCopyOf("globalTemplatesCache", list);
        }
    }

    @SpeechKitNameOption("unstash_view")
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TDivViewCapability$TUnstashViewDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "cardSearchCriteria", "Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getCardSearchCriteria$annotations", "getCardSearchCriteria", "()Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.UnstashViewDirectiveType)
    public static final class TUnstashViewDirective extends Message {
        public static final ProtoAdapter<TUnstashViewDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TDiv2Id#ADAPTER", jsonName = "card_search_criteria", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final TDiv2Id cardSearchCriteria;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TUnstashViewDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TUnstashViewDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TDivViewCapability$TUnstashViewDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TUnstashViewDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    TDiv2Id tDiv2Id = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDivViewCapability.TUnstashViewDirective(str, tDiv2Id, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            tDiv2Id = TDiv2Id.ADAPTER.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDivViewCapability.TUnstashViewDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (value.getCardSearchCriteria() != null) {
                        TDiv2Id.ADAPTER.encodeWithTag(writer, 2, (int) value.getCardSearchCriteria());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDivViewCapability.TUnstashViewDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return value.getCardSearchCriteria() != null ? TDiv2Id.ADAPTER.encodedSizeWithTag(2, value.getCardSearchCriteria()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDivViewCapability.TUnstashViewDirective redact(TDivViewCapability.TUnstashViewDirective value) {
                    TDiv2Id cardSearchCriteria = value.getCardSearchCriteria();
                    return TDivViewCapability.TUnstashViewDirective.copy$default(value, null, cardSearchCriteria != null ? TDiv2Id.ADAPTER.redact(cardSearchCriteria) : null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDivViewCapability.TUnstashViewDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getCardSearchCriteria() != null) {
                        TDiv2Id.ADAPTER.encodeWithTag(writer, 2, (int) value.getCardSearchCriteria());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TUnstashViewDirective(String str, TDiv2Id tDiv2Id, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : tDiv2Id, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TUnstashViewDirective copy$default(TUnstashViewDirective tUnstashViewDirective, String str, TDiv2Id tDiv2Id, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tUnstashViewDirective.name;
            }
            if ((i & 2) != 0) {
                tDiv2Id = tUnstashViewDirective.cardSearchCriteria;
            }
            if ((i & 4) != 0) {
                byteString = tUnstashViewDirective.unknownFields();
            }
            return tUnstashViewDirective.copy(str, tDiv2Id, byteString);
        }

        @ColumnNameOption("card_search_criteria")
        public static /* synthetic */ void getCardSearchCriteria$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TUnstashViewDirective copy(String name, TDiv2Id cardSearchCriteria, ByteString unknownFields) {
            return new TUnstashViewDirective(name, cardSearchCriteria, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TUnstashViewDirective)) {
                return false;
            }
            TUnstashViewDirective tUnstashViewDirective = (TUnstashViewDirective) other;
            return jl40.l(unknownFields(), tUnstashViewDirective.unknownFields()) && jl40.l(this.name, tUnstashViewDirective.name) && jl40.l(this.cardSearchCriteria, tUnstashViewDirective.cardSearchCriteria);
        }

        public final TDiv2Id getCardSearchCriteria() {
            return this.cardSearchCriteria;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            TDiv2Id tDiv2Id = this.cardSearchCriteria;
            int hashCode = b + (tDiv2Id != null ? tDiv2Id.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m664newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            TDiv2Id tDiv2Id = this.cardSearchCriteria;
            if (tDiv2Id != null) {
                arrayList.add("cardSearchCriteria=" + tDiv2Id);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TUnstashViewDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m664newBuilder();
        }

        public TUnstashViewDirective() {
            this(null, null, null, 7, null);
        }

        public TUnstashViewDirective(String str, TDiv2Id tDiv2Id, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.cardSearchCriteria = tDiv2Id;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m658newBuilder();
    }

    public TDivViewCapability() {
        this(null, null, null, null, 15, null);
    }

    public TDivViewCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
