package com.squareup.cash.offers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material.SurfaceKt$$ExternalSyntheticLambda4;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.SliderKt$SliderImpl$2$1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadq;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.borrow.ui.util.FillableBackgroundKt$$ExternalSyntheticLambda0;
import com.squareup.cash.charting.components.SegmentedBarChartKt$$ExternalSyntheticLambda9;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneybot.genie.DatePickerViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.viewmodels.FormattedDetailViewModel;
import com.squareup.cash.offers.viewmodels.OffersGreenStatusViewModel;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.FilterGroupsSectionViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersMessageViewModel;
import com.squareup.cash.offers.viewmodels.shared.OffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.SearchViewAction;
import com.squareup.cash.offers.views.home.OffersHeroTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.offers.views.listing.OffersSearchListingKt;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class UtilsKt {

    /* renamed from: lambda$-207972424, reason: not valid java name */
    public static final ComposableLambdaImpl f514lambda$207972424;
    public static final ComposableLambdaImpl lambda$1062725653;
    public static final ComposableLambdaImpl lambda$507632886;

    /* renamed from: lambda$-1584023237, reason: not valid java name */
    public static final ComposableLambdaImpl f513lambda$1584023237 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(2), false, -1584023237);

    /* renamed from: lambda$-1384212238, reason: not valid java name */
    public static final ComposableLambdaImpl f511lambda$1384212238 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(3), false, -1384212238);

    /* renamed from: lambda$-1507546186, reason: not valid java name */
    public static final ComposableLambdaImpl f512lambda$1507546186 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(7), false, -1507546186);

    static {
        new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(8), false, -234019096);
        f514lambda$207972424 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(13), false, -207972424);
        lambda$1062725653 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(14), false, 1062725653);
        lambda$507632886 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda2(8), false, 507632886);
    }

    public static final void FilterBar(OffersSearchViewModel offersSearchViewModel, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1554074910);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(offersSearchViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changedInstance = gapComposer.changedInstance(offersSearchViewModel) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(14, offersSearchViewModel, function1, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            FilterBarKt.FilterBar(null, null, m295PaddingValuesYgX7TsA$default, (Function1) rememberedValue, gapComposer, 0, 3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(offersSearchViewModel, function1, function0, i, 24);
        }
    }

    public static final void FittedText(Modifier modifier, FittedTextState fittedTextState, Function2 function2, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        function2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1496456916);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(fittedTextState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            modifier2 = modifier;
            OffsetKt.BoxWithConstraints(modifier2, null, false, Expect_jvmKt.rememberComposableLambda(-350391362, new MoneyTabUIKt$$ExternalSyntheticLambda11(15, fittedTextState, function2), gapComposer), gapComposer, (i2 & 14) | 3072, 6);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(modifier2, fittedTextState, function2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OffersAvatar(OffersAvatarViewModel offersAvatarViewModel, boolean z, Modifier modifier, AvatarSize avatarSize, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer;
        AvatarSize avatarSize2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        String str;
        String str2;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(462991824);
        int i4 = (gapComposer2.changed(offersAvatarViewModel) ? 4 : 2) | i | (gapComposer2.changed(z) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= gapComposer2.changed(avatarSize == null ? -1 : avatarSize.ordinal()) ? 2048 : 1024;
            }
            int i6 = 0;
            if (gapComposer2.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                avatarSize2 = avatarSize;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                AvatarSize avatarSize3 = i3 != 0 ? AvatarSize.Size64 : avatarSize;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                boolean z2 = colors.isLight;
                boolean changed = gapComposer2.changed(z2);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    OffersAvatarViewModel.IconUrl iconUrl = offersAvatarViewModel.url;
                    if (z2 || (str = iconUrl.dark) == null) {
                        str = iconUrl.light;
                    }
                    rememberedValue = str;
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                String str3 = (String) rememberedValue;
                Color color = null;
                Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(modifier4, null, 3);
                Character ch = offersAvatarViewModel.monogram;
                if (ch == null || (str2 = String.valueOf(ch.charValue())) == null) {
                    str2 = "";
                }
                com.squareup.protos.cash.ui.Color color2 = offersAvatarViewModel.backgroundColor;
                if (color2 == null) {
                    gapComposer2.startReplaceGroup(1850107271);
                    gapComposer2.end(false);
                } else {
                    color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -1741434438, color2, gapComposer2, false);
                }
                if (color == null) {
                    gapComposer2.startReplaceGroup(-1741432738);
                    Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j = colors2.semantic.background.extraProminent;
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1741435094);
                    gapComposer2.end(false);
                    j = color.value;
                }
                gapComposer = gapComposer2;
                TextViewKt.m3613AvatarB_rZmmc(avatarSize3, str2, j, (String) null, wrapContentWidth$default, (AvatarImage) new AvatarImage.Remote.Image(str3, offersAvatarViewModel.colorizeImage, null, 0L, new OffersAvatarKt$$ExternalSyntheticLambda0(i6), 60), (Function2) null, (AvatarOverlay) (z ? new AvatarOverlay.LocalIcon(14, 0L, 0L, Icons.Check16) : null), false, 0L, (Composer) gapComposer, ((i4 >> 9) & 14) | 3072, 0, 1856);
                modifier3 = modifier4;
                avatarSize2 = avatarSize3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(offersAvatarViewModel, z, modifier3, avatarSize2, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        int i62 = 0;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void OffersCollapsibleHeaderScaffold(Modifier modifier, OffersCollapsibleHeaderScaffoldState offersCollapsibleHeaderScaffoldState, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1025858675);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(offersCollapsibleHeaderScaffoldState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(ClipKt.clipToBounds(modifier), offersCollapsibleHeaderScaffoldState.nestedScrollConnection, null);
            boolean changedInstance = gapComposer.changedInstance(offersCollapsibleHeaderScaffoldState);
            Object rememberedValue = gapComposer.rememberedValue();
            int i3 = 6;
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SliderKt$SliderImpl$2$1(offersCollapsibleHeaderScaffoldState, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, nestedScroll);
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
            Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            composableLambdaImpl2.invoke(gapComposer, Integer.valueOf((i2 >> 9) & 14));
            Recorder$$ExternalSyntheticOutline2.m((i2 >> 6) & 14, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(modifier, offersCollapsibleHeaderScaffoldState, composableLambdaImpl, composableLambdaImpl2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0042  */
    /* renamed from: OffersFormattedDetail-NLbO3rw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3676OffersFormattedDetailNLbO3rw(FormattedDetailViewModel formattedDetailViewModel, Modifier modifier, TextStyle textStyle, long j, String str, long j2, float f, Composer composer, int i, int i2) {
        Modifier modifier2;
        TextStyle textStyle2;
        int i3;
        long j3;
        int i4;
        int i5;
        String str2;
        long j4;
        float f2;
        RecomposeScopeImpl endRestartGroup;
        String stringResource;
        long j5;
        int i6;
        float f3;
        formattedDetailViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(474347692);
        int i7 = i | (gapComposer.changedInstance(formattedDetailViewModel) ? 4 : 2);
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i7 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) != 0) {
                textStyle2 = textStyle;
                if (gapComposer.changed(textStyle2)) {
                    i3 = 256;
                    int i9 = i7 | i3;
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (gapComposer.changed(j3)) {
                            i4 = 2048;
                            i5 = i9 | i4 | 13180928;
                            if (gapComposer.shouldExecute(i5 & 1, (4793491 & i5) == 4793490)) {
                                gapComposer.skipToGroupEnd();
                                str2 = str;
                                j4 = j2;
                                f2 = f;
                            } else {
                                gapComposer.startDefaults();
                                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                                    if (i8 != 0) {
                                        modifier2 = Modifier.Companion.$$INSTANCE;
                                    }
                                    if ((i2 & 4) != 0) {
                                        i5 &= -897;
                                        textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                    }
                                    if ((i2 & 8) != 0) {
                                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                        } else {
                                            gapComposer.startReplaceGroup(-1762997739);
                                            gapComposer.end(false);
                                        }
                                        j3 = colors.semantic.text.subtle;
                                        i5 &= -7169;
                                    }
                                    stringResource = Room.stringResource(gapComposer, R.string.dummy_dollar_amount);
                                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                    } else {
                                        gapComposer.startReplaceGroup(-1762997739);
                                        gapComposer.end(false);
                                    }
                                    j5 = colors2.semantic.background.subtle;
                                    i6 = i5 & (-4186113);
                                    f3 = 1.0f;
                                } else {
                                    gapComposer.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i5 &= -897;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i5 &= -7169;
                                    }
                                    i6 = i5 & (-4186113);
                                    stringResource = str;
                                    j5 = j2;
                                    f3 = f;
                                }
                                gapComposer.endDefaults();
                                final String str3 = stringResource;
                                final TextStyle textStyle3 = textStyle2;
                                final long j6 = j3;
                                final float f4 = f3;
                                final long j7 = j5;
                                CrossfadeKt.Crossfade(formattedDetailViewModel, modifier2, (FiniteAnimationSpec) null, "formattedDetailLoading", Expect_jvmKt.rememberComposableLambda(1370413032, new Function3() { // from class: com.squareup.cash.offers.views.OffersFormattedDetailKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        GapComposer gapComposer2;
                                        FormattedDetailViewModel formattedDetailViewModel2 = (FormattedDetailViewModel) obj;
                                        Composer composer2 = (Composer) obj2;
                                        ((Integer) obj3).getClass();
                                        formattedDetailViewModel2.getClass();
                                        Color color = null;
                                        Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(Modifier.Companion.$$INSTANCE, null, 3);
                                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, composer2, 48);
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(composer2, animateContentSize$default);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer4.startReusableNode();
                                        if (gapComposer4.inserting) {
                                            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer4.useNode();
                                        }
                                        Updater.m576setimpl(composer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(composer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(composer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(composer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(composer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        boolean z = formattedDetailViewModel2 instanceof FormattedDetailViewModel.Loading;
                                        TextStyle textStyle4 = textStyle3;
                                        if (z) {
                                            gapComposer4.startReplaceGroup(777170106);
                                            gapComposer4.startReplaceGroup(777180676);
                                            gapComposer4.end(false);
                                            final float mo231toDpGaN1DYA = ((Density) gapComposer4.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(textStyle4.paragraphStyle.lineHeight);
                                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1215884298, new DatePickerViewKt$$ExternalSyntheticLambda4(str3, textStyle4, 2), composer2);
                                            final float f5 = f4;
                                            final long j8 = j7;
                                            UtilsKt.ProvideWidth(rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(-1974996021, new Function3() { // from class: com.squareup.cash.offers.views.OffersFormattedDetailKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                    Dp dp = (Dp) obj4;
                                                    Composer composer3 = (Composer) obj5;
                                                    int intValue = ((Integer) obj6).intValue();
                                                    if ((intValue & 6) == 0) {
                                                        intValue |= ((GapComposer) composer3).changed(dp.value) ? 4 : 2;
                                                    }
                                                    GapComposer gapComposer5 = (GapComposer) composer3;
                                                    if (gapComposer5.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                                        VisibleKt.ShimmerBox(AlphaKt.alpha(Modifier.Companion.$$INSTANCE, f5), false, null, Expect_jvmKt.rememberComposableLambda(95078204, new FillableBackgroundKt$$ExternalSyntheticLambda0(dp, mo231toDpGaN1DYA, j8), gapComposer5), gapComposer5, 3072, 6);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, composer2), composer2, 54);
                                            gapComposer4.end(false);
                                            gapComposer2 = gapComposer4;
                                        } else {
                                            if (!(formattedDetailViewModel2 instanceof FormattedDetailViewModel.Text)) {
                                                throw NavAction$$ExternalSyntheticOutline0.m(gapComposer4, 717835713, false, "Formatted label only supports loading and text states.");
                                            }
                                            gapComposer4.startReplaceGroup(777874612);
                                            FormattedDetailViewModel.Text text = (FormattedDetailViewModel.Text) formattedDetailViewModel2;
                                            String str4 = text.text;
                                            com.squareup.protos.cash.ui.Color color2 = text.textColor;
                                            if (color2 == null) {
                                                gapComposer4.startReplaceGroup(777937355);
                                            } else {
                                                gapComposer4.startReplaceGroup(717831414);
                                                color = ThemablesKt.forTheme(color2, composer2);
                                            }
                                            gapComposer4.end(false);
                                            gapComposer2 = gapComposer4;
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 3826, color != null ? color.value : j6, composer2, (Modifier) null, textStyle4, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                            gapComposer2.end(false);
                                        }
                                        gapComposer2.end(true);
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer), gapComposer, (i6 & 112) | (i6 & 14) | 27648, 4);
                                j4 = j5;
                                f2 = f3;
                                str2 = stringResource;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new SurfaceKt$$ExternalSyntheticLambda4(formattedDetailViewModel, modifier2, textStyle2, j3, str2, j4, f2, i, i2);
                                return;
                            }
                            return;
                        }
                    } else {
                        j3 = j;
                    }
                    i4 = 1024;
                    i5 = i9 | i4 | 13180928;
                    if (gapComposer.shouldExecute(i5 & 1, (4793491 & i5) == 4793490)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
            } else {
                textStyle2 = textStyle;
            }
            i3 = 128;
            int i92 = i7 | i3;
            if ((i2 & 8) == 0) {
            }
            i4 = 1024;
            i5 = i92 | i4 | 13180928;
            if (gapComposer.shouldExecute(i5 & 1, (4793491 & i5) == 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
        }
        i3 = 128;
        int i922 = i7 | i3;
        if ((i2 & 8) == 0) {
        }
        i4 = 1024;
        i5 = i922 | i4 | 13180928;
        if (gapComposer.shouldExecute(i5 & 1, (4793491 & i5) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void OffersGreenStatus(final OffersGreenStatusViewModel offersGreenStatusViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        OffersGreenStatusViewModel offersGreenStatusViewModel2;
        Function1 function12 = function1;
        offersGreenStatusViewModel.getClass();
        modifier.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-703112970);
        int i2 = i | (gapComposer.changedInstance(offersGreenStatusViewModel) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128);
        final int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i4 = Strings.getColors(gapComposer).isLight ? 2131233199 : 2131233198;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.verticalScroll$default(modifier, ImageKt.rememberScrollState(gapComposer), false, 14), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            final int i5 = 1;
            ImageKt.Image(Countries.painterResource(i4, 0, gapComposer), null, SizeKt.m287sizeVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 375.0f, 323.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(802133655, new Function2() { // from class: com.squareup.cash.offers.views.OffersGreenStatusSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i3;
                    OffersGreenStatusViewModel offersGreenStatusViewModel3 = offersGreenStatusViewModel;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str = offersGreenStatusViewModel3.title;
                                TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).headlineSmall;
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str2 = offersGreenStatusViewModel3.subtitle;
                                TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(1639118900, new Function2() { // from class: com.squareup.cash.offers.views.OffersGreenStatusSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    OffersGreenStatusViewModel offersGreenStatusViewModel3 = offersGreenStatusViewModel;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str = offersGreenStatusViewModel3.title;
                                TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).headlineSmall;
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str2 = offersGreenStatusViewModel3.subtitle;
                                TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3078, 6);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            String str = offersGreenStatusViewModel.linkText;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            long j = Strings.getColors(gapComposer).semantic.text.link;
            TextStyle textStyle = Strings.getTypography(gapComposer).linkXSmall;
            int i6 = i2 & 896;
            boolean z = i6 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(21, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, j, null, null, null, 0, 0, 0, gapComposer, 0, 2016);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z2 = i6 == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new MusicViewKt$$ExternalSyntheticLambda0(22, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            Function0 function0 = (Function0) rememberedValue2;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            offersGreenStatusViewModel2 = offersGreenStatusViewModel;
            coil3.size.SizeKt.ButtonCta(function0, SpacerKt.m298padding3ABfNKs(fillMaxWidth2, 16.0f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(-882620997, new P2PListViewKt$$ExternalSyntheticLambda12(offersGreenStatusViewModel2, 12), gapComposer), gapComposer, 1573248, 56);
            gapComposer.end(true);
        } else {
            offersGreenStatusViewModel2 = offersGreenStatusViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) offersGreenStatusViewModel2, (Object) modifier, (Function) function12, i, 26);
        }
    }

    public static final void OffersGreenStatusSheet(OffersGreenStatusViewModel offersGreenStatusViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        offersGreenStatusViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1233341020);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(offersGreenStatusViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-396880847, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(i3, function1, offersGreenStatusViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(offersGreenStatusViewModel, function1, i, 7);
        }
    }

    public static final void OffersMessageView(OffersMessageViewModel offersMessageViewModel, Function0 function0, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        String m;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1239610478);
        int i4 = i | (gapComposer.changedInstance(offersMessageViewModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i6 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier3 = i5 != 0 ? companion : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier3);
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
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 250.0f, 180.0f);
            Image image = offersMessageViewModel.image;
            if (image == null) {
                gapComposer.startReplaceGroup(-1571387444);
                gapComposer.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -1574710571, image, gapComposer, false);
            }
            Modifier modifier4 = modifier3;
            String str = m;
            Painter painterResource = Countries.painterResource(R.drawable.offers_message_empty_state_banner, 0, gapComposer);
            Painter painterResource2 = Countries.painterResource(R.drawable.offers_message_empty_state_banner, 0, gapComposer);
            int i7 = Painter.$stable;
            int i8 = i3;
            AsyncImageKt.m1442AsyncImagex1rPTaM(str, m287sizeVpY3zN4, painterResource, painterResource2, null, null, null, gapComposer, (i7 << 9) | 48 | (i7 << 12), 0, 32736);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            m3677OffersStyledTextCnvfe3Y(null, offersMessageViewModel.title, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle, 0L, 0, null, 0, 3, gapComposer, 0, 121);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Button button = offersMessageViewModel.actionButton;
            if (button == null) {
                gapComposer.startReplaceGroup(-1570935557);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1570935556);
                coil3.size.SizeKt.ButtonCompact(function0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1576721843, new OffersMessageViewKt$$ExternalSyntheticLambda0(button, i6), gapComposer), gapComposer, ((i8 >> 3) & 14) | 1572864, 62);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(offersMessageViewModel, function0, modifier2, i, i2, 23);
        }
    }

    public static final void OffersPullToRefresh(Modifier modifier, Function0 function0, boolean z, String str, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Modifier modifier2;
        function0.getClass();
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1151366512);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = (i2 >> 6) & 14;
            PullRefreshState m2016rememberPullRefreshStateUuyPYSY = zzadq.m2016rememberPullRefreshStateUuyPYSY(z, function0, gapComposer, (i2 & 112) | i3);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier pullRefresh = PullRefreshKt.pullRefresh(ClipKt.clipToBounds(companion), m2016rememberPullRefreshStateUuyPYSY, true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pullRefresh);
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
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i2 >> 15) & 14));
            boolean z2 = (i2 & 57344) == 16384;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(str, 21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = companion;
            PullRefreshIndicatorKt.m511PullRefreshIndicatorjB83MbM(z, m2016rememberPullRefreshStateUuyPYSY, BoxScopeInstance.INSTANCE.align(SemanticsModifierKt.semantics(modifier2, false, (Function1) rememberedValue), Alignment.Companion.TopCenter), MooncakeTheme.getColors(gapComposer).background, MooncakeTheme.getColors(gapComposer).green, gapComposer, i3 | 64);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(modifier2, function0, z, str, composableLambdaImpl, i);
        }
    }

    public static final void OffersSearchView(OffersSearchViewModel offersSearchViewModel, TextFieldState textFieldState, Modifier modifier, Function1 function1, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        TextFieldState textFieldState2;
        Function0 function03;
        Modifier modifier2;
        Object offersSearchViewKt$OffersSearchView$1$1;
        Integer num;
        int i3;
        Applier applier;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        Function0 function04;
        MutableState mutableState;
        boolean z;
        Modifier.Companion companion;
        boolean z2;
        offersSearchViewModel.getClass();
        textFieldState.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1224636226);
        Applier applier2 = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(offersSearchViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            textFieldState2 = textFieldState;
            i2 |= gapComposer.changed(textFieldState2) ? 32 : 16;
        } else {
            textFieldState2 = textFieldState;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i4 |= gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i5 = i4;
        if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
            Function0 obtainDismissKeyboard = obtainDismissKeyboard(gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(SearchViewAction.SearchTextChange.INSTANCE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue2;
            CharSequence charSequence = textFieldState2.getValue$foundation().text;
            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState2.getIntValue());
            int i6 = i5 & 7168;
            boolean z3 = (i6 == 2048) | ((i5 & 112) == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                num = valueOf;
                i3 = i6;
                applier = applier2;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                function04 = obtainDismissKeyboard;
                mutableState = mutableState2;
                offersSearchViewKt$OffersSearchView$1$1 = new OffersSearchViewKt$OffersSearchView$1$1(function1, textFieldState2, mutableState, null, 0);
                gapComposer.updateRememberedValue(offersSearchViewKt$OffersSearchView$1$1);
            } else {
                function04 = obtainDismissKeyboard;
                offersSearchViewKt$OffersSearchView$1$1 = rememberedValue3;
                mutableState = mutableState2;
                num = valueOf;
                i3 = i6;
                applier = applier2;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
            }
            Updater.LaunchedEffect(charSequence, num, (Function2) offersSearchViewKt$OffersSearchView$1$1, gapComposer);
            boolean z4 = i3 == 2048;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0(26, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue4, gapComposer, 0);
            int i7 = i5 >> 6;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
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
            Integer valueOf2 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            int i8 = i3;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            OffersSearchViewModel.OffersSearchListViewModel offersSearchListViewModel = offersSearchViewModel.listViewModel;
            if (Intrinsics.areEqual(offersSearchListViewModel, OffersSearchViewModel.OffersSearchListViewModel.Initial.INSTANCE)) {
                gapComposer.startReplaceGroup(1953672844);
                gapComposer.end(false);
                function03 = function02;
                companion = companion2;
                z = true;
            } else if (offersSearchListViewModel instanceof OffersSearchViewModel.OffersSearchListViewModel.Loading) {
                gapComposer.startReplaceGroup(1953705084);
                boolean changed = gapComposer.changed(function04);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new ToViewKt$$ExternalSyntheticLambda2(3, function04);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                FilterBar(offersSearchViewModel, function1, (Function0) rememberedValue5, gapComposer, (i5 & 14) | (i7 & 112));
                Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f), "OffersTabLoadingProgress");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, testTag);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
                function03 = function02;
                z = true;
                companion = companion2;
            } else if (offersSearchListViewModel instanceof OffersSearchViewModel.OffersSearchListViewModel.Loaded) {
                gapComposer.startReplaceGroup(1954050672);
                List list = ((OffersSearchViewModel.OffersSearchListViewModel.Loaded) offersSearchListViewModel).items;
                FilterGroupsSectionViewModel filterGroupsSectionViewModel = offersSearchViewModel.filterGroupSectionViewModel;
                int i9 = offersSearchViewModel.responseId;
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    z2 = false;
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    z2 = false;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                boolean z5 = offersSearchViewModel.searchResultsLoading;
                int i10 = i5 & 458752;
                boolean z6 = i10 == 131072 ? true : z2;
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (z6 || rememberedValue6 == neverEqualPolicy) {
                    function03 = function02;
                    rememberedValue6 = new BasicShieetScope$$ExternalSyntheticLambda10(7, function03, mutableState, parcelableSnapshotMutableIntState);
                    gapComposer.updateRememberedValue(rememberedValue6);
                } else {
                    function03 = function02;
                }
                Function0 function05 = (Function0) rememberedValue6;
                boolean z7 = i10 == 131072 ? true : z2;
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (z7 || rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new MusicViewKt$$ExternalSyntheticLambda5(27, function03, mutableState, parcelableSnapshotMutableIntState);
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                z = true;
                companion = companion2;
                OffersSearchListingKt.OffersSearchListing(list, filterGroupsSectionViewModel, z5, m177backgroundbw27NRU, function1, function0, i9, function05, (Function2) rememberedValue7, gapComposer, (i5 << 3) & 516096, 0);
                gapComposer.end(z2);
            } else {
                function03 = function02;
                z = true;
                companion = companion2;
                if (!(offersSearchListViewModel instanceof OffersSearchViewModel.OffersSearchListViewModel.Error)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1587041729, false);
                }
                gapComposer.startReplaceGroup(1954814047);
                boolean changed2 = gapComposer.changed(function04);
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new ToViewKt$$ExternalSyntheticLambda2(4, function04);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                FilterBar(offersSearchViewModel, function1, (Function0) rememberedValue8, gapComposer, (i5 & 14) | (i7 & 112));
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                OffersMessageViewModel offersMessageViewModel = ((OffersSearchViewModel.OffersSearchListViewModel.Error) offersSearchListViewModel).errorModel;
                boolean z8 = i8 == 2048;
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (z8 || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new MusicViewKt$$ExternalSyntheticLambda0(23, function1);
                    gapComposer.updateRememberedValue(rememberedValue9);
                }
                OffersMessageView(offersMessageViewModel, (Function0) rememberedValue9, null, gapComposer, 0, 4);
                gapComposer.end(false);
            }
            gapComposer.end(z);
            modifier2 = companion;
        } else {
            function03 = function02;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(offersSearchViewModel, textFieldState, modifier2, function1, function0, function03, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005e  */
    /* renamed from: OffersStyledText-Cnvfe3Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3677OffersStyledTextCnvfe3Y(Modifier modifier, final StyledText styledText, final TextStyle textStyle, long j, int i, Function1 function1, int i2, int i3, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        GapComposer gapComposer;
        final long j2;
        final Function1 function12;
        final int i10;
        final int i11;
        final int i12;
        final Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Function1 function13;
        Modifier modifier3;
        int i13;
        int i14;
        int i15;
        int i16;
        Color m;
        styledText.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1116862876);
        int i17 = i4 | 6 | (gapComposer2.changedInstance(styledText) ? 32 : 16) | (gapComposer2.changed(textStyle) ? 256 : 128);
        int i18 = i17 | 3072;
        int i19 = i5 & 16;
        if (i19 != 0) {
            i18 = i17 | 27648;
        } else if ((i4 & 24576) == 0) {
            i6 = i;
            i18 |= gapComposer2.changed(i6) ? 16384 : PKIFailureInfo.certRevoked;
            int i20 = i18 | 1769472;
            if ((i5 & 128) != 0) {
                i7 = i3;
                if (gapComposer2.changed(i7)) {
                    i8 = 8388608;
                    i9 = i20 | i8;
                    int i21 = 0;
                    if (gapComposer2.shouldExecute(i9 & 1, (4793491 & i9) != 4793490)) {
                        gapComposer2.startDefaults();
                        if ((i4 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                            long j3 = Color.Unspecified;
                            if (i19 != 0) {
                                i6 = Integer.MAX_VALUE;
                            }
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(i21);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            Function1 function14 = (Function1) rememberedValue;
                            int i22 = i5 & 128;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            if (i22 != 0) {
                                function13 = function14;
                                modifier3 = companion;
                                i13 = i6;
                                i14 = i9 & (-29360129);
                                j2 = j3;
                                i15 = 2;
                                i16 = 0;
                            } else {
                                function13 = function14;
                                modifier3 = companion;
                                i13 = i6;
                                i14 = i9;
                                j2 = j3;
                                i15 = 2;
                                i16 = i7;
                            }
                        } else {
                            gapComposer2.skipToGroupEnd();
                            if ((i5 & 128) != 0) {
                                i9 &= -29360129;
                            }
                            modifier3 = modifier;
                            function13 = function1;
                            i15 = i2;
                            i13 = i6;
                            i14 = i9;
                            i16 = i7;
                            j2 = j;
                        }
                        gapComposer2.endDefaults();
                        String str = styledText.text;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        com.squareup.protos.cash.ui.Color color = styledText.text_color;
                        if (color == null) {
                            gapComposer2.startReplaceGroup(-1979131683);
                            gapComposer2.end(false);
                            m = null;
                        } else {
                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, 1598725028, color, gapComposer2, false);
                        }
                        gapComposer = gapComposer2;
                        Room.m1165Text25TpFw(i15, i13, 0, i16, ((i14 << 6) & 3670016) | (i14 & 896) | 221232 | ((i14 << 3) & 234881024), 0, 3712, m != null ? m.value : j2, (Composer) gapComposer, modifier3, textStyle, (TextLineBalancing) null, str2, (Map) null, function13, false);
                        i10 = i15;
                        i12 = i13;
                        i11 = i16;
                        modifier2 = modifier3;
                        function12 = function13;
                    } else {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        j2 = j;
                        function12 = function1;
                        i10 = i2;
                        i11 = i7;
                        i12 = i6;
                        modifier2 = modifier;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                UtilsKt.m3677OffersStyledTextCnvfe3Y(Modifier.this, styledText, textStyle, j2, i12, function12, i10, i11, (Composer) obj, Updater.updateChangedFlags(i4 | 1), i5);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
            } else {
                i7 = i3;
            }
            i8 = 4194304;
            i9 = i20 | i8;
            int i212 = 0;
            if (gapComposer2.shouldExecute(i9 & 1, (4793491 & i9) != 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i;
        int i202 = i18 | 1769472;
        if ((i5 & 128) != 0) {
        }
        i8 = 4194304;
        i9 = i202 | i8;
        int i2122 = 0;
        if (gapComposer2.shouldExecute(i9 & 1, (4793491 & i9) != 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void OffersTabEmptyView(int i, Composer composer, Modifier modifier, String str) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1199888120);
        int i2 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed((Object) null) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.verticalScroll$default(modifier, ImageKt.rememberScrollState(gapComposer), false, 14), 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Room.m1165Text25TpFw(0, 0, 0, 3, (i2 >> 3) & 14, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.startReplaceGroup(-776481776);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(modifier, str, i, 12);
        }
    }

    public static final void OffersTabLoadingProgress(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1976327112);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            Modifier testTag = TestTagKt.testTag(modifier, "OffersTabLoadingProgress");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, testTag);
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
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 29);
        }
    }

    public static final void ProvideWidth(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2002480379);
        int i2 = 1;
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OffersFormattedDetailKt$$ExternalSyntheticLambda5(composableLambdaImpl, composableLambdaImpl2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            RulerKt.SubcomposeLayout((Modifier) null, (Function2) rememberedValue, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersFormattedDetailKt$$ExternalSyntheticLambda5(composableLambdaImpl, composableLambdaImpl2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0154  */
    /* renamed from: ScalableOffersStyledText-Y1HBRDA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3678ScalableOffersStyledTextY1HBRDA(Modifier modifier, final StyledText styledText, StyledText styledText2, final TextStyle textStyle, final long j, final int i, long j2, int i2, int i3, Composer composer, final int i4, final int i5) {
        Modifier modifier2;
        int i6;
        StyledText styledText3;
        int i7;
        long j3;
        int i8;
        int i9;
        int i10;
        final int i11;
        final int i12;
        final StyledText styledText4;
        final long j4;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        final int i13;
        final StyledText styledText5;
        boolean changed;
        Object rememberedValue;
        List list;
        com.squareup.protos.cash.ui.Color color;
        StyledText styledText6;
        long j5;
        long pack;
        boolean changed2;
        Object rememberedValue2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(331713112);
        int i14 = i5 & 1;
        if (i14 != 0) {
            i6 = i4 | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i6 = i4 | (gapComposer.changed(modifier2) ? 4 : 2);
        }
        int i15 = i6 | (gapComposer.changedInstance(styledText) ? 32 : 16);
        int i16 = i5 & 4;
        if (i16 != 0) {
            i7 = i15 | MLKEMEngine.KyberPolyBytes;
            styledText3 = styledText2;
        } else {
            styledText3 = styledText2;
            i7 = i15 | (gapComposer.changedInstance(styledText3) ? 256 : 128);
        }
        int i17 = i7 | (gapComposer.changed(textStyle) ? 2048 : 1024) | (gapComposer.changed(j) ? 16384 : PKIFailureInfo.certRevoked);
        if ((i4 & 1572864) == 0) {
            j3 = j2;
            i17 |= ((i5 & 64) == 0 && gapComposer.changed(j3)) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            j3 = j2;
        }
        int i18 = 12582912 | i17;
        int i19 = i5 & 256;
        if (i19 != 0) {
            i18 = 113246208 | i17;
        } else if ((i4 & 100663296) == 0) {
            i8 = i2;
            i18 |= gapComposer.changed(i8) ? 67108864 : 33554432;
            if ((i5 & 512) == 0 && gapComposer.changed(i3)) {
                i9 = PKIFailureInfo.duplicateCertReq;
                i10 = i18 | i9;
                if (gapComposer.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
                    gapComposer.skipToGroupEnd();
                    i11 = i3;
                    i12 = i8;
                    styledText4 = styledText3;
                    j4 = j3;
                } else {
                    gapComposer.startDefaults();
                    Color color2 = null;
                    if ((i4 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        if (i14 != 0) {
                            modifier2 = Modifier.Companion.$$INSTANCE;
                        }
                        if (i16 != 0) {
                            styledText3 = null;
                        }
                        if ((i5 & 64) != 0) {
                            j3 = textStyle.spanStyle.fontSize;
                            i10 &= -3670017;
                        }
                        if (i19 != 0) {
                            i8 = 2;
                        }
                        if ((i5 & 512) != 0) {
                            i10 &= -1879048193;
                            i13 = 0;
                            final Modifier modifier3 = modifier2;
                            final int i20 = i8;
                            styledText5 = styledText3;
                            int i21 = i10;
                            final long j6 = j3;
                            gapComposer.endDefaults();
                            changed = gapComposer.changed(styledText) | gapComposer.changed(styledText5);
                            rememberedValue = gapComposer.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            if (!changed || rememberedValue == neverEqualPolicy) {
                                List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new String[]{styledText == null ? styledText.text : null, styledText5 == null ? styledText5.text : null});
                                list = filterNotNull.isEmpty() ? filterNotNull : null;
                                if (list == null) {
                                    String joinToString$default = CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, null, 62);
                                    if (styledText == null || (color = styledText.text_color) == null) {
                                        color = styledText5 != null ? styledText5.text_color : null;
                                    }
                                    rememberedValue = new StyledText(joinToString$default, color, 4);
                                } else {
                                    rememberedValue = null;
                                }
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            styledText6 = (StyledText) rememberedValue;
                            if (styledText6 != null) {
                                endRestartGroup = gapComposer.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final int i22 = 0;
                                    function2 = new Function2() { // from class: com.squareup.cash.offers.views.ScalableOffersStyledTextKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            switch (i22) {
                                                case 0:
                                                    ((Integer) obj2).getClass();
                                                    int updateChangedFlags = Updater.updateChangedFlags(i4 | 1);
                                                    UtilsKt.m3678ScalableOffersStyledTextY1HBRDA(modifier3, styledText, styledText5, textStyle, j, i, j6, i20, i13, (Composer) obj, updateChangedFlags, i5);
                                                    break;
                                                default:
                                                    ((Integer) obj2).getClass();
                                                    int updateChangedFlags2 = Updater.updateChangedFlags(i4 | 1);
                                                    UtilsKt.m3678ScalableOffersStyledTextY1HBRDA(modifier3, styledText, styledText5, textStyle, j, i, j6, i20, i13, (Composer) obj, updateChangedFlags2, i5);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    endRestartGroup.block = function2;
                                    return;
                                }
                                return;
                            }
                            com.squareup.protos.cash.ui.Color color3 = styledText6.text_color;
                            if (color3 == null) {
                                gapComposer.startReplaceGroup(-653652449);
                                gapComposer.end(false);
                            } else {
                                color2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 948745762, color3, gapComposer, false);
                            }
                            Color color4 = color2;
                            long j7 = color4 != null ? color4.value : j;
                            long m1058getTypeUIouoOA = TextUnit.m1058getTypeUIouoOA(j6);
                            if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 4294967296L)) {
                                gapComposer.startReplaceGroup(247317760);
                                pack = Room.getSp((int) Math.min(TextUnit.m1059getValueimpl(j6), TextUnit.m1059getValueimpl(j6) / ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getFontScale()));
                                gapComposer.end(false);
                            } else if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 8589934592L)) {
                                gapComposer.startReplaceGroup(247320608);
                                pack = Room.pack(8589934592L, (int) Math.min(TextUnit.m1059getValueimpl(j6), TextUnit.m1059getValueimpl(j6) / ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getFontScale()));
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(247321154);
                                gapComposer.end(false);
                                j5 = j6;
                                TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(gapComposer);
                                float fontScale = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getFontScale();
                                String str = styledText6.text;
                                str.getClass();
                                int i23 = i13;
                                FittedTextState fittedTextState = new FittedTextState(str, TextStyle.m994copyp1EtxEg$default(textStyle, j7, 0L, null, null, 0L, null, 0L, null, null, null, i23, 0L, null, null, 0, 16744446), i, j5, i20);
                                long j8 = j5;
                                changed2 = gapComposer.changed(fontScale) | gapComposer.changed(j8) | gapComposer.changed(rememberTextMeasurer);
                                rememberedValue2 = gapComposer.rememberedValue();
                                if (!changed2 || rememberedValue2 == neverEqualPolicy) {
                                    SegmentedBarChartKt$$ExternalSyntheticLambda9 segmentedBarChartKt$$ExternalSyntheticLambda9 = new SegmentedBarChartKt$$ExternalSyntheticLambda9(fontScale, j8, rememberTextMeasurer, i);
                                    gapComposer.updateRememberedValue(segmentedBarChartKt$$ExternalSyntheticLambda9);
                                    rememberedValue2 = segmentedBarChartKt$$ExternalSyntheticLambda9;
                                }
                                modifier2 = modifier3;
                                FittedText(modifier2, fittedTextState, (Function2) rememberedValue2, gapComposer, i21 & 14);
                                i11 = i23;
                                i12 = i20;
                                j4 = j6;
                                styledText4 = styledText5;
                            }
                            j5 = pack;
                            TextMeasurer rememberTextMeasurer2 = TextPainterKt.rememberTextMeasurer(gapComposer);
                            float fontScale2 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getFontScale();
                            String str2 = styledText6.text;
                            str2.getClass();
                            int i232 = i13;
                            FittedTextState fittedTextState2 = new FittedTextState(str2, TextStyle.m994copyp1EtxEg$default(textStyle, j7, 0L, null, null, 0L, null, 0L, null, null, null, i232, 0L, null, null, 0, 16744446), i, j5, i20);
                            long j82 = j5;
                            changed2 = gapComposer.changed(fontScale2) | gapComposer.changed(j82) | gapComposer.changed(rememberTextMeasurer2);
                            rememberedValue2 = gapComposer.rememberedValue();
                            if (!changed2) {
                            }
                            SegmentedBarChartKt$$ExternalSyntheticLambda9 segmentedBarChartKt$$ExternalSyntheticLambda92 = new SegmentedBarChartKt$$ExternalSyntheticLambda9(fontScale2, j82, rememberTextMeasurer2, i);
                            gapComposer.updateRememberedValue(segmentedBarChartKt$$ExternalSyntheticLambda92);
                            rememberedValue2 = segmentedBarChartKt$$ExternalSyntheticLambda92;
                            modifier2 = modifier3;
                            FittedText(modifier2, fittedTextState2, (Function2) rememberedValue2, gapComposer, i21 & 14);
                            i11 = i232;
                            i12 = i20;
                            j4 = j6;
                            styledText4 = styledText5;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i5 & 64) != 0) {
                            i10 &= -3670017;
                        }
                        if ((i5 & 512) != 0) {
                            i10 &= -1879048193;
                        }
                    }
                    i13 = i3;
                    final Modifier modifier32 = modifier2;
                    final int i202 = i8;
                    styledText5 = styledText3;
                    int i212 = i10;
                    final long j62 = j3;
                    gapComposer.endDefaults();
                    changed = gapComposer.changed(styledText) | gapComposer.changed(styledText5);
                    rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (!changed) {
                    }
                    List filterNotNull2 = ArraysKt___ArraysKt.filterNotNull(new String[]{styledText == null ? styledText.text : null, styledText5 == null ? styledText5.text : null});
                    if (filterNotNull2.isEmpty()) {
                    }
                    if (list == null) {
                    }
                    gapComposer.updateRememberedValue(rememberedValue);
                    styledText6 = (StyledText) rememberedValue;
                    if (styledText6 != null) {
                    }
                }
                final Modifier modifier4 = modifier2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    final int i24 = 1;
                    function2 = new Function2() { // from class: com.squareup.cash.offers.views.ScalableOffersStyledTextKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i24) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i4 | 1);
                                    UtilsKt.m3678ScalableOffersStyledTextY1HBRDA(modifier4, styledText, styledText4, textStyle, j, i, j4, i12, i11, (Composer) obj, updateChangedFlags, i5);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i4 | 1);
                                    UtilsKt.m3678ScalableOffersStyledTextY1HBRDA(modifier4, styledText, styledText4, textStyle, j, i, j4, i12, i11, (Composer) obj, updateChangedFlags2, i5);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                    return;
                }
                return;
            }
            i9 = 268435456;
            i10 = i18 | i9;
            if (gapComposer.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
            }
            final Modifier modifier42 = modifier2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i2;
        if ((i5 & 512) == 0) {
            i9 = PKIFailureInfo.duplicateCertReq;
            i10 = i18 | i9;
            if (gapComposer.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
            }
            final Modifier modifier422 = modifier2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i9 = 268435456;
        i10 = i18 | i9;
        if (gapComposer.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
        }
        final Modifier modifier4222 = modifier2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Function0 obtainDismissKeyboard(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
        FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
        boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changedInstance(focusOwnerImpl);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(0, delegatingSoftwareKeyboardController, focusOwnerImpl);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (Function0) rememberedValue;
    }
}
