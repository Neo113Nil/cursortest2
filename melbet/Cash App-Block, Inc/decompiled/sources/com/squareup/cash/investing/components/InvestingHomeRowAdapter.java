package com.squareup.cash.investing.components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.components.categories.CategoryAdapter;
import com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryCarouselView;
import com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryCarouselView$Factory$Impl;
import com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryTileView$Factory$Impl;
import com.squareup.cash.investing.components.common.InvestingTileHeaderView;
import com.squareup.cash.investing.components.discovery.InvestingStockCarouselPagerAdapter;
import com.squareup.cash.investing.components.discovery.InvestingStockCarouselView;
import com.squareup.cash.investing.components.families.DependentAutoInvestView;
import com.squareup.cash.investing.components.families.DependentInvestingActivityView;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.StockContentModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.util.BalanceAnimator;
import com.squareup.util.android.Views;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda39;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.Delegates;
import kotlin.properties.NotNullVar;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.KClasses$$Lambda$2;

/* loaded from: classes6.dex */
public final class InvestingHomeRowAdapter extends RecyclerView.Adapter {
    public static final AtomicReference avatarAnimation = new AtomicReference();
    public final MooncakeInvestingCategoryCarouselView$Factory$Impl categoryCarouselViewFactory;
    public final Context context;
    public List data;
    public Ui.EventReceiver eventReceiver;
    public final RealImageLoader imageLoader;
    public final MooncakeInvestingStockRowView$Factory$Impl stockRowViewFactory;
    public final boolean tileRows;

    public abstract class ViewHolder extends RecyclerView.ViewHolder {

        public abstract class BorderedViewHolder extends ViewHolder {
            public final ComposeView border;
            public final ViewGroup content;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public BorderedViewHolder(ViewGroup viewGroup) {
                super(r0);
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                Context context = viewGroup.getContext();
                context.getClass();
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                this.content = viewGroup;
                this.border = composeView;
                frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                frameLayout.addView(viewGroup, new FrameLayout.LayoutParams(-1, -2));
                frameLayout.addView(composeView, new FrameLayout.LayoutParams(-1, -1));
            }
        }

        public final class CarouselViewHolder extends BorderedViewHolder {
            public final InvestingStockCarouselView view;

            public CarouselViewHolder(InvestingStockCarouselView investingStockCarouselView) {
                super(investingStockCarouselView);
                this.view = investingStockCarouselView;
            }
        }

        public final class CategoryCarouselViewHolder extends ViewHolder {
            public final MooncakeInvestingCategoryCarouselView view;

            public CategoryCarouselViewHolder(MooncakeInvestingCategoryCarouselView mooncakeInvestingCategoryCarouselView) {
                super(mooncakeInvestingCategoryCarouselView);
                this.view = mooncakeInvestingCategoryCarouselView;
            }
        }

        public final class DependentActivityViewHolder extends BorderedViewHolder {
            public final DependentInvestingActivityView view;

            public DependentActivityViewHolder(DependentInvestingActivityView dependentInvestingActivityView) {
                super(dependentInvestingActivityView);
                this.view = dependentInvestingActivityView;
            }
        }

        public final class DependentAutoInvestViewHolder extends BorderedViewHolder {
            public final DependentAutoInvestView view;

            public DependentAutoInvestViewHolder(DependentAutoInvestView dependentAutoInvestView) {
                super(dependentAutoInvestView);
                this.view = dependentAutoInvestView;
            }
        }

        public final class HeaderViewHolder extends BorderedViewHolder {
            public static final /* synthetic */ KProperty[] $$delegatedProperties = {new MutablePropertyReference1Impl(HeaderViewHolder.class, "needsTopMargin", "getNeedsTopMargin()Z", 0)};
            public final NotNullVar needsTopMargin$delegate;
            public final InvestingTileHeaderView view;

            public HeaderViewHolder(InvestingTileHeaderView investingTileHeaderView) {
                super(investingTileHeaderView);
                this.view = investingTileHeaderView;
                Delegates.INSTANCE.getClass();
                this.needsTopMargin$delegate = new NotNullVar();
            }
        }

        public final class StockViewHolder extends BorderedViewHolder {
            public final MooncakeInvestingStockRowView stockView;

