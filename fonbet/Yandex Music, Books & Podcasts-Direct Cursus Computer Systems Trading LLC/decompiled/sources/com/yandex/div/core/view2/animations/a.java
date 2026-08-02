package com.yandex.div.core.view2.animations;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import defpackage.b9t;
import defpackage.cwt;
import defpackage.dyj;
import defpackage.eeh;
import defpackage.ksq;
import defpackage.lsq;
import defpackage.niu;
import defpackage.pcg;
import defpackage.qsq;
import defpackage.v3c;
import defpackage.vsq;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class a extends dyj {
    public static final lsq L = new lsq(0);
    public static final ksq X = new ksq(1);
    public static final lsq Y = new lsq(1);
    public static final ksq Z = new ksq(0);
    public final int J;
    public final qsq K;

    public a(int i, int i2) {
        this.J = i;
        this.K = i2 != 3 ? i2 != 5 ? i2 != 48 ? Z : X : Y : L;
    }

    public static ObjectAnimator b0(View view, a aVar, b9t b9tVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = b9tVar.b.getTag(R.id.div_transition_position);
        if ((tag instanceof int[] ? (int[]) tag : null) != null) {
            f5 = (r2[0] - i) + translationX;
            f6 = (r2[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int b = eeh.b(f5 - translationX) + i;
        int b2 = eeh.b(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        vsq vsqVar = new vsq(b9tVar.b, view, b, b2, translationX, translationY);
        aVar.b(vsqVar);
        ofPropertyValuesHolder.addListener(vsqVar);
        ofPropertyValuesHolder.addPauseListener(vsqVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    @Override // defpackage.niu
    public final ObjectAnimator X(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar2 == null) {
            return null;
        }
        Object obj = b9tVar2.a.get("yandex:slide:screenPosition");
        obj.getClass();
        int[] iArr = (int[]) obj;
        qsq qsqVar = this.K;
        int i = this.J;
        return b0(pcg.v(view, viewGroup, this, iArr), this, b9tVar2, iArr[0], iArr[1], qsqVar.a(i, view, viewGroup), qsqVar.b(i, view, viewGroup), view.getTranslationX(), view.getTranslationY(), this.d);
    }

    @Override // defpackage.niu
    public final ObjectAnimator Z(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar == null) {
            return null;
        }
        Object obj = b9tVar.a.get("yandex:slide:screenPosition");
        obj.getClass();
        int[] iArr = (int[]) obj;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        qsq qsqVar = this.K;
        int i = this.J;
        return b0(cwt.b(this, view, viewGroup, b9tVar, "yandex:slide:screenPosition"), this, b9tVar, iArr[0], iArr[1], translationX, translationY, qsqVar.a(i, view, viewGroup), qsqVar.b(i, view, viewGroup), this.d);
    }

    @Override // defpackage.niu, defpackage.b8t
    public final void g(b9t b9tVar) {
        niu.U(b9tVar);
        cwt.a(b9tVar, new v3c(b9tVar, 4));
    }

    @Override // defpackage.b8t
    public final void j(b9t b9tVar) {
        niu.U(b9tVar);
        cwt.a(b9tVar, new v3c(b9tVar, 5));
    }
}
