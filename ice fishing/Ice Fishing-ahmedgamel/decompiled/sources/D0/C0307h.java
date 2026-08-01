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
import com.icefishing.icefishingbigwin.C5275R;
import java.util.HashMap;

/* renamed from: D0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307h extends o {

    /* renamed from: U, reason: collision with root package name */
    public static final String[] f563U = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: T, reason: collision with root package name */
    public final int f564T;

    public C0307h(int i) {
        this();
        this.f564T = i;
    }

    public static void N(w wVar) {
        int visibility = wVar.f617b.getVisibility();
        HashMap hashMap = wVar.f616a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = wVar.f617b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float P(w wVar, float f3) {
        Float f9;
        return (wVar == null || (f9 = (Float) wVar.f616a.get("android:fade:transitionAlpha")) == null) ? f3 : f9.floatValue();
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
        h9.f537c = false;
        h9.f538d = false;
        if (wVar != null) {
            HashMap hashMap = wVar.f616a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                h9.f535a = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                h9.f539e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (wVar2 != null) {
                    HashMap hashMap2 = wVar2.f616a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        h9.f536b = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        h9.f540f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (wVar == null && wVar2 != null) {
                            int i = h9.f535a;
                            int i6 = h9.f536b;
                            if (i != i6 || ((ViewGroup) h9.f539e) != ((ViewGroup) h9.f540f)) {
                                if (i != i6) {
                                    if (i == 0) {
                                        h9.f538d = false;
                                        h9.f537c = true;
                                        return h9;
                                    }
                                    if (i6 == 0) {
                                        h9.f538d = true;
                                        h9.f537c = true;
                                        return h9;
                                    }
                                } else {
                                    if (((ViewGroup) h9.f540f) == null) {
                                        h9.f538d = false;
                                        h9.f537c = true;
                                        return h9;
                                    }
                                    if (((ViewGroup) h9.f539e) == null) {
                                        h9.f538d = true;
                                        h9.f537c = true;
                                        return h9;
                                    }
                                }
                            }
                        } else {
                            if (wVar != null && h9.f536b == 0) {
                                h9.f538d = true;
                                h9.f537c = true;
                                return h9;
                            }
                            if (wVar2 == null && h9.f535a == 0) {
                                h9.f538d = false;
                                h9.f537c = true;
                            }
                        }
                        return h9;
                    }
                }
                h9.f536b = -1;
                h9.f540f = null;
                if (wVar == null) {
                }
                if (wVar != null) {
                }
                if (wVar2 == null) {
                    h9.f538d = false;
                    h9.f537c = true;
                }
                return h9;
            }
        }
        h9.f535a = -1;
        h9.f539e = null;
        if (wVar2 != null) {
        }
        h9.f536b = -1;
        h9.f540f = null;
        if (wVar == null) {
        }
        if (wVar != null) {
        }
        if (wVar2 == null) {
        }
        return h9;
    }

    public final ObjectAnimator O(View view, float f3, float f9) {
        if (f3 == f9) {
            return null;
        }
        y.f619a.l(view, f3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, y.f620b, f9);
        C0306g c0306g = new C0306g(view);
        ofFloat.addListener(c0306g);
        t().a(c0306g);
        return ofFloat;
    }

    @Override // D0.o
    public final void i(w wVar) {
        N(wVar);
    }

    @Override // D0.o
    public final void l(w wVar) {
        N(wVar);
        View view = wVar.f617b;
        Float f3 = (Float) view.getTag(C5275R.id.transition_pause_alpha);
        if (f3 == null) {
            f3 = view.getVisibility() == 0 ? Float.valueOf(y.f619a.h(view)) : Float.valueOf(0.0f);
        }
        wVar.f616a.put("android:fade:transitionAlpha", f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (Q(s(r3, false), w(r3, false)).f537c != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    @Override // D0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator p(FrameLayout frameLayout, w wVar, w wVar2) {
        boolean z3;
        View view;
        int i;
        int i6;
        char c9;
        View view2;
        Animator animator;
        View view3;
        boolean z6;
        ViewGroup viewGroup;
        int i9;
        Bitmap bitmap;
        int i10 = this.f564T;
        H Q8 = Q(wVar, wVar2);
        if (Q8.f537c && (((ViewGroup) Q8.f539e) != null || ((ViewGroup) Q8.f540f) != null)) {
            int i11 = 0;
            if (!Q8.f538d) {
                int i12 = Q8.f536b;
                if ((i10 & 2) == 2 && wVar != null) {
                    View view4 = wVar2 != null ? wVar2.f617b : null;
                    View view5 = wVar.f617b;
                    View view6 = (View) view5.getTag(C5275R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i12;
                        i6 = 0;
                        i11 = 1;
                        c9 = 1;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view4 == null || view4.getParent() == null) {
                            if (view4 != null) {
                                z3 = false;
                                view = null;
                                if (z3) {
                                    if (view5.getParent() == null) {
                                        i = i12;
                                        i6 = 0;
                                        c9 = 1;
                                        view3 = view;
                                        animator = null;
                                        view6 = view5;
                                    } else if (view5.getParent() instanceof View) {
                                        View view7 = (View) view5.getParent();
                                        animator = null;
                                        i6 = 0;
                                        if (Q(w(view7, true), s(view7, true)).f537c) {
                                            i = i12;
                                            c9 = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                frameLayout.findViewById(id);
                                            }
                                            view6 = view4;
                                            i11 = i6;
                                            view3 = view2;
                                        } else {
                                            boolean z9 = v.f615a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            D d2 = y.f619a;
                                            d2.r(view5, matrix);
                                            d2.s(frameLayout, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c9 = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view5.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view5.isAttachedToWindow();
                                            boolean z10 = frameLayout != null && frameLayout.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z6 = isAttachedToWindow;
                                                viewGroup = null;
                                                i9 = 0;
                                            } else if (z10) {
                                                viewGroup = (ViewGroup) view5.getParent();
                                                int indexOfChild = viewGroup.indexOfChild(view5);
                                                z6 = isAttachedToWindow;
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
                                                i11 = i6;
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
                                                if (v.f615a) {
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
                                            if (!z6) {
                                                frameLayout.getOverlay().remove(view5);
                                                viewGroup.addView(view5, i9);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i11 = i6;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i12;
                                i6 = 0;
                                c9 = 1;
                                view2 = view;
                                animator = null;
                                view6 = view4;
                                i11 = i6;
                                view3 = view2;
                            }
                        } else if (i12 == 4 || view5 == view4) {
                            view = view4;
                            z3 = false;
                            view4 = null;
                            if (z3) {
                            }
                            i = i12;
                            i6 = 0;
                            c9 = 1;
                            view2 = view;
                            animator = null;
                            view6 = view4;
                            i11 = i6;
                            view3 = view2;
                        }
                        z3 = true;
                        view4 = null;
                        view = null;
                        if (z3) {
                        }
                        i = i12;
                        i6 = 0;
                        c9 = 1;
                        view2 = view;
                        animator = null;
                        view6 = view4;
                        i11 = i6;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        y.b(view3, i6);
                        D d9 = y.f619a;
                        d9.getClass();
                        ObjectAnimator O8 = O(view3, P(wVar, 1.0f), 0.0f);
                        if (O8 == null) {
                            d9.l(view3, P(wVar2, 1.0f));
                        }
                        if (O8 == null) {
                            y.b(view3, visibility);
                            return O8;
                        }
                        F f3 = new F(i, view3);
                        O8.addListener(f3);
                        t().a(f3);
                        return O8;
                    }
                    if (i11 == 0) {
                        int[] iArr = (int[]) wVar.f616a.get("android:visibility:screenLocation");
                        int i13 = iArr[i6];
                        int i14 = iArr[c9];
                        int[] iArr2 = new int[2];
                        frameLayout.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i13 - iArr2[i6]) - view6.getLeft());
                        view6.offsetTopAndBottom((i14 - iArr2[c9]) - view6.getTop());
                        frameLayout.getOverlay().add(view6);
                    }
                    D d10 = y.f619a;
                    d10.getClass();
                    ObjectAnimator O9 = O(view6, P(wVar, 1.0f), 0.0f);
                    if (O9 == null) {
                        d10.l(view6, P(wVar2, 1.0f));
                    }
                    if (i11 == 0) {
                        if (O9 == null) {
                            frameLayout.getOverlay().remove(view6);
                            return O9;
                        }
                        view5.setTag(C5275R.id.save_overlay_view, view6);
                        G g4 = new G(this, frameLayout, view6, view5);
                        O9.addListener(g4);
                        O9.addPauseListener(g4);
                        t().a(g4);
                    }
                    return O9;
                }
            } else if ((i10 & 1) == 1 && wVar2 != null) {
                View view8 = wVar2.f617b;
                if (wVar == null) {
                    View view9 = (View) view8.getParent();
                }
                y.f619a.getClass();
                return O(view8, P(wVar, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // D0.o
    public final String[] v() {
        return f563U;
    }

    @Override // D0.o
    public final boolean x(w wVar, w wVar2) {
        if (wVar == null && wVar2 == null) {
            return false;
        }
        if (wVar != null && wVar2 != null && wVar2.f616a.containsKey("android:visibility:visibility") != wVar.f616a.containsKey("android:visibility:visibility")) {
            return false;
        }
        H Q8 = Q(wVar, wVar2);
        if (Q8.f537c) {
            return Q8.f535a == 0 || Q8.f536b == 0;
        }
        return false;
    }

    public C0307h() {
        this.f564T = 3;
    }
}
