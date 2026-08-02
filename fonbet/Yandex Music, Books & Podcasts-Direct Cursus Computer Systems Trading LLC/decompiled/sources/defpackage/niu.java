package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class niu extends b8t {
    public static final String[] I = {"android:visibility:visibility", "android:visibility:parent"};
    public int H = 3;

    public static void U(b9t b9tVar) {
        int visibility = b9tVar.b.getVisibility();
        HashMap hashMap = b9tVar.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = b9tVar.b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ixn V(b9t b9tVar, b9t b9tVar2) {
        ixn ixnVar = new ixn();
        ixnVar.a = false;
        ixnVar.b = false;
        if (b9tVar != null) {
            HashMap hashMap = b9tVar.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                ixnVar.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                ixnVar.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (b9tVar2 != null) {
                    HashMap hashMap2 = b9tVar2.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        ixnVar.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        ixnVar.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (b9tVar == null && b9tVar2 != null) {
                            int i = ixnVar.c;
                            int i2 = ixnVar.d;
                            if (i != i2 || ((ViewGroup) ixnVar.e) != ((ViewGroup) ixnVar.f)) {
                                if (i != i2) {
                                    if (i == 0) {
                                        ixnVar.b = false;
                                        ixnVar.a = true;
                                        return ixnVar;
                                    }
                                    if (i2 == 0) {
                                        ixnVar.b = true;
                                        ixnVar.a = true;
                                        return ixnVar;
                                    }
                                } else {
                                    if (((ViewGroup) ixnVar.f) == null) {
                                        ixnVar.b = false;
                                        ixnVar.a = true;
                                        return ixnVar;
                                    }
                                    if (((ViewGroup) ixnVar.e) == null) {
                                        ixnVar.b = true;
                                        ixnVar.a = true;
                                        return ixnVar;
                                    }
                                }
                            }
                        } else {
                            if (b9tVar != null && ixnVar.d == 0) {
                                ixnVar.b = true;
                                ixnVar.a = true;
                                return ixnVar;
                            }
                            if (b9tVar2 == null && ixnVar.c == 0) {
                                ixnVar.b = false;
                                ixnVar.a = true;
                            }
                        }
                        return ixnVar;
                    }
                }
                ixnVar.d = -1;
                ixnVar.f = null;
                if (b9tVar == null) {
                }
                if (b9tVar != null) {
                }
                if (b9tVar2 == null) {
                    ixnVar.b = false;
                    ixnVar.a = true;
                }
                return ixnVar;
            }
        }
        ixnVar.c = -1;
        ixnVar.e = null;
        if (b9tVar2 != null) {
        }
        ixnVar.d = -1;
        ixnVar.f = null;
        if (b9tVar == null) {
        }
        if (b9tVar != null) {
        }
        if (b9tVar2 == null) {
        }
        return ixnVar;
    }

    @Override // defpackage.b8t
    public final boolean A(b9t b9tVar, b9t b9tVar2) {
        if (b9tVar == null && b9tVar2 == null) {
            return false;
        }
        if (b9tVar != null && b9tVar2 != null && b9tVar2.a.containsKey("android:visibility:visibility") != b9tVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        ixn V = V(b9tVar, b9tVar2);
        if (V.a) {
            return V.c == 0 || V.d == 0;
        }
        return false;
    }

    public Animator W(ViewGroup viewGroup, b9t b9tVar, int i, b9t b9tVar2, int i2) {
        if ((this.H & 1) != 1 || b9tVar2 == null) {
            return null;
        }
        View view = b9tVar2.b;
        if (b9tVar == null) {
            View view2 = (View) view.getParent();
            if (V(s(view2, false), w(view2, false)).a) {
                return null;
            }
        }
        return X(viewGroup, view, b9tVar, b9tVar2);
    }

    public abstract ObjectAnimator X(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2);

    /* JADX WARN: Removed duplicated region for block: B:55:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator Y(ViewGroup viewGroup, b9t b9tVar, int i, b9t b9tVar2, int i2) {
        View view;
        boolean z;
        View view2;
        char c;
        Animator animator;
        int i3;
        int i4;
        View view3;
        ViewGroup viewGroup2;
        boolean z2;
        int i5;
        Bitmap bitmap;
        if ((this.H & 2) != 2 || b9tVar == null) {
            return null;
        }
        View view4 = b9tVar.b;
        View view5 = b9tVar2 != null ? b9tVar2.b : null;
        View view6 = (View) view4.getTag(R.id.save_overlay_view);
        if (view6 != null) {
            i4 = 1;
            c = 1;
            animator = null;
            view3 = null;
            i3 = 0;
        } else {
            if (view5 == null || view5.getParent() == null) {
                if (view5 != null) {
                    view = null;
                    z = false;
                }
                z = true;
                view5 = null;
                view = null;
            } else {
                if (i2 == 4 || view4 == view5) {
                    view = view5;
                    view5 = null;
                    z = false;
                }
                z = true;
                view5 = null;
                view = null;
            }
            if (z) {
                if (view4.getParent() == null) {
                    view3 = view;
                    c = 1;
                    animator = null;
                    i4 = 0;
                    i3 = 0;
                    view6 = view4;
                } else if (view4.getParent() instanceof View) {
                    View view7 = (View) view4.getParent();
                    if (V(w(view7, true), s(view7, true)).a) {
                        view2 = view;
                        c = 1;
                        animator = null;
                        i3 = 0;
                        int id = view7.getId();
                        if (view7.getParent() == null && id != -1) {
                            viewGroup.findViewById(id);
                        }
                        view6 = view5;
                        i4 = i3;
                        view3 = view2;
                    } else {
                        boolean z3 = a9t.a;
                        Matrix matrix = new Matrix();
                        matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                        aiu aiuVar = yhu.a;
                        aiuVar.Q(view4, matrix);
                        aiuVar.R(viewGroup, matrix);
                        animator = null;
                        RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                        matrix.mapRect(rectF);
                        int round = Math.round(rectF.left);
                        int round2 = Math.round(rectF.top);
                        int round3 = Math.round(rectF.right);
                        c = 1;
                        int round4 = Math.round(rectF.bottom);
                        i3 = 0;
                        ImageView imageView = new ImageView(view4.getContext());
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        boolean isAttachedToWindow = view4.isAttachedToWindow();
                        boolean z4 = viewGroup != null && viewGroup.isAttachedToWindow();
                        if (isAttachedToWindow) {
                            viewGroup2 = null;
                            z2 = isAttachedToWindow;
                            i5 = 0;
                        } else if (z4) {
                            viewGroup2 = (ViewGroup) view4.getParent();
                            int indexOfChild = viewGroup2.indexOfChild(view4);
                            wdu.a(viewGroup, view4);
                            z2 = isAttachedToWindow;
                            i5 = indexOfChild;
                        } else {
                            bitmap = null;
                            view2 = view;
                            if (bitmap != null) {
                                imageView.setImageBitmap(bitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                            imageView.layout(round, round2, round3, round4);
                            view6 = imageView;
                            i4 = i3;
                            view3 = view2;
                        }
                        view2 = view;
                        int round5 = Math.round(rectF.width());
                        int round6 = Math.round(rectF.height());
                        if (round5 <= 0 || round6 <= 0) {
                            bitmap = null;
                        } else {
                            float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                            int round7 = Math.round(round5 * min);
                            int round8 = Math.round(round6 * min);
                            matrix.postTranslate(-rectF.left, -rectF.top);
                            matrix.postScale(min, min);
                            if (a9t.a) {
                                Picture picture = new Picture();
                                Canvas beginRecording = picture.beginRecording(round7, round8);
                                beginRecording.concat(matrix);
                                view4.draw(beginRecording);
                                picture.endRecording();
                                bitmap = jo0.h(picture);
                            } else {
                                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmap);
                                canvas.concat(matrix);
                                view4.draw(canvas);
                            }
                        }
                        if (!z2) {
                            viewGroup.getOverlay().remove(view4);
                            viewGroup2.addView(view4, i5);
                        }
                        if (bitmap != null) {
                        }
                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                        imageView.layout(round, round2, round3, round4);
                        view6 = imageView;
                        i4 = i3;
                        view3 = view2;
                    }
                }
            }
            view2 = view;
            c = 1;
            animator = null;
            i3 = 0;
            view6 = view5;
            i4 = i3;
            view3 = view2;
        }
        if (view6 == null) {
            if (view3 == null) {
                return animator;
            }
            int visibility = view3.getVisibility();
            yhu.b(i3, view3);
            ObjectAnimator Z = Z(viewGroup, view3, b9tVar, b9tVar2);
            if (Z == null) {
                yhu.b(visibility, view3);
                return Z;
            }
            liu liuVar = new liu(view3, i2);
            Z.addListener(liuVar);
            t().b(liuVar);
            return Z;
        }
        if (i4 == 0) {
            int[] iArr = (int[]) b9tVar.a.get("android:visibility:screenLocation");
            int i6 = iArr[i3];
            int i7 = iArr[c];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view6.offsetLeftAndRight((i6 - iArr2[i3]) - view6.getLeft());
            view6.offsetTopAndBottom((i7 - iArr2[c]) - view6.getTop());
            wdu.a(viewGroup, view6);
        }
        ObjectAnimator Z2 = Z(viewGroup, view6, b9tVar, b9tVar2);
        if (i4 == 0) {
            if (Z2 == null) {
                viewGroup.getOverlay().remove(view6);
                return Z2;
            }
            view4.setTag(R.id.save_overlay_view, view6);
            miu miuVar = new miu(this, viewGroup, view6, view4);
            Z2.addListener(miuVar);
            Z2.addPauseListener(miuVar);
            t().b(miuVar);
        }
        return Z2;
    }

    public abstract ObjectAnimator Z(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2);

    public final void a0(int i) {
        if ((i & (-4)) == 0) {
            this.H = i;
        } else {
            xq0.x("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    @Override // defpackage.b8t
    public void g(b9t b9tVar) {
        U(b9tVar);
    }

    @Override // defpackage.b8t
    public final Animator n(ViewGroup viewGroup, b9t b9tVar, b9t b9tVar2) {
        ixn V = V(b9tVar, b9tVar2);
        if (!V.a) {
            return null;
        }
        if (((ViewGroup) V.e) == null && ((ViewGroup) V.f) == null) {
            return null;
        }
        boolean z = V.b;
        int i = V.c;
        int i2 = V.d;
        return z ? W(viewGroup, b9tVar, i, b9tVar2, i2) : Y(viewGroup, b9tVar, i, b9tVar2, i2);
    }

    @Override // defpackage.b8t
    public final String[] v() {
        return I;
    }
}
