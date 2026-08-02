package ru.yandex.alice.megamind.protos.common.platform.utils;

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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/yandex/alice/megamind/protos/common/platform/utils/TTypedSemanticFrame;", "Lcom/squareup/wire/Message;", "", "StartSessionSemanticFrame", "Lru/yandex/alice/megamind/protos/common/platform/utils/TStartSessionSemanticFrame;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lru/yandex/alice/megamind/protos/common/platform/utils/TStartSessionSemanticFrame;Lokio/ByteString;)V", "getStartSessionSemanticFrame", "()Lru/yandex/alice/megamind/protos/common/platform/utils/TStartSessionSemanticFrame;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TTypedSemanticFrame extends Message {
    public static final ProtoAdapter<TTypedSemanticFrame> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.megamind.protos.common.platform.utils.TStartSessionSemanticFrame#ADAPTER", jsonName = "start_session_semantic_frame", oneofName = "Type", schemaIndex = 0, tag = 188)
    private final TStartSessionSemanticFrame StartSessionSemanticFrame;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TTypedSemanticFrame.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TTypedSemanticFrame>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.megamind.protos.common.platform.utils.TTypedSemanticFrame$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TTypedSemanticFrame decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TStartSessionSemanticFrame tStartSessionSemanticFrame = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TTypedSemanticFrame(tStartSessionSemanticFrame, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 188) {
                        tStartSessionSemanticFrame = TStartSessionSemanticFrame.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TTypedSemanticFrame value) {
                TStartSessionSemanticFrame.ADAPTER.encodeWithTag(writer, 188, (int) value.getStartSessionSemanticFrame());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TTypedSemanticFrame value) {
                return TStartSessionSemanticFrame.ADAPTER.encodedSizeWithTag(188, value.getStartSessionSemanticFrame()) + value.unknownFields().h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TTypedSemanticFrame redact(TTypedSemanticFrame value) {
                TStartSessionSemanticFrame startSessionSemanticFrame = value.getStartSessionSemanticFrame();
                return value.copy(startSessionSemanticFrame != null ? TStartSessionSemanticFrame.ADAPTER.redact(startSessionSemanticFrame) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TTypedSemanticFrame value) {
                writer.writeBytes(value.unknownFields());
                TStartSessionSemanticFrame.ADAPTER.encodeWithTag(writer, 188, (int) value.getStartSessionSemanticFrame());
            }
        };
    }

    public /* synthetic */ TTypedSemanticFrame(TStartSessionSemanticFrame tStartSessionSemanticFrame, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tStartSessionSemanticFrame, (i & 2) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TTypedSemanticFrame copy$default(TTypedSemanticFrame tTypedSemanticFrame, TStartSessionSemanticFrame tStartSessionSemanticFrame, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tStartSessionSemanticFrame = tTypedSemanticFrame.StartSessionSemanticFrame;
        }
        if ((i & 2) != 0) {
            byteString = tTypedSemanticFrame.unknownFields();
        }
        return tTypedSemanticFrame.copy(tStartSessionSemanticFrame, byteString);
    }

    public final TTypedSemanticFrame copy(TStartSessionSemanticFrame StartSessionSemanticFrame, ByteString unknownFields) {
        return new TTypedSemanticFrame(StartSessionSemanticFrame, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TTypedSemanticFrame)) {
            return false;
        }
        TTypedSemanticFrame tTypedSemanticFrame = (TTypedSemanticFrame) other;
        return jl40.l(unknownFields(), tTypedSemanticFrame.unknownFields()) && jl40.l(this.StartSessionSemanticFrame, tTypedSemanticFrame.StartSessionSemanticFrame);
    }

    public final TStartSessionSemanticFrame getStartSessionSemanticFrame() {
        return this.StartSessionSemanticFrame;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TStartSessionSemanticFrame tStartSessionSemanticFrame = this.StartSessionSemanticFrame;
        int hashCode2 = hashCode + (tStartSessionSemanticFrame != null ? tStartSessionSemanticFrame.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m502newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TStartSessionSemanticFrame tStartSessionSemanticFrame = this.StartSessionSemanticFrame;
        if (tStartSessionSemanticFrame != null) {
            arrayList.add("StartSessionSemanticFrame=" + tStartSessionSemanticFrame);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TTypedSemanticFrame{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m502newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TTypedSemanticFrame() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public TTypedSemanticFrame(TStartSessionSemanticFrame tStartSessionSemanticFrame, ByteString byteString) {
        super(ADAPTER, byteString);
        this.StartSessionSemanticFrame = tStartSessionSemanticFrame;
    }
}
