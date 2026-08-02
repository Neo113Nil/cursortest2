package com.squareup.cash.securityhub.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.securityhub.viewmodels.EducationCardId;
import com.squareup.cash.securityhub.viewmodels.EducationCardUiModel;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSectionUiModel;
import com.squareup.cash.securityhub.viewmodels.SecurityHubUiModel;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class SecurityHubViewKt {
    public static final ProtectionsSectionUiModel PREVIEW_PROTECTIONS;

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EducationCardUiModel[]{new EducationCardUiModel(EducationCardId.BUILT_IN_PROTECTIONS, "Built-in protections", "fake:///trust-hub-placeholder.png"), new EducationCardUiModel(EducationCardId.COMMON_SCAMS, "Common scams", "fake:///trust-hub-placeholder.png"), new EducationCardUiModel(EducationCardId.SPOT_SCAMS, "How to spot scams", "fake:///trust-hub-placeholder.png"), new EducationCardUiModel(EducationCardId.PREVENT_FRAUD, "Prevent fraud", "fake:///trust-hub-placeholder.png"), new EducationCardUiModel(EducationCardId.SECURITY_FEATURES, "Security features", "fake:///trust-hub-placeholder.png")});
        if ((6 & 1) != 0) {
            listOf = EmptyList.INSTANCE;
        }
        PREVIEW_PROTECTIONS = new ProtectionsSectionUiModel("", listOf, EmptyList.INSTANCE);
    }

    public static final void SecurityHubView(SecurityHubUiModel securityHubUiModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        securityHubUiModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1009329403);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(securityHubUiModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(8, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
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
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer2, R.string.security_hub_title);
            NavigationType navigationType = NavigationType.BACK;
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda0(9, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
            boolean changedInstance = gapComposer2.changedInstance(securityHubUiModel) | (i4 == 32);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BottomSheet$$ExternalSyntheticLambda3(4, securityHubUiModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            LazyDslKt.LazyColumn(navigationBarsPadding, null, null, null, null, null, false, null, (Function1) rememberedValue3, gapComposer2, 0, 510);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(securityHubUiModel, function1, modifier2, i, 27);
        }
    }
}
