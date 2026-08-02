package app.cash.local.views.wallet;

import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.instore.TableQrCodeScannerViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda9;
import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadn;
import com.google.maps.android.compose.clustering.ClusteringKt;
import com.squareup.cash.account.components.AccountUiViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.RetroSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.CheckboxKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellConfig;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultColors;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.benefits.applets.viewmodels.Subtitle;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.common.composeui.InfoUpsellCtaButtonScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.views.home.EarningsToolsSectionKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextKt;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.squareup.cash.maps.views.MapMarkerProperties;
import com.squareup.cash.money.viewmodels.api.Item;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pools.viewmodels.PoolRow;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTileKt;
import com.squareup.cash.wallet.views.CardAppletTileRenderMode;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda14;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeState;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Modifier modifier, Function1 function1, PoolRow poolRow, boolean z, int i) {
        this.$r8$classId = 29;
        this.f$0 = modifier;
        this.f$2 = function1;
        this.f$1 = poolRow;
        this.f$3 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        boolean z;
        long j2;
        long j3;
        ScrollState scrollState;
        long j4;
        boolean z2;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        boolean z3 = this.f$3;
        int i2 = 2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$2;
        int i3 = 7;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.LocalHomeView((Modifier) obj5, (LocalHomeViewModel) obj3, (Function1) obj4, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                TableQrCodeScannerViewKt.TableQrCodeScannerView((TableQrCodeScannerViewModel) obj3, (Function1) obj4, (Modifier) obj5, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                Function1 function1 = (Function1) obj4;
                Bitmap bitmap = (Bitmap) obj5;
                AccountAvatarViewModel accountAvatarViewModel = (AccountAvatarViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 48.0f, RecyclerView.DECELERATION_RATE, 2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SizeKt.m285size3ABfNKs(companion, 344.0f), false);
                    Strings.getSizes(gapComposer).getClass();
                    Object obj6 = DefaultSizes.border.annotationsMap;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(aspectRatio, 2.0f, Strings.getColors(gapComposer).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer).semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    Strings.getSizes(gapComposer).getClass();
                    OffsetKt.BoxWithConstraints(SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f), null, false, Expect_jvmKt.rememberComposableLambda(43976473, new AccountUiViewKt$$ExternalSyntheticLambda14(function1, this.f$3, bitmap, accountAvatarViewModel, 0), gapComposer), gapComposer, 3072, 6);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                LegalSectionKt.MoneyBarCreditSection((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.MoneyBarSection) obj3, (Modifier) obj5, this.f$3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                LegalSectionKt.PageHeaderSection((Modifier) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PageHeader) obj3, this.f$3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                RetroSectionKt.RetroSection((Modifier) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection) obj3, this.f$3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                LegalSectionKt.StandaloneCreditHeaderSection((Modifier) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneCreditSectionHeader) obj3, this.f$3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState) obj5;
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) obj3;
                Function1 function12 = (Function1) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    SharedTransitionScopeKt.SharedTransitionLayout(SizeKt.fillMaxWidth(companion, 1.0f), Expect_jvmKt.rememberComposableLambda(46480072, new AccountUiViewKt$$ExternalSyntheticLambda14(toggleState, prepurchaseToggleSection, z3, function12), gapComposer2), gapComposer2, 54, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AfterpayCardKt.PrepurchaseToggleSection((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) obj3, this.f$3, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                Function2 function2 = (Function2) obj5;
                CellConfig cellConfig = (CellConfig) obj3;
                CellDefaultColors cellDefaultColors = (CellDefaultColors) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                } else if (function2 != null) {
                    gapComposer3.startReplaceGroup(1777827460);
                    int ordinal = cellConfig.ordinal();
                    if (ordinal == 0) {
                        j = cellDefaultColors.smallIcon;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        j = cellDefaultColors.largeIcon;
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(j, ArcadeThemeKt.LocalIconColor), LocalEnabledStateKt.LocalEnabledState.defaultProvidedValue$runtime(Boolean.valueOf(z3))}, Expect_jvmKt.rememberComposableLambda(2107797290, new ToastKt$$ExternalSyntheticLambda11(5, function2), gapComposer3), gapComposer3, 56);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(1778159005);
                    gapComposer3.end(false);
                }
                return Unit.INSTANCE;
            case 10:
                CellDefaultColors cellDefaultColors2 = (CellDefaultColors) obj5;
                Function2 function22 = (Function2) obj3;
                Function2 function23 = (Function2) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer4.consume(staticProvidableCompositionLocal)).labelMedium);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextColor;
                    ProvidedValue m = re$$ExternalSyntheticOutline0.m(cellDefaultColors2.label, staticProvidableCompositionLocal2);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = LocalEnabledStateKt.LocalEnabledState;
                    Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, m, dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Boolean.valueOf(z3))}, Expect_jvmKt.rememberComposableLambda(1369372195, new ToastKt$$ExternalSyntheticLambda11(6, function23), gapComposer4), gapComposer4, 56);
                    if (function22 != null) {
                        gapComposer4.startReplaceGroup(1370817628);
                        Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer4.consume(staticProvidableCompositionLocal)).bodySmall), re$$ExternalSyntheticOutline0.m(cellDefaultColors2.body, staticProvidableCompositionLocal2), dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Boolean.valueOf(z3))}, Expect_jvmKt.rememberComposableLambda(130568104, new ToastKt$$ExternalSyntheticLambda11(7, function22), gapComposer4), gapComposer4, 56);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(1371066527);
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                CellDefaultAccessory cellDefaultAccessory = (CellDefaultAccessory) obj5;
                Badge badge = (Badge) obj3;
                Function0 function0 = (Function0) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ProvidedValue defaultProvidedValue$runtime2 = LocalEnabledStateKt.LocalEnabledState.defaultProvidedValue$runtime(Boolean.valueOf(z3));
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalTextColor;
                    if (z3) {
                        gapComposer5.startReplaceGroup(-815173060);
                        gapComposer5.startReplaceGroup(1044898235);
                        long j5 = ((Color) gapComposer5.consume(staticProvidableCompositionLocal3)).value;
                        if (j5 != 16) {
                            j2 = j5;
                            z = false;
                        } else {
                            Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                z = false;
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                            } else {
                                z = false;
                                gapComposer5.startReplaceGroup(-1762997739);
                                gapComposer5.end(false);
                            }
                            j2 = colors.semantic.text.standard;
                        }
                        gapComposer5.end(z);
                    } else {
                        z = false;
                        gapComposer5.startReplaceGroup(-815171308);
                        Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        j2 = colors2.semantic.text.disabled;
                    }
                    gapComposer5.end(z);
                    ProvidedValue m2 = re$$ExternalSyntheticOutline0.m(j2, staticProvidableCompositionLocal3);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal3 = ArcadeThemeKt.LocalIconColor;
                    if (z3) {
                        gapComposer5.startReplaceGroup(-815167821);
                        Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, z);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(z);
                        }
                        j3 = colors3.component.cell.controls.icon.f174default;
                        gapComposer5.end(z);
                    } else {
                        gapComposer5.startReplaceGroup(-815166092);
                        Colors colors4 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, z);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(z);
                        }
                        j3 = colors4.semantic.icon.disabled;
                        gapComposer5.end(z);
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime2, m2, Recorder$$ExternalSyntheticOutline2.m(j3, dynamicProvidableCompositionLocal3)}, Expect_jvmKt.rememberComposableLambda(-890423092, new BankingDialog$$ExternalSyntheticLambda1(1, cellDefaultAccessory, badge, function0), gapComposer5), gapComposer5, 56);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Function0 function02 = (Function0) obj5;
                ButtonProminence buttonProminence = (ButtonProminence) obj3;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    coil3.size.SizeKt.ButtonCompact(function02, null, buttonProminence, false, this.f$3, null, Expect_jvmKt.rememberComposableLambda(-101370130, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 6), gapComposer6), gapComposer6, 1572864, 42);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                zzadn.CashGreenStatusVisual((String) obj5, (GreenStatus) obj3, (Subtitle) obj4, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                CashtagViewModel cashtagViewModel = (CashtagViewModel) obj5;
                Function1 function13 = (Function1) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Object rememberedValue = gapComposer7.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda0(18);
                        gapComposer7.updateRememberedValue(rememberedValue);
                    }
                    boolean z4 = this.f$3;
                    int i4 = 0;
                    DBUtil.BackHandler(z4, (Function0) rememberedValue, gapComposer7, 48, 0);
                    Colors colors5 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Strings.LoadableFullScreenContent(cashtagViewModel, z4, SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors5.semantic.background.f1047app, ColorKt.RectangleShape)), null, null, Expect_jvmKt.rememberComposableLambda(1519141649, new CashtagViewKt$$ExternalSyntheticLambda5(function13, mutableState, i4), gapComposer7), gapComposer7, 196608, 24);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Function1 function14 = (Function1) obj4;
                CashAppPaySettingsRowViewModel$BusinessViewModel cashAppPaySettingsRowViewModel$BusinessViewModel = (CashAppPaySettingsRowViewModel$BusinessViewModel) obj5;
                String str = (String) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-657118118, new SliderDefaults$$ExternalSyntheticLambda0(cashAppPaySettingsRowViewModel$BusinessViewModel, z3, 6), gapComposer8);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-211580807, new TextFieldUIKt$$ExternalSyntheticLambda14(str, z3, i2, (byte) 0), gapComposer8);
                    boolean changed = gapComposer8.changed(function14) | gapComposer8.changedInstance(cashAppPaySettingsRowViewModel$BusinessViewModel);
                    Object rememberedValue2 = gapComposer8.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(25, (Object) cashAppPaySettingsRowViewModel$BusinessViewModel, function14);
                        gapComposer8.updateRememberedValue(rememberedValue2);
                    }
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue2, null, false, true, null, null, push, 0L, null, gapComposer8, 806879286, 0, 3508);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                InfoUpsellCtaButtonScope infoUpsellCtaButtonScope = (InfoUpsellCtaButtonScope) obj5;
                Function0 function03 = (Function0) obj3;
                String str2 = (String) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    coil3.size.SizeKt.ButtonCta(function03, SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, (z3 && (scrollState = infoUpsellCtaButtonScope.contentScrollState) != null && scrollState.getCanScrollForward()) ? false : true, null, Expect_jvmKt.rememberComposableLambda(-1948678750, new SetPinViewKt$$ExternalSyntheticLambda7(str2, 26), gapComposer9), gapComposer9, 1573296, 40);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                EarningsToolsSectionKt.DurationOptionButton((EarningsHomeViewModel.EarnerModeSheet.DurationOption) obj3, this.f$3, (Function0) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                FormBlocker.Element.MerchantTransactionElement merchantTransactionElement = (FormBlocker.Element.MerchantTransactionElement) obj5;
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj3;
                Function0 function04 = (Function0) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer10, 48);
                    int hashCode3 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer10.currentCompositionLocalScope();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer10, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    FormBlocker.Element.MerchantTransactionElement.Amount amount = merchantTransactionElement.amount;
                    amount.getClass();
                    Money money = amount.money;
                    money.getClass();
                    String format2 = moneyFormatter.format(money);
                    String str3 = amount.markdown;
                    if (str3 != null) {
                        format2 = Recorder$$ExternalSyntheticOutline2.m(str3, format2, str3);
                    }
                    String str4 = format2;
                    String str5 = amount.markdown;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (StringsKt.contains((CharSequence) str5, (CharSequence) "~~", false)) {
                        gapComposer10.startReplaceGroup(-278117216);
                        Colors colors6 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                        if (colors6 == null) {
                            colors6 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                        } else {
                            gapComposer10.startReplaceGroup(-1762997739);
                            gapComposer10.end(false);
                        }
                        j4 = colors6.semantic.text.subtle;
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-278031594);
                        gapComposer10.end(false);
                        j4 = Color.Unspecified;
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str4, null, null, null, j4, null, null, null, 0, 0, 0, gapComposer10, 48, 2028);
                    if (function04 != null) {
                        gapComposer10.startReplaceGroup(-277896589);
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                        boolean changed2 = gapComposer10.changed(function04);
                        Object rememberedValue3 = gapComposer10.rememberedValue();
                        if (changed2 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new LocalMapKt$$ExternalSyntheticLambda10(23, function04);
                            gapComposer10.updateRememberedValue(rememberedValue3);
                        }
                        CheckboxKt.UnlabeledCheckbox(this.f$3, (Function1) rememberedValue3, m302paddingqDBjuR0$default, null, false, gapComposer10, MLKEMEngine.KyberPolyBytes, 24);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-277698127);
                        gapComposer10.end(false);
                    }
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ArcadeFormTextKt.ArcadeFormText((FormBlocker.Element.TextElement) obj3, this.f$3, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                MapMarkerProperties mapMarkerProperties = (MapMarkerProperties) obj5;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                GoogleMapEngine.GoogleClusterItemAdapter googleClusterItemAdapter = (GoogleMapEngine.GoogleClusterItemAdapter) obj4;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    ClusteringKt.m2060ClusteringMarkerPropertiesMDSh_HA((Offset) mapMarkerProperties.anchor$delegate.getValue(), Float.valueOf(z3 ? 1.0f : RecyclerView.DECELERATION_RATE), gapComposer11, 0);
                    composableLambdaImpl2.invoke((Object) googleClusterItemAdapter.cashItem, (Object) Boolean.valueOf(z3), (Object) gapComposer11, (Object) 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                CardSchemeViewModel.Module.HeroTag heroTag = (CardSchemeViewModel.Module.HeroTag) obj5;
                HazeState hazeState = (HazeState) obj3;
                List list = (List) obj4;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (!gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    gapComposer12.skipToGroupEnd();
                } else if (heroTag != null) {
                    gapComposer12.startReplaceGroup(354538013);
                    Updater.CompositionLocalProvider(new ProvidedValue[]{CardAppletTileKt.LocalCardAppletTileRenderMode.defaultProvidedValue$runtime(CardAppletTileRenderMode.CardStackOverlay), CardTransitionKt.LocalCardPillHazeState.defaultProvidedValue$runtime(hazeState)}, Expect_jvmKt.rememberComposableLambda(-239741715, new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(list, i3), gapComposer12), gapComposer12, 56);
                    if (z3) {
                        gapComposer12.startReplaceGroup(354810565);
                        z2 = false;
                        ((Item) list.get(0)).UI(gapComposer12, 0);
                        gapComposer12.end(false);
                    } else {
                        z2 = false;
                        gapComposer12.startReplaceGroup(354851888);
                        gapComposer12.end(false);
                    }
                    gapComposer12.end(z2);
                } else {
                    gapComposer12.startReplaceGroup(354870953);
                    ((Item) list.get(0)).UI(gapComposer12, 0);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                CardViewApi21Impl.Disclosure((Modifier) obj5, (String) obj3, this.f$3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                MoneybotHomeViewKt.NextBestActionCard((MoneybotHomeViewModel.NextBestAction) obj5, this.f$3, (Function1) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                TextCardKt.BottomPicker((TemplateCardViewModel.BottomPicker) obj3, this.f$3, (Modifier) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 25:
                QuickPayViewModel.ToolbarWithAvatarViewModel toolbarWithAvatarViewModel = (QuickPayViewModel.ToolbarWithAvatarViewModel) obj5;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj3;
                Function1 function15 = (Function1) obj4;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                boolean shouldExecute = gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2);
                Applier applier = gapComposer13.applier;
                if (shouldExecute) {
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion3, 1.0f);
                    boolean z5 = toolbarWithAvatarViewModel.isTappable;
                    String str6 = toolbarWithAvatarViewModel.subtitle;
                    boolean changed3 = gapComposer13.changed(delegatingSoftwareKeyboardController) | gapComposer13.changed(function15);
                    Object rememberedValue4 = gapComposer13.rememberedValue();
                    int i5 = 16;
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function15, i5);
                        gapComposer13.updateRememberedValue(rememberedValue4);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxWidth2, z5, null, null, (Function0) rememberedValue4, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer13, 0);
                    int hashCode4 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer13, m183clickableoSLSa3U$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer13.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer13, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode4);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer13, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer13, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion3, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer13, 48);
                    int hashCode5 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer13, fillMaxWidth3);
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer13, composeUiNode$Companion$SetModifier$13, gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer13, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer13, materializeModifier5, composeUiNode$Companion$SetModifier$14, 1.0f, false), (TextStyle) null, (TextLineBalancing) null, toolbarWithAvatarViewModel.title, (Map) null, (Function1) null, false);
                    if (z3) {
                        gapComposer13.startReplaceGroup(-1716405571);
                        Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion3, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                        Painter painter = Icons.Business16.painter(gapComposer13);
                        Colors colors7 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                        if (colors7 == null) {
                            colors7 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                        } else {
                            gapComposer13.startReplaceGroup(-1762997739);
                            gapComposer13.end(false);
                        }
                        long j6 = colors7.semantic.icon.brand;
                        ImageKt.Image(painter, null, m302paddingqDBjuR0$default2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j6, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j6), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer13, Painter.$stable | 432, 56);
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(-1716147651);
                        gapComposer13.end(false);
                    }
                    gapComposer13.end(true);
                    if (str6 == null || !(!StringsKt.isBlank(str6))) {
                        gapComposer13.startReplaceGroup(1764366425);
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(1763282107);
                        TextStyle textStyle = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                        Colors colors8 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                        if (colors8 == null) {
                            colors8 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                        } else {
                            gapComposer13.startReplaceGroup(-1762997739);
                            gapComposer13.end(false);
                        }
                        long j7 = colors8.semantic.text.subtle;
                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                        builder.append((CharSequence) str6);
                        KeyMappingKt.appendInlineContent(builder, "iconId", "�");
                        Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2034, j7, (Composer) gapComposer13, (Modifier) null, builder.toAnnotatedString(), textStyle, (TextLineBalancing) null, MapsKt__MapsJVMKt.mapOf(new Pair("iconId", new InlineTextContent(new Placeholder(4, Room.getSp(16), Room.getSp(16)), Expect_jvmKt.rememberComposableLambda(1957569741, new PoolListSectionKt$$ExternalSyntheticLambda2(toolbarWithAvatarViewModel, 4), gapComposer13)))), (Function1) null, false);
                        gapComposer13.end(false);
                    }
                    gapComposer13.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                UtilKt.StatefulReactionButton((Function1) obj4, (Modifier) obj5, (PersonalizedPaymentsReactionsState) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.PayerOverlay((NearbyPayRequestViewModel) obj5, (Function0) obj3, this.f$3, (List) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                AlphaKt.PersonalizePaymentTextField((Modifier) obj5, (Text) obj3, (Function1) obj4, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolRow((Modifier) obj5, (Function1) obj4, (PoolRow) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(TableQrCodeScannerViewModel tableQrCodeScannerViewModel, Function1 function1, Modifier modifier, boolean z, int i) {
        this.$r8$classId = 1;
        this.f$1 = tableQrCodeScannerViewModel;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$3 = z;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.MoneyBarSection moneyBarSection, Modifier modifier, boolean z, Function1 function1, int i) {
        this.$r8$classId = 3;
        this.f$1 = moneyBarSection;
        this.f$0 = modifier;
        this.f$3 = z;
        this.f$2 = function1;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(MoneybotHomeViewModel.NextBestAction nextBestAction, boolean z, Function1 function1, Function0 function0, int i) {
        this.$r8$classId = 23;
        this.f$0 = nextBestAction;
        this.f$3 = z;
        this.f$2 = function1;
        this.f$1 = function0;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(TemplateCardViewModel.BottomPicker bottomPicker, boolean z, Modifier modifier, Function0 function0, int i) {
        this.$r8$classId = 24;
        this.f$1 = bottomPicker;
        this.f$3 = z;
        this.f$0 = modifier;
        this.f$2 = function0;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = z;
        this.f$2 = obj3;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = z;
        this.f$2 = obj3;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Object obj, boolean z, Function function, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$3 = z;
        this.f$2 = function;
        this.f$0 = modifier;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Object obj, boolean z, Function2 function2, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = z;
        this.f$1 = function2;
        this.f$2 = obj2;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Function1 function1, Modifier modifier, PersonalizedPaymentsReactionsState personalizedPaymentsReactionsState, boolean z, int i) {
        this.$r8$classId = 26;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$1 = personalizedPaymentsReactionsState;
        this.f$3 = z;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Function1 function1, CashAppPaySettingsRowViewModel$BusinessViewModel cashAppPaySettingsRowViewModel$BusinessViewModel, boolean z, String str) {
        this.$r8$classId = 15;
        this.f$2 = function1;
        this.f$0 = cashAppPaySettingsRowViewModel$BusinessViewModel;
        this.f$3 = z;
        this.f$1 = str;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(Function1 function1, boolean z, Bitmap bitmap, AccountAvatarViewModel accountAvatarViewModel) {
        this.$r8$classId = 2;
        this.f$2 = function1;
        this.f$3 = z;
        this.f$0 = bitmap;
        this.f$1 = accountAvatarViewModel;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(boolean z, CashtagViewModel cashtagViewModel, Function1 function1, MutableState mutableState) {
        this.$r8$classId = 14;
        this.f$3 = z;
        this.f$0 = cashtagViewModel;
        this.f$2 = function1;
        this.f$1 = mutableState;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda0(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$3 = z;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
