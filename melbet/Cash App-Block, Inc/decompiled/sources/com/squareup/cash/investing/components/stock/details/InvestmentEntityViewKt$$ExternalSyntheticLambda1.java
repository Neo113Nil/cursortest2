package com.squareup.cash.investing.components.stock.details;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.oneformapp.DLog;

/* loaded from: classes9.dex */
public final /* synthetic */ class InvestmentEntityViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealImageLoader f$0;
    public final /* synthetic */ InvestmentEntityContentModel f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ InvestingScreens f$3;

    public /* synthetic */ InvestmentEntityViewKt$$ExternalSyntheticLambda1(InvestmentEntityContentModel investmentEntityContentModel, RealImageLoader realImageLoader, Function1 function1, InvestingScreens investingScreens) {
        this.$r8$classId = 2;
        this.f$1 = investmentEntityContentModel;
        this.f$0 = realImageLoader;
        this.f$2 = function1;
        this.f$3 = investingScreens;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InvestingScreens investingScreens = this.f$3;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1485977900, new InvestmentEntityViewKt$$ExternalSyntheticLambda1(this.f$0, this.f$1, this.f$2, this.f$3, 1), gapComposer), gapComposer, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalImageLoaderKt.LocalImageLoader;
                    RealImageLoader realImageLoader = this.f$0;
                    Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-785695636, new InvestmentEntityViewKt$$ExternalSyntheticLambda1(this.f$1, realImageLoader, this.f$2, investingScreens), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                    InvestmentEntityContentModel investmentEntityContentModel = this.f$1;
                    if (investmentEntityContentModel == null) {
                        gapComposer3.startReplaceGroup(913114556);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(913114557);
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        long j = colors.semantic.background.f1047app;
                        Function1 function1 = this.f$2;
                        RealImageLoader realImageLoader2 = this.f$0;
                        DLog.m4316InvestmentEntityCollapsingHeaderuDo3WH8(investmentEntityContentModel, realImageLoader2, j, function1, Expect_jvmKt.rememberComposableLambda(-1579332780, new InvestmentEntityViewKt$$ExternalSyntheticLambda1(investmentEntityContentModel, function1, realImageLoader2, investingScreens), gapComposer3), gapComposer3, 196614);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors2.semantic.background.f1047app, ColorKt.RectangleShape)), ImageKt.rememberScrollState(gapComposer4), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, verticalScroll$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer4.startReplaceGroup(519335638);
                    InvestmentEntityContentModel investmentEntityContentModel2 = this.f$1;
                    Iterator it = investmentEntityContentModel2.componentSort.iterator();
                    while (it.hasNext()) {
                        DLog.EntityComponent(investmentEntityContentModel2, this.f$2, (InvestmentEntityContentModel.Component) it.next(), this.f$0, this.f$3, gapComposer4, 0);
                    }
                    gapComposer4.end(false);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ InvestmentEntityViewKt$$ExternalSyntheticLambda1(RealImageLoader realImageLoader, InvestmentEntityContentModel investmentEntityContentModel, Function1 function1, InvestingScreens investingScreens, int i) {
        this.$r8$classId = i;
        this.f$0 = realImageLoader;
        this.f$1 = investmentEntityContentModel;
        this.f$2 = function1;
        this.f$3 = investingScreens;
    }

    public /* synthetic */ InvestmentEntityViewKt$$ExternalSyntheticLambda1(InvestmentEntityContentModel investmentEntityContentModel, Function1 function1, RealImageLoader realImageLoader, InvestingScreens investingScreens) {
        this.$r8$classId = 3;
        this.f$1 = investmentEntityContentModel;
        this.f$2 = function1;
        this.f$0 = realImageLoader;
        this.f$3 = investingScreens;
    }
}
