package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class d3 extends h50 implements wu {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(int i, Object obj) {
        super(0);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019d  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GWasM1elztuh() {
        df dfVar;
        int i = this.EljAMC1QTz;
        Context context = null;
        boolean z = false;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                qa1 qa1Var = (qa1) obj;
                Object EljAMC1QTz = qa1Var.GWasM1elztuh.EljAMC1QTz();
                cq cqVar = cq.AvO7iQsrTN;
                if (EljAMC1QTz == cqVar && qa1Var.xqGvceK5x.getValue() == cqVar) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                boolean GWasM1elztuh = b30.GWasM1elztuh(0L, 0L);
                View view = ((se) obj).GWasM1elztuh;
                if (!GWasM1elztuh) {
                    return new kl(0L, vc0.OOA6hdeuvCS(view.getContext()).Mjvvu5DE(o30.CMh55RymNfS(0L)));
                }
                Context context2 = view.getContext();
                Context context3 = context2;
                while (context3 instanceof ContextWrapper) {
                    if ((context3 instanceof Activity) || (context3 instanceof InputMethodService) || (context3 instanceof Application)) {
                        context = context3;
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) context3;
                        if (contextWrapper.getBaseContext() != null) {
                            context3 = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        Configuration configuration = context2.getResources().getConfiguration();
                        il OOA6hdeuvCS = vc0.OOA6hdeuvCS(context2);
                        long xqGvceK5x = o30.xqGvceK5x(configuration.screenWidthDp, configuration.screenHeightDp);
                        long CMh55RymNfS = OOA6hdeuvCS.CMh55RymNfS(xqGvceK5x);
                        return new kl((((int) Float.intBitsToFloat((int) (CMh55RymNfS >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (CMh55RymNfS & 4294967295L))) & 4294967295L), xqGvceK5x);
                    }
                    ih1.GWasM1elztuh.getClass();
                    jh1 jh1Var = hh1.Yi7zF1RB1;
                    jh1Var.getClass();
                    ContextWrapper contextWrapper2 = (ContextWrapper) context;
                    int i2 = Build.VERSION.SDK_INT;
                    gh1 OOA6hdeuvCS2 = (i2 >= 34 ? gl.EljAMC1QTz : i2 >= 30 ? j7.EljAMC1QTz : k61.JFJ3QoxA).OOA6hdeuvCS(contextWrapper2, jh1Var.Yi7zF1RB1);
                    long height = (OOA6hdeuvCS2.GWasM1elztuh().height() & 4294967295L) | (OOA6hdeuvCS2.GWasM1elztuh().width() << 32);
                    return new kl(height, vc0.OOA6hdeuvCS(context).Mjvvu5DE(o30.CMh55RymNfS(height)));
                }
                if (context != null) {
                }
                break;
            case 2:
                ((rt) obj).XmVeRDAr();
                return kc1Var;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                Object systemService = ((View) ((j6IIN2O8eOU) obj).EljAMC1QTz).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 4:
                k60 k60Var = ((g60) obj).MZhzXH72;
                k60Var.WIEu4Ya2g8.EXrPz3p7hFb = true;
                ac0 ac0Var = k60Var.YmKjaVtbfp5Z;
                if (ac0Var != null) {
                    ac0Var.WdrkLMV3xh = true;
                }
                return kc1Var;
            case 5:
                n60 n60Var = (n60) obj;
                if (!((Boolean) n60Var.AvO7iQsrTN.getValue()).booleanValue() && (dfVar = n60Var.X1lG3V04pd) != null) {
                    dfVar.E7jCp8Ls();
                }
                return kc1Var;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                dc0 dc0Var = (dc0) ((z90) obj).GWasM1elztuh.EljAMC1QTz;
                if (!dc0Var.EljAMC1QTz) {
                    if (dc0Var.AvO7iQsrTN) {
                        uq0.GWasM1elztuh("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    dc0Var.GWasM1elztuh();
                    dc0Var.AvO7iQsrTN = true;
                }
                return kc1Var;
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                return (ph) ((rx0) obj).encWxUiV2;
            case 8:
                return ((nj0) obj).gqMuANyCes();
            case 9:
                mt0 mt0Var = (mt0) obj;
                mt0Var.encWxUiV2 = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    mt0Var.GWasM1elztuh();
                    return kc1Var;
                } finally {
                    Trace.endSection();
                }
            case 10:
                v60 GWasM1elztuh2 = ((o61) obj).GWasM1elztuh();
                g60 g60Var = GWasM1elztuh2.OOA6hdeuvCS;
                if (GWasM1elztuh2.Mjvvu5DE != ((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.AvO7iQsrTN) {
                    hg0 hg0Var = GWasM1elztuh2.JFJ3QoxA;
                    Object[] objArr = hg0Var.X1lG3V04pd;
                    long[] jArr = hg0Var.GWasM1elztuh;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        ((n60) objArr[(i3 << 3) + i5]).xqGvceK5x = true;
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    if (g60Var.E7jCp8Ls != null) {
                        if (!g60Var.MZhzXH72.OOA6hdeuvCS) {
                            g60.qugwajBSa59j(g60Var, false, 7);
                        }
                    } else if (!g60Var.YmKjaVtbfp5Z()) {
                        g60.MItybXapHX(g60Var, false, 7);
                    }
                }
                return kc1Var;
            case 11:
                return new BaseInputConnection(((h81) obj).GWasM1elztuh, false);
            default:
                ((rd1) obj).AvO7iQsrTN.setValue(kc1Var);
                return kc1Var;
        }
    }
}
