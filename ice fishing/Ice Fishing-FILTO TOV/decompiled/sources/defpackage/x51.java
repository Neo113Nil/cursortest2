package defpackage;

import android.app.Application;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class x51 implements vd1, wh {
    public static x51 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ x51(int i) {
        this.OOA6hdeuvCS = i;
    }

    public static final kd1 OOA6hdeuvCS(String str, int i) {
        WeakHashMap weakHashMap = bh1.lv06NcmrQ;
        return new kd1(new l20(0, 0, 0, 0), str);
    }

    public static final c2 X1lG3V04pd(String str, int i) {
        WeakHashMap weakHashMap = bh1.lv06NcmrQ;
        return new c2(str, i);
    }

    public static final int xqGvceK5x(int i, long j) {
        int i2 = n30.iwATDS1i01k;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public boolean EljAMC1QTz(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.td1
    public r3 iwATDS1i01k(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return j < 0 ? r3Var : r3Var2;
    }

    @Override // defpackage.vd1
    public int rQPn8YBR() {
        return 0;
    }

    public String toString() {
        switch (this.OOA6hdeuvCS) {
            case 1:
                return "ReusedSlotId";
            case 10:
                int hashCode = hashCode();
                ki1.Y6hRI1cF8(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + st0.GWasM1elztuh(Application.class).Yi7zF1RB1() + ">";
            case 11:
                int hashCode2 = hashCode();
                ki1.Y6hRI1cF8(16);
                String num2 = Integer.toString(hashCode2, 16);
                num2.getClass();
                return "CreationExtras.Key@" + num2 + "<" + st0.GWasM1elztuh(String.class).Yi7zF1RB1() + ">";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vd1
    public int uFEq9NpZ() {
        return 0;
    }

    @Override // defpackage.td1
    public r3 E7jCp8Ls(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return r3Var3;
    }
}
