package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import defpackage.b8t;
import defpackage.b9t;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class c extends b8t {
    public static void U(b9t b9tVar) {
        View view = b9tVar.b;
        HashMap hashMap = b9tVar.a;
        ProgressView progressView = view instanceof ProgressView ? (ProgressView) view : null;
        if (progressView == null) {
            return;
        }
        if (progressView.isLaidOut() || progressView.getWidth() > 0 || progressView.getHeight() > 0) {
            progressView.getLocationOnScreen(new int[]{0, 0});
            hashMap.getClass();
            hashMap.put("x", Float.valueOf(r2[0]));
            hashMap.put("y", Float.valueOf(r2[1]));
            hashMap.put("progress", Integer.valueOf(progressView.getProgress()));
        }
    }

    public static b V(b9t b9tVar) {
        HashMap hashMap = b9tVar.a;
        Object obj = hashMap.get("x");
        Float f = obj instanceof Float ? (Float) obj : null;
        Object obj2 = hashMap.get("y");
        Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
        Object obj3 = hashMap.get("progress");
        Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (f == null || f2 == null || num == null) {
            return null;
        }
        return new b(new PointF(f.floatValue(), f2.floatValue()), num.intValue());
    }

    @Override // defpackage.b8t
    public final void g(b9t b9tVar) {
        U(b9tVar);
    }

    @Override // defpackage.b8t
    public final void j(b9t b9tVar) {
        U(b9tVar);
    }

    @Override // defpackage.b8t
    public final Animator n(ViewGroup viewGroup, b9t b9tVar, b9t b9tVar2) {
        viewGroup.getClass();
        if (b9tVar == null || b9tVar2 == null) {
            return null;
        }
        View view = b9tVar2.b;
        b V = V(b9tVar);
        b V2 = V(b9tVar2);
        if (V == null || V2 == null) {
            return null;
        }
        ProgressView progressView = view instanceof ProgressView ? (ProgressView) view : null;
        if (progressView != null) {
            progressView.setProgress(V.b);
        }
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        Path path = new Path();
        PointF pointF = V.a;
        float f = pointF.x;
        PointF pointF2 = V2.a;
        path.moveTo(f - pointF2.x, pointF.y - pointF2.y);
        path.lineTo(0.0f, 0.0f);
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) property, (Property<View, Float>) property2, path);
    }
}
