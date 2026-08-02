package com.squareup.cash.bitcoin.views.send;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.bitcoin.viewmodels.MoveBitcoinModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes5.dex */
public final /* synthetic */ class MoveBitcoinViewKt$$ExternalSyntheticLambda4 implements Function4 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MoveBitcoinViewKt$$ExternalSyntheticLambda4(MoveBitcoinModel moveBitcoinModel, boolean z, Function1 function1) {
        this.f$0 = moveBitcoinModel;
        this.f$1 = z;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                MoveBitcoinModel moveBitcoinModel = (MoveBitcoinModel) obj6;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((MoveBitcoinModel) obj2).getClass();
                moveBitcoinModel.getClass();
                MoveBitcoinViewKt.MoveBitcoinContent((MoveBitcoinModel.Content) moveBitcoinModel, this.f$1, (Function1) obj5, (Composer) obj3, 0);
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) obj6;
                PaddingValues paddingValues = (PaddingValues) obj5;
                QrCodeModel qrCodeModel = (QrCodeModel) obj2;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                qrCodeModel.getClass();
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                GapComposer gapComposer = (GapComposer) composer;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer, fillMaxSize);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer2 = (GapComposer) composer;
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
                Updater.m576setimpl(composer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                BitcoinDepositsViewKt.QrCodeOrError(qrCodeModel.qrImage, this.f$1, function0, paddingValues, SizeKt.fillMaxSize(companion, 1.0f), composer, 24576);
                gapComposer2.end(true);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoveBitcoinViewKt$$ExternalSyntheticLambda4(boolean z, Function0 function0, PaddingValues paddingValues) {
        this.f$1 = z;
        this.f$0 = function0;
        this.f$2 = paddingValues;
    }
}
