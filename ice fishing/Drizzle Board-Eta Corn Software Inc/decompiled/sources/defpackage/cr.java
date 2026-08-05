package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class cr extends ArrayAdapter {
    public final /* synthetic */ dr MdtA4re8;
    public ColorStateList NCTxEWno;
    public ColorStateList qoPGr6Ce;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(dr drVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.MdtA4re8 = drVar;
        qoPGr6Ce();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            dr drVar = this.MdtA4re8;
            ColorDrawable colorDrawable = null;
            if (drVar.getText().toString().contentEquals(textView.getText()) && drVar.ow5vqvCr != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(drVar.ow5vqvCr);
                if (this.NCTxEWno != null) {
                    colorDrawable2.setTintList(this.qoPGr6Ce);
                    ?? rippleDrawable = new RippleDrawable(this.NCTxEWno, colorDrawable2, null);
                    FocusRingDrawable VgvYg0wo = FocusRingDrawable.VgvYg0wo(getContext(), rippleDrawable, null);
                    if (VgvYg0wo != null) {
                        VgvYg0wo.sjUBp5pO.gjV1z5T1 = drVar.Qr9iLBAD;
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }

    public final void qoPGr6Ce() {
        ColorStateList colorStateList;
        dr drVar = this.MdtA4re8;
        ColorStateList colorStateList2 = drVar.OnDfzHZD;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.NCTxEWno = colorStateList;
        if (drVar.ow5vqvCr != 0 && drVar.OnDfzHZD != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{g6.NCTxEWno(drVar.OnDfzHZD.getColorForState(iArr3, 0), drVar.ow5vqvCr), g6.NCTxEWno(drVar.OnDfzHZD.getColorForState(iArr2, 0), drVar.ow5vqvCr), drVar.ow5vqvCr});
        }
        this.qoPGr6Ce = colorStateList3;
    }
}
