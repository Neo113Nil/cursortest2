package com.squareup.cash.graphics.views.effect;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import com.fillr.e;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.io.Files;
import com.squareup.cash.R;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.views.AnimationsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class TortoiseCardEffectKt {
    public static final Paint ADD_XFER_PAINT;
    public static final Paint INVERSE_PAINT;
    public static final int TORTOISE_OVERLAY = Color.argb(76, 0, 0, 0);

    static {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        ADD_XFER_PAINT = paint;
        Paint paint2 = new Paint();
        paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 255.0f, RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 255.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, 255.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE})));
        INVERSE_PAINT = paint2;
    }

    public static final void TortoiseBackground(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        MutableState produceLightSource;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1790460634);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (booleanValue) {
                gapComposer.startReplaceGroup(133266031);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(LightSource.Default);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                produceLightSource = (MutableState) rememberedValue;
            } else {
                gapComposer.startReplaceGroup(-1242625757);
                produceLightSource = SlidingWindowKt.produceLightSource(gapComposer);
            }
            gapComposer.end(false);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(0.33f, gapComposer);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
            Configuration configuration = (Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration);
            float f = configuration.orientation == 2 ? ((LightSource) produceLightSource.getValue()).y : ((LightSource) produceLightSource.getValue()).x;
            float f2 = configuration.orientation == 2 ? -((LightSource) produceLightSource.getValue()).x : ((LightSource) produceLightSource.getValue()).y;
            float[] fArr = {f * 0.2f, 0.2f * f2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier4, 1.0f);
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
            LightStateImpl rememberLightState = rememberLightState(Updater.rememberUpdatedState(new Vector4(f * 0.5f, f2 * 0.5f, parcelableSnapshotMutableFloatState.getFloatValue(), RecyclerView.DECELERATION_RATE), gapComposer), gapComposer);
            float[] fArr2 = {-0.5f, -0.5f, parcelableSnapshotMutableFloatState.getFloatValue() + 0.5f, RecyclerView.DECELERATION_RATE};
            LightStateImpl rememberLightState2 = rememberLightState(Updater.rememberUpdatedState(new Vector4(fArr2[0] + fArr[0], fArr2[1] + fArr[1], fArr2[2] + fArr[2], fArr2[3] + fArr[3]), gapComposer), gapComposer);
            float[] fArr3 = {0.5f, -0.5f, parcelableSnapshotMutableFloatState.getFloatValue() + 0.5f, RecyclerView.DECELERATION_RATE};
            LightStateImpl rememberLightState3 = rememberLightState(Updater.rememberUpdatedState(new Vector4(fArr3[0] + fArr[0], fArr3[1] + fArr[1], fArr3[2] + fArr[2], fArr3[3] + fArr[3]), gapComposer), gapComposer);
            float[] fArr4 = {0.5f, 0.5f, parcelableSnapshotMutableFloatState.getFloatValue() + 0.5f, RecyclerView.DECELERATION_RATE};
            LightStateImpl rememberLightState4 = rememberLightState(Updater.rememberUpdatedState(new Vector4(fArr4[0] + fArr[0], fArr4[1] + fArr[1], fArr4[2] + fArr[2], fArr4[3] + fArr[3]), gapComposer), gapComposer);
            float[] fArr5 = {-0.5f, 0.5f, parcelableSnapshotMutableFloatState.getFloatValue() + 0.5f, RecyclerView.DECELERATION_RATE};
            TortoiseEffect(fillMaxSize, null, null, null, null, null, null, Updater.rememberUpdatedState(CollectionsKt__CollectionsKt.listOf((Object[]) new LightStateImpl[]{rememberLightState, rememberLightState2, rememberLightState3, rememberLightState4, rememberLightState(Updater.rememberUpdatedState(new Vector4(fArr5[0] + fArr[0], fArr5[1] + fArr[1], fArr5[2] + fArr[2], fArr5[3] + fArr[3]), gapComposer), gapComposer)}), gapComposer), gapComposer, 0);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier3, i, i2, 8, (byte) 0);
        }
    }

    public static final void TortoiseEffect(Modifier modifier, State state, State state2, State state3, State state4, State state5, State state6, MutableState mutableState, Composer composer, int i) {
        State state7;
        State state8;
        State state9;
        State state10;
        State state11;
        State state12;
        State rememberUpdatedState;
        State state13;
        State state14;
        State state15;
        State state16;
        State state17;
        State state18;
        State state19;
        State state20;
        State state21;
        State state22;
        Float valueOf = Float.valueOf(1.0f);
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1286954106);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | 599184 | (gapComposer.changed(mutableState) ? 8388608 : 4194304);
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(valueOf, gapComposer);
                MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(valueOf, gapComposer);
                MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(Float.valueOf(0.8f), gapComposer);
                MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(valueOf, gapComposer);
                MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(Float.valueOf(2.2f), gapComposer);
                rememberUpdatedState = Updater.rememberUpdatedState(valueOf, gapComposer);
                state13 = rememberUpdatedState2;
                state14 = rememberUpdatedState3;
                state15 = rememberUpdatedState4;
                state16 = rememberUpdatedState5;
                state17 = rememberUpdatedState6;
            } else {
                gapComposer.skipToGroupEnd();
                state13 = state;
                state14 = state2;
                state15 = state3;
                state16 = state4;
                state17 = state5;
                rememberUpdatedState = state6;
            }
            gapComposer.endDefaults();
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{PlatformKt.getDrawableCompat(context, R.drawable.card_tortoise_background, null), new ColorDrawable(TORTOISE_OVERLAY)});
                Bitmap createBitmap = Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                layerDrawable.setBounds(new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()));
                layerDrawable.draw(new Canvas(createBitmap));
                gapComposer.updateRememberedValue(createBitmap);
                rememberedValue2 = createBitmap;
            }
            Bitmap bitmap = (Bitmap) rememberedValue2;
            bitmap.getClass();
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = new BitmapPainter(new AndroidImageBitmap(bitmap));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            BitmapPainter bitmapPainter = (BitmapPainter) rememberedValue3;
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1524261028);
            } else {
                gapComposer.startReplaceGroup(187717933);
                z = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            }
            gapComposer.end(false);
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Crop;
            if (z) {
                gapComposer.startReplaceGroup(1524308159);
                ImageKt.Image(bitmapPainter, null, SizeKt.fillMaxSize(modifier, 1.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer, 24632, 104);
                gapComposer = gapComposer;
                gapComposer.end(false);
                state18 = state13;
                state19 = state15;
                state21 = state16;
                state20 = state17;
                state22 = rememberUpdatedState;
            } else {
                gapComposer.startReplaceGroup(1524569551);
                Modifier paint$default = ClipKt.paint$default(modifier, bitmapPainter, null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, 54);
                e eVar = new e();
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == obj) {
                    rememberedValue4 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(20, mutableState2);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                state18 = state13;
                state19 = state15;
                state20 = state17;
                state21 = state16;
                state22 = rememberUpdatedState;
                AnimationsKt.CashEngineTextureView(paint$default, "TortoiseEffect", eVar, (Function1) rememberedValue4, Expect_jvmKt.rememberComposableLambda(1062392144, new TortoiseCardEffectKt$$ExternalSyntheticLambda2(state18, state19, state21, mutableState, bitmap, context, state14, state20, state22), gapComposer), gapComposer, 27696);
                gapComposer.end(false);
            }
            state7 = state18;
            state9 = state19;
            state10 = state21;
            state8 = state14;
            state11 = state20;
            state12 = state22;
        } else {
            gapComposer.skipToGroupEnd();
            state7 = state;
            state8 = state2;
            state9 = state3;
            state10 = state4;
            state11 = state5;
            state12 = state6;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(modifier, state7, state8, state9, state10, state11, state12, mutableState, i, 8);
        }
    }

    public static final LightStateImpl rememberLightState(MutableState mutableState, Composer composer) {
        Float valueOf = Float.valueOf(1.0f);
        return Files.rememberLightState(AbstractHashFunction.rememberEntityState(null, mutableState, null, composer, 5), new Vector4(RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), Updater.rememberUpdatedState(Float.valueOf(RecyclerView.DECELERATION_RATE), composer), Updater.rememberUpdatedState(Float.valueOf(7500.0f), composer), Updater.rememberUpdatedState(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{valueOf, valueOf, valueOf}), composer), composer);
    }
}
