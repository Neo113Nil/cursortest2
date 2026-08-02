package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class qb4 extends b8t {
    public static final String[] H = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final mb4 I = new mb4(PointF.class, "topLeft", 0);
    public static final mb4 J = new mb4(PointF.class, "bottomRight", 1);
    public static final mb4 K = new mb4(PointF.class, "bottomRight", 2);
    public static final mb4 L = new mb4(PointF.class, "topLeft", 3);
    public static final mb4 X = new mb4(PointF.class, "position", 4);

    public static void U(b9t b9tVar) {
        View view = b9tVar.b;
        HashMap hashMap = b9tVar.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.b8t
    public final void g(b9t b9tVar) {
        U(b9tVar);
    }

    @Override // defpackage.b8t
    public final void j(b9t b9tVar) {
        U(b9tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b8t
    public final Animator n(ViewGroup viewGroup, b9t b9tVar, b9t b9tVar2) {
        int i;
        qb4 qb4Var;
        ObjectAnimator ofObject;
        if (b9tVar != null) {
            HashMap hashMap = b9tVar.a;
            if (b9tVar2 != null) {
                HashMap hashMap2 = b9tVar2.a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = b9tVar2.b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
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
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
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
                        yhu.a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            qb4Var = this;
                            if (i2 == i3 && i4 == i5) {
                                qb4Var.z.getClass();
                                ofObject = ObjectAnimator.ofObject(view, K, (TypeConverter) null, z7l.i(i6, i8, i7, i9));
                            } else {
                                qb4Var.z.getClass();
                                ofObject = ObjectAnimator.ofObject(view, L, (TypeConverter) null, z7l.i(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            qb4Var = this;
                            qb4Var.z.getClass();
                            ofObject = ObjectAnimator.ofObject(view, X, (TypeConverter) null, z7l.i(i2, i4, i3, i5));
                        } else {
                            qb4Var = this;
                            pb4 pb4Var = new pb4(view);
                            qb4Var.z.getClass();
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(pb4Var, I, (TypeConverter) null, z7l.i(i2, i4, i3, i5));
                            qb4Var.z.getClass();
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(pb4Var, J, (TypeConverter) null, z7l.i(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new nb4(pb4Var));
                            ofObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            hdg.j0(viewGroup4, true);
                            qb4Var.t().b(new ob4(viewGroup4));
                        }
                        return ofObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.b8t
    public final String[] v() {
        return H;
    }
}
