package com.squareup.cash.crypto.common.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.crypto.common.viewmodels.CryptoInsufficientFundsViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class CryptoCommonInsufficientFundsView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CryptoCommonInsufficientFundsView f$0;
    public final /* synthetic */ CryptoInsufficientFundsViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ CryptoCommonInsufficientFundsView$$ExternalSyntheticLambda0(Function1 function1, CryptoCommonInsufficientFundsView cryptoCommonInsufficientFundsView, CryptoInsufficientFundsViewModel cryptoInsufficientFundsViewModel) {
        this.$r8$classId = 1;
        this.f$2 = function1;
        this.f$0 = cryptoCommonInsufficientFundsView;
        this.f$1 = cryptoInsufficientFundsViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        CryptoInsufficientFundsViewModel cryptoInsufficientFundsViewModel = this.f$1;
        CryptoCommonInsufficientFundsView cryptoCommonInsufficientFundsView = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = CryptoCommonInsufficientFundsView.$r8$clinit;
                cryptoCommonInsufficientFundsView.Content(cryptoInsufficientFundsViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = CryptoCommonInsufficientFundsView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    long j = MooncakeTheme.getColors(gapComposer).background;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
                    NavigationIconType navigationIconType = NavigationIconType.CLOSE;
                    Function1 function12 = this.f$2;
                    boolean changed = gapComposer.changed(function12);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(25, function12);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    KeypadKt.m3654ToolbarA_Dysh8(null, null, navigationIconType, 0L, (Function0) rememberedValue, null, gapComposer, 24582, 366);
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14), 32.0f, 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                    CryptoInsufficientFundsViewModel cryptoInsufficientFundsViewModel2 = this.f$1;
                    cryptoInsufficientFundsViewModel2.getClass();
                    ImageKt.Image(Countries.painterResource(R.drawable.crypto_common_stablecoin_logo, 0, gapComposer), null, m302paddingqDBjuR0$default, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).header3, (TextLineBalancing) null, cryptoInsufficientFundsViewModel2.body, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    this.f$0.Buttons(cryptoInsufficientFundsViewModel2, function12, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f), gapComposer, 4096);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int i4 = CryptoCommonInsufficientFundsView.$r8$clinit;
                cryptoCommonInsufficientFundsView.Content(cryptoInsufficientFundsViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CryptoCommonInsufficientFundsView$$ExternalSyntheticLambda0(CryptoCommonInsufficientFundsView cryptoCommonInsufficientFundsView, CryptoInsufficientFundsViewModel cryptoInsufficientFundsViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = cryptoCommonInsufficientFundsView;
        this.f$1 = cryptoInsufficientFundsViewModel;
        this.f$2 = function1;
    }
}
