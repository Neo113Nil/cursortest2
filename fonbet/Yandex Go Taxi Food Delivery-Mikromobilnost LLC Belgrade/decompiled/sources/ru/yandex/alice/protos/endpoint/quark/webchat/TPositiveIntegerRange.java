package ru.yandex.alice.protos.endpoint.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
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
import defpackage.qv10;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/webchat/TPositiveIntegerRange;", "Lcom/squareup/wire/Message;", "", "min", "", CspBioProgressConstants.MAX, "unknownFields", "Lokio/ByteString;", "<init>", "(JJLokio/ByteString;)V", "getMin$annotations", "()V", "getMin", "()J", "getMax$annotations", "getMax", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TPositiveIntegerRange extends Message {
    public static final ProtoAdapter<TPositiveIntegerRange> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long max;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long min;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TPositiveIntegerRange.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TPositiveIntegerRange>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.quark.webchat.TPositiveIntegerRange$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TPositiveIntegerRange decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                long j = 0;
                long j2 = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TPositiveIntegerRange(j, j2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.UINT64.decode(reader).longValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        j2 = ProtoAdapter.UINT64.decode(reader).longValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TPositiveIntegerRange value) {
                if (value.getMin() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getMin()));
                }
                if (value.getMax() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getMax()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TPositiveIntegerRange value) {
                int h = value.unknownFields().h();
                if (value.getMin() != 0) {
                    h += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getMin()));
                }
                return value.getMax() != 0 ? ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getMax())) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TPositiveIntegerRange redact(TPositiveIntegerRange value) {
                return TPositiveIntegerRange.copy$default(value, 0L, 0L, ByteString.c, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TPositiveIntegerRange value) {
                writer.writeBytes(value.unknownFields());
                if (value.getMax() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getMax()));
                }
                if (value.getMin() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getMin()));
                }
            }
        };
    }

    public /* synthetic */ TPositiveIntegerRange(long j, long j2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TPositiveIntegerRange copy$default(TPositiveIntegerRange tPositiveIntegerRange, long j, long j2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tPositiveIntegerRange.min;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = tPositiveIntegerRange.max;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            byteString = tPositiveIntegerRange.unknownFields();
        }
        return tPositiveIntegerRange.copy(j3, j4, byteString);
    }

    @ColumnNameOption(CspBioProgressConstants.MAX)
    public static /* synthetic */ void getMax$annotations() {
    }

    @ColumnNameOption("min")
    public static /* synthetic */ void getMin$annotations() {
    }

    public final TPositiveIntegerRange copy(long min, long max, ByteString unknownFields) {
        return new TPositiveIntegerRange(min, max, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TPositiveIntegerRange)) {
            return false;
        }
        TPositiveIntegerRange tPositiveIntegerRange = (TPositiveIntegerRange) other;
        return jl40.l(unknownFields(), tPositiveIntegerRange.unknownFields()) && this.min == tPositiveIntegerRange.min && this.max == tPositiveIntegerRange.max;
    }

    public final long getMax() {
        return this.max;
    }

    public final long getMin() {
        return this.min;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Long.hashCode(this.max) + qv10.c(unknownFields().hashCode() * 37, 37, this.min);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m705newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("min=" + this.min);
        arrayList.add("max=" + this.max);
        return a.X(arrayList, Extension.FIX_SPACE, "TPositiveIntegerRange{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m705newBuilder();
    }

    public TPositiveIntegerRange() {
        this(0L, 0L, null, 7, null);
    }

    public TPositiveIntegerRange(long j, long j2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.min = j;
        this.max = j2;
    }
}
