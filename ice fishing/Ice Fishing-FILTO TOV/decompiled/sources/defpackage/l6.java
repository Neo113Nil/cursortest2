package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import com.combinations.level.experts.MainActivity;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ int OOA6hdeuvCS;
    public final /* synthetic */ Object encWxUiV2;
    public final /* synthetic */ Object mOu10nynGul;

    public /* synthetic */ l6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
        this.encWxUiV2 = obj3;
        this.mOu10nynGul = obj4;
        this.JFJ3QoxA = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lg0 k8h8IjolWQ;
        int i = this.OOA6hdeuvCS;
        Object obj = this.JFJ3QoxA;
        Object obj2 = this.mOu10nynGul;
        Object obj3 = this.encWxUiV2;
        Object obj4 = this.AvO7iQsrTN;
        Object obj5 = this.EljAMC1QTz;
        switch (i) {
            case 0:
                y81 y81Var = (y81) obj5;
                p50 p50Var = (p50) obj4;
                String str = (String) obj3;
                el elVar = (el) obj2;
                yt ytVar = (yt) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    y31 JFJ3QoxA = e41.JFJ3QoxA();
                    lg0 lg0Var = JFJ3QoxA instanceof lg0 ? (lg0) JFJ3QoxA : null;
                    if (lg0Var == null || (k8h8IjolWQ = lg0Var.k8h8IjolWQ(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        y31 JFJ3QoxA2 = k8h8IjolWQ.JFJ3QoxA();
                        try {
                            y81 WdrkLMV3xh = q70.WdrkLMV3xh(y81Var, p50Var);
                            xp xpVar = xp.OOA6hdeuvCS;
                            f1 f1Var = new f1(str, WdrkLMV3xh, xpVar, xpVar, ytVar, elVar);
                            f1Var.X1lG3V04pd();
                            f1Var.GWasM1elztuh();
                            y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                            k8h8IjolWQ.lv06NcmrQ().mOu10nynGul();
                            k8h8IjolWQ.X1lG3V04pd();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                ap apVar = (ap) obj5;
                n71 n71Var = (n71) obj4;
                n71 n71Var2 = (n71) obj3;
                View view = (View) obj;
                Window window = ((MainActivity) obj2).getWindow();
                window.getClass();
                dx0 dx0Var = n71Var.GWasM1elztuh;
                Resources resources = view.getResources();
                resources.getClass();
                dx0Var.mOu10nynGul(resources);
                Boolean bool = Boolean.TRUE;
                boolean booleanValue = bool.booleanValue();
                dx0 dx0Var2 = n71Var2.GWasM1elztuh;
                Resources resources2 = view.getResources();
                resources2.getClass();
                dx0Var2.mOu10nynGul(resources2);
                apVar.Yi7zF1RB1(n71Var, n71Var2, window, view, booleanValue, bool.booleanValue());
                return;
        }
    }
}
