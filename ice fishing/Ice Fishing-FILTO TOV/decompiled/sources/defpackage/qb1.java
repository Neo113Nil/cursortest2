package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qb1 {
    public static final ThreadLocal xqGvceK5x = new ThreadLocal();
    public final int GWasM1elztuh;
    public volatile int X1lG3V04pd = 0;
    public final rx0 Yi7zF1RB1;

    public qb1(rx0 rx0Var, int i) {
        this.Yi7zF1RB1 = rx0Var;
        this.GWasM1elztuh = i;
    }

    public final int GWasM1elztuh(int i) {
        xd0 Yi7zF1RB1 = Yi7zF1RB1();
        int GWasM1elztuh = Yi7zF1RB1.GWasM1elztuh(16);
        if (GWasM1elztuh == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Yi7zF1RB1.encWxUiV2;
        int i2 = GWasM1elztuh + Yi7zF1RB1.OOA6hdeuvCS;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final xd0 Yi7zF1RB1() {
        ThreadLocal threadLocal = xqGvceK5x;
        xd0 xd0Var = (xd0) threadLocal.get();
        if (xd0Var == null) {
            xd0Var = new xd0();
            threadLocal.set(xd0Var);
        }
        yd0 yd0Var = (yd0) this.Yi7zF1RB1.OOA6hdeuvCS;
        int GWasM1elztuh = yd0Var.GWasM1elztuh(6);
        if (GWasM1elztuh != 0) {
            int i = GWasM1elztuh + yd0Var.OOA6hdeuvCS;
            int i2 = (this.GWasM1elztuh * 4) + ((ByteBuffer) yd0Var.encWxUiV2).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) yd0Var.encWxUiV2).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) yd0Var.encWxUiV2;
            xd0Var.encWxUiV2 = byteBuffer;
            if (byteBuffer != null) {
                xd0Var.OOA6hdeuvCS = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                xd0Var.EljAMC1QTz = i4;
                xd0Var.AvO7iQsrTN = ((ByteBuffer) xd0Var.encWxUiV2).getShort(i4);
                return xd0Var;
            }
            xd0Var.OOA6hdeuvCS = 0;
            xd0Var.EljAMC1QTz = 0;
            xd0Var.AvO7iQsrTN = 0;
        }
        return xd0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        xd0 Yi7zF1RB1 = Yi7zF1RB1();
        int GWasM1elztuh = Yi7zF1RB1.GWasM1elztuh(4);
        sb.append(Integer.toHexString(GWasM1elztuh != 0 ? ((ByteBuffer) Yi7zF1RB1.encWxUiV2).getInt(GWasM1elztuh + Yi7zF1RB1.OOA6hdeuvCS) : 0));
        sb.append(", codepoints:");
        xd0 Yi7zF1RB12 = Yi7zF1RB1();
        int GWasM1elztuh2 = Yi7zF1RB12.GWasM1elztuh(16);
        if (GWasM1elztuh2 != 0) {
            int i2 = GWasM1elztuh2 + Yi7zF1RB12.OOA6hdeuvCS;
            i = ((ByteBuffer) Yi7zF1RB12.encWxUiV2).getInt(((ByteBuffer) Yi7zF1RB12.encWxUiV2).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(GWasM1elztuh(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
