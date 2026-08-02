package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda3;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class RegisterAliasView extends ComposeUiView {
    public final RealCashVibrator vibrator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterAliasView(Context context, RealCashVibrator realCashVibrator) {
        super(context);
        context.getClass();
        this.vibrator = realCashVibrator;
    }

    public final void Content(RegisterAliasViewModel registerAliasViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-763901240);
        int i2 = (gapComposer.changedInstance(registerAliasViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (registerAliasViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            int i3 = i2 & 112;
            boolean changedInstance = gapComposer.changedInstance(registerAliasViewModel) | (i3 == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ComponentRegistry$Builder$$ExternalSyntheticLambda3(16, registerAliasViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            boolean z = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SnapshotKt$$ExternalSyntheticLambda3(3, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            if (registerAliasViewModel.isError) {
                gapComposer.startReplaceGroup(1650798819);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer.changedInstance(this);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new TemporaryStorage$getDir$2(this, null, 6);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1650851674);
                gapComposer.end(false);
            }
            PlatformKt.RegisterAlias(function1, registerAliasViewModel, null, gapComposer, ((i2 << 3) & 112) | ((i2 >> 3) & 14));
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashApp$$ExternalSyntheticLambda4(this, registerAliasViewModel, function1, i, 2);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((RegisterAliasViewModel) obj, function1, gapComposer, 0);
    }
}
