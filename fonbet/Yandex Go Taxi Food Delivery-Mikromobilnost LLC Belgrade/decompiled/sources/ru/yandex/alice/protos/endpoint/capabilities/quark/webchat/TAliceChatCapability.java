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
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.qv10;
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
import ru.yandex.alice.cuttlefish.services.features_limiter.proto.api.quark.webchat.EDecision;
import ru.yandex.alice.protos.api.alice_mode_info.quark.webchat.TAlice2ModeInfo;
import ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective;
import ru.yandex.alice.protos.data.dialog_state.quark.webchat.TDialogState;
import ru.yandex.alice.protos.div.quark.webchat.TDiv2Card;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.CapabilityTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.DirectiveTypeOption;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;
import ru.yandex.alice.protos.extensions.quark.webchat.LanguageDependentOption;
import ru.yandex.alice.protos.extensions.quark.webchat.SpeechKitNameOption;
import ru.yandex.alice.protos.extensions.quark.webchat.TLanguageDependent;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \b\u0001\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u001e!\"#$%&'()*+,-./0123456789:;<=>B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006?"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability;", "Lcom/squareup/wire/Message;", "", Constants.REFERRER_API_META, "Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "parameters", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TParameters;", ClidProvider.STATE, "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TParameters;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TState;Lokio/ByteString;)V", "getMeta$annotations", "()V", "getMeta", "()Lru/yandex/alice/protos/endpoint/quark/webchat/TCapability$TMeta;", "getParameters$annotations", "getParameters", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TParameters;", "getState$annotations", "getState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TParameters", "TChatNavigationEntry", "TNavigationState", "TState", "TFillChatInputDirective", "TShowProPurchaseScreenDirective", "TShowFullscreenImageGalleryDirective", "TZoomImageDirective", "TDownloadImageDirective", "TShareImageDirective", "TShowPromoScreenDirective", "TSetChatRequestModeDirective", "TAddChatDiv2CardDirective", "TFinishChatDirective", "TLimitExceededBannerDirective", "TFewRequestsLeftBannerDirective", "TOpenChatListDirective", "TCreateNewChatDirective", "TChatNavigateBackDirective", "TShowBannerDirective", "TShowModalDirective", "TShowNotificationDirective", "TLoginWithCallbackDirective", "TVideoFragment", "TTextFragment", "TScrollToFragmentDirective", "TScrollToTopDirective", "TScreenshotTakenDirective", "TOpenSerpViewDirective", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@CapabilityTypeOption(TCapability.ECapabilityType.AliceChatCapabilityType)
/* loaded from: classes9.dex */
public final class TAliceChatCapability extends Message {
    public static final ProtoAdapter<TAliceChatCapability> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.quark.webchat.TCapability$TMeta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TCapability.TMeta meta;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TParameters#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TParameters parameters;

