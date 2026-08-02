package ru.yandex.alice.protos.endpoint.capabilities.platform.utils;

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
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.data.dialog_state.platform.utils.TDialogState;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/yandex/alice/protos/endpoint/capabilities/platform/utils/TSetActiveDialogDirective;", "Lcom/squareup/wire/Message;", "", "DialogState", "Lru/yandex/alice/protos/data/dialog_state/platform/utils/TDialogState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/protos/data/dialog_state/platform/utils/TDialogState;Lokio/ByteString;)V", "getDialogState", "()Lru/yandex/alice/protos/data/dialog_state/platform/utils/TDialogState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TSetActiveDialogDirective extends Message {
    public static final ProtoAdapter<TSetActiveDialogDirective> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.data.dialog_state.platform.utils.TDialogState#ADAPTER", jsonName = "dialog_state", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TDialogState DialogState;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TSetActiveDialogDirective.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TSetActiveDialogDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.capabilities.platform.utils.TSetActiveDialogDirective$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TSetActiveDialogDirective decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TDialogState tDialogState = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TSetActiveDialogDirective(tDialogState, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tDialogState = TDialogState.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TSetActiveDialogDirective value) {
                if (value.getDialogState() != null) {
                    TDialogState.ADAPTER.encodeWithTag(writer, 1, (int) value.getDialogState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TSetActiveDialogDirective value) {
                int h = value.unknownFields().h();
                return value.getDialogState() != null ? TDialogState.ADAPTER.encodedSizeWithTag(1, value.getDialogState()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TSetActiveDialogDirective redact(TSetActiveDialogDirective value) {
                TDialogState dialogState = value.getDialogState();
                return value.copy(dialogState != null ? TDialogState.ADAPTER.redact(dialogState) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TSetActiveDialogDirective value) {
                writer.writeBytes(value.unknownFields());
                if (value.getDialogState() != null) {
                    TDialogState.ADAPTER.encodeWithTag(writer, 1, (int) value.getDialogState());
                }
            }
        };
    }

    public /* synthetic */ TSetActiveDialogDirective(TDialogState tDialogState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tDialogState, (i & 2) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TSetActiveDialogDirective copy$default(TSetActiveDialogDirective tSetActiveDialogDirective, TDialogState tDialogState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tDialogState = tSetActiveDialogDirective.DialogState;
        }
        if ((i & 2) != 0) {
            byteString = tSetActiveDialogDirective.unknownFields();
        }
        return tSetActiveDialogDirective.copy(tDialogState, byteString);
    }

    public final TSetActiveDialogDirective copy(TDialogState DialogState, ByteString unknownFields) {
        return new TSetActiveDialogDirective(DialogState, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TSetActiveDialogDirective)) {
            return false;
        }
        TSetActiveDialogDirective tSetActiveDialogDirective = (TSetActiveDialogDirective) other;
        return jl40.l(unknownFields(), tSetActiveDialogDirective.unknownFields()) && jl40.l(this.DialogState, tSetActiveDialogDirective.DialogState);
    }

    public final TDialogState getDialogState() {
        return this.DialogState;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TDialogState tDialogState = this.DialogState;
        int hashCode2 = hashCode + (tDialogState != null ? tDialogState.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m555newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TDialogState tDialogState = this.DialogState;
        if (tDialogState != null) {
            arrayList.add("DialogState=" + tDialogState);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TSetActiveDialogDirective{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m555newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TSetActiveDialogDirective() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public TSetActiveDialogDirective(TDialogState tDialogState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.DialogState = tDialogState;
    }
}
