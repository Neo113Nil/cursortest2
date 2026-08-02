package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDate;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class s2z implements KSerializer {
    public static final s2z a = new s2z();
    public static final o2f0 b = d6z.a("kotlinx.datetime.LocalDate", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        m2z m2zVar = LocalDate.Companion;
        String p = decoder.p();
        int i = n2z.a;
        i3y i3yVar = q2z.a;
        e7 e7Var = (e7) i3yVar.getValue();
        m2zVar.getClass();
        if (e7Var != ((e7) i3yVar.getValue())) {
            return (LocalDate) e7Var.c(p);
        }
        try {
            return new LocalDate(java.time.LocalDate.parse(d6z.V(6, p.toString())));
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
        encoder.t(((LocalDate) obj).toString());
    }
}
