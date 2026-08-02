package com.squareup.cash.merchant.views;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewModel;
import com.squareup.cash.cashapppay.settings.views.UnlinkResultViewKt;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.deposits.physical.view.details.LocationDetailSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.instruments.views.SelectPaymentInstrumentView$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltySheetViewModel;
import com.squareup.cash.merchant.views.SquareLoyaltySheetView;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.offers.viewmodels.OffersFilterGroupSheetViewModel;
import com.squareup.cash.offers.views.OffersFilterGroupSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import com.withpersona.sdk2.camera.ContextUtilsKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class SquareLoyaltySheetView extends ComposeUiView implements OutsideTapCloses, BottomSheetConfig {
    public final /* synthetic */ int $r8$classId;
    public final RealImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareLoyaltySheetView(Context context, RealImageLoader realImageLoader, int i) {
        super(context);
        this.$r8$classId = i;
        context.getClass();
        switch (i) {
            case 1:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 2:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 3:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 4:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            default:
                this.imageLoader = realImageLoader;
                break;
        }
    }

    public void Content(SquareLoyaltySheetViewModel squareLoyaltySheetViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1323735872);
        int i2 = (gapComposer.changedInstance(squareLoyaltySheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (squareLoyaltySheetViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SquareLoyaltySheetView$$ExternalSyntheticLambda0(this, squareLoyaltySheetViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(20, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(749789067, new SquareLoyaltySheetView$$ExternalSyntheticLambda0(this, squareLoyaltySheetViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new SquareLoyaltySheetView$$ExternalSyntheticLambda0(this, squareLoyaltySheetViewModel, function1, i, 2);
        }
    }

    public void GenericTreeElementsSection(Modifier modifier, GenericTreeElementsViewModel genericTreeElementsViewModel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1282492443);
        int i2 = i | 6 | (gapComposer.changedInstance(genericTreeElementsViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(this) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1333424290, new MusicViewKt$$ExternalSyntheticLambda7(12, function1), gapComposer);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ContextUtilsKt.GenericTreeElements(genericTreeElementsViewModel, m302paddingqDBjuR0$default, this.imageLoader, true, rememberComposableLambda, (Function1) rememberedValue, gapComposer, ((i2 >> 3) & 14) | 27648, 0);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(this, modifier2, genericTreeElementsViewModel, function1, i);
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        switch (this.$r8$classId) {
        }
        return Navigation.ArcadeBottomSheetStyle(this);
    }

    public void Content(OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1440345560);
        int i2 = (gapComposer.changedInstance(offersFilterGroupSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (offersFilterGroupSheetViewModel != null) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1891981597, new OffersFilterGroupSheetView$$ExternalSyntheticLambda0(this, offersFilterGroupSheetViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersFilterGroupSheetView$$ExternalSyntheticLambda0(this, offersFilterGroupSheetViewModel, function1, i);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                Content((SquareLoyaltySheetViewModel) obj, function1, gapComposer, 0);
                break;
            case 1:
                Content((LinkedBusinessDetailsViewModel) obj, function1, gapComposer, 0);
                break;
            case 2:
                Content((LocationDetailsViewModel) obj, function1, gapComposer, 0);
                break;
            case 3:
                Content((SelectPaymentInstrumentViewModel) obj, function1, gapComposer, 0);
                break;
            default:
                Content((OffersFilterGroupSheetViewModel) obj, function1, gapComposer, 0);
                break;
        }
    }

    public void Content(final LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel, final Function1 function1, Composer composer, final int i) {
        SquareLoyaltySheetView squareLoyaltySheetView;
        final LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel2;
        final Function1 function12;
        final int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1941087566);
        int i3 = (gapComposer.changedInstance(linkedBusinessDetailsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            squareLoyaltySheetView = this;
            linkedBusinessDetailsViewModel2 = linkedBusinessDetailsViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (linkedBusinessDetailsViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, linkedBusinessDetailsViewModel, function1, i, i4) { // from class: com.squareup.cash.cashapppay.settings.views.LinkedBusinessDetailsSheetView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ SquareLoyaltySheetView f$0;
                        public final /* synthetic */ LinkedBusinessDetailsViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel3 = this.f$1;
                            SquareLoyaltySheetView squareLoyaltySheetView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    squareLoyaltySheetView2.Content(linkedBusinessDetailsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    squareLoyaltySheetView2.Content(linkedBusinessDetailsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            squareLoyaltySheetView = this;
            linkedBusinessDetailsViewModel2 = linkedBusinessDetailsViewModel;
            function12 = function1;
            i2 = i;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(18, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            UnlinkResultViewKt.LinkedBusinessDetailSheet(linkedBusinessDetailsViewModel2, squareLoyaltySheetView.imageLoader, function12, gapComposer, (i3 & 14) | ((i3 << 3) & 896));
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final SquareLoyaltySheetView squareLoyaltySheetView2 = squareLoyaltySheetView;
            final int i5 = 1;
            endRestartGroup2.block = new Function2(squareLoyaltySheetView2, linkedBusinessDetailsViewModel2, function12, i2, i5) { // from class: com.squareup.cash.cashapppay.settings.views.LinkedBusinessDetailsSheetView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ SquareLoyaltySheetView f$0;
                public final /* synthetic */ LinkedBusinessDetailsViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = squareLoyaltySheetView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function13 = this.f$2;
                    LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel3 = this.f$1;
                    SquareLoyaltySheetView squareLoyaltySheetView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            squareLoyaltySheetView22.Content(linkedBusinessDetailsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            squareLoyaltySheetView22.Content(linkedBusinessDetailsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void Content(SelectPaymentInstrumentViewModel selectPaymentInstrumentViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1400772463);
        int i2 = (gapComposer.changedInstance(selectPaymentInstrumentViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (selectPaymentInstrumentViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(514493487, new SelectPaymentInstrumentView$$ExternalSyntheticLambda0(selectPaymentInstrumentViewModel, function1, 0), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) this, (Object) selectPaymentInstrumentViewModel, (Function) function1, i, 8);
        }
    }

    public void Content(LocationDetailsViewModel locationDetailsViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-381757522);
        int i2 = (gapComposer.changedInstance(locationDetailsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (locationDetailsViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-2034984210, new LocationDetailSheetView$$ExternalSyntheticLambda0(locationDetailsViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2((Object) this, (Object) locationDetailsViewModel, function1, i, 6);
        }
    }
}
