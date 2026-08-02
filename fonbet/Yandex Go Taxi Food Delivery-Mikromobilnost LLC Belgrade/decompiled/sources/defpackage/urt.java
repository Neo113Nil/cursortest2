package defpackage;

import java.util.Arrays;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class urt implements KSerializer {
    public static final urt a = new urt();
    public static final i3y b = a.a(new gmt(11));
    public static final o2f0 c = d6z.a("TimeZone", h2f0.o);

    /* JADX WARN: Removed duplicated region for block: B:5:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    @Override // defpackage.myi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(Decoder decoder) {
        SimpleTimeZone a2;
        String p = decoder.p();
        drg drgVar = (drg) b.getValue();
        drgVar.getClass();
        if (p != null) {
            if (p.length() == 0) {
                a2 = drg.c;
            } else {
                Matcher matcher = ((Pattern) drgVar.b.getValue()).matcher(p);
                if (matcher.matches()) {
                    a2 = drg.a(p, matcher, 0);
                } else {
                    xby.d.k(new IllegalArgumentException("Wrong time zone format"), String.format("String %s is not a valid time zone", Arrays.copyOf(new Object[]{p}, 1)));
                }
            }
            if (a2 == null) {
                return a2;
            }
            yci0.m(oyr.p("Fail to decode TimeZone from \"", p, "\""));
            return null;
        }
        a2 = null;
        if (a2 == null) {
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ThreadLocal threadLocal = zqg.c;
        encoder.t(uh6.t((TimeZone) obj));
    }
}
