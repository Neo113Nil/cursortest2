package ru.yandex.alice.megamind.protos.common.platform.utils;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.qoi0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lru/yandex/alice/megamind/protos/common/platform/utils/TStartSessionSemanticFrame;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TStartSessionSemanticFrame extends Message {
    public static final ProtoAdapter<TStartSessionSemanticFrame> ADAPTER;
    private static final long serialVersionUID = 0;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TStartSessionSemanticFrame.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TStartSessionSemanticFrame>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.megamind.protos.common.platform.utils.TStartSessionSemanticFrame$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TStartSessionSemanticFrame decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TStartSessionSemanticFrame(reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    reader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TStartSessionSemanticFrame value) {
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TStartSessionSemanticFrame value) {
                return value.unknownFields().h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TStartSessionSemanticFrame redact(TStartSessionSemanticFrame value) {
                return value.copy(ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TStartSessionSemanticFrame value) {
                writer.writeBytes(value.unknownFields());
            }
        };
    }

    public /* synthetic */ TStartSessionSemanticFrame(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TStartSessionSemanticFrame copy$default(TStartSessionSemanticFrame tStartSessionSemanticFrame, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = tStartSessionSemanticFrame.unknownFields();
        }
        return tStartSessionSemanticFrame.copy(byteString);
    }

    public final TStartSessionSemanticFrame copy(ByteString unknownFields) {
        return new TStartSessionSemanticFrame(unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof TStartSessionSemanticFrame) && jl40.l(unknownFields(), ((TStartSessionSemanticFrame) other).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m501newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "TStartSessionSemanticFrame{}";
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m501newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TStartSessionSemanticFrame() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TStartSessionSemanticFrame(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
