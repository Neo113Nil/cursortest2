package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishPicassoJUnit {
    public Object CatchingFishCoroutine;
    public Object CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB;
    public Object CatchingFishReduxKtor;
    public Object CatchingFishSnackbar;
    public Object CatchingFishWorkManager;

    public CatchingFishPicassoJUnit(View view) {
        this.CatchingFishParcelableFAB = -1;
        this.CatchingFishSnackbar = view;
        this.CatchingFishCoroutine = CatchingFishPicassoMVPJUnit.CatchingFishParcelableFAB();
    }

    public PorterDuff.Mode CatchingFishCoroutine() {
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) this.CatchingFishDaggerWebsocket;
        if (catchingFishFABDaggerHilt != null) {
            return (PorterDuff.Mode) catchingFishFABDaggerHilt.CatchingFishReduxKtor;
        }
        return null;
    }

    public void CatchingFishDaggerWebsocket() {
        this.CatchingFishParcelableFAB = -1;
        CatchingFishViewModelScope(null);
        CatchingFishParcelableFAB();
    }

    public void CatchingFishLayout(PorterDuff.Mode mode) {
        if (((CatchingFishFABDaggerHilt) this.CatchingFishDaggerWebsocket) == null) {
            this.CatchingFishDaggerWebsocket = new CatchingFishFABDaggerHilt();
        }
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) this.CatchingFishDaggerWebsocket;
        catchingFishFABDaggerHilt.CatchingFishReduxKtor = mode;
        catchingFishFABDaggerHilt.CatchingFishParcelableFAB = true;
        CatchingFishParcelableFAB();
    }

    public void CatchingFishParcelableFAB() {
        View view = (View) this.CatchingFishSnackbar;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((CatchingFishFABDaggerHilt) this.CatchingFishReduxKtor) != null) {
                if (((CatchingFishFABDaggerHilt) this.CatchingFishWorkManager) == null) {
                    this.CatchingFishWorkManager = new CatchingFishFABDaggerHilt();
                }
                CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) this.CatchingFishWorkManager;
                catchingFishFABDaggerHilt.CatchingFishCoroutine = null;
                catchingFishFABDaggerHilt.CatchingFishSnackbar = false;
                catchingFishFABDaggerHilt.CatchingFishReduxKtor = null;
                catchingFishFABDaggerHilt.CatchingFishParcelableFAB = false;
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    catchingFishFABDaggerHilt.CatchingFishSnackbar = true;
                    catchingFishFABDaggerHilt.CatchingFishCoroutine = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    catchingFishFABDaggerHilt.CatchingFishParcelableFAB = true;
                    catchingFishFABDaggerHilt.CatchingFishReduxKtor = backgroundTintMode;
                }
                if (catchingFishFABDaggerHilt.CatchingFishSnackbar || catchingFishFABDaggerHilt.CatchingFishParcelableFAB) {
                    CatchingFishPicassoMVPJUnit.CatchingFishDaggerWebsocket(background, catchingFishFABDaggerHilt, view.getDrawableState());
                    return;
                }
            }
            CatchingFishFABDaggerHilt catchingFishFABDaggerHilt2 = (CatchingFishFABDaggerHilt) this.CatchingFishDaggerWebsocket;
            if (catchingFishFABDaggerHilt2 != null) {
                CatchingFishPicassoMVPJUnit.CatchingFishDaggerWebsocket(background, catchingFishFABDaggerHilt2, view.getDrawableState());
                return;
            }
            CatchingFishFABDaggerHilt catchingFishFABDaggerHilt3 = (CatchingFishFABDaggerHilt) this.CatchingFishReduxKtor;
            if (catchingFishFABDaggerHilt3 != null) {
                CatchingFishPicassoMVPJUnit.CatchingFishDaggerWebsocket(background, catchingFishFABDaggerHilt3, view.getDrawableState());
            }
        }
    }

    public void CatchingFishReduxKtor(AttributeSet attributeSet, int i) {
        ColorStateList CatchingFishWorkManager;
        View view = (View) this.CatchingFishSnackbar;
        Context context = view.getContext();
        int[] iArr = CatchingFishWidgetGlide.CatchingFishGsonAppCompat;
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        View view2 = (View) this.CatchingFishSnackbar;
        CatchingFishFABCameraX.CatchingFishEspressoTesting(view2, view2.getContext(), iArr, attributeSet, (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket, i);
        try {
            if (typedArray.hasValue(0)) {
                this.CatchingFishParcelableFAB = typedArray.getResourceId(0, -1);
                CatchingFishPicassoMVPJUnit catchingFishPicassoMVPJUnit = (CatchingFishPicassoMVPJUnit) this.CatchingFishCoroutine;
                Context context2 = view.getContext();
                int i2 = this.CatchingFishParcelableFAB;
                synchronized (catchingFishPicassoMVPJUnit) {
                    CatchingFishWorkManager = catchingFishPicassoMVPJUnit.CatchingFishParcelableFAB.CatchingFishWorkManager(context2, i2);
                }
                if (CatchingFishWorkManager != null) {
                    CatchingFishViewModelScope(CatchingFishWorkManager);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(CatchingFishRecyclerView.CatchingFishFragmentFactory(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(CatchingFishRealmPicasso.CatchingFishSnackbar(typedArray.getInt(2, -1), null));
            }
            CatchingFishRecyclerView.CatchingFishAnimation();
        } catch (Throwable th) {
            CatchingFishRecyclerView.CatchingFishAnimation();
            throw th;
        }
    }

    public ColorStateList CatchingFishSnackbar() {
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) this.CatchingFishDaggerWebsocket;
        if (catchingFishFABDaggerHilt != null) {
            return (ColorStateList) catchingFishFABDaggerHilt.CatchingFishCoroutine;
        }
        return null;
    }

    public void CatchingFishViewModelFAB(ColorStateList colorStateList) {
        if (((CatchingFishFABDaggerHilt) this.CatchingFishDaggerWebsocket) == null) {
            this.CatchingFishDaggerWebsocket = new CatchingFishFABDaggerHilt();
        }
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) this.CatchingFishDaggerWebsocket;
        catchingFishFABDaggerHilt.CatchingFishCoroutine = colorStateList;
        catchingFishFABDaggerHilt.CatchingFishSnackbar = true;
        CatchingFishParcelableFAB();
    }

    public void CatchingFishViewModelScope(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((CatchingFishFABDaggerHilt) this.CatchingFishReduxKtor) == null) {
                this.CatchingFishReduxKtor = new CatchingFishFABDaggerHilt();
            }
            CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) this.CatchingFishReduxKtor;
            catchingFishFABDaggerHilt.CatchingFishCoroutine = colorStateList;
            catchingFishFABDaggerHilt.CatchingFishSnackbar = true;
        } else {
            this.CatchingFishReduxKtor = null;
        }
        CatchingFishParcelableFAB();
    }

    public void CatchingFishWorkManager(int i) {
        ColorStateList colorStateList;
        this.CatchingFishParcelableFAB = i;
        CatchingFishPicassoMVPJUnit catchingFishPicassoMVPJUnit = (CatchingFishPicassoMVPJUnit) this.CatchingFishCoroutine;
        if (catchingFishPicassoMVPJUnit != null) {
            Context context = ((View) this.CatchingFishSnackbar).getContext();
            synchronized (catchingFishPicassoMVPJUnit) {
                colorStateList = catchingFishPicassoMVPJUnit.CatchingFishParcelableFAB.CatchingFishWorkManager(context, i);
            }
        } else {
            colorStateList = null;
        }
        CatchingFishViewModelScope(colorStateList);
        CatchingFishParcelableFAB();
    }

    public CatchingFishPicassoJUnit() {
        this.CatchingFishSnackbar = new CatchingFishFABAndroidX[32];
        this.CatchingFishCoroutine = new float[32];
        this.CatchingFishReduxKtor = new byte[32];
        int i = CatchingFishHiltCameraX.CatchingFishParcelableFAB;
        this.CatchingFishDaggerWebsocket = new CatchingFishServiceBundle();
        this.CatchingFishWorkManager = new CatchingFishServiceBundle();
    }
}
