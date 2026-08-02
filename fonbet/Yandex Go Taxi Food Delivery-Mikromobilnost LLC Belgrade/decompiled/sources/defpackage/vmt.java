package defpackage;

import java.util.Calendar;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class vmt implements KSerializer {
    public static final vmt a = new vmt();
    public static final i3y b = a.a(new gmt(4));
    public static final o2f0 c = d6z.a("Calendar", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String p = decoder.p();
        Calendar b2 = ((drg) b.getValue()).b(p);
        if (b2 != null) {
            return b2;
        }
        yci0.m(oyr.p("Fail to decode calendar from \"", p, "\""));
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Calendar calendar = (Calendar) obj;
        ThreadLocal threadLocal = zqg.c;
        encoder.t(uh6.s(calendar.getTime(), calendar.getTimeZone()));
    }
}