            public StockViewHolder(MooncakeInvestingStockRowView mooncakeInvestingStockRowView) {
                super(mooncakeInvestingStockRowView);
                this.stockView = mooncakeInvestingStockRowView;
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction.values().length];
            try {
                InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction headerAction = InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction.CHANGE_SORTING_ORDER;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction headerAction2 = InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction.CHANGE_SORTING_ORDER;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InvestingHomeRowAdapter(Context context, boolean z, MooncakeInvestingCategoryCarouselView$Factory$Impl mooncakeInvestingCategoryCarouselView$Factory$Impl, MooncakeInvestingStockRowView$Factory$Impl mooncakeInvestingStockRowView$Factory$Impl, RealImageLoader realImageLoader) {
        context.getClass();
        mooncakeInvestingCategoryCarouselView$Factory$Impl.getClass();
        mooncakeInvestingStockRowView$Factory$Impl.getClass();
        realImageLoader.getClass();
        this.context = context;
        this.tileRows = z;
        this.categoryCarouselViewFactory = mooncakeInvestingCategoryCarouselView$Factory$Impl;
        this.stockRowViewFactory = mooncakeInvestingStockRowView$Factory$Impl;
        this.imageLoader = realImageLoader;
        setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
        this.data = EmptyList.INSTANCE;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((InvestingHomeViewModel.InvestingHomeRow) this.data.get(i)).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        InvestingHomeViewModel.InvestingHomeRow investingHomeRow = (InvestingHomeViewModel.InvestingHomeRow) this.data.get(i);
        if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.Header) {
            return 4;
        }
        if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.Stock) {
            InvestingHomeViewModel.InvestingHomeRow.Stock stock = (InvestingHomeViewModel.InvestingHomeRow.Stock) investingHomeRow;
            if (stock instanceof InvestingHomeViewModel.InvestingHomeRow.Stock.Portfolio) {
                return 5;
            }
            if ((stock instanceof InvestingHomeViewModel.InvestingHomeRow.Stock.Following) || (stock instanceof InvestingHomeViewModel.InvestingHomeRow.Stock.Discovery)) {
                return 6;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.StockCarousel) {
            return 7;
        }
        if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.CategoryCarousel) {
            return 11;
        }
        if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.DependentActivity) {
            return 19;
        }
        if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.DependentAutoInvest) {
            return 20;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x010e  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        Object obj;
        AtomicReference atomicReference;
        int i2;
        Drawable drawable;
        int i3;
        InvestingTileHeaderView.TileHeaderAction tileHeaderAction;
        InvestingTileHeaderView.TileHeaderDescriptionColor tileHeaderDescriptionColor;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.getClass();
        InvestingHomeViewModel.InvestingHomeRow investingHomeRow = (InvestingHomeViewModel.InvestingHomeRow) this.data.get(i);
        boolean z = investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.Header;
        final int i4 = 2;
        final int i5 = 1;
        final int i6 = 0;
        if (z) {
            ViewHolder.HeaderViewHolder headerViewHolder = (ViewHolder.HeaderViewHolder) viewHolder2;
            InvestingHomeViewModel.InvestingHomeRow.Header header = (InvestingHomeViewModel.InvestingHomeRow.Header) investingHomeRow;
            InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction headerAction = header.action;
            boolean z2 = header.id != -2;
            NotNullVar notNullVar = headerViewHolder.needsTopMargin$delegate;
            j = -2;
            InvestingTileHeaderView investingTileHeaderView = headerViewHolder.view;
            notNullVar.setValue(headerViewHolder, ViewHolder.HeaderViewHolder.$$delegatedProperties[0], Boolean.valueOf(z2));
            investingTileHeaderView.getClass();
            String str = header.title;
            String str2 = header.description;
            int i7 = headerAction == null ? -1 : InvestingTileHeaderViewKt$WhenMappings.$EnumSwitchMapping$1[headerAction.ordinal()];
            if (i7 == -1) {
                tileHeaderAction = null;
            } else if (i7 == 1) {
                tileHeaderAction = InvestingTileHeaderView.TileHeaderAction.CHANGE_SORTING_ORDER;
            } else {
                if (i7 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                tileHeaderAction = InvestingTileHeaderView.TileHeaderAction.CHANGE_SORTING_ORDER;
            }
            int ordinal = header.descriptionColor.ordinal();
            if (ordinal == 0) {
                tileHeaderDescriptionColor = InvestingTileHeaderView.TileHeaderDescriptionColor.SECONDARY;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                tileHeaderDescriptionColor = InvestingTileHeaderView.TileHeaderDescriptionColor.TERTIARY;
            }
            investingTileHeaderView.render(str, str2, tileHeaderAction, tileHeaderDescriptionColor);
            int i8 = headerAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[headerAction.ordinal()];
            if (i8 == -1) {
                investingTileHeaderView.setOnActionClickListener(null);
            } else if (i8 == 1) {
                investingTileHeaderView.setOnActionClickListener(new IntentLauncher$$ExternalSyntheticLambda0(6, this, header));
            } else {
                if (i8 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                investingTileHeaderView.setOnActionClickListener(new Function0(this) { // from class: com.squareup.cash.investing.components.InvestingHomeRowAdapter$$ExternalSyntheticLambda1
                    public final /* synthetic */ InvestingHomeRowAdapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i6;
                        InvestingHomeRowAdapter investingHomeRowAdapter = this.f$0;
                        switch (i9) {
                            case 0:
                                Ui.EventReceiver eventReceiver = investingHomeRowAdapter.eventReceiver;
                                if (eventReceiver != null) {
                                    eventReceiver.sendEvent(InvestingHomeViewEvent.ShowPortfolioPerformance.INSTANCE);
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            case 1:
                                Ui.EventReceiver eventReceiver2 = investingHomeRowAdapter.eventReceiver;
                                if (eventReceiver2 != null) {
                                    eventReceiver2.sendEvent(new InvestingHomeViewEvent.ClickStockMetric(-2L));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            case 2:
                                Ui.EventReceiver eventReceiver3 = investingHomeRowAdapter.eventReceiver;
                                if (eventReceiver3 != null) {
                                    eventReceiver3.sendEvent(new InvestingHomeViewEvent.ClickStockMetric(-3L));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            default:
                                Ui.EventReceiver eventReceiver4 = investingHomeRowAdapter.eventReceiver;
                                if (eventReceiver4 != null) {
                                    eventReceiver4.sendEvent(InvestingHomeViewEvent.DependentAutoInvestInfoClicked.INSTANCE);
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                        }
                    }
                });
            }
        } else {
            j = -2;
            if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.Stock) {
                ViewHolder.StockViewHolder stockViewHolder = (ViewHolder.StockViewHolder) viewHolder2;
                InvestingHomeViewModel.InvestingHomeRow.Stock stock = (InvestingHomeViewModel.InvestingHomeRow.Stock) investingHomeRow;
                StockContentModel contentModel = stock.getContentModel();
                boolean z3 = investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.Stock.Portfolio;
                boolean z4 = investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.Stock.Following;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = stockViewHolder.stockView;
                mooncakeInvestingStockRowView.render(contentModel, z3 || z4);
                stockViewHolder.itemView.setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda39(5, stockViewHolder, this, stock));
                if (z3) {
                    mooncakeInvestingStockRowView.setOnMetricClickListener(new Function0(this) { // from class: com.squareup.cash.investing.components.InvestingHomeRowAdapter$$ExternalSyntheticLambda1
                        public final /* synthetic */ InvestingHomeRowAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i9 = i5;
                            InvestingHomeRowAdapter investingHomeRowAdapter = this.f$0;
                            switch (i9) {
                                case 0:
                                    Ui.EventReceiver eventReceiver = investingHomeRowAdapter.eventReceiver;
                                    if (eventReceiver != null) {
                                        eventReceiver.sendEvent(InvestingHomeViewEvent.ShowPortfolioPerformance.INSTANCE);
                                        return Unit.INSTANCE;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                case 1:
                                    Ui.EventReceiver eventReceiver2 = investingHomeRowAdapter.eventReceiver;
                                    if (eventReceiver2 != null) {
                                        eventReceiver2.sendEvent(new InvestingHomeViewEvent.ClickStockMetric(-2L));
                                        return Unit.INSTANCE;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                case 2:
                                    Ui.EventReceiver eventReceiver3 = investingHomeRowAdapter.eventReceiver;
                                    if (eventReceiver3 != null) {
                                        eventReceiver3.sendEvent(new InvestingHomeViewEvent.ClickStockMetric(-3L));
                                        return Unit.INSTANCE;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                default:
                                    Ui.EventReceiver eventReceiver4 = investingHomeRowAdapter.eventReceiver;
                                    if (eventReceiver4 != null) {
                                        eventReceiver4.sendEvent(InvestingHomeViewEvent.DependentAutoInvestInfoClicked.INSTANCE);
                                        return Unit.INSTANCE;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                            }
                        }
                    });
                } else if (z4) {
                    mooncakeInvestingStockRowView.setOnMetricClickListener(new Function0(this) { // from class: com.squareup.cash.investing.components.InvestingHomeRowAdapter$$ExternalSyntheticLambda1
                        public final /* synthetic */ InvestingHomeRowAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i9 = i4;
                            InvestingHomeRowAdapter investingHomeRowAdapter = this.f$0;
                            switch (i9) {
                                case 0:
                                    Ui.EventReceiver eventReceiver = investingHomeRowAdapter.eventReceiver;
                                    if (eventReceiver != null) {
                                        eventReceiver.sendEvent(InvestingHomeViewEvent.ShowPortfolioPerformance.INSTANCE);
                                        return Unit.INSTANCE;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                case 1:
                                    Ui.EventReceiver eventReceiver2 = investingHomeRowAdapter.eventReceiver;
                                    if (eventReceiver2 != null) {
                                        eventReceiver2.sendEvent(new InvestingHomeViewEvent.ClickStockMetric(-2L));
                                        return Unit.INSTANCE;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                case 2:
                                    Ui.EventReceiver eventReceiver3 = investingHomeRowAdapter.eventReceiver;
                                    if (eventReceiver3 != null) {
                                        eventReceiver3.sendEvent(new InvestingHomeViewEvent.ClickStockMetric(-3L));
                                        return Unit.INSTANCE;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                default:
                                    Ui.EventReceiver eventReceiver4 = investingHomeRowAdapter.eventReceiver;
                                    if (eventReceiver4 != null) {
                                        eventReceiver4.sendEvent(InvestingHomeViewEvent.DependentAutoInvestInfoClicked.INSTANCE);
                                        return Unit.INSTANCE;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                            }
                        }
                    });
                } else {
                    obj = null;
                    mooncakeInvestingStockRowView.setOnMetricClickListener(null);
                    atomicReference = avatarAnimation;
                    if (atomicReference.get() == null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return;
                    } else if (Intrinsics.areEqual(obj, contentModel.investmentEntityToken)) {
                        atomicReference.getAndSet(obj).getClass();
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return;
                    }
                }
                obj = null;
                atomicReference = avatarAnimation;
                if (atomicReference.get() == null) {
                }
            } else if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.StockCarousel) {
                InvestingStockCarouselView investingStockCarouselView = ((ViewHolder.CarouselViewHolder) viewHolder2).view;
                ArrayList arrayList = ((InvestingHomeViewModel.InvestingHomeRow.StockCarousel) investingHomeRow).pages;
                investingStockCarouselView.getClass();
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = investingStockCarouselView.pageCount$delegate;
                InvestingStockCarouselPagerAdapter investingStockCarouselPagerAdapter = investingStockCarouselView.pageAdapter;
                investingStockCarouselPagerAdapter.getClass();
                investingStockCarouselPagerAdapter.pages = arrayList;
                investingStockCarouselPagerAdapter.notifyDataSetChanged();
                parcelableSnapshotMutableIntState.setIntValue(arrayList.size());
                investingStockCarouselView.currentPage$delegate.setIntValue(parcelableSnapshotMutableIntState.getIntValue() == 0 ? 0 : Math.min(investingStockCarouselView.stocksViewPager.mCurrentItem, parcelableSnapshotMutableIntState.getIntValue() - 1));
            } else if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.CategoryCarousel) {
                MooncakeInvestingCategoryCarouselView mooncakeInvestingCategoryCarouselView = ((ViewHolder.CategoryCarouselViewHolder) viewHolder2).view;
                GpsConfigQueries$$ExternalSyntheticLambda2 gpsConfigQueries$$ExternalSyntheticLambda2 = new GpsConfigQueries$$ExternalSyntheticLambda2(this, 21);
                mooncakeInvestingCategoryCarouselView.getClass();
                CategoryAdapter categoryAdapter = mooncakeInvestingCategoryCarouselView.tileAdapter;
                ArrayList arrayList2 = ((InvestingHomeViewModel.InvestingHomeRow.CategoryCarousel) investingHomeRow).tiles;
                categoryAdapter.getClass();
                categoryAdapter.data = arrayList2;
                categoryAdapter.notifyDataSetChanged();
                categoryAdapter.listener = gpsConfigQueries$$ExternalSyntheticLambda2;
            } else if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.DependentActivity) {
                ((ViewHolder.DependentActivityViewHolder) viewHolder2).view.setModel(((InvestingHomeViewModel.InvestingHomeRow.DependentActivity) investingHomeRow).activityModel);
            } else {
                if (!(investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.DependentAutoInvest)) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(investingHomeRow, "Unexpected equityRow: ");
                    return;
                }
                DependentAutoInvestView dependentAutoInvestView = ((ViewHolder.DependentAutoInvestViewHolder) viewHolder2).view;
                dependentAutoInvestView.setModel(((InvestingHomeViewModel.InvestingHomeRow.DependentAutoInvest) investingHomeRow).model);
                dependentAutoInvestView.setOnAutoInvestItemClicked(new KClasses$$Lambda$2(this, 16));
                final int i9 = 3;
                dependentAutoInvestView.setOnAutoInvestInfoClicked(new Function0(this) { // from class: com.squareup.cash.investing.components.InvestingHomeRowAdapter$$ExternalSyntheticLambda1
                    public final /* synthetic */ InvestingHomeRowAdapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i92 = i9;
                        InvestingHomeRowAdapter investingHomeRowAdapter = this.f$0;
                        switch (i92) {
                            case 0:
                                Ui.EventReceiver eventReceiver = investingHomeRowAdapter.eventReceiver;
                                if (eventReceiver != null) {
                                    eventReceiver.sendEvent(InvestingHomeViewEvent.ShowPortfolioPerformance.INSTANCE);
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            case 1:
                                Ui.EventReceiver eventReceiver2 = investingHomeRowAdapter.eventReceiver;
                                if (eventReceiver2 != null) {
                                    eventReceiver2.sendEvent(new InvestingHomeViewEvent.ClickStockMetric(-2L));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            case 2:
                                Ui.EventReceiver eventReceiver3 = investingHomeRowAdapter.eventReceiver;
                                if (eventReceiver3 != null) {
                                    eventReceiver3.sendEvent(new InvestingHomeViewEvent.ClickStockMetric(-3L));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            default:
                                Ui.EventReceiver eventReceiver4 = investingHomeRowAdapter.eventReceiver;
                                if (eventReceiver4 != null) {
                                    eventReceiver4.sendEvent(InvestingHomeViewEvent.DependentAutoInvestInfoClicked.INSTANCE);
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                        }
                    }
                });
            }
        }
        boolean z5 = this.tileRows;
        if (z5) {
            View view = viewHolder2.itemView;
            view.getClass();
            ColorPalette colorPalette = ThemeHelpersKt.themeInfo(view).colorPalette;
            Context context = this.context;
            if (z) {
                long j2 = ((InvestingHomeViewModel.InvestingHomeRow.Header) investingHomeRow).id;
                ComposeView composeView = ((ViewHolder.HeaderViewHolder) viewHolder2).border;
                if (j2 == j) {
                    i3 = 0;
                    ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(composeView, false, false);
                    drawable = new ColorDrawable(-1);
                    i2 = i3;
                } else {
                    ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(composeView, true, false);
                    drawable = PlatformKt.getDrawableCompat(context, R.drawable.tile_top, null);
                    i2 = 0;
                }
            } else {
                if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.Stock) {
                    ViewHolder.StockViewHolder stockViewHolder2 = (ViewHolder.StockViewHolder) viewHolder2;
                    ComposeView composeView2 = stockViewHolder2.border;
                    ViewGroup viewGroup = stockViewHolder2.content;
                    ((MooncakeInvestingStockRowView) viewGroup).setBackground(null);
                    if (i != this.data.size() - 1) {
                        int i10 = i + 1;
                        if (!(this.data.get(i10) instanceof InvestingHomeViewModel.InvestingHomeRow.Header) && !(this.data.get(i10) instanceof InvestingHomeViewModel.InvestingHomeRow.CategoryCarousel)) {
                            i3 = 0;
                            ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(composeView2, false, false);
                            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), 0);
                            drawable = new ColorDrawable(-1);
                            i2 = i3;
                        }
                    }
                    ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(composeView2, false, true);
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewHolder2.itemView.getResources().getDimensionPixelSize(R.dimen.investing_components_tile_vertical_margin));
                    drawable = PlatformKt.getDrawableCompat(context, R.drawable.tile_bottom, null);
                } else if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.DependentActivity) {
                    if (i != this.data.size() - 1) {
                        int i11 = i + 1;
                        if (!(this.data.get(i11) instanceof InvestingHomeViewModel.InvestingHomeRow.Header) && !(this.data.get(i11) instanceof InvestingHomeViewModel.InvestingHomeRow.CategoryCarousel)) {
                            ViewHolder.DependentActivityViewHolder dependentActivityViewHolder = (ViewHolder.DependentActivityViewHolder) viewHolder2;
                            i2 = 0;
                            ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(dependentActivityViewHolder.border, false, false);
                            ViewGroup viewGroup2 = dependentActivityViewHolder.content;
                            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), 0);
                            drawable = new ColorDrawable(-1);
                        }
                    }
                    ViewHolder.DependentActivityViewHolder dependentActivityViewHolder2 = (ViewHolder.DependentActivityViewHolder) viewHolder2;
                    ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(dependentActivityViewHolder2.border, false, true);
                    ViewGroup viewGroup3 = dependentActivityViewHolder2.content;
                    viewGroup3.setPadding(viewGroup3.getPaddingLeft(), viewGroup3.getPaddingTop(), viewGroup3.getPaddingRight(), viewHolder2.itemView.getResources().getDimensionPixelSize(R.dimen.investing_components_tile_vertical_margin));
                    drawable = PlatformKt.getDrawableCompat(context, R.drawable.tile_bottom, null);
                } else if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.DependentAutoInvest) {
                    if (i != this.data.size() - 1) {
                        int i12 = i + 1;
                        if (!(this.data.get(i12) instanceof InvestingHomeViewModel.InvestingHomeRow.Header) && !(this.data.get(i12) instanceof InvestingHomeViewModel.InvestingHomeRow.CategoryCarousel)) {
                            ViewHolder.DependentAutoInvestViewHolder dependentAutoInvestViewHolder = (ViewHolder.DependentAutoInvestViewHolder) viewHolder2;
                            i2 = 0;
                            ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(dependentAutoInvestViewHolder.border, false, false);
                            ViewGroup viewGroup4 = dependentAutoInvestViewHolder.content;
                            viewGroup4.setPadding(viewGroup4.getPaddingLeft(), viewGroup4.getPaddingTop(), viewGroup4.getPaddingRight(), 0);
                            drawable = new ColorDrawable(-1);
                        }
                    }
                    i2 = 0;
                    ViewHolder.DependentAutoInvestViewHolder dependentAutoInvestViewHolder2 = (ViewHolder.DependentAutoInvestViewHolder) viewHolder2;
                    ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(dependentAutoInvestViewHolder2.border, false, true);
                    ViewGroup viewGroup5 = dependentAutoInvestViewHolder2.content;
                    viewGroup5.setPadding(viewGroup5.getPaddingLeft(), viewGroup5.getPaddingTop(), viewGroup5.getPaddingRight(), viewHolder2.itemView.getResources().getDimensionPixelSize(R.dimen.investing_components_tile_vertical_margin));
                    drawable = PlatformKt.getDrawableCompat(context, R.drawable.tile_bottom, null);
                } else {
                    i2 = 0;
                    drawable = null;
                }
                i2 = 0;
            }
            if (drawable != null) {
                drawable.setColorFilter(colorPalette.background, PorterDuff.Mode.SRC_IN);
            }
            if (drawable != null) {
                viewHolder2.itemView.setBackground(drawable);
            }
        } else {
            i2 = 0;
        }
        if (!(investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.CategoryCarousel) && z5) {
            i2 = viewHolder2.itemView.getResources().getDimensionPixelSize(R.dimen.investing_components_tile_horizontal_margin);
        }
        View view2 = viewHolder2.itemView;
        view2.getClass();
        Views.updateMargins$default(view2, i2, 0, i2, 0, 10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.context;
        if (i == 4) {
            InvestingTileHeaderView investingTileHeaderView = new InvestingTileHeaderView(context, null);
            investingTileHeaderView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            return new ViewHolder.HeaderViewHolder(investingTileHeaderView);
        }
        if (i == 5 || i == 6) {
            MooncakeInvestingStockRowView$Factory$Impl mooncakeInvestingStockRowView$Factory$Impl = this.stockRowViewFactory;
            mooncakeInvestingStockRowView$Factory$Impl.getClass();
            context.getClass();
            LoadTimeClock.MetroFactory metroFactory = mooncakeInvestingStockRowView$Factory$Impl.delegateFactory;
            RealImageLoader realImageLoader = (RealImageLoader) metroFactory.clock.invoke();
            BalanceAnimator balanceAnimator = (BalanceAnimator) metroFactory.observabilityManager.invoke();
            realImageLoader.getClass();
            return new ViewHolder.StockViewHolder(new MooncakeInvestingStockRowView(context, realImageLoader, balanceAnimator));
        }
        if (i == 7) {
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
            InvestingStockCarouselView investingStockCarouselView = new InvestingStockCarouselView(this.context, eventReceiver, this.categoryCarouselViewFactory, this.stockRowViewFactory, this.imageLoader);
            investingStockCarouselView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            ViewHolder.CarouselViewHolder carouselViewHolder = new ViewHolder.CarouselViewHolder(investingStockCarouselView);
            ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(carouselViewHolder.border, false, true);
            return carouselViewHolder;
        }
        if (i == 11) {
            MooncakeInvestingCategoryCarouselView$Factory$Impl mooncakeInvestingCategoryCarouselView$Factory$Impl = this.categoryCarouselViewFactory;
            mooncakeInvestingCategoryCarouselView$Factory$Impl.getClass();
            context.getClass();
            RealRouter.MetroFactory metroFactory2 = mooncakeInvestingCategoryCarouselView$Factory$Impl.delegateFactory;
            MooncakeInvestingCategoryTileView$Factory$Impl mooncakeInvestingCategoryTileView$Factory$Impl = (MooncakeInvestingCategoryTileView$Factory$Impl) metroFactory2.urlRouterFactory.value;
            Analytics analytics = (Analytics) metroFactory2.clientRouteRouterFactory.invoke();
            mooncakeInvestingCategoryTileView$Factory$Impl.getClass();
            analytics.getClass();
            return new ViewHolder.CategoryCarouselViewHolder(new MooncakeInvestingCategoryCarouselView(context, mooncakeInvestingCategoryTileView$Factory$Impl, analytics));
        }
        RealImageLoader realImageLoader2 = this.imageLoader;
        if (i == 19) {
            Context context2 = viewGroup.getContext();
            context2.getClass();
            DependentInvestingActivityView dependentInvestingActivityView = new DependentInvestingActivityView(context2, realImageLoader2);
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
            layoutParams.setMargins(Views.dip((View) dependentInvestingActivityView, 24), 0, Views.dip((View) dependentInvestingActivityView, 24), 0);
            dependentInvestingActivityView.setLayoutParams(layoutParams);
            return new ViewHolder.DependentActivityViewHolder(dependentInvestingActivityView);
        }
        if (i != 20) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unexpected viewType "));
            return null;
        }
        Context context3 = viewGroup.getContext();
        context3.getClass();
        DependentAutoInvestView dependentAutoInvestView = new DependentAutoInvestView(context3, realImageLoader2);
        RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(-1, -2);
        layoutParams2.setMargins(Views.dip((View) dependentAutoInvestView, 24), 0, Views.dip((View) dependentAutoInvestView, 24), 0);
        dependentAutoInvestView.setLayoutParams(layoutParams2);
        return new ViewHolder.DependentAutoInvestViewHolder(dependentAutoInvestView);
    }
}
