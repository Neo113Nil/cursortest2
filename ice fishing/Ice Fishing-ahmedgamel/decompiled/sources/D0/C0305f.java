package D0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;

/* renamed from: D0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305f extends o {

    /* renamed from: T, reason: collision with root package name */
    public static final String[] f556T = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: U, reason: collision with root package name */
    public static final C0301b f557U = new C0301b(PointF.class, "topLeft", 0);

    /* renamed from: V, reason: collision with root package name */
    public static final C0301b f558V = new C0301b(PointF.class, "bottomRight", 1);

    /* renamed from: W, reason: collision with root package name */
    public static final C0301b f559W = new C0301b(PointF.class, "bottomRight", 2);

    /* renamed from: X, reason: collision with root package name */
    public static final C0301b f560X = new C0301b(PointF.class, "topLeft", 3);
    public static final C0301b Y = new C0301b(PointF.class, com.anythink.expressad.foundation.g.g.a.b.ab, 4);

    public static void N(w wVar) {
        View view = wVar.f617b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = wVar.f616a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", wVar.f617b.getParent());
    }

    @Override // D0.o
    public final void i(w wVar) {
        N(wVar);
    }

    @Override // D0.o
    public final void l(w wVar) {
        N(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D0.o
    public final Animator p(FrameLayout frameLayout, w wVar, w wVar2) {
        int i;
        C0305f c0305f;
        ObjectAnimator a9;
        if (wVar != null && wVar2 != null) {
            HashMap hashMap = wVar.f616a;
            HashMap hashMap2 = wVar2.f616a;
            ViewGroup viewGroup = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup2 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup != null && viewGroup2 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i6 = rect.left;
                int i9 = rect2.left;
                int i10 = rect.top;
                int i11 = rect2.top;
                int i12 = rect.right;
                int i13 = rect2.right;
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                int i16 = i12 - i6;
                int i17 = i14 - i10;
                int i18 = i13 - i9;
                int i19 = i15 - i11;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i16 == 0 || i17 == 0) && (i18 == 0 || i19 == 0)) {
                    i = 0;
                } else {
                    i = (i6 == i9 && i10 == i11) ? 0 : 1;
                    if (i12 != i13 || i14 != i15) {
                        i++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i++;
                }
                if (i > 0) {
                    View view = wVar2.f617b;
                    y.a(view, i6, i10, i12, i14);
                    if (i != 2) {
                        c0305f = this;
                        if (i6 == i9 && i10 == i11) {
                            c0305f.f598O.getClass();
                            a9 = i.a(view, f559W, a4.e.h(i12, i14, i13, i15));
                        } else {
                            c0305f.f598O.getClass();
                            a9 = i.a(view, f560X, a4.e.h(i6, i10, i9, i11));
                        }
                    } else if (i16 == i18 && i17 == i19) {
                        c0305f = this;
                        c0305f.f598O.getClass();
                        a9 = i.a(view, Y, a4.e.h(i6, i10, i9, i11));
                    } else {
                        c0305f = this;
                        C0304e c0304e = new C0304e(view);
                        c0305f.f598O.getClass();
                        ObjectAnimator a10 = i.a(c0304e, f557U, a4.e.h(i6, i10, i9, i11));
                        c0305f.f598O.getClass();
                        ObjectAnimator a11 = i.a(c0304e, f558V, a4.e.h(i12, i14, i13, i15));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a10, a11);
                        animatorSet.addListener(new C0302c(c0304e));
                        a9 = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                        com.bumptech.glide.g.i(viewGroup3, true);
                        c0305f.t().a(new C0303d(viewGroup3));
                    }
                    return a9;
                }
            }
        }
        return null;
    }

    @Override // D0.o
    public final String[] v() {
        return f556T;
    }
}
