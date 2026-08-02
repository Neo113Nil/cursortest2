package D0;

import a.AbstractC0426a;
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
public final class C0293f extends o {

    /* renamed from: T, reason: collision with root package name */
    public static final String[] f451T = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: U, reason: collision with root package name */
    public static final C0289b f452U = new C0289b(PointF.class, "topLeft", 0);

    /* renamed from: V, reason: collision with root package name */
    public static final C0289b f453V = new C0289b(PointF.class, "bottomRight", 1);

    /* renamed from: W, reason: collision with root package name */
    public static final C0289b f454W = new C0289b(PointF.class, "bottomRight", 2);

    /* renamed from: X, reason: collision with root package name */
    public static final C0289b f455X = new C0289b(PointF.class, "topLeft", 3);
    public static final C0289b Y = new C0289b(PointF.class, com.anythink.expressad.foundation.g.g.a.b.ab, 4);

    public static void N(w wVar) {
        View view = wVar.f513b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = wVar.f512a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", wVar.f513b.getParent());
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
        C0293f c0293f;
        ObjectAnimator a9;
        if (wVar != null && wVar2 != null) {
            HashMap hashMap = wVar.f512a;
            HashMap hashMap2 = wVar2.f512a;
            ViewGroup viewGroup = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup2 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup != null && viewGroup2 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i4 = rect.left;
                int i6 = rect2.left;
                int i9 = rect.top;
                int i10 = rect2.top;
                int i11 = rect.right;
                int i12 = rect2.right;
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                int i15 = i11 - i4;
                int i16 = i13 - i9;
                int i17 = i12 - i6;
                int i18 = i14 - i10;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i15 == 0 || i16 == 0) && (i17 == 0 || i18 == 0)) {
                    i = 0;
                } else {
                    i = (i4 == i6 && i9 == i10) ? 0 : 1;
                    if (i11 != i12 || i13 != i14) {
                        i++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i++;
                }
                if (i > 0) {
                    View view = wVar2.f513b;
                    y.a(view, i4, i9, i11, i13);
                    if (i != 2) {
                        c0293f = this;
                        if (i4 == i6 && i9 == i10) {
                            c0293f.f494O.getClass();
                            a9 = i.a(view, f454W, O2.i.i(i11, i13, i12, i14));
                        } else {
                            c0293f.f494O.getClass();
                            a9 = i.a(view, f455X, O2.i.i(i4, i9, i6, i10));
                        }
                    } else if (i15 == i17 && i16 == i18) {
                        c0293f = this;
                        c0293f.f494O.getClass();
                        a9 = i.a(view, Y, O2.i.i(i4, i9, i6, i10));
                    } else {
                        c0293f = this;
                        C0292e c0292e = new C0292e(view);
                        c0293f.f494O.getClass();
                        ObjectAnimator a10 = i.a(c0292e, f452U, O2.i.i(i4, i9, i6, i10));
                        c0293f.f494O.getClass();
                        ObjectAnimator a11 = i.a(c0292e, f453V, O2.i.i(i11, i13, i12, i14));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a10, a11);
                        animatorSet.addListener(new C0290c(c0292e));
                        a9 = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                        AbstractC0426a.p(viewGroup3, true);
                        c0293f.t().a(new C0291d(viewGroup3));
                    }
                    return a9;
                }
            }
        }
        return null;
    }

    @Override // D0.o
    public final String[] v() {
        return f451T;
    }
}
