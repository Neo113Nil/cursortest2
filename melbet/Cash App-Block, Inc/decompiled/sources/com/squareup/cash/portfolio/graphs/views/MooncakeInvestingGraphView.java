package com.squareup.cash.portfolio.graphs.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.BundleKt;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.libraries.places.internal.zzbsy;
import com.google.mlkit.vision.common.zzb;
import com.robinhood.spark.animation.MorphSparkAnimator;
import com.squareup.cash.R;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.mooncake.components.MooncakeProgress;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.HasTop$DefaultImpls;
import com.squareup.util.android.animation.Interpolators;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final class MooncakeInvestingGraphView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Integer colorOverride;
    public final ComposeView errorView;
    public final TextView eventLabel;
    public boolean forceScrubbed;
    public final InvestingGraphAdapter graphAdapter;
    public LoaderYPosition loaderYPosition;
    public final MooncakeProgress loadingView;
    public boolean performedHaptic;
    public Function1 scrubListener;
    public boolean shouldStaleDataShowError;
    public final CashSparkView sparkView;
    public final zzbsy styler;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LoaderYPosition {
        public static final /* synthetic */ LoaderYPosition[] $VALUES;
        public static final LoaderYPosition BELOW_EVENT_LABEL;
        public static final LoaderYPosition VERTICALLY_CENTERED;

        static {
            LoaderYPosition loaderYPosition = new LoaderYPosition("BELOW_EVENT_LABEL", 0);
            BELOW_EVENT_LABEL = loaderYPosition;
            LoaderYPosition loaderYPosition2 = new LoaderYPosition("VERTICALLY_CENTERED", 1);
            VERTICALLY_CENTERED = loaderYPosition2;
            $VALUES = new LoaderYPosition[]{loaderYPosition, loaderYPosition2};
        }

        public static LoaderYPosition valueOf(String str) {
            return (LoaderYPosition) Enum.valueOf(LoaderYPosition.class, str);
        }

        public static LoaderYPosition[] values() {
            return (LoaderYPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MooncakeInvestingGraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        TextView textView = new TextView(context);
        textView.setGravity(81);
        textView.setTextSize(12.0f);
        BundleKt.setTypeface(textView, R.font.cashsans_regular);
        textView.setLines(2);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), getDip(9));
        this.eventLabel = textView;
        AttributeSet attributeSet2 = null;
        CashSparkView cashSparkView = new CashSparkView(context, null, 0, 14);
        this.sparkView = cashSparkView;
        int i = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        MooncakeProgress mooncakeProgress = new MooncakeProgress(context, attributeSet2, false, i, defaultConstructorMarker);
        mooncakeProgress.setVisibility(8);
        this.loadingView = mooncakeProgress;
        ComposeView composeView = new ComposeView(context, attributeSet2, 0 == true ? 1 : 0, i, defaultConstructorMarker);
        composeView.setVisibility(8);
        composeView.setContent(InvestingGraphTabsViewKt.lambda$549870069);
        this.errorView = composeView;
        this.loaderYPosition = LoaderYPosition.BELOW_EVENT_LABEL;
        zzbsy zzbsyVar = new zzbsy();
        this.styler = zzbsyVar;
        InvestingGraphAdapter investingGraphAdapter = new InvestingGraphAdapter(zzbsyVar);
        this.graphAdapter = investingGraphAdapter;
        contourHeightOf(new MooncakeInvestingGraphView$$ExternalSyntheticLambda0(this, 6));
        ContourLayout.layoutBy$default(this, textView, ContourLayout.leftTo(new PoolsListViewKt$$ExternalSyntheticLambda6(19)), ContourLayout.topTo(new PoolsListViewKt$$ExternalSyntheticLambda6(20)));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new PoolsListViewKt$$ExternalSyntheticLambda6(21));
        leftTo.rightTo(1, new PoolsListViewKt$$ExternalSyntheticLambda6(22));
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new MooncakeInvestingGraphView$$ExternalSyntheticLambda0(this, 1));
        HasTop$DefaultImpls.bottomTo$default(byteArrayProtoReader32, new PoolsListViewKt$$ExternalSyntheticLambda6(15));
        ContourLayout.layoutBy$default(this, cashSparkView, leftTo, byteArrayProtoReader32);
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new MooncakeInvestingGraphView$$ExternalSyntheticLambda0(this, 2));
        leftTo2.rightTo(1, new MooncakeInvestingGraphView$$ExternalSyntheticLambda0(this, 3));
        ContourLayout.layoutBy$default(this, composeView, leftTo2, ContourLayout.centerVerticallyTo(new PoolsListViewKt$$ExternalSyntheticLambda6(16)));
        cashSparkView.setAdapter(investingGraphAdapter);
        cashSparkView.setEventDotRadius(cashSparkView.getResources().getDimension(R.dimen.investing_graph_event_radius));
        cashSparkView.setFillType(0);
        cashSparkView.setScrubListener(new zzb(this));
        cashSparkView.setScrubEnabled(false);
        MorphSparkAnimator morphSparkAnimator = new MorphSparkAnimator();
        morphSparkAnimator.setDuration(200L);
        morphSparkAnimator.setInterpolator(Interpolators.ACCEL_DECEL);
        cashSparkView.setSparkAnimator(morphSparkAnimator);
        updateLoadingPosition();
    }

    public final void render(InvestingGraphContentModel investingGraphContentModel) {
        investingGraphContentModel.getClass();
        boolean z = investingGraphContentModel instanceof InvestingGraphContentModel.Loaded;
        InvestingGraphContentModel.Loaded loaded = z ? (InvestingGraphContentModel.Loaded) investingGraphContentModel : null;
        boolean trendDirectionIsPositive = loaded != null ? loaded.trendDirectionIsPositive() : true;
        zzbsy zzbsyVar = this.styler;
        boolean areEqual = Intrinsics.areEqual((Boolean) zzbsyVar.zzg, Boolean.valueOf(trendDirectionIsPositive));
        zzbsyVar.zzg = Boolean.valueOf(trendDirectionIsPositive);
        int asColorInt = InvestingGraphTabsViewKt.asColorInt(investingGraphContentModel.getAccentColor(), this);
        TextView textView = this.eventLabel;
        CashSparkView cashSparkView = this.sparkView;
        if (!areEqual || asColorInt != zzbsyVar.zza) {
            zzbsyVar.zza = asColorInt;
            Integer num = this.colorOverride;
            zzbsyVar.zzh = num;
            new MoneyTabUIKt$$ExternalSyntheticLambda24(num != null, 17).invoke(textView);
            cashSparkView.updateStyling();
        }
        Fade fade = new Fade();
        ArrayList arrayList = fade.mTargetExcludes;
        if (textView != null) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(textView)) {
                arrayList.add(textView);
            }
        }
        fade.mTargetExcludes = arrayList;
        fade.mDuration = 150L;
        TransitionManager.beginDelayedTransition(this, fade);
        boolean z2 = investingGraphContentModel instanceof InvestingGraphContentModel.Error;
        this.errorView.setVisibility((z2 || (this.shouldStaleDataShowError && (investingGraphContentModel.getAccentColor() instanceof InvestingGraphContentModel$AccentColorType$StaleData))) ? 0 : 8);
        boolean z3 = investingGraphContentModel instanceof InvestingGraphContentModel.Loading;
        this.loadingView.setVisibility(z3 ? 0 : 8);
        cashSparkView.setVisibility((z2 || (this.shouldStaleDataShowError && (investingGraphContentModel.getAccentColor() instanceof InvestingGraphContentModel$AccentColorType$StaleData))) ? 4 : 0);
        ArrayList arrayList2 = cashSparkView.xPoints;
        cashSparkView.setScrubEnabled(this.scrubListener != null);
        InvestingGraphAdapter investingGraphAdapter = this.graphAdapter;
        if (z3) {
            investingGraphAdapter.setContent(investingGraphContentModel);
            return;
        }
        if (z) {
            investingGraphAdapter.setContent(investingGraphContentModel);
            if (this.forceScrubbed) {
                return;
            }
            IntRange until = RangesKt___RangesKt.until(0, new ArrayList(arrayList2).size());
            Integer num2 = ((InvestingGraphContentModel.Loaded) investingGraphContentModel).forceScrubIndex;
            if (num2 == null || !until.contains(num2.intValue())) {
                return;
            }
            int intValue = num2.intValue();
            cashSparkView.scrubTo(((Float) arrayList2.get(intValue)).floatValue(), intValue);
            this.forceScrubbed = true;
        }
    }

    public final void setColorOverride(Integer num) {
        this.colorOverride = num;
    }

    public final void setEventLabelSize(float f) {
        this.eventLabel.setTextSize(f);
    }

    public final void setLineWidthOverride(Float f) {
        this.styler.zzi = f;
        this.sparkView.updateStyling();
    }

    public final void setLoaderYPosition(LoaderYPosition loaderYPosition) {
        loaderYPosition.getClass();
        this.loaderYPosition = loaderYPosition;
        updateLoadingPosition();
    }

    public final void setScrubListener(Function1<? super InvestingGraphContentModel.Point, Unit> function1) {
        this.sparkView.setScrubEnabled(function1 != null);
        this.eventLabel.setVisibility(function1 == null ? 8 : 0);
        this.scrubListener = function1;
    }

    public final void setShouldStaleDataShowError(boolean z) {
        this.shouldStaleDataShowError = z;
    }

    public final void setSmoothed(boolean z) {
        InvestingGraphAdapter investingGraphAdapter = this.graphAdapter;
        if (investingGraphAdapter.smoothData == z) {
            return;
        }
        investingGraphAdapter.smoothData = z;
        investingGraphAdapter.observable.notifyChanged();
    }

    public final void updateLoadingPosition() {
        ByteArrayProtoReader32 byteArrayProtoReader32;
        int ordinal = this.loaderYPosition.ordinal();
        if (ordinal == 0) {
            byteArrayProtoReader32 = ContourLayout.topTo(new MooncakeInvestingGraphView$$ExternalSyntheticLambda0(this, 0));
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            byteArrayProtoReader32 = ContourLayout.centerVerticallyTo(new PoolsListViewKt$$ExternalSyntheticLambda6(17));
        }
        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new PoolsListViewKt$$ExternalSyntheticLambda6(18));
        centerHorizontallyTo.widthOf(1, new MooncakeInvestingGraphView$$ExternalSyntheticLambda0(this, 4));
        byteArrayProtoReader32.heightOf(1, new MooncakeInvestingGraphView$$ExternalSyntheticLambda0(this, 5));
        ContourLayout.layoutBy$default(this, this.loadingView, centerHorizontallyTo, byteArrayProtoReader32);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MooncakeInvestingGraphView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ MooncakeInvestingGraphView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
