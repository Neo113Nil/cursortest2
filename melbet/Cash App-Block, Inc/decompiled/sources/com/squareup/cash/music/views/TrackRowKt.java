package com.squareup.cash.music.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material3.DividerKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DividerKt$$ExternalSyntheticLambda1;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.plugins.SlottedTableKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.music.viewmodels.Track;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetStateKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class TrackRowKt {

    /* renamed from: lambda$-1966024485, reason: not valid java name */
    public static final ComposableLambdaImpl f507lambda$1966024485 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(26), false, -1966024485);

    /* renamed from: lambda$-1504506227, reason: not valid java name */
    public static final ComposableLambdaImpl f506lambda$1504506227 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(27), false, -1504506227);

    /* renamed from: CircularProgress-MBs18nI, reason: not valid java name */
    public static final void m3666CircularProgressMBs18nI(float f, int i, long j, Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(470103554);
        int i2 = (gapComposer.changed(f) ? 4 : 2) | i | 128;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.component.button.prominent.background.f160default;
            } else {
                gapComposer.skipToGroupEnd();
            }
            int i3 = i2 & (-897);
            gapComposer.endDefaults();
            boolean changed = gapComposer.changed(j) | ((i3 & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DividerKt$$ExternalSyntheticLambda0(f, j, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(6, gapComposer, modifier, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        long j2 = j;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(f, modifier, j2, i);
        }
    }

    public static final void LoadedMusicContent(MusicViewModel.Loaded loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Function1 function12;
        Modifier modifier2;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-647083089);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE("", 0L, gapComposer, 6, 2);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            int i4 = i3 & 112;
            boolean changed = (i4 == 32) | gapComposer.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, (Continuation) null, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion2, j, rectangleShapeKt$RectangleShape$1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, Room.stringResource(gapComposer, R.string.music_search_bar_placeholder), rememberSearchBarKeyboardState, null, null, ShowNavigationBack.Never, null, null, null, null, false, null, gapComposer, 196608, 0, 8152);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f);
            boolean changedInstance = gapComposer.changedInstance(loaded) | (i4 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MusicViewKt$$ExternalSyntheticLambda6(0, loaded, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(fillMaxWidth, null, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, 0, 510);
            gapComposer.end(true);
            if (loaded.hasSelectedTrack) {
                gapComposer.startReplaceGroup(-1029607549);
                companion = companion2;
                Modifier align = BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.BottomCenter);
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                function12 = function1;
                DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(align, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), false, null, null, Expect_jvmKt.rememberComposableLambda(-1274691758, new MusicViewKt$$ExternalSyntheticLambda7(0, function12), gapComposer), gapComposer, 24576, 14);
                gapComposer.end(false);
            } else {
                function12 = function1;
                companion = companion2;
                gapComposer.startReplaceGroup(-1029198163);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(loaded, function12, modifier2, i, 0);
        }
    }

    public static final void MusicSheetContent(MusicViewModel musicViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-37991745);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(musicViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (musicViewModel instanceof MusicViewModel.Loading) {
                gapComposer.startReplaceGroup(-525216830);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                z = true;
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z = true;
                if (musicViewModel instanceof MusicViewModel.Loaded) {
                    gapComposer.startReplaceGroup(-525050205);
                    LoadedMusicContent((MusicViewModel.Loaded) musicViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    gapComposer.end(false);
                } else {
                    if (!(musicViewModel instanceof MusicViewModel.Error)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1679511813, false);
                    }
                    gapComposer.startReplaceGroup(-524947471);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "Error: Failed to load music", (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                    z = true;
                }
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5(musicViewModel, function1, modifier, i, 0);
        }
    }

    public static final void MusicView(RealImageLoader realImageLoader, MusicViewModel musicViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        musicViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2137866862);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(musicViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer, 0, 1);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            gapComposer.startReplaceGroup(-1495679049);
            float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM((int) (((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() & BodyPartID.bodyIdMax));
            gapComposer.end(false);
            float f = mo233toDpu2uoSUM * 0.8f;
            boolean z = (i3 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(676057298, new TrackRowKt$$ExternalSyntheticLambda5(function1, rememberSheetState, musicViewModel, f), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(i, 0, realImageLoader, musicViewModel, function1, modifier2, false);
        }
    }

    public static final void TrackRow(Modifier modifier, Function1 function1, final Track track, float f, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        long j;
        CellDefaultAccessory cellDefaultAccessory;
        function1.getClass();
        track.getClass();
        boolean z = track.isSelected;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-297436140);
        int i2 = i | 6 | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(track) ? 256 : 128) | (gapComposer2.changed(f) ? 2048 : 1024);
        final int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(companion, m340RoundedCornerShape0680j_4);
            if (z) {
                gapComposer2.startReplaceGroup(-401847505);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.semantic.background.subtle;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-401778840);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors2.component.cell.background.f171default;
                gapComposer2.end(false);
            }
            long j2 = j;
            if (z) {
                gapComposer2.startReplaceGroup(-401648299);
                cellDefaultAccessory = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(2118659302, new TrackRowKt$$ExternalSyntheticLambda0(f, 0), gapComposer2), 1);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-401094205);
                gapComposer2.end(false);
                cellDefaultAccessory = CellDefaultAccessory.None.INSTANCE;
            }
            CellDefaultAccessory cellDefaultAccessory2 = cellDefaultAccessory;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(110810934, new Function2() { // from class: com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = r2;
                    Track track2 = track;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(track2.image, gapComposer3), null, ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), null, ContentScale.Companion.Crop, null, gapComposer3, 1572912, 1976);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, track2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, track2.artist, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2041041783, new Function2() { // from class: com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = i3;
                    Track track2 = track;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(track2.image, gapComposer3), null, ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), null, ContentScale.Companion.Crop, null, gapComposer3, 1572912, 1976);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, track2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, track2.artist, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i4 = (gapComposer2.changedInstance(track) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(18, function1, track);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final int i5 = 2;
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, clip, (Function0) rememberedValue, null, false, true, Expect_jvmKt.rememberComposableLambda(737524989, new Function2() { // from class: com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i5;
                    Track track2 = track;
                    switch (i42) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(track2.image, gapComposer3), null, ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), null, ContentScale.Companion.Crop, null, gapComposer3, 1572912, 1976);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, track2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, track2.artist, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, cellDefaultAccessory2, j2, null, gapComposer, 14155830, 0, 2352);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TrackRowKt$$ExternalSyntheticLambda5(modifier2, function1, track, f, i);
        }
    }
}
