package kotlin.text;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class CatchingFishMVIUnitTesting {
    public boolean CatchingFish;
    public int CatchingFishAnimationMockk;
    public CatchingFishJUnitAdMobKtor CatchingFishCardViewRealm;
    public CharSequence CatchingFishCardViewView;
    public CharSequence CatchingFishCloudMessaging;
    public boolean CatchingFishCoroutineFlow;
    public int CatchingFishDaggerHiltFAB;
    public CharSequence CatchingFishEspressoTesting;
    public final /* synthetic */ CatchingFishPicassoCardView CatchingFishFragmentFactory;
    public int CatchingFishFragmentHandler;
    public String CatchingFishGsonAppCompat;
    public boolean CatchingFishJetpackCompose;
    public int CatchingFishLayout;
    public int CatchingFishNavigation;
    public int CatchingFishOkHttp;
    public final Menu CatchingFishParcelableFAB;
    public String CatchingFishParcelableFlux;
    public CharSequence CatchingFishPayPal;
    public int CatchingFishRoomDatabase;
    public int CatchingFishSpannableWidget;
    public char CatchingFishStateLiveData;
    public char CatchingFishUnitTesting;
    public boolean CatchingFishViewModelFAB;
    public ColorStateList CatchingFishMVPRobolectric = null;
    public PorterDuff.Mode CatchingFishCustomView = null;
    public int CatchingFishSnackbar = 0;
    public int CatchingFishCoroutine = 0;
    public int CatchingFishReduxKtor = 0;
    public int CatchingFishDaggerWebsocket = 0;
    public boolean CatchingFishWorkManager = true;
    public boolean CatchingFishViewModelScope = true;

    public CatchingFishMVIUnitTesting(CatchingFishPicassoCardView catchingFishPicassoCardView, Menu menu) {
        this.CatchingFishFragmentFactory = catchingFishPicassoCardView;
        this.CatchingFishParcelableFAB = menu;
    }

    public final Object CatchingFishParcelableFAB(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.CatchingFishFragmentFactory.CatchingFishCoroutine.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void CatchingFishSnackbar(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.CatchingFish).setVisible(this.CatchingFishJetpackCompose).setEnabled(this.CatchingFishCoroutineFlow).setCheckable(this.CatchingFishNavigation >= 1).setTitleCondensed(this.CatchingFishEspressoTesting).setIcon(this.CatchingFishOkHttp);
        int i = this.CatchingFishDaggerHiltFAB;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.CatchingFishGsonAppCompat;
        CatchingFishPicassoCardView catchingFishPicassoCardView = this.CatchingFishFragmentFactory;
        if (str != null) {
            if (catchingFishPicassoCardView.CatchingFishCoroutine.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (catchingFishPicassoCardView.CatchingFishReduxKtor == null) {
                catchingFishPicassoCardView.CatchingFishReduxKtor = CatchingFishPicassoCardView.CatchingFishParcelableFAB(catchingFishPicassoCardView.CatchingFishCoroutine);
            }
            Object obj = catchingFishPicassoCardView.CatchingFishReduxKtor;
            String str2 = this.CatchingFishGsonAppCompat;
            CatchingFishGlideLifecycle catchingFishGlideLifecycle = new CatchingFishGlideLifecycle();
            catchingFishGlideLifecycle.CatchingFishSnackbar = obj;
            Class<?> cls = obj.getClass();
            try {
                catchingFishGlideLifecycle.CatchingFishCoroutine = cls.getMethod(str2, CatchingFishGlideLifecycle.CatchingFishReduxKtor);
                menuItem.setOnMenuItemClickListener(catchingFishGlideLifecycle);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.CatchingFishNavigation >= 2) {
            if (menuItem instanceof CatchingFishKtorAdMob) {
                CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) menuItem;
                catchingFishKtorAdMob.CatchingFishParcelableFlux = (catchingFishKtorAdMob.CatchingFishParcelableFlux & (-5)) | 4;
            } else if (menuItem instanceof CatchingFishFABHilt) {
                CatchingFishFABHilt catchingFishFABHilt = (CatchingFishFABHilt) menuItem;
                CatchingFishGlideSpannable catchingFishGlideSpannable = catchingFishFABHilt.CatchingFishCoroutine;
                try {
                    if (catchingFishFABHilt.CatchingFishReduxKtor == null) {
                        catchingFishFABHilt.CatchingFishReduxKtor = catchingFishGlideSpannable.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    catchingFishFABHilt.CatchingFishReduxKtor.invoke(catchingFishGlideSpannable, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.CatchingFishParcelableFlux;
        if (str3 != null) {
            menuItem.setActionView((View) CatchingFishParcelableFAB(str3, CatchingFishPicassoCardView.CatchingFishDaggerWebsocket, catchingFishPicassoCardView.CatchingFishParcelableFAB));
            z = true;
        }
        int i2 = this.CatchingFishSpannableWidget;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor = this.CatchingFishCardViewRealm;
        if (catchingFishJUnitAdMobKtor != null && (menuItem instanceof CatchingFishGlideSpannable)) {
            ((CatchingFishGlideSpannable) menuItem).CatchingFishSnackbar(catchingFishJUnitAdMobKtor);
        }
        CharSequence charSequence = this.CatchingFishPayPal;
        boolean z2 = menuItem instanceof CatchingFishGlideSpannable;
        if (z2) {
            ((CatchingFishGlideSpannable) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            CatchingFishJUnitMVVM.CatchingFishEspressoTesting(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.CatchingFishCardViewView;
        if (z2) {
            ((CatchingFishGlideSpannable) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            CatchingFishJUnitMVVM.CatchingFishJetpackCompose(menuItem, charSequence2);
        }
        char c = this.CatchingFishUnitTesting;
        int i3 = this.CatchingFishAnimationMockk;
        if (z2) {
            ((CatchingFishGlideSpannable) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            CatchingFishJUnitMVVM.CatchingFishFragmentHandler(menuItem, c, i3);
        }
        char c2 = this.CatchingFishStateLiveData;
        int i4 = this.CatchingFishRoomDatabase;
        if (z2) {
            ((CatchingFishGlideSpannable) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            CatchingFishJUnitMVVM.CatchingFishStateLiveData(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.CatchingFishCustomView;
        if (mode != null) {
            if (z2) {
                ((CatchingFishGlideSpannable) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                CatchingFishJUnitMVVM.CatchingFishAnimationMockk(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.CatchingFishMVPRobolectric;
        if (colorStateList != null) {
            if (z2) {
                ((CatchingFishGlideSpannable) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                CatchingFishJUnitMVVM.CatchingFishUnitTesting(menuItem, colorStateList);
            }
        }
    }
}