    @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TState state;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0014¨\u0006$"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry;", "Lcom/squareup/wire/Message;", "", "type", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry$EType;", "title", "", "canNavigateBack", "", "id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry$EType;Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getType$annotations", "()V", "getType", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry$EType;", "getTitle$annotations", "getTitle", "()Ljava/lang/String;", "getCanNavigateBack$annotations", "getCanNavigateBack", "()Z", "getId$annotations", "getId", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "EType", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TChatNavigationEntry extends Message {
        public static final ProtoAdapter<TChatNavigationEntry> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "can_navigate_back", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final boolean canNavigateBack;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String title;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TChatNavigationEntry$EType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final EType type;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TChatNavigationEntry.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TChatNavigationEntry>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TChatNavigationEntry$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TChatNavigationEntry decode(ProtoReader reader) {
                    TAliceChatCapability.TChatNavigationEntry.EType eType = TAliceChatCapability.TChatNavigationEntry.EType.Unknown;
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    boolean z = false;
                    String str2 = str;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TChatNavigationEntry(eType, str2, z, str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                eType = TAliceChatCapability.TChatNavigationEntry.EType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 2) {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            str = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TChatNavigationEntry value) {
                    if (value.getType() != TAliceChatCapability.TChatNavigationEntry.EType.Unknown) {
                        TAliceChatCapability.TChatNavigationEntry.EType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    if (value.getCanNavigateBack()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getCanNavigateBack()));
                    }
                    if (!jl40.l(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getId());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TChatNavigationEntry value) {
                    int h = value.unknownFields().h();
                    if (value.getType() != TAliceChatCapability.TChatNavigationEntry.EType.Unknown) {
                        h += TAliceChatCapability.TChatNavigationEntry.EType.ADAPTER.encodedSizeWithTag(1, value.getType());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                    }
                    if (value.getCanNavigateBack()) {
                        h += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getCanNavigateBack()));
                    }
                    return !jl40.l(value.getId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.getId()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TChatNavigationEntry redact(TAliceChatCapability.TChatNavigationEntry value) {
                    return TAliceChatCapability.TChatNavigationEntry.copy$default(value, null, null, false, null, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TChatNavigationEntry value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getId());
                    }
                    if (value.getCanNavigateBack()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getCanNavigateBack()));
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    if (value.getType() != TAliceChatCapability.TChatNavigationEntry.EType.Unknown) {
                        TAliceChatCapability.TChatNavigationEntry.EType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                }
            };
        }

        public /* synthetic */ TChatNavigationEntry(EType eType, String str, boolean z, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EType.Unknown : eType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TChatNavigationEntry copy$default(TChatNavigationEntry tChatNavigationEntry, EType eType, String str, boolean z, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                eType = tChatNavigationEntry.type;
            }
            if ((i & 2) != 0) {
                str = tChatNavigationEntry.title;
            }
            if ((i & 4) != 0) {
                z = tChatNavigationEntry.canNavigateBack;
            }
            if ((i & 8) != 0) {
                str2 = tChatNavigationEntry.id;
            }
            if ((i & 16) != 0) {
                byteString = tChatNavigationEntry.unknownFields();
            }
            ByteString byteString2 = byteString;
            boolean z2 = z;
            return tChatNavigationEntry.copy(eType, str, z2, str2, byteString2);
        }

        @ColumnNameOption("can_navigate_back")
        public static /* synthetic */ void getCanNavigateBack$annotations() {
        }

        @ColumnNameOption("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @ColumnNameOption("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        @ColumnNameOption("type")
        public static /* synthetic */ void getType$annotations() {
        }

        public final TChatNavigationEntry copy(EType type, String title, boolean canNavigateBack, String id, ByteString unknownFields) {
            return new TChatNavigationEntry(type, title, canNavigateBack, id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TChatNavigationEntry)) {
                return false;
            }
            TChatNavigationEntry tChatNavigationEntry = (TChatNavigationEntry) other;
            return jl40.l(unknownFields(), tChatNavigationEntry.unknownFields()) && this.type == tChatNavigationEntry.type && jl40.l(this.title, tChatNavigationEntry.title) && this.canNavigateBack == tChatNavigationEntry.canNavigateBack && jl40.l(this.id, tChatNavigationEntry.id);
        }

        public final boolean getCanNavigateBack() {
            return this.canNavigateBack;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final EType getType() {
            return this.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.id.hashCode() + unr0.e(unr0.b((this.type.hashCode() + (unknownFields().hashCode() * 37)) * 37, 37, this.title), 37, this.canNavigateBack);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m588newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("type=" + this.type);
            unr0.B("title=", Internal.sanitize(this.title), arrayList);
            smw0.y("canNavigateBack=", arrayList, this.canNavigateBack);
            unr0.B("id=", Internal.sanitize(this.id), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TChatNavigationEntry{", "}", null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry$EType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Unknown", "Chat", "ChatList", "Skill", "ChatFolder", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class EType implements WireEnum {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ EType[] $VALUES;
            public static final ProtoAdapter<EType> ADAPTER;
            public static final EType Chat;
            public static final EType ChatFolder;
            public static final EType ChatList;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final EType Skill;
            public static final EType Unknown;
            private final int value;

            private static final /* synthetic */ EType[] $values() {
                return new EType[]{Unknown, Chat, ChatList, Skill, ChatFolder};
            }

            static {
                final EType eType = new EType("Unknown", 0, 0);
                Unknown = eType;
                Chat = new EType("Chat", 1, 1);
                ChatList = new EType("ChatList", 2, 2);
                Skill = new EType("Skill", 3, 3);
                ChatFolder = new EType("ChatFolder", 4, 4);
                EType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
                INSTANCE = new Companion(null);
                final g0c a = qoi0.a(EType.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<EType>(a, syntax, eType) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TChatNavigationEntry$EType$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public TAliceChatCapability.TChatNavigationEntry.EType fromValue(int value) {
                        return TAliceChatCapability.TChatNavigationEntry.EType.INSTANCE.fromValue(value);
                    }
                };
            }

            private EType(String str, int i, int i2) {
                this.value = i2;
            }

            public static final EType fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static EType valueOf(String str) {
                return (EType) Enum.valueOf(EType.class, str);
            }

            public static EType[] values() {
                return (EType[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry$EType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry$EType;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final EType fromValue(int value) {
                    if (value == 0) {
                        return EType.Unknown;
                    }
                    if (value == 1) {
                        return EType.Chat;
                    }
                    if (value == 2) {
                        return EType.ChatList;
                    }
                    if (value == 3) {
                        return EType.Skill;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return EType.ChatFolder;
                }

                private Companion() {
                }
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m588newBuilder();
        }

        public TChatNavigationEntry() {
            this(null, null, false, null, null, 31, null);
        }

        public TChatNavigationEntry(EType eType, String str, boolean z, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = eType;
            this.title = str;
            this.canNavigateBack = z;
            this.id = str2;
        }
    }

    @SpeechKitNameOption("open_serp_view_directive")
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TOpenSerpViewDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "url", "query", "serpViewType", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TOpenSerpViewDirective$ESerpViewType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TOpenSerpViewDirective$ESerpViewType;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getUrl$annotations", "getUrl", "getQuery$annotations", "getQuery", "getSerpViewType$annotations", "getSerpViewType", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TOpenSerpViewDirective$ESerpViewType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ESerpViewType", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.OpenSerpViewDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TOpenSerpViewDirective extends Message {
        public static final ProtoAdapter<TOpenSerpViewDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String query;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TOpenSerpViewDirective$ESerpViewType#ADAPTER", jsonName = "serp_view_type", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final ESerpViewType serpViewType;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String url;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TOpenSerpViewDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TOpenSerpViewDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TOpenSerpViewDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TOpenSerpViewDirective decode(ProtoReader reader) {
                    TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType eSerpViewType = TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType.UnknownSerpViewType;
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = str;
                    String str3 = str2;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TOpenSerpViewDirective(str, str2, str3, eSerpViewType, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            str3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                eSerpViewType = TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TOpenSerpViewDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUrl());
                    }
                    if (!jl40.l(value.getQuery(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuery());
                    }
                    if (value.getSerpViewType() != TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType.UnknownSerpViewType) {
                        TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSerpViewType());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TOpenSerpViewDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (!jl40.l(value.getUrl(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUrl());
                    }
                    if (!jl40.l(value.getQuery(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuery());
                    }
                    return value.getSerpViewType() != TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType.UnknownSerpViewType ? TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType.ADAPTER.encodedSizeWithTag(4, value.getSerpViewType()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TOpenSerpViewDirective redact(TAliceChatCapability.TOpenSerpViewDirective value) {
                    return TAliceChatCapability.TOpenSerpViewDirective.copy$default(value, null, null, null, null, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TOpenSerpViewDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getSerpViewType() != TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType.UnknownSerpViewType) {
                        TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSerpViewType());
                    }
                    if (!jl40.l(value.getQuery(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuery());
                    }
                    if (!jl40.l(value.getUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUrl());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TOpenSerpViewDirective(String str, String str2, String str3, ESerpViewType eSerpViewType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ESerpViewType.UnknownSerpViewType : eSerpViewType, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TOpenSerpViewDirective copy$default(TOpenSerpViewDirective tOpenSerpViewDirective, String str, String str2, String str3, ESerpViewType eSerpViewType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tOpenSerpViewDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tOpenSerpViewDirective.url;
            }
            if ((i & 4) != 0) {
                str3 = tOpenSerpViewDirective.query;
            }
            if ((i & 8) != 0) {
                eSerpViewType = tOpenSerpViewDirective.serpViewType;
            }
            if ((i & 16) != 0) {
                byteString = tOpenSerpViewDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str4 = str3;
            return tOpenSerpViewDirective.copy(str, str2, str4, eSerpViewType, byteString2);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("query")
        public static /* synthetic */ void getQuery$annotations() {
        }

        @ColumnNameOption("serp_view_type")
        public static /* synthetic */ void getSerpViewType$annotations() {
        }

        @ColumnNameOption("url")
        public static /* synthetic */ void getUrl$annotations() {
        }

        public final TOpenSerpViewDirective copy(String name, String url, String query, ESerpViewType serpViewType, ByteString unknownFields) {
            return new TOpenSerpViewDirective(name, url, query, serpViewType, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TOpenSerpViewDirective)) {
                return false;
            }
            TOpenSerpViewDirective tOpenSerpViewDirective = (TOpenSerpViewDirective) other;
            return jl40.l(unknownFields(), tOpenSerpViewDirective.unknownFields()) && jl40.l(this.name, tOpenSerpViewDirective.name) && jl40.l(this.url, tOpenSerpViewDirective.url) && jl40.l(this.query, tOpenSerpViewDirective.query) && this.serpViewType == tOpenSerpViewDirective.serpViewType;
        }

        public final String getName() {
            return this.name;
        }

        public final String getQuery() {
            return this.query;
        }

        public final ESerpViewType getSerpViewType() {
            return this.serpViewType;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.serpViewType.hashCode() + unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.url), 37, this.query);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m598newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("url=", Internal.sanitize(this.url), arrayList);
            unr0.B("query=", Internal.sanitize(this.query), arrayList);
            arrayList.add("serpViewType=" + this.serpViewType);
            return a.X(arrayList, Extension.FIX_SPACE, "TOpenSerpViewDirective{", "}", null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TOpenSerpViewDirective$ESerpViewType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UnknownSerpViewType", "SerpEthicNews", "SerpEthicCelebs", "SerpEthicPorno", "SerpEthicVpn", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ESerpViewType implements WireEnum {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ ESerpViewType[] $VALUES;
            public static final ProtoAdapter<ESerpViewType> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final ESerpViewType SerpEthicCelebs;
            public static final ESerpViewType SerpEthicNews;
            public static final ESerpViewType SerpEthicPorno;
            public static final ESerpViewType SerpEthicVpn;
            public static final ESerpViewType UnknownSerpViewType;
            private final int value;

            private static final /* synthetic */ ESerpViewType[] $values() {
                return new ESerpViewType[]{UnknownSerpViewType, SerpEthicNews, SerpEthicCelebs, SerpEthicPorno, SerpEthicVpn};
            }

            static {
                final ESerpViewType eSerpViewType = new ESerpViewType("UnknownSerpViewType", 0, 0);
                UnknownSerpViewType = eSerpViewType;
                SerpEthicNews = new ESerpViewType("SerpEthicNews", 1, 1);
                SerpEthicCelebs = new ESerpViewType("SerpEthicCelebs", 2, 2);
                SerpEthicPorno = new ESerpViewType("SerpEthicPorno", 3, 3);
                SerpEthicVpn = new ESerpViewType("SerpEthicVpn", 4, 4);
                ESerpViewType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
                INSTANCE = new Companion(null);
                final g0c a = qoi0.a(ESerpViewType.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<ESerpViewType>(a, syntax, eSerpViewType) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TOpenSerpViewDirective$ESerpViewType$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType fromValue(int value) {
                        return TAliceChatCapability.TOpenSerpViewDirective.ESerpViewType.INSTANCE.fromValue(value);
                    }
                };
            }

            private ESerpViewType(String str, int i, int i2) {
                this.value = i2;
            }

            public static final ESerpViewType fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static ESerpViewType valueOf(String str) {
                return (ESerpViewType) Enum.valueOf(ESerpViewType.class, str);
            }

            public static ESerpViewType[] values() {
                return (ESerpViewType[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TOpenSerpViewDirective$ESerpViewType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TOpenSerpViewDirective$ESerpViewType;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ESerpViewType fromValue(int value) {
                    if (value == 0) {
                        return ESerpViewType.UnknownSerpViewType;
                    }
                    if (value == 1) {
                        return ESerpViewType.SerpEthicNews;
                    }
                    if (value == 2) {
                        return ESerpViewType.SerpEthicCelebs;
                    }
                    if (value == 3) {
                        return ESerpViewType.SerpEthicPorno;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return ESerpViewType.SerpEthicVpn;
                }

                private Companion() {
                }
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m598newBuilder();
        }

        public TOpenSerpViewDirective() {
            this(null, null, null, null, null, 31, null);
        }

        public TOpenSerpViewDirective(String str, String str2, String str3, ESerpViewType eSerpViewType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.url = str2;
            this.query = str3;
            this.serpViewType = eSerpViewType;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TAliceChatCapability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TAliceChatCapability>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TAliceChatCapability decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TCapability.TMeta tMeta = null;
                TAliceChatCapability.TParameters tParameters = null;
                TAliceChatCapability.TState tState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TAliceChatCapability(tMeta, tParameters, tState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tMeta = TCapability.TMeta.ADAPTER.decode(reader);
                    } else if (nextTag == 2) {
                        tParameters = TAliceChatCapability.TParameters.ADAPTER.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tState = TAliceChatCapability.TState.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TAliceChatCapability value) {
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
                if (value.getParameters() != null) {
                    TAliceChatCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getState() != null) {
                    TAliceChatCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TAliceChatCapability value) {
                int h = value.unknownFields().h();
                if (value.getMeta() != null) {
                    h += TCapability.TMeta.ADAPTER.encodedSizeWithTag(1, value.getMeta());
                }
                if (value.getParameters() != null) {
                    h += TAliceChatCapability.TParameters.ADAPTER.encodedSizeWithTag(2, value.getParameters());
                }
                return value.getState() != null ? TAliceChatCapability.TState.ADAPTER.encodedSizeWithTag(3, value.getState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TAliceChatCapability redact(TAliceChatCapability value) {
                TCapability.TMeta meta = value.getMeta();
                TCapability.TMeta redact = meta != null ? TCapability.TMeta.ADAPTER.redact(meta) : null;
                TAliceChatCapability.TParameters parameters = value.getParameters();
                TAliceChatCapability.TParameters redact2 = parameters != null ? TAliceChatCapability.TParameters.ADAPTER.redact(parameters) : null;
                TAliceChatCapability.TState state = value.getState();
                return value.copy(redact, redact2, state != null ? TAliceChatCapability.TState.ADAPTER.redact(state) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TAliceChatCapability value) {
                writer.writeBytes(value.unknownFields());
                if (value.getState() != null) {
                    TAliceChatCapability.TState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getParameters() != null) {
                    TAliceChatCapability.TParameters.ADAPTER.encodeWithTag(writer, 2, (int) value.getParameters());
                }
                if (value.getMeta() != null) {
                    TCapability.TMeta.ADAPTER.encodeWithTag(writer, 1, (int) value.getMeta());
                }
            }
        };
    }

    public /* synthetic */ TAliceChatCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tMeta, (i & 2) != 0 ? null : tParameters, (i & 4) != 0 ? null : tState, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TAliceChatCapability copy$default(TAliceChatCapability tAliceChatCapability, TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tMeta = tAliceChatCapability.meta;
        }
        if ((i & 2) != 0) {
            tParameters = tAliceChatCapability.parameters;
        }
        if ((i & 4) != 0) {
            tState = tAliceChatCapability.state;
        }
        if ((i & 8) != 0) {
            byteString = tAliceChatCapability.unknownFields();
        }
        return tAliceChatCapability.copy(tMeta, tParameters, tState, byteString);
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

    public final TAliceChatCapability copy(TCapability.TMeta meta, TParameters parameters, TState state, ByteString unknownFields) {
        return new TAliceChatCapability(meta, parameters, state, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TAliceChatCapability)) {
            return false;
        }
        TAliceChatCapability tAliceChatCapability = (TAliceChatCapability) other;
        return jl40.l(unknownFields(), tAliceChatCapability.unknownFields()) && jl40.l(this.meta, tAliceChatCapability.meta) && jl40.l(this.parameters, tAliceChatCapability.parameters) && jl40.l(this.state, tAliceChatCapability.state);
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
    public /* synthetic */ Void m584newBuilder() {
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
        return a.X(arrayList, Extension.FIX_SPACE, "TAliceChatCapability{", "}", null, 56);
    }

    @SpeechKitNameOption("add_chat_div2_card_directive")
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006%"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TAddChatDiv2CardDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "div2Card", "Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;", "renderRequestParams", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TAddChatDiv2CardDirective$TRenderRequestParams;", "dialogId", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TAddChatDiv2CardDirective$TRenderRequestParams;Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getDiv2Card$annotations", "getDiv2Card", "()Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;", "getRenderRequestParams$annotations", "getRenderRequestParams", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TAddChatDiv2CardDirective$TRenderRequestParams;", "getDialogId$annotations", "getDialogId", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TRenderRequestParams", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.AddChatDiv2CardDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TAddChatDiv2CardDirective extends Message {
        public static final ProtoAdapter<TAddChatDiv2CardDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dialog_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String dialogId;

        @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TDiv2Card#ADAPTER", jsonName = "div2_card", oneofName = "DivCard", schemaIndex = 1, tag = 2)
        private final TDiv2Card div2Card;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TAddChatDiv2CardDirective$TRenderRequestParams#ADAPTER", jsonName = "render_request_params", oneofName = "DivCard", schemaIndex = 2, tag = 3)
        private final TRenderRequestParams renderRequestParams;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TAddChatDiv2CardDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TAddChatDiv2CardDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TAddChatDiv2CardDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TAddChatDiv2CardDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    TDiv2Card tDiv2Card = null;
                    TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams tRenderRequestParams = null;
                    String str2 = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TAddChatDiv2CardDirective(str, tDiv2Card, tRenderRequestParams, str2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            tDiv2Card = TDiv2Card.ADAPTER.decode(reader);
                        } else if (nextTag == 3) {
                            tRenderRequestParams = TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams.ADAPTER.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TAddChatDiv2CardDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getDialogId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDialogId());
                    }
                    TDiv2Card.ADAPTER.encodeWithTag(writer, 2, (int) value.getDiv2Card());
                    TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams.ADAPTER.encodeWithTag(writer, 3, (int) value.getRenderRequestParams());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TAddChatDiv2CardDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    int encodedSizeWithTag = TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams.ADAPTER.encodedSizeWithTag(3, value.getRenderRequestParams()) + TDiv2Card.ADAPTER.encodedSizeWithTag(2, value.getDiv2Card()) + h;
                    return !jl40.l(value.getDialogId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDialogId()) + encodedSizeWithTag : encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TAddChatDiv2CardDirective redact(TAliceChatCapability.TAddChatDiv2CardDirective value) {
                    TDiv2Card div2Card = value.getDiv2Card();
                    TDiv2Card redact = div2Card != null ? TDiv2Card.ADAPTER.redact(div2Card) : null;
                    TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams renderRequestParams = value.getRenderRequestParams();
                    return TAliceChatCapability.TAddChatDiv2CardDirective.copy$default(value, null, redact, renderRequestParams != null ? TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams.ADAPTER.redact(renderRequestParams) : null, null, ByteString.c, 9, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TAddChatDiv2CardDirective value) {
                    writer.writeBytes(value.unknownFields());
                    TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams.ADAPTER.encodeWithTag(writer, 3, (int) value.getRenderRequestParams());
                    TDiv2Card.ADAPTER.encodeWithTag(writer, 2, (int) value.getDiv2Card());
                    if (!jl40.l(value.getDialogId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDialogId());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TAddChatDiv2CardDirective(String str, TDiv2Card tDiv2Card, TRenderRequestParams tRenderRequestParams, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : tDiv2Card, (i & 4) != 0 ? null : tRenderRequestParams, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TAddChatDiv2CardDirective copy$default(TAddChatDiv2CardDirective tAddChatDiv2CardDirective, String str, TDiv2Card tDiv2Card, TRenderRequestParams tRenderRequestParams, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tAddChatDiv2CardDirective.name;
            }
            if ((i & 2) != 0) {
                tDiv2Card = tAddChatDiv2CardDirective.div2Card;
            }
            if ((i & 4) != 0) {
                tRenderRequestParams = tAddChatDiv2CardDirective.renderRequestParams;
            }
            if ((i & 8) != 0) {
                str2 = tAddChatDiv2CardDirective.dialogId;
            }
            if ((i & 16) != 0) {
                byteString = tAddChatDiv2CardDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            TRenderRequestParams tRenderRequestParams2 = tRenderRequestParams;
            return tAddChatDiv2CardDirective.copy(str, tDiv2Card, tRenderRequestParams2, str2, byteString2);
        }

        @ColumnNameOption("dialog_id")
        public static /* synthetic */ void getDialogId$annotations() {
        }

        @ColumnNameOption("div2_card")
        public static /* synthetic */ void getDiv2Card$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("render_request_params")
        public static /* synthetic */ void getRenderRequestParams$annotations() {
        }

        public final TAddChatDiv2CardDirective copy(String name, TDiv2Card div2Card, TRenderRequestParams renderRequestParams, String dialogId, ByteString unknownFields) {
            return new TAddChatDiv2CardDirective(name, div2Card, renderRequestParams, dialogId, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TAddChatDiv2CardDirective)) {
                return false;
            }
            TAddChatDiv2CardDirective tAddChatDiv2CardDirective = (TAddChatDiv2CardDirective) other;
            return jl40.l(unknownFields(), tAddChatDiv2CardDirective.unknownFields()) && jl40.l(this.name, tAddChatDiv2CardDirective.name) && jl40.l(this.div2Card, tAddChatDiv2CardDirective.div2Card) && jl40.l(this.renderRequestParams, tAddChatDiv2CardDirective.renderRequestParams) && jl40.l(this.dialogId, tAddChatDiv2CardDirective.dialogId);
        }

        public final String getDialogId() {
            return this.dialogId;
        }

        public final TDiv2Card getDiv2Card() {
            return this.div2Card;
        }

        public final String getName() {
            return this.name;
        }

        public final TRenderRequestParams getRenderRequestParams() {
            return this.renderRequestParams;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            TDiv2Card tDiv2Card = this.div2Card;
            int hashCode = (b + (tDiv2Card != null ? tDiv2Card.hashCode() : 0)) * 37;
            TRenderRequestParams tRenderRequestParams = this.renderRequestParams;
            int hashCode2 = this.dialogId.hashCode() + ((hashCode + (tRenderRequestParams != null ? tRenderRequestParams.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m585newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            TDiv2Card tDiv2Card = this.div2Card;
            if (tDiv2Card != null) {
                arrayList.add("div2Card=" + tDiv2Card);
            }
            TRenderRequestParams tRenderRequestParams = this.renderRequestParams;
            if (tRenderRequestParams != null) {
                arrayList.add("renderRequestParams=" + tRenderRequestParams);
            }
            unr0.B("dialogId=", Internal.sanitize(this.dialogId), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TAddChatDiv2CardDirective{", "}", null, 56);
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TAddChatDiv2CardDirective$TRenderRequestParams;", "Lcom/squareup/wire/Message;", "", "cardId", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getCardId$annotations", "()V", "getCardId", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TRenderRequestParams extends Message {
            public static final ProtoAdapter<TRenderRequestParams> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "card_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String cardId;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TRenderRequestParams.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TRenderRequestParams>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TAddChatDiv2CardDirective$TRenderRequestParams$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams decode(ProtoReader reader) {
                        long beginMessage = reader.beginMessage();
                        String str = "";
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams(str, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(nextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams value) {
                        if (!jl40.l(value.getCardId(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardId());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams value) {
                        int h = value.unknownFields().h();
                        return !jl40.l(value.getCardId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCardId()) + h : h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams redact(TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams value) {
                        return TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams.copy$default(value, null, ByteString.c, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceChatCapability.TAddChatDiv2CardDirective.TRenderRequestParams value) {
                        writer.writeBytes(value.unknownFields());
                        if (jl40.l(value.getCardId(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCardId());
                    }
                };
            }

            public /* synthetic */ TRenderRequestParams(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
            }

            public static /* synthetic */ TRenderRequestParams copy$default(TRenderRequestParams tRenderRequestParams, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tRenderRequestParams.cardId;
                }
                if ((i & 2) != 0) {
                    byteString = tRenderRequestParams.unknownFields();
                }
                return tRenderRequestParams.copy(str, byteString);
            }

            @ColumnNameOption("card_id")
            public static /* synthetic */ void getCardId$annotations() {
            }

            public final TRenderRequestParams copy(String cardId, ByteString unknownFields) {
                return new TRenderRequestParams(cardId, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TRenderRequestParams)) {
                    return false;
                }
                TRenderRequestParams tRenderRequestParams = (TRenderRequestParams) other;
                return jl40.l(unknownFields(), tRenderRequestParams.unknownFields()) && jl40.l(this.cardId, tRenderRequestParams.cardId);
            }

            public final String getCardId() {
                return this.cardId;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.cardId.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m586newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                unr0.B("cardId=", Internal.sanitize(this.cardId), arrayList);
                return a.X(arrayList, Extension.FIX_SPACE, "TRenderRequestParams{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m586newBuilder();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TRenderRequestParams() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public TRenderRequestParams(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                this.cardId = str;
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m585newBuilder();
        }

        public TAddChatDiv2CardDirective() {
            this(null, null, null, null, null, 31, null);
        }

        public TAddChatDiv2CardDirective(String str, TDiv2Card tDiv2Card, TRenderRequestParams tRenderRequestParams, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.div2Card = tDiv2Card;
            this.renderRequestParams = tRenderRequestParams;
            this.dialogId = str2;
            if (Internal.countNonNull(tDiv2Card, tRenderRequestParams) <= 1) {
                return;
            }
            ny61.g("At most one of div2Card, renderRequestParams may be non-null");
            throw null;
        }
    }

    @SpeechKitNameOption("show_fullscreen_image_gallery_directive")
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowFullscreenImageGalleryDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "currentImage", "", "images", "", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowFullscreenImageGalleryDirective$TImage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILjava/util/List;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getCurrentImage$annotations", "getCurrentImage", "()I", "getImages$annotations", "getImages", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "TButton", "TImage", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ShowFullscreenImageGalleryDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TShowFullscreenImageGalleryDirective extends Message {
        public static final ProtoAdapter<TShowFullscreenImageGalleryDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "current_image", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final int currentImage;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowFullscreenImageGalleryDirective$TImage#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        private final List<TImage> images;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TShowFullscreenImageGalleryDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TShowFullscreenImageGalleryDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowFullscreenImageGalleryDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowFullscreenImageGalleryDirective decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    int i = 0;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TShowFullscreenImageGalleryDirective(str, i, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            i = ProtoAdapter.UINT32.decode(reader).intValue();
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            arrayList.add(TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TShowFullscreenImageGalleryDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (value.getCurrentImage() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCurrentImage()));
                    }
                    TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getImages());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TShowFullscreenImageGalleryDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (value.getCurrentImage() != 0) {
                        h += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getCurrentImage()));
                    }
                    return TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getImages()) + h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowFullscreenImageGalleryDirective redact(TAliceChatCapability.TShowFullscreenImageGalleryDirective value) {
                    return TAliceChatCapability.TShowFullscreenImageGalleryDirective.copy$default(value, null, 0, Internal.m133redactElements(value.getImages(), TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage.ADAPTER), ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowFullscreenImageGalleryDirective value) {
                    writer.writeBytes(value.unknownFields());
                    TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getImages());
                    if (value.getCurrentImage() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCurrentImage()));
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TShowFullscreenImageGalleryDirective(String str, int i, List list, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? EmptyList.a : list, (i2 & 8) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TShowFullscreenImageGalleryDirective copy$default(TShowFullscreenImageGalleryDirective tShowFullscreenImageGalleryDirective, String str, int i, List list, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = tShowFullscreenImageGalleryDirective.name;
            }
            if ((i2 & 2) != 0) {
                i = tShowFullscreenImageGalleryDirective.currentImage;
            }
            if ((i2 & 4) != 0) {
                list = tShowFullscreenImageGalleryDirective.images;
            }
            if ((i2 & 8) != 0) {
                byteString = tShowFullscreenImageGalleryDirective.unknownFields();
            }
            return tShowFullscreenImageGalleryDirective.copy(str, i, list, byteString);
        }

        @ColumnNameOption("current_image")
        public static /* synthetic */ void getCurrentImage$annotations() {
        }

        @ColumnNameOption("images")
        public static /* synthetic */ void getImages$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TShowFullscreenImageGalleryDirective copy(String name, int currentImage, List<TImage> images, ByteString unknownFields) {
            return new TShowFullscreenImageGalleryDirective(name, currentImage, images, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TShowFullscreenImageGalleryDirective)) {
                return false;
            }
            TShowFullscreenImageGalleryDirective tShowFullscreenImageGalleryDirective = (TShowFullscreenImageGalleryDirective) other;
            return jl40.l(unknownFields(), tShowFullscreenImageGalleryDirective.unknownFields()) && jl40.l(this.name, tShowFullscreenImageGalleryDirective.name) && this.currentImage == tShowFullscreenImageGalleryDirective.currentImage && jl40.l(this.images, tShowFullscreenImageGalleryDirective.images);
        }

        public final int getCurrentImage() {
            return this.currentImage;
        }

        public final List<TImage> getImages() {
            return this.images;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.images.hashCode() + oyr.b(this.currentImage, unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m606newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            arrayList.add("currentImage=" + this.currentImage);
            if (!this.images.isEmpty()) {
                smw0.x("images=", arrayList, this.images);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TShowFullscreenImageGalleryDirective{", "}", null, 56);
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0006\u0010\u0015R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowFullscreenImageGalleryDirective$TButton;", "Lcom/squareup/wire/Message;", "", "title", "", "iconUrl", "isEnabled", "", "directive", "Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective;Lokio/ByteString;)V", "getTitle$annotations", "()V", "getTitle", "()Ljava/lang/String;", "getIconUrl$annotations", "getIconUrl", "isEnabled$annotations", "()Z", "getDirective$annotations", "getDirective", "()Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TButton extends Message {
            public static final ProtoAdapter<TButton> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
            private final TDirective directive;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "icon_url", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String iconUrl;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is_enabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
            private final boolean isEnabled;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String title;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TButton.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TButton>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowFullscreenImageGalleryDirective$TButton$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton decode(ProtoReader reader) {
                        long beginMessage = reader.beginMessage();
                        String str = "";
                        TDirective tDirective = null;
                        boolean z = false;
                        String str2 = "";
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton(str, str2, z, tDirective, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                str2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 3) {
                                tDirective = TDirective.ADAPTER.decode(reader);
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton value) {
                        if (!jl40.l(value.getTitle(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                        }
                        if (!jl40.l(value.getIconUrl(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIconUrl());
                        }
                        if (value.getIsEnabled()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIsEnabled()));
                        }
                        if (value.getDirective() != null) {
                            TDirective.ADAPTER.encodeWithTag(writer, 3, (int) value.getDirective());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton value) {
                        int h = value.unknownFields().h();
                        if (!jl40.l(value.getTitle(), "")) {
                            h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                        }
                        if (!jl40.l(value.getIconUrl(), "")) {
                            h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getIconUrl());
                        }
                        if (value.getIsEnabled()) {
                            h += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIsEnabled()));
                        }
                        return value.getDirective() != null ? TDirective.ADAPTER.encodedSizeWithTag(3, value.getDirective()) + h : h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton redact(TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton value) {
                        TDirective directive = value.getDirective();
                        return TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton.copy$default(value, null, null, false, directive != null ? TDirective.ADAPTER.redact(directive) : null, ByteString.c, 7, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton value) {
                        writer.writeBytes(value.unknownFields());
                        if (value.getDirective() != null) {
                            TDirective.ADAPTER.encodeWithTag(writer, 3, (int) value.getDirective());
                        }
                        if (value.getIsEnabled()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIsEnabled()));
                        }
                        if (!jl40.l(value.getIconUrl(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIconUrl());
                        }
                        if (jl40.l(value.getTitle(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                    }
                };
            }

            public /* synthetic */ TButton(String str, String str2, boolean z, TDirective tDirective, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : tDirective, (i & 16) != 0 ? ByteString.c : byteString);
            }

            public static /* synthetic */ TButton copy$default(TButton tButton, String str, String str2, boolean z, TDirective tDirective, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tButton.title;
                }
                if ((i & 2) != 0) {
                    str2 = tButton.iconUrl;
                }
                if ((i & 4) != 0) {
                    z = tButton.isEnabled;
                }
                if ((i & 8) != 0) {
                    tDirective = tButton.directive;
                }
                if ((i & 16) != 0) {
                    byteString = tButton.unknownFields();
                }
                ByteString byteString2 = byteString;
                boolean z2 = z;
                return tButton.copy(str, str2, z2, tDirective, byteString2);
            }

            @ColumnNameOption("directive")
            public static /* synthetic */ void getDirective$annotations() {
            }

            @ColumnNameOption("icon_url")
            public static /* synthetic */ void getIconUrl$annotations() {
            }

            @ColumnNameOption("title")
            public static /* synthetic */ void getTitle$annotations() {
            }

            @ColumnNameOption("is_enabled")
            public static /* synthetic */ void isEnabled$annotations() {
            }

            public final TButton copy(String title, String iconUrl, boolean isEnabled, TDirective directive, ByteString unknownFields) {
                return new TButton(title, iconUrl, isEnabled, directive, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TButton)) {
                    return false;
                }
                TButton tButton = (TButton) other;
                return jl40.l(unknownFields(), tButton.unknownFields()) && jl40.l(this.title, tButton.title) && jl40.l(this.iconUrl, tButton.iconUrl) && this.isEnabled == tButton.isEnabled && jl40.l(this.directive, tButton.directive);
            }

            public final TDirective getDirective() {
                return this.directive;
            }

            public final String getIconUrl() {
                return this.iconUrl;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int e = unr0.e(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.title), 37, this.iconUrl), 37, this.isEnabled);
                TDirective tDirective = this.directive;
                int hashCode = e + (tDirective != null ? tDirective.hashCode() : 0);
                this.hashCode = hashCode;
                return hashCode;
            }

            /* renamed from: isEnabled, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m607newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                unr0.B("title=", Internal.sanitize(this.title), arrayList);
                unr0.B("iconUrl=", Internal.sanitize(this.iconUrl), arrayList);
                smw0.y("isEnabled=", arrayList, this.isEnabled);
                TDirective tDirective = this.directive;
                if (tDirective != null) {
                    arrayList.add("directive=" + tDirective);
                }
                return a.X(arrayList, Extension.FIX_SPACE, "TButton{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m607newBuilder();
            }

            public TButton() {
                this(null, null, false, null, null, 31, null);
            }

            public TButton(String str, String str2, boolean z, TDirective tDirective, ByteString byteString) {
                super(ADAPTER, byteString);
                this.title = str;
                this.iconUrl = str2;
                this.isEnabled = z;
                this.directive = tDirective;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowFullscreenImageGalleryDirective$TImage;", "Lcom/squareup/wire/Message;", "", "imageUrl", "", "buttons", "", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowFullscreenImageGalleryDirective$TButton;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getImageUrl$annotations", "()V", "getImageUrl", "()Ljava/lang/String;", "getButtons$annotations", "getButtons", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TImage extends Message {
            public static final ProtoAdapter<TImage> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowFullscreenImageGalleryDirective$TButton#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
            private final List<TButton> buttons;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "image_url", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String imageUrl;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TImage.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TImage>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowFullscreenImageGalleryDirective$TImage$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage decode(ProtoReader reader) {
                        ArrayList arrayList = new ArrayList();
                        long beginMessage = reader.beginMessage();
                        String str = "";
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage(str, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                arrayList.add(TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage value) {
                        if (!jl40.l(value.getImageUrl(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImageUrl());
                        }
                        TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getButtons());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage value) {
                        int h = value.unknownFields().h();
                        if (!jl40.l(value.getImageUrl(), "")) {
                            h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getImageUrl());
                        }
                        return TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getButtons()) + h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage redact(TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage value) {
                        return TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage.copy$default(value, null, Internal.m133redactElements(value.getButtons(), TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton.ADAPTER), ByteString.c, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowFullscreenImageGalleryDirective.TImage value) {
                        writer.writeBytes(value.unknownFields());
                        TAliceChatCapability.TShowFullscreenImageGalleryDirective.TButton.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getButtons());
                        if (jl40.l(value.getImageUrl(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImageUrl());
                    }
                };
            }

            public /* synthetic */ TImage(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EmptyList.a : list, (i & 4) != 0 ? ByteString.c : byteString);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TImage copy$default(TImage tImage, String str, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tImage.imageUrl;
                }
                if ((i & 2) != 0) {
                    list = tImage.buttons;
                }
                if ((i & 4) != 0) {
                    byteString = tImage.unknownFields();
                }
                return tImage.copy(str, list, byteString);
            }

            @ColumnNameOption("buttons")
            public static /* synthetic */ void getButtons$annotations() {
            }

            @ColumnNameOption("image_url")
            public static /* synthetic */ void getImageUrl$annotations() {
            }

            public final TImage copy(String imageUrl, List<TButton> buttons, ByteString unknownFields) {
                return new TImage(imageUrl, buttons, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TImage)) {
                    return false;
                }
                TImage tImage = (TImage) other;
                return jl40.l(unknownFields(), tImage.unknownFields()) && jl40.l(this.imageUrl, tImage.imageUrl) && jl40.l(this.buttons, tImage.buttons);
            }

            public final List<TButton> getButtons() {
                return this.buttons;
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.buttons.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.imageUrl);
                this.hashCode = hashCode;
                return hashCode;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m608newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                unr0.B("imageUrl=", Internal.sanitize(this.imageUrl), arrayList);
                if (!this.buttons.isEmpty()) {
                    smw0.x("buttons=", arrayList, this.buttons);
                }
                return a.X(arrayList, Extension.FIX_SPACE, "TImage{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m608newBuilder();
            }

            public TImage() {
                this(null, null, null, 7, null);
            }

            public TImage(String str, List<TButton> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.imageUrl = str;
                this.buttons = Internal.immutableCopyOf("buttons", list);
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m606newBuilder();
        }

        public TShowFullscreenImageGalleryDirective() {
            this(null, 0, null, null, 15, null);
        }

        public TShowFullscreenImageGalleryDirective(String str, int i, List<TImage> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.currentImage = i;
            this.images = Internal.immutableCopyOf("images", list);
        }
    }

    @SpeechKitNameOption("show_modal_directive")
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000234Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u0010/\u001a\u00020\u000fH\u0016J\b\u00100\u001a\u00020\u0004H\u0016Js\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u00102R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 R \u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010 R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010'\u0012\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010*¨\u00065"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowModalDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "type", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "preventClose", "", "showOnce", "buttons", "", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowModalDirective$TButton;", "showTimeout", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getType$annotations", "getType", "getTitle$annotations", "getTitle", "getDescription$annotations", "getDescription", "getPreventClose$annotations", "getPreventClose", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowOnce$annotations", "getShowOnce", "getShowTimeout$annotations", "getShowTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getButtons$annotations", "getButtons", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Lokio/ByteString;)Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowModalDirective;", "Companion", "TButton", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ShowModalDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TShowModalDirective extends Message {
        public static final ProtoAdapter<TShowModalDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowModalDirective$TButton#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
        private final List<TButton> buttons;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        private final String description;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "prevent_close", schemaIndex = 4, tag = 5)
        private final Boolean preventClose;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "show_once", schemaIndex = 5, tag = 6)
        private final Boolean showOnce;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "show_timeout", schemaIndex = 7, tag = 8)
        private final Integer showTimeout;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String type;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TShowModalDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TShowModalDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowModalDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowModalDirective decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    String str3 = null;
                    Boolean bool = null;
                    Boolean bool2 = null;
                    Integer num = null;
                    String str4 = str2;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TShowModalDirective(str, str4, str2, str3, bool, bool2, arrayList, num, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                str = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                str4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                str2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                str3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                bool = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 6:
                                bool2 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 7:
                                arrayList.add(TAliceChatCapability.TShowModalDirective.TButton.ADAPTER.decode(reader));
                                break;
                            case 8:
                                num = ProtoAdapter.UINT32.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TShowModalDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getType(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDescription());
                    ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getPreventClose());
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getShowOnce());
                    TAliceChatCapability.TShowModalDirective.TButton.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getButtons());
                    ProtoAdapter.UINT32.encodeWithTag(writer, 8, (int) value.getShowTimeout());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TShowModalDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (!jl40.l(value.getType(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getType());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                    }
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDescription()) + h;
                    ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                    return ProtoAdapter.UINT32.encodedSizeWithTag(8, value.getShowTimeout()) + TAliceChatCapability.TShowModalDirective.TButton.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getButtons()) + protoAdapter.encodedSizeWithTag(6, value.getShowOnce()) + protoAdapter.encodedSizeWithTag(5, value.getPreventClose()) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowModalDirective redact(TAliceChatCapability.TShowModalDirective value) {
                    return TAliceChatCapability.TShowModalDirective.copy$default(value, null, null, null, null, null, null, Internal.m133redactElements(value.getButtons(), TAliceChatCapability.TShowModalDirective.TButton.ADAPTER), null, ByteString.c, 191, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowModalDirective value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.UINT32.encodeWithTag(writer, 8, (int) value.getShowTimeout());
                    TAliceChatCapability.TShowModalDirective.TButton.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getButtons());
                    ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getShowOnce());
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getPreventClose());
                    ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, (int) value.getDescription());
                    if (!jl40.l(value.getTitle(), "")) {
                        protoAdapter2.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    if (!jl40.l(value.getType(), "")) {
                        protoAdapter2.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    protoAdapter2.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TShowModalDirective(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, List list, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? EmptyList.a : list, (i & 128) != 0 ? null : num, (i & 256) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TShowModalDirective copy$default(TShowModalDirective tShowModalDirective, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, List list, Integer num, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tShowModalDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tShowModalDirective.type;
            }
            if ((i & 4) != 0) {
                str3 = tShowModalDirective.title;
            }
            if ((i & 8) != 0) {
                str4 = tShowModalDirective.description;
            }
            if ((i & 16) != 0) {
                bool = tShowModalDirective.preventClose;
            }
            if ((i & 32) != 0) {
                bool2 = tShowModalDirective.showOnce;
            }
            if ((i & 64) != 0) {
                list = tShowModalDirective.buttons;
            }
            if ((i & 128) != 0) {
                num = tShowModalDirective.showTimeout;
            }
            if ((i & 256) != 0) {
                byteString = tShowModalDirective.unknownFields();
            }
            Integer num2 = num;
            ByteString byteString2 = byteString;
            Boolean bool3 = bool2;
            List list2 = list;
            Boolean bool4 = bool;
            String str5 = str3;
            return tShowModalDirective.copy(str, str2, str5, str4, bool4, bool3, list2, num2, byteString2);
        }

        @ColumnNameOption("buttons")
        public static /* synthetic */ void getButtons$annotations() {
        }

        @ColumnNameOption(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
        public static /* synthetic */ void getDescription$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("prevent_close")
        public static /* synthetic */ void getPreventClose$annotations() {
        }

        @ColumnNameOption("show_once")
        public static /* synthetic */ void getShowOnce$annotations() {
        }

        @ColumnNameOption("show_timeout")
        public static /* synthetic */ void getShowTimeout$annotations() {
        }

        @ColumnNameOption("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        @ColumnNameOption("type")
        public static /* synthetic */ void getType$annotations() {
        }

        public final TShowModalDirective copy(String name, String type, String title, String description, Boolean preventClose, Boolean showOnce, List<TButton> buttons, Integer showTimeout, ByteString unknownFields) {
            return new TShowModalDirective(name, type, title, description, preventClose, showOnce, buttons, showTimeout, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TShowModalDirective)) {
                return false;
            }
            TShowModalDirective tShowModalDirective = (TShowModalDirective) other;
            return jl40.l(unknownFields(), tShowModalDirective.unknownFields()) && jl40.l(this.name, tShowModalDirective.name) && jl40.l(this.type, tShowModalDirective.type) && jl40.l(this.title, tShowModalDirective.title) && jl40.l(this.description, tShowModalDirective.description) && jl40.l(this.preventClose, tShowModalDirective.preventClose) && jl40.l(this.showOnce, tShowModalDirective.showOnce) && jl40.l(this.buttons, tShowModalDirective.buttons) && jl40.l(this.showTimeout, tShowModalDirective.showTimeout);
        }

        public final List<TButton> getButtons() {
            return this.buttons;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public final Boolean getPreventClose() {
            return this.preventClose;
        }

        public final Boolean getShowOnce() {
            return this.showOnce;
        }

        public final Integer getShowTimeout() {
            return this.showTimeout;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.type), 37, this.title);
            String str = this.description;
            int hashCode = (b + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.preventClose;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.showOnce;
            int c = unr0.c((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37, 37, this.buttons);
            Integer num = this.showTimeout;
            int hashCode3 = c + (num != null ? num.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m609newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("type=", Internal.sanitize(this.type), arrayList);
            unr0.B("title=", Internal.sanitize(this.title), arrayList);
            String str = this.description;
            if (str != null) {
                unr0.B("description=", Internal.sanitize(str), arrayList);
            }
            Boolean bool = this.preventClose;
            if (bool != null) {
                arrayList.add("preventClose=" + bool);
            }
            Boolean bool2 = this.showOnce;
            if (bool2 != null) {
                arrayList.add("showOnce=" + bool2);
            }
            if (!this.buttons.isEmpty()) {
                smw0.x("buttons=", arrayList, this.buttons);
            }
            Integer num = this.showTimeout;
            if (num != null) {
                arrayList.add("showTimeout=" + num);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TShowModalDirective{", "}", null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowModalDirective$TButton;", "Lcom/squareup/wire/Message;", "", "text", "", "actions", "", "Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getText$annotations", "()V", "getText", "()Ljava/lang/String;", "getActions$annotations", "getActions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TButton extends Message {
            public static final ProtoAdapter<TButton> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 3)
            private final List<TDirective> actions;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String text;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TButton.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TButton>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowModalDirective$TButton$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowModalDirective.TButton decode(ProtoReader reader) {
                        ArrayList arrayList = new ArrayList();
                        long beginMessage = reader.beginMessage();
                        String str = "";
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceChatCapability.TShowModalDirective.TButton(str, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                arrayList.add(TDirective.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, TAliceChatCapability.TShowModalDirective.TButton value) {
                        if (!jl40.l(value.getText(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                        }
                        TDirective.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getActions());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceChatCapability.TShowModalDirective.TButton value) {
                        int h = value.unknownFields().h();
                        if (!jl40.l(value.getText(), "")) {
                            h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                        }
                        return TDirective.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getActions()) + h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowModalDirective.TButton redact(TAliceChatCapability.TShowModalDirective.TButton value) {
                        return TAliceChatCapability.TShowModalDirective.TButton.copy$default(value, null, Internal.m133redactElements(value.getActions(), TDirective.ADAPTER), ByteString.c, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowModalDirective.TButton value) {
                        writer.writeBytes(value.unknownFields());
                        TDirective.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getActions());
                        if (jl40.l(value.getText(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                    }
                };
            }

            public /* synthetic */ TButton(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EmptyList.a : list, (i & 4) != 0 ? ByteString.c : byteString);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TButton copy$default(TButton tButton, String str, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tButton.text;
                }
                if ((i & 2) != 0) {
                    list = tButton.actions;
                }
                if ((i & 4) != 0) {
                    byteString = tButton.unknownFields();
                }
                return tButton.copy(str, list, byteString);
            }

            @ColumnNameOption("actions")
            public static /* synthetic */ void getActions$annotations() {
            }

            @ColumnNameOption("text")
            public static /* synthetic */ void getText$annotations() {
            }

            public final TButton copy(String text, List<TDirective> actions, ByteString unknownFields) {
                return new TButton(text, actions, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TButton)) {
                    return false;
                }
                TButton tButton = (TButton) other;
                return jl40.l(unknownFields(), tButton.unknownFields()) && jl40.l(this.text, tButton.text) && jl40.l(this.actions, tButton.actions);
            }

            public final List<TDirective> getActions() {
                return this.actions;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.actions.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.text);
                this.hashCode = hashCode;
                return hashCode;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m610newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                unr0.B("text=", Internal.sanitize(this.text), arrayList);
                if (!this.actions.isEmpty()) {
                    smw0.x("actions=", arrayList, this.actions);
                }
                return a.X(arrayList, Extension.FIX_SPACE, "TButton{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m610newBuilder();
            }

            public TButton() {
                this(null, null, null, 7, null);
            }

            public TButton(String str, List<TDirective> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.text = str;
                this.actions = Internal.immutableCopyOf("actions", list);
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m609newBuilder();
        }

        public TShowModalDirective() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public TShowModalDirective(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, List<TButton> list, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.type = str2;
            this.title = str3;
            this.description = str4;
            this.preventClose = bool;
            this.showOnce = bool2;
            this.showTimeout = num;
            this.buttons = Internal.immutableCopyOf("buttons", list);
        }
    }

    @SpeechKitNameOption("show_notification_directive")
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003456Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010,\u001a\u00020\u0002H\u0017J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u00020\u0010H\u0016J\b\u00101\u001a\u00020\u0004H\u0016Jw\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u00103R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010&\u0012\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%R\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010)R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010)¨\u00067"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowNotificationDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "type", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "showOnce", "", "buttons", "", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowNotificationDirective$TButton;", "links", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowNotificationDirective$TLink;", "showTimeout", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getType$annotations", "getType", "getTitle$annotations", "getTitle", "getDescription$annotations", "getDescription", "getShowOnce$annotations", "getShowOnce", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowTimeout$annotations", "getShowTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getButtons$annotations", "getButtons", "()Ljava/util/List;", "getLinks$annotations", "getLinks", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lokio/ByteString;)Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowNotificationDirective;", "Companion", "TButton", "TLink", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ShowNotificationDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TShowNotificationDirective extends Message {
        public static final ProtoAdapter<TShowNotificationDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowNotificationDirective$TButton#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
        private final List<TButton> buttons;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        private final String description;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowNotificationDirective$TLink#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
        private final List<TLink> links;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "show_once", schemaIndex = 4, tag = 5)
        private final Boolean showOnce;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "show_timeout", schemaIndex = 7, tag = 8)
        private final Integer showTimeout;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String type;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TShowNotificationDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TShowNotificationDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowNotificationDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowNotificationDirective decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    String str3 = null;
                    Boolean bool = null;
                    Integer num = null;
                    String str4 = str2;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TShowNotificationDirective(str, str4, str2, str3, bool, arrayList, arrayList2, num, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                str = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                str4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                str2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                str3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                bool = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 6:
                                arrayList.add(TAliceChatCapability.TShowNotificationDirective.TButton.ADAPTER.decode(reader));
                                break;
                            case 7:
                                arrayList2.add(TAliceChatCapability.TShowNotificationDirective.TLink.ADAPTER.decode(reader));
                                break;
                            case 8:
                                num = ProtoAdapter.UINT32.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TShowNotificationDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getType(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDescription());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getShowOnce());
                    TAliceChatCapability.TShowNotificationDirective.TButton.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getButtons());
                    TAliceChatCapability.TShowNotificationDirective.TLink.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getLinks());
                    ProtoAdapter.UINT32.encodeWithTag(writer, 8, (int) value.getShowTimeout());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TShowNotificationDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (!jl40.l(value.getType(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getType());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                    }
                    return ProtoAdapter.UINT32.encodedSizeWithTag(8, value.getShowTimeout()) + TAliceChatCapability.TShowNotificationDirective.TLink.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getLinks()) + TAliceChatCapability.TShowNotificationDirective.TButton.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getButtons()) + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.getShowOnce()) + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDescription()) + h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowNotificationDirective redact(TAliceChatCapability.TShowNotificationDirective value) {
                    return TAliceChatCapability.TShowNotificationDirective.copy$default(value, null, null, null, null, null, Internal.m133redactElements(value.getButtons(), TAliceChatCapability.TShowNotificationDirective.TButton.ADAPTER), Internal.m133redactElements(value.getLinks(), TAliceChatCapability.TShowNotificationDirective.TLink.ADAPTER), null, ByteString.c, 159, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowNotificationDirective value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.UINT32.encodeWithTag(writer, 8, (int) value.getShowTimeout());
                    TAliceChatCapability.TShowNotificationDirective.TLink.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getLinks());
                    TAliceChatCapability.TShowNotificationDirective.TButton.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getButtons());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) value.getShowOnce());
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription());
                    if (!jl40.l(value.getTitle(), "")) {
                        protoAdapter.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    if (!jl40.l(value.getType(), "")) {
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getType());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TShowNotificationDirective(String str, String str2, String str3, String str4, Boolean bool, List list, List list2, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, bool, r13 != 0 ? r1 : list, (i & 64) != 0 ? r1 : list2, (i & 128) != 0 ? null : num, (i & 256) != 0 ? ByteString.c : byteString);
            str = (i & 1) != 0 ? "" : str;
            str2 = (i & 2) != 0 ? "" : str2;
            str3 = (i & 4) != 0 ? "" : str3;
            str4 = (i & 8) != 0 ? null : str4;
            bool = (i & 16) != 0 ? null : bool;
            int i2 = i & 32;
            EmptyList emptyList = EmptyList.a;
        }

        public static /* synthetic */ TShowNotificationDirective copy$default(TShowNotificationDirective tShowNotificationDirective, String str, String str2, String str3, String str4, Boolean bool, List list, List list2, Integer num, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tShowNotificationDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tShowNotificationDirective.type;
            }
            if ((i & 4) != 0) {
                str3 = tShowNotificationDirective.title;
            }
            if ((i & 8) != 0) {
                str4 = tShowNotificationDirective.description;
            }
            if ((i & 16) != 0) {
                bool = tShowNotificationDirective.showOnce;
            }
            if ((i & 32) != 0) {
                list = tShowNotificationDirective.buttons;
            }
            if ((i & 64) != 0) {
                list2 = tShowNotificationDirective.links;
            }
            if ((i & 128) != 0) {
                num = tShowNotificationDirective.showTimeout;
            }
            if ((i & 256) != 0) {
                byteString = tShowNotificationDirective.unknownFields();
            }
            Integer num2 = num;
            ByteString byteString2 = byteString;
            List list3 = list;
            List list4 = list2;
            Boolean bool2 = bool;
            String str5 = str3;
            return tShowNotificationDirective.copy(str, str2, str5, str4, bool2, list3, list4, num2, byteString2);
        }

        @ColumnNameOption("buttons")
        public static /* synthetic */ void getButtons$annotations() {
        }

        @ColumnNameOption(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
        public static /* synthetic */ void getDescription$annotations() {
        }

        @ColumnNameOption("links")
        public static /* synthetic */ void getLinks$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("show_once")
        public static /* synthetic */ void getShowOnce$annotations() {
        }

        @ColumnNameOption("show_timeout")
        public static /* synthetic */ void getShowTimeout$annotations() {
        }

        @ColumnNameOption("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        @ColumnNameOption("type")
        public static /* synthetic */ void getType$annotations() {
        }

        public final TShowNotificationDirective copy(String name, String type, String title, String description, Boolean showOnce, List<TButton> buttons, List<TLink> links, Integer showTimeout, ByteString unknownFields) {
            return new TShowNotificationDirective(name, type, title, description, showOnce, buttons, links, showTimeout, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TShowNotificationDirective)) {
                return false;
            }
            TShowNotificationDirective tShowNotificationDirective = (TShowNotificationDirective) other;
            return jl40.l(unknownFields(), tShowNotificationDirective.unknownFields()) && jl40.l(this.name, tShowNotificationDirective.name) && jl40.l(this.type, tShowNotificationDirective.type) && jl40.l(this.title, tShowNotificationDirective.title) && jl40.l(this.description, tShowNotificationDirective.description) && jl40.l(this.showOnce, tShowNotificationDirective.showOnce) && jl40.l(this.buttons, tShowNotificationDirective.buttons) && jl40.l(this.links, tShowNotificationDirective.links) && jl40.l(this.showTimeout, tShowNotificationDirective.showTimeout);
        }

        public final List<TButton> getButtons() {
            return this.buttons;
        }

        public final String getDescription() {
            return this.description;
        }

        public final List<TLink> getLinks() {
            return this.links;
        }

        public final String getName() {
            return this.name;
        }

        public final Boolean getShowOnce() {
            return this.showOnce;
        }

        public final Integer getShowTimeout() {
            return this.showTimeout;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.type), 37, this.title);
            String str = this.description;
            int hashCode = (b + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.showOnce;
            int c = unr0.c(unr0.c((hashCode + (bool != null ? bool.hashCode() : 0)) * 37, 37, this.buttons), 37, this.links);
            Integer num = this.showTimeout;
            int hashCode2 = c + (num != null ? num.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m611newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("type=", Internal.sanitize(this.type), arrayList);
            unr0.B("title=", Internal.sanitize(this.title), arrayList);
            String str = this.description;
            if (str != null) {
                unr0.B("description=", Internal.sanitize(str), arrayList);
            }
            Boolean bool = this.showOnce;
            if (bool != null) {
                arrayList.add("showOnce=" + bool);
            }
            if (!this.buttons.isEmpty()) {
                smw0.x("buttons=", arrayList, this.buttons);
            }
            if (!this.links.isEmpty()) {
                smw0.x("links=", arrayList, this.links);
            }
            Integer num = this.showTimeout;
            if (num != null) {
                arrayList.add("showTimeout=" + num);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TShowNotificationDirective{", "}", null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowNotificationDirective$TButton;", "Lcom/squareup/wire/Message;", "", "text", "", "actions", "", "Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getText$annotations", "()V", "getText", "()Ljava/lang/String;", "getActions$annotations", "getActions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TButton extends Message {
            public static final ProtoAdapter<TButton> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
            private final List<TDirective> actions;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String text;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TButton.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TButton>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowNotificationDirective$TButton$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowNotificationDirective.TButton decode(ProtoReader reader) {
                        ArrayList arrayList = new ArrayList();
                        long beginMessage = reader.beginMessage();
                        String str = "";
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceChatCapability.TShowNotificationDirective.TButton(str, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                arrayList.add(TDirective.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, TAliceChatCapability.TShowNotificationDirective.TButton value) {
                        if (!jl40.l(value.getText(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                        }
                        TDirective.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getActions());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceChatCapability.TShowNotificationDirective.TButton value) {
                        int h = value.unknownFields().h();
                        if (!jl40.l(value.getText(), "")) {
                            h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                        }
                        return TDirective.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getActions()) + h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowNotificationDirective.TButton redact(TAliceChatCapability.TShowNotificationDirective.TButton value) {
                        return TAliceChatCapability.TShowNotificationDirective.TButton.copy$default(value, null, Internal.m133redactElements(value.getActions(), TDirective.ADAPTER), ByteString.c, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowNotificationDirective.TButton value) {
                        writer.writeBytes(value.unknownFields());
                        TDirective.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getActions());
                        if (jl40.l(value.getText(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                    }
                };
            }

            public /* synthetic */ TButton(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EmptyList.a : list, (i & 4) != 0 ? ByteString.c : byteString);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TButton copy$default(TButton tButton, String str, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tButton.text;
                }
                if ((i & 2) != 0) {
                    list = tButton.actions;
                }
                if ((i & 4) != 0) {
                    byteString = tButton.unknownFields();
                }
                return tButton.copy(str, list, byteString);
            }

            @ColumnNameOption("actions")
            public static /* synthetic */ void getActions$annotations() {
            }

            @ColumnNameOption("text")
            public static /* synthetic */ void getText$annotations() {
            }

            public final TButton copy(String text, List<TDirective> actions, ByteString unknownFields) {
                return new TButton(text, actions, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TButton)) {
                    return false;
                }
                TButton tButton = (TButton) other;
                return jl40.l(unknownFields(), tButton.unknownFields()) && jl40.l(this.text, tButton.text) && jl40.l(this.actions, tButton.actions);
            }

            public final List<TDirective> getActions() {
                return this.actions;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.actions.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.text);
                this.hashCode = hashCode;
                return hashCode;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m612newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                unr0.B("text=", Internal.sanitize(this.text), arrayList);
                if (!this.actions.isEmpty()) {
                    smw0.x("actions=", arrayList, this.actions);
                }
                return a.X(arrayList, Extension.FIX_SPACE, "TButton{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m612newBuilder();
            }

            public TButton() {
                this(null, null, null, 7, null);
            }

            public TButton(String str, List<TDirective> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.text = str;
                this.actions = Internal.immutableCopyOf("actions", list);
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J6\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowNotificationDirective$TLink;", "Lcom/squareup/wire/Message;", "", "text", "", "href", "actions", "", "Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getText$annotations", "()V", "getText", "()Ljava/lang/String;", "getHref$annotations", "getHref", "getActions$annotations", "getActions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
        public static final class TLink extends Message {
            public static final ProtoAdapter<TLink> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
            private final List<TDirective> actions;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            private final String href;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String text;

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final g0c a = qoi0.a(TLink.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TLink>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowNotificationDirective$TLink$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowNotificationDirective.TLink decode(ProtoReader reader) {
                        ArrayList arrayList = new ArrayList();
                        long beginMessage = reader.beginMessage();
                        String str = "";
                        String str2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new TAliceChatCapability.TShowNotificationDirective.TLink(str, str2, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                str2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                arrayList.add(TDirective.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, TAliceChatCapability.TShowNotificationDirective.TLink value) {
                        if (!jl40.l(value.getText(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHref());
                        TDirective.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getActions());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(TAliceChatCapability.TShowNotificationDirective.TLink value) {
                        int h = value.unknownFields().h();
                        if (!jl40.l(value.getText(), "")) {
                            h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                        }
                        return TDirective.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getActions()) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHref()) + h;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public TAliceChatCapability.TShowNotificationDirective.TLink redact(TAliceChatCapability.TShowNotificationDirective.TLink value) {
                        return TAliceChatCapability.TShowNotificationDirective.TLink.copy$default(value, null, null, Internal.m133redactElements(value.getActions(), TDirective.ADAPTER), ByteString.c, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowNotificationDirective.TLink value) {
                        writer.writeBytes(value.unknownFields());
                        TDirective.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getActions());
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getHref());
                        if (jl40.l(value.getText(), "")) {
                            return;
                        }
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getText());
                    }
                };
            }

            public /* synthetic */ TLink(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? EmptyList.a : list, (i & 8) != 0 ? ByteString.c : byteString);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TLink copy$default(TLink tLink, String str, String str2, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tLink.text;
                }
                if ((i & 2) != 0) {
                    str2 = tLink.href;
                }
                if ((i & 4) != 0) {
                    list = tLink.actions;
                }
                if ((i & 8) != 0) {
                    byteString = tLink.unknownFields();
                }
                return tLink.copy(str, str2, list, byteString);
            }

            @ColumnNameOption("actions")
            public static /* synthetic */ void getActions$annotations() {
            }

            @ColumnNameOption("href")
            public static /* synthetic */ void getHref$annotations() {
            }

            @ColumnNameOption("text")
            public static /* synthetic */ void getText$annotations() {
            }

            public final TLink copy(String text, String href, List<TDirective> actions, ByteString unknownFields) {
                return new TLink(text, href, actions, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TLink)) {
                    return false;
                }
                TLink tLink = (TLink) other;
                return jl40.l(unknownFields(), tLink.unknownFields()) && jl40.l(this.text, tLink.text) && jl40.l(this.href, tLink.href) && jl40.l(this.actions, tLink.actions);
            }

            public final List<TDirective> getActions() {
                return this.actions;
            }

            public final String getHref() {
                return this.href;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int b = unr0.b(unknownFields().hashCode() * 37, 37, this.text);
                String str = this.href;
                int hashCode = this.actions.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @jxi
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m613newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                unr0.B("text=", Internal.sanitize(this.text), arrayList);
                String str = this.href;
                if (str != null) {
                    unr0.B("href=", Internal.sanitize(str), arrayList);
                }
                if (!this.actions.isEmpty()) {
                    smw0.x("actions=", arrayList, this.actions);
                }
                return a.X(arrayList, Extension.FIX_SPACE, "TLink{", "}", null, 56);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m613newBuilder();
            }

            public TLink() {
                this(null, null, null, null, 15, null);
            }

            public TLink(String str, String str2, List<TDirective> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.text = str;
                this.href = str2;
                this.actions = Internal.immutableCopyOf("actions", list);
            }
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m611newBuilder();
        }

        public TShowNotificationDirective() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public TShowNotificationDirective(String str, String str2, String str3, String str4, Boolean bool, List<TButton> list, List<TLink> list2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.type = str2;
            this.title = str3;
            this.description = str4;
            this.showOnce = bool;
            this.showTimeout = num;
            this.buttons = Internal.immutableCopyOf("buttons", list);
            this.links = Internal.immutableCopyOf("links", list2);
        }
    }

    @SpeechKitNameOption("chat_navigate_back_directive")
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigateBackDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "navigationEntryId", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getNavigationEntryId$annotations", "getNavigationEntryId", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ChatNavigateBackDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TChatNavigateBackDirective extends Message {
        public static final ProtoAdapter<TChatNavigateBackDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "navigation_entry_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String navigationEntryId;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TChatNavigateBackDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TChatNavigateBackDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TChatNavigateBackDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TChatNavigateBackDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TChatNavigateBackDirective(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, TAliceChatCapability.TChatNavigateBackDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getNavigationEntryId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNavigationEntryId());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TChatNavigateBackDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return !jl40.l(value.getNavigationEntryId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNavigationEntryId()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TChatNavigateBackDirective redact(TAliceChatCapability.TChatNavigateBackDirective value) {
                    return TAliceChatCapability.TChatNavigateBackDirective.copy$default(value, null, null, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TChatNavigateBackDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getNavigationEntryId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNavigationEntryId());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TChatNavigateBackDirective(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TChatNavigateBackDirective copy$default(TChatNavigateBackDirective tChatNavigateBackDirective, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tChatNavigateBackDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tChatNavigateBackDirective.navigationEntryId;
            }
            if ((i & 4) != 0) {
                byteString = tChatNavigateBackDirective.unknownFields();
            }
            return tChatNavigateBackDirective.copy(str, str2, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("navigation_entry_id")
        public static /* synthetic */ void getNavigationEntryId$annotations() {
        }

        public final TChatNavigateBackDirective copy(String name, String navigationEntryId, ByteString unknownFields) {
            return new TChatNavigateBackDirective(name, navigationEntryId, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TChatNavigateBackDirective)) {
                return false;
            }
            TChatNavigateBackDirective tChatNavigateBackDirective = (TChatNavigateBackDirective) other;
            return jl40.l(unknownFields(), tChatNavigateBackDirective.unknownFields()) && jl40.l(this.name, tChatNavigateBackDirective.name) && jl40.l(this.navigationEntryId, tChatNavigateBackDirective.navigationEntryId);
        }

        public final String getName() {
            return this.name;
        }

        public final String getNavigationEntryId() {
            return this.navigationEntryId;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.navigationEntryId.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m587newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("navigationEntryId=", Internal.sanitize(this.navigationEntryId), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TChatNavigateBackDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m587newBuilder();
        }

        public TChatNavigateBackDirective() {
            this(null, null, null, 7, null);
        }

        public TChatNavigateBackDirective(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.navigationEntryId = str2;
        }
    }

    @SpeechKitNameOption("create_new_chat_directive")
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TCreateNewChatDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.CreateNewChatDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TCreateNewChatDirective extends Message {
        public static final ProtoAdapter<TCreateNewChatDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TCreateNewChatDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TCreateNewChatDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TCreateNewChatDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TCreateNewChatDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TCreateNewChatDirective(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TCreateNewChatDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TCreateNewChatDirective value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getName(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TCreateNewChatDirective redact(TAliceChatCapability.TCreateNewChatDirective value) {
                    return TAliceChatCapability.TCreateNewChatDirective.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TCreateNewChatDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TCreateNewChatDirective(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TCreateNewChatDirective copy$default(TCreateNewChatDirective tCreateNewChatDirective, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tCreateNewChatDirective.name;
            }
            if ((i & 2) != 0) {
                byteString = tCreateNewChatDirective.unknownFields();
            }
            return tCreateNewChatDirective.copy(str, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TCreateNewChatDirective copy(String name, ByteString unknownFields) {
            return new TCreateNewChatDirective(name, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TCreateNewChatDirective)) {
                return false;
            }
            TCreateNewChatDirective tCreateNewChatDirective = (TCreateNewChatDirective) other;
            return jl40.l(unknownFields(), tCreateNewChatDirective.unknownFields()) && jl40.l(this.name, tCreateNewChatDirective.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.name.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m589newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TCreateNewChatDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m589newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TCreateNewChatDirective() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TCreateNewChatDirective(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
        }
    }

    @SpeechKitNameOption("download_image_directive")
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TDownloadImageDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "imageUrl", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getImageUrl$annotations", "getImageUrl", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.DownloadImageDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TDownloadImageDirective extends Message {
        public static final ProtoAdapter<TDownloadImageDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "image_url", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String imageUrl;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TDownloadImageDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TDownloadImageDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TDownloadImageDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TDownloadImageDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TDownloadImageDirective(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, TAliceChatCapability.TDownloadImageDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getImageUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getImageUrl());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TDownloadImageDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return !jl40.l(value.getImageUrl(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getImageUrl()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TDownloadImageDirective redact(TAliceChatCapability.TDownloadImageDirective value) {
                    return TAliceChatCapability.TDownloadImageDirective.copy$default(value, null, null, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TDownloadImageDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getImageUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getImageUrl());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TDownloadImageDirective(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TDownloadImageDirective copy$default(TDownloadImageDirective tDownloadImageDirective, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tDownloadImageDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tDownloadImageDirective.imageUrl;
            }
            if ((i & 4) != 0) {
                byteString = tDownloadImageDirective.unknownFields();
            }
            return tDownloadImageDirective.copy(str, str2, byteString);
        }

        @ColumnNameOption("image_url")
        public static /* synthetic */ void getImageUrl$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TDownloadImageDirective copy(String name, String imageUrl, ByteString unknownFields) {
            return new TDownloadImageDirective(name, imageUrl, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TDownloadImageDirective)) {
                return false;
            }
            TDownloadImageDirective tDownloadImageDirective = (TDownloadImageDirective) other;
            return jl40.l(unknownFields(), tDownloadImageDirective.unknownFields()) && jl40.l(this.name, tDownloadImageDirective.name) && jl40.l(this.imageUrl, tDownloadImageDirective.imageUrl);
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.imageUrl.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m590newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("imageUrl=", Internal.sanitize(this.imageUrl), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TDownloadImageDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m590newBuilder();
        }

        public TDownloadImageDirective() {
            this(null, null, null, 7, null);
        }

        public TDownloadImageDirective(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.imageUrl = str2;
        }
    }

    @SpeechKitNameOption("few_requests_left_banner_directive")
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u0006%"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TFewRequestsLeftBannerDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "requestsUsed", "", "requestsLimit", "refreshTimestampSeconds", "text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;JJJLjava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getRequestsUsed$annotations", "getRequestsUsed", "()J", "getRequestsLimit$annotations", "getRequestsLimit", "getRefreshTimestampSeconds$annotations", "getRefreshTimestampSeconds", "getText$annotations", "getText", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.FewRequestsLeftBannerDirective)
    /* loaded from: classes4.dex */
    public static final class TFewRequestsLeftBannerDirective extends Message {
        public static final ProtoAdapter<TFewRequestsLeftBannerDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "refresh_timestamp_seconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final long refreshTimestampSeconds;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "requests_limit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final long requestsLimit;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "requests_used", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final long requestsUsed;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String text;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TFewRequestsLeftBannerDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TFewRequestsLeftBannerDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TFewRequestsLeftBannerDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TFewRequestsLeftBannerDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    long j = 0;
                    long j2 = 0;
                    long j3 = 0;
                    String str2 = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TFewRequestsLeftBannerDirective(str, j, j2, j3, str2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            j = ProtoAdapter.UINT64.decode(reader).longValue();
                        } else if (nextTag == 3) {
                            j2 = ProtoAdapter.UINT64.decode(reader).longValue();
                        } else if (nextTag == 4) {
                            j3 = ProtoAdapter.UINT64.decode(reader).longValue();
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TFewRequestsLeftBannerDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (value.getRequestsUsed() != 0) {
                        ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getRequestsUsed()));
                    }
                    if (value.getRequestsLimit() != 0) {
                        ProtoAdapter.UINT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getRequestsLimit()));
                    }
                    if (value.getRefreshTimestampSeconds() != 0) {
                        ProtoAdapter.UINT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getRefreshTimestampSeconds()));
                    }
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getText());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TFewRequestsLeftBannerDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (value.getRequestsUsed() != 0) {
                        h += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getRequestsUsed()));
                    }
                    if (value.getRequestsLimit() != 0) {
                        h += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getRequestsLimit()));
                    }
                    if (value.getRefreshTimestampSeconds() != 0) {
                        h += ProtoAdapter.UINT64.encodedSizeWithTag(4, Long.valueOf(value.getRefreshTimestampSeconds()));
                    }
                    return !jl40.l(value.getText(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.getText()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TFewRequestsLeftBannerDirective redact(TAliceChatCapability.TFewRequestsLeftBannerDirective value) {
                    return TAliceChatCapability.TFewRequestsLeftBannerDirective.copy$default(value, null, 0L, 0L, 0L, null, ByteString.c, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TFewRequestsLeftBannerDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getText());
                    }
                    if (value.getRefreshTimestampSeconds() != 0) {
                        ProtoAdapter.UINT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getRefreshTimestampSeconds()));
                    }
                    if (value.getRequestsLimit() != 0) {
                        ProtoAdapter.UINT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getRequestsLimit()));
                    }
                    if (value.getRequestsUsed() != 0) {
                        ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getRequestsUsed()));
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TFewRequestsLeftBannerDirective(String str, long j, long j2, long j3, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TFewRequestsLeftBannerDirective copy$default(TFewRequestsLeftBannerDirective tFewRequestsLeftBannerDirective, String str, long j, long j2, long j3, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tFewRequestsLeftBannerDirective.name;
            }
            if ((i & 2) != 0) {
                j = tFewRequestsLeftBannerDirective.requestsUsed;
            }
            if ((i & 4) != 0) {
                j2 = tFewRequestsLeftBannerDirective.requestsLimit;
            }
            if ((i & 8) != 0) {
                j3 = tFewRequestsLeftBannerDirective.refreshTimestampSeconds;
            }
            if ((i & 16) != 0) {
                str2 = tFewRequestsLeftBannerDirective.text;
            }
            if ((i & 32) != 0) {
                byteString = tFewRequestsLeftBannerDirective.unknownFields();
            }
            long j4 = j3;
            long j5 = j2;
            return tFewRequestsLeftBannerDirective.copy(str, j, j5, j4, str2, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("refresh_timestamp_seconds")
        public static /* synthetic */ void getRefreshTimestampSeconds$annotations() {
        }

        @ColumnNameOption("requests_limit")
        public static /* synthetic */ void getRequestsLimit$annotations() {
        }

        @ColumnNameOption("requests_used")
        public static /* synthetic */ void getRequestsUsed$annotations() {
        }

        @ColumnNameOption("text")
        public static /* synthetic */ void getText$annotations() {
        }

        public final TFewRequestsLeftBannerDirective copy(String name, long requestsUsed, long requestsLimit, long refreshTimestampSeconds, String text, ByteString unknownFields) {
            return new TFewRequestsLeftBannerDirective(name, requestsUsed, requestsLimit, refreshTimestampSeconds, text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TFewRequestsLeftBannerDirective)) {
                return false;
            }
            TFewRequestsLeftBannerDirective tFewRequestsLeftBannerDirective = (TFewRequestsLeftBannerDirective) other;
            return jl40.l(unknownFields(), tFewRequestsLeftBannerDirective.unknownFields()) && jl40.l(this.name, tFewRequestsLeftBannerDirective.name) && this.requestsUsed == tFewRequestsLeftBannerDirective.requestsUsed && this.requestsLimit == tFewRequestsLeftBannerDirective.requestsLimit && this.refreshTimestampSeconds == tFewRequestsLeftBannerDirective.refreshTimestampSeconds && jl40.l(this.text, tFewRequestsLeftBannerDirective.text);
        }

        public final String getName() {
            return this.name;
        }

        public final long getRefreshTimestampSeconds() {
            return this.refreshTimestampSeconds;
        }

        public final long getRequestsLimit() {
            return this.requestsLimit;
        }

        public final long getRequestsUsed() {
            return this.requestsUsed;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.text.hashCode() + qv10.c(qv10.c(qv10.c(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.requestsUsed), 37, this.requestsLimit), 37, this.refreshTimestampSeconds);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m591newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            arrayList.add("requestsUsed=" + this.requestsUsed);
            arrayList.add("requestsLimit=" + this.requestsLimit);
            arrayList.add("refreshTimestampSeconds=" + this.refreshTimestampSeconds);
            unr0.B("text=", Internal.sanitize(this.text), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TFewRequestsLeftBannerDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m591newBuilder();
        }

        public TFewRequestsLeftBannerDirective() {
            this(null, 0L, 0L, 0L, null, null, 63, null);
        }

        public TFewRequestsLeftBannerDirective(String str, long j, long j2, long j3, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.requestsUsed = j;
            this.requestsLimit = j2;
            this.refreshTimestampSeconds = j3;
            this.text = str2;
        }
    }

    @SpeechKitNameOption("fill_chat_input_directive")
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TFillChatInputDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getText$annotations", "getText", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.FillChatInputDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TFillChatInputDirective extends Message {
        public static final ProtoAdapter<TFillChatInputDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String text;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TFillChatInputDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TFillChatInputDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TFillChatInputDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TFillChatInputDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TFillChatInputDirective(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, TAliceChatCapability.TFillChatInputDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TFillChatInputDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return !jl40.l(value.getText(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TFillChatInputDirective redact(TAliceChatCapability.TFillChatInputDirective value) {
                    return TAliceChatCapability.TFillChatInputDirective.copy$default(value, null, null, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TFillChatInputDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TFillChatInputDirective(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TFillChatInputDirective copy$default(TFillChatInputDirective tFillChatInputDirective, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tFillChatInputDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tFillChatInputDirective.text;
            }
            if ((i & 4) != 0) {
                byteString = tFillChatInputDirective.unknownFields();
            }
            return tFillChatInputDirective.copy(str, str2, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("text")
        @LanguageDependentOption(TLanguageDependent.EType.NlgText)
        public static /* synthetic */ void getText$annotations() {
        }

        public final TFillChatInputDirective copy(String name, String text, ByteString unknownFields) {
            return new TFillChatInputDirective(name, text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TFillChatInputDirective)) {
                return false;
            }
            TFillChatInputDirective tFillChatInputDirective = (TFillChatInputDirective) other;
            return jl40.l(unknownFields(), tFillChatInputDirective.unknownFields()) && jl40.l(this.name, tFillChatInputDirective.name) && jl40.l(this.text, tFillChatInputDirective.text);
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.text.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m592newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("text=", Internal.sanitize(this.text), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TFillChatInputDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m592newBuilder();
        }

        public TFillChatInputDirective() {
            this(null, null, null, 7, null);
        }

        public TFillChatInputDirective(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.text = str2;
        }
    }

    @SpeechKitNameOption("finish_chat_directive")
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TFinishChatDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.FinishChatDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TFinishChatDirective extends Message {
        public static final ProtoAdapter<TFinishChatDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TFinishChatDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TFinishChatDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TFinishChatDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TFinishChatDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TFinishChatDirective(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TFinishChatDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TFinishChatDirective value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getName(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TFinishChatDirective redact(TAliceChatCapability.TFinishChatDirective value) {
                    return TAliceChatCapability.TFinishChatDirective.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TFinishChatDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TFinishChatDirective(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TFinishChatDirective copy$default(TFinishChatDirective tFinishChatDirective, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tFinishChatDirective.name;
            }
            if ((i & 2) != 0) {
                byteString = tFinishChatDirective.unknownFields();
            }
            return tFinishChatDirective.copy(str, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TFinishChatDirective copy(String name, ByteString unknownFields) {
            return new TFinishChatDirective(name, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TFinishChatDirective)) {
                return false;
            }
            TFinishChatDirective tFinishChatDirective = (TFinishChatDirective) other;
            return jl40.l(unknownFields(), tFinishChatDirective.unknownFields()) && jl40.l(this.name, tFinishChatDirective.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.name.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m593newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TFinishChatDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m593newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TFinishChatDirective() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TFinishChatDirective(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
        }
    }

    @SpeechKitNameOption("limit_exceeded_banner_directive")
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TLimitExceededBannerDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "text", "title", "decision", "Lru/yandex/alice/cuttlefish/services/features_limiter/proto/api/quark/webchat/EDecision;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/alice/cuttlefish/services/features_limiter/proto/api/quark/webchat/EDecision;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getText$annotations", "getText", "getTitle$annotations", "getTitle", "getDecision$annotations", "getDecision", "()Lru/yandex/alice/cuttlefish/services/features_limiter/proto/api/quark/webchat/EDecision;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.LimitExceededBannerDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TLimitExceededBannerDirective extends Message {
        public static final ProtoAdapter<TLimitExceededBannerDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.cuttlefish.services.features_limiter.proto.api.quark.webchat.EDecision#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final EDecision decision;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String title;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TLimitExceededBannerDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TLimitExceededBannerDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TLimitExceededBannerDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TLimitExceededBannerDirective decode(ProtoReader reader) {
                    EDecision eDecision = EDecision.D_UNKNOWN;
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = str;
                    String str3 = str2;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TLimitExceededBannerDirective(str, str2, str3, eDecision, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            str3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                eDecision = EDecision.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TLimitExceededBannerDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    if (value.getDecision() != EDecision.D_UNKNOWN) {
                        EDecision.ADAPTER.encodeWithTag(writer, 4, (int) value.getDecision());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TLimitExceededBannerDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                    }
                    return value.getDecision() != EDecision.D_UNKNOWN ? EDecision.ADAPTER.encodedSizeWithTag(4, value.getDecision()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TLimitExceededBannerDirective redact(TAliceChatCapability.TLimitExceededBannerDirective value) {
                    return TAliceChatCapability.TLimitExceededBannerDirective.copy$default(value, null, null, null, null, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TLimitExceededBannerDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getDecision() != EDecision.D_UNKNOWN) {
                        EDecision.ADAPTER.encodeWithTag(writer, 4, (int) value.getDecision());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TLimitExceededBannerDirective(String str, String str2, String str3, EDecision eDecision, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? EDecision.D_UNKNOWN : eDecision, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TLimitExceededBannerDirective copy$default(TLimitExceededBannerDirective tLimitExceededBannerDirective, String str, String str2, String str3, EDecision eDecision, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tLimitExceededBannerDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tLimitExceededBannerDirective.text;
            }
            if ((i & 4) != 0) {
                str3 = tLimitExceededBannerDirective.title;
            }
            if ((i & 8) != 0) {
                eDecision = tLimitExceededBannerDirective.decision;
            }
            if ((i & 16) != 0) {
                byteString = tLimitExceededBannerDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str4 = str3;
            return tLimitExceededBannerDirective.copy(str, str2, str4, eDecision, byteString2);
        }

        @ColumnNameOption("decision")
        public static /* synthetic */ void getDecision$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("text")
        public static /* synthetic */ void getText$annotations() {
        }

        @ColumnNameOption("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        public final TLimitExceededBannerDirective copy(String name, String text, String title, EDecision decision, ByteString unknownFields) {
            return new TLimitExceededBannerDirective(name, text, title, decision, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TLimitExceededBannerDirective)) {
                return false;
            }
            TLimitExceededBannerDirective tLimitExceededBannerDirective = (TLimitExceededBannerDirective) other;
            return jl40.l(unknownFields(), tLimitExceededBannerDirective.unknownFields()) && jl40.l(this.name, tLimitExceededBannerDirective.name) && jl40.l(this.text, tLimitExceededBannerDirective.text) && jl40.l(this.title, tLimitExceededBannerDirective.title) && this.decision == tLimitExceededBannerDirective.decision;
        }

        public final EDecision getDecision() {
            return this.decision;
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.decision.hashCode() + unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.text), 37, this.title);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m594newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("text=", Internal.sanitize(this.text), arrayList);
            unr0.B("title=", Internal.sanitize(this.title), arrayList);
            arrayList.add("decision=" + this.decision);
            return a.X(arrayList, Extension.FIX_SPACE, "TLimitExceededBannerDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m594newBuilder();
        }

        public TLimitExceededBannerDirective() {
            this(null, null, null, null, null, 31, null);
        }

        public TLimitExceededBannerDirective(String str, String str2, String str3, EDecision eDecision, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.text = str2;
            this.title = str3;
            this.decision = eDecision;
        }
    }

    @SpeechKitNameOption("login_with_callback_directive")
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TLoginWithCallbackDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "text", "title", "callbacksDirectives", "", "Lru/yandex/alice/protos/api/alicekit/directives/quark/webchat/TDirective;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getText$annotations", "getText", "getTitle$annotations", "getTitle", "getCallbacksDirectives$annotations", "getCallbacksDirectives", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.LoginWithCallbackDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TLoginWithCallbackDirective extends Message {
        public static final ProtoAdapter<TLoginWithCallbackDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.api.alicekit.directives.quark.webchat.TDirective#ADAPTER", jsonName = "callbacks_directives", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        private final List<TDirective> callbacksDirectives;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String title;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TLoginWithCallbackDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TLoginWithCallbackDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TLoginWithCallbackDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TLoginWithCallbackDirective decode(ProtoReader reader) {
                    ArrayList arrayList = new ArrayList();
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    String str3 = str2;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TLoginWithCallbackDirective(str, str2, str3, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            str3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            arrayList.add(TDirective.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TLoginWithCallbackDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    TDirective.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getCallbacksDirectives());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TLoginWithCallbackDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                    }
                    return TDirective.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getCallbacksDirectives()) + h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TLoginWithCallbackDirective redact(TAliceChatCapability.TLoginWithCallbackDirective value) {
                    return TAliceChatCapability.TLoginWithCallbackDirective.copy$default(value, null, null, null, Internal.m133redactElements(value.getCallbacksDirectives(), TDirective.ADAPTER), ByteString.c, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TLoginWithCallbackDirective value) {
                    writer.writeBytes(value.unknownFields());
                    TDirective.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getCallbacksDirectives());
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TLoginWithCallbackDirective(String str, String str2, String str3, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? EmptyList.a : list, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TLoginWithCallbackDirective copy$default(TLoginWithCallbackDirective tLoginWithCallbackDirective, String str, String str2, String str3, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tLoginWithCallbackDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tLoginWithCallbackDirective.text;
            }
            if ((i & 4) != 0) {
                str3 = tLoginWithCallbackDirective.title;
            }
            if ((i & 8) != 0) {
                list = tLoginWithCallbackDirective.callbacksDirectives;
            }
            if ((i & 16) != 0) {
                byteString = tLoginWithCallbackDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str4 = str3;
            return tLoginWithCallbackDirective.copy(str, str2, str4, list, byteString2);
        }

        @ColumnNameOption("callbacks_directives")
        public static /* synthetic */ void getCallbacksDirectives$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("text")
        public static /* synthetic */ void getText$annotations() {
        }

        @ColumnNameOption("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        public final TLoginWithCallbackDirective copy(String name, String text, String title, List<TDirective> callbacksDirectives, ByteString unknownFields) {
            return new TLoginWithCallbackDirective(name, text, title, callbacksDirectives, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TLoginWithCallbackDirective)) {
                return false;
            }
            TLoginWithCallbackDirective tLoginWithCallbackDirective = (TLoginWithCallbackDirective) other;
            return jl40.l(unknownFields(), tLoginWithCallbackDirective.unknownFields()) && jl40.l(this.name, tLoginWithCallbackDirective.name) && jl40.l(this.text, tLoginWithCallbackDirective.text) && jl40.l(this.title, tLoginWithCallbackDirective.title) && jl40.l(this.callbacksDirectives, tLoginWithCallbackDirective.callbacksDirectives);
        }

        public final List<TDirective> getCallbacksDirectives() {
            return this.callbacksDirectives;
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.callbacksDirectives.hashCode() + unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.text), 37, this.title);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m595newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("text=", Internal.sanitize(this.text), arrayList);
            unr0.B("title=", Internal.sanitize(this.title), arrayList);
            if (!this.callbacksDirectives.isEmpty()) {
                smw0.x("callbacksDirectives=", arrayList, this.callbacksDirectives);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TLoginWithCallbackDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m595newBuilder();
        }

        public TLoginWithCallbackDirective() {
            this(null, null, null, null, null, 31, null);
        }

        public TLoginWithCallbackDirective(String str, String str2, String str3, List<TDirective> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.text = str2;
            this.title = str3;
            this.callbacksDirectives = Internal.immutableCopyOf("callbacksDirectives", list);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TNavigationState;", "Lcom/squareup/wire/Message;", "", "topmostNavigationEntry", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry;Lokio/ByteString;)V", "getTopmostNavigationEntry$annotations", "()V", "getTopmostNavigationEntry", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TChatNavigationEntry;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TNavigationState extends Message {
        public static final ProtoAdapter<TNavigationState> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TChatNavigationEntry#ADAPTER", jsonName = "topmost_navigation_entry", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final TChatNavigationEntry topmostNavigationEntry;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TNavigationState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TNavigationState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TNavigationState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TNavigationState decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    TAliceChatCapability.TChatNavigationEntry tChatNavigationEntry = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TNavigationState(tChatNavigationEntry, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            tChatNavigationEntry = TAliceChatCapability.TChatNavigationEntry.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TNavigationState value) {
                    if (value.getTopmostNavigationEntry() != null) {
                        TAliceChatCapability.TChatNavigationEntry.ADAPTER.encodeWithTag(writer, 1, (int) value.getTopmostNavigationEntry());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TNavigationState value) {
                    int h = value.unknownFields().h();
                    return value.getTopmostNavigationEntry() != null ? TAliceChatCapability.TChatNavigationEntry.ADAPTER.encodedSizeWithTag(1, value.getTopmostNavigationEntry()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TNavigationState redact(TAliceChatCapability.TNavigationState value) {
                    TAliceChatCapability.TChatNavigationEntry topmostNavigationEntry = value.getTopmostNavigationEntry();
                    return value.copy(topmostNavigationEntry != null ? TAliceChatCapability.TChatNavigationEntry.ADAPTER.redact(topmostNavigationEntry) : null, ByteString.c);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TNavigationState value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getTopmostNavigationEntry() != null) {
                        TAliceChatCapability.TChatNavigationEntry.ADAPTER.encodeWithTag(writer, 1, (int) value.getTopmostNavigationEntry());
                    }
                }
            };
        }

        public /* synthetic */ TNavigationState(TChatNavigationEntry tChatNavigationEntry, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tChatNavigationEntry, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TNavigationState copy$default(TNavigationState tNavigationState, TChatNavigationEntry tChatNavigationEntry, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                tChatNavigationEntry = tNavigationState.topmostNavigationEntry;
            }
            if ((i & 2) != 0) {
                byteString = tNavigationState.unknownFields();
            }
            return tNavigationState.copy(tChatNavigationEntry, byteString);
        }

        @ColumnNameOption("topmost_navigation_entry")
        public static /* synthetic */ void getTopmostNavigationEntry$annotations() {
        }

        public final TNavigationState copy(TChatNavigationEntry topmostNavigationEntry, ByteString unknownFields) {
            return new TNavigationState(topmostNavigationEntry, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TNavigationState)) {
                return false;
            }
            TNavigationState tNavigationState = (TNavigationState) other;
            return jl40.l(unknownFields(), tNavigationState.unknownFields()) && jl40.l(this.topmostNavigationEntry, tNavigationState.topmostNavigationEntry);
        }

        public final TChatNavigationEntry getTopmostNavigationEntry() {
            return this.topmostNavigationEntry;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TChatNavigationEntry tChatNavigationEntry = this.topmostNavigationEntry;
            int hashCode2 = hashCode + (tChatNavigationEntry != null ? tChatNavigationEntry.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m596newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            TChatNavigationEntry tChatNavigationEntry = this.topmostNavigationEntry;
            if (tChatNavigationEntry != null) {
                arrayList.add("topmostNavigationEntry=" + tChatNavigationEntry);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TNavigationState{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m596newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TNavigationState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TNavigationState(TChatNavigationEntry tChatNavigationEntry, ByteString byteString) {
            super(ADAPTER, byteString);
            this.topmostNavigationEntry = tChatNavigationEntry;
        }
    }

    @SpeechKitNameOption("open_chat_list_directive")
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TOpenChatListDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.OpenChatListDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TOpenChatListDirective extends Message {
        public static final ProtoAdapter<TOpenChatListDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TOpenChatListDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TOpenChatListDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TOpenChatListDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TOpenChatListDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TOpenChatListDirective(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TOpenChatListDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TOpenChatListDirective value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getName(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TOpenChatListDirective redact(TAliceChatCapability.TOpenChatListDirective value) {
                    return TAliceChatCapability.TOpenChatListDirective.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TOpenChatListDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TOpenChatListDirective(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TOpenChatListDirective copy$default(TOpenChatListDirective tOpenChatListDirective, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tOpenChatListDirective.name;
            }
            if ((i & 2) != 0) {
                byteString = tOpenChatListDirective.unknownFields();
            }
            return tOpenChatListDirective.copy(str, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TOpenChatListDirective copy(String name, ByteString unknownFields) {
            return new TOpenChatListDirective(name, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TOpenChatListDirective)) {
                return false;
            }
            TOpenChatListDirective tOpenChatListDirective = (TOpenChatListDirective) other;
            return jl40.l(unknownFields(), tOpenChatListDirective.unknownFields()) && jl40.l(this.name, tOpenChatListDirective.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.name.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m597newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TOpenChatListDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m597newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TOpenChatListDirective() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TOpenChatListDirective(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u001dR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TParameters;", "Lcom/squareup/wire/Message;", "", "supportsRichSuggests", "", "supportsRichAnswers", "supportsRichSummary", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)V", "getSupportsRichSuggests$annotations", "()V", "getSupportsRichSuggests", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSupportsRichAnswers$annotations", "getSupportsRichAnswers", "getSupportsRichSummary$annotations", "getSupportsRichSummary", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TParameters;", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TParameters extends Message {
        public static final ProtoAdapter<TParameters> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supports_rich_answers", schemaIndex = 1, tag = 2)
        private final Boolean supportsRichAnswers;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supports_rich_suggests", schemaIndex = 0, tag = 1)
        private final Boolean supportsRichSuggests;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supports_rich_summary", schemaIndex = 2, tag = 3)
        private final Boolean supportsRichSummary;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TParameters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TParameters>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TParameters$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TParameters decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    Boolean bool = null;
                    Boolean bool2 = null;
                    Boolean bool3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TParameters(bool, bool2, bool3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            bool = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag == 2) {
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            bool3 = ProtoAdapter.BOOL.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TParameters value) {
                    ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getSupportsRichSuggests());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSupportsRichAnswers());
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSupportsRichSummary());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TParameters value) {
                    int h = value.unknownFields().h();
                    ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                    return protoAdapter.encodedSizeWithTag(3, value.getSupportsRichSummary()) + protoAdapter.encodedSizeWithTag(2, value.getSupportsRichAnswers()) + protoAdapter.encodedSizeWithTag(1, value.getSupportsRichSuggests()) + h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TParameters redact(TAliceChatCapability.TParameters value) {
                    return TAliceChatCapability.TParameters.copy$default(value, null, null, null, ByteString.c, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TParameters value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSupportsRichSummary());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSupportsRichAnswers());
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getSupportsRichSuggests());
                }
            };
        }

        public /* synthetic */ TParameters(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TParameters copy$default(TParameters tParameters, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = tParameters.supportsRichSuggests;
            }
            if ((i & 2) != 0) {
                bool2 = tParameters.supportsRichAnswers;
            }
            if ((i & 4) != 0) {
                bool3 = tParameters.supportsRichSummary;
            }
            if ((i & 8) != 0) {
                byteString = tParameters.unknownFields();
            }
            return tParameters.copy(bool, bool2, bool3, byteString);
        }

        @ColumnNameOption("supports_rich_answers")
        public static /* synthetic */ void getSupportsRichAnswers$annotations() {
        }

        @ColumnNameOption("supports_rich_suggests")
        public static /* synthetic */ void getSupportsRichSuggests$annotations() {
        }

        @ColumnNameOption("supports_rich_summary")
        public static /* synthetic */ void getSupportsRichSummary$annotations() {
        }

        public final TParameters copy(Boolean supportsRichSuggests, Boolean supportsRichAnswers, Boolean supportsRichSummary, ByteString unknownFields) {
            return new TParameters(supportsRichSuggests, supportsRichAnswers, supportsRichSummary, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TParameters)) {
                return false;
            }
            TParameters tParameters = (TParameters) other;
            return jl40.l(unknownFields(), tParameters.unknownFields()) && jl40.l(this.supportsRichSuggests, tParameters.supportsRichSuggests) && jl40.l(this.supportsRichAnswers, tParameters.supportsRichAnswers) && jl40.l(this.supportsRichSummary, tParameters.supportsRichSummary);
        }

        public final Boolean getSupportsRichAnswers() {
            return this.supportsRichAnswers;
        }

        public final Boolean getSupportsRichSuggests() {
            return this.supportsRichSuggests;
        }

        public final Boolean getSupportsRichSummary() {
            return this.supportsRichSummary;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.supportsRichSuggests;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.supportsRichAnswers;
            int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            Boolean bool3 = this.supportsRichSummary;
            int hashCode4 = hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m599newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.supportsRichSuggests;
            if (bool != null) {
                arrayList.add("supportsRichSuggests=" + bool);
            }
            Boolean bool2 = this.supportsRichAnswers;
            if (bool2 != null) {
                arrayList.add("supportsRichAnswers=" + bool2);
            }
            Boolean bool3 = this.supportsRichSummary;
            if (bool3 != null) {
                arrayList.add("supportsRichSummary=" + bool3);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TParameters{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m599newBuilder();
        }

        public TParameters() {
            this(null, null, null, null, 15, null);
        }

        public TParameters(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.supportsRichSuggests = bool;
            this.supportsRichAnswers = bool2;
            this.supportsRichSummary = bool3;
        }
    }

    @SpeechKitNameOption("screenshot_taken_directive")
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TScreenshotTakenDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ScreenshotTakenDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TScreenshotTakenDirective extends Message {
        public static final ProtoAdapter<TScreenshotTakenDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TScreenshotTakenDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TScreenshotTakenDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TScreenshotTakenDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TScreenshotTakenDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TScreenshotTakenDirective(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TScreenshotTakenDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TScreenshotTakenDirective value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getName(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TScreenshotTakenDirective redact(TAliceChatCapability.TScreenshotTakenDirective value) {
                    return TAliceChatCapability.TScreenshotTakenDirective.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TScreenshotTakenDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TScreenshotTakenDirective(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TScreenshotTakenDirective copy$default(TScreenshotTakenDirective tScreenshotTakenDirective, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tScreenshotTakenDirective.name;
            }
            if ((i & 2) != 0) {
                byteString = tScreenshotTakenDirective.unknownFields();
            }
            return tScreenshotTakenDirective.copy(str, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TScreenshotTakenDirective copy(String name, ByteString unknownFields) {
            return new TScreenshotTakenDirective(name, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TScreenshotTakenDirective)) {
                return false;
            }
            TScreenshotTakenDirective tScreenshotTakenDirective = (TScreenshotTakenDirective) other;
            return jl40.l(unknownFields(), tScreenshotTakenDirective.unknownFields()) && jl40.l(this.name, tScreenshotTakenDirective.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.name.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m600newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TScreenshotTakenDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m600newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TScreenshotTakenDirective() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TScreenshotTakenDirective(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
        }
    }

    @SpeechKitNameOption("scroll_to_fragment_directive")
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JF\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TScrollToFragmentDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "contentUrl", "navigationToFragmentUrl", "textFragment", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TTextFragment;", "videoFragment", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TVideoFragment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TTextFragment;Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TVideoFragment;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getContentUrl$annotations", "getContentUrl", "getNavigationToFragmentUrl$annotations", "getNavigationToFragmentUrl", "getTextFragment$annotations", "getTextFragment", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TTextFragment;", "getVideoFragment$annotations", "getVideoFragment", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TVideoFragment;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ScrollToFragmentDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TScrollToFragmentDirective extends Message {
        public static final ProtoAdapter<TScrollToFragmentDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "content_url", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String contentUrl;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "navigation_to_fragment_url", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String navigationToFragmentUrl;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TTextFragment#ADAPTER", jsonName = "text_fragment", oneofName = "Fragment", schemaIndex = 3, tag = 4)
        private final TTextFragment textFragment;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TVideoFragment#ADAPTER", jsonName = "video_fragment", oneofName = "Fragment", schemaIndex = 4, tag = 5)
        private final TVideoFragment videoFragment;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TScrollToFragmentDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TScrollToFragmentDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TScrollToFragmentDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TScrollToFragmentDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    TAliceChatCapability.TTextFragment tTextFragment = null;
                    TAliceChatCapability.TVideoFragment tVideoFragment = null;
                    String str3 = str2;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TScrollToFragmentDirective(str, str3, str2, tTextFragment, tVideoFragment, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            str3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            tTextFragment = TAliceChatCapability.TTextFragment.ADAPTER.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            tVideoFragment = TAliceChatCapability.TVideoFragment.ADAPTER.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TScrollToFragmentDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getContentUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContentUrl());
                    }
                    if (!jl40.l(value.getNavigationToFragmentUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNavigationToFragmentUrl());
                    }
                    TAliceChatCapability.TTextFragment.ADAPTER.encodeWithTag(writer, 4, (int) value.getTextFragment());
                    TAliceChatCapability.TVideoFragment.ADAPTER.encodeWithTag(writer, 5, (int) value.getVideoFragment());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TScrollToFragmentDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (!jl40.l(value.getContentUrl(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContentUrl());
                    }
                    if (!jl40.l(value.getNavigationToFragmentUrl(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNavigationToFragmentUrl());
                    }
                    return TAliceChatCapability.TVideoFragment.ADAPTER.encodedSizeWithTag(5, value.getVideoFragment()) + TAliceChatCapability.TTextFragment.ADAPTER.encodedSizeWithTag(4, value.getTextFragment()) + h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TScrollToFragmentDirective redact(TAliceChatCapability.TScrollToFragmentDirective value) {
                    TAliceChatCapability.TTextFragment textFragment = value.getTextFragment();
                    TAliceChatCapability.TTextFragment redact = textFragment != null ? TAliceChatCapability.TTextFragment.ADAPTER.redact(textFragment) : null;
                    TAliceChatCapability.TVideoFragment videoFragment = value.getVideoFragment();
                    return TAliceChatCapability.TScrollToFragmentDirective.copy$default(value, null, null, null, redact, videoFragment != null ? TAliceChatCapability.TVideoFragment.ADAPTER.redact(videoFragment) : null, ByteString.c, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TScrollToFragmentDirective value) {
                    writer.writeBytes(value.unknownFields());
                    TAliceChatCapability.TVideoFragment.ADAPTER.encodeWithTag(writer, 5, (int) value.getVideoFragment());
                    TAliceChatCapability.TTextFragment.ADAPTER.encodeWithTag(writer, 4, (int) value.getTextFragment());
                    if (!jl40.l(value.getNavigationToFragmentUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNavigationToFragmentUrl());
                    }
                    if (!jl40.l(value.getContentUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContentUrl());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TScrollToFragmentDirective(String str, String str2, String str3, TTextFragment tTextFragment, TVideoFragment tVideoFragment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : tTextFragment, (i & 16) != 0 ? null : tVideoFragment, (i & 32) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TScrollToFragmentDirective copy$default(TScrollToFragmentDirective tScrollToFragmentDirective, String str, String str2, String str3, TTextFragment tTextFragment, TVideoFragment tVideoFragment, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tScrollToFragmentDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tScrollToFragmentDirective.contentUrl;
            }
            if ((i & 4) != 0) {
                str3 = tScrollToFragmentDirective.navigationToFragmentUrl;
            }
            if ((i & 8) != 0) {
                tTextFragment = tScrollToFragmentDirective.textFragment;
            }
            if ((i & 16) != 0) {
                tVideoFragment = tScrollToFragmentDirective.videoFragment;
            }
            if ((i & 32) != 0) {
                byteString = tScrollToFragmentDirective.unknownFields();
            }
            TVideoFragment tVideoFragment2 = tVideoFragment;
            ByteString byteString2 = byteString;
            return tScrollToFragmentDirective.copy(str, str2, str3, tTextFragment, tVideoFragment2, byteString2);
        }

        @ColumnNameOption("content_url")
        public static /* synthetic */ void getContentUrl$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("navigation_to_fragment_url")
        public static /* synthetic */ void getNavigationToFragmentUrl$annotations() {
        }

        @ColumnNameOption("text_fragment")
        public static /* synthetic */ void getTextFragment$annotations() {
        }

        @ColumnNameOption("video_fragment")
        public static /* synthetic */ void getVideoFragment$annotations() {
        }

        public final TScrollToFragmentDirective copy(String name, String contentUrl, String navigationToFragmentUrl, TTextFragment textFragment, TVideoFragment videoFragment, ByteString unknownFields) {
            return new TScrollToFragmentDirective(name, contentUrl, navigationToFragmentUrl, textFragment, videoFragment, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TScrollToFragmentDirective)) {
                return false;
            }
            TScrollToFragmentDirective tScrollToFragmentDirective = (TScrollToFragmentDirective) other;
            return jl40.l(unknownFields(), tScrollToFragmentDirective.unknownFields()) && jl40.l(this.name, tScrollToFragmentDirective.name) && jl40.l(this.contentUrl, tScrollToFragmentDirective.contentUrl) && jl40.l(this.navigationToFragmentUrl, tScrollToFragmentDirective.navigationToFragmentUrl) && jl40.l(this.textFragment, tScrollToFragmentDirective.textFragment) && jl40.l(this.videoFragment, tScrollToFragmentDirective.videoFragment);
        }

        public final String getContentUrl() {
            return this.contentUrl;
        }

        public final String getName() {
            return this.name;
        }

        public final String getNavigationToFragmentUrl() {
            return this.navigationToFragmentUrl;
        }

        public final TTextFragment getTextFragment() {
            return this.textFragment;
        }

        public final TVideoFragment getVideoFragment() {
            return this.videoFragment;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int b = unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.contentUrl), 37, this.navigationToFragmentUrl);
            TTextFragment tTextFragment = this.textFragment;
            int hashCode = (b + (tTextFragment != null ? tTextFragment.hashCode() : 0)) * 37;
            TVideoFragment tVideoFragment = this.videoFragment;
            int hashCode2 = hashCode + (tVideoFragment != null ? tVideoFragment.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m601newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("contentUrl=", Internal.sanitize(this.contentUrl), arrayList);
            unr0.B("navigationToFragmentUrl=", Internal.sanitize(this.navigationToFragmentUrl), arrayList);
            TTextFragment tTextFragment = this.textFragment;
            if (tTextFragment != null) {
                arrayList.add("textFragment=" + tTextFragment);
            }
            TVideoFragment tVideoFragment = this.videoFragment;
            if (tVideoFragment != null) {
                arrayList.add("videoFragment=" + tVideoFragment);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TScrollToFragmentDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m601newBuilder();
        }

        public TScrollToFragmentDirective() {
            this(null, null, null, null, null, null, 63, null);
        }

        public TScrollToFragmentDirective(String str, String str2, String str3, TTextFragment tTextFragment, TVideoFragment tVideoFragment, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.contentUrl = str2;
            this.navigationToFragmentUrl = str3;
            this.textFragment = tTextFragment;
            this.videoFragment = tVideoFragment;
            if (Internal.countNonNull(tTextFragment, tVideoFragment) <= 1) {
                return;
            }
            ny61.g("At most one of textFragment, videoFragment may be non-null");
            throw null;
        }
    }

    @SpeechKitNameOption("scroll_to_top_directive")
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TScrollToTopDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ScrollToTopDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TScrollToTopDirective extends Message {
        public static final ProtoAdapter<TScrollToTopDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TScrollToTopDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TScrollToTopDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TScrollToTopDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TScrollToTopDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TScrollToTopDirective(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TScrollToTopDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TScrollToTopDirective value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getName(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TScrollToTopDirective redact(TAliceChatCapability.TScrollToTopDirective value) {
                    return TAliceChatCapability.TScrollToTopDirective.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TScrollToTopDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TScrollToTopDirective(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TScrollToTopDirective copy$default(TScrollToTopDirective tScrollToTopDirective, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tScrollToTopDirective.name;
            }
            if ((i & 2) != 0) {
                byteString = tScrollToTopDirective.unknownFields();
            }
            return tScrollToTopDirective.copy(str, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TScrollToTopDirective copy(String name, ByteString unknownFields) {
            return new TScrollToTopDirective(name, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TScrollToTopDirective)) {
                return false;
            }
            TScrollToTopDirective tScrollToTopDirective = (TScrollToTopDirective) other;
            return jl40.l(unknownFields(), tScrollToTopDirective.unknownFields()) && jl40.l(this.name, tScrollToTopDirective.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.name.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m602newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TScrollToTopDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m602newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TScrollToTopDirective() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TScrollToTopDirective(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
        }
    }

    @SpeechKitNameOption("set_chat_request_mode_directive")
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006$"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TSetChatRequestModeDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "mode", "Lru/yandex/alice/protos/api/alice_mode_info/quark/webchat/TAlice2ModeInfo$EMode;", "requestModeInfo", "Lru/yandex/alice/protos/api/alice_mode_info/quark/webchat/TAlice2ModeInfo;", "id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lru/yandex/alice/protos/api/alice_mode_info/quark/webchat/TAlice2ModeInfo$EMode;Lru/yandex/alice/protos/api/alice_mode_info/quark/webchat/TAlice2ModeInfo;Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getMode$annotations", "getMode", "()Lru/yandex/alice/protos/api/alice_mode_info/quark/webchat/TAlice2ModeInfo$EMode;", "getRequestModeInfo$annotations", "getRequestModeInfo", "()Lru/yandex/alice/protos/api/alice_mode_info/quark/webchat/TAlice2ModeInfo;", "getId$annotations", "getId", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.SetChatRequestModeDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TSetChatRequestModeDirective extends Message {
        public static final ProtoAdapter<TSetChatRequestModeDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String id;

        @WireField(adapter = "ru.yandex.alice.protos.api.alice_mode_info.quark.webchat.TAlice2ModeInfo$EMode#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final TAlice2ModeInfo.EMode mode;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "ru.yandex.alice.protos.api.alice_mode_info.quark.webchat.TAlice2ModeInfo#ADAPTER", jsonName = "request_mode_info", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final TAlice2ModeInfo requestModeInfo;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TSetChatRequestModeDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TSetChatRequestModeDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TSetChatRequestModeDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TSetChatRequestModeDirective decode(ProtoReader reader) {
                    TAlice2ModeInfo.EMode eMode = TAlice2ModeInfo.EMode.Undefined;
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    TAlice2ModeInfo tAlice2ModeInfo = null;
                    String str2 = str;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TSetChatRequestModeDirective(str2, eMode, tAlice2ModeInfo, str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            try {
                                eMode = TAlice2ModeInfo.EMode.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 3) {
                            tAlice2ModeInfo = TAlice2ModeInfo.ADAPTER.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            str = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TSetChatRequestModeDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (value.getMode() != TAlice2ModeInfo.EMode.Undefined) {
                        TAlice2ModeInfo.EMode.ADAPTER.encodeWithTag(writer, 2, (int) value.getMode());
                    }
                    if (value.getRequestModeInfo() != null) {
                        TAlice2ModeInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getRequestModeInfo());
                    }
                    if (!jl40.l(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getId());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TSetChatRequestModeDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (value.getMode() != TAlice2ModeInfo.EMode.Undefined) {
                        h += TAlice2ModeInfo.EMode.ADAPTER.encodedSizeWithTag(2, value.getMode());
                    }
                    if (value.getRequestModeInfo() != null) {
                        h += TAlice2ModeInfo.ADAPTER.encodedSizeWithTag(3, value.getRequestModeInfo());
                    }
                    return !jl40.l(value.getId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.getId()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TSetChatRequestModeDirective redact(TAliceChatCapability.TSetChatRequestModeDirective value) {
                    TAlice2ModeInfo requestModeInfo = value.getRequestModeInfo();
                    return TAliceChatCapability.TSetChatRequestModeDirective.copy$default(value, null, null, requestModeInfo != null ? TAlice2ModeInfo.ADAPTER.redact(requestModeInfo) : null, null, ByteString.c, 11, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TSetChatRequestModeDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getId());
                    }
                    if (value.getRequestModeInfo() != null) {
                        TAlice2ModeInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getRequestModeInfo());
                    }
                    if (value.getMode() != TAlice2ModeInfo.EMode.Undefined) {
                        TAlice2ModeInfo.EMode.ADAPTER.encodeWithTag(writer, 2, (int) value.getMode());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TSetChatRequestModeDirective(String str, TAlice2ModeInfo.EMode eMode, TAlice2ModeInfo tAlice2ModeInfo, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TAlice2ModeInfo.EMode.Undefined : eMode, (i & 4) != 0 ? null : tAlice2ModeInfo, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TSetChatRequestModeDirective copy$default(TSetChatRequestModeDirective tSetChatRequestModeDirective, String str, TAlice2ModeInfo.EMode eMode, TAlice2ModeInfo tAlice2ModeInfo, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tSetChatRequestModeDirective.name;
            }
            if ((i & 2) != 0) {
                eMode = tSetChatRequestModeDirective.mode;
            }
            if ((i & 4) != 0) {
                tAlice2ModeInfo = tSetChatRequestModeDirective.requestModeInfo;
            }
            if ((i & 8) != 0) {
                str2 = tSetChatRequestModeDirective.id;
            }
            if ((i & 16) != 0) {
                byteString = tSetChatRequestModeDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            TAlice2ModeInfo tAlice2ModeInfo2 = tAlice2ModeInfo;
            return tSetChatRequestModeDirective.copy(str, eMode, tAlice2ModeInfo2, str2, byteString2);
        }

        @ColumnNameOption("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @jxi
        @ColumnNameOption("mode")
        public static /* synthetic */ void getMode$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("request_mode_info")
        public static /* synthetic */ void getRequestModeInfo$annotations() {
        }

        public final TSetChatRequestModeDirective copy(String name, TAlice2ModeInfo.EMode mode, TAlice2ModeInfo requestModeInfo, String id, ByteString unknownFields) {
            return new TSetChatRequestModeDirective(name, mode, requestModeInfo, id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TSetChatRequestModeDirective)) {
                return false;
            }
            TSetChatRequestModeDirective tSetChatRequestModeDirective = (TSetChatRequestModeDirective) other;
            return jl40.l(unknownFields(), tSetChatRequestModeDirective.unknownFields()) && jl40.l(this.name, tSetChatRequestModeDirective.name) && this.mode == tSetChatRequestModeDirective.mode && jl40.l(this.requestModeInfo, tSetChatRequestModeDirective.requestModeInfo) && jl40.l(this.id, tSetChatRequestModeDirective.id);
        }

        public final String getId() {
            return this.id;
        }

        public final TAlice2ModeInfo.EMode getMode() {
            return this.mode;
        }

        public final String getName() {
            return this.name;
        }

        public final TAlice2ModeInfo getRequestModeInfo() {
            return this.requestModeInfo;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (this.mode.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.name)) * 37;
            TAlice2ModeInfo tAlice2ModeInfo = this.requestModeInfo;
            int hashCode2 = this.id.hashCode() + ((hashCode + (tAlice2ModeInfo != null ? tAlice2ModeInfo.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m603newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            arrayList.add("mode=" + this.mode);
            TAlice2ModeInfo tAlice2ModeInfo = this.requestModeInfo;
            if (tAlice2ModeInfo != null) {
                arrayList.add("requestModeInfo=" + tAlice2ModeInfo);
            }
            unr0.B("id=", Internal.sanitize(this.id), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TSetChatRequestModeDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m603newBuilder();
        }

        public TSetChatRequestModeDirective() {
            this(null, null, null, null, null, 31, null);
        }

        public TSetChatRequestModeDirective(String str, TAlice2ModeInfo.EMode eMode, TAlice2ModeInfo tAlice2ModeInfo, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.mode = eMode;
            this.requestModeInfo = tAlice2ModeInfo;
            this.id = str2;
        }
    }

    @SpeechKitNameOption("share_image_directive")
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShareImageDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "imageUrl", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getImageUrl$annotations", "getImageUrl", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ShareImageDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TShareImageDirective extends Message {
        public static final ProtoAdapter<TShareImageDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "image_url", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String imageUrl;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TShareImageDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TShareImageDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShareImageDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShareImageDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TShareImageDirective(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, TAliceChatCapability.TShareImageDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getImageUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getImageUrl());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TShareImageDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return !jl40.l(value.getImageUrl(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getImageUrl()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShareImageDirective redact(TAliceChatCapability.TShareImageDirective value) {
                    return TAliceChatCapability.TShareImageDirective.copy$default(value, null, null, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShareImageDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getImageUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getImageUrl());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TShareImageDirective(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TShareImageDirective copy$default(TShareImageDirective tShareImageDirective, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tShareImageDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tShareImageDirective.imageUrl;
            }
            if ((i & 4) != 0) {
                byteString = tShareImageDirective.unknownFields();
            }
            return tShareImageDirective.copy(str, str2, byteString);
        }

        @ColumnNameOption("image_url")
        public static /* synthetic */ void getImageUrl$annotations() {
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TShareImageDirective copy(String name, String imageUrl, ByteString unknownFields) {
            return new TShareImageDirective(name, imageUrl, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TShareImageDirective)) {
                return false;
            }
            TShareImageDirective tShareImageDirective = (TShareImageDirective) other;
            return jl40.l(unknownFields(), tShareImageDirective.unknownFields()) && jl40.l(this.name, tShareImageDirective.name) && jl40.l(this.imageUrl, tShareImageDirective.imageUrl);
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.imageUrl.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m604newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("imageUrl=", Internal.sanitize(this.imageUrl), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TShareImageDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m604newBuilder();
        }

        public TShareImageDirective() {
            this(null, null, null, 7, null);
        }

        public TShareImageDirective(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.imageUrl = str2;
        }
    }

    @SpeechKitNameOption("show_banner_directive")
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f¨\u0006 "}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowBannerDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "text", "title", "type", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getText$annotations", "getText", "getTitle$annotations", "getTitle", "getType$annotations", "getType", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ShowBannerDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TShowBannerDirective extends Message {
        public static final ProtoAdapter<TShowBannerDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String type;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TShowBannerDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TShowBannerDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowBannerDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowBannerDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    String str3 = str2;
                    String str4 = str3;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TShowBannerDirective(str, str2, str3, str4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            str2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            str3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            str4 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TShowBannerDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    if (!jl40.l(value.getType(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getType());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TShowBannerDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                    }
                    return !jl40.l(value.getType(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.getType()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowBannerDirective redact(TAliceChatCapability.TShowBannerDirective value) {
                    return TAliceChatCapability.TShowBannerDirective.copy$default(value, null, null, null, null, ByteString.c, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowBannerDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getType(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getType());
                    }
                    if (!jl40.l(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                    }
                    if (!jl40.l(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TShowBannerDirective(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TShowBannerDirective copy$default(TShowBannerDirective tShowBannerDirective, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tShowBannerDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tShowBannerDirective.text;
            }
            if ((i & 4) != 0) {
                str3 = tShowBannerDirective.title;
            }
            if ((i & 8) != 0) {
                str4 = tShowBannerDirective.type;
            }
            if ((i & 16) != 0) {
                byteString = tShowBannerDirective.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str5 = str3;
            return tShowBannerDirective.copy(str, str2, str5, str4, byteString2);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("text")
        public static /* synthetic */ void getText$annotations() {
        }

        @ColumnNameOption("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        @ColumnNameOption("type")
        public static /* synthetic */ void getType$annotations() {
        }

        public final TShowBannerDirective copy(String name, String text, String title, String type, ByteString unknownFields) {
            return new TShowBannerDirective(name, text, title, type, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TShowBannerDirective)) {
                return false;
            }
            TShowBannerDirective tShowBannerDirective = (TShowBannerDirective) other;
            return jl40.l(unknownFields(), tShowBannerDirective.unknownFields()) && jl40.l(this.name, tShowBannerDirective.name) && jl40.l(this.text, tShowBannerDirective.text) && jl40.l(this.title, tShowBannerDirective.title) && jl40.l(this.type, tShowBannerDirective.type);
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.type.hashCode() + unr0.b(unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.text), 37, this.title);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m605newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("text=", Internal.sanitize(this.text), arrayList);
            unr0.B("title=", Internal.sanitize(this.title), arrayList);
            unr0.B("type=", Internal.sanitize(this.type), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TShowBannerDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m605newBuilder();
        }

        public TShowBannerDirective() {
            this(null, null, null, null, null, 31, null);
        }

        public TShowBannerDirective(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.text = str2;
            this.title = str3;
            this.type = str4;
        }
    }

    @SpeechKitNameOption("show_pro_purchase_screen_directive")
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowProPurchaseScreenDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ShowProPurchaseScreenDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TShowProPurchaseScreenDirective extends Message {
        public static final ProtoAdapter<TShowProPurchaseScreenDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TShowProPurchaseScreenDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TShowProPurchaseScreenDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowProPurchaseScreenDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowProPurchaseScreenDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TShowProPurchaseScreenDirective(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TShowProPurchaseScreenDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TShowProPurchaseScreenDirective value) {
                    int h = value.unknownFields().h();
                    return !jl40.l(value.getName(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowProPurchaseScreenDirective redact(TAliceChatCapability.TShowProPurchaseScreenDirective value) {
                    return TAliceChatCapability.TShowProPurchaseScreenDirective.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowProPurchaseScreenDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TShowProPurchaseScreenDirective(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TShowProPurchaseScreenDirective copy$default(TShowProPurchaseScreenDirective tShowProPurchaseScreenDirective, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tShowProPurchaseScreenDirective.name;
            }
            if ((i & 2) != 0) {
                byteString = tShowProPurchaseScreenDirective.unknownFields();
            }
            return tShowProPurchaseScreenDirective.copy(str, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        public final TShowProPurchaseScreenDirective copy(String name, ByteString unknownFields) {
            return new TShowProPurchaseScreenDirective(name, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TShowProPurchaseScreenDirective)) {
                return false;
            }
            TShowProPurchaseScreenDirective tShowProPurchaseScreenDirective = (TShowProPurchaseScreenDirective) other;
            return jl40.l(unknownFields(), tShowProPurchaseScreenDirective.unknownFields()) && jl40.l(this.name, tShowProPurchaseScreenDirective.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.name.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m614newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TShowProPurchaseScreenDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m614newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TShowProPurchaseScreenDirective() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TShowProPurchaseScreenDirective(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
        }
    }

    @SpeechKitNameOption("show_promo_screen_directive")
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TShowPromoScreenDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "promoId", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getPromoId$annotations", "getPromoId", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ShowPromoScreenDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TShowPromoScreenDirective extends Message {
        public static final ProtoAdapter<TShowPromoScreenDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promo_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String promoId;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TShowPromoScreenDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TShowPromoScreenDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TShowPromoScreenDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowPromoScreenDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    String str2 = "";
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TShowPromoScreenDirective(str, str2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, TAliceChatCapability.TShowPromoScreenDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!jl40.l(value.getPromoId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPromoId());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TShowPromoScreenDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return !jl40.l(value.getPromoId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPromoId()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TShowPromoScreenDirective redact(TAliceChatCapability.TShowPromoScreenDirective value) {
                    return TAliceChatCapability.TShowPromoScreenDirective.copy$default(value, null, null, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TShowPromoScreenDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (!jl40.l(value.getPromoId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPromoId());
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TShowPromoScreenDirective(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TShowPromoScreenDirective copy$default(TShowPromoScreenDirective tShowPromoScreenDirective, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tShowPromoScreenDirective.name;
            }
            if ((i & 2) != 0) {
                str2 = tShowPromoScreenDirective.promoId;
            }
            if ((i & 4) != 0) {
                byteString = tShowPromoScreenDirective.unknownFields();
            }
            return tShowPromoScreenDirective.copy(str, str2, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("promo_id")
        public static /* synthetic */ void getPromoId$annotations() {
        }

        public final TShowPromoScreenDirective copy(String name, String promoId, ByteString unknownFields) {
            return new TShowPromoScreenDirective(name, promoId, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TShowPromoScreenDirective)) {
                return false;
            }
            TShowPromoScreenDirective tShowPromoScreenDirective = (TShowPromoScreenDirective) other;
            return jl40.l(unknownFields(), tShowPromoScreenDirective.unknownFields()) && jl40.l(this.name, tShowPromoScreenDirective.name) && jl40.l(this.promoId, tShowPromoScreenDirective.promoId);
        }

        public final String getName() {
            return this.name;
        }

        public final String getPromoId() {
            return this.promoId;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.promoId.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m615newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            unr0.B("promoId=", Internal.sanitize(this.promoId), arrayList);
            return a.X(arrayList, Extension.FIX_SPACE, "TShowPromoScreenDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m615newBuilder();
        }

        public TShowPromoScreenDirective() {
            this(null, null, null, 7, null);
        }

        public TShowPromoScreenDirective(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.promoId = str2;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TState;", "Lcom/squareup/wire/Message;", "", "isChatActive", "", "navigationState", "Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TNavigationState;", "activeChatDialogContext", "Lru/yandex/alice/protos/data/dialog_state/quark/webchat/TDialogState;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TNavigationState;Lru/yandex/alice/protos/data/dialog_state/quark/webchat/TDialogState;Lokio/ByteString;)V", "isChatActive$annotations", "()V", "()Z", "getNavigationState$annotations", "getNavigationState", "()Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TNavigationState;", "getActiveChatDialogContext$annotations", "getActiveChatDialogContext", "()Lru/yandex/alice/protos/data/dialog_state/quark/webchat/TDialogState;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TState extends Message {
        public static final ProtoAdapter<TState> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "ru.yandex.alice.protos.data.dialog_state.quark.webchat.TDialogState#ADAPTER", jsonName = "active_chat_dialog_context", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final TDialogState activeChatDialogContext;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is_chat_active", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final boolean isChatActive;

        @WireField(adapter = "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TNavigationState#ADAPTER", jsonName = "navigation_state", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final TNavigationState navigationState;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TState decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    boolean z = false;
                    TAliceChatCapability.TNavigationState tNavigationState = null;
                    TDialogState tDialogState = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TState(z, tNavigationState, tDialogState, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (nextTag == 2) {
                            tNavigationState = TAliceChatCapability.TNavigationState.ADAPTER.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            tDialogState = TDialogState.ADAPTER.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TState value) {
                    if (value.getIsChatActive()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIsChatActive()));
                    }
                    if (value.getNavigationState() != null) {
                        TAliceChatCapability.TNavigationState.ADAPTER.encodeWithTag(writer, 2, (int) value.getNavigationState());
                    }
                    if (value.getActiveChatDialogContext() != null) {
                        TDialogState.ADAPTER.encodeWithTag(writer, 3, (int) value.getActiveChatDialogContext());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TState value) {
                    int h = value.unknownFields().h();
                    if (value.getIsChatActive()) {
                        h += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIsChatActive()));
                    }
                    if (value.getNavigationState() != null) {
                        h += TAliceChatCapability.TNavigationState.ADAPTER.encodedSizeWithTag(2, value.getNavigationState());
                    }
                    return value.getActiveChatDialogContext() != null ? TDialogState.ADAPTER.encodedSizeWithTag(3, value.getActiveChatDialogContext()) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TState redact(TAliceChatCapability.TState value) {
                    TAliceChatCapability.TNavigationState navigationState = value.getNavigationState();
                    TAliceChatCapability.TNavigationState redact = navigationState != null ? TAliceChatCapability.TNavigationState.ADAPTER.redact(navigationState) : null;
                    TDialogState activeChatDialogContext = value.getActiveChatDialogContext();
                    return TAliceChatCapability.TState.copy$default(value, false, redact, activeChatDialogContext != null ? TDialogState.ADAPTER.redact(activeChatDialogContext) : null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TState value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getActiveChatDialogContext() != null) {
                        TDialogState.ADAPTER.encodeWithTag(writer, 3, (int) value.getActiveChatDialogContext());
                    }
                    if (value.getNavigationState() != null) {
                        TAliceChatCapability.TNavigationState.ADAPTER.encodeWithTag(writer, 2, (int) value.getNavigationState());
                    }
                    if (value.getIsChatActive()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIsChatActive()));
                    }
                }
            };
        }

        public /* synthetic */ TState(boolean z, TNavigationState tNavigationState, TDialogState tDialogState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : tNavigationState, (i & 4) != 0 ? null : tDialogState, (i & 8) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TState copy$default(TState tState, boolean z, TNavigationState tNavigationState, TDialogState tDialogState, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tState.isChatActive;
            }
            if ((i & 2) != 0) {
                tNavigationState = tState.navigationState;
            }
            if ((i & 4) != 0) {
                tDialogState = tState.activeChatDialogContext;
            }
            if ((i & 8) != 0) {
                byteString = tState.unknownFields();
            }
            return tState.copy(z, tNavigationState, tDialogState, byteString);
        }

        @ColumnNameOption("active_chat_dialog_context")
        public static /* synthetic */ void getActiveChatDialogContext$annotations() {
        }

        @ColumnNameOption("navigation_state")
        public static /* synthetic */ void getNavigationState$annotations() {
        }

        @ColumnNameOption("is_chat_active")
        public static /* synthetic */ void isChatActive$annotations() {
        }

        public final TState copy(boolean isChatActive, TNavigationState navigationState, TDialogState activeChatDialogContext, ByteString unknownFields) {
            return new TState(isChatActive, navigationState, activeChatDialogContext, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TState)) {
                return false;
            }
            TState tState = (TState) other;
            return jl40.l(unknownFields(), tState.unknownFields()) && this.isChatActive == tState.isChatActive && jl40.l(this.navigationState, tState.navigationState) && jl40.l(this.activeChatDialogContext, tState.activeChatDialogContext);
        }

        public final TDialogState getActiveChatDialogContext() {
            return this.activeChatDialogContext;
        }

        public final TNavigationState getNavigationState() {
            return this.navigationState;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int e = unr0.e(unknownFields().hashCode() * 37, 37, this.isChatActive);
            TNavigationState tNavigationState = this.navigationState;
            int hashCode = (e + (tNavigationState != null ? tNavigationState.hashCode() : 0)) * 37;
            TDialogState tDialogState = this.activeChatDialogContext;
            int hashCode2 = hashCode + (tDialogState != null ? tDialogState.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        /* renamed from: isChatActive, reason: from getter */
        public final boolean getIsChatActive() {
            return this.isChatActive;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m616newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            smw0.y("isChatActive=", arrayList, this.isChatActive);
            TNavigationState tNavigationState = this.navigationState;
            if (tNavigationState != null) {
                arrayList.add("navigationState=" + tNavigationState);
            }
            TDialogState tDialogState = this.activeChatDialogContext;
            if (tDialogState != null) {
                arrayList.add("activeChatDialogContext=" + tDialogState);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TState{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m616newBuilder();
        }

        public TState() {
            this(false, null, null, null, 15, null);
        }

        public TState(boolean z, TNavigationState tNavigationState, TDialogState tDialogState, ByteString byteString) {
            super(ADAPTER, byteString);
            this.isChatActive = z;
            this.navigationState = tNavigationState;
            this.activeChatDialogContext = tDialogState;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TTextFragment;", "Lcom/squareup/wire/Message;", "", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getText$annotations", "()V", "getText", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TTextFragment extends Message {
        public static final ProtoAdapter<TTextFragment> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        private final String text;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TTextFragment.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TTextFragment>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TTextFragment$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TTextFragment decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TTextFragment(str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TTextFragment value) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TTextFragment value) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TTextFragment redact(TAliceChatCapability.TTextFragment value) {
                    return TAliceChatCapability.TTextFragment.copy$default(value, null, ByteString.c, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TTextFragment value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }
            };
        }

        public /* synthetic */ TTextFragment(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TTextFragment copy$default(TTextFragment tTextFragment, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tTextFragment.text;
            }
            if ((i & 2) != 0) {
                byteString = tTextFragment.unknownFields();
            }
            return tTextFragment.copy(str, byteString);
        }

        @ColumnNameOption("text")
        public static /* synthetic */ void getText$annotations() {
        }

        public final TTextFragment copy(String text, ByteString unknownFields) {
            return new TTextFragment(text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TTextFragment)) {
                return false;
            }
            TTextFragment tTextFragment = (TTextFragment) other;
            return jl40.l(unknownFields(), tTextFragment.unknownFields()) && jl40.l(this.text, tTextFragment.text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m617newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                unr0.B("text=", Internal.sanitize(str), arrayList);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TTextFragment{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m617newBuilder();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TTextFragment() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public TTextFragment(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J-\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u001cR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0012\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TVideoFragment;", "Lcom/squareup/wire/Message;", "", "videoId", "", "seekTime", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Lokio/ByteString;)V", "getVideoId$annotations", "()V", "getVideoId", "()Ljava/lang/String;", "getSeekTime$annotations", "getSeekTime", "()Ljava/lang/Double;", "Ljava/lang/Double;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Double;Lokio/ByteString;)Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TVideoFragment;", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    /* loaded from: classes4.dex */
    public static final class TVideoFragment extends Message {
        public static final ProtoAdapter<TVideoFragment> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "seek_time", schemaIndex = 1, tag = 2)
        private final Double seekTime;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "video_id", schemaIndex = 0, tag = 1)
        private final String videoId;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TVideoFragment.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TVideoFragment>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TVideoFragment$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TVideoFragment decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = null;
                    Double d = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TVideoFragment(str, d, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            d = ProtoAdapter.DOUBLE.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TVideoFragment value) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVideoId());
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) value.getSeekTime());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TVideoFragment value) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, value.getSeekTime()) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getVideoId()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TVideoFragment redact(TAliceChatCapability.TVideoFragment value) {
                    return TAliceChatCapability.TVideoFragment.copy$default(value, null, null, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TVideoFragment value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) value.getSeekTime());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVideoId());
                }
            };
        }

        public /* synthetic */ TVideoFragment(String str, Double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TVideoFragment copy$default(TVideoFragment tVideoFragment, String str, Double d, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tVideoFragment.videoId;
            }
            if ((i & 2) != 0) {
                d = tVideoFragment.seekTime;
            }
            if ((i & 4) != 0) {
                byteString = tVideoFragment.unknownFields();
            }
            return tVideoFragment.copy(str, d, byteString);
        }

        @ColumnNameOption("seek_time")
        public static /* synthetic */ void getSeekTime$annotations() {
        }

        @ColumnNameOption("video_id")
        public static /* synthetic */ void getVideoId$annotations() {
        }

        public final TVideoFragment copy(String videoId, Double seekTime, ByteString unknownFields) {
            return new TVideoFragment(videoId, seekTime, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TVideoFragment)) {
                return false;
            }
            TVideoFragment tVideoFragment = (TVideoFragment) other;
            return jl40.l(unknownFields(), tVideoFragment.unknownFields()) && jl40.l(this.videoId, tVideoFragment.videoId) && jl40.i(this.seekTime, tVideoFragment.seekTime);
        }

        public final Double getSeekTime() {
            return this.seekTime;
        }

        public final String getVideoId() {
            return this.videoId;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.videoId;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Double d = this.seekTime;
            int hashCode3 = hashCode2 + (d != null ? d.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m618newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.videoId;
            if (str != null) {
                unr0.B("videoId=", Internal.sanitize(str), arrayList);
            }
            Double d = this.seekTime;
            if (d != null) {
                arrayList.add("seekTime=" + d);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TVideoFragment{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m618newBuilder();
        }

        public TVideoFragment() {
            this(null, null, null, 7, null);
        }

        public TVideoFragment(String str, Double d, ByteString byteString) {
            super(ADAPTER, byteString);
            this.videoId = str;
            this.seekTime = d;
        }
    }

    @SpeechKitNameOption("zoom_image_directive")
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/quark/webchat/TAliceChatCapability$TZoomImageDirective;", "Lcom/squareup/wire/Message;", "", "name", "", "step", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILokio/ByteString;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getStep$annotations", "getStep", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    @DirectiveTypeOption(TCapability.EDirectiveType.ZoomImageDirectiveType)
    /* loaded from: classes4.dex */
    public static final class TZoomImageDirective extends Message {
        public static final ProtoAdapter<TZoomImageDirective> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final int step;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(TZoomImageDirective.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TZoomImageDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability$TZoomImageDirective$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TZoomImageDirective decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    String str = "";
                    int i = 0;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TAliceChatCapability.TZoomImageDirective(str, i, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            i = ProtoAdapter.INT32.decode(reader).intValue();
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TAliceChatCapability.TZoomImageDirective value) {
                    if (!jl40.l(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (value.getStep() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getStep()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TAliceChatCapability.TZoomImageDirective value) {
                    int h = value.unknownFields().h();
                    if (!jl40.l(value.getName(), "")) {
                        h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return value.getStep() != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getStep())) + h : h;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TAliceChatCapability.TZoomImageDirective redact(TAliceChatCapability.TZoomImageDirective value) {
                    return TAliceChatCapability.TZoomImageDirective.copy$default(value, null, 0, ByteString.c, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TAliceChatCapability.TZoomImageDirective value) {
                    writer.writeBytes(value.unknownFields());
                    if (value.getStep() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getStep()));
                    }
                    if (jl40.l(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
            };
        }

        public /* synthetic */ TZoomImageDirective(String str, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ByteString.c : byteString);
        }

        public static /* synthetic */ TZoomImageDirective copy$default(TZoomImageDirective tZoomImageDirective, String str, int i, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = tZoomImageDirective.name;
            }
            if ((i2 & 2) != 0) {
                i = tZoomImageDirective.step;
            }
            if ((i2 & 4) != 0) {
                byteString = tZoomImageDirective.unknownFields();
            }
            return tZoomImageDirective.copy(str, i, byteString);
        }

        @ColumnNameOption("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @ColumnNameOption("step")
        public static /* synthetic */ void getStep$annotations() {
        }

        public final TZoomImageDirective copy(String name, int step, ByteString unknownFields) {
            return new TZoomImageDirective(name, step, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TZoomImageDirective)) {
                return false;
            }
            TZoomImageDirective tZoomImageDirective = (TZoomImageDirective) other;
            return jl40.l(unknownFields(), tZoomImageDirective.unknownFields()) && jl40.l(this.name, tZoomImageDirective.name) && this.step == tZoomImageDirective.step;
        }

        public final String getName() {
            return this.name;
        }

        public final int getStep() {
            return this.step;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = Integer.hashCode(this.step) + unr0.b(unknownFields().hashCode() * 37, 37, this.name);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m619newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            unr0.B("name=", Internal.sanitize(this.name), arrayList);
            arrayList.add("step=" + this.step);
            return a.X(arrayList, Extension.FIX_SPACE, "TZoomImageDirective{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m619newBuilder();
        }

        public TZoomImageDirective() {
            this(null, 0, null, 7, null);
        }

        public TZoomImageDirective(String str, int i, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.step = i;
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m584newBuilder();
    }

    public TAliceChatCapability() {
        this(null, null, null, null, 15, null);
    }

    public TAliceChatCapability(TCapability.TMeta tMeta, TParameters tParameters, TState tState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = tMeta;
        this.parameters = tParameters;
        this.state = tState;
    }
}
