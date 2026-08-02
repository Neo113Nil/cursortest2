package ru.yandex.alice.protos.data.dialog_state.quark.webchat;

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
import ru.yandex.alice.protos.api.alice_mode_info.quark.webchat.TAlice2ModeInfo;
import ru.yandex.alice.protos.data.dialog_type.quark.webchat.EDialogType;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JL\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012¨\u0006'"}, d2 = {"Lru/yandex/alice/protos/data/dialog_state/quark/webchat/TDialogState;", "Lcom/squareup/wire/Message;", "", "dialogId", "", "folderId", "dialogType", "Lru/yandex/alice/protos/data/dialog_type/quark/webchat/EDialogType;", "alice2ModeInfo", "Lru/yandex/alice/protos/api/alice_mode_info/quark/webchat/TAlice2ModeInfo;", "characterId", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/alice/protos/data/dialog_type/quark/webchat/EDialogType;Lru/yandex/alice/protos/api/alice_mode_info/quark/webchat/TAlice2ModeInfo;Ljava/lang/String;Lokio/ByteString;)V", "getDialogId$annotations", "()V", "getDialogId", "()Ljava/lang/String;", "getFolderId$annotations", "getFolderId", "getDialogType$annotations", "getDialogType", "()Lru/yandex/alice/protos/data/dialog_type/quark/webchat/EDialogType;", "getAlice2ModeInfo$annotations", "getAlice2ModeInfo", "()Lru/yandex/alice/protos/api/alice_mode_info/quark/webchat/TAlice2ModeInfo;", "getCharacterId$annotations", "getCharacterId", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TDialogState extends Message {
    public static final ProtoAdapter<TDialogState> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.api.alice_mode_info.quark.webchat.TAlice2ModeInfo#ADAPTER", jsonName = "alice2_mode_info", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final TAlice2ModeInfo alice2ModeInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "character_id", schemaIndex = 4, tag = 5)
    private final String characterId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dialog_id", schemaIndex = 0, tag = 1)
    private final String dialogId;

    @WireField(adapter = "ru.yandex.alice.protos.data.dialog_type.quark.webchat.EDialogType#ADAPTER", jsonName = "dialog_type", schemaIndex = 2, tag = 3)
    private final EDialogType dialogType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "folder_id", schemaIndex = 1, tag = 2)
    private final String folderId;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TDialogState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TDialogState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.data.dialog_state.quark.webchat.TDialogState$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TDialogState decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                String str = null;
                String str2 = null;
                EDialogType eDialogType = null;
                TAlice2ModeInfo tAlice2ModeInfo = null;
                String str3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TDialogState(str, str2, eDialogType, tAlice2ModeInfo, str3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        str2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        try {
                            eDialogType = EDialogType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 4) {
                        tAlice2ModeInfo = TAlice2ModeInfo.ADAPTER.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        str3 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TDialogState value) {
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDialogId());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getFolderId());
                EDialogType.ADAPTER.encodeWithTag(writer, 3, (int) value.getDialogType());
                if (value.getAlice2ModeInfo() != null) {
                    TAlice2ModeInfo.ADAPTER.encodeWithTag(writer, 4, (int) value.getAlice2ModeInfo());
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getCharacterId());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TDialogState value) {
                int h = value.unknownFields().h();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int encodedSizeWithTag = EDialogType.ADAPTER.encodedSizeWithTag(3, value.getDialogType()) + protoAdapter.encodedSizeWithTag(2, value.getFolderId()) + protoAdapter.encodedSizeWithTag(1, value.getDialogId()) + h;
                if (value.getAlice2ModeInfo() != null) {
                    encodedSizeWithTag += TAlice2ModeInfo.ADAPTER.encodedSizeWithTag(4, value.getAlice2ModeInfo());
                }
                return protoAdapter.encodedSizeWithTag(5, value.getCharacterId()) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TDialogState redact(TDialogState value) {
                TAlice2ModeInfo alice2ModeInfo = value.getAlice2ModeInfo();
                return TDialogState.copy$default(value, null, null, null, alice2ModeInfo != null ? TAlice2ModeInfo.ADAPTER.redact(alice2ModeInfo) : null, null, ByteString.c, 23, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TDialogState value) {
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getCharacterId());
                if (value.getAlice2ModeInfo() != null) {
                    TAlice2ModeInfo.ADAPTER.encodeWithTag(writer, 4, (int) value.getAlice2ModeInfo());
                }
                EDialogType.ADAPTER.encodeWithTag(writer, 3, (int) value.getDialogType());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getFolderId());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDialogId());
            }
        };
    }

    public /* synthetic */ TDialogState(String str, String str2, EDialogType eDialogType, TAlice2ModeInfo tAlice2ModeInfo, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : eDialogType, (i & 8) != 0 ? null : tAlice2ModeInfo, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TDialogState copy$default(TDialogState tDialogState, String str, String str2, EDialogType eDialogType, TAlice2ModeInfo tAlice2ModeInfo, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tDialogState.dialogId;
        }
        if ((i & 2) != 0) {
            str2 = tDialogState.folderId;
        }
        if ((i & 4) != 0) {
            eDialogType = tDialogState.dialogType;
        }
        if ((i & 8) != 0) {
            tAlice2ModeInfo = tDialogState.alice2ModeInfo;
        }
        if ((i & 16) != 0) {
            str3 = tDialogState.characterId;
        }
        if ((i & 32) != 0) {
            byteString = tDialogState.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return tDialogState.copy(str, str2, eDialogType, tAlice2ModeInfo, str4, byteString2);
    }

    @ColumnNameOption("alice2_mode_info")
    public static /* synthetic */ void getAlice2ModeInfo$annotations() {
    }

    @ColumnNameOption("character_id")
    public static /* synthetic */ void getCharacterId$annotations() {
    }

    @ColumnNameOption("dialog_id")
    public static /* synthetic */ void getDialogId$annotations() {
    }

    @ColumnNameOption("dialog_type")
    public static /* synthetic */ void getDialogType$annotations() {
    }

    @ColumnNameOption("folder_id")
    public static /* synthetic */ void getFolderId$annotations() {
    }

    public final TDialogState copy(String dialogId, String folderId, EDialogType dialogType, TAlice2ModeInfo alice2ModeInfo, String characterId, ByteString unknownFields) {
        return new TDialogState(dialogId, folderId, dialogType, alice2ModeInfo, characterId, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TDialogState)) {
            return false;
        }
        TDialogState tDialogState = (TDialogState) other;
        return jl40.l(unknownFields(), tDialogState.unknownFields()) && jl40.l(this.dialogId, tDialogState.dialogId) && jl40.l(this.folderId, tDialogState.folderId) && this.dialogType == tDialogState.dialogType && jl40.l(this.alice2ModeInfo, tDialogState.alice2ModeInfo) && jl40.l(this.characterId, tDialogState.characterId);
    }

    public final TAlice2ModeInfo getAlice2ModeInfo() {
        return this.alice2ModeInfo;
    }

    public final String getCharacterId() {
        return this.characterId;
    }

    public final String getDialogId() {
        return this.dialogId;
    }

    public final EDialogType getDialogType() {
        return this.dialogType;
    }

    public final String getFolderId() {
        return this.folderId;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.dialogId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.folderId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        EDialogType eDialogType = this.dialogType;
        int hashCode4 = (hashCode3 + (eDialogType != null ? eDialogType.hashCode() : 0)) * 37;
        TAlice2ModeInfo tAlice2ModeInfo = this.alice2ModeInfo;
        int hashCode5 = (hashCode4 + (tAlice2ModeInfo != null ? tAlice2ModeInfo.hashCode() : 0)) * 37;
        String str3 = this.characterId;
        int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m518newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.dialogId;
        if (str != null) {
            unr0.B("dialogId=", Internal.sanitize(str), arrayList);
        }
        String str2 = this.folderId;
        if (str2 != null) {
            unr0.B("folderId=", Internal.sanitize(str2), arrayList);
        }
        EDialogType eDialogType = this.dialogType;
        if (eDialogType != null) {
            arrayList.add("dialogType=" + eDialogType);
        }
        TAlice2ModeInfo tAlice2ModeInfo = this.alice2ModeInfo;
        if (tAlice2ModeInfo != null) {
            arrayList.add("alice2ModeInfo=" + tAlice2ModeInfo);
        }
        String str3 = this.characterId;
        if (str3 != null) {
            unr0.B("characterId=", Internal.sanitize(str3), arrayList);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TDialogState{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m518newBuilder();
    }

    public TDialogState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public TDialogState(String str, String str2, EDialogType eDialogType, TAlice2ModeInfo tAlice2ModeInfo, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.dialogId = str;
        this.folderId = str2;
        this.dialogType = eDialogType;
        this.alice2ModeInfo = tAlice2ModeInfo;
        this.characterId = str3;
    }
}
