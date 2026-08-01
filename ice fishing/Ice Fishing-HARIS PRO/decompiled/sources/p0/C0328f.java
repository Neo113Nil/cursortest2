package p0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: p0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328f extends m {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f4161A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B, reason: collision with root package name */
    public static final C0324b f4162B = new C0324b(PointF.class, "topLeft", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final C0324b f4163C = new C0324b(PointF.class, "bottomRight", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final C0324b f4164D = new C0324b(PointF.class, "bottomRight", 2);

    /* renamed from: E, reason: collision with root package name */
    public static final C0324b f4165E = new C0324b(PointF.class, "topLeft", 3);

    /* renamed from: F, reason: collision with root package name */
    public static final C0324b f4166F = new C0324b(PointF.class, "position", 4);

    public static void I(u uVar) {
        View view = uVar.f4214b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = uVar.f4213a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", uVar.f4214b.getParent());
    }

    @Override // p0.m
    public final void d(u uVar) {
        I(uVar);
    }

    @Override // p0.m
    public final void g(u uVar) {
        I(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p0.m
    public final Animator k(ViewGroup viewGroup, u uVar, u uVar2) {
        int i;
        ObjectAnimator a2;
        if (uVar == null || uVar2 == null) {
            return null;
        }
        HashMap hashMap = uVar.f4213a;
        HashMap hashMap2 = uVar2.f4213a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
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
        if (i <= 0) {
            return null;
        }
        View view = uVar2.f4214b;
        w.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.f4202v.getClass();
                a2 = i.a(view, f4166F, S0.e.f(i2, i4, i3, i5));
            } else {
                C0327e c0327e = new C0327e(view);
                this.f4202v.getClass();
                ObjectAnimator a3 = i.a(c0327e, f4162B, S0.e.f(i2, i4, i3, i5));
                this.f4202v.getClass();
                ObjectAnimator a4 = i.a(c0327e, f4163C, S0.e.f(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a3, a4);
                animatorSet.addListener(new C0325c(c0327e));
                a2 = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.f4202v.getClass();
            a2 = i.a(view, f4164D, S0.e.f(i6, i8, i7, i9));
        } else {
            this.f4202v.getClass();
            a2 = i.a(view, f4165E, S0.e.f(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            h0.f.C(viewGroup4, true);
            o().a(new C0326d(viewGroup4));
        }
        return a2;
    }

    @Override // p0.m
    public final String[] q() {
        return f4161A;
    }
}
