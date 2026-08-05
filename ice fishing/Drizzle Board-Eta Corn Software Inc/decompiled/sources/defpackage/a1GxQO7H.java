package defpackage;

import android.graphics.Typeface;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1GxQO7H implements Runnable {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final /* synthetic */ Object wxUZMvaN;

    public /* synthetic */ a1GxQO7H(Runnable runnable, HzhOLUMW hzhOLUMW) {
        this.NCTxEWno = 3;
        this.wxUZMvaN = runnable;
        this.MdtA4re8 = hzhOLUMW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HzhOLUMW hzhOLUMW;
        int i = this.NCTxEWno;
        Object obj = this.MdtA4re8;
        Object obj2 = this.wxUZMvaN;
        switch (i) {
            case 0:
                hzhOLUMW = (HzhOLUMW) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                }
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                d80 d80Var = (d80) obj2;
                if (arrayList.contains(d80Var)) {
                    arrayList.remove(d80Var);
                    View view = d80Var.MdtA4re8.ytu5o6f4;
                    int i2 = d80Var.qoPGr6Ce;
                    view.getClass();
                    q70.qoPGr6Ce(view, i2);
                    return;
                }
                return;
            case 2:
                ((ej0) obj).eIA6dogk((Typeface) obj2);
                return;
            default:
                hzhOLUMW = (HzhOLUMW) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ a1GxQO7H(Object obj, int i, Object obj2) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
        this.wxUZMvaN = obj2;
    }

    public /* synthetic */ a1GxQO7H(ArrayList arrayList, d80 d80Var, pb pbVar) {
        this.NCTxEWno = 1;
        this.MdtA4re8 = arrayList;
        this.wxUZMvaN = d80Var;
    }
}
