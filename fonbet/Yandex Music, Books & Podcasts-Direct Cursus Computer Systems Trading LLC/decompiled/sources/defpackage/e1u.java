package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class e1u extends dyj {
    public final float J;
    public final float K;

    public e1u(float f, float f2) {
        this.J = f;
        this.K = f2;
    }

    @Override // defpackage.niu
    public final ObjectAnimator X(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar2 == null) {
            return null;
        }
        float height = view.getHeight();
        float f = this.J;
        float f2 = f * height;
        float f3 = this.K;
        Object obj = b9tVar2.a.get("yandex:verticalTranslation:screenPosition");
        obj.getClass();
        View v = pcg.v(view, viewGroup, this, (int[]) obj);
        v.setTranslationY(f2);
        d1u d1uVar = new d1u(v);
        d1uVar.a(v, f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(v, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, height * f3), PropertyValuesHolder.ofFloat(d1uVar, f, f3));
        ofPropertyValuesHolder.addListener(new jdh(view));
        return ofPropertyValuesHolder;
    }

    @Override // defpackage.niu
    public final ObjectAnimator Z(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar == null) {
            return null;
        }
        float height = view.getHeight();
        float f = this.J;
        View b = cwt.b(this, view, viewGroup, b9tVar, "yandex:verticalTranslation:screenPosition");
        Property property = View.TRANSLATION_Y;
        float f2 = this.K;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(b, PropertyValuesHolder.ofFloat((Property<?, Float>) property, f2, height * f), PropertyValuesHolder.ofFloat(new d1u(view), f2, f));
        ofPropertyValuesHolder.addListener(new jdh(view));
        return ofPropertyValuesHolder;
    }

    @Override // defpackage.niu, defpackage.b8t
    public final void g(b9t b9tVar) {
        niu.U(b9tVar);
        cwt.a(b9tVar, new v3c(b9tVar, 6));
    }

    @Override // defpackage.b8t
    public final void j(b9t b9tVar) {
        niu.U(b9tVar);
        cwt.a(b9tVar, new v3c(b9tVar, 7));
    }
}
