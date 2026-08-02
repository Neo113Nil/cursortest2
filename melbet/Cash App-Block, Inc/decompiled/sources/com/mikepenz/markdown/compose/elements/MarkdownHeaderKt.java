package com.mikepenz.markdown.compose.elements;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.keystats.InvestingKeyStatsDetailsViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import java.util.Iterator;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import kotlinx.serialization.encoding.AbstractEncoder;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public abstract class MarkdownHeaderKt {
    public static final void InvestingKeyStatsDetails(InvestingKeyStatsDetailsViewModel investingKeyStatsDetailsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        InvestingKeyStatsDetailsViewModel investingKeyStatsDetailsViewModel2;
        GapComposer gapComposer;
        Modifier modifier2;
        investingKeyStatsDetailsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1019178954);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(investingKeyStatsDetailsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (!gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            investingKeyStatsDetailsViewModel2 = investingKeyStatsDetailsViewModel;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (!(investingKeyStatsDetailsViewModel instanceof InvestingKeyStatsDetailsViewModel.Content)) {
                RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(investingKeyStatsDetailsViewModel, function1, i);
                    return;
                }
                return;
            }
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, navigationBarsPadding);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            String str = ((InvestingKeyStatsDetailsViewModel.Content) investingKeyStatsDetailsViewModel).title;
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(26, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer2), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            investingKeyStatsDetailsViewModel2 = investingKeyStatsDetailsViewModel;
            ListUnorderedKt.ListUnordered(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1), (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1112969776, new FormView$$ExternalSyntheticLambda0(investingKeyStatsDetailsViewModel2, 28), gapComposer2), gapComposer2, 196608, 30);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier2, (Object) investingKeyStatsDetailsViewModel2, function1, i, 14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if ((r21 & 8) != 0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarkdownHeader(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, MarkdownElementType markdownElementType, Composer composer, int i, int i2) {
        MarkdownElementType markdownElementType2;
        int i3;
        int i4;
        MarkdownElementType markdownElementType3;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        aSTNodeImpl.getClass();
        textStyle.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(346510580);
        int i5 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(aSTNodeImpl) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128);
        if ((i2 & 8) == 0) {
            markdownElementType2 = markdownElementType;
            if (gapComposer.changed(markdownElementType2)) {
                i3 = 2048;
                i4 = i5 | i3;
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                    gapComposer.skipToGroupEnd();
                    markdownElementType3 = markdownElementType2;
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        if ((i2 & 8) != 0) {
                            markdownElementType2 = MarkdownTokenTypes.ATX_CONTENT;
                            i4 &= -7169;
                        }
                        gapComposer.endDefaults();
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(5);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        MarkdownElementType markdownElementType4 = markdownElementType2;
                        AbstractEncoder.MarkdownText(str, aSTNodeImpl, textStyle, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue), markdownElementType4, null, gapComposer, (i4 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i4 << 3) & 57344));
                        markdownElementType3 = markdownElementType4;
                    } else {
                        gapComposer.skipToGroupEnd();
                    }
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(str, aSTNodeImpl, textStyle, markdownElementType3, i, i2, 14);
                    return;
                }
                return;
            }
        } else {
            markdownElementType2 = markdownElementType;
        }
        i3 = 1024;
        i4 = i5 | i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void handleUncaughtCoroutineException(CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        Iterator it = CoroutineExceptionHandlerImplKt.platformExceptionHandlers.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(coroutineContext, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    ExceptionsKt__ExceptionsKt.addSuppressed(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                try {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
                } catch (Throwable unused2) {
                }
            }
        }
        try {
            ExceptionsKt__ExceptionsKt.addSuppressed(th, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused3) {
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
        } catch (Throwable unused4) {
        }
    }
}
