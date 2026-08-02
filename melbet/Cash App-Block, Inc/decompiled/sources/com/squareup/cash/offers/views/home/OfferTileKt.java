package com.squareup.cash.offers.views.home;

import android.content.res.Configuration;
import androidx.biometric.KeyguardUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.viewmodels.LegalTextViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeListingViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.home.collectionCluster.ThreeOfferClusterSize;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda13;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class OfferTileKt {

    /* renamed from: lambda$-1271178366, reason: not valid java name */
    public static final ComposableLambdaImpl f516lambda$1271178366 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(6), false, -1271178366);

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* renamed from: CircularIconButton-jM_yU8I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3680CircularIconButtonjM_yU8I(Icons icons, String str, Function0 function0, Modifier modifier, Color color, Alignment alignment, Composer composer, int i, int i2) {
        int i3;
        Alignment alignment2;
        Color color2;
        Alignment alignment3;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-738909158);
        int i4 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
        } else {
            i3 = i4 | (gapComposer.changed(color) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            alignment2 = alignment;
            i3 |= gapComposer.changed(alignment2) ? PKIFailureInfo.unsupportedVersion : 65536;
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer.skipToGroupEnd();
                color2 = color;
                alignment3 = alignment2;
            } else {
                Color color3 = i5 != 0 ? null : color;
                Alignment alignment4 = i6 != 0 ? Alignment.Companion.Center : alignment2;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-988348423, new CashMapViewKt$$ExternalSyntheticLambda15(icons, str, function0, modifier, alignment4), gapComposer);
                if (color3 != null) {
                    gapComposer.startReplaceGroup(-1134903851);
                    Updater.CompositionLocalProvider(ArcadeThemeKt.LocalIconColor.defaultProvidedValue$runtime(color3), Expect_jvmKt.rememberComposableLambda(-2036843617, new OverlaysKt$$ExternalSyntheticLambda1(rememberComposableLambda, 25), gapComposer), gapComposer, 56);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1134817547);
                    rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                    gapComposer.end(false);
                }
                alignment3 = alignment4;
                color2 = color3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(icons, str, function0, modifier, color2, alignment3, i, i2);
                return;
            }
            return;
        }
        alignment2 = alignment;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CircularLoadingBox(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1950625077);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 1);
        }
    }

    public static final void OfferAccessory(OffersHomeViewModelV2.Loaded.OfferItem offerItem, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1197210426);
        int i2 = (gapComposer.changedInstance(offerItem) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = offerItem.status.ordinal();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-531994794);
                Icons icons = Icons.Add16;
                String stringResource = Room.stringResource(gapComposer, R.string.offer_home_add_button_label);
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(offerItem);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new OfferTileKt$$ExternalSyntheticLambda2(offerItem, function1, 6);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 32.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                m3680CircularIconButtonjM_yU8I(icons, stringResource, function0, ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors.component.button.standard.background.f163default, RoundedCornerShapeKt.CircleShape), null, null, gapComposer, 6, 48);
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-531981809);
                boolean changedInstance2 = gapComposer.changedInstance(offerItem) | ((i2 & 112) == 32);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new OfferTileKt$$ExternalSyntheticLambda2(offerItem, function1, 7);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue2, null, null, false, true, null, f516lambda$1271178366, gapComposer, 1597440, 46);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (ordinal == 2) {
                gapComposer.startReplaceGroup(-531975864);
                Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 32.0f);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                CircularLoadingBox(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs2, colors2.component.button.standard.background.f163default, RoundedCornerShapeKt.CircleShape), gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (ordinal != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -532011882, false);
                }
                gapComposer.startReplaceGroup(687526574);
                Icons icons2 = Icons.Check16;
                String stringResource2 = Room.stringResource(gapComposer, R.string.offer_home_selected_button_label);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors3.component.button.prominent.icon.f161default;
                Modifier m285size3ABfNKs3 = SizeKt.m285size3ABfNKs(companion, 32.0f);
                Colors colors4 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs3, colors4.component.button.prominent.background.f160default, RoundedCornerShapeKt.CircleShape);
                boolean changedInstance3 = ((i2 & 112) == 32) | gapComposer.changedInstance(offerItem);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new OfferTileKt$$ExternalSyntheticLambda2(offerItem, function1, 5);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                m3680CircularIconButtonjM_yU8I(icons2, stringResource2, (Function0) rememberedValue3, m177backgroundbw27NRU, new Color(j), null, gapComposer, 6, 32);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersHomeV2Kt$$ExternalSyntheticLambda10(offerItem, function1, i);
        }
    }

    public static final void OfferTile(int i, Composer composer, Modifier modifier, OffersHomeViewModelV2.Loaded.OfferItem offerItem, Function1 function1) {
        offerItem.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1440837443);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(offerItem) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1659050296, new OfferTileKt$$ExternalSyntheticLambda0(offerItem, modifier, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OfferTileKt$$ExternalSyntheticLambda0(modifier, offerItem, function1, i);
        }
    }

    public static final void OffersHomeListing(Modifier modifier, OffersHomeListingViewModel offersHomeListingViewModel, boolean z, ScrollState scrollState, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        offersHomeListingViewModel.getClass();
        scrollState.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2105290104);
        int i2 = i | 6 | (gapComposer2.changedInstance(offersHomeListingViewModel) ? 32 : 16) | (gapComposer2.changed(z) ? 256 : 128) | (gapComposer2.changed(scrollState) ? 2048 : 1024) | (gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            int i3 = ((Configuration) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenWidthDp;
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(gapComposer2, R.dimen.offers_home_content_horizontal_padding);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                float f = (i3 - ((dimensionResource * 2.0f) + 8.0f)) / 2.0f;
                rememberedValue = new ThreeOfferClusterSize(f, (f - 8.0f) / 2.0f, f);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            ThreeOfferClusterSize threeOfferClusterSize = (ThreeOfferClusterSize) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(28, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            String stringResource = Room.stringResource(gapComposer2, R.string.offers_pull_to_refresh);
            boolean z2 = (57344 & i2) == 16384;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MusicViewKt$$ExternalSyntheticLambda0(29, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            gapComposer = gapComposer2;
            UtilsKt.OffersPullToRefresh(null, (Function0) rememberedValue3, z, stringResource, Expect_jvmKt.rememberComposableLambda(-123765036, new CashMapViewKt$$ExternalSyntheticLambda15(offersHomeListingViewModel, scrollState, function1, threeOfferClusterSize, function12), gapComposer2), gapComposer, (i2 & 896) | 199680);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(modifier2, offersHomeListingViewModel, z, scrollState, function1, i, 9);
        }
    }

    public static final void OffersHomeV2(RealImageLoader realImageLoader, OffersHomeViewModelV2 offersHomeViewModelV2, Function1 function1, Composer composer, int i) {
        int i2;
        offersHomeViewModelV2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-663751437);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(offersHomeViewModelV2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(525989939, new OffersHomeV2Kt$$ExternalSyntheticLambda0(offersHomeViewModelV2, function1, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) realImageLoader, (Object) offersHomeViewModelV2, (Object) function1, false, i, 29);
        }
    }

    public static final void OffersHomeV2Loaded(OffersHomeViewModelV2.Loaded loaded, Function1 function1, Composer composer, int i) {
        Function1 function12;
        OffersHomeViewModelV2.Loaded loaded2;
        int i2;
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1069881047);
        Applier applier = gapComposer.applier;
        int i3 = (i & 6) == 0 ? i | (gapComposer.changedInstance(loaded) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i4 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda0(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer), false, 14);
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
            loaded2 = loaded;
            OffersHomeViewModelV2.Loaded.HeaderSection headerSection = loaded2.headerSection;
            List list = loaded2.offersSections;
            if (headerSection.amount == null) {
                gapComposer.startReplaceGroup(1047562176);
                Countries.PageHeader(headerSection.title, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
                i2 = 0;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1047643954);
                String str = headerSection.amount;
                str.getClass();
                zzacg.m2010HeroNumericsHeadertv5qRRQ(str, (Modifier) null, 0, (String) null, headerSection.title, headerSection.subtitle, (String) null, gapComposer, 0, 78);
                i2 = 0;
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(i2, 1, gapComposer, null);
            DBUtil.SpacerBetweenSectionLarge(i2, 1, gapComposer, null);
            gapComposer.startReplaceGroup(1973466629);
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                OffersHomeViewModelV2.Loaded.OffersSection offersSection = (OffersHomeViewModelV2.Loaded.OffersSection) obj;
                boolean z2 = i5 < list.size() + (-1);
                OffersSection(offersSection, i5, function1, gapComposer, (i4 << 3) & 896);
                if (z2) {
                    gapComposer.startReplaceGroup(-929107669);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-929050970);
                    gapComposer.end(false);
                }
                i5 = i6;
            }
            function12 = function1;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
        } else {
            function12 = function1;
            loaded2 = loaded;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(loaded2, function12, i, 12);
        }
    }

    public static final void OffersLegalText(Modifier modifier, LegalTextViewModel legalTextViewModel, PaddingValuesImpl paddingValuesImpl, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        long j;
        legalTextViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(936149227);
        int i2 = i | 6 | (gapComposer2.changedInstance(legalTextViewModel) ? 32 : 16) | (gapComposer2.changed(paddingValuesImpl) ? 256 : 128) | (gapComposer2.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier padding = SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), paddingValuesImpl);
            String str = legalTextViewModel.text;
            TextStyle textStyle = MooncakeTheme.getTypography(gapComposer2).caption;
            Color composeColor = ComposeUtilsKt.toComposeColor(legalTextViewModel.textColor, gapComposer2);
            if (composeColor == null) {
                gapComposer2.startReplaceGroup(1991255161);
                j = MooncakeTheme.getColors(gapComposer2).secondaryLabel;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1991253394);
                gapComposer2.end(false);
                j = composeColor.value;
            }
            boolean z = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(25, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function2 function2 = (Function2) rememberedValue;
            modifier2 = companion;
            gapComposer = gapComposer2;
            KeyguardUtils.m14MarkdownTextnvClB8o(str, function2, padding, textStyle, j, null, null, 0, 3, null, 0, gapComposer, 0, 1760);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(modifier2, legalTextViewModel, paddingValuesImpl, function1, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Throwable] */
    public static final void OffersSection(OffersHomeViewModelV2.Loaded.OffersSection offersSection, int i, Function1 function1, Composer composer, int i2) {
        int i3;
        Function0 function0;
        Modifier modifier;
        final int i4;
        Modifier.Companion companion;
        NeverEqualPolicy neverEqualPolicy;
        int i5;
        Object offersHomeV2Kt$$ExternalSyntheticLambda9;
        Modifier.Companion companion2;
        NeverEqualPolicy neverEqualPolicy2;
        final OffersHomeViewModelV2.Loaded.OfferItem offerItem;
        int i6;
        int i7;
        Function1 function12;
        Object hero3DCardViewKt$$ExternalSyntheticLambda13;
        int i8;
        OffersHomeViewModelV2.Loaded.OffersSection offersSection2 = offersSection;
        Function1 function13 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1647966920);
        int i9 = (i2 & 6) == 0 ? (gapComposer.changedInstance(offersSection2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 = i;
            i9 |= gapComposer.changed(i3) ? 32 : 16;
        } else {
            i3 = i;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i9 |= gapComposer.changedInstance(function13) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
            OffersHomeViewModelV2.Loaded.OffersSection.SectionHeader sectionHeader = offersSection2.header;
            String str = sectionHeader.title;
            String str2 = sectionHeader.subtitle;
            OffersHomeViewModelV2.Loaded.OffersSection.SectionHeader.TextButton textButton = sectionHeader.button;
            String str3 = textButton != null ? textButton.text : null;
            OffersHomeViewEventV2.UrlClicked urlClicked = textButton != null ? textButton.event : null;
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (urlClicked == null) {
                gapComposer.startReplaceGroup(1188978898);
                gapComposer.end(false);
                function0 = null;
            } else {
                gapComposer.startReplaceGroup(1188978899);
                boolean changedInstance = ((i9 & 896) == 256) | gapComposer.changedInstance(urlClicked);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy3) {
                    rememberedValue = new OffersHomeV2Kt$$ExternalSyntheticLambda7(0, function13, urlClicked);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer.end(false);
            }
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, str3, function0, str2, gapComposer, 0, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            List list = offersSection2.tileItems;
            boolean isEmpty = list.isEmpty();
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (isEmpty) {
                modifier = null;
                i4 = 0;
                companion = companion3;
                neverEqualPolicy = neverEqualPolicy3;
                i5 = 4;
                gapComposer.startReplaceGroup(1190123946);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1189140843);
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
                Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion3, 1.0f), RecyclerView.DECELERATION_RATE, 2000.0f, 1);
                LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 3, gapComposer);
                boolean changedInstance2 = gapComposer.changedInstance(list) | ((i9 & 896) == 256) | gapComposer.changedInstance(offersSection2) | ((i9 & 112) == 32);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy3) {
                    i8 = i9;
                    modifier = null;
                    hero3DCardViewKt$$ExternalSyntheticLambda13 = new Hero3DCardViewKt$$ExternalSyntheticLambda13(list, function1, offersSection2, i3, 5);
                    gapComposer.updateRememberedValue(hero3DCardViewKt$$ExternalSyntheticLambda13);
                } else {
                    i8 = i9;
                    hero3DCardViewKt$$ExternalSyntheticLambda13 = rememberedValue2;
                    modifier = null;
                }
                Function1 function14 = (Function1) hero3DCardViewKt$$ExternalSyntheticLambda13;
                neverEqualPolicy = neverEqualPolicy3;
                i9 = i8;
                companion = companion3;
                i5 = 4;
                LazyGridDslKt.LazyVerticalGrid(fixed, m279heightInVpY3zN4$default, rememberLazyGridState, m295PaddingValuesYgX7TsA$default, arrangement$SpacedAligned2, arrangement$SpacedAligned, null, false, null, function14, gapComposer, 100663344, 656);
                gapComposer = gapComposer;
                i4 = 0;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, modifier);
                gapComposer.end(false);
            }
            int i10 = i4;
            for (Object obj : offersSection2.items) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    ?? r24 = modifier;
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw r24;
                }
                OffersHomeViewModelV2.Loaded.OfferItem offerItem2 = (OffersHomeViewModelV2.Loaded.OfferItem) obj;
                int i12 = i9 & 896;
                int i13 = (i12 == 256 ? 1 : i4) | (gapComposer.changedInstance(offerItem2) ? 1 : 0) | (gapComposer.changedInstance(offersSection2) ? 1 : 0) | ((i9 & 112) == 32 ? 1 : i4) | (gapComposer.changed(i10) ? 1 : 0);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (i13 != 0 || rememberedValue3 == neverEqualPolicy) {
                    companion2 = companion;
                    neverEqualPolicy2 = neverEqualPolicy;
                    offerItem = offerItem2;
                    i6 = i9;
                    i7 = i5;
                    function12 = function1;
                    offersHomeV2Kt$$ExternalSyntheticLambda9 = new OffersHomeV2Kt$$ExternalSyntheticLambda9(function12, offerItem, offersSection2, i, i10);
                    gapComposer.updateRememberedValue(offersHomeV2Kt$$ExternalSyntheticLambda9);
                } else {
                    i6 = i9;
                    companion2 = companion;
                    offerItem = offerItem2;
                    offersHomeV2Kt$$ExternalSyntheticLambda9 = rememberedValue3;
                    i7 = i5;
                    neverEqualPolicy2 = neverEqualPolicy;
                    function12 = function1;
                }
                Modifier onVisible$default = VisibleKt.onVisible$default(companion2, (Function0) offersHomeV2Kt$$ExternalSyntheticLambda9);
                final int i14 = 1;
                CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-1721697724, new OffersHomeV2Kt$$ExternalSyntheticLambda10(offerItem, function12), gapComposer), 1);
                int i15 = offerItem.status != OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.LOCKED ? 1 : i4;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(913326574, new Function2() { // from class: com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i16 = i4;
                        OffersHomeViewModelV2.Loaded.OfferItem offerItem3 = offerItem;
                        switch (i16) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(offerItem3.avatar.avatar, offerItem3.badge, null, gapComposer2, 8, 2), null, false, gapComposer2, 6, 28);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offerItem3.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                    String str4 = offerItem3.subtitle;
                                    if (str4 == null) {
                                        gapComposer4.startReplaceGroup(-2020584886);
                                    } else {
                                        gapComposer4.startReplaceGroup(-2020584885);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1127348531, new Function2() { // from class: com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i16 = i14;
                        OffersHomeViewModelV2.Loaded.OfferItem offerItem3 = offerItem;
                        switch (i16) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(offerItem3.avatar.avatar, offerItem3.badge, null, gapComposer2, 8, 2), null, false, gapComposer2, 6, 28);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offerItem3.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                    String str4 = offerItem3.subtitle;
                                    if (str4 == null) {
                                        gapComposer4.startReplaceGroup(-2020584886);
                                    } else {
                                        gapComposer4.startReplaceGroup(-2020584885);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                int i16 = (i12 == 256 ? 1 : i4) | (gapComposer.changedInstance(offerItem) ? 1 : 0);
                Modifier modifier2 = modifier;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (i16 != 0 || rememberedValue4 == neverEqualPolicy2) {
                    rememberedValue4 = new OfferTileKt$$ExternalSyntheticLambda2(function12, offerItem, i7);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                NeverEqualPolicy neverEqualPolicy4 = neverEqualPolicy2;
                final int i17 = 2;
                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-486497273, new Function2() { // from class: com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i162 = i17;
                        OffersHomeViewModelV2.Loaded.OfferItem offerItem3 = offerItem;
                        switch (i162) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(offerItem3.avatar.avatar, offerItem3.badge, null, gapComposer2, 8, 2), null, false, gapComposer2, 6, 28);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offerItem3.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                    String str4 = offerItem3.subtitle;
                                    if (str4 == null) {
                                        gapComposer4.startReplaceGroup(-2020584886);
                                    } else {
                                        gapComposer4.startReplaceGroup(-2020584885);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                GapComposer gapComposer2 = gapComposer;
                ?? r12 = i15;
                neverEqualPolicy = neverEqualPolicy4;
                companion = companion2;
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, onVisible$default, (Function0) rememberedValue4, null, r12, false, rememberComposableLambda3, null, label, 0L, null, gapComposer2, 12582966, 0, 3408);
                i5 = i7;
                i4 = i4;
                gapComposer = gapComposer2;
                modifier = modifier2;
                i9 = i6;
                i10 = i11;
                offersSection2 = offersSection;
            }
            function13 = function1;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(i, i2, 13, offersSection, function13);
        }
    }

    public static final void TileAccessory(int i, Composer composer, Modifier modifier, OffersHomeViewModelV2.Loaded.OfferItem offerItem, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1019410633);
        int i2 = (gapComposer.changedInstance(offerItem) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = offerItem.status.ordinal();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-401068443);
                Icons icons = Icons.Add16;
                String stringResource = Room.stringResource(gapComposer, R.string.offer_home_add_button_label);
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(offerItem);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new OfferTileKt$$ExternalSyntheticLambda2(offerItem, function1, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                m3680CircularIconButtonjM_yU8I(icons, stringResource, function0, ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.prominent, RoundedCornerShapeKt.CircleShape), null, null, gapComposer, 6, 48);
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-401056314);
                Icons icons2 = Icons.SubtlePush16;
                String stringResource2 = Room.stringResource(gapComposer, R.string.offer_home_locked_button_text);
                boolean changedInstance2 = gapComposer.changedInstance(offerItem) | ((i2 & 112) == 32);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new OfferTileKt$$ExternalSyntheticLambda2(offerItem, function1, 2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function0 function02 = (Function0) rememberedValue2;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                m3680CircularIconButtonjM_yU8I(icons2, stringResource2, function02, ImageKt.m177backgroundbw27NRU(modifier, colors2.semantic.background.prominent, RoundedCornerShapeKt.CircleShape), null, Alignment.Companion.CenterStart, gapComposer, 196614, 16);
                gapComposer.end(false);
            } else if (ordinal == 2) {
                gapComposer.startReplaceGroup(-401042330);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                CircularLoadingBox(ImageKt.m177backgroundbw27NRU(modifier, colors3.component.button.standard.background.f163default, RoundedCornerShapeKt.CircleShape), gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (ordinal != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -401069437, false);
                }
                gapComposer.startReplaceGroup(-401034132);
                Icons icons3 = Icons.Check16;
                String stringResource3 = Room.stringResource(gapComposer, R.string.offer_home_selected_button_label);
                boolean changedInstance3 = gapComposer.changedInstance(offerItem) | ((i2 & 112) == 32);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new OfferTileKt$$ExternalSyntheticLambda2(offerItem, function1, 3);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Function0 function03 = (Function0) rememberedValue3;
                Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                m3680CircularIconButtonjM_yU8I(icons3, stringResource3, function03, ImageKt.m177backgroundbw27NRU(modifier, colors4.semantic.background.f1047app, RoundedCornerShapeKt.CircleShape), null, null, gapComposer, 6, 48);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OfferTileKt$$ExternalSyntheticLambda0(offerItem, function1, modifier, i);
        }
    }
}
