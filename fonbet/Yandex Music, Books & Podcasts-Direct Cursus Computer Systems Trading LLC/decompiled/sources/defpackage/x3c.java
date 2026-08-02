package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class x3c extends dyj {
    public final float J;

    public x3c(float f) {
        this.J = f;
    }

    public static ObjectAnimator b0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        float alpha = view.getAlpha();
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
        ofFloat.addListener(new t3c(view, alpha));
        return ofFloat;
    }

    public static float c0(b9t b9tVar, float f) {
        HashMap hashMap;
        Object obj = (b9tVar == null || (hashMap = b9tVar.a) == null) ? null : hashMap.get("yandex:fade:alpha");
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // defpackage.niu
    public final ObjectAnimator X(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar2 == null) {
            return null;
        }
        float c0 = c0(b9tVar, this.J);
        float c02 = c0(b9tVar2, 1.0f);
        Object obj = b9tVar2.a.get("yandex:fade:screenPosition");
        obj.getClass();
        return b0(pcg.v(view, viewGroup, this, (int[]) obj), c0, c02);
    }

    @Override // defpackage.niu
    public final ObjectAnimator Z(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar == null) {
            return null;
        }
        return b0(cwt.b(this, view, viewGroup, b9tVar, "yandex:fade:screenPosition"), c0(b9tVar, 1.0f), c0(b9tVar2, this.J));
    }

    @Override // defpackage.niu, defpackage.b8t
    public final void g(b9t b9tVar) {
        niu.U(b9tVar);
        HashMap hashMap = b9tVar.a;
        int i = this.H;
        if (i == 1) {
            hashMap.put("yandex:fade:alpha", Float.valueOf(b9tVar.b.getAlpha()));
        } else if (i == 2) {
            hashMap.put("yandex:fade:alpha", Float.valueOf(this.J));
        }
        cwt.a(b9tVar, new v3c(b9tVar, 0));
    }

    @Override // defpackage.b8t
    public final void j(b9t b9tVar) {
        niu.U(b9tVar);
        HashMap hashMap = b9tVar.a;
        int i = this.H;
        if (i == 1) {
            hashMap.put("yandex:fade:alpha", Float.valueOf(this.J));
        } else if (i == 2) {
            hashMap.put("yandex:fade:alpha", Float.valueOf(b9tVar.b.getAlpha()));
        }
        cwt.a(b9tVar, new v3c(b9tVar, 1));
    }
}
