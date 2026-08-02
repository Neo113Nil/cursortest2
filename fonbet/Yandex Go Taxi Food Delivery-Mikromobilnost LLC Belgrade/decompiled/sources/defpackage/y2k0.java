package defpackage;

import java.util.GregorianCalendar;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class y2k0 implements KSerializer {
    public final o2f0 a = d6z.a("Rfc3339", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        String p = decoder.p();
        w610 g = z2k0.b.g(p);
        if (g == null) {
            throw new NumberFormatException("Invalid RFC3339 date/time format: ".concat(p));
        }
        int parseInt = Integer.parseInt((String) ((u1l) g.a()).get(1));
        int parseInt2 = Integer.parseInt((String) ((u1l) g.a()).get(2)) - 1;
        int parseInt3 = Integer.parseInt((String) ((u1l) g.a()).get(3));
        boolean z = ((CharSequence) ((u1l) g.a()).get(4)).length() > 0;
        String str2 = (String) ((u1l) g.a()).get(9);
        boolean z2 = str2.length() > 0;
        if (z2 && !z) {
            throw new NumberFormatException("Invalid RFC33339 date/time format, cannot specify time zone shift without specifying time: ".concat(p));
        }
        if (z) {
            int parseInt4 = Integer.parseInt((String) ((u1l) g.a()).get(5));
            int parseInt5 = Integer.parseInt((String) ((u1l) g.a()).get(6));
            int parseInt6 = Integer.parseInt((String) ((u1l) g.a()).get(7));
            if (((CharSequence) ((u1l) g.a()).get(8)).length() > 0) {
                str = str2;
                i = (int) (Integer.parseInt(((String) ((u1l) g.a()).get(8)).substring(1)) / Math.pow(10.0d, ((String) ((u1l) g.a()).get(8)).substring(1).length() - 3));
                i4 = parseInt6;
            } else {
                str = str2;
                i4 = parseInt6;
                i = 0;
            }
            i3 = parseInt5;
            i2 = parseInt4;
        } else {
            str = str2;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(z2k0.a);
        gregorianCalendar.set(parseInt, parseInt2, parseInt3, i2, i3, i4);
        gregorianCalendar.set(14, i);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (z && z2 && Character.toUpperCase(str.charAt(0)) != 'Z') {
            int parseInt7 = Integer.parseInt((String) ((u1l) g.a()).get(12)) + (Integer.parseInt((String) ((u1l) g.a()).get(11)) * 60);
            if (((String) ((u1l) g.a()).get(10)).charAt(0) == '-') {
                parseInt7 = -parseInt7;
            }
            timeInMillis -= parseInt7 * 60000;
        }
        return Long.valueOf(timeInMillis);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((Number) obj).longValue();
        throw new IllegalStateException("Serialization not supported");
    }
}
