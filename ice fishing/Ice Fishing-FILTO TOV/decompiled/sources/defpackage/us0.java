package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class us0 {
    public final WRKkgoJXwDn GWasM1elztuh;
    public final Object[] X1lG3V04pd;
    public final String Yi7zF1RB1;
    public final int xqGvceK5x;

    public us0(ay ayVar, String str, Object[] objArr) {
        this.GWasM1elztuh = ayVar;
        this.Yi7zF1RB1 = str;
        this.X1lG3V04pd = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.xqGvceK5x = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.xqGvceK5x = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int GWasM1elztuh() {
        int i = this.xqGvceK5x;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
