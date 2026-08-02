package com.squareup.cash.moneybot.views.plugins;

import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewModel;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class PromptButtonListKt {
    static {
        CollectionsKt__CollectionsKt.listOf((Object[]) new PromptButtonListViewModel.Button[]{promptButton("REVIEW_PURCHASES", "Review purchases"), promptButton("PAY_CREDIT_CARD", "Pay my credit card bill"), promptButton("CHECK_SPENDING", "Check my spending this week")}).getClass();
        CollectionsKt__CollectionsJVMKt.listOf(promptButton("REVIEW", "Review purchases")).getClass();
        CollectionsKt__CollectionsJVMKt.listOf(promptButton("LONG", "Show me a detailed breakdown of everything I spent money on this past week")).getClass();
    }

    public static final void PromptButtonList(PromptButtonListViewModel promptButtonListViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(634433965);
        int i2 = (gapComposer.changedInstance(promptButtonListViewModel) ? 4 : 2) | i | 48;
        int i3 = 256;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            int i4 = 3;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Continuation continuation = null;
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
            gapComposer.startReplaceGroup(1728934426);
            for (PromptButtonListViewModel.Button button : promptButtonListViewModel.buttons) {
                PromptButtonListViewEvent promptButtonListViewEvent = button.renderedEvent;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (promptButtonListViewEvent == null) {
                    gapComposer.startReplaceGroup(-1186443620);
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(-1186443619);
                    boolean changedInstance = ((i2 & 896) == i3 ? true : z) | gapComposer.changedInstance(promptButtonListViewEvent);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new GenieViewKt$GenieView$1$1(function1, promptButtonListViewEvent, continuation, 23);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, promptButtonListViewEvent, (Function2) rememberedValue);
                    gapComposer.end(z);
                }
                boolean changedInstance2 = ((i2 & 896) == i3 ? true : z) | gapComposer.changedInstance(button);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(15, function1, button);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SizeKt.ButtonCta((Function0) rememberedValue2, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(314657803, new P2PListViewKt$$ExternalSyntheticLambda12(button, i4), gapComposer), gapComposer, 1572864, 62);
                z = z;
                continuation = continuation;
                i4 = i4;
                companion = companion;
                i3 = 256;
            }
            gapComposer.end(z);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) promptButtonListViewModel, (Object) modifier2, (Object) function1, false, i, 17);
        }
    }

    public static final PromptButtonListViewModel.Button promptButton(String str, String str2) {
        return new PromptButtonListViewModel.Button(str, str2, new PromptButtonListViewEvent.PromptTapped(str, str2, EmptyList.INSTANCE), null);
    }
}
