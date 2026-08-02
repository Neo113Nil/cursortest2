package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.cash.molecule.PlatformKt;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.SplitButtons;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.cash.ui.widget.MaxWidthLinearLayout;
import com.squareup.cash.ui.widget.text.BalancedLineTextView;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public class AlertDialogView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Layout dialog;
    public final boolean hideKeyboard;

    public static final class Layout extends MaxWidthLinearLayout {
        public final SplitButtons buttonsContainer;
        public final ColorPalette colorPalette;
        public final FrameLayout contentContainerView;
        public final FrameLayout iconContainerView;
        public final AppCompatImageView iconView;
        public final BalancedLineTextView messageView;
        public final LinearLayout titleAndContentView;
        public final AppCompatTextView titleView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Layout(Context context) {
            super(context, null);
            context.getClass();
            ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
            this.colorPalette = colorPalette;
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            setGravity(1);
            appCompatImageView.setPadding(appCompatImageView.getPaddingLeft(), appCompatImageView.getPaddingTop(), appCompatImageView.getPaddingRight(), Views.dip((View) appCompatImageView, 8));
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.iconView = appCompatImageView;
            AppCompatTextView appCompatTextView = new AppCompatTextView(context);
            appCompatTextView.setGravity(1);
            appCompatTextView.setVisibility(8);
            Strings.applyStyle(appCompatTextView, TextStyles.mainTitle);
            appCompatTextView.setTextColor(colorPalette.label);
            appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), Views.dip((View) appCompatTextView, 6));
            this.titleView = appCompatTextView;
            BalancedLineTextView balancedLineTextView = new BalancedLineTextView(context, null, 2, 0 == true ? 1 : 0);
            balancedLineTextView.setGravity(1);
            this.messageView = balancedLineTextView;
            ScrollView scrollView = new ScrollView(context);
            scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            scrollView.setScrollBarStyle(0);
            scrollView.setVerticalScrollBarEnabled(true);
            scrollView.addView(balancedLineTextView);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            frameLayout.addView(scrollView);
            this.contentContainerView = frameLayout;
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            frameLayout2.setVisibility(8);
            frameLayout2.addView(appCompatImageView);
            this.iconContainerView = frameLayout2;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            linearLayout.setOrientation(1);
            linearLayout.setPadding(Views.dip((View) linearLayout, 24), Views.dip((View) linearLayout, 48), Views.dip((View) linearLayout, 24), Views.dip((View) linearLayout, 48));
            linearLayout.addView(frameLayout2);
            linearLayout.addView(appCompatTextView);
            linearLayout.addView(frameLayout);
            this.titleAndContentView = linearLayout;
            SplitButtons splitButtons = new SplitButtons(context, null, SplitButtons.Style.ALERT_DIALOG, 2, null);
            this.buttonsContainer = splitButtons;
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.maxWidth = context.getResources().getDimensionPixelSize(R.dimen.dialog_max_width);
            requestLayout();
            setOrientation(1);
            setClipToOutline(true);
            setBackground(PlatformKt.getDrawableCompat(context, R.drawable.dialog_background, Integer.valueOf(ThemeHelpersKt.themeInfo(this).colorPalette.elevatedBackground)));
            splitButtons.updateVisibleButtons(SplitButtons.Showing.None);
            addView(linearLayout);
            View view = new View(context);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            view.setBackground(new DividerDrawable(colorPalette.hairline));
            addView(view);
            addView(splitButtons);
        }

        public final void setMessage(CharSequence charSequence) {
            this.messageView.setText(charSequence);
            updateTextColorsAndStyles();
        }

        public final void setTitle(CharSequence charSequence) {
            AppCompatTextView appCompatTextView = this.titleView;
            appCompatTextView.setText(charSequence);
            appCompatTextView.setVisibility(charSequence == null || StringsKt.isBlank(charSequence) ? 8 : 0);
            updateTextColorsAndStyles();
        }

        public final void updateTextColorsAndStyles() {
            AppCompatTextView appCompatTextView = this.titleView;
            int visibility = appCompatTextView.getVisibility();
            ColorPalette colorPalette = this.colorPalette;
            BalancedLineTextView balancedLineTextView = this.messageView;
            if (visibility != 0) {
                balancedLineTextView.setTextColor(colorPalette.label);
                Strings.applyStyle(balancedLineTextView, TextStyles.mainBody);
            } else {
                appCompatTextView.setTextColor(colorPalette.label);
                balancedLineTextView.setTextColor(colorPalette.secondaryLabel);
                Strings.applyStyle(balancedLineTextView, TextStyles.smallBody);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        context.getClass();
        this.hideKeyboard = z;
        Layout layout = new Layout(context);
        this.dialog = layout;
        addView(layout);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.hideKeyboard) {
            post(new KnotView$$ExternalSyntheticLambda1(this, 28));
        }
    }

    public final void setIcon(Drawable drawable) {
        Layout layout = this.dialog;
        layout.iconView.setImageDrawable(drawable);
        layout.iconContainerView.setVisibility(drawable != null ? 0 : 8);
    }

    public final void setMessage(int i) {
        this.dialog.setMessage(getContext().getString(i));
    }

    public final void setNegativeButton(String str, Function0<Unit> function0) {
        function0.getClass();
        Layout layout = this.dialog;
        MooncakePillButton mooncakePillButton = layout.buttonsContainer.secondary;
        mooncakePillButton.setText(str);
        mooncakePillButton.setOnClickListener(new AlertDialogView$$ExternalSyntheticLambda0(5, function0));
        SplitButtons splitButtons = layout.buttonsContainer;
        splitButtons.updateVisibleButtons(splitButtons.getShowingPrimary(), str != null);
    }

    public final void setPositiveButton(String str, Function0<Unit> function0) {
        function0.getClass();
        Layout layout = this.dialog;
        MooncakePillButton mooncakePillButton = layout.buttonsContainer.primary;
        mooncakePillButton.setText(str);
        mooncakePillButton.setOnClickListener(new AlertDialogView$$ExternalSyntheticLambda0(0, function0));
        SplitButtons splitButtons = layout.buttonsContainer;
        splitButtons.updateVisibleButtons(true, splitButtons.getShowingSecondary());
    }

    public final void setTitle(int i) {
        this.dialog.setTitle(getContext().getString(i));
    }

    public final void setMessage(CharSequence charSequence) {
        this.dialog.setMessage(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.dialog.setTitle(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlertDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlertDialogView(Context context) {
        this(context, null, false, 6);
        context.getClass();
    }

    public /* synthetic */ AlertDialogView(Context context, AttributeSet attributeSet, boolean z, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? true : z);
    }

    public final void setIcon(int i) {
        Layout layout = this.dialog;
        layout.iconView.setImageResource(i);
        layout.iconContainerView.setVisibility(0);
    }

    public final void setPositiveButton(int i, Function0<Unit> function0) {
        function0.getClass();
        setPositiveButton(getContext().getString(i), function0);
    }

    public final void setNegativeButton(int i, Function0<Unit> function0) {
        function0.getClass();
        setNegativeButton(getContext().getString(i), function0);
    }
}
