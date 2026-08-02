package J3;

import O.X;
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
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class x extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f1566a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f1568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f1568c = yVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        y yVar = this.f1568c;
        ColorStateList colorStateList2 = yVar.f1573E;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f1567b = colorStateList;
        if (yVar.f1572D != 0 && yVar.f1573E != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{G.c.b(yVar.f1573E.getColorForState(iArr3, 0), yVar.f1572D), G.c.b(yVar.f1573E.getColorForState(iArr2, 0), yVar.f1572D), yVar.f1572D});
        }
        this.f1566a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            y yVar = this.f1568c;
            Drawable drawable = null;
            if (yVar.getText().toString().contentEquals(textView.getText()) && yVar.f1572D != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(yVar.f1572D);
                if (this.f1567b != null) {
                    H.a.h(colorDrawable, this.f1566a);
                    drawable = new RippleDrawable(this.f1567b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = X.f2142a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
