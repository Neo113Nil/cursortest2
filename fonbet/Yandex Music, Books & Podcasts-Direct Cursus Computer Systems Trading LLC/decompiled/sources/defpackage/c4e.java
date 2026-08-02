package defpackage;

import java.util.GregorianCalendar;
import java.util.TimeZone;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.Hostname;

/* loaded from: classes5.dex */
public final class c4e implements t9f {
    public final /* synthetic */ int a;
    public final gsm b;

    public c4e(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = avf.g("HttpUrl", csm.j);
                break;
            case 2:
                this.b = avf.g("Rfc3339", csm.j);
                break;
            default:
                this.b = avf.g("Hostname", csm.j);
                break;
        }
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        jch jchVar;
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        switch (this.a) {
            case 0:
                eg7Var.getClass();
                return new Hostname(eg7Var.A());
            case 1:
                eg7Var.getClass();
                String A = eg7Var.A();
                A.getClass();
                u7e u7eVar = null;
                try {
                    s7e s7eVar = new s7e();
                    s7eVar.h(null, A);
                    u7eVar = s7eVar.e();
                } catch (IllegalArgumentException unused) {
                }
                u7eVar.getClass();
                return u7eVar;
            default:
                eg7Var.getClass();
                String A2 = eg7Var.A();
                TimeZone timeZone = mdo.a;
                A2.getClass();
                jch d = mdo.b.d(A2);
                if (d == null) {
                    throw new NumberFormatException("Invalid RFC3339 date/time format: ".concat(A2));
                }
                int parseInt = Integer.parseInt((String) ((fb9) d.a()).get(1));
                int parseInt2 = Integer.parseInt((String) ((fb9) d.a()).get(2)) - 1;
                int parseInt3 = Integer.parseInt((String) ((fb9) d.a()).get(3));
                boolean z2 = ((CharSequence) ((fb9) d.a()).get(4)).length() > 0;
                String str2 = (String) ((fb9) d.a()).get(9);
                boolean z3 = str2.length() > 0;
                if (z3 && !z2) {
                    throw new NumberFormatException("Invalid RFC33339 date/time format, cannot specify time zone shift without specifying time: ".concat(A2));
                }
                if (z2) {
                    int parseInt4 = Integer.parseInt((String) ((fb9) d.a()).get(5));
                    int parseInt5 = Integer.parseInt((String) ((fb9) d.a()).get(6));
                    int parseInt6 = Integer.parseInt((String) ((fb9) d.a()).get(7));
                    if (((CharSequence) ((fb9) d.a()).get(8)).length() > 0) {
                        str = str2;
                        i5 = parseInt4;
                        jchVar = d;
                        z = z2;
                        i = (int) (Integer.parseInt(((String) ((fb9) d.a()).get(8)).substring(1)) / Math.pow(10.0d, ((String) ((fb9) d.a()).get(8)).substring(1).length() - 3));
                        i4 = parseInt6;
                    } else {
                        i5 = parseInt4;
                        jchVar = d;
                        z = z2;
                        str = str2;
                        i4 = parseInt6;
                        i = 0;
                    }
                    i3 = parseInt5;
                    i2 = i5;
                } else {
                    jchVar = d;
                    z = z2;
                    str = str2;
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(mdo.a);
                gregorianCalendar.set(parseInt, parseInt2, parseInt3, i2, i3, i4);
                gregorianCalendar.set(14, i);
                long timeInMillis = gregorianCalendar.getTimeInMillis();
                if (z && z3 && Character.toUpperCase(str.charAt(0)) != 'Z') {
                    int parseInt7 = Integer.parseInt((String) ((fb9) jchVar.a()).get(12)) + (Integer.parseInt((String) ((fb9) jchVar.a()).get(11)) * 60);
                    if (((String) ((fb9) jchVar.a()).get(10)).charAt(0) == '-') {
                        parseInt7 = -parseInt7;
                    }
                    timeInMillis -= parseInt7 * 60000;
                }
                return Long.valueOf(timeInMillis);
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        switch (this.a) {
            case 0:
                l6bVar.getClass();
                ((Hostname) obj).getClass();
                throw new IllegalStateException("Serialization not supported");
            case 1:
                l6bVar.getClass();
                ((u7e) obj).getClass();
                throw new IllegalStateException("Serialization not supported");
            default:
                ((Number) obj).longValue();
                l6bVar.getClass();
                throw new IllegalStateException("Serialization not supported");
        }
    }
}
