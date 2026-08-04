package com.gamericefishpro.space.i6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o {
    public static final String[] V = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b W = new b(PointF.class, "topLeft", 0);
    public static final b X = new b(PointF.class, "bottomRight", 1);
    public static final b Y = new b(PointF.class, "bottomRight", 2);
    public static final b Z = new b(PointF.class, "topLeft", 3);
    public static final b a0 = new b(PointF.class, "position", 4);

    public static void L(v vVar) {
        View view = vVar.b;
        HashMap map = vVar.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void d(v vVar) {
        L(vVar);
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void g(v vVar) {
        L(vVar);
    }

    @Override // com.gamericefishpro.space.i6.o
    public final Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        int i;
        f fVar;
        Animator animatorOfObject;
        if (vVar != null) {
            HashMap map = vVar.a;
            if (vVar2 != null) {
                HashMap map2 = vVar2.a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = vVar2.b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        x.a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            fVar = this;
                            if (i2 == i3 && i4 == i5) {
                                fVar.O.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, Y, (TypeConverter) null, com.gamericefishpro.space.lb.e.f(i6, i8, i7, i9));
                            } else {
                                fVar.O.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, Z, (TypeConverter) null, com.gamericefishpro.space.lb.e.f(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            fVar = this;
                            fVar.O.getClass();
                            animatorOfObject = ObjectAnimator.ofObject(view, a0, (TypeConverter) null, com.gamericefishpro.space.lb.e.f(i2, i4, i3, i5));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.O.getClass();
                            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(eVar, W, (TypeConverter) null, com.gamericefishpro.space.lb.e.f(i2, i4, i3, i5));
                            fVar.O.getClass();
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, X, (TypeConverter) null, com.gamericefishpro.space.lb.e.f(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                            animatorSet.addListener(new c(eVar));
                            animatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            com.gamericefishpro.space.b9.a.G(viewGroup4, true);
                            fVar.o().a(new d(viewGroup4));
                        }
                        return animatorOfObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final String[] q() {
        return V;
    }
}
