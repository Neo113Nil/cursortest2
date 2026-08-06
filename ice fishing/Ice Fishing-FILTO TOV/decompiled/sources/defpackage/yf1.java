package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yf1 extends WindowInsetsAnimation$Callback {
    public final mb GWasM1elztuh;
    public ArrayList X1lG3V04pd;
    public List Yi7zF1RB1;
    public final HashMap xqGvceK5x;

    public yf1(mb mbVar) {
        super(mbVar.OOA6hdeuvCS);
        this.xqGvceK5x = new HashMap();
        this.GWasM1elztuh = mbVar;
    }

    public final bg1 GWasM1elztuh(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.xqGvceK5x;
        bg1 bg1Var = (bg1) hashMap.get(windowInsetsAnimation);
        if (bg1Var != null) {
            return bg1Var;
        }
        bg1 bg1Var2 = new bg1(0, null, 0L);
        bg1Var2.GWasM1elztuh = new zf1(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, bg1Var2);
        return bg1Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.GWasM1elztuh.OOA6hdeuvCS(GWasM1elztuh(windowInsetsAnimation));
        this.xqGvceK5x.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.GWasM1elztuh.EljAMC1QTz(GWasM1elztuh(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.X1lG3V04pd;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.X1lG3V04pd = arrayList2;
            this.Yi7zF1RB1 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation JFJ3QoxA = JFXS9W1rB5s4.JFJ3QoxA(list.get(size));
            bg1 GWasM1elztuh = GWasM1elztuh(JFJ3QoxA);
            fraction = JFJ3QoxA.getFraction();
            GWasM1elztuh.GWasM1elztuh.OOA6hdeuvCS(fraction);
            this.X1lG3V04pd.add(GWasM1elztuh);
        }
        return this.GWasM1elztuh.AvO7iQsrTN(wg1.X1lG3V04pd(windowInsets, null), this.Yi7zF1RB1).Yi7zF1RB1();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        d encWxUiV2 = this.GWasM1elztuh.encWxUiV2(GWasM1elztuh(windowInsetsAnimation), new d(bounds));
        encWxUiV2.getClass();
        JFXS9W1rB5s4.E7jCp8Ls();
        return JFXS9W1rB5s4.encWxUiV2(((e20) encWxUiV2.EljAMC1QTz).xqGvceK5x(), ((e20) encWxUiV2.AvO7iQsrTN).xqGvceK5x());
    }
}
