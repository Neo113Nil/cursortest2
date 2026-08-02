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
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/webchat/THueAndSaturation;", "Lcom/squareup/wire/Message;", "", "hue", "", "saturation", "unknownFields", "Lokio/ByteString;", "<init>", "(DDLokio/ByteString;)V", "getHue$annotations", "()V", "getHue", "()D", "getSaturation$annotations", "getSaturation", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class THueAndSaturation extends Message {
    public static final ProtoAdapter<THueAndSaturation> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double hue;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double saturation;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(THueAndSaturation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<THueAndSaturation>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.endpoint.quark.webchat.THueAndSaturation$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public THueAndSaturation decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                double d = 0.0d;
                double d2 = 0.0d;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new THueAndSaturation(d, d2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        d = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        d2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, THueAndSaturation value) {
                Double valueOf = Double.valueOf(value.getHue());
                Double valueOf2 = Double.valueOf(0.0d);
                if (!valueOf.equals(valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getHue()));
                }
                if (!Double.valueOf(value.getSaturation()).equals(valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getSaturation()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(THueAndSaturation value) {
                int h = value.unknownFields().h();
                Double valueOf = Double.valueOf(value.getHue());
                Double valueOf2 = Double.valueOf(0.0d);
                if (!valueOf.equals(valueOf2)) {
                    h += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getHue()));
                }
                return !Double.valueOf(value.getSaturation()).equals(valueOf2) ? ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getSaturation())) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public THueAndSaturation redact(THueAndSaturation value) {
                return THueAndSaturation.copy$default(value, 0.0d, 0.0d, ByteString.c, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, THueAndSaturation value) {
                writer.writeBytes(value.unknownFields());
                Double valueOf = Double.valueOf(value.getSaturation());
                Double valueOf2 = Double.valueOf(0.0d);
                if (!valueOf.equals(valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getSaturation()));
                }
                if (Double.valueOf(value.getHue()).equals(valueOf2)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getHue()));
            }
        };
    }

    public /* synthetic */ THueAndSaturation(double d, double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ THueAndSaturation copy$default(THueAndSaturation tHueAndSaturation, double d, double d2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = tHueAndSaturation.hue;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = tHueAndSaturation.saturation;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            byteString = tHueAndSaturation.unknownFields();
        }
        return tHueAndSaturation.copy(d3, d4, byteString);
    }

    @ColumnNameOption("hue")
    public static /* synthetic */ void getHue$annotations() {
    }

    @ColumnNameOption("saturation")
    public static /* synthetic */ void getSaturation$annotations() {
    }

    public final THueAndSaturation copy(double hue, double saturation, ByteString unknownFields) {
        return new THueAndSaturation(hue, saturation, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof THueAndSaturation)) {
            return false;
        }
        THueAndSaturation tHueAndSaturation = (THueAndSaturation) other;
        return jl40.l(unknownFields(), tHueAndSaturation.unknownFields()) && this.hue == tHueAndSaturation.hue && this.saturation == tHueAndSaturation.saturation;
    }

    public final double getHue() {
        return this.hue;
    }

    public final double getSaturation() {
        return this.saturation;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Double.hashCode(this.saturation) + unr0.a(unknownFields().hashCode() * 37, 37, this.hue);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m704newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hue=" + this.hue);
        arrayList.add("saturation=" + this.saturation);
        return a.X(arrayList, Extension.FIX_SPACE, "THueAndSaturation{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m704newBuilder();
    }

    public THueAndSaturation() {
        this(0.0d, 0.0d, null, 7, null);
    }

    public THueAndSaturation(double d, double d2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.hue = d;
        this.saturation = d2;
    }
}
