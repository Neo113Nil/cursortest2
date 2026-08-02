package defpackage;

import android.view.ViewGroup;

/* loaded from: classes10.dex */
public interface u45 {
    g18 addOnDetachAction(Runnable runnable);

    boolean canHandleScreenTracking();

    void dismiss();

    void dismissWithAction(Runnable runnable);

    void dismissWithoutAnimation();

    boolean getInterceptOnBackPress();

    s45 getOnAppearingListener();

    void performAccessibilityFocusAction();

    boolean requestFocus();

    /* renamed from: screenName */
    String getModalScreenName();

    void setDismissOnBackPressed(boolean z);

    void setLifecycleOwner(pey peyVar);

    void setOnAppearingListener(s45 s45Var);

    void setOnTouchOutsideListener(Runnable runnable);

    void show(ViewGroup viewGroup, float f);
}
