package com.squareup.cash.shopping.views;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.CashtagViewKt$Cashtag$1$1;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.savings.views.FullTransferInViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewModel;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.stablecoin.viewmodels.StablecoinHomeViewModel;
import com.squareup.cash.stablecoin.views.StablecoinHomeView$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewModel;
import com.squareup.cash.support.chat.views.ChatImageDetailView$$ExternalSyntheticLambda0;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.support.views.SupportDisputeTrackerView$$ExternalSyntheticLambda1;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.transactionpicker.viewmodels.TransactionPickerViewModel;
import com.squareup.cash.transactionpicker.views.ArcadeTransactionPickerView$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class ProductSearchView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final /* synthetic */ int $r8$classId;
    public final Object imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSearchView(Context context, RealImageLoader realImageLoader, int i) {
        super(context);
        this.$r8$classId = i;
        context.getClass();
        switch (i) {
            case 4:
                realImageLoader.getClass();
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 5:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            default:
                this.imageLoader = realImageLoader;
                break;
        }
    }

    public void Content(ProductSearchViewModel productSearchViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(671712153);
        int i2 = i | (gapComposer.changedInstance(productSearchViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (productSearchViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            Object[] objArr = new Object[0];
            boolean changedInstance = gapComposer.changedInstance(productSearchViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BottomSheet$$ExternalSyntheticLambda2(productSearchViewModel, 22);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 0);
            Unit unit = Unit.INSTANCE;
            int i3 = i2 & 112;
            boolean changed = gapComposer.changed(mutableState) | (i3 == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CashtagViewKt$Cashtag$1$1(function1, mutableState, null, 8);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            String str = ((ProductSearchViewState) mutableState.getValue()).searchText;
            boolean changed2 = gapComposer.changed(mutableState) | (i3 == 32);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new CashtagViewKt$Cashtag$1$1(function1, mutableState, null, 9);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue4);
            boolean changed3 = gapComposer.changed(mutableState) | gapComposer.changedInstance(productSearchViewModel);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new ProfileCropView.AnonymousClass3(productSearchViewModel, mutableState, null, 26);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer, productSearchViewModel, (Function2) rememberedValue5);
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1747013332, new SwipeToDismissKt$$ExternalSyntheticLambda3((Object) productSearchViewModel, (Object) mutableState, (Object) focusRequester, (Object) view, function1, (Object) this, 23), gapComposer), gapComposer, 6);
            boolean changedInstance2 = gapComposer.changedInstance(view);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new BrandsSearchView$$ExternalSyntheticLambda4(view, 4);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue6, gapComposer);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(this, productSearchViewModel, function1, i, 24);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSearchView(Context context, RealImageLoader realImageLoader) {
        super(context);
        this.$r8$classId = 1;
        context.getClass();
        this.imageLoader = realImageLoader;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductSearchView(ContextThemeWrapper contextThemeWrapper, RealImageLoader realImageLoader, int i) {
        super(contextThemeWrapper);
        this.$r8$classId = i;
        this.imageLoader = realImageLoader;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSearchView(Context context, RealCashVibrator realCashVibrator) {
        super(context);
        this.$r8$classId = 6;
        context.getClass();
        this.imageLoader = realCashVibrator;
    }

    public void Content(final AmountPickerViewModel amountPickerViewModel, final Function1 function1, Composer composer, final int i) {
        ProductSearchView productSearchView;
        AmountPickerViewModel amountPickerViewModel2;
        final Function1 function12;
        final int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1536446386);
        int i3 = (gapComposer.changedInstance(amountPickerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        byte b = 0;
        int i4 = 1;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            productSearchView = this;
            amountPickerViewModel2 = amountPickerViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (amountPickerViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2(this, amountPickerViewModel, function1, i, i5) { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionCustomPercentageView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ProductSearchView f$0;
                        public final /* synthetic */ AmountPickerViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i5;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            AmountPickerViewModel amountPickerViewModel3 = this.f$1;
                            ProductSearchView productSearchView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    productSearchView2.Content(amountPickerViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    productSearchView2.Content(amountPickerViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            productSearchView = this;
            amountPickerViewModel2 = amountPickerViewModel;
            i2 = i;
            function12 = function1;
            Updater.CompositionLocalProvider(LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime((RealCashVibrator) productSearchView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1633725554, new FullTransferInViewKt$$ExternalSyntheticLambda1(amountPickerViewModel2, function12, i4, b), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final AmountPickerViewModel amountPickerViewModel3 = amountPickerViewModel2;
            final ProductSearchView productSearchView2 = productSearchView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(productSearchView2, amountPickerViewModel3, function12, i2, i6) { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionCustomPercentageView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ProductSearchView f$0;
                public final /* synthetic */ AmountPickerViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = productSearchView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.$r8$classId;
                    Function1 function13 = this.f$2;
                    AmountPickerViewModel amountPickerViewModel32 = this.f$1;
                    ProductSearchView productSearchView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            productSearchView22.Content(amountPickerViewModel32, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            productSearchView22.Content(amountPickerViewModel32, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void Content(ChatImageDetailViewModel chatImageDetailViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-363572527);
        int i2 = (gapComposer.changedInstance(chatImageDetailViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (chatImageDetailViewModel != null) {
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(1044907302, new ChatImageDetailView$$ExternalSyntheticLambda0(chatImageDetailViewModel, this, function1), gapComposer), gapComposer, 3072, 6);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChatImageDetailView$$ExternalSyntheticLambda0(this, chatImageDetailViewModel, function1, i);
        }
    }

    public void Content(StablecoinHomeViewModel stablecoinHomeViewModel, Function1 function1, Composer composer, int i) {
        ProductSearchView productSearchView;
        StablecoinHomeViewModel stablecoinHomeViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1731929881);
        int i3 = (gapComposer.changedInstance(stablecoinHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            productSearchView = this;
            stablecoinHomeViewModel2 = stablecoinHomeViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (stablecoinHomeViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new StablecoinHomeView$$ExternalSyntheticLambda0(this, stablecoinHomeViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            productSearchView = this;
            stablecoinHomeViewModel2 = stablecoinHomeViewModel;
            function12 = function1;
            i2 = i;
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1685988724, new StablecoinHomeView$$ExternalSyntheticLambda0(function12, stablecoinHomeViewModel2, productSearchView), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            int i4 = i2;
            endRestartGroup2.block = new StablecoinHomeView$$ExternalSyntheticLambda0(productSearchView, stablecoinHomeViewModel2, function12, i4, 2);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                Content((ProductSearchViewModel) obj, function1, gapComposer, 0);
                break;
            case 1:
                Content((StablecoinHomeViewModel) obj, function1, gapComposer, 0);
                break;
            case 2:
                Content((ChatImageDetailViewModel) obj, function1, gapComposer, 0);
                break;
            case 3:
                Content((SupportDisputeTrackerViewModel) obj, function1, gapComposer, 0);
                break;
            case 4:
                Content((SupportHomeViewModel) obj, function1, gapComposer, 0);
                break;
            case 5:
                Content((TransactionPickerViewModel) obj, function1, gapComposer, 0);
                break;
            default:
                Content((AmountPickerViewModel) obj, function1, gapComposer, 0);
                break;
        }
    }

    public void Content(TransactionPickerViewModel transactionPickerViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-796554198);
        int i2 = (gapComposer.changedInstance(transactionPickerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (transactionPickerViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime((RealImageLoader) this.imageLoader), Expect_jvmKt.rememberComposableLambda(-1682833174, new ArcadeTransactionPickerView$$ExternalSyntheticLambda0(transactionPickerViewModel, function1, i3), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(this, transactionPickerViewModel, function1, i, 6);
        }
    }

    public void Content(final SupportDisputeTrackerViewModel supportDisputeTrackerViewModel, final Function1 function1, Composer composer, final int i) {
        ProductSearchView productSearchView;
        SupportDisputeTrackerViewModel supportDisputeTrackerViewModel2;
        final Function1 function12;
        final int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1910656612);
        int i3 = (gapComposer.changedInstance(supportDisputeTrackerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i4 = 0;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            productSearchView = this;
            supportDisputeTrackerViewModel2 = supportDisputeTrackerViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (supportDisputeTrackerViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2(this, supportDisputeTrackerViewModel, function1, i, i5) { // from class: com.squareup.cash.support.views.SupportDisputeTrackerView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ProductSearchView f$0;
                        public final /* synthetic */ SupportDisputeTrackerViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i5;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            SupportDisputeTrackerViewModel supportDisputeTrackerViewModel3 = this.f$1;
                            ProductSearchView productSearchView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    productSearchView2.Content(supportDisputeTrackerViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    productSearchView2.Content(supportDisputeTrackerViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            productSearchView = this;
            supportDisputeTrackerViewModel2 = supportDisputeTrackerViewModel;
            function12 = function1;
            i2 = i;
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime((RealImageLoader) productSearchView.imageLoader), Expect_jvmKt.rememberComposableLambda(-680152284, new SupportDisputeTrackerView$$ExternalSyntheticLambda1(supportDisputeTrackerViewModel2, function12, i4), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final SupportDisputeTrackerViewModel supportDisputeTrackerViewModel3 = supportDisputeTrackerViewModel2;
            final ProductSearchView productSearchView2 = productSearchView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(productSearchView2, supportDisputeTrackerViewModel3, function12, i2, i6) { // from class: com.squareup.cash.support.views.SupportDisputeTrackerView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ProductSearchView f$0;
                public final /* synthetic */ SupportDisputeTrackerViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = productSearchView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.$r8$classId;
                    Function1 function13 = this.f$2;
                    SupportDisputeTrackerViewModel supportDisputeTrackerViewModel32 = this.f$1;
                    ProductSearchView productSearchView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            productSearchView22.Content(supportDisputeTrackerViewModel32, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            productSearchView22.Content(supportDisputeTrackerViewModel32, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void Content(final SupportHomeViewModel supportHomeViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1527809898);
        int i3 = (gapComposer.changedInstance(supportHomeViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3 | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (supportHomeViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2(this) { // from class: com.squareup.cash.support.views.home.SupportHomeView$$ExternalSyntheticLambda0
                        public final /* synthetic */ ProductSearchView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            int i7 = i;
                            Function1 function12 = function1;
                            SupportHomeViewModel supportHomeViewModel2 = supportHomeViewModel;
                            ProductSearchView productSearchView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    productSearchView.Content(supportHomeViewModel2, function12, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                default:
                                    productSearchView.Content(supportHomeViewModel2, function12, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i2 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-102411969, new TabToolbarsKt$$ExternalSyntheticLambda6(27, this, supportHomeViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i6 = 1;
            final int i7 = i2;
            endRestartGroup2.block = new Function2(this) { // from class: com.squareup.cash.support.views.home.SupportHomeView$$ExternalSyntheticLambda0
                public final /* synthetic */ ProductSearchView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    int i72 = i7;
                    Function1 function12 = function1;
                    SupportHomeViewModel supportHomeViewModel2 = supportHomeViewModel;
                    ProductSearchView productSearchView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            productSearchView.Content(supportHomeViewModel2, function12, composer2, Updater.updateChangedFlags(i72 | 1));
                            break;
                        default:
                            productSearchView.Content(supportHomeViewModel2, function12, composer2, Updater.updateChangedFlags(i72 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
