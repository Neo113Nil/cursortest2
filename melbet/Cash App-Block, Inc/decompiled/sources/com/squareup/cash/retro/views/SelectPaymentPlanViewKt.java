package com.squareup.cash.retro.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.SelectionCardStyle;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda14;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.Worker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes7.dex */
public abstract class SelectPaymentPlanViewKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State.values().length];
            try {
                iArr[SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ListUnordered.Variant.values().length];
            try {
                iArr2[ListUnordered.Variant.SUBTLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void HeaderSection(final SelectPaymentPlanViewModel.HeaderSection headerSection, Modifier modifier, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(583663233);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(headerSection) ? 4 : 2) | i | 48;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (headerSection.bodyPrimaryText == null && headerSection.bodySecondaryText == null) {
                gapComposer.startReplaceGroup(1884902571);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1884500005);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-180883572, new Function2() { // from class: com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i4;
                        SelectPaymentPlanViewModel.HeaderSection headerSection2 = headerSection;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(11);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, true, (Function1) rememberedValue);
                                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
                                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, semantics);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer2.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer2.startReusableNode();
                                    if (gapComposer2.inserting) {
                                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer2.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    String str = headerSection2.bodyPrimaryText;
                                    if (str == null) {
                                        gapComposer2.startReplaceGroup(1809752346);
                                    } else {
                                        gapComposer2.startReplaceGroup(1809752347);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer2, (Modifier) new LayoutWeightElement(1.0f, true), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer2.end(false);
                                    String str2 = headerSection2.bodySecondaryText;
                                    if (str2 == null) {
                                        gapComposer2.startReplaceGroup(1809845780);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(1809845781);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer3.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer3.startReusableNode();
                                    if (gapComposer3.inserting) {
                                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer3.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, headerSection2.title, (Map) null, (Function1) null, false);
                                    String str3 = headerSection2.subtitle;
                                    if (str3 == null) {
                                        gapComposer3.startReplaceGroup(1608756451);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(1608756452);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                        gapComposer3.end(false);
                                    }
                                    gapComposer3.end(true);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(headerSection2.avatar, headerSection2.avatarBadge, new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(21), gapComposer4, 8, 0), null, false, gapComposer4, 6, 28);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer);
                gapComposer.end(false);
            }
            ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1680474806, new Function2() { // from class: com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    SelectPaymentPlanViewModel.HeaderSection headerSection2 = headerSection;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(11);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, true, (Function1) rememberedValue);
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
                                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, semantics);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer2.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer2.startReusableNode();
                                if (gapComposer2.inserting) {
                                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer2.useNode();
                                }
                                Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str = headerSection2.bodyPrimaryText;
                                if (str == null) {
                                    gapComposer2.startReplaceGroup(1809752346);
                                } else {
                                    gapComposer2.startReplaceGroup(1809752347);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer2, (Modifier) new LayoutWeightElement(1.0f, true), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                }
                                gapComposer2.end(false);
                                String str2 = headerSection2.bodySecondaryText;
                                if (str2 == null) {
                                    gapComposer2.startReplaceGroup(1809845780);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(1809845781);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    gapComposer2.end(false);
                                }
                                gapComposer2.end(true);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer3.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer3.startReusableNode();
                                if (gapComposer3.inserting) {
                                    gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                                } else {
                                    gapComposer3.useNode();
                                }
                                Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, headerSection2.title, (Map) null, (Function1) null, false);
                                String str3 = headerSection2.subtitle;
                                if (str3 == null) {
                                    gapComposer3.startReplaceGroup(1608756451);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(1608756452);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer3.end(false);
                                }
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(headerSection2.avatar, headerSection2.avatarBadge, new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(21), gapComposer4, 8, 0), null, false, gapComposer4, 6, 28);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-2114980404, new Function2() { // from class: com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i2;
                    SelectPaymentPlanViewModel.HeaderSection headerSection2 = headerSection;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(11);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, true, (Function1) rememberedValue);
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
                                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, semantics);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer2.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer2.startReusableNode();
                                if (gapComposer2.inserting) {
                                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer2.useNode();
                                }
                                Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str = headerSection2.bodyPrimaryText;
                                if (str == null) {
                                    gapComposer2.startReplaceGroup(1809752346);
                                } else {
                                    gapComposer2.startReplaceGroup(1809752347);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer2, (Modifier) new LayoutWeightElement(1.0f, true), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                }
                                gapComposer2.end(false);
                                String str2 = headerSection2.bodySecondaryText;
                                if (str2 == null) {
                                    gapComposer2.startReplaceGroup(1809845780);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(1809845781);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    gapComposer2.end(false);
                                }
                                gapComposer2.end(true);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer3.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer3.startReusableNode();
                                if (gapComposer3.inserting) {
                                    gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                                } else {
                                    gapComposer3.useNode();
                                }
                                Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, headerSection2.title, (Map) null, (Function1) null, false);
                                String str3 = headerSection2.subtitle;
                                if (str3 == null) {
                                    gapComposer3.startReplaceGroup(1608756451);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(1608756452);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer3.end(false);
                                }
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(headerSection2.avatar, headerSection2.avatarBadge, new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(21), gapComposer4, 8, 0), null, false, gapComposer4, 6, 28);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Countries.PageHeader(rememberComposableLambda2, companion, rememberComposableLambda3, composableLambdaImpl, gapComposer, 438, 0);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(headerSection, modifier, i, 9);
        }
    }

    public static final void SectionDivider(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(79531204);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m299paddingVpY3zN4(Modifier.Companion.$$INSTANCE, 16.0f, 32.0f));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(i, i2);
        }
    }

    public static final void SelectPaymentPlanInfoSheet(Modifier modifier, final SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-931940008);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(infoHalfSheet) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
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
            Transformations.SheetHeader(Expect_jvmKt.rememberComposableLambda(-1223792223, new Function2() { // from class: com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet2 = infoHalfSheet;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, infoHalfSheet2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, infoHalfSheet2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-988694044, new Function2() { // from class: com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet2 = infoHalfSheet;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, infoHalfSheet2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, infoHalfSheet2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3078, 6);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            DimensionKt.ButtonCtaGroup(Request$Priority$EnumUnboxingLocalUtility.m(companion, 16.0f, gapComposer, companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(1208428256, new ShareSheetViewKt$$ExternalSyntheticLambda1(11, (Object) infoHalfSheet, function1), gapComposer), gapComposer, 24582, 14);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3((Object) modifier, (Object) infoHalfSheet, (Object) function1, i, 19);
        }
    }

    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    public static final void SelectPaymentPlanOptionsConfigSheet(Modifier modifier, SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet optionsConfigSheet, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        ?? r11;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1026838675);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(optionsConfigSheet) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
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
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1803310090, new PdfPreviewViewKt$$ExternalSyntheticLambda2(optionsConfigSheet, 29), gapComposer);
            String str = optionsConfigSheet.subtitle;
            if (str == null) {
                gapComposer.startReplaceGroup(1470012246);
                gapComposer.end(false);
                r11 = 0;
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1470012247);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(465794222, new InfoSectionKt$$ExternalSyntheticLambda7(str, 18), gapComposer);
                r11 = 0;
                gapComposer.end(false);
            }
            Transformations.SheetHeader(rememberComposableLambda2, (Modifier) null, (Function2) null, rememberComposableLambda, gapComposer, 6, 6);
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            float f = 1.0f;
            float f2 = 16.0f;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.verticalScroll$default(SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, r11), 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), rememberScrollState, r11, 14), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, r11);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            gapComposer.startReplaceGroup(110937333);
            Iterator it = optionsConfigSheet.options.iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (hasNext) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    final SelectPaymentPlanViewModel.PaymentPlanOption paymentPlanOption = (SelectPaymentPlanViewModel.PaymentPlanOption) next;
                    SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
                    float f3 = f2;
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f3, 7);
                    float f4 = f;
                    f2 = f3;
                    boolean z2 = paymentPlanOption.selected;
                    final int i5 = 0;
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1115314383, new Function2() { // from class: com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            SelectPaymentPlanViewModel.PaymentPlanOption paymentPlanOption2 = paymentPlanOption;
                            switch (i6) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, paymentPlanOption2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        String str2 = paymentPlanOption2.subtitle;
                                        if (str2 == null) {
                                            gapComposer3.startReplaceGroup(235011491);
                                        } else {
                                            gapComposer3.startReplaceGroup(235011492);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer);
                    final int i6 = 1;
                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(695195438, new Function2() { // from class: com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i62 = i6;
                            SelectPaymentPlanViewModel.PaymentPlanOption paymentPlanOption2 = paymentPlanOption;
                            switch (i62) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, paymentPlanOption2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        String str2 = paymentPlanOption2.subtitle;
                                        if (str2 == null) {
                                            gapComposer3.startReplaceGroup(235011491);
                                        } else {
                                            gapComposer3.startReplaceGroup(235011492);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer);
                    boolean changed = ((i2 & 896) == 256) | gapComposer.changed(i3);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        z = true;
                        rememberedValue = new SuggestionUiKt$$ExternalSyntheticLambda14(i3, 1, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    } else {
                        z = true;
                    }
                    GapComposer gapComposer2 = gapComposer;
                    InputChipKt.SelectionCard(rememberComposableLambda3, rememberComposableLambda4, z2, m302paddingqDBjuR0$default2, false, (Function1) rememberedValue, gapComposer2, 27702, 32);
                    f = f4;
                    gapComposer = gapComposer2;
                    i3 = i4;
                    rememberScrollState = rememberScrollState;
                } else {
                    ScrollState scrollState = rememberScrollState;
                    gapComposer.end(false);
                    gapComposer.end(true);
                    GapComposer gapComposer3 = gapComposer;
                    DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, f), scrollState.getCanScrollForward() || scrollState.getCanScrollBackward(), null, null, Expect_jvmKt.rememberComposableLambda(770494197, new ShareSheetViewKt$$ExternalSyntheticLambda1(12, (Object) optionsConfigSheet, (Object) function1), gapComposer), gapComposer3, 24582, 12);
                    gapComposer = gapComposer3;
                    gapComposer.end(true);
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3((Object) modifier, (Object) optionsConfigSheet, (Object) function1, i, 20);
        }
    }

    public static final void SelectPaymentPlanView(SelectPaymentPlanViewModel selectPaymentPlanViewModel, Function1 function1, Modifier modifier, ScrollState scrollState, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        ScrollState scrollState2;
        ScrollState rememberScrollState;
        int i2;
        Modifier modifier3;
        SelectPaymentPlanViewModel selectPaymentPlanViewModel2 = selectPaymentPlanViewModel;
        selectPaymentPlanViewModel2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-397820949);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(selectPaymentPlanViewModel2) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | 1408;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                rememberScrollState = ImageKt.rememberScrollState(gapComposer);
                i2 = i3 & (-7169);
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                rememberScrollState = scrollState;
                i2 = i3 & (-7169);
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(modifier3, colors.semantic.background.f1047app, ColorKt.RectangleShape)), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Modifier modifier4 = modifier3;
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
            ScrollState scrollState3 = rememberScrollState;
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(14, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), scrollState3, false, 14), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            selectPaymentPlanViewModel2 = selectPaymentPlanViewModel;
            HeaderSection(selectPaymentPlanViewModel2.headerSection, null, gapComposer, 0);
            SectionDivider(gapComposer, 0);
            function12 = function1;
            TimelineSection(selectPaymentPlanViewModel2.paymentsTimelineSection, function12, gapComposer, ((i2 << 3) & 896) | 6);
            SectionDivider(gapComposer, 0);
            SummarySection(selectPaymentPlanViewModel2.summarySection, function12, null, gapComposer, i4);
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(null, true, null, null, Expect_jvmKt.rememberComposableLambda(-1306061453, new SheetKt$$ExternalSyntheticLambda5(8, scrollState3, selectPaymentPlanViewModel2, function12), gapComposer), gapComposer, 24624, 13);
            gapComposer = gapComposer;
            gapComposer.end(true);
            SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet selectPaymentPlanHalfSheet = selectPaymentPlanViewModel2.halfSheet;
            if (selectPaymentPlanHalfSheet == null) {
                gapComposer.startReplaceGroup(-1667420652);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1667420651);
                boolean z3 = i4 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(17, function12);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                SheetKt.Sheet((Function0) rememberedValue3, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(511107082, new ShareSheetViewKt$$ExternalSyntheticLambda1(14, (Object) selectPaymentPlanHalfSheet, (Object) function12), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            scrollState2 = scrollState3;
            modifier2 = modifier4;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            scrollState2 = scrollState;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(selectPaymentPlanViewModel2, function12, modifier2, scrollState2, i, 25);
        }
    }

    public static final void SubmitButton(Function0 function0, String str, SelectPaymentPlanViewModel.ButtonState buttonState, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-917472785);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(buttonState) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = (buttonState instanceof SelectPaymentPlanViewModel.ButtonState.Loaded) && ((SelectPaymentPlanViewModel.ButtonState.Loaded) buttonState).enabled;
            boolean areEqual = Intrinsics.areEqual(buttonState, SelectPaymentPlanViewModel.ButtonState.Loading.INSTANCE);
            Modifier modifier3 = Modifier.Companion.$$INSTANCE;
            if (areEqual) {
                gapComposer.startReplaceGroup(740463806);
                String stringResource = Room.stringResource(gapComposer, R.string.retro_payment_options_loading_button);
                boolean changed = gapComposer.changed(stringResource);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 8);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier3 = SemanticsModifierKt.semantics(modifier3, false, (Function1) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(740644629);
                gapComposer.end(false);
            }
            modifier2 = modifier;
            coil3.size.SizeKt.ButtonCta(function0, modifier2.then(modifier3), buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-463370156, new ShareSheetViewKt$$ExternalSyntheticLambda1(13, buttonState, str), gapComposer), gapComposer, (i2 & 14) | 1573248, 40);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(function0, str, buttonState, modifier2, i, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static final void SummarySection(SelectPaymentPlanViewModel.SummarySection summarySection, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier.Companion companion;
        Modifier modifier3;
        Modifier.Companion companion2;
        Function1 function12 = function1;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1313457614);
        Applier applier = gapComposer.applier;
        int i2 = 4;
        int i3 = (i & 6) == 0 ? i | (gapComposer.changedInstance(summarySection) ? 4 : 2) : i;
        int i4 = 32;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function12) ? 32 : 16;
        }
        int i5 = i3 | MLKEMEngine.KyberPolyBytes;
        boolean z = 0;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion3);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1792852106);
            for (SelectPaymentPlanViewModel.SummaryRow summaryRow : summarySection.rowItems) {
                boolean z2 = summaryRow.infoSheet != null ? true : z;
                Object obj = Composer.Companion.Empty;
                if (z2) {
                    gapComposer.startReplaceGroup(700428957);
                    boolean changedInstance = gapComposer.changedInstance(summaryRow) | ((i5 & 112) == i4 ? true : z);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == obj) {
                        rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(i2, (Object) summaryRow, function12);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modifier3 = ImageKt.m183clickableoSLSa3U$default(companion3, false, null, null, (Function0) rememberedValue, 15);
                    companion = companion3;
                    gapComposer.end(z);
                } else {
                    companion = companion3;
                    gapComposer.startReplaceGroup(700543099);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == obj) {
                        rememberedValue2 = new CelebrationKt$$ExternalSyntheticLambda1(12);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue2);
                    gapComposer.end(z);
                    modifier3 = semantics;
                }
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(modifier3, 16.0f, 4.0f);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, z);
                boolean z3 = z2;
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode2);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                BiasAlignment.Horizontal horizontal2 = horizontal;
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                Worker.DefaultImpls.appendMarkdown$default(builder, summaryRow.leftPrimaryMarkdownText, null, 6);
                if (z3) {
                    KeyMappingKt.appendInlineContent(builder, "info_icon", "�");
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                TextStyle textStyle = Strings.getTypography(gapComposer).bodyMedium;
                long j = Strings.getColors(gapComposer).semantic.text.standard;
                MapBuilder mapBuilder = new MapBuilder();
                if (z3) {
                    mapBuilder.put("info_icon", inlineInfoIcon(8));
                }
                Modifier.Companion companion4 = companion;
                int i6 = i5;
                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2032, j, (Composer) gapComposer, (Modifier) layoutWeightElement, annotatedString, textStyle, (TextLineBalancing) null, (Map) mapBuilder.build(), (Function1) null, false);
                String str = summaryRow.rightSecondaryMarkdownText;
                if (str == null) {
                    gapComposer.startReplaceGroup(-71033225);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-71033224);
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                    Worker.DefaultImpls.appendMarkdown$default(builder2, str, null, 6);
                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, builder2.toAnnotatedString(), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                String str2 = summaryRow.subtitle;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(1396163316);
                    gapComposer.end(false);
                    companion2 = companion4;
                } else {
                    gapComposer.startReplaceGroup(1396163317);
                    companion2 = companion4;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.disabled, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                function12 = function1;
                companion3 = companion2;
                z = 0;
                horizontal = horizontal2;
                i5 = i6;
                i4 = 32;
                i2 = 4;
            }
            Modifier.Companion companion5 = companion3;
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, z, companion5, 32.0f, gapComposer);
            gapComposer.end(true);
            modifier2 = companion5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(summarySection, function1, modifier2, i, 21);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
    
        if (r11 == r10) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimelineSection(SelectPaymentPlanViewModel.PaymentsTimelineSection paymentsTimelineSection, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Function0 function0;
        int i2;
        Unit unit;
        Icons icons;
        String str;
        String str2;
        boolean z;
        TimelineItem.State state;
        ComposableLambdaImpl composableLambdaImpl;
        NeverEqualPolicy neverEqualPolicy;
        Function0 function02;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-246450680);
        int i3 = (i & 48) == 0 ? (gapComposer2.changedInstance(paymentsTimelineSection) ? 32 : 16) | i : i;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i3;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            String str3 = paymentsTimelineSection.title;
            String str4 = paymentsTimelineSection.optionsConfigButtonTitle;
            SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet optionsConfigSheet = paymentsTimelineSection.optionsConfigSheet;
            int i5 = 2;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (optionsConfigSheet == null) {
                gapComposer2.startReplaceGroup(-1912842521);
                gapComposer2.end(false);
                function0 = null;
            } else {
                gapComposer2.startReplaceGroup(-1912842520);
                boolean changedInstance = ((i4 & 896) == 256) | gapComposer2.changedInstance(optionsConfigSheet);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(i5, function1, optionsConfigSheet);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer2.end(false);
            }
            int i6 = 2;
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
            ViewfinderDefaults.SectionHeader(str3, (Modifier) null, str4, function0, (String) null, gapComposer2, 0, 18);
            gapComposer = gapComposer2;
            TimelineState rememberTimelineState = LazyGridDslKt.rememberTimelineState(null, gapComposer, 1);
            gapComposer.startReplaceGroup(-615888006);
            ArrayList<SelectPaymentPlanViewModel.TimelineEvent> arrayList = paymentsTimelineSection.timelineEvents;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (SelectPaymentPlanViewModel.TimelineEvent timelineEvent : arrayList) {
                boolean z2 = timelineEvent.infoSheet != null;
                int i7 = WhenMappings.$EnumSwitchMapping$0[timelineEvent.state.ordinal()];
                int i8 = 3;
                if (i7 == 1) {
                    state = TimelineItem.State.NotStarted;
                } else if (i7 == i6) {
                    state = TimelineItem.State.Pending;
                } else {
                    if (i7 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    state = TimelineItem.State.Done;
                }
                TimelineItem.State state2 = state;
                String str5 = timelineEvent.body;
                if (str5 == null) {
                    gapComposer.startReplaceGroup(-731954266);
                    gapComposer.end(false);
                    composableLambdaImpl = null;
                } else {
                    gapComposer.startReplaceGroup(-731954265);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-830285271, new SelectPaymentPlanViewKt$$ExternalSyntheticLambda20(str5, z2), gapComposer);
                    gapComposer.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                }
                SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet = timelineEvent.infoSheet;
                if (infoHalfSheet == null) {
                    gapComposer.startReplaceGroup(-731363685);
                    gapComposer.end(false);
                    neverEqualPolicy = neverEqualPolicy3;
                    function02 = null;
                } else {
                    gapComposer.startReplaceGroup(-731363684);
                    boolean changedInstance2 = ((i4 & 896) == 256) | gapComposer.changedInstance(infoHalfSheet);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance2) {
                        neverEqualPolicy = neverEqualPolicy3;
                    } else {
                        neverEqualPolicy = neverEqualPolicy3;
                    }
                    rememberedValue2 = new ShareSheetViewKt$$ExternalSyntheticLambda5(i8, function1, infoHalfSheet);
                    gapComposer.updateRememberedValue(rememberedValue2);
                    gapComposer.end(false);
                    function02 = (Function0) rememberedValue2;
                }
                arrayList2.add(new TimelineItem(state2, Expect_jvmKt.rememberComposableLambda(-535751349, new ButtonGroupKt$$ExternalSyntheticLambda11(timelineEvent, 13), gapComposer), Expect_jvmKt.rememberComposableLambda(-822030623, new PdfPreviewViewKt$$ExternalSyntheticLambda2(timelineEvent, 28), gapComposer), composableLambdaImpl, (ComposableLambdaImpl) null, function02, 80));
                neverEqualPolicy3 = neverEqualPolicy;
                i6 = 2;
            }
            gapComposer.end(false);
            LazyListLayoutInfoKt.Timeline(rememberTimelineState, Tags.toImmutableList(arrayList2), null, gapComposer, 0, 4);
            ListUnordered listUnordered = paymentsTimelineSection.footerList;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (listUnordered == null) {
                gapComposer.startReplaceGroup(-1911551340);
                gapComposer.end(false);
                unit = null;
                i2 = 2;
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer, -1911551339, companion, 16.0f, gapComposer);
                List<ListUnordered.ListItem> list = listUnordered.items;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (ListUnordered.ListItem listItem : list) {
                    Icon icon = listItem.icon;
                    if (icon == null || (str2 = icon.arcade_id) == null) {
                        icons = null;
                    } else {
                        Icons.Companion.getClass();
                        icons = zzd.get(str2);
                    }
                    LocalizedString localizedString = listItem.label;
                    if (localizedString == null || (str = localizedString.translated_value) == null) {
                        str = "";
                    }
                    LocalizedString localizedString2 = listItem.value;
                    String str6 = localizedString2 != null ? localizedString2.translated_value : null;
                    LocalizedString localizedString3 = listItem.body;
                    arrayList3.add(new ListUnorderedItem(icons, str, str6, localizedString3 != null ? localizedString3.translated_value : null));
                }
                ImmutableList immutableList = Tags.toImmutableList(arrayList3);
                ListUnordered.Variant variant = listUnordered.variant;
                i2 = 2;
                ListUnorderedKt.ListUnordered(immutableList, (Modifier) null, (ListUnorderedState) null, (variant == null ? -1 : WhenMappings.$EnumSwitchMapping$1[variant.ordinal()]) == 1 ? ListUnorderedProminence.Subtle : ListUnorderedProminence.Standard, ListUnorderedSize.Compact, RecyclerView.DECELERATION_RATE, gapComposer, 24576, 38);
                gapComposer = gapComposer;
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(-1910787716);
                String str7 = paymentsTimelineSection.description;
                if (str7 == null) {
                    gapComposer.startReplaceGroup(-1910787717);
                    gapComposer.end(false);
                    z = false;
                } else {
                    re$$ExternalSyntheticOutline0.m(gapComposer, -1910787716, companion, 8.0f, gapComposer);
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, i2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(textStyle.paragraphStyle.lineHeight) * 3.0f) + 16.0f, RecyclerView.DECELERATION_RATE, 11);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    GapComposer gapComposer3 = gapComposer;
                    z = false;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer3, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer3;
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-615852008);
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(paymentsTimelineSection, function1, i, 1);
        }
    }

    public static final InlineTextContent inlineInfoIcon(int i) {
        return new InlineTextContent(new Placeholder(7, Room.getSp(i + 16), Room.getSp(16)), new ComposableLambdaImpl(new TabToolbarsKt$$ExternalSyntheticLambda21(i, 12), true, 1142510159));
    }
}
