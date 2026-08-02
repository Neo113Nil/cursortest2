package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class pso extends dyj {
    public final float J;
    public final float K;
    public final float L;

    public pso(float f, float f2, float f3) {
        this.J = f;
        this.K = f2;
        this.L = f3;
    }

    public static float c0(b9t b9tVar, float f) {
        HashMap hashMap;
        Object obj = (b9tVar == null || (hashMap = b9tVar.a) == null) ? null : hashMap.get("yandex:scale:scaleX");
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    public static float d0(b9t b9tVar, float f) {
        HashMap hashMap;
        Object obj = (b9tVar == null || (hashMap = b9tVar.a) == null) ? null : hashMap.get("yandex:scale:scaleY");
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // defpackage.niu
    public final ObjectAnimator X(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar2 == null) {
            return null;
        }
        float f = this.J;
        float c0 = c0(b9tVar, f);
        float d0 = d0(b9tVar, f);
        float c02 = c0(b9tVar2, 1.0f);
        float d02 = d0(b9tVar2, 1.0f);
        Object obj = b9tVar2.a.get("yandex:scale:screenPosition");
        obj.getClass();
        return b0(pcg.v(view, viewGroup, this, (int[]) obj), c0, d0, c02, d02);
    }

    @Override // defpackage.niu
    public final ObjectAnimator Z(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar == null) {
            return null;
        }
        float c0 = c0(b9tVar, 1.0f);
        float d0 = d0(b9tVar, 1.0f);
        float f = this.J;
        return b0(cwt.b(this, view, viewGroup, b9tVar, "yandex:scale:screenPosition"), c0, d0, c0(b9tVar2, f), d0(b9tVar2, f));
    }

    public final ObjectAnimator b0(View view, float f, float f2, float f3, float f4) {
        if (f == f3 && f2 == f4) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f2, f4));
        ofPropertyValuesHolder.addListener(new mso(this, view, view.getScaleX(), view.getScaleY()));
        return ofPropertyValuesHolder;
    }

    @Override // defpackage.niu, defpackage.b8t
    public final void g(b9t b9tVar) {
        View view = b9tVar.b;
        HashMap hashMap = b9tVar.a;
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        niu.U(b9tVar);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        Float valueOf = Float.valueOf(1.0f);
        int i = this.H;
        if (i == 1) {
            hashMap.put("yandex:scale:scaleX", valueOf);
            hashMap.put("yandex:scale:scaleY", valueOf);
        } else if (i == 2) {
            float f = this.J;
            hashMap.put("yandex:scale:scaleX", Float.valueOf(f));
            hashMap.put("yandex:scale:scaleY", Float.valueOf(f));
        }
        cwt.a(b9tVar, new v3c(b9tVar, 2));
    }

    @Override // defpackage.b8t
    public final void j(b9t b9tVar) {
        View view = b9tVar.b;
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        niu.U(b9tVar);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        HashMap hashMap = b9tVar.a;
        int i = this.H;
        if (i == 1) {
            float f = this.J;
            hashMap.put("yandex:scale:scaleX", Float.valueOf(f));
            hashMap.put("yandex:scale:scaleY", Float.valueOf(f));
        } else if (i == 2) {
            hashMap.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
            hashMap.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
        }
        cwt.a(b9tVar, new v3c(b9tVar, 3));
    }
}
