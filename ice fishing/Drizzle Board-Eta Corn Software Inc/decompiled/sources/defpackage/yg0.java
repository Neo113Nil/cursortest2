package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yg0 {
    public Interpolator MdtA4re8;
    public boolean VgvYg0wo;
    public zg0 wxUZMvaN;
    public long NCTxEWno = -1;
    public final cd0 P7K7Inc8 = new cd0(this);
    public final ArrayList qoPGr6Ce = new ArrayList();

    public final void NCTxEWno() {
        View view;
        if (this.VgvYg0wo) {
            return;
        }
        ArrayList arrayList = this.qoPGr6Ce;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xg0 xg0Var = (xg0) obj;
            long j = this.NCTxEWno;
            if (j >= 0) {
                xg0Var.MdtA4re8(j);
            }
            Interpolator interpolator = this.MdtA4re8;
            if (interpolator != null && (view = (View) xg0Var.qoPGr6Ce.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.wxUZMvaN != null) {
                xg0Var.wxUZMvaN(this.P7K7Inc8);
            }
            View view2 = (View) xg0Var.qoPGr6Ce.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.VgvYg0wo = true;
    }

    public final void qoPGr6Ce() {
        if (this.VgvYg0wo) {
            ArrayList arrayList = this.qoPGr6Ce;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((xg0) obj).NCTxEWno();
            }
            this.VgvYg0wo = false;
        }
    }
}
