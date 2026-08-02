package com.squareup.cash.moneybot.views.card;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.button.ArcadeButtonProminences;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.components.api.LocalMoneybotPluginRegistryKt;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CardUiKt {
    public static final ComposableLambdaImpl lambda$299166004 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(12), false, 299166004);

    public static final void ActivityListCard(ChatCardViewModel.ActivityList activityList, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1179729476);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(activityList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 24.0f, 1);
            MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
            if (moneybotColors == null) {
                gapComposer.startReplaceGroup(-973090538);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                moneybotColors = MoneybotColorsKt.fromArcade(colors);
            } else {
                gapComposer.startReplaceGroup(-973091964);
            }
            gapComposer.end(false);
            m3624CardContainerhTdSg4(fillMaxWidth, m295PaddingValuesYgX7TsA$default, RecyclerView.DECELERATION_RATE, moneybotColors.card.background, null, Expect_jvmKt.rememberComposableLambda(1610133996, new MoneyTabUIKt$$ExternalSyntheticLambda11(1, (Object) activityList, (Object) function1), gapComposer), gapComposer, 1572912, 52);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) activityList, (Object) modifier, (Object) function1, false, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0054  */
    /* renamed from: CardContainer-hT-dSg4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3624CardContainerhTdSg4(final Modifier modifier, final PaddingValuesImpl paddingValuesImpl, float f, long j, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        float f2;
        long j2;
        int i3;
        int i4;
        Function0 function02;
        int i5;
        ComposableLambdaImpl composableLambdaImpl2;
        long j3;
        final Function0 function03;
        final float f3;
        RecomposeScopeImpl endRestartGroup;
        float f4;
        Modifier m183clickableoSLSa3U$default;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1189325506);
        int i6 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i6 |= gapComposer.changed(paddingValuesImpl) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i6 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            f2 = f;
            i6 |= gapComposer.changed(f2) ? 256 : 128;
            if ((i2 & 8) != 0) {
                j2 = j;
                if (gapComposer.changed(j2)) {
                    i3 = 2048;
                    int i8 = i6 | i3;
                    int i9 = i8 | 24576;
                    i4 = i2 & 32;
                    if (i4 != 0) {
                        i5 = i8 | 221184;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        i5 = i9 | (gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536);
                    }
                    if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
                        gapComposer.startDefaults();
                        if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                            f4 = i7 != 0 ? 40.0f : f2;
                            if ((i2 & 8) != 0) {
                                MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
                                if (moneybotColors == null) {
                                    gapComposer.startReplaceGroup(-973090538);
                                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                    } else {
                                        gapComposer.startReplaceGroup(-1762997739);
                                        gapComposer.end(false);
                                    }
                                    moneybotColors = MoneybotColorsKt.fromArcade(colors);
                                } else {
                                    gapComposer.startReplaceGroup(-973091964);
                                }
                                gapComposer.end(false);
                                j2 = moneybotColors.card.background;
                            }
                            if (i4 != 0) {
                                function02 = null;
                            }
                        } else {
                            gapComposer.skipToGroupEnd();
                            f4 = f2;
                        }
                        gapComposer.endDefaults();
                        RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f4);
                        Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(modifier, j2, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (function02 == null) {
                            gapComposer.startReplaceGroup(-2010302464);
                            gapComposer.end(false);
                            m183clickableoSLSa3U$default = null;
                        } else {
                            gapComposer.startReplaceGroup(-2010302463);
                            boolean changed = gapComposer.changed(function02);
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda10(27, function02);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15);
                            gapComposer.end(false);
                        }
                        if (m183clickableoSLSa3U$default == null) {
                            m183clickableoSLSa3U$default = companion;
                        }
                        Modifier then = clip.then(m183clickableoSLSa3U$default).then(SpacerKt.padding(companion, paddingValuesImpl));
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                        composableLambdaImpl2 = composableLambdaImpl;
                        Recorder$$ExternalSyntheticOutline1.m(54, composableLambdaImpl2, ColumnScopeInstance.INSTANCE, gapComposer, true);
                        j3 = j2;
                        function03 = function02;
                        f3 = f4;
                    } else {
                        composableLambdaImpl2 = composableLambdaImpl;
                        gapComposer.skipToGroupEnd();
                        j3 = j2;
                        function03 = function02;
                        f3 = f2;
                    }
                    final long j4 = j3;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.moneybot.views.card.CardUiKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                CardUiKt.m3624CardContainerhTdSg4(Modifier.this, paddingValuesImpl, f3, j4, function03, composableLambdaImpl3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
            } else {
                j2 = j;
            }
            i3 = 1024;
            int i82 = i6 | i3;
            int i92 = i82 | 24576;
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
            }
            final long j42 = j3;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        if ((i2 & 8) != 0) {
        }
        i3 = 1024;
        int i822 = i6 | i3;
        int i922 = i822 | 24576;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
        }
        final long j422 = j3;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void CardUi(ChatCardViewModel chatCardViewModel, Modifier modifier, Function1 function1, InsightBarChartSelectionState insightBarChartSelectionState, Composer composer, int i) {
        int i2;
        InsightBarChartSelectionState insightBarChartSelectionState2;
        Modifier modifier2;
        Modifier modifier3;
        ClientRenderablePlugin clientRenderablePlugin;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1390879339);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(chatCardViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            insightBarChartSelectionState2 = insightBarChartSelectionState;
            i3 |= gapComposer.changed(insightBarChartSelectionState2) ? 2048 : 1024;
        } else {
            insightBarChartSelectionState2 = insightBarChartSelectionState;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            int i4 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i4 == 0 || gapComposer.getDefaultsInvalid()) {
                modifier3 = companion;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            if (chatCardViewModel instanceof ChatCardViewModel.ActivityList) {
                gapComposer.startReplaceGroup(-900206820);
                ActivityListCard((ChatCardViewModel.ActivityList) chatCardViewModel, modifier3, function1, gapComposer, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer.end(false);
            } else if (chatCardViewModel instanceof ChatCardViewModel.ClientRenderableCard) {
                gapComposer.startReplaceGroup(-2136474094);
                ClientRenderablePluginRegistry clientRenderablePluginRegistry = (ClientRenderablePluginRegistry) gapComposer.consume(LocalMoneybotPluginRegistryKt.LocalMoneybotPluginRegistry);
                if (clientRenderablePluginRegistry != null) {
                    ClientRenderType clientRenderType = ((ChatCardViewModel.ClientRenderableCard) chatCardViewModel).renderType;
                    clientRenderType.getClass();
                    clientRenderablePlugin = (ClientRenderablePlugin) clientRenderablePluginRegistry.plugins.get(clientRenderType);
                } else {
                    clientRenderablePlugin = null;
                }
                if (clientRenderablePlugin != null) {
                    gapComposer.startReplaceGroup(-2136333726);
                    gapComposer.startReplaceGroup(-900195781);
                    Modifier containerModifier = clientRenderablePlugin.containerModifier(modifier3);
                    ChatCardViewModel.ClientRenderableCard clientRenderableCard = (ChatCardViewModel.ClientRenderableCard) chatCardViewModel;
                    ChatCardViewEvent chatCardViewEvent = clientRenderableCard.action;
                    if (chatCardViewEvent != null) {
                        boolean changedInstance = ((i3 & 896) == 256) | gapComposer.changedInstance(chatCardViewEvent);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(3, function1, chatCardViewEvent);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        containerModifier = containerModifier.then(ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15));
                    }
                    gapComposer.end(false);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, containerModifier);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    z = false;
                    clientRenderablePlugin.RenderContent(clientRenderableCard.callbackModel, gapComposer, 0);
                    gapComposer.end(true);
                    gapComposer.end(false);
                } else {
                    z = false;
                    gapComposer.startReplaceGroup(-2136069699);
                    ErrorCard((i3 >> 3) & 14, 0, gapComposer, modifier3);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            } else if (chatCardViewModel instanceof ChatCardViewModel.ErrorCard) {
                gapComposer.startReplaceGroup(-900186477);
                ErrorCard((i3 >> 3) & 14, 0, gapComposer, modifier3);
                gapComposer.end(false);
            } else {
                if (!(chatCardViewModel instanceof ChatCardViewModel.InsightCard)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -900207607, false);
                }
                gapComposer.startReplaceGroup(-900183834);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                InsightChartKt.InsightChart((ChatCardViewModel.InsightCard) chatCardViewModel, modifier3, false, insightBarChartSelectionState2, gapComposer, (i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 << 3) & 57344));
                gapComposer.end(true);
                gapComposer.end(false);
            }
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2((Object) chatCardViewModel, function1, modifier2, (Object) insightBarChartSelectionState, i, 23);
        }
    }

    public static final void ErrorCard(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-97318652);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(modifier, 320.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            m3624CardContainerhTdSg4(m290width3ABfNKs, paddingValuesImpl, 24.0f, 0L, null, lambda$299166004, gapComposer, 1572864, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier2, i, i2, 11, (byte) 0);
        }
    }

    public static final ButtonProminence toButtonProminence(ButtonProminence.Id id) {
        id.getClass();
        ButtonProminence.Id id2 = ArcadeButtonProminences.standard;
        return (Intrinsics.areEqual(id, ArcadeButtonProminences.destructiveProminent) || Intrinsics.areEqual(id, ArcadeButtonProminences.prominent)) ? com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT : (Intrinsics.areEqual(id, ArcadeButtonProminences.destructiveSubtle) || Intrinsics.areEqual(id, ArcadeButtonProminences.subtle)) ? com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE : (Intrinsics.areEqual(id, ArcadeButtonProminences.destructiveStandard) || Intrinsics.areEqual(id, ArcadeButtonProminences.standard)) ? com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD : com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
    }
}
