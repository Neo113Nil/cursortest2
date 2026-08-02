package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.a;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kb5 extends uif implements Function2 {
    public static final kb5 A;
    public static final kb5 A0;
    public static final kb5 B;
    public static final kb5 B0;
    public static final kb5 C;
    public static final kb5 D;
    public static final kb5 E;
    public static final kb5 F;
    public static final kb5 G;
    public static final kb5 H;
    public static final kb5 I;
    public static final kb5 J;
    public static final kb5 K;
    public static final kb5 L;
    public static final kb5 X;
    public static final kb5 Y;
    public static final kb5 Z;
    public static final kb5 s;
    public static final kb5 t;
    public static final kb5 u;
    public static final kb5 v;
    public static final kb5 v0;
    public static final kb5 w;
    public static final kb5 w0;
    public static final kb5 x;
    public static final kb5 x0;
    public static final kb5 y;
    public static final kb5 y0;
    public static final kb5 z;
    public static final kb5 z0;
    public final /* synthetic */ int r;

    static {
        int i = 2;
        s = new kb5(i, 0);
        t = new kb5(i, 1);
        u = new kb5(i, 2);
        v = new kb5(i, 3);
        w = new kb5(i, 4);
        x = new kb5(i, 5);
        y = new kb5(i, 6);
        z = new kb5(i, 7);
        A = new kb5(i, 8);
        B = new kb5(i, 9);
        C = new kb5(i, 10);
        D = new kb5(i, 11);
        E = new kb5(i, 12);
        F = new kb5(i, 13);
        G = new kb5(i, 14);
        H = new kb5(i, 15);
        I = new kb5(i, 16);
        J = new kb5(i, 17);
        K = new kb5(i, 18);
        L = new kb5(i, 19);
        X = new kb5(i, 20);
        Y = new kb5(i, 21);
        Z = new kb5(i, 22);
        v0 = new kb5(i, 23);
        w0 = new kb5(i, 24);
        x0 = new kb5(i, 25);
        y0 = new kb5(i, 26);
        z0 = new kb5(i, 27);
        A0 = new kb5(i, 28);
        B0 = new kb5(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb5(int i, int i2) {
        super(i);
        this.r = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73, types: [xci] */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78, types: [xci] */
    /* JADX WARN: Type inference failed for: r10v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r10v83 */
    /* JADX WARN: Type inference failed for: r10v97 */
    /* JADX WARN: Type inference failed for: r10v98 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [eqi] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [eqi] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                String str = (String) obj;
                tkd tkdVar = (tkd) obj2;
                if (str.length() == 0) {
                    return tkdVar.toString();
                }
                return str + ", " + tkdVar;
            case 1:
                String str2 = (String) obj;
                wci wciVar = (wci) obj2;
                if (str2.length() == 0) {
                    return wciVar.toString();
                }
                return str2 + ", " + wciVar;
            case 2:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (!oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    oq5Var.S();
                }
                return Unit.a;
            case 3:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (!oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    oq5Var2.S();
                }
                return Unit.a;
            case 4:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                    }
                }
                return Unit.a;
            case 5:
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Number) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (!oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    oq5Var4.S();
                }
                return Unit.a;
            case 6:
                hq5 hq5Var5 = (hq5) obj;
                int intValue4 = ((Number) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (!oq5Var5.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    oq5Var5.S();
                }
                return Unit.a;
            case 7:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                    }
                }
                return Unit.a;
            case 8:
                hq5 hq5Var7 = (hq5) obj;
                int intValue5 = ((Number) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (!oq5Var7.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    oq5Var7.S();
                }
                return Unit.a;
            case 9:
                hq5 hq5Var8 = (hq5) obj;
                int intValue6 = ((Number) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (!oq5Var8.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    oq5Var8.S();
                }
                return Unit.a;
            case 10:
                hq5 hq5Var9 = (hq5) obj;
                int intValue7 = ((Number) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var9;
                if (!oq5Var9.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    oq5Var9.S();
                }
                return Unit.a;
            case 11:
                hq5 hq5Var10 = (hq5) obj;
                int intValue8 = ((Number) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var10;
                if (!oq5Var10.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    oq5Var10.S();
                }
                return Unit.a;
            case 12:
                hq5 hq5Var11 = (hq5) obj;
                int intValue9 = ((Number) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var11;
                if (!oq5Var11.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    oq5Var11.S();
                }
                return Unit.a;
            case 13:
                hq5 hq5Var12 = (hq5) obj;
                int intValue10 = ((Number) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var12;
                if (!oq5Var12.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    oq5Var12.S();
                }
                return Unit.a;
            case 14:
                hq5 hq5Var13 = (hq5) obj;
                int intValue11 = ((Number) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var13;
                if (!oq5Var13.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    oq5Var13.S();
                }
                return Unit.a;
            case 15:
                hq5 hq5Var14 = (hq5) obj;
                int intValue12 = ((Number) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var14;
                if (!oq5Var14.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    oq5Var14.S();
                }
                return Unit.a;
            case 16:
                ((Number) obj2).intValue();
                ((xp5) obj).getClass();
                return Unit.a;
            case 17:
                ((mpf) ((xp5) obj)).b0((kfh) obj2);
                return Unit.a;
            case 18:
                ((mpf) ((xp5) obj)).c0((yci) obj2);
                return Unit.a;
            case 19:
                as5 as5Var = (as5) obj2;
                mpf mpfVar = (mpf) ((xp5) obj);
                mpfVar.B = as5Var;
                cr crVar = mpfVar.F;
                agr agrVar = es5.h;
                a aVar = (a) as5Var;
                aVar.getClass();
                mpfVar.Z((jx7) weo.L(aVar, agrVar));
                xof xofVar = (xof) weo.L(aVar, es5.n);
                if (mpfVar.z != xofVar) {
                    mpfVar.z = xofVar;
                    mpfVar.D();
                    mpf u2 = mpfVar.u();
                    if (u2 != null) {
                        u2.B();
                    }
                    mpfVar.C();
                    for (xci xciVar = (xci) crVar.f; xciVar != null; xciVar = xciVar.f) {
                        xciVar.A();
                    }
                }
                mpfVar.d0((aeu) weo.L(aVar, es5.s));
                xci xciVar2 = (xci) crVar.f;
                if ((xciVar2.d & SQLiteDatabase.OPEN_NOMUTEX) != 0) {
                    while (xciVar2 != null) {
                        if ((xciVar2.c & SQLiteDatabase.OPEN_NOMUTEX) != 0) {
                            cw7 cw7Var = xciVar2;
                            ?? r1 = 0;
                            while (cw7Var != 0) {
                                if (cw7Var instanceof yr5) {
                                    xci xciVar3 = ((xci) ((yr5) cw7Var)).a;
                                    if (xciVar3.n) {
                                        g8j.c(xciVar3);
                                    } else {
                                        xciVar3.j = true;
                                    }
                                } else if ((cw7Var.c & SQLiteDatabase.OPEN_NOMUTEX) != 0 && (cw7Var instanceof cw7)) {
                                    xci xciVar4 = cw7Var.p;
                                    int i = 0;
                                    r1 = r1;
                                    cw7Var = cw7Var;
                                    while (xciVar4 != null) {
                                        if ((xciVar4.c & SQLiteDatabase.OPEN_NOMUTEX) != 0) {
                                            i++;
                                            r1 = r1;
                                            if (i == 1) {
                                                cw7Var = xciVar4;
                                            } else {
                                                if (r1 == 0) {
                                                    r1 = new eqi(new xci[16]);
                                                }
                                                if (cw7Var != 0) {
                                                    r1.d(cw7Var);
                                                    cw7Var = 0;
                                                }
                                                r1.d(xciVar4);
                                            }
                                        }
                                        xciVar4 = xciVar4.f;
                                        r1 = r1;
                                        cw7Var = cw7Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cw7Var = bcx.p(r1);
                            }
                        }
                        if ((xciVar2.d & SQLiteDatabase.OPEN_NOMUTEX) != 0) {
                            xciVar2 = xciVar2.f;
                        }
                    }
                }
                return Unit.a;
            case 20:
                fp7 fp7Var = (fp7) obj2;
                return u75.h(Integer.valueOf(fp7Var.j()), Float.valueOf(yhn.c(fp7Var.k(), -0.5f, 0.5f)), Integer.valueOf(fp7Var.n()));
            case 21:
                return (eqa) ((dqa) obj2).a.g.getValue();
            case 22:
                mhb mhbVar = (mhb) obj;
                mhb mhbVar2 = (mhb) obj2;
                mhbVar.getClass();
                mhbVar2.getClass();
                return Boolean.valueOf(mhbVar == mhbVar2);
            case 23:
                mpd mpdVar = (mpd) obj;
                View view = (View) obj2;
                int i2 = y0a.b;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.getClass();
                u79 u79Var = (u79) layoutParams;
                return new opd(mpdVar.b, view.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) u79Var).leftMargin, ((ViewGroup.MarginLayoutParams) u79Var).rightMargin, mpdVar.d, u79Var.d);
            case 24:
                mpd mpdVar2 = (mpd) obj;
                View view2 = (View) obj2;
                int i3 = y0a.b;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.getClass();
                u79 u79Var2 = (u79) layoutParams2;
                return new opd(mpdVar2.c, view2.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) u79Var2).topMargin, ((ViewGroup.MarginLayoutParams) u79Var2).bottomMargin, mpdVar2.e, u79Var2.c);
            case 25:
                ((i3b) obj).b = (hce) obj2;
                return Unit.a;
            case 26:
                ((i3b) obj).a = (ukd) obj2;
                return Unit.a;
            case 27:
                ((i3b) obj).d = ((id6) obj2).a;
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l85 l85Var = (l85) obj2;
                ((i3b) obj).c = l85Var != null ? l85Var.a : null;
                return Unit.a;
            default:
                tkd tkdVar2 = (tkd) obj2;
                return tkdVar2 instanceof lfp ? tkdVar2 : obj;
        }
    }
}
