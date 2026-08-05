package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i1 implements Runnable {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ i1(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CTE3lpUp cTE3lpUp;
        int i = this.NCTxEWno;
        Object obj = this.MdtA4re8;
        switch (i) {
            case 0:
                yp ypVar = (yp) obj;
                fe feVar = ypVar.wxUZMvaN;
                h1 h1Var = ypVar.NCTxEWno;
                if (ypVar.lDXGDhIF) {
                    if (ypVar.OnDfzHZD) {
                        ypVar.OnDfzHZD = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        h1Var.VgvYg0wo = currentAnimationTimeMillis;
                        h1Var.b2ZJblxo = -1L;
                        h1Var.P7K7Inc8 = currentAnimationTimeMillis;
                        h1Var.Qr9iLBAD = 0.5f;
                    }
                    if ((h1Var.b2ZJblxo > 0 && AnimationUtils.currentAnimationTimeMillis() > h1Var.b2ZJblxo + h1Var.jb9XjC4I) || !ypVar.VgvYg0wo()) {
                        ypVar.lDXGDhIF = false;
                        return;
                    }
                    if (ypVar.ygLcUYwZ) {
                        ypVar.ygLcUYwZ = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        feVar.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (h1Var.P7K7Inc8 == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float qoPGr6Ce = h1Var.qoPGr6Ce(currentAnimationTimeMillis2);
                    long j = currentAnimationTimeMillis2 - h1Var.P7K7Inc8;
                    h1Var.P7K7Inc8 = currentAnimationTimeMillis2;
                    ypVar.OxcuoDLp.scrollListBy((int) (j * ((qoPGr6Ce * 4.0f) + ((-4.0f) * qoPGr6Ce * qoPGr6Ce)) * h1Var.wxUZMvaN));
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    feVar.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((tg0) obj).MdtA4re8;
                int i2 = bottomSheetBehavior.WYNAV5pd;
                if (i2 != 2 || i2 == 0) {
                    return;
                }
                bottomSheetBehavior.WYNAV5pd = 0;
                return;
            case 2:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 3:
                nc ncVar = (nc) obj;
                ncVar.VGmz0ccI.onDismiss(ncVar.QT4Tf9Dt);
                return;
            case 4:
                fe feVar2 = (fe) obj;
                feVar2.OnDfzHZD = null;
                feVar2.drawableStateChanged();
                return;
            case 5:
                ug ugVar = (ug) obj;
                ValueAnimator valueAnimator = ugVar.DK9slbsy;
                int i3 = ugVar.lwWCatUu;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                    return;
                }
                ugVar.lwWCatUu = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 6:
                li liVar = (li) obj;
                if (liVar.VhgXwMj9 != null) {
                    liVar.Qr9iLBAD();
                    return;
                }
                return;
            case 7:
                ((ej) obj).gjV1z5T1(true);
                return;
            case 8:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.b2ZJblxo) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.b2ZJblxo = false;
                    return;
                }
                return;
            case 9:
                ((StaggeredGridLayoutManager) obj).d3vfVszL();
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) obj).NCTxEWno;
                if (actionMenuView == null || (cTE3lpUp = actionMenuView.I5GHvsYW) == null) {
                    return;
                }
                cTE3lpUp.ygLcUYwZ();
                return;
        }
    }
}
