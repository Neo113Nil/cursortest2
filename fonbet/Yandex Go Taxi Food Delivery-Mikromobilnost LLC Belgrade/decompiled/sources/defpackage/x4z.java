package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class x4z implements KSerializer {
    public static final x4z a = new x4z();
    public static final o2f0 b = d6z.a("kotlinx.datetime.LocalTime", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        s4z s4zVar = LocalTime.Companion;
        String p = decoder.p();
        i3y i3yVar = w4z.a;
        v4z v4zVar = (v4z) i3yVar.getValue();
        s4zVar.getClass();
        if (v4zVar != ((v4z) i3yVar.getValue())) {
            return (LocalTime) v4zVar.c(p);
        }
        try {
            return new LocalTime(java.time.LocalTime.parse(p));
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
        encoder.t(((LocalTime) obj).toString());
    }
}
