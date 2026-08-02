package ru.yandex.alice.protos.data.yango;

import NYT.yango.ColumnNameOption;
import NYT.yango.DefaultFieldFlagsOption;
import NYT.yango.EWrapperFieldFlag;
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
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lru/yandex/alice/protos/data/yango/TLatLon;", "Lcom/squareup/wire/Message;", "", "latitude", "", "longitude", "accuracy", "unknownFields", "Lokio/ByteString;", "<init>", "(DDDLokio/ByteString;)V", "getLatitude$annotations", "()V", "getLatitude", "()D", "getLongitude$annotations", "getLongitude", "getAccuracy$annotations", "getAccuracy", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-yango_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TLatLon extends Message {
    public static final ProtoAdapter<TLatLon> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double accuracy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double latitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double longitude;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TLatLon.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TLatLon>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.data.yango.TLatLon$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TLatLon decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TLatLon(d, d2, d3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        d = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (nextTag == 2) {
                        d2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        d3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TLatLon value) {
                Double valueOf = Double.valueOf(value.getLatitude());
                Double valueOf2 = Double.valueOf(0.0d);
                if (!valueOf.equals(valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getLatitude()));
                }
                if (!Double.valueOf(value.getLongitude()).equals(valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getLongitude()));
                }
                if (!Double.valueOf(value.getAccuracy()).equals(valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAccuracy()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TLatLon value) {
                int h = value.unknownFields().h();
                Double valueOf = Double.valueOf(value.getLatitude());
                Double valueOf2 = Double.valueOf(0.0d);
                if (!valueOf.equals(valueOf2)) {
                    h += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getLatitude()));
                }
                if (!Double.valueOf(value.getLongitude()).equals(valueOf2)) {
                    h += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getLongitude()));
                }
                return !Double.valueOf(value.getAccuracy()).equals(valueOf2) ? ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getAccuracy())) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TLatLon redact(TLatLon value) {
                return TLatLon.copy$default(value, 0.0d, 0.0d, 0.0d, ByteString.c, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TLatLon value) {
                writer.writeBytes(value.unknownFields());
                Double valueOf = Double.valueOf(value.getAccuracy());
                Double valueOf2 = Double.valueOf(0.0d);
                if (!valueOf.equals(valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAccuracy()));
                }
                if (!Double.valueOf(value.getLongitude()).equals(valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getLongitude()));
                }
                if (Double.valueOf(value.getLatitude()).equals(valueOf2)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getLatitude()));
            }
        };
    }

    public /* synthetic */ TLatLon(double d, double d2, double d3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TLatLon copy$default(TLatLon tLatLon, double d, double d2, double d3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = tLatLon.latitude;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = tLatLon.longitude;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = tLatLon.accuracy;
        }
        double d6 = d3;
        if ((i & 8) != 0) {
            byteString = tLatLon.unknownFields();
        }
        return tLatLon.copy(d4, d5, d6, byteString);
    }

    @ColumnNameOption("accuracy")
    public static /* synthetic */ void getAccuracy$annotations() {
    }

    @ColumnNameOption("latitude")
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @ColumnNameOption("longitude")
    public static /* synthetic */ void getLongitude$annotations() {
    }

    public final TLatLon copy(double latitude, double longitude, double accuracy, ByteString unknownFields) {
        return new TLatLon(latitude, longitude, accuracy, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TLatLon)) {
            return false;
        }
        TLatLon tLatLon = (TLatLon) other;
        return jl40.l(unknownFields(), tLatLon.unknownFields()) && this.latitude == tLatLon.latitude && this.longitude == tLatLon.longitude && this.accuracy == tLatLon.accuracy;
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Double.hashCode(this.accuracy) + unr0.a(unr0.a(unknownFields().hashCode() * 37, 37, this.latitude), 37, this.longitude);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m519newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("latitude=" + this.latitude);
        arrayList.add("longitude=" + this.longitude);
        arrayList.add("accuracy=" + this.accuracy);
        return a.X(arrayList, Extension.FIX_SPACE, "TLatLon{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m519newBuilder();
    }

    public TLatLon() {
        this(0.0d, 0.0d, 0.0d, null, 15, null);
    }

    public TLatLon(double d, double d2, double d3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = d3;
    }
}
