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
import com.kolosta.rejin.jilosa.R;
import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ng extends rd0 {
    public static final String[] Mq3SeTnW = {"android:visibility:visibility", "android:visibility:parent"};
    public final int i7xS8jrb;

    public ng(int i) {
        this.i7xS8jrb = i;
    }

    public static void VhgXwMj9(zd0 zd0Var) {
        View view = zd0Var.NCTxEWno;
        int visibility = view.getVisibility();
        HashMap hashMap = zd0Var.qoPGr6Ce;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float Xkz7p5xa(zd0 zd0Var, float f) {
        Float f2;
        return (zd0Var == null || (f2 = (Float) zd0Var.qoPGr6Ce.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ph0 fVMzMhyS(zd0 zd0Var, zd0 zd0Var2) {
        ph0 ph0Var = new ph0();
        ph0Var.qoPGr6Ce = false;
        ph0Var.NCTxEWno = false;
        if (zd0Var != null) {
            HashMap hashMap = zd0Var.qoPGr6Ce;
            if (hashMap.containsKey("android:visibility:visibility")) {
                ph0Var.MdtA4re8 = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                ph0Var.VgvYg0wo = (ViewGroup) hashMap.get("android:visibility:parent");
                if (zd0Var2 != null) {
                    HashMap hashMap2 = zd0Var2.qoPGr6Ce;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        ph0Var.wxUZMvaN = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        ph0Var.P7K7Inc8 = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (zd0Var == null && zd0Var2 != null) {
                            int i = ph0Var.MdtA4re8;
                            int i2 = ph0Var.wxUZMvaN;
                            if (i != i2 || ph0Var.VgvYg0wo != ph0Var.P7K7Inc8) {
                                if (i != i2) {
                                    if (i == 0) {
                                        ph0Var.NCTxEWno = false;
                                        ph0Var.qoPGr6Ce = true;
                                        return ph0Var;
                                    }
                                    if (i2 == 0) {
                                        ph0Var.NCTxEWno = true;
                                        ph0Var.qoPGr6Ce = true;
                                        return ph0Var;
                                    }
                                } else {
                                    if (ph0Var.P7K7Inc8 == null) {
                                        ph0Var.NCTxEWno = false;
                                        ph0Var.qoPGr6Ce = true;
                                        return ph0Var;
                                    }
                                    if (ph0Var.VgvYg0wo == null) {
                                        ph0Var.NCTxEWno = true;
                                        ph0Var.qoPGr6Ce = true;
                                        return ph0Var;
                                    }
                                }
                            }
                        } else {
                            if (zd0Var != null && ph0Var.wxUZMvaN == 0) {
                                ph0Var.NCTxEWno = true;
                                ph0Var.qoPGr6Ce = true;
                                return ph0Var;
                            }
                            if (zd0Var2 == null && ph0Var.MdtA4re8 == 0) {
                                ph0Var.NCTxEWno = false;
                                ph0Var.qoPGr6Ce = true;
                            }
                        }
                        return ph0Var;
                    }
                }
                ph0Var.wxUZMvaN = -1;
                ph0Var.P7K7Inc8 = null;
                if (zd0Var == null) {
                }
                if (zd0Var != null) {
                }
                if (zd0Var2 == null) {
                    ph0Var.NCTxEWno = false;
                    ph0Var.qoPGr6Ce = true;
                }
                return ph0Var;
            }
        }
        ph0Var.MdtA4re8 = -1;
        ph0Var.VgvYg0wo = null;
        if (zd0Var2 != null) {
        }
        ph0Var.wxUZMvaN = -1;
        ph0Var.P7K7Inc8 = null;
        if (zd0Var == null) {
        }
        if (zd0Var != null) {
        }
        if (zd0Var2 == null) {
        }
        return ph0Var;
    }

    @Override // defpackage.rd0
    public final boolean Ey6iv0m0(zd0 zd0Var, zd0 zd0Var2) {
        if (zd0Var == null && zd0Var2 == null) {
            return false;
        }
        if (zd0Var != null && zd0Var2 != null && zd0Var2.qoPGr6Ce.containsKey("android:visibility:visibility") != zd0Var.qoPGr6Ce.containsKey("android:visibility:visibility")) {
            return false;
        }
        ph0 fVMzMhyS = fVMzMhyS(zd0Var, zd0Var2);
        if (fVMzMhyS.qoPGr6Ce) {
            return fVMzMhyS.MdtA4re8 == 0 || fVMzMhyS.wxUZMvaN == 0;
        }
        return false;
    }

    public final ObjectAnimator aZz0PFXp(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        eh0.qoPGr6Ce.Qr9iLBAD(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, eh0.NCTxEWno, f2);
        mg mgVar = new mg(view);
        ofFloat.addListener(mgVar);
        sjUBp5pO().qoPGr6Ce(mgVar);
        return ofFloat;
    }

    @Override // defpackage.rd0
    public final String[] amk52bBQ() {
        return Mq3SeTnW;
    }

    @Override // defpackage.rd0
    public final void b2ZJblxo(zd0 zd0Var) {
        VhgXwMj9(zd0Var);
        View view = zd0Var.NCTxEWno;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(eh0.qoPGr6Ce.P7K7Inc8(view)) : Float.valueOf(0.0f);
        }
        zd0Var.qoPGr6Ce.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (fVMzMhyS(lDXGDhIF(r3, false), KlHjfFWx(r3, false)).qoPGr6Ce != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    @Override // defpackage.rd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k3x7lurq(ViewGroup viewGroup, zd0 zd0Var, zd0 zd0Var2) {
        boolean z;
        View view;
        int i;
        char c;
        int i2;
        View view2;
        Animator animator;
        View view3;
        boolean z2;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmap;
        ph0 fVMzMhyS = fVMzMhyS(zd0Var, zd0Var2);
        if (fVMzMhyS.qoPGr6Ce && (fVMzMhyS.VgvYg0wo != null || fVMzMhyS.P7K7Inc8 != null)) {
            boolean z3 = fVMzMhyS.NCTxEWno;
            int i4 = this.i7xS8jrb;
            int i5 = 1;
            if (!z3) {
                int i6 = fVMzMhyS.wxUZMvaN;
                if ((i4 & 2) == 2 && zd0Var != null) {
                    View view4 = zd0Var.NCTxEWno;
                    View view5 = zd0Var2 != null ? zd0Var2.NCTxEWno : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z = false;
                                view = null;
                                if (z) {
                                    if (view4.getParent() == null) {
                                        i = i6;
                                        c = 1;
                                        i5 = 0;
                                        i2 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        animator = null;
                                        i2 = 0;
                                        if (fVMzMhyS(KlHjfFWx(view7, true), lDXGDhIF(view7, true)).qoPGr6Ce) {
                                            i = i6;
                                            c = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i5 = i2;
                                            view3 = view2;
                                        } else {
                                            boolean z4 = yd0.qoPGr6Ce;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            kh0 kh0Var = eh0.qoPGr6Ce;
                                            kh0Var.ow5vqvCr(view4, matrix);
                                            kh0Var.OnDfzHZD(viewGroup, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view4.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view4.isAttachedToWindow();
                                            boolean isAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z2 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i3 = 0;
                                            } else if (isAttachedToWindow2) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                z2 = isAttachedToWindow;
                                                viewGroup.getOverlay().add(view4);
                                                i3 = indexOfChild;
                                            } else {
                                                i = i6;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i5 = i2;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i = i6;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (yd0.qoPGr6Ce) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view4.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = xd0.qoPGr6Ce(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view4.draw(canvas);
                                                }
                                            }
                                            if (!z2) {
                                                viewGroup.getOverlay().remove(view4);
                                                viewGroup2.addView(view4, i3);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i5 = i2;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i5 = i2;
                                view3 = view2;
                            }
                        } else if (i6 == 4 || view4 == view5) {
                            z = false;
                            view = view5;
                            view5 = null;
                            if (z) {
                            }
                            i = i6;
                            c = 1;
                            i2 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i5 = i2;
                            view3 = view2;
                        }
                        z = true;
                        view5 = null;
                        view = null;
                        if (z) {
                        }
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view2 = view;
                        animator = null;
                        view6 = view5;
                        i5 = i2;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        eh0.NCTxEWno(view3, i2);
                        kh0 kh0Var2 = eh0.qoPGr6Ce;
                        kh0Var2.getClass();
                        ObjectAnimator aZz0PFXp = aZz0PFXp(view3, Xkz7p5xa(zd0Var, 1.0f), 0.0f);
                        if (aZz0PFXp == null) {
                            kh0Var2.Qr9iLBAD(view3, Xkz7p5xa(zd0Var2, 1.0f));
                        }
                        if (aZz0PFXp == null) {
                            eh0.NCTxEWno(view3, visibility);
                            return aZz0PFXp;
                        }
                        nh0 nh0Var = new nh0(view3, i);
                        aZz0PFXp.addListener(nh0Var);
                        sjUBp5pO().qoPGr6Ce(nh0Var);
                        return aZz0PFXp;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) zd0Var.qoPGr6Ce.get("android:visibility:screenLocation");
                        int i7 = iArr[i2];
                        int i8 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i7 - iArr2[i2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i8 - iArr2[c]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    kh0 kh0Var3 = eh0.qoPGr6Ce;
                    kh0Var3.getClass();
                    ObjectAnimator aZz0PFXp2 = aZz0PFXp(view6, Xkz7p5xa(zd0Var, 1.0f), 0.0f);
                    if (aZz0PFXp2 == null) {
                        kh0Var3.Qr9iLBAD(view6, Xkz7p5xa(zd0Var2, 1.0f));
                    }
                    if (i5 == 0) {
                        if (aZz0PFXp2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return aZz0PFXp2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        oh0 oh0Var = new oh0(this, viewGroup, view6, view4);
                        aZz0PFXp2.addListener(oh0Var);
                        aZz0PFXp2.addPauseListener(oh0Var);
                        sjUBp5pO().qoPGr6Ce(oh0Var);
                    }
                    return aZz0PFXp2;
                }
            } else if ((i4 & 1) == 1 && zd0Var2 != null) {
                View view8 = zd0Var2.NCTxEWno;
                if (zd0Var == null) {
                    View view9 = (View) view8.getParent();
                }
                eh0.qoPGr6Ce.getClass();
                return aZz0PFXp(view8, Xkz7p5xa(zd0Var, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // defpackage.rd0
    public final void wxUZMvaN(zd0 zd0Var) {
        VhgXwMj9(zd0Var);
    }
}
