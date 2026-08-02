package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import com.squareup.cash.R;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes3.dex */
public final class ToolbarWidgetWrapper implements DecorToolbar {
    public ActionMenuPresenter mActionMenuPresenter;
    public View mCustomView;
    public final int mDefaultNavigationContentDescription;
    public final Drawable mDefaultNavigationIcon;
    public int mDisplayOpts;
    public final CharSequence mHomeDescription;
    public Drawable mIcon;
    public Drawable mLogo;
    public boolean mMenuPrepared;
    public final Drawable mNavIcon;
    public final CharSequence mSubtitle;
    public CharSequence mTitle;
    public boolean mTitleSet;
    public final Toolbar mToolbar;
    public Window.Callback mWindowCallback;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.mDefaultNavigationContentDescription = 0;
        this.mToolbar = toolbar;
        CharSequence charSequence = toolbar.mTitleText;
        this.mTitle = charSequence;
        this.mSubtitle = toolbar.mSubtitleText;
        this.mTitleSet = charSequence != null;
        this.mNavIcon = toolbar.getNavigationIcon();
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(R.attr.actionBarStyle, 0, toolbar.getContext(), null, R$styleable.ActionBar);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        int i = 15;
        this.mDefaultNavigationIcon = obtainStyledAttributes.getDrawable(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.mTitleSet = true;
                this.mTitle = text;
                if ((this.mDisplayOpts & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.mTitleSet) {
                        ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.mSubtitle = text2;
                if ((this.mDisplayOpts & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(20);
            if (drawable2 != null) {
                this.mLogo = drawable2;
                updateToolbarLogo();
            }
            Drawable drawable3 = obtainStyledAttributes.getDrawable(17);
            if (drawable3 != null) {
                this.mIcon = drawable3;
                updateToolbarLogo();
            }
            if (this.mNavIcon == null && (drawable = this.mDefaultNavigationIcon) != null) {
                this.mNavIcon = drawable;
                if ((this.mDisplayOpts & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            setDisplayOptions(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false));
                setDisplayOptions(this.mDisplayOpts | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.mDefaultNavigationIcon = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.mDisplayOpts = i;
        }
        obtainStyledAttributes.recycle();
        if (R.string.abc_action_bar_up_description != this.mDefaultNavigationContentDescription) {
            this.mDefaultNavigationContentDescription = R.string.abc_action_bar_up_description;
            AppCompatImageButton appCompatImageButton = toolbar.mNavButtonView;
            if (TextUtils.isEmpty(appCompatImageButton != null ? appCompatImageButton.getContentDescription() : null)) {
                int i2 = this.mDefaultNavigationContentDescription;
                this.mHomeDescription = i2 == 0 ? null : toolbar.getContext().getString(i2);
                updateHomeAccessibility();
            }
        }
        AppCompatImageButton appCompatImageButton2 = toolbar.mNavButtonView;
        this.mHomeDescription = appCompatImageButton2 != null ? appCompatImageButton2.getContentDescription() : null;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.1
            public final ActionMenuItem mNavItem;

            {
                Context context = ToolbarWidgetWrapper.this.mToolbar.getContext();
                CharSequence charSequence2 = ToolbarWidgetWrapper.this.mTitle;
                ActionMenuItem actionMenuItem = new ActionMenuItem();
                actionMenuItem.mShortcutNumericModifiers = 4096;
                actionMenuItem.mShortcutAlphabeticModifiers = 4096;
                actionMenuItem.mIconTintList = null;
                actionMenuItem.mIconTintMode = null;
                actionMenuItem.mHasIconTint = false;
                actionMenuItem.mHasIconTintMode = false;
                actionMenuItem.mFlags = 16;
                actionMenuItem.mContext = context;
                actionMenuItem.mTitle = charSequence2;
                this.mNavItem = actionMenuItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
                Window.Callback callback = toolbarWidgetWrapper.mWindowCallback;
                if (callback == null || !toolbarWidgetWrapper.mMenuPrepared) {
                    return;
                }
                callback.onMenuItemSelected(0, this.mNavItem);
            }
        });
    }

    public final void setCustomView(View view) {
        View view2 = this.mCustomView;
        Toolbar toolbar = this.mToolbar;
        if (view2 != null && (this.mDisplayOpts & 16) != 0) {
            toolbar.removeView(view2);
        }
        this.mCustomView = view;
        if (view == null || (this.mDisplayOpts & 16) == 0) {
            return;
        }
        toolbar.addView(view);
    }

    public final void setDisplayOptions(int i) {
        View view;
        int i2 = this.mDisplayOpts ^ i;
        this.mDisplayOpts = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.mToolbar;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    updateHomeAccessibility();
                }
                if ((this.mDisplayOpts & 4) != 0) {
                    Drawable drawable = this.mNavIcon;
                    if (drawable == null) {
                        drawable = this.mDefaultNavigationIcon;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                updateToolbarLogo();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.mTitle);
                    toolbar.setSubtitle(this.mSubtitle);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.mCustomView) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void updateHomeAccessibility() {
        if ((this.mDisplayOpts & 4) != 0) {
            CharSequence charSequence = this.mHomeDescription;
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            Toolbar toolbar = this.mToolbar;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            } else {
                toolbar.setNavigationContentDescription(charSequence);
            }
        }
    }

    public final void updateToolbarLogo() {
        Drawable drawable;
        int i = this.mDisplayOpts;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.mLogo;
            if (drawable == null) {
                drawable = this.mIcon;
            }
        } else {
            drawable = this.mIcon;
        }
        this.mToolbar.setLogo(drawable);
    }

    /* renamed from: androidx.appcompat.widget.ToolbarWidgetWrapper$2, reason: invalid class name */
    public final class AnonymousClass2 extends ViewPropertyAnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId;
        public boolean mCanceled;
        public final /* synthetic */ Object this$0;
        public int val$visibility;

        public AnonymousClass2(ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet) {
            this.$r8$classId = 1;
            this.this$0 = viewPropertyAnimatorCompatSet;
            this.mCanceled = false;
            this.val$visibility = 0;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel() {
            switch (this.$r8$classId) {
                case 0:
                    this.mCanceled = true;
                    break;
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    if (!this.mCanceled) {
                        ((ToolbarWidgetWrapper) obj).mToolbar.setVisibility(this.val$visibility);
                        break;
                    }
                    break;
                default:
                    int i2 = this.val$visibility + 1;
                    this.val$visibility = i2;
                    ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = (ViewPropertyAnimatorCompatSet) obj;
                    if (i2 == viewPropertyAnimatorCompatSet.mAnimators.size()) {
                        ViewPropertyAnimatorListener viewPropertyAnimatorListener = viewPropertyAnimatorCompatSet.mListener;
                        if (viewPropertyAnimatorListener != null) {
                            viewPropertyAnimatorListener.onAnimationEnd();
                        }
                        this.val$visibility = 0;
                        this.mCanceled = false;
                        viewPropertyAnimatorCompatSet.mIsStarted = false;
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationStart() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    ((ToolbarWidgetWrapper) obj).mToolbar.setVisibility(0);
                    break;
                default:
                    if (!this.mCanceled) {
                        this.mCanceled = true;
                        ViewPropertyAnimatorListener viewPropertyAnimatorListener = ((ViewPropertyAnimatorCompatSet) obj).mListener;
                        if (viewPropertyAnimatorListener != null) {
                            viewPropertyAnimatorListener.onAnimationStart();
                            break;
                        }
                    }
                    break;
            }
        }

        public AnonymousClass2(ToolbarWidgetWrapper toolbarWidgetWrapper, int i) {
            this.$r8$classId = 0;
            this.this$0 = toolbarWidgetWrapper;
            this.val$visibility = i;
            this.mCanceled = false;
        }
    }
}
