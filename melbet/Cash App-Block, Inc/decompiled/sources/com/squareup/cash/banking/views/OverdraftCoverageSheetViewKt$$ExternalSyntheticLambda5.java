package com.squareup.cash.banking.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class OverdraftCoverageSheetViewKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ OverdraftCoverageSheetViewKt$$ExternalSyntheticLambda5(String str, String str2, Function1 function1) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 10;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        String str = this.f$1;
        Function1 function1 = this.f$2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    int i3 = 9;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    String str2 = this.f$0;
                    if (str2 == null) {
                        gapComposer.startReplaceGroup(-1011551649);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1011551648);
                        ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed = gapComposer.changed(function1);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new TransfersView$$ExternalSyntheticLambda0(8, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(2076880325, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str2, i3), gapComposer), gapComposer, 1573296, 56);
                        gapComposer.end(false);
                    }
                    if (str == null) {
                        gapComposer.startReplaceGroup(-1011340167);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1011340166);
                        ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed2 = gapComposer.changed(function1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new TransfersView$$ExternalSyntheticLambda0(9, function1);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(791825198, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, i2), gapComposer), gapComposer, 1573296, 56);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion2, 1.0f), 24.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(m298padding3ABfNKs, colors.semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), 16.0f, 22.0f, 16.0f, 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
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
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 19.0f, 7), ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                    ButtonProminence buttonProminence3 = ButtonProminence.STANDARD;
                    boolean changed3 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SafetyHubViewKt$$ExternalSyntheticLambda9(14, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue3, null, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(-287406562, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str, i2), gapComposer2), gapComposer2, 1573248, 58);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OverdraftCoverageSheetViewKt$$ExternalSyntheticLambda5(String str, Function1 function1, String str2) {
        this.f$0 = str;
        this.f$2 = function1;
        this.f$1 = str2;
    }
}
