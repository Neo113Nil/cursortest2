package com.squareup.cash.portfolio.graphs.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.investingcrypto.components.common.drawables.FixedSizeDrawable;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.support.chat.views.ChatImageDetailViewKt$$ExternalSyntheticLambda5;
import com.squareup.contour.ContourLayout;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$SCALE$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class InvestingGraphTabsView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ColorPalette colorPalette;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingGraphTabsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        boolean z;
        context.getClass();
        this.colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        contourWidthMatchParent();
        contourHeightOf(new UtilsKt$$ExternalSyntheticLambda0(this, 24));
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new HistoricalRange[]{HistoricalRange.DAY, HistoricalRange.WEEK, HistoricalRange.MONTH, HistoricalRange.YEAR, HistoricalRange.ALL});
        boolean z2 = (6 & 4) == 0;
        ColorPalette colorPalette = this.colorPalette;
        listOf.getClass();
        if (listOf.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        removeAllViews();
        int i3 = 0;
        for (Object obj : listOf) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            HistoricalRange historicalRange = (HistoricalRange) obj;
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            int ordinal = historicalRange.ordinal();
            if (ordinal == 0) {
                i = R.string.investing_graph_1_day;
            } else if (ordinal == 1) {
                i = R.string.investing_graph_1_week;
            } else if (ordinal == 2) {
                i = R.string.investing_graph_1_month;
            } else if (ordinal == 3) {
                i = R.string.investing_graph_1_year;
            } else {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i = R.string.investing_graph_all;
            }
            appCompatTextView.setText(i);
            int ordinal2 = historicalRange.ordinal();
            if (ordinal2 == 0) {
                i2 = R.string.investing_graph_1_day_contentdescription;
            } else if (ordinal2 == 1) {
                i2 = R.string.investing_graph_1_week_contentdescription;
            } else if (ordinal2 == 2) {
                i2 = R.string.investing_graph_1_month_contentdescription;
            } else if (ordinal2 == 3) {
                i2 = R.string.investing_graph_1_year_contentdescription;
            } else {
                if (ordinal2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i2 = R.string.investing_graph_all_contentdescription;
            }
            Views$SCALE$1 views$SCALE$1 = Views.SCALE;
            appCompatTextView.setContentDescription(appCompatTextView.getContext().getResources().getString(i2));
            colorPalette.getClass();
            int i5 = colorPalette.secondaryButtonBackground;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(i5);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(-16777216);
            RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i5), null, gradientDrawable2);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_activated}, gradientDrawable);
            stateListDrawable.addState(new int[0], rippleDrawable);
            appCompatTextView.setBackground(new FixedSizeDrawable(stateListDrawable, getDip(40), getDip(40)));
            appCompatTextView.setGravity(17);
            Strings.applyStyle(appCompatTextView, TextStyles.identifier);
            if (z2) {
                appCompatTextView.setTextColor(colorPalette.placeholderLabel);
                z = false;
            } else {
                appCompatTextView.setTextColor(colorPalette.label);
                z = true;
            }
            appCompatTextView.setEnabled(z);
            ContourLayout.layoutBy$default(this, appCompatTextView, ContourLayout.leftTo(new LazyListState$$ExternalSyntheticLambda3(i3, this, 13)), ContourLayout.topTo(new PoolsListViewKt$$ExternalSyntheticLambda6(12)));
            appCompatTextView.setTag(historicalRange);
            i3 = i4;
        }
    }

    public final void onToggle(Function1 function1) {
        function1.getClass();
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                return;
            } else {
                ((View) viewGroupKt$iterator$1.next()).setOnClickListener(new ChatImageDetailViewKt$$ExternalSyntheticLambda5(1, function1));
            }
        }
    }

    public final void selectToggle(HistoricalRange historicalRange) {
        boolean z;
        historicalRange.getClass();
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            } else {
                ((View) it.next()).setActivated(false);
            }
        }
        Iterator it2 = new ViewGroupKt$children$1(this).iterator();
        Object obj = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((View) next).getTag() == historicalRange) {
                if (z) {
                    a$$ExternalSyntheticBUOutline0.m$3("Sequence contains more than one matching element.");
                    return;
                } else {
                    obj = next;
                    z = true;
                }
            }
        }
        if (z) {
            ((View) obj).setActivated(true);
        } else {
            OptionalProvider$$ExternalSyntheticLambda0.m("Sequence contains no element matching the predicate.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestingGraphTabsView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ InvestingGraphTabsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
