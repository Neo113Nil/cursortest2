package com.squareup.cash.offers.views.home;

import android.content.res.Configuration;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.viewmodels.ShoppingIconId;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.shared.OffersAvatarViewModel;
import com.squareup.cash.offers.views.FormattedCaptionViewModel;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.util.clock.Clock$Companion;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class OffersHeroTileKt {
    public static final ContentTransform defaultTransitionSpec = AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4), 2).plus(EnterExitTransitionKt.m147scaleInL8ZKhE$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4), 0.92f, 4)), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(90, 0, null, 6), 2));
    public static final OffersHeroTileKt$$ExternalSyntheticLambda3 transformHeroCaptionModel = new OffersHeroTileKt$$ExternalSyntheticLambda3(0);

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeroSection.HeroTile.DisplayStyle.values().length];
            try {
                TextSize.Companion companion = HeroSection.HeroTile.DisplayStyle.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextSize.Companion companion2 = HeroSection.HeroTile.DisplayStyle.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TextSize.Companion companion3 = HeroSection.HeroTile.DisplayStyle.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void Dimmer(Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-973888076);
        int i3 = i & 6;
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(boxScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BoxKt.Box(ImageKt.background$default(boxScopeInstance.align(OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), false), Alignment.Companion.BottomCenter), Lock.m132linearGradientmHitzGk(new Pair[]{new Pair(Float.valueOf(0.5f), new Color(ColorKt.Color(0))), new Pair(Float.valueOf(1.0f), new Color(ColorKt.Color(2130706432)))}, (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax)), null, 6), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i, 10);
        }
    }

    public static final void ExpirationCaption(FormattedCaptionViewModel formattedCaptionViewModel, Composer composer, int i) {
        GapComposer gapComposer;
        Painter painter;
        GapComposer gapComposer2;
        com.squareup.protos.cash.ui.Color color;
        int i2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(427343103);
        int i3 = (gapComposer3.changed(formattedCaptionViewModel) ? 4 : 2) | i | 48;
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (formattedCaptionViewModel.icon != null) {
                gapComposer3.startReplaceGroup(-793963155);
                ShoppingIconId shoppingIconId = formattedCaptionViewModel.icon;
                shoppingIconId.getClass();
                switch (shoppingIconId.ordinal()) {
                    case 0:
                        i2 = R.drawable.icon_card_basic_16;
                        break;
                    case 1:
                        i2 = R.drawable.icon_card_new_16;
                        break;
                    case 2:
                        i2 = R.drawable.icon_time_stopwatch_16;
                        break;
                    case 3:
                        i2 = R.drawable.icon_time_hourglass_16;
                        break;
                    case 4:
                        i2 = R.drawable.icon_limits_16;
                        break;
                    case 5:
                        i2 = R.drawable.icon_limits_fill_16;
                        break;
                    case 6:
                        i2 = R.drawable.icon_discount_minimum_16;
                        break;
                    case 7:
                        i2 = R.drawable.icon_time_16;
                        break;
                    case 8:
                        i2 = R.drawable.icon_cash_app_customer_16;
                        break;
                    case 9:
                        i2 = R.drawable.icon_cash_app_pay_16;
                        break;
                    case 10:
                        i2 = R.drawable.icon_link_out_24;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                }
                painter = Countries.painterResource(i2, 0, gapComposer3);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(1157109218);
                gapComposer3.end(false);
                painter = null;
            }
            if (painter == null) {
                gapComposer3.startReplaceGroup(1157141551);
                gapComposer3.end(false);
                gapComposer2 = gapComposer3;
                color = null;
            } else {
                gapComposer3.startReplaceGroup(1157141552);
                long j = formattedCaptionViewModel.color;
                gapComposer2 = gapComposer3;
                color = null;
                ImageKt.Image(painter, null, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 48, 60);
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 4.0f));
                gapComposer2.end(false);
            }
            GapComposer gapComposer4 = gapComposer2;
            UtilsKt.m3678ScalableOffersStyledTextY1HBRDA(null, new StyledText(formattedCaptionViewModel.text, color, 6), null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium, formattedCaptionViewModel.color, 1, Room.getSp(12), 0, 0, gapComposer4, 1769472, 901);
            gapComposer = gapComposer4;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(formattedCaptionViewModel, i, 18);
        }
    }

    public static final void HeroOffersTile(Modifier modifier, OffersHomeListItemViewModel.HeroOffersTileViewModel heroOffersTileViewModel, Function4 function4, PaddingValues paddingValues, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Function4 function42;
        PaddingValues paddingValues2;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(221240405);
        int i2 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changed(heroOffersTileViewModel) ? 32 : 16) | 3456 | (gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            float f = RecyclerView.DECELERATION_RATE;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            int i3 = ((Configuration) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenWidthDp;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalLayoutDirection;
            float calculateEndPadding = SpacerKt.calculateEndPadding(paddingValuesImpl, (LayoutDirection) gapComposer2.consume(staticProvidableCompositionLocal)) + SpacerKt.calculateStartPadding(paddingValuesImpl, (LayoutDirection) gapComposer2.consume(staticProvidableCompositionLocal));
            boolean z = heroOffersTileViewModel instanceof OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile;
            OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile = z ? (OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) heroOffersTileViewModel : null;
            HeroSection.HeroTile.DisplayStyle displayStyle = currentTile != null ? currentTile.displayStyle : null;
            int i4 = displayStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[displayStyle.ordinal()];
            float f2 = 1.26f;
            if (i4 != -1 && i4 != 1) {
                if (i4 == 2) {
                    f2 = 1.0f;
                } else {
                    if (i4 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    f2 = 0.75f;
                }
            }
            float f3 = (i3 - calculateEndPadding) * f2;
            if (z) {
                f = f3;
            }
            State m155animateDpAsStateAjpBEmI = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(f, null, "Hero Tile Card Height", null, gapComposer2, MLKEMEngine.KyberPolyBytes, 10);
            gapComposer = gapComposer2;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            OffersHeroTileKt$$ExternalSyntheticLambda3 offersHeroTileKt$$ExternalSyntheticLambda3 = transformHeroCaptionModel;
            AnimatedContentKt.AnimatedContent(heroOffersTileViewModel, null, (Function1) rememberedValue, null, "OffersHeroTile", null, Expect_jvmKt.rememberComposableLambda(-801304843, new SsnViewKt$$ExternalSyntheticLambda7(modifier, paddingValuesImpl, heroOffersTileViewModel, m155animateDpAsStateAjpBEmI, function1, offersHeroTileKt$$ExternalSyntheticLambda3), gapComposer), gapComposer, ((i2 >> 3) & 14) | 1597824, 42);
            paddingValues2 = paddingValuesImpl;
            function42 = offersHeroTileKt$$ExternalSyntheticLambda3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            function42 = function4;
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(modifier, heroOffersTileViewModel, function42, paddingValues2, function1, i, 12);
        }
    }

    public static final void HeroOffersTileCardContent(OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile, Function4 function4, Composer composer, int i) {
        int i2;
        FormattedCaptionViewModel formattedCaptionViewModel;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2096199848);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(BoxScopeInstance.INSTANCE) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(currentTile) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function4) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            OffersHeroTileImage(SizeKt.fillMaxSize(companion, 1.0f), currentTile, gapComposer, (i2 & 112) | 6);
            if (currentTile.dimmerEnabled) {
                gapComposer.startReplaceGroup(-934599224);
                Dimmer(gapComposer, i2 & 14);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-934581926);
                gapComposer.end(false);
            }
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(SizeKt.fillMaxHeight(companion, 1.0f), 16.0f, 20.0f, 12.0f, 28.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Bottom, Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            String str = null;
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
            LegacyOffersAvatarViewModel legacyOffersAvatarViewModel = currentTile.avatar;
            if (legacyOffersAvatarViewModel == null) {
                gapComposer.startReplaceGroup(-457104698);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-457104697);
                UtilsKt.OffersAvatar(toOffersAvatarViewModel(legacyOffersAvatarViewModel), currentTile.showActiveBoostAvatarBadge, null, AvatarSize.Size48, gapComposer, 3072, 4);
                gapComposer.end(false);
            }
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 8.0f, gapComposer);
            OffersHeroTileText(currentTile, gapComposer, (i2 >> 3) & 14);
            Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 8.0f, gapComposer);
            Object obj = currentTile.countdownTemplate;
            if (obj == null) {
                gapComposer.startReplaceGroup(-456715183);
                gapComposer.end(false);
                formattedCaptionViewModel = null;
            } else {
                gapComposer.startReplaceGroup(-153280080);
                formattedCaptionViewModel = (FormattedCaptionViewModel) function4.invoke(obj, Clock$Companion.REAL, gapComposer, Integer.valueOf(i2 & 896));
                gapComposer.end(false);
            }
            if (formattedCaptionViewModel != null) {
                String str2 = formattedCaptionViewModel.text;
                if (!StringsKt.isBlank(str2)) {
                    str = str2;
                }
            }
            if (str == null) {
                gapComposer.startReplaceGroup(-456607396);
            } else {
                gapComposer.startReplaceGroup(-456607395);
                ExpirationCaption(formattedCaptionViewModel, gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-456516473);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(currentTile, function4, i, 10);
        }
    }

    public static final void OffersHeroTileImage(Modifier modifier, OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Color m;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1462507807);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(currentTile) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String urlForTheme = ThemablesKt.urlForTheme(currentTile.heroImage, gapComposer);
            com.squareup.protos.cash.ui.Color color = currentTile.backgroundColor;
            if (color == null) {
                gapComposer.startReplaceGroup(-1421651818);
                gapComposer.end(false);
                m = null;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1015691061, color, gapComposer, false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(-1015689369);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Colors.Semantic semantic = colors.semantic;
            } else {
                gapComposer.startReplaceGroup(-1015691725);
            }
            gapComposer.end(false);
            modifier2 = modifier;
            AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme, null, modifier2, null, ContentScale.Companion.Crop, null, gapComposer, ((i2 << 6) & 896) | 1572912, 1976);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(modifier2, currentTile, i, 11);
        }
    }

    public static final void OffersHeroTileText(OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-985732434);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(currentTile) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            OffsetKt.BoxWithConstraints(null, null, false, Expect_jvmKt.rememberComposableLambda(-1411467496, new P2PListViewKt$$ExternalSyntheticLambda12(currentTile, 15), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(currentTile, i, 26);
        }
    }

    /* renamed from: copyWithFontSizeMatchingLineHeight-gP2Z1ig, reason: not valid java name */
    public static final TextStyle m3681copyWithFontSizeMatchingLineHeightgP2Z1ig(TextStyle textStyle, int i, float f, Color color) {
        long sp = Room.getSp((int) (i / f));
        return TextStyle.m994copyp1EtxEg$default(textStyle, color != null ? color.value : textStyle.m996getColor0d7_KjU(), sp, null, null, 0L, null, 0L, null, null, null, 0, sp, null, null, 0, 16646140);
    }

    public static final String createHeroText(OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile, boolean z) {
        String str = z ? "\n" : " ";
        StyledText styledText = currentTile.title;
        String str2 = styledText != null ? styledText.text : null;
        StyledText styledText2 = currentTile.subtitle;
        List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new String[]{str2, styledText2 != null ? styledText2.text : null});
        if (filterNotNull.isEmpty()) {
            filterNotNull = null;
        }
        String joinToString$default = filterNotNull != null ? CollectionsKt.joinToString$default(filterNotNull, str, null, null, 0, null, null, 62) : null;
        joinToString$default.getClass();
        return joinToString$default;
    }

    public static final OffersAvatarViewModel toOffersAvatarViewModel(LegacyOffersAvatarViewModel legacyOffersAvatarViewModel) {
        legacyOffersAvatarViewModel.getClass();
        String str = legacyOffersAvatarViewModel.lightImageUrl;
        if (str == null) {
            str = "";
        }
        return new OffersAvatarViewModel(new OffersAvatarViewModel.IconUrl(str, legacyOffersAvatarViewModel.darkImageUrl), legacyOffersAvatarViewModel.monogram, legacyOffersAvatarViewModel.backgroundColor, legacyOffersAvatarViewModel.colorizeImage);
    }
}
