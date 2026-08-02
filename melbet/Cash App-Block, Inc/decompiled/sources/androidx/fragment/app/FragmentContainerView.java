package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.R$styleable;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.views.CartTotalDiscrepancy;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public View.OnApplyWindowInsetsListener applyWindowInsetsListener;
    public final ArrayList disappearingFragmentChildren;
    public boolean drawDisappearingViewsFirst;
    public final ArrayList transitioningFragmentViews;

    /* loaded from: classes3.dex */
    public abstract class Api20Impl {
        public static final void CreditLimitExceededContent(CheckoutScreenType.CreditLimitExceededWarning creditLimitExceededWarning, Function1 function1, Composer composer, int i) {
            function1.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-966260412);
            int i2 = 2;
            int i3 = (gapComposer.changedInstance(creditLimitExceededWarning) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                String stringResource = Room.stringResource(gapComposer, R.string.sup_credit_limit_exceeded_header);
                String stringResource2 = Room.stringResource(gapComposer, R.string.sup_credit_limit_exceeded_message);
                String stringResource3 = Room.stringResource(gapComposer, R.string.ok);
                ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                boolean z = true;
                CartTotalDiscrepancy cartTotalDiscrepancy = new CartTotalDiscrepancy(creditLimitExceededWarning.cartTotal, creditLimitExceededWarning.availableLimit, null, 4);
                if ((i3 & 112) != 32) {
                    z = false;
                }
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(8, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent(stringResource, stringResource2, stringResource3, buttonProminence, true, cartTotalDiscrepancy, (Function0) rememberedValue, gapComposer, 27648, 0);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1(creditLimitExceededWarning, function1, i, i2);
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.RemoveAllAppMessagesInBackground.deepLinkSpecs;
        }

        public static WindowInsets onApplyWindowInsets(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, FragmentContainerView fragmentContainerView, WindowInsets windowInsets) {
            onApplyWindowInsetsListener.getClass();
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(fragmentContainerView, windowInsets);
            onApplyWindowInsets.getClass();
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        context.getClass();
        attributeSet.getClass();
        fragmentManager.getClass();
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string2 = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment findFragmentById = fragmentManager.findFragmentById(id);
        if (classAttribute != null && findFragmentById == null) {
            if (id == -1) {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string2 != null ? " with tag ".concat(string2) : ""));
                throw null;
            }
            Fragment instantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), classAttribute);
            instantiate.getClass();
            instantiate.mFragmentId = id;
            instantiate.mContainerId = id;
            instantiate.mTag = string2;
            instantiate.mFragmentManager = fragmentManager;
            instantiate.mHost = fragmentManager.mHost;
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
            backStackRecord.mReorderingAllowed = true;
            instantiate.mContainer = this;
            instantiate.mInDynamicContainer = true;
            backStackRecord.doAddOp(getId(), instantiate, string2, 1);
            backStackRecord.commitNowAllowingStateLoss();
        }
        Iterator it = fragmentManager.mFragmentStore.getActiveFragmentStateManagers().iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
            Fragment fragment = fragmentStateManager.getFragment();
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                fragmentStateManager.addViewToContainer();
                fragmentStateManager.moveToExpectedState();
            }
        }
    }

    public final void addDisappearingFragmentView(View view) {
        if (this.transitioningFragmentViews.contains(view)) {
            this.disappearingFragmentChildren.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            Handlers$$ExternalSyntheticBUOutline0.m("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        WindowInsetsCompat windowInsetsCompat2 = onApplyWindowInsetsListener != null ? WindowInsetsCompat.toWindowInsetsCompat(Api20Impl.onApplyWindowInsets(onApplyWindowInsetsListener, this, windowInsets), null) : ViewCompat.onApplyWindowInsets(this, windowInsetsCompat);
        if (!windowInsetsCompat2.mImpl.isConsumed()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewCompat.dispatchApplyWindowInsets(getChildAt(i), windowInsetsCompat2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.drawDisappearingViewsFirst) {
            Iterator it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.drawDisappearingViewsFirst) {
            ArrayList arrayList = this.disappearingFragmentChildren;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
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
                childAt.getClass();
                addDisappearingFragmentView(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        addDisappearingFragmentView(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        addDisappearingFragmentView(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        addDisappearingFragmentView(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            addDisappearingFragmentView(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            addDisappearingFragmentView(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.drawDisappearingViewsFirst = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.applyWindowInsetsListener = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        context.getClass();
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }
}
