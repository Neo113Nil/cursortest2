package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.SavableLaunchedEffectKt$$ExternalSyntheticLambda1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.stripe.android.uicore.utils.StateFlowsComposeKt$produceState$1$1;
import java.util.Arrays;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public abstract class zztc {
    public static final void LaunchedEffectSaveable(Object[] objArr, Function2 function2, Composer composer, int i) {
        function2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-3799271);
        int i2 = (gapComposer.changedInstance(function2) ? 32 : 16) | i;
        gapComposer.startMovableGroup(643868746, Integer.valueOf(objArr.length));
        int i3 = i2 | (gapComposer.changed(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= gapComposer.changedInstance(obj) ? 4 : 0;
        }
        gapComposer.end(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(copyOf, (Function0) rememberedValue, gapComposer, 48);
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            boolean changed = gapComposer.changed(mutableState) | gapComposer.changedInstance(function2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StateFlowsComposeKt$produceState$1$1(function2, mutableState, null, 3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(copyOf2, (Function2) rememberedValue2, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SavableLaunchedEffectKt$$ExternalSyntheticLambda1(objArr, function2, i, i4);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewChatForRecipient.deepLinkSpecs;
    }
}
