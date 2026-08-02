package com.squareup.cash.cashapppay.views;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.squareup.cash.cashapppay.viewmodels.StatusInterstitialViewModel;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.protos.franklin.api.StatusInterstitialBlocker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class StatusInterstitialScreen$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatusInterstitialViewModel f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Function1 f$4;

    public /* synthetic */ StatusInterstitialScreen$$ExternalSyntheticLambda1(StatusInterstitialViewModel statusInterstitialViewModel, int i, long j, long j2, Function1 function1, int i2) {
        this.$r8$classId = i2;
        this.f$0 = statusInterstitialViewModel;
        this.f$1 = i;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$4;
        StatusInterstitialViewModel statusInterstitialViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = StatusInterstitialScreen.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    String str = statusInterstitialViewModel.statusText;
                    boolean z = statusInterstitialViewModel.statusIcon == StatusInterstitialBlocker.StatusIcon.SUCCESS;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(27, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxSize, context, str, this.f$1, this.f$2, this.f$3, z, (Function0) rememberedValue, false, gapComposer, 6, 256);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion, ((Configuration) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f);
                    Context context2 = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    String str2 = statusInterstitialViewModel.statusText;
                    boolean z2 = statusInterstitialViewModel.statusIcon == StatusInterstitialBlocker.StatusIcon.SUCCESS;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GrantSheetKt$$ExternalSyntheticLambda4(29, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth, context2, str2, this.f$1, this.f$2, this.f$3, z2, (Function0) rememberedValue2, false, gapComposer2, 0, 256);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
