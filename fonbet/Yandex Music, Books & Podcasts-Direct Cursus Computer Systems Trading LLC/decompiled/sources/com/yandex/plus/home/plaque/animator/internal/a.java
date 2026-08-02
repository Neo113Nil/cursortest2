package com.yandex.plus.home.plaque.animator.internal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.plaque.animator.internal.animators.b;
import com.yandex.plus.home.plaque.animator.internal.animators.c;
import com.yandex.plus.home.plaque.animator.internal.animators.d;
import com.yandex.plus.home.plaque.animator.internal.animators.e;
import com.yandex.plus.home.plaque.animator.internal.animators.f;
import defpackage.b6e;
import defpackage.b8t;
import defpackage.b9t;
import defpackage.nsa;
import defpackage.rj7;
import defpackage.xz0;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class a extends b8t {
    public final long H;
    public final long I;
    public final long J;
    public final com.yandex.plus.home.plaque.plugin.api.animator.a X;
    public final float K = 0.2f;
    public final boolean L = true;
    public final com.yandex.plus.home.plaque.animator.internal.utils.a Y = new com.yandex.plus.home.plaque.animator.internal.utils.a();
    public final a1 Z = new a1(29);
    public final a1 v0 = new a1(28);
    public final a1 w0 = new a1(27);

    public a(long j, long j2, long j3, com.yandex.plus.home.plaque.plugin.api.animator.a aVar) {
        this.H = j;
        this.I = j2;
        this.J = j3;
        this.X = aVar;
    }

    public final void U(b9t b9tVar) {
        Drawable drawable;
        Drawable drawable2;
        boolean z;
        Drawable newDrawable;
        Drawable drawable3;
        boolean z2;
        View view = b9tVar.b;
        HashMap hashMap = b9tVar.a;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = 0;
        int i2 = iArr[0];
        boolean z3 = true;
        int i3 = iArr[1];
        hashMap.getClass();
        hashMap.put("PROPERTY_WINDOW_X", Integer.valueOf(i2));
        hashMap.put("PROPERTY_WINDOW_Y", Integer.valueOf(i3));
        hashMap.put("KEY_HEIGHT", Integer.valueOf(view.getHeight()));
        this.Y.getClass();
        if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
            view.measure(0, 0);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
            drawable = com.yandex.plus.plaquesdk.widget.a.a;
        } else {
            int left = view.getLeft();
            int right = view.getRight();
            int top = view.getTop();
            int bottom = view.getBottom();
            if (view.getWidth() == view.getMeasuredWidth() && view.getHeight() == view.getMeasuredHeight()) {
                z2 = false;
            } else {
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                z2 = true;
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            view.draw(new Canvas(createBitmap));
            drawable = new BitmapDrawable(view.getResources(), createBitmap);
            drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (z2) {
                view.layout(left, top, right, bottom);
            }
        }
        hashMap.put("PROPERTY_VIEW_DRAWABLE", drawable);
        hashMap.put("PROPERTY_BOUNDS", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        Drawable e = com.yandex.plus.home.plaque.animator.internal.utils.a.e(view);
        if (e == null) {
            drawable2 = null;
        } else {
            Drawable.ConstantState constantState = e.getConstantState();
            if (constantState == null || (newDrawable = constantState.newDrawable()) == null) {
                if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
                    view.measure(0, 0);
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
                    drawable2 = com.yandex.plus.plaquesdk.widget.a.a;
                } else {
                    int left2 = view.getLeft();
                    int right2 = view.getRight();
                    int top2 = view.getTop();
                    int bottom2 = view.getBottom();
                    if (view.getWidth() == view.getMeasuredWidth() && view.getHeight() == view.getMeasuredHeight()) {
                        z = false;
                    } else {
                        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        z = true;
                    }
                    Bitmap createBitmap2 = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap2.getClass();
                    e.draw(new Canvas(createBitmap2));
                    drawable2 = new BitmapDrawable(view.getResources(), createBitmap2);
                    drawable2.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (z) {
                        view.layout(left2, top2, right2, bottom2);
                    }
                }
            } else {
                drawable2 = newDrawable;
            }
        }
        hashMap.put("PROPERTY_BACKGROUND_DRAWABLE", drawable2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() != 0) {
                if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
                    view.measure(0, 0);
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
                    drawable3 = com.yandex.plus.plaquesdk.widget.a.a;
                } else {
                    int left3 = view.getLeft();
                    int right3 = view.getRight();
                    int top3 = view.getTop();
                    int bottom3 = view.getBottom();
                    if (view.getWidth() == view.getMeasuredWidth() && view.getHeight() == view.getMeasuredHeight()) {
                        z3 = false;
                    } else {
                        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    }
                    Bitmap createBitmap3 = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap3.getClass();
                    Canvas canvas = new Canvas(createBitmap3);
                    while (i < viewGroup.getChildCount()) {
                        int i4 = i + 1;
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt == null) {
                            rj7.m();
                            return;
                        }
                        float x = childAt.getX();
                        float y = childAt.getY();
                        int save = canvas.save();
                        canvas.translate(x, y);
                        try {
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                            i = i4;
                        } catch (Throwable th) {
                            canvas.restoreToCount(save);
                            throw th;
                        }
                    }
                    drawable3 = new BitmapDrawable(view.getResources(), createBitmap3);
                    drawable3.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (z3) {
                        view.layout(left3, top3, right3, bottom3);
                    }
                }
                hashMap.put("PROPERTY_CHILDREN_DRAWABLE", drawable3);
            }
        }
        drawable3 = com.yandex.plus.plaquesdk.widget.a.a;
        hashMap.put("PROPERTY_CHILDREN_DRAWABLE", drawable3);
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
        int i;
        ValueAnimator ofFloat;
        long j;
        int i2;
        ValueAnimator valueAnimator;
        com.yandex.plus.home.plaque.animator.internal.model.a aVar;
        viewGroup.getClass();
        if (b9tVar != null) {
            HashMap hashMap = b9tVar.a;
            if (b9tVar2 != null) {
                View view = b9tVar2.b;
                HashMap hashMap2 = b9tVar2.a;
                if (!hashMap.isEmpty() && hashMap.size() == hashMap2.size()) {
                    Object obj = hashMap.get("KEY_HEIGHT");
                    Object obj2 = hashMap2.get("KEY_HEIGHT");
                    Object obj3 = hashMap.get("PROPERTY_WINDOW_X");
                    Object obj4 = hashMap2.get("PROPERTY_WINDOW_X");
                    Object obj5 = hashMap.get("PROPERTY_WINDOW_Y");
                    Object obj6 = hashMap2.get("PROPERTY_WINDOW_Y");
                    Object obj7 = hashMap.get("PROPERTY_VIEW_DRAWABLE");
                    Object obj8 = hashMap2.get("PROPERTY_VIEW_DRAWABLE");
                    Object obj9 = hashMap.get("PROPERTY_BOUNDS");
                    Object obj10 = hashMap2.get("PROPERTY_BOUNDS");
                    Object obj11 = hashMap.get("PROPERTY_BACKGROUND_DRAWABLE");
                    Object obj12 = hashMap2.get("PROPERTY_BACKGROUND_DRAWABLE");
                    Object obj13 = hashMap.get("PROPERTY_CHILDREN_DRAWABLE");
                    Object obj14 = hashMap2.get("PROPERTY_CHILDREN_DRAWABLE");
                    if (!(obj instanceof Integer) || !(obj2 instanceof Integer) || !(obj3 instanceof Integer) || !(obj4 instanceof Integer) || !(obj5 instanceof Integer) || !(obj6 instanceof Integer) || !(obj7 instanceof Drawable) || !(obj8 instanceof Drawable) || !(obj9 instanceof Rect) || !(obj10 instanceof Rect)) {
                        return null;
                    }
                    if (!(obj11 == null ? true : obj11 instanceof Drawable)) {
                        return null;
                    }
                    if (!(obj12 == null ? true : obj12 instanceof Drawable) || !(obj13 instanceof Drawable) || !(obj14 instanceof Drawable)) {
                        return null;
                    }
                    Number number = (Number) obj;
                    Number number2 = (Number) obj2;
                    int max = Math.max(number.intValue(), number2.intValue());
                    int min = Math.min(number.intValue(), number2.intValue());
                    if (min > 0 && ((float) (max - min)) / ((float) min) <= this.K) {
                        int ordinal = this.X.ordinal();
                        if (ordinal == 0) {
                            aVar = com.yandex.plus.home.plaque.animator.internal.model.a.a;
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            aVar = com.yandex.plus.home.plaque.animator.internal.model.a.b;
                        }
                        view.getClass();
                        int intValue = ((Number) obj3).intValue();
                        int intValue2 = ((Number) obj4).intValue();
                        int intValue3 = ((Number) obj5).intValue();
                        int intValue4 = ((Number) obj6).intValue();
                        Drawable drawable = (Drawable) obj7;
                        Drawable drawable2 = (Drawable) obj8;
                        this.Z.getClass();
                        Object parent = view.getParent();
                        parent.getClass();
                        ViewOverlay overlay = ((View) parent).getOverlay();
                        int i3 = intValue2 - intValue;
                        drawable.getBounds().left -= i3;
                        drawable.getBounds().right -= i3;
                        int i4 = intValue4 - intValue3;
                        drawable.getBounds().top -= i4;
                        drawable.getBounds().bottom -= i4;
                        overlay.add(drawable);
                        overlay.add(drawable2);
                        view.setVisibility(4);
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(nsa.f(this.H));
                        duration.getClass();
                        duration.addListener(new com.yandex.plus.home.plaque.animator.internal.animators.a(overlay, drawable, drawable2, view, 1));
                        duration.addUpdateListener(new f(drawable, drawable2, aVar));
                        return duration;
                    }
                    if (!(number.intValue() < number2.intValue())) {
                        view.getClass();
                        int intValue5 = ((Number) obj3).intValue();
                        int intValue6 = ((Number) obj4).intValue();
                        int intValue7 = ((Number) obj5).intValue();
                        int intValue8 = ((Number) obj6).intValue();
                        Drawable drawable3 = (Drawable) obj7;
                        Drawable drawable4 = (Drawable) obj8;
                        this.w0.getClass();
                        Object parent2 = view.getParent();
                        parent2.getClass();
                        ViewOverlay overlay2 = ((View) parent2).getOverlay();
                        int i5 = intValue6 - intValue5;
                        drawable3.getBounds().left -= i5;
                        drawable3.getBounds().right -= i5;
                        int i6 = intValue8 - intValue7;
                        drawable3.getBounds().top -= i6;
                        drawable3.getBounds().bottom -= i6;
                        overlay2.add(drawable3);
                        overlay2.add(drawable4);
                        view.setVisibility(4);
                        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(nsa.f(this.J));
                        duration2.getClass();
                        duration2.addListener(new com.yandex.plus.home.plaque.animator.internal.animators.a(overlay2, drawable3, drawable4, view, 0));
                        duration2.addUpdateListener(new b(drawable3, drawable4));
                        return duration2;
                    }
                    view.getClass();
                    int intValue9 = ((Number) obj3).intValue();
                    int intValue10 = ((Number) obj4).intValue();
                    int intValue11 = ((Number) obj5).intValue();
                    int intValue12 = ((Number) obj6).intValue();
                    Rect rect = (Rect) obj9;
                    Rect rect2 = (Rect) obj10;
                    Drawable drawable5 = (Drawable) obj11;
                    Drawable drawable6 = (Drawable) obj12;
                    Drawable drawable7 = (Drawable) obj13;
                    Drawable drawable8 = (Drawable) obj14;
                    this.v0.getClass();
                    long j2 = this.I;
                    long q = nsa.q(j2, 0.12d);
                    long q2 = nsa.q(j2, 0.12d);
                    long q3 = nsa.q(j2, 0.6d);
                    long q4 = nsa.q(j2, 0.16d);
                    Object parent3 = view.getParent();
                    parent3.getClass();
                    ViewOverlay overlay3 = ((View) parent3).getOverlay();
                    int i7 = intValue10 - intValue9;
                    rect.left -= i7;
                    rect.right -= i7;
                    drawable7.getBounds().left -= i7;
                    drawable7.getBounds().right -= i7;
                    int i8 = intValue12 - intValue11;
                    rect.top -= i8;
                    rect.bottom -= i8;
                    drawable7.getBounds().top -= i8;
                    drawable7.getBounds().bottom -= i8;
                    view.setVisibility(4);
                    if (drawable5 != null) {
                        overlay3.add(drawable5);
                    }
                    if (drawable6 != null) {
                        drawable6.setAlpha(0);
                        overlay3.add(drawable6);
                    }
                    overlay3.add(drawable7);
                    drawable8.setAlpha(0);
                    overlay3.add(drawable8);
                    if (drawable5 == null && drawable6 == null) {
                        ofFloat = null;
                        j = q4;
                        i = 2;
                    } else {
                        i = 2;
                        ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new e(drawable5, drawable6, rect));
                        j = q4;
                        ofFloat.setDuration(nsa.f(q2));
                    }
                    float[] fArr = new float[i];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
                    ofFloat2.addUpdateListener(new e(d.b, drawable7));
                    ValueAnimator valueAnimator2 = ofFloat;
                    ofFloat2.setDuration(nsa.f(q));
                    if (drawable6 != null) {
                        i2 = 2;
                        valueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimator.addUpdateListener(new b(drawable6, rect, rect2, this.L));
                        valueAnimator.setDuration(nsa.f(q3));
                    } else {
                        i2 = 2;
                        valueAnimator = null;
                    }
                    float[] fArr2 = new float[i2];
                    // fill-array-data instruction
                    fArr2[0] = 0.0f;
                    fArr2[1] = 1.0f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
                    ofFloat3.addUpdateListener(new e(d.a, drawable8));
                    ofFloat3.setDuration(nsa.f(j));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(xz0.w(new ValueAnimator[]{valueAnimator2, ofFloat2, valueAnimator, ofFloat3}));
                    animatorSet.addListener(new c(drawable5, overlay3, drawable6, drawable7, drawable8, view));
                    return animatorSet;
                }
            }
        }
        return null;
    }

    @Override // defpackage.b8t
    public final void M(long j) {
    }
}
