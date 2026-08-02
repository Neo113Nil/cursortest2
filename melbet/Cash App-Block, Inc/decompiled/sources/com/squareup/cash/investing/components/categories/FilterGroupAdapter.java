package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.map.BrandCollectionSheetViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill;
import com.squareup.cash.investing.viewmodels.categories.InvestingFilterPillViewModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FilterGroupAdapter extends ListAdapter {
    public BrandCollectionSheetViewKt$$ExternalSyntheticLambda0 listener;

    public final class DiffItemCallback extends DiffUtil {
        public static final DiffItemCallback INSTANCE = new DiffItemCallback();

        @Override // androidx.recyclerview.widget.DiffUtil
        public final boolean areContentsTheSame(Object obj, Object obj2) {
            return ((InvestingFilterPillViewModel) obj).equals((InvestingFilterPillViewModel) obj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil
        public final boolean areItemsTheSame(Object obj, Object obj2) {
            return Intrinsics.areEqual(((InvestingFilterPillViewModel) obj).filterGroupToken, ((InvestingFilterPillViewModel) obj2).filterGroupToken);
        }
    }

    public final class ViewHolder extends RecyclerView.ViewHolder {
        public final InvestingCategoryFilterPill view;

        public ViewHolder(InvestingCategoryFilterPill investingCategoryFilterPill) {
            super(investingCategoryFilterPill);
            this.view = investingCategoryFilterPill;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Drawable drawable;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.getClass();
        InvestingFilterPillViewModel investingFilterPillViewModel = (InvestingFilterPillViewModel) this.mDiffer.mReadOnlyList.get(i);
        InvestingCategoryFilterPill investingCategoryFilterPill = viewHolder2.view;
        investingFilterPillViewModel.getClass();
        AppCompatImageView appCompatImageView = investingCategoryFilterPill.postfixIcon;
        ColorPalette colorPalette = investingCategoryFilterPill.palette;
        AppCompatTextView appCompatTextView = investingCategoryFilterPill.selectedCountBadge;
        AppCompatTextView appCompatTextView2 = investingCategoryFilterPill.label;
        String str = investingFilterPillViewModel.label;
        int i2 = investingFilterPillViewModel.selectedFiltersCount;
        appCompatTextView2.setText(str);
        AppCompatImageView appCompatImageView2 = investingCategoryFilterPill.prefixIcon;
        SyncInvestmentCategory.PrefixIcon prefixIcon = investingFilterPillViewModel.prefixIcon;
        appCompatImageView2.setVisibility(prefixIcon != null ? 0 : 8);
        int i3 = prefixIcon == null ? -1 : InvestingCategoryFilterPill.WhenMappings.$EnumSwitchMapping$0[prefixIcon.ordinal()];
        if (i3 != -1) {
            if (i3 == 1) {
                drawable = investingCategoryFilterPill.arrowUp;
            } else if (i3 == 2) {
                drawable = investingCategoryFilterPill.arrowDown;
            } else if (i3 != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            appCompatImageView2.setImageDrawable(drawable);
            int i4 = ThemeHelpersKt.themeInfo(investingCategoryFilterPill).colorPalette.tint;
            if (i2 != 0) {
                appCompatTextView.setVisibility(8);
                investingCategoryFilterPill.setBackground(investingCategoryFilterPill.createOutlineDrawable(null));
                appCompatTextView2.setTextColor(i4);
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(i4));
                appCompatImageView.setImageTintList(ColorStateList.valueOf(i4));
            } else {
                if (i2 == 1) {
                    appCompatTextView.setVisibility(8);
                } else {
                    appCompatTextView.setVisibility(0);
                    appCompatTextView.setText(String.valueOf(i2));
                    appCompatTextView.setTextColor(i4);
                }
                investingCategoryFilterPill.setBackground(investingCategoryFilterPill.createOutlineDrawable(Integer.valueOf(i4)));
                int i5 = colorPalette.background;
                appCompatTextView2.setTextColor(i5);
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(i5));
                appCompatImageView.setImageTintList(ColorStateList.valueOf(i5));
            }
            if (this.listener == null) {
                investingCategoryFilterPill.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(24, this, investingFilterPillViewModel));
                return;
            } else {
                investingCategoryFilterPill.setOnClickListener(null);
                investingCategoryFilterPill.setClickable(false);
                return;
            }
        }
        drawable = null;
        appCompatImageView2.setImageDrawable(drawable);
        int i42 = ThemeHelpersKt.themeInfo(investingCategoryFilterPill).colorPalette.tint;
        if (i2 != 0) {
        }
        if (this.listener == null) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        return new ViewHolder(new InvestingCategoryFilterPill(context));
    }
}
