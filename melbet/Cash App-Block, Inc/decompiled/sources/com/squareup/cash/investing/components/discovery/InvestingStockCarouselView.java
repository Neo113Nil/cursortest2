package com.squareup.cash.investing.components.discovery;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.viewpager2.widget.CompositeOnPageChangeCallback;
import androidx.viewpager2.widget.ViewPager2;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.tabs.TabLayout;
import com.squareup.cash.R;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.components.MooncakeInvestingStockRowView$Factory$Impl;
import com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryCarouselView$Factory$Impl;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.overlays.FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1;
import com.squareup.cash.ui.widget.NonFocusableTabLayout;
import com.squareup.cash.ui.widget.recycler.CashRecyclerView$observer$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import net.oneformapp.PopEncryptorV2_;

/* loaded from: classes4.dex */
public final class InvestingStockCarouselView extends AbstractComposeView {
    public final ParcelableSnapshotMutableIntState currentPage$delegate;
    public final InvestingStockCarouselPagerAdapter pageAdapter;
    public final ParcelableSnapshotMutableIntState pageCount$delegate;
    public final NonFocusableTabLayout pageIndicators;
    public final ViewPager2 stocksViewPager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockCarouselView(Context context, Ui.EventReceiver eventReceiver, MooncakeInvestingCategoryCarouselView$Factory$Impl mooncakeInvestingCategoryCarouselView$Factory$Impl, MooncakeInvestingStockRowView$Factory$Impl mooncakeInvestingStockRowView$Factory$Impl, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        context.getClass();
        eventReceiver.getClass();
        mooncakeInvestingCategoryCarouselView$Factory$Impl.getClass();
        mooncakeInvestingStockRowView$Factory$Impl.getClass();
        realImageLoader.getClass();
        InvestingStockCarouselPagerAdapter investingStockCarouselPagerAdapter = new InvestingStockCarouselPagerAdapter(eventReceiver, mooncakeInvestingCategoryCarouselView$Factory$Impl, mooncakeInvestingStockRowView$Factory$Impl, realImageLoader);
        this.pageAdapter = investingStockCarouselPagerAdapter;
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(R.id.investing_components_stocks_carousel);
        viewPager2.setAdapter(investingStockCarouselPagerAdapter);
        this.stocksViewPager = viewPager2;
        this.currentPage$delegate = new ParcelableSnapshotMutableIntState(0);
        this.pageCount$delegate = new ParcelableSnapshotMutableIntState(0);
        final NonFocusableTabLayout nonFocusableTabLayout = new NonFocusableTabLayout(context);
        nonFocusableTabLayout.setTabGravity(1);
        nonFocusableTabLayout.setTabIconTint(ColorStateList.valueOf(-65536));
        nonFocusableTabLayout.setSelectedTabIndicator((Drawable) null);
        MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3 = new MaterialButton$$ExternalSyntheticLambda3(nonFocusableTabLayout, 20);
        PopEncryptorV2_ popEncryptorV2_ = new PopEncryptorV2_();
        popEncryptorV2_.encryptionKey = nonFocusableTabLayout;
        popEncryptorV2_.hmacKey = viewPager2;
        popEncryptorV2_.cryptor = materialButton$$ExternalSyntheticLambda3;
        if (popEncryptorV2_.isInit) {
            a$$ExternalSyntheticBUOutline0.m$1("TabLayoutMediator is already attached");
            throw null;
        }
        RecyclerView.Adapter adapter = viewPager2.mRecyclerView.mAdapter;
        popEncryptorV2_.authStore = adapter;
        if (adapter == null) {
            a$$ExternalSyntheticBUOutline0.m$1("TabLayoutMediator attached before ViewPager2 has an adapter");
            throw null;
        }
        popEncryptorV2_.isInit = true;
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback(nonFocusableTabLayout) { // from class: com.google.android.material.tabs.TabLayoutMediator$TabLayoutOnPageChangeCallback
            public final WeakReference tabLayoutRef;
            public int scrollState = 0;
            public int previousScrollState = 0;

            {
                this.tabLayoutRef = new WeakReference(nonFocusableTabLayout);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void onPageScrollStateChanged(int i) {
                this.previousScrollState = this.scrollState;
                this.scrollState = i;
                TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
                if (tabLayout != null) {
                    tabLayout.viewPagerScrollState = this.scrollState;
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void onPageScrolled(int i, float f, int i2) {
                boolean z;
                TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
                if (tabLayout != null) {
                    int i3 = this.scrollState;
                    boolean z2 = true;
                    if (i3 != 2 || this.previousScrollState == 1) {
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    if (i3 == 2 && this.previousScrollState == 0) {
                        z = false;
                    }
                    tabLayout.setScrollPosition(i, f, z2, z, false);
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void onPageSelected(int i) {
                TabLayout tabLayout = (TabLayout) this.tabLayoutRef.get();
                if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.tabs.size()) {
                    return;
                }
                int i2 = this.scrollState;
                tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.previousScrollState == 0));
            }
        });
        TabLayout.ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new TabLayout.ViewPagerOnTabSelectedListener(viewPager2, 1);
        ArrayList arrayList = nonFocusableTabLayout.selectedListeners;
        if (!arrayList.contains(viewPagerOnTabSelectedListener)) {
            arrayList.add(viewPagerOnTabSelectedListener);
        }
        ((RecyclerView.Adapter) popEncryptorV2_.authStore).registerAdapterDataObserver(new CashRecyclerView$observer$1(popEncryptorV2_, 3));
        popEncryptorV2_.populateTabsFromPagerAdapter();
        nonFocusableTabLayout.setScrollPosition(viewPager2.mCurrentItem, RecyclerView.DECELERATION_RATE, true);
        this.pageIndicators = nonFocusableTabLayout;
        setBackground(PlatformKt.getDrawableCompat(context, R.drawable.tile_bottom, Integer.valueOf(ThemeHelpersKt.themeInfo(this).colorPalette.background)));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2102184750);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        final int i4 = 1;
        final int i5 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.investing_components_stock_carousel_next_page);
            String stringResource2 = Room.stringResource(gapComposer, R.string.investing_components_stock_carousel_previous_page);
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function1(this) { // from class: com.squareup.cash.investing.components.discovery.InvestingStockCarouselView$$ExternalSyntheticLambda1
                    public final /* synthetic */ InvestingStockCarouselView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = i5;
                        InvestingStockCarouselView investingStockCarouselView = this.f$0;
                        switch (i6) {
                            case 0:
                                ((DisposableEffectScope) obj).getClass();
                                CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(investingStockCarouselView, 4);
                                investingStockCarouselView.stocksViewPager.registerOnPageChangeCallback(compositeOnPageChangeCallback);
                                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(3, investingStockCarouselView, compositeOnPageChangeCallback);
                            case 1:
                                ((Context) obj).getClass();
                                return investingStockCarouselView.stocksViewPager;
                            default:
                                ((Context) obj).getClass();
                                return investingStockCarouselView.pageIndicators;
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(this.stocksViewPager, (Function1) rememberedValue, gapComposer);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean changedInstance2 = gapComposer.changedInstance(this);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function1(this) { // from class: com.squareup.cash.investing.components.discovery.InvestingStockCarouselView$$ExternalSyntheticLambda1
                    public final /* synthetic */ InvestingStockCarouselView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = i4;
                        InvestingStockCarouselView investingStockCarouselView = this.f$0;
                        switch (i6) {
                            case 0:
                                ((DisposableEffectScope) obj).getClass();
                                CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(investingStockCarouselView, 4);
                                investingStockCarouselView.stocksViewPager.registerOnPageChangeCallback(compositeOnPageChangeCallback);
                                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(3, investingStockCarouselView, compositeOnPageChangeCallback);
                            case 1:
                                ((Context) obj).getClass();
                                return investingStockCarouselView.stocksViewPager;
                            default:
                                ((Context) obj).getClass();
                                return investingStockCarouselView.pageIndicators;
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function1 = (Function1) rememberedValue2;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changed(stringResource) | gapComposer.changed(stringResource2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new GpsConfigQueries$$ExternalSyntheticLambda3(21, this, stringResource, stringResource2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AndroidView_androidKt.AndroidView(function1, SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue3), null, gapComposer, 0, 4);
            boolean changedInstance4 = gapComposer.changedInstance(this);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new Function1(this) { // from class: com.squareup.cash.investing.components.discovery.InvestingStockCarouselView$$ExternalSyntheticLambda1
                    public final /* synthetic */ InvestingStockCarouselView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = i2;
                        InvestingStockCarouselView investingStockCarouselView = this.f$0;
                        switch (i6) {
                            case 0:
                                ((DisposableEffectScope) obj).getClass();
                                CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(investingStockCarouselView, 4);
                                investingStockCarouselView.stocksViewPager.registerOnPageChangeCallback(compositeOnPageChangeCallback);
                                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(3, investingStockCarouselView, compositeOnPageChangeCallback);
                            case 1:
                                ((Context) obj).getClass();
                                return investingStockCarouselView.stocksViewPager;
                            default:
                                ((Context) obj).getClass();
                                return investingStockCarouselView.pageIndicators;
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            AndroidView_androidKt.AndroidView((Function1) rememberedValue4, SizeKt.wrapContentWidth$default(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterHorizontally, 2), null, gapComposer, 48, 4);
            re$$ExternalSyntheticOutline0.m(companion, 16.0f, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda5(this, i, 6);
        }
    }
}
