package defpackage;

import java.io.DataInput;
import java.util.Arrays;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.a;

/* loaded from: classes5.dex */
public final class ud7 {
    public final td7 a;
    public final String b;
    public final int c;

    public ud7(td7 td7Var, String str, int i) {
        this.a = td7Var;
        this.b = str;
        this.c = i;
    }

    public static ud7 c(DataInput dataInput) {
        return new ud7(new td7((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) a.b(dataInput)), dataInput.readUTF(), (int) a.b(dataInput));
    }

    public final long a(long j, int i, int i2) {
        td7 td7Var = this.a;
        int i3 = td7Var.f;
        int i4 = td7Var.b;
        char c = td7Var.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        ISOChronology iSOChronology = ISOChronology.J;
        long b = td7Var.b(iSOChronology, iSOChronology.n.a(Math.min(i3, 86399999), iSOChronology.n.A(0, iSOChronology.D.A(i4, j3))));
        if (td7Var.d != 0) {
            b = td7Var.d(iSOChronology, b);
            if (b <= j3) {
                b = td7Var.d(iSOChronology, td7Var.b(iSOChronology, iSOChronology.D.A(i4, iSOChronology.E.a(1, b))));
            }
        } else if (b <= j3) {
            b = td7Var.b(iSOChronology, iSOChronology.E.a(1, b));
        }
        return iSOChronology.n.a(i3, iSOChronology.n.A(0, b)) - j2;
    }

    public final long b(long j, int i, int i2) {
        td7 td7Var = this.a;
        int i3 = td7Var.f;
        int i4 = td7Var.b;
        char c = td7Var.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        ISOChronology iSOChronology = ISOChronology.J;
        long c2 = td7Var.c(iSOChronology, iSOChronology.n.a(i3, iSOChronology.n.A(0, iSOChronology.D.A(i4, j3))));
        if (td7Var.d != 0) {
            c2 = td7Var.d(iSOChronology, c2);
            if (c2 >= j3) {
                c2 = td7Var.d(iSOChronology, td7Var.c(iSOChronology, iSOChronology.D.A(i4, iSOChronology.E.a(-1, c2))));
            }
        } else if (c2 >= j3) {
            c2 = td7Var.c(iSOChronology, iSOChronology.E.a(-1, c2));
        }
        return iSOChronology.n.a(i3, iSOChronology.n.A(0, c2)) - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud7)) {
            return false;
        }
        ud7 ud7Var = (ud7) obj;
        return this.c == ud7Var.c && this.b.equals(ud7Var.b) && this.a.equals(ud7Var.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }

    public final String toString() {
        return this.a + " named " + this.b + " at " + this.c;
    }
}
