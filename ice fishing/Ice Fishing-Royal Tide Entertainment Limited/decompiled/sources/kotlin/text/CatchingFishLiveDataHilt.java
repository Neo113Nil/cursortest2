package kotlin.text;

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
import com.catchingfish.fishcatcherpro.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataHilt extends CatchingFishMockkRedux {
    public static final String[] CatchingFishFragmentFactory = {"android:visibility:visibility", "android:visibility:parent"};
    public final int CatchingFishCustomView;

    public CatchingFishLiveDataHilt(int i) {
        this();
        this.CatchingFishCustomView = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatchingFishJUnitSnackbar CatchingFishCameraXIntent(CatchingFishDaggerJUnit catchingFishDaggerJUnit, CatchingFishDaggerJUnit catchingFishDaggerJUnit2) {
        CatchingFishJUnitSnackbar catchingFishJUnitSnackbar = new CatchingFishJUnitSnackbar();
        catchingFishJUnitSnackbar.CatchingFishParcelableFAB = false;
        catchingFishJUnitSnackbar.CatchingFishSnackbar = false;
        if (catchingFishDaggerJUnit != null) {
            HashMap hashMap = catchingFishDaggerJUnit.CatchingFishParcelableFAB;
            if (hashMap.containsKey("android:visibility:visibility")) {
                catchingFishJUnitSnackbar.CatchingFishCoroutine = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                catchingFishJUnitSnackbar.CatchingFishDaggerWebsocket = (ViewGroup) hashMap.get("android:visibility:parent");
                if (catchingFishDaggerJUnit2 != null) {
                    HashMap hashMap2 = catchingFishDaggerJUnit2.CatchingFishParcelableFAB;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        catchingFishJUnitSnackbar.CatchingFishReduxKtor = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        catchingFishJUnitSnackbar.CatchingFishWorkManager = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (catchingFishDaggerJUnit == null && catchingFishDaggerJUnit2 != null) {
                            int i = catchingFishJUnitSnackbar.CatchingFishCoroutine;
                            int i2 = catchingFishJUnitSnackbar.CatchingFishReduxKtor;
                            if (i != i2 || catchingFishJUnitSnackbar.CatchingFishDaggerWebsocket != catchingFishJUnitSnackbar.CatchingFishWorkManager) {
                                if (i != i2) {
                                    if (i == 0) {
                                        catchingFishJUnitSnackbar.CatchingFishSnackbar = false;
                                        catchingFishJUnitSnackbar.CatchingFishParcelableFAB = true;
                                        return catchingFishJUnitSnackbar;
                                    }
                                    if (i2 == 0) {
                                        catchingFishJUnitSnackbar.CatchingFishSnackbar = true;
                                        catchingFishJUnitSnackbar.CatchingFishParcelableFAB = true;
                                        return catchingFishJUnitSnackbar;
                                    }
                                } else {
                                    if (catchingFishJUnitSnackbar.CatchingFishWorkManager == null) {
                                        catchingFishJUnitSnackbar.CatchingFishSnackbar = false;
                                        catchingFishJUnitSnackbar.CatchingFishParcelableFAB = true;
                                        return catchingFishJUnitSnackbar;
                                    }
                                    if (catchingFishJUnitSnackbar.CatchingFishDaggerWebsocket == null) {
                                        catchingFishJUnitSnackbar.CatchingFishSnackbar = true;
                                        catchingFishJUnitSnackbar.CatchingFishParcelableFAB = true;
                                        return catchingFishJUnitSnackbar;
                                    }
                                }
                            }
                        } else {
                            if (catchingFishDaggerJUnit != null && catchingFishJUnitSnackbar.CatchingFishReduxKtor == 0) {
                                catchingFishJUnitSnackbar.CatchingFishSnackbar = true;
                                catchingFishJUnitSnackbar.CatchingFishParcelableFAB = true;
                                return catchingFishJUnitSnackbar;
                            }
                            if (catchingFishDaggerJUnit2 == null && catchingFishJUnitSnackbar.CatchingFishCoroutine == 0) {
                                catchingFishJUnitSnackbar.CatchingFishSnackbar = false;
                                catchingFishJUnitSnackbar.CatchingFishParcelableFAB = true;
                            }
                        }
                        return catchingFishJUnitSnackbar;
                    }
                }
                catchingFishJUnitSnackbar.CatchingFishReduxKtor = -1;
                catchingFishJUnitSnackbar.CatchingFishWorkManager = null;
                if (catchingFishDaggerJUnit == null) {
                }
                if (catchingFishDaggerJUnit != null) {
                }
                if (catchingFishDaggerJUnit2 == null) {
                    catchingFishJUnitSnackbar.CatchingFishSnackbar = false;
                    catchingFishJUnitSnackbar.CatchingFishParcelableFAB = true;
                }
                return catchingFishJUnitSnackbar;
            }
        }
        catchingFishJUnitSnackbar.CatchingFishCoroutine = -1;
        catchingFishJUnitSnackbar.CatchingFishDaggerWebsocket = null;
        if (catchingFishDaggerJUnit2 != null) {
        }
        catchingFishJUnitSnackbar.CatchingFishReduxKtor = -1;
        catchingFishJUnitSnackbar.CatchingFishWorkManager = null;
        if (catchingFishDaggerJUnit == null) {
        }
        if (catchingFishDaggerJUnit != null) {
        }
        if (catchingFishDaggerJUnit2 == null) {
        }
        return catchingFishJUnitSnackbar;
    }

    public static float CatchingFishDagger(CatchingFishDaggerJUnit catchingFishDaggerJUnit, float f) {
        Float f2;
        return (catchingFishDaggerJUnit == null || (f2 = (Float) catchingFishDaggerJUnit.CatchingFishParcelableFAB.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    public static void CatchingFishSensorManager(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        int visibility = catchingFishDaggerJUnit.CatchingFishSnackbar.getVisibility();
        HashMap hashMap = catchingFishDaggerJUnit.CatchingFishParcelableFAB;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = catchingFishDaggerJUnit.CatchingFishSnackbar;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final boolean CatchingFish(CatchingFishDaggerJUnit catchingFishDaggerJUnit, CatchingFishDaggerJUnit catchingFishDaggerJUnit2) {
        if (catchingFishDaggerJUnit == null && catchingFishDaggerJUnit2 == null) {
            return false;
        }
        if (catchingFishDaggerJUnit != null && catchingFishDaggerJUnit2 != null && catchingFishDaggerJUnit2.CatchingFishParcelableFAB.containsKey("android:visibility:visibility") != catchingFishDaggerJUnit.CatchingFishParcelableFAB.containsKey("android:visibility:visibility")) {
            return false;
        }
        CatchingFishJUnitSnackbar CatchingFishCameraXIntent = CatchingFishCameraXIntent(catchingFishDaggerJUnit, catchingFishDaggerJUnit2);
        if (CatchingFishCameraXIntent.CatchingFishParcelableFAB) {
            return CatchingFishCameraXIntent.CatchingFishCoroutine == 0 || CatchingFishCameraXIntent.CatchingFishReduxKtor == 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (CatchingFishCameraXIntent(CatchingFishUnitTesting(r3, false), CatchingFishNavigation(r3, false)).CatchingFishParcelableFAB != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    @Override // kotlin.text.CatchingFishMockkRedux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator CatchingFishCloudMessaging(ViewGroup viewGroup, CatchingFishDaggerJUnit catchingFishDaggerJUnit, CatchingFishDaggerJUnit catchingFishDaggerJUnit2) {
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
        CatchingFishJUnitSnackbar CatchingFishCameraXIntent = CatchingFishCameraXIntent(catchingFishDaggerJUnit, catchingFishDaggerJUnit2);
        if (CatchingFishCameraXIntent.CatchingFishParcelableFAB && (CatchingFishCameraXIntent.CatchingFishDaggerWebsocket != null || CatchingFishCameraXIntent.CatchingFishWorkManager != null)) {
            boolean z3 = CatchingFishCameraXIntent.CatchingFishSnackbar;
            int i4 = this.CatchingFishCustomView;
            int i5 = 1;
            if (!z3) {
                int i6 = CatchingFishCameraXIntent.CatchingFishReduxKtor;
                if ((i4 & 2) == 2 && catchingFishDaggerJUnit != null) {
                    View view4 = catchingFishDaggerJUnit.CatchingFishSnackbar;
                    View view5 = catchingFishDaggerJUnit2 != null ? catchingFishDaggerJUnit2.CatchingFishSnackbar : null;
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
                                        if (CatchingFishCameraXIntent(CatchingFishNavigation(view7, true), CatchingFishUnitTesting(view7, true)).CatchingFishParcelableFAB) {
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
                                            boolean z4 = CatchingFishViewBundle.CatchingFishParcelableFAB;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            CatchingFishGlideMockkToast catchingFishGlideMockkToast = CatchingFishMockkFragment.CatchingFishParcelableFAB;
                                            catchingFishGlideMockkToast.CatchingFishAnimation(view4, matrix);
                                            catchingFishGlideMockkToast.CatchingFishMVVMAppCompat(viewGroup, matrix);
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
                                            boolean z5 = viewGroup != null && viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z2 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i3 = 0;
                                            } else if (z5) {
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
                                                if (CatchingFishViewBundle.CatchingFishParcelableFAB) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view4.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = CatchingFishFluxJUnitFlux.CatchingFishParcelableFAB(picture);
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
                        CatchingFishMockkFragment.CatchingFishSnackbar(view3, i2);
                        CatchingFishGlideMockkToast catchingFishGlideMockkToast2 = CatchingFishMockkFragment.CatchingFishParcelableFAB;
                        catchingFishGlideMockkToast2.getClass();
                        ObjectAnimator CatchingFishEspressoMockk = CatchingFishEspressoMockk(view3, CatchingFishDagger(catchingFishDaggerJUnit, 1.0f), 0.0f);
                        if (CatchingFishEspressoMockk == null) {
                            catchingFishGlideMockkToast2.CatchingFishHandler(view3, CatchingFishDagger(catchingFishDaggerJUnit2, 1.0f));
                        }
                        if (CatchingFishEspressoMockk == null) {
                            CatchingFishMockkFragment.CatchingFishSnackbar(view3, visibility);
                            return CatchingFishEspressoMockk;
                        }
                        CatchingFishMVPLifecycle catchingFishMVPLifecycle = new CatchingFishMVPLifecycle(view3, i);
                        CatchingFishEspressoMockk.addListener(catchingFishMVPLifecycle);
                        CatchingFishAnimationMockk().CatchingFishParcelableFAB(catchingFishMVPLifecycle);
                        return CatchingFishEspressoMockk;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) catchingFishDaggerJUnit.CatchingFishParcelableFAB.get("android:visibility:screenLocation");
                        int i7 = iArr[i2];
                        int i8 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i7 - iArr2[i2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i8 - iArr2[c]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    CatchingFishGlideMockkToast catchingFishGlideMockkToast3 = CatchingFishMockkFragment.CatchingFishParcelableFAB;
                    catchingFishGlideMockkToast3.getClass();
                    ObjectAnimator CatchingFishEspressoMockk2 = CatchingFishEspressoMockk(view6, CatchingFishDagger(catchingFishDaggerJUnit, 1.0f), 0.0f);
                    if (CatchingFishEspressoMockk2 == null) {
                        catchingFishGlideMockkToast3.CatchingFishHandler(view6, CatchingFishDagger(catchingFishDaggerJUnit2, 1.0f));
                    }
                    if (i5 == 0) {
                        if (CatchingFishEspressoMockk2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return CatchingFishEspressoMockk2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        CatchingFishFluxRealm catchingFishFluxRealm = new CatchingFishFluxRealm(this, viewGroup, view6, view4);
                        CatchingFishEspressoMockk2.addListener(catchingFishFluxRealm);
                        CatchingFishEspressoMockk2.addPauseListener(catchingFishFluxRealm);
                        CatchingFishAnimationMockk().CatchingFishParcelableFAB(catchingFishFluxRealm);
                    }
                    return CatchingFishEspressoMockk2;
                }
            } else if ((i4 & 1) == 1 && catchingFishDaggerJUnit2 != null) {
                View view8 = catchingFishDaggerJUnit2.CatchingFishSnackbar;
                if (catchingFishDaggerJUnit == null) {
                    View view9 = (View) view8.getParent();
                }
                CatchingFishMockkFragment.CatchingFishParcelableFAB.getClass();
                return CatchingFishEspressoMockk(view8, CatchingFishDagger(catchingFishDaggerJUnit, 0.0f), 1.0f);
            }
        }
        return null;
    }

    public final ObjectAnimator CatchingFishEspressoMockk(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        CatchingFishMockkFragment.CatchingFishParcelableFAB.CatchingFishHandler(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, CatchingFishMockkFragment.CatchingFishSnackbar, f2);
        CatchingFishIntentRealm catchingFishIntentRealm = new CatchingFishIntentRealm(view);
        ofFloat.addListener(catchingFishIntentRealm);
        CatchingFishAnimationMockk().CatchingFishParcelableFAB(catchingFishIntentRealm);
        return ofFloat;
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishReduxKtor(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        CatchingFishSensorManager(catchingFishDaggerJUnit);
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final String[] CatchingFishRoomDatabase() {
        return CatchingFishFragmentFactory;
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishViewModelScope(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        CatchingFishSensorManager(catchingFishDaggerJUnit);
        View view = catchingFishDaggerJUnit.CatchingFishSnackbar;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(CatchingFishMockkFragment.CatchingFishParcelableFAB.CatchingFishDaggerHiltFAB(view)) : Float.valueOf(0.0f);
        }
        catchingFishDaggerJUnit.CatchingFishParcelableFAB.put("android:fade:transitionAlpha", f);
    }

    public CatchingFishLiveDataHilt() {
        this.CatchingFishCustomView = 3;
    }
}
