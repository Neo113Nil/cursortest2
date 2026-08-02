package defpackage;

import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public final class mdr implements yoe {
    public static final mdr c = new mdr(-1L, -1);
    public int a;
    public long b;

    public mdr(int i, long j) {
        vq1.v(j >= 0);
        this.a = i;
        this.b = j;
    }

    public static mdr c(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + (charAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new mdr(j, i3);
    }

    public static mdr d(s2c s2cVar, d7k d7kVar) {
        s2cVar.A(d7kVar.a, 0, 8);
        d7kVar.H(0);
        return new mdr(d7kVar.h(), d7kVar.m(), false);
    }

    public long a() {
        int i = this.a;
        long j = 0;
        if (i == 3 || i == 4) {
            j = 0 - this.b;
        } else if (i != 1) {
            if (i == 2) {
                j = System.nanoTime() - this.b;
            } else {
                Assertions.fail("Illegal running state has occurred.");
            }
        }
        return j / 1000000;
    }

    public boolean b() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // defpackage.yoe
    public voe toInstant() {
        long j = this.b;
        if (j >= voe.c.a && j <= voe.d.a) {
            return kg5.u(this.a, j);
        }
        throw new cbe("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }

    public /* synthetic */ mdr(long j, int i) {
        this.b = j;
        this.a = i;
    }

    public /* synthetic */ mdr(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
    }
}
