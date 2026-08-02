package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes12.dex */
public final class xg6 extends BottomSheetBehavior.a {
    public final BottomSheetBehavior a;
    public final View c;
    public final mg6 d;
    public final ng6 e;
    public final mg6 f;
    public final ng6 g;
    public final float b = 0.5f;
    public float h = 1.0f;

    public xg6(BottomSheetBehavior bottomSheetBehavior, View view, mg6 mg6Var, ng6 ng6Var, mg6 mg6Var2, ng6 ng6Var2) {
        this.a = bottomSheetBehavior;
        this.c = view;
        this.d = mg6Var;
        this.e = ng6Var;
        this.f = mg6Var2;
        this.g = ng6Var2;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
        this.h = f;
        if (Float.isNaN(f)) {
            return;
        }
        float f2 = ((f + 1.0f) / 2.0f) * this.b;
        this.c.setAlpha(f2);
        this.e.invoke(Float.valueOf(f2));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        if (i == 3) {
            View view2 = this.c;
            float f = this.b;
            view2.setAlpha(f);
            this.e.invoke(Float.valueOf(f));
            this.g.invoke(Boolean.FALSE);
            this.a.g0 = true;
            return;
        }
        if (i == 5) {
            this.f.invoke();
        } else if (i == 6 && !((Boolean) this.d.invoke()).booleanValue()) {
            view.post(new mh3(18, this, view));
        }
    }
}
