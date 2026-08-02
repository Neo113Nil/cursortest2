package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingDetailRowContentModel;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewModel;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel$Header$TitleOnly;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.investing.viewmodels.PerformanceViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingDetailsCategorySectionContentModel;
import com.squareup.cash.investing.viewmodels.search.SearchResult;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$ImageWithBackground;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$2$1;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda23;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda8;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.stablecoin.views.StablecoinHomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.util.Strings;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public abstract class ArcadeBordersKt {

    /* renamed from: lambda$-1199411960, reason: not valid java name */
    public static final ComposableLambdaImpl f443lambda$1199411960 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(5), false, -1199411960);

    /* renamed from: lambda$-1926626053, reason: not valid java name */
    public static final ComposableLambdaImpl f444lambda$1926626053 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(6), false, -1926626053);
    public static final ComposableLambdaImpl lambda$720889743 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(7), false, 720889743);
    public static final ComposableLambdaImpl lambda$1218095729 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(8), false, 1218095729);
    public static final ComposableLambdaImpl lambda$1576343699 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(11), false, 1576343699);

    /* renamed from: lambda$-747122818, reason: not valid java name */
    public static final ComposableLambdaImpl f445lambda$747122818 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(12), false, -747122818);

    public static final void CollapsingHeader(InvestingStockSelectionViewModel.Loaded loaded, Modifier modifier, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        NavigationType navigationType;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(250744516);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            InvestingStockSelectionViewModel$Header$TitleOnly header = loaded.getHeader();
            if (header == null) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 447316971, false);
            }
            gapComposer.startReplaceGroup(981976946);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            String str = header.title;
            int ordinal = loaded.getNavigationIcon().ordinal();
            if (ordinal == 0) {
                navigationType = NavigationType.BACK;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                navigationType = NavigationType.CLOSE;
            }
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AppUpgradeViewKt$$ExternalSyntheticLambda7(26, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 0, 108);
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i2 >> 9) & 14));
            gapComposer.end(true);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2((Object) loaded, function1, modifier, (Object) composableLambdaImpl, i, 15);
        }
    }

    public static final void InvestingAvatar(LinkScanner linkScanner, ColorModel colorModel, AvatarOverlay avatarOverlay, Boolean bool, Composer composer, int i, int i2) {
        ColorModel colorModel2;
        int i3;
        AvatarOverlay avatarOverlay2;
        int i4;
        Boolean bool2;
        int i5;
        ColorModel colorModel3;
        AvatarOverlay avatarOverlay3;
        Boolean bool3;
        Color m;
        long j;
        AvatarImage.Remote.Image image;
        AvatarImage avatarImage;
        Icons icons;
        linkScanner.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1361047089);
        int i6 = i | (gapComposer.changed(linkScanner) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            colorModel2 = colorModel;
        } else {
            colorModel2 = colorModel;
            i3 = i6 | (gapComposer.changed(colorModel2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
            avatarOverlay2 = avatarOverlay;
        } else {
            avatarOverlay2 = avatarOverlay;
            i4 = i3 | (gapComposer.changed(avatarOverlay2) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            bool2 = bool;
        } else {
            bool2 = bool;
            i5 = i4 | (gapComposer.changed(bool2) ? 2048 : 1024);
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            ColorModel colorModel4 = i7 != 0 ? null : colorModel2;
            Color color = null;
            AvatarOverlay avatarOverlay4 = i8 == 0 ? avatarOverlay2 : null;
            Boolean bool4 = i9 != 0 ? Boolean.TRUE : bool2;
            AvatarSize avatarSize = AvatarSize.Size64;
            if (colorModel4 == null) {
                gapComposer.startReplaceGroup(-1832155898);
                gapComposer.end(false);
                m = null;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1998764453, colorModel4, gapComposer, false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(-1998763816);
                if (linkScanner instanceof InvestingCryptoAvatarContentModel$Icon) {
                    gapComposer.startReplaceGroup(931178165);
                    gapComposer.end(false);
                } else if (linkScanner instanceof InvestingCryptoAvatarContentModel$Image) {
                    gapComposer.startReplaceGroup(-1355434254);
                    color = ThemablesKt.forTheme(((InvestingCryptoAvatarContentModel$Image) linkScanner).accentColor, gapComposer);
                    gapComposer.end(false);
                } else {
                    if (!(linkScanner instanceof InvestingCryptoAvatarContentModel$ImageWithBackground)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1355436123, false);
                    }
                    gapComposer.startReplaceGroup(-1355432686);
                    color = ThemablesKt.forTheme(((InvestingCryptoAvatarContentModel$ImageWithBackground) linkScanner).bgColor, gapComposer);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                m = color;
            } else {
                gapComposer.startReplaceGroup(-1998764839);
                gapComposer.end(false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(-1998762407);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.icon.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1998764794);
                gapComposer.end(false);
                j = m.value;
            }
            if (linkScanner instanceof InvestingCryptoAvatarContentModel$Icon) {
                gapComposer.startReplaceGroup(757289433);
                gapComposer.end(false);
                int ordinal = ((InvestingCryptoAvatarContentModel$Icon) linkScanner).image.ordinal();
                if (ordinal == 0) {
                    icons = Icons.CurrencyBtc32;
                } else {
                    if (ordinal == 1) {
                        throw new NotImplementedError("An operation is not implemented: There is no arrow up/down icon32. ask design");
                    }
                    if (ordinal == 2) {
                        throw new NotImplementedError("An operation is not implemented: There is no arrow up/down icon32. ask design");
                    }
                    if (ordinal == 3) {
                        icons = Icons.Alert32;
                    } else {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        icons = Icons.Savings32;
                    }
                }
                avatarImage = new AvatarImage.LocalIcon(icons, 0L, 6);
            } else {
                if (linkScanner instanceof InvestingCryptoAvatarContentModel$Image) {
                    gapComposer.startReplaceGroup(757661309);
                    image = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(((InvestingCryptoAvatarContentModel$Image) linkScanner).image, gapComposer), false, null, 0L, new InstrumentCellKt$$ExternalSyntheticLambda11(9), 62);
                    gapComposer.end(false);
                } else {
                    if (!(linkScanner instanceof InvestingCryptoAvatarContentModel$ImageWithBackground)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1825543576, false);
                    }
                    gapComposer.startReplaceGroup(757832305);
                    InvestingCryptoAvatarContentModel$ImageWithBackground investingCryptoAvatarContentModel$ImageWithBackground = (InvestingCryptoAvatarContentModel$ImageWithBackground) linkScanner;
                    String urlForTheme = ThemablesKt.urlForTheme(investingCryptoAvatarContentModel$ImageWithBackground.image, gapComposer);
                    Color forTheme = ThemablesKt.forTheme(investingCryptoAvatarContentModel$ImageWithBackground.tintColor, gapComposer);
                    image = new AvatarImage.Remote.Image(urlForTheme, true, null, forTheme != null ? forTheme.value : Color.Unspecified, new InstrumentCellKt$$ExternalSyntheticLambda11(10), 44);
                    gapComposer.end(false);
                }
                avatarImage = image;
            }
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", j, "", (Modifier) null, avatarImage, (Function2) null, avatarOverlay4, bool4 != null ? bool4.booleanValue() : true, 0L, gapComposer, ((i5 << 15) & 29360128) | 3126, 0, 1616);
            colorModel3 = colorModel4;
            avatarOverlay3 = avatarOverlay4;
            bool3 = bool4;
        } else {
            gapComposer.skipToGroupEnd();
            colorModel3 = colorModel2;
            avatarOverlay3 = avatarOverlay2;
            bool3 = bool2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(linkScanner, colorModel3, avatarOverlay3, bool3, i, i2);
        }
    }

    public static final void InvestingDisclosures(String str, Function1 function1, Composer composer, int i) {
        str.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1334578607);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            long j = Strings.getColors(gapComposer).semantic.text.subtle;
            boolean z = true;
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer).linkXSmall.spanStyle, Strings.getColors(gapComposer).semantic.text.link, null, 0L, JpegConstants.COM_MARKER), 2);
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
            if ((i2 & 112) != 32) {
                z = false;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, fillMaxWidth, textStyle, j, markdownSpanValues, null, null, 0, 0, 3, gapComposer, i2 & 14, 960);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str, function1, i, 9);
        }
    }

    public static final void InvestingFeaturedIn(RealImageLoader realImageLoader, InvestingDetailsCategorySectionContentModel investingDetailsCategorySectionContentModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1994704960);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(investingDetailsCategorySectionContentModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            boolean z2 = false;
            ViewfinderDefaults.SectionHeader(investingDetailsCategorySectionContentModel.header, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(424044855);
            for (InvestingDetailsCategorySectionContentModel.Cell cell : investingDetailsCategorySectionContentModel.cells) {
                String urlForTheme = ThemablesKt.urlForTheme(cell.image, gapComposer);
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(147775477, new QuickAccessBarKt$$ExternalSyntheticLambda1(11, realImageLoader, cell, urlForTheme), gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-324221932, new CashMapViewKt$$ExternalSyntheticLambda5(cell, 2), gapComposer);
                boolean changedInstance = ((i2 & 896) == 256 ? z : z2) | gapComposer.changedInstance(cell);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(5, function1, cell);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, true, null, null, push, 0L, null, gapComposer2, 806879286, 0, 3508);
                z2 = z2;
                gapComposer = gapComposer2;
                i2 = i2;
                z = true;
            }
            gapComposer.end(z2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(realImageLoader, investingDetailsCategorySectionContentModel, function1, i, 7);
        }
    }

    public static final void InvestingKeyStatsTile(final InvestingDetailTileViewModel investingDetailTileViewModel, final Function1 function1, Modifier modifier, Composer composer, final int i) {
        final Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        investingDetailTileViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(81318989);
        int i2 = i | (gapComposer.changedInstance(investingDetailTileViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = investingDetailTileViewModel instanceof InvestingDetailTileViewModel.Content;
            final Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (!z) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2(investingDetailTileViewModel, function1, companion, i, i3) { // from class: com.squareup.cash.investing.components.InvestingKeyStatsTileKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ InvestingDetailTileViewModel f$0;
                        public final /* synthetic */ Function1 f$1;
                        public final /* synthetic */ Modifier f$2;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    ArcadeBordersKt.InvestingKeyStatsTile(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    ArcadeBordersKt.InvestingKeyStatsTile(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
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
            InvestingDetailTileViewModel.Content content = (InvestingDetailTileViewModel.Content) investingDetailTileViewModel;
            ArrayList arrayList = content.pages;
            String str = content.title;
            String stringResource = Room.stringResource(gapComposer, R.string.investing_components_details);
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AppUpgradeViewKt$$ExternalSyntheticLambda7(23, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, stringResource, (Function0) rememberedValue, (String) null, gapComposer, 0, 18);
            if (arrayList.isEmpty()) {
                gapComposer.startReplaceGroup(-316053569);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-316535991);
                InvestingDetailRowContentModel investingDetailRowContentModel = (InvestingDetailRowContentModel) CollectionsKt.first((List) arrayList);
                ListUnorderedProminence listUnorderedProminence = investingDetailRowContentModel.isStale ? ListUnorderedProminence.Subtle : ListUnorderedProminence.Standard;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                ListUnorderedKt.ListUnordered(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1), (ListUnorderedState) null, listUnorderedProminence, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(195814392, new FormView$$ExternalSyntheticLambda0(investingDetailRowContentModel, 15), gapComposer), gapComposer, 196608, 26);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = 1;
            function2 = new Function2(investingDetailTileViewModel, function1, modifier2, i, i4) { // from class: com.squareup.cash.investing.components.InvestingKeyStatsTileKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ InvestingDetailTileViewModel f$0;
                public final /* synthetic */ Function1 f$1;
                public final /* synthetic */ Modifier f$2;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            ArcadeBordersKt.InvestingKeyStatsTile(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            ArcadeBordersKt.InvestingKeyStatsTile(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void InvestingPerformance(PerformanceViewModel performanceViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        performanceViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1532523717);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? i | (gapComposer.changed(performanceViewModel) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier testTag = TestTagKt.testTag(SpacerKt.navigationBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f)), "InvestingPerformance");
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, testTag);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            String str = performanceViewModel.title;
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AppUpgradeViewKt$$ExternalSyntheticLambda7(24, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion2 = companion;
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion2, ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(-359764002);
            int i4 = 0;
            for (Object obj : performanceViewModel.sections) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                PerformanceViewModel.Section section = (PerformanceViewModel.Section) obj;
                if (i4 > 0) {
                    gapComposer.startReplaceGroup(-1054653721);
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1054605671);
                    gapComposer.end(false);
                }
                String str2 = section.section.title;
                if (str2 == null) {
                    str2 = "";
                }
                GapComposer gapComposer2 = gapComposer;
                ViewfinderDefaults.SectionHeader(str2, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier.Companion companion3 = companion2;
                ListUnorderedKt.ListUnordered(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1106632271, new FormView$$ExternalSyntheticLambda0(section, 16), gapComposer2), gapComposer2, 196608, 30);
                gapComposer = gapComposer2;
                i4 = i5;
                companion2 = companion3;
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier2, (Object) performanceViewModel, function1, i, 8);
        }
    }

    public static final void InvestingSearchStockRow(SearchResult searchResult, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        function1.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(350281209);
        int i2 = (gapComposer.changed(searchResult) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), "StockSearchResult");
            boolean changedInstance = gapComposer.changedInstance(realImageLoader);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new StablecoinHomeViewKt$$ExternalSyntheticLambda10(realImageLoader, 5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda10(21, searchResult, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function12, testTag, (Function1) rememberedValue2, gapComposer, 48, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1(searchResult, function1, realImageLoader, i, 16);
        }
    }

    public static final void InvestingStockDetailsCollapsedHeader(InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1234062588);
        int i2 = 4;
        int i3 = (gapComposer.changed(investingStockDetailsHeaderViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(realImageLoader) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(realImageLoader);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new StablecoinHomeViewKt$$ExternalSyntheticLambda10(realImageLoader, i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            boolean z = (i3 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda2(investingStockDetailsHeaderViewModel, 24);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function1, modifier, (Function1) rememberedValue2, gapComposer, 48, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1(investingStockDetailsHeaderViewModel, realImageLoader, modifier, i, 12);
        }
    }

    public static final void InvestmentEntityButtons(InvestmentEntityContentModel.InvestmentEntityButtonContainerModel investmentEntityButtonContainerModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(762898293);
        int i2 = (gapComposer.changed(investmentEntityButtonContainerModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 6);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-96077340, new SkipPaymentView$$ExternalSyntheticLambda1(13, investmentEntityButtonContainerModel, function1), gapComposer), gapComposer, 3072, 7);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1(investmentEntityButtonContainerModel, function1, modifier2, i, 15);
        }
    }

    public static final void MyInvestmentAmountSection(String str, String str2, Modifier modifier, BiasAlignment.Horizontal horizontal, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1988469644);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 3;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(6.0f), horizontal, gapComposer, 54);
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
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).header, 0L, Room.getSp(24), null, null, Room.getSp(0.1d), null, 0L, null, null, null, 0, 0L, null, null, 0, 16777085), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).input, 0L, 0L, null, null, Room.getSp(0.1d), null, 0L, null, null, null, 0, 0L, null, null, 0, 16777087), (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(str, i, str2, modifier2, horizontal, 14);
        }
    }

    public static final void MyInvestmentsTile(MyInvestmentsContentModel myInvestmentsContentModel, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        String str;
        long j;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1308437834);
        int i2 = 4;
        int i3 = i | (gapComposer.changed(myInvestmentsContentModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
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
            String title = myInvestmentsContentModel.getTitle();
            if (myInvestmentsContentModel.getShowHeaderAction()) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer, -1960377437, R.string.investing_components_details, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1960298604);
                gapComposer.end(false);
                str = null;
            }
            ViewfinderDefaults.SectionHeader(title, (Modifier) null, str, function0, (String) null, gapComposer, (i3 << 6) & 7168, 18);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (myInvestmentsContentModel.isStale()) {
                gapComposer.startReplaceGroup(-1960149835);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1960087277);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.standard;
                gapComposer.end(false);
            }
            Updater.CompositionLocalProvider(re$$ExternalSyntheticOutline0.m(j, ArcadeThemeKt.LocalTextColor), Expect_jvmKt.rememberComposableLambda(1470127956, new CashMapViewKt$$ExternalSyntheticLambda5(myInvestmentsContentModel, i2), gapComposer), gapComposer, 56);
            if (myInvestmentsContentModel.getInvestmentStats().isEmpty()) {
                gapComposer.startReplaceGroup(-1956582386);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1959077142);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, myInvestmentsContentModel.isStale() ? ListUnorderedProminence.Subtle : ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1880570495, new PoolListSectionKt$$ExternalSyntheticLambda8(myInvestmentsContentModel, j, i2), gapComposer), gapComposer, 196608, 27);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(modifier2, 8.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1(myInvestmentsContentModel, function0, modifier2, i, 17);
        }
    }

    public static final void SearchResultItem(InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel, boolean z, RealImageLoader realImageLoader, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier m285size3ABfNKs;
        int i2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1027938642);
        int i3 = i | (gapComposer2.changed(searchResultItemModel) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer2.changedInstance(function0) ? 2048 : 1024) | (gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(function03) ? 131072 : 65536);
        int i4 = 0;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = searchResultItemModel.enabled;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2) {
                gapComposer2.startReplaceGroup(-203002475);
                Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 48.0f);
                boolean z3 = (i3 & 7168) == 2048;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z3 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda10(22, function0);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                m285size3ABfNKs = ImageKt.m183clickableoSLSa3U$default(m285size3ABfNKs2, false, null, null, (Function0) rememberedValue, 15);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-202934926);
                gapComposer2.end(false);
                m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 48.0f);
            }
            boolean z4 = searchResultItemModel.enabled;
            CellDefaultAccessory checkbox = z ? new CellDefaultAccessory.Checkbox(searchResultItemModel.selected) : new CellDefaultAccessory.ButtonCompact(null, null, false, lambda$1218095729, 15);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1900657972, new QuickAccessBarKt$$ExternalSyntheticLambda1(m285size3ABfNKs, realImageLoader, searchResultItemModel), gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1960345643, new InvestingStockSelectionViewKt$$ExternalSyntheticLambda15(searchResultItemModel, i4), gapComposer2);
            boolean z5 = ((i3 & 112) == 32) | ((458752 & i3) == 131072) | ((i3 & 57344) == 16384);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z5 || rememberedValue2 == neverEqualPolicy) {
                i2 = 1;
                rememberedValue2 = new ReviewPaymentKt$$ExternalSyntheticLambda23(1, function03, function02, z);
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                i2 = 1;
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue2, null, z4, false, Expect_jvmKt.rememberComposableLambda(-643436443, new InvestingStockSelectionViewKt$$ExternalSyntheticLambda15(searchResultItemModel, i2), gapComposer2), null, checkbox, 0L, null, gapComposer, 12582966, 0, 3412);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TooltipKt$$ExternalSyntheticLambda2(searchResultItemModel, z, realImageLoader, function0, function02, function03, i);
        }
    }

    public static final void StockList(InvestingStockSelectionViewModel.Loaded loaded, RealImageLoader realImageLoader, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-723774733);
        int i2 = i | (gapComposer.changed(loaded) ? 4 : 2) | (gapComposer.changedInstance(realImageLoader) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            boolean changedInstance = ((i2 & 896) == 256) | ((i2 & 14) == 4) | gapComposer.changedInstance(realImageLoader);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(18, loaded, function1, realImageLoader);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(layoutWeightElement, rememberLazyListState, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 0, 508);
            if (!(loaded instanceof InvestingStockSelectionViewModel.Loaded.MultiSelect) || (loaded instanceof InvestingStockSelectionViewModel.Loaded.Searching)) {
                gapComposer.startReplaceGroup(1431025605);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1430677723);
                DimensionKt.ButtonCtaGroup(null, true, null, null, Expect_jvmKt.rememberComposableLambda(981786240, new MoneyTabBookletKt$$ExternalSyntheticLambda4(15, (Object) loaded, function1), gapComposer), gapComposer, 24624, 13);
                gapComposer.end(false);
            }
            InvestingStockSelectionViewModel.SearchResultModel searchResults = loaded.getSearchResults();
            InvestingStockSelectionViewModel.SearchResultModel.UnlabeledSection unlabeledSection = searchResults instanceof InvestingStockSelectionViewModel.SearchResultModel.UnlabeledSection ? (InvestingStockSelectionViewModel.SearchResultModel.UnlabeledSection) searchResults : null;
            if (unlabeledSection != null ? unlabeledSection.results.isEmpty() : false) {
                gapComposer.startReplaceGroup(1431440261);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1431235568);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = Updater.mutableStateOf$default(Boolean.TRUE);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState = (MutableState) rememberedValue2;
                InvestingStockSelectionViewModel.SearchResultModel searchResults2 = loaded.getSearchResults();
                boolean changed = gapComposer.changed(rememberLazyListState);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == obj) {
                    rememberedValue3 = new MoneyTabUIKt$MoneyTabLoaded$4$2$1(rememberLazyListState, mutableState, null, 4);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer, searchResults2, (Function2) rememberedValue3);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) loaded, (Object) realImageLoader, (Function) function1, i, 14);
        }
    }

    public static void attachTo(final AppCompatImageButton appCompatImageButton) {
        final EglCore eglCore = new EglCore(16);
        final GestureDetector gestureDetector = new GestureDetector(appCompatImageButton.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.squareup.cash.investing.components.RepeatClicksOnLongPress$attachTo$longPressDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                motionEvent.getClass();
                StateFlowKt.emitOrThrow((SharedFlowImpl) eglCore.eglContext, Unit.INSTANCE);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                motionEvent.getClass();
                return AppCompatImageButton.this.performClick();
            }
        });
        appCompatImageButton.setOnTouchListener(new View.OnTouchListener() { // from class: com.squareup.cash.investing.components.RepeatClicksOnLongPress$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 1 || action == 3) {
                    StateFlowKt.emitOrThrow((SharedFlowImpl) EglCore.this.eglConfig, Unit.INSTANCE);
                }
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        ViewKt.whileEachAttached(appCompatImageButton, EmptyCoroutineContext.INSTANCE, new CheckStatusPresenter.AnonymousClass1(eglCore, appCompatImageButton, null, 15));
    }

    public static final ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 investingCryptoExchangeView(Context context, InvestingScreens.TransferStock transferStock) {
        context.getClass();
        return new ArcadeMigrationUtilsKt$investingCryptoExchangeView$1(context, transferStock.accentColor, transferStock.side == OrderSide.BUY, transferStock.f1162type instanceof InvestingScreens.OrderType.CustomOrder, transferStock.savedState instanceof AmountSheetSavedState.AmountKeypadState, new ActivityItemLayout$$ExternalSyntheticLambda4(28), new ActivityItemLayout$$ExternalSyntheticLambda4(29));
    }

    /* renamed from: setArcadeTileRowBorder-ziNgDLE, reason: not valid java name */
    public static final void m3579setArcadeTileRowBorderziNgDLE(ComposeView composeView, boolean z, boolean z2) {
        composeView.getClass();
        byte b = 0;
        composeView.setContent(new ComposableLambdaImpl(new ArcadeBordersKt$$ExternalSyntheticLambda0(z, z2, b, b), true, -981016653));
    }
}
