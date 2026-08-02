package defpackage;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.music.screen.landing.ui.view.HomeLandingBottomSheetBehavior;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.internal.ui.base.e;

/* loaded from: classes3.dex */
public final class bf3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bf3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static boolean a(View view, float f, float f2, int i) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (f >= childAt.getLeft() && f < childAt.getRight() && f2 >= childAt.getTop() && f2 < childAt.getBottom() && a(childAt, f - childAt.getLeft(), f2 - childAt.getTop(), i)) {
                    return true;
                }
            }
        }
        return view.canScrollHorizontally(i);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                cf3 cf3Var = (cf3) this.b;
                BottomSheetBehavior bottomSheetBehavior = cf3Var.b;
                if (bottomSheetBehavior != null && bottomSheetBehavior.isHideable()) {
                    cf3Var.b.setState(5);
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return ((cf3) this.b).isClickable();
            case 1:
            case 6:
            default:
                return super.onDown(motionEvent);
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                motionEvent.getClass();
                ((HomeLandingBottomSheetBehavior) this.b).isFirstScroll = true;
                return true;
            case 5:
                motionEvent.getClass();
                return true;
            case 7:
                motionEvent.getClass();
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        a1e slideDownCallback;
        switch (this.a) {
            case 4:
                motionEvent2.getClass();
                if (motionEvent == null || motionEvent.getY() - motionEvent2.getY() >= 0.0f || (slideDownCallback = ((HomeLandingBottomSheetBehavior) this.b).getSlideDownCallback()) == null) {
                    return false;
                }
                s2e s2eVar = (s2e) ((cib) slideDownCallback).b;
                s2eVar.l(4);
                s2eVar.g().i((int) (-f2));
                return true;
            case 5:
                x03 x03Var = (x03) this.b;
                motionEvent2.getClass();
                boolean z = false;
                if (motionEvent != null) {
                    try {
                        float y = motionEvent2.getY() - motionEvent.getY();
                        float x = motionEvent2.getX() - motionEvent.getX();
                        if (Math.abs(x) > Math.abs(y)) {
                            if (Math.abs(x) > 50.0f) {
                                Math.abs(f);
                            }
                        } else if (Math.abs(y) > 50.0f && Math.abs(f2) > 50.0f && y <= 0.0f) {
                            x03Var.a();
                            z = true;
                        }
                    } catch (Exception e) {
                        Log.e("Error", String.valueOf(e.getMessage()));
                    }
                }
                return z;
            case 6:
                return false;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                oc9 oc9Var = (oc9) obj;
                if (!oc9Var.isLongClickable()) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    int i2 = oc9.n;
                    if (!oc9Var.c(oc9Var, (int) x, (int) y, nc9.a)) {
                        bg3.V(oc9Var);
                        break;
                    }
                } else {
                    oc9Var.performLongClick();
                    break;
                }
                break;
            case 6:
                trk trkVar = (trk) obj;
                View.OnLongClickListener onLongClickListener = trkVar.q;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(trkVar.h);
                    break;
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        a1e slideDownCallback;
        switch (this.a) {
            case 3:
                mm9 mm9Var = (mm9) this.b;
                View childAt = mm9Var.getChildCount() > 0 ? mm9Var.getChildAt(0) : null;
                if (childAt != null && motionEvent != null) {
                    int signum = (int) Math.signum(f);
                    if (childAt.getTranslationX() == 0.0f) {
                        if (Math.abs(f) > Math.abs(f2) * 2 && a(childAt, motionEvent.getX(), motionEvent.getY(), signum)) {
                        }
                    }
                    childAt.setTranslationX(hyf.x(childAt.getTranslationX() - f, -childAt.getWidth(), childAt.getWidth()));
                    break;
                }
                break;
            case 4:
                motionEvent2.getClass();
                HomeLandingBottomSheetBehavior homeLandingBottomSheetBehavior = (HomeLandingBottomSheetBehavior) this.b;
                z = homeLandingBottomSheetBehavior.isFirstScroll;
                if (!z) {
                    if (motionEvent != null && motionEvent.getY() - motionEvent2.getY() < 0.0f && (slideDownCallback = homeLandingBottomSheetBehavior.getSlideDownCallback()) != null) {
                        s2e s2eVar = (s2e) ((cib) slideDownCallback).b;
                        s2eVar.l(4);
                        s2eVar.g().scrollBy(0, (int) f2);
                        break;
                    }
                } else {
                    homeLandingBottomSheetBehavior.isFirstScroll = false;
                    break;
                }
                break;
            case 7:
                e eVar = (e) this.b;
                motionEvent2.getClass();
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "onScroll: " + f2, 8);
                }
                if (f2 <= 30.0f) {
                    break;
                } else {
                    eVar.p();
                    eVar.l().setOnTouchListener(null);
                    break;
                }
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                cf3 cf3Var = (cf3) this.b;
                int i = cf3.j;
                return cf3Var.c();
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, android.view.ViewGroup, oc9] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                gc8 gc8Var = (gc8) obj;
                bg3.s(gc8Var, gc8Var.getInputFocusTracker$div_release());
                return true;
            case 2:
                ?? r1 = (oc9) obj;
                if (r1.isClickable()) {
                    return r1.performClick();
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int i2 = oc9.n;
                if (!r1.c(r1, (int) x, (int) y, mc9.a)) {
                    do {
                        ViewParent parent = r1.getParent();
                        r1 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (r1 != 0 && r1.getParent() != null) {
                        }
                    } while (!r1.performClick());
                    return true;
                }
                return false;
            case 7:
                motionEvent.getClass();
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
