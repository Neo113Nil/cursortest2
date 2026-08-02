package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class kch extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ lch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kch(lch lchVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = lchVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        lch lchVar = this.c;
        ColorStateList colorStateList2 = lchVar.l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (lchVar.k != 0 && lchVar.l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{aa5.i(lchVar.l.getColorForState(iArr3, 0), lchVar.k), aa5.i(lchVar.l.getColorForState(iArr2, 0), lchVar.k), lchVar.k});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            lch lchVar = this.c;
            Drawable drawable = null;
            if (lchVar.getText().toString().contentEquals(textView.getText()) && lchVar.k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(lchVar.k);
                if (this.b != null) {
                    colorDrawable.setTintList(this.a);
                    drawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
