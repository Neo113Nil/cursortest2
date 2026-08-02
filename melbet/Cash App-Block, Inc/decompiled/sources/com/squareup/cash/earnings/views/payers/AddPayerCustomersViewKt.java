package com.squareup.cash.earnings.views.payers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.g6$$ExternalSyntheticLambda11;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.earnings.viewmodels.payers.PayerCustomerRowModel;
import com.squareup.cash.earnings.viewmodels.payers.PayerTaggingPromptViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.earningstracker.views.components.EarningsHeaderKt$$ExternalSyntheticLambda0;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class AddPayerCustomersViewKt {
    public static final ComposableLambdaImpl lambda$1352394474 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(11), false, 1352394474);

    /* renamed from: lambda$-1322848668, reason: not valid java name */
    public static final ComposableLambdaImpl f391lambda$1322848668 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(17), false, -1322848668);

    /* renamed from: lambda$-269811901, reason: not valid java name */
    public static final ComposableLambdaImpl f392lambda$269811901 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(18), false, -269811901);
    public static final ComposableLambdaImpl lambda$2127158916 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(19), false, 2127158916);

    /* renamed from: lambda$-787317420, reason: not valid java name */
    public static final ComposableLambdaImpl f393lambda$787317420 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(13), false, -787317420);
    public static final ComposableLambdaImpl lambda$1636140023 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(20), false, 1636140023);
    public static final ComposableLambdaImpl lambda$2120776854 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(21), false, 2120776854);
    public static final ComposableLambdaImpl lambda$206470167 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(12), false, 206470167);
    public static final ComposableLambdaImpl lambda$1532338372 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(13), false, 1532338372);
    public static final ComposableLambdaImpl lambda$1386984914 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(12), false, 1386984914);
    public static final ComposableLambdaImpl lambda$2126136727 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(14), false, 2126136727);
    public static final ComposableLambdaImpl lambda$202830314 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(15), false, 202830314);
    public static final ComposableLambdaImpl lambda$1008179693 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(16), false, 1008179693);

    public static final void AddPayerCustomers(AddPayerCustomersViewModel addPayerCustomersViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        addPayerCustomersViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1570823098);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(addPayerCustomersViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-192466822, new AddPayerCustomersViewKt$$ExternalSyntheticLambda0(addPayerCustomersViewModel, function1, 0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) addPayerCustomersViewModel, function1, realImageLoader, i, 6);
        }
    }

    public static final void AddPayerCustomersContent(final AddPayerCustomersViewModel addPayerCustomersViewModel, final Function1 function1, final PresentationStyle presentationStyle, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl recomposeScopeImpl;
        Function2 function2;
        AddPayerCustomersViewModel.Loaded loaded;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1202969476);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(addPayerCustomersViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(presentationStyle) : gapComposer.changedInstance(presentationStyle) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.Loading) {
            gapComposer.startReplaceGroup(456753145);
            gapComposer.end(false);
        } else if (addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.LoadError) {
            gapComposer.startReplaceGroup(707475548);
            AddPayerCustomersLoadErrorContent((AddPayerCustomersViewModel.LoadError) addPayerCustomersViewModel, function1, presentationStyle, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            gapComposer.end(false);
        } else {
            boolean z = addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.Loaded;
            if (!z && !(addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.Saving) && !(addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.SaveError)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 707470314, false);
            }
            gapComposer.startReplaceGroup(457130415);
            if (z) {
                loaded = (AddPayerCustomersViewModel.Loaded) addPayerCustomersViewModel;
            } else if (addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.Saving) {
                loaded = ((AddPayerCustomersViewModel.Saving) addPayerCustomersViewModel).loaded;
            } else {
                if (!(addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.SaveError)) {
                    gapComposer.end(false);
                    recomposeScopeImpl = gapComposer.endRestartGroup();
                    if (recomposeScopeImpl != null) {
                        final int i3 = 0;
                        function2 = new Function2() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i4 = i3;
                                int i5 = i;
                                PresentationStyle presentationStyle2 = presentationStyle;
                                Function1 function12 = function1;
                                AddPayerCustomersViewModel addPayerCustomersViewModel2 = addPayerCustomersViewModel;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).getClass();
                                switch (i4) {
                                    case 0:
                                        AddPayerCustomersViewKt.AddPayerCustomersContent(addPayerCustomersViewModel2, function12, presentationStyle2, composer2, Updater.updateChangedFlags(i5 | 1));
                                        break;
                                    default:
                                        AddPayerCustomersViewKt.AddPayerCustomersContent(addPayerCustomersViewModel2, function12, presentationStyle2, composer2, Updater.updateChangedFlags(i5 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        recomposeScopeImpl.block = function2;
                    }
                    return;
                }
                loaded = ((AddPayerCustomersViewModel.SaveError) addPayerCustomersViewModel).loaded;
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            int i4 = i2 & 112;
            AddPayerCustomersLoadedContent(loaded, function1, presentationStyle, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
            boolean z2 = addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.Saving;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2) {
                gapComposer.startReplaceGroup(833536055);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new Recipient$$ExternalSyntheticLambda2(16);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ModalKt.Dimmer(null, (Function0) rememberedValue, null, lambda$1352394474, gapComposer, 3120, 5);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(833579300);
                gapComposer.end(false);
            }
            if (addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.SaveError) {
                gapComposer.startReplaceGroup(833656211);
                boolean z3 = i4 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new EarningsHomeKt$$ExternalSyntheticLambda7(8, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ModalKt.Dimmer(null, (Function0) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(-1929046637, new ErrorView$$ExternalSyntheticLambda3(8, function1), gapComposer), gapComposer, 3072, 5);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(834164580);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(false);
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            final int i5 = 1;
            function2 = new Function2() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i5;
                    int i52 = i;
                    PresentationStyle presentationStyle2 = presentationStyle;
                    Function1 function12 = function1;
                    AddPayerCustomersViewModel addPayerCustomersViewModel2 = addPayerCustomersViewModel;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            AddPayerCustomersViewKt.AddPayerCustomersContent(addPayerCustomersViewModel2, function12, presentationStyle2, composer2, Updater.updateChangedFlags(i52 | 1));
                            break;
                        default:
                            AddPayerCustomersViewKt.AddPayerCustomersContent(addPayerCustomersViewModel2, function12, presentationStyle2, composer2, Updater.updateChangedFlags(i52 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            recomposeScopeImpl.block = function2;
        }
    }

    public static final void AddPayerCustomersLoadErrorContent(final AddPayerCustomersViewModel.LoadError loadError, Function1 function1, PresentationStyle presentationStyle, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier systemBarsPadding;
        final int i3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(686588997);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(loadError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer2.changed(presentationStyle) : gapComposer2.changedInstance(presentationStyle) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean isOverlay = presentationStyle.isOverlay();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (isOverlay) {
                gapComposer2.startReplaceGroup(-1612930579);
                gapComposer2.end(false);
                systemBarsPadding = companion;
            } else {
                gapComposer2.startReplaceGroup(-1612927944);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                gapComposer2.end(false);
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            boolean showTitleBar = presentationStyle.getShowTitleBar();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (showTitleBar) {
                gapComposer2.startReplaceGroup(-280194094);
                NavigationType navigationType = NavigationType.CLOSE;
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(3, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                gapComposer = gapComposer2;
                i3 = 0;
                DBUtil.TitleBarSub(f393lambda$787317420, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                i3 = 0;
                gapComposer.startReplaceGroup(-280033607);
                gapComposer.end(false);
            }
            final int i4 = 1;
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(1281393120, new Function2() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    AddPayerCustomersViewModel.LoadError loadError2 = loadError;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer3, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), (TextStyle) null, (TextLineBalancing) null, loadError2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loadError2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1021034819, new Function2() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    AddPayerCustomersViewModel.LoadError loadError2 = loadError;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer3, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), (TextStyle) null, (TextLineBalancing) null, loadError2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loadError2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3078, 6);
            gapComposer.end(true);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Recipient$$ExternalSyntheticLambda2(15);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ModalKt.Dimmer(null, (Function0) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(175187686, new ErrorView$$ExternalSyntheticLambda3(5, function1), gapComposer), gapComposer, 3120, 5);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) loadError, function1, (Object) presentationStyle, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [androidx.compose.ui.Modifier, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v36 */
    public static final void AddPayerCustomersLoadedContent(final AddPayerCustomersViewModel.Loaded loaded, Function1 function1, PresentationStyle presentationStyle, Composer composer, int i) {
        int i2;
        final ?? r3;
        boolean z;
        ?? r4;
        boolean z2;
        Function1 function12 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1383153661);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(presentationStyle) : gapComposer.changedInstance(presentationStyle) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean isOverlay = presentationStyle.isOverlay();
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            if (isOverlay) {
                gapComposer.startReplaceGroup(2065780453);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2065783088);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                modifier = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                gapComposer.end(false);
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            boolean showTitleBar = presentationStyle.getShowTitleBar();
            Object obj = Composer.Companion.Empty;
            if (showTitleBar) {
                gapComposer.startReplaceGroup(824223968);
                NavigationType navigationType = NavigationType.CLOSE;
                Object[] objArr = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (objArr != false || rememberedValue == obj) {
                    rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(2, function12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                r3 = 1;
                z = false;
                r4 = 0;
                DBUtil.TitleBarSub(lambda$1386984914, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                r3 = 1;
                z = false;
                r4 = 0;
                gapComposer.startReplaceGroup(824372923);
                gapComposer.end(false);
            }
            final int i3 = z ? 1 : 0;
            GapComposer gapComposer2 = gapComposer;
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(144025694, new Function2() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i4 = i3;
                    AddPayerCustomersViewModel.Loaded loaded2 = loaded;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer3, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), (TextStyle) null, (TextLineBalancing) null, loaded2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(1924491707, new Function2() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i4 = r3;
                    AddPayerCustomersViewModel.Loaded loaded2 = loaded;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer3, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), (TextStyle) null, (TextLineBalancing) null, loaded2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer2, 3078, 6);
            DBUtil.SpacerBetweenSectionLarge(z ? 1 : 0, r3, gapComposer2, r4);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer2, 0, 3);
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(z, gapComposer2);
            Unit unit = Unit.INSTANCE;
            int i4 = i2 & 112;
            boolean changed = gapComposer2.changed(m382rememberTextFieldStateLepunE) | (i4 == 32 ? r3 : z ? 1 : 0);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new SetPinViewKt$SetPin$3$1$1$1(m382rememberTextFieldStateLepunE, function12, r4, 6);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue2);
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, Room.stringResource(gapComposer2, R.string.add_payer_customers_search_placeholder), rememberSearchBarKeyboardState, null, null, ShowNavigationBack.Never, null, null, null, null, false, null, gapComposer2, 196608, 0, 8152);
            DBUtil.SpacerBetweenSectionLarge(z ? 1 : 0, r3, gapComposer2, r4);
            Object stringResource = Room.stringResource(gapComposer2, R.string.add_payer_customers_section_most_recent);
            Object stringResource2 = Room.stringResource(gapComposer2, R.string.add_payer_customers_section_current);
            Object stringResource3 = Room.stringResource(gapComposer2, R.string.add_payer_customers_section_search_results);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, r3);
            boolean z3 = (gapComposer2.changedInstance(loaded) ? 1 : 0) | (gapComposer2.changed(stringResource3) ? 1 : 0);
            if (i4 == 32) {
                z = r3;
            }
            boolean z4 = z3 | z | (gapComposer2.changed(stringResource) ? 1 : 0) | (gapComposer2.changed(stringResource2) ? 1 : 0);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z4 != 0 || rememberedValue3 == obj) {
                z2 = r3;
                Object overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(loaded, stringResource3, stringResource, stringResource2, function12, 18);
                function12 = function12;
                gapComposer2.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                rememberedValue3 = overlayKt$$ExternalSyntheticLambda3;
            } else {
                z2 = r3;
            }
            LazyDslKt.LazyColumn(layoutWeightElement, null, null, null, null, null, false, null, (Function1) rememberedValue3, gapComposer2, 0, 510);
            DimensionKt.ButtonCtaGroup(null, presentationStyle.getShowButtonDivider(), presentationStyle.getButtonOrientation(), null, Expect_jvmKt.rememberComposableLambda(2043190661, new SectionKt$$ExternalSyntheticLambda2(23, presentationStyle, loaded, function12), gapComposer2), gapComposer2, 24576, 9);
            gapComposer = gapComposer2;
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) loaded, function12, (Object) presentationStyle, i, 5);
        }
    }

    public static final void AddPayerCustomersScreen(AddPayerCustomersViewModel addPayerCustomersViewModel, Function1 function1, PresentationStyle presentationStyle, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-866644074);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(addPayerCustomersViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(presentationStyle) : gapComposer.changedInstance(presentationStyle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(paddingValues) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean isOverlay = presentationStyle.isOverlay();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxHeight = isOverlay ? SizeKt.fillMaxHeight(SpacerKt.padding(companion, paddingValues), 0.95f) : SpacerKt.padding(companion, paddingValues);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxHeight);
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
            AddPayerCustomersContent(addPayerCustomersViewModel, function1, presentationStyle, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(addPayerCustomersViewModel, function1, presentationStyle, paddingValues, i, 3);
        }
    }

    public static final void PayerCustomerRow(final PayerCustomerRowModel payerCustomerRowModel, Function1 function1, boolean z, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-42200119);
        final int i2 = 2;
        int i3 = i | (gapComposer2.changedInstance(payerCustomerRowModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(z) ? 256 : 128);
        final int i4 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            CellDefaultAccessory.Checkbox checkbox = new CellDefaultAccessory.Checkbox(payerCustomerRowModel.isSelected);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-111139605, new Function2() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Color m;
                    long j;
                    int i5 = r2;
                    PayerCustomerRowModel payerCustomerRowModel2 = payerCustomerRowModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                AvatarSize avatarSize = AvatarSize.Size48;
                                Character ch = payerCustomerRowModel2.monogram;
                                String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
                                if (valueOf == null) {
                                    valueOf = "";
                                }
                                String str = valueOf;
                                com.squareup.protos.cash.ui.Color color = payerCustomerRowModel2.accentColor;
                                if (color == null) {
                                    gapComposer3.startReplaceGroup(459979628);
                                    gapComposer3.end(false);
                                    m = null;
                                } else {
                                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 569027381, color, gapComposer3, false);
                                }
                                if (m == null) {
                                    gapComposer3.startReplaceGroup(569029073);
                                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    j = colors.semantic.background.subtle;
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(569026841);
                                    gapComposer3.end(false);
                                    j = m.value;
                                }
                                String str2 = payerCustomerRowModel2.imageUrl;
                                TextViewKt.m3613AvatarB_rZmmc(avatarSize, str, j, (String) null, (Modifier) null, (AvatarImage) (str2 != null ? new AvatarImage.Remote.Image(str2, false, null, 0L, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str2, 7), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 3078, 0, 2000);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerCustomerRowModel2.displayName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerCustomerRowModel2.cashtag, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-815002580, new Function2() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Color m;
                    long j;
                    int i5 = i4;
                    PayerCustomerRowModel payerCustomerRowModel2 = payerCustomerRowModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                AvatarSize avatarSize = AvatarSize.Size48;
                                Character ch = payerCustomerRowModel2.monogram;
                                String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
                                if (valueOf == null) {
                                    valueOf = "";
                                }
                                String str = valueOf;
                                com.squareup.protos.cash.ui.Color color = payerCustomerRowModel2.accentColor;
                                if (color == null) {
                                    gapComposer3.startReplaceGroup(459979628);
                                    gapComposer3.end(false);
                                    m = null;
                                } else {
                                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 569027381, color, gapComposer3, false);
                                }
                                if (m == null) {
                                    gapComposer3.startReplaceGroup(569029073);
                                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    j = colors.semantic.background.subtle;
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(569026841);
                                    gapComposer3.end(false);
                                    j = m.value;
                                }
                                String str2 = payerCustomerRowModel2.imageUrl;
                                TextViewKt.m3613AvatarB_rZmmc(avatarSize, str, j, (String) null, (Modifier) null, (AvatarImage) (str2 != null ? new AvatarImage.Remote.Image(str2, false, null, 0L, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str2, 7), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 3078, 0, 2000);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerCustomerRowModel2.displayName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerCustomerRowModel2.cashtag, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i5 = ((i3 & 896) == 256 ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0) | (gapComposer2.changedInstance(payerCustomerRowModel) ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i5 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new g6$$ExternalSyntheticLambda11(z, function1, payerCustomerRowModel, 5);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(-743213134, new Function2() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Color m;
                    long j;
                    int i52 = i2;
                    PayerCustomerRowModel payerCustomerRowModel2 = payerCustomerRowModel;
                    switch (i52) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                AvatarSize avatarSize = AvatarSize.Size48;
                                Character ch = payerCustomerRowModel2.monogram;
                                String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
                                if (valueOf == null) {
                                    valueOf = "";
                                }
                                String str = valueOf;
                                com.squareup.protos.cash.ui.Color color = payerCustomerRowModel2.accentColor;
                                if (color == null) {
                                    gapComposer3.startReplaceGroup(459979628);
                                    gapComposer3.end(false);
                                    m = null;
                                } else {
                                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, 569027381, color, gapComposer3, false);
                                }
                                if (m == null) {
                                    gapComposer3.startReplaceGroup(569029073);
                                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    j = colors.semantic.background.subtle;
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(569026841);
                                    gapComposer3.end(false);
                                    j = m.value;
                                }
                                String str2 = payerCustomerRowModel2.imageUrl;
                                TextViewKt.m3613AvatarB_rZmmc(avatarSize, str, j, (String) null, (Modifier) null, (AvatarImage) (str2 != null ? new AvatarImage.Remote.Image(str2, false, null, 0L, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str2, 7), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 3078, 0, 2000);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerCustomerRowModel2.displayName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, payerCustomerRowModel2.cashtag, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, checkbox, 0L, null, gapComposer, 12582966, 0, 3444);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(payerCustomerRowModel, function1, z, i, 17);
        }
    }

    public static final void PayerTaggingPrompt(PayerTaggingPromptViewModel payerTaggingPromptViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        payerTaggingPromptViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1634660361);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(payerTaggingPromptViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-59669705, new PayerTaggingPromptViewKt$$ExternalSyntheticLambda0(function1, payerTaggingPromptViewModel, 0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) payerTaggingPromptViewModel, function1, realImageLoader, i, 8);
        }
    }

    public static final void PayerTaggingPromptContent(PayerTaggingPromptViewModel payerTaggingPromptViewModel, Function1 function1, PaddingValues paddingValues, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        Color m;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1645218994);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(payerTaggingPromptViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(paddingValues) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier consumeWindowInsets = OffsetKt.consumeWindowInsets(SpacerKt.padding(SizeKt.fillMaxWidth(modifier2, 1.0f), paddingValues), paddingValues);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, consumeWindowInsets);
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
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            AvatarSize avatarSize = AvatarSize.Size64;
            String str = payerTaggingPromptViewModel.monogram;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            com.squareup.protos.cash.ui.Color color = payerTaggingPromptViewModel.accentColor;
            if (color == null) {
                gapComposer.startReplaceGroup(-687811179);
                z = false;
                gapComposer.end(false);
                m = null;
            } else {
                z = false;
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1501833196, color, gapComposer, false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(1501834888);
                j = Strings.getColors(gapComposer).semantic.background.subtle;
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(1501832656);
                gapComposer.end(z);
                j = m.value;
            }
            String str3 = payerTaggingPromptViewModel.imageUrl;
            boolean z2 = z;
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j, (String) null, (Modifier) null, (AvatarImage) (str3 != null ? new AvatarImage.Remote.Image(str3, false, null, 0L, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str3, 8), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 3078, 0, 2000);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(z2 ? 1 : 0, 1, gapComposer, null);
            String str4 = payerTaggingPromptViewModel.title;
            TextStyle textStyle = Strings.getTypography(gapComposer).sectionTitle;
            long j2 = Strings.getColors(gapComposer).semantic.text.standard;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StoryQueries$$ExternalSyntheticLambda0(1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j2, (Composer) gapComposer, SemanticsModifierKt.semantics(fillMaxWidth, z2, (Function1) rememberedValue), textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(z2 ? 1 : 0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SizeKt.fillMaxWidth(modifier2, 1.0f), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, payerTaggingPromptViewModel.message, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            DBUtil.SpacerWithinSectionMedium(z2 ? 1 : 0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(151845590, new PayerTaggingPromptViewKt$$ExternalSyntheticLambda4(function1, payerTaggingPromptViewModel), gapComposer), gapComposer, 24960, 11);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(payerTaggingPromptViewModel, function1, paddingValues, modifier2, i, 4);
        }
    }

    public static final void payerSection(LazyListScope lazyListScope, final List list, String str, String str2, boolean z, final Function1 function1, final boolean z2) {
        if (list.isEmpty()) {
            return;
        }
        if (z) {
            LazyListScope.item$default(lazyListScope, null, Spacer.f1511type, lambda$1008179693, 1);
        }
        LazyListScope.item$default(lazyListScope, null, "section_header", new ComposableLambdaImpl(new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str, 6), true, 1979450111), 1);
        lazyListScope.items(list.size(), new VerifyCheckDepositPresenter$models$3$2(2, new SyncDetailsQueries$$ExternalSyntheticLambda2(str2, 24), list), new VerifyCheckDepositPresenter$models$3$2(3, new ComposeDialogKt$$ExternalSyntheticLambda14(29), list), new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt$payerSection$$inlined$items$3
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    PayerCustomerRowModel payerCustomerRowModel = (PayerCustomerRowModel) list.get(intValue);
                    gapComposer.startReplaceGroup(1669675611);
                    AddPayerCustomersViewKt.PayerCustomerRow(payerCustomerRowModel, function1, z2, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }, true, 802480018));
    }
}
