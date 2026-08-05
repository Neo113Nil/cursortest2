package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class hi implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final int MdtA4re8;
    public final float NCTxEWno;
    public gi P7K7Inc8;
    public boolean Qr9iLBAD;
    public final View VgvYg0wo;
    public gi b2ZJblxo;
    public final int[] eVhOlqcC = new int[2];
    public int jb9XjC4I;
    public final int wxUZMvaN;

    public hi(View view) {
        this.VgvYg0wo = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.NCTxEWno = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.MdtA4re8 = tapTimeout;
        this.wxUZMvaN = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public abstract boolean MdtA4re8();

    public abstract o70 NCTxEWno();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        fe jb9XjC4I;
        boolean z2 = this.Qr9iLBAD;
        View view2 = this.VgvYg0wo;
        if (z2) {
            o70 NCTxEWno = NCTxEWno();
            if (NCTxEWno != null && NCTxEWno.NCTxEWno() && (jb9XjC4I = NCTxEWno.jb9XjC4I()) != null && jb9XjC4I.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.eVhOlqcC;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                jb9XjC4I.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean NCTxEWno2 = jb9XjC4I.NCTxEWno(obtainNoHistory, this.jb9XjC4I);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (NCTxEWno2) {
                }
            }
            if (wxUZMvaN()) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.jb9XjC4I);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.NCTxEWno;
                                float f2 = -f;
                                if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                                    qoPGr6Ce();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (MdtA4re8()) {
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
                    qoPGr6Ce();
                } else {
                    this.jb9XjC4I = motionEvent.getPointerId(0);
                    gi giVar = this.P7K7Inc8;
                    if (giVar == null) {
                        giVar = new gi(this, 0);
                        this.P7K7Inc8 = giVar;
                    }
                    view2.postDelayed(giVar, this.MdtA4re8);
                    gi giVar2 = this.b2ZJblxo;
                    if (giVar2 == null) {
                        giVar2 = new gi(this, 1);
                        this.b2ZJblxo = giVar2;
                    }
                    view2.postDelayed(giVar2, this.wxUZMvaN);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.Qr9iLBAD = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.Qr9iLBAD = false;
        this.jb9XjC4I = -1;
        gi giVar = this.P7K7Inc8;
        if (giVar != null) {
            this.VgvYg0wo.removeCallbacks(giVar);
        }
    }

    public final void qoPGr6Ce() {
        gi giVar = this.b2ZJblxo;
        View view = this.VgvYg0wo;
        if (giVar != null) {
            view.removeCallbacks(giVar);
        }
        gi giVar2 = this.P7K7Inc8;
        if (giVar2 != null) {
            view.removeCallbacks(giVar2);
        }
    }

    public boolean wxUZMvaN() {
        o70 NCTxEWno = NCTxEWno();
        if (NCTxEWno == null || !NCTxEWno.NCTxEWno()) {
            return true;
        }
        NCTxEWno.dismiss();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
