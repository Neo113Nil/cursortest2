package V0;

import O.K;
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

/* loaded from: classes.dex */
public final class v extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f1354a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f1356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f1356c = wVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        w wVar = this.f1356c;
        ColorStateList colorStateList2 = wVar.f1361l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f1355b = colorStateList;
        if (wVar.f1360k != 0 && wVar.f1361l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{G.a.b(wVar.f1361l.getColorForState(iArr3, 0), wVar.f1360k), G.a.b(wVar.f1361l.getColorForState(iArr2, 0), wVar.f1360k), wVar.f1360k});
        }
        this.f1354a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            w wVar = this.f1356c;
            Drawable drawable = null;
            if (wVar.getText().toString().contentEquals(textView.getText()) && wVar.f1360k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(wVar.f1360k);
                if (this.f1355b != null) {
                    colorDrawable.setTintList(this.f1354a);
                    drawable = new RippleDrawable(this.f1355b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = K.f747a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
