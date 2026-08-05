package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n5CPt0tX extends f50 {
    public final /* synthetic */ Object P7K7Inc8;
    public final /* synthetic */ int VgvYg0wo;

    public /* synthetic */ n5CPt0tX(int i, Object obj) {
        this.VgvYg0wo = i;
        this.P7K7Inc8 = obj;
    }

    @Override // defpackage.f50, defpackage.zg0
    public void MdtA4re8() {
        int i = this.VgvYg0wo;
        Object obj = this.P7K7Inc8;
        switch (i) {
            case 0:
                ((fhw4zlf4) obj).MdtA4re8.RXQxj5Oe.setVisibility(0);
                break;
            case 1:
                SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) obj;
                sJ7tYVsF.RXQxj5Oe.setVisibility(0);
                if (sJ7tYVsF.RXQxj5Oe.getParent() instanceof View) {
                    View view = (View) sJ7tYVsF.RXQxj5Oe.getParent();
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zg0
    public final void qoPGr6Ce() {
        int i = this.VgvYg0wo;
        Object obj = this.P7K7Inc8;
        switch (i) {
            case 0:
                SJ7tYVsF sJ7tYVsF = ((fhw4zlf4) obj).MdtA4re8;
                sJ7tYVsF.RXQxj5Oe.setAlpha(1.0f);
                sJ7tYVsF.WYNAV5pd.wxUZMvaN(null);
                sJ7tYVsF.WYNAV5pd = null;
                break;
            case 1:
                SJ7tYVsF sJ7tYVsF2 = (SJ7tYVsF) obj;
                sJ7tYVsF2.RXQxj5Oe.setAlpha(1.0f);
                sJ7tYVsF2.WYNAV5pd.wxUZMvaN(null);
                sJ7tYVsF2.WYNAV5pd = null;
                break;
            default:
                SJ7tYVsF sJ7tYVsF3 = (SJ7tYVsF) ((mcXgUFR8) obj).wxUZMvaN;
                sJ7tYVsF3.RXQxj5Oe.setVisibility(8);
                PopupWindow popupWindow = sJ7tYVsF3.FySoLYna;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sJ7tYVsF3.RXQxj5Oe.getParent() instanceof View) {
                    View view = (View) sJ7tYVsF3.RXQxj5Oe.getParent();
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    view.requestApplyInsets();
                }
                sJ7tYVsF3.RXQxj5Oe.VgvYg0wo();
                sJ7tYVsF3.WYNAV5pd.wxUZMvaN(null);
                sJ7tYVsF3.WYNAV5pd = null;
                ViewGroup viewGroup = sJ7tYVsF3.U0LaHZX7;
                WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
