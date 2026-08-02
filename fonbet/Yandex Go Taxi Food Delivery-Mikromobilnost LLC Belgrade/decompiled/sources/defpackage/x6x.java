package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class x6x implements KSerializer {
    public static final x6x a = new x6x();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = b.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = (ncx) decoder;
        b bVar = (b) decoder.B(b);
        sbx d = ncxVar.d();
        return new v6x((m5x) d.a(gtq0.H(d.b, qoi0.e(m5x.class)), bVar));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sbx d = ((vcx) encoder).d();
        encoder.j(gwk0.J(d, ((v6x) obj).a, gtq0.H(d.b, qoi0.e(m5x.class))), b);
    }
}
