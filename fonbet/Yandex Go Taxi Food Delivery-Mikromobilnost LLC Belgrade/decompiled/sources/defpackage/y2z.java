package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class y2z implements KSerializer {
    public static final y2z a = new y2z();
    public static final o2f0 b = d6z.a("kotlinx.datetime.LocalDateTime", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        t2z t2zVar = LocalDateTime.Companion;
        String p = decoder.p();
        int i = u2z.a;
        t2zVar.getClass();
        try {
            return new LocalDateTime(java.time.LocalDateTime.parse(d6z.V(12, p.toString())));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException((Throwable) e);
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t(((LocalDateTime) obj).toString());
    }
}
