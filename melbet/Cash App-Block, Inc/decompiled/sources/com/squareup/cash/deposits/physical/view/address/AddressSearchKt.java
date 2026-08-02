package com.squareup.cash.deposits.physical.view.address;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda2;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.deposits.physical.viewmodels.address.PhysicalDepositAddressEntryViewModel;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt$$ExternalSyntheticLambda0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class AddressSearchKt {
    public static final ComposableLambdaImpl lambda$1797225831 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(25), false, 1797225831);

    public static final void AddressCell(String str, String str2, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2142645389);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            CellDefaultKt.CellSearchResult(lambda$1797225831, str, (Modifier) null, function0, str2, (Function1) null, gapComposer, (i3 & 7168) | (i3 & 112) | 6 | ((i2 << 9) & 57344), 36);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DisclaimerTextKt$$ExternalSyntheticLambda0(i, 2, str, str2, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AddressSearch(PhysicalDepositAddressEntryViewModel physicalDepositAddressEntryViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        boolean z;
        physicalDepositAddressEntryViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1785882303);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(physicalDepositAddressEntryViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer);
            String str = physicalDepositAddressEntryViewModel.searchBarPlaceholder;
            PhysicalDepositAddressEntryViewModel.Results results = physicalDepositAddressEntryViewModel.results;
            PhysicalDepositAddressEntryViewModel.Error error = physicalDepositAddressEntryViewModel.error;
            AddressSearchBar(str, rememberSearchBarKeyboardState, function1, gapComposer, (i2 << 3) & 896);
            if (error != null) {
                gapComposer.startReplaceGroup(552053823);
                NoResults(Icons.InformationOutline24, error.title, error.description, gapComposer, 6);
                gapComposer.end(false);
            } else if (results == null || !results.isFirstTimeUseSectionVisible) {
                if (results != null) {
                    gapComposer.startReplaceGroup(-65751107);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(physicalDepositAddressEntryViewModel) | gapComposer.changed(rememberSearchBarKeyboardState);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(3, physicalDepositAddressEntryViewModel, rememberSearchBarKeyboardState, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.LazyColumn(fillMaxSize, null, m295PaddingValuesYgX7TsA$default, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 6, 506);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-64613097);
                    gapComposer.end(false);
                }
                z = 1;
                gapComposer.end(z);
                i3 = z;
            } else {
                gapComposer.startReplaceGroup(552060822);
                Icons icons = Icons.Location24;
                String str2 = results.explanationHeaderText;
                str2.getClass();
                String str3 = results.explanationTitleText;
                str3.getClass();
                NoResults(icons, str2, str3, gapComposer, 6);
                gapComposer.end(false);
            }
            z = 1;
            gapComposer.end(z);
            i3 = z;
        } else {
            i3 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(physicalDepositAddressEntryViewModel, function1, i, i3);
        }
    }

    public static final void AddressSearchBar(String str, SearchBarKeyboardState searchBarKeyboardState, Function1 function1, Composer composer, int i) {
        int i2;
        SearchBarKeyboardState searchBarKeyboardState2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1242453663);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            searchBarKeyboardState2 = searchBarKeyboardState;
            i2 |= gapComposer2.changed(searchBarKeyboardState2) ? 32 : 16;
        } else {
            searchBarKeyboardState2 = searchBarKeyboardState;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer2, 0, 3);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            int i3 = i2 & 896;
            boolean changed = (i3 == 256) | gapComposer2.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, (Continuation) null, 6);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer2, charSequence, (Function2) rememberedValue);
            boolean z = i3 == 256;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == obj) {
                rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(28, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            boolean z2 = i3 == 256;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue3 == obj) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(29, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            gapComposer = gapComposer2;
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, str, searchBarKeyboardState2, null, null, null, function0, null, null, (Function0) rememberedValue3, false, null, gapComposer, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, 0, 7608);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(str, searchBarKeyboardState, function1, i, 26);
        }
    }

    public static final void NoResults(Icons icons, String str, String str2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1766879028);
        int i2 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, (String) null, m, colors.semantic.icon.subtle, gapComposer, 54, 0);
            ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(1638170897, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 26), gapComposer), (Modifier) null, (Function2) null, (Function0) null, Expect_jvmKt.rememberComposableLambda(1142234509, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str2, 27), gapComposer), gapComposer, 24582, 14);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddressSearchKt$$ExternalSyntheticLambda4(icons, str, str2, i, 0);
        }
    }
}
