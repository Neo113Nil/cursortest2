package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishCameraXEspresso;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFABStateFlow;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishGoogleMapsMoshi;
import kotlin.text.CatchingFishKtorPicassoMVVM;
import kotlin.text.CatchingFishMVIPicasso;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishStateFlowMockk;
import kotlin.text.CatchingFishToastSharedFlow;
import kotlin.text.CatchingFishWidgetService;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList CatchingFishDaggerWebsocket;
    public final ArrayList CatchingFishReduxKtor;
    public boolean CatchingFishViewModelScope;
    public View.OnApplyWindowInsetsListener CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        CatchingFishFirebaseDagger.CatchingFishNavigation(context, "context");
        this.CatchingFishReduxKtor = new ArrayList();
        this.CatchingFishDaggerWebsocket = new ArrayList();
        this.CatchingFishViewModelScope = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetService.CatchingFishSnackbar, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void CatchingFishParcelableFAB(View view) {
        if (this.CatchingFishDaggerWebsocket.contains(view)) {
            this.CatchingFishReduxKtor.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof CatchingFishGoogleMapsMoshi ? (CatchingFishGoogleMapsMoshi) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM;
        CatchingFishFirebaseDagger.CatchingFishNavigation(windowInsets, "insets");
        CatchingFishKtorPicassoMVVM CatchingFishViewModelScope = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.CatchingFishWorkManager;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            catchingFishKtorPicassoMVVM = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            WindowInsets CatchingFishWorkManager = CatchingFishViewModelScope.CatchingFishWorkManager();
            if (CatchingFishWorkManager != null) {
                onApplyWindowInsets(CatchingFishWorkManager);
                if (!CatchingFishWorkManager.equals(CatchingFishWorkManager)) {
                    CatchingFishViewModelScope = CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(this, CatchingFishWorkManager);
                }
            }
            catchingFishKtorPicassoMVVM = CatchingFishViewModelScope;
        }
        if (!catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFish()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                CatchingFishFABCameraX.CatchingFishSnackbar(getChildAt(i), catchingFishKtorPicassoMVVM);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(canvas, "canvas");
        if (this.CatchingFishViewModelScope) {
            ArrayList arrayList = this.CatchingFishReduxKtor;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(canvas, "canvas");
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "child");
        if (this.CatchingFishViewModelScope) {
            ArrayList arrayList = this.CatchingFishReduxKtor;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        this.CatchingFishDaggerWebsocket.remove(view);
        if (this.CatchingFishReduxKtor.remove(view)) {
            this.CatchingFishViewModelScope = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends CatchingFishGoogleMapsMoshi> F getFragment() {
        FragmentActivity fragmentActivity;
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi;
        CatchingFishToastSharedFlow catchingFishToastSharedFlow;
        View view = this;
        while (true) {
            fragmentActivity = null;
            if (view == null) {
                catchingFishGoogleMapsMoshi = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            catchingFishGoogleMapsMoshi = tag instanceof CatchingFishGoogleMapsMoshi ? (CatchingFishGoogleMapsMoshi) tag : null;
            if (catchingFishGoogleMapsMoshi != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (catchingFishGoogleMapsMoshi == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fragmentActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            catchingFishToastSharedFlow = ((CatchingFishMVIPicasso) fragmentActivity.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget;
        } else {
            if (catchingFishGoogleMapsMoshi.CatchingFishDaggerHiltFAB == null || !catchingFishGoogleMapsMoshi.CatchingFishUnitTesting) {
                throw new IllegalStateException("The Fragment " + catchingFishGoogleMapsMoshi + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            catchingFishToastSharedFlow = catchingFishGoogleMapsMoshi.CatchingFishViewModelScope();
        }
        return (F) catchingFishToastSharedFlow.CatchingFishPayPal(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(childAt, "view");
                CatchingFishParcelableFAB(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        CatchingFishParcelableFAB(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(childAt, "view");
        CatchingFishParcelableFAB(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        CatchingFishParcelableFAB(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(childAt, "view");
            CatchingFishParcelableFAB(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(childAt, "view");
            CatchingFishParcelableFAB(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.CatchingFishViewModelScope = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(onApplyWindowInsetsListener, "listener");
        this.CatchingFishWorkManager = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        if (view.getParent() == this) {
            this.CatchingFishDaggerWebsocket.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, CatchingFishToastSharedFlow catchingFishToastSharedFlow) {
        super(context, attributeSet);
        View view;
        CatchingFishFirebaseDagger.CatchingFishNavigation(context, "context");
        CatchingFishFirebaseDagger.CatchingFishNavigation(attributeSet, "attrs");
        this.CatchingFishReduxKtor = new ArrayList();
        this.CatchingFishDaggerWebsocket = new ArrayList();
        this.CatchingFishViewModelScope = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetService.CatchingFishSnackbar, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        CatchingFishGoogleMapsMoshi CatchingFishPayPal = catchingFishToastSharedFlow.CatchingFishPayPal(id);
        if (classAttribute != null && CatchingFishPayPal == null) {
            if (id == -1) {
                throw new IllegalStateException(CatchingFishMVPLiveData.CatchingFishOkHttp("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            CatchingFishFABStateFlow CatchingFishMVPRobolectric = catchingFishToastSharedFlow.CatchingFishMVPRobolectric();
            context.getClassLoader();
            CatchingFishGoogleMapsMoshi CatchingFishParcelableFAB = CatchingFishMVPRobolectric.CatchingFishParcelableFAB(classAttribute);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(CatchingFishParcelableFAB, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            CatchingFishParcelableFAB.CatchingFishMutableLiveData = true;
            CatchingFishMVIPicasso catchingFishMVIPicasso = CatchingFishParcelableFAB.CatchingFishDaggerHiltFAB;
            if ((catchingFishMVIPicasso == null ? null : catchingFishMVIPicasso.CatchingFishJetpackCompose) != null) {
                CatchingFishParcelableFAB.CatchingFishMutableLiveData = true;
            }
            CatchingFishCameraXEspresso catchingFishCameraXEspresso = new CatchingFishCameraXEspresso(catchingFishToastSharedFlow);
            catchingFishCameraXEspresso.CatchingFishAnimationMockk = true;
            CatchingFishParcelableFAB.CatchingFishJobScheduler = this;
            catchingFishCameraXEspresso.CatchingFishDaggerWebsocket(getId(), CatchingFishParcelableFAB, string, 1);
            if (!catchingFishCameraXEspresso.CatchingFishViewModelScope) {
                CatchingFishToastSharedFlow catchingFishToastSharedFlow2 = catchingFishCameraXEspresso.CatchingFishStateLiveData;
                if (catchingFishToastSharedFlow2.CatchingFishJetpackCompose != null && !catchingFishToastSharedFlow2.CatchingFishJobScheduler) {
                    catchingFishToastSharedFlow2.CatchingFishParcelableFlux(true);
                    catchingFishCameraXEspresso.CatchingFishParcelableFAB(catchingFishToastSharedFlow2.CatchingFishSensorManager, catchingFishToastSharedFlow2.CatchingFishEspressoMockk);
                    catchingFishToastSharedFlow2.CatchingFishSnackbar = true;
                    try {
                        catchingFishToastSharedFlow2.CatchingFishMotionLayout(catchingFishToastSharedFlow2.CatchingFishSensorManager, catchingFishToastSharedFlow2.CatchingFishEspressoMockk);
                        catchingFishToastSharedFlow2.CatchingFishReduxKtor();
                        catchingFishToastSharedFlow2.CatchingFishStripeAPI();
                        catchingFishToastSharedFlow2.CatchingFishCoroutineFlow();
                        ((HashMap) catchingFishToastSharedFlow2.CatchingFishCoroutine.CatchingFishDaggerWebsocket).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        catchingFishToastSharedFlow2.CatchingFishReduxKtor();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList CatchingFishUnitTesting = catchingFishToastSharedFlow.CatchingFishCoroutine.CatchingFishUnitTesting();
        int size = CatchingFishUnitTesting.size();
        while (i < size) {
            Object obj = CatchingFishUnitTesting.get(i);
            i++;
            CatchingFishStateFlowMockk catchingFishStateFlowMockk = (CatchingFishStateFlowMockk) obj;
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
            if (catchingFishGoogleMapsMoshi.CatchingFishCardViewRealm == getId() && (view = catchingFishGoogleMapsMoshi.CatchingFishPayPalService) != null && view.getParent() == null) {
                catchingFishGoogleMapsMoshi.CatchingFishJobScheduler = this;
                catchingFishStateFlowMockk.CatchingFishSnackbar();
            }
        }
    }
}
