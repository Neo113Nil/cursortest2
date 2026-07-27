package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.text.CatchingFishEspressoRoom;
import kotlin.text.CatchingFishFABAsyncTask;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishIntentFragment;
import kotlin.text.CatchingFishKtorAdMob;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishWidgetDataStore;
import kotlin.text.CatchingFishWidgetStateFlow;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends CatchingFishEspressoRoom implements CatchingFishWidgetStateFlow {
    public static final int[] CatchingFishEspressoMockk = {R.attr.state_checked};
    public boolean CatchingFishCardViewRealm;
    public final boolean CatchingFishCardViewView;
    public FrameLayout CatchingFishCustomView;
    public CatchingFishKtorAdMob CatchingFishFragmentFactory;
    public int CatchingFishGsonAppCompat;
    public boolean CatchingFishJobScheduler;
    public final CheckedTextView CatchingFishMVPRobolectric;
    public ColorStateList CatchingFishMutableLiveData;
    public boolean CatchingFishPayPal;
    public Drawable CatchingFishPayPalService;
    public final CatchingFishIntentFragment CatchingFishSensorManager;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.CatchingFishCardViewView = true;
        CatchingFishIntentFragment catchingFishIntentFragment = new CatchingFishIntentFragment(3, this);
        this.CatchingFishSensorManager = catchingFishIntentFragment;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.catchingfish.fishcatcherpro.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.catchingfish.fishcatcherpro.R.id.design_menu_item_text);
        this.CatchingFishMVPRobolectric = checkedTextView;
        CatchingFishFABCameraX.CatchingFishOkHttp(checkedTextView, catchingFishIntentFragment);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.CatchingFishCustomView == null) {
                this.CatchingFishCustomView = (FrameLayout) ((ViewStub) findViewById(com.catchingfish.fishcatcherpro.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.CatchingFishCustomView.removeAllViews();
            this.CatchingFishCustomView.addView(view);
        }
    }

    @Override // kotlin.text.CatchingFishWidgetStateFlow
    public final void CatchingFishParcelableFAB(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        StateListDrawable stateListDrawable;
        this.CatchingFishFragmentFactory = catchingFishKtorAdMob;
        int i = catchingFishKtorAdMob.CatchingFishParcelableFAB;
        if (i > 0) {
            setId(i);
        }
        setVisibility(catchingFishKtorAdMob.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.catchingfish.fishcatcherpro.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(CatchingFishEspressoMockk, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(catchingFishKtorAdMob.isCheckable());
        setChecked(catchingFishKtorAdMob.isChecked());
        setEnabled(catchingFishKtorAdMob.isEnabled());
        setTitle(catchingFishKtorAdMob.CatchingFishDaggerWebsocket);
        setIcon(catchingFishKtorAdMob.getIcon());
        setActionView(catchingFishKtorAdMob.getActionView());
        setContentDescription(catchingFishKtorAdMob.CatchingFishRoomDatabase);
        CatchingFishViewMVIMVVM.CatchingFishCoroutineFlow(this, catchingFishKtorAdMob.CatchingFishNavigation);
        CatchingFishKtorAdMob catchingFishKtorAdMob2 = this.CatchingFishFragmentFactory;
        CharSequence charSequence = catchingFishKtorAdMob2.CatchingFishDaggerWebsocket;
        CheckedTextView checkedTextView = this.CatchingFishMVPRobolectric;
        if (charSequence == null && catchingFishKtorAdMob2.getIcon() == null && this.CatchingFishFragmentFactory.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.CatchingFishCustomView;
            if (frameLayout != null) {
                CatchingFishWidgetDataStore catchingFishWidgetDataStore = (CatchingFishWidgetDataStore) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) catchingFishWidgetDataStore).width = -1;
                this.CatchingFishCustomView.setLayoutParams(catchingFishWidgetDataStore);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.CatchingFishCustomView;
        if (frameLayout2 != null) {
            CatchingFishWidgetDataStore catchingFishWidgetDataStore2 = (CatchingFishWidgetDataStore) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) catchingFishWidgetDataStore2).width = -2;
            this.CatchingFishCustomView.setLayoutParams(catchingFishWidgetDataStore2);
        }
    }

    @Override // kotlin.text.CatchingFishWidgetStateFlow
    public CatchingFishKtorAdMob getItemData() {
        return this.CatchingFishFragmentFactory;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        CatchingFishKtorAdMob catchingFishKtorAdMob = this.CatchingFishFragmentFactory;
        if (catchingFishKtorAdMob != null && catchingFishKtorAdMob.isCheckable() && this.CatchingFishFragmentFactory.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CatchingFishEspressoMockk);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.CatchingFishPayPal != z) {
            this.CatchingFishPayPal = z;
            this.CatchingFishSensorManager.CatchingFishViewModelFAB(this.CatchingFishMVPRobolectric, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.CatchingFishMVPRobolectric;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.CatchingFishCardViewView) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.CatchingFishJobScheduler) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.CatchingFishMutableLiveData);
            }
            int i = this.CatchingFishGsonAppCompat;
            drawable.setBounds(0, 0, i, i);
        } else if (this.CatchingFishCardViewRealm) {
            if (this.CatchingFishPayPalService == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = CatchingFishFABAsyncTask.CatchingFishParcelableFAB;
                Drawable drawable2 = resources.getDrawable(com.catchingfish.fishcatcherpro.R.drawable.navigation_empty_icon, theme);
                this.CatchingFishPayPalService = drawable2;
                if (drawable2 != null) {
                    int i2 = this.CatchingFishGsonAppCompat;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.CatchingFishPayPalService;
        }
        this.CatchingFishMVPRobolectric.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.CatchingFishMVPRobolectric.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.CatchingFishGsonAppCompat = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.CatchingFishMutableLiveData = colorStateList;
        this.CatchingFishJobScheduler = colorStateList != null;
        CatchingFishKtorAdMob catchingFishKtorAdMob = this.CatchingFishFragmentFactory;
        if (catchingFishKtorAdMob != null) {
            setIcon(catchingFishKtorAdMob.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.CatchingFishMVPRobolectric.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.CatchingFishCardViewRealm = z;
    }

    public void setTextAppearance(int i) {
        this.CatchingFishMVPRobolectric.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.CatchingFishMVPRobolectric.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.CatchingFishMVPRobolectric.setText(charSequence);
    }
}
