package kotlin.text;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishCameraXHandler {
    public static final CatchingFishMVIEspresso CatchingFishDaggerHiltFAB = new CatchingFishMVIEspresso(1);
    public boolean CatchingFish;
    public final int CatchingFishAnimationMockk;
    public int CatchingFishCloudMessaging;
    public int CatchingFishCoroutine = -1;
    public final CatchingFishGsonRealm CatchingFishCoroutineFlow = new CatchingFishGsonRealm(19, this);
    public float[] CatchingFishDaggerWebsocket;
    public VelocityTracker CatchingFishEspressoTesting;
    public int[] CatchingFishFragmentHandler;
    public final CoordinatorLayout CatchingFishJetpackCompose;
    public int[] CatchingFishLayout;
    public View CatchingFishNavigation;
    public final float CatchingFishOkHttp;
    public int CatchingFishParcelableFAB;
    public float[] CatchingFishReduxKtor;
    public final CatchingFishDaggerBiometric CatchingFishRoomDatabase;
    public final int CatchingFishSnackbar;
    public final OverScroller CatchingFishStateLiveData;
    public final float CatchingFishUnitTesting;
    public int[] CatchingFishViewModelFAB;
    public float[] CatchingFishViewModelScope;
    public float[] CatchingFishWorkManager;

    public CatchingFishCameraXHandler(Context context, CoordinatorLayout coordinatorLayout, CatchingFishDaggerBiometric catchingFishDaggerBiometric) {
        if (catchingFishDaggerBiometric == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.CatchingFishJetpackCompose = coordinatorLayout;
        this.CatchingFishRoomDatabase = catchingFishDaggerBiometric;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.CatchingFishAnimationMockk = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.CatchingFishSnackbar = viewConfiguration.getScaledTouchSlop();
        this.CatchingFishOkHttp = viewConfiguration.getScaledMaximumFlingVelocity();
        this.CatchingFishUnitTesting = viewConfiguration.getScaledMinimumFlingVelocity();
        this.CatchingFishStateLiveData = new OverScroller(context, CatchingFishDaggerHiltFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
    
        if (r12 != r11) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishAnimationMockk(MotionEvent motionEvent) {
        View CatchingFishViewModelScope;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            CatchingFishParcelableFAB();
        }
        if (this.CatchingFishEspressoTesting == null) {
            this.CatchingFishEspressoTesting = VelocityTracker.obtain();
        }
        this.CatchingFishEspressoTesting.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            CatchingFishCloudMessaging(x, y, pointerId);
                            int i = this.CatchingFishParcelableFAB;
                            if (i == 0) {
                                int i2 = this.CatchingFishViewModelFAB[pointerId];
                            } else if (i == 2 && (CatchingFishViewModelScope = CatchingFishViewModelScope((int) x, (int) y)) == this.CatchingFishNavigation) {
                                CatchingFishStateLiveData(CatchingFishViewModelScope, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            CatchingFishReduxKtor(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.CatchingFishReduxKtor != null && this.CatchingFishDaggerWebsocket != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if ((this.CatchingFishCloudMessaging & (1 << pointerId2)) != 0) {
                            float x2 = motionEvent.getX(i3);
                            float y2 = motionEvent.getY(i3);
                            float f = x2 - this.CatchingFishReduxKtor[pointerId2];
                            float f2 = y2 - this.CatchingFishDaggerWebsocket[pointerId2];
                            View CatchingFishViewModelScope2 = CatchingFishViewModelScope((int) x2, (int) y2);
                            boolean z = CatchingFishViewModelScope2 != null && CatchingFishCoroutine(CatchingFishViewModelScope2, f, f2);
                            if (z) {
                                int left = CatchingFishViewModelScope2.getLeft();
                                CatchingFishDaggerBiometric catchingFishDaggerBiometric = this.CatchingFishRoomDatabase;
                                int CatchingFishWorkManager = catchingFishDaggerBiometric.CatchingFishWorkManager(CatchingFishViewModelScope2, ((int) f) + left);
                                int top = CatchingFishViewModelScope2.getTop();
                                int CatchingFishViewModelScope3 = catchingFishDaggerBiometric.CatchingFishViewModelScope(CatchingFishViewModelScope2, ((int) f2) + top);
                                int CatchingFishSpannableWidget = catchingFishDaggerBiometric.CatchingFishSpannableWidget(CatchingFishViewModelScope2);
                                int CatchingFishParcelableFlux = catchingFishDaggerBiometric.CatchingFishParcelableFlux();
                                if (CatchingFishSpannableWidget != 0) {
                                    if (CatchingFishSpannableWidget > 0) {
                                    }
                                }
                                if (CatchingFishParcelableFlux == 0) {
                                    break;
                                }
                                if (CatchingFishParcelableFlux > 0 && CatchingFishViewModelScope3 == top) {
                                    break;
                                }
                            }
                            Math.abs(f);
                            Math.abs(f2);
                            int i4 = this.CatchingFishViewModelFAB[pointerId2];
                            Math.abs(f2);
                            Math.abs(f);
                            int i5 = this.CatchingFishViewModelFAB[pointerId2];
                            Math.abs(f);
                            Math.abs(f2);
                            int i6 = this.CatchingFishViewModelFAB[pointerId2];
                            Math.abs(f2);
                            Math.abs(f);
                            int i7 = this.CatchingFishViewModelFAB[pointerId2];
                            if (this.CatchingFishParcelableFAB == 1) {
                                break;
                            }
                            if (z && CatchingFishStateLiveData(CatchingFishViewModelScope2, pointerId2)) {
                                break;
                            }
                        }
                    }
                    CatchingFishEspressoTesting(motionEvent);
                }
            }
            CatchingFishParcelableFAB();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            CatchingFishCloudMessaging(x3, y3, pointerId3);
            View CatchingFishViewModelScope4 = CatchingFishViewModelScope((int) x3, (int) y3);
            if (CatchingFishViewModelScope4 == this.CatchingFishNavigation && this.CatchingFishParcelableFAB == 2) {
                CatchingFishStateLiveData(CatchingFishViewModelScope4, pointerId3);
            }
            int i8 = this.CatchingFishViewModelFAB[pointerId3];
        }
        return this.CatchingFishParcelableFAB == 1;
    }

    public final void CatchingFishCloudMessaging(float f, float f2, int i) {
        float[] fArr = this.CatchingFishReduxKtor;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.CatchingFishDaggerWebsocket;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.CatchingFishWorkManager;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.CatchingFishViewModelScope;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.CatchingFishViewModelFAB;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.CatchingFishLayout;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.CatchingFishFragmentHandler;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.CatchingFishReduxKtor = fArr2;
            this.CatchingFishDaggerWebsocket = fArr3;
            this.CatchingFishWorkManager = fArr4;
            this.CatchingFishViewModelScope = fArr5;
            this.CatchingFishViewModelFAB = iArr;
            this.CatchingFishLayout = iArr2;
            this.CatchingFishFragmentHandler = iArr3;
        }
        float[] fArr9 = this.CatchingFishReduxKtor;
        this.CatchingFishWorkManager[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.CatchingFishDaggerWebsocket;
        this.CatchingFishViewModelScope[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.CatchingFishViewModelFAB;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.CatchingFishJetpackCompose;
        int left = coordinatorLayout.getLeft();
        int i5 = this.CatchingFishAnimationMockk;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.CatchingFishCloudMessaging |= 1 << i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishCoroutine(View view, float f, float f2) {
        if (view != null) {
            CatchingFishDaggerBiometric catchingFishDaggerBiometric = this.CatchingFishRoomDatabase;
            boolean z = catchingFishDaggerBiometric.CatchingFishSpannableWidget(view) > 0;
            boolean z2 = catchingFishDaggerBiometric.CatchingFishParcelableFlux() > 0;
            if (z && z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.CatchingFishSnackbar;
                if (f3 > i * i) {
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.CatchingFishSnackbar) : Math.abs(f) > this.CatchingFishSnackbar) {
                return true;
            }
        }
        return false;
    }

    public final int CatchingFishDaggerWebsocket(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.CatchingFishJetpackCompose.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final void CatchingFishEspressoTesting(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.CatchingFishCloudMessaging & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.CatchingFishWorkManager[pointerId] = x;
                this.CatchingFishViewModelScope[pointerId] = y;
            }
        }
    }

    public final void CatchingFishFragmentHandler() {
        VelocityTracker velocityTracker = this.CatchingFishEspressoTesting;
        float f = this.CatchingFishOkHttp;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.CatchingFishEspressoTesting.getXVelocity(this.CatchingFishCoroutine);
        float abs = Math.abs(xVelocity);
        float f2 = this.CatchingFishUnitTesting;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.CatchingFishEspressoTesting.getYVelocity(this.CatchingFishCoroutine);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f2) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.CatchingFish = true;
        this.CatchingFishRoomDatabase.CatchingFishEspressoMockk(this.CatchingFishNavigation, xVelocity, f);
        this.CatchingFish = false;
        if (this.CatchingFishParcelableFAB == 1) {
            CatchingFishOkHttp(0);
        }
    }

    public final void CatchingFishLayout(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            CatchingFishParcelableFAB();
        }
        if (this.CatchingFishEspressoTesting == null) {
            this.CatchingFishEspressoTesting = VelocityTracker.obtain();
        }
        this.CatchingFishEspressoTesting.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View CatchingFishViewModelScope = CatchingFishViewModelScope((int) x, (int) y);
            CatchingFishCloudMessaging(x, y, pointerId);
            CatchingFishStateLiveData(CatchingFishViewModelScope, pointerId);
            int i2 = this.CatchingFishViewModelFAB[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.CatchingFishParcelableFAB == 1) {
                CatchingFishFragmentHandler();
            }
            CatchingFishParcelableFAB();
            return;
        }
        CatchingFishDaggerBiometric catchingFishDaggerBiometric = this.CatchingFishRoomDatabase;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.CatchingFishParcelableFAB == 1) {
                    this.CatchingFish = true;
                    catchingFishDaggerBiometric.CatchingFishEspressoMockk(this.CatchingFishNavigation, 0.0f, 0.0f);
                    this.CatchingFish = false;
                    if (this.CatchingFishParcelableFAB == 1) {
                        CatchingFishOkHttp(0);
                    }
                }
                CatchingFishParcelableFAB();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                CatchingFishCloudMessaging(x2, y2, pointerId2);
                if (this.CatchingFishParcelableFAB == 0) {
                    CatchingFishStateLiveData(CatchingFishViewModelScope((int) x2, (int) y2), pointerId2);
                    int i3 = this.CatchingFishViewModelFAB[pointerId2];
                    return;
                }
                int i4 = (int) x2;
                int i5 = (int) y2;
                View view = this.CatchingFishNavigation;
                if (view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom()) {
                    r2 = 1;
                }
                if (r2 != 0) {
                    CatchingFishStateLiveData(this.CatchingFishNavigation, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.CatchingFishParcelableFAB == 1 && pointerId3 == this.CatchingFishCoroutine) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (r2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(r2);
                    if (pointerId4 != this.CatchingFishCoroutine) {
                        View CatchingFishViewModelScope2 = CatchingFishViewModelScope((int) motionEvent.getX(r2), (int) motionEvent.getY(r2));
                        View view2 = this.CatchingFishNavigation;
                        if (CatchingFishViewModelScope2 == view2 && CatchingFishStateLiveData(view2, pointerId4)) {
                            i = this.CatchingFishCoroutine;
                            break;
                        }
                    }
                    r2++;
                }
                if (i == -1) {
                    CatchingFishFragmentHandler();
                }
            }
            CatchingFishReduxKtor(pointerId3);
            return;
        }
        if (this.CatchingFishParcelableFAB == 1) {
            int i6 = this.CatchingFishCoroutine;
            if (((this.CatchingFishCloudMessaging & (1 << i6)) != 0 ? 1 : 0) == 0) {
                return;
            }
            int findPointerIndex = motionEvent.findPointerIndex(i6);
            float x3 = motionEvent.getX(findPointerIndex);
            float y3 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.CatchingFishWorkManager;
            int i7 = this.CatchingFishCoroutine;
            int i8 = (int) (x3 - fArr[i7]);
            int i9 = (int) (y3 - this.CatchingFishViewModelScope[i7]);
            int left = this.CatchingFishNavigation.getLeft() + i8;
            int top = this.CatchingFishNavigation.getTop() + i9;
            int left2 = this.CatchingFishNavigation.getLeft();
            int top2 = this.CatchingFishNavigation.getTop();
            if (i8 != 0) {
                left = catchingFishDaggerBiometric.CatchingFishWorkManager(this.CatchingFishNavigation, left);
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                this.CatchingFishNavigation.offsetLeftAndRight(left - left2);
            }
            if (i9 != 0) {
                top = catchingFishDaggerBiometric.CatchingFishViewModelScope(this.CatchingFishNavigation, top);
                WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                this.CatchingFishNavigation.offsetTopAndBottom(top - top2);
            }
            if (i8 != 0 || i9 != 0) {
                catchingFishDaggerBiometric.CatchingFishSensorManager(this.CatchingFishNavigation, left, top);
            }
            CatchingFishEspressoTesting(motionEvent);
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount2; i10++) {
            int pointerId5 = motionEvent.getPointerId(i10);
            if ((this.CatchingFishCloudMessaging & (1 << pointerId5)) != 0) {
                float x4 = motionEvent.getX(i10);
                float y4 = motionEvent.getY(i10);
                float f = x4 - this.CatchingFishReduxKtor[pointerId5];
                float f2 = y4 - this.CatchingFishDaggerWebsocket[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i11 = this.CatchingFishViewModelFAB[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i12 = this.CatchingFishViewModelFAB[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i13 = this.CatchingFishViewModelFAB[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i14 = this.CatchingFishViewModelFAB[pointerId5];
                if (this.CatchingFishParcelableFAB == 1) {
                    break;
                }
                View CatchingFishViewModelScope3 = CatchingFishViewModelScope((int) x4, (int) y4);
                if (CatchingFishCoroutine(CatchingFishViewModelScope3, f, f2) && CatchingFishStateLiveData(CatchingFishViewModelScope3, pointerId5)) {
                    break;
                }
            }
        }
        CatchingFishEspressoTesting(motionEvent);
    }

    public final void CatchingFishOkHttp(int i) {
        this.CatchingFishJetpackCompose.removeCallbacks(this.CatchingFishCoroutineFlow);
        if (this.CatchingFishParcelableFAB != i) {
            this.CatchingFishParcelableFAB = i;
            this.CatchingFishRoomDatabase.CatchingFishPayPalService(i);
            if (this.CatchingFishParcelableFAB == 0) {
                this.CatchingFishNavigation = null;
            }
        }
    }

    public final void CatchingFishParcelableFAB() {
        this.CatchingFishCoroutine = -1;
        float[] fArr = this.CatchingFishReduxKtor;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.CatchingFishDaggerWebsocket, 0.0f);
            Arrays.fill(this.CatchingFishWorkManager, 0.0f);
            Arrays.fill(this.CatchingFishViewModelScope, 0.0f);
            Arrays.fill(this.CatchingFishViewModelFAB, 0);
            Arrays.fill(this.CatchingFishLayout, 0);
            Arrays.fill(this.CatchingFishFragmentHandler, 0);
            this.CatchingFishCloudMessaging = 0;
        }
        VelocityTracker velocityTracker = this.CatchingFishEspressoTesting;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.CatchingFishEspressoTesting = null;
        }
    }

    public final void CatchingFishReduxKtor(int i) {
        float[] fArr = this.CatchingFishReduxKtor;
        if (fArr != null) {
            int i2 = this.CatchingFishCloudMessaging;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.CatchingFishDaggerWebsocket[i] = 0.0f;
                this.CatchingFishWorkManager[i] = 0.0f;
                this.CatchingFishViewModelScope[i] = 0.0f;
                this.CatchingFishViewModelFAB[i] = 0;
                this.CatchingFishLayout[i] = 0;
                this.CatchingFishFragmentHandler[i] = 0;
                this.CatchingFishCloudMessaging = (~i3) & i2;
            }
        }
    }

    public final void CatchingFishSnackbar(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.CatchingFishJetpackCompose;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.CatchingFishNavigation = view;
        this.CatchingFishCoroutine = i;
        this.CatchingFishRoomDatabase.CatchingFishJobScheduler(view, i);
        CatchingFishOkHttp(1);
    }

    public final boolean CatchingFishStateLiveData(View view, int i) {
        if (view == this.CatchingFishNavigation && this.CatchingFishCoroutine == i) {
            return true;
        }
        if (view == null || !this.CatchingFishRoomDatabase.CatchingFishParcelable(view, i)) {
            return false;
        }
        this.CatchingFishCoroutine = i;
        CatchingFishSnackbar(view, i);
        return true;
    }

    public final boolean CatchingFishUnitTesting(int i, int i2) {
        if (this.CatchingFish) {
            return CatchingFishViewModelFAB(i, i2, (int) this.CatchingFishEspressoTesting.getXVelocity(this.CatchingFishCoroutine), (int) this.CatchingFishEspressoTesting.getYVelocity(this.CatchingFishCoroutine));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean CatchingFishViewModelFAB(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.CatchingFishNavigation.getLeft();
        int top = this.CatchingFishNavigation.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.CatchingFishStateLiveData;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            CatchingFishOkHttp(0);
            return false;
        }
        View view = this.CatchingFishNavigation;
        int i7 = (int) this.CatchingFishUnitTesting;
        int i8 = (int) this.CatchingFishOkHttp;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i4 = 0;
        } else if (abs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i9 = abs5 + abs6;
        int i10 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i9;
        } else {
            f = abs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i9;
        } else {
            f3 = abs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        CatchingFishDaggerBiometric catchingFishDaggerBiometric = this.CatchingFishRoomDatabase;
        overScroller.startScroll(left, top, i5, i6, (int) ((CatchingFishDaggerWebsocket(i6, i4, catchingFishDaggerBiometric.CatchingFishParcelableFlux()) * f6) + (CatchingFishDaggerWebsocket(i5, i3, catchingFishDaggerBiometric.CatchingFishSpannableWidget(view)) * f5)));
        CatchingFishOkHttp(2);
        return true;
    }

    public final View CatchingFishViewModelScope(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.CatchingFishJetpackCompose;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.CatchingFishRoomDatabase.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean CatchingFishWorkManager() {
        if (this.CatchingFishParcelableFAB == 2) {
            OverScroller overScroller = this.CatchingFishStateLiveData;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.CatchingFishNavigation.getLeft();
            int top = currY - this.CatchingFishNavigation.getTop();
            if (left != 0) {
                View view = this.CatchingFishNavigation;
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.CatchingFishNavigation;
                WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.CatchingFishRoomDatabase.CatchingFishSensorManager(this.CatchingFishNavigation, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.CatchingFishJetpackCompose.post(this.CatchingFishCoroutineFlow);
            }
        }
        return this.CatchingFishParcelableFAB == 2;
    }
}
