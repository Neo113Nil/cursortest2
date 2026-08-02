package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.arcade.values.Color;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.ChangeListener;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.mooncake.resources.ResourcesKt;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.protos.common.CurrencyCode;
import java.math.BigDecimal;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class LegacyAmountPickerBinding extends AbstractComposeView implements ChangeListener, Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public String amountCaption;
    public String buttonText;
    public String errorMessage;
    public Long initialAmount;
    public boolean isSymbolExperimentEnabled;
    public final ParcelableSnapshotMutableState model$delegate;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState moneyConfig$delegate;
    public Function1 onAmountChanged;
    public Function1 onAmountSubmitted;
    public PageFetcher$generateNewPagingSource$3 onBackClicked;
    public Function0 onCloseClicked;
    public PageFetcher$generateNewPagingSource$3 onHelpClicked;
    public PageFetcher$generateNewPagingSource$3 onPrimaryAmountToggled;
    public boolean showHelpButton;
    public String subtitle;
    public Color themeColor;
    public String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyAmountPickerBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.buttonText = "";
        this.title = "";
        this.onAmountChanged = new NavBarBinding$$ExternalSyntheticLambda2(22);
        this.onAmountSubmitted = new NavBarBinding$$ExternalSyntheticLambda2(23);
        this.onCloseClicked = new MotionKt$$ExternalSyntheticLambda0(28);
        this.model$delegate = Updater.mutableStateOf$default(AmountPickerViewModel.InitialLoading.INSTANCE);
        this.moneyConfig$delegate = Updater.mutableStateOf$default(new AmountConfig.MoneyConfig(CurrencyCode.USD, null, false, 0, 14));
        this.modifier = Modifier.Companion.$$INSTANCE;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(739393447);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1225744636, new LegacyAmountPickerBinding$$ExternalSyntheticLambda3(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LegacyAmountPickerBinding$$ExternalSyntheticLambda3(this, i);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this;
    }

    @Override // app.cash.redwood.widget.ChangeListener
    public final void onEndChanges() {
        String str;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.buttonText;
        Long l = this.initialAmount;
        if (l != null) {
            long longValue = l.longValue();
            AmountConfig.MoneyConfig moneyConfig = (AmountConfig.MoneyConfig) this.moneyConfig$delegate.getValue();
            BigDecimal bigDecimal = new BigDecimal(longValue);
            BigDecimal movePointRight = BigDecimal.ONE.movePointRight(moneyConfig.getTotalFractionalDigitCount());
            movePointRight.getClass();
            String bigDecimal2 = bigDecimal.divide(movePointRight).toString();
            bigDecimal2.getClass();
            str = bigDecimal2;
        } else {
            str = null;
        }
        Color color = this.themeColor;
        this.model$delegate.setValue(new AmountPickerViewModel.Ready(str2, str3, str4, null, null, false, color != null ? ColorsKt.toProto(color, ResourcesKt.mooncakeResourceIndex) : null, new AmountSelectorWidgetModel(EmptyList.INSTANCE), this.amountCaption, str, false, this.showHelpButton, this.errorMessage, null, 9248));
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
