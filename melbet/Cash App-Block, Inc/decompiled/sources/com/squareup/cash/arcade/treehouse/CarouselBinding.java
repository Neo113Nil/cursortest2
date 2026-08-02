package com.squareup.cash.arcade.treehouse;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.cash.broadway.navigation.Navigator;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.MutableListChildren;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.formview.components.FormCustomizedCardView;
import com.squareup.cash.history.treehouse.views.ActivityInviteFriendsView;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.treehouse.android.views.TreehouseErrorView;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;

/* loaded from: classes7.dex */
public final class CarouselBinding implements Widget {
    public final /* synthetic */ int $r8$classId;
    public final Object children;
    public Modifier modifier;
    public Object value;

    public CarouselBinding(Context context, int i) {
        this.$r8$classId = i;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 1:
                this.value = context;
                this.modifier = companion;
                ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleSmall);
                progressBar.setPadding(Views.dip((View) progressBar, 12), Views.dip((View) progressBar, 8), Views.dip((View) progressBar, 12), Views.dip((View) progressBar, 8));
                this.children = progressBar;
                break;
            case 2:
                ColorPalette colorPalette = ThemeHelpersKt.findThemeInfo(context).colorPalette;
                this.modifier = companion;
                FrameLayout frameLayout = new FrameLayout(context);
                PaintDrawable paintDrawable = new PaintDrawable(colorPalette.secondaryBackground);
                paintDrawable.setCornerRadius(Views.dip((View) frameLayout, 16.0f));
                frameLayout.setBackground(paintDrawable);
                this.value = frameLayout;
                this.children = new UnleashContext(frameLayout);
                break;
            case 3:
                ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(context);
                this.modifier = companion;
                SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(context);
                swipeRefreshLayout.setColorSchemeResources(com.squareup.cash.R.color.standard_green_normal);
                swipeRefreshLayout.setProgressBackgroundColorSchemeColor(findThemeInfo.colorPalette.background);
                this.value = swipeRefreshLayout;
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.children = frameLayout2;
                swipeRefreshLayout.addView(frameLayout2, -1, -1);
                break;
            case 4:
            default:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setPadding(Views.dip((View) linearLayout, 14), 0, Views.dip((View) linearLayout, 14), 0);
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                horizontalScrollView.addView(linearLayout);
                this.value = horizontalScrollView;
                this.modifier = companion;
                this.children = new UnleashContext(linearLayout);
                break;
            case 5:
                this.value = new View(context);
                this.children = new MutableListChildren(null, 3);
                this.modifier = companion;
                break;
            case 6:
                context.getClass();
                PageTagSlotKt$$ExternalSyntheticLambda0 pageTagSlotKt$$ExternalSyntheticLambda0 = new PageTagSlotKt$$ExternalSyntheticLambda0(this, 6);
                TreehouseErrorView treehouseErrorView = new TreehouseErrorView(context);
                ColorPalette colorPalette2 = ThemeHelpersKt.findThemeInfo(context).colorPalette;
                AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                appCompatImageView.setImageResource(com.squareup.cash.R.drawable.mooncake_error);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(colorPalette2.error));
                appCompatImageView.setPaddingRelative(appCompatImageView.getPaddingStart(), appCompatImageView.getPaddingTop(), appCompatImageView.getPaddingEnd(), Views.dip((View) appCompatImageView, 12));
                FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
                figmaTextView.setGravity(17);
                figmaTextView.setTextAlignment(4);
                Strings.applyStyle(figmaTextView, TextStyles.mainTitle);
                figmaTextView.setTextColor(colorPalette2.label);
                figmaTextView.setText(com.squareup.cash.R.string.something_went_wrong);
                figmaTextView.setPaddingRelative(figmaTextView.getPaddingStart(), figmaTextView.getPaddingTop(), figmaTextView.getPaddingEnd(), Views.dip((View) figmaTextView, 12));
                FormCustomizedCardView formCustomizedCardView = new FormCustomizedCardView(context, pageTagSlotKt$$ExternalSyntheticLambda0);
                treehouseErrorView.setOrientation(1);
                treehouseErrorView.setGravity(17);
                treehouseErrorView.setPaddingRelative(Views.dip((View) treehouseErrorView, 24), Views.dip((View) treehouseErrorView, 12), Views.dip((View) treehouseErrorView, 24), Views.dip((View) treehouseErrorView, 12));
                treehouseErrorView.addView(appCompatImageView, new LinearLayout.LayoutParams(-1, -2));
                treehouseErrorView.addView(figmaTextView, new LinearLayout.LayoutParams(-1, -2));
                treehouseErrorView.addView(formCustomizedCardView, new LinearLayout.LayoutParams(-2, -2));
                this.children = treehouseErrorView;
                this.modifier = companion;
                break;
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        switch (this.$r8$classId) {
        }
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        switch (this.$r8$classId) {
            case 0:
                return (HorizontalScrollView) this.value;
            case 1:
                return (ProgressBar) this.children;
            case 2:
                return (FrameLayout) this.value;
            case 3:
                return (SwipeRefreshLayout) this.value;
            case 4:
                return (ActivityInviteFriendsView) this.children;
            case 5:
                return (View) this.value;
            default:
                return (TreehouseErrorView) this.children;
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        int i = this.$r8$classId;
        modifier.getClass();
        switch (i) {
            case 0:
                this.modifier = modifier;
                break;
            case 1:
                this.modifier = modifier;
                break;
            case 2:
                this.modifier = modifier;
                break;
            case 3:
                this.modifier = modifier;
                break;
            case 4:
                this.modifier = modifier;
                break;
            case 5:
                this.modifier = modifier;
                break;
            default:
                this.modifier = modifier;
                break;
        }
    }

    public CarouselBinding(Instrument$Adapter instrument$Adapter, Navigator navigator, Context context) {
        this.$r8$classId = 4;
        navigator.getClass();
        this.value = new MutableListChildren(null, 3);
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.children = new ActivityInviteFriendsView(instrument$Adapter, navigator, context);
    }
}
