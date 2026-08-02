package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes4.dex */
public final class swg extends gvg {
    public static final swg c = new swg();
    public static Drawable d;
    public static Drawable e;

    @Override // defpackage.v0x
    public final void b(x0 x0Var, u0x u0xVar) {
        Drawable drawable;
        fvg fvgVar = (fvg) x0Var;
        rwg rwgVar = (rwg) u0xVar;
        zug zugVar = fvgVar.N;
        View view = fvgVar.a;
        zugVar.d.setText(rwgVar.a.a);
        zug zugVar2 = fvgVar.N;
        TextView textView = zugVar2.c;
        twg twgVar = rwgVar.a;
        textView.setText(twgVar.b);
        TextView textView2 = zugVar2.c;
        String str = twgVar.b;
        textView2.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        if (jl40.l(twgVar.c, Boolean.TRUE)) {
            if (d == null) {
                d = view.getContext().getDrawable(pyg0.background_section_debug_code_crit);
            }
            drawable = d;
        } else {
            if (e == null) {
                e = view.getContext().getDrawable(pyg0.background_section_debug_code);
            }
            drawable = e;
        }
        textView2.setBackground(drawable);
    }
}
