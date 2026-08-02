package com.squareup.cash.score.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.core.content.ContextCompat$Api28Impl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.views.CardArtImageKt;
import com.squareup.cash.instruments.views.CardInfoLabelPosition;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.viewmodels.chat.SlashCommandViewModel;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewModel;
import com.squareup.cash.transfers.views.LinkedAccountsViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.viewmodels.CardHomeAction;
import com.squareup.cash.wallet.views.WalletHomeViewKt;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.util.Strings;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class InfoSectionKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InfoSectionKt$$ExternalSyntheticLambda0(int i, Function1 function1, List list) {
        this.$r8$classId = i;
        this.f$0 = list;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Icons icons;
        ?? r14;
        Function2 function2;
        Function2 function22;
        String str;
        GapComposer gapComposer;
        Composer composer;
        String str2;
        int i;
        int i2 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        List<CashCreditScoreHomeData.InfoSection.Row> list = this.f$0;
        switch (i2) {
            case 0:
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer2).changed(listUnorderedScope) ? 4 : 2;
                }
                int i3 = intValue;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    for (CashCreditScoreHomeData.InfoSection.Row row : list) {
                        Icon icon = row.icon;
                        if (icon == null || (str = icon.arcade_id) == null) {
                            icons = null;
                        } else {
                            Icons.Companion.getClass();
                            icons = zzd.get(str);
                        }
                        if (icons == null) {
                            gapComposer2.startReplaceGroup(-694273930);
                            r14 = 0;
                            gapComposer2.end(false);
                            function2 = null;
                        } else {
                            r14 = 0;
                            gapComposer2.startReplaceGroup(-694273929);
                            Function2 rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(753420142, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 0), gapComposer2);
                            gapComposer2.end(false);
                            function2 = rememberComposableLambda;
                        }
                        LocalizedString localizedString = row.body;
                        String str3 = localizedString != null ? localizedString.translated_value : null;
                        if (str3 == null) {
                            gapComposer2.startReplaceGroup(-694084613);
                            gapComposer2.end(r14);
                            function22 = null;
                        } else {
                            gapComposer2.startReplaceGroup(-694084612);
                            Function2 rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1506726860, new InfoSectionKt$$ExternalSyntheticLambda7(str3, r14), gapComposer2);
                            gapComposer2.end(r14);
                            function22 = rememberComposableLambda2;
                        }
                        gapComposer2.startReplaceGroup(1089929072);
                        CashCreditScoreHomeData.Action action = row.action;
                        Modifier modifier = Modifier.Companion.$$INSTANCE;
                        if (action != null) {
                            boolean changed = gapComposer2.changed(function1) | gapComposer2.changedInstance(action);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (changed || rememberedValue == obj4) {
                                rememberedValue = new CalloutKt$$ExternalSyntheticLambda2(function1, action, 1);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            modifier = ImageKt.m183clickableoSLSa3U$default(modifier, false, null, null, (Function0) rememberedValue, 15);
                        }
                        Modifier modifier2 = modifier;
                        gapComposer2.end(false);
                        listUnorderedScope.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(932654029, new SheetKt$$ExternalSyntheticLambda6(row, 8), gapComposer2), modifier2, function2, (Function2) null, function22, gapComposer2, ((i3 << 15) & 458752) | 6, 8);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer3 = (Composer) obj2;
                ((Integer) obj3).getClass();
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                GapComposer gapComposer3 = (GapComposer) composer3;
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                Object obj5 = DefaultSizes.border.entries;
                Modifier clip = ClipKt.clip(fillMaxWidth, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                int i4 = 14;
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.m279heightInVpY3zN4$default(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, 320.0f, 1), ImageKt.rememberScrollState(composer3), false, 14);
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                float f = 8.0f;
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(verticalScroll$default, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer3, 0);
                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer3, m300paddingVpY3zN4$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer4 = (GapComposer) composer3;
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
                Updater.m576setimpl(composer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer4.startReplaceGroup(179392979);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SlashCommandViewModel slashCommandViewModel = (SlashCommandViewModel) it.next();
                    String str4 = slashCommandViewModel.command;
                    String str5 = slashCommandViewModel.description;
                    String stringResource = Room.stringResource(R.string.moneybot_slash_command_menu_item_content_description, new Object[]{"/".concat(str4), str5}, composer3);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed2 = gapComposer4.changed(function1) | gapComposer4.changedInstance(slashCommandViewModel);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(8, function1, slashCommandViewModel);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxWidth2, false, null, null, (Function0) rememberedValue2, 15);
                    boolean changed3 = gapComposer4.changed(stringResource);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == obj4) {
                        rememberedValue3 = new ClusterItemKt$$ExternalSyntheticLambda3(stringResource, i4);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(m183clickableoSLSa3U$default, false, (Function1) rememberedValue3);
                    Strings.getSizes(composer3).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(composer3).getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(semantics, 16.0f, f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, composer3, 48);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(composer3, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(composer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(composer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(composer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(composer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Iterator it2 = it;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(composer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$13;
                    Icons icons2 = slashCommandViewModel.icon;
                    if (icons2 == null) {
                        gapComposer4.startReplaceGroup(1337239517);
                        gapComposer4.end(false);
                        str2 = str5;
                        i = 0;
                        composer = composer3;
                        gapComposer = gapComposer4;
                    } else {
                        gapComposer4.startReplaceGroup(1337239518);
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                        Composer composer4 = composer3;
                        long j = Strings.getColors(composer3).semantic.icon.standard;
                        composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$15;
                        gapComposer = gapComposer4;
                        Trace.m1191Iconww6aTOc(icons2, (String) null, m285size3ABfNKs, j, composer4, 432, 0);
                        composer = composer4;
                        Strings.getSizes(composer).getClass();
                        str2 = str5;
                        SpacerKt.Spacer(composer, SizeKt.m290width3ABfNKs(companion, 8.0f));
                        i = 0;
                        gapComposer.end(false);
                    }
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer, i);
                    BiasAlignment.Horizontal horizontal2 = horizontal;
                    Arrangement$Top$1 arrangement$Top$12 = arrangement$Top$1;
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(composer, companion);
                    gapComposer.startReusableNode();
                    Modifier.Companion companion2 = companion;
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(composer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(composer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Request$Priority$EnumUnboxingLocalUtility.m(hashCode3, composer, composeUiNode$Companion$SetModifier$15, composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(composer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Composer composer5 = composer;
                    TextKt.m561TextNvy7gAk(slashCommandViewModel.name, null, Strings.getColors(composer).semantic.text.prominent, 0L, null, 0L, null, 0L, 0, false, 0, 0, Strings.getTypography(composer).labelMedium, composer5, 0, 0, 131066);
                    TextKt.m561TextNvy7gAk(str2, null, Strings.getColors(composer5).semantic.text.subtle, 0L, null, 0L, null, 0L, 0, false, 0, 0, Strings.getTypography(composer5).bodySmall, composer5, 0, 0, 131066);
                    gapComposer.end(true);
                    gapComposer.end(true);
                    f = 8.0f;
                    gapComposer4 = gapComposer;
                    composer3 = composer5;
                    it = it2;
                    arrangement$Top$1 = arrangement$Top$12;
                    horizontal = horizontal2;
                    companion = companion2;
                    i4 = 14;
                }
                GapComposer gapComposer5 = gapComposer4;
                gapComposer5.end(false);
                gapComposer5.end(true);
                return Unit.INSTANCE;
            case 2:
                Composer composer6 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((List) obj).getClass();
                List<String> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (String str6 : list2) {
                    if (str6 == null) {
                        str6 = "";
                    }
                    arrayList.add(str6);
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                boolean changed4 = gapComposer6.changed(function1);
                Object rememberedValue4 = gapComposer6.rememberedValue();
                if (changed4 || rememberedValue4 == obj4) {
                    rememberedValue4 = new ProfileKt$$ExternalSyntheticLambda3(r6, function1);
                    gapComposer6.updateRememberedValue(rememberedValue4);
                }
                ContextCompat$Api28Impl.ReactionsBottomSheet(0, gapComposer6, null, arrayList, (Function1) rememberedValue4);
                return Unit.INSTANCE;
            case 3:
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer7 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer7).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(-((boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM() * 0.63f) - 65.0f), true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode4 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer7, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    gapComposer7.startReplaceGroup(69769949);
                    for (LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow instrumentRow : CollectionsKt.reversed(list)) {
                        InstrumentIcon instrumentIcon = (InstrumentIcon) CollectionsKt.firstOrNull(instrumentRow.instrumentCellViewModel.icons);
                        if (instrumentIcon == null) {
                            gapComposer7.startReplaceGroup(-1842301766);
                            gapComposer7.end(false);
                        } else {
                            gapComposer7.startReplaceGroup(-1842301765);
                            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                            boolean changedInstance = gapComposer7.changedInstance(instrumentRow);
                            Object rememberedValue5 = gapComposer7.rememberedValue();
                            if (changedInstance || rememberedValue5 == obj4) {
                                rememberedValue5 = new AlertBannerKt$$ExternalSyntheticLambda3(instrumentRow, 2);
                                gapComposer7.updateRememberedValue(rememberedValue5);
                            }
                            Modifier semantics2 = SemanticsModifierKt.semantics(fillMaxWidth3, true, (Function1) rememberedValue5);
                            boolean changed5 = gapComposer7.changed(function1) | gapComposer7.changedInstance(instrumentRow);
                            Object rememberedValue6 = gapComposer7.rememberedValue();
                            if (changed5 || rememberedValue6 == obj4) {
                                rememberedValue6 = new LinkedAccountsViewKt$$ExternalSyntheticLambda4(function1, instrumentRow, 1);
                                gapComposer7.updateRememberedValue(rememberedValue6);
                            }
                            Modifier m183clickableoSLSa3U$default2 = ImageKt.m183clickableoSLSa3U$default(semantics2, false, null, null, (Function0) rememberedValue6, 15);
                            InstrumentCellViewModel instrumentCellViewModel = instrumentRow.instrumentCellViewModel;
                            CardArtImageKt.m3576CardArtImageAFY4PWA(m183clickableoSLSa3U$default2, instrumentIcon, 16.0f, instrumentCellViewModel.primaryLabel, instrumentCellViewModel.secondaryLabel, CardInfoLabelPosition.TOP_RIGHT, true, gapComposer7, 1769856, 0);
                            gapComposer7.end(false);
                        }
                    }
                    gapComposer7.end(false);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer8 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(2.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer8, 54);
                    int hashCode5 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer8, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    gapComposer8.startReplaceGroup(-1037395880);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        CardHomeAction cardHomeAction = (CardHomeAction) it3.next();
                        if (cardHomeAction instanceof CardHomeAction.CopyCardNumber) {
                            gapComposer8.startReplaceGroup(-1900391547);
                            String stringResource2 = Room.stringResource(gapComposer8, R.string.wallet_card_copy_label);
                            CardHomeAction.CopyCardNumber copyCardNumber = (CardHomeAction.CopyCardNumber) cardHomeAction;
                            Icons icons3 = copyCardNumber.icon;
                            boolean z = copyCardNumber.isDisabled;
                            int i5 = copyCardNumber.copyAnimationTrigger;
                            boolean changed6 = gapComposer8.changed(function1);
                            Object rememberedValue7 = gapComposer8.rememberedValue();
                            if (changed6 || rememberedValue7 == obj4) {
                                rememberedValue7 = new PayHomeViewKt$$ExternalSyntheticLambda2(3, function1);
                                gapComposer8.updateRememberedValue(rememberedValue7);
                            }
                            WalletHomeViewKt.CardHomeCopyActionButton(stringResource2, icons3, z, i5, (Function0) rememberedValue7, gapComposer8, 0);
                            gapComposer8.end(false);
                        } else {
                            if (!(cardHomeAction instanceof CardHomeAction.LockDevices)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer8, -2000966960, false);
                            }
                            gapComposer8.startReplaceGroup(-1900007240);
                            String stringResource3 = Room.stringResource(gapComposer8, R.string.wallet_card_lock_label);
                            CardHomeAction.LockDevices lockDevices = (CardHomeAction.LockDevices) cardHomeAction;
                            Icons icons4 = lockDevices.icon;
                            boolean z2 = lockDevices.isDisabled;
                            boolean changedInstance2 = gapComposer8.changedInstance(cardHomeAction) | gapComposer8.changed(function1);
                            Object rememberedValue8 = gapComposer8.rememberedValue();
                            if (changedInstance2 || rememberedValue8 == obj4) {
                                rememberedValue8 = new ListsKt$$ExternalSyntheticLambda0(7, (Object) lockDevices, function1);
                                gapComposer8.updateRememberedValue(rememberedValue8);
                            }
                            WalletHomeViewKt.CardHomeActionButton(stringResource3, icons4, z2, (Function0) rememberedValue8, gapComposer8, 6);
                            gapComposer8.end(false);
                        }
                    }
                    gapComposer8.end(false);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
