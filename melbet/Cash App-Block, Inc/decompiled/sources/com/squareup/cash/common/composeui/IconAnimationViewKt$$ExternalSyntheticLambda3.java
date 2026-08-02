package com.squareup.cash.common.composeui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.DpSize;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class IconAnimationViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ IconAnimationViewKt$$ExternalSyntheticLambda3(long j, Modifier modifier) {
        this.$r8$classId = 1;
        this.f$1 = j;
        this.f$0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier then;
        int i = this.$r8$classId;
        Modifier modifier = this.f$0;
        long j = this.f$1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                VisibleKt.m3484BackgroundCircleRPmYEkk(Updater.updateChangedFlags(1), j, composer, modifier);
                return Unit.INSTANCE;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier modifier2 = this.f$0;
                    if (j != 9205357640488583168L) {
                        gapComposer.startReplaceGroup(-1244013944);
                        then = modifier2.then(new SizeElement((r13 & 1) != 0 ? Float.NaN : DpSize.m1044getWidthD9Ej5fM(j), (r13 & 2) != 0 ? Float.NaN : DpSize.m1043getHeightD9Ej5fM(j), (r13 & 4) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 8) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, false));
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
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
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        AndroidCursorHandle_androidKt.DefaultCursorHandle(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1243644858);
                        AndroidCursorHandle_androidKt.DefaultCursorHandle(0, 0, gapComposer, modifier2);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                CustomOrderGraphKt.m3580DashedLineiJQMabo(Updater.updateChangedFlags(1), j, composer, modifier);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ IconAnimationViewKt$$ExternalSyntheticLambda3(int i, long j, Modifier modifier, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = j;
    }
}
