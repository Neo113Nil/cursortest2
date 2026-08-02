package com.squareup.cash.offers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.OffersFilterGroupSheetViewModel;
import com.squareup.protos.cash.ui.Image;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class OffersFilterGroupSheetKt {
    public static final OffersFilterGroupSheetViewModel filterGroupSheetViewModel = new OffersFilterGroupSheetViewModel("Category", CollectionsKt__CollectionsKt.listOf((Object[]) new OffersFilterGroupSheetViewModel.FilterViewModel[]{new OffersFilterGroupSheetViewModel.FilterViewModel("category_accessories", "Accessories", null, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search SelectFilter", (EmptyMap) null, 6))), new OffersFilterGroupSheetViewModel.FilterViewModel("category_clothing", "Clothing", null, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search SelectFilter", (EmptyMap) null, 6))), new OffersFilterGroupSheetViewModel.FilterViewModel("category_entertainment", "Entertainment", null, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search SelectFilter", (EmptyMap) null, 6))), new OffersFilterGroupSheetViewModel.FilterViewModel("category_food", "Food", null, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search SelectFilter", (EmptyMap) null, 6))), new OffersFilterGroupSheetViewModel.FilterViewModel("category_grocery", "Grocery", null, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search SelectFilter", (EmptyMap) null, 6))), new OffersFilterGroupSheetViewModel.FilterViewModel("category_health_and_beauty", "Health & beauty", null, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search SelectFilter", (EmptyMap) null, 6))), new OffersFilterGroupSheetViewModel.FilterViewModel("category_home_and_auto", "Home & auto", null, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search SelectFilter", (EmptyMap) null, 6))), new OffersFilterGroupSheetViewModel.FilterViewModel("category_shoes", "Shoes", null, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search SelectFilter", (EmptyMap) null, 6))), new OffersFilterGroupSheetViewModel.FilterViewModel("category_transportation", "Transportation", null, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search SelectFilter", (EmptyMap) null, 6)))}), "category_clothing", OffersFilterGroupSheetViewModel.Layout.PILL, Tags.persistentListOf(new OffersAnalyticsEventSpec("Offers Search ApplyFilter", (EmptyMap) null, 6)));

    public static final void OffersFilterGroupSheet(OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel2;
        Function1 function12;
        Modifier modifier2;
        Modifier wrapContentHeight;
        offersFilterGroupSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-403699890);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(offersFilterGroupSheetViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxWidth(wrapContentHeight, 1.0f), zzagn.rememberNestedScrollInteropConnection(gapComposer), null);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, nestedScroll);
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
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), false), ImageKt.rememberScrollState(gapComposer), false, 14);
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
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            final int i4 = 1;
            final int i5 = 0;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, offersFilterGroupSheetViewModel.title, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(1897852826);
            OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel3 = offersFilterGroupSheetViewModel;
            for (final OffersFilterGroupSheetViewModel.FilterViewModel filterViewModel : offersFilterGroupSheetViewModel3.filters) {
                CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(Intrinsics.areEqual(filterViewModel.token, offersFilterGroupSheetViewModel3.selectedFilterToken));
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1506635969, new Function2() { // from class: com.squareup.cash.offers.views.OffersFilterGroupSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String m;
                        int i6 = i5;
                        OffersFilterGroupSheetViewModel.FilterViewModel filterViewModel2 = filterViewModel;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    Image image = filterViewModel2.image;
                                    if (image == null) {
                                        gapComposer2.startReplaceGroup(-1783881099);
                                        gapComposer2.end(false);
                                        m = null;
                                    } else {
                                        m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, -473186548, image, gapComposer2, false);
                                    }
                                    String str = m;
                                    if (str == null) {
                                        gapComposer2.startReplaceGroup(-1783862778);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1783862777);
                                        AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f), null, null, null, gapComposer2, 432, 2040);
                                        gapComposer2.end(false);
                                    }
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, filterViewModel2.name, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1395397918, new Function2() { // from class: com.squareup.cash.offers.views.OffersFilterGroupSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String m;
                        int i6 = i4;
                        OffersFilterGroupSheetViewModel.FilterViewModel filterViewModel2 = filterViewModel;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    Image image = filterViewModel2.image;
                                    if (image == null) {
                                        gapComposer2.startReplaceGroup(-1783881099);
                                        gapComposer2.end(false);
                                        m = null;
                                    } else {
                                        m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, -473186548, image, gapComposer2, false);
                                    }
                                    String str = m;
                                    if (str == null) {
                                        gapComposer2.startReplaceGroup(-1783862778);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1783862777);
                                        AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f), null, null, null, gapComposer2, 432, 2040);
                                        gapComposer2.end(false);
                                    }
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, filterViewModel2.name, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                boolean changedInstance = gapComposer.changedInstance(filterViewModel) | ((i3 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(22, function1, filterViewModel);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, companion, (Function0) rememberedValue, false, true, null, null, radio, 0L, gapComposer2, 1573302, 3504);
                offersFilterGroupSheetViewModel3 = offersFilterGroupSheetViewModel;
                gapComposer = gapComposer2;
            }
            gapComposer.end(false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
            offersFilterGroupSheetViewModel2 = offersFilterGroupSheetViewModel;
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(256337110, new MoneyTabUIKt$$ExternalSyntheticLambda11(16, (Object) offersFilterGroupSheetViewModel2, function12), gapComposer), gapComposer, 24960, 11);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            offersFilterGroupSheetViewModel2 = offersFilterGroupSheetViewModel;
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(offersFilterGroupSheetViewModel2, function12, modifier2, i, 22);
        }
    }
}
