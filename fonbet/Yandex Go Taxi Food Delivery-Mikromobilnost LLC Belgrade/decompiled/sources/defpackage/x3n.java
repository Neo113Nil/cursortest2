package defpackage;

import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes9.dex */
public final class x3n implements KSerializer {
    public static final x3n a = new x3n();
    public static final o2f0 b = new o2f0("kotlin.time.Duration", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        o430 o430Var = e3n.b;
        String p = decoder.p();
        try {
            long H = kp50.H(p);
            if (e3n.d(H, e3n.x)) {
                throw new IllegalStateException("invariant failed");
            }
            return new e3n(H);
        } catch (IllegalArgumentException e) {
            yci0.p(oyr.p("Invalid ISO duration string format: '", p, "'."), e);
            return null;
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((e3n) obj).a;
        o430 o430Var = e3n.b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append(LicenseUtility.SEPARATOR);
        }
        sb.append("PT");
        long q = j < 0 ? e3n.q(j) : j;
        long o = e3n.o(q, DurationUnit.HOURS);
        int f = e3n.f(q);
        int h = e3n.h(q);
        int g = e3n.g(q);
        if (e3n.i(j)) {
            o = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = o != 0;
        boolean z3 = (h == 0 && g == 0) ? false : true;
        if (f != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(o);
            sb.append('H');
        }
        if (z) {
            sb.append(f);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            e3n.b(sb, h, g, 9, "S", true);
        }
        encoder.t(sb.toString());
    }
}
