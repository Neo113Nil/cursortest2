package B0;

import O.K;
import Z.AbstractComponentCallbacksC0070s;
import Z.M;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.lumenpath.harispro.hrnavigator.MainActivity;
import com.lumenpath.harispro.hrnavigator.SplashActivity;
import java.util.WeakHashMap;
import k0.C0200n;
import m.C0264l;
import m.C0276r0;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53b;

    public /* synthetic */ j(int i, Object obj) {
        this.f52a = i;
        this.f53b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0264l c0264l;
        Object obj = this.f53b;
        switch (this.f52a) {
            case 0:
                k kVar = (k) obj;
                kVar.f56c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) kVar.e;
                U.e eVar = bottomSheetBehavior.f2377M;
                if (eVar != null && eVar.h()) {
                    kVar.a(kVar.f55b);
                    return;
                } else {
                    if (bottomSheetBehavior.f2376L == 2) {
                        bottomSheetBehavior.I(kVar.f55b);
                        return;
                    }
                    return;
                }
            case 1:
                R.d dVar = (R.d) obj;
                if (dVar.f1000o) {
                    boolean z2 = dVar.f998m;
                    R.a aVar = dVar.f989a;
                    if (z2) {
                        dVar.f998m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.f986g = -1L;
                        aVar.f985f = currentAnimationTimeMillis;
                        aVar.f987h = 0.5f;
                    }
                    if ((aVar.f986g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f986g + aVar.i) || !dVar.e()) {
                        dVar.f1000o = false;
                        return;
                    }
                    boolean z3 = dVar.f999n;
                    ListView listView = dVar.f991c;
                    if (z3) {
                        dVar.f999n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f2111C0, RecyclerView.f2111C0, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f985f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j = currentAnimationTimeMillis2 - aVar.f985f;
                    aVar.f985f = currentAnimationTimeMillis2;
                    dVar.f1002q.scrollListBy((int) (j * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f984d));
                    WeakHashMap weakHashMap = K.f747a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((U.e) obj).r(0);
                return;
            case 3:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f2619c.f1304g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 4:
                SplashActivity splashActivity = (SplashActivity) obj;
                splashActivity.startActivity(new Intent(splashActivity, (Class<?>) MainActivity.class));
                splashActivity.finish();
                return;
            case 5:
                DialogFragment dialogFragment = (DialogFragment) obj;
                dialogFragment.f1966Z.onDismiss(dialogFragment.f1974h0);
                return;
            case 6:
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = (AbstractComponentCallbacksC0070s) obj;
                if (abstractComponentCallbacksC0070s.f1587I != null) {
                    abstractComponentCallbacksC0070s.f().getClass();
                    return;
                }
                return;
            case 7:
                ((M) obj).x(true);
                return;
            case 8:
                ListView listView2 = ((ListFragment) obj).f1986Z;
                listView2.focusableViewAvailable(listView2);
                return;
            case 9:
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
            case 10:
                C0200n c0200n = (C0200n) obj;
                int i = c0200n.f3548A;
                ValueAnimator valueAnimator = c0200n.f3572z;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                c0200n.f3548A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), RecyclerView.f2111C0);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 11:
                ((StaggeredGridLayoutManager) obj).F0();
                return;
            case 12:
                C0276r0 c0276r0 = (C0276r0) obj;
                c0276r0.f4014l = null;
                c0276r0.drawableStateChanged();
                return;
            case 13:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f1844f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1844f = false;
                    return;
                }
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1862a;
                if (actionMenuView == null || (c0264l = actionMenuView.f1826t) == null) {
                    return;
                }
                c0264l.o();
                return;
        }
    }
}
