package D0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.HashMap;

/* renamed from: D0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306h extends o {

    /* renamed from: U, reason: collision with root package name */
    public static final String[] f618U = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: T, reason: collision with root package name */
    public final int f619T;

    public C0306h(int i) {
        this();
        this.f619T = i;
    }

    public static void N(w wVar) {
        int visibility = wVar.f672b.getVisibility();
        HashMap hashMap = wVar.f671a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = wVar.f672b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float P(w wVar, float f6) {
        Float f9;
        return (wVar == null || (f9 = (Float) wVar.f671a.get("android:fade:transitionAlpha")) == null) ? f6 : f9.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H Q(w wVar, w wVar2) {
        H h9 = new H();
        h9.f592c = false;
        h9.f593d = false;
        if (wVar != null) {
            HashMap hashMap = wVar.f671a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                h9.f590a = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                h9.f594e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (wVar2 != null) {
                    HashMap hashMap2 = wVar2.f671a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        h9.f591b = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        h9.f595f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (wVar == null && wVar2 != null) {
                            int i = h9.f590a;
                            int i4 = h9.f591b;
                            if (i != i4 || ((ViewGroup) h9.f594e) != ((ViewGroup) h9.f595f)) {
                                if (i != i4) {
                                    if (i == 0) {
                                        h9.f593d = false;
                                        h9.f592c = true;
                                        return h9;
                                    }
                                    if (i4 == 0) {
                                        h9.f593d = true;
                                        h9.f592c = true;
                                        return h9;
                                    }
                                } else {
                                    if (((ViewGroup) h9.f595f) == null) {
                                        h9.f593d = false;
                                        h9.f592c = true;
                                        return h9;
                                    }
                                    if (((ViewGroup) h9.f594e) == null) {
                                        h9.f593d = true;
                                        h9.f592c = true;
                                        return h9;
                                    }
                                }
                            }
                        } else {
                            if (wVar != null && h9.f591b == 0) {
                                h9.f593d = true;
                                h9.f592c = true;
                                return h9;
                            }
                            if (wVar2 == null && h9.f590a == 0) {
                                h9.f593d = false;
                                h9.f592c = true;
                            }
                        }
                        return h9;
                    }
                }
                h9.f591b = -1;
                h9.f595f = null;
                if (wVar == null) {
                }
                if (wVar != null) {
                }
                if (wVar2 == null) {
                    h9.f593d = false;
                    h9.f592c = true;
                }
                return h9;
            }
        }
        h9.f590a = -1;
        h9.f594e = null;
        if (wVar2 != null) {
        }
        h9.f591b = -1;
        h9.f595f = null;
        if (wVar == null) {
        }
        if (wVar != null) {
        }
        if (wVar2 == null) {
        }
        return h9;
    }

    public final ObjectAnimator O(View view, float f6, float f9) {
        if (f6 == f9) {
            return null;
        }
        y.f674a.o(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, y.f675b, f9);
        C0305g c0305g = new C0305g(view);
        ofFloat.addListener(c0305g);
        t().a(c0305g);
        return ofFloat;
    }

    @Override // D0.o
    public final void i(w wVar) {
        N(wVar);
    }

    @Override // D0.o
    public final void l(w wVar) {
        N(wVar);
        View view = wVar.f672b;
        Float f6 = (Float) view.getTag(C5284R.id.transition_pause_alpha);
        if (f6 == null) {
            f6 = view.getVisibility() == 0 ? Float.valueOf(y.f674a.j(view)) : Float.valueOf(0.0f);
        }
        wVar.f671a.put("android:fade:transitionAlpha", f6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (Q(s(r3, false), w(r3, false)).f592c != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    @Override // D0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator p(FrameLayout frameLayout, w wVar, w wVar2) {
        boolean z8;
        View view;
        int i;
        int i4;
        char c4;
        View view2;
        Animator animator;
        View view3;
        boolean z9;
        ViewGroup viewGroup;
        int i9;
        Bitmap bitmap;
        int i10 = this.f619T;
        H Q3 = Q(wVar, wVar2);
        if (Q3.f592c && (((ViewGroup) Q3.f594e) != null || ((ViewGroup) Q3.f595f) != null)) {
            int i11 = 0;
            if (!Q3.f593d) {
                int i12 = Q3.f591b;
                if ((i10 & 2) == 2 && wVar != null) {
                    View view4 = wVar2 != null ? wVar2.f672b : null;
                    View view5 = wVar.f672b;
                    View view6 = (View) view5.getTag(C5284R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i12;
                        i4 = 0;
                        i11 = 1;
                        c4 = 1;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view4 == null || view4.getParent() == null) {
                            if (view4 != null) {
                                z8 = false;
                                view = null;
                                if (z8) {
                                    if (view5.getParent() == null) {
                                        i = i12;
                                        i4 = 0;
                                        c4 = 1;
                                        view3 = view;
                                        animator = null;
                                        view6 = view5;
                                    } else if (view5.getParent() instanceof View) {
                                        View view7 = (View) view5.getParent();
                                        animator = null;
                                        i4 = 0;
                                        if (Q(w(view7, true), s(view7, true)).f592c) {
                                            i = i12;
                                            c4 = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                frameLayout.findViewById(id);
                                            }
                                            view6 = view4;
                                            i11 = i4;
                                            view3 = view2;
                                        } else {
                                            boolean z10 = v.f670a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            D d2 = y.f674a;
                                            d2.v(view5, matrix);
                                            d2.w(frameLayout, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c4 = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view5.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view5.isAttachedToWindow();
                                            boolean z11 = frameLayout != null && frameLayout.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z9 = isAttachedToWindow;
                                                viewGroup = null;
                                                i9 = 0;
                                            } else if (z11) {
                                                viewGroup = (ViewGroup) view5.getParent();
                                                int indexOfChild = viewGroup.indexOfChild(view5);
                                                z9 = isAttachedToWindow;
                                                frameLayout.getOverlay().add(view5);
                                                i9 = indexOfChild;
                                            } else {
                                                i = i12;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i11 = i4;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i = i12;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (v.f670a) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view5.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = u.a(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view5.draw(canvas);
                                                }
                                            }
                                            if (!z9) {
                                                frameLayout.getOverlay().remove(view5);
                                                viewGroup.addView(view5, i9);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i11 = i4;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i12;
                                i4 = 0;
                                c4 = 1;
                                view2 = view;
                                animator = null;
                                view6 = view4;
                                i11 = i4;
                                view3 = view2;
                            }
                        } else if (i12 == 4 || view5 == view4) {
                            view = view4;
                            z8 = false;
                            view4 = null;
                            if (z8) {
                            }
                            i = i12;
                            i4 = 0;
                            c4 = 1;
                            view2 = view;
                            animator = null;
                            view6 = view4;
                            i11 = i4;
                            view3 = view2;
                        }
                        z8 = true;
                        view4 = null;
                        view = null;
                        if (z8) {
                        }
                        i = i12;
                        i4 = 0;
                        c4 = 1;
                        view2 = view;
                        animator = null;
                        view6 = view4;
                        i11 = i4;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        y.b(view3, i4);
                        D d3 = y.f674a;
                        d3.getClass();
                        ObjectAnimator O8 = O(view3, P(wVar, 1.0f), 0.0f);
                        if (O8 == null) {
                            d3.o(view3, P(wVar2, 1.0f));
                        }
                        if (O8 == null) {
                            y.b(view3, visibility);
                            return O8;
                        }
                        F f6 = new F(i, view3);
                        O8.addListener(f6);
                        t().a(f6);
                        return O8;
                    }
                    if (i11 == 0) {
                        int[] iArr = (int[]) wVar.f671a.get("android:visibility:screenLocation");
                        int i13 = iArr[i4];
                        int i14 = iArr[c4];
                        int[] iArr2 = new int[2];
                        frameLayout.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i13 - iArr2[i4]) - view6.getLeft());
                        view6.offsetTopAndBottom((i14 - iArr2[c4]) - view6.getTop());
                        frameLayout.getOverlay().add(view6);
                    }
                    D d9 = y.f674a;
                    d9.getClass();
                    ObjectAnimator O9 = O(view6, P(wVar, 1.0f), 0.0f);
                    if (O9 == null) {
                        d9.o(view6, P(wVar2, 1.0f));
                    }
                    if (i11 == 0) {
                        if (O9 == null) {
                            frameLayout.getOverlay().remove(view6);
                            return O9;
                        }
                        view5.setTag(C5284R.id.save_overlay_view, view6);
                        G g9 = new G(this, frameLayout, view6, view5);
                        O9.addListener(g9);
                        O9.addPauseListener(g9);
                        t().a(g9);
                    }
                    return O9;
                }
            } else if ((i10 & 1) == 1 && wVar2 != null) {
                View view8 = wVar2.f672b;
                if (wVar == null) {
                    View view9 = (View) view8.getParent();
                }
                y.f674a.getClass();
                return O(view8, P(wVar, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // D0.o
    public final String[] v() {
        return f618U;
    }

    @Override // D0.o
    public final boolean x(w wVar, w wVar2) {
        if (wVar == null && wVar2 == null) {
            return false;
        }
        if (wVar != null && wVar2 != null && wVar2.f671a.containsKey("android:visibility:visibility") != wVar.f671a.containsKey("android:visibility:visibility")) {
            return false;
        }
        H Q3 = Q(wVar, wVar2);
        if (Q3.f592c) {
            return Q3.f590a == 0 || Q3.f591b == 0;
        }
        return false;
    }

    public C0306h() {
        this.f619T = 3;
    }
}
