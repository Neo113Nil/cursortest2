package com.squareup.cash.initialscreenloader.views;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda3;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.storage.RealStorageLinkerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.drawable.SplashScreenDrawable;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class InitialScreenPlaceholderViewKt {
    public static final ComposableLambdaImpl lambda$1919818681 = new ComposableLambdaImpl(new RealStorageLinkerKt$$ExternalSyntheticLambda2(2), false, 1919818681);
    public static final ComposableLambdaImpl lambda$1462918064 = new ComposableLambdaImpl(new RealStorageLinkerKt$$ExternalSyntheticLambda2(3), false, 1462918064);

    /* renamed from: lambda$-94044478, reason: not valid java name */
    public static final ComposableLambdaImpl f441lambda$94044478 = new ComposableLambdaImpl(new RealStorageLinkerKt$$ExternalSyntheticLambda2(4), false, -94044478);
    public static final ComposableLambdaImpl lambda$705530051 = new ComposableLambdaImpl(new RealStorageLinkerKt$$ExternalSyntheticLambda2(5), false, 705530051);
    public static final ComposableLambdaImpl lambda$1505104580 = new ComposableLambdaImpl(new RealStorageLinkerKt$$ExternalSyntheticLambda2(6), false, 1505104580);

    /* renamed from: lambda$-1990288187, reason: not valid java name */
    public static final ComposableLambdaImpl f440lambda$1990288187 = new ComposableLambdaImpl(new RealStorageLinkerKt$$ExternalSyntheticLambda2(7), false, -1990288187);

    public static final void InitialScreenPlaceholder(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1512555071);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ChromeConfigKt.ChromeConfig(null, ChromeSystemIconColor.ALWAYS_DARK, null, Boolean.TRUE, null, null, null, gapComposer, 3120, 117);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SnapshotKt$$ExternalSyntheticLambda3(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DrawablePainter(new SplashScreenDrawable(context));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ImageKt.Image((DrawablePainter) rememberedValue2, Room.stringResource(gapComposer, R.string.logo_content_description), null, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, 8, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BoxKt$$ExternalSyntheticLambda0(function1, i, 1);
        }
    }
}
