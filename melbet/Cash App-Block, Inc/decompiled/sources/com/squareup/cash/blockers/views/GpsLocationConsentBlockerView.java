package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.TransactorKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewModel;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class GpsLocationConsentBlockerView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsLocationConsentBlockerView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(GpsLocationConsentBlockerViewModel gpsLocationConsentBlockerViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-377688654);
        int i2 = (gapComposer.changedInstance(gpsLocationConsentBlockerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (gpsLocationConsentBlockerViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            TransactorKt.LoadableContent(gpsLocationConsentBlockerViewModel, gpsLocationConsentBlockerViewModel instanceof GpsLocationConsentBlockerViewModel.Loading, null, null, null, null, Expect_jvmKt.rememberComposableLambda(-366559978, new SetPinViewKt$$ExternalSyntheticLambda4(18, function1), gapComposer), gapComposer, (i2 & 14) | 1572864, 60);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, gpsLocationConsentBlockerViewModel, function1, i, 20);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((GpsLocationConsentBlockerViewModel) obj, function1, gapComposer, 0);
    }
}
