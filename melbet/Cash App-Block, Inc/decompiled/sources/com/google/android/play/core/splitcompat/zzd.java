package com.google.android.play.core.splitcompat;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import com.google.android.material.textfield.IconHelper;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.withpersona.sdk2.inquiry.shared.WindowUtilsKt;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class zzd {
    public static ThreadPoolExecutor zza;

    public static final void GenericContainerWidget(GenericContainerViewModel genericContainerViewModel, Function3 function3, Function1 function1, boolean z, Composer composer, int i) {
        int i2;
        genericContainerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(390637097);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(genericContainerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else if (genericContainerViewModel instanceof GenericContainerViewModel.ComponentContainerViewModel) {
            gapComposer.startReplaceGroup(-1891328216);
            IconHelper.ComponentContainerWidget((GenericContainerViewModel.ComponentContainerViewModel) genericContainerViewModel, z, function1, gapComposer, (i2 & 896) | (i2 & 14) | ((i2 >> 6) & 112));
            gapComposer.end(false);
        } else if (genericContainerViewModel instanceof GenericContainerViewModel.SeriesContainerViewModel) {
            gapComposer.startReplaceGroup(-1891206293);
            int i3 = i2;
            zzf.SeriesContainerWidget((GenericContainerViewModel.SeriesContainerViewModel) genericContainerViewModel, null, z, function1, gapComposer, (i3 & 14) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168));
            gapComposer.end(false);
        } else {
            int i4 = i2;
            if (genericContainerViewModel instanceof GenericContainerViewModel.CardContainerViewModel) {
                gapComposer.startReplaceGroup(-1891089299);
                WindowUtilsKt.CardContainerWidget((GenericContainerViewModel.CardContainerViewModel) genericContainerViewModel, null, z, function1, gapComposer, (i4 & 14) | ((i4 >> 3) & 896) | ((i4 << 3) & 7168));
                gapComposer.end(false);
            } else {
                if (!(genericContainerViewModel instanceof GenericContainerViewModel.PlaceholderContainerViewModel)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1740103235, false);
                }
                gapComposer.startReplaceGroup(-1890954728);
                if (function3 == null) {
                    gapComposer.startReplaceGroup(-1890954729);
                } else {
                    gapComposer.startReplaceGroup(-1890954728);
                    function3.invoke(genericContainerViewModel, gapComposer, Integer.valueOf(i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
                }
                gapComposer.end(false);
                gapComposer.end(false);
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(genericContainerViewModel, function3, function1, z, i, 19);
        }
    }

    public static ThreadPoolExecutor zza() {
        if (zza == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzc(0));
            zza = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return zza;
    }

    public abstract String getStepName();
}
