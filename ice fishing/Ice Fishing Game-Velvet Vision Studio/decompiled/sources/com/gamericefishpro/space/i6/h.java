package com.gamericefishpro.space.i6;

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
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d4.l0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends o {
    public static final String[] W = {"android:visibility:visibility", "android:visibility:parent"};
    public final int V;

    public h(int i) {
        this();
        this.V = i;
    }

    public static void L(v vVar) {
        View view = vVar.b;
        int visibility = view.getVisibility();
        HashMap map = vVar.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float N(v vVar, float f) {
        Float f2;
        return (vVar == null || (f2 = (Float) vVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static c0 O(v vVar, v vVar2) {
        c0 c0Var = new c0();
        c0Var.a = false;
        c0Var.b = false;
        if (vVar != null) {
            HashMap map = vVar.a;
            if (map.containsKey("android:visibility:visibility")) {
                c0Var.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c0Var.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c0Var.c = -1;
                c0Var.e = null;
            }
        } else {
            c0Var.c = -1;
            c0Var.e = null;
        }
        if (vVar2 != null) {
            HashMap map2 = vVar2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                c0Var.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c0Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c0Var.d = -1;
                c0Var.f = null;
            }
        } else {
            c0Var.d = -1;
            c0Var.f = null;
        }
        if (vVar != null && vVar2 != null) {
            int i = c0Var.c;
            int i2 = c0Var.d;
            if (i != i2 || c0Var.e != c0Var.f) {
                if (i != i2) {
                    if (i == 0) {
                        c0Var.b = false;
                        c0Var.a = true;
                        return c0Var;
                    }
                    if (i2 == 0) {
                        c0Var.b = true;
                        c0Var.a = true;
                        return c0Var;
                    }
                } else {
                    if (c0Var.f == null) {
                        c0Var.b = false;
                        c0Var.a = true;
                        return c0Var;
                    }
                    if (c0Var.e == null) {
                        c0Var.b = true;
                        c0Var.a = true;
                        return c0Var;
                    }
                }
            }
        } else {
            if (vVar == null && c0Var.d == 0) {
                c0Var.b = true;
                c0Var.a = true;
                return c0Var;
            }
            if (vVar2 == null && c0Var.c == 0) {
                c0Var.b = false;
                c0Var.a = true;
            }
        }
        return c0Var;
    }

    public final ObjectAnimator M(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        x.a.N(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, x.b, f2);
        g gVar = new g(view);
        objectAnimatorOfFloat.addListener(gVar);
        o().a(gVar);
        return objectAnimatorOfFloat;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void d(v vVar) {
        L(vVar);
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void g(v vVar) {
        L(vVar);
        View view = vVar.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(x.a.B(view)) : Float.valueOf(0.0f);
        }
        vVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:69:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01de  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (O(n(r3, false), r(r3, false)).a != false) goto L9;
     */
    @Override // com.gamericefishpro.space.i6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        boolean z;
        View view;
        int i;
        char c;
        int i2;
        View view2;
        Animator animator;
        View view3;
        View view4;
        int id;
        ImageView imageView;
        boolean zIsAttachedToWindow;
        boolean z2;
        ViewGroup viewGroup2;
        int i3;
        int iRound;
        Bitmap bitmapCreateBitmap;
        c0 c0VarO = O(vVar, vVar2);
        if (c0VarO.a && (c0VarO.e != null || c0VarO.f != null)) {
            boolean z3 = c0VarO.b;
            int i4 = this.V;
            int i5 = 1;
            if (!z3) {
                int i6 = c0VarO.d;
                if ((i4 & 2) == 2 && vVar != null) {
                    View view5 = vVar.b;
                    View view6 = vVar2 != null ? vVar2.b : null;
                    View view7 = (View) view5.getTag(R.id.save_overlay_view);
                    if (view7 != null) {
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view6 == null || view6.getParent() == null) {
                            if (view6 != null) {
                                z = false;
                            }
                            view = null;
                            if (!z) {
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view7 = view6;
                                i5 = i2;
                                view3 = view2;
                            } else if (view5.getParent() == null) {
                                i = i6;
                                c = 1;
                                i5 = 0;
                                i2 = 0;
                                view3 = view;
                                animator = null;
                                view7 = view5;
                            } else {
                                if (view5.getParent() instanceof View) {
                                    view4 = (View) view5.getParent();
                                    animator = null;
                                    i2 = 0;
                                    if (O(r(view4, true), n(view4, true)).a) {
                                        i = i6;
                                        c = 1;
                                        view2 = view;
                                        id = view4.getId();
                                        if (view4.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                    } else {
                                        boolean z4 = u.a;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        y yVar = x.a;
                                        yVar.U(view5, matrix);
                                        yVar.V(viewGroup, matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                        matrix.mapRect(rectF);
                                        int iRound2 = Math.round(rectF.left);
                                        int iRound3 = Math.round(rectF.top);
                                        c = 1;
                                        int iRound4 = Math.round(rectF.right);
                                        int iRound5 = Math.round(rectF.bottom);
                                        imageView = new ImageView(view5.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        zIsAttachedToWindow = view5.isAttachedToWindow();
                                        if (viewGroup == null && viewGroup.isAttachedToWindow()) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (zIsAttachedToWindow) {
                                            viewGroup2 = null;
                                            i3 = 0;
                                        } else {
                                            if (z2) {
                                                viewGroup2 = (ViewGroup) view5.getParent();
                                                int iIndexOfChild = viewGroup2.indexOfChild(view5);
                                                l0.a(viewGroup, view5);
                                                i3 = iIndexOfChild;
                                            } else {
                                                i = i6;
                                                view2 = view;
                                                bitmapCreateBitmap = null;
                                            }
                                            if (bitmapCreateBitmap != null) {
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                            imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                            view7 = imageView;
                                        }
                                        view2 = view;
                                        iRound = Math.round(rectF.width());
                                        i = i6;
                                        int iRound6 = Math.round(rectF.height());
                                        if (iRound > 0 || iRound6 <= 0) {
                                            bitmapCreateBitmap = null;
                                        } else {
                                            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound6));
                                            int iRound7 = Math.round(iRound * fMin);
                                            int iRound8 = Math.round(iRound6 * fMin);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(fMin, fMin);
                                            if (u.a) {
                                                Picture picture = new Picture();
                                                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                                canvasBeginRecording.concat(matrix);
                                                view5.draw(canvasBeginRecording);
                                                picture.endRecording();
                                                bitmapCreateBitmap = com.gamericefishpro.space.d4.h.c(picture);
                                            } else {
                                                bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                                canvas.concat(matrix);
                                                view5.draw(canvas);
                                            }
                                        }
                                        if (!zIsAttachedToWindow) {
                                            viewGroup.getOverlay().remove(view5);
                                            viewGroup2.addView(view5, i3);
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                        imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                        view7 = imageView;
                                    }
                                    i5 = i2;
                                    view3 = view2;
                                } else {
                                    i = i6;
                                    c = 1;
                                    i2 = 0;
                                    view2 = view;
                                    animator = null;
                                }
                                view7 = view6;
                                i5 = i2;
                                view3 = view2;
                            }
                        } else {
                            if (i6 == 4 || view5 == view6) {
                                z = false;
                                view = view6;
                                view6 = null;
                            }
                            if (!z) {
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view7 = view6;
                                i5 = i2;
                                view3 = view2;
                            } else if (view5.getParent() == null) {
                                i = i6;
                                c = 1;
                                i5 = 0;
                                i2 = 0;
                                view3 = view;
                                animator = null;
                                view7 = view5;
                            } else {
                                if (view5.getParent() instanceof View) {
                                    view4 = (View) view5.getParent();
                                    animator = null;
                                    i2 = 0;
                                    if (O(r(view4, true), n(view4, true)).a) {
                                        boolean z5 = u.a;
                                        Matrix matrix2 = new Matrix();
                                        matrix2.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        y yVar2 = x.a;
                                        yVar2.U(view5, matrix2);
                                        yVar2.V(viewGroup, matrix2);
                                        RectF rectF2 = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                        matrix2.mapRect(rectF2);
                                        int iRound9 = Math.round(rectF2.left);
                                        int iRound10 = Math.round(rectF2.top);
                                        c = 1;
                                        int iRound11 = Math.round(rectF2.right);
                                        int iRound12 = Math.round(rectF2.bottom);
                                        imageView = new ImageView(view5.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        zIsAttachedToWindow = view5.isAttachedToWindow();
                                        if (viewGroup == null) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        if (zIsAttachedToWindow) {
                                            if (z2) {
                                                i = i6;
                                                view2 = view;
                                                bitmapCreateBitmap = null;
                                            } else {
                                                viewGroup2 = (ViewGroup) view5.getParent();
                                                int iIndexOfChild2 = viewGroup2.indexOfChild(view5);
                                                l0.a(viewGroup, view5);
                                                i3 = iIndexOfChild2;
                                            }
                                            if (bitmapCreateBitmap != null) {
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
                                            imageView.layout(iRound9, iRound10, iRound11, iRound12);
                                            view7 = imageView;
                                        } else {
                                            viewGroup2 = null;
                                            i3 = 0;
                                        }
                                        view2 = view;
                                        iRound = Math.round(rectF2.width());
                                        i = i6;
                                        int iRound13 = Math.round(rectF2.height());
                                        if (iRound > 0) {
                                            bitmapCreateBitmap = null;
                                        } else {
                                            bitmapCreateBitmap = null;
                                        }
                                        if (!zIsAttachedToWindow) {
                                            viewGroup.getOverlay().remove(view5);
                                            viewGroup2.addView(view5, i3);
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
                                        imageView.layout(iRound9, iRound10, iRound11, iRound12);
                                        view7 = imageView;
                                    } else {
                                        i = i6;
                                        c = 1;
                                        view2 = view;
                                        id = view4.getId();
                                        if (view4.getParent() == null) {
                                            viewGroup.findViewById(id);
                                        }
                                    }
                                    i5 = i2;
                                    view3 = view2;
                                } else {
                                    i = i6;
                                    c = 1;
                                    i2 = 0;
                                    view2 = view;
                                    animator = null;
                                }
                                view7 = view6;
                                i5 = i2;
                                view3 = view2;
                            }
                        }
                        z = true;
                        view6 = null;
                        view = null;
                        if (!z) {
                            i = i6;
                            c = 1;
                            i2 = 0;
                            view2 = view;
                            animator = null;
                            view7 = view6;
                            i5 = i2;
                            view3 = view2;
                        } else if (view5.getParent() == null) {
                            i = i6;
                            c = 1;
                            i5 = 0;
                            i2 = 0;
                            view3 = view;
                            animator = null;
                            view7 = view5;
                        } else {
                            if (view5.getParent() instanceof View) {
                                view4 = (View) view5.getParent();
                                animator = null;
                                i2 = 0;
                                if (O(r(view4, true), n(view4, true)).a) {
                                    boolean z6 = u.a;
                                    Matrix matrix3 = new Matrix();
                                    matrix3.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                    y yVar3 = x.a;
                                    yVar3.U(view5, matrix3);
                                    yVar3.V(viewGroup, matrix3);
                                    RectF rectF3 = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                    matrix3.mapRect(rectF3);
                                    int iRound14 = Math.round(rectF3.left);
                                    int iRound15 = Math.round(rectF3.top);
                                    c = 1;
                                    int iRound16 = Math.round(rectF3.right);
                                    int iRound17 = Math.round(rectF3.bottom);
                                    imageView = new ImageView(view5.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    zIsAttachedToWindow = view5.isAttachedToWindow();
                                    if (viewGroup == null) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    if (zIsAttachedToWindow) {
                                        if (z2) {
                                            i = i6;
                                            view2 = view;
                                            bitmapCreateBitmap = null;
                                        } else {
                                            viewGroup2 = (ViewGroup) view5.getParent();
                                            int iIndexOfChild3 = viewGroup2.indexOfChild(view5);
                                            l0.a(viewGroup, view5);
                                            i3 = iIndexOfChild3;
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound16 - iRound14, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824));
                                        imageView.layout(iRound14, iRound15, iRound16, iRound17);
                                        view7 = imageView;
                                    } else {
                                        viewGroup2 = null;
                                        i3 = 0;
                                    }
                                    view2 = view;
                                    iRound = Math.round(rectF3.width());
                                    i = i6;
                                    int iRound18 = Math.round(rectF3.height());
                                    if (iRound > 0) {
                                        bitmapCreateBitmap = null;
                                    } else {
                                        bitmapCreateBitmap = null;
                                    }
                                    if (!zIsAttachedToWindow) {
                                        viewGroup.getOverlay().remove(view5);
                                        viewGroup2.addView(view5, i3);
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound16 - iRound14, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824));
                                    imageView.layout(iRound14, iRound15, iRound16, iRound17);
                                    view7 = imageView;
                                } else {
                                    i = i6;
                                    c = 1;
                                    view2 = view;
                                    id = view4.getId();
                                    if (view4.getParent() == null) {
                                        viewGroup.findViewById(id);
                                    }
                                }
                                i5 = i2;
                                view3 = view2;
                            } else {
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                            }
                            view7 = view6;
                            i5 = i2;
                            view3 = view2;
                        }
                    }
                    if (view7 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        x.b(view3, i2);
                        y yVar4 = x.a;
                        yVar4.getClass();
                        ObjectAnimator objectAnimatorM = M(view3, N(vVar, 1.0f), 0.0f);
                        if (objectAnimatorM == null) {
                            yVar4.N(view3, N(vVar2, 1.0f));
                        }
                        if (objectAnimatorM == null) {
                            x.b(view3, visibility);
                            return objectAnimatorM;
                        }
                        a0 a0Var = new a0(view3, i);
                        objectAnimatorM.addListener(a0Var);
                        o().a(a0Var);
                        return objectAnimatorM;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) vVar.a.get("android:visibility:screenLocation");
                        int i7 = iArr[i2];
                        int i8 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view7.offsetLeftAndRight((i7 - iArr2[i2]) - view7.getLeft());
                        view7.offsetTopAndBottom((i8 - iArr2[c]) - view7.getTop());
                        l0.a(viewGroup, view7);
                    }
                    y yVar5 = x.a;
                    yVar5.getClass();
                    ObjectAnimator objectAnimatorM2 = M(view7, N(vVar, 1.0f), 0.0f);
                    if (objectAnimatorM2 == null) {
                        yVar5.N(view7, N(vVar2, 1.0f));
                    }
                    if (i5 == 0) {
                        if (objectAnimatorM2 == null) {
                            viewGroup.getOverlay().remove(view7);
                            return objectAnimatorM2;
                        }
                        view5.setTag(R.id.save_overlay_view, view7);
                        b0 b0Var = new b0(this, viewGroup, view7, view5);
                        objectAnimatorM2.addListener(b0Var);
                        objectAnimatorM2.addPauseListener(b0Var);
                        o().a(b0Var);
                    }
                    return objectAnimatorM2;
                }
            } else if ((i4 & 1) == 1 && vVar2 != null) {
                View view8 = vVar2.b;
                if (vVar == null) {
                    View view9 = (View) view8.getParent();
                }
                x.a.getClass();
                return M(view8, N(vVar, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final String[] q() {
        return W;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final boolean t(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.a.containsKey("android:visibility:visibility") != vVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c0 c0VarO = O(vVar, vVar2);
        if (c0VarO.a) {
            return c0VarO.c == 0 || c0VarO.d == 0;
        }
        return false;
    }

    public h() {
        this.V = 3;
    }
}
