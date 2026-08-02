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
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.HashMap;

/* renamed from: D0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295h extends o {

    /* renamed from: U, reason: collision with root package name */
    public static final String[] f458U = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: T, reason: collision with root package name */
    public final int f459T;

    public C0295h(int i) {
        this();
        this.f459T = i;
    }

    public static void N(w wVar) {
        int visibility = wVar.f513b.getVisibility();
        HashMap hashMap = wVar.f512a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = wVar.f513b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float P(w wVar, float f2) {
        Float f9;
        return (wVar == null || (f9 = (Float) wVar.f512a.get("android:fade:transitionAlpha")) == null) ? f2 : f9.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H Q(w wVar, w wVar2) {
        H h3 = new H();
        h3.f432c = false;
        h3.f433d = false;
        if (wVar != null) {
            HashMap hashMap = wVar.f512a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                h3.f430a = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                h3.f434e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (wVar2 != null) {
                    HashMap hashMap2 = wVar2.f512a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        h3.f431b = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        h3.f435f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (wVar == null && wVar2 != null) {
                            int i = h3.f430a;
                            int i4 = h3.f431b;
                            if (i != i4 || ((ViewGroup) h3.f434e) != ((ViewGroup) h3.f435f)) {
                                if (i != i4) {
                                    if (i == 0) {
                                        h3.f433d = false;
                                        h3.f432c = true;
                                        return h3;
                                    }
                                    if (i4 == 0) {
                                        h3.f433d = true;
                                        h3.f432c = true;
                                        return h3;
                                    }
                                } else {
                                    if (((ViewGroup) h3.f435f) == null) {
                                        h3.f433d = false;
                                        h3.f432c = true;
                                        return h3;
                                    }
                                    if (((ViewGroup) h3.f434e) == null) {
                                        h3.f433d = true;
                                        h3.f432c = true;
                                        return h3;
                                    }
                                }
                            }
                        } else {
                            if (wVar != null && h3.f431b == 0) {
                                h3.f433d = true;
                                h3.f432c = true;
                                return h3;
                            }
                            if (wVar2 == null && h3.f430a == 0) {
                                h3.f433d = false;
                                h3.f432c = true;
                            }
                        }
                        return h3;
                    }
                }
                h3.f431b = -1;
                h3.f435f = null;
                if (wVar == null) {
                }
                if (wVar != null) {
                }
                if (wVar2 == null) {
                    h3.f433d = false;
                    h3.f432c = true;
                }
                return h3;
            }
        }
        h3.f430a = -1;
        h3.f434e = null;
        if (wVar2 != null) {
        }
        h3.f431b = -1;
        h3.f435f = null;
        if (wVar == null) {
        }
        if (wVar != null) {
        }
        if (wVar2 == null) {
        }
        return h3;
    }

    public final ObjectAnimator O(View view, float f2, float f9) {
        if (f2 == f9) {
            return null;
        }
        y.f515a.H(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, y.f516b, f9);
        C0294g c0294g = new C0294g(view);
        ofFloat.addListener(c0294g);
        t().a(c0294g);
        return ofFloat;
    }

    @Override // D0.o
    public final void i(w wVar) {
        N(wVar);
    }

    @Override // D0.o
    public final void l(w wVar) {
        N(wVar);
        View view = wVar.f513b;
        Float f2 = (Float) view.getTag(C5248R.id.transition_pause_alpha);
        if (f2 == null) {
            f2 = view.getVisibility() == 0 ? Float.valueOf(y.f515a.u(view)) : Float.valueOf(0.0f);
        }
        wVar.f512a.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (Q(s(r3, false), w(r3, false)).f432c != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    @Override // D0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator p(FrameLayout frameLayout, w wVar, w wVar2) {
        boolean z6;
        View view;
        int i;
        int i4;
        char c9;
        View view2;
        Animator animator;
        View view3;
        boolean z9;
        ViewGroup viewGroup;
        int i6;
        Bitmap bitmap;
        int i9 = this.f459T;
        H Q8 = Q(wVar, wVar2);
        if (Q8.f432c && (((ViewGroup) Q8.f434e) != null || ((ViewGroup) Q8.f435f) != null)) {
            int i10 = 0;
            if (!Q8.f433d) {
                int i11 = Q8.f431b;
                if ((i9 & 2) == 2 && wVar != null) {
                    View view4 = wVar2 != null ? wVar2.f513b : null;
                    View view5 = wVar.f513b;
                    View view6 = (View) view5.getTag(C5248R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i11;
                        i4 = 0;
                        i10 = 1;
                        c9 = 1;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view4 == null || view4.getParent() == null) {
                            if (view4 != null) {
                                z6 = false;
                                view = null;
                                if (z6) {
                                    if (view5.getParent() == null) {
                                        i = i11;
                                        i4 = 0;
                                        c9 = 1;
                                        view3 = view;
                                        animator = null;
                                        view6 = view5;
                                    } else if (view5.getParent() instanceof View) {
                                        View view7 = (View) view5.getParent();
                                        animator = null;
                                        i4 = 0;
                                        if (Q(w(view7, true), s(view7, true)).f432c) {
                                            i = i11;
                                            c9 = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                frameLayout.findViewById(id);
                                            }
                                            view6 = view4;
                                            i10 = i4;
                                            view3 = view2;
                                        } else {
                                            boolean z10 = v.f511a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            D d9 = y.f515a;
                                            d9.R(view5, matrix);
                                            d9.S(frameLayout, matrix);
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
                                            boolean z11 = frameLayout != null && frameLayout.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z9 = isAttachedToWindow;
                                                viewGroup = null;
                                                i6 = 0;
                                            } else if (z11) {
                                                viewGroup = (ViewGroup) view5.getParent();
                                                int indexOfChild = viewGroup.indexOfChild(view5);
                                                z9 = isAttachedToWindow;
                                                frameLayout.getOverlay().add(view5);
                                                i6 = indexOfChild;
                                            } else {
                                                i = i11;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i10 = i4;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i = i11;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (v.f511a) {
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
                                                viewGroup.addView(view5, i6);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i10 = i4;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i11;
                                i4 = 0;
                                c9 = 1;
                                view2 = view;
                                animator = null;
                                view6 = view4;
                                i10 = i4;
                                view3 = view2;
                            }
                        } else if (i11 == 4 || view5 == view4) {
                            view = view4;
                            z6 = false;
                            view4 = null;
                            if (z6) {
                            }
                            i = i11;
                            i4 = 0;
                            c9 = 1;
                            view2 = view;
                            animator = null;
                            view6 = view4;
                            i10 = i4;
                            view3 = view2;
                        }
                        z6 = true;
                        view4 = null;
                        view = null;
                        if (z6) {
                        }
                        i = i11;
                        i4 = 0;
                        c9 = 1;
                        view2 = view;
                        animator = null;
                        view6 = view4;
                        i10 = i4;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        y.b(view3, i4);
                        D d10 = y.f515a;
                        d10.getClass();
                        ObjectAnimator O8 = O(view3, P(wVar, 1.0f), 0.0f);
                        if (O8 == null) {
                            d10.H(view3, P(wVar2, 1.0f));
                        }
                        if (O8 == null) {
                            y.b(view3, visibility);
                            return O8;
                        }
                        F f2 = new F(i, view3);
                        O8.addListener(f2);
                        t().a(f2);
                        return O8;
                    }
                    if (i10 == 0) {
                        int[] iArr = (int[]) wVar.f512a.get("android:visibility:screenLocation");
                        int i12 = iArr[i4];
                        int i13 = iArr[c9];
                        int[] iArr2 = new int[2];
                        frameLayout.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i12 - iArr2[i4]) - view6.getLeft());
                        view6.offsetTopAndBottom((i13 - iArr2[c9]) - view6.getTop());
                        frameLayout.getOverlay().add(view6);
                    }
                    D d11 = y.f515a;
                    d11.getClass();
                    ObjectAnimator O9 = O(view6, P(wVar, 1.0f), 0.0f);
                    if (O9 == null) {
                        d11.H(view6, P(wVar2, 1.0f));
                    }
                    if (i10 == 0) {
                        if (O9 == null) {
                            frameLayout.getOverlay().remove(view6);
                            return O9;
                        }
                        view5.setTag(C5248R.id.save_overlay_view, view6);
                        G g9 = new G(this, frameLayout, view6, view5);
                        O9.addListener(g9);
                        O9.addPauseListener(g9);
                        t().a(g9);
                    }
                    return O9;
                }
            } else if ((i9 & 1) == 1 && wVar2 != null) {
                View view8 = wVar2.f513b;
                if (wVar == null) {
                    View view9 = (View) view8.getParent();
                }
                y.f515a.getClass();
                return O(view8, P(wVar, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // D0.o
    public final String[] v() {
        return f458U;
    }

    @Override // D0.o
    public final boolean x(w wVar, w wVar2) {
        if (wVar == null && wVar2 == null) {
            return false;
        }
        if (wVar != null && wVar2 != null && wVar2.f512a.containsKey("android:visibility:visibility") != wVar.f512a.containsKey("android:visibility:visibility")) {
            return false;
        }
        H Q8 = Q(wVar, wVar2);
        if (Q8.f432c) {
            return Q8.f430a == 0 || Q8.f431b == 0;
        }
        return false;
    }

    public C0295h() {
        this.f459T = 3;
    }
}
