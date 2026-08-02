package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.TooltipCompat$Api26Impl;
import androidx.camera.video.Recorder;
import androidx.core.util.Pools$SimplePool;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.mlkit.vision.text.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public class TabLayout extends HorizontalScrollView {
    public static final Pools$SynchronizedPool tabPool = new Pools$SynchronizedPool(16);
    public AdapterChangeListener adapterChangeListener;
    public final int contentInsetStart;
    public ViewPagerOnTabSelectedListener currentVpSelectedListener;
    public final int defaultTabTextAppearance;
    public int indicatorPosition;
    public boolean inlineLabel;
    public int mode;
    public TabLayoutOnPageChangeListener pageChangeListener;
    public final int requestedTabMaxWidth;
    public final int requestedTabMinWidth;
    public ValueAnimator scrollAnimator;
    public final int scrollableTabMinWidth;
    public BaseOnTabSelectedListener selectedListener;
    public final ArrayList selectedListeners;
    public Tab selectedTab;
    public final int selectedTabTextAppearance;
    public final float selectedTabTextSize;
    public boolean setupViewPagerImplicitly;
    public final SlidingTabIndicator slidingTabIndicator;
    public final int tabBackgroundResId;
    public int tabGravity;
    public ColorStateList tabIconTint;
    public final PorterDuff.Mode tabIconTintMode;
    public final int tabIndicatorAnimationDuration;
    public boolean tabIndicatorFullWidth;
    public int tabIndicatorGravity;
    public int tabIndicatorHeight;
    public zzd tabIndicatorInterpolator;
    public final TimeInterpolator tabIndicatorTimeInterpolator;
    public int tabMaxWidth;
    public final int tabPaddingBottom;
    public final int tabPaddingEnd;
    public final int tabPaddingStart;
    public final int tabPaddingTop;
    public ColorStateList tabRippleColorStateList;
    public Drawable tabSelectedIndicator;
    public int tabSelectedIndicatorColor;
    public final int tabTextAppearance;
    public ColorStateList tabTextColors;
    public final float tabTextMultiLineSize;
    public final float tabTextSize;
    public final Pools$SimplePool tabViewPool;
    public final ArrayList tabs;
    public boolean unboundedRipple;
    public ViewPager viewPager;
    public int viewPagerScrollState;

    /* renamed from: com.google.android.material.tabs.TabLayout$1, reason: invalid class name */
    public final class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                    break;
                case 1:
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) obj;
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue != collapsingToolbarLayout.scrimAlpha) {
                        if (collapsingToolbarLayout.contentScrim != null && (viewGroup = collapsingToolbarLayout.toolbar) != null) {
                            viewGroup.postInvalidateOnAnimation();
                        }
                        collapsingToolbarLayout.scrimAlpha = intValue;
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                        break;
                    }
                    break;
                case 2:
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    MaterialShapeDrawable materialShapeDrawable = ((BottomSheetBehavior) obj).materialShapeDrawable;
                    if (materialShapeDrawable != null) {
                        materialShapeDrawable.setInterpolation(floatValue);
                        break;
                    }
                    break;
                case 3:
                    ((TextInputLayout) obj).collapsingTextHelper.setExpansionFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                default:
                    ((View) obj).invalidate();
                    break;
            }
        }
    }

    public final class AdapterChangeListener {
        public AdapterChangeListener() {
        }
    }

    public interface BaseOnTabSelectedListener {
        void onTabSelected(Tab tab);
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener {
    }

    public final class SlidingTabIndicator extends LinearLayout {
        public static final /* synthetic */ int $r8$clinit = 0;
        public ValueAnimator indicatorAnimator;

        public SlidingTabIndicator(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int height2 = tabLayout.tabSelectedIndicator.getBounds().height();
            if (height2 < 0) {
                height2 = tabLayout.tabSelectedIndicator.getIntrinsicHeight();
            }
            int i = tabLayout.tabIndicatorGravity;
            if (i == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    height2 = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (tabLayout.tabSelectedIndicator.getBounds().width() > 0) {
                Rect bounds = tabLayout.tabSelectedIndicator.getBounds();
                tabLayout.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, height2);
                tabLayout.tabSelectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void jumpIndicatorToPosition(int i) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.viewPagerScrollState == 0 || (tabLayout.tabSelectedIndicator.getBounds().left == -1 && tabLayout.tabSelectedIndicator.getBounds().right == -1)) {
                View childAt = getChildAt(i);
                zzd zzdVar = tabLayout.tabIndicatorInterpolator;
                Drawable drawable = tabLayout.tabSelectedIndicator;
                zzdVar.getClass();
                RectF calculateIndicatorWidthForTab = zzd.calculateIndicatorWidthForTab(tabLayout, childAt);
                drawable.setBounds((int) calculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) calculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
                tabLayout.indicatorPosition = i;
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                updateOrRecreateIndicatorAnimation(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.indicatorPosition == -1) {
                tabLayout.indicatorPosition = tabLayout.getSelectedTabPosition();
            }
            jumpIndicatorToPosition(tabLayout.indicatorPosition);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != RecyclerView.DECELERATION_RATE) {
                            layoutParams.width = i3;
                            layoutParams.weight = RecyclerView.DECELERATION_RATE;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    tabLayout.tabGravity = 0;
                    tabLayout.updateTabViews(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        public final void setSelectedIndicatorHeight(int i) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.tabSelectedIndicator.getBounds();
            tabLayout.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void tweenIndicatorPosition(View view, View view2, float f) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.tabSelectedIndicator;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.tabSelectedIndicator.getBounds().bottom);
            } else {
                tabLayout.tabIndicatorInterpolator.updateIndicatorForOffset(tabLayout, view, view2, f, tabLayout.tabSelectedIndicator);
            }
            postInvalidateOnAnimation();
        }

        public final void updateOrRecreateIndicatorAnimation(int i, int i2, boolean z) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                jumpIndicatorToPosition(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.indicatorPosition = i;
            FadeThroughUpdateListener fadeThroughUpdateListener = new FadeThroughUpdateListener(this, childAt, childAt2);
            if (!z) {
                this.indicatorAnimator.removeAllUpdateListeners();
                this.indicatorAnimator.addUpdateListener(fadeThroughUpdateListener);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.indicatorAnimator = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.tabIndicatorTimeInterpolator);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(RecyclerView.DECELERATION_RATE, 1.0f);
            valueAnimator.addUpdateListener(fadeThroughUpdateListener);
            valueAnimator.start();
        }
    }

    public final class Tab {
        public CharSequence contentDesc;
        public View customView;
        public Drawable icon;
        public TabLayout parent;
        public int position;
        public CharSequence text;
        public TabView view;

        public final void updateView() {
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.update();
            }
        }
    }

    public final class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public int previousScrollState;
        public int scrollState;
        public final WeakReference tabLayoutRef;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference(tabLayout);
        }

        public final void onPageScrolled(float f, int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i2 = this.scrollState;
                boolean z2 = true;
                if (i2 != 2 || this.previousScrollState == 1) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                if (i2 == 2 && this.previousScrollState == 0) {
                    z = false;
                }
                tabLayout.setScrollPosition(i, f, z2, z, false);
            }
        }
    }

    public final class TabView extends LinearLayout {
        public static final /* synthetic */ int $r8$clinit = 0;
        public Drawable baseBackgroundDrawable;
        public ImageView customIconView;
        public TextView customTextView;
        public View customView;
        public int defaultMaxLines;
        public ImageView iconView;
        public Tab tab;
        public TextView textView;

        public TabView(Context context) {
            super(context);
            this.defaultMaxLines = 2;
            updateBackgroundDrawable(context);
            setPaddingRelative(TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api24Impl.setPointerIcon(this, systemIcon);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            if ((drawable == null || !drawable.isStateful()) ? false : this.baseBackgroundDrawable.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) Recorder.AnonymousClass6.obtain(isSelected(), 0, 1, this.tab.position, 1).this$0);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK.mAction);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int i3 = tabLayout.tabMaxWidth;
            if (i3 > 0 && (mode == 0 || size > i3)) {
                i = View.MeasureSpec.makeMeasureSpec(i3, PKIFailureInfo.systemUnavail);
            }
            super.onMeasure(i, i2);
            if (this.textView != null) {
                float f = tabLayout.tabTextSize;
                if (isSelected() && tabLayout.selectedTabTextAppearance != -1) {
                    f = tabLayout.selectedTabTextSize;
                }
                int i4 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.textView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.tabTextMultiLineSize;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int maxLines = this.textView.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                    if (tabLayout.mode == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.textView.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.textView.setTextSize(0, f);
                    this.textView.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            Tab tab = this.tab;
            TabLayout tabLayout = tab.parent;
            if (tabLayout != null) {
                tabLayout.selectTab(tab, true);
                return true;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Tab not attached to a TabLayout");
            return false;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.textView;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.customView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public final void update() {
            boolean z;
            updateTab();
            Tab tab = this.tab;
            if (tab != null) {
                TabLayout tabLayout = tab.parent;
                if (tabLayout == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Tab not attached to a TabLayout");
                    return;
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == tab.position) {
                    z = true;
                    setSelected(z);
                }
            }
            z = false;
            setSelected(z);
        }

        public final void updateBackgroundDrawable(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.tabBackgroundResId;
            if (i != 0) {
                Drawable drawable = DimensionKt.getDrawable(context, i);
                this.baseBackgroundDrawable = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.baseBackgroundDrawable.setState(getDrawableState());
                }
            } else {
                this.baseBackgroundDrawable = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable drawable2 = gradientDrawable;
            if (tabLayout.tabRippleColorStateList != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateList = tabLayout.tabRippleColorStateList;
                int colorForState = RippleUtils.getColorForState(colorStateList, RippleUtils.SELECTED_PRESSED_STATE_SET);
                int[] iArr = RippleUtils.FOCUSED_STATE_SET;
                int colorForState2 = RippleUtils.getColorForState(colorStateList, iArr);
                ColorStateList colorStateList2 = new ColorStateList(new int[][]{RippleUtils.SELECTED_STATE_SET, iArr, StateSet.NOTHING}, new int[]{colorForState, colorForState2, RippleUtils.getColorForState(colorStateList, RippleUtils.PRESSED_STATE_SET)});
                if (tabLayout.unboundedRipple) {
                    RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, null, null);
                    ColorDrawable colorDrawable = FocusRingDrawable.EMPTY_DRAWABLE;
                    drawable2 = rippleDrawable;
                    if (MaterialAttributes.resolveBoolean(context.getTheme(), R.attr.focusRingsEnabled, false)) {
                        drawable2 = new FocusRingDrawable(context, rippleDrawable);
                    }
                } else {
                    RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable, gradientDrawable2);
                    FocusRingDrawable.layer(context, rippleDrawable2, null);
                    drawable2 = rippleDrawable2;
                }
            }
            setBackground(drawable2);
            tabLayout.invalidate();
        }

        public final void updateTab() {
            int i;
            ViewParent parent;
            Tab tab = this.tab;
            View view = tab != null ? tab.customView : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.customView;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.customView);
                    }
                    addView(view);
                }
                this.customView = view;
                TextView textView = this.textView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
                this.customTextView = textView2;
                if (textView2 != null) {
                    this.defaultMaxLines = textView2.getMaxLines();
                }
                this.customIconView = (ImageView) view.findViewById(android.R.id.icon);
            } else {
                View view3 = this.customView;
                if (view3 != null) {
                    removeView(view3);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            }
            if (this.customView == null) {
                if (this.iconView == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.iconView = imageView2;
                    addView(imageView2, 0);
                }
                if (this.textView == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.textView = textView3;
                    addView(textView3);
                    this.defaultMaxLines = this.textView.getMaxLines();
                }
                TextView textView4 = this.textView;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.defaultTabTextAppearance);
                if (!isSelected() || (i = tabLayout.selectedTabTextAppearance) == -1) {
                    this.textView.setTextAppearance(tabLayout.tabTextAppearance);
                } else {
                    this.textView.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.tabTextColors;
                if (colorStateList != null) {
                    this.textView.setTextColor(colorStateList);
                }
                updateTextAndIcon(this.textView, this.iconView, true);
                ImageView imageView3 = this.iconView;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, imageView3));
                }
                TextView textView5 = this.textView;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, textView5));
                }
            } else {
                TextView textView6 = this.customTextView;
                if (textView6 != null || this.customIconView != null) {
                    updateTextAndIcon(textView6, this.customIconView, false);
                }
            }
            if (tab == null || TextUtils.isEmpty(tab.contentDesc)) {
                return;
            }
            setContentDescription(tab.contentDesc);
        }

        public final void updateTextAndIcon(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            Drawable drawable;
            Tab tab = this.tab;
            Drawable mutate = (tab == null || (drawable = tab.icon) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (mutate != null) {
                mutate.setTintList(tabLayout.tabIconTint);
                PorterDuff.Mode mode = tabLayout.tabIconTintMode;
                if (mode != null) {
                    mutate.setTintMode(mode);
                }
            }
            Tab tab2 = this.tab;
            CharSequence charSequence = tab2 != null ? tab2.text : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (isEmpty) {
                    z2 = false;
                } else {
                    this.tab.getClass();
                    z2 = true;
                }
                textView.setText(!isEmpty ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!isEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int dpToPx = (z2 && imageView.getVisibility() == 0) ? (int) ViewUtils.dpToPx(getContext(), 8) : 0;
                if (tabLayout.inlineLabel) {
                    if (dpToPx != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(dpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (dpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = dpToPx;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.tab;
            CharSequence charSequence2 = tab3 != null ? tab3.contentDesc : null;
            if (isEmpty) {
                charSequence = charSequence2;
            }
            TooltipCompat$Api26Impl.setTooltipText(this, charSequence);
        }
    }

    public final class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        public final /* synthetic */ int $r8$classId;
        public final ViewGroup viewPager;

        public /* synthetic */ ViewPagerOnTabSelectedListener(ViewGroup viewGroup, int i) {
            this.$r8$classId = i;
            this.viewPager = viewGroup;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabSelected(Tab tab) {
            int i = this.$r8$classId;
            ViewGroup viewGroup = this.viewPager;
            switch (i) {
                case 0:
                    ((ViewPager) viewGroup).setCurrentItem(tab.position);
                    break;
                default:
                    ((ViewPager2) viewGroup).setCurrentItem(tab.position, true);
                    break;
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.indicatorPosition = -1;
        this.tabs = new ArrayList();
        this.selectedTabTextAppearance = -1;
        this.tabSelectedIndicatorColor = 0;
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.tabIndicatorHeight = -1;
        this.selectedListeners = new ArrayList();
        this.tabViewPool = new Pools$SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.slidingTabIndicator = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.TabLayout, i, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListOrNull = SelfieUtilsKt.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
        setSelectedTabIndicator(ContextUtilsKt.getDrawable(context2, obtainStyledAttributes, 5));
        setSelectedTabIndicatorColor(obtainStyledAttributes.getColor(8, 0));
        slidingTabIndicator.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(obtainStyledAttributes.getInt(10, 0));
        setTabIndicatorAnimationMode(obtainStyledAttributes.getInt(7, 0));
        setTabIndicatorFullWidth(obtainStyledAttributes.getBoolean(9, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        this.tabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(20, dimensionPixelSize);
        this.tabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize);
        this.tabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        if (MaterialAttributes.resolveBoolean(context2.getTheme(), R.attr.isMaterial3Theme, false)) {
            this.defaultTabTextAppearance = R.attr.textAppearanceTitleSmall;
        } else {
            this.defaultTabTextAppearance = R.attr.textAppearanceButton;
        }
        int resourceId = obtainStyledAttributes.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.tabTextAppearance = resourceId;
        int[] iArr = androidx.appcompat.R$styleable.TextAppearance;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.tabTextSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.tabTextColors = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes2, 3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(22)) {
                this.selectedTabTextAppearance = obtainStyledAttributes.getResourceId(22, resourceId);
            }
            int i2 = this.selectedTabTextAppearance;
            if (i2 != -1) {
                obtainStyledAttributes2 = context2.obtainStyledAttributes(i2, iArr);
                try {
                    this.selectedTabTextSize = obtainStyledAttributes2.getDimensionPixelSize(0, (int) r6);
                    ColorStateList colorStateList = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes2, 3);
                    if (colorStateList != null) {
                        this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (obtainStyledAttributes.hasValue(25)) {
                this.tabTextColors = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 25);
            }
            if (obtainStyledAttributes.hasValue(23)) {
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(23, 0));
            }
            this.tabIconTint = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 3);
            this.tabIconTintMode = ViewUtils.parseTintMode(obtainStyledAttributes.getInt(4, -1), null);
            this.tabRippleColorStateList = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 21);
            this.tabIndicatorAnimationDuration = obtainStyledAttributes.getInt(6, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE);
            this.tabIndicatorTimeInterpolator = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.requestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.requestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.tabBackgroundResId = obtainStyledAttributes.getResourceId(0, 0);
            this.contentInsetStart = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.mode = obtainStyledAttributes.getInt(15, 1);
            this.tabGravity = obtainStyledAttributes.getInt(2, 0);
            this.inlineLabel = obtainStyledAttributes.getBoolean(12, false);
            this.unboundedRipple = obtainStyledAttributes.getBoolean(26, false);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.tabTextMultiLineSize = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            applyModeAndGravity();
        } finally {
        }
    }

    public static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public final void addTab(Tab tab, boolean z) {
        ArrayList arrayList = this.tabs;
        int size = arrayList.size();
        if (tab.parent != this) {
            a$$ExternalSyntheticBUOutline0.m$3("Tab belongs to a different TabLayout.");
            return;
        }
        tab.position = size;
        arrayList.add(size, tab);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((Tab) arrayList.get(i2)).position == this.indicatorPosition) {
                i = i2;
            }
            ((Tab) arrayList.get(i2)).position = i2;
        }
        this.indicatorPosition = i;
        TabView tabView = tab.view;
        tabView.setSelected(false);
        tabView.setActivated(false);
        int i3 = tab.position;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = RecyclerView.DECELERATION_RATE;
        }
        this.slidingTabIndicator.addView(tabView, i3, layoutParams);
        if (z) {
            TabLayout tabLayout = tab.parent;
            if (tabLayout != null) {
                tabLayout.selectTab(tab, true);
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("Tab not attached to a TabLayout");
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        addViewInternal(view);
    }

    public final void addViewInternal(View view) {
        if (!(view instanceof TabItem)) {
            a$$ExternalSyntheticBUOutline0.m$3("Only TabItem instances can be added to TabLayout");
            return;
        }
        TabItem tabItem = (TabItem) view;
        Tab newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            if (TextUtils.isEmpty(newTab.contentDesc) && !TextUtils.isEmpty(charSequence)) {
                newTab.view.setContentDescription(charSequence);
            }
            newTab.text = charSequence;
            newTab.updateView();
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            newTab.icon = drawable;
            TabLayout tabLayout = newTab.parent;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            newTab.updateView();
        }
        int i = tabItem.customLayout;
        if (i != 0) {
            newTab.customView = LayoutInflater.from(newTab.view.getContext()).inflate(i, (ViewGroup) newTab.view, false);
            newTab.updateView();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.contentDesc = tabItem.getContentDescription();
            newTab.updateView();
        }
        addTab(newTab, this.tabs.isEmpty());
    }

    public final void animateToTab(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
            int childCount = slidingTabIndicator.getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                if (slidingTabIndicator.getChildAt(i3).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int calculateScrollXForTab = calculateScrollXForTab(RecyclerView.DECELERATION_RATE, i);
            int i4 = this.tabIndicatorAnimationDuration;
            if (scrollX != calculateScrollXForTab) {
                if (this.scrollAnimator == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.scrollAnimator = valueAnimator;
                    valueAnimator.setInterpolator(this.tabIndicatorTimeInterpolator);
                    this.scrollAnimator.setDuration(i4);
                    this.scrollAnimator.addUpdateListener(new AnonymousClass1(this, i2));
                }
                this.scrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                this.scrollAnimator.start();
            }
            ValueAnimator valueAnimator2 = slidingTabIndicator.indicatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && TabLayout.this.indicatorPosition != i) {
                slidingTabIndicator.indicatorAnimator.cancel();
            }
            slidingTabIndicator.updateOrRecreateIndicatorAnimation(i, i4, true);
            return;
        }
        setScrollPosition(i, RecyclerView.DECELERATION_RATE, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyModeAndGravity() {
        int i = this.mode;
        int max = (i == 0 || i == 2) ? Math.max(0, this.contentInsetStart - this.tabPaddingStart) : 0;
        SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
        slidingTabIndicator.setPaddingRelative(max, 0, 0, 0);
        int i2 = this.mode;
        if (i2 == 0) {
            int i3 = this.tabGravity;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                slidingTabIndicator.setGravity(1);
            }
            slidingTabIndicator.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.tabGravity == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    public final int calculateScrollXForTab(float f, int i) {
        SlidingTabIndicator slidingTabIndicator;
        View childAt;
        int i2 = this.mode;
        if ((i2 != 0 && i2 != 2) || (childAt = (slidingTabIndicator = this.slidingTabIndicator).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < slidingTabIndicator.getChildCount() ? slidingTabIndicator.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final int getSelectedTabPosition() {
        Tab tab = this.selectedTab;
        if (tab != null) {
            return tab.position;
        }
        return -1;
    }

    public final Tab getTabAt(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.tabs;
        if (i >= arrayList.size()) {
            return null;
        }
        return (Tab) arrayList.get(i);
    }

    public final Tab newTab() {
        Tab tab = (Tab) tabPool.acquire();
        if (tab == null) {
            tab = new Tab();
            tab.position = -1;
        }
        tab.parent = this;
        Pools$SimplePool pools$SimplePool = this.tabViewPool;
        TabView tabView = pools$SimplePool != null ? (TabView) pools$SimplePool.acquire() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        if (tab != tabView.tab) {
            tabView.tab = tab;
            tabView.update();
        }
        tabView.setFocusable(true);
        int i = this.requestedTabMinWidth;
        if (i == -1) {
            int i2 = this.mode;
            i = (i2 == 0 || i2 == 2) ? this.scrollableTabMinWidth : 0;
        }
        tabView.setMinimumWidth(i);
        if (TextUtils.isEmpty(tab.contentDesc)) {
            tabView.setContentDescription(tab.text);
        } else {
            tabView.setContentDescription(tab.contentDesc);
        }
        tab.view = tabView;
        return tab;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RetryKt.setParentAbsoluteElevation(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
            if (i >= slidingTabIndicator.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).baseBackgroundDrawable) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.baseBackgroundDrawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) Toolbar.AnonymousClass1.obtain(1, this.tabs.size(), 1).this$0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.mode;
        return (i == 0 || i == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        Context context = getContext();
        ArrayList arrayList = this.tabs;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            Tab tab = (Tab) arrayList.get(i4);
            if (tab == null || tab.icon == null || TextUtils.isEmpty(tab.text)) {
                i4++;
            } else if (!this.inlineLabel) {
                i3 = 72;
            }
        }
        i3 = 48;
        int round = Math.round(ViewUtils.dpToPx(context, i3));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i5 = this.requestedTabMaxWidth;
            if (i5 <= 0) {
                i5 = (int) (size2 - ViewUtils.dpToPx(getContext(), 56));
            }
            this.tabMaxWidth = i5;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i6 = this.mode;
            if (i6 != 0) {
                if (i6 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i6 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getActionMasked() != 8 || (i = this.mode) == 0 || i == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void removeAllTabs() {
        SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
        int childCount = slidingTabIndicator.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) slidingTabIndicator.getChildAt(childCount);
            slidingTabIndicator.removeViewAt(childCount);
            if (tabView != null) {
                if (tabView.tab != null) {
                    tabView.tab = null;
                    tabView.update();
                }
                tabView.setSelected(false);
                this.tabViewPool.release(tabView);
            }
            requestLayout();
        }
        Iterator it = this.tabs.iterator();
        while (it.hasNext()) {
            Tab tab = (Tab) it.next();
            it.remove();
            tab.parent = null;
            tab.view = null;
            tab.icon = null;
            tab.text = null;
            tab.contentDesc = null;
            tab.position = -1;
            tab.customView = null;
            tabPool.release(tab);
        }
        this.selectedTab = null;
    }

    public final void selectTab(Tab tab, boolean z) {
        Tab tab2 = this.selectedTab;
        ArrayList arrayList = this.selectedListeners;
        if (tab2 == tab) {
            if (tab2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((BaseOnTabSelectedListener) arrayList.get(size)).getClass();
                }
                animateToTab(tab.position);
                return;
            }
            return;
        }
        int i = tab != null ? tab.position : -1;
        if (z) {
            if ((tab2 == null || tab2.position == -1) && i != -1) {
                setScrollPosition(i, RecyclerView.DECELERATION_RATE, true);
            } else {
                animateToTab(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.selectedTab = tab;
        if (tab2 != null && tab2.parent != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((BaseOnTabSelectedListener) arrayList.get(size2)).getClass();
            }
        }
        if (tab != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((BaseOnTabSelectedListener) arrayList.get(size3)).onTabSelected(tab);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel == z) {
            return;
        }
        this.inlineLabel = z;
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
            if (i >= slidingTabIndicator.getChildCount()) {
                applyModeAndGravity();
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                TabView tabView = (TabView) childAt;
                tabView.setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
                TextView textView = tabView.customTextView;
                if (textView == null && tabView.customIconView == null) {
                    tabView.updateTextAndIcon(tabView.textView, tabView.iconView, true);
                } else {
                    tabView.updateTextAndIcon(textView, tabView.customIconView, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.selectedListener;
        ArrayList arrayList = this.selectedListeners;
        if (baseOnTabSelectedListener2 != null) {
            arrayList.remove(baseOnTabSelectedListener2);
        }
        this.selectedListener = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener == null || arrayList.contains(baseOnTabSelectedListener)) {
            return;
        }
        arrayList.add(baseOnTabSelectedListener);
    }

    public final void setScrollPosition(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int round = Math.round(f2);
        if (round >= 0) {
            SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
            if (round >= slidingTabIndicator.getChildCount()) {
                return;
            }
            if (z2) {
                TabLayout.this.indicatorPosition = Math.round(f2);
                ValueAnimator valueAnimator = slidingTabIndicator.indicatorAnimator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    slidingTabIndicator.indicatorAnimator.cancel();
                }
                slidingTabIndicator.tweenIndicatorPosition(slidingTabIndicator.getChildAt(i), slidingTabIndicator.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.scrollAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.scrollAnimator.cancel();
            }
            int calculateScrollXForTab = calculateScrollXForTab(f, i);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || (i > getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || i == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || (i > getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.viewPagerScrollState == 1 || z3) {
                if (i < 0) {
                    calculateScrollXForTab = 0;
                }
                scrollTo(calculateScrollXForTab, 0);
            }
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.tabSelectedIndicator = mutate;
        int i = this.tabSelectedIndicatorColor;
        if (i != 0) {
            mutate.setTint(i);
        } else {
            mutate.setTintList(null);
        }
        int i2 = this.tabIndicatorHeight;
        if (i2 == -1) {
            i2 = this.tabSelectedIndicator.getIntrinsicHeight();
        }
        this.slidingTabIndicator.setSelectedIndicatorHeight(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.tabSelectedIndicatorColor = i;
        Drawable drawable = this.tabSelectedIndicator;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        updateTabViews(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            this.slidingTabIndicator.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.tabIndicatorHeight = i;
        this.slidingTabIndicator.setSelectedIndicatorHeight(i);
    }

    public final void setSelectedTabView(int i) {
        SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
        int childCount = slidingTabIndicator.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = slidingTabIndicator.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).updateTab();
                    }
                }
                i2++;
            }
        }
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            ArrayList arrayList = this.tabs;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Tab) arrayList.get(i)).updateView();
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(Strings.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        if (i == 0) {
            this.tabIndicatorInterpolator = new zzd(8);
            return;
        }
        if (i == 1) {
            this.tabIndicatorInterpolator = new FadeTabIndicatorInterpolator(1);
        } else if (i == 2) {
            this.tabIndicatorInterpolator = new FadeTabIndicatorInterpolator(0);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i, " is not a valid TabIndicatorAnimationMode"));
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        int i = SlidingTabIndicator.$r8$clinit;
        SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
        slidingTabIndicator.jumpIndicatorToPosition(TabLayout.this.getSelectedTabPosition());
        slidingTabIndicator.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList == colorStateList) {
            return;
        }
        this.tabRippleColorStateList = colorStateList;
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
            if (i >= slidingTabIndicator.getChildCount()) {
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i2 = TabView.$r8$clinit;
                ((TabView) childAt).updateBackgroundDrawable(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(Strings.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            ArrayList arrayList = this.tabs;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Tab) arrayList.get(i)).updateView();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        removeAllTabs();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple == z) {
            return;
        }
        this.unboundedRipple = z;
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
            if (i >= slidingTabIndicator.getChildCount()) {
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i2 = TabView.$r8$clinit;
                ((TabView) childAt).updateBackgroundDrawable(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public final void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.pageChangeListener;
            if (tabLayoutOnPageChangeListener != null && (arrayList2 = viewPager2.mOnPageChangeListeners) != null) {
                arrayList2.remove(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.adapterChangeListener;
            if (adapterChangeListener != null && (arrayList = this.viewPager.mAdapterChangeListeners) != null) {
                arrayList.remove(adapterChangeListener);
            }
        }
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = this.currentVpSelectedListener;
        ArrayList arrayList3 = this.selectedListeners;
        if (viewPagerOnTabSelectedListener != null) {
            arrayList3.remove(viewPagerOnTabSelectedListener);
            this.currentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.viewPager = viewPager;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener2 = this.pageChangeListener;
            int i = 0;
            tabLayoutOnPageChangeListener2.scrollState = 0;
            tabLayoutOnPageChangeListener2.previousScrollState = 0;
            if (viewPager.mOnPageChangeListeners == null) {
                viewPager.mOnPageChangeListeners = new ArrayList();
            }
            viewPager.mOnPageChangeListeners.add(tabLayoutOnPageChangeListener2);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener2 = new ViewPagerOnTabSelectedListener(viewPager, i);
            this.currentVpSelectedListener = viewPagerOnTabSelectedListener2;
            if (!arrayList3.contains(viewPagerOnTabSelectedListener2)) {
                arrayList3.add(viewPagerOnTabSelectedListener2);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new AdapterChangeListener();
            }
            AdapterChangeListener adapterChangeListener2 = this.adapterChangeListener;
            adapterChangeListener2.getClass();
            if (viewPager.mAdapterChangeListeners == null) {
                viewPager.mAdapterChangeListeners = new ArrayList();
            }
            viewPager.mAdapterChangeListeners.add(adapterChangeListener2);
            setScrollPosition(0, RecyclerView.DECELERATION_RATE, true);
        } else {
            this.viewPager = null;
            removeAllTabs();
        }
        this.setupViewPagerImplicitly = z2;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public final void updateTabViews(boolean z) {
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.slidingTabIndicator;
            if (i >= slidingTabIndicator.getChildCount()) {
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            int i2 = this.requestedTabMinWidth;
            if (i2 == -1) {
                int i3 = this.mode;
                i2 = (i3 == 0 || i3 == 2) ? this.scrollableTabMinWidth : 0;
            }
            childAt.setMinimumWidth(i2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.mode == 1 && this.tabGravity == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = RecyclerView.DECELERATION_RATE;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    @Deprecated
    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(DimensionKt.getDrawable(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        setupWithViewPager(viewPager, z, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        setScrollPosition(i, f, z, z2, true);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
