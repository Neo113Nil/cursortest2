package com.squareup.cash.checks;

import android.webkit.WebView;
import androidx.biometric.KeyguardUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.trace.model.SpanEvent;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.LocationType;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.address.typeahead.views.AddressTypeaheadStateKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewModel;
import com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewModel;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.blockers.viewmodels.SetAddressViewModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerFooterModel;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerHeaderModel;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewModel;
import com.squareup.cash.booklet.ui.RealBookletGridScope;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.borrow.views.BulletinInfoOverlayKt;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.LoanDetailsSheetState;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.GridLayout;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.cashapppay.views.CashAppPayStackedAvatarKt;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.VerifyCheckDepositViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.crypto.common.viewmodels.CryptoInsufficientFundsViewModel;
import com.squareup.cash.crypto.common.views.AngleAndQuadrant;
import com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt;
import com.squareup.cash.crypto.common.views.CryptoCommonInsufficientFundsView;
import com.squareup.cash.crypto.common.views.Quadrant;
import com.squareup.cash.directdeposit.views.DirectDepositDialogKt;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.viewmodels.HeroHeaderViewModel;
import com.squareup.cash.earningstracker.views.EarningsTrackerViewKt;
import com.squareup.cash.family.applets.presenters.DependentActivityAppletTilePresenter$Factory$Impl;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.SplitButtonEntry;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.work.applets.views.WorkAppletTile;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
import com.squareup.util.Strings;
import com.squareup.workflow1.WorkflowIdentifier;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class VerifyCheckDepositKt$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ VerifyCheckDepositKt$$ExternalSyntheticLambda14(WebViewBlockerViewModel.LoadUrl loadUrl, Function1 function1, Function0 function0, WebView webView) {
        this.$r8$classId = 9;
        this.f$0 = loadUrl;
        this.f$1 = function1;
        this.f$3 = function0;
        this.f$2 = webView;
    }

    private final Object invoke$com$squareup$cash$crypto$common$views$BitcoinP2pConversionPercentageViewKt$handlePercentageDrag$3$$ExternalSyntheticLambda3(Object obj, Object obj2) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f$0;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f$1;
        PointerInputScope pointerInputScope = (PointerInputScope) this.f$2;
        Function1 function1 = (Function1) this.f$3;
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        pointerInputChange.getClass();
        pointerInputChange.consume();
        if (!ref$BooleanRef.element || ref$ObjectRef.element == null) {
            return Unit.INSTANCE;
        }
        AngleAndQuadrant m3509access$angleAndQuadrant3MmeM6k = BitcoinP2pConversionPercentageViewKt.m3509access$angleAndQuadrant3MmeM6k((int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).boundsSize >> 32), pointerInputChange.position);
        Object obj3 = ref$ObjectRef.element;
        obj3.getClass();
        Quadrant quadrant = (Quadrant) obj3;
        Quadrant quadrant2 = m3509access$angleAndQuadrant3MmeM6k.quadrant;
        Quadrant quadrant3 = Quadrant.TOP_LEFT;
        if (quadrant == quadrant3 && quadrant2 == Quadrant.TOP_RIGHT) {
            m3509access$angleAndQuadrant3MmeM6k = new AngleAndQuadrant(1.0f, quadrant);
        } else if (quadrant == Quadrant.TOP_RIGHT && quadrant2 == quadrant3) {
            m3509access$angleAndQuadrant3MmeM6k = new AngleAndQuadrant(0.01f, quadrant);
        }
        function1.invoke(Float.valueOf(RangesKt___RangesKt.coerceIn(m3509access$angleAndQuadrant3MmeM6k.angle, 0.01f, 1.0f)));
        ref$ObjectRef.element = m3509access$angleAndQuadrant3MmeM6k.quadrant;
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$directdeposit$views$DirectDepositHomeViewKt$$ExternalSyntheticLambda12(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        DirectDepositDialogKt.CopyNumber((String) this.f$0, (Redacted) this.f$2, (String) this.f$1, (Function0) this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositFormErrorKt$$ExternalSyntheticLambda3(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        DirectDepositFormErrorKt.ErrorContent((String) this.f$0, (String) this.f$1, (Function0) this.f$3, (Function0) this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$directory_ui$views$SectionHeaderButtonKt$$ExternalSyntheticLambda3(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        zzc.SectionHeaderButton((Button) this.f$0, (RealImageLoader) this.f$1, (Modifier) this.f$2, (Function1) this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$earnings$views$home$EarningsHeaderKt$$ExternalSyntheticLambda17(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        EarningsHeaderKt.AnimatedTotalEarningsAmountText((EarningsHeaderViewModel.HeaderViewModel.Loaded) this.f$0, (MoneyFormatter) this.f$1, (Function0) this.f$3, (Modifier) this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$earnings$views$home$EarningsHomeKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        RealImageLoader realImageLoader = (RealImageLoader) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        EarningsHomeViewModel earningsHomeViewModel = (EarningsHomeViewModel) this.f$2;
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) this.f$3;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1170093206, new EarningsHomeKt$$ExternalSyntheticLambda2(i, function1, earningsHomeViewModel, factory), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$earningstracker$views$EarningsTrackerViewKt$$ExternalSyntheticLambda16(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        EarningsTrackerViewKt.EarningsContent((EarningsTrackerViewModel.Loaded) this.f$0, (Function1) this.f$1, (MoneyFormatter) this.f$2, (MoneyFormatter) this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$earningstracker$views$components$EarningsHeaderKt$$ExternalSyntheticLambda3(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        com.squareup.cash.earningstracker.views.components.EarningsHeaderKt.EarningsHeader((HeroHeaderViewModel) this.f$0, (Function1) this.f$1, (Modifier) this.f$2, (Function0) this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x03ff, code lost:
    
        if (r7 == r6) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04b5  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        LocationType locationType;
        int i;
        int i2;
        Modifier wrapContentHeight;
        boolean z;
        String valueOf;
        Modifier wrapContentHeight2;
        Object obj3;
        BlockerAction blockerAction;
        SplitButtonEntry splitButtonEntry;
        BlockerAction blockerAction2;
        SplitButtonEntry splitButtonEntry2;
        PayWithCashAuthorizationBlocker.Footer.Content content;
        PayWithCashAuthorizationBlocker.Footer.ButtonFooter value;
        PayWithCashAuthorizationBlocker.Footer.Content content2;
        int i3 = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Object obj4 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                CheckDepositAmountKt.FaceOfCheckCell((String) obj8, (String) obj7, (VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState) obj6, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                BitcoinStackingToolsViewKt.CellDefault((BitcoinStackingToolsViewModel.BitcoinStackingToolsItem) obj8, (Function0) obj5, (Icons) obj7, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 2:
                RealImageLoader realImageLoader = (RealImageLoader) obj8;
                BlockerActionConfirmSheetViewModel blockerActionConfirmSheetViewModel = (BlockerActionConfirmSheetViewModel) obj7;
                Modifier modifier = (Modifier) obj6;
                Function1 function1 = (Function1) obj5;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1038566713, new BitcoinMapViewKt$$ExternalSyntheticLambda0(blockerActionConfirmSheetViewModel, modifier, function1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                AddMoneyViewModel.Keypad keypad = (AddMoneyViewModel.Keypad) obj8;
                Function1 function12 = (Function1) obj7;
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj6;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj5;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    AddMoneyViewKt.AddMoneyKeypad(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), keypad, function12, moneyFormatter, realCashVibrator, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                SsnViewKt.BankAccountLinking((BankAccountLinkingViewModel) obj8, (Function1) obj7, (FocusRequester) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                SsnViewKt.Birthday((BirthdayViewModel) obj8, (Function1) obj7, (FocusRequester) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                BirthdayViewModel birthdayViewModel = (BirthdayViewModel) obj8;
                Function1 function13 = (Function1) obj7;
                MutableState mutableState = (MutableState) obj6;
                TouchRecorder touchRecorder = (TouchRecorder) obj5;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    int length = ((TextFieldValue) mutableState.getValue()).annotatedString.text.length();
                    birthdayViewModel.getClass();
                    boolean z2 = length == 10;
                    boolean changed = gapComposer3.changed(function13) | gapComposer3.changed(mutableState) | gapComposer3.changedInstance(touchRecorder);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda15(function13, touchRecorder, mutableState, 1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z2, null, AmountBlockerViewKt.f301lambda$558046914, gapComposer3, 1573296, 40);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                PlacesAddressSearcher placesAddressSearcher = (PlacesAddressSearcher) obj8;
                SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj7;
                Function1 function14 = (Function1) obj6;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    SetAddressViewModel.Mode mode = setAddressViewModel.mode;
                    boolean z3 = mode instanceof SetAddressViewModel.Mode.FullAddress;
                    SetAddressViewModel.Mode.FullAddress fullAddress = z3 ? (SetAddressViewModel.Mode.FullAddress) mode : null;
                    PlacesAddressSearcher placesAddressSearcher2 = fullAddress != null ? fullAddress.autofill : false ? placesAddressSearcher : null;
                    Country country = setAddressViewModel.country;
                    if (z3) {
                        locationType = LocationType.Address;
                    } else if (mode.equals(SetAddressViewModel.Mode.StreetAndPostal.INSTANCE)) {
                        locationType = LocationType.StreetAndPostal;
                    } else {
                        if (!mode.equals(SetAddressViewModel.Mode.Postal.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        locationType = LocationType.Postal;
                    }
                    AddressTypeaheadState rememberAddressTypeaheadState = AddressTypeaheadStateKt.rememberAddressTypeaheadState(placesAddressSearcher2, country, locationType, setAddressViewModel.address, setAddressViewModel.autofill, null, gapComposer4, 0, 32);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Strings.LoadableFullScreenContent(setAddressViewModel, setAddressViewModel.isLoading, SpacerKt.imePadding(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1))), null, null, Expect_jvmKt.rememberComposableLambda(1102520241, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(rememberAddressTypeaheadState, function14, delegatingSoftwareKeyboardController, 4), gapComposer4), gapComposer4, 196608, 24);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                SsnViewKt.VerifyHelpOptions((Function1) obj8, (Modifier) obj7, (List) obj6, (List) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                WebViewBlockerViewModel.LoadUrl loadUrl = (WebViewBlockerViewModel.LoadUrl) obj8;
                Function1 function15 = (Function1) obj7;
                Function0 function0 = (Function0) obj5;
                WebView webView = (WebView) obj6;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        i = 0;
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        i = 0;
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, i);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, systemBarsPadding);
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
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    WebViewBlockerHeaderModel webViewBlockerHeaderModel = loadUrl.navigationHeader;
                    if (webViewBlockerHeaderModel == null) {
                        gapComposer5.startReplaceGroup(-1157463587);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-1157463586);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(998941545, new BulletinTileKt$$ExternalSyntheticLambda6(webViewBlockerHeaderModel, 3), gapComposer5);
                        NavigationType navigationType = NavigationType.CLOSE;
                        boolean changed2 = gapComposer5.changed(function15);
                        Object rememberedValue2 = gapComposer5.rememberedValue();
                        if (changed2 || rememberedValue2 == obj4) {
                            rememberedValue2 = new BorrowHomeKt$$ExternalSyntheticLambda3(6, function15);
                            gapComposer5.updateRememberedValue(rememberedValue2);
                        }
                        DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-550229138, new DismissableToastKt$$ExternalSyntheticLambda3(11, function0), gapComposer5), gapComposer5, 1572918, 44);
                        gapComposer5.end(false);
                    }
                    Strings.LoadableFullScreenContent(loadUrl, loadUrl.showLoadingIndicator, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true), null, null, Expect_jvmKt.rememberComposableLambda(-2009420378, new ScoreUiFactory$$ExternalSyntheticLambda0(webView, 8), gapComposer5), gapComposer5, 196608, 24);
                    WebViewBlockerFooterModel webViewBlockerFooterModel = loadUrl.navigationFooter;
                    if (webViewBlockerFooterModel == null) {
                        gapComposer5.startReplaceGroup(-1156206661);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-1156206660);
                        DimensionKt.ButtonCtaGroup(null, true, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-1783385510, new BorrowHomeKt$$ExternalSyntheticLambda0(26, webViewBlockerFooterModel, function15), gapComposer5), gapComposer5, 25008, 9);
                        gapComposer5.end(false);
                    }
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                RealBookletGridScope realBookletGridScope = (RealBookletGridScope) obj6;
                Icons icons = (Icons) obj5;
                String str = (String) obj8;
                String str2 = (String) obj7;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier weight = realBookletGridScope.weight(1.0f, companion, true);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (rememberedValue3 == obj4) {
                        rememberedValue3 = new RewardQueries$$ExternalSyntheticLambda4(5);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(weight, true, (Function1) rememberedValue3);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, semantics);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    if (icons != null) {
                        gapComposer6.startReplaceGroup(-1699899093);
                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer6, 48, 12);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer6, null);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-1699806837);
                        gapComposer6.end(false);
                    }
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer6, (Modifier) null, ((Typography) gapComposer6.consume(staticProvidableCompositionLocal)).labelSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer6, null);
                    TextStyle textStyle = ((Typography) gapComposer6.consume(staticProvidableCompositionLocal)).bodySmall;
                    Colors colors4 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors4.semantic.text.subtle, (Composer) gapComposer6, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                BorrowHomeOverlayViewModel.BulletinInfo bulletinInfo = (BorrowHomeOverlayViewModel.BulletinInfo) obj8;
                Latch$await$2$2 latch$await$2$2 = (Latch$await$2$2) obj7;
                QuickPayViewKt$QuickPay$1$1$1$2$2$1$1 quickPayViewKt$QuickPay$1$1$1$2$2$1$1 = (QuickPayViewKt$QuickPay$1$1$1$2$2$1$1) obj6;
                BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 = (BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj5;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (!gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    gapComposer7.skipToGroupEnd();
                } else if (bulletinInfo instanceof BorrowHomeOverlayViewModel.InfoModal) {
                    gapComposer7.startReplaceGroup(-58990782);
                    BulletinInfoOverlayKt.BulletinInfoModal((BorrowHomeOverlayViewModel.InfoModal) bulletinInfo, latch$await$2$2, quickPayViewKt$QuickPay$1$1$1$2$2$1$1, gapComposer7, 0);
                    gapComposer7.end(false);
                } else {
                    if (!(bulletinInfo instanceof BorrowHomeOverlayViewModel.InfoSheet)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, 552284653, false);
                    }
                    gapComposer7.startReplaceGroup(-58750098);
                    BulletinInfoOverlayKt.BulletinInfoSheet((BorrowHomeOverlayViewModel.InfoSheet) bulletinInfo, latch$await$2$2, borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, Modifier.Companion.$$INSTANCE, gapComposer7, 0);
                    gapComposer7.end(false);
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                BulletinInfoOverlayKt.BulletinInfoSheet((BorrowHomeOverlayViewModel.InfoSheet) obj8, (Latch$await$2$2) obj7, (BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                FirstTimeBorrowViewModel firstTimeBorrowViewModel = (FirstTimeBorrowViewModel) obj8;
                Function1 function16 = (Function1) obj7;
                Modifier modifier2 = (Modifier) obj6;
                ScrollState scrollState = (ScrollState) obj5;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Colors colors5 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        i2 = 0;
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        i2 = 0;
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Strings.LoadableFullScreenContent(firstTimeBorrowViewModel, firstTimeBorrowViewModel instanceof FirstTimeBorrowViewModel.Loading, ImageKt.m177backgroundbw27NRU(companion, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), null, null, Expect_jvmKt.rememberComposableLambda(361450624, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(i2, function16, modifier2, scrollState), gapComposer8), gapComposer8, 196608, 24);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Modifier modifier3 = (Modifier) obj8;
                BorrowHomeOverlayViewModel.LoanDetails loanDetails = (BorrowHomeOverlayViewModel.LoanDetails) obj7;
                LoanDetailsSheetState loanDetailsSheetState = (LoanDetailsSheetState) obj6;
                Function1 function17 = (Function1) obj5;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer9, 48);
                    int hashCode3 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer9, modifier3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    LoanDetailsSheetKt.DetailSheetHeader(loanDetails, gapComposer9, 0);
                    Object rememberedValue4 = gapComposer9.rememberedValue();
                    if (rememberedValue4 == obj4) {
                        rememberedValue4 = Updater.mutableStateOf$default(loanDetailsSheetState);
                        gapComposer9.updateRememberedValue(rememberedValue4);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue4;
                    ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer9);
                    Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(SpacerKt.m302paddingqDBjuR0$default(ImageKt.verticalScroll$default(SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, false), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), rememberScrollState, false, 14), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7), null, 3);
                    LoanDetailsSheetState loanDetailsSheetState2 = (LoanDetailsSheetState) mutableState2.getValue();
                    Object rememberedValue5 = gapComposer9.rememberedValue();
                    if (rememberedValue5 == obj4) {
                        rememberedValue5 = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(0);
                        gapComposer9.updateRememberedValue(rememberedValue5);
                    }
                    AnimatedContentKt.AnimatedContent(loanDetailsSheetState2, animateContentSize$default, (Function1) rememberedValue5, null, null, null, Expect_jvmKt.rememberComposableLambda(-323048721, new LocalViewFactory$$ExternalSyntheticLambda4(19, loanDetails, function17), gapComposer9), gapComposer9, 1573248, 56);
                    Colors colors6 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    DimensionKt.ButtonCtaGroup(OffsetKt.consumeWindowInsets(fillMaxWidth2, Arrangement$End$1.current(gapComposer9).navigationBars), rememberScrollState.getCanScrollForward() || rememberScrollState.getCanScrollBackward(), ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(346145682, new SectionKt$$ExternalSyntheticLambda2(13, loanDetails, mutableState2, function17), gapComposer9), gapComposer9, 24960, 8);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                GridLayout.GridZoomToggle((ZoomLevel) obj6, (String) obj8, (String) obj7, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                GrantViewModel grantViewModel = (GrantViewModel) obj8;
                Function1 function18 = (Function1) obj7;
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) obj6;
                UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj5;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (!gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    gapComposer10.skipToGroupEnd();
                } else if (Intrinsics.areEqual(grantViewModel, GrantViewModel.InTransactionTopUpInfo.INSTANCE)) {
                    gapComposer10.startReplaceGroup(1410949596);
                    CashAppPayStackedAvatarKt.m3445InTransactionTopUpInfoSheetOWMNXiA(SizeKt.fillMaxHeight(companion, 1.0f), 0, 0, null, function18, gapComposer10, 6);
                    gapComposer10.end(false);
                } else {
                    gapComposer10.startReplaceGroup(789918278);
                    wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    CrossfadeKt.Crossfade(grantViewModel, wrapContentHeight, (FiniteAnimationSpec) null, "LegacyGrantSheet Crossfade", Expect_jvmKt.rememberComposableLambda(1264732703, new SectionKt$$ExternalSyntheticLambda2(19, function18, factory, uiContainerKt$BottomSheet$1$sheetScope$1), gapComposer10), gapComposer10, 27696, 4);
                    gapComposer10.end(false);
                }
                return Unit.INSTANCE;
            case 17:
                Modifier modifier4 = (Modifier) obj8;
                GrantViewModel.Main main = (GrantViewModel.Main) obj7;
                MoneyFormatter moneyFormatter2 = (MoneyFormatter) obj6;
                Function1 function19 = (Function1) obj5;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                boolean shouldExecute = gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2);
                Applier applier = gapComposer11.applier;
                if (shouldExecute) {
                    Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxWidth(modifier4, 1.0f), zzagn.rememberNestedScrollInteropConnection(gapComposer11), null);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer11, 0);
                    int hashCode4 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer11, nestedScroll);
                    ComposeUiNode.Companion.getClass();
                    Function0 function02 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(function02);
                    } else {
                        gapComposer11.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer11, valueOf2, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer11, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer11, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.m300paddingVpY3zN4$default(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(OffsetKt.height(companion, IntrinsicSize.Min), 1.0f), true), 16.0f, RecyclerView.DECELERATION_RATE, 2), ImageKt.rememberScrollState(gapComposer11), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer11, 48);
                    int hashCode5 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer11, verticalScroll$default);
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(function02);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer11, composeUiNode$Companion$SetModifier$13, gapComposer11, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer11, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    SpacerKt.Spacer(gapComposer11, SizeKt.m277height3ABfNKs(companion, 20.0f));
                    AvatarViewModel avatarViewModel = main.avatar;
                    PayWithCashAuthorizationBlocker.Footer footer = main.footer;
                    CashAppPayStackedAvatarKt.CashAppPayStackedAvatar(avatarViewModel, gapComposer11, 8);
                    String str3 = main.title;
                    if (str3 == null) {
                        gapComposer11.startReplaceGroup(-441707279);
                        z = false;
                        gapComposer11.end(false);
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer11, -441707278, companion, 12.0f, gapComposer11);
                        KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer11).label, (Composer) gapComposer11, SizeKt.fillMaxWidth(companion, 1.0f), MooncakeTheme.getTypography(gapComposer11).mainTitle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                        z = false;
                        re$$ExternalSyntheticOutline0.m(companion, 12.0f, gapComposer11, false);
                    }
                    String str4 = main.subtitle;
                    if (str4 == null) {
                        gapComposer11.startReplaceGroup(-441307286);
                        gapComposer11.end(z);
                    } else {
                        gapComposer11.startReplaceGroup(-441307285);
                        KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer11).secondaryLabel, (Composer) gapComposer11, SizeKt.fillMaxWidth(companion, 1.0f), MooncakeTheme.getTypography(gapComposer11).smallBody, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                        z = false;
                        gapComposer11.end(false);
                    }
                    Money money = main.amount;
                    if (money == null) {
                        gapComposer11.startReplaceGroup(-440980856);
                        gapComposer11.end(z);
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer11, -440980855, companion, 20.0f, gapComposer11);
                        if (moneyFormatter2 == null || (valueOf = moneyFormatter2.format(money)) == null) {
                            valueOf = String.valueOf(money.amount);
                        }
                        KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer11).label, (Composer) gapComposer11, SizeKt.fillMaxWidth(companion, 1.0f), MooncakeTheme.getTypography(gapComposer11).header1, (TextLineBalancing) null, valueOf, (Map) null, (Function1) null, false);
                        SpacerKt.Spacer(gapComposer11, SizeKt.m277height3ABfNKs(companion, 8.0f));
                        KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer11).label, (Composer) gapComposer11, SizeKt.fillMaxWidth(companion, 1.0f), MooncakeTheme.getTypography(gapComposer11).caption, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.grant_sheet_total_amount), (Map) null, (Function1) null, false);
                        z = false;
                        re$$ExternalSyntheticOutline0.m(companion, 20.0f, gapComposer11, false);
                    }
                    FormBlocker.Element.CallToActionElement callToActionElement = main.callToAction;
                    String str5 = callToActionElement != null ? callToActionElement.subtitle : null;
                    if (str5 == null) {
                        gapComposer11.startReplaceGroup(-440177088);
                        gapComposer11.end(z);
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer11, -440177087, companion, 20.0f, gapComposer11);
                        wrapContentHeight2 = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                        KeypadKt.m3641CardIkByU14(wrapContentHeight2, null, MooncakeTheme.getColors(gapComposer11).behindBackground, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-718452681, new TabContentViewKt$$ExternalSyntheticLambda11(str5, function19, 16), gapComposer11), gapComposer11, 100687878, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
                        z = false;
                        re$$ExternalSyntheticOutline0.m(companion, 8.0f, gapComposer11, false);
                    }
                    Request$Priority$EnumUnboxingLocalUtility.m(gapComposer11, true, companion, 20.0f, gapComposer11);
                    String str6 = footer != null ? footer.disclaimer_text : null;
                    if (str6 == null) {
                        gapComposer11.startReplaceGroup(-407982226);
                        gapComposer11.end(z);
                        obj3 = obj4;
                    } else {
                        gapComposer11.startReplaceGroup(-407982225);
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                        TextStyle textStyle2 = MooncakeTheme.getTypography(gapComposer11).caption;
                        long j = MooncakeTheme.getColors(gapComposer11).tertiaryLabel;
                        SpanStyle spanStyle = new SpanStyle(MooncakeTheme.getColors(gapComposer11).tertiaryLabel, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61438);
                        boolean changed3 = gapComposer11.changed(function19);
                        Object rememberedValue6 = gapComposer11.rememberedValue();
                        if (!changed3) {
                            obj3 = obj4;
                            break;
                        } else {
                            obj3 = obj4;
                        }
                        rememberedValue6 = new SsnViewKt$$ExternalSyntheticLambda12(15, function19);
                        gapComposer11.updateRememberedValue(rememberedValue6);
                        KeyguardUtils.m14MarkdownTextnvClB8o(str6, (Function2) rememberedValue6, m300paddingVpY3zN4$default, textStyle2, j, spanStyle, null, 0, 3, null, 0, gapComposer11, MLKEMEngine.KyberPolyBytes, 1728);
                        re$$ExternalSyntheticOutline0.m(companion, 24.0f, gapComposer11, false);
                    }
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    if (footer != null && (content2 = footer.content) != null) {
                        PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter buttonFooter = content2 instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter ? (PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) content2 : null;
                        PayWithCashAuthorizationBlocker.Footer.ButtonFooter value2 = buttonFooter != null ? buttonFooter.getValue() : null;
                        if (value2 != null) {
                            blockerAction = value2.primary_action;
                            if (blockerAction != null) {
                                gapComposer11.startReplaceGroup(-407229422);
                                gapComposer11.end(false);
                                splitButtonEntry = null;
                            } else {
                                gapComposer11.startReplaceGroup(-407229421);
                                String str7 = blockerAction.text;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                boolean changed4 = gapComposer11.changed(function19) | gapComposer11.changedInstance(blockerAction);
                                Object rememberedValue7 = gapComposer11.rememberedValue();
                                if (changed4 || rememberedValue7 == obj3) {
                                    rememberedValue7 = new GrantSheetKt$$ExternalSyntheticLambda11(function19, blockerAction, 4);
                                    gapComposer11.updateRememberedValue(rememberedValue7);
                                }
                                SplitButtonEntry splitButtonEntry3 = new SplitButtonEntry(str7, (Function0) rememberedValue7);
                                gapComposer11.end(false);
                                splitButtonEntry = splitButtonEntry3;
                            }
                            if (footer != null && (content = footer.content) != null) {
                                PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter buttonFooter2 = !(content instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) ? (PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) content : null;
                                value = buttonFooter2 == null ? buttonFooter2.getValue() : null;
                                if (value != null) {
                                    blockerAction2 = value.secondary_action;
                                    if (blockerAction2 == null) {
                                        gapComposer11.startReplaceGroup(-406966542);
                                        gapComposer11.end(false);
                                        splitButtonEntry2 = null;
                                    } else {
                                        gapComposer11.startReplaceGroup(-406966541);
                                        String str8 = blockerAction2.text;
                                        String str9 = str8 != null ? str8 : "";
                                        boolean changed5 = gapComposer11.changed(function19) | gapComposer11.changedInstance(blockerAction2);
                                        Object rememberedValue8 = gapComposer11.rememberedValue();
                                        if (changed5 || rememberedValue8 == obj3) {
                                            rememberedValue8 = new GrantSheetKt$$ExternalSyntheticLambda11(function19, blockerAction2, 5);
                                            gapComposer11.updateRememberedValue(rememberedValue8);
                                        }
                                        SplitButtonEntry splitButtonEntry4 = new SplitButtonEntry(str9, (Function0) rememberedValue8);
                                        gapComposer11.end(false);
                                        splitButtonEntry2 = splitButtonEntry4;
                                    }
                                    KeypadKt.m3649SplitButtonsnbWgWpA(m300paddingVpY3zN4$default2, null, null, splitButtonEntry, splitButtonEntry2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer11, 36870);
                                    re$$ExternalSyntheticOutline0.m(companion, 20.0f, gapComposer11, true);
                                }
                            }
                            blockerAction2 = null;
                            if (blockerAction2 == null) {
                            }
                            KeypadKt.m3649SplitButtonsnbWgWpA(m300paddingVpY3zN4$default2, null, null, splitButtonEntry, splitButtonEntry2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer11, 36870);
                            re$$ExternalSyntheticOutline0.m(companion, 20.0f, gapComposer11, true);
                        }
                    }
                    blockerAction = null;
                    if (blockerAction != null) {
                    }
                    if (footer != null) {
                        if (!(content instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter)) {
                        }
                        if (buttonFooter2 == null) {
                        }
                        if (value != null) {
                        }
                    }
                    blockerAction2 = null;
                    if (blockerAction2 == null) {
                    }
                    KeypadKt.m3649SplitButtonsnbWgWpA(m300paddingVpY3zN4$default2, null, null, splitButtonEntry, splitButtonEntry2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer11, 36870);
                    re$$ExternalSyntheticOutline0.m(companion, 20.0f, gapComposer11, true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                return Float.valueOf(WorkflowIdentifier.Companion.measuredLength(((AnnotatedString) obj8).subSequence(((Integer) obj).intValue(), ((Integer) obj2).intValue()), (TextStyle) obj7, (Density) obj6, (FontFamilyResolverImpl) obj5));
            case 19:
                return invoke$com$squareup$cash$crypto$common$views$BitcoinP2pConversionPercentageViewKt$handlePercentageDrag$3$$ExternalSyntheticLambda3(obj, obj2);
            case 20:
                ((Integer) obj2).getClass();
                int i4 = CryptoCommonInsufficientFundsView.$r8$clinit;
                ((CryptoCommonInsufficientFundsView) obj8).Buttons((CryptoInsufficientFundsViewModel) obj7, (Function1) obj6, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(4097));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                SpanEvent.Account.AccessibleAndroidView((Function1) obj8, (Modifier) obj7, (Function1) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 22:
                return invoke$com$squareup$cash$directdeposit$views$DirectDepositHomeViewKt$$ExternalSyntheticLambda12(obj, obj2);
            case 23:
                return invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositFormErrorKt$$ExternalSyntheticLambda3(obj, obj2);
            case 24:
                return invoke$com$squareup$cash$directory_ui$views$SectionHeaderButtonKt$$ExternalSyntheticLambda3(obj, obj2);
            case 25:
                return invoke$com$squareup$cash$earnings$views$home$EarningsHeaderKt$$ExternalSyntheticLambda17(obj, obj2);
            case 26:
                return invoke$com$squareup$cash$earnings$views$home$EarningsHomeKt$$ExternalSyntheticLambda0(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$earningstracker$views$EarningsTrackerViewKt$$ExternalSyntheticLambda16(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$earningstracker$views$components$EarningsHeaderKt$$ExternalSyntheticLambda3(obj, obj2);
            default:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                RealBrandFollowPresenter.MetroFactory metroFactory = ((DependentActivityAppletTilePresenter$Factory$Impl) obj8).delegateFactory;
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.syncer.invoke();
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory.store.invoke();
                RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) metroFactory.service.invoke();
                RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) metroFactory.repository.invoke();
                DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) metroFactory.analytics.invoke();
                SessionManager sessionManager = (SessionManager) metroFactory.responseContextHandlerFactory.invoke();
                androidStringManager.getClass();
                realActivityEmbeddedPresenter$Factory$Impl.getClass();
                realActivityTokenFactory.getClass();
                realActivitiesCacheManager.getClass();
                defaultActivityItemEventHandler$Factory$Impl.getClass();
                sessionManager.getClass();
                return new WorkAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) Presenter.start$default(MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidStringManager, realActivityEmbeddedPresenter$Factory$Impl, realActivityTokenFactory, realActivitiesCacheManager, defaultActivityItemEventHandler$Factory$Impl, sessionManager, navigator)), coroutineScope, (LifecycleOwner) obj7)).getModels(), (RealImageLoader) obj6, (RealCashVibrator) obj5);
        }
    }

    public /* synthetic */ VerifyCheckDepositKt$$ExternalSyntheticLambda14(BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem, Function0 function0, Icons icons, Modifier modifier, int i) {
        this.$r8$classId = 1;
        this.f$0 = bitcoinStackingToolsItem;
        this.f$3 = function0;
        this.f$1 = icons;
        this.f$2 = modifier;
    }

    public /* synthetic */ VerifyCheckDepositKt$$ExternalSyntheticLambda14(int i, int i2, Object obj, Object obj2, Object obj3, Function0 function0) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = function0;
        this.f$2 = obj3;
    }

    public /* synthetic */ VerifyCheckDepositKt$$ExternalSyntheticLambda14(RealBookletGridScope realBookletGridScope, Icons icons, String str, String str2) {
        this.$r8$classId = 10;
        this.f$2 = realBookletGridScope;
        this.f$3 = icons;
        this.f$0 = str;
        this.f$1 = str2;
    }

    public /* synthetic */ VerifyCheckDepositKt$$ExternalSyntheticLambda14(BorrowHomeOverlayViewModel.BulletinInfo bulletinInfo, Latch$await$2$2 latch$await$2$2, QuickPayViewKt$QuickPay$1$1$1$2$2$1$1 quickPayViewKt$QuickPay$1$1$1$2$2$1$1, BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) {
        this.$r8$classId = 11;
        this.f$0 = bulletinInfo;
        this.f$1 = latch$await$2$2;
        this.f$2 = quickPayViewKt$QuickPay$1$1$1$2$2$1$1;
        this.f$3 = borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
    }

    public /* synthetic */ VerifyCheckDepositKt$$ExternalSyntheticLambda14(ZoomLevel zoomLevel, String str, String str2, Function0 function0, int i) {
        this.$r8$classId = 15;
        this.f$2 = zoomLevel;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$3 = function0;
    }

    public /* synthetic */ VerifyCheckDepositKt$$ExternalSyntheticLambda14(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ VerifyCheckDepositKt$$ExternalSyntheticLambda14(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ VerifyCheckDepositKt$$ExternalSyntheticLambda14(String str, Redacted redacted, String str2, Function0 function0, int i) {
        this.$r8$classId = 22;
        this.f$0 = str;
        this.f$2 = redacted;
        this.f$1 = str2;
        this.f$3 = function0;
    }
}
