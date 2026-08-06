package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.combinations.level.experts.R;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class hi1 {
    public static final ViewGroup.LayoutParams GWasM1elztuh = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final fi1 GWasM1elztuh(WIEu4Ya2g8 wIEu4Ya2g8, se seVar, jd jdVar) {
        c cVar;
        fi1 fi1Var;
        Object[] objArr = 0;
        if (ky.GWasM1elztuh.compareAndSet(false, true)) {
            n8 Yi7zF1RB1 = fb1.Yi7zF1RB1(1, null, 6);
            fb1.MZhzXH72(fb1.X1lG3V04pd((gh) v1.YmKjaVtbfp5Z.getValue()), null, new EljAMC1QTz(Yi7zF1RB1, objArr == true ? 1 : 0, 11), 3);
            NWXxPwoOUSX9 nWXxPwoOUSX9 = new NWXxPwoOUSX9(11, Yi7zF1RB1);
            synchronized (e41.X1lG3V04pd) {
                e41.mOu10nynGul = rb.gHe2tSmr6w(e41.mOu10nynGul, nWXxPwoOUSX9);
            }
            e41.GWasM1elztuh();
        }
        if (wIEu4Ya2g8.getChildCount() > 0) {
            View childAt = wIEu4Ya2g8.getChildAt(0);
            cVar = childAt instanceof c ? (c) childAt : null;
            if (cVar != null) {
                cVar.setComposeViewContext(seVar);
                if (cVar == null) {
                    cVar = new c(wIEu4Ya2g8.getContext(), seVar);
                    wIEu4Ya2g8.addView(cVar.getView(), GWasM1elztuh);
                }
                cVar.setComposeViewContext(seVar);
                if (wIEu4Ya2g8.getComposeViewContext$ui() != null) {
                    seVar.X1lG3V04pd();
                    cVar.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                Object tag = cVar.getTag(R.id.wrapped_composition_tag);
                fi1Var = tag instanceof fi1 ? (fi1) tag : null;
                if (fi1Var == null) {
                    fi1Var = new fi1(cVar, new df(seVar.Yi7zF1RB1, new ac1(cVar.getRoot())));
                    cVar.setTag(R.id.wrapped_composition_tag, fi1Var);
                }
                fi1Var.EljAMC1QTz(jdVar);
                cVar.setFrameEndScheduler$ui(new gi1(seVar.Yi7zF1RB1));
                return fi1Var;
            }
        } else {
            wIEu4Ya2g8.removeAllViews();
        }
        cVar = null;
        if (cVar == null) {
        }
        cVar.setComposeViewContext(seVar);
        if (wIEu4Ya2g8.getComposeViewContext$ui() != null) {
        }
        Object tag2 = cVar.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof fi1) {
        }
        if (fi1Var == null) {
        }
        fi1Var.EljAMC1QTz(jdVar);
        cVar.setFrameEndScheduler$ui(new gi1(seVar.Yi7zF1RB1));
        return fi1Var;
    }
}
