package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.combinations.level.experts.R;
import com.combinations.level.experts.core.domain.model.LevelResult;
import com.combinations.level.experts.core.domain.model.Side;
import java.io.File;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class bCsSzSHkbaQ implements hv {
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ bCsSzSHkbaQ(int i, p80 p80Var) {
        this.OOA6hdeuvCS = 22;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        String valueOf;
        int i = 0;
        int i2 = 1;
        switch (this.OOA6hdeuvCS) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                ne0 ne0Var = (ne0) obj;
                ne0Var.getClass();
                pd pdVar = new pd(i2);
                a61 a61Var = rx0.mOu10nynGul;
                z40 z40Var = z40.OOA6hdeuvCS;
                ne0Var.GWasM1elztuh(new o21(new n6(a61Var, st0.GWasM1elztuh(gi.class), pdVar, z40Var)));
                int i3 = 2;
                ne0Var.GWasM1elztuh(new o21(new n6(a61Var, st0.GWasM1elztuh(lj.class), new pd(i3), z40Var)));
                int i4 = 3;
                ne0Var.GWasM1elztuh(new o21(new n6(a61Var, st0.GWasM1elztuh(oj.class), new pd(i4), z40Var)));
                ex0 ex0Var = new ex0(i2);
                z40 z40Var2 = z40.EljAMC1QTz;
                ne0Var.GWasM1elztuh(new cr(new n6(a61Var, st0.GWasM1elztuh(rd0.class), ex0Var, z40Var2)));
                ne0Var.GWasM1elztuh(new cr(new n6(a61Var, st0.GWasM1elztuh(kz0.class), new ex0(i3), z40Var2)));
                ne0Var.GWasM1elztuh(new cr(new n6(a61Var, st0.GWasM1elztuh(kx.class), new ex0(i4), z40Var2)));
                ne0Var.GWasM1elztuh(new cr(new n6(a61Var, st0.GWasM1elztuh(u11.class), new ex0(4), z40Var2)));
                return kc1.GWasM1elztuh;
            case 2:
                ((a3) obj).getClass();
                return hq.GWasM1elztuh(fb1.JFXS9W1rB5s4(220, 6, null));
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                ((a3) obj).getClass();
                return hq.Yi7zF1RB1(fb1.JFXS9W1rB5s4(160, 6, null));
            case 4:
                ti0 ti0Var = (ti0) obj;
                ti0Var.getClass();
                ti0Var.GWasM1elztuh("game/{level}");
                ti0Var.X1lG3V04pd = -1;
                kc1 kc1Var = kc1.GWasM1elztuh;
                ti0Var.OOA6hdeuvCS = true;
                ti0Var.EljAMC1QTz = false;
                ti0Var.Yi7zF1RB1 = true;
                return kc1Var;
            case 5:
                ti0 ti0Var2 = (ti0) obj;
                ti0Var2.getClass();
                ti0Var2.GWasM1elztuh("menu");
                ti0Var2.X1lG3V04pd = -1;
                kc1 kc1Var2 = kc1.GWasM1elztuh;
                ti0Var2.OOA6hdeuvCS = true;
                ti0Var2.EljAMC1QTz = false;
                ti0Var2.Yi7zF1RB1 = true;
                return kc1Var2;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                ((a3) obj).getClass();
                return hq.GWasM1elztuh(fb1.JFXS9W1rB5s4(220, 6, null));
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                ((a3) obj).getClass();
                return hq.Yi7zF1RB1(fb1.JFXS9W1rB5s4(160, 6, null));
            case 8:
                va vaVar = (va) obj;
                vaVar.getClass();
                return p40.GWasM1elztuh(vaVar);
            case 9:
                ((i60) obj).GWasM1elztuh();
                return kc1.GWasM1elztuh;
            case 10:
                return kc1.GWasM1elztuh;
            case 11:
                cp0 cp0Var = (cp0) obj;
                v51 v51Var = r.Yi7zF1RB1;
                cp0Var.getClass();
                if (((Context) rj0.AEn1Rrio(cp0Var, v51Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return f8.Yi7zF1RB1;
                }
                d8.GWasM1elztuh.getClass();
                return c8.X1lG3V04pd;
            case 12:
                j01.GWasM1elztuh((l01) obj, 0);
                return kc1.GWasM1elztuh;
            case 13:
                return kc1.GWasM1elztuh;
            case 14:
                ((va1) obj).getClass();
                throw new ClassCastException();
            case Side.ALL /* 15 */:
                ((va1) obj).getClass();
                throw new ClassCastException();
            case 16:
                cp0 cp0Var2 = (cp0) obj;
                lf lfVar = uz.GWasM1elztuh;
                cp0Var2.getClass();
                View view = ((gf1) rj0.AEn1Rrio(cp0Var2, lfVar)).GWasM1elztuh;
                while (view != null) {
                    Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
                    if (tag != null) {
                        return tag;
                    }
                    Object mE4lRynR = d70.mE4lRynR(view);
                    view = mE4lRynR instanceof View ? (View) mE4lRynR : null;
                }
                return null;
            case 17:
                eh ehVar = (eh) obj;
                if (ehVar instanceof ih) {
                    return (ih) ehVar;
                }
                return null;
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                int intValue = ((Number) entry.getKey()).intValue();
                LevelResult levelResult = (LevelResult) entry.getValue();
                return intValue + ":" + levelResult.getStars() + ":" + levelResult.getBestMoves() + ":" + levelResult.getBestTimeMs();
            case 19:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new r21(absolutePath);
            case 20:
                synchronized (e41.X1lG3V04pd) {
                    List list = e41.mOu10nynGul;
                    int size = list.size();
                    while (i < size) {
                        ((hv) list.get(i)).mOu10nynGul(obj);
                        i++;
                    }
                }
                return kc1.GWasM1elztuh;
            case 21:
                List list2 = (List) obj;
                return new u80(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 22:
                return kc1.GWasM1elztuh;
            case 23:
                un0 un0Var = (un0) obj;
                return "[" + un0Var.Yi7zF1RB1 + ", " + un0Var.X1lG3V04pd + ')';
            case 24:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                Object value = entry2.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int length = bArr.length;
                    int i5 = 0;
                    while (i < length) {
                        byte b = bArr[i];
                        i5++;
                        if (i5 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                        i++;
                    }
                    sb.append((CharSequence) "]");
                    valueOf = sb.toString();
                } else {
                    valueOf = String.valueOf(entry2.getValue());
                }
                return "  " + ((dr0) entry2.getKey()).GWasM1elztuh + " = " + valueOf;
            case 25:
                xh xhVar = (xh) obj;
                xhVar.getClass();
                return new gh0(fb1.jivtDDk9H(xhVar));
            case 26:
                return new a6(fb1.jivtDDk9H((xh) obj));
            case 27:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 28:
                xh0 xh0Var = (xh0) obj;
                xh0Var.getClass();
                bi0 bi0Var = xh0Var.AvO7iQsrTN;
                if (bi0Var == null || bi0Var.JFJ3QoxA.X1lG3V04pd != xh0Var.EljAMC1QTz.GWasM1elztuh) {
                    return null;
                }
                return bi0Var;
            default:
                xh0 xh0Var2 = (xh0) obj;
                xh0Var2.getClass();
                bi0 bi0Var2 = xh0Var2.AvO7iQsrTN;
                if (bi0Var2 == null || bi0Var2.JFJ3QoxA.X1lG3V04pd != xh0Var2.EljAMC1QTz.GWasM1elztuh) {
                    return null;
                }
                return bi0Var2;
        }
    }

    public /* synthetic */ bCsSzSHkbaQ(int i) {
        this.OOA6hdeuvCS = i;
    }
}
