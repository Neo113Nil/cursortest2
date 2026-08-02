package ru.yandex.alice.protos.api.alice_mode_info.platform.utils;

import NYT.platform.utils.ColumnNameOption;
import NYT.platform.utils.DefaultFieldFlagsOption;
import NYT.platform.utils.EWrapperFieldFlag;
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
import defpackage.oyr;
import defpackage.qoi0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/TAlice2TrialState;", "Lcom/squareup/wire/Message;", "", "LeftCount", "", "Limit", "TimeLimitSec", "unknownFields", "Lokio/ByteString;", "<init>", "(IIILokio/ByteString;)V", "getLeftCount$annotations", "()V", "getLeftCount", "()I", "getLimit$annotations", "getLimit", "getTimeLimitSec$annotations", "getTimeLimitSec", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TAlice2TrialState extends Message {
    public static final ProtoAdapter<TAlice2TrialState> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "left_count", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int LeftCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "limit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int Limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "time_limit_sec", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int TimeLimitSec;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TAlice2TrialState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TAlice2TrialState>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.alice_mode_info.platform.utils.TAlice2TrialState$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TAlice2TrialState decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TAlice2TrialState(i, i2, i3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        i = ProtoAdapter.UINT32.decode(reader).intValue();
                    } else if (nextTag == 2) {
                        i2 = ProtoAdapter.UINT32.decode(reader).intValue();
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        i3 = ProtoAdapter.UINT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TAlice2TrialState value) {
                if (value.getLeftCount() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getLeftCount()));
                }
                if (value.getLimit() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLimit()));
                }
                if (value.getTimeLimitSec() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTimeLimitSec()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TAlice2TrialState value) {
                int h = value.unknownFields().h();
                if (value.getLeftCount() != 0) {
                    h += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getLeftCount()));
                }
                if (value.getLimit() != 0) {
                    h += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getLimit()));
                }
                return value.getTimeLimitSec() != 0 ? ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getTimeLimitSec())) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TAlice2TrialState redact(TAlice2TrialState value) {
                return TAlice2TrialState.copy$default(value, 0, 0, 0, ByteString.c, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TAlice2TrialState value) {
                writer.writeBytes(value.unknownFields());
                if (value.getTimeLimitSec() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getTimeLimitSec()));
                }
                if (value.getLimit() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLimit()));
                }
                if (value.getLeftCount() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getLeftCount()));
                }
            }
        };
    }

    public /* synthetic */ TAlice2TrialState(int i, int i2, int i3, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TAlice2TrialState copy$default(TAlice2TrialState tAlice2TrialState, int i, int i2, int i3, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tAlice2TrialState.LeftCount;
        }
        if ((i4 & 2) != 0) {
            i2 = tAlice2TrialState.Limit;
        }
        if ((i4 & 4) != 0) {
            i3 = tAlice2TrialState.TimeLimitSec;
        }
        if ((i4 & 8) != 0) {
            byteString = tAlice2TrialState.unknownFields();
        }
        return tAlice2TrialState.copy(i, i2, i3, byteString);
    }

    @ColumnNameOption("left_count")
    public static /* synthetic */ void getLeftCount$annotations() {
    }

    @ColumnNameOption("limit")
    public static /* synthetic */ void getLimit$annotations() {
    }

    @ColumnNameOption("time_limit_sec")
    public static /* synthetic */ void getTimeLimitSec$annotations() {
    }

    public final TAlice2TrialState copy(int LeftCount, int Limit, int TimeLimitSec, ByteString unknownFields) {
        return new TAlice2TrialState(LeftCount, Limit, TimeLimitSec, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TAlice2TrialState)) {
            return false;
        }
        TAlice2TrialState tAlice2TrialState = (TAlice2TrialState) other;
        return jl40.l(unknownFields(), tAlice2TrialState.unknownFields()) && this.LeftCount == tAlice2TrialState.LeftCount && this.Limit == tAlice2TrialState.Limit && this.TimeLimitSec == tAlice2TrialState.TimeLimitSec;
    }

    public final int getLeftCount() {
        return this.LeftCount;
    }

    public final int getLimit() {
        return this.Limit;
    }

    public final int getTimeLimitSec() {
        return this.TimeLimitSec;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Integer.hashCode(this.TimeLimitSec) + oyr.b(this.Limit, oyr.b(this.LeftCount, unknownFields().hashCode() * 37, 37), 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m505newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("LeftCount=" + this.LeftCount);
        arrayList.add("Limit=" + this.Limit);
        arrayList.add("TimeLimitSec=" + this.TimeLimitSec);
        return a.X(arrayList, Extension.FIX_SPACE, "TAlice2TrialState{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m505newBuilder();
    }

    public TAlice2TrialState() {
        this(0, 0, 0, null, 15, null);
    }

    public TAlice2TrialState(int i, int i2, int i3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.LeftCount = i;
        this.Limit = i2;
        this.TimeLimitSec = i3;
    }
}
