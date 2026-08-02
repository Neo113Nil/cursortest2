package com.squareup.cash.money.views;

import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda6;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.UpdatesWindowFlags$TabConfig;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.views.CalendarDatePickerKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.offers.views.listing.OffersSearchListingKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.paymentpad.views.HomeViewKt;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.viewmodels.ConfirmRetryResourceDialog;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentToolbarViewModel;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$Origin;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchBounds;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchIcon;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.ui.AlertBannerKt;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.challenge.confirmation.ConfirmationChallengeBridgeHandler;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeUIKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import string.TrimMode;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda32 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ boolean f$6;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda32(LazyListState lazyListState, List list, Function0 function0, Function0 function02, Function1 function1, Function2 function2, boolean z) {
        this.f$0 = list;
        this.f$1 = lazyListState;
        this.f$6 = z;
        this.f$2 = function0;
        this.f$5 = function1;
        this.f$3 = function02;
        this.f$4 = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x049f  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        DynamicColorConfiguration dynamicColorConfiguration;
        PaymentPadTheme paymentPadTheme;
        HomeViewModel homeViewModel;
        String str;
        String str2;
        Painter painter;
        ToolbarConfig toolbarConfig;
        long j;
        long j2;
        boolean z2;
        int i = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        Object obj9 = this.f$0;
        switch (i) {
            case 0:
                ToolbarNestedScrollExpander toolbarNestedScrollExpander = (ToolbarNestedScrollExpander) obj9;
                MoneyTabModel.Loaded loaded = (MoneyTabModel.Loaded) obj8;
                UiScope uiScope = (UiScope) obj7;
                CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj6;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj3) {
                        rememberedValue = AnimatableKt.Animatable(loaded.showCardPeekAnimation ? 0.0f : 1.0f, 0.01f);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Animatable animatable = (Animatable) rememberedValue;
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer.changedInstance(animatable);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj3) {
                        rememberedValue2 = new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, null, 0);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                    Modifier cardToolbarFadeInOut = CardTransitionKt.cardToolbarFadeInOut(AlphaKt.alpha(companion, ((Number) animatable.getValue()).floatValue()), gapComposer);
                    boolean changed = gapComposer.changed(toolbarNestedScrollExpander);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed || rememberedValue3 == obj3) {
                        rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda40(toolbarNestedScrollExpander, 0);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    MoneyTabToolbarKt.MoneyTabToolbar(uiScope, loaded.tabToolbarModel, loaded.tabTitle, loaded.cardThemeId, toolbarNestedScrollExpander, cardNestedScrollExpander, elementBoundsRegistry, function1, ValueInsets.layout(cardToolbarFadeInOut, (Function3) rememberedValue3), true, this.f$6, gapComposer, 805306368, 0, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                SetNameViewModel setNameViewModel = (SetNameViewModel) obj9;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj8;
                Function1 function12 = (Function1) obj4;
                Shaker shaker = (Shaker) obj7;
                MutableState mutableState = (MutableState) obj6;
                InputState inputState = (InputState) obj5;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (rememberedValue4 == obj3) {
                        rememberedValue4 = new SsnViewKt$$ExternalSyntheticLambda0(20);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    boolean z3 = this.f$6;
                    DBUtil.BackHandler(z3, (Function0) rememberedValue4, gapComposer2, 48, 0);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Strings.LoadableFullScreenContent(setNameViewModel, z3, SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)), null, null, Expect_jvmKt.rememberComposableLambda(380665309, new SetNameViewKt$$ExternalSyntheticLambda5(0, delegatingSoftwareKeyboardController, function12, shaker, mutableState, inputState, z3), gapComposer2), gapComposer2, 196608, 24);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj9;
                LazyListState lazyListState = (LazyListState) obj8;
                Function0 function0 = (Function0) obj7;
                Function1 function13 = (Function1) obj4;
                Function0 function02 = (Function0) obj6;
                Function2 function2 = (Function2) obj5;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    OffersSearchListingKt.m3682OffersSearchListingBodygNPyAyM(Modifier.Companion.$$INSTANCE, list, lazyListState, this.f$6, 16.0f, function0, function13, function02, function2, gapComposer3, 24582, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function1 function14 = (Function1) obj4;
                HomeViewModel homeViewModel2 = (HomeViewModel) obj9;
                PaymentPadTheme paymentPadTheme2 = (PaymentPadTheme) obj8;
                SplashScreenAnimationObserver splashScreenAnimationObserver = (SplashScreenAnimationObserver) obj6;
                ElementBoundsRegistry elementBoundsRegistry2 = (ElementBoundsRegistry) obj5;
                UiScope uiScope2 = (UiScope) obj7;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    long j3 = Strings.getColors(gapComposer4).component.titleBar.keypad.icon.f219default;
                    DynamicColorConfiguration m1173invokeRGew2ao = TransactorKt.m1173invokeRGew2ao(0L, j3, 0L, gapComposer4, 5);
                    ToolbarConfig.ColorConfiguration colorConfiguration = new ToolbarConfig.ColorConfiguration(5, 0L, j3);
                    Painter painter2 = Icons.NavigationScanQr.painter(gapComposer4);
                    String stringResource = Room.stringResource(gapComposer4, R.string.paymentpad_qr_button_description);
                    Painter painterResource = Countries.painterResource(R.drawable.ic_nearby_signal_24, 0, gapComposer4);
                    String stringResource2 = Room.stringResource(gapComposer4, R.string.paymentpad_pay_request_nearby_description);
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(function14, gapComposer4);
                    boolean z4 = homeViewModel2 instanceof HomeViewModel.Ready;
                    HomeViewModel.Ready ready = z4 ? (HomeViewModel.Ready) homeViewModel2 : null;
                    TabToolbarInternalViewModel tabToolbarInternalViewModel = ready != null ? ready.toolbarInternalModel : null;
                    boolean z5 = this.f$6;
                    if (z5 && z4) {
                        z = z5;
                        gapComposer4.startReplaceGroup(-2114841669);
                        HomeViewModel.Ready ready2 = (HomeViewModel.Ready) homeViewModel2;
                        dynamicColorConfiguration = m1173invokeRGew2ao;
                        boolean z6 = ready2.showNearbyP2pIcon;
                        HomeViewModel.QrButtonPlacement qrButtonPlacement = ready2.qrButtonPlacement;
                        paymentPadTheme = paymentPadTheme2;
                        boolean changed2 = gapComposer4.changed(qrButtonPlacement.ordinal()) | gapComposer4.changed(z6) | gapComposer4.changed(tabToolbarInternalViewModel) | gapComposer4.changed(colorConfiguration) | gapComposer4.changed(stringResource) | gapComposer4.changed(stringResource2);
                        Object rememberedValue5 = gapComposer4.rememberedValue();
                        if (changed2 || rememberedValue5 == obj3) {
                            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            if (qrButtonPlacement == HomeViewModel.QrButtonPlacement.START) {
                                homeViewModel = homeViewModel2;
                                str = stringResource;
                                createListBuilder.add(new ToolbarConfig.Action(painter2, str, new OverlayKt$$ExternalSyntheticLambda1(9, rememberUpdatedState), ElementBoundsRegistry.Element.KeypadQrButton, 48));
                            } else {
                                homeViewModel = homeViewModel2;
                                str = stringResource;
                            }
                            if (z6) {
                                painter = painterResource;
                                str2 = stringResource2;
                                createListBuilder.add(new ToolbarConfig.Action(painterResource, stringResource2, new OverlayKt$$ExternalSyntheticLambda1(10, rememberUpdatedState), ElementBoundsRegistry.Element.KeypadNearbyButton, 48));
                            } else {
                                str2 = stringResource2;
                                painter = painterResource;
                            }
                            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                            ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            if (qrButtonPlacement == HomeViewModel.QrButtonPlacement.END) {
                                createListBuilder2.add(new ToolbarConfig.Action(painter2, str, new OverlayKt$$ExternalSyntheticLambda1(11, rememberUpdatedState), ElementBoundsRegistry.Element.KeypadQrButton, 48));
                            }
                            ListBuilder build2 = CollectionsKt__CollectionsJVMKt.build(createListBuilder2);
                            DiscoverTabSharedKey$Origin discoverTabSharedKey$Origin = DiscoverTabSharedKey$Origin.Payment;
                            rememberedValue5 = new ToolbarConfig(build, build2, colorConfiguration, tabToolbarInternalViewModel, null, new MoneyTabUIKt$$ExternalSyntheticLambda9(28, rememberUpdatedState), false, false, new ToolbarConfig.SearchSharedElementKeys(new DiscoverTabSharedKey$SearchBounds(discoverTabSharedKey$Origin), new DiscoverTabSharedKey$SearchIcon(discoverTabSharedKey$Origin)), null, 720);
                            gapComposer4.updateRememberedValue(rememberedValue5);
                        } else {
                            homeViewModel = homeViewModel2;
                            str = stringResource;
                            str2 = stringResource2;
                            painter = painterResource;
                        }
                        gapComposer4.end(false);
                        toolbarConfig = (ToolbarConfig) rememberedValue5;
                    } else {
                        z = z5;
                        dynamicColorConfiguration = m1173invokeRGew2ao;
                        paymentPadTheme = paymentPadTheme2;
                        homeViewModel = homeViewModel2;
                        str = stringResource;
                        str2 = stringResource2;
                        painter = painterResource;
                        gapComposer4.startReplaceGroup(-2112525504);
                        gapComposer4.end(false);
                        toolbarConfig = null;
                    }
                    long j4 = Strings.getColors(gapComposer4).surface.keypad.background;
                    int ordinal = paymentPadTheme.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal == 2 || ordinal == 3) {
                            j = j4;
                            j2 = Color.m675copywmQWz5c$default(0.12f, Color.Black, 14);
                        } else if (ordinal == 4) {
                            j = j4;
                            j2 = Color.m675copywmQWz5c$default(0.4f, Color.Black, 14);
                        } else if (ordinal != 5) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ChromeConfigKt.ChromeConfig(new UpdatesWindowFlags$TabConfig(j, j2, Strings.getColors(gapComposer4).component.bottomNavigation.keypad.icon.selected, Strings.getColors(gapComposer4).component.bottomNavigation.keypad.icon.f148default), HomeViewKt.systemIconColors(paymentPadTheme), HomeViewKt.systemIconColors(paymentPadTheme), Boolean.TRUE, null, toolbarConfig, null, gapComposer4, 265216, 80);
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer4).surface.keypad.background, rectangleShapeKt$RectangleShape$1);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                        ComposeUiNode.Companion.getClass();
                        Function0 function03 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer4.applier != null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(function03);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        if (z4) {
                            gapComposer4.startReplaceGroup(852339735);
                            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                            AlertBannerViewModel alertBannerViewModel = ((HomeViewModel.Ready) homeViewModel).alertBannerViewModel;
                            boolean changed3 = gapComposer4.changed(function14);
                            Object rememberedValue6 = gapComposer4.rememberedValue();
                            if (changed3 || rememberedValue6 == obj3) {
                                z2 = false;
                                rememberedValue6 = new HomeViewKt$$ExternalSyntheticLambda8(0, function14);
                                gapComposer4.updateRememberedValue(rememberedValue6);
                            } else {
                                z2 = false;
                            }
                            AlertBannerKt.AlertBannerContainer(alertBannerViewModel, fillMaxSize, (Function0) rememberedValue6, Expect_jvmKt.rememberComposableLambda(-1669257607, new PagerKt$$ExternalSyntheticLambda6(paymentPadTheme, splashScreenAnimationObserver, z, homeViewModel, function14, elementBoundsRegistry2, uiScope2, dynamicColorConfiguration, str, painter, str2), gapComposer4), gapComposer4, 24624);
                            gapComposer4.end(z2);
                        } else {
                            gapComposer4.startReplaceGroup(857407460);
                            gapComposer4.end(false);
                        }
                        gapComposer4.end(true);
                    }
                    j = j4;
                    j2 = Color.Unspecified;
                    ChromeConfigKt.ChromeConfig(new UpdatesWindowFlags$TabConfig(j, j2, Strings.getColors(gapComposer4).component.bottomNavigation.keypad.icon.selected, Strings.getColors(gapComposer4).component.bottomNavigation.keypad.icon.f148default), HomeViewKt.systemIconColors(paymentPadTheme), HomeViewKt.systemIconColors(paymentPadTheme), Boolean.TRUE, null, toolbarConfig, null, gapComposer4, 265216, 80);
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer4).surface.keypad.background, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    Function0 function032 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier != null) {
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                com.squareup.cash.payments.views.personalization.AlphaKt.LoadingPersonalizePaymentView((Function0) obj9, (Function0) obj8, (Function0) obj7, (Modifier) obj6, this.f$6, (PersonalizePaymentToolbarViewModel) obj5, (ConfirmRetryResourceDialog) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                Modifier modifier = (Modifier) obj9;
                String str3 = (String) obj8;
                List list2 = (List) obj7;
                Function1 function15 = (Function1) obj4;
                Function0 function04 = (Function0) obj6;
                String str4 = (String) obj5;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    Transformations.SheetHeader(str3, (Modifier) null, (Function2) null, (String) null, gapComposer5, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                    ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    TrimMode.AtmPickerGrid(0, 0, gapComposer5, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), list2, function15);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer5, null);
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), false, null, null, Expect_jvmKt.rememberComposableLambda(802451330, new CalendarDatePickerKt$$ExternalSyntheticLambda12(str4, function04, this.f$6, 2), gapComposer5), gapComposer5, 24576, 14);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                PayCellViewKt.PastPaySection((List) obj9, this.f$6, (String) obj8, (SellerCardViewModel) obj7, (Function1) obj4, (Function0) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                IntentConfirmationChallengeUIKt.IntentConfirmationChallengeUI((Modifier) obj9, (String) obj8, (ConfirmationChallengeBridgeHandler) obj7, this.f$6, (Function0) obj6, (Function0) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda32(Modifier modifier, String str, ConfirmationChallengeBridgeHandler confirmationChallengeBridgeHandler, boolean z, Function0 function0, Function0 function02, Function1 function1, int i) {
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = confirmationChallengeBridgeHandler;
        this.f$6 = z;
        this.f$3 = function0;
        this.f$4 = function02;
        this.f$5 = function1;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda32(Modifier modifier, String str, List list, Function1 function1, Function0 function0, boolean z, String str2) {
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = list;
        this.f$5 = function1;
        this.f$3 = function0;
        this.f$6 = z;
        this.f$4 = str2;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda32(ToolbarNestedScrollExpander toolbarNestedScrollExpander, MoneyTabModel.Loaded loaded, UiScope uiScope, CardNestedScrollExpander cardNestedScrollExpander, ElementBoundsRegistry elementBoundsRegistry, Function1 function1, boolean z) {
        this.f$0 = toolbarNestedScrollExpander;
        this.f$1 = loaded;
        this.f$2 = uiScope;
        this.f$3 = cardNestedScrollExpander;
        this.f$4 = elementBoundsRegistry;
        this.f$5 = function1;
        this.f$6 = z;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda32(List list, boolean z, String str, SellerCardViewModel sellerCardViewModel, Function1 function1, Function0 function0, Modifier modifier, int i) {
        this.f$0 = list;
        this.f$6 = z;
        this.f$1 = str;
        this.f$2 = sellerCardViewModel;
        this.f$5 = function1;
        this.f$3 = function0;
        this.f$4 = modifier;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda32(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, boolean z, PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel, ConfirmRetryResourceDialog confirmRetryResourceDialog, int i) {
        this.f$0 = function0;
        this.f$1 = function02;
        this.f$2 = function03;
        this.f$3 = modifier;
        this.f$6 = z;
        this.f$4 = personalizePaymentToolbarViewModel;
        this.f$5 = confirmRetryResourceDialog;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda32(Function1 function1, HomeViewModel homeViewModel, boolean z, PaymentPadTheme paymentPadTheme, SplashScreenAnimationObserver splashScreenAnimationObserver, ElementBoundsRegistry elementBoundsRegistry, UiScope uiScope) {
        this.f$5 = function1;
        this.f$0 = homeViewModel;
        this.f$6 = z;
        this.f$1 = paymentPadTheme;
        this.f$3 = splashScreenAnimationObserver;
        this.f$4 = elementBoundsRegistry;
        this.f$2 = uiScope;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda32(boolean z, SetNameViewModel setNameViewModel, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, Shaker shaker, MutableState mutableState, InputState inputState) {
        this.f$6 = z;
        this.f$0 = setNameViewModel;
        this.f$1 = delegatingSoftwareKeyboardController;
        this.f$5 = function1;
        this.f$2 = shaker;
        this.f$3 = mutableState;
        this.f$4 = inputState;
    }
}
