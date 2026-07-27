package kotlin.text;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class CatchingFishViewLayout implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int CatchingFishCloudMessaging;
    public final int CatchingFishDaggerWebsocket;
    public final int[] CatchingFishEspressoTesting = new int[2];
    public boolean CatchingFishFragmentHandler;
    public CatchingFishHiltParcelable CatchingFishLayout;
    public final float CatchingFishReduxKtor;
    public CatchingFishHiltParcelable CatchingFishViewModelFAB;
    public final View CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishViewLayout(View view) {
        this.CatchingFishViewModelScope = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.CatchingFishReduxKtor = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.CatchingFishDaggerWebsocket = tapTimeout;
        this.CatchingFishWorkManager = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public abstract boolean CatchingFishCoroutine();

    public final void CatchingFishParcelableFAB() {
        CatchingFishHiltParcelable catchingFishHiltParcelable = this.CatchingFishLayout;
        View view = this.CatchingFishViewModelScope;
        if (catchingFishHiltParcelable != null) {
            view.removeCallbacks(catchingFishHiltParcelable);
        }
        CatchingFishHiltParcelable catchingFishHiltParcelable2 = this.CatchingFishViewModelFAB;
        if (catchingFishHiltParcelable2 != null) {
            view.removeCallbacks(catchingFishHiltParcelable2);
        }
    }

    public boolean CatchingFishReduxKtor() {
        CatchingFishContextCameraX CatchingFishSnackbar = CatchingFishSnackbar();
        if (CatchingFishSnackbar == null || !CatchingFishSnackbar.CatchingFishParcelableFAB()) {
            return true;
        }
        CatchingFishSnackbar.dismiss();
        return true;
    }

    public abstract CatchingFishContextCameraX CatchingFishSnackbar();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        CatchingFishCameraXOkHttp CatchingFishViewModelScope;
        boolean z2 = this.CatchingFishFragmentHandler;
        View view2 = this.CatchingFishViewModelScope;
        if (z2) {
            CatchingFishContextCameraX CatchingFishSnackbar = CatchingFishSnackbar();
            if (CatchingFishSnackbar != null && CatchingFishSnackbar.CatchingFishParcelableFAB() && (CatchingFishViewModelScope = CatchingFishSnackbar.CatchingFishViewModelScope()) != null && CatchingFishViewModelScope.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.CatchingFishEspressoTesting;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                CatchingFishViewModelScope.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean CatchingFishSnackbar2 = CatchingFishViewModelScope.CatchingFishSnackbar(obtainNoHistory, this.CatchingFishCloudMessaging);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (CatchingFishSnackbar2) {
                }
            }
            if (CatchingFishReduxKtor()) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.CatchingFishCloudMessaging);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.CatchingFishReduxKtor;
                                float f2 = -f;
                                if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                                    CatchingFishParcelableFAB();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (CatchingFishCoroutine()) {
                                        z = true;
                                        if (z) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    CatchingFishParcelableFAB();
                } else {
                    this.CatchingFishCloudMessaging = motionEvent.getPointerId(0);
                    if (this.CatchingFishViewModelFAB == null) {
                        this.CatchingFishViewModelFAB = new CatchingFishHiltParcelable(this, 0);
                    }
                    view2.postDelayed(this.CatchingFishViewModelFAB, this.CatchingFishDaggerWebsocket);
                    if (this.CatchingFishLayout == null) {
                        this.CatchingFishLayout = new CatchingFishHiltParcelable(this, 1);
                    }
                    view2.postDelayed(this.CatchingFishLayout, this.CatchingFishWorkManager);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.CatchingFishFragmentHandler = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.CatchingFishFragmentHandler = false;
        this.CatchingFishCloudMessaging = -1;
        CatchingFishHiltParcelable catchingFishHiltParcelable = this.CatchingFishViewModelFAB;
        if (catchingFishHiltParcelable != null) {
            this.CatchingFishViewModelScope.removeCallbacks(catchingFishHiltParcelable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
