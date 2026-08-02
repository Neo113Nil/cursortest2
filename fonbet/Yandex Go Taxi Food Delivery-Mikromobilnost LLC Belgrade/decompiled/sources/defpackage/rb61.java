package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.YearMonth;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class rb61 implements KSerializer {
    public static final rb61 a = new rb61();
    public static final o2f0 b = d6z.a("kotlinx.datetime.YearMonth", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        jb61 jb61Var = YearMonth.Companion;
        String p = decoder.p();
        i3y i3yVar = pb61.b;
        e7 e7Var = (e7) i3yVar.getValue();
        jb61Var.getClass();
        if (e7Var != ((e7) i3yVar.getValue())) {
            return (YearMonth) e7Var.c(p);
        }
        try {
            return new YearMonth(java.time.YearMonth.parse(d6z.V(3, p.toString())));
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
        encoder.t(((YearMonth) obj).toString());
    }
}
